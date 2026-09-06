package kotlin.reflect.p371y.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10749c0;
import kotlin.collections.C10770n;
import kotlin.collections.C10784u;
import kotlin.collections.C10786v;
import kotlin.jvm.C9719a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9757g0;
import kotlin.jvm.internal.C9760i;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.C9786y;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.C10703x;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10550d0;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10555f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10549d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a.C10656f;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a.C10661k;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h;
import kotlin.reflect.jvm.internal.impl.utils.C10734a;
import kotlin.reflect.p371y.internal.C9846a0;
import kotlin.reflect.p371y.internal.KDeclarationContainerImpl;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9876c;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9877d;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.EnumC9908d;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.p391c0.C10053a;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10091c;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10102n;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10079a;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10120e;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10154d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10221k;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10280w;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.C10254d;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.text.C10513u;
import kotlin.text.C10514v;
import okhttp3.HttpUrl;

/* compiled from: KClassImpl.kt */
@Metadata(m32266d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u00052\u00020\u0006:\u0001eB\u0013\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\tJ\u0013\u0010T\u001a\u00020&2\b\u0010U\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\u0016\u0010V\u001a\b\u0012\u0004\u0012\u00020W0\u00142\u0006\u0010X\u001a\u00020YH\u0016J\u0012\u0010Z\u001a\u0004\u0018\u00010[2\u0006\u0010\\\u001a\u00020]H\u0016J\u0016\u0010^\u001a\b\u0012\u0004\u0012\u00020[0\u00142\u0006\u0010X\u001a\u00020YH\u0016J\b\u0010_\u001a\u00020]H\u0016J\u0012\u0010`\u001a\u00020&2\b\u0010a\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010b\u001a\u00020cH\u0002J\b\u0010d\u001a\u00020AH\u0016R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00190\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017R3\u0010\u001b\u001a$\u0012 \u0012\u001e \u001e*\u000e\u0018\u00010\u001dR\b\u0012\u0004\u0012\u00028\u00000\u00000\u001dR\b\u0012\u0004\u0012\u00028\u00000\u00000\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010'R\u0014\u0010(\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010'R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010'R\u0014\u0010*\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010'R\u0014\u0010+\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010'R\u0014\u0010,\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010'R\u0014\u0010-\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010'R\u0014\u0010.\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010'R\u001a\u0010/\u001a\u00020&8VX\u0096\u0004¢\u0006\f\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010'R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0014\u00104\u001a\u0002058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u001e\u00108\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003090\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u0017R\u001e\u0010;\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u0017R\u0016\u0010=\u001a\u0004\u0018\u00018\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0016\u0010@\u001a\u0004\u0018\u00010A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\"\u0010D\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00040\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010\u000eR\u0016\u0010F\u001a\u0004\u0018\u00010A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010CR\u0014\u0010H\u001a\u0002058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bI\u00107R\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020K0\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010\u000eR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020N0\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010\u000eR\u0016\u0010P\u001a\u0004\u0018\u00010Q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006f"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl;", "T", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/reflect/KClass;", "Lkotlin/reflect/jvm/internal/KClassifierImpl;", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "jClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "annotations", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "getAnnotations", "()Ljava/util/List;", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "constructorDescriptors", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "()Ljava/util/Collection;", "constructors", "Lkotlin/reflect/KFunction;", "getConstructors", "data", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "kotlin.jvm.PlatformType", "getData", "()Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "isAbstract", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "isCompanion", "isData", "isFinal", "isFun", "isInner", "isOpen", "isSealed", "isValue", "isValue$annotations", "()V", "getJClass", "()Ljava/lang/Class;", "memberScope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getMemberScope$kotlin_reflection", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "members", "Lkotlin/reflect/KCallable;", "getMembers", "nestedClasses", "getNestedClasses", "objectInstance", "getObjectInstance", "()Ljava/lang/Object;", "qualifiedName", HttpUrl.FRAGMENT_ENCODE_SET, "getQualifiedName", "()Ljava/lang/String;", "sealedSubclasses", "getSealedSubclasses", "simpleName", "getSimpleName", "staticScope", "getStaticScope$kotlin_reflection", "supertypes", "Lkotlin/reflect/KType;", "getSupertypes", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "visibility", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "equals", "other", "getFunctions", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getLocalProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "index", HttpUrl.FRAGMENT_ENCODE_SET, "getProperties", "hashCode", "isInstance", "value", "reportUnresolvedClass", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "Data", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.h, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class KClassImpl<T> extends KDeclarationContainerImpl implements KClass<T>, KTypeParameterOwnerImpl {

    /* renamed from: i */
    private final Class<T> f37318i;

    /* renamed from: j */
    private final C9846a0.b<KClassImpl<T>.a> f37319j;

    /* compiled from: KClassImpl.kt */
    @Metadata(m32266d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010N\u001a\u00020<2\n\u0010O\u001a\u0006\u0012\u0002\b\u00030PH\u0002R%\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR%\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\bR%\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u000f\u0010\bR!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0014\u0010\u0015R-\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00180\u00058FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\n\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\bR%\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b\u001e\u0010\bR%\u0010 \u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\n\u001a\u0004\b!\u0010\bR%\u0010#\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\n\u001a\u0004\b$\u0010\bR\u001b\u0010&\u001a\u00020'8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\n\u001a\u0004\b(\u0010)R%\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\n\u001a\u0004\b,\u0010\bR%\u0010.\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\n\u001a\u0004\b/\u0010\bR%\u00101\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\n\u001a\u0004\b3\u0010\bR#\u00105\u001a\u0004\u0018\u00018\u00008FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b9\u0010:\u0012\u0004\b6\u0010\u001a\u001a\u0004\b7\u00108R\u001d\u0010;\u001a\u0004\u0018\u00010<8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\n\u001a\u0004\b=\u0010>R)\u0010@\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u0000020\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bB\u0010\n\u001a\u0004\bA\u0010\u0015R\u001d\u0010C\u001a\u0004\u0018\u00010<8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bE\u0010\n\u001a\u0004\bD\u0010>R!\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bI\u0010\n\u001a\u0004\bH\u0010\u0015R!\u0010J\u001a\b\u0012\u0004\u0012\u00020K0\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bM\u0010\n\u001a\u0004\bL\u0010\u0015¨\u0006Q"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "(Lkotlin/reflect/jvm/internal/KClassImpl;)V", "allMembers", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KCallableImpl;", "getAllMembers", "()Ljava/util/Collection;", "allMembers$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "allNonStaticMembers", "getAllNonStaticMembers", "allNonStaticMembers$delegate", "allStaticMembers", "getAllStaticMembers", "allStaticMembers$delegate", "annotations", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "getAnnotations", "()Ljava/util/List;", "annotations$delegate", "constructors", "Lkotlin/reflect/KFunction;", "getConstructors$annotations", "()V", "getConstructors", "constructors$delegate", "declaredMembers", "getDeclaredMembers", "declaredMembers$delegate", "declaredNonStaticMembers", "getDeclaredNonStaticMembers", "declaredNonStaticMembers$delegate", "declaredStaticMembers", "getDeclaredStaticMembers", "declaredStaticMembers$delegate", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor$delegate", "inheritedNonStaticMembers", "getInheritedNonStaticMembers", "inheritedNonStaticMembers$delegate", "inheritedStaticMembers", "getInheritedStaticMembers", "inheritedStaticMembers$delegate", "nestedClasses", "Lkotlin/reflect/KClass;", "getNestedClasses", "nestedClasses$delegate", "objectInstance", "getObjectInstance$annotations", "getObjectInstance", "()Ljava/lang/Object;", "objectInstance$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "qualifiedName", HttpUrl.FRAGMENT_ENCODE_SET, "getQualifiedName", "()Ljava/lang/String;", "qualifiedName$delegate", "sealedSubclasses", "getSealedSubclasses", "sealedSubclasses$delegate", "simpleName", "getSimpleName", "simpleName$delegate", "supertypes", "Lkotlin/reflect/KType;", "getSupertypes", "supertypes$delegate", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "typeParameters$delegate", "calculateLocalClassName", "jClass", "Ljava/lang/Class;", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.h$a */
    public final class a extends KDeclarationContainerImpl.b {

        /* renamed from: d */
        static final /* synthetic */ KProperty<Object>[] f37320d = {C9757g0.m32304h(new C9786y(C9757g0.m32298b(a.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(a.class), "annotations", "getAnnotations()Ljava/util/List;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(a.class), "simpleName", "getSimpleName()Ljava/lang/String;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(a.class), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(a.class), "constructors", "getConstructors()Ljava/util/Collection;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(a.class), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(a.class), "objectInstance", "getObjectInstance()Ljava/lang/Object;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(a.class), "typeParameters", "getTypeParameters()Ljava/util/List;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(a.class), "supertypes", "getSupertypes()Ljava/util/List;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(a.class), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(a.class), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(a.class), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(a.class), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(a.class), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(a.class), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(a.class), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(a.class), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(a.class), "allMembers", "getAllMembers()Ljava/util/Collection;"))};

        /* renamed from: e */
        private final C9846a0.a f37321e;

        /* renamed from: f */
        private final C9846a0.a f37322f;

        /* renamed from: g */
        private final C9846a0.a f37323g;

        /* renamed from: h */
        private final C9846a0.a f37324h;

        /* renamed from: i */
        private final C9846a0.a f37325i;

        /* renamed from: j */
        private final C9846a0.a f37326j;

        /* renamed from: k */
        private final C9846a0.b f37327k;

        /* renamed from: l */
        private final C9846a0.a f37328l;

        /* renamed from: m */
        private final C9846a0.a f37329m;

        /* renamed from: n */
        private final C9846a0.a f37330n;

        /* renamed from: o */
        private final C9846a0.a f37331o;

        /* renamed from: p */
        private final C9846a0.a f37332p;

        /* renamed from: q */
        private final C9846a0.a f37333q;

        /* renamed from: r */
        private final C9846a0.a f37334r;

        /* renamed from: s */
        private final C9846a0.a f37335s;

        /* renamed from: t */
        private final C9846a0.a f37336t;

        /* renamed from: u */
        private final C9846a0.a f37337u;

        /* renamed from: v */
        private final C9846a0.a f37338v;

        /* compiled from: KClassImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002 \u0003*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.h$a$a, reason: collision with other inner class name */
        static final class C11491a extends Lambda implements Function0<List<? extends KCallableImpl<?>>> {

            /* renamed from: f */
            final /* synthetic */ KClassImpl<T>.a f37340f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11491a(KClassImpl<T>.a aVar) {
                super(0);
                this.f37340f = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends KCallableImpl<?>> invoke() {
                return C10749c0.m38609o0(this.f37340f.m32592g(), this.f37340f.m32593h());
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002 \u0003*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.h$a$b */
        static final class b extends Lambda implements Function0<List<? extends KCallableImpl<?>>> {

            /* renamed from: f */
            final /* synthetic */ KClassImpl<T>.a f37341f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(KClassImpl<T>.a aVar) {
                super(0);
                this.f37341f = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends KCallableImpl<?>> invoke() {
                return C10749c0.m38609o0(this.f37341f.m32596k(), this.f37341f.m32590n());
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002 \u0003*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.h$a$c */
        static final class c extends Lambda implements Function0<List<? extends KCallableImpl<?>>> {

            /* renamed from: f */
            final /* synthetic */ KClassImpl<T>.a f37342f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(KClassImpl<T>.a aVar) {
                super(0);
                this.f37342f = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends KCallableImpl<?>> invoke() {
                return C10749c0.m38609o0(this.f37342f.m32589l(), this.f37342f.m32591o());
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.h$a$d */
        static final class d extends Lambda implements Function0<List<? extends Annotation>> {

            /* renamed from: f */
            final /* synthetic */ KClassImpl<T>.a f37343f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(KClassImpl<T>.a aVar) {
                super(0);
                this.f37343f = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends Annotation> invoke() {
                return C9858g0.m32560e(this.f37343f.m32597m());
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002 \u0004*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/KFunction;", "T", "kotlin.jvm.PlatformType", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.h$a$e */
        static final class e extends Lambda implements Function0<List<? extends KFunction<? extends T>>> {

            /* renamed from: f */
            final /* synthetic */ KClassImpl<T> f37344f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(KClassImpl<T> kClassImpl) {
                super(0);
                this.f37344f = kClassImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<KFunction<T>> invoke() {
                Collection<InterfaceC10573l> mo32487A = this.f37344f.mo32487A();
                KClassImpl<T> kClassImpl = this.f37344f;
                ArrayList arrayList = new ArrayList(C10786v.m38911u(mo32487A, 10));
                Iterator<T> it = mo32487A.iterator();
                while (it.hasNext()) {
                    arrayList.add(new KFunctionImpl(kClassImpl, (InterfaceC10573l) it.next()));
                }
                return arrayList;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002 \u0003*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.h$a$f */
        static final class f extends Lambda implements Function0<List<? extends KCallableImpl<?>>> {

            /* renamed from: f */
            final /* synthetic */ KClassImpl<T>.a f37345f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(KClassImpl<T>.a aVar) {
                super(0);
                this.f37345f = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends KCallableImpl<?>> invoke() {
                return C10749c0.m38609o0(this.f37345f.m32596k(), this.f37345f.m32589l());
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002 \u0003*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.h$a$g */
        static final class g extends Lambda implements Function0<Collection<? extends KCallableImpl<?>>> {

            /* renamed from: f */
            final /* synthetic */ KClassImpl<T> f37346f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(KClassImpl<T> kClassImpl) {
                super(0);
                this.f37346f = kClassImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Collection<KCallableImpl<?>> invoke() {
                KClassImpl<T> kClassImpl = this.f37346f;
                return kClassImpl.m32619D(kClassImpl.m32582S(), KDeclarationContainerImpl.c.DECLARED);
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002 \u0003*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.h$a$h */
        static final class h extends Lambda implements Function0<Collection<? extends KCallableImpl<?>>> {

            /* renamed from: f */
            final /* synthetic */ KClassImpl<T> f37347f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(KClassImpl<T> kClassImpl) {
                super(0);
                this.f37347f = kClassImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Collection<KCallableImpl<?>> invoke() {
                KClassImpl<T> kClassImpl = this.f37347f;
                return kClassImpl.m32619D(kClassImpl.m32583T(), KDeclarationContainerImpl.c.DECLARED);
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m32267d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.h$a$i */
        static final class i extends Lambda implements Function0<InterfaceC10552e> {

            /* renamed from: f */
            final /* synthetic */ KClassImpl<T> f37348f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            i(KClassImpl<T> kClassImpl) {
                super(0);
                this.f37348f = kClassImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final InterfaceC10552e invoke() {
                C10126b m32577O = this.f37348f.m32577O();
                C10661k m32628a = this.f37348f.m32580Q().invoke().m32628a();
                InterfaceC10552e m36417b = m32577O.m35416k() ? m32628a.m38031a().m36417b(m32577O) : C10703x.m38149a(m32628a.m38032b(), m32577O);
                if (m36417b != null) {
                    return m36417b;
                }
                this.f37348f.m32578U();
                throw null;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002 \u0003*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.h$a$j */
        static final class j extends Lambda implements Function0<Collection<? extends KCallableImpl<?>>> {

            /* renamed from: f */
            final /* synthetic */ KClassImpl<T> f37349f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(KClassImpl<T> kClassImpl) {
                super(0);
                this.f37349f = kClassImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Collection<KCallableImpl<?>> invoke() {
                KClassImpl<T> kClassImpl = this.f37349f;
                return kClassImpl.m32619D(kClassImpl.m32582S(), KDeclarationContainerImpl.c.INHERITED);
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002 \u0003*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.h$a$k */
        static final class k extends Lambda implements Function0<Collection<? extends KCallableImpl<?>>> {

            /* renamed from: f */
            final /* synthetic */ KClassImpl<T> f37350f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            k(KClassImpl<T> kClassImpl) {
                super(0);
                this.f37350f = kClassImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Collection<KCallableImpl<?>> invoke() {
                KClassImpl<T> kClassImpl = this.f37350f;
                return kClassImpl.m32619D(kClassImpl.m32583T(), KDeclarationContainerImpl.c.INHERITED);
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a6\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0002 \u0004*\u001a\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003H\n¢\u0006\u0002\b\u0006"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KClassImpl;", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin.jvm.PlatformType", "T", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.h$a$l */
        static final class l extends Lambda implements Function0<List<? extends KClassImpl<? extends Object>>> {

            /* renamed from: f */
            final /* synthetic */ KClassImpl<T>.a f37351f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            l(KClassImpl<T>.a aVar) {
                super(0);
                this.f37351f = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends KClassImpl<? extends Object>> invoke() {
                InterfaceC10218h mo33348y0 = this.f37351f.m32597m().mo33348y0();
                C9768m.m32345e(mo33348y0, "descriptor.unsubstitutedInnerClassesScope");
                Collection m36162a = InterfaceC10221k.a.m36162a(mo33348y0, null, null, 3, null);
                ArrayList<InterfaceC10576m> arrayList = new ArrayList();
                for (T t : m36162a) {
                    if (!C10154d.m35801B((InterfaceC10576m) t)) {
                        arrayList.add(t);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (InterfaceC10576m interfaceC10576m : arrayList) {
                    InterfaceC10552e interfaceC10552e = interfaceC10576m instanceof InterfaceC10552e ? (InterfaceC10552e) interfaceC10576m : null;
                    Class<?> m32571p = interfaceC10552e != null ? C9858g0.m32571p(interfaceC10552e) : null;
                    KClassImpl kClassImpl = m32571p != null ? new KClassImpl(m32571p) : null;
                    if (kClassImpl != null) {
                        arrayList2.add(kClassImpl);
                    }
                }
                return arrayList2;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(m32266d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m32267d2 = {"<anonymous>", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke", "()Ljava/lang/Object;"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.h$a$m */
        static final class m extends Lambda implements Function0<T> {

            /* renamed from: f */
            final /* synthetic */ KClassImpl<T>.a f37352f;

            /* renamed from: g */
            final /* synthetic */ KClassImpl<T> f37353g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            m(KClassImpl<T>.a aVar, KClassImpl<T> kClassImpl) {
                super(0);
                this.f37352f = aVar;
                this.f37353g = kClassImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                InterfaceC10552e m32597m = this.f37352f.m32597m();
                if (m32597m.mo32878i() != EnumC10555f.OBJECT) {
                    return null;
                }
                T t = (T) ((!m32597m.mo32857A() || C9877d.m32702a(C9876c.f37450a, m32597m)) ? this.f37353g.mo32283a().getDeclaredField("INSTANCE") : this.f37353g.mo32283a().getEnclosingClass().getDeclaredField(m32597m.getName().m35455k())).get(null);
                C9768m.m32344d(t, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl");
                return t;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.h$a$n */
        static final class n extends Lambda implements Function0<String> {

            /* renamed from: f */
            final /* synthetic */ KClassImpl<T> f37354f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            n(KClassImpl<T> kClassImpl) {
                super(0);
                this.f37354f = kClassImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                if (this.f37354f.mo32283a().isAnonymousClass()) {
                    return null;
                }
                C10126b m32577O = this.f37354f.m32577O();
                if (m32577O.m35416k()) {
                    return null;
                }
                return m32577O.m35409b().m35420b();
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00030\u0002 \u0004*\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KClassImpl;", "T", "kotlin.jvm.PlatformType", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.h$a$o */
        static final class o extends Lambda implements Function0<List<? extends KClassImpl<? extends T>>> {

            /* renamed from: f */
            final /* synthetic */ KClassImpl<T>.a f37355f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            o(KClassImpl<T>.a aVar) {
                super(0);
                this.f37355f = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<KClassImpl<? extends T>> invoke() {
                Collection<InterfaceC10552e> mo32861J = this.f37355f.m32597m().mo32861J();
                C9768m.m32345e(mo32861J, "descriptor.sealedSubclasses");
                ArrayList arrayList = new ArrayList();
                for (InterfaceC10552e interfaceC10552e : mo32861J) {
                    C9768m.m32344d(interfaceC10552e, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    Class<?> m32571p = C9858g0.m32571p(interfaceC10552e);
                    KClassImpl kClassImpl = m32571p != null ? new KClassImpl(m32571p) : null;
                    if (kClassImpl != null) {
                        arrayList.add(kClassImpl);
                    }
                }
                return arrayList;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.h$a$p */
        static final class p extends Lambda implements Function0<String> {

            /* renamed from: f */
            final /* synthetic */ KClassImpl<T> f37356f;

            /* renamed from: g */
            final /* synthetic */ KClassImpl<T>.a f37357g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            p(KClassImpl<T> kClassImpl, KClassImpl<T>.a aVar) {
                super(0);
                this.f37356f = kClassImpl;
                this.f37357g = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                if (this.f37356f.mo32283a().isAnonymousClass()) {
                    return null;
                }
                C10126b m32577O = this.f37356f.m32577O();
                if (m32577O.m35416k()) {
                    return this.f37357g.m32588f(this.f37356f.mo32283a());
                }
                String m35455k = m32577O.m35415j().m35455k();
                C9768m.m32345e(m35455k, "classId.shortClassName.asString()");
                return m35455k;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KTypeImpl;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.h$a$q */
        static final class q extends Lambda implements Function0<List<? extends KTypeImpl>> {

            /* renamed from: f */
            final /* synthetic */ KClassImpl<T>.a f37358f;

            /* renamed from: g */
            final /* synthetic */ KClassImpl<T> f37359g;

            /* compiled from: KClassImpl.kt */
            @Metadata(m32266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m32267d2 = {"<anonymous>", "Ljava/lang/reflect/Type;", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
            /* renamed from: kotlin.f0.y.e.h$a$q$a, reason: collision with other inner class name */
            static final class C11492a extends Lambda implements Function0<Type> {

                /* renamed from: f */
                final /* synthetic */ AbstractC10311e0 f37360f;

                /* renamed from: g */
                final /* synthetic */ KClassImpl<T>.a f37361g;

                /* renamed from: h */
                final /* synthetic */ KClassImpl<T> f37362h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C11492a(AbstractC10311e0 abstractC10311e0, KClassImpl<T>.a aVar, KClassImpl<T> kClassImpl) {
                    super(0);
                    this.f37360f = abstractC10311e0;
                    this.f37361g = aVar;
                    this.f37362h = kClassImpl;
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Type invoke() {
                    InterfaceC10561h mo32891w = this.f37360f.mo35993O0().mo32891w();
                    if (!(mo32891w instanceof InterfaceC10552e)) {
                        throw new KotlinReflectionInternalError("Supertype not a class: " + mo32891w);
                    }
                    Class<?> m32571p = C9858g0.m32571p((InterfaceC10552e) mo32891w);
                    if (m32571p == null) {
                        throw new KotlinReflectionInternalError("Unsupported superclass of " + this.f37361g + ": " + mo32891w);
                    }
                    if (C9768m.m32341a(this.f37362h.mo32283a().getSuperclass(), m32571p)) {
                        Type genericSuperclass = this.f37362h.mo32283a().getGenericSuperclass();
                        C9768m.m32345e(genericSuperclass, "{\n                      …ass\n                    }");
                        return genericSuperclass;
                    }
                    Class<?>[] interfaces = this.f37362h.mo32283a().getInterfaces();
                    C9768m.m32345e(interfaces, "jClass.interfaces");
                    int m38725E = C10770n.m38725E(interfaces, m32571p);
                    if (m38725E >= 0) {
                        Type type = this.f37362h.mo32283a().getGenericInterfaces()[m38725E];
                        C9768m.m32345e(type, "{\n                      …ex]\n                    }");
                        return type;
                    }
                    throw new KotlinReflectionInternalError("No superclass of " + this.f37361g + " in Java reflection for " + mo32891w);
                }
            }

            /* compiled from: KClassImpl.kt */
            @Metadata(m32266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m32267d2 = {"<anonymous>", "Ljava/lang/reflect/Type;", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
            /* renamed from: kotlin.f0.y.e.h$a$q$b */
            static final class b extends Lambda implements Function0<Type> {

                /* renamed from: f */
                public static final b f37363f = new b();

                b() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Type invoke() {
                    return Object.class;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            q(KClassImpl<T>.a aVar, KClassImpl<T> kClassImpl) {
                super(0);
                this.f37358f = aVar;
                this.f37359g = kClassImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends KTypeImpl> invoke() {
                Collection<AbstractC10311e0> mo35998a = this.f37358f.m32597m().mo32877h().mo35998a();
                C9768m.m32345e(mo35998a, "descriptor.typeConstructor.supertypes");
                ArrayList arrayList = new ArrayList(mo35998a.size());
                KClassImpl<T>.a aVar = this.f37358f;
                KClassImpl<T> kClassImpl = this.f37359g;
                for (AbstractC10311e0 abstractC10311e0 : mo35998a) {
                    C9768m.m32345e(abstractC10311e0, "kotlinType");
                    arrayList.add(new KTypeImpl(abstractC10311e0, new C11492a(abstractC10311e0, aVar, kClassImpl)));
                }
                if (!AbstractC9881h.m32759t0(this.f37358f.m32597m())) {
                    boolean z = false;
                    if (!arrayList.isEmpty()) {
                        Iterator<T> it = arrayList.iterator();
                        while (it.hasNext()) {
                            EnumC10555f mo32878i = C10154d.m35817e(((KTypeImpl) it.next()).getF40589g()).mo32878i();
                            C9768m.m32345e(mo32878i, "getClassDescriptorForType(it.type).kind");
                            if (!(mo32878i == EnumC10555f.INTERFACE || mo32878i == EnumC10555f.ANNOTATION_CLASS)) {
                                break;
                            }
                        }
                    }
                    z = true;
                    if (z) {
                        AbstractC10335m0 m32791i = C10202a.m36072f(this.f37358f.m32597m()).m32791i();
                        C9768m.m32345e(m32791i, "descriptor.builtIns.anyType");
                        arrayList.add(new KTypeImpl(m32791i, b.f37363f));
                    }
                }
                return C10734a.m38510c(arrayList);
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.h$a$r */
        static final class r extends Lambda implements Function0<List<? extends KTypeParameterImpl>> {

            /* renamed from: f */
            final /* synthetic */ KClassImpl<T>.a f37364f;

            /* renamed from: g */
            final /* synthetic */ KClassImpl<T> f37365g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            r(KClassImpl<T>.a aVar, KClassImpl<T> kClassImpl) {
                super(0);
                this.f37364f = aVar;
                this.f37365g = kClassImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends KTypeParameterImpl> invoke() {
                List<InterfaceC10554e1> mo32884w = this.f37364f.m32597m().mo32884w();
                C9768m.m32345e(mo32884w, "descriptor.declaredTypeParameters");
                KClassImpl<T> kClassImpl = this.f37365g;
                ArrayList arrayList = new ArrayList(C10786v.m38911u(mo32884w, 10));
                for (InterfaceC10554e1 interfaceC10554e1 : mo32884w) {
                    C9768m.m32345e(interfaceC10554e1, "descriptor");
                    arrayList.add(new KTypeParameterImpl(kClassImpl, interfaceC10554e1));
                }
                return arrayList;
            }
        }

        public a() {
            super();
            this.f37321e = C9846a0.m32480d(new i(KClassImpl.this));
            this.f37322f = C9846a0.m32480d(new d(this));
            this.f37323g = C9846a0.m32480d(new p(KClassImpl.this, this));
            this.f37324h = C9846a0.m32480d(new n(KClassImpl.this));
            this.f37325i = C9846a0.m32480d(new e(KClassImpl.this));
            this.f37326j = C9846a0.m32480d(new l(this));
            this.f37327k = C9846a0.m32478b(new m(this, KClassImpl.this));
            this.f37328l = C9846a0.m32480d(new r(this, KClassImpl.this));
            this.f37329m = C9846a0.m32480d(new q(this, KClassImpl.this));
            this.f37330n = C9846a0.m32480d(new o(this));
            this.f37331o = C9846a0.m32480d(new g(KClassImpl.this));
            this.f37332p = C9846a0.m32480d(new h(KClassImpl.this));
            this.f37333q = C9846a0.m32480d(new j(KClassImpl.this));
            this.f37334r = C9846a0.m32480d(new k(KClassImpl.this));
            this.f37335s = C9846a0.m32480d(new b(this));
            this.f37336t = C9846a0.m32480d(new c(this));
            this.f37337u = C9846a0.m32480d(new f(this));
            this.f37338v = C9846a0.m32480d(new C11491a(this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public final String m32588f(Class<?> cls) {
            String m37531F0;
            String m37533G0;
            String m37533G02;
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                C9768m.m32345e(simpleName, "name");
                m37533G02 = C10514v.m37533G0(simpleName, enclosingMethod.getName() + '$', null, 2, null);
                return m37533G02;
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor == null) {
                C9768m.m32345e(simpleName, "name");
                m37531F0 = C10514v.m37531F0(simpleName, '$', null, 2, null);
                return m37531F0;
            }
            C9768m.m32345e(simpleName, "name");
            m37533G0 = C10514v.m37533G0(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
            return m37533G0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public final Collection<KCallableImpl<?>> m32589l() {
            T m32484c = this.f37332p.m32484c(this, f37320d[11]);
            C9768m.m32345e(m32484c, "<get-declaredStaticMembers>(...)");
            return (Collection) m32484c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public final Collection<KCallableImpl<?>> m32590n() {
            T m32484c = this.f37333q.m32484c(this, f37320d[12]);
            C9768m.m32345e(m32484c, "<get-inheritedNonStaticMembers>(...)");
            return (Collection) m32484c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public final Collection<KCallableImpl<?>> m32591o() {
            T m32484c = this.f37334r.m32484c(this, f37320d[13]);
            C9768m.m32345e(m32484c, "<get-inheritedStaticMembers>(...)");
            return (Collection) m32484c;
        }

        /* renamed from: g */
        public final Collection<KCallableImpl<?>> m32592g() {
            T m32484c = this.f37335s.m32484c(this, f37320d[14]);
            C9768m.m32345e(m32484c, "<get-allNonStaticMembers>(...)");
            return (Collection) m32484c;
        }

        /* renamed from: h */
        public final Collection<KCallableImpl<?>> m32593h() {
            T m32484c = this.f37336t.m32484c(this, f37320d[15]);
            C9768m.m32345e(m32484c, "<get-allStaticMembers>(...)");
            return (Collection) m32484c;
        }

        /* renamed from: i */
        public final List<Annotation> m32594i() {
            T m32484c = this.f37322f.m32484c(this, f37320d[1]);
            C9768m.m32345e(m32484c, "<get-annotations>(...)");
            return (List) m32484c;
        }

        /* renamed from: j */
        public final Collection<KFunction<T>> m32595j() {
            T m32484c = this.f37325i.m32484c(this, f37320d[4]);
            C9768m.m32345e(m32484c, "<get-constructors>(...)");
            return (Collection) m32484c;
        }

        /* renamed from: k */
        public final Collection<KCallableImpl<?>> m32596k() {
            T m32484c = this.f37331o.m32484c(this, f37320d[10]);
            C9768m.m32345e(m32484c, "<get-declaredNonStaticMembers>(...)");
            return (Collection) m32484c;
        }

        /* renamed from: m */
        public final InterfaceC10552e m32597m() {
            T m32484c = this.f37321e.m32484c(this, f37320d[0]);
            C9768m.m32345e(m32484c, "<get-descriptor>(...)");
            return (InterfaceC10552e) m32484c;
        }

        /* renamed from: p */
        public final T m32598p() {
            return this.f37327k.m32484c(this, f37320d[6]);
        }

        /* renamed from: q */
        public final String m32599q() {
            return (String) this.f37324h.m32484c(this, f37320d[3]);
        }

        /* renamed from: r */
        public final String m32600r() {
            return (String) this.f37323g.m32484c(this, f37320d[2]);
        }
    }

    /* compiled from: KClassImpl.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.h$b */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37366a;

        static {
            int[] iArr = new int[C10053a.a.values().length];
            iArr[C10053a.a.FILE_FACADE.ordinal()] = 1;
            iArr[C10053a.a.MULTIFILE_CLASS.ordinal()] = 2;
            iArr[C10053a.a.MULTIFILE_CLASS_PART.ordinal()] = 3;
            iArr[C10053a.a.SYNTHETIC_CLASS.ordinal()] = 4;
            iArr[C10053a.a.UNKNOWN.ordinal()] = 5;
            iArr[C10053a.a.CLASS.ordinal()] = 6;
            f37366a = iArr;
        }
    }

    /* compiled from: KClassImpl.kt */
    @Metadata(m32266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u001e \u0004*\u000e\u0018\u00010\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\b\b\u0000\u0010\u0003*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m32267d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "Lkotlin/reflect/jvm/internal/KClassImpl;", "T", "kotlin.jvm.PlatformType", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.h$c */
    static final class c extends Lambda implements Function0<KClassImpl<T>.a> {

        /* renamed from: f */
        final /* synthetic */ KClassImpl<T> f37367f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(KClassImpl<T> kClassImpl) {
            super(0);
            this.f37367f = kClassImpl;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final KClassImpl<T>.a invoke() {
            return this.f37367f.new a();
        }
    }

    /* compiled from: KClassImpl.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.h$d */
    /* synthetic */ class d extends C9760i implements Function2<C10280w, C10102n, InterfaceC10696t0> {

        /* renamed from: h */
        public static final d f37368h = new d();

        d() {
            super(2);
        }

        @Override // kotlin.jvm.internal.AbstractC9748c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getF40571m() {
            return "loadProperty";
        }

        @Override // kotlin.jvm.internal.AbstractC9748c
        public final KDeclarationContainer getOwner() {
            return C9757g0.m32298b(C10280w.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9748c
        public final String getSignature() {
            return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10696t0 invoke(C10280w c10280w, C10102n c10102n) {
            C9768m.m32346f(c10280w, "p0");
            C9768m.m32346f(c10102n, "p1");
            return c10280w.m36488l(c10102n);
        }
    }

    public KClassImpl(Class<T> cls) {
        C9768m.m32346f(cls, "jClass");
        this.f37318i = cls;
        C9846a0.b<KClassImpl<T>.a> m32478b = C9846a0.m32478b(new c(this));
        C9768m.m32345e(m32478b, "lazy { Data() }");
        this.f37319j = m32478b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public final C10126b m32577O() {
        return RuntimeTypeMapper.f37288a.m32519c(mo32283a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public final Void m32578U() {
        C10053a mo34025a;
        C10656f m38026a = C10656f.f41143a.m38026a(mo32283a());
        C10053a.a m33913c = (m38026a == null || (mo34025a = m38026a.mo34025a()) == null) ? null : mo34025a.m33913c();
        switch (m33913c == null ? -1 : b.f37366a[m33913c.ordinal()]) {
            case -1:
            case 6:
                throw new KotlinReflectionInternalError("Unresolved class: " + mo32283a());
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 3:
                throw new UnsupportedOperationException("Packages and file facades are not yet supported in Kotlin reflection. Meanwhile please use Java reflection to inspect this class: " + mo32283a());
            case 4:
                throw new UnsupportedOperationException("This class is an internal synthetic class generated by the Kotlin compiler, such as an anonymous class for a lambda, a SAM wrapper, a callable reference, etc. It's not a Kotlin class or interface, so the reflection library has no idea what declarations it has. Please use Java reflection to inspect this class: " + mo32283a());
            case 5:
                throw new KotlinReflectionInternalError("Unknown class: " + mo32283a() + " (kind = " + m33913c + ')');
        }
    }

    @Override // kotlin.reflect.p371y.internal.KDeclarationContainerImpl
    /* renamed from: A */
    public Collection<InterfaceC10573l> mo32487A() {
        InterfaceC10552e m32581R = m32581R();
        if (m32581R.mo32878i() == EnumC10555f.INTERFACE || m32581R.mo32878i() == EnumC10555f.OBJECT) {
            return C10784u.m38888j();
        }
        Collection<InterfaceC10549d> mo32880k = m32581R.mo32880k();
        C9768m.m32345e(mo32880k, "descriptor.constructors");
        return mo32880k;
    }

    @Override // kotlin.reflect.p371y.internal.KDeclarationContainerImpl
    /* renamed from: B */
    public Collection<InterfaceC10705y> mo32488B(C10130f c10130f) {
        C9768m.m32346f(c10130f, "name");
        InterfaceC10218h m32582S = m32582S();
        EnumC9908d enumC9908d = EnumC9908d.FROM_REFLECTION;
        return C10749c0.m38609o0(m32582S.mo33311a(c10130f, enumC9908d), m32583T().mo33311a(c10130f, enumC9908d));
    }

    @Override // kotlin.reflect.p371y.internal.KDeclarationContainerImpl
    /* renamed from: C */
    public InterfaceC10696t0 mo32489C(int i2) {
        Class<?> declaringClass;
        if (C9768m.m32341a(mo32283a().getSimpleName(), "DefaultImpls") && (declaringClass = mo32283a().getDeclaringClass()) != null && declaringClass.isInterface()) {
            KClass m32279e = C9719a.m32279e(declaringClass);
            C9768m.m32344d(m32279e, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            return ((KClassImpl) m32279e).mo32489C(i2);
        }
        InterfaceC10552e m32581R = m32581R();
        C10254d c10254d = m32581R instanceof C10254d ? (C10254d) m32581R : null;
        if (c10254d == null) {
            return null;
        }
        C10091c m36283c1 = c10254d.m36283c1();
        AbstractC10716h.f<C10091c, List<C10102n>> fVar = C10079a.f38500j;
        C9768m.m32345e(fVar, "classLocalVariable");
        C10102n c10102n = (C10102n) C10120e.m35381b(m36283c1, fVar, i2);
        if (c10102n != null) {
            return (InterfaceC10696t0) C9858g0.m32563h(mo32283a(), c10102n, c10254d.m36282b1().m36456g(), c10254d.m36282b1().m36459j(), c10254d.m36284e1(), d.f37368h);
        }
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.KDeclarationContainerImpl
    /* renamed from: F */
    public Collection<InterfaceC10696t0> mo32490F(C10130f c10130f) {
        C9768m.m32346f(c10130f, "name");
        InterfaceC10218h m32582S = m32582S();
        EnumC9908d enumC9908d = EnumC9908d.FROM_REFLECTION;
        return C10749c0.m38609o0(m32582S.mo33313c(c10130f, enumC9908d), m32583T().mo33313c(c10130f, enumC9908d));
    }

    /* renamed from: P */
    public Collection<KFunction<T>> m32579P() {
        return this.f37319j.invoke().m32595j();
    }

    /* renamed from: Q */
    public final C9846a0.b<KClassImpl<T>.a> m32580Q() {
        return this.f37319j;
    }

    /* renamed from: R */
    public InterfaceC10552e m32581R() {
        return this.f37319j.invoke().m32597m();
    }

    /* renamed from: S */
    public final InterfaceC10218h m32582S() {
        return m32581R().mo36400s().mo33553q();
    }

    /* renamed from: T */
    public final InterfaceC10218h m32583T() {
        InterfaceC10218h mo32866S = m32581R().mo32866S();
        C9768m.m32345e(mo32866S, "descriptor.staticScope");
        return mo32866S;
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    /* renamed from: a */
    public Class<T> mo32283a() {
        return this.f37318i;
    }

    public boolean equals(Object other) {
        return (other instanceof KClassImpl) && C9768m.m32341a(C9719a.m32277c(this), C9719a.m32277c((KClass) other));
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public List<Annotation> getAnnotations() {
        return this.f37319j.invoke().m32594i();
    }

    public int hashCode() {
        return C9719a.m32277c(this).hashCode();
    }

    @Override // kotlin.reflect.KClass
    public boolean isAbstract() {
        return m32581R().mo32879j() == EnumC10550d0.ABSTRACT;
    }

    @Override // kotlin.reflect.KClass
    /* renamed from: l */
    public boolean mo32287l() {
        return m32581R().mo32881l();
    }

    @Override // kotlin.reflect.KClass
    /* renamed from: m */
    public boolean mo32288m() {
        return m32581R().mo32882m();
    }

    @Override // kotlin.reflect.KClass
    /* renamed from: o */
    public boolean mo32289o() {
        return m32581R().mo32879j() == EnumC10550d0.SEALED;
    }

    @Override // kotlin.reflect.KClass
    /* renamed from: p */
    public String mo32290p() {
        return this.f37319j.invoke().m32599q();
    }

    @Override // kotlin.reflect.KClass
    /* renamed from: q */
    public String mo32291q() {
        return this.f37319j.invoke().m32600r();
    }

    @Override // kotlin.reflect.KClass
    /* renamed from: r */
    public T mo32292r() {
        return this.f37319j.invoke().m32598p();
    }

    public String toString() {
        String str;
        String m37524z;
        StringBuilder sb = new StringBuilder();
        sb.append("class ");
        C10126b m32577O = m32577O();
        C10127c m35413h = m32577O.m35413h();
        C9768m.m32345e(m35413h, "classId.packageFqName");
        if (m35413h.m35422d()) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str = m35413h.m35420b() + '.';
        }
        String m35420b = m32577O.m35414i().m35420b();
        C9768m.m32345e(m35420b, "classId.relativeClassName.asString()");
        m37524z = C10513u.m37524z(m35420b, '.', '$', false, 4, null);
        sb.append(str + m37524z);
        return sb.toString();
    }
}
