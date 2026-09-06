package p456rx.p461n.p462a;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.InterfaceC11194g;
import p456rx.exceptions.C11192a;
import p456rx.exceptions.MissingBackpressureException;
import p456rx.p460m.InterfaceC11208e;
import p456rx.p461n.p462a.C11273u;
import p456rx.p461n.p466e.C11311h;
import p456rx.p461n.p466e.C11313j;
import p456rx.p461n.p466e.EnumC11308e;
import p456rx.p461n.p466e.p467n.C11321e;
import p456rx.p461n.p466e.p467n.C11323g;
import p456rx.p461n.p466e.p468o.C11343s;
import p456rx.p461n.p466e.p468o.C11350z;
import p456rx.p471q.C11361c;

/* compiled from: OnSubscribeFlattenIterable.java */
/* renamed from: rx.n.a.r */
/* loaded from: classes3.dex */
public final class C11264r<T, R> implements C11186e.a<R> {

    /* renamed from: f */
    final C11186e<? extends T> f42541f;

    /* renamed from: g */
    final InterfaceC11208e<? super T, ? extends Iterable<? extends R>> f42542g;

    /* renamed from: h */
    final int f42543h;

    /* compiled from: OnSubscribeFlattenIterable.java */
    /* renamed from: rx.n.a.r$a */
    class a implements InterfaceC11194g {

        /* renamed from: f */
        final /* synthetic */ b f42544f;

        a(b bVar) {
            this.f42544f = bVar;
        }

        @Override // p456rx.InterfaceC11194g
        public void request(long j2) {
            this.f42544f.m40307e(j2);
        }
    }

    /* compiled from: OnSubscribeFlattenIterable.java */
    /* renamed from: rx.n.a.r$b */
    static final class b<T, R> extends AbstractC11197j<T> {

        /* renamed from: f */
        final AbstractC11197j<? super R> f42546f;

        /* renamed from: g */
        final InterfaceC11208e<? super T, ? extends Iterable<? extends R>> f42547g;

        /* renamed from: h */
        final long f42548h;

        /* renamed from: i */
        final Queue<Object> f42549i;

        /* renamed from: m */
        volatile boolean f42553m;

        /* renamed from: n */
        long f42554n;

        /* renamed from: o */
        Iterator<? extends R> f42555o;

        /* renamed from: j */
        final AtomicReference<Throwable> f42550j = new AtomicReference<>();

        /* renamed from: l */
        final AtomicInteger f42552l = new AtomicInteger();

        /* renamed from: k */
        final AtomicLong f42551k = new AtomicLong();

        public b(AbstractC11197j<? super R> abstractC11197j, InterfaceC11208e<? super T, ? extends Iterable<? extends R>> interfaceC11208e, int i2) {
            this.f42546f = abstractC11197j;
            this.f42547g = interfaceC11208e;
            if (i2 == Integer.MAX_VALUE) {
                this.f42548h = Long.MAX_VALUE;
                this.f42549i = new C11323g(C11311h.f42884f);
            } else {
                this.f42548h = i2 - (i2 >> 2);
                if (C11350z.m40548b()) {
                    this.f42549i = new C11343s(i2);
                } else {
                    this.f42549i = new C11321e(i2);
                }
            }
            request(i2);
        }

        /* renamed from: c */
        boolean m40305c(boolean z, boolean z2, AbstractC11197j<?> abstractC11197j, Queue<?> queue) {
            if (abstractC11197j.isUnsubscribed()) {
                queue.clear();
                this.f42555o = null;
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.f42550j.get() == null) {
                if (!z2) {
                    return false;
                }
                abstractC11197j.onCompleted();
                return true;
            }
            Throwable m40423q = EnumC11308e.m40423q(this.f42550j);
            unsubscribe();
            queue.clear();
            this.f42555o = null;
            abstractC11197j.onError(m40423q);
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00d8 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0010 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x00cf A[SYNTHETIC] */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void m40306d() {
            /*
                Method dump skipped, instructions count: 217
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p456rx.p461n.p462a.C11264r.b.m40306d():void");
        }

        /* renamed from: e */
        void m40307e(long j2) {
            if (j2 > 0) {
                C11213a.m40162b(this.f42551k, j2);
                m40306d();
            } else {
                if (j2 >= 0) {
                    return;
                }
                throw new IllegalStateException("n >= 0 required but it was " + j2);
            }
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            this.f42553m = true;
            m40306d();
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            if (!EnumC11308e.m40421g(this.f42550j, th)) {
                C11361c.m40578j(th);
            } else {
                this.f42553m = true;
                m40306d();
            }
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(T t) {
            if (this.f42549i.offer(C11234h.m40221g(t))) {
                m40306d();
            } else {
                unsubscribe();
                onError(new MissingBackpressureException());
            }
        }
    }

    /* compiled from: OnSubscribeFlattenIterable.java */
    /* renamed from: rx.n.a.r$c */
    static final class c<T, R> implements C11186e.a<R> {

        /* renamed from: f */
        final T f42556f;

        /* renamed from: g */
        final InterfaceC11208e<? super T, ? extends Iterable<? extends R>> f42557g;

        public c(T t, InterfaceC11208e<? super T, ? extends Iterable<? extends R>> interfaceC11208e) {
            this.f42556f = t;
            this.f42557g = interfaceC11208e;
        }

        @Override // p456rx.p460m.InterfaceC11205b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(AbstractC11197j<? super R> abstractC11197j) {
            try {
                Iterator<? extends R> it = this.f42557g.call(this.f42556f).iterator();
                if (it.hasNext()) {
                    abstractC11197j.setProducer(new C11273u.a(abstractC11197j, it));
                } else {
                    abstractC11197j.onCompleted();
                }
            } catch (Throwable th) {
                C11192a.m40142g(th, abstractC11197j, this.f42556f);
            }
        }
    }

    protected C11264r(C11186e<? extends T> c11186e, InterfaceC11208e<? super T, ? extends Iterable<? extends R>> interfaceC11208e, int i2) {
        this.f42541f = c11186e;
        this.f42542g = interfaceC11208e;
        this.f42543h = i2;
    }

    /* renamed from: b */
    public static <T, R> C11186e<R> m40303b(C11186e<? extends T> c11186e, InterfaceC11208e<? super T, ? extends Iterable<? extends R>> interfaceC11208e, int i2) {
        return c11186e instanceof C11313j ? C11186e.m40035b1(new c(((C11313j) c11186e).m40448h1(), interfaceC11208e)) : C11186e.m40035b1(new C11264r(c11186e, interfaceC11208e, i2));
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11197j<? super R> abstractC11197j) {
        b bVar = new b(abstractC11197j, this.f42542g, this.f42543h);
        abstractC11197j.add(bVar);
        abstractC11197j.setProducer(new a(bVar));
        this.f42541f.m40089c1(bVar);
    }
}
