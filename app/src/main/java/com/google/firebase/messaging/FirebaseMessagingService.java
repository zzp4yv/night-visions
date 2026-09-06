package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import cm.aptoide.p092pt.FirebaseConstants;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* loaded from: classes2.dex */
public class FirebaseMessagingService extends AbstractServiceC8400g {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);

    private boolean alreadyReceivedMessage(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = recentlyReceivedMessageIds;
        if (!queue.contains(str)) {
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(str);
            return false;
        }
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        String valueOf = String.valueOf(str);
        Log.d("FirebaseMessaging", valueOf.length() != 0 ? "Received duplicate message: ".concat(valueOf) : new String("Received duplicate message: "));
        return true;
    }

    private void dispatchMessage(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (C8403h0.m26550t(extras)) {
            C8403h0 c8403h0 = new C8403h0(extras);
            ExecutorService m26615d = C8418p.m26615d();
            try {
                if (new C8392c(this, c8403h0, m26615d).m26505a()) {
                    return;
                }
                m26615d.shutdown();
                if (C8399f0.m26512B(intent)) {
                    C8399f0.m26533u(intent);
                }
            } finally {
                m26615d.shutdown();
            }
        }
        onMessageReceived(new RemoteMessage(extras));
    }

    private String getMessageId(Intent intent) {
        String stringExtra = intent.getStringExtra(FirebaseConstants.FIREBASE_MESSAGE_ID);
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    private void handleMessageIntent(Intent intent) {
        if (alreadyReceivedMessage(intent.getStringExtra(FirebaseConstants.FIREBASE_MESSAGE_ID))) {
            return;
        }
        passMessageIntentToSdk(intent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void passMessageIntentToSdk(Intent intent) {
        char c2;
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        switch (stringExtra.hashCode()) {
            case -2062414158:
                if (stringExtra.equals("deleted_messages")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 102161:
                if (stringExtra.equals("gcm")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 814694033:
                if (stringExtra.equals("send_error")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 814800675:
                if (stringExtra.equals("send_event")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            C8399f0.m26535w(intent);
            dispatchMessage(intent);
        } else {
            if (c2 == 1) {
                onDeletedMessages();
                return;
            }
            if (c2 == 2) {
                onMessageSent(intent.getStringExtra(FirebaseConstants.FIREBASE_MESSAGE_ID));
            } else if (c2 != 3) {
                Log.w("FirebaseMessaging", stringExtra.length() != 0 ? "Received message with unknown type: ".concat(stringExtra) : new String("Received message with unknown type: "));
            } else {
                onSendError(getMessageId(intent), new SendException(intent.getStringExtra("error")));
            }
        }
    }

    @Override // com.google.firebase.messaging.AbstractServiceC8400g
    protected Intent getStartCommandIntent(Intent intent) {
        return C8411l0.m26580b().m26582c();
    }

    @Override // com.google.firebase.messaging.AbstractServiceC8400g
    public void handleIntent(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action)) {
            handleMessageIntent(intent);
        } else if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            onNewToken(intent.getStringExtra("token"));
        } else {
            String valueOf = String.valueOf(intent.getAction());
            Log.d("FirebaseMessaging", valueOf.length() != 0 ? "Unknown intent action: ".concat(valueOf) : new String("Unknown intent action: "));
        }
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
    }

    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    public void onSendError(String str, Exception exc) {
    }
}
