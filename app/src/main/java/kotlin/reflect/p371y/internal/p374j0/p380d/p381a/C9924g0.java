package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10694s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10706y0;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.InterfaceC9944c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10154d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.C10377u;

/* compiled from: specialBuiltinMembers.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.g0 */
/* loaded from: classes2.dex */
public final class C9924g0 {

    /* compiled from: specialBuiltinMembers.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.g0$a */
    static final class a extends Lambda implements Function1<InterfaceC10543b, Boolean> {

        /* renamed from: f */
        public static final a f37862f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC10543b interfaceC10543b) {
            C9768m.m32346f(interfaceC10543b, "it");
            return Boolean.valueOf(C9927i.f37892a.m33142b(C10202a.m36081o(interfaceC10543b)));
        }
    }

    /* compiled from: specialBuiltinMembers.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.g0$b */
    static final class b extends Lambda implements Function1<InterfaceC10543b, Boolean> {

        /* renamed from: f */
        public static final b f37863f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC10543b interfaceC10543b) {
            C9768m.m32346f(interfaceC10543b, "it");
            return Boolean.valueOf(C9919e.f37846n.m33076j((InterfaceC10706y0) interfaceC10543b));
        }
    }

    /* compiled from: specialBuiltinMembers.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.g0$c */
    static final class c extends Lambda implements Function1<InterfaceC10543b, Boolean> {

        /* renamed from: f */
        public static final c f37864f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC10543b interfaceC10543b) {
            C9768m.m32346f(interfaceC10543b, "it");
            return Boolean.valueOf(AbstractC9881h.m32743f0(interfaceC10543b) && C9921f.m33088m(interfaceC10543b) != null);
        }
    }

    /* renamed from: a */
    public static final boolean m33100a(InterfaceC10543b interfaceC10543b) {
        C9768m.m32346f(interfaceC10543b, "<this>");
        return m33103d(interfaceC10543b) != null;
    }

    /* renamed from: b */
    public static final String m33101b(InterfaceC10543b interfaceC10543b) {
        InterfaceC10543b m36081o;
        C10130f m33075i;
        C9768m.m32346f(interfaceC10543b, "callableMemberDescriptor");
        InterfaceC10543b m33102c = m33102c(interfaceC10543b);
        if (m33102c == null || (m36081o = C10202a.m36081o(m33102c)) == null) {
            return null;
        }
        if (m36081o instanceof InterfaceC10696t0) {
            return C9927i.f37892a.m33141a(m36081o);
        }
        if (!(m36081o instanceof InterfaceC10706y0) || (m33075i = C9919e.f37846n.m33075i((InterfaceC10706y0) m36081o)) == null) {
            return null;
        }
        return m33075i.m35455k();
    }

    /* renamed from: c */
    private static final InterfaceC10543b m33102c(InterfaceC10543b interfaceC10543b) {
        if (AbstractC9881h.m32743f0(interfaceC10543b)) {
            return m33103d(interfaceC10543b);
        }
        return null;
    }

    /* renamed from: d */
    public static final <T extends InterfaceC10543b> T m33103d(T t) {
        C9768m.m32346f(t, "<this>");
        if (!C9926h0.f37865a.m33130g().contains(t.getName()) && !C9923g.f37857a.m33099d().contains(C10202a.m36081o(t).getName())) {
            return null;
        }
        if (t instanceof InterfaceC10696t0 ? true : t instanceof InterfaceC10694s0) {
            return (T) C10202a.m36069c(t, false, a.f37862f, 1, null);
        }
        if (t instanceof InterfaceC10706y0) {
            return (T) C10202a.m36069c(t, false, b.f37863f, 1, null);
        }
        return null;
    }

    /* renamed from: e */
    public static final <T extends InterfaceC10543b> T m33104e(T t) {
        C9768m.m32346f(t, "<this>");
        T t2 = (T) m33103d(t);
        if (t2 != null) {
            return t2;
        }
        C9921f c9921f = C9921f.f37848n;
        C10130f name = t.getName();
        C9768m.m32345e(name, "name");
        if (c9921f.m33089l(name)) {
            return (T) C10202a.m36069c(t, false, c.f37864f, 1, null);
        }
        return null;
    }

    /* renamed from: f */
    public static final boolean m33105f(InterfaceC10552e interfaceC10552e, InterfaceC10540a interfaceC10540a) {
        C9768m.m32346f(interfaceC10552e, "<this>");
        C9768m.m32346f(interfaceC10540a, "specialCallableDescriptor");
        InterfaceC10576m mo32876b = interfaceC10540a.mo32876b();
        C9768m.m32344d(mo32876b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        AbstractC10335m0 mo36400s = ((InterfaceC10552e) mo32876b).mo36400s();
        C9768m.m32345e(mo36400s, "specialCallableDescripto…ssDescriptor).defaultType");
        InterfaceC10552e m35831s = C10154d.m35831s(interfaceC10552e);
        while (true) {
            if (m35831s == null) {
                return false;
            }
            if (!(m35831s instanceof InterfaceC9944c)) {
                if (C10377u.m36964b(m35831s.mo36400s(), mo36400s) != null) {
                    return !AbstractC9881h.m32743f0(m35831s);
                }
            }
            m35831s = C10154d.m35831s(m35831s);
        }
    }

    /* renamed from: g */
    public static final boolean m33106g(InterfaceC10543b interfaceC10543b) {
        C9768m.m32346f(interfaceC10543b, "<this>");
        return C10202a.m36081o(interfaceC10543b).mo32876b() instanceof InterfaceC9944c;
    }

    /* renamed from: h */
    public static final boolean m33107h(InterfaceC10543b interfaceC10543b) {
        C9768m.m32346f(interfaceC10543b, "<this>");
        return m33106g(interfaceC10543b) || AbstractC9881h.m32743f0(interfaceC10543b);
    }
}
