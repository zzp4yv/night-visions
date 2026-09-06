package kotlin.reflect.p371y.internal.p374j0.p392e.p396z;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10784u;
import kotlin.collections.C10786v;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10105q;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10108t;

/* compiled from: TypeTable.kt */
/* renamed from: kotlin.f0.y.e.j0.e.z.g */
/* loaded from: classes3.dex */
public final class C10122g {

    /* renamed from: a */
    private final List<C10105q> f39236a;

    public C10122g(C10108t c10108t) {
        C9768m.m32346f(c10108t, "typeTable");
        List<C10105q> m35226A = c10108t.m35226A();
        if (c10108t.m35227B()) {
            int m35230x = c10108t.m35230x();
            List<C10105q> m35226A2 = c10108t.m35226A();
            C9768m.m32345e(m35226A2, "typeTable.typeList");
            ArrayList arrayList = new ArrayList(C10786v.m38911u(m35226A2, 10));
            int i2 = 0;
            for (Object obj : m35226A2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C10784u.m38898t();
                }
                C10105q c10105q = (C10105q) obj;
                if (i2 >= m35230x) {
                    c10105q = c10105q.mo34077d().m35104M(true).mo34093c();
                }
                arrayList.add(c10105q);
                i2 = i3;
            }
            m35226A = arrayList;
        }
        C9768m.m32345e(m35226A, "run {\n        val origin… else originalTypes\n    }");
        this.f39236a = m35226A;
    }

    /* renamed from: a */
    public final C10105q m35399a(int i2) {
        return this.f39236a.get(i2);
    }
}
