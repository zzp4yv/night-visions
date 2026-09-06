package p323h.p324a.p326b0;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p323h.p324a.AbstractC9048r;
import p323h.p324a.p325a0.C9030a;
import p323h.p324a.p329z.p341g.C9128b;
import p323h.p324a.p329z.p341g.C9130d;
import p323h.p324a.p329z.p341g.C9131e;
import p323h.p324a.p329z.p341g.C9132f;
import p323h.p324a.p329z.p341g.C9138l;
import p323h.p324a.p329z.p341g.C9139m;

/* compiled from: Schedulers.java */
/* renamed from: h.a.b0.a */
/* loaded from: classes2.dex */
public final class C9032a {

    /* renamed from: a */
    static final AbstractC9048r f34922a = C9030a.m29140h(new h());

    /* renamed from: b */
    static final AbstractC9048r f34923b = C9030a.m29137e(new b());

    /* renamed from: c */
    static final AbstractC9048r f34924c = C9030a.m29138f(new c());

    /* renamed from: d */
    static final AbstractC9048r f34925d = C9139m.m29374d();

    /* renamed from: e */
    static final AbstractC9048r f34926e = C9030a.m29139g(new f());

    /* compiled from: Schedulers.java */
    /* renamed from: h.a.b0.a$a */
    static final class a {

        /* renamed from: a */
        static final AbstractC9048r f34927a = new C9128b();
    }

    /* compiled from: Schedulers.java */
    /* renamed from: h.a.b0.a$b */
    static final class b implements Callable<AbstractC9048r> {
        b() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC9048r call() throws Exception {
            return a.f34927a;
        }
    }

    /* compiled from: Schedulers.java */
    /* renamed from: h.a.b0.a$c */
    static final class c implements Callable<AbstractC9048r> {
        c() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC9048r call() throws Exception {
            return d.f34928a;
        }
    }

    /* compiled from: Schedulers.java */
    /* renamed from: h.a.b0.a$d */
    static final class d {

        /* renamed from: a */
        static final AbstractC9048r f34928a = new C9131e();
    }

    /* compiled from: Schedulers.java */
    /* renamed from: h.a.b0.a$e */
    static final class e {

        /* renamed from: a */
        static final AbstractC9048r f34929a = new C9132f();
    }

    /* compiled from: Schedulers.java */
    /* renamed from: h.a.b0.a$f */
    static final class f implements Callable<AbstractC9048r> {
        f() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC9048r call() throws Exception {
            return e.f34929a;
        }
    }

    /* compiled from: Schedulers.java */
    /* renamed from: h.a.b0.a$g */
    static final class g {

        /* renamed from: a */
        static final AbstractC9048r f34930a = new C9138l();
    }

    /* compiled from: Schedulers.java */
    /* renamed from: h.a.b0.a$h */
    static final class h implements Callable<AbstractC9048r> {
        h() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC9048r call() throws Exception {
            return g.f34930a;
        }
    }

    /* renamed from: a */
    public static AbstractC9048r m29162a(Executor executor) {
        return new C9130d(executor, false);
    }

    /* renamed from: b */
    public static AbstractC9048r m29163b() {
        return C9030a.m29148p(f34924c);
    }

    /* renamed from: c */
    public static AbstractC9048r m29164c() {
        return C9030a.m29150r(f34922a);
    }
}
