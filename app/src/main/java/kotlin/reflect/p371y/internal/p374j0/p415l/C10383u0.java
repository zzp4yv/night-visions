package kotlin.reflect.p371y.internal.p374j0.p415l;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10370n;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10411k;
import okhttp3.HttpUrl;

/* compiled from: StubTypes.kt */
/* renamed from: kotlin.f0.y.e.j0.l.u0 */
/* loaded from: classes3.dex */
public final class C10383u0 extends AbstractC10310e implements InterfaceC10411k {

    /* renamed from: k */
    private final InterfaceC10312e1 f40225k;

    /* renamed from: l */
    private final InterfaceC10218h f40226l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10383u0(InterfaceC10370n interfaceC10370n, boolean z, InterfaceC10312e1 interfaceC10312e1) {
        super(interfaceC10370n, z);
        C9768m.m32346f(interfaceC10370n, "originalTypeVariable");
        C9768m.m32346f(interfaceC10312e1, "constructor");
        this.f40225k = interfaceC10312e1;
        this.f40226l = interfaceC10370n.mo36004o().m32791i().mo33553q();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: O0 */
    public InterfaceC10312e1 mo35993O0() {
        return this.f40225k;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10310e
    /* renamed from: Y0 */
    public AbstractC10310e mo36632Y0(boolean z) {
        return new C10383u0(m36631X0(), z, mo35993O0());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10310e, kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: q */
    public InterfaceC10218h mo33553q() {
        return this.f40226l;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stub (BI): ");
        sb.append(m36631X0());
        sb.append(mo33691P0() ? "?" : HttpUrl.FRAGMENT_ENCODE_SET);
        return sb.toString();
    }
}
