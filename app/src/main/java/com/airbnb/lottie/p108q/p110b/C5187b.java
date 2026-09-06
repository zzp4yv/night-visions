package com.airbnb.lottie.p108q.p110b;

import com.airbnb.lottie.p118v.C5291b;
import com.airbnb.lottie.p119w.C5296a;
import com.airbnb.lottie.p119w.C5298c;
import java.util.List;

/* compiled from: ColorKeyframeAnimation.java */
/* renamed from: com.airbnb.lottie.q.b.b */
/* loaded from: classes.dex */
public class C5187b extends AbstractC5191f<Integer> {
    public C5187b(List<C5296a<Integer>> list) {
        super(list);
    }

    @Override // com.airbnb.lottie.p108q.p110b.AbstractC5186a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Integer mo9553i(C5296a<Integer> c5296a, float f2) {
        Integer num;
        Integer num2 = c5296a.f12932b;
        if (num2 == null || c5296a.f12933c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = num2.intValue();
        int intValue2 = c5296a.f12933c.intValue();
        C5298c<A> c5298c = this.f12611e;
        return (c5298c == 0 || (num = (Integer) c5298c.m9897b(c5296a.f12935e, c5296a.f12936f.floatValue(), Integer.valueOf(intValue), Integer.valueOf(intValue2), f2, m9550e(), m9551f())) == null) ? Integer.valueOf(C5291b.m9848c(f2, intValue, intValue2)) : num;
    }
}
