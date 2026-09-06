package p323h.p324a.p329z.p334e.p338d;

import io.reactivex.exceptions.C9207a;
import java.util.Iterator;
import p323h.p324a.InterfaceC9046p;
import p323h.p324a.InterfaceC9047q;
import p323h.p324a.p325a0.C9030a;
import p323h.p324a.p327x.InterfaceC9056c;
import p323h.p324a.p328y.InterfaceC9065f;
import p323h.p324a.p329z.p330a.EnumC9070c;
import p323h.p324a.p329z.p331b.C9075b;

/* compiled from: ObservableFlattenIterable.java */
/* renamed from: h.a.z.e.d.j */
/* loaded from: classes2.dex */
public final class C9107j<T, R> extends AbstractC9098a<T, R> {

    /* renamed from: g */
    final InterfaceC9065f<? super T, ? extends Iterable<? extends R>> f35085g;

    /* compiled from: ObservableFlattenIterable.java */
    /* renamed from: h.a.z.e.d.j$a */
    static final class a<T, R> implements InterfaceC9047q<T>, InterfaceC9056c {

        /* renamed from: f */
        final InterfaceC9047q<? super R> f35086f;

        /* renamed from: g */
        final InterfaceC9065f<? super T, ? extends Iterable<? extends R>> f35087g;

        /* renamed from: h */
        InterfaceC9056c f35088h;

        a(InterfaceC9047q<? super R> interfaceC9047q, InterfaceC9065f<? super T, ? extends Iterable<? extends R>> interfaceC9065f) {
            this.f35086f = interfaceC9047q;
            this.f35087g = interfaceC9065f;
        }

        @Override // p323h.p324a.InterfaceC9047q
        /* renamed from: a */
        public void mo29218a() {
            InterfaceC9056c interfaceC9056c = this.f35088h;
            EnumC9070c enumC9070c = EnumC9070c.DISPOSED;
            if (interfaceC9056c == enumC9070c) {
                return;
            }
            this.f35088h = enumC9070c;
            this.f35086f.mo29218a();
        }

        @Override // p323h.p324a.InterfaceC9047q
        /* renamed from: b */
        public void mo29219b(InterfaceC9056c interfaceC9056c) {
            if (EnumC9070c.m29249D(this.f35088h, interfaceC9056c)) {
                this.f35088h = interfaceC9056c;
                this.f35086f.mo29219b(this);
            }
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: k */
        public void mo29115k() {
            this.f35088h.mo29115k();
            this.f35088h = EnumC9070c.DISPOSED;
        }

        @Override // p323h.p324a.InterfaceC9047q
        public void onError(Throwable th) {
            InterfaceC9056c interfaceC9056c = this.f35088h;
            EnumC9070c enumC9070c = EnumC9070c.DISPOSED;
            if (interfaceC9056c == enumC9070c) {
                C9030a.m29147o(th);
            } else {
                this.f35088h = enumC9070c;
                this.f35086f.onError(th);
            }
        }

        @Override // p323h.p324a.InterfaceC9047q
        public void onNext(T t) {
            if (this.f35088h == EnumC9070c.DISPOSED) {
                return;
            }
            try {
                Iterator<? extends R> it = this.f35087g.mo4660a(t).iterator();
                InterfaceC9047q<? super R> interfaceC9047q = this.f35086f;
                while (it.hasNext()) {
                    try {
                        try {
                            interfaceC9047q.onNext((Object) C9075b.m29271c(it.next(), "The iterator returned a null value"));
                        } catch (Throwable th) {
                            C9207a.m30000a(th);
                            this.f35088h.mo29115k();
                            onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        C9207a.m30000a(th2);
                        this.f35088h.mo29115k();
                        onError(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                C9207a.m30000a(th3);
                this.f35088h.mo29115k();
                onError(th3);
            }
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: q */
        public boolean mo29116q() {
            return this.f35088h.mo29116q();
        }
    }

    public C9107j(InterfaceC9046p<T> interfaceC9046p, InterfaceC9065f<? super T, ? extends Iterable<? extends R>> interfaceC9065f) {
        super(interfaceC9046p);
        this.f35085g = interfaceC9065f;
    }

    @Override // p323h.p324a.AbstractC9043m
    /* renamed from: x */
    protected void mo29214x(InterfaceC9047q<? super R> interfaceC9047q) {
        this.f35009f.mo29199a(new a(interfaceC9047q, this.f35085g));
    }
}
