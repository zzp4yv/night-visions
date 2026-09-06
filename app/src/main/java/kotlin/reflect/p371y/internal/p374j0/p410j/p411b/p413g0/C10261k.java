package kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0;

import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10706y0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10633p;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10617g0;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10097i;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10122g;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10123h;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10118c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;

/* compiled from: DeserializedMemberDescriptor.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.g0.k */
/* loaded from: classes3.dex */
public final class C10261k extends C10617g0 implements InterfaceC10252b {

    /* renamed from: J */
    private final C10097i f39881J;

    /* renamed from: K */
    private final InterfaceC10118c f39882K;

    /* renamed from: L */
    private final C10122g f39883L;

    /* renamed from: M */
    private final C10123h f39884M;

    /* renamed from: N */
    private final InterfaceC10256f f39885N;

    public /* synthetic */ C10261k(InterfaceC10576m interfaceC10576m, InterfaceC10706y0 interfaceC10706y0, InterfaceC10587g interfaceC10587g, C10130f c10130f, InterfaceC10543b.a aVar, C10097i c10097i, InterfaceC10118c interfaceC10118c, C10122g c10122g, C10123h c10123h, InterfaceC10256f interfaceC10256f, InterfaceC10708z0 interfaceC10708z0, int i2, C9756g c9756g) {
        this(interfaceC10576m, interfaceC10706y0, interfaceC10587g, c10130f, aVar, c10097i, interfaceC10118c, c10122g, c10123h, interfaceC10256f, (i2 & 1024) != 0 ? null : interfaceC10708z0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10617g0, kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10633p
    /* renamed from: M0 */
    protected AbstractC10633p mo32906M0(InterfaceC10576m interfaceC10576m, InterfaceC10705y interfaceC10705y, InterfaceC10543b.a aVar, C10130f c10130f, InterfaceC10587g interfaceC10587g, InterfaceC10708z0 interfaceC10708z0) {
        C10130f c10130f2;
        C9768m.m32346f(interfaceC10576m, "newOwner");
        C9768m.m32346f(aVar, "kind");
        C9768m.m32346f(interfaceC10587g, "annotations");
        C9768m.m32346f(interfaceC10708z0, "source");
        InterfaceC10706y0 interfaceC10706y0 = (InterfaceC10706y0) interfaceC10705y;
        if (c10130f == null) {
            C10130f name = getName();
            C9768m.m32345e(name, "name");
            c10130f2 = name;
        } else {
            c10130f2 = c10130f;
        }
        C10261k c10261k = new C10261k(interfaceC10576m, interfaceC10706y0, interfaceC10587g, c10130f2, aVar, mo36257E(), mo36259Z(), mo36258T(), m36389r1(), mo36260c0(), interfaceC10708z0);
        c10261k.mo33206Z0(mo33205R0());
        return c10261k;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10257g
    /* renamed from: T */
    public C10122g mo36258T() {
        return this.f39883L;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10257g
    /* renamed from: Z */
    public InterfaceC10118c mo36259Z() {
        return this.f39882K;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10257g
    /* renamed from: c0 */
    public InterfaceC10256f mo36260c0() {
        return this.f39885N;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10257g
    /* renamed from: q1, reason: merged with bridge method [inline-methods] */
    public C10097i mo36257E() {
        return this.f39881J;
    }

    /* renamed from: r1 */
    public C10123h m36389r1() {
        return this.f39884M;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10261k(InterfaceC10576m interfaceC10576m, InterfaceC10706y0 interfaceC10706y0, InterfaceC10587g interfaceC10587g, C10130f c10130f, InterfaceC10543b.a aVar, C10097i c10097i, InterfaceC10118c interfaceC10118c, C10122g c10122g, C10123h c10123h, InterfaceC10256f interfaceC10256f, InterfaceC10708z0 interfaceC10708z0) {
        super(interfaceC10576m, interfaceC10706y0, interfaceC10587g, c10130f, aVar, interfaceC10708z0 == null ? InterfaceC10708z0.f41247a : interfaceC10708z0);
        C9768m.m32346f(interfaceC10576m, "containingDeclaration");
        C9768m.m32346f(interfaceC10587g, "annotations");
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(aVar, "kind");
        C9768m.m32346f(c10097i, "proto");
        C9768m.m32346f(interfaceC10118c, "nameResolver");
        C9768m.m32346f(c10122g, "typeTable");
        C9768m.m32346f(c10123h, "versionRequirementTable");
        this.f39881J = c10097i;
        this.f39882K = interfaceC10118c;
        this.f39883L = c10122g;
        this.f39884M = c10123h;
        this.f39885N = interfaceC10256f;
    }
}
