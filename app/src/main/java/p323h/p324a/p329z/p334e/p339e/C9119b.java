package p323h.p324a.p329z.p334e.p339e;

import io.reactivex.exceptions.C9207a;
import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.AbstractC9049s;
import p323h.p324a.InterfaceC9051u;
import p323h.p324a.InterfaceC9053w;
import p323h.p324a.p327x.InterfaceC9056c;
import p323h.p324a.p328y.InterfaceC9065f;
import p323h.p324a.p329z.p330a.EnumC9070c;
import p323h.p324a.p329z.p331b.C9075b;

/* compiled from: SingleFlatMap.java */
/* renamed from: h.a.z.e.e.b */
/* loaded from: classes2.dex */
public final class C9119b<T, R> extends AbstractC9049s<R> {

    /* renamed from: a */
    final InterfaceC9053w<? extends T> f35141a;

    /* renamed from: b */
    final InterfaceC9065f<? super T, ? extends InterfaceC9053w<? extends R>> f35142b;

    /* compiled from: SingleFlatMap.java */
    /* renamed from: h.a.z.e.e.b$a */
    static final class a<T, R> extends AtomicReference<InterfaceC9056c> implements InterfaceC9051u<T>, InterfaceC9056c {

        /* renamed from: f */
        final InterfaceC9051u<? super R> f35143f;

        /* renamed from: g */
        final InterfaceC9065f<? super T, ? extends InterfaceC9053w<? extends R>> f35144g;

        /* compiled from: SingleFlatMap.java */
        /* renamed from: h.a.z.e.e.b$a$a, reason: collision with other inner class name */
        static final class C11483a<R> implements InterfaceC9051u<R> {

            /* renamed from: f */
            final AtomicReference<InterfaceC9056c> f35145f;

            /* renamed from: g */
            final InterfaceC9051u<? super R> f35146g;

            C11483a(AtomicReference<InterfaceC9056c> atomicReference, InterfaceC9051u<? super R> interfaceC9051u) {
                this.f35145f = atomicReference;
                this.f35146g = interfaceC9051u;
            }

            @Override // p323h.p324a.InterfaceC9051u
            /* renamed from: b */
            public void mo29132b(InterfaceC9056c interfaceC9056c) {
                EnumC9070c.m29252v(this.f35145f, interfaceC9056c);
            }

            @Override // p323h.p324a.InterfaceC9051u
            public void onError(Throwable th) {
                this.f35146g.onError(th);
            }

            @Override // p323h.p324a.InterfaceC9051u
            public void onSuccess(R r) {
                this.f35146g.onSuccess(r);
            }
        }

        a(InterfaceC9051u<? super R> interfaceC9051u, InterfaceC9065f<? super T, ? extends InterfaceC9053w<? extends R>> interfaceC9065f) {
            this.f35143f = interfaceC9051u;
            this.f35144g = interfaceC9065f;
        }

        @Override // p323h.p324a.InterfaceC9051u
        /* renamed from: b */
        public void mo29132b(InterfaceC9056c interfaceC9056c) {
            if (EnumC9070c.m29248A(this, interfaceC9056c)) {
                this.f35143f.mo29132b(this);
            }
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: k */
        public void mo29115k() {
            EnumC9070c.m29250g(this);
        }

        @Override // p323h.p324a.InterfaceC9051u
        public void onError(Throwable th) {
            this.f35143f.onError(th);
        }

        @Override // p323h.p324a.InterfaceC9051u
        public void onSuccess(T t) {
            try {
                InterfaceC9053w interfaceC9053w = (InterfaceC9053w) C9075b.m29271c(this.f35144g.mo4660a(t), "The single returned by the mapper is null");
                if (mo29116q()) {
                    return;
                }
                interfaceC9053w.mo29228b(new C11483a(this, this.f35143f));
            } catch (Throwable th) {
                C9207a.m30000a(th);
                this.f35143f.onError(th);
            }
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: q */
        public boolean mo29116q() {
            return EnumC9070c.m29251u(get());
        }
    }

    public C9119b(InterfaceC9053w<? extends T> interfaceC9053w, InterfaceC9065f<? super T, ? extends InterfaceC9053w<? extends R>> interfaceC9065f) {
        this.f35142b = interfaceC9065f;
        this.f35141a = interfaceC9053w;
    }

    @Override // p323h.p324a.AbstractC9049s
    /* renamed from: h */
    protected void mo29129h(InterfaceC9051u<? super R> interfaceC9051u) {
        this.f35141a.mo29228b(new a(interfaceC9051u, this.f35142b));
    }
}
