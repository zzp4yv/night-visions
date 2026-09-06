package kotlin.reflect.p371y.internal.p374j0.p378c;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10571k0;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.C9909e;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.EnumC9910f;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9905a;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9906b;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9907c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10154d;

/* compiled from: utils.kt */
/* renamed from: kotlin.f0.y.e.j0.c.a */
/* loaded from: classes2.dex */
public final class C9904a {
    /* renamed from: a */
    public static final void m33013a(InterfaceC9907c interfaceC9907c, InterfaceC9906b interfaceC9906b, InterfaceC10552e interfaceC10552e, C10130f c10130f) {
        InterfaceC9905a location;
        C9768m.m32346f(interfaceC9907c, "<this>");
        C9768m.m32346f(interfaceC9906b, "from");
        C9768m.m32346f(interfaceC10552e, "scopeOwner");
        C9768m.m32346f(c10130f, "name");
        if (interfaceC9907c == InterfaceC9907c.a.f37749a || (location = interfaceC9906b.getLocation()) == null) {
            return;
        }
        C9909e position = interfaceC9907c.mo33017a() ? location.getPosition() : C9909e.f37774f.m33021a();
        String m33016a = location.m33016a();
        String m35432b = C10154d.m35825m(interfaceC10552e).m35432b();
        C9768m.m32345e(m35432b, "getFqName(scopeOwner).asString()");
        EnumC9910f enumC9910f = EnumC9910f.CLASSIFIER;
        String m35455k = c10130f.m35455k();
        C9768m.m32345e(m35455k, "name.asString()");
        interfaceC9907c.mo33018b(m33016a, position, m35432b, enumC9910f, m35455k);
    }

    /* renamed from: b */
    public static final void m33014b(InterfaceC9907c interfaceC9907c, InterfaceC9906b interfaceC9906b, InterfaceC10571k0 interfaceC10571k0, C10130f c10130f) {
        C9768m.m32346f(interfaceC9907c, "<this>");
        C9768m.m32346f(interfaceC9906b, "from");
        C9768m.m32346f(interfaceC10571k0, "scopeOwner");
        C9768m.m32346f(c10130f, "name");
        String m35420b = interfaceC10571k0.mo37712d().m35420b();
        C9768m.m32345e(m35420b, "scopeOwner.fqName.asString()");
        String m35455k = c10130f.m35455k();
        C9768m.m32345e(m35455k, "name.asString()");
        m33015c(interfaceC9907c, interfaceC9906b, m35420b, m35455k);
    }

    /* renamed from: c */
    public static final void m33015c(InterfaceC9907c interfaceC9907c, InterfaceC9906b interfaceC9906b, String str, String str2) {
        InterfaceC9905a location;
        C9768m.m32346f(interfaceC9907c, "<this>");
        C9768m.m32346f(interfaceC9906b, "from");
        C9768m.m32346f(str, "packageFqName");
        C9768m.m32346f(str2, "name");
        if (interfaceC9907c == InterfaceC9907c.a.f37749a || (location = interfaceC9906b.getLocation()) == null) {
            return;
        }
        interfaceC9907c.mo33018b(location.m33016a(), interfaceC9907c.mo33017a() ? location.getPosition() : C9909e.f37774f.m33021a(), str, EnumC9910f.PACKAGE, str2);
    }
}
