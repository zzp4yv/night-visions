package p323h.p324a.p329z.p334e.p338d;

import io.reactivex.exceptions.C9207a;
import io.reactivex.exceptions.CompositeException;
import p323h.p324a.InterfaceC9046p;
import p323h.p324a.InterfaceC9047q;
import p323h.p324a.p327x.InterfaceC9056c;
import p323h.p324a.p328y.InterfaceC9065f;
import p323h.p324a.p329z.p330a.EnumC9070c;

/* compiled from: ObservableOnErrorReturn.java */
/* renamed from: h.a.z.e.d.o */
/* loaded from: classes2.dex */
public final class C9112o<T> extends AbstractC9098a<T, T> {

    /* renamed from: g */
    final InterfaceC9065f<? super Throwable, ? extends T> f35112g;

    /* compiled from: ObservableOnErrorReturn.java */
    /* renamed from: h.a.z.e.d.o$a */
    static final class a<T> implements InterfaceC9047q<T>, InterfaceC9056c {

        /* renamed from: f */
        final InterfaceC9047q<? super T> f35113f;

        /* renamed from: g */
        final InterfaceC9065f<? super Throwable, ? extends T> f35114g;

        /* renamed from: h */
        InterfaceC9056c f35115h;

        a(InterfaceC9047q<? super T> interfaceC9047q, InterfaceC9065f<? super Throwable, ? extends T> interfaceC9065f) {
            this.f35113f = interfaceC9047q;
            this.f35114g = interfaceC9065f;
        }

        @Override // p323h.p324a.InterfaceC9047q
        /* renamed from: a */
        public void mo29218a() {
            this.f35113f.mo29218a();
        }

        @Override // p323h.p324a.InterfaceC9047q
        /* renamed from: b */
        public void mo29219b(InterfaceC9056c interfaceC9056c) {
            if (EnumC9070c.m29249D(this.f35115h, interfaceC9056c)) {
                this.f35115h = interfaceC9056c;
                this.f35113f.mo29219b(this);
            }
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: k */
        public void mo29115k() {
            this.f35115h.mo29115k();
        }

        @Override // p323h.p324a.InterfaceC9047q
        public void onError(Throwable th) {
            try {
                T mo4660a = this.f35114g.mo4660a(th);
                if (mo4660a != null) {
                    this.f35113f.onNext(mo4660a);
                    this.f35113f.mo29218a();
                } else {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    this.f35113f.onError(nullPointerException);
                }
            } catch (Throwable th2) {
                C9207a.m30000a(th2);
                this.f35113f.onError(new CompositeException(th, th2));
            }
        }

        @Override // p323h.p324a.InterfaceC9047q
        public void onNext(T t) {
            this.f35113f.onNext(t);
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: q */
        public boolean mo29116q() {
            return this.f35115h.mo29116q();
        }
    }

    public C9112o(InterfaceC9046p<T> interfaceC9046p, InterfaceC9065f<? super Throwable, ? extends T> interfaceC9065f) {
        super(interfaceC9046p);
        this.f35112g = interfaceC9065f;
    }

    @Override // p323h.p324a.AbstractC9043m
    /* renamed from: x */
    public void mo29214x(InterfaceC9047q<? super T> interfaceC9047q) {
        this.f35009f.mo29199a(new a(interfaceC9047q, this.f35112g));
    }
}
