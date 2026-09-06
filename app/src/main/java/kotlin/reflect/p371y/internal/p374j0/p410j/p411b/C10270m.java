package kotlin.reflect.p371y.internal.p374j0.p410j.p411b;

import java.util.List;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10107s;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.AbstractC10116a;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10122g;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10123h;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10124i;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10118c;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10256f;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;

/* compiled from: context.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.m */
/* loaded from: classes3.dex */
public final class C10270m {

    /* renamed from: a */
    private final C10268k f39933a;

    /* renamed from: b */
    private final InterfaceC10118c f39934b;

    /* renamed from: c */
    private final InterfaceC10576m f39935c;

    /* renamed from: d */
    private final C10122g f39936d;

    /* renamed from: e */
    private final C10123h f39937e;

    /* renamed from: f */
    private final AbstractC10116a f39938f;

    /* renamed from: g */
    private final InterfaceC10256f f39939g;

    /* renamed from: h */
    private final C10242d0 f39940h;

    /* renamed from: i */
    private final C10280w f39941i;

    public C10270m(C10268k c10268k, InterfaceC10118c interfaceC10118c, InterfaceC10576m interfaceC10576m, C10122g c10122g, C10123h c10123h, AbstractC10116a abstractC10116a, InterfaceC10256f interfaceC10256f, C10242d0 c10242d0, List<C10107s> list) {
        String mo33981c;
        C9768m.m32346f(c10268k, "components");
        C9768m.m32346f(interfaceC10118c, "nameResolver");
        C9768m.m32346f(interfaceC10576m, "containingDeclaration");
        C9768m.m32346f(c10122g, "typeTable");
        C9768m.m32346f(c10123h, "versionRequirementTable");
        C9768m.m32346f(abstractC10116a, "metadataVersion");
        C9768m.m32346f(list, "typeParameters");
        this.f39933a = c10268k;
        this.f39934b = interfaceC10118c;
        this.f39935c = interfaceC10576m;
        this.f39936d = c10122g;
        this.f39937e = c10123h;
        this.f39938f = abstractC10116a;
        this.f39939g = interfaceC10256f;
        this.f39940h = new C10242d0(this, c10242d0, list, "Deserializer for \"" + interfaceC10576m.getName() + '\"', (interfaceC10256f == null || (mo33981c = interfaceC10256f.mo33981c()) == null) ? "[container not found]" : mo33981c);
        this.f39941i = new C10280w(this);
    }

    /* renamed from: b */
    public static /* synthetic */ C10270m m36450b(C10270m c10270m, InterfaceC10576m interfaceC10576m, List list, InterfaceC10118c interfaceC10118c, C10122g c10122g, C10123h c10123h, AbstractC10116a abstractC10116a, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            interfaceC10118c = c10270m.f39934b;
        }
        InterfaceC10118c interfaceC10118c2 = interfaceC10118c;
        if ((i2 & 8) != 0) {
            c10122g = c10270m.f39936d;
        }
        C10122g c10122g2 = c10122g;
        if ((i2 & 16) != 0) {
            c10123h = c10270m.f39937e;
        }
        C10123h c10123h2 = c10123h;
        if ((i2 & 32) != 0) {
            abstractC10116a = c10270m.f39938f;
        }
        return c10270m.m36451a(interfaceC10576m, list, interfaceC10118c2, c10122g2, c10123h2, abstractC10116a);
    }

    /* renamed from: a */
    public final C10270m m36451a(InterfaceC10576m interfaceC10576m, List<C10107s> list, InterfaceC10118c interfaceC10118c, C10122g c10122g, C10123h c10123h, AbstractC10116a abstractC10116a) {
        C9768m.m32346f(interfaceC10576m, "descriptor");
        C9768m.m32346f(list, "typeParameterProtos");
        C9768m.m32346f(interfaceC10118c, "nameResolver");
        C9768m.m32346f(c10122g, "typeTable");
        C10123h c10123h2 = c10123h;
        C9768m.m32346f(c10123h2, "versionRequirementTable");
        C9768m.m32346f(abstractC10116a, "metadataVersion");
        C10268k c10268k = this.f39933a;
        if (!C10124i.m35404b(abstractC10116a)) {
            c10123h2 = this.f39937e;
        }
        return new C10270m(c10268k, interfaceC10118c, interfaceC10576m, c10122g, c10123h2, abstractC10116a, this.f39939g, this.f39940h, list);
    }

    /* renamed from: c */
    public final C10268k m36452c() {
        return this.f39933a;
    }

    /* renamed from: d */
    public final InterfaceC10256f m36453d() {
        return this.f39939g;
    }

    /* renamed from: e */
    public final InterfaceC10576m m36454e() {
        return this.f39935c;
    }

    /* renamed from: f */
    public final C10280w m36455f() {
        return this.f39941i;
    }

    /* renamed from: g */
    public final InterfaceC10118c m36456g() {
        return this.f39934b;
    }

    /* renamed from: h */
    public final InterfaceC10297n m36457h() {
        return this.f39933a.m36436u();
    }

    /* renamed from: i */
    public final C10242d0 m36458i() {
        return this.f39940h;
    }

    /* renamed from: j */
    public final C10122g m36459j() {
        return this.f39936d;
    }

    /* renamed from: k */
    public final C10123h m36460k() {
        return this.f39937e;
    }
}
