package com.airbnb.lottie.p108q.p109a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C5154c;
import com.airbnb.lottie.C5157f;
import com.airbnb.lottie.InterfaceC5161j;
import com.airbnb.lottie.p108q.p110b.AbstractC5186a;
import com.airbnb.lottie.p108q.p110b.C5201p;
import com.airbnb.lottie.p112s.C5208e;
import com.airbnb.lottie.p112s.p114j.C5238m;
import com.airbnb.lottie.p112s.p115k.AbstractC5243a;
import com.airbnb.lottie.p118v.C5294e;
import com.airbnb.lottie.p119w.C5298c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FillContent.java */
/* renamed from: com.airbnb.lottie.q.a.f */
/* loaded from: classes.dex */
public class C5173f implements InterfaceC5171d, AbstractC5186a.a, InterfaceC5177j {

    /* renamed from: a */
    private final Path f12517a;

    /* renamed from: b */
    private final Paint f12518b;

    /* renamed from: c */
    private final AbstractC5243a f12519c;

    /* renamed from: d */
    private final String f12520d;

    /* renamed from: e */
    private final List<InterfaceC5179l> f12521e;

    /* renamed from: f */
    private final AbstractC5186a<Integer, Integer> f12522f;

    /* renamed from: g */
    private final AbstractC5186a<Integer, Integer> f12523g;

    /* renamed from: h */
    private AbstractC5186a<ColorFilter, ColorFilter> f12524h;

    /* renamed from: i */
    private final C5157f f12525i;

    public C5173f(C5157f c5157f, AbstractC5243a abstractC5243a, C5238m c5238m) {
        Path path = new Path();
        this.f12517a = path;
        this.f12518b = new Paint(1);
        this.f12521e = new ArrayList();
        this.f12519c = abstractC5243a;
        this.f12520d = c5238m.m9686d();
        this.f12525i = c5157f;
        if (c5238m.m9684b() == null || c5238m.m9687e() == null) {
            this.f12522f = null;
            this.f12523g = null;
            return;
        }
        path.setFillType(c5238m.m9685c());
        AbstractC5186a<Integer, Integer> mo9617a = c5238m.m9684b().mo9617a();
        this.f12522f = mo9617a;
        mo9617a.m9548a(this);
        abstractC5243a.m9723i(mo9617a);
        AbstractC5186a<Integer, Integer> mo9617a2 = c5238m.m9687e().mo9617a();
        this.f12523g = mo9617a2;
        mo9617a2.m9548a(this);
        abstractC5243a.m9723i(mo9617a2);
    }

    @Override // com.airbnb.lottie.p108q.p110b.AbstractC5186a.a
    /* renamed from: a */
    public void mo9512a() {
        this.f12525i.invalidateSelf();
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5169b
    /* renamed from: b */
    public void mo9513b(List<InterfaceC5169b> list, List<InterfaceC5169b> list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            InterfaceC5169b interfaceC5169b = list2.get(i2);
            if (interfaceC5169b instanceof InterfaceC5179l) {
                this.f12521e.add((InterfaceC5179l) interfaceC5169b);
            }
        }
    }

    @Override // com.airbnb.lottie.p112s.InterfaceC5209f
    /* renamed from: c */
    public void mo9514c(C5208e c5208e, int i2, List<C5208e> list, C5208e c5208e2) {
        C5294e.m9882l(c5208e, i2, list, c5208e2, this);
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5171d
    /* renamed from: d */
    public void mo9515d(RectF rectF, Matrix matrix) {
        this.f12517a.reset();
        for (int i2 = 0; i2 < this.f12521e.size(); i2++) {
            this.f12517a.addPath(this.f12521e.get(i2).mo9522g(), matrix);
        }
        this.f12517a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5171d
    /* renamed from: f */
    public void mo9516f(Canvas canvas, Matrix matrix, int i2) {
        C5154c.m9391a("FillContent#draw");
        this.f12518b.setColor(this.f12522f.mo9552h().intValue());
        this.f12518b.setAlpha(C5294e.m9873c((int) ((((i2 / 255.0f) * this.f12523g.mo9552h().intValue()) / 100.0f) * 255.0f), 0, 255));
        AbstractC5186a<ColorFilter, ColorFilter> abstractC5186a = this.f12524h;
        if (abstractC5186a != null) {
            this.f12518b.setColorFilter(abstractC5186a.mo9552h());
        }
        this.f12517a.reset();
        for (int i3 = 0; i3 < this.f12521e.size(); i3++) {
            this.f12517a.addPath(this.f12521e.get(i3).mo9522g(), matrix);
        }
        canvas.drawPath(this.f12517a, this.f12518b);
        C5154c.m9393c("FillContent#draw");
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5169b
    public String getName() {
        return this.f12520d;
    }

    @Override // com.airbnb.lottie.p112s.InterfaceC5209f
    /* renamed from: h */
    public <T> void mo9517h(T t, C5298c<T> c5298c) {
        if (t == InterfaceC5161j.f12395a) {
            this.f12522f.m9557m(c5298c);
            return;
        }
        if (t == InterfaceC5161j.f12398d) {
            this.f12523g.m9557m(c5298c);
            return;
        }
        if (t == InterfaceC5161j.f12418x) {
            if (c5298c == null) {
                this.f12524h = null;
                return;
            }
            C5201p c5201p = new C5201p(c5298c);
            this.f12524h = c5201p;
            c5201p.m9548a(this);
            this.f12519c.m9723i(this.f12524h);
        }
    }
}
