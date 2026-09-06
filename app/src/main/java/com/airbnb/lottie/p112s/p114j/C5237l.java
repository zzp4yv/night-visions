package com.airbnb.lottie.p112s.p114j;

import android.graphics.PointF;
import com.airbnb.lottie.C5154c;
import com.airbnb.lottie.p112s.C5204a;
import com.airbnb.lottie.p118v.C5294e;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShapeData.java */
/* renamed from: com.airbnb.lottie.s.j.l */
/* loaded from: classes.dex */
public class C5237l {

    /* renamed from: a */
    private final List<C5204a> f12759a;

    /* renamed from: b */
    private PointF f12760b;

    /* renamed from: c */
    private boolean f12761c;

    public C5237l(PointF pointF, boolean z, List<C5204a> list) {
        ArrayList arrayList = new ArrayList();
        this.f12759a = arrayList;
        this.f12760b = pointF;
        this.f12761c = z;
        arrayList.addAll(list);
    }

    /* renamed from: e */
    private void m9679e(float f2, float f3) {
        if (this.f12760b == null) {
            this.f12760b = new PointF();
        }
        this.f12760b.set(f2, f3);
    }

    /* renamed from: a */
    public List<C5204a> m9680a() {
        return this.f12759a;
    }

    /* renamed from: b */
    public PointF m9681b() {
        return this.f12760b;
    }

    /* renamed from: c */
    public void m9682c(C5237l c5237l, C5237l c5237l2, float f2) {
        if (this.f12760b == null) {
            this.f12760b = new PointF();
        }
        this.f12761c = c5237l.m9683d() || c5237l2.m9683d();
        if (c5237l.m9680a().size() != c5237l2.m9680a().size()) {
            C5154c.m9394d("Curves must have the same number of control points. Shape 1: " + c5237l.m9680a().size() + "\tShape 2: " + c5237l2.m9680a().size());
        }
        if (this.f12759a.isEmpty()) {
            int min = Math.min(c5237l.m9680a().size(), c5237l2.m9680a().size());
            for (int i2 = 0; i2 < min; i2++) {
                this.f12759a.add(new C5204a());
            }
        }
        PointF m9681b = c5237l.m9681b();
        PointF m9681b2 = c5237l2.m9681b();
        m9679e(C5294e.m9880j(m9681b.x, m9681b2.x, f2), C5294e.m9880j(m9681b.y, m9681b2.y, f2));
        for (int size = this.f12759a.size() - 1; size >= 0; size--) {
            C5204a c5204a = c5237l.m9680a().get(size);
            C5204a c5204a2 = c5237l2.m9680a().get(size);
            PointF m9591a = c5204a.m9591a();
            PointF m9592b = c5204a.m9592b();
            PointF m9593c = c5204a.m9593c();
            PointF m9591a2 = c5204a2.m9591a();
            PointF m9592b2 = c5204a2.m9592b();
            PointF m9593c2 = c5204a2.m9593c();
            this.f12759a.get(size).m9594d(C5294e.m9880j(m9591a.x, m9591a2.x, f2), C5294e.m9880j(m9591a.y, m9591a2.y, f2));
            this.f12759a.get(size).m9595e(C5294e.m9880j(m9592b.x, m9592b2.x, f2), C5294e.m9880j(m9592b.y, m9592b2.y, f2));
            this.f12759a.get(size).m9596f(C5294e.m9880j(m9593c.x, m9593c2.x, f2), C5294e.m9880j(m9593c.y, m9593c2.y, f2));
        }
    }

    /* renamed from: d */
    public boolean m9683d() {
        return this.f12761c;
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f12759a.size() + "closed=" + this.f12761c + '}';
    }

    public C5237l() {
        this.f12759a = new ArrayList();
    }
}
