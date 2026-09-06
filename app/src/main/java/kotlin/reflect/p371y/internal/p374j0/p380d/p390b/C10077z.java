package kotlin.reflect.p371y.internal.p374j0.p380d.p390b;

import java.util.Collection;
import kotlin.collections.C10749c0;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10076y;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;

/* compiled from: methodSignatureMapping.kt */
/* renamed from: kotlin.f0.y.e.j0.d.b.z */
/* loaded from: classes3.dex */
public final class C10077z implements InterfaceC10076y<AbstractC10063l> {

    /* renamed from: a */
    public static final C10077z f38490a = new C10077z();

    private C10077z() {
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10076y
    /* renamed from: b */
    public String mo34058b(InterfaceC10552e interfaceC10552e) {
        return InterfaceC10076y.a.m34063a(this, interfaceC10552e);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10076y
    /* renamed from: c */
    public AbstractC10311e0 mo34059c(Collection<? extends AbstractC10311e0> collection) {
        String m38599e0;
        C9768m.m32346f(collection, "types");
        StringBuilder sb = new StringBuilder();
        sb.append("There should be no intersection type in existing descriptors, but found: ");
        m38599e0 = C10749c0.m38599e0(collection, null, null, null, 0, null, null, 63, null);
        sb.append(m38599e0);
        throw new AssertionError(sb.toString());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10076y
    /* renamed from: d */
    public String mo34060d(InterfaceC10552e interfaceC10552e) {
        C9768m.m32346f(interfaceC10552e, "classDescriptor");
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10076y
    /* renamed from: e */
    public AbstractC10311e0 mo34061e(AbstractC10311e0 abstractC10311e0) {
        return InterfaceC10076y.a.m34064b(this, abstractC10311e0);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10076y
    /* renamed from: f */
    public void mo34062f(AbstractC10311e0 abstractC10311e0, InterfaceC10552e interfaceC10552e) {
        C9768m.m32346f(abstractC10311e0, "kotlinType");
        C9768m.m32346f(interfaceC10552e, "descriptor");
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10076y
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public AbstractC10063l mo34057a(InterfaceC10552e interfaceC10552e) {
        C9768m.m32346f(interfaceC10552e, "classDescriptor");
        return null;
    }
}
