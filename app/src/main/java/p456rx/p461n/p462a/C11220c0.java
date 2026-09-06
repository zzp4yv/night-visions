package p456rx.p461n.p462a;

import java.util.concurrent.atomic.AtomicInteger;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.InterfaceC11194g;
import p456rx.p461n.p463b.C11285a;
import p456rx.p474t.C11380d;

/* compiled from: OnSubscribeSwitchIfEmpty.java */
/* renamed from: rx.n.a.c0 */
/* loaded from: classes3.dex */
public final class C11220c0<T> implements C11186e.a<T> {

    /* renamed from: f */
    final C11186e<? extends T> f42207f;

    /* renamed from: g */
    final C11186e<? extends T> f42208g;

    /* compiled from: OnSubscribeSwitchIfEmpty.java */
    /* renamed from: rx.n.a.c0$a */
    static final class a<T> extends AbstractC11197j<T> {

        /* renamed from: f */
        private final C11285a f42209f;

        /* renamed from: g */
        private final AbstractC11197j<? super T> f42210g;

        a(AbstractC11197j<? super T> abstractC11197j, C11285a c11285a) {
            this.f42210g = abstractC11197j;
            this.f42209f = c11285a;
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            this.f42210g.onCompleted();
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            this.f42210g.onError(th);
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(T t) {
            this.f42210g.onNext(t);
            this.f42209f.m40374b(1L);
        }

        @Override // p456rx.AbstractC11197j
        public void setProducer(InterfaceC11194g interfaceC11194g) {
            this.f42209f.m40375c(interfaceC11194g);
        }
    }

    /* compiled from: OnSubscribeSwitchIfEmpty.java */
    /* renamed from: rx.n.a.c0$b */
    static final class b<T> extends AbstractC11197j<T> {

        /* renamed from: g */
        private final AbstractC11197j<? super T> f42212g;

        /* renamed from: h */
        private final C11380d f42213h;

        /* renamed from: i */
        private final C11285a f42214i;

        /* renamed from: j */
        private final C11186e<? extends T> f42215j;

        /* renamed from: l */
        volatile boolean f42217l;

        /* renamed from: f */
        private boolean f42211f = true;

        /* renamed from: k */
        final AtomicInteger f42216k = new AtomicInteger();

        b(AbstractC11197j<? super T> abstractC11197j, C11380d c11380d, C11285a c11285a, C11186e<? extends T> c11186e) {
            this.f42212g = abstractC11197j;
            this.f42213h = c11380d;
            this.f42214i = c11285a;
            this.f42215j = c11186e;
        }

        /* renamed from: c */
        void m40190c(C11186e<? extends T> c11186e) {
            if (this.f42216k.getAndIncrement() == 0) {
                while (!this.f42212g.isUnsubscribed()) {
                    if (!this.f42217l) {
                        if (c11186e == null) {
                            a aVar = new a(this.f42212g, this.f42214i);
                            this.f42213h.m40673b(aVar);
                            this.f42217l = true;
                            this.f42215j.m40089c1(aVar);
                        } else {
                            this.f42217l = true;
                            c11186e.m40089c1(this);
                            c11186e = null;
                        }
                    }
                    if (this.f42216k.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            if (!this.f42211f) {
                this.f42212g.onCompleted();
            } else {
                if (this.f42212g.isUnsubscribed()) {
                    return;
                }
                this.f42217l = false;
                m40190c(null);
            }
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            this.f42212g.onError(th);
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(T t) {
            this.f42211f = false;
            this.f42212g.onNext(t);
            this.f42214i.m40374b(1L);
        }

        @Override // p456rx.AbstractC11197j
        public void setProducer(InterfaceC11194g interfaceC11194g) {
            this.f42214i.m40375c(interfaceC11194g);
        }
    }

    public C11220c0(C11186e<? extends T> c11186e, C11186e<? extends T> c11186e2) {
        this.f42207f = c11186e;
        this.f42208g = c11186e2;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11197j<? super T> abstractC11197j) {
        C11380d c11380d = new C11380d();
        C11285a c11285a = new C11285a();
        b bVar = new b(abstractC11197j, c11380d, c11285a, this.f42208g);
        c11380d.m40673b(bVar);
        abstractC11197j.add(c11380d);
        abstractC11197j.setProducer(c11285a);
        bVar.m40190c(this.f42207f);
    }
}
