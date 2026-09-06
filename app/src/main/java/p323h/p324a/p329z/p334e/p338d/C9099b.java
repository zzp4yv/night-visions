package p323h.p324a.p329z.p334e.p338d;

import io.reactivex.exceptions.C9207a;
import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.AbstractC9043m;
import p323h.p324a.InterfaceC9044n;
import p323h.p324a.InterfaceC9045o;
import p323h.p324a.InterfaceC9047q;
import p323h.p324a.p325a0.C9030a;
import p323h.p324a.p327x.InterfaceC9056c;
import p323h.p324a.p329z.p330a.EnumC9070c;

/* compiled from: ObservableCreate.java */
/* renamed from: h.a.z.e.d.b */
/* loaded from: classes2.dex */
public final class C9099b<T> extends AbstractC9043m<T> {

    /* renamed from: f */
    final InterfaceC9045o<T> f35010f;

    /* compiled from: ObservableCreate.java */
    /* renamed from: h.a.z.e.d.b$a */
    static final class a<T> extends AtomicReference<InterfaceC9056c> implements InterfaceC9044n<T>, InterfaceC9056c {

        /* renamed from: f */
        final InterfaceC9047q<? super T> f35011f;

        a(InterfaceC9047q<? super T> interfaceC9047q) {
            this.f35011f = interfaceC9047q;
        }

        @Override // p323h.p324a.InterfaceC9044n
        /* renamed from: a */
        public void mo29217a(InterfaceC9056c interfaceC9056c) {
            EnumC9070c.m29254y(this, interfaceC9056c);
        }

        /* renamed from: b */
        public void m29281b(Throwable th) {
            if (m29282c(th)) {
                return;
            }
            C9030a.m29147o(th);
        }

        /* renamed from: c */
        public boolean m29282c(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (mo29116q()) {
                return false;
            }
            try {
                this.f35011f.onError(th);
                mo29115k();
                return true;
            } catch (Throwable th2) {
                mo29115k();
                throw th2;
            }
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: k */
        public void mo29115k() {
            EnumC9070c.m29250g(this);
        }

        @Override // p323h.p324a.InterfaceC9037g
        public void onNext(T t) {
            if (t == null) {
                m29281b(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                if (mo29116q()) {
                    return;
                }
                this.f35011f.onNext(t);
            }
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: q */
        public boolean mo29116q() {
            return EnumC9070c.m29251u(get());
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", a.class.getSimpleName(), super.toString());
        }
    }

    public C9099b(InterfaceC9045o<T> interfaceC9045o) {
        this.f35010f = interfaceC9045o;
    }

    @Override // p323h.p324a.AbstractC9043m
    /* renamed from: x */
    protected void mo29214x(InterfaceC9047q<? super T> interfaceC9047q) {
        a aVar = new a(interfaceC9047q);
        interfaceC9047q.mo29219b(aVar);
        try {
            this.f35010f.mo4659a(aVar);
        } catch (Throwable th) {
            C9207a.m30000a(th);
            aVar.m29281b(th);
        }
    }
}
