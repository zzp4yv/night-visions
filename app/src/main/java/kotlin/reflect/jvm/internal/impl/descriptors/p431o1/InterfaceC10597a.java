package kotlin.reflect.jvm.internal.impl.descriptors.p431o1;

import java.util.Collection;
import kotlin.collections.C10784u;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10549d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10706y0;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;

/* compiled from: AdditionalClassPartsProvider.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.o1.a */
/* loaded from: classes2.dex */
public interface InterfaceC10597a {

    /* compiled from: AdditionalClassPartsProvider.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.o1.a$a */
    public static final class a implements InterfaceC10597a {

        /* renamed from: a */
        public static final a f40889a = new a();

        private a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10597a
        /* renamed from: a */
        public Collection<InterfaceC10549d> mo32979a(InterfaceC10552e interfaceC10552e) {
            C9768m.m32346f(interfaceC10552e, "classDescriptor");
            return C10784u.m38888j();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10597a
        /* renamed from: b */
        public Collection<InterfaceC10706y0> mo32980b(C10130f c10130f, InterfaceC10552e interfaceC10552e) {
            C9768m.m32346f(c10130f, "name");
            C9768m.m32346f(interfaceC10552e, "classDescriptor");
            return C10784u.m38888j();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10597a
        /* renamed from: d */
        public Collection<AbstractC10311e0> mo32982d(InterfaceC10552e interfaceC10552e) {
            C9768m.m32346f(interfaceC10552e, "classDescriptor");
            return C10784u.m38888j();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10597a
        /* renamed from: e */
        public Collection<C10130f> mo32983e(InterfaceC10552e interfaceC10552e) {
            C9768m.m32346f(interfaceC10552e, "classDescriptor");
            return C10784u.m38888j();
        }
    }

    /* renamed from: a */
    Collection<InterfaceC10549d> mo32979a(InterfaceC10552e interfaceC10552e);

    /* renamed from: b */
    Collection<InterfaceC10706y0> mo32980b(C10130f c10130f, InterfaceC10552e interfaceC10552e);

    /* renamed from: d */
    Collection<AbstractC10311e0> mo32982d(InterfaceC10552e interfaceC10552e);

    /* renamed from: e */
    Collection<C10130f> mo32983e(InterfaceC10552e interfaceC10552e);
}
