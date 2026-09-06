package kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10697u;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10550d0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10609c0;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10102n;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10117b;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10122g;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10123h;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10118c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;

/* compiled from: DeserializedMemberDescriptor.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.g0.j */
/* loaded from: classes3.dex */
public final class C10260j extends C10609c0 implements InterfaceC10252b {

    /* renamed from: H */
    private final C10102n f39876H;

    /* renamed from: I */
    private final InterfaceC10118c f39877I;

    /* renamed from: J */
    private final C10122g f39878J;

    /* renamed from: K */
    private final C10123h f39879K;

    /* renamed from: L */
    private final InterfaceC10256f f39880L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10260j(InterfaceC10576m interfaceC10576m, InterfaceC10696t0 interfaceC10696t0, InterfaceC10587g interfaceC10587g, EnumC10550d0 enumC10550d0, AbstractC10697u abstractC10697u, boolean z, C10130f c10130f, InterfaceC10543b.a aVar, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, C10102n c10102n, InterfaceC10118c interfaceC10118c, C10122g c10122g, C10123h c10123h, InterfaceC10256f interfaceC10256f) {
        super(interfaceC10576m, interfaceC10696t0, interfaceC10587g, enumC10550d0, abstractC10697u, z, c10130f, aVar, InterfaceC10708z0.f41247a, z2, z3, z6, false, z4, z5);
        C9768m.m32346f(interfaceC10576m, "containingDeclaration");
        C9768m.m32346f(interfaceC10587g, "annotations");
        C9768m.m32346f(enumC10550d0, "modality");
        C9768m.m32346f(abstractC10697u, "visibility");
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(aVar, "kind");
        C9768m.m32346f(c10102n, "proto");
        C9768m.m32346f(interfaceC10118c, "nameResolver");
        C9768m.m32346f(c10122g, "typeTable");
        C9768m.m32346f(c10123h, "versionRequirementTable");
        this.f39876H = c10102n;
        this.f39877I = interfaceC10118c;
        this.f39878J = c10122g;
        this.f39879K = c10123h;
        this.f39880L = interfaceC10256f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10609c0
    /* renamed from: Q0 */
    protected C10609c0 mo33222Q0(InterfaceC10576m interfaceC10576m, EnumC10550d0 enumC10550d0, AbstractC10697u abstractC10697u, InterfaceC10696t0 interfaceC10696t0, InterfaceC10543b.a aVar, C10130f c10130f, InterfaceC10708z0 interfaceC10708z0) {
        C9768m.m32346f(interfaceC10576m, "newOwner");
        C9768m.m32346f(enumC10550d0, "newModality");
        C9768m.m32346f(abstractC10697u, "newVisibility");
        C9768m.m32346f(aVar, "kind");
        C9768m.m32346f(c10130f, "newName");
        C9768m.m32346f(interfaceC10708z0, "source");
        return new C10260j(interfaceC10576m, interfaceC10696t0, getAnnotations(), enumC10550d0, abstractC10697u, mo37031j0(), c10130f, aVar, mo37036s0(), isConst(), mo32885z(), mo37025O(), mo32863M(), mo36257E(), mo36259Z(), mo36258T(), m36387h1(), mo36260c0());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10257g
    /* renamed from: T */
    public C10122g mo36258T() {
        return this.f39878J;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10257g
    /* renamed from: Z */
    public InterfaceC10118c mo36259Z() {
        return this.f39877I;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10257g
    /* renamed from: c0 */
    public InterfaceC10256f mo36260c0() {
        return this.f39880L;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10257g
    /* renamed from: g1, reason: merged with bridge method [inline-methods] */
    public C10102n mo36257E() {
        return this.f39876H;
    }

    /* renamed from: h1 */
    public C10123h m36387h1() {
        return this.f39879K;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10609c0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    /* renamed from: z */
    public boolean mo32885z() {
        Boolean mo35368d = C10117b.f39192D.mo35368d(mo36257E().m34885b0());
        C9768m.m32345e(mo35368d, "IS_EXTERNAL_PROPERTY.get(proto.flags)");
        return mo35368d.booleanValue();
    }
}
