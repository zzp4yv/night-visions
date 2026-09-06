package kotlin.reflect.p371y.internal.p374j0.p400i.p406u;

import kotlin.collections.C10780s;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.EnumC9908d;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.InterfaceC9936g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9956f;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C9969h;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.EnumC9993d0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9997g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;

/* compiled from: JavaDescriptorResolver.kt */
/* renamed from: kotlin.f0.y.e.j0.i.u.c */
/* loaded from: classes3.dex */
public final class C10205c {

    /* renamed from: a */
    private final C9956f f39598a;

    /* renamed from: b */
    private final InterfaceC9936g f39599b;

    public C10205c(C9956f c9956f, InterfaceC9936g interfaceC9936g) {
        C9768m.m32346f(c9956f, "packageFragmentProvider");
        C9768m.m32346f(interfaceC9936g, "javaResolverCache");
        this.f39598a = c9956f;
        this.f39599b = interfaceC9936g;
    }

    /* renamed from: a */
    public final C9956f m36104a() {
        return this.f39598a;
    }

    /* renamed from: b */
    public final InterfaceC10552e m36105b(InterfaceC9997g interfaceC9997g) {
        C9768m.m32346f(interfaceC9997g, "javaClass");
        C10127c mo33596d = interfaceC9997g.mo33596d();
        if (mo33596d != null && interfaceC9997g.mo33591I() == EnumC9993d0.SOURCE) {
            return this.f39599b.mo33178a(mo33596d);
        }
        InterfaceC9997g mo33597i = interfaceC9997g.mo33597i();
        if (mo33597i != null) {
            InterfaceC10552e m36105b = m36105b(mo33597i);
            InterfaceC10218h mo33348y0 = m36105b != null ? m36105b.mo33348y0() : null;
            InterfaceC10561h mo33316f = mo33348y0 != null ? mo33348y0.mo33316f(interfaceC9997g.getName(), EnumC9908d.FROM_JAVA_LOADER) : null;
            if (mo33316f instanceof InterfaceC10552e) {
                return (InterfaceC10552e) mo33316f;
            }
            return null;
        }
        if (mo33596d == null) {
            return null;
        }
        C9956f c9956f = this.f39598a;
        C10127c m35423e = mo33596d.m35423e();
        C9768m.m32345e(m35423e, "fqName.parent()");
        C9969h c9969h = (C9969h) C10780s.m38832W(c9956f.mo33276a(m35423e));
        if (c9969h != null) {
            return c9969h.m33426M0(interfaceC9997g);
        }
        return null;
    }
}
