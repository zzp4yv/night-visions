package p323h.p324a;

import io.reactivex.exceptions.C9207a;
import java.util.concurrent.Callable;
import p323h.p324a.p325a0.C9030a;
import p323h.p324a.p329z.p331b.C9075b;
import p323h.p324a.p329z.p334e.p337c.C9095a;
import p323h.p324a.p329z.p334e.p337c.C9097c;
import p323h.p324a.p329z.p334e.p337c.CallableC9096b;

/* compiled from: Maybe.java */
/* renamed from: h.a.j */
/* loaded from: classes2.dex */
public abstract class AbstractC9040j<T> implements InterfaceC9042l<T> {
    /* renamed from: b */
    public static <T> AbstractC9040j<T> m29180b() {
        return C9030a.m29144l(C9095a.f35006f);
    }

    /* renamed from: c */
    public static <T> AbstractC9040j<T> m29181c(Callable<? extends T> callable) {
        C9075b.m29271c(callable, "callable is null");
        return C9030a.m29144l(new CallableC9096b(callable));
    }

    /* renamed from: d */
    public static <T> AbstractC9040j<T> m29182d(T t) {
        C9075b.m29271c(t, "item is null");
        return C9030a.m29144l(new C9097c(t));
    }

    @Override // p323h.p324a.InterfaceC9042l
    /* renamed from: a */
    public final void mo29183a(InterfaceC9041k<? super T> interfaceC9041k) {
        C9075b.m29271c(interfaceC9041k, "observer is null");
        InterfaceC9041k<? super T> m29152t = C9030a.m29152t(this, interfaceC9041k);
        C9075b.m29271c(m29152t, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            mo29184e(m29152t);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            C9207a.m30000a(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: e */
    protected abstract void mo29184e(InterfaceC9041k<? super T> interfaceC9041k);
}
