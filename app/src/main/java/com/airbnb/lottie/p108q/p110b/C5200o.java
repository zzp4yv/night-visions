package com.airbnb.lottie.p108q.p110b;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.InterfaceC5161j;
import com.airbnb.lottie.p108q.p110b.AbstractC5186a;
import com.airbnb.lottie.p112s.p113i.C5223l;
import com.airbnb.lottie.p112s.p115k.AbstractC5243a;
import com.airbnb.lottie.p119w.C5298c;
import com.airbnb.lottie.p119w.C5299d;

/* compiled from: TransformKeyframeAnimation.java */
/* renamed from: com.airbnb.lottie.q.b.o */
/* loaded from: classes.dex */
public class C5200o {

    /* renamed from: a */
    private final Matrix f12628a = new Matrix();

    /* renamed from: b */
    private final AbstractC5186a<PointF, PointF> f12629b;

    /* renamed from: c */
    private final AbstractC5186a<?, PointF> f12630c;

    /* renamed from: d */
    private final AbstractC5186a<C5299d, C5299d> f12631d;

    /* renamed from: e */
    private final AbstractC5186a<Float, Float> f12632e;

    /* renamed from: f */
    private final AbstractC5186a<Integer, Integer> f12633f;

    /* renamed from: g */
    private final AbstractC5186a<?, Float> f12634g;

    /* renamed from: h */
    private final AbstractC5186a<?, Float> f12635h;

    public C5200o(C5223l c5223l) {
        this.f12629b = c5223l.m9621c().mo9617a();
        this.f12630c = c5223l.m9624f().mo9617a();
        this.f12631d = c5223l.m9626h().mo9617a();
        this.f12632e = c5223l.m9625g().mo9617a();
        this.f12633f = c5223l.m9623e().mo9617a();
        if (c5223l.m9627i() != null) {
            this.f12634g = c5223l.m9627i().mo9617a();
        } else {
            this.f12634g = null;
        }
        if (c5223l.m9622d() != null) {
            this.f12635h = c5223l.m9622d().mo9617a();
        } else {
            this.f12635h = null;
        }
    }

    /* renamed from: a */
    public void m9573a(AbstractC5243a abstractC5243a) {
        abstractC5243a.m9723i(this.f12629b);
        abstractC5243a.m9723i(this.f12630c);
        abstractC5243a.m9723i(this.f12631d);
        abstractC5243a.m9723i(this.f12632e);
        abstractC5243a.m9723i(this.f12633f);
        AbstractC5186a<?, Float> abstractC5186a = this.f12634g;
        if (abstractC5186a != null) {
            abstractC5243a.m9723i(abstractC5186a);
        }
        AbstractC5186a<?, Float> abstractC5186a2 = this.f12635h;
        if (abstractC5186a2 != null) {
            abstractC5243a.m9723i(abstractC5186a2);
        }
    }

    /* renamed from: b */
    public void m9574b(AbstractC5186a.a aVar) {
        this.f12629b.m9548a(aVar);
        this.f12630c.m9548a(aVar);
        this.f12631d.m9548a(aVar);
        this.f12632e.m9548a(aVar);
        this.f12633f.m9548a(aVar);
        AbstractC5186a<?, Float> abstractC5186a = this.f12634g;
        if (abstractC5186a != null) {
            abstractC5186a.m9548a(aVar);
        }
        AbstractC5186a<?, Float> abstractC5186a2 = this.f12635h;
        if (abstractC5186a2 != null) {
            abstractC5186a2.m9548a(aVar);
        }
    }

    /* renamed from: c */
    public <T> boolean m9575c(T t, C5298c<T> c5298c) {
        AbstractC5186a<?, Float> abstractC5186a;
        AbstractC5186a<?, Float> abstractC5186a2;
        if (t == InterfaceC5161j.f12399e) {
            this.f12629b.m9557m(c5298c);
            return true;
        }
        if (t == InterfaceC5161j.f12400f) {
            this.f12630c.m9557m(c5298c);
            return true;
        }
        if (t == InterfaceC5161j.f12403i) {
            this.f12631d.m9557m(c5298c);
            return true;
        }
        if (t == InterfaceC5161j.f12404j) {
            this.f12632e.m9557m(c5298c);
            return true;
        }
        if (t == InterfaceC5161j.f12397c) {
            this.f12633f.m9557m(c5298c);
            return true;
        }
        if (t == InterfaceC5161j.f12415u && (abstractC5186a2 = this.f12634g) != null) {
            abstractC5186a2.m9557m(c5298c);
            return true;
        }
        if (t != InterfaceC5161j.f12416v || (abstractC5186a = this.f12635h) == null) {
            return false;
        }
        abstractC5186a.m9557m(c5298c);
        return true;
    }

    /* renamed from: d */
    public AbstractC5186a<?, Float> m9576d() {
        return this.f12635h;
    }

    /* renamed from: e */
    public Matrix m9577e() {
        this.f12628a.reset();
        PointF mo9552h = this.f12630c.mo9552h();
        float f2 = mo9552h.x;
        if (f2 != 0.0f || mo9552h.y != 0.0f) {
            this.f12628a.preTranslate(f2, mo9552h.y);
        }
        float floatValue = this.f12632e.mo9552h().floatValue();
        if (floatValue != 0.0f) {
            this.f12628a.preRotate(floatValue);
        }
        C5299d mo9552h2 = this.f12631d.mo9552h();
        if (mo9552h2.m9899a() != 1.0f || mo9552h2.m9900b() != 1.0f) {
            this.f12628a.preScale(mo9552h2.m9899a(), mo9552h2.m9900b());
        }
        PointF mo9552h3 = this.f12629b.mo9552h();
        float f3 = mo9552h3.x;
        if (f3 != 0.0f || mo9552h3.y != 0.0f) {
            this.f12628a.preTranslate(-f3, -mo9552h3.y);
        }
        return this.f12628a;
    }

    /* renamed from: f */
    public Matrix m9578f(float f2) {
        PointF mo9552h = this.f12630c.mo9552h();
        PointF mo9552h2 = this.f12629b.mo9552h();
        C5299d mo9552h3 = this.f12631d.mo9552h();
        float floatValue = this.f12632e.mo9552h().floatValue();
        this.f12628a.reset();
        this.f12628a.preTranslate(mo9552h.x * f2, mo9552h.y * f2);
        double d2 = f2;
        this.f12628a.preScale((float) Math.pow(mo9552h3.m9899a(), d2), (float) Math.pow(mo9552h3.m9900b(), d2));
        this.f12628a.preRotate(floatValue * f2, mo9552h2.x, mo9552h2.y);
        return this.f12628a;
    }

    /* renamed from: g */
    public AbstractC5186a<?, Integer> m9579g() {
        return this.f12633f;
    }

    /* renamed from: h */
    public AbstractC5186a<?, Float> m9580h() {
        return this.f12634g;
    }

    /* renamed from: i */
    public void m9581i(float f2) {
        this.f12629b.mo9556l(f2);
        this.f12630c.mo9556l(f2);
        this.f12631d.mo9556l(f2);
        this.f12632e.mo9556l(f2);
        this.f12633f.mo9556l(f2);
        AbstractC5186a<?, Float> abstractC5186a = this.f12634g;
        if (abstractC5186a != null) {
            abstractC5186a.mo9556l(f2);
        }
        AbstractC5186a<?, Float> abstractC5186a2 = this.f12635h;
        if (abstractC5186a2 != null) {
            abstractC5186a2.mo9556l(f2);
        }
    }
}
