package p323h.p324a.p329z.p334e.p338d;

import io.reactivex.exceptions.C9207a;
import java.util.Collection;
import java.util.concurrent.Callable;
import p323h.p324a.InterfaceC9046p;
import p323h.p324a.InterfaceC9047q;
import p323h.p324a.p327x.InterfaceC9056c;
import p323h.p324a.p329z.p330a.EnumC9070c;
import p323h.p324a.p329z.p330a.EnumC9071d;
import p323h.p324a.p329z.p331b.C9075b;

/* compiled from: ObservableToList.java */
/* renamed from: h.a.z.e.d.r */
/* loaded from: classes2.dex */
public final class C9115r<T, U extends Collection<? super T>> extends AbstractC9098a<T, U> {

    /* renamed from: g */
    final Callable<U> f35125g;

    /* compiled from: ObservableToList.java */
    /* renamed from: h.a.z.e.d.r$a */
    static final class a<T, U extends Collection<? super T>> implements InterfaceC9047q<T>, InterfaceC9056c {

        /* renamed from: f */
        final InterfaceC9047q<? super U> f35126f;

        /* renamed from: g */
        InterfaceC9056c f35127g;

        /* renamed from: h */
        U f35128h;

        a(InterfaceC9047q<? super U> interfaceC9047q, U u) {
            this.f35126f = interfaceC9047q;
            this.f35128h = u;
        }

        @Override // p323h.p324a.InterfaceC9047q
        /* renamed from: a */
        public void mo29218a() {
            U u = this.f35128h;
            this.f35128h = null;
            this.f35126f.onNext(u);
            this.f35126f.mo29218a();
        }

        @Override // p323h.p324a.InterfaceC9047q
        /* renamed from: b */
        public void mo29219b(InterfaceC9056c interfaceC9056c) {
            if (EnumC9070c.m29249D(this.f35127g, interfaceC9056c)) {
                this.f35127g = interfaceC9056c;
                this.f35126f.mo29219b(this);
            }
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: k */
        public void mo29115k() {
            this.f35127g.mo29115k();
        }

        @Override // p323h.p324a.InterfaceC9047q
        public void onError(Throwable th) {
            this.f35128h = null;
            this.f35126f.onError(th);
        }

        @Override // p323h.p324a.InterfaceC9047q
        public void onNext(T t) {
            this.f35128h.add(t);
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: q */
        public boolean mo29116q() {
            return this.f35127g.mo29116q();
        }
    }

    public C9115r(InterfaceC9046p<T> interfaceC9046p, Callable<U> callable) {
        super(interfaceC9046p);
        this.f35125g = callable;
    }

    @Override // p323h.p324a.AbstractC9043m
    /* renamed from: x */
    public void mo29214x(InterfaceC9047q<? super U> interfaceC9047q) {
        try {
            this.f35009f.mo29199a(new a(interfaceC9047q, (Collection) C9075b.m29271c(this.f35125g.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            C9207a.m30000a(th);
            EnumC9071d.m29257x(th, interfaceC9047q);
        }
    }
}
