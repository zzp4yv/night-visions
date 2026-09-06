package com.airbnb.lottie.p108q.p110b;

import android.graphics.PointF;
import com.airbnb.lottie.p119w.C5296a;
import com.airbnb.lottie.p119w.C5298c;
import java.util.List;

/* compiled from: PointKeyframeAnimation.java */
/* renamed from: com.airbnb.lottie.q.b.j */
/* loaded from: classes.dex */
public class C5195j extends AbstractC5191f<PointF> {

    /* renamed from: g */
    private final PointF f12622g;

    public C5195j(List<C5296a<PointF>> list) {
        super(list);
        this.f12622g = new PointF();
    }

    @Override // com.airbnb.lottie.p108q.p110b.AbstractC5186a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public PointF mo9553i(C5296a<PointF> c5296a, float f2) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = c5296a.f12932b;
        if (pointF3 == null || (pointF = c5296a.f12933c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF4 = pointF3;
        PointF pointF5 = pointF;
        C5298c<A> c5298c = this.f12611e;
        if (c5298c != 0 && (pointF2 = (PointF) c5298c.m9897b(c5296a.f12935e, c5296a.f12936f.floatValue(), pointF4, pointF5, f2, m9550e(), m9551f())) != null) {
            return pointF2;
        }
        PointF pointF6 = this.f12622g;
        float f3 = pointF4.x;
        float f4 = f3 + ((pointF5.x - f3) * f2);
        float f5 = pointF4.y;
        pointF6.set(f4, f5 + (f2 * (pointF5.y - f5)));
        return this.f12622g;
    }
}
