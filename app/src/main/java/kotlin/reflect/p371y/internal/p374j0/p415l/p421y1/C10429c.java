package kotlin.reflect.p371y.internal.p374j0.p415l.p421y1;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10361e;

/* compiled from: CapturedTypeApproximation.kt */
/* renamed from: kotlin.f0.y.e.j0.l.y1.c */
/* loaded from: classes3.dex */
final class C10429c {

    /* renamed from: a */
    private final InterfaceC10554e1 f40392a;

    /* renamed from: b */
    private final AbstractC10311e0 f40393b;

    /* renamed from: c */
    private final AbstractC10311e0 f40394c;

    public C10429c(InterfaceC10554e1 interfaceC10554e1, AbstractC10311e0 abstractC10311e0, AbstractC10311e0 abstractC10311e02) {
        C9768m.m32346f(interfaceC10554e1, "typeParameter");
        C9768m.m32346f(abstractC10311e0, "inProjection");
        C9768m.m32346f(abstractC10311e02, "outProjection");
        this.f40392a = interfaceC10554e1;
        this.f40393b = abstractC10311e0;
        this.f40394c = abstractC10311e02;
    }

    /* renamed from: a */
    public final AbstractC10311e0 m37177a() {
        return this.f40393b;
    }

    /* renamed from: b */
    public final AbstractC10311e0 m37178b() {
        return this.f40394c;
    }

    /* renamed from: c */
    public final InterfaceC10554e1 m37179c() {
        return this.f40392a;
    }

    /* renamed from: d */
    public final boolean m37180d() {
        return InterfaceC10361e.f40181a.mo36920d(this.f40393b, this.f40394c);
    }
}
