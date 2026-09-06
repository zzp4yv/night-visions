package com.airbnb.lottie.p108q.p110b;

import android.graphics.PointF;
import com.airbnb.lottie.p119w.C5296a;
import java.util.Collections;

/* compiled from: SplitDimensionPathKeyframeAnimation.java */
/* renamed from: com.airbnb.lottie.q.b.m */
/* loaded from: classes.dex */
public class C5198m extends AbstractC5186a<PointF, PointF> {

    /* renamed from: g */
    private final PointF f12625g;

    /* renamed from: h */
    private final AbstractC5186a<Float, Float> f12626h;

    /* renamed from: i */
    private final AbstractC5186a<Float, Float> f12627i;

    public C5198m(AbstractC5186a<Float, Float> abstractC5186a, AbstractC5186a<Float, Float> abstractC5186a2) {
        super(Collections.emptyList());
        this.f12625g = new PointF();
        this.f12626h = abstractC5186a;
        this.f12627i = abstractC5186a2;
        mo9556l(m9551f());
    }

    @Override // com.airbnb.lottie.p108q.p110b.AbstractC5186a
    /* renamed from: l */
    public void mo9556l(float f2) {
        this.f12626h.mo9556l(f2);
        this.f12627i.mo9556l(f2);
        this.f12625g.set(this.f12626h.mo9552h().floatValue(), this.f12627i.mo9552h().floatValue());
        for (int i2 = 0; i2 < this.f12607a.size(); i2++) {
            this.f12607a.get(i2).mo9512a();
        }
    }

    @Override // com.airbnb.lottie.p108q.p110b.AbstractC5186a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public PointF mo9552h() {
        return mo9553i(null, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.p108q.p110b.AbstractC5186a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public PointF mo9553i(C5296a<PointF> c5296a, float f2) {
        return this.f12625g;
    }
}
