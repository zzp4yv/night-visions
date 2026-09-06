package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10551d1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10595o;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10702w0;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10154d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10216f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10223m;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10292i;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10327j1;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10314f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10333l1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10339n1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g;

/* compiled from: AbstractClassDescriptor.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.a */
/* loaded from: classes2.dex */
public abstract class AbstractC10604a extends AbstractC10637t {

    /* renamed from: g */
    private final C10130f f40894g;

    /* renamed from: h */
    protected final InterfaceC10292i<AbstractC10335m0> f40895h;

    /* renamed from: i */
    private final InterfaceC10292i<InterfaceC10218h> f40896i;

    /* renamed from: j */
    private final InterfaceC10292i<InterfaceC10702w0> f40897j;

    /* compiled from: AbstractClassDescriptor.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.a$a */
    class a implements Function0<AbstractC10335m0> {

        /* compiled from: AbstractClassDescriptor.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.a$a$a, reason: collision with other inner class name */
        class C11531a implements Function1<AbstractC10363g, AbstractC10335m0> {
            C11531a() {
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public AbstractC10335m0 invoke(AbstractC10363g abstractC10363g) {
                InterfaceC10561h mo36928f = abstractC10363g.mo36928f(AbstractC10604a.this);
                return mo36928f == null ? AbstractC10604a.this.f40895h.invoke() : mo36928f instanceof InterfaceC10551d1 ? C10314f0.m36662b((InterfaceC10551d1) mo36928f, C10339n1.m36774g(mo36928f.mo32877h().getParameters())) : mo36928f instanceof AbstractC10637t ? C10339n1.m36788u(mo36928f.mo32877h().mo35999b(abstractC10363g), ((AbstractC10637t) mo36928f).mo32860H(abstractC10363g), this) : mo36928f.mo36400s();
            }
        }

        a() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC10335m0 invoke() {
            AbstractC10604a abstractC10604a = AbstractC10604a.this;
            return C10339n1.m36787t(abstractC10604a, abstractC10604a.mo33340D0(), new C11531a());
        }
    }

    /* compiled from: AbstractClassDescriptor.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.a$b */
    class b implements Function0<InterfaceC10218h> {
        b() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC10218h invoke() {
            return new C10216f(AbstractC10604a.this.mo33340D0());
        }
    }

    /* compiled from: AbstractClassDescriptor.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.a$c */
    class c implements Function0<InterfaceC10702w0> {
        c() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC10702w0 invoke() {
            return new C10634q(AbstractC10604a.this);
        }
    }

    public AbstractC10604a(InterfaceC10297n interfaceC10297n, C10130f c10130f) {
        if (interfaceC10297n == null) {
            m37753K(0);
        }
        if (c10130f == null) {
            m37753K(1);
        }
        this.f40894g = c10130f;
        this.f40895h = interfaceC10297n.mo36516d(new a());
        this.f40896i = interfaceC10297n.mo36516d(new b());
        this.f40897j = interfaceC10297n.mo36516d(new c());
    }

    /* renamed from: K */
    private static /* synthetic */ void m37753K(int i2) {
        String str = (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 6 || i2 == 9 || i2 == 12 || i2 == 14 || i2 == 16 || i2 == 17 || i2 == 19 || i2 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 6 || i2 == 9 || i2 == 12 || i2 == 14 || i2 == 16 || i2 == 17 || i2 == 19 || i2 == 20) ? 2 : 3];
        switch (i2) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i2 == 2) {
            objArr[1] = "getName";
        } else if (i2 == 3) {
            objArr[1] = "getOriginal";
        } else if (i2 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i2 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i2 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i2 == 9 || i2 == 12 || i2 == 14 || i2 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i2 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i2 == 19) {
            objArr[1] = "substitute";
        } else if (i2 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i2) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i2 != 2 && i2 != 3 && i2 != 4 && i2 != 5 && i2 != 6 && i2 != 9 && i2 != 12 && i2 != 14 && i2 != 16 && i2 != 17 && i2 != 19 && i2 != 20) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10545b1
    /* renamed from: A0, reason: merged with bridge method [inline-methods] */
    public InterfaceC10552e mo36396c(C10333l1 c10333l1) {
        if (c10333l1 == null) {
            m37753K(18);
        }
        return c10333l1.m36756k() ? this : new C10636s(this, c10333l1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: D0 */
    public InterfaceC10218h mo33340D0() {
        InterfaceC10218h mo32860H = mo32860H(C10202a.m36077k(C10154d.m35819g(this)));
        if (mo32860H == null) {
            m37753K(17);
        }
        return mo32860H;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: F0 */
    public List<InterfaceC10702w0> mo36281F0() {
        List<InterfaceC10702w0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m37753K(6);
        }
        return emptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: K0 */
    public InterfaceC10702w0 mo37677K0() {
        InterfaceC10702w0 invoke = this.f40897j.invoke();
        if (invoke == null) {
            m37753K(5);
        }
        return invoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: L */
    public <R, D> R mo37017L(InterfaceC10595o<R, D> interfaceC10595o, D d2) {
        return interfaceC10595o.mo35674a(this, d2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: a */
    public InterfaceC10552e mo37019a() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: a0 */
    public InterfaceC10218h mo37678a0(AbstractC10327j1 abstractC10327j1) {
        if (abstractC10327j1 == null) {
            m37753K(15);
        }
        InterfaceC10218h mo36986v = mo36986v(abstractC10327j1, C10202a.m36077k(C10154d.m35819g(this)));
        if (mo36986v == null) {
            m37753K(16);
        }
        return mo36986v;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10565i0
    public C10130f getName() {
        C10130f c10130f = this.f40894g;
        if (c10130f == null) {
            m37753K(2);
        }
        return c10130f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h
    /* renamed from: s */
    public AbstractC10335m0 mo36400s() {
        AbstractC10335m0 invoke = this.f40895h.invoke();
        if (invoke == null) {
            m37753K(20);
        }
        return invoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10637t
    /* renamed from: v */
    public InterfaceC10218h mo36986v(AbstractC10327j1 abstractC10327j1, AbstractC10363g abstractC10363g) {
        if (abstractC10327j1 == null) {
            m37753K(10);
        }
        if (abstractC10363g == null) {
            m37753K(11);
        }
        if (!abstractC10327j1.mo33537f()) {
            return new C10223m(mo32860H(abstractC10363g), C10333l1.m36747g(abstractC10327j1));
        }
        InterfaceC10218h mo32860H = mo32860H(abstractC10363g);
        if (mo32860H == null) {
            m37753K(12);
        }
        return mo32860H;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: y0 */
    public InterfaceC10218h mo33348y0() {
        InterfaceC10218h invoke = this.f40896i.invoke();
        if (invoke == null) {
            m37753K(4);
        }
        return invoke;
    }
}
