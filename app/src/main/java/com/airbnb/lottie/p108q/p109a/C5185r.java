package com.airbnb.lottie.p108q.p109a;

import com.airbnb.lottie.p108q.p110b.AbstractC5186a;
import com.airbnb.lottie.p112s.p114j.C5242q;
import com.airbnb.lottie.p112s.p115k.AbstractC5243a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: TrimPathContent.java */
/* renamed from: com.airbnb.lottie.q.a.r */
/* loaded from: classes.dex */
public class C5185r implements InterfaceC5169b, AbstractC5186a.a {

    /* renamed from: a */
    private final String f12601a;

    /* renamed from: b */
    private final List<AbstractC5186a.a> f12602b = new ArrayList();

    /* renamed from: c */
    private final C5242q.a f12603c;

    /* renamed from: d */
    private final AbstractC5186a<?, Float> f12604d;

    /* renamed from: e */
    private final AbstractC5186a<?, Float> f12605e;

    /* renamed from: f */
    private final AbstractC5186a<?, Float> f12606f;

    public C5185r(AbstractC5243a abstractC5243a, C5242q c5242q) {
        this.f12601a = c5242q.m9704c();
        this.f12603c = c5242q.m9707f();
        AbstractC5186a<Float, Float> mo9617a = c5242q.m9706e().mo9617a();
        this.f12604d = mo9617a;
        AbstractC5186a<Float, Float> mo9617a2 = c5242q.m9703b().mo9617a();
        this.f12605e = mo9617a2;
        AbstractC5186a<Float, Float> mo9617a3 = c5242q.m9705d().mo9617a();
        this.f12606f = mo9617a3;
        abstractC5243a.m9723i(mo9617a);
        abstractC5243a.m9723i(mo9617a2);
        abstractC5243a.m9723i(mo9617a3);
        mo9617a.m9548a(this);
        mo9617a2.m9548a(this);
        mo9617a3.m9548a(this);
    }

    @Override // com.airbnb.lottie.p108q.p110b.AbstractC5186a.a
    /* renamed from: a */
    public void mo9512a() {
        for (int i2 = 0; i2 < this.f12602b.size(); i2++) {
            this.f12602b.get(i2).mo9512a();
        }
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5169b
    /* renamed from: b */
    public void mo9513b(List<InterfaceC5169b> list, List<InterfaceC5169b> list2) {
    }

    /* renamed from: c */
    void m9540c(AbstractC5186a.a aVar) {
        this.f12602b.add(aVar);
    }

    /* renamed from: e */
    public AbstractC5186a<?, Float> m9541e() {
        return this.f12605e;
    }

    /* renamed from: h */
    public AbstractC5186a<?, Float> m9542h() {
        return this.f12606f;
    }

    /* renamed from: i */
    public AbstractC5186a<?, Float> m9543i() {
        return this.f12604d;
    }

    /* renamed from: j */
    C5242q.a m9544j() {
        return this.f12603c;
    }
}
