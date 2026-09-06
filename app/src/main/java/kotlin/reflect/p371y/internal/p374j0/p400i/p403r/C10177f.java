package kotlin.reflect.p371y.internal.p374j0.p400i.p403r;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;

/* compiled from: ClassLiteralValue.kt */
/* renamed from: kotlin.f0.y.e.j0.i.r.f */
/* loaded from: classes3.dex */
public final class C10177f {

    /* renamed from: a */
    private final C10126b f39557a;

    /* renamed from: b */
    private final int f39558b;

    public C10177f(C10126b c10126b, int i2) {
        C9768m.m32346f(c10126b, "classId");
        this.f39557a = c10126b;
        this.f39558b = i2;
    }

    /* renamed from: a */
    public final C10126b m36019a() {
        return this.f39557a;
    }

    /* renamed from: b */
    public final int m36020b() {
        return this.f39558b;
    }

    /* renamed from: c */
    public final int m36021c() {
        return this.f39558b;
    }

    /* renamed from: d */
    public final C10126b m36022d() {
        return this.f39557a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10177f)) {
            return false;
        }
        C10177f c10177f = (C10177f) obj;
        return C9768m.m32341a(this.f39557a, c10177f.f39557a) && this.f39558b == c10177f.f39558b;
    }

    public int hashCode() {
        return (this.f39557a.hashCode() * 31) + this.f39558b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i2 = this.f39558b;
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append("kotlin/Array<");
        }
        sb.append(this.f39557a);
        int i4 = this.f39558b;
        for (int i5 = 0; i5 < i4; i5++) {
            sb.append(">");
        }
        String sb2 = sb.toString();
        C9768m.m32345e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
