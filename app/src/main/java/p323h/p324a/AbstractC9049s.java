package p323h.p324a;

import io.reactivex.exceptions.C9207a;
import p323h.p324a.p325a0.C9030a;
import p323h.p324a.p328y.InterfaceC9065f;
import p323h.p324a.p329z.p331b.C9075b;
import p323h.p324a.p329z.p332c.InterfaceC9076a;
import p323h.p324a.p329z.p334e.p335a.C9087c;
import p323h.p324a.p329z.p334e.p339e.C9118a;
import p323h.p324a.p329z.p334e.p339e.C9119b;
import p323h.p324a.p329z.p334e.p339e.C9120c;
import p323h.p324a.p329z.p334e.p339e.C9121d;
import p323h.p324a.p329z.p334e.p339e.C9122e;
import p323h.p324a.p329z.p334e.p339e.C9123f;

/* compiled from: Single.java */
/* renamed from: h.a.s */
/* loaded from: classes2.dex */
public abstract class AbstractC9049s<T> implements InterfaceC9053w<T> {
    /* renamed from: c */
    public static <T> AbstractC9049s<T> m29226c(InterfaceC9052v<T> interfaceC9052v) {
        C9075b.m29271c(interfaceC9052v, "source is null");
        return C9030a.m29146n(new C9118a(interfaceC9052v));
    }

    /* renamed from: f */
    public static <T> AbstractC9049s<T> m29227f(T t) {
        C9075b.m29271c(t, "item is null");
        return C9030a.m29146n(new C9120c(t));
    }

    @Override // p323h.p324a.InterfaceC9053w
    /* renamed from: b */
    public final void mo29228b(InterfaceC9051u<? super T> interfaceC9051u) {
        C9075b.m29271c(interfaceC9051u, "observer is null");
        InterfaceC9051u<? super T> m29154v = C9030a.m29154v(this, interfaceC9051u);
        C9075b.m29271c(m29154v, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            mo29129h(m29154v);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            C9207a.m30000a(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: d */
    public final <R> AbstractC9049s<R> m29229d(InterfaceC9065f<? super T, ? extends InterfaceC9053w<? extends R>> interfaceC9065f) {
        C9075b.m29271c(interfaceC9065f, "mapper is null");
        return C9030a.m29146n(new C9119b(this, interfaceC9065f));
    }

    /* renamed from: e */
    public final AbstractC9031b m29230e() {
        return C9030a.m29142j(new C9087c(this));
    }

    /* renamed from: g */
    public final <R> AbstractC9049s<R> m29231g(InterfaceC9065f<? super T, ? extends R> interfaceC9065f) {
        C9075b.m29271c(interfaceC9065f, "mapper is null");
        return C9030a.m29146n(new C9121d(this, interfaceC9065f));
    }

    /* renamed from: h */
    protected abstract void mo29129h(InterfaceC9051u<? super T> interfaceC9051u);

    /* renamed from: i */
    public final AbstractC9049s<T> m29232i(AbstractC9048r abstractC9048r) {
        C9075b.m29271c(abstractC9048r, "scheduler is null");
        return C9030a.m29146n(new C9122e(this, abstractC9048r));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public final AbstractC9043m<T> m29233j() {
        return this instanceof InterfaceC9076a ? ((InterfaceC9076a) this).mo29273a() : C9030a.m29145m(new C9123f(this));
    }
}
