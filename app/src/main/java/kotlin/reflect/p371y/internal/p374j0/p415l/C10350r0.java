package kotlin.reflect.p371y.internal.p374j0.p415l;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g;

/* compiled from: StarProjectionImpl.kt */
/* renamed from: kotlin.f0.y.e.j0.l.r0 */
/* loaded from: classes3.dex */
public final class C10350r0 extends AbstractC10321h1 {

    /* renamed from: a */
    private final AbstractC10311e0 f40165a;

    public C10350r0(AbstractC9881h abstractC9881h) {
        C9768m.m32346f(abstractC9881h, "kotlinBuiltIns");
        AbstractC10335m0 m32774I = abstractC9881h.m32774I();
        C9768m.m32345e(m32774I, "kotlinBuiltIns.nullableAnyType");
        this.f40165a = m32774I;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1
    /* renamed from: a */
    public EnumC10351r1 mo36708a() {
        return EnumC10351r1.OUT_VARIANCE;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1
    /* renamed from: b */
    public InterfaceC10318g1 mo36709b(AbstractC10363g abstractC10363g) {
        C9768m.m32346f(abstractC10363g, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1
    /* renamed from: c */
    public boolean mo36710c() {
        return true;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1
    public AbstractC10311e0 getType() {
        return this.f40165a;
    }
}
