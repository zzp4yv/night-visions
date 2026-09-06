package kotlin.reflect.p371y.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.C10517i;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.collections.C10762j;
import kotlin.collections.C10780s;
import kotlin.collections.C10784u;
import kotlin.collections.C10786v;
import kotlin.jvm.C9719a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9757g0;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.C9786y;
import kotlin.jvm.internal.KTypeBase;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KProperty;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10551d1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10670d;
import kotlin.reflect.p371y.C9842b;
import kotlin.reflect.p371y.internal.C9846a0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10339n1;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10351r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1;
import okhttp3.HttpUrl;

/* compiled from: KTypeImpl.kt */
@Metadata(m32266d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0012\u0010\"\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0013\u0010#\u001a\u00020\u001b2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020'H\u0016J\u0015\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u001bH\u0000¢\u0006\u0002\b*J\b\u0010+\u001a\u00020,H\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000f\u0010\fR\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0017X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001cR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006-²\u0006\u0010\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060\tX\u008a\u0084\u0002"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/KTypeImpl;", "Lkotlin/jvm/internal/KTypeBase;", "type", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "computeJavaType", "Lkotlin/Function0;", "Ljava/lang/reflect/Type;", "(Lorg/jetbrains/kotlin/types/KotlinType;Lkotlin/jvm/functions/Function0;)V", "annotations", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "getAnnotations", "()Ljava/util/List;", "arguments", "Lkotlin/reflect/KTypeProjection;", "getArguments", "arguments$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "classifier", "Lkotlin/reflect/KClassifier;", "getClassifier", "()Lkotlin/reflect/KClassifier;", "classifier$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getComputeJavaType$annotations", "()V", "isMarkedNullable", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "javaType", "getJavaType", "()Ljava/lang/reflect/Type;", "getType", "()Lorg/jetbrains/kotlin/types/KotlinType;", "convert", "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "makeNullableAsSpecified", "nullable", "makeNullableAsSpecified$kotlin_reflection", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-reflection", "parameterizedTypeArguments"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.v, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class KTypeImpl implements KTypeBase {

    /* renamed from: f */
    static final /* synthetic */ KProperty<Object>[] f40588f = {C9757g0.m32304h(new C9786y(C9757g0.m32298b(KTypeImpl.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(KTypeImpl.class), "arguments", "getArguments()Ljava/util/List;"))};

    /* renamed from: g */
    private final AbstractC10311e0 f40589g;

    /* renamed from: h */
    private final C9846a0.a<Type> f40590h;

    /* renamed from: i */
    private final C9846a0.a f40591i;

    /* renamed from: j */
    private final C9846a0.a f40592j;

    /* compiled from: KTypeImpl.kt */
    @Metadata(m32266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/KTypeProjection;", "kotlin.jvm.PlatformType", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.v$a */
    static final class a extends Lambda implements Function0<List<? extends KTypeProjection>> {

        /* renamed from: g */
        final /* synthetic */ Function0<Type> f40594g;

        /* compiled from: KTypeImpl.kt */
        @Metadata(m32266d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m32267d2 = {"<no name provided>", "Ljava/lang/reflect/Type;", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.v$a$a, reason: collision with other inner class name */
        static final class C11529a extends Lambda implements Function0<Type> {

            /* renamed from: f */
            final /* synthetic */ KTypeImpl f40595f;

            /* renamed from: g */
            final /* synthetic */ int f40596g;

            /* renamed from: h */
            final /* synthetic */ Lazy<List<Type>> f40597h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C11529a(KTypeImpl kTypeImpl, int i2, Lazy<? extends List<? extends Type>> lazy) {
                super(0);
                this.f40595f = kTypeImpl;
                this.f40596g = i2;
                this.f40597h = lazy;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Type invoke() {
                Type mo32365j = this.f40595f.mo32365j();
                if (mo32365j instanceof Class) {
                    Class cls = (Class) mo32365j;
                    Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                    C9768m.m32345e(componentType, "{\n                      …                        }");
                    return componentType;
                }
                if (mo32365j instanceof GenericArrayType) {
                    if (this.f40596g == 0) {
                        Type genericComponentType = ((GenericArrayType) mo32365j).getGenericComponentType();
                        C9768m.m32345e(genericComponentType, "{\n                      …                        }");
                        return genericComponentType;
                    }
                    throw new KotlinReflectionInternalError("Array type has been queried for a non-0th argument: " + this.f40595f);
                }
                if (!(mo32365j instanceof ParameterizedType)) {
                    throw new KotlinReflectionInternalError("Non-generic type has been queried for arguments: " + this.f40595f);
                }
                Type type = (Type) a.m37324c(this.f40597h).get(this.f40596g);
                if (type instanceof WildcardType) {
                    WildcardType wildcardType = (WildcardType) type;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    C9768m.m32345e(lowerBounds, "argument.lowerBounds");
                    Type type2 = (Type) C10762j.m38696x(lowerBounds);
                    if (type2 == null) {
                        Type[] upperBounds = wildcardType.getUpperBounds();
                        C9768m.m32345e(upperBounds, "argument.upperBounds");
                        type = (Type) C10762j.m38695w(upperBounds);
                    } else {
                        type = type2;
                    }
                }
                C9768m.m32345e(type, "{\n                      …                        }");
                return type;
            }
        }

        /* compiled from: KTypeImpl.kt */
        @Metadata(m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.v$a$b */
        public /* synthetic */ class b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f40598a;

            static {
                int[] iArr = new int[EnumC10351r1.values().length];
                iArr[EnumC10351r1.INVARIANT.ordinal()] = 1;
                iArr[EnumC10351r1.IN_VARIANCE.ordinal()] = 2;
                iArr[EnumC10351r1.OUT_VARIANCE.ordinal()] = 3;
                f40598a = iArr;
            }
        }

        /* compiled from: KTypeImpl.kt */
        @Metadata(m32266d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/lang/reflect/Type;", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.v$a$c */
        static final class c extends Lambda implements Function0<List<? extends Type>> {

            /* renamed from: f */
            final /* synthetic */ KTypeImpl f40599f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(KTypeImpl kTypeImpl) {
                super(0);
                this.f40599f = kTypeImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends Type> invoke() {
                Type mo32365j = this.f40599f.mo32365j();
                C9768m.m32343c(mo32365j);
                return C10670d.m38071c(mo32365j);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function0<? extends Type> function0) {
            super(0);
            this.f40594g = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final List<Type> m37324c(Lazy<? extends List<? extends Type>> lazy) {
            return (List) lazy.getValue();
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends KTypeProjection> invoke() {
            Lazy m37593a;
            KTypeProjection m32447d;
            List<InterfaceC10318g1> mo35991M0 = KTypeImpl.this.getF40589g().mo35991M0();
            if (mo35991M0.isEmpty()) {
                return C10784u.m38888j();
            }
            m37593a = C10517i.m37593a(LazyThreadSafetyMode.PUBLICATION, new c(KTypeImpl.this));
            Function0<Type> function0 = this.f40594g;
            KTypeImpl kTypeImpl = KTypeImpl.this;
            ArrayList arrayList = new ArrayList(C10786v.m38911u(mo35991M0, 10));
            int i2 = 0;
            for (Object obj : mo35991M0) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C10784u.m38898t();
                }
                InterfaceC10318g1 interfaceC10318g1 = (InterfaceC10318g1) obj;
                if (interfaceC10318g1.mo36710c()) {
                    m32447d = KTypeProjection.f37240a.m32446c();
                } else {
                    AbstractC10311e0 type = interfaceC10318g1.getType();
                    C9768m.m32345e(type, "typeProjection.type");
                    KTypeImpl kTypeImpl2 = new KTypeImpl(type, function0 == null ? null : new C11529a(kTypeImpl, i2, m37593a));
                    int i4 = b.f40598a[interfaceC10318g1.mo36708a().ordinal()];
                    if (i4 == 1) {
                        m32447d = KTypeProjection.f37240a.m32447d(kTypeImpl2);
                    } else if (i4 == 2) {
                        m32447d = KTypeProjection.f37240a.m32444a(kTypeImpl2);
                    } else {
                        if (i4 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        m32447d = KTypeProjection.f37240a.m32445b(kTypeImpl2);
                    }
                }
                arrayList.add(m32447d);
                i2 = i3;
            }
            return arrayList;
        }
    }

    /* compiled from: KTypeImpl.kt */
    @Metadata(m32266d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m32267d2 = {"<anonymous>", "Lkotlin/reflect/KClassifier;", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.v$b */
    static final class b extends Lambda implements Function0<KClassifier> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final KClassifier invoke() {
            KTypeImpl kTypeImpl = KTypeImpl.this;
            return kTypeImpl.m37321d(kTypeImpl.getF40589g());
        }
    }

    public KTypeImpl(AbstractC10311e0 abstractC10311e0, Function0<? extends Type> function0) {
        C9768m.m32346f(abstractC10311e0, "type");
        this.f40589g = abstractC10311e0;
        C9846a0.a<Type> aVar = null;
        C9846a0.a<Type> aVar2 = function0 instanceof C9846a0.a ? (C9846a0.a) function0 : null;
        if (aVar2 != null) {
            aVar = aVar2;
        } else if (function0 != null) {
            aVar = C9846a0.m32480d(function0);
        }
        this.f40590h = aVar;
        this.f40591i = C9846a0.m32480d(new b());
        this.f40592j = C9846a0.m32480d(new a(function0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final KClassifier m37321d(AbstractC10311e0 abstractC10311e0) {
        AbstractC10311e0 type;
        InterfaceC10561h mo32891w = abstractC10311e0.mo35993O0().mo32891w();
        if (!(mo32891w instanceof InterfaceC10552e)) {
            if (mo32891w instanceof InterfaceC10554e1) {
                return new KTypeParameterImpl(null, (InterfaceC10554e1) mo32891w);
            }
            if (!(mo32891w instanceof InterfaceC10551d1)) {
                return null;
            }
            throw new NotImplementedError("An operation is not implemented: Type alias classifiers are not yet supported");
        }
        Class<?> m32571p = C9858g0.m32571p((InterfaceC10552e) mo32891w);
        if (m32571p == null) {
            return null;
        }
        if (!m32571p.isArray()) {
            if (C10339n1.m36779l(abstractC10311e0)) {
                return new KClassImpl(m32571p);
            }
            Class<?> m38072d = C10670d.m38072d(m32571p);
            if (m38072d != null) {
                m32571p = m38072d;
            }
            return new KClassImpl(m32571p);
        }
        InterfaceC10318g1 interfaceC10318g1 = (InterfaceC10318g1) C10780s.m38870u0(abstractC10311e0.mo35991M0());
        if (interfaceC10318g1 == null || (type = interfaceC10318g1.getType()) == null) {
            return new KClassImpl(m32571p);
        }
        KClassifier m37321d = m37321d(type);
        if (m37321d != null) {
            return new KClassImpl(C9858g0.m32561f(C9719a.m32276b(C9842b.m32463a(m37321d))));
        }
        throw new KotlinReflectionInternalError("Cannot determine classifier for array element type: " + this);
    }

    @Override // kotlin.reflect.KType
    /* renamed from: b */
    public List<KTypeProjection> mo32436b() {
        T m32484c = this.f40592j.m32484c(this, f40588f[1]);
        C9768m.m32345e(m32484c, "<get-arguments>(...)");
        return (List) m32484c;
    }

    @Override // kotlin.reflect.KType
    /* renamed from: c */
    public KClassifier mo32437c() {
        return (KClassifier) this.f40591i.m32484c(this, f40588f[0]);
    }

    @Override // kotlin.reflect.KType
    /* renamed from: e */
    public boolean mo32438e() {
        return this.f40589g.mo33691P0();
    }

    public boolean equals(Object other) {
        return (other instanceof KTypeImpl) && C9768m.m32341a(this.f40589g, ((KTypeImpl) other).f40589g);
    }

    /* renamed from: f, reason: from getter */
    public final AbstractC10311e0 getF40589g() {
        return this.f40589g;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public List<Annotation> getAnnotations() {
        return C9858g0.m32560e(this.f40589g);
    }

    public int hashCode() {
        return this.f40589g.hashCode();
    }

    @Override // kotlin.jvm.internal.KTypeBase
    /* renamed from: j */
    public Type mo32365j() {
        C9846a0.a<Type> aVar = this.f40590h;
        if (aVar != null) {
            return aVar.invoke();
        }
        return null;
    }

    public String toString() {
        return ReflectionObjectRenderer.f37273a.m32503h(this.f40589g);
    }

    public /* synthetic */ KTypeImpl(AbstractC10311e0 abstractC10311e0, Function0 function0, int i2, C9756g c9756g) {
        this(abstractC10311e0, (i2 & 2) != 0 ? null : function0);
    }
}
