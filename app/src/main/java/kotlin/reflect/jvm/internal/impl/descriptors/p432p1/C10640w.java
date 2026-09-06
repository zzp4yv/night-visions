package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C9768m;

/* compiled from: ModuleDescriptorImpl.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.w */
/* loaded from: classes2.dex */
public final class C10640w implements InterfaceC10639v {

    /* renamed from: a */
    private final List<C10641x> f41104a;

    /* renamed from: b */
    private final Set<C10641x> f41105b;

    /* renamed from: c */
    private final List<C10641x> f41106c;

    /* renamed from: d */
    private final Set<C10641x> f41107d;

    public C10640w(List<C10641x> list, Set<C10641x> set, List<C10641x> list2, Set<C10641x> set2) {
        C9768m.m32346f(list, "allDependencies");
        C9768m.m32346f(set, "modulesWhoseInternalsAreVisible");
        C9768m.m32346f(list2, "directExpectedByDependencies");
        C9768m.m32346f(set2, "allExpectedByDependencies");
        this.f41104a = list;
        this.f41105b = set;
        this.f41106c = list2;
        this.f41107d = set2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.InterfaceC10639v
    /* renamed from: a */
    public List<C10641x> mo37979a() {
        return this.f41104a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.InterfaceC10639v
    /* renamed from: b */
    public Set<C10641x> mo37980b() {
        return this.f41105b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.InterfaceC10639v
    /* renamed from: c */
    public List<C10641x> mo37981c() {
        return this.f41106c;
    }
}
