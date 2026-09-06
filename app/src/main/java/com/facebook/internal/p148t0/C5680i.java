package com.facebook.internal.p148t0;

import android.os.Build;
import com.facebook.internal.C5663p0;
import java.io.File;
import java.util.Arrays;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.text.C10513u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InstrumentData.kt */
/* renamed from: com.facebook.internal.t0.i */
/* loaded from: classes2.dex */
public final class C5680i {

    /* renamed from: a */
    public static final b f14571a = new b(null);

    /* renamed from: b */
    private String f14572b;

    /* renamed from: c */
    private c f14573c;

    /* renamed from: d */
    private JSONArray f14574d;

    /* renamed from: e */
    private String f14575e;

    /* renamed from: f */
    private String f14576f;

    /* renamed from: g */
    private String f14577g;

    /* renamed from: h */
    private Long f14578h;

    /* compiled from: InstrumentData.kt */
    /* renamed from: com.facebook.internal.t0.i$a */
    public static final class a {

        /* renamed from: a */
        public static final a f14579a = new a();

        private a() {
        }

        /* renamed from: a */
        public static final C5680i m11727a(String str, String str2) {
            return new C5680i(str, str2, (C9756g) null);
        }

        /* renamed from: b */
        public static final C5680i m11728b(Throwable th, c cVar) {
            C9768m.m32346f(cVar, "t");
            return new C5680i(th, cVar, (C9756g) null);
        }

        /* renamed from: c */
        public static final C5680i m11729c(JSONArray jSONArray) {
            C9768m.m32346f(jSONArray, "features");
            return new C5680i(jSONArray, (C9756g) null);
        }

        /* renamed from: d */
        public static final C5680i m11730d(File file) {
            C9768m.m32346f(file, "file");
            return new C5680i(file, (C9756g) null);
        }
    }

    /* compiled from: InstrumentData.kt */
    /* renamed from: com.facebook.internal.t0.i$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9756g c9756g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final c m11732b(String str) {
            return C10513u.m37511E(str, "crash_log_", false, 2, null) ? c.CrashReport : C10513u.m37511E(str, "shield_log_", false, 2, null) ? c.CrashShield : C10513u.m37511E(str, "thread_check_log_", false, 2, null) ? c.ThreadCheck : C10513u.m37511E(str, "analysis_log_", false, 2, null) ? c.Analysis : C10513u.m37511E(str, "anr_log_", false, 2, null) ? c.AnrReport : c.Unknown;
        }
    }

    /* compiled from: InstrumentData.kt */
    /* renamed from: com.facebook.internal.t0.i$c */
    public enum c {
        Unknown,
        Analysis,
        AnrReport,
        CrashReport,
        CrashShield,
        ThreadCheck;

        /* compiled from: InstrumentData.kt */
        /* renamed from: com.facebook.internal.t0.i$c$a */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f14587a;

            static {
                int[] iArr = new int[c.valuesCustom().length];
                iArr[c.Analysis.ordinal()] = 1;
                iArr[c.AnrReport.ordinal()] = 2;
                iArr[c.CrashReport.ordinal()] = 3;
                iArr[c.CrashShield.ordinal()] = 4;
                iArr[c.ThreadCheck.ordinal()] = 5;
                f14587a = iArr;
            }
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            c[] valuesCustom = values();
            return (c[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        /* renamed from: k */
        public final String m11734k() {
            int i2 = a.f14587a[ordinal()];
            return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "Unknown" : "thread_check_log_" : "shield_log_" : "crash_log_" : "anr_log_" : "analysis_log_";
        }

        @Override // java.lang.Enum
        public String toString() {
            int i2 = a.f14587a[ordinal()];
            return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "Unknown" : "ThreadCheck" : "CrashShield" : "CrashReport" : "AnrReport" : "Analysis";
        }
    }

    /* compiled from: InstrumentData.kt */
    /* renamed from: com.facebook.internal.t0.i$d */
    public /* synthetic */ class d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14588a;

        static {
            int[] iArr = new int[c.valuesCustom().length];
            iArr[c.Analysis.ordinal()] = 1;
            iArr[c.AnrReport.ordinal()] = 2;
            iArr[c.CrashReport.ordinal()] = 3;
            iArr[c.CrashShield.ordinal()] = 4;
            iArr[c.ThreadCheck.ordinal()] = 5;
            f14588a = iArr;
        }
    }

    public /* synthetic */ C5680i(File file, C9756g c9756g) {
        this(file);
    }

    public /* synthetic */ C5680i(String str, String str2, C9756g c9756g) {
        this(str, str2);
    }

    public /* synthetic */ C5680i(Throwable th, c cVar, C9756g c9756g) {
        this(th, cVar);
    }

    private C5680i(JSONArray jSONArray) {
        this.f14573c = c.Analysis;
        this.f14578h = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f14574d = jSONArray;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("analysis_log_");
        stringBuffer.append(String.valueOf(this.f14578h));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        C9768m.m32345e(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ANALYSIS_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.f14572b = stringBuffer2;
    }

    public /* synthetic */ C5680i(JSONArray jSONArray, C9756g c9756g) {
        this(jSONArray);
    }

    /* renamed from: c */
    private final JSONObject m11720c() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = this.f14574d;
            if (jSONArray != null) {
                jSONObject.put("feature_names", jSONArray);
            }
            Long l = this.f14578h;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: d */
    private final JSONObject m11721d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_os_version", Build.VERSION.RELEASE);
            jSONObject.put("device_model", Build.MODEL);
            String str = this.f14575e;
            if (str != null) {
                jSONObject.put("app_version", str);
            }
            Long l = this.f14578h;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            String str2 = this.f14576f;
            if (str2 != null) {
                jSONObject.put("reason", str2);
            }
            String str3 = this.f14577g;
            if (str3 != null) {
                jSONObject.put("callstack", str3);
            }
            c cVar = this.f14573c;
            if (cVar != null) {
                jSONObject.put("type", cVar);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    private final JSONObject m11722e() {
        c cVar = this.f14573c;
        int i2 = cVar == null ? -1 : d.f14588a[cVar.ordinal()];
        if (i2 == 1) {
            return m11720c();
        }
        if (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) {
            return m11721d();
        }
        return null;
    }

    /* renamed from: a */
    public final void m11723a() {
        C5682k c5682k = C5682k.f14590a;
        C5682k.m11742a(this.f14572b);
    }

    /* renamed from: b */
    public final int m11724b(C5680i c5680i) {
        C9768m.m32346f(c5680i, "data");
        Long l = this.f14578h;
        if (l == null) {
            return -1;
        }
        long longValue = l.longValue();
        Long l2 = c5680i.f14578h;
        if (l2 == null) {
            return 1;
        }
        return C9768m.m32349i(l2.longValue(), longValue);
    }

    /* renamed from: f */
    public final boolean m11725f() {
        c cVar = this.f14573c;
        int i2 = cVar == null ? -1 : d.f14588a[cVar.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if ((i2 != 3 && i2 != 4 && i2 != 5) || this.f14577g == null || this.f14578h == null) {
                    return false;
                }
            } else if (this.f14577g == null || this.f14576f == null || this.f14578h == null) {
                return false;
            }
        } else if (this.f14574d == null || this.f14578h == null) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final void m11726g() {
        if (m11725f()) {
            C5682k c5682k = C5682k.f14590a;
            C5682k.m11761t(this.f14572b, toString());
        }
    }

    public String toString() {
        JSONObject m11722e = m11722e();
        if (m11722e == null) {
            String jSONObject = new JSONObject().toString();
            C9768m.m32345e(jSONObject, "JSONObject().toString()");
            return jSONObject;
        }
        String jSONObject2 = m11722e.toString();
        C9768m.m32345e(jSONObject2, "params.toString()");
        return jSONObject2;
    }

    private C5680i(Throwable th, c cVar) {
        this.f14573c = cVar;
        C5663p0 c5663p0 = C5663p0.f14478a;
        this.f14575e = C5663p0.m11594t();
        C5682k c5682k = C5682k.f14590a;
        this.f14576f = C5682k.m11743b(th);
        this.f14577g = C5682k.m11746e(th);
        this.f14578h = Long.valueOf(System.currentTimeMillis() / 1000);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(cVar.m11734k());
        stringBuffer.append(String.valueOf(this.f14578h));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        C9768m.m32345e(stringBuffer2, "StringBuffer().append(t.logPrefix).append(timestamp.toString()).append(\".json\").toString()");
        this.f14572b = stringBuffer2;
    }

    private C5680i(String str, String str2) {
        this.f14573c = c.AnrReport;
        C5663p0 c5663p0 = C5663p0.f14478a;
        this.f14575e = C5663p0.m11594t();
        this.f14576f = str;
        this.f14577g = str2;
        this.f14578h = Long.valueOf(System.currentTimeMillis() / 1000);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("anr_log_");
        stringBuffer.append(String.valueOf(this.f14578h));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        C9768m.m32345e(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ANR_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.f14572b = stringBuffer2;
    }

    private C5680i(File file) {
        String name = file.getName();
        C9768m.m32345e(name, "file.name");
        this.f14572b = name;
        this.f14573c = f14571a.m11732b(name);
        C5682k c5682k = C5682k.f14590a;
        JSONObject m11759r = C5682k.m11759r(this.f14572b, true);
        if (m11759r != null) {
            this.f14578h = Long.valueOf(m11759r.optLong("timestamp", 0L));
            this.f14575e = m11759r.optString("app_version", null);
            this.f14576f = m11759r.optString("reason", null);
            this.f14577g = m11759r.optString("callstack", null);
            this.f14574d = m11759r.optJSONArray("feature_names");
        }
    }
}
