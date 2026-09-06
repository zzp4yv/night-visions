package p323h.p324a;

import io.reactivex.exceptions.C9207a;
import java.util.concurrent.Callable;
import p323h.p324a.p325a0.C9030a;
import p323h.p324a.p329z.p331b.C9075b;
import p323h.p324a.p329z.p334e.p335a.C9085a;
import p323h.p324a.p329z.p334e.p335a.C9086b;
import p323h.p324a.p329z.p334e.p335a.C9088d;

/* compiled from: Completable.java */
/* renamed from: h.a.b */
/* loaded from: classes2.dex */
public abstract class AbstractC9031b implements InterfaceC9036f {
    /* renamed from: c */
    public static AbstractC9031b m29157c(InterfaceC9035e interfaceC9035e) {
        C9075b.m29271c(interfaceC9035e, "source is null");
        return C9030a.m29142j(new C9085a(interfaceC9035e));
    }

    /* renamed from: d */
    public static AbstractC9031b m29158d(Callable<?> callable) {
        C9075b.m29271c(callable, "callable is null");
        return C9030a.m29142j(new C9086b(callable));
    }

    /* renamed from: g */
    private static NullPointerException m29159g(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    @Override // p323h.p324a.InterfaceC9036f
    /* renamed from: b */
    public final void mo29160b(InterfaceC9034d interfaceC9034d) {
        C9075b.m29271c(interfaceC9034d, "observer is null");
        try {
            InterfaceC9034d m29151s = C9030a.m29151s(this, interfaceC9034d);
            C9075b.m29271c(m29151s, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo29113e(m29151s);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            C9207a.m30000a(th);
            C9030a.m29147o(th);
            throw m29159g(th);
        }
    }

    /* renamed from: e */
    protected abstract void mo29113e(InterfaceC9034d interfaceC9034d);

    /* renamed from: f */
    public final AbstractC9031b m29161f(AbstractC9048r abstractC9048r) {
        C9075b.m29271c(abstractC9048r, "scheduler is null");
        return C9030a.m29142j(new C9088d(this, abstractC9048r));
    }
}
