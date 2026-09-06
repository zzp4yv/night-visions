package com.airbnb.lottie.p108q.p109a;

import android.graphics.Path;
import com.airbnb.lottie.C5157f;
import com.airbnb.lottie.p108q.p110b.AbstractC5186a;
import com.airbnb.lottie.p112s.p114j.C5237l;
import com.airbnb.lottie.p112s.p114j.C5240o;
import com.airbnb.lottie.p112s.p114j.C5242q;
import com.airbnb.lottie.p112s.p115k.AbstractC5243a;
import com.airbnb.lottie.p118v.C5295f;
import java.util.List;

/* compiled from: ShapeContent.java */
/* renamed from: com.airbnb.lottie.q.a.p */
/* loaded from: classes.dex */
public class C5183p implements InterfaceC5179l, AbstractC5186a.a {

    /* renamed from: a */
    private final Path f12591a = new Path();

    /* renamed from: b */
    private final String f12592b;

    /* renamed from: c */
    private final C5157f f12593c;

    /* renamed from: d */
    private final AbstractC5186a<?, Path> f12594d;

    /* renamed from: e */
    private boolean f12595e;

    /* renamed from: f */
    private C5185r f12596f;

    public C5183p(C5157f c5157f, AbstractC5243a abstractC5243a, C5240o c5240o) {
        this.f12592b = c5240o.m9690b();
        this.f12593c = c5157f;
        AbstractC5186a<C5237l, Path> mo9617a = c5240o.m9691c().mo9617a();
        this.f12594d = mo9617a;
        abstractC5243a.m9723i(mo9617a);
        mo9617a.m9548a(this);
    }

    /* renamed from: c */
    private void m9539c() {
        this.f12595e = false;
        this.f12593c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.p108q.p110b.AbstractC5186a.a
    /* renamed from: a */
    public void mo9512a() {
        m9539c();
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5169b
    /* renamed from: b */
    public void mo9513b(List<InterfaceC5169b> list, List<InterfaceC5169b> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            InterfaceC5169b interfaceC5169b = list.get(i2);
            if (interfaceC5169b instanceof C5185r) {
                C5185r c5185r = (C5185r) interfaceC5169b;
                if (c5185r.m9544j() == C5242q.a.Simultaneously) {
                    this.f12596f = c5185r;
                    c5185r.m9540c(this);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5179l
    /* renamed from: g */
    public Path mo9522g() {
        if (this.f12595e) {
            return this.f12591a;
        }
        this.f12591a.reset();
        this.f12591a.set(this.f12594d.mo9552h());
        this.f12591a.setFillType(Path.FillType.EVEN_ODD);
        C5295f.m9884b(this.f12591a, this.f12596f);
        this.f12595e = true;
        return this.f12591a;
    }
}
