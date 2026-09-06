package kotlin.reflect.p371y.internal.p374j0.p410j.p411b;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10580n0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10571k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10574l0;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;

/* compiled from: DeserializedClassDataFinder.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.o */
/* loaded from: classes3.dex */
public final class C10272o implements InterfaceC10265h {

    /* renamed from: a */
    private final InterfaceC10574l0 f39944a;

    public C10272o(InterfaceC10574l0 interfaceC10574l0) {
        C9768m.m32346f(interfaceC10574l0, "packageFragmentProvider");
        this.f39944a = interfaceC10574l0;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10265h
    /* renamed from: a */
    public C10250g mo33978a(C10126b c10126b) {
        C10250g mo33978a;
        C9768m.m32346f(c10126b, "classId");
        InterfaceC10574l0 interfaceC10574l0 = this.f39944a;
        C10127c m35413h = c10126b.m35413h();
        C9768m.m32345e(m35413h, "classId.packageFqName");
        for (InterfaceC10571k0 interfaceC10571k0 : C10580n0.m37725c(interfaceC10574l0, m35413h)) {
            if ((interfaceC10571k0 instanceof AbstractC10273p) && (mo33978a = ((AbstractC10273p) interfaceC10571k0).mo36463A0().mo33978a(c10126b)) != null) {
                return mo33978a;
            }
        }
        return null;
    }
}
