package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C10782t;
import kotlin.collections.C10784u;
import kotlin.collections.C10794z;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10178g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10173b;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10181j;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;

/* compiled from: AnnotationTypeQualifierResolver.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.d */
/* loaded from: classes2.dex */
public final class C9917d extends AbstractC9911a<InterfaceC10583c> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9917d(C10044w c10044w) {
        super(c10044w);
        C9768m.m32346f(c10044w, "javaTypeEnhancementState");
    }

    /* renamed from: y */
    private final List<String> m33068y(AbstractC10178g<?> abstractC10178g) {
        if (!(abstractC10178g instanceof C10173b)) {
            return abstractC10178g instanceof C10181j ? C10782t.m38883e(((C10181j) abstractC10178g).m36030c().m35457u()) : C10784u.m38888j();
        }
        List<? extends AbstractC10178g<?>> mo36023b = ((C10173b) abstractC10178g).mo36023b();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = mo36023b.iterator();
        while (it.hasNext()) {
            C10794z.m38933z(arrayList, m33068y((AbstractC10178g) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.AbstractC9911a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public Iterable<String> mo33034b(InterfaceC10583c interfaceC10583c, boolean z) {
        C9768m.m32346f(interfaceC10583c, "<this>");
        Map<C10130f, AbstractC10178g<?>> mo33159a = interfaceC10583c.mo33159a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<C10130f, AbstractC10178g<?>> entry : mo33159a.entrySet()) {
            C10794z.m38933z(arrayList, (!z || C9768m.m32341a(entry.getKey(), C9912a0.f37788c)) ? m33068y(entry.getValue()) : C10784u.m38888j());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.AbstractC9911a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public C10127c mo33038i(InterfaceC10583c interfaceC10583c) {
        C9768m.m32346f(interfaceC10583c, "<this>");
        return interfaceC10583c.mo33162d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.AbstractC9911a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public Object mo33039j(InterfaceC10583c interfaceC10583c) {
        C9768m.m32346f(interfaceC10583c, "<this>");
        InterfaceC10552e m36071e = C10202a.m36071e(interfaceC10583c);
        C9768m.m32343c(m36071e);
        return m36071e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.AbstractC9911a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public Iterable<InterfaceC10583c> mo33040k(InterfaceC10583c interfaceC10583c) {
        InterfaceC10587g annotations;
        C9768m.m32346f(interfaceC10583c, "<this>");
        InterfaceC10552e m36071e = C10202a.m36071e(interfaceC10583c);
        return (m36071e == null || (annotations = m36071e.getAnnotations()) == null) ? C10784u.m38888j() : annotations;
    }
}
