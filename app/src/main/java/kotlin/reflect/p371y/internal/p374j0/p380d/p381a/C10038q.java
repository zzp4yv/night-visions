package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import java.util.Collection;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.C10026i;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.EnumC10025h;

/* compiled from: AnnotationQualifiersFqNames.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.q */
/* loaded from: classes2.dex */
public final class C10038q {

    /* renamed from: a */
    private final C10026i f38299a;

    /* renamed from: b */
    private final Collection<EnumC9913b> f38300b;

    /* renamed from: c */
    private final boolean f38301c;

    /* JADX WARN: Multi-variable type inference failed */
    public C10038q(C10026i c10026i, Collection<? extends EnumC9913b> collection, boolean z) {
        C9768m.m32346f(c10026i, "nullabilityQualifier");
        C9768m.m32346f(collection, "qualifierApplicabilityTypes");
        this.f38299a = c10026i;
        this.f38300b = collection;
        this.f38301c = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static /* synthetic */ C10038q m33783b(C10038q c10038q, C10026i c10026i, Collection collection, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            c10026i = c10038q.f38299a;
        }
        if ((i2 & 2) != 0) {
            collection = c10038q.f38300b;
        }
        if ((i2 & 4) != 0) {
            z = c10038q.f38301c;
        }
        return c10038q.m33784a(c10026i, collection, z);
    }

    /* renamed from: a */
    public final C10038q m33784a(C10026i c10026i, Collection<? extends EnumC9913b> collection, boolean z) {
        C9768m.m32346f(c10026i, "nullabilityQualifier");
        C9768m.m32346f(collection, "qualifierApplicabilityTypes");
        return new C10038q(c10026i, collection, z);
    }

    /* renamed from: c */
    public final boolean m33785c() {
        return this.f38301c;
    }

    /* renamed from: d */
    public final C10026i m33786d() {
        return this.f38299a;
    }

    /* renamed from: e */
    public final Collection<EnumC9913b> m33787e() {
        return this.f38300b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10038q)) {
            return false;
        }
        C10038q c10038q = (C10038q) obj;
        return C9768m.m32341a(this.f38299a, c10038q.f38299a) && C9768m.m32341a(this.f38300b, c10038q.f38300b) && this.f38301c == c10038q.f38301c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f38299a.hashCode() * 31) + this.f38300b.hashCode()) * 31;
        boolean z = this.f38301c;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return hashCode + i2;
    }

    public String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f38299a + ", qualifierApplicabilityTypes=" + this.f38300b + ", definitelyNotNull=" + this.f38301c + ')';
    }

    public /* synthetic */ C10038q(C10026i c10026i, Collection collection, boolean z, int i2, C9756g c9756g) {
        this(c10026i, collection, (i2 & 4) != 0 ? c10026i.m33701c() == EnumC10025h.NOT_NULL : z);
    }
}
