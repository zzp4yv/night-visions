package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0;

import kotlin.Lazy;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C10045x;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p386m.C9977c;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;

/* compiled from: context.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.g */
/* loaded from: classes2.dex */
public final class C9957g {

    /* renamed from: a */
    private final C9952b f37998a;

    /* renamed from: b */
    private final InterfaceC9961k f37999b;

    /* renamed from: c */
    private final Lazy<C10045x> f38000c;

    /* renamed from: d */
    private final Lazy f38001d;

    /* renamed from: e */
    private final C9977c f38002e;

    public C9957g(C9952b c9952b, InterfaceC9961k interfaceC9961k, Lazy<C10045x> lazy) {
        C9768m.m32346f(c9952b, "components");
        C9768m.m32346f(interfaceC9961k, "typeParameterResolver");
        C9768m.m32346f(lazy, "delegateForDefaultTypeQualifiers");
        this.f37998a = c9952b;
        this.f37999b = interfaceC9961k;
        this.f38000c = lazy;
        this.f38001d = lazy;
        this.f38002e = new C9977c(this, interfaceC9961k);
    }

    /* renamed from: a */
    public final C9952b m33282a() {
        return this.f37998a;
    }

    /* renamed from: b */
    public final C10045x m33283b() {
        return (C10045x) this.f38001d.getValue();
    }

    /* renamed from: c */
    public final Lazy<C10045x> m33284c() {
        return this.f38000c;
    }

    /* renamed from: d */
    public final InterfaceC10559g0 m33285d() {
        return this.f37998a.m33253m();
    }

    /* renamed from: e */
    public final InterfaceC10297n m33286e() {
        return this.f37998a.m33261u();
    }

    /* renamed from: f */
    public final InterfaceC9961k m33287f() {
        return this.f37999b;
    }

    /* renamed from: g */
    public final C9977c m33288g() {
        return this.f38002e;
    }
}
