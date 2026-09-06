package kotlin.reflect.p371y.internal.p374j0.p400i;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10697u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10695t;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10550d0;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10555f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10542a1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10569j1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10571k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10602p;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10603p0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10644q;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10700v0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10702w0;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9888o;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10128d;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10132h;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10317g0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10339n1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10361e;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10394k;

/* compiled from: DescriptorUtils.java */
/* renamed from: kotlin.f0.y.e.j0.i.d */
/* loaded from: classes3.dex */
public class C10154d {

    /* renamed from: a */
    public static final C10127c f39506a = new C10127c("kotlin.jvm.JvmName");

    /* renamed from: A */
    public static boolean m35800A(InterfaceC10576m interfaceC10576m) {
        return m35803D(interfaceC10576m, EnumC10555f.ENUM_CLASS);
    }

    /* renamed from: B */
    public static boolean m35801B(InterfaceC10576m interfaceC10576m) {
        if (interfaceC10576m == null) {
            m35813a(36);
        }
        return m35803D(interfaceC10576m, EnumC10555f.ENUM_ENTRY);
    }

    /* renamed from: C */
    public static boolean m35802C(InterfaceC10576m interfaceC10576m) {
        return m35803D(interfaceC10576m, EnumC10555f.INTERFACE);
    }

    /* renamed from: D */
    private static boolean m35803D(InterfaceC10576m interfaceC10576m, EnumC10555f enumC10555f) {
        if (enumC10555f == null) {
            m35813a(37);
        }
        return (interfaceC10576m instanceof InterfaceC10552e) && ((InterfaceC10552e) interfaceC10576m).mo32878i() == enumC10555f;
    }

    /* renamed from: E */
    public static boolean m35804E(InterfaceC10576m interfaceC10576m) {
        if (interfaceC10576m == null) {
            m35813a(1);
        }
        while (interfaceC10576m != null) {
            if (m35833u(interfaceC10576m) || m35837y(interfaceC10576m)) {
                return true;
            }
            interfaceC10576m = interfaceC10576m.mo32876b();
        }
        return false;
    }

    /* renamed from: F */
    private static boolean m35805F(AbstractC10311e0 abstractC10311e0, InterfaceC10576m interfaceC10576m) {
        if (abstractC10311e0 == null) {
            m35813a(30);
        }
        if (interfaceC10576m == null) {
            m35813a(31);
        }
        InterfaceC10561h mo32887c = abstractC10311e0.mo35993O0().mo32887c();
        if (mo32887c == null) {
            return false;
        }
        InterfaceC10576m mo37019a = mo32887c.mo37019a();
        return (mo37019a instanceof InterfaceC10561h) && (interfaceC10576m instanceof InterfaceC10561h) && ((InterfaceC10561h) interfaceC10576m).mo32877h().equals(((InterfaceC10561h) mo37019a).mo32877h());
    }

    /* renamed from: G */
    public static boolean m35806G(InterfaceC10576m interfaceC10576m) {
        return (m35803D(interfaceC10576m, EnumC10555f.CLASS) || m35803D(interfaceC10576m, EnumC10555f.INTERFACE)) && ((InterfaceC10552e) interfaceC10576m).mo32879j() == EnumC10550d0.SEALED;
    }

    /* renamed from: H */
    public static boolean m35807H(InterfaceC10552e interfaceC10552e, InterfaceC10552e interfaceC10552e2) {
        if (interfaceC10552e == null) {
            m35813a(28);
        }
        if (interfaceC10552e2 == null) {
            m35813a(29);
        }
        return m35808I(interfaceC10552e.mo36400s(), interfaceC10552e2.mo37019a());
    }

    /* renamed from: I */
    public static boolean m35808I(AbstractC10311e0 abstractC10311e0, InterfaceC10576m interfaceC10576m) {
        if (abstractC10311e0 == null) {
            m35813a(32);
        }
        if (interfaceC10576m == null) {
            m35813a(33);
        }
        if (m35805F(abstractC10311e0, interfaceC10576m)) {
            return true;
        }
        Iterator<AbstractC10311e0> it = abstractC10311e0.mo35993O0().mo35998a().iterator();
        while (it.hasNext()) {
            if (m35808I(it.next(), interfaceC10576m)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: J */
    public static boolean m35809J(InterfaceC10576m interfaceC10576m) {
        return interfaceC10576m != null && (interfaceC10576m.mo32876b() instanceof InterfaceC10571k0);
    }

    /* renamed from: K */
    public static boolean m35810K(InterfaceC10569j1 interfaceC10569j1, AbstractC10311e0 abstractC10311e0) {
        if (interfaceC10569j1 == null) {
            m35813a(63);
        }
        if (abstractC10311e0 == null) {
            m35813a(64);
        }
        if (interfaceC10569j1.mo37031j0() || C10317g0.m36706a(abstractC10311e0)) {
            return false;
        }
        if (C10339n1.m36769b(abstractC10311e0)) {
            return true;
        }
        AbstractC9881h m36072f = C10202a.m36072f(interfaceC10569j1);
        if (!AbstractC9881h.m32757r0(abstractC10311e0)) {
            InterfaceC10361e interfaceC10361e = InterfaceC10361e.f40181a;
            if (!interfaceC10361e.mo36919b(m36072f.m32784W(), abstractC10311e0) && !interfaceC10361e.mo36919b(m36072f.m32776K().mo36400s(), abstractC10311e0) && !interfaceC10361e.mo36919b(m36072f.m32791i(), abstractC10311e0)) {
                C9888o c9888o = C9888o.f37628a;
                if (!C9888o.m32844d(abstractC10311e0)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: L */
    public static <D extends InterfaceC10543b> D m35811L(D d2) {
        if (d2 == null) {
            m35813a(59);
        }
        while (d2.mo37030i() == InterfaceC10543b.a.FAKE_OVERRIDE) {
            Collection<? extends InterfaceC10543b> mo37027e = d2.mo37027e();
            if (mo37027e.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + d2);
            }
            d2 = (D) mo37027e.iterator().next();
        }
        return d2;
    }

    /* renamed from: M */
    public static <D extends InterfaceC10644q> D m35812M(D d2) {
        if (d2 == null) {
            m35813a(61);
        }
        if (d2 instanceof InterfaceC10543b) {
            return m35811L((InterfaceC10543b) d2);
        }
        if (d2 == null) {
            m35813a(62);
        }
        return d2;
    }

    /* renamed from: a */
    private static /* synthetic */ void m35813a(int i2) {
        String str;
        int i3;
        switch (i2) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                i3 = 2;
                break;
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 59:
            case 61:
            case 79:
            case 92:
            case 94:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 64:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 65:
            case 66:
            case 67:
            case 74:
            case 75:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 63:
                objArr[0] = "variable";
                break;
            case 68:
                objArr[0] = "f";
                break;
            case 70:
                objArr[0] = "current";
                break;
            case 71:
                objArr[0] = "result";
                break;
            case 72:
                objArr[0] = "memberDescriptor";
                break;
            case 76:
            case 77:
            case 78:
                objArr[0] = "annotated";
                break;
            case 82:
            case 84:
            case 87:
            case 89:
                objArr[0] = "scope";
                break;
            case 85:
            case 88:
            case 90:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i2) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 69:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 73:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 80:
            case 81:
                objArr[1] = "getContainingSourceFile";
                break;
            case 83:
                objArr[1] = "getAllDescriptors";
                break;
            case 86:
                objArr[1] = "getFunctionByName";
                break;
            case 91:
                objArr[1] = "getPropertyByName";
                break;
            case 93:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i2) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 63:
            case 64:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 65:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 66:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 67:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 68:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 70:
            case 71:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 72:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 74:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 75:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 76:
                objArr[2] = "getJvmName";
                break;
            case 77:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 78:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 79:
                objArr[2] = "getContainingSourceFile";
                break;
            case 82:
                objArr[2] = "getAllDescriptors";
                break;
            case 84:
            case 85:
                objArr[2] = "getFunctionByName";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 89:
            case 90:
                objArr[2] = "getPropertyByName";
                break;
            case 92:
                objArr[2] = "getDirectMember";
                break;
            case 94:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String format = String.format(str, objArr);
        switch (i2) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    /* renamed from: b */
    public static boolean m35814b(InterfaceC10576m interfaceC10576m, InterfaceC10576m interfaceC10576m2) {
        if (interfaceC10576m == null) {
            m35813a(16);
        }
        if (interfaceC10576m2 == null) {
            m35813a(17);
        }
        return m35819g(interfaceC10576m).equals(m35819g(interfaceC10576m2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    private static <D extends InterfaceC10540a> void m35815c(D d2, Set<D> set) {
        if (d2 == null) {
            m35813a(70);
        }
        if (set == 0) {
            m35813a(71);
        }
        if (set.contains(d2)) {
            return;
        }
        Iterator<? extends InterfaceC10540a> it = d2.mo37019a().mo37027e().iterator();
        while (it.hasNext()) {
            InterfaceC10540a mo37019a = it.next().mo37019a();
            m35815c(mo37019a, set);
            set.add(mo37019a);
        }
    }

    /* renamed from: d */
    public static <D extends InterfaceC10540a> Set<D> m35816d(D d2) {
        if (d2 == null) {
            m35813a(68);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m35815c(d2.mo37019a(), linkedHashSet);
        return linkedHashSet;
    }

    /* renamed from: e */
    public static InterfaceC10552e m35817e(AbstractC10311e0 abstractC10311e0) {
        if (abstractC10311e0 == null) {
            m35813a(45);
        }
        return m35818f(abstractC10311e0.mo35993O0());
    }

    /* renamed from: f */
    public static InterfaceC10552e m35818f(InterfaceC10312e1 interfaceC10312e1) {
        if (interfaceC10312e1 == null) {
            m35813a(46);
        }
        InterfaceC10552e interfaceC10552e = (InterfaceC10552e) interfaceC10312e1.mo32887c();
        if (interfaceC10552e == null) {
            m35813a(47);
        }
        return interfaceC10552e;
    }

    /* renamed from: g */
    public static InterfaceC10559g0 m35819g(InterfaceC10576m interfaceC10576m) {
        if (interfaceC10576m == null) {
            m35813a(21);
        }
        InterfaceC10559g0 m35820h = m35820h(interfaceC10576m);
        if (m35820h == null) {
            m35813a(22);
        }
        return m35820h;
    }

    /* renamed from: h */
    public static InterfaceC10559g0 m35820h(InterfaceC10576m interfaceC10576m) {
        if (interfaceC10576m == null) {
            m35813a(23);
        }
        while (interfaceC10576m != null) {
            if (interfaceC10576m instanceof InterfaceC10559g0) {
                return (InterfaceC10559g0) interfaceC10576m;
            }
            if (interfaceC10576m instanceof InterfaceC10603p0) {
                return ((InterfaceC10603p0) interfaceC10576m).mo37752v0();
            }
            interfaceC10576m = interfaceC10576m.mo32876b();
        }
        return null;
    }

    /* renamed from: i */
    public static InterfaceC10559g0 m35821i(AbstractC10311e0 abstractC10311e0) {
        if (abstractC10311e0 == null) {
            m35813a(20);
        }
        InterfaceC10561h mo32887c = abstractC10311e0.mo35993O0().mo32887c();
        if (mo32887c == null) {
            return null;
        }
        return m35820h(mo32887c);
    }

    /* renamed from: j */
    public static InterfaceC10542a1 m35822j(InterfaceC10576m interfaceC10576m) {
        if (interfaceC10576m == null) {
            m35813a(79);
        }
        if (interfaceC10576m instanceof InterfaceC10700v0) {
            interfaceC10576m = ((InterfaceC10700v0) interfaceC10576m).mo37763B0();
        }
        if (interfaceC10576m instanceof InterfaceC10602p) {
            InterfaceC10542a1 mo33980a = ((InterfaceC10602p) interfaceC10576m).mo32883t().mo33980a();
            if (mo33980a == null) {
                m35813a(80);
            }
            return mo33980a;
        }
        InterfaceC10542a1 interfaceC10542a1 = InterfaceC10542a1.f40728a;
        if (interfaceC10542a1 == null) {
            m35813a(81);
        }
        return interfaceC10542a1;
    }

    /* renamed from: k */
    public static AbstractC10697u m35823k(InterfaceC10552e interfaceC10552e, boolean z) {
        if (interfaceC10552e == null) {
            m35813a(48);
        }
        EnumC10555f mo32878i = interfaceC10552e.mo32878i();
        if (mo32878i == EnumC10555f.ENUM_CLASS || mo32878i.m37681k()) {
            AbstractC10697u abstractC10697u = C10695t.f41216a;
            if (abstractC10697u == null) {
                m35813a(49);
            }
            return abstractC10697u;
        }
        if (m35806G(interfaceC10552e)) {
            if (z) {
                AbstractC10697u abstractC10697u2 = C10695t.f41218c;
                if (abstractC10697u2 == null) {
                    m35813a(50);
                }
                return abstractC10697u2;
            }
            AbstractC10697u abstractC10697u3 = C10695t.f41216a;
            if (abstractC10697u3 == null) {
                m35813a(51);
            }
            return abstractC10697u3;
        }
        if (m35833u(interfaceC10552e)) {
            AbstractC10697u abstractC10697u4 = C10695t.f41227l;
            if (abstractC10697u4 == null) {
                m35813a(52);
            }
            return abstractC10697u4;
        }
        AbstractC10697u abstractC10697u5 = C10695t.f41220e;
        if (abstractC10697u5 == null) {
            m35813a(53);
        }
        return abstractC10697u5;
    }

    /* renamed from: l */
    public static InterfaceC10702w0 m35824l(InterfaceC10576m interfaceC10576m) {
        if (interfaceC10576m == null) {
            m35813a(0);
        }
        if (interfaceC10576m instanceof InterfaceC10552e) {
            return ((InterfaceC10552e) interfaceC10576m).mo37677K0();
        }
        return null;
    }

    /* renamed from: m */
    public static C10128d m35825m(InterfaceC10576m interfaceC10576m) {
        if (interfaceC10576m == null) {
            m35813a(2);
        }
        C10127c m35827o = m35827o(interfaceC10576m);
        return m35827o != null ? m35827o.m35428j() : m35828p(interfaceC10576m);
    }

    /* renamed from: n */
    public static C10127c m35826n(InterfaceC10576m interfaceC10576m) {
        if (interfaceC10576m == null) {
            m35813a(3);
        }
        C10127c m35827o = m35827o(interfaceC10576m);
        if (m35827o == null) {
            m35827o = m35828p(interfaceC10576m).m35441l();
        }
        if (m35827o == null) {
            m35813a(4);
        }
        return m35827o;
    }

    /* renamed from: o */
    private static C10127c m35827o(InterfaceC10576m interfaceC10576m) {
        if (interfaceC10576m == null) {
            m35813a(5);
        }
        if ((interfaceC10576m instanceof InterfaceC10559g0) || C10394k.m37054m(interfaceC10576m)) {
            return C10127c.f39250a;
        }
        if (interfaceC10576m instanceof InterfaceC10603p0) {
            return ((InterfaceC10603p0) interfaceC10576m).mo37750d();
        }
        if (interfaceC10576m instanceof InterfaceC10571k0) {
            return ((InterfaceC10571k0) interfaceC10576m).mo37712d();
        }
        return null;
    }

    /* renamed from: p */
    private static C10128d m35828p(InterfaceC10576m interfaceC10576m) {
        if (interfaceC10576m == null) {
            m35813a(6);
        }
        C10128d m35433c = m35825m(interfaceC10576m.mo32876b()).m35433c(interfaceC10576m.getName());
        if (m35433c == null) {
            m35813a(7);
        }
        return m35433c;
    }

    /* renamed from: q */
    public static <D extends InterfaceC10576m> D m35829q(InterfaceC10576m interfaceC10576m, Class<D> cls) {
        if (cls == null) {
            m35813a(18);
        }
        return (D) m35830r(interfaceC10576m, cls, true);
    }

    /* renamed from: r */
    public static <D extends InterfaceC10576m> D m35830r(InterfaceC10576m interfaceC10576m, Class<D> cls, boolean z) {
        if (cls == null) {
            m35813a(19);
        }
        if (interfaceC10576m == null) {
            return null;
        }
        if (z) {
            interfaceC10576m = (D) interfaceC10576m.mo32876b();
        }
        while (interfaceC10576m != null) {
            if (cls.isInstance(interfaceC10576m)) {
                return (D) interfaceC10576m;
            }
            interfaceC10576m = (D) interfaceC10576m.mo32876b();
        }
        return null;
    }

    /* renamed from: s */
    public static InterfaceC10552e m35831s(InterfaceC10552e interfaceC10552e) {
        if (interfaceC10552e == null) {
            m35813a(44);
        }
        Iterator<AbstractC10311e0> it = interfaceC10552e.mo32877h().mo35998a().iterator();
        while (it.hasNext()) {
            InterfaceC10552e m35817e = m35817e(it.next());
            if (m35817e.mo32878i() != EnumC10555f.INTERFACE) {
                return m35817e;
            }
        }
        return null;
    }

    /* renamed from: t */
    public static boolean m35832t(InterfaceC10576m interfaceC10576m) {
        return m35803D(interfaceC10576m, EnumC10555f.ANNOTATION_CLASS);
    }

    /* renamed from: u */
    public static boolean m35833u(InterfaceC10576m interfaceC10576m) {
        if (interfaceC10576m == null) {
            m35813a(34);
        }
        return m35834v(interfaceC10576m) && interfaceC10576m.getName().equals(C10132h.f39266b);
    }

    /* renamed from: v */
    public static boolean m35834v(InterfaceC10576m interfaceC10576m) {
        return m35803D(interfaceC10576m, EnumC10555f.CLASS);
    }

    /* renamed from: w */
    public static boolean m35835w(InterfaceC10576m interfaceC10576m) {
        return m35834v(interfaceC10576m) || m35800A(interfaceC10576m);
    }

    /* renamed from: x */
    public static boolean m35836x(InterfaceC10576m interfaceC10576m) {
        return m35803D(interfaceC10576m, EnumC10555f.OBJECT) && ((InterfaceC10552e) interfaceC10576m).mo32857A();
    }

    /* renamed from: y */
    public static boolean m35837y(InterfaceC10576m interfaceC10576m) {
        return (interfaceC10576m instanceof InterfaceC10644q) && ((InterfaceC10644q) interfaceC10576m).getVisibility() == C10695t.f41221f;
    }

    /* renamed from: z */
    public static boolean m35838z(InterfaceC10552e interfaceC10552e, InterfaceC10552e interfaceC10552e2) {
        if (interfaceC10552e == null) {
            m35813a(26);
        }
        if (interfaceC10552e2 == null) {
            m35813a(27);
        }
        Iterator<AbstractC10311e0> it = interfaceC10552e.mo32877h().mo35998a().iterator();
        while (it.hasNext()) {
            if (m35805F(it.next(), interfaceC10552e2.mo37019a())) {
                return true;
            }
        }
        return false;
    }
}
