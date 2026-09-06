package p345i.p346a.p347g;

import java.net.InetAddress;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import p345i.p346a.p347g.p349t.C9181b;
import p345i.p346a.p347g.p349t.C9182c;
import p345i.p346a.p347g.p349t.p350d.C9184b;
import p345i.p346a.p347g.p349t.p350d.C9185c;
import p345i.p346a.p347g.p349t.p351e.C9186a;
import p345i.p346a.p347g.p349t.p351e.C9187b;
import p345i.p346a.p347g.p349t.p351e.C9189d;
import p345i.p346a.p347g.p349t.p351e.C9190e;

/* compiled from: DNSTaskStarter.java */
/* renamed from: i.a.g.j */
/* loaded from: classes2.dex */
public interface InterfaceC9164j {

    /* compiled from: DNSTaskStarter.java */
    /* renamed from: i.a.g.j$b */
    public static final class b {

        /* renamed from: a */
        private static volatile b f35366a;

        /* renamed from: b */
        private static final AtomicReference<a> f35367b = new AtomicReference<>();

        /* renamed from: c */
        private final ConcurrentMap<C9166l, InterfaceC9164j> f35368c = new ConcurrentHashMap(20);

        /* compiled from: DNSTaskStarter.java */
        /* renamed from: i.a.g.j$b$a */
        public interface a {
            /* renamed from: a */
            InterfaceC9164j m29600a(C9166l c9166l);
        }

        private b() {
        }

        /* renamed from: b */
        public static b m29596b() {
            if (f35366a == null) {
                synchronized (b.class) {
                    if (f35366a == null) {
                        f35366a = new b();
                    }
                }
            }
            return f35366a;
        }

        /* renamed from: d */
        protected static InterfaceC9164j m29597d(C9166l c9166l) {
            a aVar = f35367b.get();
            InterfaceC9164j m29600a = aVar != null ? aVar.m29600a(c9166l) : null;
            return m29600a != null ? m29600a : new a(c9166l);
        }

        /* renamed from: a */
        public void m29598a(C9166l c9166l) {
            this.f35368c.remove(c9166l);
        }

        /* renamed from: c */
        public InterfaceC9164j m29599c(C9166l c9166l) {
            InterfaceC9164j interfaceC9164j = this.f35368c.get(c9166l);
            if (interfaceC9164j != null) {
                return interfaceC9164j;
            }
            this.f35368c.putIfAbsent(c9166l, m29597d(c9166l));
            return this.f35368c.get(c9166l);
        }
    }

    /* renamed from: a */
    void mo29584a();

    /* renamed from: b */
    void mo29585b();

    /* renamed from: c */
    void mo29586c(String str);

    /* renamed from: e */
    void mo29587e();

    /* renamed from: f */
    void mo29588f();

    /* renamed from: j */
    void mo29589j();

    /* renamed from: k */
    void mo29590k();

    /* renamed from: l */
    void mo29591l();

    /* renamed from: m */
    void mo29592m(C9157c c9157c, InetAddress inetAddress, int i2);

    /* renamed from: p */
    void mo29593p();

    /* renamed from: x */
    void mo29594x();

    /* renamed from: y */
    void mo29595y(C9171q c9171q);

    /* compiled from: DNSTaskStarter.java */
    /* renamed from: i.a.g.j$a */
    public static final class a implements InterfaceC9164j {

        /* renamed from: f */
        private final C9166l f35362f;

        /* renamed from: g */
        private final Timer f35363g;

        /* renamed from: h */
        private final Timer f35364h;

        public a(C9166l c9166l) {
            this.f35362f = c9166l;
            this.f35363g = new C11486a("JmDNS(" + c9166l.m29676p0() + ").Timer", true);
            this.f35364h = new C11486a("JmDNS(" + c9166l.m29676p0() + ").State.Timer", true);
        }

        @Override // p345i.p346a.p347g.InterfaceC9164j
        /* renamed from: a */
        public void mo29584a() {
            this.f35363g.purge();
        }

        @Override // p345i.p346a.p347g.InterfaceC9164j
        /* renamed from: b */
        public void mo29585b() {
            this.f35364h.cancel();
        }

        @Override // p345i.p346a.p347g.InterfaceC9164j
        /* renamed from: c */
        public void mo29586c(String str) {
            new C9185c(this.f35362f, str).m29778j(this.f35363g);
        }

        @Override // p345i.p346a.p347g.InterfaceC9164j
        /* renamed from: e */
        public void mo29587e() {
            this.f35363g.cancel();
        }

        @Override // p345i.p346a.p347g.InterfaceC9164j
        /* renamed from: f */
        public void mo29588f() {
            new C9187b(this.f35362f).m29787u(this.f35364h);
        }

        @Override // p345i.p346a.p347g.InterfaceC9164j
        /* renamed from: j */
        public void mo29589j() {
            new C9181b(this.f35362f).m29773g(this.f35363g);
        }

        @Override // p345i.p346a.p347g.InterfaceC9164j
        /* renamed from: k */
        public void mo29590k() {
            new C9189d(this.f35362f).m29795u(this.f35364h);
        }

        @Override // p345i.p346a.p347g.InterfaceC9164j
        /* renamed from: l */
        public void mo29591l() {
            new C9186a(this.f35362f).m29786u(this.f35364h);
        }

        @Override // p345i.p346a.p347g.InterfaceC9164j
        /* renamed from: m */
        public void mo29592m(C9157c c9157c, InetAddress inetAddress, int i2) {
            new C9182c(this.f35362f, c9157c, inetAddress, i2).m29774g(this.f35363g);
        }

        @Override // p345i.p346a.p347g.InterfaceC9164j
        /* renamed from: p */
        public void mo29593p() {
            this.f35364h.purge();
        }

        @Override // p345i.p346a.p347g.InterfaceC9164j
        /* renamed from: x */
        public void mo29594x() {
            new C9190e(this.f35362f).m29796u(this.f35364h);
        }

        @Override // p345i.p346a.p347g.InterfaceC9164j
        /* renamed from: y */
        public void mo29595y(C9171q c9171q) {
            new C9184b(this.f35362f, c9171q).m29778j(this.f35363g);
        }

        /* compiled from: DNSTaskStarter.java */
        /* renamed from: i.a.g.j$a$a, reason: collision with other inner class name */
        public static class C11486a extends Timer {

            /* renamed from: a */
            private volatile boolean f35365a;

            public C11486a(String str, boolean z) {
                super(str, z);
                this.f35365a = false;
            }

            @Override // java.util.Timer
            public synchronized void cancel() {
                if (this.f35365a) {
                    return;
                }
                this.f35365a = true;
                super.cancel();
            }

            @Override // java.util.Timer
            public synchronized void schedule(TimerTask timerTask, long j2) {
                if (this.f35365a) {
                    return;
                }
                super.schedule(timerTask, j2);
            }

            @Override // java.util.Timer
            public synchronized void scheduleAtFixedRate(TimerTask timerTask, long j2, long j3) {
                if (this.f35365a) {
                    return;
                }
                super.scheduleAtFixedRate(timerTask, j2, j3);
            }

            @Override // java.util.Timer
            public synchronized void schedule(TimerTask timerTask, Date date) {
                if (this.f35365a) {
                    return;
                }
                super.schedule(timerTask, date);
            }

            @Override // java.util.Timer
            public synchronized void scheduleAtFixedRate(TimerTask timerTask, Date date, long j2) {
                if (this.f35365a) {
                    return;
                }
                super.scheduleAtFixedRate(timerTask, date, j2);
            }

            @Override // java.util.Timer
            public synchronized void schedule(TimerTask timerTask, long j2, long j3) {
                if (this.f35365a) {
                    return;
                }
                super.schedule(timerTask, j2, j3);
            }

            @Override // java.util.Timer
            public synchronized void schedule(TimerTask timerTask, Date date, long j2) {
                if (this.f35365a) {
                    return;
                }
                super.schedule(timerTask, date, j2);
            }
        }
    }
}
