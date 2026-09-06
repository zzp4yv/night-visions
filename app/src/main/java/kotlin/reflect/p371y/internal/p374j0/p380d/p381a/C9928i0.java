package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10578m1;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10697u;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.C9946e;

/* compiled from: utils.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.i0 */
/* loaded from: classes2.dex */
public final class C9928i0 {
    /* renamed from: a */
    public static final boolean m33144a(InterfaceC10543b interfaceC10543b) {
        C9768m.m32346f(interfaceC10543b, "memberDescriptor");
        return (interfaceC10543b instanceof InterfaceC10705y) && C9768m.m32341a(interfaceC10543b.mo33224i0(C9946e.f37943K), Boolean.TRUE);
    }

    /* renamed from: b */
    public static final boolean m33145b(C10044w c10044w) {
        C9768m.m32346f(c10044w, "javaTypeEnhancementState");
        return c10044w.m33818c().invoke(C10042u.m33808e()) == EnumC9922f0.STRICT;
    }

    /* renamed from: c */
    public static final AbstractC10697u m33146c(AbstractC10578m1 abstractC10578m1) {
        C9768m.m32346f(abstractC10578m1, "<this>");
        AbstractC10697u m33794g = C10039r.m33794g(abstractC10578m1);
        C9768m.m32345e(m33794g, "toDescriptorVisibility(this)");
        return m33794g;
    }
}
