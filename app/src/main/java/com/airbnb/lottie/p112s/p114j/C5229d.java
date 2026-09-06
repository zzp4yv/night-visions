package com.airbnb.lottie.p112s.p114j;

import android.graphics.Path;
import com.airbnb.lottie.C5157f;
import com.airbnb.lottie.p108q.p109a.C5174g;
import com.airbnb.lottie.p108q.p109a.InterfaceC5169b;
import com.airbnb.lottie.p112s.p113i.C5213b;
import com.airbnb.lottie.p112s.p113i.C5214c;
import com.airbnb.lottie.p112s.p113i.C5215d;
import com.airbnb.lottie.p112s.p113i.C5217f;
import com.airbnb.lottie.p112s.p115k.AbstractC5243a;

/* compiled from: GradientFill.java */
/* renamed from: com.airbnb.lottie.s.j.d */
/* loaded from: classes.dex */
public class C5229d implements InterfaceC5227b {

    /* renamed from: a */
    private final EnumC5231f f12699a;

    /* renamed from: b */
    private final Path.FillType f12700b;

    /* renamed from: c */
    private final C5214c f12701c;

    /* renamed from: d */
    private final C5215d f12702d;

    /* renamed from: e */
    private final C5217f f12703e;

    /* renamed from: f */
    private final C5217f f12704f;

    /* renamed from: g */
    private final String f12705g;

    /* renamed from: h */
    private final C5213b f12706h;

    /* renamed from: i */
    private final C5213b f12707i;

    public C5229d(String str, EnumC5231f enumC5231f, Path.FillType fillType, C5214c c5214c, C5215d c5215d, C5217f c5217f, C5217f c5217f2, C5213b c5213b, C5213b c5213b2) {
        this.f12699a = enumC5231f;
        this.f12700b = fillType;
        this.f12701c = c5214c;
        this.f12702d = c5215d;
        this.f12703e = c5217f;
        this.f12704f = c5217f2;
        this.f12705g = str;
        this.f12706h = c5213b;
        this.f12707i = c5213b2;
    }

    @Override // com.airbnb.lottie.p112s.p114j.InterfaceC5227b
    /* renamed from: a */
    public InterfaceC5169b mo9619a(C5157f c5157f, AbstractC5243a abstractC5243a) {
        return new C5174g(c5157f, abstractC5243a, this);
    }

    /* renamed from: b */
    public C5217f m9636b() {
        return this.f12704f;
    }

    /* renamed from: c */
    public Path.FillType m9637c() {
        return this.f12700b;
    }

    /* renamed from: d */
    public C5214c m9638d() {
        return this.f12701c;
    }

    /* renamed from: e */
    public EnumC5231f m9639e() {
        return this.f12699a;
    }

    /* renamed from: f */
    public String m9640f() {
        return this.f12705g;
    }

    /* renamed from: g */
    public C5215d m9641g() {
        return this.f12702d;
    }

    /* renamed from: h */
    public C5217f m9642h() {
        return this.f12703e;
    }
}
