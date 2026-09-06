package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C10749c0;
import kotlin.collections.C10777q0;
import kotlin.collections.C10786v;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10551d1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;

/* compiled from: TypeAliasExpansion.kt */
/* renamed from: kotlin.f0.y.e.j0.l.w0 */
/* loaded from: classes3.dex */
public final class C10400w0 {

    /* renamed from: a */
    public static final a f40368a = new a(null);

    /* renamed from: b */
    private final C10400w0 f40369b;

    /* renamed from: c */
    private final InterfaceC10551d1 f40370c;

    /* renamed from: d */
    private final List<InterfaceC10318g1> f40371d;

    /* renamed from: e */
    private final Map<InterfaceC10554e1, InterfaceC10318g1> f40372e;

    /* compiled from: TypeAliasExpansion.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.w0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final C10400w0 m37090a(C10400w0 c10400w0, InterfaceC10551d1 interfaceC10551d1, List<? extends InterfaceC10318g1> list) {
            List m38580L0;
            Map m38805q;
            C9768m.m32346f(interfaceC10551d1, "typeAliasDescriptor");
            C9768m.m32346f(list, "arguments");
            List<InterfaceC10554e1> parameters = interfaceC10551d1.mo32877h().getParameters();
            C9768m.m32345e(parameters, "typeAliasDescriptor.typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(C10786v.m38911u(parameters, 10));
            Iterator<T> it = parameters.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC10554e1) it.next()).mo37019a());
            }
            m38580L0 = C10749c0.m38580L0(arrayList, list);
            m38805q = C10777q0.m38805q(m38580L0);
            return new C10400w0(c10400w0, interfaceC10551d1, list, m38805q, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C10400w0(C10400w0 c10400w0, InterfaceC10551d1 interfaceC10551d1, List<? extends InterfaceC10318g1> list, Map<InterfaceC10554e1, ? extends InterfaceC10318g1> map) {
        this.f40369b = c10400w0;
        this.f40370c = interfaceC10551d1;
        this.f40371d = list;
        this.f40372e = map;
    }

    public /* synthetic */ C10400w0(C10400w0 c10400w0, InterfaceC10551d1 interfaceC10551d1, List list, Map map, C9756g c9756g) {
        this(c10400w0, interfaceC10551d1, list, map);
    }

    /* renamed from: a */
    public final List<InterfaceC10318g1> m37086a() {
        return this.f40371d;
    }

    /* renamed from: b */
    public final InterfaceC10551d1 m37087b() {
        return this.f40370c;
    }

    /* renamed from: c */
    public final InterfaceC10318g1 m37088c(InterfaceC10312e1 interfaceC10312e1) {
        C9768m.m32346f(interfaceC10312e1, "constructor");
        InterfaceC10561h mo32887c = interfaceC10312e1.mo32887c();
        if (mo32887c instanceof InterfaceC10554e1) {
            return this.f40372e.get(mo32887c);
        }
        return null;
    }

    /* renamed from: d */
    public final boolean m37089d(InterfaceC10551d1 interfaceC10551d1) {
        C9768m.m32346f(interfaceC10551d1, "descriptor");
        if (!C9768m.m32341a(this.f40370c, interfaceC10551d1)) {
            C10400w0 c10400w0 = this.f40369b;
            if (!(c10400w0 != null ? c10400w0.m37089d(interfaceC10551d1) : false)) {
                return false;
            }
        }
        return true;
    }
}
