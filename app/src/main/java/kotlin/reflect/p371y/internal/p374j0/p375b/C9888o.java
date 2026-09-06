package kotlin.reflect.p371y.internal.p374j0.p375b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.C10740s;
import kotlin.collections.C10749c0;
import kotlin.collections.C10777q0;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10571k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10339n1;

/* compiled from: UnsignedType.kt */
/* renamed from: kotlin.f0.y.e.j0.b.o */
/* loaded from: classes2.dex */
public final class C9888o {

    /* renamed from: a */
    public static final C9888o f37628a = new C9888o();

    /* renamed from: b */
    private static final Set<C10130f> f37629b;

    /* renamed from: c */
    private static final Set<C10130f> f37630c;

    /* renamed from: d */
    private static final HashMap<C10126b, C10126b> f37631d;

    /* renamed from: e */
    private static final HashMap<C10126b, C10126b> f37632e;

    /* renamed from: f */
    private static final HashMap<EnumC9886m, C10130f> f37633f;

    /* renamed from: g */
    private static final Set<C10130f> f37634g;

    static {
        Set<C10130f> m38574I0;
        Set<C10130f> m38574I02;
        HashMap<EnumC9886m, C10130f> m38799k;
        EnumC9887n[] values = EnumC9887n.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (EnumC9887n enumC9887n : values) {
            arrayList.add(enumC9887n.m32843u());
        }
        m38574I0 = C10749c0.m38574I0(arrayList);
        f37629b = m38574I0;
        EnumC9886m[] values2 = EnumC9886m.values();
        ArrayList arrayList2 = new ArrayList(values2.length);
        for (EnumC9886m enumC9886m : values2) {
            arrayList2.add(enumC9886m.m32839k());
        }
        m38574I02 = C10749c0.m38574I0(arrayList2);
        f37630c = m38574I02;
        f37631d = new HashMap<>();
        f37632e = new HashMap<>();
        m38799k = C10777q0.m38799k(C10740s.m38547a(EnumC9886m.f37613f, C10130f.m35454x("ubyteArrayOf")), C10740s.m38547a(EnumC9886m.f37614g, C10130f.m35454x("ushortArrayOf")), C10740s.m38547a(EnumC9886m.f37615h, C10130f.m35454x("uintArrayOf")), C10740s.m38547a(EnumC9886m.f37616i, C10130f.m35454x("ulongArrayOf")));
        f37633f = m38799k;
        EnumC9887n[] values3 = EnumC9887n.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EnumC9887n enumC9887n2 : values3) {
            linkedHashSet.add(enumC9887n2.m32841k().m35415j());
        }
        f37634g = linkedHashSet;
        for (EnumC9887n enumC9887n3 : EnumC9887n.values()) {
            f37631d.put(enumC9887n3.m32841k(), enumC9887n3.m32842q());
            f37632e.put(enumC9887n3.m32842q(), enumC9887n3.m32841k());
        }
    }

    private C9888o() {
    }

    /* renamed from: d */
    public static final boolean m32844d(AbstractC10311e0 abstractC10311e0) {
        InterfaceC10561h mo32891w;
        C9768m.m32346f(abstractC10311e0, "type");
        if (C10339n1.m36789v(abstractC10311e0) || (mo32891w = abstractC10311e0.mo35993O0().mo32891w()) == null) {
            return false;
        }
        return f37628a.m32847c(mo32891w);
    }

    /* renamed from: a */
    public final C10126b m32845a(C10126b c10126b) {
        C9768m.m32346f(c10126b, "arrayClassId");
        return f37631d.get(c10126b);
    }

    /* renamed from: b */
    public final boolean m32846b(C10130f c10130f) {
        C9768m.m32346f(c10130f, "name");
        return f37634g.contains(c10130f);
    }

    /* renamed from: c */
    public final boolean m32847c(InterfaceC10576m interfaceC10576m) {
        C9768m.m32346f(interfaceC10576m, "descriptor");
        InterfaceC10576m mo32876b = interfaceC10576m.mo32876b();
        return (mo32876b instanceof InterfaceC10571k0) && C9768m.m32341a(((InterfaceC10571k0) mo32876b).mo37712d(), C9884k.f37517r) && f37629b.contains(interfaceC10576m.getName());
    }
}
