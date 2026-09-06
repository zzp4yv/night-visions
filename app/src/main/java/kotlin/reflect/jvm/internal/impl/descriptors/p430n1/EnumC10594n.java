package kotlin.reflect.jvm.internal.impl.descriptors.p430n1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C10740s;
import kotlin.collections.C10749c0;
import kotlin.collections.C10770n;
import kotlin.collections.C10777q0;
import kotlin.collections.C10782t;
import kotlin.collections.C10784u;
import kotlin.jvm.internal.C9756g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'z' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: KotlinTarget.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n1.n */
/* loaded from: classes2.dex */
public final class EnumC10594n {

    /* renamed from: A */
    public static final EnumC10594n f40827A;

    /* renamed from: B */
    public static final EnumC10594n f40828B;

    /* renamed from: C */
    public static final EnumC10594n f40829C;

    /* renamed from: D */
    public static final EnumC10594n f40830D;

    /* renamed from: E */
    public static final EnumC10594n f40831E;

    /* renamed from: F */
    public static final EnumC10594n f40832F;

    /* renamed from: G */
    public static final EnumC10594n f40833G;

    /* renamed from: h */
    private static final Set<EnumC10594n> f40862h;

    /* renamed from: i */
    private static final Set<EnumC10594n> f40864i;

    /* renamed from: j */
    private static final List<EnumC10594n> f40866j;

    /* renamed from: k */
    private static final List<EnumC10594n> f40868k;

    /* renamed from: l */
    private static final List<EnumC10594n> f40870l;

    /* renamed from: m */
    private static final List<EnumC10594n> f40872m;

    /* renamed from: n */
    private static final List<EnumC10594n> f40874n;

    /* renamed from: o */
    private static final List<EnumC10594n> f40875o;

    /* renamed from: p */
    private static final List<EnumC10594n> f40876p;

    /* renamed from: q */
    private static final List<EnumC10594n> f40877q;

    /* renamed from: r */
    private static final List<EnumC10594n> f40878r;

    /* renamed from: s */
    private static final List<EnumC10594n> f40879s;

    /* renamed from: t */
    private static final List<EnumC10594n> f40880t;

    /* renamed from: u */
    private static final List<EnumC10594n> f40881u;

    /* renamed from: v */
    private static final Map<EnumC10585e, EnumC10594n> f40882v;

    /* renamed from: z */
    public static final EnumC10594n f40886z;

    /* renamed from: n0 */
    private final String f40887n0;

    /* renamed from: o0 */
    private final boolean f40888o0;

    /* renamed from: w */
    public static final EnumC10594n f40883w = new EnumC10594n("CLASS", 0, "class", false, 2, null);

    /* renamed from: x */
    public static final EnumC10594n f40884x = new EnumC10594n("ANNOTATION_CLASS", 1, "annotation class", false, 2, null);

    /* renamed from: y */
    public static final EnumC10594n f40885y = new EnumC10594n("TYPE_PARAMETER", 2, "type parameter", false);

    /* renamed from: H */
    public static final EnumC10594n f40834H = new EnumC10594n("TYPE", 11, "type usage", false);

    /* renamed from: I */
    public static final EnumC10594n f40835I = new EnumC10594n("EXPRESSION", 12, "expression", false);

    /* renamed from: J */
    public static final EnumC10594n f40836J = new EnumC10594n("FILE", 13, "file", false);

    /* renamed from: K */
    public static final EnumC10594n f40837K = new EnumC10594n("TYPEALIAS", 14, "typealias", false);

    /* renamed from: L */
    public static final EnumC10594n f40838L = new EnumC10594n("TYPE_PROJECTION", 15, "type projection", false);

    /* renamed from: M */
    public static final EnumC10594n f40839M = new EnumC10594n("STAR_PROJECTION", 16, "star projection", false);

    /* renamed from: N */
    public static final EnumC10594n f40840N = new EnumC10594n("PROPERTY_PARAMETER", 17, "property constructor parameter", false);

    /* renamed from: O */
    public static final EnumC10594n f40841O = new EnumC10594n("CLASS_ONLY", 18, "class", false);

    /* renamed from: P */
    public static final EnumC10594n f40842P = new EnumC10594n("OBJECT", 19, "object", false);

    /* renamed from: Q */
    public static final EnumC10594n f40843Q = new EnumC10594n("COMPANION_OBJECT", 20, "companion object", false);

    /* renamed from: R */
    public static final EnumC10594n f40844R = new EnumC10594n("INTERFACE", 21, "interface", false);

    /* renamed from: S */
    public static final EnumC10594n f40845S = new EnumC10594n("ENUM_CLASS", 22, "enum class", false);

    /* renamed from: T */
    public static final EnumC10594n f40846T = new EnumC10594n("ENUM_ENTRY", 23, "enum entry", false);

    /* renamed from: U */
    public static final EnumC10594n f40847U = new EnumC10594n("LOCAL_CLASS", 24, "local class", false);

    /* renamed from: V */
    public static final EnumC10594n f40848V = new EnumC10594n("LOCAL_FUNCTION", 25, "local function", false);

    /* renamed from: W */
    public static final EnumC10594n f40849W = new EnumC10594n("MEMBER_FUNCTION", 26, "member function", false);

    /* renamed from: X */
    public static final EnumC10594n f40850X = new EnumC10594n("TOP_LEVEL_FUNCTION", 27, "top level function", false);

    /* renamed from: Y */
    public static final EnumC10594n f40851Y = new EnumC10594n("MEMBER_PROPERTY", 28, "member property", false);

    /* renamed from: Z */
    public static final EnumC10594n f40852Z = new EnumC10594n("MEMBER_PROPERTY_WITH_BACKING_FIELD", 29, "member property with backing field", false);

    /* renamed from: a0 */
    public static final EnumC10594n f40853a0 = new EnumC10594n("MEMBER_PROPERTY_WITH_DELEGATE", 30, "member property with delegate", false);

    /* renamed from: b0 */
    public static final EnumC10594n f40854b0 = new EnumC10594n("MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 31, "member property without backing field or delegate", false);

    /* renamed from: c0 */
    public static final EnumC10594n f40855c0 = new EnumC10594n("TOP_LEVEL_PROPERTY", 32, "top level property", false);

    /* renamed from: d0 */
    public static final EnumC10594n f40856d0 = new EnumC10594n("TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD", 33, "top level property with backing field", false);

    /* renamed from: e0 */
    public static final EnumC10594n f40857e0 = new EnumC10594n("TOP_LEVEL_PROPERTY_WITH_DELEGATE", 34, "top level property with delegate", false);

    /* renamed from: f0 */
    public static final EnumC10594n f40859f0 = new EnumC10594n("TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 35, "top level property without backing field or delegate", false);

    /* renamed from: g0 */
    public static final EnumC10594n f40861g0 = new EnumC10594n("BACKING_FIELD", 36, "backing field", false, 2, null);

    /* renamed from: h0 */
    public static final EnumC10594n f40863h0 = new EnumC10594n("INITIALIZER", 37, "initializer", false);

    /* renamed from: i0 */
    public static final EnumC10594n f40865i0 = new EnumC10594n("DESTRUCTURING_DECLARATION", 38, "destructuring declaration", false);

    /* renamed from: j0 */
    public static final EnumC10594n f40867j0 = new EnumC10594n("LAMBDA_EXPRESSION", 39, "lambda expression", false);

    /* renamed from: k0 */
    public static final EnumC10594n f40869k0 = new EnumC10594n("ANONYMOUS_FUNCTION", 40, "anonymous function", false);

    /* renamed from: l0 */
    public static final EnumC10594n f40871l0 = new EnumC10594n("OBJECT_LITERAL", 41, "object literal", false);

    /* renamed from: m0 */
    private static final /* synthetic */ EnumC10594n[] f40873m0 = m37746g();

    /* renamed from: f */
    public static final a f40858f = new a(null);

    /* renamed from: g */
    private static final HashMap<String, EnumC10594n> f40860g = new HashMap<>();

    /* compiled from: KotlinTarget.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n1.n$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }
    }

    static {
        Set<EnumC10594n> m38574I0;
        Set<EnumC10594n> m38758l0;
        List<EnumC10594n> m38891m;
        List<EnumC10594n> m38891m2;
        List<EnumC10594n> m38891m3;
        List<EnumC10594n> m38891m4;
        List<EnumC10594n> m38891m5;
        List<EnumC10594n> m38891m6;
        List<EnumC10594n> m38891m7;
        List<EnumC10594n> m38891m8;
        Map<EnumC10585e, EnumC10594n> m38800l;
        boolean z = false;
        int i2 = 2;
        C9756g c9756g = null;
        f40886z = new EnumC10594n("PROPERTY", 3, "property", z, i2, c9756g);
        boolean z2 = false;
        int i3 = 2;
        C9756g c9756g2 = null;
        f40827A = new EnumC10594n("FIELD", 4, "field", z2, i3, c9756g2);
        f40828B = new EnumC10594n("LOCAL_VARIABLE", 5, "local variable", z, i2, c9756g);
        f40829C = new EnumC10594n("VALUE_PARAMETER", 6, "value parameter", z2, i3, c9756g2);
        f40830D = new EnumC10594n("CONSTRUCTOR", 7, "constructor", z, i2, c9756g);
        f40831E = new EnumC10594n("FUNCTION", 8, "function", z2, i3, c9756g2);
        f40832F = new EnumC10594n("PROPERTY_GETTER", 9, "getter", z, i2, c9756g);
        f40833G = new EnumC10594n("PROPERTY_SETTER", 10, "setter", z2, i3, c9756g2);
        for (EnumC10594n enumC10594n : values()) {
            f40860g.put(enumC10594n.name(), enumC10594n);
        }
        EnumC10594n[] values = values();
        ArrayList arrayList = new ArrayList();
        for (EnumC10594n enumC10594n2 : values) {
            if (enumC10594n2.f40888o0) {
                arrayList.add(enumC10594n2);
            }
        }
        m38574I0 = C10749c0.m38574I0(arrayList);
        f40862h = m38574I0;
        m38758l0 = C10770n.m38758l0(values());
        f40864i = m38758l0;
        EnumC10594n enumC10594n3 = f40883w;
        m38891m = C10784u.m38891m(f40884x, enumC10594n3);
        f40866j = m38891m;
        m38891m2 = C10784u.m38891m(f40847U, enumC10594n3);
        f40868k = m38891m2;
        m38891m3 = C10784u.m38891m(f40841O, enumC10594n3);
        f40870l = m38891m3;
        EnumC10594n enumC10594n4 = f40842P;
        m38891m4 = C10784u.m38891m(f40843Q, enumC10594n4, enumC10594n3);
        f40872m = m38891m4;
        m38891m5 = C10784u.m38891m(enumC10594n4, enumC10594n3);
        f40874n = m38891m5;
        m38891m6 = C10784u.m38891m(f40844R, enumC10594n3);
        f40875o = m38891m6;
        m38891m7 = C10784u.m38891m(f40845S, enumC10594n3);
        f40876p = m38891m7;
        EnumC10594n enumC10594n5 = f40886z;
        EnumC10594n enumC10594n6 = f40827A;
        m38891m8 = C10784u.m38891m(f40846T, enumC10594n5, enumC10594n6);
        f40877q = m38891m8;
        EnumC10594n enumC10594n7 = f40833G;
        f40878r = C10782t.m38883e(enumC10594n7);
        EnumC10594n enumC10594n8 = f40832F;
        f40879s = C10782t.m38883e(enumC10594n8);
        f40880t = C10782t.m38883e(f40831E);
        EnumC10594n enumC10594n9 = f40836J;
        f40881u = C10782t.m38883e(enumC10594n9);
        EnumC10585e enumC10585e = EnumC10585e.CONSTRUCTOR_PARAMETER;
        EnumC10594n enumC10594n10 = f40829C;
        m38800l = C10777q0.m38800l(C10740s.m38547a(enumC10585e, enumC10594n10), C10740s.m38547a(EnumC10585e.FIELD, enumC10594n6), C10740s.m38547a(EnumC10585e.PROPERTY, enumC10594n5), C10740s.m38547a(EnumC10585e.FILE, enumC10594n9), C10740s.m38547a(EnumC10585e.PROPERTY_GETTER, enumC10594n8), C10740s.m38547a(EnumC10585e.PROPERTY_SETTER, enumC10594n7), C10740s.m38547a(EnumC10585e.RECEIVER, enumC10594n10), C10740s.m38547a(EnumC10585e.SETTER_PARAMETER, enumC10594n10), C10740s.m38547a(EnumC10585e.PROPERTY_DELEGATE_FIELD, enumC10594n6));
        f40882v = m38800l;
    }

    private EnumC10594n(String str, int i2, String str2, boolean z) {
        this.f40887n0 = str2;
        this.f40888o0 = z;
    }

    /* renamed from: g */
    private static final /* synthetic */ EnumC10594n[] m37746g() {
        return new EnumC10594n[]{f40883w, f40884x, f40885y, f40886z, f40827A, f40828B, f40829C, f40830D, f40831E, f40832F, f40833G, f40834H, f40835I, f40836J, f40837K, f40838L, f40839M, f40840N, f40841O, f40842P, f40843Q, f40844R, f40845S, f40846T, f40847U, f40848V, f40849W, f40850X, f40851Y, f40852Z, f40853a0, f40854b0, f40855c0, f40856d0, f40857e0, f40859f0, f40861g0, f40863h0, f40865i0, f40867j0, f40869k0, f40871l0};
    }

    public static EnumC10594n valueOf(String str) {
        return (EnumC10594n) Enum.valueOf(EnumC10594n.class, str);
    }

    public static EnumC10594n[] values() {
        return (EnumC10594n[]) f40873m0.clone();
    }

    /* synthetic */ EnumC10594n(String str, int i2, String str2, boolean z, int i3, C9756g c9756g) {
        this(str, i2, str2, (i3 & 2) != 0 ? true : z);
    }
}
