package p323h.p324a.p329z.p334e.p338d;

import io.reactivex.exceptions.C9207a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.AbstractC9031b;
import p323h.p324a.AbstractC9043m;
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
import p323h.p324a.p329z.p332c.InterfaceC9076a;
import p323h.p324a.p329z.p344j.C9143a;

/* compiled from: ObservableFlatMapCompletableCompletable.java */
/* renamed from: h.a.z.e.d.h */
/* loaded from: classes2.dex */
public final class C9105h<T> extends AbstractC9031b implements InterfaceC9076a<T> {

    /* renamed from: a */
    final InterfaceC9046p<T> f35062a;

    /* renamed from: b */
    final InterfaceC9065f<? super T, ? extends InterfaceC9036f> f35063b;

    /* renamed from: c */
    final boolean f35064c;

    /* compiled from: ObservableFlatMapCompletableCompletable.java */
    /* renamed from: h.a.z.e.d.h$a */
    static final class a<T> extends AtomicInteger implements InterfaceC9056c, InterfaceC9047q<T> {

        /* renamed from: f */
        final InterfaceC9034d f35065f;

        /* renamed from: h */
        final InterfaceC9065f<? super T, ? extends InterfaceC9036f> f35067h;

        /* renamed from: i */
        final boolean f35068i;

        /* renamed from: k */
        InterfaceC9056c f35070k;

        /* renamed from: l */
        volatile boolean f35071l;

        /* renamed from: g */
        final C9143a f35066g = new C9143a();

        /* renamed from: j */
        final C9055b f35069j = new C9055b();

        /* compiled from: ObservableFlatMapCompletableCompletable.java */
        /* renamed from: h.a.z.e.d.h$a$a, reason: collision with other inner class name */
        final class C11480a extends AtomicReference<InterfaceC9056c> implements InterfaceC9034d, InterfaceC9056c {
            C11480a() {
            }

            @Override // p323h.p324a.InterfaceC9034d
            /* renamed from: a */
            public void mo29118a() {
                a.this.m29295c(this);
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
                a.this.m29296d(this, th);
            }

            @Override // p323h.p324a.p327x.InterfaceC9056c
            /* renamed from: q */
            public boolean mo29116q() {
                return EnumC9070c.m29251u(get());
            }
        }

        a(InterfaceC9034d interfaceC9034d, InterfaceC9065f<? super T, ? extends InterfaceC9036f> interfaceC9065f, boolean z) {
            this.f35065f = interfaceC9034d;
            this.f35067h = interfaceC9065f;
            this.f35068i = z;
            lazySet(1);
        }

        @Override // p323h.p324a.InterfaceC9047q
        /* renamed from: a */
        public void mo29218a() {
            if (decrementAndGet() == 0) {
                Throwable m29385b = this.f35066g.m29385b();
                if (m29385b != null) {
                    this.f35065f.onError(m29385b);
                } else {
                    this.f35065f.mo29118a();
                }
            }
        }

        @Override // p323h.p324a.InterfaceC9047q
        /* renamed from: b */
        public void mo29219b(InterfaceC9056c interfaceC9056c) {
            if (EnumC9070c.m29249D(this.f35070k, interfaceC9056c)) {
                this.f35070k = interfaceC9056c;
                this.f35065f.mo29119b(this);
            }
        }

        /* renamed from: c */
        void m29295c(a<T>.C11480a c11480a) {
            this.f35069j.mo29240c(c11480a);
            mo29218a();
        }

        /* renamed from: d */
        void m29296d(a<T>.C11480a c11480a, Throwable th) {
            this.f35069j.mo29240c(c11480a);
            onError(th);
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: k */
        public void mo29115k() {
            this.f35071l = true;
            this.f35070k.mo29115k();
            this.f35069j.mo29115k();
        }

        @Override // p323h.p324a.InterfaceC9047q
        public void onError(Throwable th) {
            if (!this.f35066g.m29384a(th)) {
                C9030a.m29147o(th);
                return;
            }
            if (this.f35068i) {
                if (decrementAndGet() == 0) {
                    this.f35065f.onError(this.f35066g.m29385b());
                    return;
                }
                return;
            }
            mo29115k();
            if (getAndSet(0) > 0) {
                this.f35065f.onError(this.f35066g.m29385b());
            }
        }

        @Override // p323h.p324a.InterfaceC9047q
        public void onNext(T t) {
            try {
                InterfaceC9036f interfaceC9036f = (InterfaceC9036f) C9075b.m29271c(this.f35067h.mo4660a(t), "The mapper returned a null CompletableSource");
                getAndIncrement();
                C11480a c11480a = new C11480a();
                if (this.f35071l || !this.f35069j.mo29239b(c11480a)) {
                    return;
                }
                interfaceC9036f.mo29160b(c11480a);
            } catch (Throwable th) {
                C9207a.m30000a(th);
                this.f35070k.mo29115k();
                onError(th);
            }
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: q */
        public boolean mo29116q() {
            return this.f35070k.mo29116q();
        }
    }

    public C9105h(InterfaceC9046p<T> interfaceC9046p, InterfaceC9065f<? super T, ? extends InterfaceC9036f> interfaceC9065f, boolean z) {
        this.f35062a = interfaceC9046p;
        this.f35063b = interfaceC9065f;
        this.f35064c = z;
    }

    @Override // p323h.p324a.p329z.p332c.InterfaceC9076a
    /* renamed from: a */
    public AbstractC9043m<T> mo29273a() {
        return C9030a.m29145m(new C9104g(this.f35062a, this.f35063b, this.f35064c));
    }

    @Override // p323h.p324a.AbstractC9031b
    /* renamed from: e */
    protected void mo29113e(InterfaceC9034d interfaceC9034d) {
        this.f35062a.mo29199a(new a(interfaceC9034d, this.f35063b, this.f35064c));
    }
}
