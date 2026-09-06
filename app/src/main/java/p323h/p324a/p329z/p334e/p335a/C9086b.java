package p323h.p324a.p329z.p334e.p335a;

import io.reactivex.exceptions.C9207a;
import java.util.concurrent.Callable;
import p323h.p324a.AbstractC9031b;
import p323h.p324a.InterfaceC9034d;
import p323h.p324a.p325a0.C9030a;
import p323h.p324a.p327x.C9057d;
import p323h.p324a.p327x.InterfaceC9056c;

/* compiled from: CompletableFromCallable.java */
/* renamed from: h.a.z.e.a.b */
/* loaded from: classes2.dex */
public final class C9086b extends AbstractC9031b {

    /* renamed from: a */
    final Callable<?> f34965a;

    public C9086b(Callable<?> callable) {
        this.f34965a = callable;
    }

    @Override // p323h.p324a.AbstractC9031b
    /* renamed from: e */
    protected void mo29113e(InterfaceC9034d interfaceC9034d) {
        InterfaceC9056c m29243b = C9057d.m29243b();
        interfaceC9034d.mo29119b(m29243b);
        try {
            this.f34965a.call();
            if (m29243b.mo29116q()) {
                return;
            }
            interfaceC9034d.mo29118a();
        } catch (Throwable th) {
            C9207a.m30000a(th);
            if (m29243b.mo29116q()) {
                C9030a.m29147o(th);
            } else {
                interfaceC9034d.onError(th);
            }
        }
    }
}
