package p323h.p324a.p329z.p330a;

import io.reactivex.exceptions.C9207a;
import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.p325a0.C9030a;
import p323h.p324a.p327x.InterfaceC9056c;
import p323h.p324a.p328y.InterfaceC9063d;

/* compiled from: CancellableDisposable.java */
/* renamed from: h.a.z.a.a */
/* loaded from: classes2.dex */
public final class C9068a extends AtomicReference<InterfaceC9063d> implements InterfaceC9056c {
    public C9068a(InterfaceC9063d interfaceC9063d) {
        super(interfaceC9063d);
    }

    @Override // p323h.p324a.p327x.InterfaceC9056c
    /* renamed from: k */
    public void mo29115k() {
        InterfaceC9063d andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        try {
            andSet.cancel();
        } catch (Exception e2) {
            C9207a.m30000a(e2);
            C9030a.m29147o(e2);
        }
    }

    @Override // p323h.p324a.p327x.InterfaceC9056c
    /* renamed from: q */
    public boolean mo29116q() {
        return get() == null;
    }
}
