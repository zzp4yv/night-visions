package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10578m1;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10649r;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10697u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10695t;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10571k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10644q;
import kotlin.reflect.jvm.internal.impl.descriptors.p433q1.C10646a;
import kotlin.reflect.jvm.internal.impl.descriptors.p433q1.C10647b;
import kotlin.reflect.jvm.internal.impl.descriptors.p433q1.C10648c;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10154d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o.InterfaceC10230f;

/* compiled from: JavaDescriptorVisibilities.java */
/* renamed from: kotlin.f0.y.e.j0.d.a.r */
/* loaded from: classes2.dex */
public class C10039r {

    /* renamed from: a */
    public static final AbstractC10697u f38302a;

    /* renamed from: b */
    public static final AbstractC10697u f38303b;

    /* renamed from: c */
    public static final AbstractC10697u f38304c;

    /* renamed from: d */
    private static final Map<AbstractC10578m1, AbstractC10697u> f38305d;

    /* compiled from: JavaDescriptorVisibilities.java */
    /* renamed from: kotlin.f0.y.e.j0.d.a.r$a */
    static class a extends AbstractC10649r {
        a(AbstractC10578m1 abstractC10578m1) {
            super(abstractC10578m1);
        }

        /* renamed from: g */
        private static /* synthetic */ void m33795g(int i2) {
            Object[] objArr = new Object[3];
            if (i2 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10697u
        /* renamed from: e */
        public boolean mo33796e(InterfaceC10230f interfaceC10230f, InterfaceC10644q interfaceC10644q, InterfaceC10576m interfaceC10576m, boolean z) {
            if (interfaceC10644q == null) {
                m33795g(0);
            }
            if (interfaceC10576m == null) {
                m33795g(1);
            }
            return C10039r.m33791d(interfaceC10644q, interfaceC10576m);
        }
    }

    /* compiled from: JavaDescriptorVisibilities.java */
    /* renamed from: kotlin.f0.y.e.j0.d.a.r$b */
    static class b extends AbstractC10649r {
        b(AbstractC10578m1 abstractC10578m1) {
            super(abstractC10578m1);
        }

        /* renamed from: g */
        private static /* synthetic */ void m33797g(int i2) {
            Object[] objArr = new Object[3];
            if (i2 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10697u
        /* renamed from: e */
        public boolean mo33796e(InterfaceC10230f interfaceC10230f, InterfaceC10644q interfaceC10644q, InterfaceC10576m interfaceC10576m, boolean z) {
            if (interfaceC10644q == null) {
                m33797g(0);
            }
            if (interfaceC10576m == null) {
                m33797g(1);
            }
            return C10039r.m33792e(interfaceC10230f, interfaceC10644q, interfaceC10576m);
        }
    }

    /* compiled from: JavaDescriptorVisibilities.java */
    /* renamed from: kotlin.f0.y.e.j0.d.a.r$c */
    static class c extends AbstractC10649r {
        c(AbstractC10578m1 abstractC10578m1) {
            super(abstractC10578m1);
        }

        /* renamed from: g */
        private static /* synthetic */ void m33798g(int i2) {
            Object[] objArr = new Object[3];
            if (i2 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10697u
        /* renamed from: e */
        public boolean mo33796e(InterfaceC10230f interfaceC10230f, InterfaceC10644q interfaceC10644q, InterfaceC10576m interfaceC10576m, boolean z) {
            if (interfaceC10644q == null) {
                m33798g(0);
            }
            if (interfaceC10576m == null) {
                m33798g(1);
            }
            return C10039r.m33792e(interfaceC10230f, interfaceC10644q, interfaceC10576m);
        }
    }

    static {
        a aVar = new a(C10646a.f41130c);
        f38302a = aVar;
        b bVar = new b(C10648c.f41132c);
        f38303b = bVar;
        c cVar = new c(C10647b.f41131c);
        f38304c = cVar;
        f38305d = new HashMap();
        m33793f(aVar);
        m33793f(bVar);
        m33793f(cVar);
    }

    /* renamed from: a */
    private static /* synthetic */ void m33788a(int i2) {
        String str = (i2 == 5 || i2 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 5 || i2 == 6) ? 2 : 3];
        switch (i2) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i2 == 5 || i2 == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i2 == 2 || i2 == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i2 == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i2 != 5 && i2 != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String format = String.format(str, objArr);
        if (i2 != 5 && i2 != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static boolean m33791d(InterfaceC10576m interfaceC10576m, InterfaceC10576m interfaceC10576m2) {
        if (interfaceC10576m == null) {
            m33788a(2);
        }
        if (interfaceC10576m2 == null) {
            m33788a(3);
        }
        InterfaceC10571k0 interfaceC10571k0 = (InterfaceC10571k0) C10154d.m35830r(interfaceC10576m, InterfaceC10571k0.class, false);
        InterfaceC10571k0 interfaceC10571k02 = (InterfaceC10571k0) C10154d.m35830r(interfaceC10576m2, InterfaceC10571k0.class, false);
        return (interfaceC10571k02 == null || interfaceC10571k0 == null || !interfaceC10571k0.mo37712d().equals(interfaceC10571k02.mo37712d())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static boolean m33792e(InterfaceC10230f interfaceC10230f, InterfaceC10644q interfaceC10644q, InterfaceC10576m interfaceC10576m) {
        if (interfaceC10644q == null) {
            m33788a(0);
        }
        if (interfaceC10576m == null) {
            m33788a(1);
        }
        if (m33791d(C10154d.m35812M(interfaceC10644q), interfaceC10576m)) {
            return true;
        }
        return C10695t.f41218c.mo33796e(interfaceC10230f, interfaceC10644q, interfaceC10576m, false);
    }

    /* renamed from: f */
    private static void m33793f(AbstractC10697u abstractC10697u) {
        f38305d.put(abstractC10697u.mo38007b(), abstractC10697u);
    }

    /* renamed from: g */
    public static AbstractC10697u m33794g(AbstractC10578m1 abstractC10578m1) {
        if (abstractC10578m1 == null) {
            m33788a(4);
        }
        AbstractC10697u abstractC10697u = f38305d.get(abstractC10578m1);
        if (abstractC10697u != null) {
            return abstractC10697u;
        }
        AbstractC10697u m38135j = C10695t.m38135j(abstractC10578m1);
        if (m38135j == null) {
            m33788a(5);
        }
        return m38135j;
    }
}
