package com.airbnb.lottie.p108q.p109a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C5157f;
import com.airbnb.lottie.p108q.p110b.AbstractC5186a;
import com.airbnb.lottie.p108q.p110b.C5200o;
import com.airbnb.lottie.p112s.C5208e;
import com.airbnb.lottie.p112s.InterfaceC5209f;
import com.airbnb.lottie.p112s.p113i.C5223l;
import com.airbnb.lottie.p112s.p114j.C5239n;
import com.airbnb.lottie.p112s.p114j.InterfaceC5227b;
import com.airbnb.lottie.p112s.p115k.AbstractC5243a;
import com.airbnb.lottie.p119w.C5298c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ContentGroup.java */
/* renamed from: com.airbnb.lottie.q.a.c */
/* loaded from: classes.dex */
public class C5170c implements InterfaceC5171d, InterfaceC5179l, AbstractC5186a.a, InterfaceC5209f {

    /* renamed from: a */
    private final Matrix f12501a;

    /* renamed from: b */
    private final Path f12502b;

    /* renamed from: c */
    private final RectF f12503c;

    /* renamed from: d */
    private final String f12504d;

    /* renamed from: e */
    private final List<InterfaceC5169b> f12505e;

    /* renamed from: f */
    private final C5157f f12506f;

    /* renamed from: g */
    private List<InterfaceC5179l> f12507g;

    /* renamed from: h */
    private C5200o f12508h;

    public C5170c(C5157f c5157f, AbstractC5243a abstractC5243a, C5239n c5239n) {
        this(c5157f, abstractC5243a, c5239n.m9689c(), m9520e(c5157f, abstractC5243a, c5239n.m9688b()), m9521i(c5239n.m9688b()));
    }

    /* renamed from: e */
    private static List<InterfaceC5169b> m9520e(C5157f c5157f, AbstractC5243a abstractC5243a, List<InterfaceC5227b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            InterfaceC5169b mo9619a = list.get(i2).mo9619a(c5157f, abstractC5243a);
            if (mo9619a != null) {
                arrayList.add(mo9619a);
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    static C5223l m9521i(List<InterfaceC5227b> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            InterfaceC5227b interfaceC5227b = list.get(i2);
            if (interfaceC5227b instanceof C5223l) {
                return (C5223l) interfaceC5227b;
            }
        }
        return null;
    }

    @Override // com.airbnb.lottie.p108q.p110b.AbstractC5186a.a
    /* renamed from: a */
    public void mo9512a() {
        this.f12506f.invalidateSelf();
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5169b
    /* renamed from: b */
    public void mo9513b(List<InterfaceC5169b> list, List<InterfaceC5169b> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f12505e.size());
        arrayList.addAll(list);
        for (int size = this.f12505e.size() - 1; size >= 0; size--) {
            InterfaceC5169b interfaceC5169b = this.f12505e.get(size);
            interfaceC5169b.mo9513b(arrayList, this.f12505e.subList(0, size));
            arrayList.add(interfaceC5169b);
        }
    }

    @Override // com.airbnb.lottie.p112s.InterfaceC5209f
    /* renamed from: c */
    public void mo9514c(C5208e c5208e, int i2, List<C5208e> list, C5208e c5208e2) {
        if (c5208e.m9609g(getName(), i2)) {
            if (!"__container".equals(getName())) {
                c5208e2 = c5208e2.m9605a(getName());
                if (c5208e.m9606c(getName(), i2)) {
                    list.add(c5208e2.m9611i(this));
                }
            }
            if (c5208e.m9610h(getName(), i2)) {
                int m9608e = i2 + c5208e.m9608e(getName(), i2);
                for (int i3 = 0; i3 < this.f12505e.size(); i3++) {
                    InterfaceC5169b interfaceC5169b = this.f12505e.get(i3);
                    if (interfaceC5169b instanceof InterfaceC5209f) {
                        ((InterfaceC5209f) interfaceC5169b).mo9514c(c5208e, m9608e, list, c5208e2);
                    }
                }
            }
        }
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5171d
    /* renamed from: d */
    public void mo9515d(RectF rectF, Matrix matrix) {
        this.f12501a.set(matrix);
        C5200o c5200o = this.f12508h;
        if (c5200o != null) {
            this.f12501a.preConcat(c5200o.m9577e());
        }
        this.f12503c.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f12505e.size() - 1; size >= 0; size--) {
            InterfaceC5169b interfaceC5169b = this.f12505e.get(size);
            if (interfaceC5169b instanceof InterfaceC5171d) {
                ((InterfaceC5171d) interfaceC5169b).mo9515d(this.f12503c, this.f12501a);
                if (rectF.isEmpty()) {
                    rectF.set(this.f12503c);
                } else {
                    rectF.set(Math.min(rectF.left, this.f12503c.left), Math.min(rectF.top, this.f12503c.top), Math.max(rectF.right, this.f12503c.right), Math.max(rectF.bottom, this.f12503c.bottom));
                }
            }
        }
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5171d
    /* renamed from: f */
    public void mo9516f(Canvas canvas, Matrix matrix, int i2) {
        this.f12501a.set(matrix);
        C5200o c5200o = this.f12508h;
        if (c5200o != null) {
            this.f12501a.preConcat(c5200o.m9577e());
            i2 = (int) ((((this.f12508h.m9579g().mo9552h().intValue() / 100.0f) * i2) / 255.0f) * 255.0f);
        }
        for (int size = this.f12505e.size() - 1; size >= 0; size--) {
            InterfaceC5169b interfaceC5169b = this.f12505e.get(size);
            if (interfaceC5169b instanceof InterfaceC5171d) {
                ((InterfaceC5171d) interfaceC5169b).mo9516f(canvas, this.f12501a, i2);
            }
        }
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5179l
    /* renamed from: g */
    public Path mo9522g() {
        this.f12501a.reset();
        C5200o c5200o = this.f12508h;
        if (c5200o != null) {
            this.f12501a.set(c5200o.m9577e());
        }
        this.f12502b.reset();
        for (int size = this.f12505e.size() - 1; size >= 0; size--) {
            InterfaceC5169b interfaceC5169b = this.f12505e.get(size);
            if (interfaceC5169b instanceof InterfaceC5179l) {
                this.f12502b.addPath(((InterfaceC5179l) interfaceC5169b).mo9522g(), this.f12501a);
            }
        }
        return this.f12502b;
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5169b
    public String getName() {
        return this.f12504d;
    }

    @Override // com.airbnb.lottie.p112s.InterfaceC5209f
    /* renamed from: h */
    public <T> void mo9517h(T t, C5298c<T> c5298c) {
        C5200o c5200o = this.f12508h;
        if (c5200o != null) {
            c5200o.m9575c(t, c5298c);
        }
    }

    /* renamed from: j */
    List<InterfaceC5179l> m9523j() {
        if (this.f12507g == null) {
            this.f12507g = new ArrayList();
            for (int i2 = 0; i2 < this.f12505e.size(); i2++) {
                InterfaceC5169b interfaceC5169b = this.f12505e.get(i2);
                if (interfaceC5169b instanceof InterfaceC5179l) {
                    this.f12507g.add((InterfaceC5179l) interfaceC5169b);
                }
            }
        }
        return this.f12507g;
    }

    /* renamed from: k */
    Matrix m9524k() {
        C5200o c5200o = this.f12508h;
        if (c5200o != null) {
            return c5200o.m9577e();
        }
        this.f12501a.reset();
        return this.f12501a;
    }

    C5170c(C5157f c5157f, AbstractC5243a abstractC5243a, String str, List<InterfaceC5169b> list, C5223l c5223l) {
        this.f12501a = new Matrix();
        this.f12502b = new Path();
        this.f12503c = new RectF();
        this.f12504d = str;
        this.f12506f = c5157f;
        this.f12505e = list;
        if (c5223l != null) {
            C5200o m9620b = c5223l.m9620b();
            this.f12508h = m9620b;
            m9620b.m9573a(abstractC5243a);
            this.f12508h.m9574b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            InterfaceC5169b interfaceC5169b = list.get(size);
            if (interfaceC5169b instanceof InterfaceC5176i) {
                arrayList.add((InterfaceC5176i) interfaceC5169b);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((InterfaceC5176i) arrayList.get(size2)).mo9532e(list.listIterator(list.size()));
        }
    }
}
