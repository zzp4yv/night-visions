package kotlin.reflect.p371y.internal.p374j0.p375b;

import java.util.Set;
import kotlin.C10517i;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.C10789w0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 kotlin.f0.y.e.j0.b.i, still in use, count: 1, list:
  (r0v1 kotlin.f0.y.e.j0.b.i) from 0x006e: FILLED_NEW_ARRAY 
  (r0v1 kotlin.f0.y.e.j0.b.i)
  (r1v2 kotlin.f0.y.e.j0.b.i)
  (r4v2 kotlin.f0.y.e.j0.b.i)
  (r6v2 kotlin.f0.y.e.j0.b.i)
  (r8v2 kotlin.f0.y.e.j0.b.i)
  (r10v2 kotlin.f0.y.e.j0.b.i)
  (r12v2 kotlin.f0.y.e.j0.b.i)
 A[WRAPPED] elemType: kotlin.f0.y.e.j0.b.i
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: PrimitiveType.kt */
/* renamed from: kotlin.f0.y.e.j0.b.i */
/* loaded from: classes2.dex */
public final class EnumC9882i {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");


    /* renamed from: g */
    public static final Set<EnumC9882i> f37470g;

    /* renamed from: q */
    private final C10130f f37480q;

    /* renamed from: r */
    private final C10130f f37481r;

    /* renamed from: s */
    private final Lazy f37482s;

    /* renamed from: t */
    private final Lazy f37483t;

    /* renamed from: f */
    public static final a f37469f = new a(null);

    /* compiled from: PrimitiveType.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.i$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }
    }

    /* compiled from: PrimitiveType.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.i$b */
    static final class b extends Lambda implements Function0<C10127c> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C10127c invoke() {
            C10127c m35421c = C9884k.f37517r.m35421c(EnumC9882i.this.m32814q());
            C9768m.m32345e(m35421c, "BUILT_INS_PACKAGE_FQ_NAME.child(arrayTypeName)");
            return m35421c;
        }
    }

    /* compiled from: PrimitiveType.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.i$c */
    static final class c extends Lambda implements Function0<C10127c> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C10127c invoke() {
            C10127c m35421c = C9884k.f37517r.m35421c(EnumC9882i.this.m32816v());
            C9768m.m32345e(m35421c, "BUILT_INS_PACKAGE_FQ_NAME.child(this.typeName)");
            return m35421c;
        }
    }

    static {
        Set<EnumC9882i> m38922i;
        m38922i = C10789w0.m38922i(new EnumC9882i("Char"), new EnumC9882i("Byte"), new EnumC9882i("Short"), new EnumC9882i("Int"), new EnumC9882i("Float"), new EnumC9882i("Long"), new EnumC9882i("Double"));
        f37470g = m38922i;
    }

    private EnumC9882i(String str) {
        Lazy m37593a;
        Lazy m37593a2;
        C10130f m35454x = C10130f.m35454x(str);
        C9768m.m32345e(m35454x, "identifier(typeName)");
        this.f37480q = m35454x;
        C10130f m35454x2 = C10130f.m35454x(str + "Array");
        C9768m.m32345e(m35454x2, "identifier(\"${typeName}Array\")");
        this.f37481r = m35454x2;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        m37593a = C10517i.m37593a(lazyThreadSafetyMode, new c());
        this.f37482s = m37593a;
        m37593a2 = C10517i.m37593a(lazyThreadSafetyMode, new b());
        this.f37483t = m37593a2;
    }

    public static EnumC9882i valueOf(String str) {
        return (EnumC9882i) Enum.valueOf(EnumC9882i.class, str);
    }

    public static EnumC9882i[] values() {
        return (EnumC9882i[]) f37479p.clone();
    }

    /* renamed from: k */
    public final C10127c m32813k() {
        return (C10127c) this.f37483t.getValue();
    }

    /* renamed from: q */
    public final C10130f m32814q() {
        return this.f37481r;
    }

    /* renamed from: u */
    public final C10127c m32815u() {
        return (C10127c) this.f37482s.getValue();
    }

    /* renamed from: v */
    public final C10130f m32816v() {
        return this.f37480q;
    }
}
