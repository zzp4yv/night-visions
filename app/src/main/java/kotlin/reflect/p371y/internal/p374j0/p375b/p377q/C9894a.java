package kotlin.reflect.p371y.internal.p374j0.p375b.p377q;

import java.util.List;
import kotlin.collections.C10782t;
import kotlin.collections.C10784u;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10695t;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10550d0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10617g0;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10215e;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;

/* compiled from: CloneableClassScope.kt */
/* renamed from: kotlin.f0.y.e.j0.b.q.a */
/* loaded from: classes2.dex */
public final class C9894a extends AbstractC10215e {

    /* renamed from: e */
    public static final a f37663e = new a(null);

    /* renamed from: f */
    private static final C10130f f37664f;

    /* compiled from: CloneableClassScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.q.a$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final C10130f m32912a() {
            return C9894a.f37664f;
        }
    }

    static {
        C10130f m35454x = C10130f.m35454x("clone");
        C9768m.m32345e(m35454x, "identifier(\"clone\")");
        f37664f = m35454x;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9894a(InterfaceC10297n interfaceC10297n, InterfaceC10552e interfaceC10552e) {
        super(interfaceC10297n, interfaceC10552e);
        C9768m.m32346f(interfaceC10297n, "storageManager");
        C9768m.m32346f(interfaceC10552e, "containingClass");
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10215e
    /* renamed from: i */
    protected List<InterfaceC10705y> mo32904i() {
        C10617g0 m37848m1 = C10617g0.m37848m1(m36156l(), InterfaceC10587g.f40808c.m37735b(), f37664f, InterfaceC10543b.a.DECLARATION, InterfaceC10708z0.f41247a);
        m37848m1.mo37850S0(null, m36156l().mo37677K0(), C10784u.m38888j(), C10784u.m38888j(), C10784u.m38888j(), C10202a.m36072f(m36156l()).m32791i(), EnumC10550d0.OPEN, C10695t.f41218c);
        return C10782t.m38883e(m37848m1);
    }
}
