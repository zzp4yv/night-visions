package kotlin.reflect.p371y.internal.p374j0.p375b.p377q;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.C10784u;
import kotlin.collections.C10787v0;
import kotlin.collections.C10789w0;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9884k;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10154d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;

/* compiled from: JavaToKotlinClassMapper.kt */
/* renamed from: kotlin.f0.y.e.j0.b.q.d */
/* loaded from: classes2.dex */
public final class C9897d {

    /* renamed from: a */
    public static final C9897d f37687a = new C9897d();

    private C9897d() {
    }

    /* renamed from: f */
    public static /* synthetic */ InterfaceC10552e m32936f(C9897d c9897d, C10127c c10127c, AbstractC9881h abstractC9881h, Integer num, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            num = null;
        }
        return c9897d.m32941e(c10127c, abstractC9881h, num);
    }

    /* renamed from: a */
    public final InterfaceC10552e m32937a(InterfaceC10552e interfaceC10552e) {
        C9768m.m32346f(interfaceC10552e, "mutable");
        C10127c m32930o = C9896c.f37667a.m32930o(C10154d.m35825m(interfaceC10552e));
        if (m32930o != null) {
            InterfaceC10552e m32797o = C10202a.m36072f(interfaceC10552e).m32797o(m32930o);
            C9768m.m32345e(m32797o, "descriptor.builtIns.getB…Name(oppositeClassFqName)");
            return m32797o;
        }
        throw new IllegalArgumentException("Given class " + interfaceC10552e + " is not a mutable collection");
    }

    /* renamed from: b */
    public final InterfaceC10552e m32938b(InterfaceC10552e interfaceC10552e) {
        C9768m.m32346f(interfaceC10552e, "readOnly");
        C10127c m32931p = C9896c.f37667a.m32931p(C10154d.m35825m(interfaceC10552e));
        if (m32931p != null) {
            InterfaceC10552e m32797o = C10202a.m36072f(interfaceC10552e).m32797o(m32931p);
            C9768m.m32345e(m32797o, "descriptor.builtIns.getB…Name(oppositeClassFqName)");
            return m32797o;
        }
        throw new IllegalArgumentException("Given class " + interfaceC10552e + " is not a read-only collection");
    }

    /* renamed from: c */
    public final boolean m32939c(InterfaceC10552e interfaceC10552e) {
        C9768m.m32346f(interfaceC10552e, "mutable");
        return C9896c.f37667a.m32926k(C10154d.m35825m(interfaceC10552e));
    }

    /* renamed from: d */
    public final boolean m32940d(InterfaceC10552e interfaceC10552e) {
        C9768m.m32346f(interfaceC10552e, "readOnly");
        return C9896c.f37667a.m32927l(C10154d.m35825m(interfaceC10552e));
    }

    /* renamed from: e */
    public final InterfaceC10552e m32941e(C10127c c10127c, AbstractC9881h abstractC9881h, Integer num) {
        C9768m.m32346f(c10127c, "fqName");
        C9768m.m32346f(abstractC9881h, "builtIns");
        C10126b m32928m = (num == null || !C9768m.m32341a(c10127c, C9896c.f37667a.m32924h())) ? C9896c.f37667a.m32928m(c10127c) : C9884k.m32826a(num.intValue());
        if (m32928m != null) {
            return abstractC9881h.m32797o(m32928m.m35409b());
        }
        return null;
    }

    /* renamed from: g */
    public final Collection<InterfaceC10552e> m32942g(C10127c c10127c, AbstractC9881h abstractC9881h) {
        List m38891m;
        Set m38916c;
        Set m38917d;
        C9768m.m32346f(c10127c, "fqName");
        C9768m.m32346f(abstractC9881h, "builtIns");
        InterfaceC10552e m32936f = m32936f(this, c10127c, abstractC9881h, null, 4, null);
        if (m32936f == null) {
            m38917d = C10789w0.m38917d();
            return m38917d;
        }
        C10127c m32931p = C9896c.f37667a.m32931p(C10202a.m36075i(m32936f));
        if (m32931p == null) {
            m38916c = C10787v0.m38916c(m32936f);
            return m38916c;
        }
        InterfaceC10552e m32797o = abstractC9881h.m32797o(m32931p);
        C9768m.m32345e(m32797o, "builtIns.getBuiltInClass…otlinMutableAnalogFqName)");
        m38891m = C10784u.m38891m(m32936f, m32797o);
        return m38891m;
    }
}
