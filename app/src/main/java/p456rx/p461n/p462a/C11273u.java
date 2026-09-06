package p456rx.p461n.p462a;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.InterfaceC11194g;
import p456rx.exceptions.C11192a;

/* compiled from: OnSubscribeFromIterable.java */
/* renamed from: rx.n.a.u */
/* loaded from: classes3.dex */
public final class C11273u<T> implements C11186e.a<T> {

    /* renamed from: f */
    final Iterable<? extends T> f42616f;

    /* compiled from: OnSubscribeFromIterable.java */
    /* renamed from: rx.n.a.u$a */
    static final class a<T> extends AtomicLong implements InterfaceC11194g {

        /* renamed from: f */
        private final AbstractC11197j<? super T> f42617f;

        /* renamed from: g */
        private final Iterator<? extends T> f42618g;

        a(AbstractC11197j<? super T> abstractC11197j, Iterator<? extends T> it) {
            this.f42617f = abstractC11197j;
            this.f42618g = it;
        }

        /* renamed from: a */
        void m40333a() {
            AbstractC11197j<? super T> abstractC11197j = this.f42617f;
            Iterator<? extends T> it = this.f42618g;
            while (!abstractC11197j.isUnsubscribed()) {
                try {
                    abstractC11197j.onNext(it.next());
                    if (abstractC11197j.isUnsubscribed()) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (abstractC11197j.isUnsubscribed()) {
                                return;
                            }
                            abstractC11197j.onCompleted();
                            return;
                        }
                    } catch (Throwable th) {
                        C11192a.m40141f(th, abstractC11197j);
                        return;
                    }
                } catch (Throwable th2) {
                    C11192a.m40141f(th2, abstractC11197j);
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0046, code lost:
        
            r9 = p456rx.p461n.p462a.C11213a.m40163c(r8, r4);
         */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void m40334b(long r9) {
            /*
                r8 = this;
                rx.j<? super T> r0 = r8.f42617f
                java.util.Iterator<? extends T> r1 = r8.f42618g
                r2 = 0
            L6:
                r4 = r2
            L7:
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 == 0) goto L3e
                boolean r6 = r0.isUnsubscribed()
                if (r6 == 0) goto L12
                return
            L12:
                java.lang.Object r6 = r1.next()     // Catch: java.lang.Throwable -> L39
                r0.onNext(r6)
                boolean r6 = r0.isUnsubscribed()
                if (r6 == 0) goto L20
                return
            L20:
                boolean r6 = r1.hasNext()     // Catch: java.lang.Throwable -> L34
                if (r6 != 0) goto L30
                boolean r9 = r0.isUnsubscribed()
                if (r9 != 0) goto L2f
                r0.onCompleted()
            L2f:
                return
            L30:
                r6 = 1
                long r4 = r4 + r6
                goto L7
            L34:
                r9 = move-exception
                p456rx.exceptions.C11192a.m40141f(r9, r0)
                return
            L39:
                r9 = move-exception
                p456rx.exceptions.C11192a.m40141f(r9, r0)
                return
            L3e:
                long r9 = r8.get()
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 != 0) goto L7
                long r9 = p456rx.p461n.p462a.C11213a.m40163c(r8, r4)
                int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r4 != 0) goto L6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p456rx.p461n.p462a.C11273u.a.m40334b(long):void");
        }

        @Override // p456rx.InterfaceC11194g
        public void request(long j2) {
            if (get() == Long.MAX_VALUE) {
                return;
            }
            if (j2 == Long.MAX_VALUE && compareAndSet(0L, Long.MAX_VALUE)) {
                m40333a();
            } else {
                if (j2 <= 0 || C11213a.m40162b(this, j2) != 0) {
                    return;
                }
                m40334b(j2);
            }
        }
    }

    public C11273u(Iterable<? extends T> iterable) {
        if (iterable == null) {
            throw new NullPointerException("iterable must not be null");
        }
        this.f42616f = iterable;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11197j<? super T> abstractC11197j) {
        try {
            Iterator<? extends T> it = this.f42616f.iterator();
            boolean hasNext = it.hasNext();
            if (abstractC11197j.isUnsubscribed()) {
                return;
            }
            if (hasNext) {
                abstractC11197j.setProducer(new a(abstractC11197j, it));
            } else {
                abstractC11197j.onCompleted();
            }
        } catch (Throwable th) {
            C11192a.m40141f(th, abstractC11197j);
        }
    }
}
