package com.airbnb.lottie.p108q.p109a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.airbnb.lottie.C5157f;
import com.airbnb.lottie.InterfaceC5161j;
import com.airbnb.lottie.p108q.p110b.AbstractC5186a;
import com.airbnb.lottie.p108q.p110b.C5201p;
import com.airbnb.lottie.p112s.p114j.C5241p;
import com.airbnb.lottie.p112s.p115k.AbstractC5243a;
import com.airbnb.lottie.p119w.C5298c;

/* compiled from: StrokeContent.java */
/* renamed from: com.airbnb.lottie.q.a.q */
/* loaded from: classes.dex */
public class C5184q extends AbstractC5168a {

    /* renamed from: o */
    private final AbstractC5243a f12597o;

    /* renamed from: p */
    private final String f12598p;

    /* renamed from: q */
    private final AbstractC5186a<Integer, Integer> f12599q;

    /* renamed from: r */
    private AbstractC5186a<ColorFilter, ColorFilter> f12600r;

    public C5184q(C5157f c5157f, AbstractC5243a abstractC5243a, C5241p c5241p) {
        super(c5157f, abstractC5243a, c5241p.m9692b().m9701g(), c5241p.m9695e().m9702g(), c5241p.m9697g(), c5241p.m9699i(), c5241p.m9700j(), c5241p.m9696f(), c5241p.m9694d());
        this.f12597o = abstractC5243a;
        this.f12598p = c5241p.m9698h();
        AbstractC5186a<Integer, Integer> mo9617a = c5241p.m9693c().mo9617a();
        this.f12599q = mo9617a;
        mo9617a.m9548a(this);
        abstractC5243a.m9723i(mo9617a);
    }

    @Override // com.airbnb.lottie.p108q.p109a.AbstractC5168a, com.airbnb.lottie.p108q.p109a.InterfaceC5171d
    /* renamed from: f */
    public void mo9516f(Canvas canvas, Matrix matrix, int i2) {
        this.f12493i.setColor(this.f12599q.mo9552h().intValue());
        AbstractC5186a<ColorFilter, ColorFilter> abstractC5186a = this.f12600r;
        if (abstractC5186a != null) {
            this.f12493i.setColorFilter(abstractC5186a.mo9552h());
        }
        super.mo9516f(canvas, matrix, i2);
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5169b
    public String getName() {
        return this.f12598p;
    }

    @Override // com.airbnb.lottie.p108q.p109a.AbstractC5168a, com.airbnb.lottie.p112s.InterfaceC5209f
    /* renamed from: h */
    public <T> void mo9517h(T t, C5298c<T> c5298c) {
        super.mo9517h(t, c5298c);
        if (t == InterfaceC5161j.f12396b) {
            this.f12599q.m9557m(c5298c);
            return;
        }
        if (t == InterfaceC5161j.f12418x) {
            if (c5298c == null) {
                this.f12600r = null;
                return;
            }
            C5201p c5201p = new C5201p(c5298c);
            this.f12600r = c5201p;
            c5201p.m9548a(this);
            this.f12597o.m9723i(this.f12599q);
        }
    }
}
