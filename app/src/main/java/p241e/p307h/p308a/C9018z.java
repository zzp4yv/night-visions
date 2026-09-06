package p241e.p307h.p308a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p241e.p307h.p308a.InterfaceC8958a;
import p241e.p307h.p308a.p312h0.C8988b;
import p241e.p307h.p308a.p315k0.C9000c;
import p241e.p307h.p308a.p315k0.C9001d;

/* compiled from: LostServiceConnectedHandler.java */
/* renamed from: e.h.a.z */
/* loaded from: classes2.dex */
public class C9018z extends AbstractC8966e implements InterfaceC9014v {

    /* renamed from: b */
    private final ArrayList<InterfaceC8958a.b> f34853b = new ArrayList<>();

    @Override // p241e.p307h.p308a.InterfaceC9014v
    /* renamed from: a */
    public boolean mo29067a(InterfaceC8958a.b bVar) {
        return !this.f34853b.isEmpty() && this.f34853b.contains(bVar);
    }

    @Override // p241e.p307h.p308a.InterfaceC9014v
    /* renamed from: b */
    public boolean mo29068b(InterfaceC8958a.b bVar) {
        if (!C9009q.m29052e().m29060i()) {
            synchronized (this.f34853b) {
                if (!C9009q.m29052e().m29060i()) {
                    if (C9001d.f34819a) {
                        C9001d.m28962a(this, "Waiting for connecting with the downloader service... %d", Integer.valueOf(bVar.mo28649v().getId()));
                    }
                    C9005m.m29029b().mo27610u0(C9000c.m28956a());
                    if (!this.f34853b.contains(bVar)) {
                        bVar.mo28648b();
                        this.f34853b.add(bVar);
                    }
                    return true;
                }
            }
        }
        mo29069c(bVar);
        return false;
    }

    @Override // p241e.p307h.p308a.InterfaceC9014v
    /* renamed from: c */
    public void mo29069c(InterfaceC8958a.b bVar) {
        if (this.f34853b.isEmpty()) {
            return;
        }
        synchronized (this.f34853b) {
            this.f34853b.remove(bVar);
        }
    }

    @Override // p241e.p307h.p308a.AbstractC8966e
    /* renamed from: e */
    public void mo28714e() {
        InterfaceC9015w m29059g = C9009q.m29052e().m29059g();
        if (C9001d.f34819a) {
            C9001d.m28962a(this, "The downloader service is connected.", new Object[0]);
        }
        synchronized (this.f34853b) {
            List<InterfaceC8958a.b> list = (List) this.f34853b.clone();
            this.f34853b.clear();
            ArrayList arrayList = new ArrayList(m29059g.mo28683a());
            for (InterfaceC8958a.b bVar : list) {
                int mo28651x = bVar.mo28651x();
                if (m29059g.mo28688f(mo28651x)) {
                    bVar.mo28649v().mo28630m().mo28654a();
                    if (!arrayList.contains(Integer.valueOf(mo28651x))) {
                        arrayList.add(Integer.valueOf(mo28651x));
                    }
                } else {
                    bVar.mo28650w();
                }
            }
            m29059g.mo28686d(arrayList);
        }
    }

    @Override // p241e.p307h.p308a.AbstractC8966e
    /* renamed from: f */
    public void mo28715f() {
        if (m28716g() != C8988b.a.lost) {
            if (C8986h.m28890i().m28902m() > 0) {
                C9001d.m28970i(this, "file download service has be unbound but the size of active tasks are not empty %d ", Integer.valueOf(C8986h.m28890i().m28902m()));
                return;
            }
            return;
        }
        InterfaceC9015w m29059g = C9009q.m29052e().m29059g();
        if (C9001d.f34819a) {
            C9001d.m28962a(this, "lost the connection to the file download service, and current active task size is %d", Integer.valueOf(C8986h.m28890i().m28902m()));
        }
        if (C8986h.m28890i().m28902m() > 0) {
            synchronized (this.f34853b) {
                C8986h.m28890i().m28896f(this.f34853b);
                Iterator<InterfaceC8958a.b> it = this.f34853b.iterator();
                while (it.hasNext()) {
                    it.next().mo28648b();
                }
                m29059g.mo28684b();
            }
            try {
                C9009q.m29052e().m29055b();
            } catch (IllegalStateException unused) {
                C9001d.m28970i(this, "restart service failed, you may need to restart downloading manually when the app comes back to foreground", new Object[0]);
            }
        }
    }
}
