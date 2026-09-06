package kotlin.reflect.p371y.internal;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.C10784u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9757g0;
import kotlin.jvm.internal.C9760i;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.C9786y;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a.C10656f;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10670d;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h;
import kotlin.reflect.p371y.internal.C9846a0;
import kotlin.reflect.p371y.internal.KDeclarationContainerImpl;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.EnumC9908d;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.p391c0.C10053a;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10100l;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10102n;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10108t;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10079a;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10084e;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10085f;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10088i;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10120e;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10122g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10280w;
import kotlin.text.C10513u;
import okhttp3.HttpUrl;

/* compiled from: KPackageImpl.kt */
@Metadata(m32266d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001,B\u001d\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\b2\u0006\u0010#\u001a\u00020$H\u0016J\u0012\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(H\u0016J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020&0\b2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010*\u001a\u00020(H\u0016J\b\u0010+\u001a\u00020\u0005H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u0018\u0012\u0014\u0012\u0012 \u000f*\b\u0018\u00010\u000eR\u00020\u00000\u000eR\u00020\u00000\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000bR\u0018\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006-"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/KPackageImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "jClass", "Ljava/lang/Class;", "usageModuleName", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/Class;Ljava/lang/String;)V", "constructorDescriptors", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "()Ljava/util/Collection;", "data", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KPackageImpl$Data;", "kotlin.jvm.PlatformType", "getJClass", "()Ljava/lang/Class;", "members", "Lkotlin/reflect/KCallable;", "getMembers", "methodOwner", "getMethodOwner", "scope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "getUsageModuleName", "()Ljava/lang/String;", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "getFunctions", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getLocalProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "index", HttpUrl.FRAGMENT_ENCODE_SET, "getProperties", "hashCode", "toString", "Data", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.o, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class KPackageImpl extends KDeclarationContainerImpl {

    /* renamed from: i */
    private final Class<?> f40526i;

    /* renamed from: j */
    private final String f40527j;

    /* renamed from: k */
    private final C9846a0.b<a> f40528k;

    /* compiled from: KPackageImpl.kt */
    @Metadata(m32266d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R%\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\r\u0010\u000eR/\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R!\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001a8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\t\u001a\u0004\b \u0010!¨\u0006#"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/KPackageImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "(Lkotlin/reflect/jvm/internal/KPackageImpl;)V", "kotlinClass", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/ReflectKotlinClass;", "getKotlinClass", "()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", "kotlinClass$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "members", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KCallableImpl;", "getMembers", "()Ljava/util/Collection;", "members$delegate", "metadata", "Lkotlin/Triple;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmNameResolver;", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Package;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMetadataVersion;", "getMetadata", "()Lkotlin/Triple;", "metadata$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "multifileFacade", "Ljava/lang/Class;", "getMultifileFacade", "()Ljava/lang/Class;", "multifileFacade$delegate", "scope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "scope$delegate", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.o$a */
    private final class a extends KDeclarationContainerImpl.b {

        /* renamed from: d */
        static final /* synthetic */ KProperty<Object>[] f40529d = {C9757g0.m32304h(new C9786y(C9757g0.m32298b(a.class), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(a.class), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(a.class), "multifileFacade", "getMultifileFacade()Ljava/lang/Class;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(a.class), "metadata", "getMetadata()Lkotlin/Triple;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(a.class), "members", "getMembers()Ljava/util/Collection;"))};

        /* renamed from: e */
        private final C9846a0.a f40530e;

        /* renamed from: f */
        private final C9846a0.a f40531f;

        /* renamed from: g */
        private final C9846a0.b f40532g;

        /* renamed from: h */
        private final C9846a0.b f40533h;

        /* renamed from: i */
        private final C9846a0.a f40534i;

        /* compiled from: KPackageImpl.kt */
        @Metadata(m32266d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m32267d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/ReflectKotlinClass;", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.o$a$a, reason: collision with other inner class name */
        static final class C11528a extends Lambda implements Function0<C10656f> {

            /* renamed from: f */
            final /* synthetic */ KPackageImpl f40536f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11528a(KPackageImpl kPackageImpl) {
                super(0);
                this.f40536f = kPackageImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C10656f invoke() {
                return C10656f.f41143a.m38026a(this.f40536f.mo32283a());
            }
        }

        /* compiled from: KPackageImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002 \u0003*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin.jvm.PlatformType", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.o$a$b */
        static final class b extends Lambda implements Function0<Collection<? extends KCallableImpl<?>>> {

            /* renamed from: f */
            final /* synthetic */ KPackageImpl f40537f;

            /* renamed from: g */
            final /* synthetic */ a f40538g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(KPackageImpl kPackageImpl, a aVar) {
                super(0);
                this.f40537f = kPackageImpl;
                this.f40538g = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Collection<KCallableImpl<?>> invoke() {
                return this.f40537f.m32619D(this.f40538g.m37274f(), KDeclarationContainerImpl.c.DECLARED);
            }
        }

        /* compiled from: KPackageImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0005"}, m32267d2 = {"<anonymous>", "Lkotlin/Triple;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmNameResolver;", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Package;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMetadataVersion;", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.o$a$c */
        static final class c extends Lambda implements Function0<Triple<? extends C10085f, ? extends C10100l, ? extends C10084e>> {
            c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Triple<C10085f, C10100l, C10084e> invoke() {
                C10053a mo34025a;
                C10656f m37271c = a.this.m37271c();
                if (m37271c == null || (mo34025a = m37271c.mo34025a()) == null) {
                    return null;
                }
                String[] m33911a = mo34025a.m33911a();
                String[] m33917g = mo34025a.m33917g();
                if (m33911a == null || m33917g == null) {
                    return null;
                }
                Pair<C10085f, C10100l> m34264m = C10088i.m34264m(m33911a, m33917g);
                return new Triple<>(m34264m.m37646a(), m34264m.m37647b(), mo34025a.m33914d());
            }
        }

        /* compiled from: KPackageImpl.kt */
        @Metadata(m32266d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m32267d2 = {"<anonymous>", "Ljava/lang/Class;", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.o$a$d */
        static final class d extends Lambda implements Function0<Class<?>> {

            /* renamed from: g */
            final /* synthetic */ KPackageImpl f40541g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(KPackageImpl kPackageImpl) {
                super(0);
                this.f40541g = kPackageImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Class<?> invoke() {
                String m37524z;
                C10053a mo34025a;
                C10656f m37271c = a.this.m37271c();
                String m33915e = (m37271c == null || (mo34025a = m37271c.mo34025a()) == null) ? null : mo34025a.m33915e();
                if (m33915e == null) {
                    return null;
                }
                if (!(m33915e.length() > 0)) {
                    return null;
                }
                ClassLoader classLoader = this.f40541g.mo32283a().getClassLoader();
                m37524z = C10513u.m37524z(m33915e, '/', '.', false, 4, null);
                return classLoader.loadClass(m37524z);
            }
        }

        /* compiled from: KPackageImpl.kt */
        @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m32267d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "kotlin.jvm.PlatformType", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.o$a$e */
        static final class e extends Lambda implements Function0<InterfaceC10218h> {
            e() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final InterfaceC10218h invoke() {
                C10656f m37271c = a.this.m37271c();
                return m37271c != null ? a.this.m32628a().m38033c().m38013a(m37271c) : InterfaceC10218h.b.f39671b;
            }
        }

        public a() {
            super();
            this.f40530e = C9846a0.m32480d(new C11528a(KPackageImpl.this));
            this.f40531f = C9846a0.m32480d(new e());
            this.f40532g = C9846a0.m32478b(new d(KPackageImpl.this));
            this.f40533h = C9846a0.m32478b(new c());
            this.f40534i = C9846a0.m32480d(new b(KPackageImpl.this, this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: c */
        public final C10656f m37271c() {
            return (C10656f) this.f40530e.m32484c(this, f40529d[0]);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: d */
        public final Triple<C10085f, C10100l, C10084e> m37272d() {
            return (Triple) this.f40533h.m32484c(this, f40529d[3]);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: e */
        public final Class<?> m37273e() {
            return (Class) this.f40532g.m32484c(this, f40529d[2]);
        }

        /* renamed from: f */
        public final InterfaceC10218h m37274f() {
            T m32484c = this.f40531f.m32484c(this, f40529d[1]);
            C9768m.m32345e(m32484c, "<get-scope>(...)");
            return (InterfaceC10218h) m32484c;
        }
    }

    /* compiled from: KPackageImpl.kt */
    @Metadata(m32266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0012 \u0003*\b\u0018\u00010\u0001R\u00020\u00020\u0001R\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, m32267d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/KPackageImpl$Data;", "Lkotlin/reflect/jvm/internal/KPackageImpl;", "kotlin.jvm.PlatformType", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.o$b */
    static final class b extends Lambda implements Function0<a> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a invoke() {
            return KPackageImpl.this.new a();
        }
    }

    /* compiled from: KPackageImpl.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.o$c */
    /* synthetic */ class c extends C9760i implements Function2<C10280w, C10102n, InterfaceC10696t0> {

        /* renamed from: h */
        public static final c f40544h = new c();

        c() {
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

    public KPackageImpl(Class<?> cls, String str) {
        C9768m.m32346f(cls, "jClass");
        this.f40526i = cls;
        this.f40527j = str;
        C9846a0.b<a> m32478b = C9846a0.m32478b(new b());
        C9768m.m32345e(m32478b, "lazy { Data() }");
        this.f40528k = m32478b;
    }

    /* renamed from: M */
    private final InterfaceC10218h m37269M() {
        return this.f40528k.invoke().m37274f();
    }

    @Override // kotlin.reflect.p371y.internal.KDeclarationContainerImpl
    /* renamed from: A */
    public Collection<InterfaceC10573l> mo32487A() {
        return C10784u.m38888j();
    }

    @Override // kotlin.reflect.p371y.internal.KDeclarationContainerImpl
    /* renamed from: B */
    public Collection<InterfaceC10705y> mo32488B(C10130f c10130f) {
        C9768m.m32346f(c10130f, "name");
        return m37269M().mo33311a(c10130f, EnumC9908d.FROM_REFLECTION);
    }

    @Override // kotlin.reflect.p371y.internal.KDeclarationContainerImpl
    /* renamed from: C */
    public InterfaceC10696t0 mo32489C(int i2) {
        Triple<C10085f, C10100l, C10084e> m37272d = this.f40528k.invoke().m37272d();
        if (m37272d == null) {
            return null;
        }
        C10085f m37658a = m37272d.m37658a();
        C10100l m37659b = m37272d.m37659b();
        C10084e m37660c = m37272d.m37660c();
        AbstractC10716h.f<C10100l, List<C10102n>> fVar = C10079a.f38504n;
        C9768m.m32345e(fVar, "packageLocalVariable");
        C10102n c10102n = (C10102n) C10120e.m35381b(m37659b, fVar, i2);
        if (c10102n == null) {
            return null;
        }
        Class<?> mo32283a = mo32283a();
        C10108t m34797V = m37659b.m34797V();
        C9768m.m32345e(m34797V, "packageProto.typeTable");
        return (InterfaceC10696t0) C9858g0.m32563h(mo32283a, c10102n, m37658a, new C10122g(m34797V), m37660c, c.f40544h);
    }

    @Override // kotlin.reflect.p371y.internal.KDeclarationContainerImpl
    /* renamed from: E */
    protected Class<?> mo32620E() {
        Class<?> m37273e = this.f40528k.invoke().m37273e();
        return m37273e == null ? mo32283a() : m37273e;
    }

    @Override // kotlin.reflect.p371y.internal.KDeclarationContainerImpl
    /* renamed from: F */
    public Collection<InterfaceC10696t0> mo32490F(C10130f c10130f) {
        C9768m.m32346f(c10130f, "name");
        return m37269M().mo33313c(c10130f, EnumC9908d.FROM_REFLECTION);
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    /* renamed from: a */
    public Class<?> mo32283a() {
        return this.f40526i;
    }

    public boolean equals(Object other) {
        return (other instanceof KPackageImpl) && C9768m.m32341a(mo32283a(), ((KPackageImpl) other).mo32283a());
    }

    public int hashCode() {
        return mo32283a().hashCode();
    }

    public String toString() {
        return "file class " + C10670d.m38069a(mo32283a()).m35409b();
    }
}
