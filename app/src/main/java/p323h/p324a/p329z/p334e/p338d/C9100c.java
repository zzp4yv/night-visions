package p323h.p324a.p329z.p334e.p338d;

import io.reactivex.exceptions.C9207a;
import io.reactivex.exceptions.CompositeException;
import p323h.p324a.InterfaceC9046p;
import p323h.p324a.InterfaceC9047q;
import p323h.p324a.p325a0.C9030a;
import p323h.p324a.p327x.InterfaceC9056c;
import p323h.p324a.p328y.InterfaceC9060a;
import p323h.p324a.p328y.InterfaceC9064e;
import p323h.p324a.p329z.p330a.EnumC9070c;

/* compiled from: ObservableDoOnEach.java */
/* renamed from: h.a.z.e.d.c */
/* loaded from: classes2.dex */
public final class C9100c<T> extends AbstractC9098a<T, T> {

    /* renamed from: g */
    final InterfaceC9064e<? super T> f35012g;

    /* renamed from: h */
    final InterfaceC9064e<? super Throwable> f35013h;

    /* renamed from: i */
    final InterfaceC9060a f35014i;

    /* renamed from: j */
    final InterfaceC9060a f35015j;

    /* compiled from: ObservableDoOnEach.java */
    /* renamed from: h.a.z.e.d.c$a */
    static final class a<T> implements InterfaceC9047q<T>, InterfaceC9056c {

        /* renamed from: f */
        final InterfaceC9047q<? super T> f35016f;

        /* renamed from: g */
        final InterfaceC9064e<? super T> f35017g;

        /* renamed from: h */
        final InterfaceC9064e<? super Throwable> f35018h;

        /* renamed from: i */
        final InterfaceC9060a f35019i;

        /* renamed from: j */
        final InterfaceC9060a f35020j;

        /* renamed from: k */
        InterfaceC9056c f35021k;

        /* renamed from: l */
        boolean f35022l;

        a(InterfaceC9047q<? super T> interfaceC9047q, InterfaceC9064e<? super T> interfaceC9064e, InterfaceC9064e<? super Throwable> interfaceC9064e2, InterfaceC9060a interfaceC9060a, InterfaceC9060a interfaceC9060a2) {
            this.f35016f = interfaceC9047q;
            this.f35017g = interfaceC9064e;
            this.f35018h = interfaceC9064e2;
            this.f35019i = interfaceC9060a;
            this.f35020j = interfaceC9060a2;
        }

        @Override // p323h.p324a.InterfaceC9047q
        /* renamed from: a */
        public void mo29218a() {
            if (this.f35022l) {
                return;
            }
            try {
                this.f35019i.run();
                this.f35022l = true;
                this.f35016f.mo29218a();
                try {
                    this.f35020j.run();
                } catch (Throwable th) {
                    C9207a.m30000a(th);
                    C9030a.m29147o(th);
                }
            } catch (Throwable th2) {
                C9207a.m30000a(th2);
                onError(th2);
            }
        }

        @Override // p323h.p324a.InterfaceC9047q
        /* renamed from: b */
        public void mo29219b(InterfaceC9056c interfaceC9056c) {
            if (EnumC9070c.m29249D(this.f35021k, interfaceC9056c)) {
                this.f35021k = interfaceC9056c;
                this.f35016f.mo29219b(this);
            }
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: k */
        public void mo29115k() {
            this.f35021k.mo29115k();
        }

        @Override // p323h.p324a.InterfaceC9047q
        public void onError(Throwable th) {
            if (this.f35022l) {
                C9030a.m29147o(th);
                return;
            }
            this.f35022l = true;
            try {
                this.f35018h.mo7420a(th);
            } catch (Throwable th2) {
                C9207a.m30000a(th2);
                th = new CompositeException(th, th2);
            }
            this.f35016f.onError(th);
            try {
                this.f35020j.run();
            } catch (Throwable th3) {
                C9207a.m30000a(th3);
                C9030a.m29147o(th3);
            }
        }

        @Override // p323h.p324a.InterfaceC9047q
        public void onNext(T t) {
            if (this.f35022l) {
                return;
            }
            try {
                this.f35017g.mo7420a(t);
                this.f35016f.onNext(t);
            } catch (Throwable th) {
                C9207a.m30000a(th);
                this.f35021k.mo29115k();
                onError(th);
            }
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: q */
        public boolean mo29116q() {
            return this.f35021k.mo29116q();
        }
    }

    public C9100c(InterfaceC9046p<T> interfaceC9046p, InterfaceC9064e<? super T> interfaceC9064e, InterfaceC9064e<? super Throwable> interfaceC9064e2, InterfaceC9060a interfaceC9060a, InterfaceC9060a interfaceC9060a2) {
        super(interfaceC9046p);
        this.f35012g = interfaceC9064e;
        this.f35013h = interfaceC9064e2;
        this.f35014i = interfaceC9060a;
        this.f35015j = interfaceC9060a2;
    }

    @Override // p323h.p324a.AbstractC9043m
    /* renamed from: x */
    public void mo29214x(InterfaceC9047q<? super T> interfaceC9047q) {
        this.f35009f.mo29199a(new a(interfaceC9047q, this.f35012g, this.f35013h, this.f35014i, this.f35015j));
    }
}
