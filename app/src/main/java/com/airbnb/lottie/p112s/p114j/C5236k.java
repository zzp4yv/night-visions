package com.airbnb.lottie.p112s.p114j;

import com.airbnb.lottie.C5157f;
import com.airbnb.lottie.p108q.p109a.C5182o;
import com.airbnb.lottie.p108q.p109a.InterfaceC5169b;
import com.airbnb.lottie.p112s.p113i.C5213b;
import com.airbnb.lottie.p112s.p113i.C5223l;
import com.airbnb.lottie.p112s.p115k.AbstractC5243a;

/* compiled from: Repeater.java */
/* renamed from: com.airbnb.lottie.s.j.k */
/* loaded from: classes.dex */
public class C5236k implements InterfaceC5227b {

    /* renamed from: a */
    private final String f12755a;

    /* renamed from: b */
    private final C5213b f12756b;

    /* renamed from: c */
    private final C5213b f12757c;

    /* renamed from: d */
    private final C5223l f12758d;

    public C5236k(String str, C5213b c5213b, C5213b c5213b2, C5223l c5223l) {
        this.f12755a = str;
        this.f12756b = c5213b;
        this.f12757c = c5213b2;
        this.f12758d = c5223l;
    }

    @Override // com.airbnb.lottie.p112s.p114j.InterfaceC5227b
    /* renamed from: a */
    public InterfaceC5169b mo9619a(C5157f c5157f, AbstractC5243a abstractC5243a) {
        return new C5182o(c5157f, abstractC5243a, this);
    }

    /* renamed from: b */
    public C5213b m9675b() {
        return this.f12756b;
    }

    /* renamed from: c */
    public String m9676c() {
        return this.f12755a;
    }

    /* renamed from: d */
    public C5213b m9677d() {
        return this.f12757c;
    }

    /* renamed from: e */
    public C5223l m9678e() {
        return this.f12758d;
    }
}
