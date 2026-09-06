package kotlin.reflect.p371y.internal.p374j0.p392e.p396z;

import java.util.List;
import kotlin.collections.C10784u;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10110v;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10111w;

/* compiled from: VersionRequirement.kt */
/* renamed from: kotlin.f0.y.e.j0.e.z.h */
/* loaded from: classes3.dex */
public final class C10123h {

    /* renamed from: a */
    public static final a f39237a = new a(null);

    /* renamed from: b */
    private static final C10123h f39238b = new C10123h(C10784u.m38888j());

    /* renamed from: c */
    private final List<C10110v> f39239c;

    /* compiled from: VersionRequirement.kt */
    /* renamed from: kotlin.f0.y.e.j0.e.z.h$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final C10123h m35401a(C10111w c10111w) {
            C9768m.m32346f(c10111w, "table");
            if (c10111w.m35340v() == 0) {
                return m35402b();
            }
            List<C10110v> m35341w = c10111w.m35341w();
            C9768m.m32345e(m35341w, "table.requirementList");
            return new C10123h(m35341w, null);
        }

        /* renamed from: b */
        public final C10123h m35402b() {
            return C10123h.f39238b;
        }
    }

    private C10123h(List<C10110v> list) {
        this.f39239c = list;
    }

    public /* synthetic */ C10123h(List list, C9756g c9756g) {
        this(list);
    }
}
