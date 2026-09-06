package kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0;

import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10614f;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10092d;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10122g;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10123h;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10118c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;

/* compiled from: DeserializedMemberDescriptor.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.g0.c */
/* loaded from: classes3.dex */
public final class C10253c extends C10614f implements InterfaceC10252b {

    /* renamed from: K */
    private final C10092d f39764K;

    /* renamed from: L */
    private final InterfaceC10118c f39765L;

    /* renamed from: M */
    private final C10122g f39766M;

    /* renamed from: N */
    private final C10123h f39767N;

    /* renamed from: O */
    private final InterfaceC10256f f39768O;

    public /* synthetic */ C10253c(InterfaceC10552e interfaceC10552e, InterfaceC10573l interfaceC10573l, InterfaceC10587g interfaceC10587g, boolean z, InterfaceC10543b.a aVar, C10092d c10092d, InterfaceC10118c interfaceC10118c, C10122g c10122g, C10123h c10123h, InterfaceC10256f interfaceC10256f, InterfaceC10708z0 interfaceC10708z0, int i2, C9756g c9756g) {
        this(interfaceC10552e, interfaceC10573l, interfaceC10587g, z, aVar, c10092d, interfaceC10118c, c10122g, c10123h, interfaceC10256f, (i2 & 1024) != 0 ? null : interfaceC10708z0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10633p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y
    /* renamed from: P */
    public boolean mo32908P() {
        return false;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10257g
    /* renamed from: T */
    public C10122g mo36258T() {
        return this.f39766M;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10257g
    /* renamed from: Z */
    public InterfaceC10118c mo36259Z() {
        return this.f39765L;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10257g
    /* renamed from: c0 */
    public InterfaceC10256f mo36260c0() {
        return this.f39768O;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10633p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10633p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y
    public boolean isSuspend() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10614f
    /* renamed from: t1, reason: merged with bridge method [inline-methods] */
    public C10253c mo32906M0(InterfaceC10576m interfaceC10576m, InterfaceC10705y interfaceC10705y, InterfaceC10543b.a aVar, C10130f c10130f, InterfaceC10587g interfaceC10587g, InterfaceC10708z0 interfaceC10708z0) {
        C9768m.m32346f(interfaceC10576m, "newOwner");
        C9768m.m32346f(aVar, "kind");
        C9768m.m32346f(interfaceC10587g, "annotations");
        C9768m.m32346f(interfaceC10708z0, "source");
        C10253c c10253c = new C10253c((InterfaceC10552e) interfaceC10576m, (InterfaceC10573l) interfaceC10705y, interfaceC10587g, this.f40971J, aVar, mo36257E(), mo36259Z(), mo36258T(), m36263v1(), mo36260c0(), interfaceC10708z0);
        c10253c.mo33206Z0(mo33205R0());
        return c10253c;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10257g
    /* renamed from: u1, reason: merged with bridge method [inline-methods] */
    public C10092d mo36257E() {
        return this.f39764K;
    }

    /* renamed from: v1 */
    public C10123h m36263v1() {
        return this.f39767N;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10633p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    /* renamed from: z */
    public boolean mo32885z() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10253c(InterfaceC10552e interfaceC10552e, InterfaceC10573l interfaceC10573l, InterfaceC10587g interfaceC10587g, boolean z, InterfaceC10543b.a aVar, C10092d c10092d, InterfaceC10118c interfaceC10118c, C10122g c10122g, C10123h c10123h, InterfaceC10256f interfaceC10256f, InterfaceC10708z0 interfaceC10708z0) {
        super(interfaceC10552e, interfaceC10573l, interfaceC10587g, z, aVar, interfaceC10708z0 == null ? InterfaceC10708z0.f41247a : interfaceC10708z0);
        C9768m.m32346f(interfaceC10552e, "containingDeclaration");
        C9768m.m32346f(interfaceC10587g, "annotations");
        C9768m.m32346f(aVar, "kind");
        C9768m.m32346f(c10092d, "proto");
        C9768m.m32346f(interfaceC10118c, "nameResolver");
        C9768m.m32346f(c10122g, "typeTable");
        C9768m.m32346f(c10123h, "versionRequirementTable");
        this.f39764K = c10092d;
        this.f39765L = interfaceC10118c;
        this.f39766M = c10122g;
        this.f39767N = c10123h;
        this.f39768O = interfaceC10256f;
    }
}
