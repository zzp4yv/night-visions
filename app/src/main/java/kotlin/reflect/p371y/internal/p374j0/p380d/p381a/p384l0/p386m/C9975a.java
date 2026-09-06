package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p386m;

import java.util.Set;
import kotlin.collections.C10787v0;
import kotlin.collections.C10791x0;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.EnumC9940k;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;

/* compiled from: JavaTypeResolver.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.m.a */
/* loaded from: classes2.dex */
public final class C9975a {

    /* renamed from: a */
    private final EnumC9940k f38153a;

    /* renamed from: b */
    private final EnumC9976b f38154b;

    /* renamed from: c */
    private final boolean f38155c;

    /* renamed from: d */
    private final Set<InterfaceC10554e1> f38156d;

    /* renamed from: e */
    private final AbstractC10335m0 f38157e;

    /* JADX WARN: Multi-variable type inference failed */
    public C9975a(EnumC9940k enumC9940k, EnumC9976b enumC9976b, boolean z, Set<? extends InterfaceC10554e1> set, AbstractC10335m0 abstractC10335m0) {
        C9768m.m32346f(enumC9940k, "howThisTypeIsUsed");
        C9768m.m32346f(enumC9976b, "flexibility");
        this.f38153a = enumC9940k;
        this.f38154b = enumC9976b;
        this.f38155c = z;
        this.f38156d = set;
        this.f38157e = abstractC10335m0;
    }

    /* renamed from: b */
    public static /* synthetic */ C9975a m33499b(C9975a c9975a, EnumC9940k enumC9940k, EnumC9976b enumC9976b, boolean z, Set set, AbstractC10335m0 abstractC10335m0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            enumC9940k = c9975a.f38153a;
        }
        if ((i2 & 2) != 0) {
            enumC9976b = c9975a.f38154b;
        }
        EnumC9976b enumC9976b2 = enumC9976b;
        if ((i2 & 4) != 0) {
            z = c9975a.f38155c;
        }
        boolean z2 = z;
        if ((i2 & 8) != 0) {
            set = c9975a.f38156d;
        }
        Set set2 = set;
        if ((i2 & 16) != 0) {
            abstractC10335m0 = c9975a.f38157e;
        }
        return c9975a.m33500a(enumC9940k, enumC9976b2, z2, set2, abstractC10335m0);
    }

    /* renamed from: a */
    public final C9975a m33500a(EnumC9940k enumC9940k, EnumC9976b enumC9976b, boolean z, Set<? extends InterfaceC10554e1> set, AbstractC10335m0 abstractC10335m0) {
        C9768m.m32346f(enumC9940k, "howThisTypeIsUsed");
        C9768m.m32346f(enumC9976b, "flexibility");
        return new C9975a(enumC9940k, enumC9976b, z, set, abstractC10335m0);
    }

    /* renamed from: c */
    public final AbstractC10335m0 m33501c() {
        return this.f38157e;
    }

    /* renamed from: d */
    public final EnumC9976b m33502d() {
        return this.f38154b;
    }

    /* renamed from: e */
    public final EnumC9940k m33503e() {
        return this.f38153a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9975a)) {
            return false;
        }
        C9975a c9975a = (C9975a) obj;
        return this.f38153a == c9975a.f38153a && this.f38154b == c9975a.f38154b && this.f38155c == c9975a.f38155c && C9768m.m32341a(this.f38156d, c9975a.f38156d) && C9768m.m32341a(this.f38157e, c9975a.f38157e);
    }

    /* renamed from: f */
    public final Set<InterfaceC10554e1> m33504f() {
        return this.f38156d;
    }

    /* renamed from: g */
    public final boolean m33505g() {
        return this.f38155c;
    }

    /* renamed from: h */
    public final C9975a m33506h(AbstractC10335m0 abstractC10335m0) {
        return m33499b(this, null, null, false, null, abstractC10335m0, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f38153a.hashCode() * 31) + this.f38154b.hashCode()) * 31;
        boolean z = this.f38155c;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode + i2) * 31;
        Set<InterfaceC10554e1> set = this.f38156d;
        int hashCode2 = (i3 + (set == null ? 0 : set.hashCode())) * 31;
        AbstractC10335m0 abstractC10335m0 = this.f38157e;
        return hashCode2 + (abstractC10335m0 != null ? abstractC10335m0.hashCode() : 0);
    }

    /* renamed from: i */
    public final C9975a m33507i(EnumC9976b enumC9976b) {
        C9768m.m32346f(enumC9976b, "flexibility");
        return m33499b(this, null, enumC9976b, false, null, null, 29, null);
    }

    /* renamed from: j */
    public final C9975a m33508j(InterfaceC10554e1 interfaceC10554e1) {
        C9768m.m32346f(interfaceC10554e1, "typeParameter");
        Set<InterfaceC10554e1> set = this.f38156d;
        return m33499b(this, null, null, false, set != null ? C10791x0.m38926m(set, interfaceC10554e1) : C10787v0.m38916c(interfaceC10554e1), null, 23, null);
    }

    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f38153a + ", flexibility=" + this.f38154b + ", isForAnnotationParameter=" + this.f38155c + ", visitedTypeParameters=" + this.f38156d + ", defaultType=" + this.f38157e + ')';
    }

    public /* synthetic */ C9975a(EnumC9940k enumC9940k, EnumC9976b enumC9976b, boolean z, Set set, AbstractC10335m0 abstractC10335m0, int i2, C9756g c9756g) {
        this(enumC9940k, (i2 & 2) != 0 ? EnumC9976b.INFLEXIBLE : enumC9976b, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? null : set, (i2 & 16) != 0 ? null : abstractC10335m0);
    }
}
