package kotlin.reflect.p371y;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C10780s;
import kotlin.jvm.internal.C9757g0;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10555f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.p371y.internal.KTypeImpl;
import kotlin.reflect.p371y.internal.KotlinReflectionInternalError;

/* compiled from: KTypesJvm.kt */
@Metadata(m32266d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001c\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\"\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0003\u0010\b¨\u0006\t"}, m32267d2 = {"jvmErasure", "Lkotlin/reflect/KClass;", "Lkotlin/reflect/KClassifier;", "getJvmErasure", "(Lkotlin/reflect/KClassifier;)Lkotlin/reflect/KClass;", "Lkotlin/reflect/KType;", "getJvmErasure$annotations", "(Lkotlin/reflect/KType;)V", "(Lkotlin/reflect/KType;)Lkotlin/reflect/KClass;", "kotlin-reflection"}, m32268k = 2, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.b */
/* loaded from: classes.dex */
public final class C9842b {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final KClass<?> m32463a(KClassifier kClassifier) {
        InterfaceC10552e interfaceC10552e;
        KClass<?> m32464b;
        C9768m.m32346f(kClassifier, "<this>");
        if (kClassifier instanceof KClass) {
            return (KClass) kClassifier;
        }
        if (!(kClassifier instanceof KTypeParameter)) {
            throw new KotlinReflectionInternalError("Cannot calculate JVM erasure for type: " + kClassifier);
        }
        List<KType> upperBounds = ((KTypeParameter) kClassifier).getUpperBounds();
        Iterator<T> it = upperBounds.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            KType kType = (KType) next;
            C9768m.m32344d(kType, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            InterfaceC10561h mo32891w = ((KTypeImpl) kType).getF40589g().mo35993O0().mo32891w();
            interfaceC10552e = mo32891w instanceof InterfaceC10552e ? (InterfaceC10552e) mo32891w : null;
            if ((interfaceC10552e == null || interfaceC10552e.mo32878i() == EnumC10555f.INTERFACE || interfaceC10552e.mo32878i() == EnumC10555f.ANNOTATION_CLASS) ? false : true) {
                interfaceC10552e = next;
                break;
            }
        }
        KType kType2 = (KType) interfaceC10552e;
        if (kType2 == null) {
            kType2 = (KType) C10780s.m38832W(upperBounds);
        }
        return (kType2 == null || (m32464b = m32464b(kType2)) == null) ? C9757g0.m32298b(Object.class) : m32464b;
    }

    /* renamed from: b */
    public static final KClass<?> m32464b(KType kType) {
        KClass<?> m32463a;
        C9768m.m32346f(kType, "<this>");
        KClassifier mo32437c = kType.mo32437c();
        if (mo32437c != null && (m32463a = m32463a(mo32437c)) != null) {
            return m32463a;
        }
        throw new KotlinReflectionInternalError("Cannot calculate JVM erasure for type: " + kType);
    }
}
