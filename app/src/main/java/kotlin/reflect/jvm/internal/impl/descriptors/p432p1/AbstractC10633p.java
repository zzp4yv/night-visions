package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C10749c0;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10697u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10695t;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10550d0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10569j1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10595o;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10702w0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.C10589i;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10627l0;
import kotlin.reflect.jvm.internal.impl.utils.C10738e;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10153c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o.C10228d;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10327j1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10333l1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10355t;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10351r1;

/* compiled from: FunctionDescriptorImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.p */
/* loaded from: classes2.dex */
public abstract class AbstractC10633p extends AbstractC10624k implements InterfaceC10705y {

    /* renamed from: A */
    private boolean f41031A;

    /* renamed from: B */
    private boolean f41032B;

    /* renamed from: C */
    private boolean f41033C;

    /* renamed from: D */
    private Collection<? extends InterfaceC10705y> f41034D;

    /* renamed from: E */
    private volatile Function0<Collection<InterfaceC10705y>> f41035E;

    /* renamed from: F */
    private final InterfaceC10705y f41036F;

    /* renamed from: G */
    private final InterfaceC10543b.a f41037G;

    /* renamed from: H */
    private InterfaceC10705y f41038H;

    /* renamed from: I */
    protected Map<InterfaceC10540a.a<?>, Object> f41039I;

    /* renamed from: j */
    private List<InterfaceC10554e1> f41040j;

    /* renamed from: k */
    private List<InterfaceC10566i1> f41041k;

    /* renamed from: l */
    private AbstractC10311e0 f41042l;

    /* renamed from: m */
    private List<InterfaceC10702w0> f41043m;

    /* renamed from: n */
    private InterfaceC10702w0 f41044n;

    /* renamed from: o */
    private InterfaceC10702w0 f41045o;

    /* renamed from: p */
    private EnumC10550d0 f41046p;

    /* renamed from: q */
    private AbstractC10697u f41047q;

    /* renamed from: r */
    private boolean f41048r;

    /* renamed from: s */
    private boolean f41049s;

    /* renamed from: t */
    private boolean f41050t;

    /* renamed from: u */
    private boolean f41051u;

    /* renamed from: v */
    private boolean f41052v;

    /* renamed from: w */
    private boolean f41053w;

    /* renamed from: x */
    private boolean f41054x;

    /* renamed from: y */
    private boolean f41055y;

    /* renamed from: z */
    private boolean f41056z;

    /* compiled from: FunctionDescriptorImpl.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.p$a */
    class a implements Function0<Collection<InterfaceC10705y>> {

        /* renamed from: f */
        final /* synthetic */ C10333l1 f41057f;

        a(C10333l1 c10333l1) {
            this.f41057f = c10333l1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Collection<InterfaceC10705y> invoke() {
            C10738e c10738e = new C10738e();
            Iterator<? extends InterfaceC10705y> it = AbstractC10633p.this.mo37027e().iterator();
            while (it.hasNext()) {
                c10738e.add(it.next().mo36396c(this.f41057f));
            }
            return c10738e;
        }
    }

    /* compiled from: FunctionDescriptorImpl.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.p$b */
    static class b implements Function0<List<InterfaceC10569j1>> {

        /* renamed from: f */
        final /* synthetic */ List f41059f;

        b(List list) {
            this.f41059f = list;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<InterfaceC10569j1> invoke() {
            return this.f41059f;
        }
    }

    /* compiled from: FunctionDescriptorImpl.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.p$c */
    public class c implements InterfaceC10705y.a<InterfaceC10705y> {

        /* renamed from: a */
        protected AbstractC10327j1 f41060a;

        /* renamed from: b */
        protected InterfaceC10576m f41061b;

        /* renamed from: c */
        protected EnumC10550d0 f41062c;

        /* renamed from: d */
        protected AbstractC10697u f41063d;

        /* renamed from: e */
        protected InterfaceC10705y f41064e;

        /* renamed from: f */
        protected InterfaceC10543b.a f41065f;

        /* renamed from: g */
        protected List<InterfaceC10566i1> f41066g;

        /* renamed from: h */
        protected List<InterfaceC10702w0> f41067h;

        /* renamed from: i */
        protected InterfaceC10702w0 f41068i;

        /* renamed from: j */
        protected InterfaceC10702w0 f41069j;

        /* renamed from: k */
        protected AbstractC10311e0 f41070k;

        /* renamed from: l */
        protected C10130f f41071l;

        /* renamed from: m */
        protected boolean f41072m;

        /* renamed from: n */
        protected boolean f41073n;

        /* renamed from: o */
        protected boolean f41074o;

        /* renamed from: p */
        protected boolean f41075p;

        /* renamed from: q */
        private boolean f41076q;

        /* renamed from: r */
        private List<InterfaceC10554e1> f41077r;

        /* renamed from: s */
        private InterfaceC10587g f41078s;

        /* renamed from: t */
        private boolean f41079t;

        /* renamed from: u */
        private Map<InterfaceC10540a.a<?>, Object> f41080u;

        /* renamed from: v */
        private Boolean f41081v;

        /* renamed from: w */
        protected boolean f41082w;

        /* renamed from: x */
        final /* synthetic */ AbstractC10633p f41083x;

        public c(AbstractC10633p abstractC10633p, AbstractC10327j1 abstractC10327j1, InterfaceC10576m interfaceC10576m, EnumC10550d0 enumC10550d0, AbstractC10697u abstractC10697u, InterfaceC10543b.a aVar, List<InterfaceC10566i1> list, List<InterfaceC10702w0> list2, InterfaceC10702w0 interfaceC10702w0, AbstractC10311e0 abstractC10311e0, C10130f c10130f) {
            if (abstractC10327j1 == null) {
                m37936v(0);
            }
            if (interfaceC10576m == null) {
                m37936v(1);
            }
            if (enumC10550d0 == null) {
                m37936v(2);
            }
            if (abstractC10697u == null) {
                m37936v(3);
            }
            if (aVar == null) {
                m37936v(4);
            }
            if (list == null) {
                m37936v(5);
            }
            if (list2 == null) {
                m37936v(6);
            }
            if (abstractC10311e0 == null) {
                m37936v(7);
            }
            this.f41083x = abstractC10633p;
            this.f41064e = null;
            this.f41069j = abstractC10633p.f41045o;
            this.f41072m = true;
            this.f41073n = false;
            this.f41074o = false;
            this.f41075p = false;
            this.f41076q = abstractC10633p.mo37775w0();
            this.f41077r = null;
            this.f41078s = null;
            this.f41079t = abstractC10633p.mo37764C0();
            this.f41080u = new LinkedHashMap();
            this.f41081v = null;
            this.f41082w = false;
            this.f41060a = abstractC10327j1;
            this.f41061b = interfaceC10576m;
            this.f41062c = enumC10550d0;
            this.f41063d = abstractC10697u;
            this.f41065f = aVar;
            this.f41066g = list;
            this.f41067h = list2;
            this.f41068i = interfaceC10702w0;
            this.f41070k = abstractC10311e0;
            this.f41071l = c10130f;
        }

        /* renamed from: v */
        private static /* synthetic */ void m37936v(int i2) {
            String str;
            int i3;
            switch (i2) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i2) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    i3 = 2;
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    i3 = 3;
                    break;
            }
            Object[] objArr = new Object[i3];
            switch (i2) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case 14:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newContextReceiverParameters";
                    break;
                case 7:
                    objArr[0] = "newReturnType";
                    break;
                case 8:
                    objArr[0] = "owner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 10:
                    objArr[0] = "modality";
                    break;
                case 12:
                    objArr[0] = "visibility";
                    break;
                case 17:
                    objArr[0] = "name";
                    break;
                case 19:
                case 21:
                    objArr[0] = "parameters";
                    break;
                case 23:
                    objArr[0] = "type";
                    break;
                case 25:
                    objArr[0] = "contextReceiverParameters";
                    break;
                case 35:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 37:
                default:
                    objArr[0] = "substitution";
                    break;
                case 39:
                    objArr[0] = "userDataKey";
                    break;
            }
            switch (i2) {
                case 9:
                    objArr[1] = "setOwner";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 11:
                    objArr[1] = "setModality";
                    break;
                case 13:
                    objArr[1] = "setVisibility";
                    break;
                case 15:
                    objArr[1] = "setKind";
                    break;
                case 16:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 18:
                    objArr[1] = "setName";
                    break;
                case 20:
                    objArr[1] = "setValueParameters";
                    break;
                case 22:
                    objArr[1] = "setTypeParameters";
                    break;
                case 24:
                    objArr[1] = "setReturnType";
                    break;
                case 26:
                    objArr[1] = "setContextReceiverParameters";
                    break;
                case 27:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 28:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 29:
                    objArr[1] = "setOriginal";
                    break;
                case 30:
                    objArr[1] = "setSignatureChange";
                    break;
                case 31:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 32:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case 33:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 34:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 36:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case 38:
                    objArr[1] = "setSubstitution";
                    break;
                case 40:
                    objArr[1] = "putUserData";
                    break;
                case 41:
                    objArr[1] = "getSubstitution";
                    break;
                case 42:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
            }
            switch (i2) {
                case 8:
                    objArr[2] = "setOwner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    break;
                case 10:
                    objArr[2] = "setModality";
                    break;
                case 12:
                    objArr[2] = "setVisibility";
                    break;
                case 14:
                    objArr[2] = "setKind";
                    break;
                case 17:
                    objArr[2] = "setName";
                    break;
                case 19:
                    objArr[2] = "setValueParameters";
                    break;
                case 21:
                    objArr[2] = "setTypeParameters";
                    break;
                case 23:
                    objArr[2] = "setReturnType";
                    break;
                case 25:
                    objArr[2] = "setContextReceiverParameters";
                    break;
                case 35:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case 37:
                    objArr[2] = "setSubstitution";
                    break;
                case 39:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            switch (i2) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    throw new IllegalStateException(format);
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    throw new IllegalArgumentException(format);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y.a
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public c mo37012s(InterfaceC10587g interfaceC10587g) {
            if (interfaceC10587g == null) {
                m37936v(35);
            }
            this.f41078s = interfaceC10587g;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y.a
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public c mo37003j(boolean z) {
            this.f41072m = z;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y.a
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public c mo36998e(InterfaceC10702w0 interfaceC10702w0) {
            this.f41069j = interfaceC10702w0;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y.a
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public c mo36994a() {
            this.f41075p = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y.a
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public c mo37004k(InterfaceC10702w0 interfaceC10702w0) {
            this.f41068i = interfaceC10702w0;
            return this;
        }

        /* renamed from: H */
        public c m37946H(boolean z) {
            this.f41081v = Boolean.valueOf(z);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y.a
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public c mo37002i() {
            this.f41079t = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y.a
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public c mo37010q() {
            this.f41076q = true;
            return this;
        }

        /* renamed from: K */
        public c m37949K(boolean z) {
            this.f41082w = z;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y.a
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public c mo37011r(InterfaceC10543b.a aVar) {
            if (aVar == null) {
                m37936v(14);
            }
            this.f41065f = aVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y.a
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public c mo36997d(EnumC10550d0 enumC10550d0) {
            if (enumC10550d0 == null) {
                m37936v(10);
            }
            this.f41062c = enumC10550d0;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y.a
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public c mo37013t(C10130f c10130f) {
            if (c10130f == null) {
                m37936v(17);
            }
            this.f41071l = c10130f;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y.a
        /* renamed from: O, reason: merged with bridge method [inline-methods] */
        public c mo37001h(InterfaceC10543b interfaceC10543b) {
            this.f41064e = (InterfaceC10705y) interfaceC10543b;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y.a
        /* renamed from: P, reason: merged with bridge method [inline-methods] */
        public c mo37009p(InterfaceC10576m interfaceC10576m) {
            if (interfaceC10576m == null) {
                m37936v(8);
            }
            this.f41061b = interfaceC10576m;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y.a
        /* renamed from: Q, reason: merged with bridge method [inline-methods] */
        public c mo36999f() {
            this.f41074o = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y.a
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public c mo37000g(AbstractC10311e0 abstractC10311e0) {
            if (abstractC10311e0 == null) {
                m37936v(23);
            }
            this.f41070k = abstractC10311e0;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y.a
        /* renamed from: S, reason: merged with bridge method [inline-methods] */
        public c mo37014u() {
            this.f41073n = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y.a
        /* renamed from: T, reason: merged with bridge method [inline-methods] */
        public c mo37005l(AbstractC10327j1 abstractC10327j1) {
            if (abstractC10327j1 == null) {
                m37936v(37);
            }
            this.f41060a = abstractC10327j1;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y.a
        /* renamed from: U, reason: merged with bridge method [inline-methods] */
        public c mo37006m(List<InterfaceC10554e1> list) {
            if (list == null) {
                m37936v(21);
            }
            this.f41077r = list;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y.a
        /* renamed from: V, reason: merged with bridge method [inline-methods] */
        public c mo36995b(List<InterfaceC10566i1> list) {
            if (list == null) {
                m37936v(19);
            }
            this.f41066g = list;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y.a
        /* renamed from: W, reason: merged with bridge method [inline-methods] */
        public c mo37008o(AbstractC10697u abstractC10697u) {
            if (abstractC10697u == null) {
                m37936v(12);
            }
            this.f41063d = abstractC10697u;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y.a
        /* renamed from: c */
        public InterfaceC10705y mo36996c() {
            return this.f41083x.mo32907N0(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y.a
        /* renamed from: n */
        public <V> InterfaceC10705y.a<InterfaceC10705y> mo37007n(InterfaceC10540a.a<V> aVar, V v) {
            if (aVar == null) {
                m37936v(39);
            }
            this.f41080u.put(aVar, v);
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC10633p(InterfaceC10576m interfaceC10576m, InterfaceC10705y interfaceC10705y, InterfaceC10587g interfaceC10587g, C10130f c10130f, InterfaceC10543b.a aVar, InterfaceC10708z0 interfaceC10708z0) {
        super(interfaceC10576m, interfaceC10587g, c10130f, interfaceC10708z0);
        if (interfaceC10576m == null) {
            m37919v(0);
        }
        if (interfaceC10587g == null) {
            m37919v(1);
        }
        if (c10130f == null) {
            m37919v(2);
        }
        if (aVar == null) {
            m37919v(3);
        }
        if (interfaceC10708z0 == null) {
            m37919v(4);
        }
        this.f41047q = C10695t.f41224i;
        this.f41048r = false;
        this.f41049s = false;
        this.f41050t = false;
        this.f41051u = false;
        this.f41052v = false;
        this.f41053w = false;
        this.f41054x = false;
        this.f41055y = false;
        this.f41056z = false;
        this.f41031A = false;
        this.f41032B = true;
        this.f41033C = false;
        this.f41034D = null;
        this.f41035E = null;
        this.f41038H = null;
        this.f41039I = null;
        this.f41036F = interfaceC10705y == null ? this : interfaceC10705y;
        this.f41037G = aVar;
    }

    /* renamed from: O0 */
    private InterfaceC10708z0 m37912O0(boolean z, InterfaceC10705y interfaceC10705y) {
        InterfaceC10708z0 interfaceC10708z0;
        if (z) {
            if (interfaceC10705y == null) {
                interfaceC10705y = mo37019a();
            }
            interfaceC10708z0 = interfaceC10705y.mo32883t();
        } else {
            interfaceC10708z0 = InterfaceC10708z0.f41247a;
        }
        if (interfaceC10708z0 == null) {
            m37919v(27);
        }
        return interfaceC10708z0;
    }

    /* renamed from: P0 */
    public static List<InterfaceC10566i1> m37913P0(InterfaceC10705y interfaceC10705y, List<InterfaceC10566i1> list, C10333l1 c10333l1) {
        if (list == null) {
            m37919v(28);
        }
        if (c10333l1 == null) {
            m37919v(29);
        }
        return m37914Q0(interfaceC10705y, list, c10333l1, false, false, null);
    }

    /* renamed from: Q0 */
    public static List<InterfaceC10566i1> m37914Q0(InterfaceC10705y interfaceC10705y, List<InterfaceC10566i1> list, C10333l1 c10333l1, boolean z, boolean z2, boolean[] zArr) {
        if (list == null) {
            m37919v(30);
        }
        if (c10333l1 == null) {
            m37919v(31);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (InterfaceC10566i1 interfaceC10566i1 : list) {
            AbstractC10311e0 type = interfaceC10566i1.getType();
            EnumC10351r1 enumC10351r1 = EnumC10351r1.IN_VARIANCE;
            AbstractC10311e0 m36759p = c10333l1.m36759p(type, enumC10351r1);
            AbstractC10311e0 mo37697l0 = interfaceC10566i1.mo37697l0();
            AbstractC10311e0 m36759p2 = mo37697l0 == null ? null : c10333l1.m36759p(mo37697l0, enumC10351r1);
            if (m36759p == null) {
                return null;
            }
            if ((m36759p != interfaceC10566i1.getType() || mo37697l0 != m36759p2) && zArr != null) {
                zArr[0] = true;
            }
            arrayList.add(C10627l0.m37884L0(interfaceC10705y, z ? null : interfaceC10566i1, interfaceC10566i1.mo37696g(), interfaceC10566i1.getAnnotations(), interfaceC10566i1.getName(), m36759p, interfaceC10566i1.mo37698u0(), interfaceC10566i1.mo37695b0(), interfaceC10566i1.mo37694Y(), m36759p2, z2 ? interfaceC10566i1.mo32883t() : InterfaceC10708z0.f41247a, interfaceC10566i1 instanceof C10627l0.b ? new b(((C10627l0.b) interfaceC10566i1).m37888O0()) : null));
        }
        return arrayList;
    }

    /* renamed from: U0 */
    private void m37915U0() {
        Function0<Collection<InterfaceC10705y>> function0 = this.f41035E;
        if (function0 != null) {
            this.f41034D = function0.invoke();
            this.f41035E = null;
        }
    }

    /* renamed from: b1 */
    private void m37916b1(boolean z) {
        this.f41056z = z;
    }

    /* renamed from: c1 */
    private void m37917c1(boolean z) {
        this.f41055y = z;
    }

    /* renamed from: e1 */
    private void m37918e1(InterfaceC10705y interfaceC10705y) {
        this.f41038H = interfaceC10705y;
    }

    /* renamed from: v */
    private static /* synthetic */ void m37919v(int i2) {
        String str;
        int i3;
        switch (i2) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i3 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i2) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i2) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i2) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(format);
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y
    /* renamed from: C0 */
    public boolean mo37764C0() {
        return this.f41056z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    /* renamed from: E0 */
    public boolean mo32859E0() {
        return this.f41054x;
    }

    /* renamed from: G */
    public boolean mo33204G() {
        return this.f41033C;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y
    /* renamed from: H0 */
    public boolean mo37765H0() {
        if (this.f41049s) {
            return true;
        }
        Iterator<? extends InterfaceC10705y> it = mo37019a().mo37027e().iterator();
        while (it.hasNext()) {
            if (it.next().mo37765H0()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: L */
    public <R, D> R mo37017L(InterfaceC10595o<R, D> interfaceC10595o, D d2) {
        return interfaceC10595o.mo32474g(this, d2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b
    /* renamed from: L0 */
    public InterfaceC10705y mo36990k0(InterfaceC10576m interfaceC10576m, EnumC10550d0 enumC10550d0, AbstractC10697u abstractC10697u, InterfaceC10543b.a aVar, boolean z) {
        InterfaceC10705y mo36996c = mo36992u().mo37009p(interfaceC10576m).mo36997d(enumC10550d0).mo37008o(abstractC10697u).mo37011r(aVar).mo37003j(z).mo36996c();
        if (mo36996c == null) {
            m37919v(26);
        }
        return mo36996c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    /* renamed from: M */
    public boolean mo32863M() {
        return this.f41053w;
    }

    /* renamed from: M0 */
    protected abstract AbstractC10633p mo32906M0(InterfaceC10576m interfaceC10576m, InterfaceC10705y interfaceC10705y, InterfaceC10543b.a aVar, C10130f c10130f, InterfaceC10587g interfaceC10587g, InterfaceC10708z0 interfaceC10708z0);

    /* renamed from: N0 */
    protected InterfaceC10705y mo32907N0(c cVar) {
        C10615f0 c10615f0;
        InterfaceC10702w0 interfaceC10702w0;
        AbstractC10311e0 m36759p;
        if (cVar == null) {
            m37919v(25);
        }
        boolean[] zArr = new boolean[1];
        InterfaceC10587g m37739a = cVar.f41078s != null ? C10589i.m37739a(getAnnotations(), cVar.f41078s) : getAnnotations();
        InterfaceC10576m interfaceC10576m = cVar.f41061b;
        InterfaceC10705y interfaceC10705y = cVar.f41064e;
        AbstractC10633p mo32906M0 = mo32906M0(interfaceC10576m, interfaceC10705y, cVar.f41065f, cVar.f41071l, m37739a, m37912O0(cVar.f41074o, interfaceC10705y));
        List<InterfaceC10554e1> typeParameters = cVar.f41077r == null ? getTypeParameters() : cVar.f41077r;
        zArr[0] = zArr[0] | (!typeParameters.isEmpty());
        ArrayList arrayList = new ArrayList(typeParameters.size());
        C10333l1 m36826c = C10355t.m36826c(typeParameters, cVar.f41060a, mo32906M0, arrayList, zArr);
        if (m36826c == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!cVar.f41067h.isEmpty()) {
            for (InterfaceC10702w0 interfaceC10702w02 : cVar.f41067h) {
                AbstractC10311e0 m36759p2 = m36826c.m36759p(interfaceC10702w02.getType(), EnumC10351r1.IN_VARIANCE);
                if (m36759p2 == null) {
                    return null;
                }
                arrayList2.add(C10153c.m35784b(mo32906M0, m36759p2, interfaceC10702w02.getAnnotations()));
                zArr[0] = (m36759p2 != interfaceC10702w02.getType()) | zArr[0];
            }
        }
        InterfaceC10702w0 interfaceC10702w03 = cVar.f41068i;
        if (interfaceC10702w03 != null) {
            AbstractC10311e0 m36759p3 = m36826c.m36759p(interfaceC10702w03.getType(), EnumC10351r1.IN_VARIANCE);
            if (m36759p3 == null) {
                return null;
            }
            C10615f0 c10615f02 = new C10615f0(mo32906M0, new C10228d(mo32906M0, m36759p3, cVar.f41068i.getValue()), cVar.f41068i.getAnnotations());
            zArr[0] = (m36759p3 != cVar.f41068i.getType()) | zArr[0];
            c10615f0 = c10615f02;
        } else {
            c10615f0 = null;
        }
        InterfaceC10702w0 interfaceC10702w04 = cVar.f41069j;
        if (interfaceC10702w04 != null) {
            InterfaceC10702w0 mo36396c = interfaceC10702w04.mo36396c(m36826c);
            if (mo36396c == null) {
                return null;
            }
            zArr[0] = zArr[0] | (mo36396c != cVar.f41069j);
            interfaceC10702w0 = mo36396c;
        } else {
            interfaceC10702w0 = null;
        }
        List<InterfaceC10566i1> m37914Q0 = m37914Q0(mo32906M0, cVar.f41066g, m36826c, cVar.f41075p, cVar.f41074o, zArr);
        if (m37914Q0 == null || (m36759p = m36826c.m36759p(cVar.f41070k, EnumC10351r1.OUT_VARIANCE)) == null) {
            return null;
        }
        zArr[0] = zArr[0] | (m36759p != cVar.f41070k);
        if (!zArr[0] && cVar.f41082w) {
            return this;
        }
        mo32906M0.mo37850S0(c10615f0, interfaceC10702w0, arrayList2, arrayList, m37914Q0, m36759p, cVar.f41062c, cVar.f41063d);
        mo32906M0.m37927g1(this.f41048r);
        mo32906M0.m37925d1(this.f41049s);
        mo32906M0.m37924Y0(this.f41050t);
        mo32906M0.m37926f1(this.f41051u);
        mo32906M0.m37930j1(this.f41052v);
        mo32906M0.m37929i1(this.f41031A);
        mo32906M0.m37923X0(this.f41053w);
        mo32906M0.m37922W0(this.f41054x);
        mo32906M0.mo33206Z0(this.f41032B);
        mo32906M0.m37917c1(cVar.f41076q);
        mo32906M0.m37916b1(cVar.f41079t);
        mo32906M0.mo33207a1(cVar.f41081v != null ? cVar.f41081v.booleanValue() : this.f41033C);
        if (!cVar.f41080u.isEmpty() || this.f41039I != null) {
            Map<InterfaceC10540a.a<?>, Object> map = cVar.f41080u;
            Map<InterfaceC10540a.a<?>, Object> map2 = this.f41039I;
            if (map2 != null) {
                for (Map.Entry<InterfaceC10540a.a<?>, Object> entry : map2.entrySet()) {
                    if (!map.containsKey(entry.getKey())) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (map.size() == 1) {
                mo32906M0.f41039I = Collections.singletonMap(map.keySet().iterator().next(), map.values().iterator().next());
            } else {
                mo32906M0.f41039I = map;
            }
        }
        if (cVar.f41073n || mo37774d0() != null) {
            mo32906M0.m37918e1((mo37774d0() != null ? mo37774d0() : this).mo36396c(m36826c));
        }
        if (cVar.f41072m && !mo37019a().mo37027e().isEmpty()) {
            if (cVar.f41060a.mo33537f()) {
                Function0<Collection<InterfaceC10705y>> function0 = this.f41035E;
                if (function0 != null) {
                    mo32906M0.f41035E = function0;
                } else {
                    mo32906M0.mo36993x0(mo37027e());
                }
            } else {
                mo32906M0.f41035E = new a(m36826c);
            }
        }
        return mo32906M0;
    }

    /* renamed from: P */
    public boolean mo32908P() {
        return this.f41052v;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y
    /* renamed from: Q */
    public boolean mo37772Q() {
        if (this.f41048r) {
            return true;
        }
        Iterator<? extends InterfaceC10705y> it = mo37019a().mo37027e().iterator();
        while (it.hasNext()) {
            if (it.next().mo37772Q()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: R0 */
    public boolean mo33205R0() {
        return this.f41032B;
    }

    /* renamed from: S0 */
    public AbstractC10633p mo37850S0(InterfaceC10702w0 interfaceC10702w0, InterfaceC10702w0 interfaceC10702w02, List<InterfaceC10702w0> list, List<? extends InterfaceC10554e1> list2, List<InterfaceC10566i1> list3, AbstractC10311e0 abstractC10311e0, EnumC10550d0 enumC10550d0, AbstractC10697u abstractC10697u) {
        if (list == null) {
            m37919v(5);
        }
        if (list2 == null) {
            m37919v(6);
        }
        if (list3 == null) {
            m37919v(7);
        }
        if (abstractC10697u == null) {
            m37919v(8);
        }
        this.f41040j = C10749c0.m38569E0(list2);
        this.f41041k = C10749c0.m38569E0(list3);
        this.f41042l = abstractC10311e0;
        this.f41046p = enumC10550d0;
        this.f41047q = abstractC10697u;
        this.f41044n = interfaceC10702w0;
        this.f41045o = interfaceC10702w02;
        this.f41043m = list;
        for (int i2 = 0; i2 < list2.size(); i2++) {
            InterfaceC10554e1 interfaceC10554e1 = list2.get(i2);
            if (interfaceC10554e1.mo37670g() != i2) {
                throw new IllegalStateException(interfaceC10554e1 + " index is " + interfaceC10554e1.mo37670g() + " but position is " + i2);
            }
        }
        for (int i3 = 0; i3 < list3.size(); i3++) {
            InterfaceC10566i1 interfaceC10566i1 = list3.get(i3);
            if (interfaceC10566i1.mo37696g() != i3 + 0) {
                throw new IllegalStateException(interfaceC10566i1 + "index is " + interfaceC10566i1.mo37696g() + " but position is " + i3);
            }
        }
        return this;
    }

    /* renamed from: T0 */
    protected c m37920T0(C10333l1 c10333l1) {
        if (c10333l1 == null) {
            m37919v(24);
        }
        return new c(this, c10333l1.m36755j(), mo32876b(), mo32879j(), getVisibility(), mo37030i(), mo37028f(), mo37035r0(), mo37032m0(), getReturnType(), null);
    }

    /* renamed from: V0 */
    public <V> void m37921V0(InterfaceC10540a.a<V> aVar, Object obj) {
        if (this.f41039I == null) {
            this.f41039I = new LinkedHashMap();
        }
        this.f41039I.put(aVar, obj);
    }

    /* renamed from: W0 */
    public void m37922W0(boolean z) {
        this.f41054x = z;
    }

    /* renamed from: X0 */
    public void m37923X0(boolean z) {
        this.f41053w = z;
    }

    /* renamed from: Y0 */
    public void m37924Y0(boolean z) {
        this.f41050t = z;
    }

    /* renamed from: Z0 */
    public void mo33206Z0(boolean z) {
        this.f41032B = z;
    }

    /* renamed from: a1 */
    public void mo33207a1(boolean z) {
        this.f41033C = z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y
    /* renamed from: d0 */
    public InterfaceC10705y mo37774d0() {
        return this.f41038H;
    }

    /* renamed from: d1 */
    public void m37925d1(boolean z) {
        this.f41049s = z;
    }

    /* renamed from: e */
    public Collection<? extends InterfaceC10705y> mo37027e() {
        m37915U0();
        Collection<? extends InterfaceC10705y> collection = this.f41034D;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection == null) {
            m37919v(14);
        }
        return collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a
    /* renamed from: f */
    public List<InterfaceC10566i1> mo37028f() {
        List<InterfaceC10566i1> list = this.f41041k;
        if (list == null) {
            m37919v(19);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a
    /* renamed from: f0 */
    public InterfaceC10702w0 mo37029f0() {
        return this.f41045o;
    }

    /* renamed from: f1 */
    public void m37926f1(boolean z) {
        this.f41051u = z;
    }

    /* renamed from: g1 */
    public void m37927g1(boolean z) {
        this.f41048r = z;
    }

    public AbstractC10311e0 getReturnType() {
        return this.f41042l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a
    public List<InterfaceC10554e1> getTypeParameters() {
        List<InterfaceC10554e1> list = this.f41040j;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10644q, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    public AbstractC10697u getVisibility() {
        AbstractC10697u abstractC10697u = this.f41047q;
        if (abstractC10697u == null) {
            m37919v(16);
        }
        return abstractC10697u;
    }

    /* renamed from: h1 */
    public void m37928h1(AbstractC10311e0 abstractC10311e0) {
        if (abstractC10311e0 == null) {
            m37919v(11);
        }
        this.f41042l = abstractC10311e0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b
    /* renamed from: i */
    public InterfaceC10543b.a mo37030i() {
        InterfaceC10543b.a aVar = this.f41037G;
        if (aVar == null) {
            m37919v(21);
        }
        return aVar;
    }

    /* renamed from: i0 */
    public <V> V mo33224i0(InterfaceC10540a.a<V> aVar) {
        Map<InterfaceC10540a.a<?>, Object> map = this.f41039I;
        if (map == null) {
            return null;
        }
        return (V) map.get(aVar);
    }

    /* renamed from: i1 */
    public void m37929i1(boolean z) {
        this.f41031A = z;
    }

    public boolean isInline() {
        return this.f41051u;
    }

    public boolean isSuspend() {
        return this.f41031A;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    /* renamed from: j */
    public EnumC10550d0 mo32879j() {
        EnumC10550d0 enumC10550d0 = this.f41046p;
        if (enumC10550d0 == null) {
            m37919v(15);
        }
        return enumC10550d0;
    }

    /* renamed from: j1 */
    public void m37930j1(boolean z) {
        this.f41052v = z;
    }

    /* renamed from: k1 */
    public void m37931k1(AbstractC10697u abstractC10697u) {
        if (abstractC10697u == null) {
            m37919v(10);
        }
        this.f41047q = abstractC10697u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a
    /* renamed from: m0 */
    public InterfaceC10702w0 mo37032m0() {
        return this.f41044n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a
    /* renamed from: r0 */
    public List<InterfaceC10702w0> mo37035r0() {
        List<InterfaceC10702w0> list = this.f41043m;
        if (list == null) {
            m37919v(13);
        }
        return list;
    }

    /* renamed from: u */
    public InterfaceC10705y.a<? extends InterfaceC10705y> mo36992u() {
        c m37920T0 = m37920T0(C10333l1.f40139a);
        if (m37920T0 == null) {
            m37919v(23);
        }
        return m37920T0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y
    /* renamed from: w0 */
    public boolean mo37775w0() {
        return this.f41055y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: x0 */
    public void mo36993x0(Collection<? extends InterfaceC10543b> collection) {
        if (collection == 0) {
            m37919v(17);
        }
        this.f41034D = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((InterfaceC10705y) it.next()).mo37764C0()) {
                this.f41056z = true;
                return;
            }
        }
    }

    /* renamed from: z */
    public boolean mo32885z() {
        return this.f41050t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10545b1
    /* renamed from: c */
    public InterfaceC10705y mo36396c(C10333l1 c10333l1) {
        if (c10333l1 == null) {
            m37919v(22);
        }
        return c10333l1.m36756k() ? this : m37920T0(c10333l1).mo37001h(mo37019a()).mo36999f().m37949K(true).mo36996c();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10624k, kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10622j, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: a */
    public InterfaceC10705y mo37019a() {
        InterfaceC10705y interfaceC10705y = this.f41036F;
        InterfaceC10705y mo37019a = interfaceC10705y == this ? this : interfaceC10705y.mo37019a();
        if (mo37019a == null) {
            m37919v(20);
        }
        return mo37019a;
    }
}
