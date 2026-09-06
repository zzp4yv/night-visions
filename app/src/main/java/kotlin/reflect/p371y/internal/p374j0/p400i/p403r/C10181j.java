package kotlin.reflect.p371y.internal.p374j0.p400i.p403r;

import kotlin.C10740s;
import kotlin.Pair;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10703x;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10154d;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10394k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.EnumC10393j;

/* compiled from: constantValues.kt */
/* renamed from: kotlin.f0.y.e.j0.i.r.j */
/* loaded from: classes3.dex */
public final class C10181j extends AbstractC10178g<Pair<? extends C10126b, ? extends C10130f>> {

    /* renamed from: b */
    private final C10126b f39563b;

    /* renamed from: c */
    private final C10130f f39564c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10181j(C10126b c10126b, C10130f c10130f) {
        super(C10740s.m38547a(c10126b, c10130f));
        C9768m.m32346f(c10126b, "enumClassId");
        C9768m.m32346f(c10130f, "enumEntryName");
        this.f39563b = c10126b;
        this.f39564c = c10130f;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10178g
    /* renamed from: a */
    public AbstractC10311e0 mo36013a(InterfaceC10559g0 interfaceC10559g0) {
        C9768m.m32346f(interfaceC10559g0, "module");
        InterfaceC10552e m38149a = C10703x.m38149a(interfaceC10559g0, this.f39563b);
        AbstractC10335m0 abstractC10335m0 = null;
        if (m38149a != null) {
            if (!C10154d.m35800A(m38149a)) {
                m38149a = null;
            }
            if (m38149a != null) {
                abstractC10335m0 = m38149a.mo36400s();
            }
        }
        if (abstractC10335m0 != null) {
            return abstractC10335m0;
        }
        EnumC10393j enumC10393j = EnumC10393j.f40271B0;
        String c10126b = this.f39563b.toString();
        C9768m.m32345e(c10126b, "enumClassId.toString()");
        String c10130f = this.f39564c.toString();
        C9768m.m32345e(c10130f, "enumEntryName.toString()");
        return C10394k.m37053d(enumC10393j, c10126b, c10130f);
    }

    /* renamed from: c */
    public final C10130f m36030c() {
        return this.f39564c;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10178g
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f39563b.m35415j());
        sb.append('.');
        sb.append(this.f39564c);
        return sb.toString();
    }
}
