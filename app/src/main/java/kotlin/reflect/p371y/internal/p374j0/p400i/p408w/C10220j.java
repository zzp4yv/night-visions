package kotlin.reflect.p371y.internal.p374j0.p400i.p408w;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.C10794z;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;

/* compiled from: MemberScope.kt */
/* renamed from: kotlin.f0.y.e.j0.i.w.j */
/* loaded from: classes3.dex */
public final class C10220j {
    /* renamed from: a */
    public static final Set<C10130f> m36161a(Iterable<? extends InterfaceC10218h> iterable) {
        C9768m.m32346f(iterable, "<this>");
        HashSet hashSet = new HashSet();
        Iterator<? extends InterfaceC10218h> it = iterable.iterator();
        while (it.hasNext()) {
            Set<C10130f> mo33315e = it.next().mo33315e();
            if (mo33315e == null) {
                return null;
            }
            C10794z.m38933z(hashSet, mo33315e);
        }
        return hashSet;
    }
}
