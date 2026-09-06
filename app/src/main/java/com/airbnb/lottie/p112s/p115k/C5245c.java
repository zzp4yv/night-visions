package com.airbnb.lottie.p112s.p115k;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.C5157f;
import com.airbnb.lottie.InterfaceC5161j;
import com.airbnb.lottie.p108q.p110b.AbstractC5186a;
import com.airbnb.lottie.p108q.p110b.C5201p;
import com.airbnb.lottie.p118v.C5295f;
import com.airbnb.lottie.p119w.C5298c;

/* compiled from: ImageLayer.java */
/* renamed from: com.airbnb.lottie.s.k.c */
/* loaded from: classes.dex */
public class C5245c extends AbstractC5243a {

    /* renamed from: w */
    private final Paint f12830w;

    /* renamed from: x */
    private final Rect f12831x;

    /* renamed from: y */
    private final Rect f12832y;

    /* renamed from: z */
    private AbstractC5186a<ColorFilter, ColorFilter> f12833z;

    C5245c(C5157f c5157f, C5246d c5246d) {
        super(c5157f, c5246d);
        this.f12830w = new Paint(3);
        this.f12831x = new Rect();
        this.f12832y = new Rect();
    }

    /* renamed from: D */
    private Bitmap m9731D() {
        return this.f12812n.m9470n(this.f12813o.m9742k());
    }

    @Override // com.airbnb.lottie.p112s.p115k.AbstractC5243a, com.airbnb.lottie.p108q.p109a.InterfaceC5171d
    /* renamed from: d */
    public void mo9515d(RectF rectF, Matrix matrix) {
        super.mo9515d(rectF, matrix);
        if (m9731D() != null) {
            rectF.set(rectF.left, rectF.top, Math.min(rectF.right, r6.getWidth()), Math.min(rectF.bottom, r6.getHeight()));
            this.f12811m.mapRect(rectF);
        }
    }

    @Override // com.airbnb.lottie.p112s.p115k.AbstractC5243a, com.airbnb.lottie.p112s.InterfaceC5209f
    /* renamed from: h */
    public <T> void mo9517h(T t, C5298c<T> c5298c) {
        super.mo9517h(t, c5298c);
        if (t == InterfaceC5161j.f12418x) {
            if (c5298c == null) {
                this.f12833z = null;
            } else {
                this.f12833z = new C5201p(c5298c);
            }
        }
    }

    @Override // com.airbnb.lottie.p112s.p115k.AbstractC5243a
    /* renamed from: n */
    public void mo9724n(Canvas canvas, Matrix matrix, int i2) {
        Bitmap m9731D = m9731D();
        if (m9731D == null || m9731D.isRecycled()) {
            return;
        }
        float m9887e = C5295f.m9887e();
        this.f12830w.setAlpha(i2);
        AbstractC5186a<ColorFilter, ColorFilter> abstractC5186a = this.f12833z;
        if (abstractC5186a != null) {
            this.f12830w.setColorFilter(abstractC5186a.mo9552h());
        }
        canvas.save();
        canvas.concat(matrix);
        this.f12831x.set(0, 0, m9731D.getWidth(), m9731D.getHeight());
        this.f12832y.set(0, 0, (int) (m9731D.getWidth() * m9887e), (int) (m9731D.getHeight() * m9887e));
        canvas.drawBitmap(m9731D, this.f12831x, this.f12832y, this.f12830w);
        canvas.restore();
    }
}
