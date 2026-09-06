package p323h.p324a.p329z.p334e.p338d;

import android.R;
import io.reactivex.exceptions.C9207a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import p323h.p324a.AbstractC9043m;
import p323h.p324a.InterfaceC9046p;
import p323h.p324a.InterfaceC9047q;
import p323h.p324a.p325a0.C9030a;
import p323h.p324a.p328y.InterfaceC9065f;
import p323h.p324a.p329z.p330a.EnumC9071d;
import p323h.p324a.p329z.p331b.C9075b;
import p323h.p324a.p329z.p332c.InterfaceC9077b;

/* compiled from: ObservableScalarXMap.java */
/* renamed from: h.a.z.e.d.p */
/* loaded from: classes2.dex */
public final class C9113p {

    /* compiled from: ObservableScalarXMap.java */
    /* renamed from: h.a.z.e.d.p$a */
    public static final class a<T> extends AtomicInteger implements InterfaceC9077b<T>, Runnable {

        /* renamed from: f */
        final InterfaceC9047q<? super T> f35116f;

        /* renamed from: g */
        final T f35117g;

        public a(InterfaceC9047q<? super T> interfaceC9047q, T t) {
            this.f35116f = interfaceC9047q;
            this.f35117g = t;
        }

        @Override // p323h.p324a.p329z.p332c.InterfaceC9081f
        public void clear() {
            lazySet(3);
        }

        @Override // p323h.p324a.p329z.p332c.InterfaceC9078c
        /* renamed from: g */
        public int mo29259g(int i2) {
            if ((i2 & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        @Override // p323h.p324a.p329z.p332c.InterfaceC9081f
        public boolean isEmpty() {
            return get() != 1;
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: k */
        public void mo29115k() {
            set(3);
        }

        @Override // p323h.p324a.p329z.p332c.InterfaceC9081f
        public boolean offer(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // p323h.p324a.p329z.p332c.InterfaceC9081f
        public T poll() throws Exception {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.f35117g;
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: q */
        public boolean mo29116q() {
            return get() == 3;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.f35116f.onNext(this.f35117g);
                if (get() == 2) {
                    lazySet(3);
                    this.f35116f.mo29218a();
                }
            }
        }
    }

    /* compiled from: ObservableScalarXMap.java */
    /* renamed from: h.a.z.e.d.p$b */
    static final class b<T, R> extends AbstractC9043m<R> {

        /* renamed from: f */
        final T f35118f;

        /* renamed from: g */
        final InterfaceC9065f<? super T, ? extends InterfaceC9046p<? extends R>> f35119g;

        b(T t, InterfaceC9065f<? super T, ? extends InterfaceC9046p<? extends R>> interfaceC9065f) {
            this.f35118f = t;
            this.f35119g = interfaceC9065f;
        }

        @Override // p323h.p324a.AbstractC9043m
        /* renamed from: x */
        public void mo29214x(InterfaceC9047q<? super R> interfaceC9047q) {
            try {
                InterfaceC9046p interfaceC9046p = (InterfaceC9046p) C9075b.m29271c(this.f35119g.mo4660a(this.f35118f), "The mapper returned a null ObservableSource");
                if (!(interfaceC9046p instanceof Callable)) {
                    interfaceC9046p.mo29199a(interfaceC9047q);
                    return;
                }
                try {
                    Object call = ((Callable) interfaceC9046p).call();
                    if (call == null) {
                        EnumC9071d.m29256v(interfaceC9047q);
                        return;
                    }
                    a aVar = new a(interfaceC9047q, call);
                    interfaceC9047q.mo29219b(aVar);
                    aVar.run();
                } catch (Throwable th) {
                    C9207a.m30000a(th);
                    EnumC9071d.m29257x(th, interfaceC9047q);
                }
            } catch (Throwable th2) {
                EnumC9071d.m29257x(th2, interfaceC9047q);
            }
        }
    }

    /* renamed from: a */
    public static <T, U> AbstractC9043m<U> m29309a(T t, InterfaceC9065f<? super T, ? extends InterfaceC9046p<? extends U>> interfaceC9065f) {
        return C9030a.m29145m(new b(t, interfaceC9065f));
    }

    /* renamed from: b */
    public static <T, R> boolean m29310b(InterfaceC9046p<T> interfaceC9046p, InterfaceC9047q<? super R> interfaceC9047q, InterfaceC9065f<? super T, ? extends InterfaceC9046p<? extends R>> interfaceC9065f) {
        if (!(interfaceC9046p instanceof Callable)) {
            return false;
        }
        try {
            R.attr attrVar = (Object) ((Callable) interfaceC9046p).call();
            if (attrVar == null) {
                EnumC9071d.m29256v(interfaceC9047q);
                return true;
            }
            try {
                InterfaceC9046p interfaceC9046p2 = (InterfaceC9046p) C9075b.m29271c(interfaceC9065f.mo4660a(attrVar), "The mapper returned a null ObservableSource");
                if (interfaceC9046p2 instanceof Callable) {
                    try {
                        Object call = ((Callable) interfaceC9046p2).call();
                        if (call == null) {
                            EnumC9071d.m29256v(interfaceC9047q);
                            return true;
                        }
                        a aVar = new a(interfaceC9047q, call);
                        interfaceC9047q.mo29219b(aVar);
                        aVar.run();
                    } catch (Throwable th) {
                        C9207a.m30000a(th);
                        EnumC9071d.m29257x(th, interfaceC9047q);
                        return true;
                    }
                } else {
                    interfaceC9046p2.mo29199a(interfaceC9047q);
                }
                return true;
            } catch (Throwable th2) {
                C9207a.m30000a(th2);
                EnumC9071d.m29257x(th2, interfaceC9047q);
                return true;
            }
        } catch (Throwable th3) {
            C9207a.m30000a(th3);
            EnumC9071d.m29257x(th3, interfaceC9047q);
            return true;
        }
    }
}
