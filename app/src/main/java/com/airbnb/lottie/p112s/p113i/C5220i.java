package com.airbnb.lottie.p112s.p113i;

import android.graphics.PointF;
import com.airbnb.lottie.p108q.p110b.AbstractC5186a;
import com.airbnb.lottie.p108q.p110b.C5198m;

/* compiled from: AnimatableSplitDimensionPathValue.java */
/* renamed from: com.airbnb.lottie.s.i.i */
/* loaded from: classes.dex */
public class C5220i implements InterfaceC5224m<PointF, PointF> {

    /* renamed from: a */
    private final C5213b f12679a;

    /* renamed from: b */
    private final C5213b f12680b;

    public C5220i(C5213b c5213b, C5213b c5213b2) {
        this.f12679a = c5213b;
        this.f12680b = c5213b2;
    }

    @Override // com.airbnb.lottie.p112s.p113i.InterfaceC5224m
    /* renamed from: a */
    public AbstractC5186a<PointF, PointF> mo9617a() {
        return new C5198m(this.f12679a.mo9617a(), this.f12680b.mo9617a());
    }
}
