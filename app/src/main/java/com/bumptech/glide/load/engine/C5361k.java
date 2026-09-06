package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.C5318e;
import com.bumptech.glide.EnumC5320g;
import com.bumptech.glide.load.C5393i;
import com.bumptech.glide.load.EnumC5332a;
import com.bumptech.glide.load.InterfaceC5390f;
import com.bumptech.glide.load.InterfaceC5396l;
import com.bumptech.glide.load.engine.C5366p;
import com.bumptech.glide.load.engine.RunnableC5358h;
import com.bumptech.glide.load.engine.p123a0.C5340b;
import com.bumptech.glide.load.engine.p123a0.InterfaceC5339a;
import com.bumptech.glide.load.engine.p123a0.InterfaceC5346h;
import com.bumptech.glide.load.engine.p124b0.ExecutorServiceC5350a;
import com.bumptech.glide.p141p.InterfaceC5533i;
import com.bumptech.glide.p145r.C5559f;
import com.bumptech.glide.p145r.C5563j;
import com.bumptech.glide.p145r.p146l.C5565a;
import java.util.Map;
import java.util.concurrent.Executor;
import p024c.p052i.p059j.InterfaceC0956f;

/* compiled from: Engine.java */
/* renamed from: com.bumptech.glide.load.engine.k */
/* loaded from: classes.dex */
public class C5361k implements InterfaceC5363m, InterfaceC5346h.a, C5366p.a {

    /* renamed from: a */
    private static final boolean f13399a = Log.isLoggable("Engine", 2);

    /* renamed from: b */
    private final C5368r f13400b;

    /* renamed from: c */
    private final C5365o f13401c;

    /* renamed from: d */
    private final InterfaceC5346h f13402d;

    /* renamed from: e */
    private final b f13403e;

    /* renamed from: f */
    private final C5374x f13404f;

    /* renamed from: g */
    private final c f13405g;

    /* renamed from: h */
    private final a f13406h;

    /* renamed from: i */
    private final C5338a f13407i;

    /* compiled from: Engine.java */
    /* renamed from: com.bumptech.glide.load.engine.k$a */
    static class a {

        /* renamed from: a */
        final RunnableC5358h.e f13408a;

        /* renamed from: b */
        final InterfaceC0956f<RunnableC5358h<?>> f13409b = C5565a.m11068d(150, new C11407a());

        /* renamed from: c */
        private int f13410c;

        /* compiled from: Engine.java */
        /* renamed from: com.bumptech.glide.load.engine.k$a$a, reason: collision with other inner class name */
        class C11407a implements C5565a.d<RunnableC5358h<?>> {
            C11407a() {
            }

            @Override // com.bumptech.glide.p145r.p146l.C5565a.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public RunnableC5358h<?> mo10211a() {
                a aVar = a.this;
                return new RunnableC5358h<>(aVar.f13408a, aVar.f13409b);
            }
        }

        a(RunnableC5358h.e eVar) {
            this.f13408a = eVar;
        }

        /* renamed from: a */
        <R> RunnableC5358h<R> m10311a(C5318e c5318e, Object obj, C5364n c5364n, InterfaceC5390f interfaceC5390f, int i2, int i3, Class<?> cls, Class<R> cls2, EnumC5320g enumC5320g, AbstractC5360j abstractC5360j, Map<Class<?>, InterfaceC5396l<?>> map, boolean z, boolean z2, boolean z3, C5393i c5393i, RunnableC5358h.b<R> bVar) {
            RunnableC5358h runnableC5358h = (RunnableC5358h) C5563j.m11042d(this.f13409b.mo6061b());
            int i4 = this.f13410c;
            this.f13410c = i4 + 1;
            return runnableC5358h.m10275I(c5318e, obj, c5364n, interfaceC5390f, i2, i3, cls, cls2, enumC5320g, abstractC5360j, map, z, z2, z3, c5393i, bVar, i4);
        }
    }

    /* compiled from: Engine.java */
    /* renamed from: com.bumptech.glide.load.engine.k$b */
    static class b {

        /* renamed from: a */
        final ExecutorServiceC5350a f13412a;

        /* renamed from: b */
        final ExecutorServiceC5350a f13413b;

        /* renamed from: c */
        final ExecutorServiceC5350a f13414c;

        /* renamed from: d */
        final ExecutorServiceC5350a f13415d;

        /* renamed from: e */
        final InterfaceC5363m f13416e;

        /* renamed from: f */
        final InterfaceC0956f<C5362l<?>> f13417f = C5565a.m11068d(150, new a());

        /* compiled from: Engine.java */
        /* renamed from: com.bumptech.glide.load.engine.k$b$a */
        class a implements C5565a.d<C5362l<?>> {
            a() {
            }

            @Override // com.bumptech.glide.p145r.p146l.C5565a.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C5362l<?> mo10211a() {
                b bVar = b.this;
                return new C5362l<>(bVar.f13412a, bVar.f13413b, bVar.f13414c, bVar.f13415d, bVar.f13416e, bVar.f13417f);
            }
        }

        b(ExecutorServiceC5350a executorServiceC5350a, ExecutorServiceC5350a executorServiceC5350a2, ExecutorServiceC5350a executorServiceC5350a3, ExecutorServiceC5350a executorServiceC5350a4, InterfaceC5363m interfaceC5363m) {
            this.f13412a = executorServiceC5350a;
            this.f13413b = executorServiceC5350a2;
            this.f13414c = executorServiceC5350a3;
            this.f13415d = executorServiceC5350a4;
            this.f13416e = interfaceC5363m;
        }

        /* renamed from: a */
        <R> C5362l<R> m10313a(InterfaceC5390f interfaceC5390f, boolean z, boolean z2, boolean z3, boolean z4) {
            return ((C5362l) C5563j.m11042d(this.f13417f.mo6061b())).m10325k(interfaceC5390f, z, z2, z3, z4);
        }
    }

    /* compiled from: Engine.java */
    /* renamed from: com.bumptech.glide.load.engine.k$c */
    private static class c implements RunnableC5358h.e {

        /* renamed from: a */
        private final InterfaceC5339a.a f13419a;

        /* renamed from: b */
        private volatile InterfaceC5339a f13420b;

        c(InterfaceC5339a.a aVar) {
            this.f13419a = aVar;
        }

        @Override // com.bumptech.glide.load.engine.RunnableC5358h.e
        /* renamed from: a */
        public InterfaceC5339a mo10289a() {
            if (this.f13420b == null) {
                synchronized (this) {
                    if (this.f13420b == null) {
                        this.f13420b = this.f13419a.mo10181c();
                    }
                    if (this.f13420b == null) {
                        this.f13420b = new C5340b();
                    }
                }
            }
            return this.f13420b;
        }
    }

    /* compiled from: Engine.java */
    /* renamed from: com.bumptech.glide.load.engine.k$d */
    public class d {

        /* renamed from: a */
        private final C5362l<?> f13421a;

        /* renamed from: b */
        private final InterfaceC5533i f13422b;

        d(InterfaceC5533i interfaceC5533i, C5362l<?> c5362l) {
            this.f13422b = interfaceC5533i;
            this.f13421a = c5362l;
        }

        /* renamed from: a */
        public void m10315a() {
            synchronized (C5361k.this) {
                this.f13421a.m10329q(this.f13422b);
            }
        }
    }

    public C5361k(InterfaceC5346h interfaceC5346h, InterfaceC5339a.a aVar, ExecutorServiceC5350a executorServiceC5350a, ExecutorServiceC5350a executorServiceC5350a2, ExecutorServiceC5350a executorServiceC5350a3, ExecutorServiceC5350a executorServiceC5350a4, boolean z) {
        this(interfaceC5346h, aVar, executorServiceC5350a, executorServiceC5350a2, executorServiceC5350a3, executorServiceC5350a4, null, null, null, null, null, null, z);
    }

    /* renamed from: e */
    private C5366p<?> m10302e(InterfaceC5390f interfaceC5390f) {
        InterfaceC5371u<?> mo10192d = this.f13402d.mo10192d(interfaceC5390f);
        if (mo10192d == null) {
            return null;
        }
        return mo10192d instanceof C5366p ? (C5366p) mo10192d : new C5366p<>(mo10192d, true, true);
    }

    /* renamed from: g */
    private C5366p<?> m10303g(InterfaceC5390f interfaceC5390f, boolean z) {
        if (!z) {
            return null;
        }
        C5366p<?> m10175e = this.f13407i.m10175e(interfaceC5390f);
        if (m10175e != null) {
            m10175e.m10338a();
        }
        return m10175e;
    }

    /* renamed from: h */
    private C5366p<?> m10304h(InterfaceC5390f interfaceC5390f, boolean z) {
        if (!z) {
            return null;
        }
        C5366p<?> m10302e = m10302e(interfaceC5390f);
        if (m10302e != null) {
            m10302e.m10338a();
            this.f13407i.m10171a(interfaceC5390f, m10302e);
        }
        return m10302e;
    }

    /* renamed from: i */
    private static void m10305i(String str, long j2, InterfaceC5390f interfaceC5390f) {
        Log.v("Engine", str + " in " + C5559f.m11027a(j2) + "ms, key: " + interfaceC5390f);
    }

    @Override // com.bumptech.glide.load.engine.p123a0.InterfaceC5346h.a
    /* renamed from: a */
    public void mo10199a(InterfaceC5371u<?> interfaceC5371u) {
        this.f13404f.m10360a(interfaceC5371u);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5363m
    /* renamed from: b */
    public synchronized void mo10306b(C5362l<?> c5362l, InterfaceC5390f interfaceC5390f, C5366p<?> c5366p) {
        if (c5366p != null) {
            c5366p.m10345h(interfaceC5390f, this);
            if (c5366p.m10343f()) {
                this.f13407i.m10171a(interfaceC5390f, c5366p);
            }
        }
        this.f13400b.m10350d(interfaceC5390f, c5362l);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5363m
    /* renamed from: c */
    public synchronized void mo10307c(C5362l<?> c5362l, InterfaceC5390f interfaceC5390f) {
        this.f13400b.m10350d(interfaceC5390f, c5362l);
    }

    @Override // com.bumptech.glide.load.engine.C5366p.a
    /* renamed from: d */
    public synchronized void mo10308d(InterfaceC5390f interfaceC5390f, C5366p<?> c5366p) {
        this.f13407i.m10174d(interfaceC5390f);
        if (c5366p.m10343f()) {
            this.f13402d.mo10191c(interfaceC5390f, c5366p);
        } else {
            this.f13404f.m10360a(c5366p);
        }
    }

    /* renamed from: f */
    public synchronized <R> d m10309f(C5318e c5318e, Object obj, InterfaceC5390f interfaceC5390f, int i2, int i3, Class<?> cls, Class<R> cls2, EnumC5320g enumC5320g, AbstractC5360j abstractC5360j, Map<Class<?>, InterfaceC5396l<?>> map, boolean z, boolean z2, C5393i c5393i, boolean z3, boolean z4, boolean z5, boolean z6, InterfaceC5533i interfaceC5533i, Executor executor) {
        boolean z7 = f13399a;
        long m11028b = z7 ? C5559f.m11028b() : 0L;
        C5364n m10337a = this.f13401c.m10337a(obj, interfaceC5390f, i2, i3, map, cls, cls2, c5393i);
        C5366p<?> m10303g = m10303g(m10337a, z3);
        if (m10303g != null) {
            interfaceC5533i.mo10948b(m10303g, EnumC5332a.MEMORY_CACHE);
            if (z7) {
                m10305i("Loaded resource from active resources", m11028b, m10337a);
            }
            return null;
        }
        C5366p<?> m10304h = m10304h(m10337a, z3);
        if (m10304h != null) {
            interfaceC5533i.mo10948b(m10304h, EnumC5332a.MEMORY_CACHE);
            if (z7) {
                m10305i("Loaded resource from cache", m11028b, m10337a);
            }
            return null;
        }
        C5362l<?> m10348a = this.f13400b.m10348a(m10337a, z6);
        if (m10348a != null) {
            m10348a.m10319d(interfaceC5533i, executor);
            if (z7) {
                m10305i("Added to existing load", m11028b, m10337a);
            }
            return new d(interfaceC5533i, m10348a);
        }
        C5362l<R> m10313a = this.f13403e.m10313a(m10337a, z3, z4, z5, z6);
        RunnableC5358h<R> m10311a = this.f13406h.m10311a(c5318e, obj, m10337a, interfaceC5390f, i2, i3, cls, cls2, enumC5320g, abstractC5360j, map, z, z2, z6, c5393i, m10313a);
        this.f13400b.m10349c(m10337a, m10313a);
        m10313a.m10319d(interfaceC5533i, executor);
        m10313a.m10330r(m10311a);
        if (z7) {
            m10305i("Started new load", m11028b, m10337a);
        }
        return new d(interfaceC5533i, m10313a);
    }

    /* renamed from: j */
    public void m10310j(InterfaceC5371u<?> interfaceC5371u) {
        if (!(interfaceC5371u instanceof C5366p)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((C5366p) interfaceC5371u).m10344g();
    }

    C5361k(InterfaceC5346h interfaceC5346h, InterfaceC5339a.a aVar, ExecutorServiceC5350a executorServiceC5350a, ExecutorServiceC5350a executorServiceC5350a2, ExecutorServiceC5350a executorServiceC5350a3, ExecutorServiceC5350a executorServiceC5350a4, C5368r c5368r, C5365o c5365o, C5338a c5338a, b bVar, a aVar2, C5374x c5374x, boolean z) {
        this.f13402d = interfaceC5346h;
        c cVar = new c(aVar);
        this.f13405g = cVar;
        C5338a c5338a2 = c5338a == null ? new C5338a(z) : c5338a;
        this.f13407i = c5338a2;
        c5338a2.m10176f(this);
        this.f13401c = c5365o == null ? new C5365o() : c5365o;
        this.f13400b = c5368r == null ? new C5368r() : c5368r;
        this.f13403e = bVar == null ? new b(executorServiceC5350a, executorServiceC5350a2, executorServiceC5350a3, executorServiceC5350a4, this) : bVar;
        this.f13406h = aVar2 == null ? new a(cVar) : aVar2;
        this.f13404f = c5374x == null ? new C5374x() : c5374x;
        interfaceC5346h.mo10193e(this);
    }
}
