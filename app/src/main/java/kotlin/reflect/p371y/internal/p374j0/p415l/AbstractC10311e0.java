package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.List;
import kotlin.jvm.internal.C9756g;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10581a;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.C10374r;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10409i;

/* compiled from: KotlinType.kt */
/* renamed from: kotlin.f0.y.e.j0.l.e0 */
/* loaded from: classes3.dex */
public abstract class AbstractC10311e0 implements InterfaceC10581a, InterfaceC10409i {

    /* renamed from: f */
    private int f40077f;

    private AbstractC10311e0() {
    }

    public /* synthetic */ AbstractC10311e0(C9756g c9756g) {
        this();
    }

    /* renamed from: L0 */
    private final int m36634L0() {
        return C10317g0.m36706a(this) ? super.hashCode() : (((mo35993O0().hashCode() * 31) + mo35991M0().hashCode()) * 31) + (mo33691P0() ? 1 : 0);
    }

    /* renamed from: M0 */
    public abstract List<InterfaceC10318g1> mo35991M0();

    /* renamed from: N0 */
    public abstract C10300a1 mo35992N0();

    /* renamed from: O0 */
    public abstract InterfaceC10312e1 mo35993O0();

    /* renamed from: P0 */
    public abstract boolean mo33691P0();

    /* renamed from: Q0 */
    public abstract AbstractC10311e0 mo33544Q0(AbstractC10363g abstractC10363g);

    /* renamed from: R0 */
    public abstract AbstractC10348q1 mo36635R0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC10311e0)) {
            return false;
        }
        AbstractC10311e0 abstractC10311e0 = (AbstractC10311e0) obj;
        return mo33691P0() == abstractC10311e0.mo33691P0() && C10374r.f40210a.m36958a(mo36635R0(), abstractC10311e0.mo36635R0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10581a
    public InterfaceC10587g getAnnotations() {
        return C10328k.m36731a(mo35992N0());
    }

    public final int hashCode() {
        int i2 = this.f40077f;
        if (i2 != 0) {
            return i2;
        }
        int m36634L0 = m36634L0();
        this.f40077f = m36634L0;
        return m36634L0;
    }

    /* renamed from: q */
    public abstract InterfaceC10218h mo33553q();
}
