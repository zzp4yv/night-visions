package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a;

import java.io.InputStream;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9884k;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9997g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10066o;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p412f0.C10246a;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p412f0.C10249d;

/* compiled from: ReflectKotlinClassFinder.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.a.g */
/* loaded from: classes2.dex */
public final class C10657g implements InterfaceC10066o {

    /* renamed from: a */
    private final ClassLoader f41146a;

    /* renamed from: b */
    private final C10249d f41147b;

    public C10657g(ClassLoader classLoader) {
        C9768m.m32346f(classLoader, "classLoader");
        this.f41146a = classLoader;
        this.f41147b = new C10249d();
    }

    /* renamed from: d */
    private final InterfaceC10066o.a m38027d(String str) {
        C10656f m38026a;
        Class<?> m38024a = C10655e.m38024a(this.f41146a, str);
        if (m38024a == null || (m38026a = C10656f.f41143a.m38026a(m38024a)) == null) {
            return null;
        }
        return new InterfaceC10066o.a.b(m38026a, null, 2, null);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10066o
    /* renamed from: a */
    public InterfaceC10066o.a mo34018a(InterfaceC9997g interfaceC9997g) {
        String m35420b;
        C9768m.m32346f(interfaceC9997g, "javaClass");
        C10127c mo33596d = interfaceC9997g.mo33596d();
        if (mo33596d == null || (m35420b = mo33596d.m35420b()) == null) {
            return null;
        }
        return m38027d(m35420b);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10278u
    /* renamed from: b */
    public InputStream mo36473b(C10127c c10127c) {
        C9768m.m32346f(c10127c, "packageFqName");
        if (c10127c.m35427i(C9884k.f37516q)) {
            return this.f41147b.m36251a(C10246a.f39754n.m36247n(c10127c));
        }
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10066o
    /* renamed from: c */
    public InterfaceC10066o.a mo34019c(C10126b c10126b) {
        String m38029b;
        C9768m.m32346f(c10126b, "classId");
        m38029b = C10658h.m38029b(c10126b);
        return m38027d(m38029b);
    }
}
