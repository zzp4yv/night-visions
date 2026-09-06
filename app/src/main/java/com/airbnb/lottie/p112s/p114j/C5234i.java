package com.airbnb.lottie.p112s.p114j;

import android.graphics.PointF;
import com.airbnb.lottie.C5157f;
import com.airbnb.lottie.p108q.p109a.C5180m;
import com.airbnb.lottie.p108q.p109a.InterfaceC5169b;
import com.airbnb.lottie.p112s.p113i.C5213b;
import com.airbnb.lottie.p112s.p113i.InterfaceC5224m;
import com.airbnb.lottie.p112s.p115k.AbstractC5243a;

/* compiled from: PolystarShape.java */
/* renamed from: com.airbnb.lottie.s.j.i */
/* loaded from: classes.dex */
public class C5234i implements InterfaceC5227b {

    /* renamed from: a */
    private final String f12738a;

    /* renamed from: b */
    private final a f12739b;

    /* renamed from: c */
    private final C5213b f12740c;

    /* renamed from: d */
    private final InterfaceC5224m<PointF, PointF> f12741d;

    /* renamed from: e */
    private final C5213b f12742e;

    /* renamed from: f */
    private final C5213b f12743f;

    /* renamed from: g */
    private final C5213b f12744g;

    /* renamed from: h */
    private final C5213b f12745h;

    /* renamed from: i */
    private final C5213b f12746i;

    /* compiled from: PolystarShape.java */
    /* renamed from: com.airbnb.lottie.s.j.i$a */
    public enum a {
        Star(1),
        Polygon(2);


        /* renamed from: i */
        private final int f12750i;

        a(int i2) {
            this.f12750i = i2;
        }

        /* renamed from: g */
        public static a m9670g(int i2) {
            for (a aVar : values()) {
                if (aVar.f12750i == i2) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public C5234i(String str, a aVar, C5213b c5213b, InterfaceC5224m<PointF, PointF> interfaceC5224m, C5213b c5213b2, C5213b c5213b3, C5213b c5213b4, C5213b c5213b5, C5213b c5213b6) {
        this.f12738a = str;
        this.f12739b = aVar;
        this.f12740c = c5213b;
        this.f12741d = interfaceC5224m;
        this.f12742e = c5213b2;
        this.f12743f = c5213b3;
        this.f12744g = c5213b4;
        this.f12745h = c5213b5;
        this.f12746i = c5213b6;
    }

    @Override // com.airbnb.lottie.p112s.p114j.InterfaceC5227b
    /* renamed from: a */
    public InterfaceC5169b mo9619a(C5157f c5157f, AbstractC5243a abstractC5243a) {
        return new C5180m(c5157f, abstractC5243a, this);
    }

    /* renamed from: b */
    public C5213b m9661b() {
        return this.f12743f;
    }

    /* renamed from: c */
    public C5213b m9662c() {
        return this.f12745h;
    }

    /* renamed from: d */
    public String m9663d() {
        return this.f12738a;
    }

    /* renamed from: e */
    public C5213b m9664e() {
        return this.f12744g;
    }

    /* renamed from: f */
    public C5213b m9665f() {
        return this.f12746i;
    }

    /* renamed from: g */
    public C5213b m9666g() {
        return this.f12740c;
    }

    /* renamed from: h */
    public InterfaceC5224m<PointF, PointF> m9667h() {
        return this.f12741d;
    }

    /* renamed from: i */
    public C5213b m9668i() {
        return this.f12742e;
    }

    /* renamed from: j */
    public a m9669j() {
        return this.f12739b;
    }
}
