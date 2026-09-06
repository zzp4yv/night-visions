package com.airbnb.lottie.p108q.p109a;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C5157f;
import com.airbnb.lottie.InterfaceC5161j;
import com.airbnb.lottie.p108q.p110b.AbstractC5186a;
import com.airbnb.lottie.p112s.C5208e;
import com.airbnb.lottie.p112s.p114j.C5226a;
import com.airbnb.lottie.p112s.p114j.C5242q;
import com.airbnb.lottie.p112s.p115k.AbstractC5243a;
import com.airbnb.lottie.p118v.C5294e;
import com.airbnb.lottie.p118v.C5295f;
import com.airbnb.lottie.p119w.C5298c;
import java.util.List;

/* compiled from: EllipseContent.java */
/* renamed from: com.airbnb.lottie.q.a.e */
/* loaded from: classes.dex */
public class C5172e implements InterfaceC5179l, AbstractC5186a.a, InterfaceC5177j {

    /* renamed from: a */
    private final Path f12509a = new Path();

    /* renamed from: b */
    private final String f12510b;

    /* renamed from: c */
    private final C5157f f12511c;

    /* renamed from: d */
    private final AbstractC5186a<?, PointF> f12512d;

    /* renamed from: e */
    private final AbstractC5186a<?, PointF> f12513e;

    /* renamed from: f */
    private final C5226a f12514f;

    /* renamed from: g */
    private C5185r f12515g;

    /* renamed from: h */
    private boolean f12516h;

    public C5172e(C5157f c5157f, AbstractC5243a abstractC5243a, C5226a c5226a) {
        this.f12510b = c5226a.m9628b();
        this.f12511c = c5157f;
        AbstractC5186a<PointF, PointF> mo9617a = c5226a.m9630d().mo9617a();
        this.f12512d = mo9617a;
        AbstractC5186a<PointF, PointF> mo9617a2 = c5226a.m9629c().mo9617a();
        this.f12513e = mo9617a2;
        this.f12514f = c5226a;
        abstractC5243a.m9723i(mo9617a);
        abstractC5243a.m9723i(mo9617a2);
        mo9617a.m9548a(this);
        mo9617a2.m9548a(this);
    }

    /* renamed from: e */
    private void m9525e() {
        this.f12516h = false;
        this.f12511c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.p108q.p110b.AbstractC5186a.a
    /* renamed from: a */
    public void mo9512a() {
        m9525e();
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5169b
    /* renamed from: b */
    public void mo9513b(List<InterfaceC5169b> list, List<InterfaceC5169b> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            InterfaceC5169b interfaceC5169b = list.get(i2);
            if (interfaceC5169b instanceof C5185r) {
                C5185r c5185r = (C5185r) interfaceC5169b;
                if (c5185r.m9544j() == C5242q.a.Simultaneously) {
                    this.f12515g = c5185r;
                    c5185r.m9540c(this);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.p112s.InterfaceC5209f
    /* renamed from: c */
    public void mo9514c(C5208e c5208e, int i2, List<C5208e> list, C5208e c5208e2) {
        C5294e.m9882l(c5208e, i2, list, c5208e2, this);
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5179l
    /* renamed from: g */
    public Path mo9522g() {
        if (this.f12516h) {
            return this.f12509a;
        }
        this.f12509a.reset();
        PointF mo9552h = this.f12512d.mo9552h();
        float f2 = mo9552h.x / 2.0f;
        float f3 = mo9552h.y / 2.0f;
        float f4 = f2 * 0.55228f;
        float f5 = 0.55228f * f3;
        this.f12509a.reset();
        if (this.f12514f.m9631e()) {
            float f6 = -f3;
            this.f12509a.moveTo(0.0f, f6);
            float f7 = 0.0f - f4;
            float f8 = -f2;
            float f9 = 0.0f - f5;
            this.f12509a.cubicTo(f7, f6, f8, f9, f8, 0.0f);
            float f10 = f5 + 0.0f;
            this.f12509a.cubicTo(f8, f10, f7, f3, 0.0f, f3);
            float f11 = f4 + 0.0f;
            this.f12509a.cubicTo(f11, f3, f2, f10, f2, 0.0f);
            this.f12509a.cubicTo(f2, f9, f11, f6, 0.0f, f6);
        } else {
            float f12 = -f3;
            this.f12509a.moveTo(0.0f, f12);
            float f13 = f4 + 0.0f;
            float f14 = 0.0f - f5;
            this.f12509a.cubicTo(f13, f12, f2, f14, f2, 0.0f);
            float f15 = f5 + 0.0f;
            this.f12509a.cubicTo(f2, f15, f13, f3, 0.0f, f3);
            float f16 = 0.0f - f4;
            float f17 = -f2;
            this.f12509a.cubicTo(f16, f3, f17, f15, f17, 0.0f);
            this.f12509a.cubicTo(f17, f14, f16, f12, 0.0f, f12);
        }
        PointF mo9552h2 = this.f12513e.mo9552h();
        this.f12509a.offset(mo9552h2.x, mo9552h2.y);
        this.f12509a.close();
        C5295f.m9884b(this.f12509a, this.f12515g);
        this.f12516h = true;
        return this.f12509a;
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5169b
    public String getName() {
        return this.f12510b;
    }

    @Override // com.airbnb.lottie.p112s.InterfaceC5209f
    /* renamed from: h */
    public <T> void mo9517h(T t, C5298c<T> c5298c) {
        if (t == InterfaceC5161j.f12401g) {
            this.f12512d.m9557m(c5298c);
        } else if (t == InterfaceC5161j.f12402h) {
            this.f12513e.m9557m(c5298c);
        }
    }
}
