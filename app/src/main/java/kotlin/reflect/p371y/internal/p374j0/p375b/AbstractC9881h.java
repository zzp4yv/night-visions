package kotlin.reflect.p371y.internal.p374j0.p375b;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.C10693s;
import kotlin.reflect.jvm.internal.impl.descriptors.C10703x;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10571k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10603p0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10698u0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10700v0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10597a;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10598b;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10599c;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10641x;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9884k;
import kotlin.reflect.p371y.internal.p374j0.p375b.p376p.C9889a;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.EnumC9908d;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10128d;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10154d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10290g;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10292i;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10303b1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10314f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10324i1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10339n1;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10351r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1;
import okhttp3.internal.p454ws.WebSocketProtocol;

/* compiled from: KotlinBuiltIns.java */
/* renamed from: kotlin.f0.y.e.j0.b.h */
/* loaded from: classes2.dex */
public abstract class AbstractC9881h {

    /* renamed from: a */
    public static final C10130f f37454a = C10130f.m35451D("<built-ins module>");

    /* renamed from: b */
    private C10641x f37455b;

    /* renamed from: c */
    private InterfaceC10292i<C10641x> f37456c;

    /* renamed from: d */
    private final InterfaceC10292i<e> f37457d;

    /* renamed from: e */
    private final InterfaceC10292i<Collection<InterfaceC10603p0>> f37458e;

    /* renamed from: f */
    private final InterfaceC10290g<C10130f, InterfaceC10552e> f37459f;

    /* renamed from: g */
    private final InterfaceC10297n f37460g;

    /* compiled from: KotlinBuiltIns.java */
    /* renamed from: kotlin.f0.y.e.j0.b.h$a */
    class a implements Function0<Collection<InterfaceC10603p0>> {
        a() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Collection<InterfaceC10603p0> invoke() {
            return Arrays.asList(AbstractC9881h.this.m32798r().mo37018N(C9884k.f37517r), AbstractC9881h.this.m32798r().mo37018N(C9884k.f37519t), AbstractC9881h.this.m32798r().mo37018N(C9884k.f37520u), AbstractC9881h.this.m32798r().mo37018N(C9884k.f37518s));
        }
    }

    /* compiled from: KotlinBuiltIns.java */
    /* renamed from: kotlin.f0.y.e.j0.b.h$b */
    class b implements Function0<e> {
        b() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e invoke() {
            EnumMap enumMap = new EnumMap(EnumC9882i.class);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            for (EnumC9882i enumC9882i : EnumC9882i.values()) {
                AbstractC10335m0 m32755q = AbstractC9881h.this.m32755q(enumC9882i.m32816v().m35455k());
                AbstractC10335m0 m32755q2 = AbstractC9881h.this.m32755q(enumC9882i.m32814q().m35455k());
                enumMap.put((EnumMap) enumC9882i, (EnumC9882i) m32755q2);
                hashMap.put(m32755q, m32755q2);
                hashMap2.put(m32755q2, m32755q);
            }
            return new e(enumMap, hashMap, hashMap2, null);
        }
    }

    /* compiled from: KotlinBuiltIns.java */
    /* renamed from: kotlin.f0.y.e.j0.b.h$c */
    class c implements Function1<C10130f, InterfaceC10552e> {
        c() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC10552e invoke(C10130f c10130f) {
            InterfaceC10561h mo33316f = AbstractC9881h.this.m32799s().mo33316f(c10130f, EnumC9908d.FROM_BUILTINS);
            if (mo33316f == null) {
                throw new AssertionError("Built-in class " + C9884k.f37517r.m35421c(c10130f) + " is not found");
            }
            if (mo33316f instanceof InterfaceC10552e) {
                return (InterfaceC10552e) mo33316f;
            }
            throw new AssertionError("Must be a class descriptor " + c10130f + ", but was " + mo33316f);
        }
    }

    /* compiled from: KotlinBuiltIns.java */
    /* renamed from: kotlin.f0.y.e.j0.b.h$d */
    class d implements Function0<Void> {

        /* renamed from: f */
        final /* synthetic */ C10641x f37464f;

        d(C10641x c10641x) {
            this.f37464f = c10641x;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void invoke() {
            if (AbstractC9881h.this.f37455b == null) {
                AbstractC9881h.this.f37455b = this.f37464f;
                return null;
            }
            throw new AssertionError("Built-ins module is already set: " + AbstractC9881h.this.f37455b + " (attempting to reset to " + this.f37464f + ")");
        }
    }

    /* compiled from: KotlinBuiltIns.java */
    /* renamed from: kotlin.f0.y.e.j0.b.h$e */
    private static class e {

        /* renamed from: a */
        public final Map<EnumC9882i, AbstractC10335m0> f37466a;

        /* renamed from: b */
        public final Map<AbstractC10311e0, AbstractC10335m0> f37467b;

        /* renamed from: c */
        public final Map<AbstractC10335m0, AbstractC10335m0> f37468c;

        /* synthetic */ e(Map map, Map map2, Map map3, a aVar) {
            this(map, map2, map3);
        }

        /* renamed from: a */
        private static /* synthetic */ void m32811a(int i2) {
            Object[] objArr = new Object[3];
            if (i2 == 1) {
                objArr[0] = "primitiveKotlinTypeToKotlinArrayType";
            } else if (i2 != 2) {
                objArr[0] = "primitiveTypeToArrayKotlinType";
            } else {
                objArr[0] = "kotlinArrayTypeToPrimitiveKotlinType";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private e(Map<EnumC9882i, AbstractC10335m0> map, Map<AbstractC10311e0, AbstractC10335m0> map2, Map<AbstractC10335m0, AbstractC10335m0> map3) {
            if (map == null) {
                m32811a(0);
            }
            if (map2 == null) {
                m32811a(1);
            }
            if (map3 == null) {
                m32811a(2);
            }
            this.f37466a = map;
            this.f37467b = map2;
            this.f37468c = map3;
        }
    }

    protected AbstractC9881h(InterfaceC10297n interfaceC10297n) {
        if (interfaceC10297n == null) {
            m32733a(0);
        }
        this.f37460g = interfaceC10297n;
        this.f37458e = interfaceC10297n.mo36516d(new a());
        this.f37457d = interfaceC10297n.mo36516d(new b());
        this.f37459f = interfaceC10297n.mo36520h(new c());
    }

    /* renamed from: A */
    private static AbstractC10311e0 m32725A(AbstractC10311e0 abstractC10311e0, InterfaceC10559g0 interfaceC10559g0) {
        C10126b m36073g;
        C10126b m32845a;
        InterfaceC10552e m38149a;
        if (abstractC10311e0 == null) {
            m32733a(71);
        }
        if (interfaceC10559g0 == null) {
            m32733a(72);
        }
        InterfaceC10561h mo32887c = abstractC10311e0.mo35993O0().mo32887c();
        if (mo32887c == null) {
            return null;
        }
        C9888o c9888o = C9888o.f37628a;
        if (!c9888o.m32846b(mo32887c.getName()) || (m36073g = C10202a.m36073g(mo32887c)) == null || (m32845a = c9888o.m32845a(m36073g)) == null || (m38149a = C10703x.m38149a(interfaceC10559g0, m32845a)) == null) {
            return null;
        }
        return m38149a.mo36400s();
    }

    /* renamed from: A0 */
    public static boolean m32726A0(InterfaceC10576m interfaceC10576m) {
        if (interfaceC10576m == null) {
            m32733a(10);
        }
        while (interfaceC10576m != null) {
            if (interfaceC10576m instanceof InterfaceC10571k0) {
                return ((InterfaceC10571k0) interfaceC10576m).mo37712d().m35427i(C9884k.f37516q);
            }
            interfaceC10576m = interfaceC10576m.mo32876b();
        }
        return false;
    }

    /* renamed from: B0 */
    public static boolean m32727B0(AbstractC10311e0 abstractC10311e0) {
        if (abstractC10311e0 == null) {
            m32733a(142);
        }
        return m32749l0(abstractC10311e0, C9884k.a.f37570f);
    }

    /* renamed from: C0 */
    public static boolean m32728C0(AbstractC10311e0 abstractC10311e0) {
        if (abstractC10311e0 == null) {
            m32733a(132);
        }
        return m32762w0(abstractC10311e0) || m32765z0(abstractC10311e0) || m32763x0(abstractC10311e0) || m32764y0(abstractC10311e0);
    }

    /* renamed from: N */
    public static EnumC9882i m32729N(AbstractC10311e0 abstractC10311e0) {
        if (abstractC10311e0 == null) {
            m32733a(92);
        }
        InterfaceC10561h mo32887c = abstractC10311e0.mo35993O0().mo32887c();
        if (mo32887c == null) {
            return null;
        }
        return m32730P(mo32887c);
    }

    /* renamed from: P */
    public static EnumC9882i m32730P(InterfaceC10576m interfaceC10576m) {
        if (interfaceC10576m == null) {
            m32733a(77);
        }
        if (C9884k.a.f37539H0.contains(interfaceC10576m.getName())) {
            return C9884k.a.f37543J0.get(C10154d.m35825m(interfaceC10576m));
        }
        return null;
    }

    /* renamed from: Q */
    private InterfaceC10552e m32731Q(EnumC9882i enumC9882i) {
        if (enumC9882i == null) {
            m32733a(16);
        }
        return m32753p(enumC9882i.m32816v().m35455k());
    }

    /* renamed from: S */
    public static EnumC9882i m32732S(InterfaceC10576m interfaceC10576m) {
        if (interfaceC10576m == null) {
            m32733a(76);
        }
        if (C9884k.a.f37537G0.contains(interfaceC10576m.getName())) {
            return C9884k.a.f37541I0.get(C10154d.m35825m(interfaceC10576m));
        }
        return null;
    }

    /* renamed from: a */
    private static /* synthetic */ void m32733a(int i2) {
        String str;
        int i3;
        switch (i2) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                i3 = 2;
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
            case 72:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 76:
            case 77:
            case 89:
            case 96:
            case 103:
            case 107:
            case 108:
            case 145:
            case 146:
            case 148:
            case 156:
            case 157:
            case 158:
            case 159:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 98:
            case 100:
            case 102:
            case 104:
            case 106:
            case 135:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 53:
            case 88:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case 99:
            case 105:
            case 109:
            case 110:
            case 111:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 147:
            case 149:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 161:
                objArr[0] = "type";
                break;
            case 46:
                objArr[0] = "classSimpleName";
                break;
            case 67:
                objArr[0] = "arrayType";
                break;
            case 71:
                objArr[0] = "notNullArrayType";
                break;
            case 73:
                objArr[0] = "primitiveType";
                break;
            case 75:
                objArr[0] = "kotlinType";
                break;
            case 78:
            case 82:
                objArr[0] = "projectionType";
                break;
            case 79:
            case 83:
            case 85:
                objArr[0] = "argument";
                break;
            case 80:
                objArr[0] = "annotations";
                break;
            case 101:
                objArr[0] = "typeConstructor";
                break;
            case 112:
                objArr[0] = "classDescriptor";
                break;
            case 160:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i2) {
            case 3:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 4:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 5:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 6:
                objArr[1] = "getStorageManager";
                break;
            case 7:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 11:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 13:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 15:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 18:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKFunction";
                break;
            case 20:
                objArr[1] = "getKSuspendFunction";
                break;
            case 21:
                objArr[1] = "getKClass";
                break;
            case 22:
                objArr[1] = "getKCallable";
                break;
            case 23:
                objArr[1] = "getKProperty";
                break;
            case 24:
                objArr[1] = "getKProperty0";
                break;
            case 25:
                objArr[1] = "getKProperty1";
                break;
            case 26:
                objArr[1] = "getKProperty2";
                break;
            case 27:
                objArr[1] = "getKMutableProperty0";
                break;
            case 28:
                objArr[1] = "getKMutableProperty1";
                break;
            case 29:
                objArr[1] = "getKMutableProperty2";
                break;
            case 30:
                objArr[1] = "getIterator";
                break;
            case 31:
                objArr[1] = "getIterable";
                break;
            case 32:
                objArr[1] = "getMutableIterable";
                break;
            case 33:
                objArr[1] = "getMutableIterator";
                break;
            case 34:
                objArr[1] = "getCollection";
                break;
            case 35:
                objArr[1] = "getMutableCollection";
                break;
            case 36:
                objArr[1] = "getList";
                break;
            case 37:
                objArr[1] = "getMutableList";
                break;
            case 38:
                objArr[1] = "getSet";
                break;
            case 39:
                objArr[1] = "getMutableSet";
                break;
            case 40:
                objArr[1] = "getMap";
                break;
            case 41:
                objArr[1] = "getMutableMap";
                break;
            case 42:
                objArr[1] = "getMapEntry";
                break;
            case 43:
                objArr[1] = "getMutableMapEntry";
                break;
            case 44:
                objArr[1] = "getListIterator";
                break;
            case 45:
                objArr[1] = "getMutableListIterator";
                break;
            case 47:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 48:
                objArr[1] = "getNothingType";
                break;
            case 49:
                objArr[1] = "getNullableNothingType";
                break;
            case 50:
                objArr[1] = "getAnyType";
                break;
            case 51:
                objArr[1] = "getNullableAnyType";
                break;
            case 52:
                objArr[1] = "getDefaultBound";
                break;
            case 54:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 55:
                objArr[1] = "getNumberType";
                break;
            case 56:
                objArr[1] = "getByteType";
                break;
            case 57:
                objArr[1] = "getShortType";
                break;
            case 58:
                objArr[1] = "getIntType";
                break;
            case 59:
                objArr[1] = "getLongType";
                break;
            case 60:
                objArr[1] = "getFloatType";
                break;
            case 61:
                objArr[1] = "getDoubleType";
                break;
            case 62:
                objArr[1] = "getCharType";
                break;
            case 63:
                objArr[1] = "getBooleanType";
                break;
            case 64:
                objArr[1] = "getUnitType";
                break;
            case 65:
                objArr[1] = "getStringType";
                break;
            case 66:
                objArr[1] = "getIterableType";
                break;
            case 68:
            case 69:
            case 70:
                objArr[1] = "getArrayElementType";
                break;
            case 74:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 81:
            case 84:
                objArr[1] = "getArrayType";
                break;
            case 86:
                objArr[1] = "getEnumType";
                break;
            case 87:
                objArr[1] = "getAnnotationType";
                break;
        }
        switch (i2) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 46:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 53:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 67:
                objArr[2] = "getArrayElementType";
                break;
            case 71:
            case 72:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 73:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 75:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 76:
            case 93:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
                objArr[2] = "getArrayType";
                break;
            case 85:
                objArr[2] = "getEnumType";
                break;
            case 88:
                objArr[2] = "isArray";
                break;
            case 89:
            case 90:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 91:
                objArr[2] = "isPrimitiveArray";
                break;
            case 92:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 94:
                objArr[2] = "isPrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveClass";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 101:
            case 102:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 103:
            case 104:
                objArr[2] = "classFqNameEquals";
                break;
            case 105:
            case 106:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 107:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 108:
            case 109:
                objArr[2] = "isAny";
                break;
            case 110:
            case 112:
                objArr[2] = "isBoolean";
                break;
            case 111:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 113:
                objArr[2] = "isNumber";
                break;
            case 114:
                objArr[2] = "isChar";
                break;
            case 115:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 116:
                objArr[2] = "isInt";
                break;
            case 117:
                objArr[2] = "isByte";
                break;
            case 118:
                objArr[2] = "isLong";
                break;
            case 119:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 120:
                objArr[2] = "isShort";
                break;
            case 121:
                objArr[2] = "isFloat";
                break;
            case 122:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 123:
                objArr[2] = "isDouble";
                break;
            case 124:
                objArr[2] = "isUByte";
                break;
            case 125:
                objArr[2] = "isUShort";
                break;
            case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
                objArr[2] = "isUInt";
                break;
            case 127:
                objArr[2] = "isULong";
                break;
            case 128:
                objArr[2] = "isUByteArray";
                break;
            case 129:
                objArr[2] = "isUShortArray";
                break;
            case 130:
                objArr[2] = "isUIntArray";
                break;
            case 131:
                objArr[2] = "isULongArray";
                break;
            case 132:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 133:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 134:
            case 135:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 136:
                objArr[2] = "isNothing";
                break;
            case 137:
                objArr[2] = "isNullableNothing";
                break;
            case 138:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 139:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 140:
                objArr[2] = "isNullableAny";
                break;
            case 141:
                objArr[2] = "isDefaultBound";
                break;
            case 142:
                objArr[2] = "isUnit";
                break;
            case 143:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 144:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 145:
                objArr[2] = "isMemberOfAny";
                break;
            case 146:
            case 147:
                objArr[2] = "isEnum";
                break;
            case 148:
            case 149:
                objArr[2] = "isComparable";
                break;
            case 150:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 151:
                objArr[2] = "isListOrNullableList";
                break;
            case 152:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 153:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 154:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 155:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 156:
                objArr[2] = "isThrowable";
                break;
            case 157:
                objArr[2] = "isKClass";
                break;
            case 158:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 159:
                objArr[2] = "isCloneable";
                break;
            case 160:
                objArr[2] = "isDeprecated";
                break;
            case 161:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i2) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                throw new IllegalStateException(format);
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    /* renamed from: a0 */
    public static boolean m32734a0(InterfaceC10552e interfaceC10552e) {
        if (interfaceC10552e == null) {
            m32733a(108);
        }
        return m32741e(interfaceC10552e, C9884k.a.f37562b);
    }

    /* renamed from: b0 */
    public static boolean m32736b0(AbstractC10311e0 abstractC10311e0) {
        if (abstractC10311e0 == null) {
            m32733a(139);
        }
        return m32744g0(abstractC10311e0, C9884k.a.f37562b);
    }

    /* renamed from: c0 */
    public static boolean m32738c0(AbstractC10311e0 abstractC10311e0) {
        if (abstractC10311e0 == null) {
            m32733a(88);
        }
        return m32744g0(abstractC10311e0, C9884k.a.f37576i);
    }

    /* renamed from: d0 */
    public static boolean m32740d0(InterfaceC10552e interfaceC10552e) {
        if (interfaceC10552e == null) {
            m32733a(89);
        }
        return m32741e(interfaceC10552e, C9884k.a.f37576i) || m32730P(interfaceC10552e) != null;
    }

    /* renamed from: e */
    private static boolean m32741e(InterfaceC10561h interfaceC10561h, C10128d c10128d) {
        if (interfaceC10561h == null) {
            m32733a(103);
        }
        if (c10128d == null) {
            m32733a(104);
        }
        return interfaceC10561h.getName().equals(c10128d.m35438i()) && c10128d.equals(C10154d.m35825m(interfaceC10561h));
    }

    /* renamed from: e0 */
    public static boolean m32742e0(AbstractC10311e0 abstractC10311e0) {
        if (abstractC10311e0 == null) {
            m32733a(90);
        }
        return m32738c0(abstractC10311e0) || m32754p0(abstractC10311e0);
    }

    /* renamed from: f0 */
    public static boolean m32743f0(InterfaceC10576m interfaceC10576m) {
        if (interfaceC10576m == null) {
            m32733a(9);
        }
        return C10154d.m35830r(interfaceC10576m, InterfaceC9875b.class, false) != null;
    }

    /* renamed from: g0 */
    private static boolean m32744g0(AbstractC10311e0 abstractC10311e0, C10128d c10128d) {
        if (abstractC10311e0 == null) {
            m32733a(97);
        }
        if (c10128d == null) {
            m32733a(98);
        }
        return m32761v0(abstractC10311e0.mo35993O0(), c10128d);
    }

    /* renamed from: h0 */
    private static boolean m32745h0(AbstractC10311e0 abstractC10311e0, C10128d c10128d) {
        if (abstractC10311e0 == null) {
            m32733a(134);
        }
        if (c10128d == null) {
            m32733a(135);
        }
        return m32744g0(abstractC10311e0, c10128d) && !abstractC10311e0.mo33691P0();
    }

    /* renamed from: i0 */
    public static boolean m32746i0(AbstractC10311e0 abstractC10311e0) {
        if (abstractC10311e0 == null) {
            m32733a(141);
        }
        return m32752o0(abstractC10311e0);
    }

    /* renamed from: j0 */
    public static boolean m32747j0(InterfaceC10576m interfaceC10576m) {
        if (interfaceC10576m == null) {
            m32733a(160);
        }
        if (interfaceC10576m.mo37019a().getAnnotations().mo33270R0(C9884k.a.f37608y)) {
            return true;
        }
        if (!(interfaceC10576m instanceof InterfaceC10696t0)) {
            return false;
        }
        InterfaceC10696t0 interfaceC10696t0 = (InterfaceC10696t0) interfaceC10576m;
        boolean mo37031j0 = interfaceC10696t0.mo37031j0();
        InterfaceC10698u0 getter = interfaceC10696t0.getGetter();
        InterfaceC10700v0 setter = interfaceC10696t0.getSetter();
        if (getter != null && m32747j0(getter)) {
            if (!mo37031j0) {
                return true;
            }
            if (setter != null && m32747j0(setter)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k0 */
    public static boolean m32748k0(InterfaceC10552e interfaceC10552e) {
        if (interfaceC10552e == null) {
            m32733a(157);
        }
        return m32741e(interfaceC10552e, C9884k.a.f37577i0);
    }

    /* renamed from: l0 */
    private static boolean m32749l0(AbstractC10311e0 abstractC10311e0, C10128d c10128d) {
        if (abstractC10311e0 == null) {
            m32733a(105);
        }
        if (c10128d == null) {
            m32733a(106);
        }
        return !abstractC10311e0.mo33691P0() && m32744g0(abstractC10311e0, c10128d);
    }

    /* renamed from: m0 */
    public static boolean m32750m0(AbstractC10311e0 abstractC10311e0) {
        if (abstractC10311e0 == null) {
            m32733a(136);
        }
        return m32751n0(abstractC10311e0) && !C10339n1.m36779l(abstractC10311e0);
    }

    /* renamed from: n0 */
    public static boolean m32751n0(AbstractC10311e0 abstractC10311e0) {
        if (abstractC10311e0 == null) {
            m32733a(138);
        }
        return m32744g0(abstractC10311e0, C9884k.a.f37564c);
    }

    /* renamed from: o0 */
    public static boolean m32752o0(AbstractC10311e0 abstractC10311e0) {
        if (abstractC10311e0 == null) {
            m32733a(140);
        }
        return m32736b0(abstractC10311e0) && abstractC10311e0.mo33691P0();
    }

    /* renamed from: p */
    private InterfaceC10552e m32753p(String str) {
        if (str == null) {
            m32733a(14);
        }
        InterfaceC10552e invoke = this.f37459f.invoke(C10130f.m35454x(str));
        if (invoke == null) {
            m32733a(15);
        }
        return invoke;
    }

    /* renamed from: p0 */
    public static boolean m32754p0(AbstractC10311e0 abstractC10311e0) {
        if (abstractC10311e0 == null) {
            m32733a(91);
        }
        InterfaceC10561h mo32887c = abstractC10311e0.mo35993O0().mo32887c();
        return (mo32887c == null || m32730P(mo32887c) == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public AbstractC10335m0 m32755q(String str) {
        if (str == null) {
            m32733a(46);
        }
        AbstractC10335m0 mo36400s = m32753p(str).mo36400s();
        if (mo36400s == null) {
            m32733a(47);
        }
        return mo36400s;
    }

    /* renamed from: q0 */
    public static boolean m32756q0(InterfaceC10552e interfaceC10552e) {
        if (interfaceC10552e == null) {
            m32733a(96);
        }
        return m32732S(interfaceC10552e) != null;
    }

    /* renamed from: r0 */
    public static boolean m32757r0(AbstractC10311e0 abstractC10311e0) {
        if (abstractC10311e0 == null) {
            m32733a(94);
        }
        return !abstractC10311e0.mo33691P0() && m32758s0(abstractC10311e0);
    }

    /* renamed from: s0 */
    public static boolean m32758s0(AbstractC10311e0 abstractC10311e0) {
        if (abstractC10311e0 == null) {
            m32733a(95);
        }
        InterfaceC10561h mo32887c = abstractC10311e0.mo35993O0().mo32887c();
        return (mo32887c instanceof InterfaceC10552e) && m32756q0((InterfaceC10552e) mo32887c);
    }

    /* renamed from: t0 */
    public static boolean m32759t0(InterfaceC10552e interfaceC10552e) {
        if (interfaceC10552e == null) {
            m32733a(107);
        }
        return m32741e(interfaceC10552e, C9884k.a.f37562b) || m32741e(interfaceC10552e, C9884k.a.f37564c);
    }

    /* renamed from: u0 */
    public static boolean m32760u0(AbstractC10311e0 abstractC10311e0) {
        return abstractC10311e0 != null && m32749l0(abstractC10311e0, C9884k.a.f37574h);
    }

    /* renamed from: v0 */
    public static boolean m32761v0(InterfaceC10312e1 interfaceC10312e1, C10128d c10128d) {
        if (interfaceC10312e1 == null) {
            m32733a(101);
        }
        if (c10128d == null) {
            m32733a(102);
        }
        InterfaceC10561h mo32887c = interfaceC10312e1.mo32887c();
        return (mo32887c instanceof InterfaceC10552e) && m32741e(mo32887c, c10128d);
    }

    /* renamed from: w0 */
    public static boolean m32762w0(AbstractC10311e0 abstractC10311e0) {
        if (abstractC10311e0 == null) {
            m32733a(128);
        }
        return m32745h0(abstractC10311e0, C9884k.a.f37529C0.m35428j());
    }

    /* renamed from: x0 */
    public static boolean m32763x0(AbstractC10311e0 abstractC10311e0) {
        if (abstractC10311e0 == null) {
            m32733a(130);
        }
        return m32745h0(abstractC10311e0, C9884k.a.f37533E0.m35428j());
    }

    /* renamed from: y0 */
    public static boolean m32764y0(AbstractC10311e0 abstractC10311e0) {
        if (abstractC10311e0 == null) {
            m32733a(131);
        }
        return m32745h0(abstractC10311e0, C9884k.a.f37535F0.m35428j());
    }

    /* renamed from: z0 */
    public static boolean m32765z0(AbstractC10311e0 abstractC10311e0) {
        if (abstractC10311e0 == null) {
            m32733a(129);
        }
        return m32745h0(abstractC10311e0, C9884k.a.f37531D0.m35428j());
    }

    /* renamed from: B */
    public AbstractC10335m0 m32766B() {
        AbstractC10335m0 m32780R = m32780R(EnumC9882i.FLOAT);
        if (m32780R == null) {
            m32733a(60);
        }
        return m32780R;
    }

    /* renamed from: C */
    public InterfaceC10552e m32767C(int i2) {
        return m32753p(C9884k.m32827b(i2));
    }

    /* renamed from: D */
    public AbstractC10335m0 m32768D() {
        AbstractC10335m0 m32780R = m32780R(EnumC9882i.INT);
        if (m32780R == null) {
            m32733a(58);
        }
        return m32780R;
    }

    /* renamed from: D0 */
    public void m32769D0(C10641x c10641x) {
        if (c10641x == null) {
            m32733a(1);
        }
        this.f37460g.mo36517e(new d(c10641x));
    }

    /* renamed from: E */
    public InterfaceC10552e m32770E() {
        InterfaceC10552e m32797o = m32797o(C9884k.a.f37577i0.m35441l());
        if (m32797o == null) {
            m32733a(21);
        }
        return m32797o;
    }

    /* renamed from: F */
    public AbstractC10335m0 m32771F() {
        AbstractC10335m0 m32780R = m32780R(EnumC9882i.LONG);
        if (m32780R == null) {
            m32733a(59);
        }
        return m32780R;
    }

    /* renamed from: G */
    public InterfaceC10552e m32772G() {
        return m32753p("Nothing");
    }

    /* renamed from: H */
    public AbstractC10335m0 m32773H() {
        AbstractC10335m0 mo36400s = m32772G().mo36400s();
        if (mo36400s == null) {
            m32733a(48);
        }
        return mo36400s;
    }

    /* renamed from: I */
    public AbstractC10335m0 m32774I() {
        AbstractC10335m0 mo33545S0 = m32791i().mo33545S0(true);
        if (mo33545S0 == null) {
            m32733a(51);
        }
        return mo33545S0;
    }

    /* renamed from: J */
    public AbstractC10335m0 m32775J() {
        AbstractC10335m0 mo33545S0 = m32773H().mo33545S0(true);
        if (mo33545S0 == null) {
            m32733a(49);
        }
        return mo33545S0;
    }

    /* renamed from: K */
    public InterfaceC10552e m32776K() {
        return m32753p("Number");
    }

    /* renamed from: L */
    public AbstractC10335m0 m32777L() {
        AbstractC10335m0 mo36400s = m32776K().mo36400s();
        if (mo36400s == null) {
            m32733a(55);
        }
        return mo36400s;
    }

    /* renamed from: M */
    protected InterfaceC10599c mo32778M() {
        InterfaceC10599c.b bVar = InterfaceC10599c.b.f40891a;
        if (bVar == null) {
            m32733a(4);
        }
        return bVar;
    }

    /* renamed from: O */
    public AbstractC10335m0 m32779O(EnumC9882i enumC9882i) {
        if (enumC9882i == null) {
            m32733a(73);
        }
        AbstractC10335m0 abstractC10335m0 = this.f37457d.invoke().f37466a.get(enumC9882i);
        if (abstractC10335m0 == null) {
            m32733a(74);
        }
        return abstractC10335m0;
    }

    /* renamed from: R */
    public AbstractC10335m0 m32780R(EnumC9882i enumC9882i) {
        if (enumC9882i == null) {
            m32733a(53);
        }
        AbstractC10335m0 mo36400s = m32731Q(enumC9882i).mo36400s();
        if (mo36400s == null) {
            m32733a(54);
        }
        return mo36400s;
    }

    /* renamed from: T */
    public AbstractC10335m0 m32781T() {
        AbstractC10335m0 m32780R = m32780R(EnumC9882i.SHORT);
        if (m32780R == null) {
            m32733a(57);
        }
        return m32780R;
    }

    /* renamed from: U */
    protected InterfaceC10297n m32782U() {
        InterfaceC10297n interfaceC10297n = this.f37460g;
        if (interfaceC10297n == null) {
            m32733a(6);
        }
        return interfaceC10297n;
    }

    /* renamed from: V */
    public InterfaceC10552e m32783V() {
        return m32753p("String");
    }

    /* renamed from: W */
    public AbstractC10335m0 m32784W() {
        AbstractC10335m0 mo36400s = m32783V().mo36400s();
        if (mo36400s == null) {
            m32733a(65);
        }
        return mo36400s;
    }

    /* renamed from: X */
    public InterfaceC10552e m32785X(int i2) {
        InterfaceC10552e m32797o = m32797o(C9884k.f37509j.m35421c(C10130f.m35454x(C9884k.m32829d(i2))));
        if (m32797o == null) {
            m32733a(18);
        }
        return m32797o;
    }

    /* renamed from: Y */
    public InterfaceC10552e m32786Y() {
        return m32753p("Unit");
    }

    /* renamed from: Z */
    public AbstractC10335m0 m32787Z() {
        AbstractC10335m0 mo36400s = m32786Y().mo36400s();
        if (mo36400s == null) {
            m32733a(64);
        }
        return mo36400s;
    }

    /* renamed from: f */
    protected void m32788f(boolean z) {
        C10641x c10641x = new C10641x(f37454a, this.f37460g, this, null);
        this.f37455b = c10641x;
        c10641x.m37993T0(InterfaceC9874a.f37446a.m32698a().mo32697a(this.f37460g, this.f37455b, mo32802v(), mo32778M(), mo32789g(), z));
        C10641x c10641x2 = this.f37455b;
        c10641x2.m37998Z0(c10641x2);
    }

    /* renamed from: g */
    protected InterfaceC10597a mo32789g() {
        InterfaceC10597a.a aVar = InterfaceC10597a.a.f40889a;
        if (aVar == null) {
            m32733a(3);
        }
        return aVar;
    }

    /* renamed from: h */
    public InterfaceC10552e m32790h() {
        return m32753p("Any");
    }

    /* renamed from: i */
    public AbstractC10335m0 m32791i() {
        AbstractC10335m0 mo36400s = m32790h().mo36400s();
        if (mo36400s == null) {
            m32733a(50);
        }
        return mo36400s;
    }

    /* renamed from: j */
    public InterfaceC10552e m32792j() {
        return m32753p("Array");
    }

    /* renamed from: k */
    public AbstractC10311e0 m32793k(AbstractC10311e0 abstractC10311e0) {
        AbstractC10311e0 m32725A;
        if (abstractC10311e0 == null) {
            m32733a(67);
        }
        if (m32738c0(abstractC10311e0)) {
            if (abstractC10311e0.mo35991M0().size() != 1) {
                throw new IllegalStateException();
            }
            AbstractC10311e0 type = abstractC10311e0.mo35991M0().get(0).getType();
            if (type == null) {
                m32733a(68);
            }
            return type;
        }
        AbstractC10311e0 m36781n = C10339n1.m36781n(abstractC10311e0);
        AbstractC10335m0 abstractC10335m0 = this.f37457d.invoke().f37468c.get(m36781n);
        if (abstractC10335m0 != null) {
            return abstractC10335m0;
        }
        InterfaceC10559g0 m35821i = C10154d.m35821i(m36781n);
        if (m35821i != null && (m32725A = m32725A(m36781n, m35821i)) != null) {
            return m32725A;
        }
        throw new IllegalStateException("not array: " + abstractC10311e0);
    }

    /* renamed from: l */
    public AbstractC10335m0 m32794l(EnumC10351r1 enumC10351r1, AbstractC10311e0 abstractC10311e0) {
        if (enumC10351r1 == null) {
            m32733a(82);
        }
        if (abstractC10311e0 == null) {
            m32733a(83);
        }
        AbstractC10335m0 m32795m = m32795m(enumC10351r1, abstractC10311e0, InterfaceC10587g.f40808c.m37735b());
        if (m32795m == null) {
            m32733a(84);
        }
        return m32795m;
    }

    /* renamed from: m */
    public AbstractC10335m0 m32795m(EnumC10351r1 enumC10351r1, AbstractC10311e0 abstractC10311e0, InterfaceC10587g interfaceC10587g) {
        if (enumC10351r1 == null) {
            m32733a(78);
        }
        if (abstractC10311e0 == null) {
            m32733a(79);
        }
        if (interfaceC10587g == null) {
            m32733a(80);
        }
        AbstractC10335m0 m36667g = C10314f0.m36667g(C10303b1.m36587b(interfaceC10587g), m32792j(), Collections.singletonList(new C10324i1(enumC10351r1, abstractC10311e0)));
        if (m36667g == null) {
            m32733a(81);
        }
        return m36667g;
    }

    /* renamed from: n */
    public AbstractC10335m0 m32796n() {
        AbstractC10335m0 m32780R = m32780R(EnumC9882i.BOOLEAN);
        if (m32780R == null) {
            m32733a(63);
        }
        return m32780R;
    }

    /* renamed from: o */
    public InterfaceC10552e m32797o(C10127c c10127c) {
        if (c10127c == null) {
            m32733a(12);
        }
        InterfaceC10552e m38125c = C10693s.m38125c(m32798r(), c10127c, EnumC9908d.FROM_BUILTINS);
        if (m38125c == null) {
            m32733a(13);
        }
        return m38125c;
    }

    /* renamed from: r */
    public C10641x m32798r() {
        if (this.f37455b == null) {
            this.f37455b = this.f37456c.invoke();
        }
        C10641x c10641x = this.f37455b;
        if (c10641x == null) {
            m32733a(7);
        }
        return c10641x;
    }

    /* renamed from: s */
    public InterfaceC10218h m32799s() {
        InterfaceC10218h mo37751q = m32798r().mo37018N(C9884k.f37517r).mo37751q();
        if (mo37751q == null) {
            m32733a(11);
        }
        return mo37751q;
    }

    /* renamed from: t */
    public AbstractC10335m0 m32800t() {
        AbstractC10335m0 m32780R = m32780R(EnumC9882i.BYTE);
        if (m32780R == null) {
            m32733a(56);
        }
        return m32780R;
    }

    /* renamed from: u */
    public AbstractC10335m0 m32801u() {
        AbstractC10335m0 m32780R = m32780R(EnumC9882i.CHAR);
        if (m32780R == null) {
            m32733a(62);
        }
        return m32780R;
    }

    /* renamed from: v */
    protected Iterable<InterfaceC10598b> mo32802v() {
        List singletonList = Collections.singletonList(new C9889a(this.f37460g, m32798r()));
        if (singletonList == null) {
            m32733a(5);
        }
        return singletonList;
    }

    /* renamed from: w */
    public InterfaceC10552e m32803w() {
        InterfaceC10552e m32797o = m32797o(C9884k.a.f37554U);
        if (m32797o == null) {
            m32733a(34);
        }
        return m32797o;
    }

    /* renamed from: x */
    public InterfaceC10552e m32804x() {
        return m32753p("Comparable");
    }

    /* renamed from: y */
    public AbstractC10335m0 m32805y() {
        AbstractC10335m0 m32774I = m32774I();
        if (m32774I == null) {
            m32733a(52);
        }
        return m32774I;
    }

    /* renamed from: z */
    public AbstractC10335m0 m32806z() {
        AbstractC10335m0 m32780R = m32780R(EnumC9882i.DOUBLE);
        if (m32780R == null) {
            m32733a(61);
        }
        return m32780R;
    }
}
