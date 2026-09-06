package kotlin.reflect.p371y.internal;

import cm.aptoide.p092pt.database.room.RoomInstalled;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10786v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9748c;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9757g0;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.C9786y;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y;
import kotlin.reflect.p371y.internal.C9846a0;
import kotlin.reflect.p371y.internal.FunctionWithAllInvokes;
import kotlin.reflect.p371y.internal.JvmFunctionSignature;
import kotlin.reflect.p371y.internal.calls.AnnotationConstructorCaller;
import kotlin.reflect.p371y.internal.calls.C9867f;
import kotlin.reflect.p371y.internal.calls.C9869h;
import kotlin.reflect.p371y.internal.calls.Caller;
import kotlin.reflect.p371y.internal.calls.CallerImpl;
import kotlin.reflect.p371y.internal.p374j0.p400i.p406u.C10204b;
import okhttp3.HttpUrl;

/* compiled from: KFunctionImpl.kt */
@Metadata(m32266d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u00020\u0005B)\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\fB\u0017\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fB5\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\u0012J.\u00102\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u000304032\n\u00105\u001a\u0006\u0012\u0002\b\u0003042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u00106\u001a\u00020)H\u0002J\u0010\u00107\u001a\u0002082\u0006\u00105\u001a\u000209H\u0002J\u0010\u0010:\u001a\u0002082\u0006\u00105\u001a\u000209H\u0002J\u0010\u0010;\u001a\u0002082\u0006\u00105\u001a\u000209H\u0002J\u0013\u0010<\u001a\u00020)2\b\u0010=\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010>\u001a\u00020\u0014H\u0016J\b\u0010?\u001a\u00020\tH\u0016R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u001a8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R!\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001a8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b\"\u0010\u001cR\u001b\u0010\r\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010*R\u0014\u0010+\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010*R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0014\u0010-\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010*R\u0014\u0010.\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010*R\u0014\u0010/\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010*R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006@"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/KFunctionImpl;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/KFunction;", "Lkotlin/jvm/internal/FunctionBase;", "Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "name", HttpUrl.FRAGMENT_ENCODE_SET, RoomInstalled.SIGNATURE, "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;)V", "descriptorInitialValue", "rawBoundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Ljava/lang/Object;)V", "arity", HttpUrl.FRAGMENT_ENCODE_SET, "getArity", "()I", "getBoundReceiver", "()Ljava/lang/Object;", "caller", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "caller$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "defaultCaller", "getDefaultCaller", "defaultCaller$delegate", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "descriptor$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "isBound", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "isExternal", "isInfix", "isInline", "isOperator", "isSuspend", "getName", "()Ljava/lang/String;", "createConstructorCaller", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "member", "isDefault", "createInstanceMethodCaller", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "Ljava/lang/reflect/Method;", "createJvmStaticInObjectCaller", "createStaticMethodCaller", "equals", "other", "hashCode", "toString", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.j, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class KFunctionImpl extends KCallableImpl<Object> implements FunctionBase<Object>, KFunction<Object>, FunctionWithAllInvokes {

    /* renamed from: j */
    static final /* synthetic */ KProperty<Object>[] f37431j = {C9757g0.m32304h(new C9786y(C9757g0.m32298b(KFunctionImpl.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(KFunctionImpl.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(KFunctionImpl.class), "defaultCaller", "getDefaultCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

    /* renamed from: k */
    private final KDeclarationContainerImpl f37432k;

    /* renamed from: l */
    private final String f37433l;

    /* renamed from: m */
    private final Object f37434m;

    /* renamed from: n */
    private final C9846a0.a f37435n;

    /* renamed from: o */
    private final C9846a0.b f37436o;

    /* renamed from: p */
    private final C9846a0.b f37437p;

    /* compiled from: KFunctionImpl.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0012\u0012\u0002\b\u0003 \u0002*\b\u0012\u0002\b\u0003\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m32267d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/calls/Caller;", "kotlin.jvm.PlatformType", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.j$a */
    static final class a extends Lambda implements Function0<Caller<? extends Member>> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Caller<Member> invoke() {
            Object m32509b;
            Caller m32684L;
            JvmFunctionSignature m32521g = RuntimeTypeMapper.f37288a.m32521g(KFunctionImpl.this.mo37304F());
            if (m32521g instanceof JvmFunctionSignature.d) {
                if (KFunctionImpl.this.m32544D()) {
                    Class<?> mo32283a = KFunctionImpl.this.getF40570l().mo32283a();
                    List<KParameter> parameters = KFunctionImpl.this.getParameters();
                    ArrayList arrayList = new ArrayList(C10786v.m38911u(parameters, 10));
                    Iterator<T> it = parameters.iterator();
                    while (it.hasNext()) {
                        String name = ((KParameter) it.next()).getName();
                        C9768m.m32343c(name);
                        arrayList.add(name);
                    }
                    return new AnnotationConstructorCaller(mo32283a, arrayList, AnnotationConstructorCaller.a.POSITIONAL_CALL, AnnotationConstructorCaller.b.KOTLIN, null, 16, null);
                }
                m32509b = KFunctionImpl.this.getF40570l().m32621u(((JvmFunctionSignature.d) m32521g).m32512b());
            } else if (m32521g instanceof JvmFunctionSignature.e) {
                JvmFunctionSignature.e eVar = (JvmFunctionSignature.e) m32521g;
                m32509b = KFunctionImpl.this.getF40570l().m32625y(eVar.m32514c(), eVar.m32513b());
            } else if (m32521g instanceof JvmFunctionSignature.c) {
                m32509b = ((JvmFunctionSignature.c) m32521g).getF37283a();
            } else {
                if (!(m32521g instanceof JvmFunctionSignature.b)) {
                    if (!(m32521g instanceof JvmFunctionSignature.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List<Method> m32507b = ((JvmFunctionSignature.a) m32521g).m32507b();
                    Class<?> mo32283a2 = KFunctionImpl.this.getF40570l().mo32283a();
                    ArrayList arrayList2 = new ArrayList(C10786v.m38911u(m32507b, 10));
                    Iterator<T> it2 = m32507b.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((Method) it2.next()).getName());
                    }
                    return new AnnotationConstructorCaller(mo32283a2, arrayList2, AnnotationConstructorCaller.a.POSITIONAL_CALL, AnnotationConstructorCaller.b.JAVA, m32507b);
                }
                m32509b = ((JvmFunctionSignature.b) m32521g).m32509b();
            }
            if (m32509b instanceof Constructor) {
                KFunctionImpl kFunctionImpl = KFunctionImpl.this;
                m32684L = kFunctionImpl.m32683K((Constructor) m32509b, kFunctionImpl.mo37304F(), false);
            } else {
                if (!(m32509b instanceof Method)) {
                    throw new KotlinReflectionInternalError("Could not compute caller for function: " + KFunctionImpl.this.mo37304F() + " (member = " + m32509b + ')');
                }
                Method method = (Method) m32509b;
                m32684L = !Modifier.isStatic(method.getModifiers()) ? KFunctionImpl.this.m32684L(method) : KFunctionImpl.this.mo37304F().getAnnotations().mo33271l(C9858g0.m32565j()) != null ? KFunctionImpl.this.m32685M(method) : KFunctionImpl.this.m32686N(method);
            }
            return C9869h.m32667c(m32684L, KFunctionImpl.this.mo37304F(), false, 2, null);
        }
    }

    /* compiled from: KFunctionImpl.kt */
    @Metadata(m32266d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m32267d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/calls/Caller;", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.j$b */
    static final class b extends Lambda implements Function0<Caller<? extends Member>> {
        b() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.lang.reflect.Member] */
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Caller<Member> invoke() {
            GenericDeclaration genericDeclaration;
            Caller caller;
            JvmFunctionSignature m32521g = RuntimeTypeMapper.f37288a.m32521g(KFunctionImpl.this.mo37304F());
            if (m32521g instanceof JvmFunctionSignature.e) {
                KDeclarationContainerImpl f40570l = KFunctionImpl.this.getF40570l();
                JvmFunctionSignature.e eVar = (JvmFunctionSignature.e) m32521g;
                String m32514c = eVar.m32514c();
                String m32513b = eVar.m32513b();
                C9768m.m32343c(KFunctionImpl.this.mo32547z().getMember());
                genericDeclaration = f40570l.m32623w(m32514c, m32513b, !Modifier.isStatic(r5.getModifiers()));
            } else if (m32521g instanceof JvmFunctionSignature.d) {
                if (KFunctionImpl.this.m32544D()) {
                    Class<?> mo32283a = KFunctionImpl.this.getF40570l().mo32283a();
                    List<KParameter> parameters = KFunctionImpl.this.getParameters();
                    ArrayList arrayList = new ArrayList(C10786v.m38911u(parameters, 10));
                    Iterator<T> it = parameters.iterator();
                    while (it.hasNext()) {
                        String name = ((KParameter) it.next()).getName();
                        C9768m.m32343c(name);
                        arrayList.add(name);
                    }
                    return new AnnotationConstructorCaller(mo32283a, arrayList, AnnotationConstructorCaller.a.CALL_BY_NAME, AnnotationConstructorCaller.b.KOTLIN, null, 16, null);
                }
                genericDeclaration = KFunctionImpl.this.getF40570l().m32622v(((JvmFunctionSignature.d) m32521g).m32512b());
            } else {
                if (m32521g instanceof JvmFunctionSignature.a) {
                    List<Method> m32507b = ((JvmFunctionSignature.a) m32521g).m32507b();
                    Class<?> mo32283a2 = KFunctionImpl.this.getF40570l().mo32283a();
                    ArrayList arrayList2 = new ArrayList(C10786v.m38911u(m32507b, 10));
                    Iterator<T> it2 = m32507b.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((Method) it2.next()).getName());
                    }
                    return new AnnotationConstructorCaller(mo32283a2, arrayList2, AnnotationConstructorCaller.a.CALL_BY_NAME, AnnotationConstructorCaller.b.JAVA, m32507b);
                }
                genericDeclaration = null;
            }
            if (genericDeclaration instanceof Constructor) {
                KFunctionImpl kFunctionImpl = KFunctionImpl.this;
                caller = kFunctionImpl.m32683K((Constructor) genericDeclaration, kFunctionImpl.mo37304F(), true);
            } else if (genericDeclaration instanceof Method) {
                if (KFunctionImpl.this.mo37304F().getAnnotations().mo33271l(C9858g0.m32565j()) != null) {
                    InterfaceC10576m mo32876b = KFunctionImpl.this.mo37304F().mo32876b();
                    C9768m.m32344d(mo32876b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    if (!((InterfaceC10552e) mo32876b).mo32857A()) {
                        caller = KFunctionImpl.this.m32685M((Method) genericDeclaration);
                    }
                }
                caller = KFunctionImpl.this.m32686N((Method) genericDeclaration);
            } else {
                caller = null;
            }
            if (caller != null) {
                return C9869h.m32666b(caller, KFunctionImpl.this.mo37304F(), true);
            }
            return null;
        }
    }

    /* compiled from: KFunctionImpl.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m32267d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "kotlin.jvm.PlatformType", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.j$c */
    static final class c extends Lambda implements Function0<InterfaceC10705y> {

        /* renamed from: g */
        final /* synthetic */ String f37441g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(0);
            this.f37441g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10705y invoke() {
            return KFunctionImpl.this.getF40570l().m32624x(this.f37441g, KFunctionImpl.this.f37433l);
        }
    }

    /* synthetic */ KFunctionImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, InterfaceC10705y interfaceC10705y, Object obj, int i2, C9756g c9756g) {
        this(kDeclarationContainerImpl, str, str2, interfaceC10705y, (i2 & 16) != 0 ? AbstractC9748c.NO_RECEIVER : obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public final CallerImpl<Constructor<?>> m32683K(Constructor<?> constructor, InterfaceC10705y interfaceC10705y, boolean z) {
        return (z || !C10204b.m36103f(interfaceC10705y)) ? mo32545E() ? new CallerImpl.c(constructor, m32687O()) : new CallerImpl.e(constructor) : mo32545E() ? new CallerImpl.a(constructor, m32687O()) : new CallerImpl.b(constructor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public final CallerImpl.h m32684L(Method method) {
        return mo32545E() ? new CallerImpl.h.a(method, m32687O()) : new CallerImpl.h.d(method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public final CallerImpl.h m32685M(Method method) {
        return mo32545E() ? new CallerImpl.h.b(method) : new CallerImpl.h.e(method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public final CallerImpl.h m32686N(Method method) {
        return mo32545E() ? new CallerImpl.h.c(method, m32687O()) : new CallerImpl.h.f(method);
    }

    /* renamed from: O */
    private final Object m32687O() {
        return C9869h.m32665a(this.f37434m, mo37304F());
    }

    @Override // kotlin.reflect.p371y.internal.KCallableImpl
    /* renamed from: A, reason: from getter */
    public KDeclarationContainerImpl getF40570l() {
        return this.f37432k;
    }

    @Override // kotlin.reflect.p371y.internal.KCallableImpl
    /* renamed from: B */
    public Caller<?> mo32542B() {
        return (Caller) this.f37437p.m32484c(this, f37431j[2]);
    }

    @Override // kotlin.reflect.p371y.internal.KCallableImpl
    /* renamed from: E */
    public boolean mo32545E() {
        return !C9768m.m32341a(this.f37434m, AbstractC9748c.NO_RECEIVER);
    }

    @Override // kotlin.reflect.p371y.internal.KCallableImpl
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public InterfaceC10705y mo37304F() {
        T m32484c = this.f37435n.m32484c(this, f37431j[0]);
        C9768m.m32345e(m32484c, "<get-descriptor>(...)");
        return (InterfaceC10705y) m32484c;
    }

    @Override // kotlin.jvm.functions.Function3
    /* renamed from: d */
    public Object mo26879d(Object obj, Object obj2, Object obj3) {
        return FunctionWithAllInvokes.a.m32495d(this, obj, obj2, obj3);
    }

    public boolean equals(Object other) {
        KFunctionImpl m32558c = C9858g0.m32558c(other);
        return m32558c != null && C9768m.m32341a(getF40570l(), m32558c.getF40570l()) && C9768m.m32341a(getF40571m(), m32558c.getF40571m()) && C9768m.m32341a(this.f37433l, m32558c.f37433l) && C9768m.m32341a(this.f37434m, m32558c.f37434m);
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return C9867f.m32661a(mo32547z());
    }

    @Override // kotlin.reflect.KCallable
    /* renamed from: getName */
    public String getF40571m() {
        String m35455k = mo37304F().getName().m35455k();
        C9768m.m32345e(m35455k, "descriptor.name.asString()");
        return m35455k;
    }

    public int hashCode() {
        return (((getF40570l().hashCode() * 31) + getF40571m().hashCode()) * 31) + this.f37433l.hashCode();
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return FunctionWithAllInvokes.a.m32492a(this);
    }

    @Override // kotlin.reflect.KCallable
    public boolean isSuspend() {
        return mo37304F().isSuspend();
    }

    public String toString() {
        return ReflectionObjectRenderer.f37273a.m32499d(mo37304F());
    }

    @Override // kotlin.reflect.p371y.internal.KCallableImpl
    /* renamed from: z */
    public Caller<?> mo32547z() {
        T m32484c = this.f37436o.m32484c(this, f37431j[1]);
        C9768m.m32345e(m32484c, "<get-caller>(...)");
        return (Caller) m32484c;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return FunctionWithAllInvokes.a.m32493b(this, obj);
    }

    private KFunctionImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, InterfaceC10705y interfaceC10705y, Object obj) {
        this.f37432k = kDeclarationContainerImpl;
        this.f37433l = str2;
        this.f37434m = obj;
        this.f37435n = C9846a0.m32479c(interfaceC10705y, new c(str));
        this.f37436o = C9846a0.m32478b(new a());
        this.f37437p = C9846a0.m32478b(new b());
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return FunctionWithAllInvokes.a.m32494c(this, obj, obj2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KFunctionImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, Object obj) {
        this(kDeclarationContainerImpl, str, str2, null, obj);
        C9768m.m32346f(kDeclarationContainerImpl, "container");
        C9768m.m32346f(str, "name");
        C9768m.m32346f(str2, RoomInstalled.SIGNATURE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public KFunctionImpl(kotlin.reflect.p371y.internal.KDeclarationContainerImpl r10, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y r11) {
        /*
            r9 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.C9768m.m32346f(r10, r0)
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.C9768m.m32346f(r11, r0)
            kotlin.f0.y.e.j0.f.f r0 = r11.getName()
            java.lang.String r3 = r0.m35455k()
            java.lang.String r0 = "descriptor.name.asString()"
            kotlin.jvm.internal.C9768m.m32345e(r3, r0)
            kotlin.f0.y.e.d0 r0 = kotlin.reflect.p371y.internal.RuntimeTypeMapper.f37288a
            kotlin.f0.y.e.d r0 = r0.m32521g(r11)
            java.lang.String r4 = r0.getF37287b()
            r6 = 0
            r7 = 16
            r8 = 0
            r1 = r9
            r2 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.KFunctionImpl.<init>(kotlin.f0.y.e.i, kotlin.reflect.jvm.internal.impl.descriptors.y):void");
    }
}
