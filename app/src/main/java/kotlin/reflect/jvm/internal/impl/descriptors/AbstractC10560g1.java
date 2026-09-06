package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C10740s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C10786v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10411k;

/* compiled from: ValueClassRepresentation.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.g1 */
/* loaded from: classes2.dex */
public abstract class AbstractC10560g1<Type extends InterfaceC10411k> {
    private AbstractC10560g1() {
    }

    public /* synthetic */ AbstractC10560g1(C9756g c9756g) {
        this();
    }

    /* renamed from: a */
    public abstract List<Pair<C10130f, Type>> mo37691a();

    /* renamed from: b */
    public final <Other extends InterfaceC10411k> AbstractC10560g1<Other> m37692b(Function1<? super Type, ? extends Other> function1) {
        C9768m.m32346f(function1, "transform");
        if (this instanceof C10707z) {
            C10707z c10707z = (C10707z) this;
            return new C10707z(c10707z.m38162c(), function1.invoke(c10707z.m38163d()));
        }
        if (!(this instanceof C10562h0)) {
            throw new NoWhenBranchMatchedException();
        }
        List<Pair<C10130f, Type>> mo37691a = mo37691a();
        ArrayList arrayList = new ArrayList(C10786v.m38911u(mo37691a, 10));
        Iterator<T> it = mo37691a.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add(C10740s.m38547a((C10130f) pair.m37646a(), function1.invoke((InterfaceC10411k) pair.m37647b())));
        }
        return new C10562h0(arrayList);
    }
}
