package com.google.firebase.iid;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.common.annotation.KeepForSdk;
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

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
@KeepForSdk
/* renamed from: com.google.firebase.iid.k */
/* loaded from: classes2.dex */
public class C8330k {

    /* renamed from: a */
    private final C8372j f31738a;

    /* renamed from: b */
    private final C8333n f31739b;

    /* renamed from: c */
    private final Rpc f31740c;

    /* renamed from: d */
    private final InterfaceC8463b<InterfaceC8523i> f31741d;

    /* renamed from: e */
    private final InterfaceC8463b<InterfaceC8459j> f31742e;

    /* renamed from: f */
    private final InterfaceC8352i f31743f;

    C8330k(C8372j c8372j, C8333n c8333n, Rpc rpc, InterfaceC8463b<InterfaceC8523i> interfaceC8463b, InterfaceC8463b<InterfaceC8459j> interfaceC8463b2, InterfaceC8352i interfaceC8352i) {
        this.f31738a = c8372j;
        this.f31739b = c8333n;
        this.f31740c = rpc;
        this.f31741d = interfaceC8463b;
        this.f31742e = interfaceC8463b2;
        this.f31743f = interfaceC8352i;
    }

    public C8330k(C8372j c8372j, C8333n c8333n, InterfaceC8463b<InterfaceC8523i> interfaceC8463b, InterfaceC8463b<InterfaceC8459j> interfaceC8463b2, InterfaceC8352i interfaceC8352i) {
        this(c8372j, c8333n, new Rpc(c8372j.m26404i()), interfaceC8463b, interfaceC8463b2, interfaceC8352i);
    }

    /* renamed from: a */
    private static String m26202a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: b */
    private Task<String> m26203b(Task<Bundle> task) {
        return task.mo23644g(C8321b.m26200a(), new Continuation(this) { // from class: com.google.firebase.iid.j

            /* renamed from: a */
            private final C8330k f31737a;

            {
                this.f31737a = this;
            }

            @Override // com.google.android.gms.tasks.Continuation
            /* renamed from: a */
            public Object mo13777a(Task task2) {
                return this.f31737a.m26210g(task2);
            }
        });
    }

    /* renamed from: c */
    private String m26204c() {
        try {
            return m26202a(MessageDigest.getInstance("SHA-1").digest(this.f31738a.m26405k().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    /* renamed from: e */
    private String m26205e(Bundle bundle) throws IOException {
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
        Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    /* renamed from: f */
    static boolean m26206f(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    /* renamed from: h */
    private Bundle m26207h(String str, String str2, String str3, Bundle bundle) {
        InterfaceC8459j.a mo26688b;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.f31738a.m26406l().m26424c());
        bundle.putString("gmsv", Integer.toString(this.f31739b.m26217d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f31739b.m26215a());
        bundle.putString("app_ver_name", this.f31739b.m26216b());
        bundle.putString("firebase-app-name-hash", m26204c());
        try {
            String mo26245b = ((AbstractC8355l) Tasks.m23659a(this.f31743f.mo26277a(false))).mo26245b();
            if (TextUtils.isEmpty(mo26245b)) {
                Log.w("FirebaseInstanceId", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", mo26245b);
            }
        } catch (InterruptedException | ExecutionException e2) {
            Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e2);
        }
        bundle.putString("cliv", "fiid-21.1.0");
        InterfaceC8459j interfaceC8459j = this.f31742e.get();
        InterfaceC8523i interfaceC8523i = this.f31741d.get();
        if (interfaceC8459j != null && interfaceC8523i != null && (mo26688b = interfaceC8459j.mo26688b("fire-iid")) != InterfaceC8459j.a.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(mo26688b.m26693g()));
            bundle.putString("Firebase-Client", interfaceC8523i.mo26898a());
        }
        return bundle;
    }

    /* renamed from: i */
    private Task<Bundle> m26208i(String str, String str2, String str3, Bundle bundle) {
        m26207h(str, str2, str3, bundle);
        return this.f31740c.m13762a(bundle);
    }

    /* renamed from: d */
    public Task<String> m26209d(String str, String str2, String str3) {
        return m26203b(m26208i(str, str2, str3, new Bundle()));
    }

    /* renamed from: g */
    final /* synthetic */ String m26210g(Task task) throws Exception {
        return m26205e((Bundle) task.mo23648k(IOException.class));
    }
}
