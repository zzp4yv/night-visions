package com.airbnb.lottie.p108q.p110b;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.p119w.C5296a;
import com.airbnb.lottie.p119w.C5298c;
import java.util.List;

/* compiled from: PathKeyframeAnimation.java */
/* renamed from: com.airbnb.lottie.q.b.i */
/* loaded from: classes.dex */
public class C5194i extends AbstractC5191f<PointF> {

    /* renamed from: g */
    private final PointF f12618g;

    /* renamed from: h */
    private final float[] f12619h;

    /* renamed from: i */
    private C5193h f12620i;

    /* renamed from: j */
    private PathMeasure f12621j;

    public C5194i(List<? extends C5296a<PointF>> list) {
        super(list);
        this.f12618g = new PointF();
        this.f12619h = new float[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.p108q.p110b.AbstractC5186a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public PointF mo9553i(C5296a<PointF> c5296a, float f2) {
        PointF pointF;
        C5193h c5193h = (C5193h) c5296a;
        Path m9565e = c5193h.m9565e();
        if (m9565e == null) {
            return c5296a.f12932b;
        }
        C5298c<A> c5298c = this.f12611e;
        if (c5298c != 0 && (pointF = (PointF) c5298c.m9897b(c5193h.f12935e, c5193h.f12936f.floatValue(), c5193h.f12932b, c5193h.f12933c, m9550e(), f2, m9551f())) != null) {
            return pointF;
        }
        if (this.f12620i != c5193h) {
            this.f12621j = new PathMeasure(m9565e, false);
            this.f12620i = c5193h;
        }
        PathMeasure pathMeasure = this.f12621j;
        pathMeasure.getPosTan(f2 * pathMeasure.getLength(), this.f12619h, null);
        PointF pointF2 = this.f12618g;
        float[] fArr = this.f12619h;
        pointF2.set(fArr[0], fArr[1]);
        return this.f12618g;
    }
}
