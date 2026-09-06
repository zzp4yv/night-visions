package com.facebook.internal.p148t0;

import cm.aptoide.p092pt.install.installer.RootCommandOnSubscribe;
import com.facebook.C5608a0;
import com.facebook.C5613c0;
import com.facebook.C5620d0;
import com.facebook.GraphRequest;
import com.facebook.internal.C5633a0;
import com.facebook.internal.C5663p0;
import com.facebook.internal.p148t0.C5680i;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ExceptionAnalyzer.kt */
/* renamed from: com.facebook.internal.t0.h */
/* loaded from: classes2.dex */
public final class C5679h {

    /* renamed from: a */
    public static final C5679h f14569a = new C5679h();

    /* renamed from: b */
    private static boolean f14570b;

    private C5679h() {
    }

    /* renamed from: a */
    public static final void m11714a() {
        C5679h c5679h = f14569a;
        f14570b = true;
        C5608a0 c5608a0 = C5608a0.f14199a;
        if (C5608a0.m11288g()) {
            c5679h.m11719e();
        }
    }

    /* renamed from: b */
    public static final void m11715b(Throwable th) {
        if (!f14570b || m11716c() || th == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        StackTraceElement[] stackTrace = th.getStackTrace();
        C9768m.m32345e(stackTrace, "e.stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            C5633a0 c5633a0 = C5633a0.f14313a;
            String className = stackTraceElement.getClassName();
            C9768m.m32345e(className, "it.className");
            C5633a0.b m11375d = C5633a0.m11375d(className);
            if (m11375d != C5633a0.b.Unknown) {
                C5633a0.m11374c(m11375d);
                hashSet.add(m11375d.toString());
            }
        }
        C5608a0 c5608a0 = C5608a0.f14199a;
        if (C5608a0.m11288g() && (!hashSet.isEmpty())) {
            C5680i.a aVar = C5680i.a.f14579a;
            C5680i.a.m11729c(new JSONArray((Collection) hashSet)).m11726g();
        }
    }

    /* renamed from: c */
    public static final boolean m11716c() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m11718f(C5680i c5680i, C5620d0 c5620d0) {
        C9768m.m32346f(c5680i, "$instrumentData");
        C9768m.m32346f(c5620d0, "response");
        try {
            if (c5620d0.m11338b() == null) {
                JSONObject m11340d = c5620d0.m11340d();
                if (C9768m.m32341a(m11340d == null ? null : Boolean.valueOf(m11340d.getBoolean(RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION)), Boolean.TRUE)) {
                    c5680i.m11723a();
                }
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: e */
    public final void m11719e() {
        C5663p0 c5663p0 = C5663p0.f14478a;
        if (C5663p0.m11553X()) {
            return;
        }
        C5682k c5682k = C5682k.f14590a;
        File[] m11755n = C5682k.m11755n();
        ArrayList arrayList = new ArrayList();
        int length = m11755n.length;
        int i2 = 0;
        while (i2 < length) {
            File file = m11755n[i2];
            i2++;
            C5680i.a aVar = C5680i.a.f14579a;
            final C5680i m11730d = C5680i.a.m11730d(file);
            if (m11730d.m11725f()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crash_shield", m11730d.toString());
                    GraphRequest.C5599c c5599c = GraphRequest.f14159a;
                    StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
                    C5608a0 c5608a0 = C5608a0.f14199a;
                    String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{C5608a0.m11285d()}, 1));
                    C9768m.m32345e(format, "java.lang.String.format(format, *args)");
                    arrayList.add(c5599c.m11222A(null, format, jSONObject, new GraphRequest.InterfaceC5598b() { // from class: com.facebook.internal.t0.a
                        @Override // com.facebook.GraphRequest.InterfaceC5598b
                        /* renamed from: b */
                        public final void mo11196b(C5620d0 c5620d0) {
                            C5679h.m11718f(C5680i.this, c5620d0);
                        }
                    }));
                } catch (JSONException unused) {
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        new C5613c0(arrayList).m11326o();
    }
}
