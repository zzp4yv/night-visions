package com.airbnb.lottie.p108q.p109a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.C5154c;
import com.airbnb.lottie.C5157f;
import com.airbnb.lottie.InterfaceC5161j;
import com.airbnb.lottie.p108q.p110b.AbstractC5186a;
import com.airbnb.lottie.p108q.p110b.C5201p;
import com.airbnb.lottie.p112s.C5208e;
import com.airbnb.lottie.p112s.p114j.C5228c;
import com.airbnb.lottie.p112s.p114j.C5229d;
import com.airbnb.lottie.p112s.p114j.EnumC5231f;
import com.airbnb.lottie.p112s.p115k.AbstractC5243a;
import com.airbnb.lottie.p118v.C5294e;
import com.airbnb.lottie.p119w.C5298c;
import java.util.ArrayList;
import java.util.List;
import p024c.p041e.C0870d;

/* compiled from: GradientFillContent.java */
/* renamed from: com.airbnb.lottie.q.a.g */
/* loaded from: classes.dex */
public class C5174g implements InterfaceC5171d, AbstractC5186a.a, InterfaceC5177j {

    /* renamed from: a */
    private final String f12526a;

    /* renamed from: b */
    private final AbstractC5243a f12527b;

    /* renamed from: c */
    private final C0870d<LinearGradient> f12528c = new C0870d<>();

    /* renamed from: d */
    private final C0870d<RadialGradient> f12529d = new C0870d<>();

    /* renamed from: e */
    private final Matrix f12530e = new Matrix();

    /* renamed from: f */
    private final Path f12531f;

    /* renamed from: g */
    private final Paint f12532g;

    /* renamed from: h */
    private final RectF f12533h;

    /* renamed from: i */
    private final List<InterfaceC5179l> f12534i;

    /* renamed from: j */
    private final EnumC5231f f12535j;

    /* renamed from: k */
    private final AbstractC5186a<C5228c, C5228c> f12536k;

    /* renamed from: l */
    private final AbstractC5186a<Integer, Integer> f12537l;

    /* renamed from: m */
    private final AbstractC5186a<PointF, PointF> f12538m;

    /* renamed from: n */
    private final AbstractC5186a<PointF, PointF> f12539n;

    /* renamed from: o */
    private AbstractC5186a<ColorFilter, ColorFilter> f12540o;

    /* renamed from: p */
    private final C5157f f12541p;

    /* renamed from: q */
    private final int f12542q;

    public C5174g(C5157f c5157f, AbstractC5243a abstractC5243a, C5229d c5229d) {
        Path path = new Path();
        this.f12531f = path;
        this.f12532g = new Paint(1);
        this.f12533h = new RectF();
        this.f12534i = new ArrayList();
        this.f12527b = abstractC5243a;
        this.f12526a = c5229d.m9640f();
        this.f12541p = c5157f;
        this.f12535j = c5229d.m9639e();
        path.setFillType(c5229d.m9637c());
        this.f12542q = (int) (c5157f.m9468j().m9398d() / 32.0f);
        AbstractC5186a<C5228c, C5228c> mo9617a = c5229d.m9638d().mo9617a();
        this.f12536k = mo9617a;
        mo9617a.m9548a(this);
        abstractC5243a.m9723i(mo9617a);
        AbstractC5186a<Integer, Integer> mo9617a2 = c5229d.m9641g().mo9617a();
        this.f12537l = mo9617a2;
        mo9617a2.m9548a(this);
        abstractC5243a.m9723i(mo9617a2);
        AbstractC5186a<PointF, PointF> mo9617a3 = c5229d.m9642h().mo9617a();
        this.f12538m = mo9617a3;
        mo9617a3.m9548a(this);
        abstractC5243a.m9723i(mo9617a3);
        AbstractC5186a<PointF, PointF> mo9617a4 = c5229d.m9636b().mo9617a();
        this.f12539n = mo9617a4;
        mo9617a4.m9548a(this);
        abstractC5243a.m9723i(mo9617a4);
    }

    /* renamed from: e */
    private int m9526e() {
        int round = Math.round(this.f12538m.m9551f() * this.f12542q);
        int round2 = Math.round(this.f12539n.m9551f() * this.f12542q);
        int round3 = Math.round(this.f12536k.m9551f() * this.f12542q);
        int i2 = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i2 = i2 * 31 * round2;
        }
        return round3 != 0 ? i2 * 31 * round3 : i2;
    }

    /* renamed from: i */
    private LinearGradient m9527i() {
        long m9526e = m9526e();
        LinearGradient m5438g = this.f12528c.m5438g(m9526e);
        if (m5438g != null) {
            return m5438g;
        }
        PointF mo9552h = this.f12538m.mo9552h();
        PointF mo9552h2 = this.f12539n.mo9552h();
        C5228c mo9552h3 = this.f12536k.mo9552h();
        LinearGradient linearGradient = new LinearGradient(mo9552h.x, mo9552h.y, mo9552h2.x, mo9552h2.y, mo9552h3.m9632a(), mo9552h3.m9633b(), Shader.TileMode.CLAMP);
        this.f12528c.m5442k(m9526e, linearGradient);
        return linearGradient;
    }

    /* renamed from: j */
    private RadialGradient m9528j() {
        long m9526e = m9526e();
        RadialGradient m5438g = this.f12529d.m5438g(m9526e);
        if (m5438g != null) {
            return m5438g;
        }
        PointF mo9552h = this.f12538m.mo9552h();
        PointF mo9552h2 = this.f12539n.mo9552h();
        C5228c mo9552h3 = this.f12536k.mo9552h();
        int[] m9632a = mo9552h3.m9632a();
        float[] m9633b = mo9552h3.m9633b();
        RadialGradient radialGradient = new RadialGradient(mo9552h.x, mo9552h.y, (float) Math.hypot(mo9552h2.x - r6, mo9552h2.y - r7), m9632a, m9633b, Shader.TileMode.CLAMP);
        this.f12529d.m5442k(m9526e, radialGradient);
        return radialGradient;
    }

    @Override // com.airbnb.lottie.p108q.p110b.AbstractC5186a.a
    /* renamed from: a */
    public void mo9512a() {
        this.f12541p.invalidateSelf();
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5169b
    /* renamed from: b */
    public void mo9513b(List<InterfaceC5169b> list, List<InterfaceC5169b> list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            InterfaceC5169b interfaceC5169b = list2.get(i2);
            if (interfaceC5169b instanceof InterfaceC5179l) {
                this.f12534i.add((InterfaceC5179l) interfaceC5169b);
            }
        }
    }

    @Override // com.airbnb.lottie.p112s.InterfaceC5209f
    /* renamed from: c */
    public void mo9514c(C5208e c5208e, int i2, List<C5208e> list, C5208e c5208e2) {
        C5294e.m9882l(c5208e, i2, list, c5208e2, this);
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5171d
    /* renamed from: d */
    public void mo9515d(RectF rectF, Matrix matrix) {
        this.f12531f.reset();
        for (int i2 = 0; i2 < this.f12534i.size(); i2++) {
            this.f12531f.addPath(this.f12534i.get(i2).mo9522g(), matrix);
        }
        this.f12531f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5171d
    /* renamed from: f */
    public void mo9516f(Canvas canvas, Matrix matrix, int i2) {
        C5154c.m9391a("GradientFillContent#draw");
        this.f12531f.reset();
        for (int i3 = 0; i3 < this.f12534i.size(); i3++) {
            this.f12531f.addPath(this.f12534i.get(i3).mo9522g(), matrix);
        }
        this.f12531f.computeBounds(this.f12533h, false);
        Shader m9527i = this.f12535j == EnumC5231f.Linear ? m9527i() : m9528j();
        this.f12530e.set(matrix);
        m9527i.setLocalMatrix(this.f12530e);
        this.f12532g.setShader(m9527i);
        AbstractC5186a<ColorFilter, ColorFilter> abstractC5186a = this.f12540o;
        if (abstractC5186a != null) {
            this.f12532g.setColorFilter(abstractC5186a.mo9552h());
        }
        this.f12532g.setAlpha(C5294e.m9873c((int) ((((i2 / 255.0f) * this.f12537l.mo9552h().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.f12531f, this.f12532g);
        C5154c.m9393c("GradientFillContent#draw");
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5169b
    public String getName() {
        return this.f12526a;
    }

    @Override // com.airbnb.lottie.p112s.InterfaceC5209f
    /* renamed from: h */
    public <T> void mo9517h(T t, C5298c<T> c5298c) {
        if (t == InterfaceC5161j.f12418x) {
            if (c5298c == null) {
                this.f12540o = null;
                return;
            }
            C5201p c5201p = new C5201p(c5298c);
            this.f12540o = c5201p;
            c5201p.m9548a(this);
            this.f12527b.m9723i(this.f12540o);
        }
    }
}
