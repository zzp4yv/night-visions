package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a;

import kotlin.C10742u;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10056e;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10268k;

/* compiled from: RuntimeModuleData.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.a.k */
/* loaded from: classes2.dex */
public final class C10661k {

    /* renamed from: a */
    public static final a f41150a = new a(null);

    /* renamed from: b */
    private final C10268k f41151b;

    /* renamed from: c */
    private final C10651a f41152c;

    /* compiled from: RuntimeModuleData.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.a.k$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final C10661k m38034a(ClassLoader classLoader) {
            C9768m.m32346f(classLoader, "classLoader");
            C10657g c10657g = new C10657g(classLoader);
            C10056e.a aVar = C10056e.f38441a;
            ClassLoader classLoader2 = C10742u.class.getClassLoader();
            C9768m.m32345e(classLoader2, "Unit::class.java.classLoader");
            C10056e.a.C11502a m33957a = aVar.m33957a(c10657g, new C10657g(classLoader2), new C10654d(classLoader), "runtime module for " + classLoader, C10660j.f41149b, C10662l.f41153a);
            return new C10661k(m33957a.m33958a().m33956a(), new C10651a(m33957a.m33959b(), c10657g), null);
        }
    }

    private C10661k(C10268k c10268k, C10651a c10651a) {
        this.f41151b = c10268k;
        this.f41152c = c10651a;
    }

    public /* synthetic */ C10661k(C10268k c10268k, C10651a c10651a, C9756g c9756g) {
        this(c10268k, c10651a);
    }

    /* renamed from: a */
    public final C10268k m38031a() {
        return this.f41151b;
    }

    /* renamed from: b */
    public final InterfaceC10559g0 m38032b() {
        return this.f41151b.m36431p();
    }

    /* renamed from: c */
    public final C10651a m38033c() {
        return this.f41152c;
    }
}
