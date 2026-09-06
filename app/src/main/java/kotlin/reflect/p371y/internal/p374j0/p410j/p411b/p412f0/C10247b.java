package kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p412f0;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.C10784u;
import kotlin.collections.C10786v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9757g0;
import kotlin.jvm.internal.C9760i;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.C10568j0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10577m0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10574l0;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10597a;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10598b;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10599c;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9884k;
import kotlin.reflect.p371y.internal.p374j0.p375b.InterfaceC9874a;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9907c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p407v.C10210b;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10241d;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10268k;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10272o;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10267j;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10269l;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10275r;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10276s;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10279v;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;

/* compiled from: BuiltInsLoaderImpl.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.f0.b */
/* loaded from: classes3.dex */
public final class C10247b implements InterfaceC9874a {

    /* renamed from: b */
    private final C10249d f39755b = new C10249d();

    /* compiled from: BuiltInsLoaderImpl.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.f0.b$a */
    /* synthetic */ class a extends C9760i implements Function1<String, InputStream> {
        a(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.internal.AbstractC9748c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getF40571m() {
            return "loadResource";
        }

        @Override // kotlin.jvm.internal.AbstractC9748c
        public final KDeclarationContainer getOwner() {
            return C9757g0.m32298b(C10249d.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9748c
        public final String getSignature() {
            return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final InputStream invoke(String str) {
            C9768m.m32346f(str, "p0");
            return ((C10249d) this.receiver).m36251a(str);
        }
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p375b.InterfaceC9874a
    /* renamed from: a */
    public InterfaceC10574l0 mo32697a(InterfaceC10297n interfaceC10297n, InterfaceC10559g0 interfaceC10559g0, Iterable<? extends InterfaceC10598b> iterable, InterfaceC10599c interfaceC10599c, InterfaceC10597a interfaceC10597a, boolean z) {
        C9768m.m32346f(interfaceC10297n, "storageManager");
        C9768m.m32346f(interfaceC10559g0, "builtInsModule");
        C9768m.m32346f(iterable, "classDescriptorFactories");
        C9768m.m32346f(interfaceC10599c, "platformDependentDeclarationFilter");
        C9768m.m32346f(interfaceC10597a, "additionalClassPartsProvider");
        return m36248b(interfaceC10297n, interfaceC10559g0, C9884k.f37523x, iterable, interfaceC10599c, interfaceC10597a, z, new a(this.f39755b));
    }

    /* renamed from: b */
    public final InterfaceC10574l0 m36248b(InterfaceC10297n interfaceC10297n, InterfaceC10559g0 interfaceC10559g0, Set<C10127c> set, Iterable<? extends InterfaceC10598b> iterable, InterfaceC10599c interfaceC10599c, InterfaceC10597a interfaceC10597a, boolean z, Function1<? super String, ? extends InputStream> function1) {
        C9768m.m32346f(interfaceC10297n, "storageManager");
        C9768m.m32346f(interfaceC10559g0, "module");
        C9768m.m32346f(set, "packageFqNames");
        C9768m.m32346f(iterable, "classDescriptorFactories");
        C9768m.m32346f(interfaceC10599c, "platformDependentDeclarationFilter");
        C9768m.m32346f(interfaceC10597a, "additionalClassPartsProvider");
        C9768m.m32346f(function1, "loadResource");
        ArrayList arrayList = new ArrayList(C10786v.m38911u(set, 10));
        for (C10127c c10127c : set) {
            String m36247n = C10246a.f39754n.m36247n(c10127c);
            InputStream invoke = function1.invoke(m36247n);
            if (invoke == null) {
                throw new IllegalStateException("Resource not found in classpath: " + m36247n);
            }
            arrayList.add(C10248c.f39756s.m36250a(c10127c, interfaceC10297n, interfaceC10559g0, invoke, z));
        }
        C10577m0 c10577m0 = new C10577m0(arrayList);
        C10568j0 c10568j0 = new C10568j0(interfaceC10297n, interfaceC10559g0);
        InterfaceC10269l.a aVar = InterfaceC10269l.a.f39932a;
        C10272o c10272o = new C10272o(c10577m0);
        C10246a c10246a = C10246a.f39754n;
        C10241d c10241d = new C10241d(interfaceC10559g0, c10568j0, c10246a);
        InterfaceC10279v.a aVar2 = InterfaceC10279v.a.f39960a;
        InterfaceC10275r interfaceC10275r = InterfaceC10275r.f39954a;
        C9768m.m32345e(interfaceC10275r, "DO_NOTHING");
        C10268k c10268k = new C10268k(interfaceC10297n, interfaceC10559g0, aVar, c10272o, c10241d, c10577m0, aVar2, interfaceC10275r, InterfaceC9907c.a.f37749a, InterfaceC10276s.a.f39955a, iterable, c10568j0, InterfaceC10267j.f39908a.m36415a(), interfaceC10597a, interfaceC10599c, c10246a.m36190e(), null, new C10210b(interfaceC10297n, C10784u.m38888j()), null, null, 851968, null);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C10248c) it.next()).mo36465M0(c10268k);
        }
        return c10577m0;
    }
}
