package kotlin.reflect.p371y.internal.p374j0.p375b.p376p;

import java.util.List;
import kotlin.collections.C10782t;
import kotlin.collections.C10784u;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10215e;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;

/* compiled from: FunctionClassScope.kt */
/* renamed from: kotlin.f0.y.e.j0.b.p.d */
/* loaded from: classes2.dex */
public final class C9892d extends AbstractC10215e {

    /* compiled from: FunctionClassScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.p.d$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37661a;

        static {
            int[] iArr = new int[EnumC9891c.values().length];
            iArr[EnumC9891c.f37650g.ordinal()] = 1;
            iArr[EnumC9891c.f37651h.ordinal()] = 2;
            f37661a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9892d(InterfaceC10297n interfaceC10297n, C9890b c9890b) {
        super(interfaceC10297n, c9890b);
        C9768m.m32346f(interfaceC10297n, "storageManager");
        C9768m.m32346f(c9890b, "containingClass");
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10215e
    /* renamed from: i */
    protected List<InterfaceC10705y> mo32904i() {
        InterfaceC10552e m36156l = m36156l();
        C9768m.m32344d(m36156l, "null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
        int i2 = a.f37661a[((C9890b) m36156l).m32871V0().ordinal()];
        return i2 != 1 ? i2 != 2 ? C10784u.m38888j() : C10782t.m38883e(C9893e.f37662J.m32910a((C9890b) m36156l(), true)) : C10782t.m38883e(C9893e.f37662J.m32910a((C9890b) m36156l(), false));
    }
}
