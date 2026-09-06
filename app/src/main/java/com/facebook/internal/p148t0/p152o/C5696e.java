package com.facebook.internal.p148t0.p152o;

import cm.aptoide.p092pt.install.installer.RootCommandOnSubscribe;
import com.facebook.C5608a0;
import com.facebook.C5620d0;
import com.facebook.GraphRequest;
import com.facebook.internal.C5663p0;
import com.facebook.internal.p148t0.C5682k;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.collections.C10792y;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ErrorReportHandler.kt */
/* renamed from: com.facebook.internal.t0.o.e */
/* loaded from: classes2.dex */
public final class C5696e {

    /* renamed from: a */
    public static final C5696e f14617a = new C5696e();

    private C5696e() {
    }

    /* renamed from: a */
    public static final void m11787a() {
        C5608a0 c5608a0 = C5608a0.f14199a;
        if (C5608a0.m11288g()) {
            m11794h();
        }
    }

    /* renamed from: e */
    public static final File[] m11791e() {
        C5682k c5682k = C5682k.f14590a;
        File m11744c = C5682k.m11744c();
        if (m11744c == null) {
            return new File[0];
        }
        File[] listFiles = m11744c.listFiles(new FilenameFilter() { // from class: com.facebook.internal.t0.o.c
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean m11792f;
                m11792f = C5696e.m11792f(file, str);
                return m11792f;
            }
        });
        C9768m.m32345e(listFiles, "reportDir.listFiles { dir, name ->\n      name.matches(Regex(String.format(\"^%s[0-9]+.json$\", InstrumentUtility.ERROR_REPORT_PREFIX)))\n    }");
        return listFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final boolean m11792f(File file, String str) {
        C9768m.m32345e(str, "name");
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"error_log_"}, 1));
        C9768m.m32345e(format, "java.lang.String.format(format, *args)");
        return new Regex(format).m37438b(str);
    }

    /* renamed from: g */
    public static final void m11793g(String str) {
        try {
            new C5695d(str).m11786e();
        } catch (Exception unused) {
        }
    }

    /* renamed from: h */
    public static final void m11794h() {
        C5663p0 c5663p0 = C5663p0.f14478a;
        if (C5663p0.m11553X()) {
            return;
        }
        File[] m11791e = m11791e();
        final ArrayList arrayList = new ArrayList();
        int length = m11791e.length;
        int i2 = 0;
        while (i2 < length) {
            File file = m11791e[i2];
            i2++;
            C5695d c5695d = new C5695d(file);
            if (c5695d.m11785d()) {
                arrayList.add(c5695d);
            }
        }
        C10792y.m38928y(arrayList, new Comparator() { // from class: com.facebook.internal.t0.o.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m11795i;
                m11795i = C5696e.m11795i((C5695d) obj, (C5695d) obj2);
                return m11795i;
            }
        });
        JSONArray jSONArray = new JSONArray();
        for (int i3 = 0; i3 < arrayList.size() && i3 < 1000; i3++) {
            jSONArray.put(arrayList.get(i3));
        }
        C5682k c5682k = C5682k.f14590a;
        C5682k.m11760s("error_reports", jSONArray, new GraphRequest.InterfaceC5598b() { // from class: com.facebook.internal.t0.o.b
            @Override // com.facebook.GraphRequest.InterfaceC5598b
            /* renamed from: b */
            public final void mo11196b(C5620d0 c5620d0) {
                C5696e.m11796j(arrayList, c5620d0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final int m11795i(C5695d c5695d, C5695d c5695d2) {
        C9768m.m32345e(c5695d2, "o2");
        return c5695d.m11783b(c5695d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m11796j(ArrayList arrayList, C5620d0 c5620d0) {
        C9768m.m32346f(arrayList, "$validReports");
        C9768m.m32346f(c5620d0, "response");
        try {
            if (c5620d0.m11338b() == null) {
                JSONObject m11340d = c5620d0.m11340d();
                if (C9768m.m32341a(m11340d == null ? null : Boolean.valueOf(m11340d.getBoolean(RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION)), Boolean.TRUE)) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((C5695d) it.next()).m11782a();
                    }
                }
            }
        } catch (JSONException unused) {
        }
    }
}
