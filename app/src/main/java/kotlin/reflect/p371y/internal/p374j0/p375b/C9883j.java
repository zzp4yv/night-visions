package kotlin.reflect.p371y.internal.p374j0.p375b;

import java.util.List;
import kotlin.C10517i;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.C10780s;
import kotlin.collections.C10782t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9757g0;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.C9786y;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.C10568j0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10703x;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9884k;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.EnumC9908d;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10300a1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10314f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10353s0;
import kotlin.reflect.p371y.internal.p374j0.p422m.p423u.C10452a;

/* compiled from: ReflectionTypes.kt */
/* renamed from: kotlin.f0.y.e.j0.b.j */
/* loaded from: classes2.dex */
public final class C9883j {

    /* renamed from: c */
    private final C10568j0 f37488c;

    /* renamed from: d */
    private final Lazy f37489d;

    /* renamed from: e */
    private final a f37490e;

    /* renamed from: f */
    private final a f37491f;

    /* renamed from: g */
    private final a f37492g;

    /* renamed from: h */
    private final a f37493h;

    /* renamed from: i */
    private final a f37494i;

    /* renamed from: j */
    private final a f37495j;

    /* renamed from: k */
    private final a f37496k;

    /* renamed from: l */
    private final a f37497l;

    /* renamed from: b */
    static final /* synthetic */ KProperty<Object>[] f37487b = {C9757g0.m32304h(new C9786y(C9757g0.m32298b(C9883j.class), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(C9883j.class), "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(C9883j.class), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(C9883j.class), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(C9883j.class), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(C9883j.class), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(C9883j.class), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(C9883j.class), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"))};

    /* renamed from: a */
    public static final b f37486a = new b(null);

    /* compiled from: ReflectionTypes.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.j$a */
    private static final class a {

        /* renamed from: a */
        private final int f37498a;

        public a(int i2) {
            this.f37498a = i2;
        }

        /* renamed from: a */
        public final InterfaceC10552e m32823a(C9883j c9883j, KProperty<?> kProperty) {
            C9768m.m32346f(c9883j, "types");
            C9768m.m32346f(kProperty, "property");
            return c9883j.m32820b(C10452a.m37224a(kProperty.getF40571m()), this.f37498a);
        }
    }

    /* compiled from: ReflectionTypes.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.j$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final AbstractC10311e0 m32824a(InterfaceC10559g0 interfaceC10559g0) {
            C9768m.m32346f(interfaceC10559g0, "module");
            InterfaceC10552e m38149a = C10703x.m38149a(interfaceC10559g0, C9884k.a.f37597s0);
            if (m38149a == null) {
                return null;
            }
            C10300a1 m36577h = C10300a1.f40041g.m36577h();
            List<InterfaceC10554e1> parameters = m38149a.mo32877h().getParameters();
            C9768m.m32345e(parameters, "kPropertyClass.typeConstructor.parameters");
            Object m38866s0 = C10780s.m38866s0(parameters);
            C9768m.m32345e(m38866s0, "kPropertyClass.typeConstructor.parameters.single()");
            return C10314f0.m36667g(m36577h, m38149a, C10782t.m38883e(new C10353s0((InterfaceC10554e1) m38866s0)));
        }
    }

    /* compiled from: ReflectionTypes.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.j$c */
    static final class c extends Lambda implements Function0<InterfaceC10218h> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC10559g0 f37499f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC10559g0 interfaceC10559g0) {
            super(0);
            this.f37499f = interfaceC10559g0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10218h invoke() {
            return this.f37499f.mo37018N(C9884k.f37514o).mo37751q();
        }
    }

    public C9883j(InterfaceC10559g0 interfaceC10559g0, C10568j0 c10568j0) {
        Lazy m37593a;
        C9768m.m32346f(interfaceC10559g0, "module");
        C9768m.m32346f(c10568j0, "notFoundClasses");
        this.f37488c = c10568j0;
        m37593a = C10517i.m37593a(LazyThreadSafetyMode.PUBLICATION, new c(interfaceC10559g0));
        this.f37489d = m37593a;
        this.f37490e = new a(1);
        this.f37491f = new a(1);
        this.f37492g = new a(1);
        this.f37493h = new a(2);
        this.f37494i = new a(3);
        this.f37495j = new a(1);
        this.f37496k = new a(2);
        this.f37497l = new a(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final InterfaceC10552e m32820b(String str, int i2) {
        C10130f m35454x = C10130f.m35454x(str);
        C9768m.m32345e(m35454x, "identifier(className)");
        InterfaceC10561h mo33316f = m32821d().mo33316f(m35454x, EnumC9908d.FROM_REFLECTION);
        InterfaceC10552e interfaceC10552e = mo33316f instanceof InterfaceC10552e ? (InterfaceC10552e) mo33316f : null;
        return interfaceC10552e == null ? this.f37488c.m37703d(new C10126b(C9884k.f37514o, m35454x), C10782t.m38883e(Integer.valueOf(i2))) : interfaceC10552e;
    }

    /* renamed from: d */
    private final InterfaceC10218h m32821d() {
        return (InterfaceC10218h) this.f37489d.getValue();
    }

    /* renamed from: c */
    public final InterfaceC10552e m32822c() {
        return this.f37490e.m32823a(this, f37487b[0]);
    }
}
