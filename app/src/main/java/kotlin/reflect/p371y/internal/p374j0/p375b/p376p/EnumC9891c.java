package kotlin.reflect.p371y.internal.p374j0.p375b.p376p;

import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9884k;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.text.C10513u;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'i' uses external variables
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
/* compiled from: FunctionClassKind.kt */
/* renamed from: kotlin.f0.y.e.j0.b.p.c */
/* loaded from: classes2.dex */
public final class EnumC9891c {

    /* renamed from: f */
    public static final a f37649f;

    /* renamed from: g */
    public static final EnumC9891c f37650g = new EnumC9891c("Function", 0, C9884k.f37517r, "Function", false, false);

    /* renamed from: h */
    public static final EnumC9891c f37651h = new EnumC9891c("SuspendFunction", 1, C9884k.f37509j, "SuspendFunction", true, false);

    /* renamed from: i */
    public static final EnumC9891c f37652i;

    /* renamed from: j */
    public static final EnumC9891c f37653j;

    /* renamed from: k */
    private static final /* synthetic */ EnumC9891c[] f37654k;

    /* renamed from: l */
    private final C10127c f37655l;

    /* renamed from: m */
    private final String f37656m;

    /* renamed from: n */
    private final boolean f37657n;

    /* renamed from: o */
    private final boolean f37658o;

    /* compiled from: FunctionClassKind.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.p.c$a */
    public static final class a {

        /* compiled from: FunctionClassKind.kt */
        /* renamed from: kotlin.f0.y.e.j0.b.p.c$a$a, reason: collision with other inner class name */
        public static final class C11494a {

            /* renamed from: a */
            private final EnumC9891c f37659a;

            /* renamed from: b */
            private final int f37660b;

            public C11494a(EnumC9891c enumC9891c, int i2) {
                C9768m.m32346f(enumC9891c, "kind");
                this.f37659a = enumC9891c;
                this.f37660b = i2;
            }

            /* renamed from: a */
            public final EnumC9891c m32901a() {
                return this.f37659a;
            }

            /* renamed from: b */
            public final int m32902b() {
                return this.f37660b;
            }

            /* renamed from: c */
            public final EnumC9891c m32903c() {
                return this.f37659a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C11494a)) {
                    return false;
                }
                C11494a c11494a = (C11494a) obj;
                return this.f37659a == c11494a.f37659a && this.f37660b == c11494a.f37660b;
            }

            public int hashCode() {
                return (this.f37659a.hashCode() * 31) + this.f37660b;
            }

            public String toString() {
                return "KindWithArity(kind=" + this.f37659a + ", arity=" + this.f37660b + ')';
            }
        }

        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: d */
        private final Integer m32897d(String str) {
            if (str.length() == 0) {
                return null;
            }
            int length = str.length();
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                int charAt = str.charAt(i3) - '0';
                if (!(charAt >= 0 && charAt < 10)) {
                    return null;
                }
                i2 = (i2 * 10) + charAt;
            }
            return Integer.valueOf(i2);
        }

        /* renamed from: a */
        public final EnumC9891c m32898a(C10127c c10127c, String str) {
            C9768m.m32346f(c10127c, "packageFqName");
            C9768m.m32346f(str, "className");
            for (EnumC9891c enumC9891c : EnumC9891c.values()) {
                if (C9768m.m32341a(enumC9891c.m32895q(), c10127c) && C10513u.m37511E(str, enumC9891c.m32894k(), false, 2, null)) {
                    return enumC9891c;
                }
            }
            return null;
        }

        /* renamed from: b */
        public final EnumC9891c m32899b(String str, C10127c c10127c) {
            C9768m.m32346f(str, "className");
            C9768m.m32346f(c10127c, "packageFqName");
            C11494a m32900c = m32900c(str, c10127c);
            if (m32900c != null) {
                return m32900c.m32903c();
            }
            return null;
        }

        /* renamed from: c */
        public final C11494a m32900c(String str, C10127c c10127c) {
            C9768m.m32346f(str, "className");
            C9768m.m32346f(c10127c, "packageFqName");
            EnumC9891c m32898a = m32898a(c10127c, str);
            if (m32898a == null) {
                return null;
            }
            String substring = str.substring(m32898a.m32894k().length());
            C9768m.m32345e(substring, "this as java.lang.String).substring(startIndex)");
            Integer m32897d = m32897d(substring);
            if (m32897d != null) {
                return new C11494a(m32898a, m32897d.intValue());
            }
            return null;
        }
    }

    static {
        C10127c c10127c = C9884k.f37514o;
        f37652i = new EnumC9891c("KFunction", 2, c10127c, "KFunction", false, true);
        f37653j = new EnumC9891c("KSuspendFunction", 3, c10127c, "KSuspendFunction", true, true);
        f37654k = m32893g();
        f37649f = new a(null);
    }

    private EnumC9891c(String str, int i2, C10127c c10127c, String str2, boolean z, boolean z2) {
        this.f37655l = c10127c;
        this.f37656m = str2;
        this.f37657n = z;
        this.f37658o = z2;
    }

    /* renamed from: g */
    private static final /* synthetic */ EnumC9891c[] m32893g() {
        return new EnumC9891c[]{f37650g, f37651h, f37652i, f37653j};
    }

    public static EnumC9891c valueOf(String str) {
        return (EnumC9891c) Enum.valueOf(EnumC9891c.class, str);
    }

    public static EnumC9891c[] values() {
        return (EnumC9891c[]) f37654k.clone();
    }

    /* renamed from: k */
    public final String m32894k() {
        return this.f37656m;
    }

    /* renamed from: q */
    public final C10127c m32895q() {
        return this.f37655l;
    }

    /* renamed from: u */
    public final C10130f m32896u(int i2) {
        C10130f m35454x = C10130f.m35454x(this.f37656m + i2);
        C9768m.m32345e(m35454x, "identifier(\"$classNamePrefix$arity\")");
        return m35454x;
    }
}
