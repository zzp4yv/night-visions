package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.C10742u;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10549d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.AbstractC10158h;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10160j;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10275r;

/* compiled from: DescriptorResolverUtils.java */
/* renamed from: kotlin.f0.y.e.j0.d.a.j0.a */
/* loaded from: classes2.dex */
public final class C9930a {

    /* compiled from: DescriptorResolverUtils.java */
    /* renamed from: kotlin.f0.y.e.j0.d.a.j0.a$a */
    static class a extends AbstractC10158h {

        /* renamed from: a */
        final /* synthetic */ InterfaceC10275r f37895a;

        /* renamed from: b */
        final /* synthetic */ Set f37896b;

        /* renamed from: c */
        final /* synthetic */ boolean f37897c;

        /* compiled from: DescriptorResolverUtils.java */
        /* renamed from: kotlin.f0.y.e.j0.d.a.j0.a$a$a, reason: collision with other inner class name */
        class C11496a implements Function1<InterfaceC10543b, C10742u> {
            C11496a() {
            }

            /* renamed from: b */
            private static /* synthetic */ void m33157b(int i2) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"));
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public C10742u invoke(InterfaceC10543b interfaceC10543b) {
                if (interfaceC10543b == null) {
                    m33157b(0);
                }
                a.this.f37895a.mo36470a(interfaceC10543b);
                return C10742u.f41439a;
            }
        }

        a(InterfaceC10275r interfaceC10275r, Set set, boolean z) {
            this.f37895a = interfaceC10275r;
            this.f37896b = set;
            this.f37897c = z;
        }

        /* renamed from: f */
        private static /* synthetic */ void m33153f(int i2) {
            Object[] objArr = new Object[3];
            if (i2 == 1) {
                objArr[0] = "fromSuper";
            } else if (i2 == 2) {
                objArr[0] = "fromCurrent";
            } else if (i2 == 3) {
                objArr[0] = "member";
            } else if (i2 != 4) {
                objArr[0] = "fakeOverride";
            } else {
                objArr[0] = "overridden";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
            if (i2 == 1 || i2 == 2) {
                objArr[2] = "conflict";
            } else if (i2 == 3 || i2 == 4) {
                objArr[2] = "setOverriddenDescriptors";
            } else {
                objArr[2] = "addFakeOverride";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p400i.AbstractC10159i
        /* renamed from: a */
        public void mo33154a(InterfaceC10543b interfaceC10543b) {
            if (interfaceC10543b == null) {
                m33153f(0);
            }
            C10160j.m35856K(interfaceC10543b, new C11496a());
            this.f37896b.add(interfaceC10543b);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p400i.AbstractC10159i
        /* renamed from: d */
        public void mo33155d(InterfaceC10543b interfaceC10543b, Collection<? extends InterfaceC10543b> collection) {
            if (interfaceC10543b == null) {
                m33153f(3);
            }
            if (collection == null) {
                m33153f(4);
            }
            if (!this.f37897c || interfaceC10543b.mo37030i() == InterfaceC10543b.a.FAKE_OVERRIDE) {
                super.mo33155d(interfaceC10543b, collection);
            }
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p400i.AbstractC10158h
        /* renamed from: e */
        public void mo33156e(InterfaceC10543b interfaceC10543b, InterfaceC10543b interfaceC10543b2) {
            if (interfaceC10543b == null) {
                m33153f(1);
            }
            if (interfaceC10543b2 == null) {
                m33153f(2);
            }
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m33148a(int i2) {
        String str = i2 != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i2 != 18 ? 3 : 2];
        switch (i2) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i2 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i2) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String format = String.format(str, objArr);
        if (i2 == 18) {
            throw new IllegalStateException(format);
        }
    }

    /* renamed from: b */
    public static InterfaceC10566i1 m33149b(C10130f c10130f, InterfaceC10552e interfaceC10552e) {
        if (c10130f == null) {
            m33148a(19);
        }
        if (interfaceC10552e == null) {
            m33148a(20);
        }
        Collection<InterfaceC10549d> mo32880k = interfaceC10552e.mo32880k();
        if (mo32880k.size() != 1) {
            return null;
        }
        for (InterfaceC10566i1 interfaceC10566i1 : mo32880k.iterator().next().mo37028f()) {
            if (interfaceC10566i1.getName().equals(c10130f)) {
                return interfaceC10566i1;
            }
        }
        return null;
    }

    /* renamed from: c */
    private static <D extends InterfaceC10543b> Collection<D> m33150c(C10130f c10130f, Collection<D> collection, Collection<D> collection2, InterfaceC10552e interfaceC10552e, InterfaceC10275r interfaceC10275r, C10160j c10160j, boolean z) {
        if (c10130f == null) {
            m33148a(12);
        }
        if (collection == null) {
            m33148a(13);
        }
        if (collection2 == null) {
            m33148a(14);
        }
        if (interfaceC10552e == null) {
            m33148a(15);
        }
        if (interfaceC10275r == null) {
            m33148a(16);
        }
        if (c10160j == null) {
            m33148a(17);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c10160j.m35886v(c10130f, collection, collection2, interfaceC10552e, new a(interfaceC10275r, linkedHashSet, z));
        return linkedHashSet;
    }

    /* renamed from: d */
    public static <D extends InterfaceC10543b> Collection<D> m33151d(C10130f c10130f, Collection<D> collection, Collection<D> collection2, InterfaceC10552e interfaceC10552e, InterfaceC10275r interfaceC10275r, C10160j c10160j) {
        if (c10130f == null) {
            m33148a(0);
        }
        if (collection == null) {
            m33148a(1);
        }
        if (collection2 == null) {
            m33148a(2);
        }
        if (interfaceC10552e == null) {
            m33148a(3);
        }
        if (interfaceC10275r == null) {
            m33148a(4);
        }
        if (c10160j == null) {
            m33148a(5);
        }
        return m33150c(c10130f, collection, collection2, interfaceC10552e, interfaceC10275r, c10160j, false);
    }

    /* renamed from: e */
    public static <D extends InterfaceC10543b> Collection<D> m33152e(C10130f c10130f, Collection<D> collection, Collection<D> collection2, InterfaceC10552e interfaceC10552e, InterfaceC10275r interfaceC10275r, C10160j c10160j) {
        if (c10130f == null) {
            m33148a(6);
        }
        if (collection == null) {
            m33148a(7);
        }
        if (collection2 == null) {
            m33148a(8);
        }
        if (interfaceC10552e == null) {
            m33148a(9);
        }
        if (interfaceC10275r == null) {
            m33148a(10);
        }
        if (c10160j == null) {
            m33148a(11);
        }
        return m33150c(c10130f, collection, collection2, interfaceC10552e, interfaceC10275r, c10160j, true);
    }
}
