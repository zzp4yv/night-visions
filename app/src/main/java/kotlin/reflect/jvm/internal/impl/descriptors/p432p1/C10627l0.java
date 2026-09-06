package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C10517i;
import kotlin.Lazy;
import kotlin.collections.C10786v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10697u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10695t;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10569j1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10595o;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10178g;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10333l1;

/* compiled from: ValueParameterDescriptorImpl.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.l0 */
/* loaded from: classes2.dex */
public class C10627l0 extends AbstractC10629m0 implements InterfaceC10566i1 {

    /* renamed from: k */
    public static final a f41001k = new a(null);

    /* renamed from: l */
    private final int f41002l;

    /* renamed from: m */
    private final boolean f41003m;

    /* renamed from: n */
    private final boolean f41004n;

    /* renamed from: o */
    private final boolean f41005o;

    /* renamed from: p */
    private final AbstractC10311e0 f41006p;

    /* renamed from: q */
    private final InterfaceC10566i1 f41007q;

    /* compiled from: ValueParameterDescriptorImpl.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.l0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final C10627l0 m37887a(InterfaceC10540a interfaceC10540a, InterfaceC10566i1 interfaceC10566i1, int i2, InterfaceC10587g interfaceC10587g, C10130f c10130f, AbstractC10311e0 abstractC10311e0, boolean z, boolean z2, boolean z3, AbstractC10311e0 abstractC10311e02, InterfaceC10708z0 interfaceC10708z0, Function0<? extends List<? extends InterfaceC10569j1>> function0) {
            C9768m.m32346f(interfaceC10540a, "containingDeclaration");
            C9768m.m32346f(interfaceC10587g, "annotations");
            C9768m.m32346f(c10130f, "name");
            C9768m.m32346f(abstractC10311e0, "outType");
            C9768m.m32346f(interfaceC10708z0, "source");
            return function0 == null ? new C10627l0(interfaceC10540a, interfaceC10566i1, i2, interfaceC10587g, c10130f, abstractC10311e0, z, z2, z3, abstractC10311e02, interfaceC10708z0) : new b(interfaceC10540a, interfaceC10566i1, i2, interfaceC10587g, c10130f, abstractC10311e0, z, z2, z3, abstractC10311e02, interfaceC10708z0, function0);
        }
    }

    /* compiled from: ValueParameterDescriptorImpl.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.l0$b */
    public static final class b extends C10627l0 {

        /* renamed from: r */
        private final Lazy f41008r;

        /* compiled from: ValueParameterDescriptorImpl.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.l0$b$a */
        static final class a extends Lambda implements Function0<List<? extends InterfaceC10569j1>> {
            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends InterfaceC10569j1> invoke() {
                return b.this.m37888O0();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC10540a interfaceC10540a, InterfaceC10566i1 interfaceC10566i1, int i2, InterfaceC10587g interfaceC10587g, C10130f c10130f, AbstractC10311e0 abstractC10311e0, boolean z, boolean z2, boolean z3, AbstractC10311e0 abstractC10311e02, InterfaceC10708z0 interfaceC10708z0, Function0<? extends List<? extends InterfaceC10569j1>> function0) {
            super(interfaceC10540a, interfaceC10566i1, i2, interfaceC10587g, c10130f, abstractC10311e0, z, z2, z3, abstractC10311e02, interfaceC10708z0);
            Lazy m37594b;
            C9768m.m32346f(interfaceC10540a, "containingDeclaration");
            C9768m.m32346f(interfaceC10587g, "annotations");
            C9768m.m32346f(c10130f, "name");
            C9768m.m32346f(abstractC10311e0, "outType");
            C9768m.m32346f(interfaceC10708z0, "source");
            C9768m.m32346f(function0, "destructuringVariables");
            m37594b = C10517i.m37594b(function0);
            this.f41008r = m37594b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10627l0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1
        /* renamed from: G0 */
        public InterfaceC10566i1 mo37693G0(InterfaceC10540a interfaceC10540a, C10130f c10130f, int i2) {
            C9768m.m32346f(interfaceC10540a, "newOwner");
            C9768m.m32346f(c10130f, "newName");
            InterfaceC10587g annotations = getAnnotations();
            C9768m.m32345e(annotations, "annotations");
            AbstractC10311e0 type = getType();
            C9768m.m32345e(type, "type");
            boolean mo37698u0 = mo37698u0();
            boolean mo37695b0 = mo37695b0();
            boolean mo37694Y = mo37694Y();
            AbstractC10311e0 mo37697l0 = mo37697l0();
            InterfaceC10708z0 interfaceC10708z0 = InterfaceC10708z0.f41247a;
            C9768m.m32345e(interfaceC10708z0, "NO_SOURCE");
            return new b(interfaceC10540a, null, i2, annotations, c10130f, type, mo37698u0, mo37695b0, mo37694Y, mo37697l0, interfaceC10708z0, new a());
        }

        /* renamed from: O0 */
        public final List<InterfaceC10569j1> m37888O0() {
            return (List) this.f41008r.getValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10627l0(InterfaceC10540a interfaceC10540a, InterfaceC10566i1 interfaceC10566i1, int i2, InterfaceC10587g interfaceC10587g, C10130f c10130f, AbstractC10311e0 abstractC10311e0, boolean z, boolean z2, boolean z3, AbstractC10311e0 abstractC10311e02, InterfaceC10708z0 interfaceC10708z0) {
        super(interfaceC10540a, interfaceC10587g, c10130f, abstractC10311e0, interfaceC10708z0);
        C9768m.m32346f(interfaceC10540a, "containingDeclaration");
        C9768m.m32346f(interfaceC10587g, "annotations");
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(abstractC10311e0, "outType");
        C9768m.m32346f(interfaceC10708z0, "source");
        this.f41002l = i2;
        this.f41003m = z;
        this.f41004n = z2;
        this.f41005o = z3;
        this.f41006p = abstractC10311e02;
        this.f41007q = interfaceC10566i1 == null ? this : interfaceC10566i1;
    }

    /* renamed from: L0 */
    public static final C10627l0 m37884L0(InterfaceC10540a interfaceC10540a, InterfaceC10566i1 interfaceC10566i1, int i2, InterfaceC10587g interfaceC10587g, C10130f c10130f, AbstractC10311e0 abstractC10311e0, boolean z, boolean z2, boolean z3, AbstractC10311e0 abstractC10311e02, InterfaceC10708z0 interfaceC10708z0, Function0<? extends List<? extends InterfaceC10569j1>> function0) {
        return f41001k.m37887a(interfaceC10540a, interfaceC10566i1, i2, interfaceC10587g, c10130f, abstractC10311e0, z, z2, z3, abstractC10311e02, interfaceC10708z0, function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1
    /* renamed from: G0 */
    public InterfaceC10566i1 mo37693G0(InterfaceC10540a interfaceC10540a, C10130f c10130f, int i2) {
        C9768m.m32346f(interfaceC10540a, "newOwner");
        C9768m.m32346f(c10130f, "newName");
        InterfaceC10587g annotations = getAnnotations();
        C9768m.m32345e(annotations, "annotations");
        AbstractC10311e0 type = getType();
        C9768m.m32345e(type, "type");
        boolean mo37698u0 = mo37698u0();
        boolean mo37695b0 = mo37695b0();
        boolean mo37694Y = mo37694Y();
        AbstractC10311e0 mo37697l0 = mo37697l0();
        InterfaceC10708z0 interfaceC10708z0 = InterfaceC10708z0.f41247a;
        C9768m.m32345e(interfaceC10708z0, "NO_SOURCE");
        return new C10627l0(interfaceC10540a, null, i2, annotations, c10130f, type, mo37698u0, mo37695b0, mo37694Y, mo37697l0, interfaceC10708z0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: L */
    public <R, D> R mo37017L(InterfaceC10595o<R, D> interfaceC10595o, D d2) {
        C9768m.m32346f(interfaceC10595o, "visitor");
        return interfaceC10595o.mo35681k(this, d2);
    }

    /* renamed from: M0 */
    public Void m37885M0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10545b1
    /* renamed from: N0, reason: merged with bridge method [inline-methods] */
    public InterfaceC10566i1 mo36396c(C10333l1 c10333l1) {
        C9768m.m32346f(c10333l1, "substitutor");
        if (c10333l1.m36756k()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10569j1
    /* renamed from: X */
    public /* bridge */ /* synthetic */ AbstractC10178g mo37026X() {
        return (AbstractC10178g) m37885M0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1
    /* renamed from: Y */
    public boolean mo37694Y() {
        return this.f41005o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1
    /* renamed from: b0 */
    public boolean mo37695b0() {
        return this.f41004n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a
    /* renamed from: e */
    public Collection<InterfaceC10566i1> mo37027e() {
        Collection<? extends InterfaceC10540a> mo37027e = mo32876b().mo37027e();
        C9768m.m32345e(mo37027e, "containingDeclaration.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(C10786v.m38911u(mo37027e, 10));
        Iterator<T> it = mo37027e.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC10540a) it.next()).mo37028f().get(mo37696g()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1
    /* renamed from: g */
    public int mo37696g() {
        return this.f41002l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10644q, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    public AbstractC10697u getVisibility() {
        AbstractC10697u abstractC10697u = C10695t.f41221f;
        C9768m.m32345e(abstractC10697u, "LOCAL");
        return abstractC10697u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10569j1
    /* renamed from: j0 */
    public boolean mo37031j0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1
    /* renamed from: l0 */
    public AbstractC10311e0 mo37697l0() {
        return this.f41006p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1
    /* renamed from: u0 */
    public boolean mo37698u0() {
        if (this.f41003m) {
            InterfaceC10540a mo32876b = mo32876b();
            C9768m.m32344d(mo32876b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor");
            if (((InterfaceC10543b) mo32876b).mo37030i().m37667g()) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10624k, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: b */
    public InterfaceC10540a mo32876b() {
        InterfaceC10576m mo32876b = super.mo32876b();
        C9768m.m32344d(mo32876b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (InterfaceC10540a) mo32876b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10624k, kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10622j, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: a */
    public InterfaceC10566i1 mo37019a() {
        InterfaceC10566i1 interfaceC10566i1 = this.f41007q;
        return interfaceC10566i1 == this ? this : interfaceC10566i1.mo37019a();
    }
}
