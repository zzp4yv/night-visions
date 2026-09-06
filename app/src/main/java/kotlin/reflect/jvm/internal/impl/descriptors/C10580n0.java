package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;

/* compiled from: PackageFragmentProvider.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n0 */
/* loaded from: classes2.dex */
public final class C10580n0 {
    /* renamed from: a */
    public static final void m37723a(InterfaceC10574l0 interfaceC10574l0, C10127c c10127c, Collection<InterfaceC10571k0> collection) {
        C9768m.m32346f(interfaceC10574l0, "<this>");
        C9768m.m32346f(c10127c, "fqName");
        C9768m.m32346f(collection, "packageFragments");
        if (interfaceC10574l0 instanceof InterfaceC10596o0) {
            ((InterfaceC10596o0) interfaceC10574l0).mo33277b(c10127c, collection);
        } else {
            collection.addAll(interfaceC10574l0.mo33276a(c10127c));
        }
    }

    /* renamed from: b */
    public static final boolean m37724b(InterfaceC10574l0 interfaceC10574l0, C10127c c10127c) {
        C9768m.m32346f(interfaceC10574l0, "<this>");
        C9768m.m32346f(c10127c, "fqName");
        return interfaceC10574l0 instanceof InterfaceC10596o0 ? ((InterfaceC10596o0) interfaceC10574l0).mo33278c(c10127c) : m37725c(interfaceC10574l0, c10127c).isEmpty();
    }

    /* renamed from: c */
    public static final List<InterfaceC10571k0> m37725c(InterfaceC10574l0 interfaceC10574l0, C10127c c10127c) {
        C9768m.m32346f(interfaceC10574l0, "<this>");
        C9768m.m32346f(c10127c, "fqName");
        ArrayList arrayList = new ArrayList();
        m37723a(interfaceC10574l0, c10127c, arrayList);
        return arrayList;
    }
}
