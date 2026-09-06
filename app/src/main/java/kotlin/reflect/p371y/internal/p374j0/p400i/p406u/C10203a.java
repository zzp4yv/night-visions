package kotlin.reflect.p371y.internal.p374j0.p400i.p406u;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10794z;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10549d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10706y0;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;

/* compiled from: SyntheticJavaPartsProvider.kt */
/* renamed from: kotlin.f0.y.e.j0.i.u.a */
/* loaded from: classes3.dex */
public final class C10203a implements InterfaceC10208f {

    /* renamed from: b */
    private final List<InterfaceC10208f> f39597b;

    /* JADX WARN: Multi-variable type inference failed */
    public C10203a(List<? extends InterfaceC10208f> list) {
        C9768m.m32346f(list, "inner");
        this.f39597b = list;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p406u.InterfaceC10208f
    /* renamed from: a */
    public List<C10130f> mo36093a(InterfaceC10552e interfaceC10552e) {
        C9768m.m32346f(interfaceC10552e, "thisDescriptor");
        List<InterfaceC10208f> list = this.f39597b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            C10794z.m38933z(arrayList, ((InterfaceC10208f) it.next()).mo36093a(interfaceC10552e));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p406u.InterfaceC10208f
    /* renamed from: b */
    public void mo36094b(InterfaceC10552e interfaceC10552e, C10130f c10130f, Collection<InterfaceC10706y0> collection) {
        C9768m.m32346f(interfaceC10552e, "thisDescriptor");
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(collection, "result");
        Iterator<T> it = this.f39597b.iterator();
        while (it.hasNext()) {
            ((InterfaceC10208f) it.next()).mo36094b(interfaceC10552e, c10130f, collection);
        }
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p406u.InterfaceC10208f
    /* renamed from: c */
    public void mo36095c(InterfaceC10552e interfaceC10552e, List<InterfaceC10549d> list) {
        C9768m.m32346f(interfaceC10552e, "thisDescriptor");
        C9768m.m32346f(list, "result");
        Iterator<T> it = this.f39597b.iterator();
        while (it.hasNext()) {
            ((InterfaceC10208f) it.next()).mo36095c(interfaceC10552e, list);
        }
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p406u.InterfaceC10208f
    /* renamed from: d */
    public List<C10130f> mo36096d(InterfaceC10552e interfaceC10552e) {
        C9768m.m32346f(interfaceC10552e, "thisDescriptor");
        List<InterfaceC10208f> list = this.f39597b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            C10794z.m38933z(arrayList, ((InterfaceC10208f) it.next()).mo36096d(interfaceC10552e));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p406u.InterfaceC10208f
    /* renamed from: e */
    public void mo36097e(InterfaceC10552e interfaceC10552e, C10130f c10130f, Collection<InterfaceC10706y0> collection) {
        C9768m.m32346f(interfaceC10552e, "thisDescriptor");
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(collection, "result");
        Iterator<T> it = this.f39597b.iterator();
        while (it.hasNext()) {
            ((InterfaceC10208f) it.next()).mo36097e(interfaceC10552e, c10130f, collection);
        }
    }
}
