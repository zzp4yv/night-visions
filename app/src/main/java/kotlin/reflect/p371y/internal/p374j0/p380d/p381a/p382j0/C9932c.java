package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0;

import java.util.Map;
import kotlin.C10740s;
import kotlin.collections.C10777q0;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9884k;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9912a0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9957g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C9966e;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9986a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9992d;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;

/* compiled from: JavaAnnotationMapper.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.j0.c */
/* loaded from: classes2.dex */
public final class C9932c {

    /* renamed from: a */
    public static final C9932c f37907a = new C9932c();

    /* renamed from: b */
    private static final C10130f f37908b;

    /* renamed from: c */
    private static final C10130f f37909c;

    /* renamed from: d */
    private static final C10130f f37910d;

    /* renamed from: e */
    private static final Map<C10127c, C10127c> f37911e;

    static {
        Map<C10127c, C10127c> m38800l;
        C10130f m35454x = C10130f.m35454x("message");
        C9768m.m32345e(m35454x, "identifier(\"message\")");
        f37908b = m35454x;
        C10130f m35454x2 = C10130f.m35454x("allowedTargets");
        C9768m.m32345e(m35454x2, "identifier(\"allowedTargets\")");
        f37909c = m35454x2;
        C10130f m35454x3 = C10130f.m35454x("value");
        C9768m.m32345e(m35454x3, "identifier(\"value\")");
        f37910d = m35454x3;
        m38800l = C10777q0.m38800l(C10740s.m38547a(C9884k.a.f37538H, C9912a0.f37789d), C10740s.m38547a(C9884k.a.f37545L, C9912a0.f37791f), C10740s.m38547a(C9884k.a.f37549P, C9912a0.f37794i));
        f37911e = m38800l;
    }

    private C9932c() {
    }

    /* renamed from: f */
    public static /* synthetic */ InterfaceC10583c m33166f(C9932c c9932c, InterfaceC9986a interfaceC9986a, C9957g c9957g, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return c9932c.m33171e(interfaceC9986a, c9957g, z);
    }

    /* renamed from: a */
    public final InterfaceC10583c m33167a(C10127c c10127c, InterfaceC9992d interfaceC9992d, C9957g c9957g) {
        InterfaceC9986a mo33582l;
        C9768m.m32346f(c10127c, "kotlinName");
        C9768m.m32346f(interfaceC9992d, "annotationOwner");
        C9768m.m32346f(c9957g, "c");
        if (C9768m.m32341a(c10127c, C9884k.a.f37608y)) {
            C10127c c10127c2 = C9912a0.f37793h;
            C9768m.m32345e(c10127c2, "DEPRECATED_ANNOTATION");
            InterfaceC9986a mo33582l2 = interfaceC9992d.mo33582l(c10127c2);
            if (mo33582l2 != null || interfaceC9992d.mo33583m()) {
                return new C9934e(mo33582l2, c9957g);
            }
        }
        C10127c c10127c3 = f37911e.get(c10127c);
        if (c10127c3 == null || (mo33582l = interfaceC9992d.mo33582l(c10127c3)) == null) {
            return null;
        }
        return m33166f(f37907a, mo33582l, c9957g, false, 4, null);
    }

    /* renamed from: b */
    public final C10130f m33168b() {
        return f37908b;
    }

    /* renamed from: c */
    public final C10130f m33169c() {
        return f37910d;
    }

    /* renamed from: d */
    public final C10130f m33170d() {
        return f37909c;
    }

    /* renamed from: e */
    public final InterfaceC10583c m33171e(InterfaceC9986a interfaceC9986a, C9957g c9957g, boolean z) {
        C9768m.m32346f(interfaceC9986a, "annotation");
        C9768m.m32346f(c9957g, "c");
        C10126b mo33571e = interfaceC9986a.mo33571e();
        if (C9768m.m32341a(mo33571e, C10126b.m35408m(C9912a0.f37789d))) {
            return new C9938i(interfaceC9986a, c9957g);
        }
        if (C9768m.m32341a(mo33571e, C10126b.m35408m(C9912a0.f37791f))) {
            return new C9937h(interfaceC9986a, c9957g);
        }
        if (C9768m.m32341a(mo33571e, C10126b.m35408m(C9912a0.f37794i))) {
            return new C9931b(c9957g, interfaceC9986a, C9884k.a.f37549P);
        }
        if (C9768m.m32341a(mo33571e, C10126b.m35408m(C9912a0.f37793h))) {
            return null;
        }
        return new C9966e(c9957g, interfaceC9986a, z);
    }
}
