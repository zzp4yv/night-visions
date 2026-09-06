package com.airbnb.lottie.p112s.p114j;

import android.graphics.PointF;
import com.airbnb.lottie.C5157f;
import com.airbnb.lottie.p108q.p109a.C5172e;
import com.airbnb.lottie.p108q.p109a.InterfaceC5169b;
import com.airbnb.lottie.p112s.p113i.C5217f;
import com.airbnb.lottie.p112s.p113i.InterfaceC5224m;
import com.airbnb.lottie.p112s.p115k.AbstractC5243a;

/* compiled from: CircleShape.java */
/* renamed from: com.airbnb.lottie.s.j.a */
/* loaded from: classes.dex */
public class C5226a implements InterfaceC5227b {

    /* renamed from: a */
    private final String f12693a;

    /* renamed from: b */
    private final InterfaceC5224m<PointF, PointF> f12694b;

    /* renamed from: c */
    private final C5217f f12695c;

    /* renamed from: d */
    private final boolean f12696d;

    public C5226a(String str, InterfaceC5224m<PointF, PointF> interfaceC5224m, C5217f c5217f, boolean z) {
        this.f12693a = str;
        this.f12694b = interfaceC5224m;
        this.f12695c = c5217f;
        this.f12696d = z;
    }

    @Override // com.airbnb.lottie.p112s.p114j.InterfaceC5227b
    /* renamed from: a */
    public InterfaceC5169b mo9619a(C5157f c5157f, AbstractC5243a abstractC5243a) {
        return new C5172e(c5157f, abstractC5243a, this);
    }

    /* renamed from: b */
    public String m9628b() {
        return this.f12693a;
    }

    /* renamed from: c */
    public InterfaceC5224m<PointF, PointF> m9629c() {
        return this.f12694b;
    }

    /* renamed from: d */
    public C5217f m9630d() {
        return this.f12695c;
    }

    /* renamed from: e */
    public boolean m9631e() {
        return this.f12696d;
    }
}
