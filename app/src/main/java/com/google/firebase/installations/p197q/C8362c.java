package com.google.firebase.installations.p197q;

import com.google.firebase.C8372j;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import okhttp3.internal.http2.Http2;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PersistedInstallation.java */
/* renamed from: com.google.firebase.installations.q.c */
/* loaded from: classes2.dex */
public class C8362c {

    /* renamed from: a */
    private File f31836a;

    /* renamed from: b */
    private final C8372j f31837b;

    /* compiled from: PersistedInstallation.java */
    /* renamed from: com.google.firebase.installations.q.c$a */
    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public C8362c(C8372j c8372j) {
        this.f31837b = c8372j;
    }

    /* renamed from: a */
    private File m26324a() {
        if (this.f31836a == null) {
            synchronized (this) {
                if (this.f31836a == null) {
                    this.f31836a = new File(this.f31837b.m26404i().getFilesDir(), "PersistedInstallation." + this.f31837b.m26407m() + ".json");
                }
            }
        }
        return this.f31836a;
    }

    /* renamed from: c */
    private JSONObject m26325c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
        try {
            FileInputStream fileInputStream = new FileInputStream(m26324a());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, Http2.INITIAL_MAX_FRAME_SIZE);
                    if (read < 0) {
                        JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                        fileInputStream.close();
                        return jSONObject;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            }
        } catch (IOException | JSONException unused2) {
            return new JSONObject();
        }
    }

    /* renamed from: b */
    public AbstractC8363d m26326b(AbstractC8363d abstractC8363d) {
        File createTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", abstractC8363d.mo26301d());
            jSONObject.put("Status", abstractC8363d.mo26304g().ordinal());
            jSONObject.put("AuthToken", abstractC8363d.mo26299b());
            jSONObject.put("RefreshToken", abstractC8363d.mo26303f());
            jSONObject.put("TokenCreationEpochInSecs", abstractC8363d.mo26305h());
            jSONObject.put("ExpiresInSecs", abstractC8363d.mo26300c());
            jSONObject.put("FisError", abstractC8363d.mo26302e());
            createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f31837b.m26404i().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (createTempFile.renameTo(m26324a())) {
            return abstractC8363d;
        }
        throw new IOException("unable to rename the tmpfile to PersistedInstallation");
    }

    /* renamed from: d */
    public AbstractC8363d m26327d() {
        JSONObject m26325c = m26325c();
        String optString = m26325c.optString("Fid", null);
        int optInt = m26325c.optInt("Status", a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = m26325c.optString("AuthToken", null);
        String optString3 = m26325c.optString("RefreshToken", null);
        long optLong = m26325c.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = m26325c.optLong("ExpiresInSecs", 0L);
        return AbstractC8363d.m26328a().mo26310d(optString).mo26313g(a.values()[optInt]).mo26308b(optString2).mo26312f(optString3).mo26314h(optLong).mo26309c(optLong2).mo26311e(m26325c.optString("FisError", null)).mo26307a();
    }
}
