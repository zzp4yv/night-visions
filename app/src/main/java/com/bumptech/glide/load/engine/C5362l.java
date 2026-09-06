package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.EnumC5332a;
import com.bumptech.glide.load.InterfaceC5390f;
import com.bumptech.glide.load.engine.RunnableC5358h;
import com.bumptech.glide.load.engine.p124b0.ExecutorServiceC5350a;
import com.bumptech.glide.p141p.InterfaceC5533i;
import com.bumptech.glide.p145r.C5558e;
import com.bumptech.glide.p145r.C5563j;
import com.bumptech.glide.p145r.p146l.AbstractC5567c;
import com.bumptech.glide.p145r.p146l.C5565a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p024c.p052i.p059j.InterfaceC0956f;

/* compiled from: EngineJob.java */
/* renamed from: com.bumptech.glide.load.engine.l */
/* loaded from: classes.dex */
class C5362l<R> implements RunnableC5358h.b<R>, C5565a.f {

    /* renamed from: f */
    private static final c f13424f = new c();

    /* renamed from: A */
    C5366p<?> f13425A;

    /* renamed from: B */
    private RunnableC5358h<R> f13426B;

    /* renamed from: C */
    private volatile boolean f13427C;

    /* renamed from: g */
    final e f13428g;

    /* renamed from: h */
    private final AbstractC5567c f13429h;

    /* renamed from: i */
    private final InterfaceC0956f<C5362l<?>> f13430i;

    /* renamed from: j */
    private final c f13431j;

    /* renamed from: k */
    private final InterfaceC5363m f13432k;

    /* renamed from: l */
    private final ExecutorServiceC5350a f13433l;

    /* renamed from: m */
    private final ExecutorServiceC5350a f13434m;

    /* renamed from: n */
    private final ExecutorServiceC5350a f13435n;

    /* renamed from: o */
    private final ExecutorServiceC5350a f13436o;

    /* renamed from: p */
    private final AtomicInteger f13437p;

    /* renamed from: q */
    private InterfaceC5390f f13438q;

    /* renamed from: r */
    private boolean f13439r;

    /* renamed from: s */
    private boolean f13440s;

    /* renamed from: t */
    private boolean f13441t;

    /* renamed from: u */
    private boolean f13442u;

    /* renamed from: v */
    private InterfaceC5371u<?> f13443v;

    /* renamed from: w */
    EnumC5332a f13444w;

    /* renamed from: x */
    private boolean f13445x;

    /* renamed from: y */
    GlideException f13446y;

    /* renamed from: z */
    private boolean f13447z;

    /* compiled from: EngineJob.java */
    /* renamed from: com.bumptech.glide.load.engine.l$a */
    private class a implements Runnable {

        /* renamed from: f */
        private final InterfaceC5533i f13448f;

        a(InterfaceC5533i interfaceC5533i) {
            this.f13448f = interfaceC5533i;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C5362l.this) {
                if (C5362l.this.f13428g.m10334f(this.f13448f)) {
                    C5362l.this.m10320e(this.f13448f);
                }
                C5362l.this.m10323h();
            }
        }
    }

    /* compiled from: EngineJob.java */
    /* renamed from: com.bumptech.glide.load.engine.l$b */
    private class b implements Runnable {

        /* renamed from: f */
        private final InterfaceC5533i f13450f;

        b(InterfaceC5533i interfaceC5533i) {
            this.f13450f = interfaceC5533i;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C5362l.this) {
                if (C5362l.this.f13428g.m10334f(this.f13450f)) {
                    C5362l.this.f13425A.m10338a();
                    C5362l.this.m10321f(this.f13450f);
                    C5362l.this.m10329q(this.f13450f);
                }
                C5362l.this.m10323h();
            }
        }
    }

    /* compiled from: EngineJob.java */
    /* renamed from: com.bumptech.glide.load.engine.l$c */
    static class c {
        c() {
        }

        /* renamed from: a */
        public <R> C5366p<R> m10331a(InterfaceC5371u<R> interfaceC5371u, boolean z) {
            return new C5366p<>(interfaceC5371u, z, true);
        }
    }

    /* compiled from: EngineJob.java */
    /* renamed from: com.bumptech.glide.load.engine.l$d */
    static final class d {

        /* renamed from: a */
        final InterfaceC5533i f13452a;

        /* renamed from: b */
        final Executor f13453b;

        d(InterfaceC5533i interfaceC5533i, Executor executor) {
            this.f13452a = interfaceC5533i;
            this.f13453b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f13452a.equals(((d) obj).f13452a);
            }
            return false;
        }

        public int hashCode() {
            return this.f13452a.hashCode();
        }
    }

    /* compiled from: EngineJob.java */
    /* renamed from: com.bumptech.glide.load.engine.l$e */
    static final class e implements Iterable<d> {

        /* renamed from: f */
        private final List<d> f13454f;

        e() {
            this(new ArrayList(2));
        }

        /* renamed from: h */
        private static d m10332h(InterfaceC5533i interfaceC5533i) {
            return new d(interfaceC5533i, C5558e.m11025a());
        }

        /* renamed from: c */
        void m10333c(InterfaceC5533i interfaceC5533i, Executor executor) {
            this.f13454f.add(new d(interfaceC5533i, executor));
        }

        void clear() {
            this.f13454f.clear();
        }

        /* renamed from: f */
        boolean m10334f(InterfaceC5533i interfaceC5533i) {
            return this.f13454f.contains(m10332h(interfaceC5533i));
        }

        /* renamed from: g */
        e m10335g() {
            return new e(new ArrayList(this.f13454f));
        }

        /* renamed from: i */
        void m10336i(InterfaceC5533i interfaceC5533i) {
            this.f13454f.remove(m10332h(interfaceC5533i));
        }

        boolean isEmpty() {
            return this.f13454f.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator<d> iterator() {
            return this.f13454f.iterator();
        }

        int size() {
            return this.f13454f.size();
        }

        e(List<d> list) {
            this.f13454f = list;
        }
    }

    C5362l(ExecutorServiceC5350a executorServiceC5350a, ExecutorServiceC5350a executorServiceC5350a2, ExecutorServiceC5350a executorServiceC5350a3, ExecutorServiceC5350a executorServiceC5350a4, InterfaceC5363m interfaceC5363m, InterfaceC0956f<C5362l<?>> interfaceC0956f) {
        this(executorServiceC5350a, executorServiceC5350a2, executorServiceC5350a3, executorServiceC5350a4, interfaceC5363m, interfaceC0956f, f13424f);
    }

    /* renamed from: i */
    private ExecutorServiceC5350a m10316i() {
        return this.f13440s ? this.f13435n : this.f13441t ? this.f13436o : this.f13434m;
    }

    /* renamed from: l */
    private boolean m10317l() {
        return this.f13447z || this.f13445x || this.f13427C;
    }

    /* renamed from: p */
    private synchronized void m10318p() {
        if (this.f13438q == null) {
            throw new IllegalArgumentException();
        }
        this.f13428g.clear();
        this.f13438q = null;
        this.f13425A = null;
        this.f13443v = null;
        this.f13447z = false;
        this.f13427C = false;
        this.f13445x = false;
        this.f13426B.m10277R(false);
        this.f13426B = null;
        this.f13446y = null;
        this.f13444w = null;
        this.f13430i.mo6060a(this);
    }

    @Override // com.bumptech.glide.load.engine.RunnableC5358h.b
    /* renamed from: a */
    public void mo10281a(GlideException glideException) {
        synchronized (this) {
            this.f13446y = glideException;
        }
        m10326m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.engine.RunnableC5358h.b
    /* renamed from: b */
    public void mo10282b(InterfaceC5371u<R> interfaceC5371u, EnumC5332a enumC5332a) {
        synchronized (this) {
            this.f13443v = interfaceC5371u;
            this.f13444w = enumC5332a;
        }
        m10327n();
    }

    @Override // com.bumptech.glide.load.engine.RunnableC5358h.b
    /* renamed from: c */
    public void mo10283c(RunnableC5358h<?> runnableC5358h) {
        m10316i().execute(runnableC5358h);
    }

    /* renamed from: d */
    synchronized void m10319d(InterfaceC5533i interfaceC5533i, Executor executor) {
        this.f13429h.mo11080c();
        this.f13428g.m10333c(interfaceC5533i, executor);
        boolean z = true;
        if (this.f13445x) {
            m10324j(1);
            executor.execute(new b(interfaceC5533i));
        } else if (this.f13447z) {
            m10324j(1);
            executor.execute(new a(interfaceC5533i));
        } else {
            if (this.f13427C) {
                z = false;
            }
            C5563j.m11039a(z, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    /* renamed from: e */
    synchronized void m10320e(InterfaceC5533i interfaceC5533i) {
        try {
            interfaceC5533i.mo10947a(this.f13446y);
        } catch (Throwable th) {
            throw new C5349b(th);
        }
    }

    /* renamed from: f */
    synchronized void m10321f(InterfaceC5533i interfaceC5533i) {
        try {
            interfaceC5533i.mo10948b(this.f13425A, this.f13444w);
        } catch (Throwable th) {
            throw new C5349b(th);
        }
    }

    /* renamed from: g */
    void m10322g() {
        if (m10317l()) {
            return;
        }
        this.f13427C = true;
        this.f13426B.m10279v();
        this.f13432k.mo10307c(this, this.f13438q);
    }

    /* renamed from: h */
    synchronized void m10323h() {
        this.f13429h.mo11080c();
        C5563j.m11039a(m10317l(), "Not yet complete!");
        int decrementAndGet = this.f13437p.decrementAndGet();
        C5563j.m11039a(decrementAndGet >= 0, "Can't decrement below 0");
        if (decrementAndGet == 0) {
            C5366p<?> c5366p = this.f13425A;
            if (c5366p != null) {
                c5366p.m10344g();
            }
            m10318p();
        }
    }

    /* renamed from: j */
    synchronized void m10324j(int i2) {
        C5366p<?> c5366p;
        C5563j.m11039a(m10317l(), "Not yet complete!");
        if (this.f13437p.getAndAdd(i2) == 0 && (c5366p = this.f13425A) != null) {
            c5366p.m10338a();
        }
    }

    /* renamed from: k */
    synchronized C5362l<R> m10325k(InterfaceC5390f interfaceC5390f, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f13438q = interfaceC5390f;
        this.f13439r = z;
        this.f13440s = z2;
        this.f13441t = z3;
        this.f13442u = z4;
        return this;
    }

    /* renamed from: m */
    void m10326m() {
        synchronized (this) {
            this.f13429h.mo11080c();
            if (this.f13427C) {
                m10318p();
                return;
            }
            if (this.f13428g.isEmpty()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
            if (this.f13447z) {
                throw new IllegalStateException("Already failed once");
            }
            this.f13447z = true;
            InterfaceC5390f interfaceC5390f = this.f13438q;
            e m10335g = this.f13428g.m10335g();
            m10324j(m10335g.size() + 1);
            this.f13432k.mo10306b(this, interfaceC5390f, null);
            Iterator<d> it = m10335g.iterator();
            while (it.hasNext()) {
                d next = it.next();
                next.f13453b.execute(new a(next.f13452a));
            }
            m10323h();
        }
    }

    /* renamed from: n */
    void m10327n() {
        synchronized (this) {
            this.f13429h.mo11080c();
            if (this.f13427C) {
                this.f13443v.mo10340c();
                m10318p();
                return;
            }
            if (this.f13428g.isEmpty()) {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            }
            if (this.f13445x) {
                throw new IllegalStateException("Already have resource");
            }
            this.f13425A = this.f13431j.m10331a(this.f13443v, this.f13439r);
            this.f13445x = true;
            e m10335g = this.f13428g.m10335g();
            m10324j(m10335g.size() + 1);
            this.f13432k.mo10306b(this, this.f13438q, this.f13425A);
            Iterator<d> it = m10335g.iterator();
            while (it.hasNext()) {
                d next = it.next();
                next.f13453b.execute(new b(next.f13452a));
            }
            m10323h();
        }
    }

    /* renamed from: o */
    boolean m10328o() {
        return this.f13442u;
    }

    /* renamed from: q */
    synchronized void m10329q(InterfaceC5533i interfaceC5533i) {
        boolean z;
        this.f13429h.mo11080c();
        this.f13428g.m10336i(interfaceC5533i);
        if (this.f13428g.isEmpty()) {
            m10322g();
            if (!this.f13445x && !this.f13447z) {
                z = false;
                if (z && this.f13437p.get() == 0) {
                    m10318p();
                }
            }
            z = true;
            if (z) {
                m10318p();
            }
        }
    }

    /* renamed from: r */
    public synchronized void m10330r(RunnableC5358h<R> runnableC5358h) {
        this.f13426B = runnableC5358h;
        (runnableC5358h.m10278X() ? this.f13433l : m10316i()).execute(runnableC5358h);
    }

    @Override // com.bumptech.glide.p145r.p146l.C5565a.f
    /* renamed from: u */
    public AbstractC5567c mo10213u() {
        return this.f13429h;
    }

    C5362l(ExecutorServiceC5350a executorServiceC5350a, ExecutorServiceC5350a executorServiceC5350a2, ExecutorServiceC5350a executorServiceC5350a3, ExecutorServiceC5350a executorServiceC5350a4, InterfaceC5363m interfaceC5363m, InterfaceC0956f<C5362l<?>> interfaceC0956f, c cVar) {
        this.f13428g = new e();
        this.f13429h = AbstractC5567c.m11078a();
        this.f13437p = new AtomicInteger();
        this.f13433l = executorServiceC5350a;
        this.f13434m = executorServiceC5350a2;
        this.f13435n = executorServiceC5350a3;
        this.f13436o = executorServiceC5350a4;
        this.f13432k = interfaceC5363m;
        this.f13430i = interfaceC0956f;
        this.f13431j = cVar;
    }
}
