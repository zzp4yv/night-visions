package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10548c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10595o;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10152b;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10217g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10224n;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10292i;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10316g;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10300a1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10314f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10351r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10394k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.EnumC10393j;

/* compiled from: AbstractTypeParameterDescriptor.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.e */
/* loaded from: classes2.dex */
public abstract class AbstractC10612e extends AbstractC10624k implements InterfaceC10554e1 {

    /* renamed from: j */
    private final EnumC10351r1 f40955j;

    /* renamed from: k */
    private final boolean f40956k;

    /* renamed from: l */
    private final int f40957l;

    /* renamed from: m */
    private final InterfaceC10292i<InterfaceC10312e1> f40958m;

    /* renamed from: n */
    private final InterfaceC10292i<AbstractC10335m0> f40959n;

    /* renamed from: o */
    private final InterfaceC10297n f40960o;

    /* compiled from: AbstractTypeParameterDescriptor.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.e$a */
    class a implements Function0<InterfaceC10312e1> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC10297n f40961f;

        /* renamed from: g */
        final /* synthetic */ InterfaceC10548c1 f40962g;

        a(InterfaceC10297n interfaceC10297n, InterfaceC10548c1 interfaceC10548c1) {
            this.f40961f = interfaceC10297n;
            this.f40962g = interfaceC10548c1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC10312e1 invoke() {
            return new c(AbstractC10612e.this, this.f40961f, this.f40962g);
        }
    }

    /* compiled from: AbstractTypeParameterDescriptor.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.e$b */
    class b implements Function0<AbstractC10335m0> {

        /* renamed from: f */
        final /* synthetic */ C10130f f40964f;

        /* compiled from: AbstractTypeParameterDescriptor.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.e$b$a */
        class a implements Function0<InterfaceC10218h> {
            a() {
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public InterfaceC10218h invoke() {
                return C10224n.m36174j("Scope for type parameter " + b.this.f40964f.m35455k(), AbstractC10612e.this.getUpperBounds());
            }
        }

        b(C10130f c10130f) {
            this.f40964f = c10130f;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC10335m0 invoke() {
            return C10314f0.m36670j(C10300a1.f40041g.m36577h(), AbstractC10612e.this.mo32877h(), Collections.emptyList(), false, new C10217g(new a()));
        }
    }

    /* compiled from: AbstractTypeParameterDescriptor.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.e$c */
    private class c extends AbstractC10316g {

        /* renamed from: d */
        private final InterfaceC10548c1 f40967d;

        /* renamed from: e */
        final /* synthetic */ AbstractC10612e f40968e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC10612e abstractC10612e, InterfaceC10297n interfaceC10297n, InterfaceC10548c1 interfaceC10548c1) {
            super(interfaceC10297n);
            if (interfaceC10297n == null) {
                m37833v(0);
            }
            this.f40968e = abstractC10612e;
            this.f40967d = interfaceC10548c1;
        }

        /* renamed from: v */
        private static /* synthetic */ void m37833v(int i2) {
            String str = (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 8) ? 2 : 3];
            switch (i2) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i2 == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i2 == 2) {
                objArr[1] = "getParameters";
            } else if (i2 == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i2 == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i2 == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i2 != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i2) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4 && i2 != 5 && i2 != 8) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10334m, kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
        /* renamed from: c */
        public InterfaceC10561h mo32887c() {
            AbstractC10612e abstractC10612e = this.f40968e;
            if (abstractC10612e == null) {
                m37833v(3);
            }
            return abstractC10612e;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
        /* renamed from: e */
        public boolean mo32888e() {
            return true;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
        public List<InterfaceC10554e1> getParameters() {
            List<InterfaceC10554e1> emptyList = Collections.emptyList();
            if (emptyList == null) {
                m37833v(2);
            }
            return emptyList;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10334m
        /* renamed from: i */
        protected boolean mo36579i(InterfaceC10561h interfaceC10561h) {
            if (interfaceC10561h == null) {
                m37833v(9);
            }
            return (interfaceC10561h instanceof InterfaceC10554e1) && C10152b.f39498a.m35777f(this.f40968e, (InterfaceC10554e1) interfaceC10561h, true);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10316g
        /* renamed from: l */
        protected Collection<AbstractC10311e0> mo32889l() {
            List<AbstractC10311e0> mo33498M0 = this.f40968e.mo33498M0();
            if (mo33498M0 == null) {
                m37833v(1);
            }
            return mo33498M0;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10316g
        /* renamed from: m */
        protected AbstractC10311e0 mo36580m() {
            return C10394k.m37053d(EnumC10393j.f40347x, new String[0]);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
        /* renamed from: o */
        public AbstractC9881h mo36004o() {
            AbstractC9881h m36072f = C10202a.m36072f(this.f40968e);
            if (m36072f == null) {
                m37833v(4);
            }
            return m36072f;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10316g
        /* renamed from: q */
        protected InterfaceC10548c1 mo32890q() {
            InterfaceC10548c1 interfaceC10548c1 = this.f40967d;
            if (interfaceC10548c1 == null) {
                m37833v(5);
            }
            return interfaceC10548c1;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10316g
        /* renamed from: s */
        protected List<AbstractC10311e0> mo36690s(List<AbstractC10311e0> list) {
            if (list == null) {
                m37833v(7);
            }
            List<AbstractC10311e0> mo33496A0 = this.f40968e.mo33496A0(list);
            if (mo33496A0 == null) {
                m37833v(8);
            }
            return mo33496A0;
        }

        public String toString() {
            return this.f40968e.getName().toString();
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10316g
        /* renamed from: u */
        protected void mo36692u(AbstractC10311e0 abstractC10311e0) {
            if (abstractC10311e0 == null) {
                m37833v(6);
            }
            this.f40968e.mo33497L0(abstractC10311e0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC10612e(InterfaceC10297n interfaceC10297n, InterfaceC10576m interfaceC10576m, InterfaceC10587g interfaceC10587g, C10130f c10130f, EnumC10351r1 enumC10351r1, boolean z, int i2, InterfaceC10708z0 interfaceC10708z0, InterfaceC10548c1 interfaceC10548c1) {
        super(interfaceC10576m, interfaceC10587g, c10130f, interfaceC10708z0);
        if (interfaceC10297n == null) {
            m37829v(0);
        }
        if (interfaceC10576m == null) {
            m37829v(1);
        }
        if (interfaceC10587g == null) {
            m37829v(2);
        }
        if (c10130f == null) {
            m37829v(3);
        }
        if (enumC10351r1 == null) {
            m37829v(4);
        }
        if (interfaceC10708z0 == null) {
            m37829v(5);
        }
        if (interfaceC10548c1 == null) {
            m37829v(6);
        }
        this.f40955j = enumC10351r1;
        this.f40956k = z;
        this.f40957l = i2;
        this.f40958m = interfaceC10297n.mo36516d(new a(interfaceC10297n, interfaceC10548c1));
        this.f40959n = interfaceC10297n.mo36516d(new b(c10130f));
        this.f40960o = interfaceC10297n;
    }

    /* renamed from: v */
    private static /* synthetic */ void m37829v(int i2) {
        String str;
        int i3;
        switch (i2) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i3 = 2;
                break;
            case 12:
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i2) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i2) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i2) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(format);
            case 12:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    /* renamed from: A0 */
    protected List<AbstractC10311e0> mo33496A0(List<AbstractC10311e0> list) {
        if (list == null) {
            m37829v(12);
        }
        if (list == null) {
            m37829v(13);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1
    /* renamed from: F */
    public boolean mo37669F() {
        return this.f40956k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: L */
    public <R, D> R mo37017L(InterfaceC10595o<R, D> interfaceC10595o, D d2) {
        return interfaceC10595o.mo35683m(this, d2);
    }

    /* renamed from: L0 */
    protected abstract void mo33497L0(AbstractC10311e0 abstractC10311e0);

    /* renamed from: M0 */
    protected abstract List<AbstractC10311e0> mo33498M0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1
    /* renamed from: g */
    public int mo37670g() {
        return this.f40957l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1
    public List<AbstractC10311e0> getUpperBounds() {
        List<AbstractC10311e0> mo35998a = ((c) mo32877h()).mo35998a();
        if (mo35998a == null) {
            m37829v(8);
        }
        return mo35998a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h
    /* renamed from: h */
    public final InterfaceC10312e1 mo32877h() {
        InterfaceC10312e1 invoke = this.f40958m.invoke();
        if (invoke == null) {
            m37829v(9);
        }
        return invoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1
    /* renamed from: h0 */
    public InterfaceC10297n mo37671h0() {
        InterfaceC10297n interfaceC10297n = this.f40960o;
        if (interfaceC10297n == null) {
            m37829v(14);
        }
        return interfaceC10297n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1
    /* renamed from: n */
    public EnumC10351r1 mo37672n() {
        EnumC10351r1 enumC10351r1 = this.f40955j;
        if (enumC10351r1 == null) {
            m37829v(7);
        }
        return enumC10351r1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1
    /* renamed from: o0 */
    public boolean mo37673o0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h
    /* renamed from: s */
    public AbstractC10335m0 mo36400s() {
        AbstractC10335m0 invoke = this.f40959n.invoke();
        if (invoke == null) {
            m37829v(10);
        }
        return invoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10624k, kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10622j, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: a */
    public InterfaceC10554e1 mo37019a() {
        InterfaceC10554e1 interfaceC10554e1 = (InterfaceC10554e1) super.mo37019a();
        if (interfaceC10554e1 == null) {
            m37829v(11);
        }
        return interfaceC10554e1;
    }
}
