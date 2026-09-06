package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10560g1;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10697u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10695t;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10550d0;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10555f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10549d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10706y0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.EnumC9908d;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9906b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.AbstractC10158h;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10160j;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10214d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10290g;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10292i;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10331l;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g;

/* compiled from: EnumEntrySyntheticClassDescriptor.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.n */
/* loaded from: classes2.dex */
public class C10630n extends AbstractC10616g {

    /* renamed from: n */
    private final InterfaceC10312e1 f41011n;

    /* renamed from: o */
    private final InterfaceC10218h f41012o;

    /* renamed from: p */
    private final InterfaceC10292i<Set<C10130f>> f41013p;

    /* renamed from: q */
    private final InterfaceC10587g f41014q;

    /* compiled from: EnumEntrySyntheticClassDescriptor.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.n$a */
    private class a extends AbstractC10219i {

        /* renamed from: b */
        private final InterfaceC10290g<C10130f, Collection<? extends InterfaceC10706y0>> f41015b;

        /* renamed from: c */
        private final InterfaceC10290g<C10130f, Collection<? extends InterfaceC10696t0>> f41016c;

        /* renamed from: d */
        private final InterfaceC10292i<Collection<InterfaceC10576m>> f41017d;

        /* renamed from: e */
        final /* synthetic */ C10630n f41018e;

        /* compiled from: EnumEntrySyntheticClassDescriptor.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.n$a$a, reason: collision with other inner class name */
        class C11532a implements Function1<C10130f, Collection<? extends InterfaceC10706y0>> {

            /* renamed from: f */
            final /* synthetic */ C10630n f41019f;

            C11532a(C10630n c10630n) {
                this.f41019f = c10630n;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Collection<? extends InterfaceC10706y0> invoke(C10130f c10130f) {
                return a.this.m37900m(c10130f);
            }
        }

        /* compiled from: EnumEntrySyntheticClassDescriptor.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.n$a$b */
        class b implements Function1<C10130f, Collection<? extends InterfaceC10696t0>> {

            /* renamed from: f */
            final /* synthetic */ C10630n f41021f;

            b(C10630n c10630n) {
                this.f41021f = c10630n;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Collection<? extends InterfaceC10696t0> invoke(C10130f c10130f) {
                return a.this.m37901n(c10130f);
            }
        }

        /* compiled from: EnumEntrySyntheticClassDescriptor.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.n$a$c */
        class c implements Function0<Collection<InterfaceC10576m>> {

            /* renamed from: f */
            final /* synthetic */ C10630n f41023f;

            c(C10630n c10630n) {
                this.f41023f = c10630n;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Collection<InterfaceC10576m> invoke() {
                return a.this.m37899l();
            }
        }

        /* compiled from: EnumEntrySyntheticClassDescriptor.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.n$a$d */
        class d extends AbstractC10158h {

            /* renamed from: a */
            final /* synthetic */ Set f41025a;

            d(Set set) {
                this.f41025a = set;
            }

            /* renamed from: f */
            private static /* synthetic */ void m37907f(int i2) {
                Object[] objArr = new Object[3];
                if (i2 == 1) {
                    objArr[0] = "fromSuper";
                } else if (i2 != 2) {
                    objArr[0] = "fakeOverride";
                } else {
                    objArr[0] = "fromCurrent";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
                if (i2 == 1 || i2 == 2) {
                    objArr[2] = "conflict";
                } else {
                    objArr[2] = "addFakeOverride";
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p400i.AbstractC10159i
            /* renamed from: a */
            public void mo33154a(InterfaceC10543b interfaceC10543b) {
                if (interfaceC10543b == null) {
                    m37907f(0);
                }
                C10160j.m35856K(interfaceC10543b, null);
                this.f41025a.add(interfaceC10543b);
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p400i.AbstractC10158h
            /* renamed from: e */
            protected void mo33156e(InterfaceC10543b interfaceC10543b, InterfaceC10543b interfaceC10543b2) {
                if (interfaceC10543b == null) {
                    m37907f(1);
                }
                if (interfaceC10543b2 == null) {
                    m37907f(2);
                }
            }
        }

        public a(C10630n c10630n, InterfaceC10297n interfaceC10297n) {
            if (interfaceC10297n == null) {
                m37895h(0);
            }
            this.f41018e = c10630n;
            this.f41015b = interfaceC10297n.mo36520h(new C11532a(c10630n));
            this.f41016c = interfaceC10297n.mo36520h(new b(c10630n));
            this.f41017d = interfaceC10297n.mo36516d(new c(c10630n));
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00b5 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x004e  */
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static /* synthetic */ void m37895h(int r13) {
            /*
                Method dump skipped, instructions count: 346
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10630n.a.m37895h(int):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public Collection<InterfaceC10576m> m37899l() {
            HashSet hashSet = new HashSet();
            for (C10130f c10130f : (Set) this.f41018e.f41013p.invoke()) {
                EnumC9908d enumC9908d = EnumC9908d.FOR_NON_TRACKED_SCOPE;
                hashSet.addAll(mo33311a(c10130f, enumC9908d));
                hashSet.addAll(mo33313c(c10130f, enumC9908d));
            }
            return hashSet;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public Collection<? extends InterfaceC10706y0> m37900m(C10130f c10130f) {
            if (c10130f == null) {
                m37895h(8);
            }
            return m37903p(c10130f, m37902o().mo33311a(c10130f, EnumC9908d.FOR_NON_TRACKED_SCOPE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public Collection<? extends InterfaceC10696t0> m37901n(C10130f c10130f) {
            if (c10130f == null) {
                m37895h(4);
            }
            return m37903p(c10130f, m37902o().mo33313c(c10130f, EnumC9908d.FOR_NON_TRACKED_SCOPE));
        }

        /* renamed from: o */
        private InterfaceC10218h m37902o() {
            InterfaceC10218h mo33553q = this.f41018e.mo32877h().mo35998a().iterator().next().mo33553q();
            if (mo33553q == null) {
                m37895h(9);
            }
            return mo33553q;
        }

        /* renamed from: p */
        private <D extends InterfaceC10543b> Collection<? extends D> m37903p(C10130f c10130f, Collection<? extends D> collection) {
            if (c10130f == null) {
                m37895h(10);
            }
            if (collection == null) {
                m37895h(11);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            C10160j.f39520b.m35886v(c10130f, collection, Collections.emptySet(), this.f41018e, new d(linkedHashSet));
            return linkedHashSet;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
        /* renamed from: a */
        public Collection<? extends InterfaceC10706y0> mo33311a(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
            if (c10130f == null) {
                m37895h(5);
            }
            if (interfaceC9906b == null) {
                m37895h(6);
            }
            Collection<? extends InterfaceC10706y0> invoke = this.f41015b.invoke(c10130f);
            if (invoke == null) {
                m37895h(7);
            }
            return invoke;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
        /* renamed from: b */
        public Set<C10130f> mo33312b() {
            Set<C10130f> set = (Set) this.f41018e.f41013p.invoke();
            if (set == null) {
                m37895h(17);
            }
            return set;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
        /* renamed from: c */
        public Collection<? extends InterfaceC10696t0> mo33313c(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
            if (c10130f == null) {
                m37895h(1);
            }
            if (interfaceC9906b == null) {
                m37895h(2);
            }
            Collection<? extends InterfaceC10696t0> invoke = this.f41016c.invoke(c10130f);
            if (invoke == null) {
                m37895h(3);
            }
            return invoke;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
        /* renamed from: d */
        public Set<C10130f> mo33314d() {
            Set<C10130f> set = (Set) this.f41018e.f41013p.invoke();
            if (set == null) {
                m37895h(19);
            }
            return set;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
        /* renamed from: e */
        public Set<C10130f> mo33315e() {
            Set<C10130f> emptySet = Collections.emptySet();
            if (emptySet == null) {
                m37895h(18);
            }
            return emptySet;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10221k
        /* renamed from: g */
        public Collection<InterfaceC10576m> mo33317g(C10214d c10214d, Function1<? super C10130f, Boolean> function1) {
            if (c10214d == null) {
                m37895h(13);
            }
            if (function1 == null) {
                m37895h(14);
            }
            Collection<InterfaceC10576m> invoke = this.f41017d.invoke();
            if (invoke == null) {
                m37895h(15);
            }
            return invoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C10630n(InterfaceC10297n interfaceC10297n, InterfaceC10552e interfaceC10552e, AbstractC10311e0 abstractC10311e0, C10130f c10130f, InterfaceC10292i<Set<C10130f>> interfaceC10292i, InterfaceC10587g interfaceC10587g, InterfaceC10708z0 interfaceC10708z0) {
        super(interfaceC10297n, interfaceC10552e, c10130f, interfaceC10708z0, false);
        if (interfaceC10297n == null) {
            m37892K(6);
        }
        if (interfaceC10552e == null) {
            m37892K(7);
        }
        if (abstractC10311e0 == null) {
            m37892K(8);
        }
        if (c10130f == null) {
            m37892K(9);
        }
        if (interfaceC10292i == null) {
            m37892K(10);
        }
        if (interfaceC10587g == null) {
            m37892K(11);
        }
        if (interfaceC10708z0 == null) {
            m37892K(12);
        }
        this.f41014q = interfaceC10587g;
        this.f41011n = new C10331l(this, Collections.emptyList(), Collections.singleton(abstractC10311e0), interfaceC10297n);
        this.f41012o = new a(this, interfaceC10297n);
        this.f41013p = interfaceC10292i;
    }

    /* renamed from: K */
    private static /* synthetic */ void m37892K(int i2) {
        String str;
        int i3;
        switch (i2) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i3 = 2;
                break;
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i2) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i2) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String format = String.format(str, objArr);
        switch (i2) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    /* renamed from: M0 */
    public static C10630n m37894M0(InterfaceC10297n interfaceC10297n, InterfaceC10552e interfaceC10552e, C10130f c10130f, InterfaceC10292i<Set<C10130f>> interfaceC10292i, InterfaceC10587g interfaceC10587g, InterfaceC10708z0 interfaceC10708z0) {
        if (interfaceC10297n == null) {
            m37892K(0);
        }
        if (interfaceC10552e == null) {
            m37892K(1);
        }
        if (c10130f == null) {
            m37892K(2);
        }
        if (interfaceC10292i == null) {
            m37892K(3);
        }
        if (interfaceC10587g == null) {
            m37892K(4);
        }
        if (interfaceC10708z0 == null) {
            m37892K(5);
        }
        return new C10630n(interfaceC10297n, interfaceC10552e, interfaceC10552e.mo36400s(), c10130f, interfaceC10292i, interfaceC10587g, interfaceC10708z0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: A */
    public boolean mo32857A() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: D */
    public boolean mo32858D() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    /* renamed from: E0 */
    public boolean mo32859E0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10637t
    /* renamed from: H */
    public InterfaceC10218h mo32860H(AbstractC10363g abstractC10363g) {
        if (abstractC10363g == null) {
            m37892K(13);
        }
        InterfaceC10218h interfaceC10218h = this.f41012o;
        if (interfaceC10218h == null) {
            m37892K(14);
        }
        return interfaceC10218h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: J */
    public Collection<InterfaceC10552e> mo32861J() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            m37892K(23);
        }
        return emptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: J0 */
    public boolean mo32862J0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    /* renamed from: M */
    public boolean mo32863M() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: R */
    public InterfaceC10549d mo32864R() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: S */
    public InterfaceC10218h mo32866S() {
        InterfaceC10218h.b bVar = InterfaceC10218h.b.f39671b;
        if (bVar == null) {
            m37892K(15);
        }
        return bVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: U */
    public InterfaceC10552e mo32869U() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10581a
    public InterfaceC10587g getAnnotations() {
        InterfaceC10587g interfaceC10587g = this.f41014q;
        if (interfaceC10587g == null) {
            m37892K(21);
        }
        return interfaceC10587g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10644q, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    public AbstractC10697u getVisibility() {
        AbstractC10697u abstractC10697u = C10695t.f41220e;
        if (abstractC10697u == null) {
            m37892K(20);
        }
        return abstractC10697u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h
    /* renamed from: h */
    public InterfaceC10312e1 mo32877h() {
        InterfaceC10312e1 interfaceC10312e1 = this.f41011n;
        if (interfaceC10312e1 == null) {
            m37892K(17);
        }
        return interfaceC10312e1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: i */
    public EnumC10555f mo32878i() {
        EnumC10555f enumC10555f = EnumC10555f.ENUM_ENTRY;
        if (enumC10555f == null) {
            m37892K(18);
        }
        return enumC10555f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    /* renamed from: j */
    public EnumC10550d0 mo32879j() {
        EnumC10550d0 enumC10550d0 = EnumC10550d0.FINAL;
        if (enumC10550d0 == null) {
            m37892K(19);
        }
        return enumC10550d0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: k */
    public Collection<InterfaceC10549d> mo32880k() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            m37892K(16);
        }
        return emptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: l */
    public boolean mo32881l() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10564i
    /* renamed from: m */
    public boolean mo32882m() {
        return false;
    }

    public String toString() {
        return "enum entry " + getName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10564i
    /* renamed from: w */
    public List<InterfaceC10554e1> mo32884w() {
        List<InterfaceC10554e1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m37892K(22);
        }
        return emptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: z0 */
    public AbstractC10560g1<AbstractC10335m0> mo32886z0() {
        return null;
    }
}
