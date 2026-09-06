package p323h.p324a.p329z.p334e.p338d;

import io.reactivex.exceptions.C9207a;
import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.InterfaceC9034d;
import p323h.p324a.InterfaceC9036f;
import p323h.p324a.InterfaceC9046p;
import p323h.p324a.InterfaceC9047q;
import p323h.p324a.p325a0.C9030a;
import p323h.p324a.p327x.C9055b;
import p323h.p324a.p327x.InterfaceC9056c;
import p323h.p324a.p328y.InterfaceC9065f;
import p323h.p324a.p329z.p330a.EnumC9070c;
import p323h.p324a.p329z.p331b.C9075b;
import p323h.p324a.p329z.p333d.AbstractC9082a;
import p323h.p324a.p329z.p344j.C9143a;

/* compiled from: ObservableFlatMapCompletable.java */
/* renamed from: h.a.z.e.d.g */
/* loaded from: classes2.dex */
public final class C9104g<T> extends AbstractC9098a<T, T> {

    /* renamed from: g */
    final InterfaceC9065f<? super T, ? extends InterfaceC9036f> f35052g;

    /* renamed from: h */
    final boolean f35053h;

    /* compiled from: ObservableFlatMapCompletable.java */
    /* renamed from: h.a.z.e.d.g$a */
    static final class a<T> extends AbstractC9082a<T> implements InterfaceC9047q<T> {

        /* renamed from: f */
        final InterfaceC9047q<? super T> f35054f;

        /* renamed from: h */
        final InterfaceC9065f<? super T, ? extends InterfaceC9036f> f35056h;

        /* renamed from: i */
        final boolean f35057i;

        /* renamed from: k */
        InterfaceC9056c f35059k;

        /* renamed from: l */
        volatile boolean f35060l;

        /* renamed from: g */
        final C9143a f35055g = new C9143a();

        /* renamed from: j */
        final C9055b f35058j = new C9055b();

        /* compiled from: ObservableFlatMapCompletable.java */
        /* renamed from: h.a.z.e.d.g$a$a, reason: collision with other inner class name */
        final class C11479a extends AtomicReference<InterfaceC9056c> implements InterfaceC9034d, InterfaceC9056c {
            C11479a() {
            }

            @Override // p323h.p324a.InterfaceC9034d
            /* renamed from: a */
            public void mo29118a() {
                a.this.m29293c(this);
            }

            @Override // p323h.p324a.InterfaceC9034d
            /* renamed from: b */
            public void mo29119b(InterfaceC9056c interfaceC9056c) {
                EnumC9070c.m29248A(this, interfaceC9056c);
            }

            @Override // p323h.p324a.p327x.InterfaceC9056c
            /* renamed from: k */
            public void mo29115k() {
                EnumC9070c.m29250g(this);
            }

            @Override // p323h.p324a.InterfaceC9034d
            public void onError(Throwable th) {
                a.this.m29294d(this, th);
            }

            @Override // p323h.p324a.p327x.InterfaceC9056c
            /* renamed from: q */
            public boolean mo29116q() {
                return EnumC9070c.m29251u(get());
            }
        }

        a(InterfaceC9047q<? super T> interfaceC9047q, InterfaceC9065f<? super T, ? extends InterfaceC9036f> interfaceC9065f, boolean z) {
            this.f35054f = interfaceC9047q;
            this.f35056h = interfaceC9065f;
            this.f35057i = z;
            lazySet(1);
        }

        @Override // p323h.p324a.InterfaceC9047q
        /* renamed from: a */
        public void mo29218a() {
            if (decrementAndGet() == 0) {
                Throwable m29385b = this.f35055g.m29385b();
                if (m29385b != null) {
                    this.f35054f.onError(m29385b);
                } else {
                    this.f35054f.mo29218a();
                }
            }
        }

        @Override // p323h.p324a.InterfaceC9047q
        /* renamed from: b */
        public void mo29219b(InterfaceC9056c interfaceC9056c) {
            if (EnumC9070c.m29249D(this.f35059k, interfaceC9056c)) {
                this.f35059k = interfaceC9056c;
                this.f35054f.mo29219b(this);
            }
        }

        /* renamed from: c */
        void m29293c(a<T>.C11479a c11479a) {
            this.f35058j.mo29240c(c11479a);
            mo29218a();
        }

        @Override // p323h.p324a.p329z.p332c.InterfaceC9081f
        public void clear() {
        }

        /* renamed from: d */
        void m29294d(a<T>.C11479a c11479a, Throwable th) {
            this.f35058j.mo29240c(c11479a);
            onError(th);
        }

        @Override // p323h.p324a.p329z.p332c.InterfaceC9078c
        /* renamed from: g */
        public int mo29259g(int i2) {
            return i2 & 2;
        }

        @Override // p323h.p324a.p329z.p332c.InterfaceC9081f
        public boolean isEmpty() {
            return true;
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: k */
        public void mo29115k() {
            this.f35060l = true;
            this.f35059k.mo29115k();
            this.f35058j.mo29115k();
        }

        @Override // p323h.p324a.InterfaceC9047q
        public void onError(Throwable th) {
            if (!this.f35055g.m29384a(th)) {
                C9030a.m29147o(th);
                return;
            }
            if (this.f35057i) {
                if (decrementAndGet() == 0) {
                    this.f35054f.onError(this.f35055g.m29385b());
                    return;
                }
                return;
            }
            mo29115k();
            if (getAndSet(0) > 0) {
                this.f35054f.onError(this.f35055g.m29385b());
            }
        }

        @Override // p323h.p324a.InterfaceC9047q
        public void onNext(T t) {
            try {
                InterfaceC9036f interfaceC9036f = (InterfaceC9036f) C9075b.m29271c(this.f35056h.mo4660a(t), "The mapper returned a null CompletableSource");
                getAndIncrement();
                C11479a c11479a = new C11479a();
                if (this.f35060l || !this.f35058j.mo29239b(c11479a)) {
                    return;
                }
                interfaceC9036f.mo29160b(c11479a);
            } catch (Throwable th) {
                C9207a.m30000a(th);
                this.f35059k.mo29115k();
                onError(th);
            }
        }

        @Override // p323h.p324a.p329z.p332c.InterfaceC9081f
        public T poll() throws Exception {
            return null;
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: q */
        public boolean mo29116q() {
            return this.f35059k.mo29116q();
        }
    }

    public C9104g(InterfaceC9046p<T> interfaceC9046p, InterfaceC9065f<? super T, ? extends InterfaceC9036f> interfaceC9065f, boolean z) {
        super(interfaceC9046p);
        this.f35052g = interfaceC9065f;
        this.f35053h = z;
    }

    @Override // p323h.p324a.AbstractC9043m
    /* renamed from: x */
    protected void mo29214x(InterfaceC9047q<? super T> interfaceC9047q) {
        this.f35009f.mo29199a(new a(interfaceC9047q, this.f35052g, this.f35053h));
    }
}
