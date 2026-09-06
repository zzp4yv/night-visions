package kotlin.reflect.p371y.internal.p374j0.p415l;

import kotlin.jvm.internal.C9768m;

/* compiled from: KotlinTypeFactory.kt */
/* renamed from: kotlin.f0.y.e.j0.l.o0 */
/* loaded from: classes3.dex */
final class C10341o0 extends AbstractC10352s {

    /* renamed from: h */
    private final C10300a1 f40158h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10341o0(AbstractC10335m0 abstractC10335m0, C10300a1 c10300a1) {
        super(abstractC10335m0);
        C9768m.m32346f(abstractC10335m0, "delegate");
        C9768m.m32346f(c10300a1, "attributes");
        this.f40158h = c10300a1;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10349r, kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: N0 */
    public C10300a1 mo35992N0() {
        return this.f40158h;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10349r
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public C10341o0 mo33695Z0(AbstractC10335m0 abstractC10335m0) {
        C9768m.m32346f(abstractC10335m0, "delegate");
        return new C10341o0(abstractC10335m0, mo35992N0());
    }
}
