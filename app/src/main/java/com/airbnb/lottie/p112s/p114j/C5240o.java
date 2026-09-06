package com.airbnb.lottie.p112s.p114j;

import com.airbnb.lottie.C5157f;
import com.airbnb.lottie.p108q.p109a.C5183p;
import com.airbnb.lottie.p108q.p109a.InterfaceC5169b;
import com.airbnb.lottie.p112s.p113i.C5219h;
import com.airbnb.lottie.p112s.p115k.AbstractC5243a;

/* compiled from: ShapePath.java */
/* renamed from: com.airbnb.lottie.s.j.o */
/* loaded from: classes.dex */
public class C5240o implements InterfaceC5227b {

    /* renamed from: a */
    private final String f12769a;

    /* renamed from: b */
    private final int f12770b;

    /* renamed from: c */
    private final C5219h f12771c;

    public C5240o(String str, int i2, C5219h c5219h) {
        this.f12769a = str;
        this.f12770b = i2;
        this.f12771c = c5219h;
    }

    @Override // com.airbnb.lottie.p112s.p114j.InterfaceC5227b
    /* renamed from: a */
    public InterfaceC5169b mo9619a(C5157f c5157f, AbstractC5243a abstractC5243a) {
        return new C5183p(c5157f, abstractC5243a, this);
    }

    /* renamed from: b */
    public String m9690b() {
        return this.f12769a;
    }

    /* renamed from: c */
    public C5219h m9691c() {
        return this.f12771c;
    }

    public String toString() {
        return "ShapePath{name=" + this.f12769a + ", index=" + this.f12770b + '}';
    }
}
