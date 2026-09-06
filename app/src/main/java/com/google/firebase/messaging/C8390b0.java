package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.C8372j;
import com.google.firebase.installations.AbstractC8355l;
import com.google.firebase.installations.InterfaceC8352i;
import com.google.firebase.p204r.InterfaceC8459j;
import com.google.firebase.p205s.InterfaceC8463b;
import com.google.firebase.p209u.InterfaceC8523i;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* renamed from: com.google.firebase.messaging.b0 */
/* loaded from: classes2.dex */
class C8390b0 {

    /* renamed from: a */
    private final C8372j f31962a;

    /* renamed from: b */
    private final C8401g0 f31963b;

    /* renamed from: c */
    private final Rpc f31964c;

    /* renamed from: d */
    private final InterfaceC8463b<InterfaceC8523i> f31965d;

    /* renamed from: e */
    private final InterfaceC8463b<InterfaceC8459j> f31966e;

    /* renamed from: f */
    private final InterfaceC8352i f31967f;

    C8390b0(C8372j c8372j, C8401g0 c8401g0, Rpc rpc, InterfaceC8463b<InterfaceC8523i> interfaceC8463b, InterfaceC8463b<InterfaceC8459j> interfaceC8463b2, InterfaceC8352i interfaceC8352i) {
        this.f31962a = c8372j;
        this.f31963b = c8401g0;
        this.f31964c = rpc;
        this.f31965d = interfaceC8463b;
        this.f31966e = interfaceC8463b2;
        this.f31967f = interfaceC8352i;
    }

    C8390b0(C8372j c8372j, C8401g0 c8401g0, InterfaceC8463b<InterfaceC8523i> interfaceC8463b, InterfaceC8463b<InterfaceC8459j> interfaceC8463b2, InterfaceC8352i interfaceC8352i) {
        this(c8372j, c8401g0, new Rpc(c8372j.m26404i()), interfaceC8463b, interfaceC8463b2, interfaceC8352i);
    }

    /* renamed from: a */
    private static String m26481a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: b */
    private Task<String> m26482b(Task<Bundle> task) {
        return task.mo23644g(ExecutorC8438z.f32091f, new Continuation(this) { // from class: com.google.firebase.messaging.a0

            /* renamed from: a */
            private final C8390b0 f31959a;

            {
                this.f31959a = this;
            }

            @Override // com.google.android.gms.tasks.Continuation
            /* renamed from: a */
            public Object mo13777a(Task task2) {
                return this.f31959a.m26489g(task2);
            }
        });
    }

    /* renamed from: c */
    private String m26483c() {
        try {
            return m26481a(MessageDigest.getInstance("SHA-1").digest(this.f31962a.m26405k().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    /* renamed from: e */
    private String m26484e(Bundle bundle) throws IOException {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        String valueOf = String.valueOf(bundle);
        StringBuilder sb = new StringBuilder(valueOf.length() + 21);
        sb.append("Unexpected response: ");
        sb.append(valueOf);
        Log.w("FirebaseMessaging", sb.toString(), new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    /* renamed from: f */
    static boolean m26485f(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    /* renamed from: h */
    private Bundle m26486h(String str, String str2, String str3, Bundle bundle) {
        InterfaceC8459j.a mo26688b;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.f31962a.m26406l().m26424c());
        bundle.putString("gmsv", Integer.toString(this.f31963b.m26545d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f31963b.m26543a());
        bundle.putString("app_ver_name", this.f31963b.m26544b());
        bundle.putString("firebase-app-name-hash", m26483c());
        try {
            String mo26245b = ((AbstractC8355l) Tasks.m23659a(this.f31967f.mo26277a(false))).mo26245b();
            if (TextUtils.isEmpty(mo26245b)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", mo26245b);
            }
        } catch (InterruptedException | ExecutionException e2) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e2);
        }
        bundle.putString("cliv", "fcm-20.1.7_1p");
        InterfaceC8459j interfaceC8459j = this.f31966e.get();
        InterfaceC8523i interfaceC8523i = this.f31965d.get();
        if (interfaceC8459j != null && interfaceC8523i != null && (mo26688b = interfaceC8459j.mo26688b("fire-iid")) != InterfaceC8459j.a.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(mo26688b.m26693g()));
            bundle.putString("Firebase-Client", interfaceC8523i.mo26898a());
        }
        return bundle;
    }

    /* renamed from: i */
    private Task<Bundle> m26487i(String str, String str2, String str3, Bundle bundle) {
        m26486h(str, str2, str3, bundle);
        return this.f31964c.m13762a(bundle);
    }

    /* renamed from: d */
    Task<String> m26488d(String str) {
        return m26482b(m26487i(str, C8401g0.m26540c(this.f31962a), "*", new Bundle()));
    }

    /* renamed from: g */
    final /* synthetic */ String m26489g(Task task) throws Exception {
        return m26484e((Bundle) task.mo23648k(IOException.class));
    }

    /* renamed from: j */
    Task<?> m26490j(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        String valueOf2 = String.valueOf(str3);
        return m26482b(m26487i(str, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle));
    }

    /* renamed from: k */
    Task<?> m26491k(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        bundle.putString("delete", "1");
        String valueOf2 = String.valueOf(str3);
        return m26482b(m26487i(str, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle));
    }
}
