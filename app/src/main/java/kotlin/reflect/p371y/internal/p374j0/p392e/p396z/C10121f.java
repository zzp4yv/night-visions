package kotlin.reflect.p371y.internal.p374j0.p392e.p396z;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10786v;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10091c;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10097i;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10102n;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10105q;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10106r;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10107s;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10109u;

/* compiled from: protoTypeTableUtil.kt */
/* renamed from: kotlin.f0.y.e.j0.e.z.f */
/* loaded from: classes3.dex */
public final class C10121f {
    /* renamed from: a */
    public static final C10105q m35382a(C10105q c10105q, C10122g c10122g) {
        C9768m.m32346f(c10105q, "<this>");
        C9768m.m32346f(c10122g, "typeTable");
        if (c10105q.m35045k0()) {
            return c10105q.m35028R();
        }
        if (c10105q.m35046l0()) {
            return c10122g.m35399a(c10105q.m35029S());
        }
        return null;
    }

    /* renamed from: b */
    public static final C10105q m35383b(C10106r c10106r, C10122g c10122g) {
        C9768m.m32346f(c10106r, "<this>");
        C9768m.m32346f(c10122g, "typeTable");
        if (c10106r.m35145e0()) {
            C10105q m35135T = c10106r.m35135T();
            C9768m.m32345e(m35135T, "expandedType");
            return m35135T;
        }
        if (c10106r.m35146f0()) {
            return c10122g.m35399a(c10106r.m35136U());
        }
        throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias".toString());
    }

    /* renamed from: c */
    public static final C10105q m35384c(C10105q c10105q, C10122g c10122g) {
        C9768m.m32346f(c10105q, "<this>");
        C9768m.m32346f(c10122g, "typeTable");
        if (c10105q.m35050p0()) {
            return c10105q.m35037c0();
        }
        if (c10105q.m35051q0()) {
            return c10122g.m35399a(c10105q.m35038d0());
        }
        return null;
    }

    /* renamed from: d */
    public static final boolean m35385d(C10097i c10097i) {
        C9768m.m32346f(c10097i, "<this>");
        return c10097i.m34741w0() || c10097i.m34742x0();
    }

    /* renamed from: e */
    public static final boolean m35386e(C10102n c10102n) {
        C9768m.m32346f(c10102n, "<this>");
        return c10102n.m34903t0() || c10102n.m34904u0();
    }

    /* renamed from: f */
    public static final C10105q m35387f(C10091c c10091c, C10122g c10122g) {
        C9768m.m32346f(c10091c, "<this>");
        C9768m.m32346f(c10122g, "typeTable");
        if (c10091c.m34476p1()) {
            return c10091c.m34444K0();
        }
        if (c10091c.m34477q1()) {
            return c10122g.m35399a(c10091c.m34445L0());
        }
        return null;
    }

    /* renamed from: g */
    public static final C10105q m35388g(C10105q c10105q, C10122g c10122g) {
        C9768m.m32346f(c10105q, "<this>");
        C9768m.m32346f(c10122g, "typeTable");
        if (c10105q.m35053s0()) {
            return c10105q.m35040f0();
        }
        if (c10105q.m35054t0()) {
            return c10122g.m35399a(c10105q.m35041g0());
        }
        return null;
    }

    /* renamed from: h */
    public static final C10105q m35389h(C10097i c10097i, C10122g c10122g) {
        C9768m.m32346f(c10097i, "<this>");
        C9768m.m32346f(c10122g, "typeTable");
        if (c10097i.m34741w0()) {
            return c10097i.m34725g0();
        }
        if (c10097i.m34742x0()) {
            return c10122g.m35399a(c10097i.m34726h0());
        }
        return null;
    }

    /* renamed from: i */
    public static final C10105q m35390i(C10102n c10102n, C10122g c10122g) {
        C9768m.m32346f(c10102n, "<this>");
        C9768m.m32346f(c10122g, "typeTable");
        if (c10102n.m34903t0()) {
            return c10102n.m34889f0();
        }
        if (c10102n.m34904u0()) {
            return c10122g.m35399a(c10102n.m34890g0());
        }
        return null;
    }

    /* renamed from: j */
    public static final C10105q m35391j(C10097i c10097i, C10122g c10122g) {
        C9768m.m32346f(c10097i, "<this>");
        C9768m.m32346f(c10122g, "typeTable");
        if (c10097i.m34743y0()) {
            C10105q m34727i0 = c10097i.m34727i0();
            C9768m.m32345e(m34727i0, "returnType");
            return m34727i0;
        }
        if (c10097i.m34744z0()) {
            return c10122g.m35399a(c10097i.m34728j0());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function".toString());
    }

    /* renamed from: k */
    public static final C10105q m35392k(C10102n c10102n, C10122g c10122g) {
        C9768m.m32346f(c10102n, "<this>");
        C9768m.m32346f(c10122g, "typeTable");
        if (c10102n.m34905v0()) {
            C10105q m34891h0 = c10102n.m34891h0();
            C9768m.m32345e(m34891h0, "returnType");
            return m34891h0;
        }
        if (c10102n.m34906w0()) {
            return c10122g.m35399a(c10102n.m34892i0());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property".toString());
    }

    /* renamed from: l */
    public static final List<C10105q> m35393l(C10091c c10091c, C10122g c10122g) {
        C9768m.m32346f(c10091c, "<this>");
        C9768m.m32346f(c10122g, "typeTable");
        List<C10105q> m34462b1 = c10091c.m34462b1();
        if (!(!m34462b1.isEmpty())) {
            m34462b1 = null;
        }
        if (m34462b1 == null) {
            List<Integer> m34460a1 = c10091c.m34460a1();
            C9768m.m32345e(m34460a1, "supertypeIdList");
            m34462b1 = new ArrayList<>(C10786v.m38911u(m34460a1, 10));
            for (Integer num : m34460a1) {
                C9768m.m32345e(num, "it");
                m34462b1.add(c10122g.m35399a(num.intValue()));
            }
        }
        return m34462b1;
    }

    /* renamed from: m */
    public static final C10105q m35394m(C10105q.b bVar, C10122g c10122g) {
        C9768m.m32346f(bVar, "<this>");
        C9768m.m32346f(c10122g, "typeTable");
        if (bVar.m35069B()) {
            return bVar.m35074y();
        }
        if (bVar.m35070C()) {
            return c10122g.m35399a(bVar.m35075z());
        }
        return null;
    }

    /* renamed from: n */
    public static final C10105q m35395n(C10109u c10109u, C10122g c10122g) {
        C9768m.m32346f(c10109u, "<this>");
        C9768m.m32346f(c10122g, "typeTable");
        if (c10109u.m35265S()) {
            C10105q m35259M = c10109u.m35259M();
            C9768m.m32345e(m35259M, "type");
            return m35259M;
        }
        if (c10109u.m35266T()) {
            return c10122g.m35399a(c10109u.m35260N());
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter".toString());
    }

    /* renamed from: o */
    public static final C10105q m35396o(C10106r c10106r, C10122g c10122g) {
        C9768m.m32346f(c10106r, "<this>");
        C9768m.m32346f(c10122g, "typeTable");
        if (c10106r.m35149i0()) {
            C10105q m35142b0 = c10106r.m35142b0();
            C9768m.m32345e(m35142b0, "underlyingType");
            return m35142b0;
        }
        if (c10106r.m35150j0()) {
            return c10122g.m35399a(c10106r.m35143c0());
        }
        throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias".toString());
    }

    /* renamed from: p */
    public static final List<C10105q> m35397p(C10107s c10107s, C10122g c10122g) {
        C9768m.m32346f(c10107s, "<this>");
        C9768m.m32346f(c10122g, "typeTable");
        List<C10105q> m35192S = c10107s.m35192S();
        if (!(!m35192S.isEmpty())) {
            m35192S = null;
        }
        if (m35192S == null) {
            List<Integer> m35191R = c10107s.m35191R();
            C9768m.m32345e(m35191R, "upperBoundIdList");
            m35192S = new ArrayList<>(C10786v.m38911u(m35191R, 10));
            for (Integer num : m35191R) {
                C9768m.m32345e(num, "it");
                m35192S.add(c10122g.m35399a(num.intValue()));
            }
        }
        return m35192S;
    }

    /* renamed from: q */
    public static final C10105q m35398q(C10109u c10109u, C10122g c10122g) {
        C9768m.m32346f(c10109u, "<this>");
        C9768m.m32346f(c10122g, "typeTable");
        if (c10109u.m35267U()) {
            return c10109u.m35261O();
        }
        if (c10109u.m35268V()) {
            return c10122g.m35399a(c10109u.m35262P());
        }
        return null;
    }
}
