package p456rx.p461n.p462a;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.InterfaceC11198k;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p460m.InterfaceC11205b;
import p456rx.p469o.AbstractC11352b;
import p456rx.p474t.C11378b;
import p456rx.p474t.C11381e;

/* compiled from: OnSubscribeRefCount.java */
/* renamed from: rx.n.a.z */
/* loaded from: classes3.dex */
public final class C11283z<T> implements C11186e.a<T> {

    /* renamed from: f */
    private final AbstractC11352b<? extends T> f42703f;

    /* renamed from: g */
    volatile C11378b f42704g = new C11378b();

    /* renamed from: h */
    final AtomicInteger f42705h = new AtomicInteger(0);

    /* renamed from: i */
    final ReentrantLock f42706i = new ReentrantLock();

    /* compiled from: OnSubscribeRefCount.java */
    /* renamed from: rx.n.a.z$a */
    class a implements InterfaceC11205b<InterfaceC11198k> {

        /* renamed from: f */
        final /* synthetic */ AbstractC11197j f42707f;

        /* renamed from: g */
        final /* synthetic */ AtomicBoolean f42708g;

        a(AbstractC11197j abstractC11197j, AtomicBoolean atomicBoolean) {
            this.f42707f = abstractC11197j;
            this.f42708g = atomicBoolean;
        }

        @Override // p456rx.p460m.InterfaceC11205b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(InterfaceC11198k interfaceC11198k) {
            try {
                C11283z.this.f42704g.m40667a(interfaceC11198k);
                C11283z c11283z = C11283z.this;
                c11283z.m40369d(this.f42707f, c11283z.f42704g);
            } finally {
                C11283z.this.f42706i.unlock();
                this.f42708g.set(false);
            }
        }
    }

    /* compiled from: OnSubscribeRefCount.java */
    /* renamed from: rx.n.a.z$b */
    class b extends AbstractC11197j<T> {

        /* renamed from: f */
        final /* synthetic */ AbstractC11197j f42710f;

        /* renamed from: g */
        final /* synthetic */ C11378b f42711g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AbstractC11197j abstractC11197j, AbstractC11197j abstractC11197j2, C11378b c11378b) {
            super(abstractC11197j);
            this.f42710f = abstractC11197j2;
            this.f42711g = c11378b;
        }

        /* renamed from: c */
        void m40371c() {
            C11283z.this.f42706i.lock();
            try {
                if (C11283z.this.f42704g == this.f42711g) {
                    if (C11283z.this.f42703f instanceof InterfaceC11198k) {
                        ((InterfaceC11198k) C11283z.this.f42703f).unsubscribe();
                    }
                    C11283z.this.f42704g.unsubscribe();
                    C11283z.this.f42704g = new C11378b();
                    C11283z.this.f42705h.set(0);
                }
            } finally {
                C11283z.this.f42706i.unlock();
            }
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            m40371c();
            this.f42710f.onCompleted();
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            m40371c();
            this.f42710f.onError(th);
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(T t) {
            this.f42710f.onNext(t);
        }
    }

    /* compiled from: OnSubscribeRefCount.java */
    /* renamed from: rx.n.a.z$c */
    class c implements InterfaceC11204a {

        /* renamed from: f */
        final /* synthetic */ C11378b f42713f;

        c(C11378b c11378b) {
            this.f42713f = c11378b;
        }

        @Override // p456rx.p460m.InterfaceC11204a
        public void call() {
            C11283z.this.f42706i.lock();
            try {
                if (C11283z.this.f42704g == this.f42713f && C11283z.this.f42705h.decrementAndGet() == 0) {
                    if (C11283z.this.f42703f instanceof InterfaceC11198k) {
                        ((InterfaceC11198k) C11283z.this.f42703f).unsubscribe();
                    }
                    C11283z.this.f42704g.unsubscribe();
                    C11283z.this.f42704g = new C11378b();
                }
            } finally {
                C11283z.this.f42706i.unlock();
            }
        }
    }

    public C11283z(AbstractC11352b<? extends T> abstractC11352b) {
        this.f42703f = abstractC11352b;
    }

    /* renamed from: c */
    private InterfaceC11198k m40366c(C11378b c11378b) {
        return C11381e.m40674a(new c(c11378b));
    }

    /* renamed from: e */
    private InterfaceC11205b<InterfaceC11198k> m40367e(AbstractC11197j<? super T> abstractC11197j, AtomicBoolean atomicBoolean) {
        return new a(abstractC11197j, atomicBoolean);
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11197j<? super T> abstractC11197j) {
        this.f42706i.lock();
        if (this.f42705h.incrementAndGet() != 1) {
            try {
                m40369d(abstractC11197j, this.f42704g);
            } finally {
                this.f42706i.unlock();
            }
        } else {
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            try {
                this.f42703f.mo40336i1(m40367e(abstractC11197j, atomicBoolean));
            } finally {
                if (atomicBoolean.get()) {
                }
            }
        }
    }

    /* renamed from: d */
    void m40369d(AbstractC11197j<? super T> abstractC11197j, C11378b c11378b) {
        abstractC11197j.add(m40366c(c11378b));
        this.f42703f.m40089c1(new b(abstractC11197j, abstractC11197j, c11378b));
    }
}
