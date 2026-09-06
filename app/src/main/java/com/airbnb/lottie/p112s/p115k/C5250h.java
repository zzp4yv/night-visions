package com.airbnb.lottie.p112s.p115k;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.airbnb.lottie.C5155d;
import com.airbnb.lottie.C5157f;
import com.airbnb.lottie.InterfaceC5161j;
import com.airbnb.lottie.p108q.p109a.C5170c;
import com.airbnb.lottie.p108q.p110b.AbstractC5186a;
import com.airbnb.lottie.p108q.p110b.C5199n;
import com.airbnb.lottie.p112s.C5205b;
import com.airbnb.lottie.p112s.C5206c;
import com.airbnb.lottie.p112s.C5207d;
import com.airbnb.lottie.p112s.p113i.C5212a;
import com.airbnb.lottie.p112s.p113i.C5213b;
import com.airbnb.lottie.p112s.p113i.C5222k;
import com.airbnb.lottie.p112s.p114j.C5239n;
import com.airbnb.lottie.p118v.C5295f;
import com.airbnb.lottie.p119w.C5298c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: TextLayer.java */
/* renamed from: com.airbnb.lottie.s.k.h */
/* loaded from: classes.dex */
public class C5250h extends AbstractC5243a {

    /* renamed from: A */
    private final Paint f12875A;

    /* renamed from: B */
    private final Map<C5207d, List<C5170c>> f12876B;

    /* renamed from: C */
    private final C5199n f12877C;

    /* renamed from: D */
    private final C5157f f12878D;

    /* renamed from: E */
    private final C5155d f12879E;

    /* renamed from: F */
    private AbstractC5186a<Integer, Integer> f12880F;

    /* renamed from: G */
    private AbstractC5186a<Integer, Integer> f12881G;

    /* renamed from: H */
    private AbstractC5186a<Float, Float> f12882H;

    /* renamed from: I */
    private AbstractC5186a<Float, Float> f12883I;

    /* renamed from: w */
    private final char[] f12884w;

    /* renamed from: x */
    private final RectF f12885x;

    /* renamed from: y */
    private final Matrix f12886y;

    /* renamed from: z */
    private final Paint f12887z;

    /* compiled from: TextLayer.java */
    /* renamed from: com.airbnb.lottie.s.k.h$a */
    class a extends Paint {
        a(int i2) {
            super(i2);
            setStyle(Paint.Style.FILL);
        }
    }

    /* compiled from: TextLayer.java */
    /* renamed from: com.airbnb.lottie.s.k.h$b */
    class b extends Paint {
        b(int i2) {
            super(i2);
            setStyle(Paint.Style.STROKE);
        }
    }

    C5250h(C5157f c5157f, C5246d c5246d) {
        super(c5157f, c5246d);
        C5213b c5213b;
        C5213b c5213b2;
        C5212a c5212a;
        C5212a c5212a2;
        this.f12884w = new char[1];
        this.f12885x = new RectF();
        this.f12886y = new Matrix();
        this.f12887z = new a(1);
        this.f12875A = new b(1);
        this.f12876B = new HashMap();
        this.f12878D = c5157f;
        this.f12879E = c5246d.m9732a();
        C5199n mo9617a = c5246d.m9748q().mo9617a();
        this.f12877C = mo9617a;
        mo9617a.m9548a(this);
        m9723i(mo9617a);
        C5222k m9749r = c5246d.m9749r();
        if (m9749r != null && (c5212a2 = m9749r.f12681a) != null) {
            AbstractC5186a<Integer, Integer> mo9617a2 = c5212a2.mo9617a();
            this.f12880F = mo9617a2;
            mo9617a2.m9548a(this);
            m9723i(this.f12880F);
        }
        if (m9749r != null && (c5212a = m9749r.f12682b) != null) {
            AbstractC5186a<Integer, Integer> mo9617a3 = c5212a.mo9617a();
            this.f12881G = mo9617a3;
            mo9617a3.m9548a(this);
            m9723i(this.f12881G);
        }
        if (m9749r != null && (c5213b2 = m9749r.f12683c) != null) {
            AbstractC5186a<Float, Float> mo9617a4 = c5213b2.mo9617a();
            this.f12882H = mo9617a4;
            mo9617a4.m9548a(this);
            m9723i(this.f12882H);
        }
        if (m9749r == null || (c5213b = m9749r.f12684d) == null) {
            return;
        }
        AbstractC5186a<Float, Float> mo9617a5 = c5213b.mo9617a();
        this.f12883I = mo9617a5;
        mo9617a5.m9548a(this);
        m9723i(this.f12883I);
    }

    /* renamed from: D */
    private void m9754D(char[] cArr, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(cArr, 0, 1, 0.0f, 0.0f, paint);
    }

    /* renamed from: E */
    private void m9755E(C5207d c5207d, Matrix matrix, float f2, C5205b c5205b, Canvas canvas) {
        List<C5170c> m9760J = m9760J(c5207d);
        for (int i2 = 0; i2 < m9760J.size(); i2++) {
            Path mo9522g = m9760J.get(i2).mo9522g();
            mo9522g.computeBounds(this.f12885x, false);
            this.f12886y.set(matrix);
            this.f12886y.preTranslate(0.0f, ((float) (-c5205b.f12657g)) * C5295f.m9887e());
            this.f12886y.preScale(f2, f2);
            mo9522g.transform(this.f12886y);
            if (c5205b.f12661k) {
                m9757G(mo9522g, this.f12887z, canvas);
                m9757G(mo9522g, this.f12875A, canvas);
            } else {
                m9757G(mo9522g, this.f12875A, canvas);
                m9757G(mo9522g, this.f12887z, canvas);
            }
        }
    }

    /* renamed from: F */
    private void m9756F(char c2, C5205b c5205b, Canvas canvas) {
        char[] cArr = this.f12884w;
        cArr[0] = c2;
        if (c5205b.f12661k) {
            m9754D(cArr, this.f12887z, canvas);
            m9754D(this.f12884w, this.f12875A, canvas);
        } else {
            m9754D(cArr, this.f12875A, canvas);
            m9754D(this.f12884w, this.f12887z, canvas);
        }
    }

    /* renamed from: G */
    private void m9757G(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* renamed from: H */
    private void m9758H(C5205b c5205b, Matrix matrix, C5206c c5206c, Canvas canvas) {
        float f2 = ((float) c5205b.f12653c) / 100.0f;
        float m9888f = C5295f.m9888f(matrix);
        String str = c5205b.f12651a;
        for (int i2 = 0; i2 < str.length(); i2++) {
            C5207d m5482g = this.f12879E.m9397c().m5482g(C5207d.m9600c(str.charAt(i2), c5206c.m9597a(), c5206c.m9599c()));
            if (m5482g != null) {
                m9755E(m5482g, matrix, f2, c5205b, canvas);
                float m9602b = ((float) m5482g.m9602b()) * f2 * C5295f.m9887e() * m9888f;
                float f3 = c5205b.f12655e / 10.0f;
                AbstractC5186a<Float, Float> abstractC5186a = this.f12883I;
                if (abstractC5186a != null) {
                    f3 += abstractC5186a.mo9552h().floatValue();
                }
                canvas.translate(m9602b + (f3 * m9888f), 0.0f);
            }
        }
    }

    /* renamed from: I */
    private void m9759I(C5205b c5205b, C5206c c5206c, Matrix matrix, Canvas canvas) {
        float m9888f = C5295f.m9888f(matrix);
        Typeface m9440A = this.f12878D.m9440A(c5206c.m9597a(), c5206c.m9599c());
        if (m9440A == null) {
            return;
        }
        String str = c5205b.f12651a;
        if (this.f12878D.m9480z() != null) {
            throw null;
        }
        this.f12887z.setTypeface(m9440A);
        Paint paint = this.f12887z;
        double d2 = c5205b.f12653c;
        double m9887e = C5295f.m9887e();
        Double.isNaN(m9887e);
        paint.setTextSize((float) (d2 * m9887e));
        this.f12875A.setTypeface(this.f12887z.getTypeface());
        this.f12875A.setTextSize(this.f12887z.getTextSize());
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            m9756F(charAt, c5205b, canvas);
            char[] cArr = this.f12884w;
            cArr[0] = charAt;
            float measureText = this.f12887z.measureText(cArr, 0, 1);
            float f2 = c5205b.f12655e / 10.0f;
            AbstractC5186a<Float, Float> abstractC5186a = this.f12883I;
            if (abstractC5186a != null) {
                f2 += abstractC5186a.mo9552h().floatValue();
            }
            canvas.translate(measureText + (f2 * m9888f), 0.0f);
        }
    }

    /* renamed from: J */
    private List<C5170c> m9760J(C5207d c5207d) {
        if (this.f12876B.containsKey(c5207d)) {
            return this.f12876B.get(c5207d);
        }
        List<C5239n> m9601a = c5207d.m9601a();
        int size = m9601a.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new C5170c(this.f12878D, this, m9601a.get(i2)));
        }
        this.f12876B.put(c5207d, arrayList);
        return arrayList;
    }

    @Override // com.airbnb.lottie.p112s.p115k.AbstractC5243a, com.airbnb.lottie.p112s.InterfaceC5209f
    /* renamed from: h */
    public <T> void mo9517h(T t, C5298c<T> c5298c) {
        AbstractC5186a<Float, Float> abstractC5186a;
        AbstractC5186a<Float, Float> abstractC5186a2;
        AbstractC5186a<Integer, Integer> abstractC5186a3;
        AbstractC5186a<Integer, Integer> abstractC5186a4;
        super.mo9517h(t, c5298c);
        if (t == InterfaceC5161j.f12395a && (abstractC5186a4 = this.f12880F) != null) {
            abstractC5186a4.m9557m(c5298c);
            return;
        }
        if (t == InterfaceC5161j.f12396b && (abstractC5186a3 = this.f12881G) != null) {
            abstractC5186a3.m9557m(c5298c);
            return;
        }
        if (t == InterfaceC5161j.f12405k && (abstractC5186a2 = this.f12882H) != null) {
            abstractC5186a2.m9557m(c5298c);
        } else {
            if (t != InterfaceC5161j.f12406l || (abstractC5186a = this.f12883I) == null) {
                return;
            }
            abstractC5186a.m9557m(c5298c);
        }
    }

    @Override // com.airbnb.lottie.p112s.p115k.AbstractC5243a
    /* renamed from: n */
    void mo9724n(Canvas canvas, Matrix matrix, int i2) {
        canvas.save();
        if (!this.f12878D.m9461W()) {
            canvas.setMatrix(matrix);
        }
        C5205b mo9552h = this.f12877C.mo9552h();
        C5206c c5206c = this.f12879E.m9401g().get(mo9552h.f12652b);
        if (c5206c == null) {
            canvas.restore();
            return;
        }
        AbstractC5186a<Integer, Integer> abstractC5186a = this.f12880F;
        if (abstractC5186a != null) {
            this.f12887z.setColor(abstractC5186a.mo9552h().intValue());
        } else {
            this.f12887z.setColor(mo9552h.f12658h);
        }
        AbstractC5186a<Integer, Integer> abstractC5186a2 = this.f12881G;
        if (abstractC5186a2 != null) {
            this.f12875A.setColor(abstractC5186a2.mo9552h().intValue());
        } else {
            this.f12875A.setColor(mo9552h.f12659i);
        }
        int intValue = (this.f12819u.m9579g().mo9552h().intValue() * 255) / 100;
        this.f12887z.setAlpha(intValue);
        this.f12875A.setAlpha(intValue);
        AbstractC5186a<Float, Float> abstractC5186a3 = this.f12882H;
        if (abstractC5186a3 != null) {
            this.f12875A.setStrokeWidth(abstractC5186a3.mo9552h().floatValue());
        } else {
            float m9888f = C5295f.m9888f(matrix);
            Paint paint = this.f12875A;
            double d2 = mo9552h.f12660j;
            double m9887e = C5295f.m9887e();
            Double.isNaN(m9887e);
            double d3 = d2 * m9887e;
            double d4 = m9888f;
            Double.isNaN(d4);
            paint.setStrokeWidth((float) (d3 * d4));
        }
        if (this.f12878D.m9461W()) {
            m9758H(mo9552h, matrix, c5206c, canvas);
        } else {
            m9759I(mo9552h, c5206c, matrix, canvas);
        }
        canvas.restore();
    }
}
