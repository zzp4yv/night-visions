package kotlin.reflect.p371y.internal.p374j0.p400i.p406u;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10695t;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10549d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9884k;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10154d;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10156f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10424a;

/* compiled from: inlineClassManglingRules.kt */
/* renamed from: kotlin.f0.y.e.j0.i.u.b */
/* loaded from: classes3.dex */
public final class C10204b {
    /* renamed from: a */
    private static final boolean m36098a(InterfaceC10552e interfaceC10552e) {
        return C9768m.m32341a(C10202a.m36074h(interfaceC10552e), C9884k.f37513n);
    }

    /* renamed from: b */
    public static final boolean m36099b(InterfaceC10576m interfaceC10576m) {
        C9768m.m32346f(interfaceC10576m, "<this>");
        return C10156f.m35840b(interfaceC10576m) && !m36098a((InterfaceC10552e) interfaceC10576m);
    }

    /* renamed from: c */
    public static final boolean m36100c(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, "<this>");
        InterfaceC10561h mo32891w = abstractC10311e0.mo35993O0().mo32891w();
        return mo32891w != null && m36099b(mo32891w);
    }

    /* renamed from: d */
    private static final boolean m36101d(AbstractC10311e0 abstractC10311e0) {
        InterfaceC10561h mo32891w = abstractC10311e0.mo35993O0().mo32891w();
        InterfaceC10554e1 interfaceC10554e1 = mo32891w instanceof InterfaceC10554e1 ? (InterfaceC10554e1) mo32891w : null;
        if (interfaceC10554e1 == null) {
            return false;
        }
        return m36102e(C10424a.m37143i(interfaceC10554e1));
    }

    /* renamed from: e */
    private static final boolean m36102e(AbstractC10311e0 abstractC10311e0) {
        return m36100c(abstractC10311e0) || m36101d(abstractC10311e0);
    }

    /* renamed from: f */
    public static final boolean m36103f(InterfaceC10543b interfaceC10543b) {
        C9768m.m32346f(interfaceC10543b, "descriptor");
        InterfaceC10549d interfaceC10549d = interfaceC10543b instanceof InterfaceC10549d ? (InterfaceC10549d) interfaceC10543b : null;
        if (interfaceC10549d == null || C10695t.m38132g(interfaceC10549d.getVisibility())) {
            return false;
        }
        InterfaceC10552e mo37714C = interfaceC10549d.mo37714C();
        C9768m.m32345e(mo37714C, "constructorDescriptor.constructedClass");
        if (C10156f.m35840b(mo37714C) || C10154d.m35806G(interfaceC10549d.mo37714C())) {
            return false;
        }
        List<InterfaceC10566i1> mo37028f = interfaceC10549d.mo37028f();
        C9768m.m32345e(mo37028f, "constructorDescriptor.valueParameters");
        if ((mo37028f instanceof Collection) && mo37028f.isEmpty()) {
            return false;
        }
        Iterator<T> it = mo37028f.iterator();
        while (it.hasNext()) {
            AbstractC10311e0 type = ((InterfaceC10566i1) it.next()).getType();
            C9768m.m32345e(type, "it.type");
            if (m36102e(type)) {
                return true;
            }
        }
        return false;
    }
}
