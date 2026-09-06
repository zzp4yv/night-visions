package p241e.p307h.p308a;

import p241e.p307h.p308a.p312h0.AbstractC8989c;
import p241e.p307h.p308a.p312h0.AbstractC8990d;
import p241e.p307h.p308a.p312h0.C8988b;

/* compiled from: FileDownloadConnectListener.java */
/* renamed from: e.h.a.e */
/* loaded from: classes2.dex */
public abstract class AbstractC8966e extends AbstractC8990d {

    /* renamed from: a */
    private C8988b.a f34636a;

    @Override // p241e.p307h.p308a.p312h0.AbstractC8990d
    /* renamed from: d */
    public boolean mo28713d(AbstractC8989c abstractC8989c) {
        if (!(abstractC8989c instanceof C8988b)) {
            return false;
        }
        C8988b.a m28908b = ((C8988b) abstractC8989c).m28908b();
        this.f34636a = m28908b;
        if (m28908b == C8988b.a.connected) {
            mo28714e();
            return false;
        }
        mo28715f();
        return false;
    }

    /* renamed from: e */
    public abstract void mo28714e();

    /* renamed from: f */
    public abstract void mo28715f();

    /* renamed from: g */
    public C8988b.a m28716g() {
        return this.f34636a;
    }
}
