package kotlin.reflect.p371y.internal.p374j0.p400i.p408w;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.C10784u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10551d1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10564i;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9906b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;

/* compiled from: InnerClassesScopeWrapper.kt */
/* renamed from: kotlin.f0.y.e.j0.i.w.f */
/* loaded from: classes3.dex */
public final class C10216f extends AbstractC10219i {

    /* renamed from: b */
    private final InterfaceC10218h f39664b;

    public C10216f(InterfaceC10218h interfaceC10218h) {
        C9768m.m32346f(interfaceC10218h, "workerScope");
        this.f39664b = interfaceC10218h;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: b */
    public Set<C10130f> mo33312b() {
        return this.f39664b.mo33312b();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: d */
    public Set<C10130f> mo33314d() {
        return this.f39664b.mo33314d();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: e */
    public Set<C10130f> mo33315e() {
        return this.f39664b.mo33315e();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10221k
    /* renamed from: f */
    public InterfaceC10561h mo33316f(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(interfaceC9906b, "location");
        InterfaceC10561h mo33316f = this.f39664b.mo33316f(c10130f, interfaceC9906b);
        if (mo33316f == null) {
            return null;
        }
        InterfaceC10552e interfaceC10552e = mo33316f instanceof InterfaceC10552e ? (InterfaceC10552e) mo33316f : null;
        if (interfaceC10552e != null) {
            return interfaceC10552e;
        }
        if (mo33316f instanceof InterfaceC10551d1) {
            return (InterfaceC10551d1) mo33316f;
        }
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10221k
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public List<InterfaceC10561h> mo33317g(C10214d c10214d, Function1<? super C10130f, Boolean> function1) {
        C9768m.m32346f(c10214d, "kindFilter");
        C9768m.m32346f(function1, "nameFilter");
        C10214d m36140n = c10214d.m36140n(C10214d.f39630a.m36144c());
        if (m36140n == null) {
            return C10784u.m38888j();
        }
        Collection<InterfaceC10576m> mo33317g = this.f39664b.mo33317g(m36140n, function1);
        ArrayList arrayList = new ArrayList();
        for (Object obj : mo33317g) {
            if (obj instanceof InterfaceC10564i) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public String toString() {
        return "Classes from " + this.f39664b;
    }
}
