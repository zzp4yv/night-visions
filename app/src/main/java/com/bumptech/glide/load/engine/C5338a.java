package com.bumptech.glide.load.engine;

import android.os.Process;
import com.bumptech.glide.load.InterfaceC5390f;
import com.bumptech.glide.load.engine.C5366p;
import com.bumptech.glide.p145r.C5563j;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: ActiveResources.java */
/* renamed from: com.bumptech.glide.load.engine.a */
/* loaded from: classes.dex */
final class C5338a {

    /* renamed from: a */
    private final boolean f13240a;

    /* renamed from: b */
    private final Executor f13241b;

    /* renamed from: c */
    final Map<InterfaceC5390f, d> f13242c;

    /* renamed from: d */
    private final ReferenceQueue<C5366p<?>> f13243d;

    /* renamed from: e */
    private C5366p.a f13244e;

    /* renamed from: f */
    private volatile boolean f13245f;

    /* renamed from: g */
    private volatile c f13246g;

    /* compiled from: ActiveResources.java */
    /* renamed from: com.bumptech.glide.load.engine.a$a */
    class a implements ThreadFactory {

        /* compiled from: ActiveResources.java */
        /* renamed from: com.bumptech.glide.load.engine.a$a$a, reason: collision with other inner class name */
        class RunnableC11404a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ Runnable f13247f;

            RunnableC11404a(Runnable runnable) {
                this.f13247f = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f13247f.run();
            }
        }

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC11404a(runnable), "glide-active-resources");
        }
    }

    /* compiled from: ActiveResources.java */
    /* renamed from: com.bumptech.glide.load.engine.a$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5338a.this.m10172b();
        }
    }

    /* compiled from: ActiveResources.java */
    /* renamed from: com.bumptech.glide.load.engine.a$c */
    interface c {
        /* renamed from: a */
        void m10177a();
    }

    /* compiled from: ActiveResources.java */
    /* renamed from: com.bumptech.glide.load.engine.a$d */
    static final class d extends WeakReference<C5366p<?>> {

        /* renamed from: a */
        final InterfaceC5390f f13250a;

        /* renamed from: b */
        final boolean f13251b;

        /* renamed from: c */
        InterfaceC5371u<?> f13252c;

        d(InterfaceC5390f interfaceC5390f, C5366p<?> c5366p, ReferenceQueue<? super C5366p<?>> referenceQueue, boolean z) {
            super(c5366p, referenceQueue);
            this.f13250a = (InterfaceC5390f) C5563j.m11042d(interfaceC5390f);
            this.f13252c = (c5366p.m10343f() && z) ? (InterfaceC5371u) C5563j.m11042d(c5366p.m10339b()) : null;
            this.f13251b = c5366p.m10343f();
        }

        /* renamed from: a */
        void m10178a() {
            this.f13252c = null;
            clear();
        }
    }

    C5338a(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new a()));
    }

    /* renamed from: a */
    synchronized void m10171a(InterfaceC5390f interfaceC5390f, C5366p<?> c5366p) {
        d put = this.f13242c.put(interfaceC5390f, new d(interfaceC5390f, c5366p, this.f13243d, this.f13240a));
        if (put != null) {
            put.m10178a();
        }
    }

    /* renamed from: b */
    void m10172b() {
        while (!this.f13245f) {
            try {
                m10173c((d) this.f13243d.remove());
                c cVar = this.f13246g;
                if (cVar != null) {
                    cVar.m10177a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: c */
    void m10173c(d dVar) {
        InterfaceC5371u<?> interfaceC5371u;
        synchronized (this.f13244e) {
            synchronized (this) {
                this.f13242c.remove(dVar.f13250a);
                if (dVar.f13251b && (interfaceC5371u = dVar.f13252c) != null) {
                    C5366p<?> c5366p = new C5366p<>(interfaceC5371u, true, false);
                    c5366p.m10345h(dVar.f13250a, this.f13244e);
                    this.f13244e.mo10308d(dVar.f13250a, c5366p);
                }
            }
        }
    }

    /* renamed from: d */
    synchronized void m10174d(InterfaceC5390f interfaceC5390f) {
        d remove = this.f13242c.remove(interfaceC5390f);
        if (remove != null) {
            remove.m10178a();
        }
    }

    /* renamed from: e */
    synchronized C5366p<?> m10175e(InterfaceC5390f interfaceC5390f) {
        d dVar = this.f13242c.get(interfaceC5390f);
        if (dVar == null) {
            return null;
        }
        C5366p<?> c5366p = dVar.get();
        if (c5366p == null) {
            m10173c(dVar);
        }
        return c5366p;
    }

    /* renamed from: f */
    void m10176f(C5366p.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f13244e = aVar;
            }
        }
    }

    C5338a(boolean z, Executor executor) {
        this.f13242c = new HashMap();
        this.f13243d = new ReferenceQueue<>();
        this.f13240a = z;
        this.f13241b = executor;
        executor.execute(new b());
    }
}
