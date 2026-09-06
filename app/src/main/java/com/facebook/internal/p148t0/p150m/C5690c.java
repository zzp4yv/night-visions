package com.facebook.internal.p148t0.p150m;

import android.util.Log;
import cm.aptoide.p092pt.install.installer.RootCommandOnSubscribe;
import com.facebook.C5608a0;
import com.facebook.C5620d0;
import com.facebook.GraphRequest;
import com.facebook.internal.C5663p0;
import com.facebook.internal.p148t0.C5679h;
import com.facebook.internal.p148t0.C5680i;
import com.facebook.internal.p148t0.C5682k;
import com.facebook.internal.p148t0.p150m.C5690c;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10749c0;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.ranges.C9815l;
import kotlin.ranges.IntRange;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CrashHandler.kt */
/* renamed from: com.facebook.internal.t0.m.c */
/* loaded from: classes2.dex */
public final class C5690c implements Thread.UncaughtExceptionHandler {

    /* renamed from: f */
    public static final a f14603f = new a(null);

    /* renamed from: g */
    private static final String f14604g = C5690c.class.getCanonicalName();

    /* renamed from: h */
    private static C5690c f14605h;

    /* renamed from: i */
    private final Thread.UncaughtExceptionHandler f14606i;

    /* compiled from: CrashHandler.kt */
    /* renamed from: com.facebook.internal.t0.m.c$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: d */
        private final void m11777d() {
            final List m38618x0;
            IntRange m32428k;
            C5663p0 c5663p0 = C5663p0.f14478a;
            if (C5663p0.m11553X()) {
                return;
            }
            C5682k c5682k = C5682k.f14590a;
            File[] m11757p = C5682k.m11757p();
            ArrayList arrayList = new ArrayList(m11757p.length);
            for (File file : m11757p) {
                C5680i.a aVar = C5680i.a.f14579a;
                arrayList.add(C5680i.a.m11730d(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((C5680i) obj).m11725f()) {
                    arrayList2.add(obj);
                }
            }
            m38618x0 = C10749c0.m38618x0(arrayList2, new Comparator() { // from class: com.facebook.internal.t0.m.b
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    int m11778e;
                    m11778e = C5690c.a.m11778e((C5680i) obj2, (C5680i) obj3);
                    return m11778e;
                }
            });
            JSONArray jSONArray = new JSONArray();
            m32428k = C9815l.m32428k(0, Math.min(m38618x0.size(), 5));
            Iterator<Integer> it = m32428k.iterator();
            while (it.hasNext()) {
                jSONArray.put(m38618x0.get(((IntIterator) it).mo32397b()));
            }
            C5682k c5682k2 = C5682k.f14590a;
            C5682k.m11760s("crash_reports", jSONArray, new GraphRequest.InterfaceC5598b() { // from class: com.facebook.internal.t0.m.a
                @Override // com.facebook.GraphRequest.InterfaceC5598b
                /* renamed from: b */
                public final void mo11196b(C5620d0 c5620d0) {
                    C5690c.a.m11779f(m38618x0, c5620d0);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final int m11778e(C5680i c5680i, C5680i c5680i2) {
            C9768m.m32345e(c5680i2, "o2");
            return c5680i.m11724b(c5680i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m11779f(List list, C5620d0 c5620d0) {
            C9768m.m32346f(list, "$validReports");
            C9768m.m32346f(c5620d0, "response");
            try {
                if (c5620d0.m11338b() == null) {
                    JSONObject m11340d = c5620d0.m11340d();
                    if (C9768m.m32341a(m11340d == null ? null : Boolean.valueOf(m11340d.getBoolean(RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION)), Boolean.TRUE)) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((C5680i) it.next()).m11723a();
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }

        /* renamed from: a */
        public final synchronized void m11780a() {
            C5608a0 c5608a0 = C5608a0.f14199a;
            if (C5608a0.m11288g()) {
                m11777d();
            }
            if (C5690c.f14605h != null) {
                Log.w(C5690c.f14604g, "Already enabled!");
            } else {
                C5690c.f14605h = new C5690c(Thread.getDefaultUncaughtExceptionHandler(), null);
                Thread.setDefaultUncaughtExceptionHandler(C5690c.f14605h);
            }
        }
    }

    private C5690c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f14606i = uncaughtExceptionHandler;
    }

    public /* synthetic */ C5690c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C9756g c9756g) {
        this(uncaughtExceptionHandler);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        C9768m.m32346f(thread, "t");
        C9768m.m32346f(th, "e");
        C5682k c5682k = C5682k.f14590a;
        if (C5682k.m11748g(th)) {
            C5679h c5679h = C5679h.f14569a;
            C5679h.m11715b(th);
            C5680i.a aVar = C5680i.a.f14579a;
            C5680i.a.m11728b(th, C5680i.c.CrashReport).m11726g();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f14606i;
        if (uncaughtExceptionHandler == null) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }
}
