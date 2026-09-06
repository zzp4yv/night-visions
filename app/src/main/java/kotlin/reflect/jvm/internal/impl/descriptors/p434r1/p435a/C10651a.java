package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.C10749c0;
import kotlin.collections.C10782t;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10628m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10058g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10067p;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.p391c0.C10053a;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p406u.C10206d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10212b;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;

/* compiled from: PackagePartScopeCache.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.a.a */
/* loaded from: classes2.dex */
public final class C10651a {

    /* renamed from: a */
    private final C10058g f41137a;

    /* renamed from: b */
    private final C10657g f41138b;

    /* renamed from: c */
    private final ConcurrentHashMap<C10126b, InterfaceC10218h> f41139c;

    public C10651a(C10058g c10058g, C10657g c10657g) {
        C9768m.m32346f(c10058g, "resolver");
        C9768m.m32346f(c10657g, "kotlinClassFinder");
        this.f41137a = c10058g;
        this.f41138b = c10657g;
        this.f41139c = new ConcurrentHashMap<>();
    }

    /* renamed from: a */
    public final InterfaceC10218h m38013a(C10656f c10656f) {
        Collection m38883e;
        C9768m.m32346f(c10656f, "fileClass");
        ConcurrentHashMap<C10126b, InterfaceC10218h> concurrentHashMap = this.f41139c;
        C10126b mo34028e = c10656f.mo34028e();
        InterfaceC10218h interfaceC10218h = concurrentHashMap.get(mo34028e);
        if (interfaceC10218h == null) {
            C10127c m35413h = c10656f.mo34028e().m35413h();
            C9768m.m32345e(m35413h, "fileClass.classId.packageFqName");
            if (c10656f.mo34025a().m33913c() == C10053a.a.MULTIFILE_CLASS) {
                List<String> m33916f = c10656f.mo34025a().m33916f();
                m38883e = new ArrayList();
                Iterator<T> it = m33916f.iterator();
                while (it.hasNext()) {
                    C10126b m35408m = C10126b.m35408m(C10206d.m36109d((String) it.next()).m36110e());
                    C9768m.m32345e(m35408m, "topLevel(JvmClassName.by…velClassMaybeWithDollars)");
                    InterfaceC10068q m34024b = C10067p.m34024b(this.f41138b, m35408m);
                    if (m34024b != null) {
                        m38883e.add(m34024b);
                    }
                }
            } else {
                m38883e = C10782t.m38883e(c10656f);
            }
            C10628m c10628m = new C10628m(this.f41137a.m33971d().m36431p(), m35413h);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = m38883e.iterator();
            while (it2.hasNext()) {
                InterfaceC10218h m33970b = this.f41137a.m33970b(c10628m, (InterfaceC10068q) it2.next());
                if (m33970b != null) {
                    arrayList.add(m33970b);
                }
            }
            List m38569E0 = C10749c0.m38569E0(arrayList);
            InterfaceC10218h m36124a = C10212b.f39624b.m36124a("package " + m35413h + " (" + c10656f + ')', m38569E0);
            InterfaceC10218h putIfAbsent = concurrentHashMap.putIfAbsent(mo34028e, m36124a);
            interfaceC10218h = putIfAbsent == null ? m36124a : putIfAbsent;
        }
        C9768m.m32345e(interfaceC10218h, "cache.getOrPut(fileClass…ileClass)\", scopes)\n    }");
        return interfaceC10218h;
    }
}
