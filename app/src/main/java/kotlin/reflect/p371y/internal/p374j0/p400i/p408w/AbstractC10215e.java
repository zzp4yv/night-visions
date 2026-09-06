package kotlin.reflect.p371y.internal.p374j0.p400i.p408w;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C10749c0;
import kotlin.collections.C10784u;
import kotlin.collections.C10794z;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9757g0;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.C9786y;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10706y0;
import kotlin.reflect.jvm.internal.impl.utils.C10734a;
import kotlin.reflect.jvm.internal.impl.utils.C10738e;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9906b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.AbstractC10158h;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10160j;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10221k;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10296m;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10292i;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;

/* compiled from: GivenFunctionsMemberScope.kt */
/* renamed from: kotlin.f0.y.e.j0.i.w.e */
/* loaded from: classes3.dex */
public abstract class AbstractC10215e extends AbstractC10219i {

    /* renamed from: b */
    static final /* synthetic */ KProperty<Object>[] f39658b = {C9757g0.m32304h(new C9786y(C9757g0.m32298b(AbstractC10215e.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};

    /* renamed from: c */
    private final InterfaceC10552e f39659c;

    /* renamed from: d */
    private final InterfaceC10292i f39660d;

    /* compiled from: GivenFunctionsMemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.w.e$a */
    static final class a extends Lambda implements Function0<List<? extends InterfaceC10576m>> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends InterfaceC10576m> invoke() {
            List<InterfaceC10705y> mo32904i = AbstractC10215e.this.mo32904i();
            return C10749c0.m38609o0(mo32904i, AbstractC10215e.this.m36154j(mo32904i));
        }
    }

    /* compiled from: GivenFunctionsMemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.w.e$b */
    public static final class b extends AbstractC10158h {

        /* renamed from: a */
        final /* synthetic */ ArrayList<InterfaceC10576m> f39662a;

        /* renamed from: b */
        final /* synthetic */ AbstractC10215e f39663b;

        b(ArrayList<InterfaceC10576m> arrayList, AbstractC10215e abstractC10215e) {
            this.f39662a = arrayList;
            this.f39663b = abstractC10215e;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p400i.AbstractC10159i
        /* renamed from: a */
        public void mo33154a(InterfaceC10543b interfaceC10543b) {
            C9768m.m32346f(interfaceC10543b, "fakeOverride");
            C10160j.m35856K(interfaceC10543b, null);
            this.f39662a.add(interfaceC10543b);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p400i.AbstractC10158h
        /* renamed from: e */
        protected void mo33156e(InterfaceC10543b interfaceC10543b, InterfaceC10543b interfaceC10543b2) {
            C9768m.m32346f(interfaceC10543b, "fromSuper");
            C9768m.m32346f(interfaceC10543b2, "fromCurrent");
            throw new IllegalStateException(("Conflict in scope of " + this.f39663b.m36156l() + ": " + interfaceC10543b + " vs " + interfaceC10543b2).toString());
        }
    }

    public AbstractC10215e(InterfaceC10297n interfaceC10297n, InterfaceC10552e interfaceC10552e) {
        C9768m.m32346f(interfaceC10297n, "storageManager");
        C9768m.m32346f(interfaceC10552e, "containingClass");
        this.f39659c = interfaceC10552e;
        this.f39660d = interfaceC10297n.mo36516d(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public final List<InterfaceC10576m> m36154j(List<? extends InterfaceC10705y> list) {
        Collection<? extends InterfaceC10543b> m38888j;
        ArrayList arrayList = new ArrayList(3);
        Collection<AbstractC10311e0> mo35998a = this.f39659c.mo32877h().mo35998a();
        C9768m.m32345e(mo35998a, "containingClass.typeConstructor.supertypes");
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = mo35998a.iterator();
        while (it.hasNext()) {
            C10794z.m38933z(arrayList2, InterfaceC10221k.a.m36162a(((AbstractC10311e0) it.next()).mo33553q(), null, null, 3, null));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (obj instanceof InterfaceC10543b) {
                arrayList3.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList3) {
            C10130f name = ((InterfaceC10543b) obj2).getName();
            Object obj3 = linkedHashMap.get(name);
            if (obj3 == null) {
                obj3 = new ArrayList();
                linkedHashMap.put(name, obj3);
            }
            ((List) obj3).add(obj2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C10130f c10130f = (C10130f) entry.getKey();
            List list2 = (List) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj4 : list2) {
                Boolean valueOf = Boolean.valueOf(((InterfaceC10543b) obj4) instanceof InterfaceC10705y);
                Object obj5 = linkedHashMap2.get(valueOf);
                if (obj5 == null) {
                    obj5 = new ArrayList();
                    linkedHashMap2.put(valueOf, obj5);
                }
                ((List) obj5).add(obj4);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean booleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list3 = (List) entry2.getValue();
                C10160j c10160j = C10160j.f39520b;
                if (booleanValue) {
                    m38888j = new ArrayList<>();
                    for (Object obj6 : list) {
                        if (C9768m.m32341a(((InterfaceC10705y) obj6).getName(), c10130f)) {
                            m38888j.add(obj6);
                        }
                    }
                } else {
                    m38888j = C10784u.m38888j();
                }
                c10160j.m35886v(c10130f, list3, m38888j, this.f39659c, new b(arrayList, this));
            }
        }
        return C10734a.m38510c(arrayList);
    }

    /* renamed from: k */
    private final List<InterfaceC10576m> m36155k() {
        return (List) C10296m.m36555a(this.f39660d, this, f39658b[0]);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: a */
    public Collection<InterfaceC10706y0> mo33311a(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(interfaceC9906b, "location");
        List<InterfaceC10576m> m36155k = m36155k();
        C10738e c10738e = new C10738e();
        for (Object obj : m36155k) {
            if ((obj instanceof InterfaceC10706y0) && C9768m.m32341a(((InterfaceC10706y0) obj).getName(), c10130f)) {
                c10738e.add(obj);
            }
        }
        return c10738e;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: c */
    public Collection<InterfaceC10696t0> mo33313c(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(interfaceC9906b, "location");
        List<InterfaceC10576m> m36155k = m36155k();
        C10738e c10738e = new C10738e();
        for (Object obj : m36155k) {
            if ((obj instanceof InterfaceC10696t0) && C9768m.m32341a(((InterfaceC10696t0) obj).getName(), c10130f)) {
                c10738e.add(obj);
            }
        }
        return c10738e;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10221k
    /* renamed from: g */
    public Collection<InterfaceC10576m> mo33317g(C10214d c10214d, Function1<? super C10130f, Boolean> function1) {
        C9768m.m32346f(c10214d, "kindFilter");
        C9768m.m32346f(function1, "nameFilter");
        return !c10214d.m36137a(C10214d.f39643n.m36139m()) ? C10784u.m38888j() : m36155k();
    }

    /* renamed from: i */
    protected abstract List<InterfaceC10705y> mo32904i();

    /* renamed from: l */
    protected final InterfaceC10552e m36156l() {
        return this.f39659c;
    }
}
