package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.Iterator;
import kotlin.collections.C10749c0;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c;
import kotlin.reflect.p371y.internal.p374j0.p399h.AbstractC10139c;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10411k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10412l;
import kotlin.text.C10510r;

/* compiled from: KotlinType.kt */
/* renamed from: kotlin.f0.y.e.j0.l.m0 */
/* loaded from: classes3.dex */
public abstract class AbstractC10335m0 extends AbstractC10348q1 implements InterfaceC10411k, InterfaceC10412l {
    public AbstractC10335m0() {
        super(null);
    }

    /* renamed from: V0 */
    public abstract AbstractC10335m0 mo33692V0(boolean z);

    /* renamed from: W0 */
    public abstract AbstractC10335m0 mo33693W0(C10300a1 c10300a1);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<InterfaceC10583c> it = getAnnotations().iterator();
        while (it.hasNext()) {
            C10510r.m37502i(sb, "[", AbstractC10139c.m35499s(AbstractC10139c.f39380j, it.next(), null, 2, null), "] ");
        }
        sb.append(mo35993O0());
        if (!mo35991M0().isEmpty()) {
            C10749c0.m38597c0(mo35991M0(), sb, ", ", "<", ">", 0, null, null, 112, null);
        }
        if (mo33691P0()) {
            sb.append("?");
        }
        String sb2 = sb.toString();
        C9768m.m32345e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
