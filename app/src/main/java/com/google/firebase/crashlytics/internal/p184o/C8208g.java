package com.google.firebase.crashlytics.internal.p184o;

import cm.aptoide.p092pt.account.AndroidAccountManagerPersistence;
import com.google.firebase.crashlytics.internal.C8146h;
import com.google.firebase.crashlytics.internal.p183n.C8195t;
import com.google.firebase.crashlytics.internal.p188r.C8265f;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MetaDataStore.java */
/* renamed from: com.google.firebase.crashlytics.h.o.g */
/* loaded from: classes2.dex */
class C8208g {

    /* renamed from: a */
    private static final Charset f31082a = Charset.forName("UTF-8");

    /* renamed from: b */
    private final C8265f f31083b;

    /* compiled from: MetaDataStore.java */
    /* renamed from: com.google.firebase.crashlytics.h.o.g$a */
    class a extends JSONObject {

        /* renamed from: a */
        final /* synthetic */ String f31084a;

        a(String str) throws JSONException {
            this.f31084a = str;
            put(AndroidAccountManagerPersistence.ACCOUNT_ID, str);
        }
    }

    public C8208g(C8265f c8265f) {
        this.f31083b = c8265f;
    }

    /* renamed from: e */
    private static Map<String, String> m25480e(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, m25487o(jSONObject, next));
        }
        return hashMap;
    }

    /* renamed from: f */
    private static List<AbstractC8211j> m25481f(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            String string = jSONArray.getString(i2);
            try {
                arrayList.add(AbstractC8211j.m25529a(string));
            } catch (Exception e2) {
                C8146h.m25176f().m25186l("Failed de-serializing rollouts state. " + string, e2);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    private String m25482g(String str) throws JSONException {
        return m25487o(new JSONObject(str), AndroidAccountManagerPersistence.ACCOUNT_ID);
    }

    /* renamed from: h */
    private static String m25483h(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    /* renamed from: l */
    private static String m25484l(List<AbstractC8211j> list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i2 = 0; i2 < list.size(); i2++) {
            try {
                jSONArray.put(new JSONObject(AbstractC8211j.f31110a.mo26075b(list.get(i2))));
            } catch (JSONException e2) {
                C8146h.m25176f().m25186l("Exception parsing rollout assignment!", e2);
            }
        }
        hashMap.put("rolloutsState", jSONArray);
        return new JSONObject(hashMap).toString();
    }

    /* renamed from: m */
    private static void m25485m(File file) {
        if (file.exists() && file.delete()) {
            C8146h.m25176f().m25181g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    /* renamed from: n */
    private static String m25486n(String str) throws JSONException {
        return new a(str).toString();
    }

    /* renamed from: o */
    private static String m25487o(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    /* renamed from: a */
    public File m25488a(String str) {
        return this.f31083b.m26007o(str, "internal-keys");
    }

    /* renamed from: b */
    public File m25489b(String str) {
        return this.f31083b.m26007o(str, "keys");
    }

    /* renamed from: c */
    public File m25490c(String str) {
        return this.f31083b.m26007o(str, "rollouts-state");
    }

    /* renamed from: d */
    public File m25491d(String str) {
        return this.f31083b.m26007o(str, "user-data");
    }

    /* renamed from: i */
    Map<String, String> m25492i(String str, boolean z) {
        FileInputStream fileInputStream;
        Exception e2;
        File m25488a = z ? m25488a(str) : m25489b(str);
        if (!m25488a.exists() || m25488a.length() == 0) {
            m25485m(m25488a);
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(m25488a);
            try {
                try {
                    Map<String, String> m25480e = m25480e(C8195t.m25329A(fileInputStream));
                    C8195t.m25335f(fileInputStream, "Failed to close user metadata file.");
                    return m25480e;
                } catch (Exception e3) {
                    e2 = e3;
                    C8146h.m25176f().m25186l("Error deserializing user metadata.", e2);
                    m25485m(m25488a);
                    C8195t.m25335f(fileInputStream, "Failed to close user metadata file.");
                    return Collections.emptyMap();
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                C8195t.m25335f(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e4) {
            fileInputStream = null;
            e2 = e4;
        } catch (Throwable th2) {
            th = th2;
            C8195t.m25335f(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    /* renamed from: j */
    public List<AbstractC8211j> m25493j(String str) {
        FileInputStream fileInputStream;
        File m25490c = m25490c(str);
        if (!m25490c.exists() || m25490c.length() == 0) {
            m25485m(m25490c);
            return Collections.emptyList();
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(m25490c);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            List<AbstractC8211j> m25481f = m25481f(C8195t.m25329A(fileInputStream));
            C8146h.m25176f().m25177b("Loaded rollouts state:\n" + m25481f + "\nfor session " + str);
            C8195t.m25335f(fileInputStream, "Failed to close rollouts state file.");
            return m25481f;
        } catch (Exception e3) {
            e = e3;
            fileInputStream2 = fileInputStream;
            C8146h.m25176f().m25186l("Error deserializing rollouts state.", e);
            m25485m(m25490c);
            C8195t.m25335f(fileInputStream2, "Failed to close rollouts state file.");
            return Collections.emptyList();
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            C8195t.m25335f(fileInputStream2, "Failed to close rollouts state file.");
            throw th;
        }
    }

    /* renamed from: k */
    public String m25494k(String str) {
        FileInputStream fileInputStream;
        File m25491d = m25491d(str);
        FileInputStream fileInputStream2 = null;
        if (!m25491d.exists() || m25491d.length() == 0) {
            C8146h.m25176f().m25177b("No userId set for session " + str);
            m25485m(m25491d);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(m25491d);
            try {
                try {
                    String m25482g = m25482g(C8195t.m25329A(fileInputStream));
                    C8146h.m25176f().m25177b("Loaded userId " + m25482g + " for session " + str);
                    C8195t.m25335f(fileInputStream, "Failed to close user metadata file.");
                    return m25482g;
                } catch (Exception e2) {
                    e = e2;
                    C8146h.m25176f().m25186l("Error deserializing user metadata.", e);
                    m25485m(m25491d);
                    C8195t.m25335f(fileInputStream, "Failed to close user metadata file.");
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                C8195t.m25335f(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            C8195t.m25335f(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    /* renamed from: p */
    public void m25495p(String str, Map<String, String> map) {
        m25496q(str, map, false);
    }

    /* renamed from: q */
    public void m25496q(String str, Map<String, String> map, boolean z) {
        String m25483h;
        BufferedWriter bufferedWriter;
        File m25488a = z ? m25488a(str) : m25489b(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                m25483h = m25483h(map);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(m25488a), f31082a));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e2) {
            e = e2;
        }
        try {
            bufferedWriter.write(m25483h);
            bufferedWriter.flush();
            C8195t.m25335f(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception e3) {
            e = e3;
            bufferedWriter2 = bufferedWriter;
            C8146h.m25176f().m25186l("Error serializing key/value metadata.", e);
            m25485m(m25488a);
            C8195t.m25335f(bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            C8195t.m25335f(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    /* renamed from: r */
    public void m25497r(String str, List<AbstractC8211j> list) {
        String m25484l;
        BufferedWriter bufferedWriter;
        File m25490c = m25490c(str);
        if (list.isEmpty()) {
            m25485m(m25490c);
            return;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                m25484l = m25484l(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(m25490c), f31082a));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e2) {
            e = e2;
        }
        try {
            bufferedWriter.write(m25484l);
            bufferedWriter.flush();
            C8195t.m25335f(bufferedWriter, "Failed to close rollouts state file.");
        } catch (Exception e3) {
            e = e3;
            bufferedWriter2 = bufferedWriter;
            C8146h.m25176f().m25186l("Error serializing rollouts state.", e);
            m25485m(m25490c);
            C8195t.m25335f(bufferedWriter2, "Failed to close rollouts state file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            C8195t.m25335f(bufferedWriter2, "Failed to close rollouts state file.");
            throw th;
        }
    }

    /* renamed from: s */
    public void m25498s(String str, String str2) {
        String m25486n;
        BufferedWriter bufferedWriter;
        File m25491d = m25491d(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                m25486n = m25486n(str2);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(m25491d), f31082a));
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(m25486n);
            bufferedWriter.flush();
            C8195t.m25335f(bufferedWriter, "Failed to close user metadata file.");
        } catch (Exception e3) {
            e = e3;
            bufferedWriter2 = bufferedWriter;
            C8146h.m25176f().m25186l("Error serializing user metadata.", e);
            C8195t.m25335f(bufferedWriter2, "Failed to close user metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            C8195t.m25335f(bufferedWriter2, "Failed to close user metadata file.");
            throw th;
        }
    }
}
