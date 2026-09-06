package com.airbnb.lottie.p108q.p109a;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.C5157f;
import com.airbnb.lottie.p108q.p110b.AbstractC5186a;
import com.airbnb.lottie.p112s.C5208e;
import com.airbnb.lottie.p112s.p114j.C5235j;
import com.airbnb.lottie.p112s.p114j.C5242q;
import com.airbnb.lottie.p112s.p115k.AbstractC5243a;
import com.airbnb.lottie.p118v.C5294e;
import com.airbnb.lottie.p118v.C5295f;
import com.airbnb.lottie.p119w.C5298c;
import java.util.List;

/* compiled from: RectangleContent.java */
/* renamed from: com.airbnb.lottie.q.a.n */
/* loaded from: classes.dex */
public class C5181n implements AbstractC5186a.a, InterfaceC5177j, InterfaceC5179l {

    /* renamed from: a */
    private final Path f12573a = new Path();

    /* renamed from: b */
    private final RectF f12574b = new RectF();

    /* renamed from: c */
    private final String f12575c;

    /* renamed from: d */
    private final C5157f f12576d;

    /* renamed from: e */
    private final AbstractC5186a<?, PointF> f12577e;

    /* renamed from: f */
    private final AbstractC5186a<?, PointF> f12578f;

    /* renamed from: g */
    private final AbstractC5186a<?, Float> f12579g;

    /* renamed from: h */
    private C5185r f12580h;

    /* renamed from: i */
    private boolean f12581i;

    public C5181n(C5157f c5157f, AbstractC5243a abstractC5243a, C5235j c5235j) {
        this.f12575c = c5235j.m9672c();
        this.f12576d = c5157f;
        AbstractC5186a<PointF, PointF> mo9617a = c5235j.m9673d().mo9617a();
        this.f12577e = mo9617a;
        AbstractC5186a<PointF, PointF> mo9617a2 = c5235j.m9674e().mo9617a();
        this.f12578f = mo9617a2;
        AbstractC5186a<Float, Float> mo9617a3 = c5235j.m9671b().mo9617a();
        this.f12579g = mo9617a3;
        abstractC5243a.m9723i(mo9617a);
        abstractC5243a.m9723i(mo9617a2);
        abstractC5243a.m9723i(mo9617a3);
        mo9617a.m9548a(this);
        mo9617a2.m9548a(this);
        mo9617a3.m9548a(this);
    }

    /* renamed from: e */
    private void m9538e() {
        this.f12581i = false;
        this.f12576d.invalidateSelf();
    }

    @Override // com.airbnb.lottie.p108q.p110b.AbstractC5186a.a
    /* renamed from: a */
    public void mo9512a() {
        m9538e();
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5169b
    /* renamed from: b */
    public void mo9513b(List<InterfaceC5169b> list, List<InterfaceC5169b> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            InterfaceC5169b interfaceC5169b = list.get(i2);
            if (interfaceC5169b instanceof C5185r) {
                C5185r c5185r = (C5185r) interfaceC5169b;
                if (c5185r.m9544j() == C5242q.a.Simultaneously) {
                    this.f12580h = c5185r;
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
        if (this.f12581i) {
            return this.f12573a;
        }
        this.f12573a.reset();
        PointF mo9552h = this.f12578f.mo9552h();
        float f2 = mo9552h.x / 2.0f;
        float f3 = mo9552h.y / 2.0f;
        AbstractC5186a<?, Float> abstractC5186a = this.f12579g;
        float floatValue = abstractC5186a == null ? 0.0f : abstractC5186a.mo9552h().floatValue();
        float min = Math.min(f2, f3);
        if (floatValue > min) {
            floatValue = min;
        }
        PointF mo9552h2 = this.f12577e.mo9552h();
        this.f12573a.moveTo(mo9552h2.x + f2, (mo9552h2.y - f3) + floatValue);
        this.f12573a.lineTo(mo9552h2.x + f2, (mo9552h2.y + f3) - floatValue);
        if (floatValue > 0.0f) {
            RectF rectF = this.f12574b;
            float f4 = mo9552h2.x;
            float f5 = floatValue * 2.0f;
            float f6 = mo9552h2.y;
            rectF.set((f4 + f2) - f5, (f6 + f3) - f5, f4 + f2, f6 + f3);
            this.f12573a.arcTo(this.f12574b, 0.0f, 90.0f, false);
        }
        this.f12573a.lineTo((mo9552h2.x - f2) + floatValue, mo9552h2.y + f3);
        if (floatValue > 0.0f) {
            RectF rectF2 = this.f12574b;
            float f7 = mo9552h2.x;
            float f8 = mo9552h2.y;
            float f9 = floatValue * 2.0f;
            rectF2.set(f7 - f2, (f8 + f3) - f9, (f7 - f2) + f9, f8 + f3);
            this.f12573a.arcTo(this.f12574b, 90.0f, 90.0f, false);
        }
        this.f12573a.lineTo(mo9552h2.x - f2, (mo9552h2.y - f3) + floatValue);
        if (floatValue > 0.0f) {
            RectF rectF3 = this.f12574b;
            float f10 = mo9552h2.x;
            float f11 = mo9552h2.y;
            float f12 = floatValue * 2.0f;
            rectF3.set(f10 - f2, f11 - f3, (f10 - f2) + f12, (f11 - f3) + f12);
            this.f12573a.arcTo(this.f12574b, 180.0f, 90.0f, false);
        }
        this.f12573a.lineTo((mo9552h2.x + f2) - floatValue, mo9552h2.y - f3);
        if (floatValue > 0.0f) {
            RectF rectF4 = this.f12574b;
            float f13 = mo9552h2.x;
            float f14 = floatValue * 2.0f;
            float f15 = mo9552h2.y;
            rectF4.set((f13 + f2) - f14, f15 - f3, f13 + f2, (f15 - f3) + f14);
            this.f12573a.arcTo(this.f12574b, 270.0f, 90.0f, false);
        }
        this.f12573a.close();
        C5295f.m9884b(this.f12573a, this.f12580h);
        this.f12581i = true;
        return this.f12573a;
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5169b
    public String getName() {
        return this.f12575c;
    }

    @Override // com.airbnb.lottie.p112s.InterfaceC5209f
    /* renamed from: h */
    public <T> void mo9517h(T t, C5298c<T> c5298c) {
    }
}
