package kotlin.reflect.p371y.internal.p374j0.p375b.p377q;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.C10780s;
import kotlin.collections.C10782t;
import kotlin.collections.C10787v0;
import kotlin.collections.C10789w0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9757g0;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.C9786y;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10550d0;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10555f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10549d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10571k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10598b;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10618h;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9884k;
import kotlin.reflect.p371y.internal.p374j0.p375b.InterfaceC9875b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10128d;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10296m;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10292i;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;

/* compiled from: JvmBuiltInClassDescriptorFactory.kt */
/* renamed from: kotlin.f0.y.e.j0.b.q.e */
/* loaded from: classes2.dex */
public final class C9898e implements InterfaceC10598b {

    /* renamed from: d */
    private static final C10130f f37691d;

    /* renamed from: e */
    private static final C10126b f37692e;

    /* renamed from: f */
    private final InterfaceC10559g0 f37693f;

    /* renamed from: g */
    private final Function1<InterfaceC10559g0, InterfaceC10576m> f37694g;

    /* renamed from: h */
    private final InterfaceC10292i f37695h;

    /* renamed from: b */
    static final /* synthetic */ KProperty<Object>[] f37689b = {C9757g0.m32304h(new C9786y(C9757g0.m32298b(C9898e.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};

    /* renamed from: a */
    public static final b f37688a = new b(null);

    /* renamed from: c */
    private static final C10127c f37690c = C9884k.f37517r;

    /* compiled from: JvmBuiltInClassDescriptorFactory.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.q.e$a */
    static final class a extends Lambda implements Function1<InterfaceC10559g0, InterfaceC9875b> {

        /* renamed from: f */
        public static final a f37696f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC9875b invoke(InterfaceC10559g0 interfaceC10559g0) {
            C9768m.m32346f(interfaceC10559g0, "module");
            List<InterfaceC10571k0> mo37749I = interfaceC10559g0.mo37018N(C9898e.f37690c).mo37749I();
            ArrayList arrayList = new ArrayList();
            for (Object obj : mo37749I) {
                if (obj instanceof InterfaceC9875b) {
                    arrayList.add(obj);
                }
            }
            return (InterfaceC9875b) C10780s.m38830U(arrayList);
        }
    }

    /* compiled from: JvmBuiltInClassDescriptorFactory.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.q.e$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final C10126b m32950a() {
            return C9898e.f37692e;
        }
    }

    /* compiled from: JvmBuiltInClassDescriptorFactory.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.q.e$c */
    static final class c extends Lambda implements Function0<C10618h> {

        /* renamed from: g */
        final /* synthetic */ InterfaceC10297n f37698g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC10297n interfaceC10297n) {
            super(0);
            this.f37698g = interfaceC10297n;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C10618h invoke() {
            Set<InterfaceC10549d> m38917d;
            C10618h c10618h = new C10618h((InterfaceC10576m) C9898e.this.f37694g.invoke(C9898e.this.f37693f), C9898e.f37691d, EnumC10550d0.ABSTRACT, EnumC10555f.INTERFACE, C10782t.m38883e(C9898e.this.f37693f.mo37021o().m32791i()), InterfaceC10708z0.f41247a, false, this.f37698g);
            C9894a c9894a = new C9894a(this.f37698g, c10618h);
            m38917d = C10789w0.m38917d();
            c10618h.m37854L0(c9894a, m38917d, null);
            return c10618h;
        }
    }

    static {
        C10128d c10128d = C9884k.a.f37566d;
        C10130f m35438i = c10128d.m35438i();
        C9768m.m32345e(m35438i, "cloneable.shortName()");
        f37691d = m35438i;
        C10126b m35408m = C10126b.m35408m(c10128d.m35441l());
        C9768m.m32345e(m35408m, "topLevel(StandardNames.FqNames.cloneable.toSafe())");
        f37692e = m35408m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9898e(InterfaceC10297n interfaceC10297n, InterfaceC10559g0 interfaceC10559g0, Function1<? super InterfaceC10559g0, ? extends InterfaceC10576m> function1) {
        C9768m.m32346f(interfaceC10297n, "storageManager");
        C9768m.m32346f(interfaceC10559g0, "moduleDescriptor");
        C9768m.m32346f(function1, "computeContainingDeclaration");
        this.f37693f = interfaceC10559g0;
        this.f37694g = function1;
        this.f37695h = interfaceC10297n.mo36516d(new c(interfaceC10297n));
    }

    /* renamed from: i */
    private final C10618h m32948i() {
        return (C10618h) C10296m.m36555a(this.f37695h, this, f37689b[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10598b
    /* renamed from: a */
    public Collection<InterfaceC10552e> mo32848a(C10127c c10127c) {
        Set m38917d;
        Set m38916c;
        C9768m.m32346f(c10127c, "packageFqName");
        if (C9768m.m32341a(c10127c, f37690c)) {
            m38916c = C10787v0.m38916c(m32948i());
            return m38916c;
        }
        m38917d = C10789w0.m38917d();
        return m38917d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10598b
    /* renamed from: b */
    public boolean mo32849b(C10127c c10127c, C10130f c10130f) {
        C9768m.m32346f(c10127c, "packageFqName");
        C9768m.m32346f(c10130f, "name");
        return C9768m.m32341a(c10130f, f37691d) && C9768m.m32341a(c10127c, f37690c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10598b
    /* renamed from: c */
    public InterfaceC10552e mo32850c(C10126b c10126b) {
        C9768m.m32346f(c10126b, "classId");
        if (C9768m.m32341a(c10126b, f37692e)) {
            return m32948i();
        }
        return null;
    }

    public /* synthetic */ C9898e(InterfaceC10297n interfaceC10297n, InterfaceC10559g0 interfaceC10559g0, Function1 function1, int i2, C9756g c9756g) {
        this(interfaceC10297n, interfaceC10559g0, (i2 & 4) != 0 ? a.f37696f : function1);
    }
}
