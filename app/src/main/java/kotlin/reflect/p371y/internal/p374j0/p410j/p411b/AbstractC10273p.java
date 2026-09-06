package kotlin.reflect.p371y.internal.p374j0.p410j.p411b;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10643z;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10258h;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;

/* compiled from: DeserializedPackageFragment.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.p */
/* loaded from: classes3.dex */
public abstract class AbstractC10273p extends AbstractC10643z {

    /* renamed from: l */
    private final InterfaceC10297n f39945l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC10273p(C10127c c10127c, InterfaceC10297n interfaceC10297n, InterfaceC10559g0 interfaceC10559g0) {
        super(interfaceC10559g0, c10127c);
        C9768m.m32346f(c10127c, "fqName");
        C9768m.m32346f(interfaceC10297n, "storageManager");
        C9768m.m32346f(interfaceC10559g0, "module");
        this.f39945l = interfaceC10297n;
    }

    /* renamed from: A0 */
    public abstract InterfaceC10265h mo36463A0();

    /* renamed from: L0 */
    public boolean m36464L0(C10130f c10130f) {
        C9768m.m32346f(c10130f, "name");
        InterfaceC10218h mo32988q = mo32988q();
        return (mo32988q instanceof AbstractC10258h) && ((AbstractC10258h) mo32988q).m36326q().contains(c10130f);
    }

    /* renamed from: M0 */
    public abstract void mo36465M0(C10268k c10268k);
}
