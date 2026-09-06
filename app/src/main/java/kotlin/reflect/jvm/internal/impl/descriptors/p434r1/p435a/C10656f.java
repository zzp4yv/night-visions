package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a;

import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10670d;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.p391c0.C10053a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.p391c0.C10054b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.text.C10513u;

/* compiled from: ReflectKotlinClass.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.a.f */
/* loaded from: classes2.dex */
public final class C10656f implements InterfaceC10068q {

    /* renamed from: a */
    public static final a f41143a = new a(null);

    /* renamed from: b */
    private final Class<?> f41144b;

    /* renamed from: c */
    private final C10053a f41145c;

    /* compiled from: ReflectKotlinClass.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.a.f$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final C10656f m38026a(Class<?> cls) {
            C9768m.m32346f(cls, "klass");
            C10054b c10054b = new C10054b();
            C10653c.f41141a.m38022b(cls, c10054b);
            C10053a m33935m = c10054b.m33935m();
            C9756g c9756g = null;
            if (m33935m == null) {
                return null;
            }
            return new C10656f(cls, m33935m, c9756g);
        }
    }

    private C10656f(Class<?> cls, C10053a c10053a) {
        this.f41144b = cls;
        this.f41145c = c10053a;
    }

    public /* synthetic */ C10656f(Class cls, C10053a c10053a, C9756g c9756g) {
        this(cls, c10053a);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q
    /* renamed from: a */
    public C10053a mo34025a() {
        return this.f41145c;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q
    /* renamed from: b */
    public void mo34026b(InterfaceC10068q.c cVar, byte[] bArr) {
        C9768m.m32346f(cVar, "visitor");
        C10653c.f41141a.m38022b(this.f41144b, cVar);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q
    /* renamed from: c */
    public void mo34027c(InterfaceC10068q.d dVar, byte[] bArr) {
        C9768m.m32346f(dVar, "visitor");
        C10653c.f41141a.m38023i(this.f41144b, dVar);
    }

    /* renamed from: d */
    public final Class<?> m38025d() {
        return this.f41144b;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q
    /* renamed from: e */
    public C10126b mo34028e() {
        return C10670d.m38069a(this.f41144b);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10656f) && C9768m.m32341a(this.f41144b, ((C10656f) obj).f41144b);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q
    public String getLocation() {
        String m37524z;
        StringBuilder sb = new StringBuilder();
        String name = this.f41144b.getName();
        C9768m.m32345e(name, "klass.name");
        m37524z = C10513u.m37524z(name, '.', '/', false, 4, null);
        sb.append(m37524z);
        sb.append(".class");
        return sb.toString();
    }

    public int hashCode() {
        return this.f41144b.hashCode();
    }

    public String toString() {
        return C10656f.class.getName() + ": " + this.f41144b;
    }
}
