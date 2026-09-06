package com.airbnb.lottie.p112s.p115k;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.C5157f;
import com.airbnb.lottie.p108q.p109a.C5170c;
import com.airbnb.lottie.p112s.C5208e;
import com.airbnb.lottie.p112s.p114j.C5239n;
import java.util.Collections;
import java.util.List;

/* compiled from: ShapeLayer.java */
/* renamed from: com.airbnb.lottie.s.k.f */
/* loaded from: classes.dex */
public class C5248f extends AbstractC5243a {

    /* renamed from: w */
    private final C5170c f12868w;

    C5248f(C5157f c5157f, C5246d c5246d) {
        super(c5157f, c5246d);
        C5170c c5170c = new C5170c(c5157f, this, new C5239n("__container", c5246d.m9743l()));
        this.f12868w = c5170c;
        c5170c.mo9513b(Collections.emptyList(), Collections.emptyList());
    }

    @Override // com.airbnb.lottie.p112s.p115k.AbstractC5243a, com.airbnb.lottie.p108q.p109a.InterfaceC5171d
    /* renamed from: d */
    public void mo9515d(RectF rectF, Matrix matrix) {
        super.mo9515d(rectF, matrix);
        this.f12868w.mo9515d(rectF, this.f12811m);
    }

    @Override // com.airbnb.lottie.p112s.p115k.AbstractC5243a
    /* renamed from: n */
    void mo9724n(Canvas canvas, Matrix matrix, int i2) {
        this.f12868w.mo9516f(canvas, matrix, i2);
    }

    @Override // com.airbnb.lottie.p112s.p115k.AbstractC5243a
    /* renamed from: w */
    protected void mo9728w(C5208e c5208e, int i2, List<C5208e> list, C5208e c5208e2) {
        this.f12868w.mo9514c(c5208e, i2, list, c5208e2);
    }
}
