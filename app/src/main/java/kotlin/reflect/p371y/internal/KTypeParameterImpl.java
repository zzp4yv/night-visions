package kotlin.reflect.p371y.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C10742u;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10786v;
import kotlin.jvm.C9719a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9757g0;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.C9786y;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeParameterReference;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a.C10656f;
import kotlin.reflect.p371y.internal.C9846a0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10062k;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10256f;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10257g;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10351r1;
import okhttp3.HttpUrl;

/* compiled from: KTypeParameterImpl.kt */
@Metadata(m32266d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u000eH\u0016J\u0010\u0010\"\u001a\u0006\u0012\u0002\b\u00030#*\u00020$H\u0002J\u0010\u0010%\u001a\u0006\u0012\u0002\b\u00030&*\u00020'H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006("}, m32267d2 = {"Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "Lkotlin/reflect/KTypeParameter;", "Lkotlin/reflect/jvm/internal/KClassifierImpl;", "container", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/TypeParameterDescriptor;", "(Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;)V", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;", "isReified", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "name", HttpUrl.FRAGMENT_ENCODE_SET, "getName", "()Ljava/lang/String;", "upperBounds", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/KType;", "getUpperBounds", "()Ljava/util/List;", "upperBounds$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "variance", "Lkotlin/reflect/KVariance;", "getVariance", "()Lkotlin/reflect/KVariance;", "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "getContainerClass", "Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/DeserializedMemberDescriptor;", "toKClassImpl", "Lkotlin/reflect/jvm/internal/KClassImpl;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.w, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class KTypeParameterImpl implements KTypeParameter {

    /* renamed from: f */
    static final /* synthetic */ KProperty<Object>[] f40601f = {C9757g0.m32304h(new C9786y(C9757g0.m32298b(KTypeParameterImpl.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};

    /* renamed from: g */
    private final InterfaceC10554e1 f40602g;

    /* renamed from: h */
    private final C9846a0.a f40603h;

    /* renamed from: i */
    private final KTypeParameterOwnerImpl f40604i;

    /* compiled from: KTypeParameterImpl.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.w$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40605a;

        static {
            int[] iArr = new int[EnumC10351r1.values().length];
            iArr[EnumC10351r1.INVARIANT.ordinal()] = 1;
            iArr[EnumC10351r1.IN_VARIANCE.ordinal()] = 2;
            iArr[EnumC10351r1.OUT_VARIANCE.ordinal()] = 3;
            f40605a = iArr;
        }
    }

    /* compiled from: KTypeParameterImpl.kt */
    @Metadata(m32266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KTypeImpl;", "kotlin.jvm.PlatformType", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.w$b */
    static final class b extends Lambda implements Function0<List<? extends KTypeImpl>> {
        b() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final List<? extends KTypeImpl> invoke() {
            List<AbstractC10311e0> upperBounds = KTypeParameterImpl.this.getF40602g().getUpperBounds();
            C9768m.m32345e(upperBounds, "descriptor.upperBounds");
            ArrayList arrayList = new ArrayList(C10786v.m38911u(upperBounds, 10));
            Iterator<T> it = upperBounds.iterator();
            while (it.hasNext()) {
                arrayList.add(new KTypeImpl((AbstractC10311e0) it.next(), null, 2, 0 == true ? 1 : 0));
            }
            return arrayList;
        }
    }

    public KTypeParameterImpl(KTypeParameterOwnerImpl kTypeParameterOwnerImpl, InterfaceC10554e1 interfaceC10554e1) {
        KClassImpl<?> kClassImpl;
        Object mo37017L;
        C9768m.m32346f(interfaceC10554e1, "descriptor");
        this.f40602g = interfaceC10554e1;
        this.f40603h = C9846a0.m32480d(new b());
        if (kTypeParameterOwnerImpl == null) {
            InterfaceC10576m mo32876b = getF40602g().mo32876b();
            C9768m.m32345e(mo32876b, "descriptor.containingDeclaration");
            if (mo32876b instanceof InterfaceC10552e) {
                mo37017L = m37328c((InterfaceC10552e) mo32876b);
            } else {
                if (!(mo32876b instanceof InterfaceC10543b)) {
                    throw new KotlinReflectionInternalError("Unknown type parameter container: " + mo32876b);
                }
                InterfaceC10576m mo32876b2 = ((InterfaceC10543b) mo32876b).mo32876b();
                C9768m.m32345e(mo32876b2, "declaration.containingDeclaration");
                if (mo32876b2 instanceof InterfaceC10552e) {
                    kClassImpl = m37328c((InterfaceC10552e) mo32876b2);
                } else {
                    InterfaceC10257g interfaceC10257g = mo32876b instanceof InterfaceC10257g ? (InterfaceC10257g) mo32876b : null;
                    if (interfaceC10257g == null) {
                        throw new KotlinReflectionInternalError("Non-class callable descriptor must be deserialized: " + mo32876b);
                    }
                    KClass m32279e = C9719a.m32279e(m37327a(interfaceC10257g));
                    C9768m.m32344d(m32279e, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
                    kClassImpl = (KClassImpl) m32279e;
                }
                mo37017L = mo32876b.mo37017L(new CreateKCallableVisitor(kClassImpl), C10742u.f41439a);
            }
            C9768m.m32345e(mo37017L, "when (val declaration = … $declaration\")\n        }");
            kTypeParameterOwnerImpl = (KTypeParameterOwnerImpl) mo37017L;
        }
        this.f40604i = kTypeParameterOwnerImpl;
    }

    /* renamed from: a */
    private final Class<?> m37327a(InterfaceC10257g interfaceC10257g) {
        Class<?> m38025d;
        InterfaceC10256f mo36260c0 = interfaceC10257g.mo36260c0();
        if (!(mo36260c0 instanceof C10062k)) {
            mo36260c0 = null;
        }
        C10062k c10062k = (C10062k) mo36260c0;
        InterfaceC10068q m33985g = c10062k != null ? c10062k.m33985g() : null;
        C10656f c10656f = (C10656f) (m33985g instanceof C10656f ? m33985g : null);
        if (c10656f != null && (m38025d = c10656f.m38025d()) != null) {
            return m38025d;
        }
        throw new KotlinReflectionInternalError("Container of deserialized member is not resolved: " + interfaceC10257g);
    }

    /* renamed from: c */
    private final KClassImpl<?> m37328c(InterfaceC10552e interfaceC10552e) {
        Class<?> m32571p = C9858g0.m32571p(interfaceC10552e);
        KClassImpl<?> kClassImpl = (KClassImpl) (m32571p != null ? C9719a.m32279e(m32571p) : null);
        if (kClassImpl != null) {
            return kClassImpl;
        }
        throw new KotlinReflectionInternalError("Type parameter container is not resolved: " + interfaceC10552e.mo32876b());
    }

    /* renamed from: b, reason: from getter */
    public InterfaceC10554e1 getF40602g() {
        return this.f40602g;
    }

    public boolean equals(Object other) {
        if (other instanceof KTypeParameterImpl) {
            KTypeParameterImpl kTypeParameterImpl = (KTypeParameterImpl) other;
            if (C9768m.m32341a(this.f40604i, kTypeParameterImpl.f40604i) && C9768m.m32341a(getName(), kTypeParameterImpl.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.KTypeParameter
    public String getName() {
        String m35455k = getF40602g().getName().m35455k();
        C9768m.m32345e(m35455k, "descriptor.name.asString()");
        return m35455k;
    }

    @Override // kotlin.reflect.KTypeParameter
    public List<KType> getUpperBounds() {
        T m32484c = this.f40603h.m32484c(this, f40601f[0]);
        C9768m.m32345e(m32484c, "<get-upperBounds>(...)");
        return (List) m32484c;
    }

    public int hashCode() {
        return (this.f40604i.hashCode() * 31) + getName().hashCode();
    }

    @Override // kotlin.reflect.KTypeParameter
    /* renamed from: n */
    public KVariance mo32439n() {
        int i2 = a.f40605a[getF40602g().mo37672n().ordinal()];
        if (i2 == 1) {
            return KVariance.INVARIANT;
        }
        if (i2 == 2) {
            return KVariance.IN;
        }
        if (i2 == 3) {
            return KVariance.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public String toString() {
        return TypeParameterReference.f37187f.m32364a(this);
    }
}
