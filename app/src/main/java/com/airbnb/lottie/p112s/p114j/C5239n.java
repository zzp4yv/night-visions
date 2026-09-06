package com.airbnb.lottie.p112s.p114j;

import com.airbnb.lottie.C5157f;
import com.airbnb.lottie.p108q.p109a.C5170c;
import com.airbnb.lottie.p108q.p109a.InterfaceC5169b;
import com.airbnb.lottie.p112s.p115k.AbstractC5243a;
import java.util.Arrays;
import java.util.List;

/* compiled from: ShapeGroup.java */
/* renamed from: com.airbnb.lottie.s.j.n */
/* loaded from: classes.dex */
public class C5239n implements InterfaceC5227b {

    /* renamed from: a */
    private final String f12767a;

    /* renamed from: b */
    private final List<InterfaceC5227b> f12768b;

    public C5239n(String str, List<InterfaceC5227b> list) {
        this.f12767a = str;
        this.f12768b = list;
    }

    @Override // com.airbnb.lottie.p112s.p114j.InterfaceC5227b
    /* renamed from: a */
    public InterfaceC5169b mo9619a(C5157f c5157f, AbstractC5243a abstractC5243a) {
        return new C5170c(c5157f, abstractC5243a, this);
    }

    /* renamed from: b */
    public List<InterfaceC5227b> m9688b() {
        return this.f12768b;
    }

    /* renamed from: c */
    public String m9689c() {
        return this.f12767a;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f12767a + "' Shapes: " + Arrays.toString(this.f12768b.toArray()) + '}';
    }
}
