package com.airbnb.lottie.p108q.p109a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C5157f;
import com.airbnb.lottie.InterfaceC5161j;
import com.airbnb.lottie.p108q.p110b.AbstractC5186a;
import com.airbnb.lottie.p108q.p110b.C5200o;
import com.airbnb.lottie.p112s.C5208e;
import com.airbnb.lottie.p112s.p114j.C5236k;
import com.airbnb.lottie.p112s.p115k.AbstractC5243a;
import com.airbnb.lottie.p118v.C5294e;
import com.airbnb.lottie.p119w.C5298c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* compiled from: RepeaterContent.java */
/* renamed from: com.airbnb.lottie.q.a.o */
/* loaded from: classes.dex */
public class C5182o implements InterfaceC5171d, InterfaceC5179l, InterfaceC5176i, AbstractC5186a.a, InterfaceC5177j {

    /* renamed from: a */
    private final Matrix f12582a = new Matrix();

    /* renamed from: b */
    private final Path f12583b = new Path();

    /* renamed from: c */
    private final C5157f f12584c;

    /* renamed from: d */
    private final AbstractC5243a f12585d;

    /* renamed from: e */
    private final String f12586e;

    /* renamed from: f */
    private final AbstractC5186a<Float, Float> f12587f;

    /* renamed from: g */
    private final AbstractC5186a<Float, Float> f12588g;

    /* renamed from: h */
    private final C5200o f12589h;

    /* renamed from: i */
    private C5170c f12590i;

    public C5182o(C5157f c5157f, AbstractC5243a abstractC5243a, C5236k c5236k) {
        this.f12584c = c5157f;
        this.f12585d = abstractC5243a;
        this.f12586e = c5236k.m9676c();
        AbstractC5186a<Float, Float> mo9617a = c5236k.m9675b().mo9617a();
        this.f12587f = mo9617a;
        abstractC5243a.m9723i(mo9617a);
        mo9617a.m9548a(this);
        AbstractC5186a<Float, Float> mo9617a2 = c5236k.m9677d().mo9617a();
        this.f12588g = mo9617a2;
        abstractC5243a.m9723i(mo9617a2);
        mo9617a2.m9548a(this);
        C5200o m9620b = c5236k.m9678e().m9620b();
        this.f12589h = m9620b;
        m9620b.m9573a(abstractC5243a);
        m9620b.m9574b(this);
    }

    @Override // com.airbnb.lottie.p108q.p110b.AbstractC5186a.a
    /* renamed from: a */
    public void mo9512a() {
        this.f12584c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5169b
    /* renamed from: b */
    public void mo9513b(List<InterfaceC5169b> list, List<InterfaceC5169b> list2) {
        this.f12590i.mo9513b(list, list2);
    }

    @Override // com.airbnb.lottie.p112s.InterfaceC5209f
    /* renamed from: c */
    public void mo9514c(C5208e c5208e, int i2, List<C5208e> list, C5208e c5208e2) {
        C5294e.m9882l(c5208e, i2, list, c5208e2, this);
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5171d
    /* renamed from: d */
    public void mo9515d(RectF rectF, Matrix matrix) {
        this.f12590i.mo9515d(rectF, matrix);
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5176i
    /* renamed from: e */
    public void mo9532e(ListIterator<InterfaceC5169b> listIterator) {
        if (this.f12590i != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f12590i = new C5170c(this.f12584c, this.f12585d, "Repeater", arrayList, null);
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5171d
    /* renamed from: f */
    public void mo9516f(Canvas canvas, Matrix matrix, int i2) {
        float floatValue = this.f12587f.mo9552h().floatValue();
        float floatValue2 = this.f12588g.mo9552h().floatValue();
        float floatValue3 = this.f12589h.m9580h().mo9552h().floatValue() / 100.0f;
        float floatValue4 = this.f12589h.m9576d().mo9552h().floatValue() / 100.0f;
        for (int i3 = ((int) floatValue) - 1; i3 >= 0; i3--) {
            this.f12582a.set(matrix);
            float f2 = i3;
            this.f12582a.preConcat(this.f12589h.m9578f(f2 + floatValue2));
            this.f12590i.mo9516f(canvas, this.f12582a, (int) (i2 * C5294e.m9880j(floatValue3, floatValue4, f2 / floatValue)));
        }
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5179l
    /* renamed from: g */
    public Path mo9522g() {
        Path mo9522g = this.f12590i.mo9522g();
        this.f12583b.reset();
        float floatValue = this.f12587f.mo9552h().floatValue();
        float floatValue2 = this.f12588g.mo9552h().floatValue();
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.f12582a.set(this.f12589h.m9578f(i2 + floatValue2));
            this.f12583b.addPath(mo9522g, this.f12582a);
        }
        return this.f12583b;
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5169b
    public String getName() {
        return this.f12586e;
    }

    @Override // com.airbnb.lottie.p112s.InterfaceC5209f
    /* renamed from: h */
    public <T> void mo9517h(T t, C5298c<T> c5298c) {
        if (this.f12589h.m9575c(t, c5298c)) {
            return;
        }
        if (t == InterfaceC5161j.f12407m) {
            this.f12587f.m9557m(c5298c);
        } else if (t == InterfaceC5161j.f12408n) {
            this.f12588g.m9557m(c5298c);
        }
    }
}
