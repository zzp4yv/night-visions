package kotlin.reflect.p371y.internal.p374j0.p400i;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.C10749c0;
import kotlin.collections.C10784u;
import kotlin.comparisons.C10806b;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10550d0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10551d1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10571k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.EnumC9908d;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10214d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10221k;

/* compiled from: SealedClassInheritorsProvider.kt */
/* renamed from: kotlin.f0.y.e.j0.i.a */
/* loaded from: classes3.dex */
public final class C10151a extends AbstractC10165o {

    /* renamed from: a */
    public static final C10151a f39497a = new C10151a();

    /* compiled from: Comparisons.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.a$a */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int m39017a;
            m39017a = C10806b.m39017a(C10202a.m36074h((InterfaceC10552e) t).m35420b(), C10202a.m36074h((InterfaceC10552e) t2).m35420b());
            return m39017a;
        }
    }

    private C10151a() {
    }

    /* renamed from: b */
    private static final void m35767b(InterfaceC10552e interfaceC10552e, LinkedHashSet<InterfaceC10552e> linkedHashSet, InterfaceC10218h interfaceC10218h, boolean z) {
        for (InterfaceC10576m interfaceC10576m : InterfaceC10221k.a.m36162a(interfaceC10218h, C10214d.f39647r, null, 2, null)) {
            if (interfaceC10576m instanceof InterfaceC10552e) {
                InterfaceC10552e interfaceC10552e2 = (InterfaceC10552e) interfaceC10576m;
                if (interfaceC10552e2.mo32863M()) {
                    C10130f name = interfaceC10552e2.getName();
                    C9768m.m32345e(name, "descriptor.name");
                    InterfaceC10561h mo33316f = interfaceC10218h.mo33316f(name, EnumC9908d.WHEN_GET_ALL_DESCRIPTORS);
                    interfaceC10552e2 = mo33316f instanceof InterfaceC10552e ? (InterfaceC10552e) mo33316f : mo33316f instanceof InterfaceC10551d1 ? ((InterfaceC10551d1) mo33316f).mo36399r() : null;
                }
                if (interfaceC10552e2 != null) {
                    if (C10154d.m35838z(interfaceC10552e2, interfaceC10552e)) {
                        linkedHashSet.add(interfaceC10552e2);
                    }
                    if (z) {
                        InterfaceC10218h mo33348y0 = interfaceC10552e2.mo33348y0();
                        C9768m.m32345e(mo33348y0, "refinedDescriptor.unsubstitutedInnerClassesScope");
                        m35767b(interfaceC10552e, linkedHashSet, mo33348y0, z);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public Collection<InterfaceC10552e> m35768a(InterfaceC10552e interfaceC10552e, boolean z) {
        InterfaceC10576m interfaceC10576m;
        InterfaceC10576m interfaceC10576m2;
        List m38618x0;
        C9768m.m32346f(interfaceC10552e, "sealedClass");
        if (interfaceC10552e.mo32879j() != EnumC10550d0.SEALED) {
            return C10784u.m38888j();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (z) {
            Iterator<InterfaceC10576m> it = C10202a.m36079m(interfaceC10552e).iterator();
            while (true) {
                if (!it.hasNext()) {
                    interfaceC10576m = null;
                    break;
                }
                interfaceC10576m = it.next();
                if (interfaceC10576m instanceof InterfaceC10571k0) {
                    break;
                }
            }
            interfaceC10576m2 = interfaceC10576m;
        } else {
            interfaceC10576m2 = interfaceC10552e.mo32876b();
        }
        if (interfaceC10576m2 instanceof InterfaceC10571k0) {
            m35767b(interfaceC10552e, linkedHashSet, ((InterfaceC10571k0) interfaceC10576m2).mo32988q(), z);
        }
        InterfaceC10218h mo33348y0 = interfaceC10552e.mo33348y0();
        C9768m.m32345e(mo33348y0, "sealedClass.unsubstitutedInnerClassesScope");
        m35767b(interfaceC10552e, linkedHashSet, mo33348y0, true);
        m38618x0 = C10749c0.m38618x0(linkedHashSet, new a());
        return m38618x0;
    }
}
