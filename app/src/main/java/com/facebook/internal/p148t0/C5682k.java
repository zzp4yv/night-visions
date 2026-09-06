package com.facebook.internal.p148t0;

import com.facebook.C5608a0;
import com.facebook.GraphRequest;
import com.facebook.internal.C5663p0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.C10513u;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InstrumentUtility.kt */
/* renamed from: com.facebook.internal.t0.k */
/* loaded from: classes2.dex */
public final class C5682k {

    /* renamed from: a */
    public static final C5682k f14590a = new C5682k();

    private C5682k() {
    }

    /* renamed from: a */
    public static final boolean m11742a(String str) {
        File m11744c = m11744c();
        if (m11744c == null || str == null) {
            return false;
        }
        return new File(m11744c, str).delete();
    }

    /* renamed from: b */
    public static final String m11743b(Throwable th) {
        if (th == null) {
            return null;
        }
        return th.getCause() == null ? th.toString() : String.valueOf(th.getCause());
    }

    /* renamed from: c */
    public static final File m11744c() {
        C5608a0 c5608a0 = C5608a0.f14199a;
        File file = new File(C5608a0.m11284c().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    /* renamed from: d */
    public static final String m11745d(Thread thread) {
        C9768m.m32346f(thread, "thread");
        StackTraceElement[] stackTrace = thread.getStackTrace();
        JSONArray jSONArray = new JSONArray();
        C9768m.m32345e(stackTrace, "stackTrace");
        int length = stackTrace.length;
        int i2 = 0;
        while (i2 < length) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            i2++;
            jSONArray.put(stackTraceElement.toString());
        }
        return jSONArray.toString();
    }

    /* renamed from: e */
    public static final String m11746e(Throwable th) {
        Throwable th2 = null;
        if (th == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (th != null && th != th2) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            C9768m.m32345e(stackTrace, "t.stackTrace");
            int i2 = 0;
            int length = stackTrace.length;
            while (i2 < length) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                i2++;
                jSONArray.put(stackTraceElement.toString());
            }
            th2 = th;
            th = th.getCause();
        }
        return jSONArray.toString();
    }

    /* renamed from: f */
    public static final boolean m11747f(StackTraceElement stackTraceElement) {
        C9768m.m32346f(stackTraceElement, "element");
        String className = stackTraceElement.getClassName();
        C9768m.m32345e(className, "element.className");
        if (!C10513u.m37511E(className, "com.facebook", false, 2, null)) {
            String className2 = stackTraceElement.getClassName();
            C9768m.m32345e(className2, "element.className");
            if (!C10513u.m37511E(className2, "com.meta", false, 2, null)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public static final boolean m11748g(Throwable th) {
        if (th == null) {
            return false;
        }
        Throwable th2 = null;
        while (th != null && th != th2) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            C9768m.m32345e(stackTrace, "t.stackTrace");
            int length = stackTrace.length;
            int i2 = 0;
            while (i2 < length) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                i2++;
                C9768m.m32345e(stackTraceElement, "element");
                if (m11747f(stackTraceElement)) {
                    return true;
                }
            }
            th2 = th;
            th = th.getCause();
        }
        return false;
    }

    /* renamed from: h */
    public static final boolean m11749h(Thread thread) {
        StackTraceElement[] stackTrace;
        if (thread != null && (stackTrace = thread.getStackTrace()) != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                C9768m.m32345e(stackTraceElement, "element");
                if (m11747f(stackTraceElement)) {
                    String className = stackTraceElement.getClassName();
                    C9768m.m32345e(className, "element.className");
                    if (!C10513u.m37511E(className, "com.facebook.appevents.codeless", false, 2, null)) {
                        String className2 = stackTraceElement.getClassName();
                        C9768m.m32345e(className2, "element.className");
                        if (!C10513u.m37511E(className2, "com.facebook.appevents.suggestedevents", false, 2, null)) {
                            return true;
                        }
                    }
                    String methodName = stackTraceElement.getMethodName();
                    C9768m.m32345e(methodName, "element.methodName");
                    if (C10513u.m37511E(methodName, "onClick", false, 2, null)) {
                        continue;
                    } else {
                        String methodName2 = stackTraceElement.getMethodName();
                        C9768m.m32345e(methodName2, "element.methodName");
                        if (C10513u.m37511E(methodName2, "onItemClick", false, 2, null)) {
                            continue;
                        } else {
                            String methodName3 = stackTraceElement.getMethodName();
                            C9768m.m32345e(methodName3, "element.methodName");
                            if (!C10513u.m37511E(methodName3, "onTouch", false, 2, null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: l */
    public static final File[] m11753l() {
        File m11744c = m11744c();
        if (m11744c == null) {
            return new File[0];
        }
        File[] listFiles = m11744c.listFiles(new FilenameFilter() { // from class: com.facebook.internal.t0.e
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean m11754m;
                m11754m = C5682k.m11754m(file, str);
                return m11754m;
            }
        });
        return listFiles == null ? new File[0] : listFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final boolean m11754m(File file, String str) {
        C9768m.m32345e(str, "name");
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"anr_log_"}, 1));
        C9768m.m32345e(format, "java.lang.String.format(format, *args)");
        return new Regex(format).m37438b(str);
    }

    /* renamed from: n */
    public static final File[] m11755n() {
        File m11744c = m11744c();
        if (m11744c == null) {
            return new File[0];
        }
        File[] listFiles = m11744c.listFiles(new FilenameFilter() { // from class: com.facebook.internal.t0.f
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean m11756o;
                m11756o = C5682k.m11756o(file, str);
                return m11756o;
            }
        });
        return listFiles == null ? new File[0] : listFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final boolean m11756o(File file, String str) {
        C9768m.m32345e(str, "name");
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"analysis_log_"}, 1));
        C9768m.m32345e(format, "java.lang.String.format(format, *args)");
        return new Regex(format).m37438b(str);
    }

    /* renamed from: p */
    public static final File[] m11757p() {
        File m11744c = m11744c();
        if (m11744c == null) {
            return new File[0];
        }
        File[] listFiles = m11744c.listFiles(new FilenameFilter() { // from class: com.facebook.internal.t0.g
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean m11758q;
                m11758q = C5682k.m11758q(file, str);
                return m11758q;
            }
        });
        return listFiles == null ? new File[0] : listFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final boolean m11758q(File file, String str) {
        C9768m.m32345e(str, "name");
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        String format = String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3));
        C9768m.m32345e(format, "java.lang.String.format(format, *args)");
        return new Regex(format).m37438b(str);
    }

    /* renamed from: r */
    public static final JSONObject m11759r(String str, boolean z) {
        File m11744c = m11744c();
        if (m11744c != null && str != null) {
            try {
                FileInputStream fileInputStream = new FileInputStream(new File(m11744c, str));
                C5663p0 c5663p0 = C5663p0.f14478a;
                return new JSONObject(C5663p0.m11593s0(fileInputStream));
            } catch (Exception unused) {
                if (z) {
                    m11742a(str);
                }
            }
        }
        return null;
    }

    /* renamed from: s */
    public static final void m11760s(String str, JSONArray jSONArray, GraphRequest.InterfaceC5598b interfaceC5598b) {
        C9768m.m32346f(jSONArray, "reports");
        if (jSONArray.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, jSONArray.toString());
            C5663p0 c5663p0 = C5663p0.f14478a;
            JSONObject m11525A = C5663p0.m11525A();
            if (m11525A != null) {
                Iterator<String> keys = m11525A.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, m11525A.get(next));
                }
            }
            GraphRequest.C5599c c5599c = GraphRequest.f14159a;
            StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
            C5608a0 c5608a0 = C5608a0.f14199a;
            String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{C5608a0.m11285d()}, 1));
            C9768m.m32345e(format, "java.lang.String.format(format, *args)");
            c5599c.m11222A(null, format, jSONObject, interfaceC5598b).m11180k();
        } catch (JSONException unused) {
        }
    }

    /* renamed from: t */
    public static final void m11761t(String str, String str2) {
        File m11744c = m11744c();
        if (m11744c == null || str == null || str2 == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(m11744c, str));
            byte[] bytes = str2.getBytes(Charsets.f40651b);
            C9768m.m32345e(bytes, "(this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }
}
