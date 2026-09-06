package com.airbnb.lottie.p108q.p109a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.C5154c;
import com.airbnb.lottie.C5157f;
import com.airbnb.lottie.InterfaceC5161j;
import com.airbnb.lottie.p108q.p110b.AbstractC5186a;
import com.airbnb.lottie.p108q.p110b.C5201p;
import com.airbnb.lottie.p112s.C5208e;
import com.airbnb.lottie.p112s.p113i.C5213b;
import com.airbnb.lottie.p112s.p113i.C5215d;
import com.airbnb.lottie.p112s.p114j.C5242q;
import com.airbnb.lottie.p112s.p115k.AbstractC5243a;
import com.airbnb.lottie.p118v.C5294e;
import com.airbnb.lottie.p118v.C5295f;
import com.airbnb.lottie.p119w.C5298c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BaseStrokeContent.java */
/* renamed from: com.airbnb.lottie.q.a.a */
/* loaded from: classes.dex */
public abstract class AbstractC5168a implements AbstractC5186a.a, InterfaceC5177j, InterfaceC5171d {

    /* renamed from: e */
    private final C5157f f12489e;

    /* renamed from: f */
    private final AbstractC5243a f12490f;

    /* renamed from: h */
    private final float[] f12492h;

    /* renamed from: i */
    final Paint f12493i;

    /* renamed from: j */
    private final AbstractC5186a<?, Float> f12494j;

    /* renamed from: k */
    private final AbstractC5186a<?, Integer> f12495k;

    /* renamed from: l */
    private final List<AbstractC5186a<?, Float>> f12496l;

    /* renamed from: m */
    private final AbstractC5186a<?, Float> f12497m;

    /* renamed from: n */
    private AbstractC5186a<ColorFilter, ColorFilter> f12498n;

    /* renamed from: a */
    private final PathMeasure f12485a = new PathMeasure();

    /* renamed from: b */
    private final Path f12486b = new Path();

    /* renamed from: c */
    private final Path f12487c = new Path();

    /* renamed from: d */
    private final RectF f12488d = new RectF();

    /* renamed from: g */
    private final List<b> f12491g = new ArrayList();

    /* compiled from: BaseStrokeContent.java */
    /* renamed from: com.airbnb.lottie.q.a.a$b */
    private static final class b {

        /* renamed from: a */
        private final List<InterfaceC5179l> f12499a;

        /* renamed from: b */
        private final C5185r f12500b;

        private b(C5185r c5185r) {
            this.f12499a = new ArrayList();
            this.f12500b = c5185r;
        }
    }

    AbstractC5168a(C5157f c5157f, AbstractC5243a abstractC5243a, Paint.Cap cap, Paint.Join join, float f2, C5215d c5215d, C5213b c5213b, List<C5213b> list, C5213b c5213b2) {
        Paint paint = new Paint(1);
        this.f12493i = paint;
        this.f12489e = c5157f;
        this.f12490f = abstractC5243a;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(cap);
        paint.setStrokeJoin(join);
        paint.setStrokeMiter(f2);
        this.f12495k = c5215d.mo9617a();
        this.f12494j = c5213b.mo9617a();
        if (c5213b2 == null) {
            this.f12497m = null;
        } else {
            this.f12497m = c5213b2.mo9617a();
        }
        this.f12496l = new ArrayList(list.size());
        this.f12492h = new float[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f12496l.add(list.get(i2).mo9617a());
        }
        abstractC5243a.m9723i(this.f12495k);
        abstractC5243a.m9723i(this.f12494j);
        for (int i3 = 0; i3 < this.f12496l.size(); i3++) {
            abstractC5243a.m9723i(this.f12496l.get(i3));
        }
        AbstractC5186a<?, Float> abstractC5186a = this.f12497m;
        if (abstractC5186a != null) {
            abstractC5243a.m9723i(abstractC5186a);
        }
        this.f12495k.m9548a(this);
        this.f12494j.m9548a(this);
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.f12496l.get(i4).m9548a(this);
        }
        AbstractC5186a<?, Float> abstractC5186a2 = this.f12497m;
        if (abstractC5186a2 != null) {
            abstractC5186a2.m9548a(this);
        }
    }

    /* renamed from: e */
    private void m9510e(Matrix matrix) {
        C5154c.m9391a("StrokeContent#applyDashPattern");
        if (this.f12496l.isEmpty()) {
            C5154c.m9393c("StrokeContent#applyDashPattern");
            return;
        }
        float m9888f = C5295f.m9888f(matrix);
        for (int i2 = 0; i2 < this.f12496l.size(); i2++) {
            this.f12492h[i2] = this.f12496l.get(i2).mo9552h().floatValue();
            if (i2 % 2 == 0) {
                float[] fArr = this.f12492h;
                if (fArr[i2] < 1.0f) {
                    fArr[i2] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f12492h;
                if (fArr2[i2] < 0.1f) {
                    fArr2[i2] = 0.1f;
                }
            }
            float[] fArr3 = this.f12492h;
            fArr3[i2] = fArr3[i2] * m9888f;
        }
        AbstractC5186a<?, Float> abstractC5186a = this.f12497m;
        this.f12493i.setPathEffect(new DashPathEffect(this.f12492h, abstractC5186a == null ? 0.0f : abstractC5186a.mo9552h().floatValue()));
        C5154c.m9393c("StrokeContent#applyDashPattern");
    }

    /* renamed from: i */
    private void m9511i(Canvas canvas, b bVar, Matrix matrix) {
        C5154c.m9391a("StrokeContent#applyTrimPath");
        if (bVar.f12500b == null) {
            C5154c.m9393c("StrokeContent#applyTrimPath");
            return;
        }
        this.f12486b.reset();
        for (int size = bVar.f12499a.size() - 1; size >= 0; size--) {
            this.f12486b.addPath(((InterfaceC5179l) bVar.f12499a.get(size)).mo9522g(), matrix);
        }
        this.f12485a.setPath(this.f12486b, false);
        float length = this.f12485a.getLength();
        while (this.f12485a.nextContour()) {
            length += this.f12485a.getLength();
        }
        float floatValue = (bVar.f12500b.m9542h().mo9552h().floatValue() * length) / 360.0f;
        float floatValue2 = ((bVar.f12500b.m9543i().mo9552h().floatValue() * length) / 100.0f) + floatValue;
        float floatValue3 = ((bVar.f12500b.m9541e().mo9552h().floatValue() * length) / 100.0f) + floatValue;
        float f2 = 0.0f;
        for (int size2 = bVar.f12499a.size() - 1; size2 >= 0; size2--) {
            this.f12487c.set(((InterfaceC5179l) bVar.f12499a.get(size2)).mo9522g());
            this.f12487c.transform(matrix);
            this.f12485a.setPath(this.f12487c, false);
            float length2 = this.f12485a.getLength();
            if (floatValue3 > length) {
                float f3 = floatValue3 - length;
                if (f3 < f2 + length2 && f2 < f3) {
                    C5295f.m9883a(this.f12487c, floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f, Math.min(f3 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.f12487c, this.f12493i);
                    f2 += length2;
                }
            }
            float f4 = f2 + length2;
            if (f4 >= floatValue2 && f2 <= floatValue3) {
                if (f4 > floatValue3 || floatValue2 >= f2) {
                    C5295f.m9883a(this.f12487c, floatValue2 < f2 ? 0.0f : (floatValue2 - f2) / length2, floatValue3 <= f4 ? (floatValue3 - f2) / length2 : 1.0f, 0.0f);
                    canvas.drawPath(this.f12487c, this.f12493i);
                } else {
                    canvas.drawPath(this.f12487c, this.f12493i);
                }
            }
            f2 += length2;
        }
        C5154c.m9393c("StrokeContent#applyTrimPath");
    }

    @Override // com.airbnb.lottie.p108q.p110b.AbstractC5186a.a
    /* renamed from: a */
    public void mo9512a() {
        this.f12489e.invalidateSelf();
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5169b
    /* renamed from: b */
    public void mo9513b(List<InterfaceC5169b> list, List<InterfaceC5169b> list2) {
        C5185r c5185r = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            InterfaceC5169b interfaceC5169b = list.get(size);
            if (interfaceC5169b instanceof C5185r) {
                C5185r c5185r2 = (C5185r) interfaceC5169b;
                if (c5185r2.m9544j() == C5242q.a.Individually) {
                    c5185r = c5185r2;
                }
            }
        }
        if (c5185r != null) {
            c5185r.m9540c(this);
        }
        b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            InterfaceC5169b interfaceC5169b2 = list2.get(size2);
            if (interfaceC5169b2 instanceof C5185r) {
                C5185r c5185r3 = (C5185r) interfaceC5169b2;
                if (c5185r3.m9544j() == C5242q.a.Individually) {
                    if (bVar != null) {
                        this.f12491g.add(bVar);
                    }
                    bVar = new b(c5185r3);
                    c5185r3.m9540c(this);
                }
            }
            if (interfaceC5169b2 instanceof InterfaceC5179l) {
                if (bVar == null) {
                    bVar = new b(c5185r);
                }
                bVar.f12499a.add((InterfaceC5179l) interfaceC5169b2);
            }
        }
        if (bVar != null) {
            this.f12491g.add(bVar);
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
        C5154c.m9391a("StrokeContent#getBounds");
        this.f12486b.reset();
        for (int i2 = 0; i2 < this.f12491g.size(); i2++) {
            b bVar = this.f12491g.get(i2);
            for (int i3 = 0; i3 < bVar.f12499a.size(); i3++) {
                this.f12486b.addPath(((InterfaceC5179l) bVar.f12499a.get(i3)).mo9522g(), matrix);
            }
        }
        this.f12486b.computeBounds(this.f12488d, false);
        float floatValue = this.f12494j.mo9552h().floatValue();
        RectF rectF2 = this.f12488d;
        float f2 = floatValue / 2.0f;
        rectF2.set(rectF2.left - f2, rectF2.top - f2, rectF2.right + f2, rectF2.bottom + f2);
        rectF.set(this.f12488d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        C5154c.m9393c("StrokeContent#getBounds");
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5171d
    /* renamed from: f */
    public void mo9516f(Canvas canvas, Matrix matrix, int i2) {
        C5154c.m9391a("StrokeContent#draw");
        this.f12493i.setAlpha(C5294e.m9873c((int) ((((i2 / 255.0f) * this.f12495k.mo9552h().intValue()) / 100.0f) * 255.0f), 0, 255));
        this.f12493i.setStrokeWidth(this.f12494j.mo9552h().floatValue() * C5295f.m9888f(matrix));
        if (this.f12493i.getStrokeWidth() <= 0.0f) {
            C5154c.m9393c("StrokeContent#draw");
            return;
        }
        m9510e(matrix);
        AbstractC5186a<ColorFilter, ColorFilter> abstractC5186a = this.f12498n;
        if (abstractC5186a != null) {
            this.f12493i.setColorFilter(abstractC5186a.mo9552h());
        }
        for (int i3 = 0; i3 < this.f12491g.size(); i3++) {
            b bVar = this.f12491g.get(i3);
            if (bVar.f12500b != null) {
                m9511i(canvas, bVar, matrix);
            } else {
                C5154c.m9391a("StrokeContent#buildPath");
                this.f12486b.reset();
                for (int size = bVar.f12499a.size() - 1; size >= 0; size--) {
                    this.f12486b.addPath(((InterfaceC5179l) bVar.f12499a.get(size)).mo9522g(), matrix);
                }
                C5154c.m9393c("StrokeContent#buildPath");
                C5154c.m9391a("StrokeContent#drawPath");
                canvas.drawPath(this.f12486b, this.f12493i);
                C5154c.m9393c("StrokeContent#drawPath");
            }
        }
        C5154c.m9393c("StrokeContent#draw");
    }

    @Override // com.airbnb.lottie.p112s.InterfaceC5209f
    /* renamed from: h */
    public <T> void mo9517h(T t, C5298c<T> c5298c) {
        if (t == InterfaceC5161j.f12398d) {
            this.f12495k.m9557m(c5298c);
            return;
        }
        if (t == InterfaceC5161j.f12405k) {
            this.f12494j.m9557m(c5298c);
            return;
        }
        if (t == InterfaceC5161j.f12418x) {
            if (c5298c == null) {
                this.f12498n = null;
                return;
            }
            C5201p c5201p = new C5201p(c5298c);
            this.f12498n = c5201p;
            c5201p.m9548a(this);
            this.f12490f.m9723i(this.f12498n);
        }
    }
}
