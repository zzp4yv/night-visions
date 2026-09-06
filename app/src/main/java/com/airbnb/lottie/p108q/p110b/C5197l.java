package com.airbnb.lottie.p108q.p110b;

import android.graphics.Path;
import com.airbnb.lottie.p112s.p114j.C5237l;
import com.airbnb.lottie.p118v.C5294e;
import com.airbnb.lottie.p119w.C5296a;
import java.util.List;

/* compiled from: ShapeKeyframeAnimation.java */
/* renamed from: com.airbnb.lottie.q.b.l */
/* loaded from: classes.dex */
public class C5197l extends AbstractC5186a<C5237l, Path> {

    /* renamed from: g */
    private final C5237l f12623g;

    /* renamed from: h */
    private final Path f12624h;

    public C5197l(List<C5296a<C5237l>> list) {
        super(list);
        this.f12623g = new C5237l();
        this.f12624h = new Path();
    }

    @Override // com.airbnb.lottie.p108q.p110b.AbstractC5186a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Path mo9553i(C5296a<C5237l> c5296a, float f2) {
        this.f12623g.m9682c(c5296a.f12932b, c5296a.f12933c, f2);
        C5294e.m9878h(this.f12623g, this.f12624h);
        return this.f12624h;
    }
}
