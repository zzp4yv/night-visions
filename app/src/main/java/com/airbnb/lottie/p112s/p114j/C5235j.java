package com.airbnb.lottie.p112s.p114j;

import android.graphics.PointF;
import com.airbnb.lottie.C5157f;
import com.airbnb.lottie.p108q.p109a.C5181n;
import com.airbnb.lottie.p108q.p109a.InterfaceC5169b;
import com.airbnb.lottie.p112s.p113i.C5213b;
import com.airbnb.lottie.p112s.p113i.C5217f;
import com.airbnb.lottie.p112s.p113i.InterfaceC5224m;
import com.airbnb.lottie.p112s.p115k.AbstractC5243a;

/* compiled from: RectangleShape.java */
/* renamed from: com.airbnb.lottie.s.j.j */
/* loaded from: classes.dex */
public class C5235j implements InterfaceC5227b {

    /* renamed from: a */
    private final String f12751a;

    /* renamed from: b */
    private final InterfaceC5224m<PointF, PointF> f12752b;

    /* renamed from: c */
    private final C5217f f12753c;

    /* renamed from: d */
    private final C5213b f12754d;

    public C5235j(String str, InterfaceC5224m<PointF, PointF> interfaceC5224m, C5217f c5217f, C5213b c5213b) {
        this.f12751a = str;
        this.f12752b = interfaceC5224m;
        this.f12753c = c5217f;
        this.f12754d = c5213b;
    }

    @Override // com.airbnb.lottie.p112s.p114j.InterfaceC5227b
    /* renamed from: a */
    public InterfaceC5169b mo9619a(C5157f c5157f, AbstractC5243a abstractC5243a) {
        return new C5181n(c5157f, abstractC5243a, this);
    }

    /* renamed from: b */
    public C5213b m9671b() {
        return this.f12754d;
    }

    /* renamed from: c */
    public String m9672c() {
        return this.f12751a;
    }

    /* renamed from: d */
    public InterfaceC5224m<PointF, PointF> m9673d() {
        return this.f12752b;
    }

    /* renamed from: e */
    public C5217f m9674e() {
        return this.f12753c;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f12752b + ", size=" + this.f12753c + '}';
    }
}
