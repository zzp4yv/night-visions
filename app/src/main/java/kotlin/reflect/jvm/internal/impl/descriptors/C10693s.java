package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9906b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;

/* compiled from: descriptorUtil.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.s */
/* loaded from: classes2.dex */
public final class C10693s {
    /* renamed from: a */
    public static final InterfaceC10561h m38123a(InterfaceC10576m interfaceC10576m) {
        C9768m.m32346f(interfaceC10576m, "<this>");
        InterfaceC10576m mo32876b = interfaceC10576m.mo32876b();
        if (mo32876b == null || (interfaceC10576m instanceof InterfaceC10571k0)) {
            return null;
        }
        if (!m38124b(mo32876b)) {
            return m38123a(mo32876b);
        }
        if (mo32876b instanceof InterfaceC10561h) {
            return (InterfaceC10561h) mo32876b;
        }
        return null;
    }

    /* renamed from: b */
    public static final boolean m38124b(InterfaceC10576m interfaceC10576m) {
        C9768m.m32346f(interfaceC10576m, "<this>");
        return interfaceC10576m.mo32876b() instanceof InterfaceC10571k0;
    }

    /* renamed from: c */
    public static final InterfaceC10552e m38125c(InterfaceC10559g0 interfaceC10559g0, C10127c c10127c, InterfaceC9906b interfaceC9906b) {
        InterfaceC10561h interfaceC10561h;
        InterfaceC10218h mo33348y0;
        C9768m.m32346f(interfaceC10559g0, "<this>");
        C9768m.m32346f(c10127c, "fqName");
        C9768m.m32346f(interfaceC9906b, "lookupLocation");
        if (c10127c.m35422d()) {
            return null;
        }
        C10127c m35423e = c10127c.m35423e();
        C9768m.m32345e(m35423e, "fqName.parent()");
        InterfaceC10218h mo37751q = interfaceC10559g0.mo37018N(m35423e).mo37751q();
        C10130f m35425g = c10127c.m35425g();
        C9768m.m32345e(m35425g, "fqName.shortName()");
        InterfaceC10561h mo33316f = mo37751q.mo33316f(m35425g, interfaceC9906b);
        InterfaceC10552e interfaceC10552e = mo33316f instanceof InterfaceC10552e ? (InterfaceC10552e) mo33316f : null;
        if (interfaceC10552e != null) {
            return interfaceC10552e;
        }
        C10127c m35423e2 = c10127c.m35423e();
        C9768m.m32345e(m35423e2, "fqName.parent()");
        InterfaceC10552e m38125c = m38125c(interfaceC10559g0, m35423e2, interfaceC9906b);
        if (m38125c == null || (mo33348y0 = m38125c.mo33348y0()) == null) {
            interfaceC10561h = null;
        } else {
            C10130f m35425g2 = c10127c.m35425g();
            C9768m.m32345e(m35425g2, "fqName.shortName()");
            interfaceC10561h = mo33348y0.mo33316f(m35425g2, interfaceC9906b);
        }
        if (interfaceC10561h instanceof InterfaceC10552e) {
            return (InterfaceC10552e) interfaceC10561h;
        }
        return null;
    }
}
