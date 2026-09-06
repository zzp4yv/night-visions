package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9997g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p406u.C10205c;

/* compiled from: ModuleClassResolver.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.j */
/* loaded from: classes2.dex */
public final class C9960j implements InterfaceC9959i {

    /* renamed from: a */
    public C10205c f38009a;

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.InterfaceC9959i
    /* renamed from: a */
    public InterfaceC10552e mo33295a(InterfaceC9997g interfaceC9997g) {
        C9768m.m32346f(interfaceC9997g, "javaClass");
        return m33296b().m36105b(interfaceC9997g);
    }

    /* renamed from: b */
    public final C10205c m33296b() {
        C10205c c10205c = this.f38009a;
        if (c10205c != null) {
            return c10205c;
        }
        C9768m.m32363w("resolver");
        return null;
    }

    /* renamed from: c */
    public final void m33297c(C10205c c10205c) {
        C9768m.m32346f(c10205c, "<set-?>");
        this.f38009a = c10205c;
    }
}
