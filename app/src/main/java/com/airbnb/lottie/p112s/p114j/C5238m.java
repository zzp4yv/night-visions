package com.airbnb.lottie.p112s.p114j;

import android.graphics.Path;
import com.airbnb.lottie.C5157f;
import com.airbnb.lottie.p108q.p109a.C5173f;
import com.airbnb.lottie.p108q.p109a.InterfaceC5169b;
import com.airbnb.lottie.p112s.p113i.C5212a;
import com.airbnb.lottie.p112s.p113i.C5215d;
import com.airbnb.lottie.p112s.p115k.AbstractC5243a;

/* compiled from: ShapeFill.java */
/* renamed from: com.airbnb.lottie.s.j.m */
/* loaded from: classes.dex */
public class C5238m implements InterfaceC5227b {

    /* renamed from: a */
    private final boolean f12762a;

    /* renamed from: b */
    private final Path.FillType f12763b;

    /* renamed from: c */
    private final String f12764c;

    /* renamed from: d */
    private final C5212a f12765d;

    /* renamed from: e */
    private final C5215d f12766e;

    public C5238m(String str, boolean z, Path.FillType fillType, C5212a c5212a, C5215d c5215d) {
        this.f12764c = str;
        this.f12762a = z;
        this.f12763b = fillType;
        this.f12765d = c5212a;
        this.f12766e = c5215d;
    }

    @Override // com.airbnb.lottie.p112s.p114j.InterfaceC5227b
    /* renamed from: a */
    public InterfaceC5169b mo9619a(C5157f c5157f, AbstractC5243a abstractC5243a) {
        return new C5173f(c5157f, abstractC5243a, this);
    }

    /* renamed from: b */
    public C5212a m9684b() {
        return this.f12765d;
    }

    /* renamed from: c */
    public Path.FillType m9685c() {
        return this.f12763b;
    }

    /* renamed from: d */
    public String m9686d() {
        return this.f12764c;
    }

    /* renamed from: e */
    public C5215d m9687e() {
        return this.f12766e;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f12762a + '}';
    }
}
