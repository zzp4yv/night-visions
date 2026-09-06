package kotlin.reflect.p371y.internal.p374j0.p380d.p390b;

import java.util.Collection;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C10784u;
import kotlin.collections.C10787v0;
import kotlin.collections.C10789w0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10571k0;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.p391c0.C10053a;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10091c;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10100l;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10084e;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10085f;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10088i;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10250g;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10268k;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10277t;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.C10259i;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.EnumC10255e;

/* compiled from: DeserializedDescriptorResolver.kt */
/* renamed from: kotlin.f0.y.e.j0.d.b.g */
/* loaded from: classes3.dex */
public final class C10058g {

    /* renamed from: a */
    public static final a f38445a = new a(null);

    /* renamed from: b */
    private static final Set<C10053a.a> f38446b;

    /* renamed from: c */
    private static final Set<C10053a.a> f38447c;

    /* renamed from: d */
    private static final C10084e f38448d;

    /* renamed from: e */
    private static final C10084e f38449e;

    /* renamed from: f */
    private static final C10084e f38450f;

    /* renamed from: g */
    public C10268k f38451g;

    /* compiled from: DeserializedDescriptorResolver.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.g$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final C10084e m33976a() {
            return C10058g.f38450f;
        }
    }

    /* compiled from: DeserializedDescriptorResolver.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.g$b */
    static final class b extends Lambda implements Function0<Collection<? extends C10130f>> {

        /* renamed from: f */
        public static final b f38452f = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Collection<C10130f> invoke() {
            return C10784u.m38888j();
        }
    }

    static {
        Set<C10053a.a> m38916c;
        Set<C10053a.a> m38922i;
        m38916c = C10787v0.m38916c(C10053a.a.CLASS);
        f38446b = m38916c;
        m38922i = C10789w0.m38922i(C10053a.a.FILE_FACADE, C10053a.a.MULTIFILE_CLASS_PART);
        f38447c = m38922i;
        f38448d = new C10084e(1, 1, 2);
        f38449e = new C10084e(1, 1, 11);
        f38450f = new C10084e(1, 1, 13);
    }

    /* renamed from: c */
    private final EnumC10255e m33964c(InterfaceC10068q interfaceC10068q) {
        return m33971d().m36422g().mo36439b() ? EnumC10255e.STABLE : interfaceC10068q.mo34025a().m33919j() ? EnumC10255e.FIR_UNSTABLE : interfaceC10068q.mo34025a().m33920k() ? EnumC10255e.IR_UNSTABLE : EnumC10255e.STABLE;
    }

    /* renamed from: e */
    private final C10277t<C10084e> m33965e(InterfaceC10068q interfaceC10068q) {
        if (m33966f() || interfaceC10068q.mo34025a().m33914d().m34252h()) {
            return null;
        }
        return new C10277t<>(interfaceC10068q.mo34025a().m33914d(), C10084e.f38595h, interfaceC10068q.getLocation(), interfaceC10068q.mo34028e());
    }

    /* renamed from: f */
    private final boolean m33966f() {
        return m33971d().m36422g().mo36441d();
    }

    /* renamed from: g */
    private final boolean m33967g(InterfaceC10068q interfaceC10068q) {
        return !m33971d().m36422g().mo36440c() && interfaceC10068q.mo34025a().m33918i() && C9768m.m32341a(interfaceC10068q.mo34025a().m33914d(), f38449e);
    }

    /* renamed from: h */
    private final boolean m33968h(InterfaceC10068q interfaceC10068q) {
        return (m33971d().m36422g().mo36442e() && (interfaceC10068q.mo34025a().m33918i() || C9768m.m32341a(interfaceC10068q.mo34025a().m33914d(), f38448d))) || m33967g(interfaceC10068q);
    }

    /* renamed from: j */
    private final String[] m33969j(InterfaceC10068q interfaceC10068q, Set<? extends C10053a.a> set) {
        C10053a mo34025a = interfaceC10068q.mo34025a();
        String[] m33911a = mo34025a.m33911a();
        if (m33911a == null) {
            m33911a = mo34025a.m33912b();
        }
        if (m33911a == null || !set.contains(mo34025a.m33913c())) {
            return null;
        }
        return m33911a;
    }

    /* renamed from: b */
    public final InterfaceC10218h m33970b(InterfaceC10571k0 interfaceC10571k0, InterfaceC10068q interfaceC10068q) {
        String[] m33917g;
        Pair<C10085f, C10100l> pair;
        C9768m.m32346f(interfaceC10571k0, "descriptor");
        C9768m.m32346f(interfaceC10068q, "kotlinClass");
        String[] m33969j = m33969j(interfaceC10068q, f38447c);
        if (m33969j == null || (m33917g = interfaceC10068q.mo34025a().m33917g()) == null) {
            return null;
        }
        try {
            try {
                pair = C10088i.m34264m(m33969j, m33917g);
            } catch (InvalidProtocolBufferException e2) {
                throw new IllegalStateException("Could not read data from " + interfaceC10068q.getLocation(), e2);
            }
        } catch (Throwable th) {
            if (m33966f() || interfaceC10068q.mo34025a().m33914d().m34252h()) {
                throw th;
            }
            pair = null;
        }
        if (pair == null) {
            return null;
        }
        C10085f m37646a = pair.m37646a();
        C10100l m37647b = pair.m37647b();
        C10062k c10062k = new C10062k(interfaceC10068q, m37647b, m37646a, m33965e(interfaceC10068q), m33968h(interfaceC10068q), m33964c(interfaceC10068q));
        return new C10259i(interfaceC10571k0, m37647b, m37646a, interfaceC10068q.mo34025a().m33914d(), c10062k, m33971d(), "scope for " + c10062k + " in " + interfaceC10571k0, b.f38452f);
    }

    /* renamed from: d */
    public final C10268k m33971d() {
        C10268k c10268k = this.f38451g;
        if (c10268k != null) {
            return c10268k;
        }
        C9768m.m32363w("components");
        return null;
    }

    /* renamed from: i */
    public final C10250g m33972i(InterfaceC10068q interfaceC10068q) {
        String[] m33917g;
        Pair<C10085f, C10091c> pair;
        C9768m.m32346f(interfaceC10068q, "kotlinClass");
        String[] m33969j = m33969j(interfaceC10068q, f38446b);
        if (m33969j == null || (m33917g = interfaceC10068q.mo34025a().m33917g()) == null) {
            return null;
        }
        try {
            try {
                pair = C10088i.m34260i(m33969j, m33917g);
            } catch (InvalidProtocolBufferException e2) {
                throw new IllegalStateException("Could not read data from " + interfaceC10068q.getLocation(), e2);
            }
        } catch (Throwable th) {
            if (m33966f() || interfaceC10068q.mo34025a().m33914d().m34252h()) {
                throw th;
            }
            pair = null;
        }
        if (pair == null) {
            return null;
        }
        return new C10250g(pair.m37646a(), pair.m37647b(), interfaceC10068q.mo34025a().m33914d(), new C10070s(interfaceC10068q, m33965e(interfaceC10068q), m33968h(interfaceC10068q), m33964c(interfaceC10068q)));
    }

    /* renamed from: k */
    public final InterfaceC10552e m33973k(InterfaceC10068q interfaceC10068q) {
        C9768m.m32346f(interfaceC10068q, "kotlinClass");
        C10250g m33972i = m33972i(interfaceC10068q);
        if (m33972i == null) {
            return null;
        }
        return m33971d().m36421f().m36409d(interfaceC10068q.mo34028e(), m33972i);
    }

    /* renamed from: l */
    public final void m33974l(C10056e c10056e) {
        C9768m.m32346f(c10056e, "components");
        m33975m(c10056e.m33956a());
    }

    /* renamed from: m */
    public final void m33975m(C10268k c10268k) {
        C9768m.m32346f(c10268k, "<set-?>");
        this.f38451g = c10268k;
    }
}
