package p323h.p324a.p329z.p334e.p338d;

import p323h.p324a.AbstractC9048r;
import p323h.p324a.InterfaceC9046p;
import p323h.p324a.InterfaceC9047q;
import p323h.p324a.p325a0.C9030a;
import p323h.p324a.p327x.InterfaceC9056c;
import p323h.p324a.p329z.p330a.EnumC9070c;
import p323h.p324a.p329z.p332c.InterfaceC9077b;
import p323h.p324a.p329z.p332c.InterfaceC9081f;
import p323h.p324a.p329z.p333d.AbstractC9082a;
import p323h.p324a.p329z.p340f.C9126c;
import p323h.p324a.p329z.p341g.C9139m;

/* compiled from: ObservableObserveOn.java */
/* renamed from: h.a.z.e.d.n */
/* loaded from: classes2.dex */
public final class C9111n<T> extends AbstractC9098a<T, T> {

    /* renamed from: g */
    final AbstractC9048r f35098g;

    /* renamed from: h */
    final boolean f35099h;

    /* renamed from: i */
    final int f35100i;

    /* compiled from: ObservableObserveOn.java */
    /* renamed from: h.a.z.e.d.n$a */
    static final class a<T> extends AbstractC9082a<T> implements InterfaceC9047q<T>, Runnable {

        /* renamed from: f */
        final InterfaceC9047q<? super T> f35101f;

        /* renamed from: g */
        final AbstractC9048r.b f35102g;

        /* renamed from: h */
        final boolean f35103h;

        /* renamed from: i */
        final int f35104i;

        /* renamed from: j */
        InterfaceC9081f<T> f35105j;

        /* renamed from: k */
        InterfaceC9056c f35106k;

        /* renamed from: l */
        Throwable f35107l;

        /* renamed from: m */
        volatile boolean f35108m;

        /* renamed from: n */
        volatile boolean f35109n;

        /* renamed from: o */
        int f35110o;

        /* renamed from: p */
        boolean f35111p;

        a(InterfaceC9047q<? super T> interfaceC9047q, AbstractC9048r.b bVar, boolean z, int i2) {
            this.f35101f = interfaceC9047q;
            this.f35102g = bVar;
            this.f35103h = z;
            this.f35104i = i2;
        }

        @Override // p323h.p324a.InterfaceC9047q
        /* renamed from: a */
        public void mo29218a() {
            if (this.f35108m) {
                return;
            }
            this.f35108m = true;
            m29308f();
        }

        @Override // p323h.p324a.InterfaceC9047q
        /* renamed from: b */
        public void mo29219b(InterfaceC9056c interfaceC9056c) {
            if (EnumC9070c.m29249D(this.f35106k, interfaceC9056c)) {
                this.f35106k = interfaceC9056c;
                if (interfaceC9056c instanceof InterfaceC9077b) {
                    InterfaceC9077b interfaceC9077b = (InterfaceC9077b) interfaceC9056c;
                    int mo29259g = interfaceC9077b.mo29259g(7);
                    if (mo29259g == 1) {
                        this.f35110o = mo29259g;
                        this.f35105j = interfaceC9077b;
                        this.f35108m = true;
                        this.f35101f.mo29219b(this);
                        m29308f();
                        return;
                    }
                    if (mo29259g == 2) {
                        this.f35110o = mo29259g;
                        this.f35105j = interfaceC9077b;
                        this.f35101f.mo29219b(this);
                        return;
                    }
                }
                this.f35105j = new C9126c(this.f35104i);
                this.f35101f.mo29219b(this);
            }
        }

        /* renamed from: c */
        boolean m29305c(boolean z, boolean z2, InterfaceC9047q<? super T> interfaceC9047q) {
            if (this.f35109n) {
                this.f35105j.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.f35107l;
            if (this.f35103h) {
                if (!z2) {
                    return false;
                }
                this.f35109n = true;
                if (th != null) {
                    interfaceC9047q.onError(th);
                } else {
                    interfaceC9047q.mo29218a();
                }
                this.f35102g.mo29115k();
                return true;
            }
            if (th != null) {
                this.f35109n = true;
                this.f35105j.clear();
                interfaceC9047q.onError(th);
                this.f35102g.mo29115k();
                return true;
            }
            if (!z2) {
                return false;
            }
            this.f35109n = true;
            interfaceC9047q.mo29218a();
            this.f35102g.mo29115k();
            return true;
        }

        @Override // p323h.p324a.p329z.p332c.InterfaceC9081f
        public void clear() {
            this.f35105j.clear();
        }

        /* renamed from: d */
        void m29306d() {
            int i2 = 1;
            while (!this.f35109n) {
                boolean z = this.f35108m;
                Throwable th = this.f35107l;
                if (!this.f35103h && z && th != null) {
                    this.f35109n = true;
                    this.f35101f.onError(this.f35107l);
                    this.f35102g.mo29115k();
                    return;
                }
                this.f35101f.onNext(null);
                if (z) {
                    this.f35109n = true;
                    Throwable th2 = this.f35107l;
                    if (th2 != null) {
                        this.f35101f.onError(th2);
                    } else {
                        this.f35101f.mo29218a();
                    }
                    this.f35102g.mo29115k();
                    return;
                }
                i2 = addAndGet(-i2);
                if (i2 == 0) {
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
        
            r3 = addAndGet(-r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        
            if (r3 != 0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
        
            return;
         */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void m29307e() {
            /*
                r7 = this;
                h.a.z.c.f<T> r0 = r7.f35105j
                h.a.q<? super T> r1 = r7.f35101f
                r2 = 1
                r3 = 1
            L6:
                boolean r4 = r7.f35108m
                boolean r5 = r0.isEmpty()
                boolean r4 = r7.m29305c(r4, r5, r1)
                if (r4 == 0) goto L13
                return
            L13:
                boolean r4 = r7.f35108m
                java.lang.Object r5 = r0.poll()     // Catch: java.lang.Throwable -> L33
                if (r5 != 0) goto L1d
                r6 = 1
                goto L1e
            L1d:
                r6 = 0
            L1e:
                boolean r4 = r7.m29305c(r4, r6, r1)
                if (r4 == 0) goto L25
                return
            L25:
                if (r6 == 0) goto L2f
                int r3 = -r3
                int r3 = r7.addAndGet(r3)
                if (r3 != 0) goto L6
                return
            L2f:
                r1.onNext(r5)
                goto L13
            L33:
                r3 = move-exception
                io.reactivex.exceptions.C9207a.m30000a(r3)
                r7.f35109n = r2
                h.a.x.c r2 = r7.f35106k
                r2.mo29115k()
                r0.clear()
                r1.onError(r3)
                h.a.r$b r0 = r7.f35102g
                r0.mo29115k()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p323h.p324a.p329z.p334e.p338d.C9111n.a.m29307e():void");
        }

        /* renamed from: f */
        void m29308f() {
            if (getAndIncrement() == 0) {
                this.f35102g.mo29224b(this);
            }
        }

        @Override // p323h.p324a.p329z.p332c.InterfaceC9078c
        /* renamed from: g */
        public int mo29259g(int i2) {
            if ((i2 & 2) == 0) {
                return 0;
            }
            this.f35111p = true;
            return 2;
        }

        @Override // p323h.p324a.p329z.p332c.InterfaceC9081f
        public boolean isEmpty() {
            return this.f35105j.isEmpty();
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: k */
        public void mo29115k() {
            if (this.f35109n) {
                return;
            }
            this.f35109n = true;
            this.f35106k.mo29115k();
            this.f35102g.mo29115k();
            if (this.f35111p || getAndIncrement() != 0) {
                return;
            }
            this.f35105j.clear();
        }

        @Override // p323h.p324a.InterfaceC9047q
        public void onError(Throwable th) {
            if (this.f35108m) {
                C9030a.m29147o(th);
                return;
            }
            this.f35107l = th;
            this.f35108m = true;
            m29308f();
        }

        @Override // p323h.p324a.InterfaceC9047q
        public void onNext(T t) {
            if (this.f35108m) {
                return;
            }
            if (this.f35110o != 2) {
                this.f35105j.offer(t);
            }
            m29308f();
        }

        @Override // p323h.p324a.p329z.p332c.InterfaceC9081f
        public T poll() throws Exception {
            return this.f35105j.poll();
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: q */
        public boolean mo29116q() {
            return this.f35109n;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f35111p) {
                m29306d();
            } else {
                m29307e();
            }
        }
    }

    public C9111n(InterfaceC9046p<T> interfaceC9046p, AbstractC9048r abstractC9048r, boolean z, int i2) {
        super(interfaceC9046p);
        this.f35098g = abstractC9048r;
        this.f35099h = z;
        this.f35100i = i2;
    }

    @Override // p323h.p324a.AbstractC9043m
    /* renamed from: x */
    protected void mo29214x(InterfaceC9047q<? super T> interfaceC9047q) {
        AbstractC9048r abstractC9048r = this.f35098g;
        if (abstractC9048r instanceof C9139m) {
            this.f35009f.mo29199a(interfaceC9047q);
        } else {
            this.f35009f.mo29199a(new a(interfaceC9047q, abstractC9048r.mo29220a(), this.f35099h, this.f35100i));
        }
    }
}
