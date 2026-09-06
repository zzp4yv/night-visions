package com.airbnb.lottie.p112s.p115k;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C5157f;
import com.airbnb.lottie.InterfaceC5161j;
import com.airbnb.lottie.p108q.p110b.AbstractC5186a;
import com.airbnb.lottie.p108q.p110b.C5201p;
import com.airbnb.lottie.p119w.C5298c;

/* compiled from: SolidLayer.java */
/* renamed from: com.airbnb.lottie.s.k.g */
/* loaded from: classes.dex */
public class C5249g extends AbstractC5243a {

    /* renamed from: A */
    private final C5246d f12869A;

    /* renamed from: B */
    private AbstractC5186a<ColorFilter, ColorFilter> f12870B;

    /* renamed from: w */
    private final RectF f12871w;

    /* renamed from: x */
    private final Paint f12872x;

    /* renamed from: y */
    private final float[] f12873y;

    /* renamed from: z */
    private final Path f12874z;

    C5249g(C5157f c5157f, C5246d c5246d) {
        super(c5157f, c5246d);
        this.f12871w = new RectF();
        Paint paint = new Paint();
        this.f12872x = paint;
        this.f12873y = new float[8];
        this.f12874z = new Path();
        this.f12869A = c5246d;
        paint.setAlpha(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(c5246d.m9744m());
    }

    @Override // com.airbnb.lottie.p112s.p115k.AbstractC5243a, com.airbnb.lottie.p108q.p109a.InterfaceC5171d
    /* renamed from: d */
    public void mo9515d(RectF rectF, Matrix matrix) {
        super.mo9515d(rectF, matrix);
        this.f12871w.set(0.0f, 0.0f, this.f12869A.m9746o(), this.f12869A.m9745n());
        this.f12811m.mapRect(this.f12871w);
        rectF.set(this.f12871w);
    }

    @Override // com.airbnb.lottie.p112s.p115k.AbstractC5243a, com.airbnb.lottie.p112s.InterfaceC5209f
    /* renamed from: h */
    public <T> void mo9517h(T t, C5298c<T> c5298c) {
        super.mo9517h(t, c5298c);
        if (t == InterfaceC5161j.f12418x) {
            if (c5298c == null) {
                this.f12870B = null;
            } else {
                this.f12870B = new C5201p(c5298c);
            }
        }
    }

    @Override // com.airbnb.lottie.p112s.p115k.AbstractC5243a
    /* renamed from: n */
    public void mo9724n(Canvas canvas, Matrix matrix, int i2) {
        int alpha = Color.alpha(this.f12869A.m9744m());
        if (alpha == 0) {
            return;
        }
        int intValue = (int) ((i2 / 255.0f) * (((alpha / 255.0f) * this.f12819u.m9579g().mo9552h().intValue()) / 100.0f) * 255.0f);
        this.f12872x.setAlpha(intValue);
        AbstractC5186a<ColorFilter, ColorFilter> abstractC5186a = this.f12870B;
        if (abstractC5186a != null) {
            this.f12872x.setColorFilter(abstractC5186a.mo9552h());
        }
        if (intValue > 0) {
            float[] fArr = this.f12873y;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.f12869A.m9746o();
            float[] fArr2 = this.f12873y;
            fArr2[3] = 0.0f;
            fArr2[4] = this.f12869A.m9746o();
            this.f12873y[5] = this.f12869A.m9745n();
            float[] fArr3 = this.f12873y;
            fArr3[6] = 0.0f;
            fArr3[7] = this.f12869A.m9745n();
            matrix.mapPoints(this.f12873y);
            this.f12874z.reset();
            Path path = this.f12874z;
            float[] fArr4 = this.f12873y;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.f12874z;
            float[] fArr5 = this.f12873y;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.f12874z;
            float[] fArr6 = this.f12873y;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.f12874z;
            float[] fArr7 = this.f12873y;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.f12874z;
            float[] fArr8 = this.f12873y;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.f12874z.close();
            canvas.drawPath(this.f12874z, this.f12872x);
        }
    }
}
