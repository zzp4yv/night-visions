package p456rx.p461n.p462a;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.InterfaceC11194g;
import p456rx.InterfaceC11198k;
import p456rx.exceptions.C11192a;
import p456rx.exceptions.MissingBackpressureException;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p460m.InterfaceC11205b;
import p456rx.p461n.p466e.C11311h;
import p456rx.p461n.p466e.p467n.C11321e;
import p456rx.p461n.p466e.p468o.C11343s;
import p456rx.p461n.p466e.p468o.C11350z;
import p456rx.p469o.AbstractC11352b;
import p456rx.p474t.C11381e;

/* compiled from: OperatorPublish.java */
/* renamed from: rx.n.a.u0 */
/* loaded from: classes3.dex */
public final class C11274u0<T> extends AbstractC11352b<T> {

    /* renamed from: g */
    final C11186e<? extends T> f42619g;

    /* renamed from: h */
    final AtomicReference<c<T>> f42620h;

    /* compiled from: OperatorPublish.java */
    /* renamed from: rx.n.a.u0$a */
    static class a implements C11186e.a<T> {

        /* renamed from: f */
        final /* synthetic */ AtomicReference f42621f;

        a(AtomicReference atomicReference) {
            this.f42621f = atomicReference;
        }

        @Override // p456rx.p460m.InterfaceC11205b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(AbstractC11197j<? super T> abstractC11197j) {
            while (true) {
                c cVar = (c) this.f42621f.get();
                if (cVar == null || cVar.isUnsubscribed()) {
                    c cVar2 = new c(this.f42621f);
                    cVar2.m40342f();
                    if (this.f42621f.compareAndSet(cVar, cVar2)) {
                        cVar = cVar2;
                    } else {
                        continue;
                    }
                }
                b<T> bVar = new b<>(cVar, abstractC11197j);
                if (cVar.m40339c(bVar)) {
                    abstractC11197j.add(bVar);
                    abstractC11197j.setProducer(bVar);
                    return;
                }
            }
        }
    }

    /* compiled from: OperatorPublish.java */
    /* renamed from: rx.n.a.u0$b */
    static final class b<T> extends AtomicLong implements InterfaceC11194g, InterfaceC11198k {

        /* renamed from: f */
        final c<T> f42622f;

        /* renamed from: g */
        final AbstractC11197j<? super T> f42623g;

        public b(c<T> cVar, AbstractC11197j<? super T> abstractC11197j) {
            this.f42622f = cVar;
            this.f42623g = abstractC11197j;
            lazySet(-4611686018427387904L);
        }

        /* renamed from: a */
        public long m40338a(long j2) {
            long j3;
            long j4;
            if (j2 <= 0) {
                throw new IllegalArgumentException("Cant produce zero or less");
            }
            do {
                j3 = get();
                if (j3 == -4611686018427387904L) {
                    throw new IllegalStateException("Produced without request");
                }
                if (j3 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                j4 = j3 - j2;
                if (j4 < 0) {
                    throw new IllegalStateException("More produced (" + j2 + ") than requested (" + j3 + ")");
                }
            } while (!compareAndSet(j3, j4));
            return j4;
        }

        @Override // p456rx.InterfaceC11198k
        public boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        @Override // p456rx.InterfaceC11194g
        public void request(long j2) {
            long j3;
            long j4;
            if (j2 < 0) {
                return;
            }
            do {
                j3 = get();
                if (j3 == Long.MIN_VALUE) {
                    return;
                }
                if (j3 >= 0 && j2 == 0) {
                    return;
                }
                if (j3 == -4611686018427387904L) {
                    j4 = j2;
                } else {
                    j4 = j3 + j2;
                    if (j4 < 0) {
                        j4 = Long.MAX_VALUE;
                    }
                }
            } while (!compareAndSet(j3, j4));
            this.f42622f.m40341e();
        }

        @Override // p456rx.InterfaceC11198k
        public void unsubscribe() {
            if (get() == Long.MIN_VALUE || getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE) {
                return;
            }
            this.f42622f.m40343g(this);
            this.f42622f.m40341e();
        }
    }

    /* compiled from: OperatorPublish.java */
    /* renamed from: rx.n.a.u0$c */
    static final class c<T> extends AbstractC11197j<T> implements InterfaceC11198k {

        /* renamed from: f */
        static final b[] f42624f = new b[0];

        /* renamed from: g */
        static final b[] f42625g = new b[0];

        /* renamed from: h */
        final Queue<Object> f42626h;

        /* renamed from: i */
        final AtomicReference<c<T>> f42627i;

        /* renamed from: j */
        volatile Object f42628j;

        /* renamed from: k */
        final AtomicReference<b[]> f42629k;

        /* renamed from: l */
        final AtomicBoolean f42630l;

        /* renamed from: m */
        boolean f42631m;

        /* renamed from: n */
        boolean f42632n;

        /* compiled from: OperatorPublish.java */
        /* renamed from: rx.n.a.u0$c$a */
        class a implements InterfaceC11204a {
            a() {
            }

            @Override // p456rx.p460m.InterfaceC11204a
            public void call() {
                c.this.f42629k.getAndSet(c.f42625g);
                c<T> cVar = c.this;
                cVar.f42627i.compareAndSet(cVar, null);
            }
        }

        public c(AtomicReference<c<T>> atomicReference) {
            this.f42626h = C11350z.m40548b() ? new C11343s<>(C11311h.f42884f) : new C11321e<>(C11311h.f42884f);
            this.f42629k = new AtomicReference<>(f42624f);
            this.f42627i = atomicReference;
            this.f42630l = new AtomicBoolean();
        }

        /* renamed from: c */
        boolean m40339c(b<T> bVar) {
            b[] bVarArr;
            b[] bVarArr2;
            bVar.getClass();
            do {
                bVarArr = this.f42629k.get();
                if (bVarArr == f42625g) {
                    return false;
                }
                int length = bVarArr.length;
                bVarArr2 = new b[length + 1];
                System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                bVarArr2[length] = bVar;
            } while (!this.f42629k.compareAndSet(bVarArr, bVarArr2));
            return true;
        }

        /* renamed from: d */
        boolean m40340d(Object obj, boolean z) {
            int i2 = 0;
            if (obj != null) {
                if (!C11234h.m40220f(obj)) {
                    Throwable m40218d = C11234h.m40218d(obj);
                    this.f42627i.compareAndSet(this, null);
                    try {
                        b[] andSet = this.f42629k.getAndSet(f42625g);
                        int length = andSet.length;
                        while (i2 < length) {
                            andSet[i2].f42623g.onError(m40218d);
                            i2++;
                        }
                        return true;
                    } finally {
                    }
                }
                if (z) {
                    this.f42627i.compareAndSet(this, null);
                    try {
                        b[] andSet2 = this.f42629k.getAndSet(f42625g);
                        int length2 = andSet2.length;
                        while (i2 < length2) {
                            andSet2[i2].f42623g.onCompleted();
                            i2++;
                        }
                        return true;
                    } finally {
                    }
                }
            }
            return false;
        }

        /* renamed from: e */
        void m40341e() {
            boolean z;
            long j2;
            synchronized (this) {
                if (this.f42631m) {
                    this.f42632n = true;
                    return;
                }
                this.f42631m = true;
                this.f42632n = false;
                while (true) {
                    try {
                        Object obj = this.f42628j;
                        boolean isEmpty = this.f42626h.isEmpty();
                        if (m40340d(obj, isEmpty)) {
                            return;
                        }
                        if (!isEmpty) {
                            b[] bVarArr = this.f42629k.get();
                            int length = bVarArr.length;
                            long j3 = Long.MAX_VALUE;
                            int i2 = 0;
                            for (b bVar : bVarArr) {
                                long j4 = bVar.get();
                                if (j4 >= 0) {
                                    j3 = Math.min(j3, j4);
                                } else if (j4 == Long.MIN_VALUE) {
                                    i2++;
                                }
                            }
                            if (length != i2) {
                                int i3 = 0;
                                while (true) {
                                    j2 = i3;
                                    if (j2 >= j3) {
                                        break;
                                    }
                                    Object obj2 = this.f42628j;
                                    Object poll = this.f42626h.poll();
                                    boolean z2 = poll == null;
                                    if (m40340d(obj2, z2)) {
                                        return;
                                    }
                                    if (z2) {
                                        isEmpty = z2;
                                        break;
                                    }
                                    Object m40219e = C11234h.m40219e(poll);
                                    for (b bVar2 : bVarArr) {
                                        if (bVar2.get() > 0) {
                                            try {
                                                bVar2.f42623g.onNext(m40219e);
                                                bVar2.m40338a(1L);
                                            } catch (Throwable th) {
                                                bVar2.unsubscribe();
                                                C11192a.m40142g(th, bVar2.f42623g, m40219e);
                                            }
                                        }
                                    }
                                    i3++;
                                    isEmpty = z2;
                                }
                                if (i3 > 0) {
                                    request(j2);
                                }
                                if (j3 != 0 && !isEmpty) {
                                }
                            } else if (m40340d(this.f42628j, this.f42626h.poll() == null)) {
                                return;
                            } else {
                                request(1L);
                            }
                        }
                        synchronized (this) {
                            try {
                                if (this.f42632n) {
                                    this.f42632n = false;
                                } else {
                                    this.f42631m = false;
                                    try {
                                        return;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z = true;
                                        while (true) {
                                            try {
                                                throw th;
                                            } catch (Throwable th3) {
                                                th = th3;
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                z = false;
                            }
                        }
                        try {
                            throw th;
                        } catch (Throwable th5) {
                            th = th5;
                            if (!z) {
                                synchronized (this) {
                                    this.f42631m = false;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        z = false;
                    }
                }
            }
        }

        /* renamed from: f */
        void m40342f() {
            add(C11381e.m40674a(new a()));
        }

        /* renamed from: g */
        void m40343g(b<T> bVar) {
            b[] bVarArr;
            b[] bVarArr2;
            do {
                bVarArr = this.f42629k.get();
                if (bVarArr == f42624f || bVarArr == f42625g) {
                    return;
                }
                int i2 = -1;
                int length = bVarArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    if (bVarArr[i3].equals(bVar)) {
                        i2 = i3;
                        break;
                    }
                    i3++;
                }
                if (i2 < 0) {
                    return;
                }
                if (length == 1) {
                    bVarArr2 = f42624f;
                } else {
                    b[] bVarArr3 = new b[length - 1];
                    System.arraycopy(bVarArr, 0, bVarArr3, 0, i2);
                    System.arraycopy(bVarArr, i2 + 1, bVarArr3, i2, (length - i2) - 1);
                    bVarArr2 = bVarArr3;
                }
            } while (!this.f42629k.compareAndSet(bVarArr, bVarArr2));
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            if (this.f42628j == null) {
                this.f42628j = C11234h.m40216b();
                m40341e();
            }
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            if (this.f42628j == null) {
                this.f42628j = C11234h.m40217c(th);
                m40341e();
            }
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(T t) {
            if (this.f42626h.offer(C11234h.m40221g(t))) {
                m40341e();
            } else {
                onError(new MissingBackpressureException());
            }
        }

        @Override // p456rx.AbstractC11197j
        public void onStart() {
            request(C11311h.f42884f);
        }
    }

    private C11274u0(C11186e.a<T> aVar, C11186e<? extends T> c11186e, AtomicReference<c<T>> atomicReference) {
        super(aVar);
        this.f42619g = c11186e;
        this.f42620h = atomicReference;
    }

    /* renamed from: k1 */
    public static <T> AbstractC11352b<T> m40335k1(C11186e<? extends T> c11186e) {
        AtomicReference atomicReference = new AtomicReference();
        return new C11274u0(new a(atomicReference), c11186e, atomicReference);
    }

    @Override // p456rx.p469o.AbstractC11352b
    /* renamed from: i1 */
    public void mo40336i1(InterfaceC11205b<? super InterfaceC11198k> interfaceC11205b) {
        c<T> cVar;
        while (true) {
            cVar = this.f42620h.get();
            if (cVar != null && !cVar.isUnsubscribed()) {
                break;
            }
            c<T> cVar2 = new c<>(this.f42620h);
            cVar2.m40342f();
            if (this.f42620h.compareAndSet(cVar, cVar2)) {
                cVar = cVar2;
                break;
            }
        }
        boolean z = !cVar.f42630l.get() && cVar.f42630l.compareAndSet(false, true);
        interfaceC11205b.call(cVar);
        if (z) {
            this.f42619g.m40089c1(cVar);
        }
    }
}
