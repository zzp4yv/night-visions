package kotlin.reflect.jvm.internal.impl.descriptors.p431o1;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10706y0;

/* compiled from: PlatformDependentDeclarationFilter.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.o1.c */
/* loaded from: classes2.dex */
public interface InterfaceC10599c {

    /* compiled from: PlatformDependentDeclarationFilter.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.o1.c$a */
    public static final class a implements InterfaceC10599c {

        /* renamed from: a */
        public static final a f40890a = new a();

        private a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10599c
        /* renamed from: c */
        public boolean mo32981c(InterfaceC10552e interfaceC10552e, InterfaceC10706y0 interfaceC10706y0) {
            C9768m.m32346f(interfaceC10552e, "classDescriptor");
            C9768m.m32346f(interfaceC10706y0, "functionDescriptor");
            return true;
        }
    }

    /* compiled from: PlatformDependentDeclarationFilter.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.o1.c$b */
    public static final class b implements InterfaceC10599c {

        /* renamed from: a */
        public static final b f40891a = new b();

        private b() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10599c
        /* renamed from: c */
        public boolean mo32981c(InterfaceC10552e interfaceC10552e, InterfaceC10706y0 interfaceC10706y0) {
            C9768m.m32346f(interfaceC10552e, "classDescriptor");
            C9768m.m32346f(interfaceC10706y0, "functionDescriptor");
            return !interfaceC10706y0.getAnnotations().mo33270R0(C10600d.m37747a());
        }
    }

    /* renamed from: c */
    boolean mo32981c(InterfaceC10552e interfaceC10552e, InterfaceC10706y0 interfaceC10706y0);
}
