package cm.aptoide.p092pt.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p474t.C11381e;

/* loaded from: classes.dex */
public class BroadcastRegisterOnSubscribe implements C11186e.a<Intent> {
    private final String broadcastPermission;
    private final Context context;
    private final IntentFilter intentFilter;
    private final Handler schedulerHandler;

    public BroadcastRegisterOnSubscribe(Context context, IntentFilter intentFilter, String str, Handler handler) {
        this.context = context;
        this.intentFilter = intentFilter;
        this.broadcastPermission = str;
        this.schedulerHandler = handler;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    public void call(final AbstractC11197j<? super Intent> abstractC11197j) {
        final BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: cm.aptoide.pt.utils.BroadcastRegisterOnSubscribe.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (abstractC11197j.isUnsubscribed()) {
                    return;
                }
                abstractC11197j.onNext(intent);
            }
        };
        abstractC11197j.add(C11381e.m40674a(new InterfaceC11204a() { // from class: cm.aptoide.pt.utils.BroadcastRegisterOnSubscribe.2
            @Override // p456rx.p460m.InterfaceC11204a
            public void call() {
                BroadcastRegisterOnSubscribe.this.context.unregisterReceiver(broadcastReceiver);
            }
        }));
        this.context.registerReceiver(broadcastReceiver, this.intentFilter, this.broadcastPermission, this.schedulerHandler);
    }
}
