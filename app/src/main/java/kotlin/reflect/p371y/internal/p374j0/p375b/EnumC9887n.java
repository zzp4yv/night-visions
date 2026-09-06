package kotlin.reflect.p371y.internal.p374j0.p375b;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'f' uses external variables
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
/* compiled from: UnsignedType.kt */
/* renamed from: kotlin.f0.y.e.j0.b.n */
/* loaded from: classes2.dex */
public final class EnumC9887n {

    /* renamed from: f */
    public static final EnumC9887n f37620f;

    /* renamed from: g */
    public static final EnumC9887n f37621g;

    /* renamed from: h */
    public static final EnumC9887n f37622h;

    /* renamed from: i */
    public static final EnumC9887n f37623i;

    /* renamed from: j */
    private static final /* synthetic */ EnumC9887n[] f37624j;

    /* renamed from: k */
    private final C10126b f37625k;

    /* renamed from: l */
    private final C10130f f37626l;

    /* renamed from: m */
    private final C10126b f37627m;

    static {
        C10126b m35406e = C10126b.m35406e("kotlin/UByte");
        C9768m.m32345e(m35406e, "fromString(\"kotlin/UByte\")");
        f37620f = new EnumC9887n("UBYTE", 0, m35406e);
        C10126b m35406e2 = C10126b.m35406e("kotlin/UShort");
        C9768m.m32345e(m35406e2, "fromString(\"kotlin/UShort\")");
        f37621g = new EnumC9887n("USHORT", 1, m35406e2);
        C10126b m35406e3 = C10126b.m35406e("kotlin/UInt");
        C9768m.m32345e(m35406e3, "fromString(\"kotlin/UInt\")");
        f37622h = new EnumC9887n("UINT", 2, m35406e3);
        C10126b m35406e4 = C10126b.m35406e("kotlin/ULong");
        C9768m.m32345e(m35406e4, "fromString(\"kotlin/ULong\")");
        f37623i = new EnumC9887n("ULONG", 3, m35406e4);
        f37624j = m32840g();
    }

    private EnumC9887n(String str, int i2, C10126b c10126b) {
        this.f37625k = c10126b;
        C10130f m35415j = c10126b.m35415j();
        C9768m.m32345e(m35415j, "classId.shortClassName");
        this.f37626l = m35415j;
        this.f37627m = new C10126b(c10126b.m35413h(), C10130f.m35454x(m35415j.m35455k() + "Array"));
    }

    /* renamed from: g */
    private static final /* synthetic */ EnumC9887n[] m32840g() {
        return new EnumC9887n[]{f37620f, f37621g, f37622h, f37623i};
    }

    public static EnumC9887n valueOf(String str) {
        return (EnumC9887n) Enum.valueOf(EnumC9887n.class, str);
    }

    public static EnumC9887n[] values() {
        return (EnumC9887n[]) f37624j.clone();
    }

    /* renamed from: k */
    public final C10126b m32841k() {
        return this.f37627m;
    }

    /* renamed from: q */
    public final C10126b m32842q() {
        return this.f37625k;
    }

    /* renamed from: u */
    public final C10130f m32843u() {
        return this.f37626l;
    }
}
