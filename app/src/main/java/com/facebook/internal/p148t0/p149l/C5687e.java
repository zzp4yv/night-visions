package com.facebook.internal.p148t0.p149l;

import cm.aptoide.p092pt.install.installer.RootCommandOnSubscribe;
import com.facebook.C5608a0;
import com.facebook.C5620d0;
import com.facebook.GraphRequest;
import com.facebook.internal.C5663p0;
import com.facebook.internal.p148t0.C5680i;
import com.facebook.internal.p148t0.C5682k;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.C10749c0;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.C9768m;
import kotlin.ranges.C9815l;
import kotlin.ranges.IntRange;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ANRHandler.kt */
/* renamed from: com.facebook.internal.t0.l.e */
/* loaded from: classes2.dex */
public final class C5687e {

    /* renamed from: a */
    public static final C5687e f14599a = new C5687e();

    /* renamed from: b */
    private static final AtomicBoolean f14600b = new AtomicBoolean(false);

    private C5687e() {
    }

    /* renamed from: a */
    public static final synchronized void m11766a() {
        synchronized (C5687e.class) {
            if (f14600b.getAndSet(true)) {
                return;
            }
            C5608a0 c5608a0 = C5608a0.f14199a;
            if (C5608a0.m11288g()) {
                m11769d();
            }
            C5686d c5686d = C5686d.f14594a;
            C5686d.m11765d();
        }
    }

    /* renamed from: d */
    public static final void m11769d() {
        final List m38618x0;
        IntRange m32428k;
        C5663p0 c5663p0 = C5663p0.f14478a;
        if (C5663p0.m11553X()) {
            return;
        }
        C5682k c5682k = C5682k.f14590a;
        File[] m11753l = C5682k.m11753l();
        ArrayList arrayList = new ArrayList(m11753l.length);
        for (File file : m11753l) {
            C5680i.a aVar = C5680i.a.f14579a;
            arrayList.add(C5680i.a.m11730d(file));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((C5680i) obj).m11725f()) {
                arrayList2.add(obj);
            }
        }
        m38618x0 = C10749c0.m38618x0(arrayList2, new Comparator() { // from class: com.facebook.internal.t0.l.c
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                int m11770e;
                m11770e = C5687e.m11770e((C5680i) obj2, (C5680i) obj3);
                return m11770e;
            }
        });
        JSONArray jSONArray = new JSONArray();
        m32428k = C9815l.m32428k(0, Math.min(m38618x0.size(), 5));
        Iterator<Integer> it = m32428k.iterator();
        while (it.hasNext()) {
            jSONArray.put(m38618x0.get(((IntIterator) it).mo32397b()));
        }
        C5682k c5682k2 = C5682k.f14590a;
        C5682k.m11760s("anr_reports", jSONArray, new GraphRequest.InterfaceC5598b() { // from class: com.facebook.internal.t0.l.b
            @Override // com.facebook.GraphRequest.InterfaceC5598b
            /* renamed from: b */
            public final void mo11196b(C5620d0 c5620d0) {
                C5687e.m11771f(m38618x0, c5620d0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final int m11770e(C5680i c5680i, C5680i c5680i2) {
        C9768m.m32345e(c5680i2, "o2");
        return c5680i.m11724b(c5680i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m11771f(List list, C5620d0 c5620d0) {
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
}
