package com.airbnb.lottie.p108q.p109a;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.C5157f;
import com.airbnb.lottie.p108q.p110b.AbstractC5186a;
import com.airbnb.lottie.p112s.p114j.C5228c;
import com.airbnb.lottie.p112s.p114j.C5230e;
import com.airbnb.lottie.p112s.p114j.EnumC5231f;
import com.airbnb.lottie.p112s.p115k.AbstractC5243a;
import p024c.p041e.C0870d;

/* compiled from: GradientStrokeContent.java */
/* renamed from: com.airbnb.lottie.q.a.h */
/* loaded from: classes.dex */
public class C5175h extends AbstractC5168a {

    /* renamed from: o */
    private final String f12543o;

    /* renamed from: p */
    private final C0870d<LinearGradient> f12544p;

    /* renamed from: q */
    private final C0870d<RadialGradient> f12545q;

    /* renamed from: r */
    private final RectF f12546r;

    /* renamed from: s */
    private final EnumC5231f f12547s;

    /* renamed from: t */
    private final int f12548t;

    /* renamed from: u */
    private final AbstractC5186a<C5228c, C5228c> f12549u;

    /* renamed from: v */
    private final AbstractC5186a<PointF, PointF> f12550v;

    /* renamed from: w */
    private final AbstractC5186a<PointF, PointF> f12551w;

    public C5175h(C5157f c5157f, AbstractC5243a abstractC5243a, C5230e c5230e) {
        super(c5157f, abstractC5243a, c5230e.m9643b().m9701g(), c5230e.m9648g().m9702g(), c5230e.m9650i(), c5230e.m9652k(), c5230e.m9654m(), c5230e.m9649h(), c5230e.m9644c());
        this.f12544p = new C0870d<>();
        this.f12545q = new C0870d<>();
        this.f12546r = new RectF();
        this.f12543o = c5230e.m9651j();
        this.f12547s = c5230e.m9647f();
        this.f12548t = (int) (c5157f.m9468j().m9398d() / 32.0f);
        AbstractC5186a<C5228c, C5228c> mo9617a = c5230e.m9646e().mo9617a();
        this.f12549u = mo9617a;
        mo9617a.m9548a(this);
        abstractC5243a.m9723i(mo9617a);
        AbstractC5186a<PointF, PointF> mo9617a2 = c5230e.m9653l().mo9617a();
        this.f12550v = mo9617a2;
        mo9617a2.m9548a(this);
        abstractC5243a.m9723i(mo9617a2);
        AbstractC5186a<PointF, PointF> mo9617a3 = c5230e.m9645d().mo9617a();
        this.f12551w = mo9617a3;
        mo9617a3.m9548a(this);
        abstractC5243a.m9723i(mo9617a3);
    }

    /* renamed from: j */
    private int m9529j() {
        int round = Math.round(this.f12550v.m9551f() * this.f12548t);
        int round2 = Math.round(this.f12551w.m9551f() * this.f12548t);
        int round3 = Math.round(this.f12549u.m9551f() * this.f12548t);
        int i2 = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i2 = i2 * 31 * round2;
        }
        return round3 != 0 ? i2 * 31 * round3 : i2;
    }

    /* renamed from: k */
    private LinearGradient m9530k() {
        long m9529j = m9529j();
        LinearGradient m5438g = this.f12544p.m5438g(m9529j);
        if (m5438g != null) {
            return m5438g;
        }
        PointF mo9552h = this.f12550v.mo9552h();
        PointF mo9552h2 = this.f12551w.mo9552h();
        C5228c mo9552h3 = this.f12549u.mo9552h();
        int[] m9632a = mo9552h3.m9632a();
        float[] m9633b = mo9552h3.m9633b();
        RectF rectF = this.f12546r;
        int width = (int) (rectF.left + (rectF.width() / 2.0f) + mo9552h.x);
        RectF rectF2 = this.f12546r;
        int height = (int) (rectF2.top + (rectF2.height() / 2.0f) + mo9552h.y);
        RectF rectF3 = this.f12546r;
        int width2 = (int) (rectF3.left + (rectF3.width() / 2.0f) + mo9552h2.x);
        RectF rectF4 = this.f12546r;
        LinearGradient linearGradient = new LinearGradient(width, height, width2, (int) (rectF4.top + (rectF4.height() / 2.0f) + mo9552h2.y), m9632a, m9633b, Shader.TileMode.CLAMP);
        this.f12544p.m5442k(m9529j, linearGradient);
        return linearGradient;
    }

    /* renamed from: l */
    private RadialGradient m9531l() {
        long m9529j = m9529j();
        RadialGradient m5438g = this.f12545q.m5438g(m9529j);
        if (m5438g != null) {
            return m5438g;
        }
        PointF mo9552h = this.f12550v.mo9552h();
        PointF mo9552h2 = this.f12551w.mo9552h();
        C5228c mo9552h3 = this.f12549u.mo9552h();
        int[] m9632a = mo9552h3.m9632a();
        float[] m9633b = mo9552h3.m9633b();
        RectF rectF = this.f12546r;
        int width = (int) (rectF.left + (rectF.width() / 2.0f) + mo9552h.x);
        RectF rectF2 = this.f12546r;
        int height = (int) (rectF2.top + (rectF2.height() / 2.0f) + mo9552h.y);
        RectF rectF3 = this.f12546r;
        int width2 = (int) (rectF3.left + (rectF3.width() / 2.0f) + mo9552h2.x);
        RectF rectF4 = this.f12546r;
        RadialGradient radialGradient = new RadialGradient(width, height, (float) Math.hypot(width2 - width, ((int) ((rectF4.top + (rectF4.height() / 2.0f)) + mo9552h2.y)) - height), m9632a, m9633b, Shader.TileMode.CLAMP);
        this.f12545q.m5442k(m9529j, radialGradient);
        return radialGradient;
    }

    @Override // com.airbnb.lottie.p108q.p109a.AbstractC5168a, com.airbnb.lottie.p108q.p109a.InterfaceC5171d
    /* renamed from: f */
    public void mo9516f(Canvas canvas, Matrix matrix, int i2) {
        mo9515d(this.f12546r, matrix);
        if (this.f12547s == EnumC5231f.Linear) {
            this.f12493i.setShader(m9530k());
        } else {
            this.f12493i.setShader(m9531l());
        }
        super.mo9516f(canvas, matrix, i2);
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5169b
    public String getName() {
        return this.f12543o;
    }
}
