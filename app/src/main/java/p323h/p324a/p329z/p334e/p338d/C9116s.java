package p323h.p324a.p329z.p334e.p338d;

import io.reactivex.exceptions.C9207a;
import java.util.Collection;
import java.util.concurrent.Callable;
import p323h.p324a.AbstractC9043m;
import p323h.p324a.AbstractC9049s;
import p323h.p324a.InterfaceC9046p;
import p323h.p324a.InterfaceC9047q;
import p323h.p324a.InterfaceC9051u;
import p323h.p324a.p325a0.C9030a;
import p323h.p324a.p327x.InterfaceC9056c;
import p323h.p324a.p329z.p330a.EnumC9070c;
import p323h.p324a.p329z.p330a.EnumC9071d;
import p323h.p324a.p329z.p331b.C9074a;
import p323h.p324a.p329z.p331b.C9075b;
import p323h.p324a.p329z.p332c.InterfaceC9076a;

/* compiled from: ObservableToListSingle.java */
/* renamed from: h.a.z.e.d.s */
/* loaded from: classes2.dex */
public final class C9116s<T, U extends Collection<? super T>> extends AbstractC9049s<U> implements InterfaceC9076a<U> {

    /* renamed from: a */
    final InterfaceC9046p<T> f35129a;

    /* renamed from: b */
    final Callable<U> f35130b;

    /* compiled from: ObservableToListSingle.java */
    /* renamed from: h.a.z.e.d.s$a */
    static final class a<T, U extends Collection<? super T>> implements InterfaceC9047q<T>, InterfaceC9056c {

        /* renamed from: f */
        final InterfaceC9051u<? super U> f35131f;

        /* renamed from: g */
        U f35132g;

        /* renamed from: h */
        InterfaceC9056c f35133h;

        a(InterfaceC9051u<? super U> interfaceC9051u, U u) {
            this.f35131f = interfaceC9051u;
            this.f35132g = u;
        }

        @Override // p323h.p324a.InterfaceC9047q
        /* renamed from: a */
        public void mo29218a() {
            U u = this.f35132g;
            this.f35132g = null;
            this.f35131f.onSuccess(u);
        }

        @Override // p323h.p324a.InterfaceC9047q
        /* renamed from: b */
        public void mo29219b(InterfaceC9056c interfaceC9056c) {
            if (EnumC9070c.m29249D(this.f35133h, interfaceC9056c)) {
                this.f35133h = interfaceC9056c;
                this.f35131f.mo29132b(this);
            }
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: k */
        public void mo29115k() {
            this.f35133h.mo29115k();
        }

        @Override // p323h.p324a.InterfaceC9047q
        public void onError(Throwable th) {
            this.f35132g = null;
            this.f35131f.onError(th);
        }

        @Override // p323h.p324a.InterfaceC9047q
        public void onNext(T t) {
            this.f35132g.add(t);
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: q */
        public boolean mo29116q() {
            return this.f35133h.mo29116q();
        }
    }

    public C9116s(InterfaceC9046p<T> interfaceC9046p, int i2) {
        this.f35129a = interfaceC9046p;
        this.f35130b = C9074a.m29262a(i2);
    }

    @Override // p323h.p324a.p329z.p332c.InterfaceC9076a
    /* renamed from: a */
    public AbstractC9043m<U> mo29273a() {
        return C9030a.m29145m(new C9115r(this.f35129a, this.f35130b));
    }

    @Override // p323h.p324a.AbstractC9049s
    /* renamed from: h */
    public void mo29129h(InterfaceC9051u<? super U> interfaceC9051u) {
        try {
            this.f35129a.mo29199a(new a(interfaceC9051u, (Collection) C9075b.m29271c(this.f35130b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            C9207a.m30000a(th);
            EnumC9071d.m29258y(th, interfaceC9051u);
        }
    }
}
