package p456rx.p461n.p462a;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p456rx.AbstractC11195h;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.exceptions.C11192a;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p470p.C11357e;

/* compiled from: OperatorSampleWithTime.java */
/* renamed from: rx.n.a.v0 */
/* loaded from: classes3.dex */
public final class C11276v0<T> implements C11186e.b<T, T> {

    /* renamed from: f */
    final long f42636f;

    /* renamed from: g */
    final TimeUnit f42637g;

    /* renamed from: h */
    final AbstractC11195h f42638h;

    /* compiled from: OperatorSampleWithTime.java */
    /* renamed from: rx.n.a.v0$a */
    static final class a<T> extends AbstractC11197j<T> implements InterfaceC11204a {

        /* renamed from: f */
        private static final Object f42639f = new Object();

        /* renamed from: g */
        private final AbstractC11197j<? super T> f42640g;

        /* renamed from: h */
        final AtomicReference<Object> f42641h = new AtomicReference<>(f42639f);

        public a(AbstractC11197j<? super T> abstractC11197j) {
            this.f42640g = abstractC11197j;
        }

        /* renamed from: c */
        private void m40346c() {
            AtomicReference<Object> atomicReference = this.f42641h;
            Object obj = f42639f;
            Object andSet = atomicReference.getAndSet(obj);
            if (andSet != obj) {
                try {
                    this.f42640g.onNext(andSet);
                } catch (Throwable th) {
                    C11192a.m40141f(th, this);
                }
            }
        }

        @Override // p456rx.p460m.InterfaceC11204a
        public void call() {
            m40346c();
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            m40346c();
            this.f42640g.onCompleted();
            unsubscribe();
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            this.f42640g.onError(th);
            unsubscribe();
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(T t) {
            this.f42641h.set(t);
        }

        @Override // p456rx.AbstractC11197j
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public C11276v0(long j2, TimeUnit timeUnit, AbstractC11195h abstractC11195h) {
        this.f42636f = j2;
        this.f42637g = timeUnit;
        this.f42638h = abstractC11195h;
    }

    @Override // p456rx.p460m.InterfaceC11208e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC11197j<? super T> call(AbstractC11197j<? super T> abstractC11197j) {
        C11357e c11357e = new C11357e(abstractC11197j);
        AbstractC11195h.a createWorker = this.f42638h.createWorker();
        abstractC11197j.add(createWorker);
        a aVar = new a(c11357e);
        abstractC11197j.add(aVar);
        long j2 = this.f42636f;
        createWorker.mo40148e(aVar, j2, j2, this.f42637g);
        return aVar;
    }
}
