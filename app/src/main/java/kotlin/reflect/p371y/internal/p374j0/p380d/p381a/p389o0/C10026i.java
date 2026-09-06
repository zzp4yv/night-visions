package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0;

import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;

/* compiled from: NullabilityQualifierWithMigrationStatus.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.o0.i */
/* loaded from: classes3.dex */
public final class C10026i {

    /* renamed from: a */
    private final EnumC10025h f38230a;

    /* renamed from: b */
    private final boolean f38231b;

    public C10026i(EnumC10025h enumC10025h, boolean z) {
        C9768m.m32346f(enumC10025h, "qualifier");
        this.f38230a = enumC10025h;
        this.f38231b = z;
    }

    /* renamed from: b */
    public static /* synthetic */ C10026i m33699b(C10026i c10026i, EnumC10025h enumC10025h, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            enumC10025h = c10026i.f38230a;
        }
        if ((i2 & 2) != 0) {
            z = c10026i.f38231b;
        }
        return c10026i.m33700a(enumC10025h, z);
    }

    /* renamed from: a */
    public final C10026i m33700a(EnumC10025h enumC10025h, boolean z) {
        C9768m.m32346f(enumC10025h, "qualifier");
        return new C10026i(enumC10025h, z);
    }

    /* renamed from: c */
    public final EnumC10025h m33701c() {
        return this.f38230a;
    }

    /* renamed from: d */
    public final boolean m33702d() {
        return this.f38231b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10026i)) {
            return false;
        }
        C10026i c10026i = (C10026i) obj;
        return this.f38230a == c10026i.f38230a && this.f38231b == c10026i.f38231b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f38230a.hashCode() * 31;
        boolean z = this.f38231b;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return hashCode + i2;
    }

    public String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f38230a + ", isForWarningOnly=" + this.f38231b + ')';
    }

    public /* synthetic */ C10026i(EnumC10025h enumC10025h, boolean z, int i2, C9756g c9756g) {
        this(enumC10025h, (i2 & 2) != 0 ? false : z);
    }
}
