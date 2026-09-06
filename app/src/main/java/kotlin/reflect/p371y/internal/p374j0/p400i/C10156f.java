package kotlin.reflect.p371y.internal.p374j0.p400i;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10707z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10569j1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10698u0;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;

/* compiled from: inlineClassesUtils.kt */
/* renamed from: kotlin.f0.y.e.j0.i.f */
/* loaded from: classes3.dex */
public final class C10156f {

    /* renamed from: a */
    private static final C10127c f39516a;

    /* renamed from: b */
    private static final C10126b f39517b;

    static {
        C10127c c10127c = new C10127c("kotlin.jvm.JvmInline");
        f39516a = c10127c;
        C10126b m35408m = C10126b.m35408m(c10127c);
        C9768m.m32345e(m35408m, "topLevel(JVM_INLINE_ANNOTATION_FQ_NAME)");
        f39517b = m35408m;
    }

    /* renamed from: a */
    public static final boolean m35839a(InterfaceC10540a interfaceC10540a) {
        C9768m.m32346f(interfaceC10540a, "<this>");
        if (interfaceC10540a instanceof InterfaceC10698u0) {
            InterfaceC10696t0 mo37763B0 = ((InterfaceC10698u0) interfaceC10540a).mo37763B0();
            C9768m.m32345e(mo37763B0, "correspondingProperty");
            if (m35842d(mo37763B0)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m35840b(InterfaceC10576m interfaceC10576m) {
        C9768m.m32346f(interfaceC10576m, "<this>");
        return (interfaceC10576m instanceof InterfaceC10552e) && (((InterfaceC10552e) interfaceC10576m).mo32886z0() instanceof C10707z);
    }

    /* renamed from: c */
    public static final boolean m35841c(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, "<this>");
        InterfaceC10561h mo32891w = abstractC10311e0.mo35993O0().mo32891w();
        if (mo32891w != null) {
            return m35840b(mo32891w);
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m35842d(InterfaceC10569j1 interfaceC10569j1) {
        C10707z<AbstractC10335m0> m36076j;
        C9768m.m32346f(interfaceC10569j1, "<this>");
        if (interfaceC10569j1.mo37032m0() == null) {
            InterfaceC10576m mo32876b = interfaceC10569j1.mo32876b();
            C10130f c10130f = null;
            InterfaceC10552e interfaceC10552e = mo32876b instanceof InterfaceC10552e ? (InterfaceC10552e) mo32876b : null;
            if (interfaceC10552e != null && (m36076j = C10202a.m36076j(interfaceC10552e)) != null) {
                c10130f = m36076j.m38162c();
            }
            if (C9768m.m32341a(c10130f, interfaceC10569j1.getName())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static final AbstractC10311e0 m35843e(AbstractC10311e0 abstractC10311e0) {
        C10707z<AbstractC10335m0> m36076j;
        C9768m.m32346f(abstractC10311e0, "<this>");
        InterfaceC10561h mo32891w = abstractC10311e0.mo35993O0().mo32891w();
        if (!(mo32891w instanceof InterfaceC10552e)) {
            mo32891w = null;
        }
        InterfaceC10552e interfaceC10552e = (InterfaceC10552e) mo32891w;
        if (interfaceC10552e == null || (m36076j = C10202a.m36076j(interfaceC10552e)) == null) {
            return null;
        }
        return m36076j.m38163d();
    }
}
