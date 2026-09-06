package p241e.p294g.p306b;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.InterfaceC11193f;
import p456rx.p460m.C11206c;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p460m.InterfaceC11205b;
import p456rx.p474t.C11381e;

/* compiled from: RelaySubscriptionManager.java */
/* renamed from: e.g.b.e */
/* loaded from: classes2.dex */
final class C8957e<T> extends AtomicReference<c<T>> implements C11186e.a<T> {

    /* renamed from: f */
    volatile Object f34564f;

    /* renamed from: g */
    boolean f34565g;

    /* renamed from: h */
    InterfaceC11205b<b<T>> f34566h;

    /* renamed from: i */
    InterfaceC11205b<b<T>> f34567i;

    /* compiled from: RelaySubscriptionManager.java */
    /* renamed from: e.g.b.e$a */
    class a implements InterfaceC11204a {

        /* renamed from: f */
        final /* synthetic */ b f34568f;

        a(b bVar) {
            this.f34568f = bVar;
        }

        @Override // p456rx.p460m.InterfaceC11204a
        public void call() {
            C8957e.this.m28600g(this.f34568f);
        }
    }

    /* compiled from: RelaySubscriptionManager.java */
    /* renamed from: e.g.b.e$b */
    static final class b<T> implements InterfaceC11193f<T> {

        /* renamed from: f */
        final InterfaceC11193f<? super T> f34570f;

        /* renamed from: g */
        boolean f34571g = true;

        /* renamed from: h */
        boolean f34572h;

        /* renamed from: i */
        List<Object> f34573i;

        /* renamed from: j */
        boolean f34574j;

        b(InterfaceC11193f<? super T> interfaceC11193f) {
            this.f34570f = interfaceC11193f;
        }

        /* renamed from: a */
        private void m28602a(Object obj) {
            if (obj != null) {
                C8954b.m28591a(this.f34570f, obj);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void m28603c(java.util.List<java.lang.Object> r5, java.lang.Object r6) {
            /*
                r4 = this;
                r0 = 1
                r1 = 1
            L2:
                r2 = 0
                if (r5 == 0) goto L1a
                java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L17
            L9:
                boolean r3 = r5.hasNext()     // Catch: java.lang.Throwable -> L17
                if (r3 == 0) goto L1a
                java.lang.Object r3 = r5.next()     // Catch: java.lang.Throwable -> L17
                r4.m28602a(r3)     // Catch: java.lang.Throwable -> L17
                goto L9
            L17:
                r5 = move-exception
                r0 = 0
                goto L36
            L1a:
                if (r1 == 0) goto L20
                r4.m28602a(r6)     // Catch: java.lang.Throwable -> L17
                r1 = 0
            L20:
                monitor-enter(r4)     // Catch: java.lang.Throwable -> L17
                java.util.List<java.lang.Object> r5 = r4.f34573i     // Catch: java.lang.Throwable -> L2e
                r3 = 0
                r4.f34573i = r3     // Catch: java.lang.Throwable -> L2e
                if (r5 != 0) goto L2c
                r4.f34572h = r2     // Catch: java.lang.Throwable -> L2e
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L34
                return
            L2c:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L2e
                goto L2
            L2e:
                r5 = move-exception
                r0 = 0
            L30:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L34
                throw r5     // Catch: java.lang.Throwable -> L32
            L32:
                r5 = move-exception
                goto L36
            L34:
                r5 = move-exception
                goto L30
            L36:
                if (r0 != 0) goto L40
                monitor-enter(r4)
                r4.f34572h = r2     // Catch: java.lang.Throwable -> L3d
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L3d
                goto L40
            L3d:
                r5 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L3d
                throw r5
            L40:
                goto L42
            L41:
                throw r5
            L42:
                goto L41
            */
            throw new UnsupportedOperationException("Method not decompiled: p241e.p294g.p306b.C8957e.b.m28603c(java.util.List, java.lang.Object):void");
        }

        /* renamed from: b */
        void m28604b(Object obj) {
            synchronized (this) {
                if (this.f34571g && !this.f34572h) {
                    this.f34571g = false;
                    this.f34572h = obj != null;
                    if (obj != null) {
                        m28603c(null, obj);
                    }
                }
            }
        }

        /* renamed from: d */
        void m28605d(Object obj) {
            if (!this.f34574j) {
                synchronized (this) {
                    this.f34571g = false;
                    if (this.f34572h) {
                        if (this.f34573i == null) {
                            this.f34573i = new ArrayList();
                        }
                        this.f34573i.add(obj);
                        return;
                    }
                    this.f34574j = true;
                }
            }
            C8954b.m28591a(this.f34570f, obj);
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            throw new AssertionError();
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            throw new AssertionError();
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(T t) {
            this.f34570f.onNext(t);
        }
    }

    /* compiled from: RelaySubscriptionManager.java */
    /* renamed from: e.g.b.e$c */
    static final class c<T> {

        /* renamed from: a */
        static final c f34575a = new c(new b[0]);

        /* renamed from: b */
        final b[] f34576b;

        c(b[] bVarArr) {
            this.f34576b = bVarArr;
        }

        /* renamed from: a */
        c m28606a(b bVar) {
            b[] bVarArr = this.f34576b;
            int length = bVarArr.length;
            b[] bVarArr2 = new b[length + 1];
            System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
            bVarArr2[length] = bVar;
            return new c(bVarArr2);
        }

        /* renamed from: b */
        c m28607b(b bVar) {
            b[] bVarArr = this.f34576b;
            int length = bVarArr.length;
            if (length == 1 && bVarArr[0] == bVar) {
                return f34575a;
            }
            if (length == 0) {
                return this;
            }
            int i2 = length - 1;
            b[] bVarArr2 = new b[i2];
            int i3 = 0;
            for (b bVar2 : bVarArr) {
                if (bVar2 != bVar) {
                    if (i3 == i2) {
                        return this;
                    }
                    bVarArr2[i3] = bVar2;
                    i3++;
                }
            }
            if (i3 == 0) {
                return f34575a;
            }
            if (i3 < i2) {
                b[] bVarArr3 = new b[i3];
                System.arraycopy(bVarArr2, 0, bVarArr3, 0, i3);
                bVarArr2 = bVarArr3;
            }
            return new c(bVarArr2);
        }
    }

    C8957e() {
        super(c.f34575a);
        this.f34565g = true;
        this.f34566h = C11206c.m40157a();
        this.f34567i = C11206c.m40157a();
    }

    /* renamed from: a */
    private void m28594a(b<T> bVar) {
        c<T> cVar;
        do {
            cVar = get();
        } while (!compareAndSet(cVar, cVar.m28606a(bVar)));
        this.f34567i.call(bVar);
    }

    /* renamed from: b */
    private void m28595b(AbstractC11197j<? super T> abstractC11197j, b<T> bVar) {
        abstractC11197j.add(C11381e.m40674a(new a(bVar)));
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11197j<? super T> abstractC11197j) {
        b<T> bVar = new b<>(abstractC11197j);
        m28595b(abstractC11197j, bVar);
        this.f34566h.call(bVar);
        if (abstractC11197j.isUnsubscribed()) {
            return;
        }
        m28594a(bVar);
        if (abstractC11197j.isUnsubscribed()) {
            m28600g(bVar);
        }
    }

    /* renamed from: d */
    Object m28597d() {
        return this.f34564f;
    }

    /* renamed from: e */
    b<T>[] m28598e(Object obj) {
        m28601h(obj);
        return get().f34576b;
    }

    /* renamed from: f */
    b<T>[] m28599f() {
        return get().f34576b;
    }

    /* renamed from: g */
    void m28600g(b<T> bVar) {
        c<T> cVar;
        c<T> m28607b;
        do {
            cVar = get();
            m28607b = cVar.m28607b(bVar);
            if (m28607b == cVar) {
                return;
            }
        } while (!compareAndSet(cVar, m28607b));
    }

    /* renamed from: h */
    void m28601h(Object obj) {
        this.f34564f = obj;
    }
}
