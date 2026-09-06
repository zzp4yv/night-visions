package com.airbnb.lottie.p108q.p110b;

import com.airbnb.lottie.p118v.C5294e;
import com.airbnb.lottie.p119w.C5296a;
import com.airbnb.lottie.p119w.C5298c;
import com.airbnb.lottie.p119w.C5299d;
import java.util.List;

/* compiled from: ScaleKeyframeAnimation.java */
/* renamed from: com.airbnb.lottie.q.b.k */
/* loaded from: classes.dex */
public class C5196k extends AbstractC5191f<C5299d> {
    public C5196k(List<C5296a<C5299d>> list) {
        super(list);
    }

    @Override // com.airbnb.lottie.p108q.p110b.AbstractC5186a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C5299d mo9553i(C5296a<C5299d> c5296a, float f2) {
        C5299d c5299d;
        C5299d c5299d2;
        C5299d c5299d3 = c5296a.f12932b;
        if (c5299d3 == null || (c5299d = c5296a.f12933c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C5299d c5299d4 = c5299d3;
        C5299d c5299d5 = c5299d;
        C5298c<A> c5298c = this.f12611e;
        return (c5298c == 0 || (c5299d2 = (C5299d) c5298c.m9897b(c5296a.f12935e, c5296a.f12936f.floatValue(), c5299d4, c5299d5, f2, m9550e(), m9551f())) == null) ? new C5299d(C5294e.m9880j(c5299d4.m9899a(), c5299d5.m9899a(), f2), C5294e.m9880j(c5299d4.m9900b(), c5299d5.m9900b(), f2)) : c5299d2;
    }
}
