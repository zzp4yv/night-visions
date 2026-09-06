package kotlin.reflect.p371y.internal.p374j0.p422m.p424v;

import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.utils.C10738e;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;

/* compiled from: scopeUtils.kt */
/* renamed from: kotlin.f0.y.e.j0.m.v.a */
/* loaded from: classes3.dex */
public final class C10453a {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final <T> Collection<T> m37230a(Collection<? extends T> collection, Collection<? extends T> collection2) {
        C9768m.m32346f(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == 0) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    /* renamed from: b */
    public static final C10738e<InterfaceC10218h> m37231b(Iterable<? extends InterfaceC10218h> iterable) {
        C9768m.m32346f(iterable, "scopes");
        C10738e<InterfaceC10218h> c10738e = new C10738e<>();
        for (InterfaceC10218h interfaceC10218h : iterable) {
            InterfaceC10218h interfaceC10218h2 = interfaceC10218h;
            if ((interfaceC10218h2 == null || interfaceC10218h2 == InterfaceC10218h.b.f39671b) ? false : true) {
                c10738e.add(interfaceC10218h);
            }
        }
        return c10738e;
    }
}
