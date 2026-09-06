package p456rx.p461n.p462a;

import java.util.concurrent.TimeUnit;
import p456rx.AbstractC11195h;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.exceptions.C11192a;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p470p.C11357e;
import p456rx.p474t.C11380d;

/* compiled from: OperatorDebounceWithTime.java */
/* renamed from: rx.n.a.k0 */
/* loaded from: classes3.dex */
public final class C11244k0<T> implements C11186e.b<T, T> {

    /* renamed from: f */
    final long f42378f;

    /* renamed from: g */
    final TimeUnit f42379g;

    /* renamed from: h */
    final AbstractC11195h f42380h;

    /* compiled from: OperatorDebounceWithTime.java */
    /* renamed from: rx.n.a.k0$a */
    class a extends AbstractC11197j<T> {

        /* renamed from: f */
        final b<T> f42381f;

        /* renamed from: g */
        final AbstractC11197j<?> f42382g;

        /* renamed from: h */
        final /* synthetic */ C11380d f42383h;

        /* renamed from: i */
        final /* synthetic */ AbstractC11195h.a f42384i;

        /* renamed from: j */
        final /* synthetic */ C11357e f42385j;

        /* compiled from: OperatorDebounceWithTime.java */
        /* renamed from: rx.n.a.k0$a$a, reason: collision with other inner class name */
        class C11550a implements InterfaceC11204a {

            /* renamed from: f */
            final /* synthetic */ int f42387f;

            C11550a(int i2) {
                this.f42387f = i2;
            }

            @Override // p456rx.p460m.InterfaceC11204a
            public void call() {
                a aVar = a.this;
                aVar.f42381f.m40248b(this.f42387f, aVar.f42385j, aVar.f42382g);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC11197j abstractC11197j, C11380d c11380d, AbstractC11195h.a aVar, C11357e c11357e) {
            super(abstractC11197j);
            this.f42383h = c11380d;
            this.f42384i = aVar;
            this.f42385j = c11357e;
            this.f42381f = new b<>();
            this.f42382g = this;
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            this.f42381f.m40249c(this.f42385j, this);
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            this.f42385j.onError(th);
            unsubscribe();
            this.f42381f.m40247a();
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(T t) {
            int m40250d = this.f42381f.m40250d(t);
            C11380d c11380d = this.f42383h;
            AbstractC11195h.a aVar = this.f42384i;
            C11550a c11550a = new C11550a(m40250d);
            C11244k0 c11244k0 = C11244k0.this;
            c11380d.m40673b(aVar.mo40147d(c11550a, c11244k0.f42378f, c11244k0.f42379g));
        }

        @Override // p456rx.AbstractC11197j
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    /* compiled from: OperatorDebounceWithTime.java */
    /* renamed from: rx.n.a.k0$b */
    static final class b<T> {

        /* renamed from: a */
        int f42389a;

        /* renamed from: b */
        T f42390b;

        /* renamed from: c */
        boolean f42391c;

        /* renamed from: d */
        boolean f42392d;

        /* renamed from: e */
        boolean f42393e;

        b() {
        }

        /* renamed from: a */
        public synchronized void m40247a() {
            this.f42389a++;
            this.f42390b = null;
            this.f42391c = false;
        }

        /* renamed from: b */
        public void m40248b(int i2, AbstractC11197j<T> abstractC11197j, AbstractC11197j<?> abstractC11197j2) {
            synchronized (this) {
                if (!this.f42393e && this.f42391c && i2 == this.f42389a) {
                    T t = this.f42390b;
                    this.f42390b = null;
                    this.f42391c = false;
                    this.f42393e = true;
                    try {
                        abstractC11197j.onNext(t);
                        synchronized (this) {
                            if (this.f42392d) {
                                abstractC11197j.onCompleted();
                            } else {
                                this.f42393e = false;
                            }
                        }
                    } catch (Throwable th) {
                        C11192a.m40142g(th, abstractC11197j2, t);
                    }
                }
            }
        }

        /* renamed from: c */
        public void m40249c(AbstractC11197j<T> abstractC11197j, AbstractC11197j<?> abstractC11197j2) {
            synchronized (this) {
                if (this.f42393e) {
                    this.f42392d = true;
                    return;
                }
                T t = this.f42390b;
                boolean z = this.f42391c;
                this.f42390b = null;
                this.f42391c = false;
                this.f42393e = true;
                if (z) {
                    try {
                        abstractC11197j.onNext(t);
                    } catch (Throwable th) {
                        C11192a.m40142g(th, abstractC11197j2, t);
                        return;
                    }
                }
                abstractC11197j.onCompleted();
            }
        }

        /* renamed from: d */
        public synchronized int m40250d(T t) {
            int i2;
            this.f42390b = t;
            this.f42391c = true;
            i2 = this.f42389a + 1;
            this.f42389a = i2;
            return i2;
        }
    }

    public C11244k0(long j2, TimeUnit timeUnit, AbstractC11195h abstractC11195h) {
        this.f42378f = j2;
        this.f42379g = timeUnit;
        this.f42380h = abstractC11195h;
    }

    @Override // p456rx.p460m.InterfaceC11208e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC11197j<? super T> call(AbstractC11197j<? super T> abstractC11197j) {
        AbstractC11195h.a createWorker = this.f42380h.createWorker();
        C11357e c11357e = new C11357e(abstractC11197j);
        C11380d c11380d = new C11380d();
        c11357e.add(createWorker);
        c11357e.add(c11380d);
        return new a(abstractC11197j, c11380d, createWorker, c11357e);
    }
}
