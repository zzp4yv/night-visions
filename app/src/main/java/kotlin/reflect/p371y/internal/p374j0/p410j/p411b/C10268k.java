package kotlin.reflect.p371y.internal.p374j0.p410j.p411b;

import java.util.List;
import kotlin.collections.C10782t;
import kotlin.collections.C10784u;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10568j0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10571k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10574l0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10597a;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10598b;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10599c;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10601e;
import kotlin.reflect.jvm.internal.impl.protobuf.C10714f;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9907c;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.AbstractC10116a;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10122g;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10123h;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10118c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10178g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p407v.InterfaceC10209a;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10256f;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10340o;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10431z0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10368l;
import okhttp3.internal.http2.Http2;

/* compiled from: context.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.k */
/* loaded from: classes3.dex */
public final class C10268k {

    /* renamed from: a */
    private final InterfaceC10297n f39911a;

    /* renamed from: b */
    private final InterfaceC10559g0 f39912b;

    /* renamed from: c */
    private final InterfaceC10269l f39913c;

    /* renamed from: d */
    private final InterfaceC10265h f39914d;

    /* renamed from: e */
    private final InterfaceC10239c<InterfaceC10583c, AbstractC10178g<?>> f39915e;

    /* renamed from: f */
    private final InterfaceC10574l0 f39916f;

    /* renamed from: g */
    private final InterfaceC10279v f39917g;

    /* renamed from: h */
    private final InterfaceC10275r f39918h;

    /* renamed from: i */
    private final InterfaceC9907c f39919i;

    /* renamed from: j */
    private final InterfaceC10276s f39920j;

    /* renamed from: k */
    private final Iterable<InterfaceC10598b> f39921k;

    /* renamed from: l */
    private final C10568j0 f39922l;

    /* renamed from: m */
    private final InterfaceC10267j f39923m;

    /* renamed from: n */
    private final InterfaceC10597a f39924n;

    /* renamed from: o */
    private final InterfaceC10599c f39925o;

    /* renamed from: p */
    private final C10714f f39926p;

    /* renamed from: q */
    private final InterfaceC10368l f39927q;

    /* renamed from: r */
    private final InterfaceC10209a f39928r;

    /* renamed from: s */
    private final InterfaceC10601e f39929s;

    /* renamed from: t */
    private final List<InterfaceC10431z0> f39930t;

    /* renamed from: u */
    private final C10266i f39931u;

    /* JADX WARN: Multi-variable type inference failed */
    public C10268k(InterfaceC10297n interfaceC10297n, InterfaceC10559g0 interfaceC10559g0, InterfaceC10269l interfaceC10269l, InterfaceC10265h interfaceC10265h, InterfaceC10239c<? extends InterfaceC10583c, ? extends AbstractC10178g<?>> interfaceC10239c, InterfaceC10574l0 interfaceC10574l0, InterfaceC10279v interfaceC10279v, InterfaceC10275r interfaceC10275r, InterfaceC9907c interfaceC9907c, InterfaceC10276s interfaceC10276s, Iterable<? extends InterfaceC10598b> iterable, C10568j0 c10568j0, InterfaceC10267j interfaceC10267j, InterfaceC10597a interfaceC10597a, InterfaceC10599c interfaceC10599c, C10714f c10714f, InterfaceC10368l interfaceC10368l, InterfaceC10209a interfaceC10209a, InterfaceC10601e interfaceC10601e, List<? extends InterfaceC10431z0> list) {
        C9768m.m32346f(interfaceC10297n, "storageManager");
        C9768m.m32346f(interfaceC10559g0, "moduleDescriptor");
        C9768m.m32346f(interfaceC10269l, "configuration");
        C9768m.m32346f(interfaceC10265h, "classDataFinder");
        C9768m.m32346f(interfaceC10239c, "annotationAndConstantLoader");
        C9768m.m32346f(interfaceC10574l0, "packageFragmentProvider");
        C9768m.m32346f(interfaceC10279v, "localClassifierTypeSettings");
        C9768m.m32346f(interfaceC10275r, "errorReporter");
        C9768m.m32346f(interfaceC9907c, "lookupTracker");
        C9768m.m32346f(interfaceC10276s, "flexibleTypeDeserializer");
        C9768m.m32346f(iterable, "fictitiousClassDescriptorFactories");
        C9768m.m32346f(c10568j0, "notFoundClasses");
        C9768m.m32346f(interfaceC10267j, "contractDeserializer");
        C9768m.m32346f(interfaceC10597a, "additionalClassPartsProvider");
        C9768m.m32346f(interfaceC10599c, "platformDependentDeclarationFilter");
        C9768m.m32346f(c10714f, "extensionRegistryLite");
        C9768m.m32346f(interfaceC10368l, "kotlinTypeChecker");
        C9768m.m32346f(interfaceC10209a, "samConversionResolver");
        C9768m.m32346f(interfaceC10601e, "platformDependentTypeTransformer");
        C9768m.m32346f(list, "typeAttributeTranslators");
        this.f39911a = interfaceC10297n;
        this.f39912b = interfaceC10559g0;
        this.f39913c = interfaceC10269l;
        this.f39914d = interfaceC10265h;
        this.f39915e = interfaceC10239c;
        this.f39916f = interfaceC10574l0;
        this.f39917g = interfaceC10279v;
        this.f39918h = interfaceC10275r;
        this.f39919i = interfaceC9907c;
        this.f39920j = interfaceC10276s;
        this.f39921k = iterable;
        this.f39922l = c10568j0;
        this.f39923m = interfaceC10267j;
        this.f39924n = interfaceC10597a;
        this.f39925o = interfaceC10599c;
        this.f39926p = c10714f;
        this.f39927q = interfaceC10368l;
        this.f39928r = interfaceC10209a;
        this.f39929s = interfaceC10601e;
        this.f39930t = list;
        this.f39931u = new C10266i(this);
    }

    /* renamed from: a */
    public final C10270m m36416a(InterfaceC10571k0 interfaceC10571k0, InterfaceC10118c interfaceC10118c, C10122g c10122g, C10123h c10123h, AbstractC10116a abstractC10116a, InterfaceC10256f interfaceC10256f) {
        C9768m.m32346f(interfaceC10571k0, "descriptor");
        C9768m.m32346f(interfaceC10118c, "nameResolver");
        C9768m.m32346f(c10122g, "typeTable");
        C9768m.m32346f(c10123h, "versionRequirementTable");
        C9768m.m32346f(abstractC10116a, "metadataVersion");
        return new C10270m(this, interfaceC10118c, interfaceC10571k0, c10122g, c10123h, abstractC10116a, interfaceC10256f, null, C10784u.m38888j());
    }

    /* renamed from: b */
    public final InterfaceC10552e m36417b(C10126b c10126b) {
        C9768m.m32346f(c10126b, "classId");
        return C10266i.m36408e(this.f39931u, c10126b, null, 2, null);
    }

    /* renamed from: c */
    public final InterfaceC10597a m36418c() {
        return this.f39924n;
    }

    /* renamed from: d */
    public final InterfaceC10239c<InterfaceC10583c, AbstractC10178g<?>> m36419d() {
        return this.f39915e;
    }

    /* renamed from: e */
    public final InterfaceC10265h m36420e() {
        return this.f39914d;
    }

    /* renamed from: f */
    public final C10266i m36421f() {
        return this.f39931u;
    }

    /* renamed from: g */
    public final InterfaceC10269l m36422g() {
        return this.f39913c;
    }

    /* renamed from: h */
    public final InterfaceC10267j m36423h() {
        return this.f39923m;
    }

    /* renamed from: i */
    public final InterfaceC10275r m36424i() {
        return this.f39918h;
    }

    /* renamed from: j */
    public final C10714f m36425j() {
        return this.f39926p;
    }

    /* renamed from: k */
    public final Iterable<InterfaceC10598b> m36426k() {
        return this.f39921k;
    }

    /* renamed from: l */
    public final InterfaceC10276s m36427l() {
        return this.f39920j;
    }

    /* renamed from: m */
    public final InterfaceC10368l m36428m() {
        return this.f39927q;
    }

    /* renamed from: n */
    public final InterfaceC10279v m36429n() {
        return this.f39917g;
    }

    /* renamed from: o */
    public final InterfaceC9907c m36430o() {
        return this.f39919i;
    }

    /* renamed from: p */
    public final InterfaceC10559g0 m36431p() {
        return this.f39912b;
    }

    /* renamed from: q */
    public final C10568j0 m36432q() {
        return this.f39922l;
    }

    /* renamed from: r */
    public final InterfaceC10574l0 m36433r() {
        return this.f39916f;
    }

    /* renamed from: s */
    public final InterfaceC10599c m36434s() {
        return this.f39925o;
    }

    /* renamed from: t */
    public final InterfaceC10601e m36435t() {
        return this.f39929s;
    }

    /* renamed from: u */
    public final InterfaceC10297n m36436u() {
        return this.f39911a;
    }

    /* renamed from: v */
    public final List<InterfaceC10431z0> m36437v() {
        return this.f39930t;
    }

    public /* synthetic */ C10268k(InterfaceC10297n interfaceC10297n, InterfaceC10559g0 interfaceC10559g0, InterfaceC10269l interfaceC10269l, InterfaceC10265h interfaceC10265h, InterfaceC10239c interfaceC10239c, InterfaceC10574l0 interfaceC10574l0, InterfaceC10279v interfaceC10279v, InterfaceC10275r interfaceC10275r, InterfaceC9907c interfaceC9907c, InterfaceC10276s interfaceC10276s, Iterable iterable, C10568j0 c10568j0, InterfaceC10267j interfaceC10267j, InterfaceC10597a interfaceC10597a, InterfaceC10599c interfaceC10599c, C10714f c10714f, InterfaceC10368l interfaceC10368l, InterfaceC10209a interfaceC10209a, InterfaceC10601e interfaceC10601e, List list, int i2, C9756g c9756g) {
        this(interfaceC10297n, interfaceC10559g0, interfaceC10269l, interfaceC10265h, interfaceC10239c, interfaceC10574l0, interfaceC10279v, interfaceC10275r, interfaceC9907c, interfaceC10276s, iterable, c10568j0, interfaceC10267j, (i2 & 8192) != 0 ? InterfaceC10597a.a.f40889a : interfaceC10597a, (i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? InterfaceC10599c.a.f40890a : interfaceC10599c, c10714f, (65536 & i2) != 0 ? InterfaceC10368l.f40201b.m36950a() : interfaceC10368l, interfaceC10209a, (262144 & i2) != 0 ? InterfaceC10601e.a.f40893a : interfaceC10601e, (i2 & 524288) != 0 ? C10782t.m38883e(C10340o.f40157a) : list);
    }
}
