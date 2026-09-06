package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a;

import java.util.Set;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10678l;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10689w;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.InterfaceC10017o;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10011u;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9997g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.text.C10513u;

/* compiled from: ReflectJavaClassFinder.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.a.d */
/* loaded from: classes2.dex */
public final class C10654d implements InterfaceC10017o {

    /* renamed from: a */
    private final ClassLoader f41142a;

    public C10654d(ClassLoader classLoader) {
        C9768m.m32346f(classLoader, "classLoader");
        this.f41142a = classLoader;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.InterfaceC10017o
    /* renamed from: a */
    public InterfaceC9997g mo33629a(InterfaceC10017o.b bVar) {
        String m37524z;
        C9768m.m32346f(bVar, "request");
        C10126b m33633a = bVar.m33633a();
        C10127c m35413h = m33633a.m35413h();
        C9768m.m32345e(m35413h, "classId.packageFqName");
        String m35420b = m33633a.m35414i().m35420b();
        C9768m.m32345e(m35420b, "classId.relativeClassName.asString()");
        m37524z = C10513u.m37524z(m35420b, '.', '$', false, 4, null);
        if (!m35413h.m35422d()) {
            m37524z = m35413h.m35420b() + '.' + m37524z;
        }
        Class<?> m38024a = C10655e.m38024a(this.f41142a, m37524z);
        if (m38024a != null) {
            return new C10678l(m38024a);
        }
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.InterfaceC10017o
    /* renamed from: b */
    public Set<String> mo33630b(C10127c c10127c) {
        C9768m.m32346f(c10127c, "packageFqName");
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.InterfaceC10017o
    /* renamed from: c */
    public InterfaceC10011u mo33631c(C10127c c10127c, boolean z) {
        C9768m.m32346f(c10127c, "fqName");
        return new C10689w(c10127c);
    }
}
