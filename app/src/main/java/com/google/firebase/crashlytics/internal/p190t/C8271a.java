package com.google.firebase.crashlytics.internal.p190t;

import com.google.firebase.crashlytics.internal.C8146h;
import com.google.firebase.crashlytics.internal.p183n.C8195t;
import com.google.firebase.crashlytics.internal.p188r.C8265f;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* compiled from: CachedSettingsIo.java */
/* renamed from: com.google.firebase.crashlytics.h.t.a */
/* loaded from: classes2.dex */
public class C8271a {

    /* renamed from: a */
    private final File f31590a;

    public C8271a(C8265f c8265f) {
        this.f31590a = c8265f.m25998e("com.crashlytics.settings.json");
    }

    /* renamed from: a */
    private File m26032a() {
        return this.f31590a;
    }

    /* renamed from: b */
    public JSONObject m26033b() {
        Throwable th;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        C8146h.m25176f().m25177b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File m26032a = m26032a();
                if (m26032a.exists()) {
                    fileInputStream = new FileInputStream(m26032a);
                    try {
                        jSONObject = new JSONObject(C8195t.m25329A(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e2) {
                        e = e2;
                        C8146h.m25176f().m25180e("Failed to fetch cached settings", e);
                        C8195t.m25335f(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    C8146h.m25176f().m25183i("Settings file does not exist.");
                    jSONObject = null;
                }
                C8195t.m25335f(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Throwable th2) {
                th = th2;
                C8195t.m25335f(null, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            C8195t.m25335f(null, "Error while closing settings cache file.");
            throw th;
        }
    }

    /* renamed from: c */
    public void m26034c(long j2, JSONObject jSONObject) {
        FileWriter fileWriter;
        C8146h.m25176f().m25183i("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter2 = null;
            try {
                try {
                    jSONObject.put("expires_at", j2);
                    fileWriter = new FileWriter(m26032a());
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e2) {
                e = e2;
            }
            try {
                fileWriter.write(jSONObject.toString());
                fileWriter.flush();
                C8195t.m25335f(fileWriter, "Failed to close settings writer.");
            } catch (Exception e3) {
                e = e3;
                fileWriter2 = fileWriter;
                C8146h.m25176f().m25180e("Failed to cache settings", e);
                C8195t.m25335f(fileWriter2, "Failed to close settings writer.");
            } catch (Throwable th2) {
                th = th2;
                fileWriter2 = fileWriter;
                C8195t.m25335f(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
        }
    }
}
