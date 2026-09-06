package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.C10749c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10580n0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10571k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10574l0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10596o0;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;

/* compiled from: CompositePackageFragmentProvider.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.i */
/* loaded from: classes2.dex */
public final class C10620i implements InterfaceC10596o0 {

    /* renamed from: a */
    private final List<InterfaceC10574l0> f40985a;

    /* renamed from: b */
    private final String f40986b;

    /* JADX WARN: Multi-variable type inference failed */
    public C10620i(List<? extends InterfaceC10574l0> list, String str) {
        Set m38574I0;
        C9768m.m32346f(list, "providers");
        C9768m.m32346f(str, "debugName");
        this.f40985a = list;
        this.f40986b = str;
        list.size();
        m38574I0 = C10749c0.m38574I0(list);
        m38574I0.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10574l0
    /* renamed from: a */
    public List<InterfaceC10571k0> mo33276a(C10127c c10127c) {
        C9768m.m32346f(c10127c, "fqName");
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC10574l0> it = this.f40985a.iterator();
        while (it.hasNext()) {
            C10580n0.m37723a(it.next(), c10127c, arrayList);
        }
        return C10749c0.m38569E0(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10596o0
    /* renamed from: b */
    public void mo33277b(C10127c c10127c, Collection<InterfaceC10571k0> collection) {
        C9768m.m32346f(c10127c, "fqName");
        C9768m.m32346f(collection, "packageFragments");
        Iterator<InterfaceC10574l0> it = this.f40985a.iterator();
        while (it.hasNext()) {
            C10580n0.m37723a(it.next(), c10127c, collection);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10596o0
    /* renamed from: c */
    public boolean mo33278c(C10127c c10127c) {
        C9768m.m32346f(c10127c, "fqName");
        List<InterfaceC10574l0> list = this.f40985a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!C10580n0.m37724b((InterfaceC10574l0) it.next(), c10127c)) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10574l0
    /* renamed from: p */
    public Collection<C10127c> mo33280p(C10127c c10127c, Function1<? super C10130f, Boolean> function1) {
        C9768m.m32346f(c10127c, "fqName");
        C9768m.m32346f(function1, "nameFilter");
        HashSet hashSet = new HashSet();
        Iterator<InterfaceC10574l0> it = this.f40985a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().mo33280p(c10127c, function1));
        }
        return hashSet;
    }

    public String toString() {
        return this.f40986b;
    }
}
