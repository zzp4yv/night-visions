package kotlin.reflect.p371y.internal.p374j0.p400i.p401q.p402a;

import java.util.Collection;
import java.util.List;
import kotlin.collections.C10782t;
import kotlin.collections.C10784u;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10351r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.C10366j;

/* compiled from: CapturedTypeConstructor.kt */
/* renamed from: kotlin.f0.y.e.j0.i.q.a.c */
/* loaded from: classes3.dex */
public final class C10169c implements InterfaceC10168b {

    /* renamed from: a */
    private final InterfaceC10318g1 f39552a;

    /* renamed from: b */
    private C10366j f39553b;

    public C10169c(InterfaceC10318g1 interfaceC10318g1) {
        C9768m.m32346f(interfaceC10318g1, "projection");
        this.f39552a = interfaceC10318g1;
        mo35997f().mo36708a();
        EnumC10351r1 enumC10351r1 = EnumC10351r1.INVARIANT;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
    /* renamed from: a */
    public Collection<AbstractC10311e0> mo35998a() {
        AbstractC10311e0 type = mo35997f().mo36708a() == EnumC10351r1.OUT_VARIANCE ? mo35997f().getType() : mo36004o().m32774I();
        C9768m.m32345e(type, "if (projection.projectio… builtIns.nullableAnyType");
        return C10782t.m38883e(type);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
    /* renamed from: c */
    public /* bridge */ /* synthetic */ InterfaceC10561h mo32891w() {
        return (InterfaceC10561h) m36000g();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
    /* renamed from: e */
    public boolean mo32888e() {
        return false;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p401q.p402a.InterfaceC10168b
    /* renamed from: f */
    public InterfaceC10318g1 mo35997f() {
        return this.f39552a;
    }

    /* renamed from: g */
    public Void m36000g() {
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
    public List<InterfaceC10554e1> getParameters() {
        return C10784u.m38888j();
    }

    /* renamed from: h */
    public final C10366j m36001h() {
        return this.f39553b;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C10169c mo35999b(AbstractC10363g abstractC10363g) {
        C9768m.m32346f(abstractC10363g, "kotlinTypeRefiner");
        InterfaceC10318g1 mo36709b = mo35997f().mo36709b(abstractC10363g);
        C9768m.m32345e(mo36709b, "projection.refine(kotlinTypeRefiner)");
        return new C10169c(mo36709b);
    }

    /* renamed from: j */
    public final void m36003j(C10366j c10366j) {
        this.f39553b = c10366j;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
    /* renamed from: o */
    public AbstractC9881h mo36004o() {
        AbstractC9881h mo36004o = mo35997f().getType().mo35993O0().mo36004o();
        C9768m.m32345e(mo36004o, "projection.type.constructor.builtIns");
        return mo36004o;
    }

    public String toString() {
        return "CapturedTypeConstructor(" + mo35997f() + ')';
    }
}
