package kotlin.reflect.p371y.internal.p374j0.p415l.p417u1;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.collections.C10784u;
import kotlin.collections.C10787v0;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1;

/* compiled from: ErrorUtils.kt */
/* renamed from: kotlin.f0.y.e.j0.l.u1.k */
/* loaded from: classes3.dex */
public final class C10394k {

    /* renamed from: a */
    public static final C10394k f40355a = new C10394k();

    /* renamed from: b */
    private static final InterfaceC10559g0 f40356b = C10387d.f40237f;

    /* renamed from: c */
    private static final C10384a f40357c;

    /* renamed from: d */
    private static final AbstractC10311e0 f40358d;

    /* renamed from: e */
    private static final AbstractC10311e0 f40359e;

    /* renamed from: f */
    private static final InterfaceC10696t0 f40360f;

    /* renamed from: g */
    private static final Set<InterfaceC10696t0> f40361g;

    static {
        Set<InterfaceC10696t0> m38916c;
        String format = String.format(EnumC10385b.ERROR_CLASS.m36988k(), Arrays.copyOf(new Object[]{"unknown class"}, 1));
        C9768m.m32345e(format, "format(this, *args)");
        C10130f m35451D = C10130f.m35451D(format);
        C9768m.m32345e(m35451D, "special(ErrorEntity.ERRO….format(\"unknown class\"))");
        f40357c = new C10384a(m35451D);
        f40358d = m37053d(EnumC10393j.f40349y, new String[0]);
        f40359e = m37053d(EnumC10393j.f40344v0, new String[0]);
        C10388e c10388e = new C10388e();
        f40360f = c10388e;
        m38916c = C10787v0.m38916c(c10388e);
        f40361g = m38916c;
    }

    private C10394k() {
    }

    /* renamed from: a */
    public static final C10389f m37051a(EnumC10390g enumC10390g, boolean z, String... strArr) {
        C9768m.m32346f(enumC10390g, "kind");
        C9768m.m32346f(strArr, "formatParams");
        return z ? new C10395l(enumC10390g, (String[]) Arrays.copyOf(strArr, strArr.length)) : new C10389f(enumC10390g, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: b */
    public static final C10389f m37052b(EnumC10390g enumC10390g, String... strArr) {
        C9768m.m32346f(enumC10390g, "kind");
        C9768m.m32346f(strArr, "formatParams");
        return m37051a(enumC10390g, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: d */
    public static final C10391h m37053d(EnumC10393j enumC10393j, String... strArr) {
        C9768m.m32346f(enumC10393j, "kind");
        C9768m.m32346f(strArr, "formatParams");
        return f40355a.m37060g(enumC10393j, C10784u.m38888j(), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: m */
    public static final boolean m37054m(InterfaceC10576m interfaceC10576m) {
        if (interfaceC10576m != null) {
            C10394k c10394k = f40355a;
            if (c10394k.m37055n(interfaceC10576m) || c10394k.m37055n(interfaceC10576m.mo32876b()) || interfaceC10576m == f40356b) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    private final boolean m37055n(InterfaceC10576m interfaceC10576m) {
        return interfaceC10576m instanceof C10384a;
    }

    /* renamed from: o */
    public static final boolean m37056o(AbstractC10311e0 abstractC10311e0) {
        if (abstractC10311e0 == null) {
            return false;
        }
        InterfaceC10312e1 mo35993O0 = abstractC10311e0.mo35993O0();
        return (mo35993O0 instanceof C10392i) && ((C10392i) mo35993O0).m37046g() == EnumC10393j.f40270B;
    }

    /* renamed from: c */
    public final C10391h m37057c(EnumC10393j enumC10393j, InterfaceC10312e1 interfaceC10312e1, String... strArr) {
        C9768m.m32346f(enumC10393j, "kind");
        C9768m.m32346f(interfaceC10312e1, "typeConstructor");
        C9768m.m32346f(strArr, "formatParams");
        return m37059f(enumC10393j, C10784u.m38888j(), interfaceC10312e1, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: e */
    public final C10392i m37058e(EnumC10393j enumC10393j, String... strArr) {
        C9768m.m32346f(enumC10393j, "kind");
        C9768m.m32346f(strArr, "formatParams");
        return new C10392i(enumC10393j, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: f */
    public final C10391h m37059f(EnumC10393j enumC10393j, List<? extends InterfaceC10318g1> list, InterfaceC10312e1 interfaceC10312e1, String... strArr) {
        C9768m.m32346f(enumC10393j, "kind");
        C9768m.m32346f(list, "arguments");
        C9768m.m32346f(interfaceC10312e1, "typeConstructor");
        C9768m.m32346f(strArr, "formatParams");
        return new C10391h(interfaceC10312e1, m37052b(EnumC10390g.ERROR_TYPE_SCOPE, interfaceC10312e1.toString()), enumC10393j, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: g */
    public final C10391h m37060g(EnumC10393j enumC10393j, List<? extends InterfaceC10318g1> list, String... strArr) {
        C9768m.m32346f(enumC10393j, "kind");
        C9768m.m32346f(list, "arguments");
        C9768m.m32346f(strArr, "formatParams");
        return m37059f(enumC10393j, list, m37058e(enumC10393j, (String[]) Arrays.copyOf(strArr, strArr.length)), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: h */
    public final C10384a m37061h() {
        return f40357c;
    }

    /* renamed from: i */
    public final InterfaceC10559g0 m37062i() {
        return f40356b;
    }

    /* renamed from: j */
    public final Set<InterfaceC10696t0> m37063j() {
        return f40361g;
    }

    /* renamed from: k */
    public final AbstractC10311e0 m37064k() {
        return f40359e;
    }

    /* renamed from: l */
    public final AbstractC10311e0 m37065l() {
        return f40358d;
    }
}
