package com.facebook.internal.p156v0;

import android.util.Base64;
import android.util.Log;
import cm.aptoide.p092pt.database.room.RoomInstalled;
import cm.aptoide.p092pt.database.room.RoomNotification;
import cm.aptoide.p092pt.dataprovider.BuildConfig;
import com.facebook.C5608a0;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.C10742u;
import kotlin.jvm.internal.C9755f0;
import kotlin.jvm.internal.C9768m;
import kotlin.p429io.C10529g;
import kotlin.text.C10513u;
import kotlin.text.Charsets;
import okhttp3.HttpUrl;
import org.json.JSONObject;

/* compiled from: OidcSecurityUtil.kt */
/* renamed from: com.facebook.internal.v0.c */
/* loaded from: classes2.dex */
public final class C5703c {

    /* renamed from: a */
    public static final C5703c f14634a = new C5703c();

    /* renamed from: b */
    private static final String f14635b = "/.well-known/oauth/openid/keys/";

    private C5703c() {
    }

    /* renamed from: a */
    public static final PublicKey m11807a(String str) {
        String m37507A;
        String m37507A2;
        String m37507A3;
        C9768m.m32346f(str, RoomNotification.KEY);
        m37507A = C10513u.m37507A(str, "\n", HttpUrl.FRAGMENT_ENCODE_SET, false, 4, null);
        m37507A2 = C10513u.m37507A(m37507A, "-----BEGIN PUBLIC KEY-----", HttpUrl.FRAGMENT_ENCODE_SET, false, 4, null);
        m37507A3 = C10513u.m37507A(m37507A2, "-----END PUBLIC KEY-----", HttpUrl.FRAGMENT_ENCODE_SET, false, 4, null);
        byte[] decode = Base64.decode(m37507A3, 0);
        C9768m.m32345e(decode, "decode(pubKeyString, Base64.DEFAULT)");
        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode));
        C9768m.m32345e(generatePublic, "kf.generatePublic(x509publicKey)");
        return generatePublic;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static final String m11808b(final String str) {
        C9768m.m32346f(str, "kid");
        C5608a0 c5608a0 = C5608a0.f14199a;
        final URL url = new URL(BuildConfig.APTOIDE_WEB_SERVICES_SCHEME, C9768m.m32354n("www.", C5608a0.m11293l()), f14635b);
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition newCondition = reentrantLock.newCondition();
        final C9755f0 c9755f0 = new C9755f0();
        C5608a0.m11292k().execute(new Runnable() { // from class: com.facebook.internal.v0.a
            @Override // java.lang.Runnable
            public final void run() {
                C5703c.m11809c(url, c9755f0, str, reentrantLock, newCondition);
            }
        });
        reentrantLock.lock();
        try {
            newCondition.await(5000L, TimeUnit.MILLISECONDS);
            reentrantLock.unlock();
            return (String) c9755f0.f37179f;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.String] */
    /* renamed from: c */
    public static final void m11809c(URL url, C9755f0 c9755f0, String str, ReentrantLock reentrantLock, Condition condition) {
        C9768m.m32346f(url, "$openIdKeyUrl");
        C9768m.m32346f(c9755f0, "$result");
        C9768m.m32346f(str, "$kid");
        C9768m.m32346f(reentrantLock, "$lock");
        URLConnection openConnection = url.openConnection();
        if (openConnection == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        try {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                C9768m.m32345e(inputStream, "connection.inputStream");
                Reader inputStreamReader = new InputStreamReader(inputStream, Charsets.f40651b);
                String m37643c = C10529g.m37643c(inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192));
                httpURLConnection.getInputStream().close();
                c9755f0.f37179f = new JSONObject(m37643c).optString(str);
                httpURLConnection.disconnect();
                reentrantLock.lock();
                try {
                    condition.signal();
                    C10742u c10742u = C10742u.f41439a;
                } finally {
                }
            } catch (Exception e2) {
                String name = f14634a.getClass().getName();
                String message = e2.getMessage();
                if (message == null) {
                    message = "Error getting public key";
                }
                Log.d(name, message);
                httpURLConnection.disconnect();
                reentrantLock.lock();
                try {
                    condition.signal();
                    C10742u c10742u2 = C10742u.f41439a;
                } finally {
                }
            }
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            reentrantLock.lock();
            try {
                condition.signal();
                C10742u c10742u3 = C10742u.f41439a;
                throw th;
            } finally {
            }
        }
    }

    /* renamed from: e */
    public static final boolean m11811e(PublicKey publicKey, String str, String str2) {
        C9768m.m32346f(publicKey, "publicKey");
        C9768m.m32346f(str, "data");
        C9768m.m32346f(str2, RoomInstalled.SIGNATURE);
        try {
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initVerify(publicKey);
            byte[] bytes = str.getBytes(Charsets.f40651b);
            C9768m.m32345e(bytes, "(this as java.lang.String).getBytes(charset)");
            signature.update(bytes);
            byte[] decode = Base64.decode(str2, 8);
            C9768m.m32345e(decode, "decode(signature, Base64.URL_SAFE)");
            return signature.verify(decode);
        } catch (Exception unused) {
            return false;
        }
    }
}
