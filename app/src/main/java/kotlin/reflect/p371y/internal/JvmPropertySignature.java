package kotlin.reflect.p371y.internal;

import cm.aptoide.p092pt.database.room.RoomInstalled;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10695t;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10571k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10670d;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h;
import kotlin.reflect.p371y.internal.JvmFunctionSignature;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C10047z;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10062k;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10091c;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10102n;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10079a;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.AbstractC10083d;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10088i;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10120e;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10122g;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10118c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10131g;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.C10254d;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.C10260j;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10256f;
import okhttp3.HttpUrl;

/* compiled from: RuntimeTypeMapper.kt */
@Metadata(m32266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "asString", HttpUrl.FRAGMENT_ENCODE_SET, "JavaField", "JavaMethodProperty", "KotlinProperty", "MappedKotlinProperty", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$MappedKotlinProperty;", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.e, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public abstract class JvmPropertySignature {

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "field", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)V", "getField", "()Ljava/lang/reflect/Field;", "asString", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.e$a */
    public static final class a extends JvmPropertySignature {

        /* renamed from: a */
        private final Field f37290a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Field field) {
            super(null);
            C9768m.m32346f(field, "field");
            this.f37290a = field;
        }

        @Override // kotlin.reflect.p371y.internal.JvmPropertySignature
        /* renamed from: a */
        public String getF37298f() {
            StringBuilder sb = new StringBuilder();
            String name = this.f37290a.getName();
            C9768m.m32345e(name, "field.name");
            sb.append(C10047z.m33829b(name));
            sb.append("()");
            Class<?> type = this.f37290a.getType();
            C9768m.m32345e(type, "field.type");
            sb.append(C10670d.m38070b(type));
            return sb.toString();
        }

        /* renamed from: b, reason: from getter */
        public final Field getF37290a() {
            return this.f37290a;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u000b"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "getterMethod", "Ljava/lang/reflect/Method;", "setterMethod", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "getGetterMethod", "()Ljava/lang/reflect/Method;", "getSetterMethod", "asString", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.e$b */
    public static final class b extends JvmPropertySignature {

        /* renamed from: a */
        private final Method f37291a;

        /* renamed from: b */
        private final Method f37292b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Method method, Method method2) {
            super(null);
            C9768m.m32346f(method, "getterMethod");
            this.f37291a = method;
            this.f37292b = method2;
        }

        @Override // kotlin.reflect.p371y.internal.JvmPropertySignature
        /* renamed from: a */
        public String getF37298f() {
            String m32535b;
            m32535b = C9854e0.m32535b(this.f37291a);
            return m32535b;
        }

        /* renamed from: b, reason: from getter */
        public final Method getF37291a() {
            return this.f37291a;
        }

        /* renamed from: c, reason: from getter */
        public final Method getF37292b() {
            return this.f37292b;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(m32266d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u0019\u001a\u00020\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "proto", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;", RoomInstalled.SIGNATURE, "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/NameResolver;", "typeTable", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/TypeTable;", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;)V", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "getNameResolver", "()Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;", "getProto", "()Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", "string", HttpUrl.FRAGMENT_ENCODE_SET, "getTypeTable", "()Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;", "asString", "getManglingSuffix", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.e$c */
    public static final class c extends JvmPropertySignature {

        /* renamed from: a */
        private final InterfaceC10696t0 f37293a;

        /* renamed from: b */
        private final C10102n f37294b;

        /* renamed from: c */
        private final C10079a.d f37295c;

        /* renamed from: d */
        private final InterfaceC10118c f37296d;

        /* renamed from: e */
        private final C10122g f37297e;

        /* renamed from: f */
        private final String f37298f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC10696t0 interfaceC10696t0, C10102n c10102n, C10079a.d dVar, InterfaceC10118c interfaceC10118c, C10122g c10122g) {
            super(null);
            String str;
            C9768m.m32346f(interfaceC10696t0, "descriptor");
            C9768m.m32346f(c10102n, "proto");
            C9768m.m32346f(dVar, RoomInstalled.SIGNATURE);
            C9768m.m32346f(interfaceC10118c, "nameResolver");
            C9768m.m32346f(c10122g, "typeTable");
            this.f37293a = interfaceC10696t0;
            this.f37294b = c10102n;
            this.f37295c = dVar;
            this.f37296d = interfaceC10118c;
            this.f37297e = c10122g;
            if (dVar.m34145G()) {
                str = interfaceC10118c.getString(dVar.m34140B().m34114x()) + interfaceC10118c.getString(dVar.m34140B().m34113w());
            } else {
                AbstractC10083d.a m34256d = C10088i.m34256d(C10088i.f38607a, c10102n, interfaceC10118c, c10122g, false, 8, null);
                if (m34256d == null) {
                    throw new KotlinReflectionInternalError("No field signature for property: " + interfaceC10696t0);
                }
                String m34250d = m34256d.m34250d();
                str = C10047z.m33829b(m34250d) + m32526c() + "()" + m34256d.m34251e();
            }
            this.f37298f = str;
        }

        /* renamed from: c */
        private final String m32526c() {
            String str;
            InterfaceC10576m mo32876b = this.f37293a.mo32876b();
            C9768m.m32345e(mo32876b, "descriptor.containingDeclaration");
            if (C9768m.m32341a(this.f37293a.getVisibility(), C10695t.f41219d) && (mo32876b instanceof C10254d)) {
                C10091c m36283c1 = ((C10254d) mo32876b).m36283c1();
                AbstractC10716h.f<C10091c, Integer> fVar = C10079a.f38499i;
                C9768m.m32345e(fVar, "classModuleName");
                Integer num = (Integer) C10120e.m35380a(m36283c1, fVar);
                if (num == null || (str = this.f37296d.getString(num.intValue())) == null) {
                    str = "main";
                }
                return '$' + C10131g.m35459a(str);
            }
            if (!C9768m.m32341a(this.f37293a.getVisibility(), C10695t.f41216a) || !(mo32876b instanceof InterfaceC10571k0)) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            InterfaceC10696t0 interfaceC10696t0 = this.f37293a;
            C9768m.m32344d(interfaceC10696t0, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor");
            InterfaceC10256f mo36260c0 = ((C10260j) interfaceC10696t0).mo36260c0();
            if (!(mo36260c0 instanceof C10062k)) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            C10062k c10062k = (C10062k) mo36260c0;
            if (c10062k.m33984f() == null) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            return '$' + c10062k.m33986h().m35455k();
        }

        @Override // kotlin.reflect.p371y.internal.JvmPropertySignature
        /* renamed from: a, reason: from getter */
        public String getF37298f() {
            return this.f37298f;
        }

        /* renamed from: b, reason: from getter */
        public final InterfaceC10696t0 getF37293a() {
            return this.f37293a;
        }

        /* renamed from: d, reason: from getter */
        public final InterfaceC10118c getF37296d() {
            return this.f37296d;
        }

        /* renamed from: e, reason: from getter */
        public final C10102n getF37294b() {
            return this.f37294b;
        }

        /* renamed from: f, reason: from getter */
        public final C10079a.d getF37295c() {
            return this.f37295c;
        }

        /* renamed from: g, reason: from getter */
        public final C10122g getF37297e() {
            return this.f37297e;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u000b"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$MappedKotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "getterSignature", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "setterSignature", "(Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;)V", "getGetterSignature", "()Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "getSetterSignature", "asString", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.e$d */
    public static final class d extends JvmPropertySignature {

        /* renamed from: a */
        private final JvmFunctionSignature.e f37299a;

        /* renamed from: b */
        private final JvmFunctionSignature.e f37300b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(JvmFunctionSignature.e eVar, JvmFunctionSignature.e eVar2) {
            super(null);
            C9768m.m32346f(eVar, "getterSignature");
            this.f37299a = eVar;
            this.f37300b = eVar2;
        }

        @Override // kotlin.reflect.p371y.internal.JvmPropertySignature
        /* renamed from: a */
        public String getF37298f() {
            return this.f37299a.getF37287b();
        }

        /* renamed from: b, reason: from getter */
        public final JvmFunctionSignature.e getF37299a() {
            return this.f37299a;
        }

        /* renamed from: c, reason: from getter */
        public final JvmFunctionSignature.e getF37300b() {
            return this.f37300b;
        }
    }

    private JvmPropertySignature() {
    }

    public /* synthetic */ JvmPropertySignature(C9756g c9756g) {
        this();
    }

    /* renamed from: a */
    public abstract String getF37298f();
}
