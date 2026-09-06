package com.airbnb.lottie.p108q.p110b;

import com.airbnb.lottie.p118v.C5294e;
import com.airbnb.lottie.p119w.C5296a;
import com.airbnb.lottie.p119w.C5298c;
import java.util.List;

/* compiled from: IntegerKeyframeAnimation.java */
/* renamed from: com.airbnb.lottie.q.b.e */
/* loaded from: classes.dex */
public class C5190e extends AbstractC5191f<Integer> {
    public C5190e(List<C5296a<Integer>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.p108q.p110b.AbstractC5186a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Integer mo9553i(C5296a<Integer> c5296a, float f2) {
        Integer num;
        if (c5296a.f12932b == null || c5296a.f12933c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C5298c<A> c5298c = this.f12611e;
        return (c5298c == 0 || (num = (Integer) c5298c.m9897b(c5296a.f12935e, c5296a.f12936f.floatValue(), c5296a.f12932b, c5296a.f12933c, f2, m9550e(), m9551f())) == null) ? Integer.valueOf(C5294e.m9881k(c5296a.f12932b.intValue(), c5296a.f12933c.intValue(), f2)) : num;
    }
}
