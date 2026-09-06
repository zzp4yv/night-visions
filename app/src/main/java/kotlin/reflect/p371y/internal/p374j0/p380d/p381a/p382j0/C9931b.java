package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0;

import java.util.Collection;
import java.util.Map;
import kotlin.collections.C10777q0;
import kotlin.collections.C10780s;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9757g0;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.C9786y;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.InterfaceC9948g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9957g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9986a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9988b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10178g;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10296m;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10292i;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;

/* compiled from: JavaAnnotationMapper.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.j0.b */
/* loaded from: classes2.dex */
public class C9931b implements InterfaceC10583c, InterfaceC9948g {

    /* renamed from: a */
    static final /* synthetic */ KProperty<Object>[] f37899a = {C9757g0.m32304h(new C9786y(C9757g0.m32298b(C9931b.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};

    /* renamed from: b */
    private final C10127c f37900b;

    /* renamed from: c */
    private final InterfaceC10708z0 f37901c;

    /* renamed from: d */
    private final InterfaceC10292i f37902d;

    /* renamed from: e */
    private final InterfaceC9988b f37903e;

    /* renamed from: f */
    private final boolean f37904f;

    /* compiled from: JavaAnnotationMapper.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.j0.b$a */
    static final class a extends Lambda implements Function0<AbstractC10335m0> {

        /* renamed from: f */
        final /* synthetic */ C9957g f37905f;

        /* renamed from: g */
        final /* synthetic */ C9931b f37906g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C9957g c9957g, C9931b c9931b) {
            super(0);
            this.f37905f = c9957g;
            this.f37906g = c9931b;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10335m0 invoke() {
            AbstractC10335m0 mo36400s = this.f37905f.m33285d().mo37021o().m32797o(this.f37906g.mo33162d()).mo36400s();
            C9768m.m32345e(mo36400s, "c.module.builtIns.getBui…qName(fqName).defaultType");
            return mo36400s;
        }
    }

    public C9931b(C9957g c9957g, InterfaceC9986a interfaceC9986a, C10127c c10127c) {
        InterfaceC10708z0 interfaceC10708z0;
        Collection<InterfaceC9988b> mo33570b;
        C9768m.m32346f(c9957g, "c");
        C9768m.m32346f(c10127c, "fqName");
        this.f37900b = c10127c;
        if (interfaceC9986a == null || (interfaceC10708z0 = c9957g.m33282a().m33260t().mo33569a(interfaceC9986a)) == null) {
            interfaceC10708z0 = InterfaceC10708z0.f41247a;
            C9768m.m32345e(interfaceC10708z0, "NO_SOURCE");
        }
        this.f37901c = interfaceC10708z0;
        this.f37902d = c9957g.m33286e().mo36516d(new a(c9957g, this));
        this.f37903e = (interfaceC9986a == null || (mo33570b = interfaceC9986a.mo33570b()) == null) ? null : (InterfaceC9988b) C10780s.m38831V(mo33570b);
        this.f37904f = interfaceC9986a != null && interfaceC9986a.mo33572g();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c
    /* renamed from: a */
    public Map<C10130f, AbstractC10178g<?>> mo33159a() {
        Map<C10130f, AbstractC10178g<?>> m38797i;
        m38797i = C10777q0.m38797i();
        return m38797i;
    }

    /* renamed from: b */
    protected final InterfaceC9988b m33160b() {
        return this.f37903e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC10335m0 getType() {
        return (AbstractC10335m0) C10296m.m36555a(this.f37902d, this, f37899a[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c
    /* renamed from: d */
    public C10127c mo33162d() {
        return this.f37900b;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.InterfaceC9948g
    /* renamed from: g */
    public boolean mo33163g() {
        return this.f37904f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c
    /* renamed from: t */
    public InterfaceC10708z0 mo33164t() {
        return this.f37901c;
    }
}
