package com.airbnb.lottie.p108q.p110b;

import com.airbnb.lottie.p119w.C5296a;
import com.airbnb.lottie.p119w.C5298c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BaseKeyframeAnimation.java */
/* renamed from: com.airbnb.lottie.q.b.a */
/* loaded from: classes.dex */
public abstract class AbstractC5186a<K, A> {

    /* renamed from: c */
    private final List<? extends C5296a<K>> f12609c;

    /* renamed from: e */
    protected C5298c<A> f12611e;

    /* renamed from: f */
    private C5296a<K> f12612f;

    /* renamed from: a */
    final List<a> f12607a = new ArrayList();

    /* renamed from: b */
    private boolean f12608b = false;

    /* renamed from: d */
    private float f12610d = 0.0f;

    /* compiled from: BaseKeyframeAnimation.java */
    /* renamed from: com.airbnb.lottie.q.b.a$a */
    public interface a {
        /* renamed from: a */
        void mo9512a();
    }

    AbstractC5186a(List<? extends C5296a<K>> list) {
        this.f12609c = list;
    }

    /* renamed from: b */
    private C5296a<K> m9545b() {
        C5296a<K> c5296a = this.f12612f;
        if (c5296a != null && c5296a.m9891a(this.f12610d)) {
            return this.f12612f;
        }
        C5296a<K> c5296a2 = this.f12609c.get(r0.size() - 1);
        if (this.f12610d < c5296a2.m9893c()) {
            for (int size = this.f12609c.size() - 1; size >= 0; size--) {
                c5296a2 = this.f12609c.get(size);
                if (c5296a2.m9891a(this.f12610d)) {
                    break;
                }
            }
        }
        this.f12612f = c5296a2;
        return c5296a2;
    }

    /* renamed from: d */
    private float m9546d() {
        C5296a<K> m9545b = m9545b();
        if (m9545b.m9894d()) {
            return 0.0f;
        }
        return m9545b.f12934d.getInterpolation(m9550e());
    }

    /* renamed from: g */
    private float m9547g() {
        if (this.f12609c.isEmpty()) {
            return 0.0f;
        }
        return this.f12609c.get(0).m9893c();
    }

    /* renamed from: a */
    public void m9548a(a aVar) {
        this.f12607a.add(aVar);
    }

    /* renamed from: c */
    float mo9549c() {
        if (this.f12609c.isEmpty()) {
            return 1.0f;
        }
        return this.f12609c.get(r0.size() - 1).m9892b();
    }

    /* renamed from: e */
    float m9550e() {
        if (this.f12608b) {
            return 0.0f;
        }
        C5296a<K> m9545b = m9545b();
        if (m9545b.m9894d()) {
            return 0.0f;
        }
        return (this.f12610d - m9545b.m9893c()) / (m9545b.m9892b() - m9545b.m9893c());
    }

    /* renamed from: f */
    public float m9551f() {
        return this.f12610d;
    }

    /* renamed from: h */
    public A mo9552h() {
        return mo9553i(m9545b(), m9546d());
    }

    /* renamed from: i */
    abstract A mo9553i(C5296a<K> c5296a, float f2);

    /* renamed from: j */
    public void mo9554j() {
        for (int i2 = 0; i2 < this.f12607a.size(); i2++) {
            this.f12607a.get(i2).mo9512a();
        }
    }

    /* renamed from: k */
    public void m9555k() {
        this.f12608b = true;
    }

    /* renamed from: l */
    public void mo9556l(float f2) {
        if (f2 < m9547g()) {
            f2 = m9547g();
        } else if (f2 > mo9549c()) {
            f2 = mo9549c();
        }
        if (f2 == this.f12610d) {
            return;
        }
        this.f12610d = f2;
        mo9554j();
    }

    /* renamed from: m */
    public void m9557m(C5298c<A> c5298c) {
        C5298c<A> c5298c2 = this.f12611e;
        if (c5298c2 != null) {
            c5298c2.m9898c(null);
        }
        this.f12611e = c5298c;
        if (c5298c != null) {
            c5298c.m9898c(this);
        }
    }
}
