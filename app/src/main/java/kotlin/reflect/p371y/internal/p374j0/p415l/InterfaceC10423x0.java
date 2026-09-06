package kotlin.reflect.p371y.internal.p374j0.p415l;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10551d1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c;

/* compiled from: TypeAliasExpansionReportStrategy.kt */
/* renamed from: kotlin.f0.y.e.j0.l.x0 */
/* loaded from: classes3.dex */
public interface InterfaceC10423x0 {

    /* compiled from: TypeAliasExpansionReportStrategy.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.x0$a */
    public static final class a implements InterfaceC10423x0 {

        /* renamed from: a */
        public static final a f40383a = new a();

        private a() {
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10423x0
        /* renamed from: a */
        public void mo37131a(InterfaceC10583c interfaceC10583c) {
            C9768m.m32346f(interfaceC10583c, "annotation");
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10423x0
        /* renamed from: b */
        public void mo37132b(InterfaceC10551d1 interfaceC10551d1, InterfaceC10554e1 interfaceC10554e1, AbstractC10311e0 abstractC10311e0) {
            C9768m.m32346f(interfaceC10551d1, "typeAlias");
            C9768m.m32346f(abstractC10311e0, "substitutedArgument");
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10423x0
        /* renamed from: c */
        public void mo37133c(C10333l1 c10333l1, AbstractC10311e0 abstractC10311e0, AbstractC10311e0 abstractC10311e02, InterfaceC10554e1 interfaceC10554e1) {
            C9768m.m32346f(c10333l1, "substitutor");
            C9768m.m32346f(abstractC10311e0, "unsubstitutedArgument");
            C9768m.m32346f(abstractC10311e02, "argument");
            C9768m.m32346f(interfaceC10554e1, "typeParameter");
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10423x0
        /* renamed from: d */
        public void mo37134d(InterfaceC10551d1 interfaceC10551d1) {
            C9768m.m32346f(interfaceC10551d1, "typeAlias");
        }
    }

    /* renamed from: a */
    void mo37131a(InterfaceC10583c interfaceC10583c);

    /* renamed from: b */
    void mo37132b(InterfaceC10551d1 interfaceC10551d1, InterfaceC10554e1 interfaceC10554e1, AbstractC10311e0 abstractC10311e0);

    /* renamed from: c */
    void mo37133c(C10333l1 c10333l1, AbstractC10311e0 abstractC10311e0, AbstractC10311e0 abstractC10311e02, InterfaceC10554e1 interfaceC10554e1);

    /* renamed from: d */
    void mo37134d(InterfaceC10551d1 interfaceC10551d1);
}
