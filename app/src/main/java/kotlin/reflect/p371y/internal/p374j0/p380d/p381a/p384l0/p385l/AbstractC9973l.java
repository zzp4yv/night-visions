package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l;

import java.util.Collection;
import java.util.List;
import kotlin.collections.C10784u;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10702w0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9957g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC9971j;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10008r;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;

/* compiled from: LazyJavaStaticScope.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.l */
/* loaded from: classes2.dex */
public abstract class AbstractC9973l extends AbstractC9971j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC9973l(C9957g c9957g) {
        super(c9957g, null, 2, null);
        C9768m.m32346f(c9957g, "c");
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC9971j
    /* renamed from: H */
    protected AbstractC9971j.a mo33401H(InterfaceC10008r interfaceC10008r, List<? extends InterfaceC10554e1> list, AbstractC10311e0 abstractC10311e0, List<? extends InterfaceC10566i1> list2) {
        C9768m.m32346f(interfaceC10008r, "method");
        C9768m.m32346f(list, "methodTypeParameters");
        C9768m.m32346f(abstractC10311e0, "returnType");
        C9768m.m32346f(list2, "valueParameters");
        return new AbstractC9971j.a(abstractC10311e0, null, list2, list, false, C10784u.m38888j());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC9971j
    /* renamed from: s */
    protected void mo33409s(C10130f c10130f, Collection<InterfaceC10696t0> collection) {
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(collection, "result");
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC9971j
    /* renamed from: z */
    protected InterfaceC10702w0 mo33413z() {
        return null;
    }
}
