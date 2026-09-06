package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10697u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10695t;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10550d0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10595o;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10694s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10698u0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10700v0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10701w;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10702w0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.jvm.internal.impl.utils.C10739f;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10178g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o.C10227c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o.C10228d;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10293j;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10327j1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10333l1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10355t;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10351r1;

/* compiled from: PropertyDescriptorImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.c0 */
/* loaded from: classes2.dex */
public class C10609c0 extends AbstractC10631n0 implements InterfaceC10696t0 {

    /* renamed from: A */
    private InterfaceC10702w0 f40914A;

    /* renamed from: B */
    private List<InterfaceC10554e1> f40915B;

    /* renamed from: C */
    private C10611d0 f40916C;

    /* renamed from: D */
    private InterfaceC10700v0 f40917D;

    /* renamed from: E */
    private boolean f40918E;

    /* renamed from: F */
    private InterfaceC10701w f40919F;

    /* renamed from: G */
    private InterfaceC10701w f40920G;

    /* renamed from: n */
    private final EnumC10550d0 f40921n;

    /* renamed from: o */
    private AbstractC10697u f40922o;

    /* renamed from: p */
    private Collection<? extends InterfaceC10696t0> f40923p;

    /* renamed from: q */
    private final InterfaceC10696t0 f40924q;

    /* renamed from: r */
    private final InterfaceC10543b.a f40925r;

    /* renamed from: s */
    private final boolean f40926s;

    /* renamed from: t */
    private final boolean f40927t;

    /* renamed from: u */
    private final boolean f40928u;

    /* renamed from: v */
    private final boolean f40929v;

    /* renamed from: w */
    private final boolean f40930w;

    /* renamed from: x */
    private final boolean f40931x;

    /* renamed from: y */
    private List<InterfaceC10702w0> f40932y;

    /* renamed from: z */
    private InterfaceC10702w0 f40933z;

    /* compiled from: PropertyDescriptorImpl.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.c0$a */
    public class a {

        /* renamed from: a */
        private InterfaceC10576m f40934a;

        /* renamed from: b */
        private EnumC10550d0 f40935b;

        /* renamed from: c */
        private AbstractC10697u f40936c;

        /* renamed from: f */
        private InterfaceC10543b.a f40939f;

        /* renamed from: i */
        private InterfaceC10702w0 f40942i;

        /* renamed from: k */
        private C10130f f40944k;

        /* renamed from: l */
        private AbstractC10311e0 f40945l;

        /* renamed from: d */
        private InterfaceC10696t0 f40937d = null;

        /* renamed from: e */
        private boolean f40938e = false;

        /* renamed from: g */
        private AbstractC10327j1 f40940g = AbstractC10327j1.f40132b;

        /* renamed from: h */
        private boolean f40941h = true;

        /* renamed from: j */
        private List<InterfaceC10554e1> f40943j = null;

        public a() {
            this.f40934a = C10609c0.this.mo32876b();
            this.f40935b = C10609c0.this.mo32879j();
            this.f40936c = C10609c0.this.getVisibility();
            this.f40939f = C10609c0.this.mo37030i();
            this.f40942i = C10609c0.this.f40933z;
            this.f40944k = C10609c0.this.getName();
            this.f40945l = C10609c0.this.getType();
        }

        /* renamed from: a */
        private static /* synthetic */ void m37796a(int i2) {
            String str = (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 5 || i2 == 7 || i2 == 9 || i2 == 11 || i2 == 19 || i2 == 13 || i2 == 14 || i2 == 16 || i2 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i2 == 1 || i2 == 2 || i2 == 3 || i2 == 5 || i2 == 7 || i2 == 9 || i2 == 11 || i2 == 19 || i2 == 13 || i2 == 14 || i2 == 16 || i2 == 17) ? 2 : 3];
            switch (i2) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i2 == 1) {
                objArr[1] = "setOwner";
            } else if (i2 == 2) {
                objArr[1] = "setOriginal";
            } else if (i2 == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i2 == 5) {
                objArr[1] = "setReturnType";
            } else if (i2 == 7) {
                objArr[1] = "setModality";
            } else if (i2 == 9) {
                objArr[1] = "setVisibility";
            } else if (i2 == 11) {
                objArr[1] = "setKind";
            } else if (i2 == 19) {
                objArr[1] = "setName";
            } else if (i2 == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i2 == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i2 == 16) {
                objArr[1] = "setSubstitution";
            } else if (i2 != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i2) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String format = String.format(str, objArr);
            if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 5 && i2 != 7 && i2 != 9 && i2 != 11 && i2 != 19 && i2 != 13 && i2 != 14 && i2 != 16 && i2 != 17) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        /* renamed from: n */
        public InterfaceC10696t0 m37809n() {
            return C10609c0.this.m37787R0(this);
        }

        /* renamed from: o */
        InterfaceC10698u0 m37810o() {
            InterfaceC10696t0 interfaceC10696t0 = this.f40937d;
            if (interfaceC10696t0 == null) {
                return null;
            }
            return interfaceC10696t0.getGetter();
        }

        /* renamed from: p */
        InterfaceC10700v0 m37811p() {
            InterfaceC10696t0 interfaceC10696t0 = this.f40937d;
            if (interfaceC10696t0 == null) {
                return null;
            }
            return interfaceC10696t0.getSetter();
        }

        /* renamed from: q */
        public a m37812q(boolean z) {
            this.f40941h = z;
            return this;
        }

        /* renamed from: r */
        public a m37813r(InterfaceC10543b.a aVar) {
            if (aVar == null) {
                m37796a(10);
            }
            this.f40939f = aVar;
            return this;
        }

        /* renamed from: s */
        public a m37814s(EnumC10550d0 enumC10550d0) {
            if (enumC10550d0 == null) {
                m37796a(6);
            }
            this.f40935b = enumC10550d0;
            return this;
        }

        /* renamed from: t */
        public a m37815t(InterfaceC10543b interfaceC10543b) {
            this.f40937d = (InterfaceC10696t0) interfaceC10543b;
            return this;
        }

        /* renamed from: u */
        public a m37816u(InterfaceC10576m interfaceC10576m) {
            if (interfaceC10576m == null) {
                m37796a(0);
            }
            this.f40934a = interfaceC10576m;
            return this;
        }

        /* renamed from: v */
        public a m37817v(AbstractC10327j1 abstractC10327j1) {
            if (abstractC10327j1 == null) {
                m37796a(15);
            }
            this.f40940g = abstractC10327j1;
            return this;
        }

        /* renamed from: w */
        public a m37818w(AbstractC10697u abstractC10697u) {
            if (abstractC10697u == null) {
                m37796a(8);
            }
            this.f40936c = abstractC10697u;
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected C10609c0(InterfaceC10576m interfaceC10576m, InterfaceC10696t0 interfaceC10696t0, InterfaceC10587g interfaceC10587g, EnumC10550d0 enumC10550d0, AbstractC10697u abstractC10697u, boolean z, C10130f c10130f, InterfaceC10543b.a aVar, InterfaceC10708z0 interfaceC10708z0, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        super(interfaceC10576m, interfaceC10587g, c10130f, null, z, interfaceC10708z0);
        if (interfaceC10576m == null) {
            m37785v(0);
        }
        if (interfaceC10587g == null) {
            m37785v(1);
        }
        if (enumC10550d0 == null) {
            m37785v(2);
        }
        if (abstractC10697u == null) {
            m37785v(3);
        }
        if (c10130f == null) {
            m37785v(4);
        }
        if (aVar == null) {
            m37785v(5);
        }
        if (interfaceC10708z0 == null) {
            m37785v(6);
        }
        this.f40923p = null;
        this.f40932y = Collections.emptyList();
        this.f40921n = enumC10550d0;
        this.f40922o = abstractC10697u;
        this.f40924q = interfaceC10696t0 == null ? this : interfaceC10696t0;
        this.f40925r = aVar;
        this.f40926s = z2;
        this.f40927t = z3;
        this.f40928u = z4;
        this.f40929v = z5;
        this.f40930w = z6;
        this.f40931x = z7;
    }

    /* renamed from: P0 */
    public static C10609c0 m37779P0(InterfaceC10576m interfaceC10576m, InterfaceC10587g interfaceC10587g, EnumC10550d0 enumC10550d0, AbstractC10697u abstractC10697u, boolean z, C10130f c10130f, InterfaceC10543b.a aVar, InterfaceC10708z0 interfaceC10708z0, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        if (interfaceC10576m == null) {
            m37785v(7);
        }
        if (interfaceC10587g == null) {
            m37785v(8);
        }
        if (enumC10550d0 == null) {
            m37785v(9);
        }
        if (abstractC10697u == null) {
            m37785v(10);
        }
        if (c10130f == null) {
            m37785v(11);
        }
        if (aVar == null) {
            m37785v(12);
        }
        if (interfaceC10708z0 == null) {
            m37785v(13);
        }
        return new C10609c0(interfaceC10576m, null, interfaceC10587g, enumC10550d0, abstractC10697u, z, c10130f, aVar, interfaceC10708z0, z2, z3, z4, z5, z6, z7);
    }

    /* renamed from: T0 */
    private InterfaceC10708z0 m37780T0(boolean z, InterfaceC10696t0 interfaceC10696t0) {
        InterfaceC10708z0 interfaceC10708z0;
        if (z) {
            if (interfaceC10696t0 == null) {
                interfaceC10696t0 = mo37019a();
            }
            interfaceC10708z0 = interfaceC10696t0.mo32883t();
        } else {
            interfaceC10708z0 = InterfaceC10708z0.f41247a;
        }
        if (interfaceC10708z0 == null) {
            m37785v(28);
        }
        return interfaceC10708z0;
    }

    /* renamed from: U0 */
    private static InterfaceC10705y m37781U0(C10333l1 c10333l1, InterfaceC10694s0 interfaceC10694s0) {
        if (c10333l1 == null) {
            m37785v(30);
        }
        if (interfaceC10694s0 == null) {
            m37785v(31);
        }
        if (interfaceC10694s0.mo37774d0() != null) {
            return interfaceC10694s0.mo37774d0().mo36396c(c10333l1);
        }
        return null;
    }

    /* renamed from: Z0 */
    private static AbstractC10697u m37782Z0(AbstractC10697u abstractC10697u, InterfaceC10543b.a aVar) {
        return (aVar == InterfaceC10543b.a.FAKE_OVERRIDE && C10695t.m38132g(abstractC10697u.mo38009f())) ? C10695t.f41223h : abstractC10697u;
    }

    /* renamed from: e1 */
    private static InterfaceC10702w0 m37783e1(C10333l1 c10333l1, InterfaceC10696t0 interfaceC10696t0, InterfaceC10702w0 interfaceC10702w0) {
        AbstractC10311e0 m36759p = c10333l1.m36759p(interfaceC10702w0.getType(), EnumC10351r1.IN_VARIANCE);
        if (m36759p == null) {
            return null;
        }
        return new C10615f0(interfaceC10696t0, new C10227c(interfaceC10696t0, m36759p, interfaceC10702w0.getValue()), interfaceC10702w0.getAnnotations());
    }

    /* renamed from: f1 */
    private static InterfaceC10702w0 m37784f1(C10333l1 c10333l1, InterfaceC10696t0 interfaceC10696t0, InterfaceC10702w0 interfaceC10702w0) {
        AbstractC10311e0 m36759p = c10333l1.m36759p(interfaceC10702w0.getType(), EnumC10351r1.IN_VARIANCE);
        if (m36759p == null) {
            return null;
        }
        return new C10615f0(interfaceC10696t0, new C10228d(interfaceC10696t0, m36759p, interfaceC10702w0.getValue()), interfaceC10702w0.getAnnotations());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0099  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void m37785v(int r11) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10609c0.m37785v(int):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    /* renamed from: E0 */
    public boolean mo32859E0() {
        return this.f40929v;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: L */
    public <R, D> R mo37017L(InterfaceC10595o<R, D> interfaceC10595o, D d2) {
        return interfaceC10595o.mo32473d(this, d2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    /* renamed from: M */
    public boolean mo32863M() {
        return this.f40928u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10572k1
    /* renamed from: O */
    public boolean mo37025O() {
        return this.f40931x;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public InterfaceC10696t0 mo36990k0(InterfaceC10576m interfaceC10576m, EnumC10550d0 enumC10550d0, AbstractC10697u abstractC10697u, InterfaceC10543b.a aVar, boolean z) {
        InterfaceC10696t0 m37809n = m37792Y0().m37816u(interfaceC10576m).m37815t(null).m37814s(enumC10550d0).m37818w(abstractC10697u).m37813r(aVar).m37812q(z).m37809n();
        if (m37809n == null) {
            m37785v(42);
        }
        return m37809n;
    }

    /* renamed from: Q0 */
    protected C10609c0 mo33222Q0(InterfaceC10576m interfaceC10576m, EnumC10550d0 enumC10550d0, AbstractC10697u abstractC10697u, InterfaceC10696t0 interfaceC10696t0, InterfaceC10543b.a aVar, C10130f c10130f, InterfaceC10708z0 interfaceC10708z0) {
        if (interfaceC10576m == null) {
            m37785v(32);
        }
        if (enumC10550d0 == null) {
            m37785v(33);
        }
        if (abstractC10697u == null) {
            m37785v(34);
        }
        if (aVar == null) {
            m37785v(35);
        }
        if (c10130f == null) {
            m37785v(36);
        }
        if (interfaceC10708z0 == null) {
            m37785v(37);
        }
        return new C10609c0(interfaceC10576m, interfaceC10696t0, getAnnotations(), enumC10550d0, abstractC10697u, mo37031j0(), c10130f, aVar, interfaceC10708z0, mo37036s0(), isConst(), mo32863M(), mo32859E0(), mo32885z(), mo37025O());
    }

    /* renamed from: R0 */
    protected InterfaceC10696t0 m37787R0(a aVar) {
        InterfaceC10702w0 interfaceC10702w0;
        Function0<InterfaceC10293j<AbstractC10178g<?>>> function0;
        if (aVar == null) {
            m37785v(29);
        }
        C10609c0 mo33222Q0 = mo33222Q0(aVar.f40934a, aVar.f40935b, aVar.f40936c, aVar.f40937d, aVar.f40939f, aVar.f40944k, m37780T0(aVar.f40938e, aVar.f40937d));
        List<InterfaceC10554e1> typeParameters = aVar.f40943j == null ? getTypeParameters() : aVar.f40943j;
        ArrayList arrayList = new ArrayList(typeParameters.size());
        C10333l1 m36825b = C10355t.m36825b(typeParameters, aVar.f40940g, mo33222Q0, arrayList);
        AbstractC10311e0 abstractC10311e0 = aVar.f40945l;
        AbstractC10311e0 m36759p = m36825b.m36759p(abstractC10311e0, EnumC10351r1.OUT_VARIANCE);
        if (m36759p == null) {
            return null;
        }
        AbstractC10311e0 m36759p2 = m36825b.m36759p(abstractC10311e0, EnumC10351r1.IN_VARIANCE);
        if (m36759p2 != null) {
            mo33222Q0.mo33223a1(m36759p2);
        }
        InterfaceC10702w0 interfaceC10702w02 = aVar.f40942i;
        if (interfaceC10702w02 != null) {
            InterfaceC10702w0 mo36396c = interfaceC10702w02.mo36396c(m36825b);
            if (mo36396c == null) {
                return null;
            }
            interfaceC10702w0 = mo36396c;
        } else {
            interfaceC10702w0 = null;
        }
        InterfaceC10702w0 interfaceC10702w03 = this.f40914A;
        InterfaceC10702w0 m37784f1 = interfaceC10702w03 != null ? m37784f1(m36825b, mo33222Q0, interfaceC10702w03) : null;
        ArrayList arrayList2 = new ArrayList();
        Iterator<InterfaceC10702w0> it = this.f40932y.iterator();
        while (it.hasNext()) {
            InterfaceC10702w0 m37783e1 = m37783e1(m36825b, mo33222Q0, it.next());
            if (m37783e1 != null) {
                arrayList2.add(m37783e1);
            }
        }
        mo33222Q0.m37794c1(m36759p, arrayList, interfaceC10702w0, m37784f1, arrayList2);
        C10611d0 c10611d0 = this.f40916C == null ? null : new C10611d0(mo33222Q0, this.f40916C.getAnnotations(), aVar.f40935b, m37782Z0(this.f40916C.getVisibility(), aVar.f40939f), this.f40916C.mo37773V(), this.f40916C.mo32885z(), this.f40916C.isInline(), aVar.f40939f, aVar.m37810o(), InterfaceC10708z0.f41247a);
        if (c10611d0 != null) {
            AbstractC10311e0 returnType = this.f40916C.getReturnType();
            c10611d0.m37770O0(m37781U0(m36825b, this.f40916C));
            c10611d0.m37828R0(returnType != null ? m36825b.m36759p(returnType, EnumC10351r1.OUT_VARIANCE) : null);
        }
        C10613e0 c10613e0 = this.f40917D == null ? null : new C10613e0(mo33222Q0, this.f40917D.getAnnotations(), aVar.f40935b, m37782Z0(this.f40917D.getVisibility(), aVar.f40939f), this.f40917D.mo37773V(), this.f40917D.mo32885z(), this.f40917D.isInline(), aVar.f40939f, aVar.m37811p(), InterfaceC10708z0.f41247a);
        if (c10613e0 != null) {
            List<InterfaceC10566i1> m37914Q0 = AbstractC10633p.m37914Q0(c10613e0, this.f40917D.mo37028f(), m36825b, false, false, null);
            if (m37914Q0 == null) {
                mo33222Q0.m37793b1(true);
                m37914Q0 = Collections.singletonList(C10613e0.m37834Q0(c10613e0, C10202a.m36072f(aVar.f40934a).m32773H(), this.f40917D.mo37028f().get(0).getAnnotations()));
            }
            if (m37914Q0.size() != 1) {
                throw new IllegalStateException();
            }
            c10613e0.m37770O0(m37781U0(m36825b, this.f40917D));
            c10613e0.m37837S0(m37914Q0.get(0));
        }
        InterfaceC10701w interfaceC10701w = this.f40919F;
        C10632o c10632o = interfaceC10701w == null ? null : new C10632o(interfaceC10701w.getAnnotations(), mo33222Q0);
        InterfaceC10701w interfaceC10701w2 = this.f40920G;
        mo33222Q0.m37790W0(c10611d0, c10613e0, c10632o, interfaceC10701w2 != null ? new C10632o(interfaceC10701w2.getAnnotations(), mo33222Q0) : null);
        if (aVar.f40941h) {
            C10739f m38540c = C10739f.m38540c();
            Iterator<? extends InterfaceC10696t0> it2 = mo37027e().iterator();
            while (it2.hasNext()) {
                m38540c.add(it2.next().mo36396c(m36825b));
            }
            mo33222Q0.mo36993x0(m38540c);
        }
        if (isConst() && (function0 = this.f41029m) != null) {
            mo33222Q0.m37909L0(this.f41028l, function0);
        }
        return mo33222Q0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0
    /* renamed from: S0, reason: merged with bridge method [inline-methods] */
    public C10611d0 getGetter() {
        return this.f40916C;
    }

    /* renamed from: V0 */
    public void m37789V0(C10611d0 c10611d0, InterfaceC10700v0 interfaceC10700v0) {
        m37790W0(c10611d0, interfaceC10700v0, null, null);
    }

    /* renamed from: W0 */
    public void m37790W0(C10611d0 c10611d0, InterfaceC10700v0 interfaceC10700v0, InterfaceC10701w interfaceC10701w, InterfaceC10701w interfaceC10701w2) {
        this.f40916C = c10611d0;
        this.f40917D = interfaceC10700v0;
        this.f40919F = interfaceC10701w;
        this.f40920G = interfaceC10701w2;
    }

    /* renamed from: X0 */
    public boolean m37791X0() {
        return this.f40918E;
    }

    /* renamed from: Y0 */
    public a m37792Y0() {
        return new a();
    }

    /* renamed from: a1 */
    public void mo33223a1(AbstractC10311e0 abstractC10311e0) {
        if (abstractC10311e0 == null) {
            m37785v(14);
        }
    }

    /* renamed from: b1 */
    public void m37793b1(boolean z) {
        this.f40918E = z;
    }

    /* renamed from: c1 */
    public void m37794c1(AbstractC10311e0 abstractC10311e0, List<? extends InterfaceC10554e1> list, InterfaceC10702w0 interfaceC10702w0, InterfaceC10702w0 interfaceC10702w02, List<InterfaceC10702w0> list2) {
        if (abstractC10311e0 == null) {
            m37785v(17);
        }
        if (list == null) {
            m37785v(18);
        }
        if (list2 == null) {
            m37785v(19);
        }
        m37891A0(abstractC10311e0);
        this.f40915B = new ArrayList(list);
        this.f40914A = interfaceC10702w02;
        this.f40933z = interfaceC10702w0;
        this.f40932y = list2;
    }

    /* renamed from: d1 */
    public void m37795d1(AbstractC10697u abstractC10697u) {
        if (abstractC10697u == null) {
            m37785v(20);
        }
        this.f40922o = abstractC10697u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a
    /* renamed from: e */
    public Collection<? extends InterfaceC10696t0> mo37027e() {
        Collection<? extends InterfaceC10696t0> collection = this.f40923p;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection == null) {
            m37785v(41);
        }
        return collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10629m0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a
    /* renamed from: f0 */
    public InterfaceC10702w0 mo37029f0() {
        return this.f40933z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10629m0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a
    public AbstractC10311e0 getReturnType() {
        AbstractC10311e0 type = getType();
        if (type == null) {
            m37785v(23);
        }
        return type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0
    public InterfaceC10700v0 getSetter() {
        return this.f40917D;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10629m0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a
    public List<InterfaceC10554e1> getTypeParameters() {
        List<InterfaceC10554e1> list = this.f40915B;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10644q, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    public AbstractC10697u getVisibility() {
        AbstractC10697u abstractC10697u = this.f40922o;
        if (abstractC10697u == null) {
            m37785v(25);
        }
        return abstractC10697u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b
    /* renamed from: i */
    public InterfaceC10543b.a mo37030i() {
        InterfaceC10543b.a aVar = this.f40925r;
        if (aVar == null) {
            m37785v(39);
        }
        return aVar;
    }

    /* renamed from: i0 */
    public <V> V mo33224i0(InterfaceC10540a.a<V> aVar) {
        return null;
    }

    public boolean isConst() {
        return this.f40927t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    /* renamed from: j */
    public EnumC10550d0 mo32879j() {
        EnumC10550d0 enumC10550d0 = this.f40921n;
        if (enumC10550d0 == null) {
            m37785v(24);
        }
        return enumC10550d0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10629m0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a
    /* renamed from: m0 */
    public InterfaceC10702w0 mo37032m0() {
        return this.f40914A;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0
    /* renamed from: n0 */
    public InterfaceC10701w mo37033n0() {
        return this.f40920G;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0
    /* renamed from: q0 */
    public InterfaceC10701w mo37034q0() {
        return this.f40919F;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a
    /* renamed from: r0 */
    public List<InterfaceC10702w0> mo37035r0() {
        List<InterfaceC10702w0> list = this.f40932y;
        if (list == null) {
            m37785v(22);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10569j1
    /* renamed from: s0 */
    public boolean mo37036s0() {
        return this.f40926s;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0
    /* renamed from: x */
    public List<InterfaceC10694s0> mo37037x() {
        ArrayList arrayList = new ArrayList(2);
        C10611d0 c10611d0 = this.f40916C;
        if (c10611d0 != null) {
            arrayList.add(c10611d0);
        }
        InterfaceC10700v0 interfaceC10700v0 = this.f40917D;
        if (interfaceC10700v0 != null) {
            arrayList.add(interfaceC10700v0);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b
    /* renamed from: x0 */
    public void mo36993x0(Collection<? extends InterfaceC10543b> collection) {
        if (collection == 0) {
            m37785v(40);
        }
        this.f40923p = collection;
    }

    /* renamed from: z */
    public boolean mo32885z() {
        return this.f40930w;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10545b1
    /* renamed from: c, reason: avoid collision after fix types in other method */
    public InterfaceC10540a mo36396c(C10333l1 c10333l1) {
        if (c10333l1 == null) {
            m37785v(27);
        }
        return c10333l1.m36756k() ? this : m37792Y0().m37817v(c10333l1.m36755j()).m37815t(mo37019a()).m37809n();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10624k, kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10622j, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: a */
    public InterfaceC10696t0 mo37019a() {
        InterfaceC10696t0 interfaceC10696t0 = this.f40924q;
        InterfaceC10696t0 mo37019a = interfaceC10696t0 == this ? this : interfaceC10696t0.mo37019a();
        if (mo37019a == null) {
            m37785v(38);
        }
        return mo37019a;
    }
}
