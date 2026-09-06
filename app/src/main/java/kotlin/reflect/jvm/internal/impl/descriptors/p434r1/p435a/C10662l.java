package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10542a1;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.AbstractC10682p;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p387m0.InterfaceC9983a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p387m0.InterfaceC9984b;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10002l;

/* compiled from: RuntimeSourceElementFactory.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.a.l */
/* loaded from: classes2.dex */
public final class C10662l implements InterfaceC9984b {

    /* renamed from: a */
    public static final C10662l f41153a = new C10662l();

    /* compiled from: RuntimeSourceElementFactory.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.a.l$a */
    public static final class a implements InterfaceC9983a {

        /* renamed from: b */
        private final AbstractC10682p f41154b;

        public a(AbstractC10682p abstractC10682p) {
            C9768m.m32346f(abstractC10682p, "javaElement");
            this.f41154b = abstractC10682p;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0
        /* renamed from: a */
        public InterfaceC10542a1 mo33980a() {
            InterfaceC10542a1 interfaceC10542a1 = InterfaceC10542a1.f40728a;
            C9768m.m32345e(interfaceC10542a1, "NO_SOURCE_FILE");
            return interfaceC10542a1;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p387m0.InterfaceC9983a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public AbstractC10682p mo33568b() {
            return this.f41154b;
        }

        public String toString() {
            return a.class.getName() + ": " + mo33568b();
        }
    }

    private C10662l() {
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p387m0.InterfaceC9984b
    /* renamed from: a */
    public InterfaceC9983a mo33569a(InterfaceC10002l interfaceC10002l) {
        C9768m.m32346f(interfaceC10002l, "javaElement");
        return new a((AbstractC10682p) interfaceC10002l);
    }
}
