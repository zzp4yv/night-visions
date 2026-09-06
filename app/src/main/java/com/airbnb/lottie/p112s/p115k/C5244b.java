package com.airbnb.lottie.p112s.p115k;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.C5154c;
import com.airbnb.lottie.C5155d;
import com.airbnb.lottie.C5157f;
import com.airbnb.lottie.InterfaceC5161j;
import com.airbnb.lottie.p108q.p110b.AbstractC5186a;
import com.airbnb.lottie.p108q.p110b.C5201p;
import com.airbnb.lottie.p112s.C5208e;
import com.airbnb.lottie.p112s.p113i.C5213b;
import com.airbnb.lottie.p112s.p115k.C5246d;
import com.airbnb.lottie.p119w.C5298c;
import java.util.ArrayList;
import java.util.List;
import p024c.p041e.C0870d;

/* compiled from: CompositionLayer.java */
/* renamed from: com.airbnb.lottie.s.k.b */
/* loaded from: classes.dex */
public class C5244b extends AbstractC5243a {

    /* renamed from: w */
    private AbstractC5186a<Float, Float> f12825w;

    /* renamed from: x */
    private final List<AbstractC5243a> f12826x;

    /* renamed from: y */
    private final RectF f12827y;

    /* renamed from: z */
    private final RectF f12828z;

    /* compiled from: CompositionLayer.java */
    /* renamed from: com.airbnb.lottie.s.k.b$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12829a;

        static {
            int[] iArr = new int[C5246d.b.values().length];
            f12829a = iArr;
            try {
                iArr[C5246d.b.Add.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12829a[C5246d.b.Invert.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C5244b(C5157f c5157f, C5246d c5246d, List<C5246d> list, C5155d c5155d) {
        super(c5157f, c5246d);
        int i2;
        AbstractC5243a abstractC5243a;
        this.f12826x = new ArrayList();
        this.f12827y = new RectF();
        this.f12828z = new RectF();
        C5213b m9750s = c5246d.m9750s();
        if (m9750s != null) {
            AbstractC5186a<Float, Float> mo9617a = m9750s.mo9617a();
            this.f12825w = mo9617a;
            m9723i(mo9617a);
            this.f12825w.m9548a(this);
        } else {
            this.f12825w = null;
        }
        C0870d c0870d = new C0870d(c5155d.m9404j().size());
        int size = list.size() - 1;
        AbstractC5243a abstractC5243a2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            C5246d c5246d2 = list.get(size);
            AbstractC5243a m9716o = AbstractC5243a.m9716o(c5246d2, c5157f, c5155d);
            if (m9716o != null) {
                c0870d.m5442k(m9716o.m9725p().m9733b(), m9716o);
                if (abstractC5243a2 != null) {
                    abstractC5243a2.m9729y(m9716o);
                    abstractC5243a2 = null;
                } else {
                    this.f12826x.add(0, m9716o);
                    int i3 = a.f12829a[c5246d2.m9737f().ordinal()];
                    if (i3 == 1 || i3 == 2) {
                        abstractC5243a2 = m9716o;
                    }
                }
            }
            size--;
        }
        for (i2 = 0; i2 < c0870d.m5445n(); i2++) {
            AbstractC5243a abstractC5243a3 = (AbstractC5243a) c0870d.m5438g(c0870d.m5441j(i2));
            if (abstractC5243a3 != null && (abstractC5243a = (AbstractC5243a) c0870d.m5438g(abstractC5243a3.m9725p().m9739h())) != null) {
                abstractC5243a3.m9730z(abstractC5243a);
            }
        }
    }

    @Override // com.airbnb.lottie.p112s.p115k.AbstractC5243a
    /* renamed from: A */
    public void mo9722A(float f2) {
        super.mo9722A(f2);
        if (this.f12825w != null) {
            f2 = ((long) (this.f12825w.mo9552h().floatValue() * 1000.0f)) / this.f12812n.m9468j().m9398d();
        }
        if (this.f12813o.m9751t() != 0.0f) {
            f2 /= this.f12813o.m9751t();
        }
        float m9747p = f2 - this.f12813o.m9747p();
        for (int size = this.f12826x.size() - 1; size >= 0; size--) {
            this.f12826x.get(size).mo9722A(m9747p);
        }
    }

    @Override // com.airbnb.lottie.p112s.p115k.AbstractC5243a, com.airbnb.lottie.p108q.p109a.InterfaceC5171d
    /* renamed from: d */
    public void mo9515d(RectF rectF, Matrix matrix) {
        super.mo9515d(rectF, matrix);
        this.f12827y.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f12826x.size() - 1; size >= 0; size--) {
            this.f12826x.get(size).mo9515d(this.f12827y, this.f12811m);
            if (rectF.isEmpty()) {
                rectF.set(this.f12827y);
            } else {
                rectF.set(Math.min(rectF.left, this.f12827y.left), Math.min(rectF.top, this.f12827y.top), Math.max(rectF.right, this.f12827y.right), Math.max(rectF.bottom, this.f12827y.bottom));
            }
        }
    }

    @Override // com.airbnb.lottie.p112s.p115k.AbstractC5243a, com.airbnb.lottie.p112s.InterfaceC5209f
    /* renamed from: h */
    public <T> void mo9517h(T t, C5298c<T> c5298c) {
        super.mo9517h(t, c5298c);
        if (t == InterfaceC5161j.f12417w) {
            if (c5298c == null) {
                this.f12825w = null;
                return;
            }
            C5201p c5201p = new C5201p(c5298c);
            this.f12825w = c5201p;
            m9723i(c5201p);
        }
    }

    @Override // com.airbnb.lottie.p112s.p115k.AbstractC5243a
    /* renamed from: n */
    void mo9724n(Canvas canvas, Matrix matrix, int i2) {
        C5154c.m9391a("CompositionLayer#draw");
        canvas.save();
        this.f12828z.set(0.0f, 0.0f, this.f12813o.m9741j(), this.f12813o.m9740i());
        matrix.mapRect(this.f12828z);
        for (int size = this.f12826x.size() - 1; size >= 0; size--) {
            if (!this.f12828z.isEmpty() ? canvas.clipRect(this.f12828z) : true) {
                this.f12826x.get(size).mo9516f(canvas, matrix, i2);
            }
        }
        canvas.restore();
        C5154c.m9393c("CompositionLayer#draw");
    }

    @Override // com.airbnb.lottie.p112s.p115k.AbstractC5243a
    /* renamed from: w */
    protected void mo9728w(C5208e c5208e, int i2, List<C5208e> list, C5208e c5208e2) {
        for (int i3 = 0; i3 < this.f12826x.size(); i3++) {
            this.f12826x.get(i3).mo9514c(c5208e, i2, list, c5208e2);
        }
    }
}
