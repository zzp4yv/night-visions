package kotlin.reflect.p371y.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C10762j;
import kotlin.collections.C10780s;
import kotlin.collections.C10786v;
import kotlin.collections.C10792y;
import kotlin.comparisons.C10806b;
import kotlin.coroutines.Continuation;
import kotlin.jvm.C9719a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KCallable;
import kotlin.reflect.KParameter;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVisibility;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10697u;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10550d0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10645q0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10702w0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y;
import kotlin.reflect.p371y.C9842b;
import kotlin.reflect.p371y.C9843c;
import kotlin.reflect.p371y.internal.C9846a0;
import kotlin.reflect.p371y.internal.calls.Caller;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.InterfaceC9942a;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import okhttp3.HttpUrl;

/* compiled from: KCallableImpl.kt */
@Metadata(m32266d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J%\u00106\u001a\u00028\u00002\u0016\u00107\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010908\"\u0004\u0018\u000109H\u0016¢\u0006\u0002\u0010:J#\u0010;\u001a\u00028\u00002\u0014\u00107\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u0001090<H\u0002¢\u0006\u0002\u0010=J#\u0010>\u001a\u00028\u00002\u0014\u00107\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u0001090<H\u0016¢\u0006\u0002\u0010=J3\u0010?\u001a\u00028\u00002\u0014\u00107\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u0001090<2\f\u0010@\u001a\b\u0012\u0002\b\u0003\u0018\u00010AH\u0000¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u0002092\u0006\u0010E\u001a\u00020,H\u0002J\n\u0010F\u001a\u0004\u0018\u00010GH\u0002R(\u0010\u0005\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \t*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\n\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\f \t*\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\u000b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u000e0\u000e0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u000f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0010 \t*\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00070\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0018\u001a\u00020\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017R\u0012\u0010\u001e\u001a\u00020\u001fX¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010$R\u0014\u0010%\u001a\u00020#8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b%\u0010$R\u0012\u0010&\u001a\u00020#X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0014\u0010'\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010$R\u0014\u0010(\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010$R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\f0\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0013R\u0014\u0010+\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0013R\u0016\u00102\u001a\u0004\u0018\u0001038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u0006H"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/KCallableImpl;", "R", "Lkotlin/reflect/KCallable;", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "()V", "_annotations", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "kotlin.jvm.PlatformType", "_parameters", "Ljava/util/ArrayList;", "Lkotlin/reflect/KParameter;", "_returnType", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "_typeParameters", "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "annotations", "getAnnotations", "()Ljava/util/List;", "caller", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "defaultCaller", "getDefaultCaller", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;", "isAbstract", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "isAnnotationConstructor", "isBound", "isFinal", "isOpen", "parameters", "getParameters", "returnType", "Lkotlin/reflect/KType;", "getReturnType", "()Lkotlin/reflect/KType;", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "visibility", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "call", "args", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "([Ljava/lang/Object;)Ljava/lang/Object;", "callAnnotationConstructor", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/util/Map;)Ljava/lang/Object;", "callBy", "callDefaultMethod", "continuationArgument", "Lkotlin/coroutines/Continuation;", "callDefaultMethod$kotlin_reflection", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "defaultEmptyArray", "type", "extractContinuationArgument", "Ljava/lang/reflect/Type;", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.f, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public abstract class KCallableImpl<R> implements KCallable<R>, KTypeParameterOwnerImpl {

    /* renamed from: f */
    private final C9846a0.a<List<Annotation>> f37302f;

    /* renamed from: g */
    private final C9846a0.a<ArrayList<KParameter>> f37303g;

    /* renamed from: h */
    private final C9846a0.a<KTypeImpl> f37304h;

    /* renamed from: i */
    private final C9846a0.a<List<KTypeParameterImpl>> f37305i;

    /* compiled from: KCallableImpl.kt */
    @Metadata(m32266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0004 \u0001H\n¢\u0006\u0002\b\u0005"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "kotlin.jvm.PlatformType", "R", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.f$a */
    static final class a extends Lambda implements Function0<List<? extends Annotation>> {

        /* renamed from: f */
        final /* synthetic */ KCallableImpl<R> f37306f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(KCallableImpl<? extends R> kCallableImpl) {
            super(0);
            this.f37306f = kCallableImpl;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Annotation> invoke() {
            return C9858g0.m32560e(this.f37306f.mo37304F());
        }
    }

    /* compiled from: KCallableImpl.kt */
    @Metadata(m32266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0004 \u0001H\n¢\u0006\u0002\b\u0005"}, m32267d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lkotlin/reflect/KParameter;", "kotlin.jvm.PlatformType", "R", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.f$b */
    static final class b extends Lambda implements Function0<ArrayList<KParameter>> {

        /* renamed from: f */
        final /* synthetic */ KCallableImpl<R> f37307f;

        /* compiled from: KCallableImpl.kt */
        @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, m32267d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/ParameterDescriptor;", "R", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.f$b$a */
        static final class a extends Lambda implements Function0<InterfaceC10645q0> {

            /* renamed from: f */
            final /* synthetic */ InterfaceC10702w0 f37308f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC10702w0 interfaceC10702w0) {
                super(0);
                this.f37308f = interfaceC10702w0;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final InterfaceC10645q0 invoke() {
                return this.f37308f;
            }
        }

        /* compiled from: KCallableImpl.kt */
        @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, m32267d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/ParameterDescriptor;", "R", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.f$b$b, reason: collision with other inner class name */
        static final class C11490b extends Lambda implements Function0<InterfaceC10645q0> {

            /* renamed from: f */
            final /* synthetic */ InterfaceC10702w0 f37309f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11490b(InterfaceC10702w0 interfaceC10702w0) {
                super(0);
                this.f37309f = interfaceC10702w0;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final InterfaceC10645q0 invoke() {
                return this.f37309f;
            }
        }

        /* compiled from: KCallableImpl.kt */
        @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, m32267d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/ParameterDescriptor;", "R", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.f$b$c */
        static final class c extends Lambda implements Function0<InterfaceC10645q0> {

            /* renamed from: f */
            final /* synthetic */ InterfaceC10543b f37310f;

            /* renamed from: g */
            final /* synthetic */ int f37311g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(InterfaceC10543b interfaceC10543b, int i2) {
                super(0);
                this.f37310f = interfaceC10543b;
                this.f37311g = i2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final InterfaceC10645q0 invoke() {
                InterfaceC10566i1 interfaceC10566i1 = this.f37310f.mo37028f().get(this.f37311g);
                C9768m.m32345e(interfaceC10566i1, "descriptor.valueParameters[i]");
                return interfaceC10566i1;
            }
        }

        /* compiled from: Comparisons.kt */
        @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.f$b$d */
        public static final class d<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int m39017a;
                m39017a = C10806b.m39017a(((KParameter) t).getName(), ((KParameter) t2).getName());
                return m39017a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(KCallableImpl<? extends R> kCallableImpl) {
            super(0);
            this.f37307f = kCallableImpl;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ArrayList<KParameter> invoke() {
            int i2;
            InterfaceC10543b mo37304F = this.f37307f.mo37304F();
            ArrayList<KParameter> arrayList = new ArrayList<>();
            int i3 = 0;
            if (this.f37307f.mo32545E()) {
                i2 = 0;
            } else {
                InterfaceC10702w0 m32564i = C9858g0.m32564i(mo37304F);
                if (m32564i != null) {
                    arrayList.add(new KParameterImpl(this.f37307f, 0, KParameter.a.INSTANCE, new a(m32564i)));
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                InterfaceC10702w0 mo37032m0 = mo37304F.mo37032m0();
                if (mo37032m0 != null) {
                    arrayList.add(new KParameterImpl(this.f37307f, i2, KParameter.a.EXTENSION_RECEIVER, new C11490b(mo37032m0)));
                    i2++;
                }
            }
            int size = mo37304F.mo37028f().size();
            while (i3 < size) {
                arrayList.add(new KParameterImpl(this.f37307f, i2, KParameter.a.VALUE, new c(mo37304F, i3)));
                i3++;
                i2++;
            }
            if (this.f37307f.m32544D() && (mo37304F instanceof InterfaceC9942a) && arrayList.size() > 1) {
                C10792y.m38928y(arrayList, new d());
            }
            arrayList.trimToSize();
            return arrayList;
        }
    }

    /* compiled from: KCallableImpl.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0003 \u0001H\n¢\u0006\u0002\b\u0004"}, m32267d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "kotlin.jvm.PlatformType", "R", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.f$c */
    static final class c extends Lambda implements Function0<KTypeImpl> {

        /* renamed from: f */
        final /* synthetic */ KCallableImpl<R> f37312f;

        /* compiled from: KCallableImpl.kt */
        @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, m32267d2 = {"<anonymous>", "Ljava/lang/reflect/Type;", "R", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.f$c$a */
        static final class a extends Lambda implements Function0<Type> {

            /* renamed from: f */
            final /* synthetic */ KCallableImpl<R> f37313f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(KCallableImpl<? extends R> kCallableImpl) {
                super(0);
                this.f37313f = kCallableImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Type invoke() {
                Type m32540y = this.f37313f.m32540y();
                return m32540y == null ? this.f37313f.mo32547z().getF37428c() : m32540y;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(KCallableImpl<? extends R> kCallableImpl) {
            super(0);
            this.f37312f = kCallableImpl;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final KTypeImpl invoke() {
            AbstractC10311e0 returnType = this.f37312f.mo37304F().getReturnType();
            C9768m.m32343c(returnType);
            return new KTypeImpl(returnType, new a(this.f37312f));
        }
    }

    /* compiled from: KCallableImpl.kt */
    @Metadata(m32266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0004 \u0001H\n¢\u0006\u0002\b\u0005"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "kotlin.jvm.PlatformType", "R", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.f$d */
    static final class d extends Lambda implements Function0<List<? extends KTypeParameterImpl>> {

        /* renamed from: f */
        final /* synthetic */ KCallableImpl<R> f37314f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(KCallableImpl<? extends R> kCallableImpl) {
            super(0);
            this.f37314f = kCallableImpl;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends KTypeParameterImpl> invoke() {
            List<InterfaceC10554e1> typeParameters = this.f37314f.mo37304F().getTypeParameters();
            C9768m.m32345e(typeParameters, "descriptor.typeParameters");
            KCallableImpl<R> kCallableImpl = this.f37314f;
            ArrayList arrayList = new ArrayList(C10786v.m38911u(typeParameters, 10));
            for (InterfaceC10554e1 interfaceC10554e1 : typeParameters) {
                C9768m.m32345e(interfaceC10554e1, "descriptor");
                arrayList.add(new KTypeParameterImpl(kCallableImpl, interfaceC10554e1));
            }
            return arrayList;
        }
    }

    public KCallableImpl() {
        C9846a0.a<List<Annotation>> m32480d = C9846a0.m32480d(new a(this));
        C9768m.m32345e(m32480d, "lazySoft { descriptor.computeAnnotations() }");
        this.f37302f = m32480d;
        C9846a0.a<ArrayList<KParameter>> m32480d2 = C9846a0.m32480d(new b(this));
        C9768m.m32345e(m32480d2, "lazySoft {\n        val d…ze()\n        result\n    }");
        this.f37303g = m32480d2;
        C9846a0.a<KTypeImpl> m32480d3 = C9846a0.m32480d(new c(this));
        C9768m.m32345e(m32480d3, "lazySoft {\n        KType…eturnType\n        }\n    }");
        this.f37304h = m32480d3;
        C9846a0.a<List<KTypeParameterImpl>> m32480d4 = C9846a0.m32480d(new d(this));
        C9768m.m32345e(m32480d4, "lazySoft {\n        descr…this, descriptor) }\n    }");
        this.f37305i = m32480d4;
    }

    /* renamed from: v */
    private final R m32538v(Map<KParameter, ? extends Object> map) {
        Object m32539x;
        List<KParameter> parameters = getParameters();
        ArrayList arrayList = new ArrayList(C10786v.m38911u(parameters, 10));
        for (KParameter kParameter : parameters) {
            if (map.containsKey(kParameter)) {
                m32539x = map.get(kParameter);
                if (m32539x == null) {
                    throw new IllegalArgumentException("Annotation argument value cannot be null (" + kParameter + ')');
                }
            } else if (kParameter.mo32433k()) {
                m32539x = null;
            } else {
                if (!kParameter.mo32431h()) {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + kParameter);
                }
                m32539x = m32539x(kParameter.getType());
            }
            arrayList.add(m32539x);
        }
        Caller<?> mo32542B = mo32542B();
        if (mo32542B == null) {
            throw new KotlinReflectionInternalError("This callable does not support a default call: " + mo37304F());
        }
        try {
            Object[] array = arrayList.toArray(new Object[0]);
            C9768m.m32344d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return (R) mo32542B.call(array);
        } catch (IllegalAccessException e2) {
            throw new IllegalCallableAccessException(e2);
        }
    }

    /* renamed from: x */
    private final Object m32539x(KType kType) {
        Class m32276b = C9719a.m32276b(C9842b.m32464b(kType));
        if (m32276b.isArray()) {
            Object newInstance = Array.newInstance(m32276b.getComponentType(), 0);
            C9768m.m32345e(newInstance, "type.jvmErasure.java.run…\"\n            )\n        }");
            return newInstance;
        }
        throw new KotlinReflectionInternalError("Cannot instantiate the default empty array of type " + m32276b.getSimpleName() + ", because it is not an array type");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public final Type m32540y() {
        Type[] lowerBounds;
        InterfaceC10543b mo37304F = mo37304F();
        InterfaceC10705y interfaceC10705y = mo37304F instanceof InterfaceC10705y ? (InterfaceC10705y) mo37304F : null;
        if (!(interfaceC10705y != null && interfaceC10705y.isSuspend())) {
            return null;
        }
        Object m38847i0 = C10780s.m38847i0(mo32547z().mo32637a());
        ParameterizedType parameterizedType = m38847i0 instanceof ParameterizedType ? (ParameterizedType) m38847i0 : null;
        if (!C9768m.m32341a(parameterizedType != null ? parameterizedType.getRawType() : null, Continuation.class)) {
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        C9768m.m32345e(actualTypeArguments, "continuationType.actualTypeArguments");
        Object m38661N = C10762j.m38661N(actualTypeArguments);
        WildcardType wildcardType = m38661N instanceof WildcardType ? (WildcardType) m38661N : null;
        if (wildcardType == null || (lowerBounds = wildcardType.getLowerBounds()) == null) {
            return null;
        }
        return (Type) C10762j.m38695w(lowerBounds);
    }

    /* renamed from: A */
    public abstract KDeclarationContainerImpl getF37432k();

    /* renamed from: B */
    public abstract Caller<?> mo32542B();

    /* renamed from: C */
    public abstract InterfaceC10543b mo37304F();

    /* renamed from: D */
    protected final boolean m32544D() {
        return C9768m.m32341a(getF40571m(), "<init>") && getF37432k().mo32283a().isAnnotation();
    }

    /* renamed from: E */
    public abstract boolean mo32545E();

    @Override // kotlin.reflect.KCallable
    public R call(Object... args) {
        C9768m.m32346f(args, "args");
        try {
            return (R) mo32547z().call(args);
        } catch (IllegalAccessException e2) {
            throw new IllegalCallableAccessException(e2);
        }
    }

    @Override // kotlin.reflect.KCallable
    public R callBy(Map<KParameter, ? extends Object> args) {
        C9768m.m32346f(args, "args");
        return m32544D() ? m32538v(args) : m32546w(args, null);
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public List<Annotation> getAnnotations() {
        List<Annotation> invoke = this.f37302f.invoke();
        C9768m.m32345e(invoke, "_annotations()");
        return invoke;
    }

    @Override // kotlin.reflect.KCallable
    public List<KParameter> getParameters() {
        ArrayList<KParameter> invoke = this.f37303g.invoke();
        C9768m.m32345e(invoke, "_parameters()");
        return invoke;
    }

    @Override // kotlin.reflect.KCallable
    public KType getReturnType() {
        KTypeImpl invoke = this.f37304h.invoke();
        C9768m.m32345e(invoke, "_returnType()");
        return invoke;
    }

    @Override // kotlin.reflect.KCallable
    public List<KTypeParameter> getTypeParameters() {
        List<KTypeParameterImpl> invoke = this.f37305i.invoke();
        C9768m.m32345e(invoke, "_typeParameters()");
        return invoke;
    }

    @Override // kotlin.reflect.KCallable
    public KVisibility getVisibility() {
        AbstractC10697u visibility = mo37304F().getVisibility();
        C9768m.m32345e(visibility, "descriptor.visibility");
        return C9858g0.m32572q(visibility);
    }

    @Override // kotlin.reflect.KCallable
    public boolean isAbstract() {
        return mo37304F().mo32879j() == EnumC10550d0.ABSTRACT;
    }

    @Override // kotlin.reflect.KCallable
    public boolean isFinal() {
        return mo37304F().mo32879j() == EnumC10550d0.FINAL;
    }

    @Override // kotlin.reflect.KCallable
    public boolean isOpen() {
        return mo37304F().mo32879j() == EnumC10550d0.OPEN;
    }

    /* renamed from: w */
    public final R m32546w(Map<KParameter, ? extends Object> map, Continuation<?> continuation) {
        C9768m.m32346f(map, "args");
        List<KParameter> parameters = getParameters();
        ArrayList arrayList = new ArrayList(parameters.size());
        ArrayList arrayList2 = new ArrayList(1);
        Iterator<KParameter> it = parameters.iterator();
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                if (continuation != null) {
                    arrayList.add(continuation);
                }
                if (!z) {
                    Object[] array = arrayList.toArray(new Object[0]);
                    C9768m.m32344d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    return call(Arrays.copyOf(array, array.length));
                }
                arrayList2.add(Integer.valueOf(i3));
                Caller<?> mo32542B = mo32542B();
                if (mo32542B == null) {
                    throw new KotlinReflectionInternalError("This callable does not support a default call: " + mo37304F());
                }
                arrayList.addAll(arrayList2);
                arrayList.add(null);
                try {
                    Object[] array2 = arrayList.toArray(new Object[0]);
                    C9768m.m32344d(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    return (R) mo32542B.call(array2);
                } catch (IllegalAccessException e2) {
                    throw new IllegalCallableAccessException(e2);
                }
            }
            KParameter next = it.next();
            if (i2 != 0 && i2 % 32 == 0) {
                arrayList2.add(Integer.valueOf(i3));
                i3 = 0;
            }
            if (map.containsKey(next)) {
                arrayList.add(map.get(next));
            } else if (next.mo32433k()) {
                arrayList.add(C9858g0.m32566k(next.getType()) ? null : C9858g0.m32562g(C9843c.m32470f(next.getType())));
                i3 = (1 << (i2 % 32)) | i3;
                z = true;
            } else {
                if (!next.mo32431h()) {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + next);
                }
                arrayList.add(m32539x(next.getType()));
            }
            if (next.getF40548i() == KParameter.a.VALUE) {
                i2++;
            }
        }
    }

    /* renamed from: z */
    public abstract Caller<?> mo32547z();
}
