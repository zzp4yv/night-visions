package kotlin.reflect.p371y.internal.p374j0.p415l;

import cm.aptoide.p092pt.database.room.RoomNotification;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C10749c0;
import kotlin.collections.C10777q0;
import kotlin.collections.C10780s;
import kotlin.collections.C10786v;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;

/* compiled from: TypeSubstitution.kt */
/* renamed from: kotlin.f0.y.e.j0.l.f1 */
/* loaded from: classes3.dex */
public abstract class AbstractC10315f1 extends AbstractC10327j1 {

    /* renamed from: c */
    public static final a f40104c = new a(null);

    /* compiled from: TypeSubstitution.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.f1$a */
    public static final class a {

        /* compiled from: TypeSubstitution.kt */
        /* renamed from: kotlin.f0.y.e.j0.l.f1$a$a, reason: collision with other inner class name */
        public static final class C11523a extends AbstractC10315f1 {

            /* renamed from: d */
            final /* synthetic */ Map<InterfaceC10312e1, InterfaceC10318g1> f40105d;

            /* renamed from: e */
            final /* synthetic */ boolean f40106e;

            /* JADX WARN: Multi-variable type inference failed */
            C11523a(Map<InterfaceC10312e1, ? extends InterfaceC10318g1> map, boolean z) {
                this.f40105d = map;
                this.f40106e = z;
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10327j1
            /* renamed from: a */
            public boolean mo36685a() {
                return this.f40106e;
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10327j1
            /* renamed from: f */
            public boolean mo33537f() {
                return this.f40105d.isEmpty();
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10315f1
            /* renamed from: k */
            public InterfaceC10318g1 mo36679k(InterfaceC10312e1 interfaceC10312e1) {
                C9768m.m32346f(interfaceC10312e1, RoomNotification.KEY);
                return this.f40105d.get(interfaceC10312e1);
            }
        }

        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: e */
        public static /* synthetic */ AbstractC10315f1 m36680e(a aVar, Map map, boolean z, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                z = false;
            }
            return aVar.m36684d(map, z);
        }

        /* renamed from: a */
        public final AbstractC10327j1 m36681a(AbstractC10311e0 abstractC10311e0) {
            C9768m.m32346f(abstractC10311e0, "kotlinType");
            return m36682b(abstractC10311e0.mo35993O0(), abstractC10311e0.mo35991M0());
        }

        /* renamed from: b */
        public final AbstractC10327j1 m36682b(InterfaceC10312e1 interfaceC10312e1, List<? extends InterfaceC10318g1> list) {
            List m38580L0;
            Map m38805q;
            C9768m.m32346f(interfaceC10312e1, "typeConstructor");
            C9768m.m32346f(list, "arguments");
            List<InterfaceC10554e1> parameters = interfaceC10312e1.getParameters();
            C9768m.m32345e(parameters, "typeConstructor.parameters");
            InterfaceC10554e1 interfaceC10554e1 = (InterfaceC10554e1) C10780s.m38847i0(parameters);
            if (!(interfaceC10554e1 != null && interfaceC10554e1.mo37673o0())) {
                return new C10305c0(parameters, list);
            }
            List<InterfaceC10554e1> parameters2 = interfaceC10312e1.getParameters();
            C9768m.m32345e(parameters2, "typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(C10786v.m38911u(parameters2, 10));
            Iterator<T> it = parameters2.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC10554e1) it.next()).mo32877h());
            }
            m38580L0 = C10749c0.m38580L0(arrayList, list);
            m38805q = C10777q0.m38805q(m38580L0);
            return m36680e(this, m38805q, false, 2, null);
        }

        /* renamed from: c */
        public final AbstractC10315f1 m36683c(Map<InterfaceC10312e1, ? extends InterfaceC10318g1> map) {
            C9768m.m32346f(map, "map");
            return m36680e(this, map, false, 2, null);
        }

        /* renamed from: d */
        public final AbstractC10315f1 m36684d(Map<InterfaceC10312e1, ? extends InterfaceC10318g1> map, boolean z) {
            C9768m.m32346f(map, "map");
            return new C11523a(map, z);
        }
    }

    /* renamed from: i */
    public static final AbstractC10327j1 m36677i(InterfaceC10312e1 interfaceC10312e1, List<? extends InterfaceC10318g1> list) {
        return f40104c.m36682b(interfaceC10312e1, list);
    }

    /* renamed from: j */
    public static final AbstractC10315f1 m36678j(Map<InterfaceC10312e1, ? extends InterfaceC10318g1> map) {
        return f40104c.m36683c(map);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10327j1
    /* renamed from: e */
    public InterfaceC10318g1 mo33536e(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, RoomNotification.KEY);
        return mo36679k(abstractC10311e0.mo35993O0());
    }

    /* renamed from: k */
    public abstract InterfaceC10318g1 mo36679k(InterfaceC10312e1 interfaceC10312e1);
}
