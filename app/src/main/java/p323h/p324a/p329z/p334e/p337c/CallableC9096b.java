package p323h.p324a.p329z.p334e.p337c;

import io.reactivex.exceptions.C9207a;
import java.util.concurrent.Callable;
import p323h.p324a.AbstractC9040j;
import p323h.p324a.InterfaceC9041k;
import p323h.p324a.p325a0.C9030a;
import p323h.p324a.p327x.C9057d;
import p323h.p324a.p327x.InterfaceC9056c;

/* compiled from: MaybeFromCallable.java */
/* renamed from: h.a.z.e.c.b */
/* loaded from: classes2.dex */
public final class CallableC9096b<T> extends AbstractC9040j<T> implements Callable<T> {

    /* renamed from: f */
    final Callable<? extends T> f35007f;

    public CallableC9096b(Callable<? extends T> callable) {
        this.f35007f = callable;
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        return this.f35007f.call();
    }

    @Override // p323h.p324a.AbstractC9040j
    /* renamed from: e */
    protected void mo29184e(InterfaceC9041k<? super T> interfaceC9041k) {
        InterfaceC9056c m29243b = C9057d.m29243b();
        interfaceC9041k.mo29186b(m29243b);
        if (m29243b.mo29116q()) {
            return;
        }
        try {
            T call = this.f35007f.call();
            if (m29243b.mo29116q()) {
                return;
            }
            if (call == null) {
                interfaceC9041k.mo29185a();
            } else {
                interfaceC9041k.onSuccess(call);
            }
        } catch (Throwable th) {
            C9207a.m30000a(th);
            if (m29243b.mo29116q()) {
                C9030a.m29147o(th);
            } else {
                interfaceC9041k.onError(th);
            }
        }
    }
}
