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
/* renamed from: kotlin.f0.y.e.j0.b.m */
/* loaded from: classes2.dex */
public final class EnumC9886m {

    /* renamed from: f */
    public static final EnumC9886m f37613f;

    /* renamed from: g */
    public static final EnumC9886m f37614g;

    /* renamed from: h */
    public static final EnumC9886m f37615h;

    /* renamed from: i */
    public static final EnumC9886m f37616i;

    /* renamed from: j */
    private static final /* synthetic */ EnumC9886m[] f37617j;

    /* renamed from: k */
    private final C10126b f37618k;

    /* renamed from: l */
    private final C10130f f37619l;

    static {
        C10126b m35406e = C10126b.m35406e("kotlin/UByteArray");
        C9768m.m32345e(m35406e, "fromString(\"kotlin/UByteArray\")");
        f37613f = new EnumC9886m("UBYTEARRAY", 0, m35406e);
        C10126b m35406e2 = C10126b.m35406e("kotlin/UShortArray");
        C9768m.m32345e(m35406e2, "fromString(\"kotlin/UShortArray\")");
        f37614g = new EnumC9886m("USHORTARRAY", 1, m35406e2);
        C10126b m35406e3 = C10126b.m35406e("kotlin/UIntArray");
        C9768m.m32345e(m35406e3, "fromString(\"kotlin/UIntArray\")");
        f37615h = new EnumC9886m("UINTARRAY", 2, m35406e3);
        C10126b m35406e4 = C10126b.m35406e("kotlin/ULongArray");
        C9768m.m32345e(m35406e4, "fromString(\"kotlin/ULongArray\")");
        f37616i = new EnumC9886m("ULONGARRAY", 3, m35406e4);
        f37617j = m32838g();
    }

    private EnumC9886m(String str, int i2, C10126b c10126b) {
        this.f37618k = c10126b;
        C10130f m35415j = c10126b.m35415j();
        C9768m.m32345e(m35415j, "classId.shortClassName");
        this.f37619l = m35415j;
    }

    /* renamed from: g */
    private static final /* synthetic */ EnumC9886m[] m32838g() {
        return new EnumC9886m[]{f37613f, f37614g, f37615h, f37616i};
    }

    public static EnumC9886m valueOf(String str) {
        return (EnumC9886m) Enum.valueOf(EnumC9886m.class, str);
    }

    public static EnumC9886m[] values() {
        return (EnumC9886m[]) f37617j.clone();
    }

    /* renamed from: k */
    public final C10130f m32839k() {
        return this.f37619l;
    }
}
