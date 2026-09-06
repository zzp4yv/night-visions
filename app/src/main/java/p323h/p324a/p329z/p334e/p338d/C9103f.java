package p323h.p324a.p329z.p334e.p338d;

import io.reactivex.exceptions.C9207a;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.InterfaceC9046p;
import p323h.p324a.InterfaceC9047q;
import p323h.p324a.p325a0.C9030a;
import p323h.p324a.p327x.InterfaceC9056c;
import p323h.p324a.p328y.InterfaceC9065f;
import p323h.p324a.p329z.p330a.EnumC9070c;
import p323h.p324a.p329z.p331b.C9075b;
import p323h.p324a.p329z.p332c.InterfaceC9077b;
import p323h.p324a.p329z.p332c.InterfaceC9080e;
import p323h.p324a.p329z.p332c.InterfaceC9081f;
import p323h.p324a.p329z.p340f.C9125b;
import p323h.p324a.p329z.p340f.C9126c;
import p323h.p324a.p329z.p344j.C9143a;
import p323h.p324a.p329z.p344j.C9145c;

/* compiled from: ObservableFlatMap.java */
/* renamed from: h.a.z.e.d.f */
/* loaded from: classes2.dex */
public final class C9103f<T, U> extends AbstractC9098a<T, U> {

    /* renamed from: g */
    final InterfaceC9065f<? super T, ? extends InterfaceC9046p<? extends U>> f35025g;

    /* renamed from: h */
    final boolean f35026h;

    /* renamed from: i */
    final int f35027i;

    /* renamed from: j */
    final int f35028j;

    /* compiled from: ObservableFlatMap.java */
    /* renamed from: h.a.z.e.d.f$a */
    static final class a<T, U> extends AtomicReference<InterfaceC9056c> implements InterfaceC9047q<U> {

        /* renamed from: f */
        final long f35029f;

        /* renamed from: g */
        final b<T, U> f35030g;

        /* renamed from: h */
        volatile boolean f35031h;

        /* renamed from: i */
        volatile InterfaceC9081f<U> f35032i;

        /* renamed from: j */
        int f35033j;

        a(b<T, U> bVar, long j2) {
            this.f35029f = j2;
            this.f35030g = bVar;
        }

        @Override // p323h.p324a.InterfaceC9047q
        /* renamed from: a */
        public void mo29218a() {
            this.f35031h = true;
            this.f35030g.m29287f();
        }

        @Override // p323h.p324a.InterfaceC9047q
        /* renamed from: b */
        public void mo29219b(InterfaceC9056c interfaceC9056c) {
            if (EnumC9070c.m29248A(this, interfaceC9056c) && (interfaceC9056c instanceof InterfaceC9077b)) {
                InterfaceC9077b interfaceC9077b = (InterfaceC9077b) interfaceC9056c;
                int mo29259g = interfaceC9077b.mo29259g(7);
                if (mo29259g == 1) {
                    this.f35033j = mo29259g;
                    this.f35032i = interfaceC9077b;
                    this.f35031h = true;
                    this.f35030g.m29287f();
                    return;
                }
                if (mo29259g == 2) {
                    this.f35033j = mo29259g;
                    this.f35032i = interfaceC9077b;
                }
            }
        }

        /* renamed from: c */
        public void m29283c() {
            EnumC9070c.m29250g(this);
        }

        @Override // p323h.p324a.InterfaceC9047q
        public void onError(Throwable th) {
            if (!this.f35030g.f35043o.m29384a(th)) {
                C9030a.m29147o(th);
                return;
            }
            b<T, U> bVar = this.f35030g;
            if (!bVar.f35038j) {
                bVar.m29286e();
            }
            this.f35031h = true;
            this.f35030g.m29287f();
        }

        @Override // p323h.p324a.InterfaceC9047q
        public void onNext(U u) {
            if (this.f35033j == 0) {
                this.f35030g.m29291j(u, this);
            } else {
                this.f35030g.m29287f();
            }
        }
    }

    /* compiled from: ObservableFlatMap.java */
    /* renamed from: h.a.z.e.d.f$b */
    static final class b<T, U> extends AtomicInteger implements InterfaceC9056c, InterfaceC9047q<T> {

        /* renamed from: f */
        static final a<?, ?>[] f35034f = new a[0];

        /* renamed from: g */
        static final a<?, ?>[] f35035g = new a[0];

        /* renamed from: h */
        final InterfaceC9047q<? super U> f35036h;

        /* renamed from: i */
        final InterfaceC9065f<? super T, ? extends InterfaceC9046p<? extends U>> f35037i;

        /* renamed from: j */
        final boolean f35038j;

        /* renamed from: k */
        final int f35039k;

        /* renamed from: l */
        final int f35040l;

        /* renamed from: m */
        volatile InterfaceC9080e<U> f35041m;

        /* renamed from: n */
        volatile boolean f35042n;

        /* renamed from: o */
        final C9143a f35043o = new C9143a();

        /* renamed from: p */
        volatile boolean f35044p;

        /* renamed from: q */
        final AtomicReference<a<?, ?>[]> f35045q;

        /* renamed from: r */
        InterfaceC9056c f35046r;

        /* renamed from: s */
        long f35047s;

        /* renamed from: t */
        long f35048t;

        /* renamed from: u */
        int f35049u;

        /* renamed from: v */
        Queue<InterfaceC9046p<? extends U>> f35050v;

        /* renamed from: w */
        int f35051w;

        b(InterfaceC9047q<? super U> interfaceC9047q, InterfaceC9065f<? super T, ? extends InterfaceC9046p<? extends U>> interfaceC9065f, boolean z, int i2, int i3) {
            this.f35036h = interfaceC9047q;
            this.f35037i = interfaceC9065f;
            this.f35038j = z;
            this.f35039k = i2;
            this.f35040l = i3;
            if (i2 != Integer.MAX_VALUE) {
                this.f35050v = new ArrayDeque(i2);
            }
            this.f35045q = new AtomicReference<>(f35034f);
        }

        @Override // p323h.p324a.InterfaceC9047q
        /* renamed from: a */
        public void mo29218a() {
            if (this.f35042n) {
                return;
            }
            this.f35042n = true;
            m29287f();
        }

        @Override // p323h.p324a.InterfaceC9047q
        /* renamed from: b */
        public void mo29219b(InterfaceC9056c interfaceC9056c) {
            if (EnumC9070c.m29249D(this.f35046r, interfaceC9056c)) {
                this.f35046r = interfaceC9056c;
                this.f35036h.mo29219b(this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: c */
        boolean m29284c(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = this.f35045q.get();
                if (aVarArr == f35035g) {
                    aVar.m29283c();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!this.f35045q.compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        /* renamed from: d */
        boolean m29285d() {
            if (this.f35044p) {
                return true;
            }
            Throwable th = this.f35043o.get();
            if (this.f35038j || th == null) {
                return false;
            }
            m29286e();
            Throwable m29385b = this.f35043o.m29385b();
            if (m29385b != C9145c.f35281a) {
                this.f35036h.onError(m29385b);
            }
            return true;
        }

        /* renamed from: e */
        boolean m29286e() {
            a<?, ?>[] andSet;
            this.f35046r.mo29115k();
            a<?, ?>[] aVarArr = this.f35045q.get();
            a<?, ?>[] aVarArr2 = f35035g;
            if (aVarArr == aVarArr2 || (andSet = this.f35045q.getAndSet(aVarArr2)) == aVarArr2) {
                return false;
            }
            for (a<?, ?> aVar : andSet) {
                aVar.m29283c();
            }
            return true;
        }

        /* renamed from: f */
        void m29287f() {
            if (getAndIncrement() == 0) {
                m29288g();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:131:0x0004, code lost:
        
            continue;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void m29288g() {
            /*
                Method dump skipped, instructions count: 299
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p323h.p324a.p329z.p334e.p338d.C9103f.b.m29288g():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: h */
        void m29289h(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a<?, ?>[] aVarArr2;
            do {
                aVarArr = this.f35045q.get();
                int length = aVarArr.length;
                if (length == 0) {
                    return;
                }
                int i2 = -1;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    if (aVarArr[i3] == aVar) {
                        i2 = i3;
                        break;
                    }
                    i3++;
                }
                if (i2 < 0) {
                    return;
                }
                if (length == 1) {
                    aVarArr2 = f35034f;
                } else {
                    a<?, ?>[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr3, 0, i2);
                    System.arraycopy(aVarArr, i2 + 1, aVarArr3, i2, (length - i2) - 1);
                    aVarArr2 = aVarArr3;
                }
            } while (!this.f35045q.compareAndSet(aVarArr, aVarArr2));
        }

        /* renamed from: i */
        void m29290i(InterfaceC9046p<? extends U> interfaceC9046p) {
            InterfaceC9046p<? extends U> poll;
            while (interfaceC9046p instanceof Callable) {
                if (!m29292l((Callable) interfaceC9046p) || this.f35039k == Integer.MAX_VALUE) {
                    return;
                }
                boolean z = false;
                synchronized (this) {
                    poll = this.f35050v.poll();
                    if (poll == null) {
                        this.f35051w--;
                        z = true;
                    }
                }
                if (z) {
                    m29287f();
                    return;
                }
                interfaceC9046p = poll;
            }
            long j2 = this.f35047s;
            this.f35047s = 1 + j2;
            a<T, U> aVar = new a<>(this, j2);
            if (m29284c(aVar)) {
                interfaceC9046p.mo29199a(aVar);
            }
        }

        /* renamed from: j */
        void m29291j(U u, a<T, U> aVar) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f35036h.onNext(u);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                InterfaceC9081f interfaceC9081f = aVar.f35032i;
                if (interfaceC9081f == null) {
                    interfaceC9081f = new C9126c(this.f35040l);
                    aVar.f35032i = interfaceC9081f;
                }
                interfaceC9081f.offer(u);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m29288g();
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: k */
        public void mo29115k() {
            Throwable m29385b;
            if (this.f35044p) {
                return;
            }
            this.f35044p = true;
            if (!m29286e() || (m29385b = this.f35043o.m29385b()) == null || m29385b == C9145c.f35281a) {
                return;
            }
            C9030a.m29147o(m29385b);
        }

        /* renamed from: l */
        boolean m29292l(Callable<? extends U> callable) {
            try {
                U call = callable.call();
                if (call == null) {
                    return true;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.f35036h.onNext(call);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                } else {
                    InterfaceC9080e<U> interfaceC9080e = this.f35041m;
                    if (interfaceC9080e == null) {
                        interfaceC9080e = this.f35039k == Integer.MAX_VALUE ? new C9126c<>(this.f35040l) : new C9125b<>(this.f35039k);
                        this.f35041m = interfaceC9080e;
                    }
                    if (!interfaceC9080e.offer(call)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return true;
                    }
                    if (getAndIncrement() != 0) {
                        return false;
                    }
                }
                m29288g();
                return true;
            } catch (Throwable th) {
                C9207a.m30000a(th);
                this.f35043o.m29384a(th);
                m29287f();
                return true;
            }
        }

        @Override // p323h.p324a.InterfaceC9047q
        public void onError(Throwable th) {
            if (this.f35042n) {
                C9030a.m29147o(th);
            } else if (!this.f35043o.m29384a(th)) {
                C9030a.m29147o(th);
            } else {
                this.f35042n = true;
                m29287f();
            }
        }

        @Override // p323h.p324a.InterfaceC9047q
        public void onNext(T t) {
            if (this.f35042n) {
                return;
            }
            try {
                InterfaceC9046p<? extends U> interfaceC9046p = (InterfaceC9046p) C9075b.m29271c(this.f35037i.mo4660a(t), "The mapper returned a null ObservableSource");
                if (this.f35039k != Integer.MAX_VALUE) {
                    synchronized (this) {
                        int i2 = this.f35051w;
                        if (i2 == this.f35039k) {
                            this.f35050v.offer(interfaceC9046p);
                            return;
                        }
                        this.f35051w = i2 + 1;
                    }
                }
                m29290i(interfaceC9046p);
            } catch (Throwable th) {
                C9207a.m30000a(th);
                this.f35046r.mo29115k();
                onError(th);
            }
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: q */
        public boolean mo29116q() {
            return this.f35044p;
        }
    }

    public C9103f(InterfaceC9046p<T> interfaceC9046p, InterfaceC9065f<? super T, ? extends InterfaceC9046p<? extends U>> interfaceC9065f, boolean z, int i2, int i3) {
        super(interfaceC9046p);
        this.f35025g = interfaceC9065f;
        this.f35026h = z;
        this.f35027i = i2;
        this.f35028j = i3;
    }

    @Override // p323h.p324a.AbstractC9043m
    /* renamed from: x */
    public void mo29214x(InterfaceC9047q<? super U> interfaceC9047q) {
        if (C9113p.m29310b(this.f35009f, interfaceC9047q, this.f35025g)) {
            return;
        }
        this.f35009f.mo29199a(new b(interfaceC9047q, this.f35025g, this.f35026h, this.f35027i, this.f35028j));
    }
}
