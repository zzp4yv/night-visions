package kotlin.reflect.p371y.internal.p374j0.p380d.p390b;

import java.util.Collection;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;

/* compiled from: descriptorBasedTypeSignatureMapping.kt */
/* renamed from: kotlin.f0.y.e.j0.d.b.y */
/* loaded from: classes3.dex */
public interface InterfaceC10076y<T> {

    /* compiled from: descriptorBasedTypeSignatureMapping.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.y$a */
    public static final class a {
        /* renamed from: a */
        public static <T> String m34063a(InterfaceC10076y<? extends T> interfaceC10076y, InterfaceC10552e interfaceC10552e) {
            C9768m.m32346f(interfaceC10552e, "classDescriptor");
            return null;
        }

        /* renamed from: b */
        public static <T> AbstractC10311e0 m34064b(InterfaceC10076y<? extends T> interfaceC10076y, AbstractC10311e0 abstractC10311e0) {
            C9768m.m32346f(abstractC10311e0, "kotlinType");
            return null;
        }
    }

    /* renamed from: a */
    T mo34057a(InterfaceC10552e interfaceC10552e);

    /* renamed from: b */
    String mo34058b(InterfaceC10552e interfaceC10552e);

    /* renamed from: c */
    AbstractC10311e0 mo34059c(Collection<AbstractC10311e0> collection);

    /* renamed from: d */
    String mo34060d(InterfaceC10552e interfaceC10552e);

    /* renamed from: e */
    AbstractC10311e0 mo34061e(AbstractC10311e0 abstractC10311e0);

    /* renamed from: f */
    void mo34062f(AbstractC10311e0 abstractC10311e0, InterfaceC10552e interfaceC10552e);
}
