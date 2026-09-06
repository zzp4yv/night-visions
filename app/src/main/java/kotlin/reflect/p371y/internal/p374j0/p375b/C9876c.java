package kotlin.reflect.p371y.internal.p374j0.p375b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C10749c0;
import kotlin.collections.C10786v;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9884k;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;

/* compiled from: CompanionObjectMapping.kt */
/* renamed from: kotlin.f0.y.e.j0.b.c */
/* loaded from: classes2.dex */
public final class C9876c {

    /* renamed from: a */
    public static final C9876c f37450a = new C9876c();

    /* renamed from: b */
    private static final Set<C10126b> f37451b;

    static {
        Set<EnumC9882i> set = EnumC9882i.f37470g;
        ArrayList arrayList = new ArrayList(C10786v.m38911u(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(C9884k.m32828c((EnumC9882i) it.next()));
        }
        C10127c m35441l = C9884k.a.f37574h.m35441l();
        C9768m.m32345e(m35441l, "string.toSafe()");
        List m38610p0 = C10749c0.m38610p0(arrayList, m35441l);
        C10127c m35441l2 = C9884k.a.f37578j.m35441l();
        C9768m.m32345e(m35441l2, "_boolean.toSafe()");
        List m38610p02 = C10749c0.m38610p0(m38610p0, m35441l2);
        C10127c m35441l3 = C9884k.a.f37596s.m35441l();
        C9768m.m32345e(m35441l3, "_enum.toSafe()");
        List m38610p03 = C10749c0.m38610p0(m38610p02, m35441l3);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = m38610p03.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(C10126b.m35408m((C10127c) it2.next()));
        }
        f37451b = linkedHashSet;
    }

    private C9876c() {
    }

    /* renamed from: a */
    public final Set<C10126b> m32700a() {
        return f37451b;
    }

    /* renamed from: b */
    public final Set<C10126b> m32701b() {
        return f37451b;
    }
}
