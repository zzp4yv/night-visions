package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10770n;
import kotlin.collections.C10784u;
import kotlin.collections.C10786v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9757g0;
import kotlin.jvm.internal.C9760i;
import kotlin.jvm.internal.C9763j0;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10578m1;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.InterfaceC10674h;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.InterfaceC10688v;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.EnumC9993d0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10000j;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10013w;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9997g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.sequences.C10489n;
import kotlin.sequences.Sequence;

/* compiled from: ReflectJavaClass.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.l */
/* loaded from: classes2.dex */
public final class C10678l extends AbstractC10682p implements InterfaceC10674h, InterfaceC10688v, InterfaceC9997g {

    /* renamed from: a */
    private final Class<?> f41193a;

    /* compiled from: ReflectJavaClass.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.l$a */
    /* synthetic */ class a extends C9760i implements Function1<Member, Boolean> {

        /* renamed from: h */
        public static final a f41194h = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC9748c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getF40571m() {
            return "isSynthetic";
        }

        @Override // kotlin.jvm.internal.AbstractC9748c
        public final KDeclarationContainer getOwner() {
            return C9757g0.m32298b(Member.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9748c
        public final String getSignature() {
            return "isSynthetic()Z";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Member member) {
            C9768m.m32346f(member, "p0");
            return Boolean.valueOf(member.isSynthetic());
        }
    }

    /* compiled from: ReflectJavaClass.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.l$b */
    /* synthetic */ class b extends C9760i implements Function1<Constructor<?>, C10681o> {

        /* renamed from: h */
        public static final b f41195h = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC9748c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getF40571m() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.AbstractC9748c
        public final KDeclarationContainer getOwner() {
            return C9757g0.m32298b(C10681o.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9748c
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Constructor;)V";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final C10681o invoke(Constructor<?> constructor) {
            C9768m.m32346f(constructor, "p0");
            return new C10681o(constructor);
        }
    }

    /* compiled from: ReflectJavaClass.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.l$c */
    /* synthetic */ class c extends C9760i implements Function1<Member, Boolean> {

        /* renamed from: h */
        public static final c f41196h = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC9748c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getF40571m() {
            return "isSynthetic";
        }

        @Override // kotlin.jvm.internal.AbstractC9748c
        public final KDeclarationContainer getOwner() {
            return C9757g0.m32298b(Member.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9748c
        public final String getSignature() {
            return "isSynthetic()Z";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Member member) {
            C9768m.m32346f(member, "p0");
            return Boolean.valueOf(member.isSynthetic());
        }
    }

    /* compiled from: ReflectJavaClass.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.l$d */
    /* synthetic */ class d extends C9760i implements Function1<Field, C10684r> {

        /* renamed from: h */
        public static final d f41197h = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC9748c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getF40571m() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.AbstractC9748c
        public final KDeclarationContainer getOwner() {
            return C9757g0.m32298b(C10684r.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9748c
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Field;)V";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final C10684r invoke(Field field) {
            C9768m.m32346f(field, "p0");
            return new C10684r(field);
        }
    }

    /* compiled from: ReflectJavaClass.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.l$e */
    static final class e extends Lambda implements Function1<Class<?>, Boolean> {

        /* renamed from: f */
        public static final e f41198f = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Class<?> cls) {
            String simpleName = cls.getSimpleName();
            C9768m.m32345e(simpleName, "it.simpleName");
            return Boolean.valueOf(simpleName.length() == 0);
        }
    }

    /* compiled from: ReflectJavaClass.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.l$f */
    static final class f extends Lambda implements Function1<Class<?>, C10130f> {

        /* renamed from: f */
        public static final f f41199f = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C10130f invoke(Class<?> cls) {
            String simpleName = cls.getSimpleName();
            if (!C10130f.m35450A(simpleName)) {
                simpleName = null;
            }
            if (simpleName != null) {
                return C10130f.m35454x(simpleName);
            }
            return null;
        }
    }

    /* compiled from: ReflectJavaClass.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.l$g */
    static final class g extends Lambda implements Function1<Method, Boolean> {
        g() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
        
            if (r0.m38088a0(r5) == false) goto L9;
         */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(java.lang.reflect.Method r5) {
            /*
                r4 = this;
                boolean r0 = r5.isSynthetic()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto La
            L8:
                r1 = 0
                goto L1f
            La:
                kotlin.reflect.jvm.internal.impl.descriptors.r1.b.l r0 = kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10678l.this
                boolean r0 = r0.mo33588B()
                if (r0 == 0) goto L1f
                kotlin.reflect.jvm.internal.impl.descriptors.r1.b.l r0 = kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10678l.this
                java.lang.String r3 = "method"
                kotlin.jvm.internal.C9768m.m32345e(r5, r3)
                boolean r5 = kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10678l.m38087R(r0, r5)
                if (r5 != 0) goto L8
            L1f:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10678l.g.invoke(java.lang.reflect.Method):java.lang.Boolean");
        }
    }

    /* compiled from: ReflectJavaClass.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.l$h */
    /* synthetic */ class h extends C9760i implements Function1<Method, C10687u> {

        /* renamed from: h */
        public static final h f41201h = new h();

        h() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC9748c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getF40571m() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.AbstractC9748c
        public final KDeclarationContainer getOwner() {
            return C9757g0.m32298b(C10687u.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9748c
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Method;)V";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final C10687u invoke(Method method) {
            C9768m.m32346f(method, "p0");
            return new C10687u(method);
        }
    }

    public C10678l(Class<?> cls) {
        C9768m.m32346f(cls, "klass");
        this.f41193a = cls;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public final boolean m38088a0(Method method) {
        String name = method.getName();
        if (C9768m.m32341a(name, "values")) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            C9768m.m32345e(parameterTypes, "method.parameterTypes");
            if (parameterTypes.length == 0) {
                return true;
            }
        } else if (C9768m.m32341a(name, "valueOf")) {
            return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
        }
        return false;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9997g
    /* renamed from: B */
    public boolean mo33588B() {
        return this.f41193a.isEnum();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.InterfaceC10688v
    /* renamed from: E */
    public int mo38089E() {
        return this.f41193a.getModifiers();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9997g
    /* renamed from: H */
    public boolean mo33590H() {
        return this.f41193a.isInterface();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9997g
    /* renamed from: I */
    public EnumC9993d0 mo33591I() {
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9997g
    /* renamed from: N */
    public Collection<InterfaceC10000j> mo33594N() {
        Class<?>[] m38051c = C10666b.f41161a.m38051c(this.f41193a);
        if (m38051c == null) {
            return C10784u.m38888j();
        }
        ArrayList arrayList = new ArrayList(m38051c.length);
        for (Class<?> cls : m38051c) {
            arrayList.add(new C10680n(cls));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10009s
    /* renamed from: Q */
    public boolean mo33623Q() {
        return InterfaceC10688v.a.m38119d(this);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9992d
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public C10671e mo33582l(C10127c c10127c) {
        return InterfaceC10674h.a.m38081a(this, c10127c);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9992d
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public List<C10671e> getAnnotations() {
        return InterfaceC10674h.a.m38082b(this);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9997g
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public List<C10681o> mo33599k() {
        Sequence m38762r;
        Sequence m37391u;
        List<C10681o> m37377A;
        Constructor<?>[] declaredConstructors = this.f41193a.getDeclaredConstructors();
        C9768m.m32345e(declaredConstructors, "klass.declaredConstructors");
        m38762r = C10770n.m38762r(declaredConstructors);
        m37391u = C10489n.m37391u(C10489n.m37383m(m38762r, a.f41194h), b.f41195h);
        m37377A = C10489n.m37377A(m37391u);
        return m37377A;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.InterfaceC10674h
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public Class<?> mo38048w() {
        return this.f41193a;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9997g
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public List<C10684r> mo33589D() {
        Sequence m38762r;
        Sequence m37391u;
        List<C10684r> m37377A;
        Field[] declaredFields = this.f41193a.getDeclaredFields();
        C9768m.m32345e(declaredFields, "klass.declaredFields");
        m38762r = C10770n.m38762r(declaredFields);
        m37391u = C10489n.m37391u(C10489n.m37383m(m38762r, c.f41196h), d.f41197h);
        m37377A = C10489n.m37377A(m37391u);
        return m37377A;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9997g
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public List<C10130f> mo33592K() {
        Sequence m38762r;
        Sequence m37392v;
        List<C10130f> m37377A;
        Class<?>[] declaredClasses = this.f41193a.getDeclaredClasses();
        C9768m.m32345e(declaredClasses, "klass.declaredClasses");
        m38762r = C10770n.m38762r(declaredClasses);
        m37392v = C10489n.m37392v(C10489n.m37383m(m38762r, e.f41198f), f.f41199f);
        m37377A = C10489n.m37377A(m37392v);
        return m37377A;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9997g
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public List<C10687u> mo33593M() {
        Sequence m38762r;
        Sequence m37382l;
        Sequence m37391u;
        List<C10687u> m37377A;
        Method[] declaredMethods = this.f41193a.getDeclaredMethods();
        C9768m.m32345e(declaredMethods, "klass.declaredMethods");
        m38762r = C10770n.m38762r(declaredMethods);
        m37382l = C10489n.m37382l(m38762r, new g());
        m37391u = C10489n.m37391u(m37382l, h.f41201h);
        m37377A = C10489n.m37377A(m37391u);
        return m37377A;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9997g
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public C10678l mo33597i() {
        Class<?> declaringClass = this.f41193a.getDeclaringClass();
        if (declaringClass != null) {
            return new C10678l(declaringClass);
        }
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9997g
    /* renamed from: a */
    public Collection<InterfaceC10000j> mo33595a() {
        Class cls;
        List m38891m;
        cls = Object.class;
        if (C9768m.m32341a(this.f41193a, cls)) {
            return C10784u.m38888j();
        }
        C9763j0 c9763j0 = new C9763j0(2);
        Object genericSuperclass = this.f41193a.getGenericSuperclass();
        c9763j0.m32319a(genericSuperclass != null ? genericSuperclass : Object.class);
        Type[] genericInterfaces = this.f41193a.getGenericInterfaces();
        C9768m.m32345e(genericInterfaces, "klass.genericInterfaces");
        c9763j0.m32320b(genericInterfaces);
        m38891m = C10784u.m38891m(c9763j0.m32322d(new Type[c9763j0.m32321c()]));
        ArrayList arrayList = new ArrayList(C10786v.m38911u(m38891m, 10));
        Iterator it = m38891m.iterator();
        while (it.hasNext()) {
            arrayList.add(new C10680n((Type) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9997g
    /* renamed from: d */
    public C10127c mo33596d() {
        C10127c m35409b = C10670d.m38069a(this.f41193a).m35409b();
        C9768m.m32345e(m35409b, "klass.classId.asSingleFqName()");
        return m35409b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10678l) && C9768m.m32341a(this.f41193a, ((C10678l) obj).f41193a);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10010t
    public C10130f getName() {
        C10130f m35454x = C10130f.m35454x(this.f41193a.getSimpleName());
        C9768m.m32345e(m35454x, "identifier(klass.simpleName)");
        return m35454x;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10016z
    public List<C10665a0> getTypeParameters() {
        TypeVariable<Class<?>>[] typeParameters = this.f41193a.getTypeParameters();
        C9768m.m32345e(typeParameters, "klass.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Class<?>> typeVariable : typeParameters) {
            arrayList.add(new C10665a0(typeVariable));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10009s
    public AbstractC10578m1 getVisibility() {
        return InterfaceC10688v.a.m38116a(this);
    }

    public int hashCode() {
        return this.f41193a.hashCode();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10009s
    public boolean isAbstract() {
        return InterfaceC10688v.a.m38117b(this);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10009s
    public boolean isFinal() {
        return InterfaceC10688v.a.m38118c(this);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9997g
    /* renamed from: j */
    public Collection<InterfaceC10013w> mo33598j() {
        Object[] m38052d = C10666b.f41161a.m38052d(this.f41193a);
        if (m38052d == null) {
            m38052d = new Object[0];
        }
        ArrayList arrayList = new ArrayList(m38052d.length);
        for (Object obj : m38052d) {
            arrayList.add(new C10691y(obj));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9992d
    /* renamed from: m */
    public boolean mo33583m() {
        return InterfaceC10674h.a.m38083c(this);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9997g
    /* renamed from: o */
    public boolean mo33600o() {
        Boolean m38054f = C10666b.f41161a.m38054f(this.f41193a);
        if (m38054f != null) {
            return m38054f.booleanValue();
        }
        return false;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9997g
    /* renamed from: r */
    public boolean mo33601r() {
        return this.f41193a.isAnnotation();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9997g
    /* renamed from: t */
    public boolean mo33602t() {
        Boolean m38053e = C10666b.f41161a.m38053e(this.f41193a);
        if (m38053e != null) {
            return m38053e.booleanValue();
        }
        return false;
    }

    public String toString() {
        return C10678l.class.getName() + ": " + this.f41193a;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9997g
    /* renamed from: u */
    public boolean mo33603u() {
        return false;
    }
}
