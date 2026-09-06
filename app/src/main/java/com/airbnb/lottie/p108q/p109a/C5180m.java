package com.airbnb.lottie.p108q.p109a;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C5157f;
import com.airbnb.lottie.InterfaceC5161j;
import com.airbnb.lottie.p108q.p110b.AbstractC5186a;
import com.airbnb.lottie.p112s.C5208e;
import com.airbnb.lottie.p112s.p114j.C5234i;
import com.airbnb.lottie.p112s.p114j.C5242q;
import com.airbnb.lottie.p112s.p115k.AbstractC5243a;
import com.airbnb.lottie.p118v.C5294e;
import com.airbnb.lottie.p118v.C5295f;
import com.airbnb.lottie.p119w.C5298c;
import java.util.List;

/* compiled from: PolystarContent.java */
/* renamed from: com.airbnb.lottie.q.a.m */
/* loaded from: classes.dex */
public class C5180m implements InterfaceC5179l, AbstractC5186a.a, InterfaceC5177j {

    /* renamed from: a */
    private final Path f12559a = new Path();

    /* renamed from: b */
    private final String f12560b;

    /* renamed from: c */
    private final C5157f f12561c;

    /* renamed from: d */
    private final C5234i.a f12562d;

    /* renamed from: e */
    private final AbstractC5186a<?, Float> f12563e;

    /* renamed from: f */
    private final AbstractC5186a<?, PointF> f12564f;

    /* renamed from: g */
    private final AbstractC5186a<?, Float> f12565g;

    /* renamed from: h */
    private final AbstractC5186a<?, Float> f12566h;

    /* renamed from: i */
    private final AbstractC5186a<?, Float> f12567i;

    /* renamed from: j */
    private final AbstractC5186a<?, Float> f12568j;

    /* renamed from: k */
    private final AbstractC5186a<?, Float> f12569k;

    /* renamed from: l */
    private C5185r f12570l;

    /* renamed from: m */
    private boolean f12571m;

    /* compiled from: PolystarContent.java */
    /* renamed from: com.airbnb.lottie.q.a.m$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12572a;

        static {
            int[] iArr = new int[C5234i.a.values().length];
            f12572a = iArr;
            try {
                iArr[C5234i.a.Star.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12572a[C5234i.a.Polygon.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C5180m(C5157f c5157f, AbstractC5243a abstractC5243a, C5234i c5234i) {
        this.f12561c = c5157f;
        this.f12560b = c5234i.m9663d();
        C5234i.a m9669j = c5234i.m9669j();
        this.f12562d = m9669j;
        AbstractC5186a<Float, Float> mo9617a = c5234i.m9666g().mo9617a();
        this.f12563e = mo9617a;
        AbstractC5186a<PointF, PointF> mo9617a2 = c5234i.m9667h().mo9617a();
        this.f12564f = mo9617a2;
        AbstractC5186a<Float, Float> mo9617a3 = c5234i.m9668i().mo9617a();
        this.f12565g = mo9617a3;
        AbstractC5186a<Float, Float> mo9617a4 = c5234i.m9664e().mo9617a();
        this.f12567i = mo9617a4;
        AbstractC5186a<Float, Float> mo9617a5 = c5234i.m9665f().mo9617a();
        this.f12569k = mo9617a5;
        C5234i.a aVar = C5234i.a.Star;
        if (m9669j == aVar) {
            this.f12566h = c5234i.m9661b().mo9617a();
            this.f12568j = c5234i.m9662c().mo9617a();
        } else {
            this.f12566h = null;
            this.f12568j = null;
        }
        abstractC5243a.m9723i(mo9617a);
        abstractC5243a.m9723i(mo9617a2);
        abstractC5243a.m9723i(mo9617a3);
        abstractC5243a.m9723i(mo9617a4);
        abstractC5243a.m9723i(mo9617a5);
        if (m9669j == aVar) {
            abstractC5243a.m9723i(this.f12566h);
            abstractC5243a.m9723i(this.f12568j);
        }
        mo9617a.m9548a(this);
        mo9617a2.m9548a(this);
        mo9617a3.m9548a(this);
        mo9617a4.m9548a(this);
        mo9617a5.m9548a(this);
        if (m9669j == aVar) {
            this.f12566h.m9548a(this);
            this.f12568j.m9548a(this);
        }
    }

    /* renamed from: e */
    private void m9535e() {
        double d2;
        double d3;
        double d4;
        int i2;
        int floor = (int) Math.floor(this.f12563e.mo9552h().floatValue());
        double radians = Math.toRadians((this.f12565g == null ? 0.0d : r2.mo9552h().floatValue()) - 90.0d);
        double d5 = floor;
        Double.isNaN(d5);
        float floatValue = this.f12569k.mo9552h().floatValue() / 100.0f;
        float floatValue2 = this.f12567i.mo9552h().floatValue();
        double d6 = floatValue2;
        double cos = Math.cos(radians);
        Double.isNaN(d6);
        float f2 = (float) (cos * d6);
        double sin = Math.sin(radians);
        Double.isNaN(d6);
        float f3 = (float) (sin * d6);
        this.f12559a.moveTo(f2, f3);
        double d7 = (float) (6.283185307179586d / d5);
        Double.isNaN(d7);
        double d8 = radians + d7;
        double ceil = Math.ceil(d5);
        int i3 = 0;
        while (i3 < ceil) {
            double cos2 = Math.cos(d8);
            Double.isNaN(d6);
            float f4 = (float) (cos2 * d6);
            double sin2 = Math.sin(d8);
            Double.isNaN(d6);
            double d9 = ceil;
            float f5 = (float) (d6 * sin2);
            if (floatValue != 0.0f) {
                d3 = d6;
                i2 = i3;
                d2 = d8;
                double atan2 = (float) (Math.atan2(f3, f2) - 1.5707963267948966d);
                float cos3 = (float) Math.cos(atan2);
                float sin3 = (float) Math.sin(atan2);
                d4 = d7;
                double atan22 = (float) (Math.atan2(f5, f4) - 1.5707963267948966d);
                float f6 = floatValue2 * floatValue * 0.25f;
                this.f12559a.cubicTo(f2 - (cos3 * f6), f3 - (sin3 * f6), f4 + (((float) Math.cos(atan22)) * f6), f5 + (f6 * ((float) Math.sin(atan22))), f4, f5);
            } else {
                d2 = d8;
                d3 = d6;
                d4 = d7;
                i2 = i3;
                this.f12559a.lineTo(f4, f5);
            }
            Double.isNaN(d4);
            d8 = d2 + d4;
            i3 = i2 + 1;
            f3 = f5;
            f2 = f4;
            ceil = d9;
            d6 = d3;
            d7 = d4;
        }
        PointF mo9552h = this.f12564f.mo9552h();
        this.f12559a.offset(mo9552h.x, mo9552h.y);
        this.f12559a.close();
    }

    /* renamed from: i */
    private void m9536i() {
        double d2;
        float f2;
        float f3;
        float f4;
        float f5;
        double d3;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        double d4;
        float f12;
        float f13;
        float floatValue = this.f12563e.mo9552h().floatValue();
        double radians = Math.toRadians((this.f12565g == null ? 0.0d : r2.mo9552h().floatValue()) - 90.0d);
        double d5 = floatValue;
        Double.isNaN(d5);
        float f14 = (float) (6.283185307179586d / d5);
        float f15 = f14 / 2.0f;
        float f16 = floatValue - ((int) floatValue);
        if (f16 != 0.0f) {
            double d6 = (1.0f - f16) * f15;
            Double.isNaN(d6);
            radians += d6;
        }
        float floatValue2 = this.f12567i.mo9552h().floatValue();
        float floatValue3 = this.f12566h.mo9552h().floatValue();
        AbstractC5186a<?, Float> abstractC5186a = this.f12568j;
        float floatValue4 = abstractC5186a != null ? abstractC5186a.mo9552h().floatValue() / 100.0f : 0.0f;
        AbstractC5186a<?, Float> abstractC5186a2 = this.f12569k;
        float floatValue5 = abstractC5186a2 != null ? abstractC5186a2.mo9552h().floatValue() / 100.0f : 0.0f;
        if (f16 != 0.0f) {
            float f17 = ((floatValue2 - floatValue3) * f16) + floatValue3;
            double d7 = f17;
            double cos = Math.cos(radians);
            Double.isNaN(d7);
            d2 = d5;
            float f18 = (float) (d7 * cos);
            double sin = Math.sin(radians);
            Double.isNaN(d7);
            float f19 = (float) (d7 * sin);
            this.f12559a.moveTo(f18, f19);
            double d8 = (f14 * f16) / 2.0f;
            Double.isNaN(d8);
            d3 = radians + d8;
            f4 = f18;
            f6 = f17;
            f2 = floatValue2;
            f5 = f19;
            f3 = f15;
        } else {
            d2 = d5;
            f2 = floatValue2;
            double d9 = f2;
            double cos2 = Math.cos(radians);
            Double.isNaN(d9);
            f3 = f15;
            f4 = (float) (d9 * cos2);
            double sin2 = Math.sin(radians);
            Double.isNaN(d9);
            f5 = (float) (d9 * sin2);
            this.f12559a.moveTo(f4, f5);
            double d10 = f3;
            Double.isNaN(d10);
            d3 = radians + d10;
            f6 = 0.0f;
        }
        double ceil = Math.ceil(d2) * 2.0d;
        int i2 = 0;
        float f20 = floatValue5;
        boolean z = false;
        while (true) {
            double d11 = i2;
            if (d11 >= ceil) {
                PointF mo9552h = this.f12564f.mo9552h();
                this.f12559a.offset(mo9552h.x, mo9552h.y);
                this.f12559a.close();
                return;
            }
            float f21 = z ? f2 : floatValue3;
            float f22 = (f6 == 0.0f || d11 != ceil - 2.0d) ? f3 : (f14 * f16) / 2.0f;
            if (f6 == 0.0f || d11 != ceil - 1.0d) {
                f7 = f14;
                f8 = f21;
                f9 = f2;
            } else {
                f7 = f14;
                f9 = f2;
                f8 = f6;
            }
            double d12 = f8;
            double cos3 = Math.cos(d3);
            Double.isNaN(d12);
            float f23 = (float) (d12 * cos3);
            double sin3 = Math.sin(d3);
            Double.isNaN(d12);
            float f24 = (float) (d12 * sin3);
            if (floatValue4 == 0.0f && f20 == 0.0f) {
                this.f12559a.lineTo(f23, f24);
                d4 = d3;
                f10 = floatValue3;
                f11 = floatValue4;
                f12 = f3;
                f13 = f22;
            } else {
                f10 = floatValue3;
                f11 = floatValue4;
                double atan2 = (float) (Math.atan2(f5, f4) - 1.5707963267948966d);
                float cos4 = (float) Math.cos(atan2);
                float sin4 = (float) Math.sin(atan2);
                d4 = d3;
                f12 = f3;
                f13 = f22;
                double atan22 = (float) (Math.atan2(f24, f23) - 1.5707963267948966d);
                float cos5 = (float) Math.cos(atan22);
                float sin5 = (float) Math.sin(atan22);
                float f25 = z ? f11 : f20;
                float f26 = z ? f20 : f11;
                float f27 = (z ? f10 : f9) * f25 * 0.47829f;
                float f28 = cos4 * f27;
                float f29 = f27 * sin4;
                float f30 = (z ? f9 : f10) * f26 * 0.47829f;
                float f31 = cos5 * f30;
                float f32 = f30 * sin5;
                if (f16 != 0.0f) {
                    if (i2 == 0) {
                        f28 *= f16;
                        f29 *= f16;
                    } else if (d11 == ceil - 1.0d) {
                        f31 *= f16;
                        f32 *= f16;
                    }
                }
                this.f12559a.cubicTo(f4 - f28, f5 - f29, f23 + f31, f24 + f32, f23, f24);
            }
            double d13 = f13;
            Double.isNaN(d13);
            z = !z;
            i2++;
            f5 = f24;
            d3 = d4 + d13;
            f3 = f12;
            f4 = f23;
            f2 = f9;
            f14 = f7;
            floatValue3 = f10;
            floatValue4 = f11;
        }
    }

    /* renamed from: j */
    private void m9537j() {
        this.f12571m = false;
        this.f12561c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.p108q.p110b.AbstractC5186a.a
    /* renamed from: a */
    public void mo9512a() {
        m9537j();
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5169b
    /* renamed from: b */
    public void mo9513b(List<InterfaceC5169b> list, List<InterfaceC5169b> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            InterfaceC5169b interfaceC5169b = list.get(i2);
            if (interfaceC5169b instanceof C5185r) {
                C5185r c5185r = (C5185r) interfaceC5169b;
                if (c5185r.m9544j() == C5242q.a.Simultaneously) {
                    this.f12570l = c5185r;
                    c5185r.m9540c(this);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.p112s.InterfaceC5209f
    /* renamed from: c */
    public void mo9514c(C5208e c5208e, int i2, List<C5208e> list, C5208e c5208e2) {
        C5294e.m9882l(c5208e, i2, list, c5208e2, this);
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5179l
    /* renamed from: g */
    public Path mo9522g() {
        if (this.f12571m) {
            return this.f12559a;
        }
        this.f12559a.reset();
        int i2 = a.f12572a[this.f12562d.ordinal()];
        if (i2 == 1) {
            m9536i();
        } else if (i2 == 2) {
            m9535e();
        }
        this.f12559a.close();
        C5295f.m9884b(this.f12559a, this.f12570l);
        this.f12571m = true;
        return this.f12559a;
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5169b
    public String getName() {
        return this.f12560b;
    }

    @Override // com.airbnb.lottie.p112s.InterfaceC5209f
    /* renamed from: h */
    public <T> void mo9517h(T t, C5298c<T> c5298c) {
        AbstractC5186a<?, Float> abstractC5186a;
        AbstractC5186a<?, Float> abstractC5186a2;
        if (t == InterfaceC5161j.f12409o) {
            this.f12563e.m9557m(c5298c);
            return;
        }
        if (t == InterfaceC5161j.f12410p) {
            this.f12565g.m9557m(c5298c);
            return;
        }
        if (t == InterfaceC5161j.f12402h) {
            this.f12564f.m9557m(c5298c);
            return;
        }
        if (t == InterfaceC5161j.f12411q && (abstractC5186a2 = this.f12566h) != null) {
            abstractC5186a2.m9557m(c5298c);
            return;
        }
        if (t == InterfaceC5161j.f12412r) {
            this.f12567i.m9557m(c5298c);
            return;
        }
        if (t == InterfaceC5161j.f12413s && (abstractC5186a = this.f12568j) != null) {
            abstractC5186a.m9557m(c5298c);
        } else if (t == InterfaceC5161j.f12414t) {
            this.f12569k.m9557m(c5298c);
        }
    }
}
