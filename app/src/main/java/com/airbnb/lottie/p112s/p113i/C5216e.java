package com.airbnb.lottie.p112s.p113i;

import android.graphics.PointF;
import com.airbnb.lottie.p108q.p110b.AbstractC5186a;
import com.airbnb.lottie.p108q.p110b.C5194i;
import com.airbnb.lottie.p108q.p110b.C5195j;
import com.airbnb.lottie.p119w.C5296a;
import java.util.Collections;
import java.util.List;

/* compiled from: AnimatablePathValue.java */
/* renamed from: com.airbnb.lottie.s.i.e */
/* loaded from: classes.dex */
public class C5216e implements InterfaceC5224m<PointF, PointF> {

    /* renamed from: a */
    private final List<C5296a<PointF>> f12678a;

    public C5216e() {
        this.f12678a = Collections.singletonList(new C5296a(new PointF(0.0f, 0.0f)));
    }

    @Override // com.airbnb.lottie.p112s.p113i.InterfaceC5224m
    /* renamed from: a */
    public AbstractC5186a<PointF, PointF> mo9617a() {
        return this.f12678a.get(0).m9894d() ? new C5195j(this.f12678a) : new C5194i(this.f12678a);
    }

    public C5216e(List<C5296a<PointF>> list) {
        this.f12678a = list;
    }
}
