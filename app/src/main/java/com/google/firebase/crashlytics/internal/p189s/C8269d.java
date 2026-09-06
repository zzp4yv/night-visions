package com.google.firebase.crashlytics.internal.p189s;

import android.content.Context;
import cm.aptoide.p092pt.networking.BodyInterceptorV3;
import com.google.android.datatransport.cct.C6206c;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.p183n.AbstractC8162b0;
import com.google.firebase.crashlytics.internal.p183n.C8186n0;
import com.google.firebase.crashlytics.internal.p185p.AbstractC8225f0;
import com.google.firebase.crashlytics.internal.p185p.p186h0.C8238j;
import com.google.firebase.crashlytics.internal.p190t.InterfaceC8279i;
import java.nio.charset.Charset;
import p241e.p254e.p256b.p257a.C8752b;
import p241e.p254e.p256b.p257a.InterfaceC8755e;
import p241e.p254e.p256b.p257a.InterfaceC8757g;
import p241e.p254e.p256b.p257a.p258i.C8845u;

/* compiled from: DataTransportCrashlyticsReportSender.java */
/* renamed from: com.google.firebase.crashlytics.h.s.d */
/* loaded from: classes2.dex */
public class C8269d {

    /* renamed from: a */
    private static final C8238j f31570a = new C8238j();

    /* renamed from: b */
    private static final String f31571b = m26013d("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: c */
    private static final String f31572c = m26013d("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: d */
    private static final InterfaceC8755e<AbstractC8225f0, byte[]> f31573d = new InterfaceC8755e() { // from class: com.google.firebase.crashlytics.h.s.a
        @Override // p241e.p254e.p256b.p257a.InterfaceC8755e
        /* renamed from: a */
        public final Object mo26009a(Object obj) {
            byte[] bytes;
            bytes = C8269d.f31570a.m25945M((AbstractC8225f0) obj).getBytes(Charset.forName("UTF-8"));
            return bytes;
        }
    };

    /* renamed from: e */
    private final C8270e f31574e;

    /* renamed from: f */
    private final InterfaceC8755e<AbstractC8225f0, byte[]> f31575f;

    C8269d(C8270e c8270e, InterfaceC8755e<AbstractC8225f0, byte[]> interfaceC8755e) {
        this.f31574e = c8270e;
        this.f31575f = interfaceC8755e;
    }

    /* renamed from: a */
    public static C8269d m26011a(Context context, InterfaceC8279i interfaceC8279i, C8186n0 c8186n0) {
        C8845u.m28178f(context);
        InterfaceC8757g m28180g = C8845u.m28176c().m28180g(new C6206c(f31571b, f31572c));
        C8752b m27945b = C8752b.m27945b(BodyInterceptorV3.RESPONSE_MODE_JSON);
        InterfaceC8755e<AbstractC8225f0, byte[]> interfaceC8755e = f31573d;
        return new C8269d(new C8270e(m28180g.mo26454a("FIREBASE_CRASHLYTICS_REPORT", AbstractC8225f0.class, m27945b, interfaceC8755e), interfaceC8279i.mo26060b(), c8186n0), interfaceC8755e);
    }

    /* renamed from: d */
    private static String m26013d(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            sb.append(str.charAt(i2));
            if (str2.length() > i2) {
                sb.append(str2.charAt(i2));
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public Task<AbstractC8162b0> m26014b(AbstractC8162b0 abstractC8162b0, boolean z) {
        return this.f31574e.m26028g(abstractC8162b0, z).m23654a();
    }
}
