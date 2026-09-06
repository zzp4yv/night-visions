package p241e.p307h.p308a;

import com.liulishuo.filedownloader.message.C8662c;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p241e.p307h.p308a.InterfaceC8958a;
import p241e.p307h.p308a.p315k0.C9001d;

/* compiled from: FileDownloadList.java */
/* renamed from: e.h.a.h */
/* loaded from: classes2.dex */
public class C8986h {

    /* renamed from: a */
    private final ArrayList<InterfaceC8958a.b> f34782a;

    /* compiled from: FileDownloadList.java */
    /* renamed from: e.h.a.h$b */
    private static final class b {

        /* renamed from: a */
        private static final C8986h f34783a = new C8986h();
    }

    /* renamed from: i */
    public static C8986h m28890i() {
        return b.f34783a;
    }

    /* renamed from: a */
    void m28891a(InterfaceC8958a.b bVar) {
        if (!bVar.mo28649v().mo28633p()) {
            bVar.mo28641F();
        }
        if (bVar.mo28652y().mo28703f().mo28941i()) {
            m28892b(bVar);
        }
    }

    /* renamed from: b */
    void m28892b(InterfaceC8958a.b bVar) {
        if (bVar.mo28642H()) {
            return;
        }
        synchronized (this.f34782a) {
            if (this.f34782a.contains(bVar)) {
                C9001d.m28970i(this, "already has %s", bVar);
            } else {
                bVar.mo28647T();
                this.f34782a.add(bVar);
                if (C9001d.f34819a) {
                    C9001d.m28969h(this, "add list in all %s %d %d", bVar, Byte.valueOf(bVar.mo28649v().getStatus()), Integer.valueOf(this.f34782a.size()));
                }
            }
        }
    }

    /* renamed from: c */
    List<InterfaceC8958a.b> m28893c(int i2, AbstractC8991i abstractC8991i) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f34782a) {
            Iterator<InterfaceC8958a.b> it = this.f34782a.iterator();
            while (it.hasNext()) {
                InterfaceC8958a.b next = it.next();
                if (next.mo28649v().mo28610G() == abstractC8991i && !next.mo28649v().mo28633p()) {
                    next.mo28640C(i2);
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    List<InterfaceC8958a.b> m28894d(AbstractC8991i abstractC8991i) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f34782a) {
            Iterator<InterfaceC8958a.b> it = this.f34782a.iterator();
            while (it.hasNext()) {
                InterfaceC8958a.b next = it.next();
                if (next.mo28653z(abstractC8991i)) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    int m28895e(int i2) {
        int i3;
        synchronized (this.f34782a) {
            Iterator<InterfaceC8958a.b> it = this.f34782a.iterator();
            i3 = 0;
            while (it.hasNext()) {
                if (it.next().mo28639A(i2)) {
                    i3++;
                }
            }
        }
        return i3;
    }

    /* renamed from: f */
    void m28896f(List<InterfaceC8958a.b> list) {
        synchronized (this.f34782a) {
            Iterator<InterfaceC8958a.b> it = this.f34782a.iterator();
            while (it.hasNext()) {
                InterfaceC8958a.b next = it.next();
                if (!list.contains(next)) {
                    list.add(next);
                }
            }
            this.f34782a.clear();
        }
    }

    /* renamed from: g */
    public InterfaceC8958a.b m28897g(int i2) {
        synchronized (this.f34782a) {
            Iterator<InterfaceC8958a.b> it = this.f34782a.iterator();
            while (it.hasNext()) {
                InterfaceC8958a.b next = it.next();
                if (next.mo28639A(i2)) {
                    return next;
                }
            }
            return null;
        }
    }

    /* renamed from: h */
    List<InterfaceC8958a.b> m28898h(int i2) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f34782a) {
            Iterator<InterfaceC8958a.b> it = this.f34782a.iterator();
            while (it.hasNext()) {
                InterfaceC8958a.b next = it.next();
                if (next.mo28639A(i2) && !next.mo28645P()) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    List<InterfaceC8958a.b> m28899j(int i2) {
        byte status;
        ArrayList arrayList = new ArrayList();
        synchronized (this.f34782a) {
            Iterator<InterfaceC8958a.b> it = this.f34782a.iterator();
            while (it.hasNext()) {
                InterfaceC8958a.b next = it.next();
                if (next.mo28639A(i2) && !next.mo28645P() && (status = next.mo28649v().getStatus()) != 0 && status != 10) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    boolean m28900k(InterfaceC8958a.b bVar) {
        return this.f34782a.isEmpty() || !this.f34782a.contains(bVar);
    }

    /* renamed from: l */
    public boolean m28901l(InterfaceC8958a.b bVar, MessageSnapshot messageSnapshot) {
        boolean remove;
        byte mo27519k = messageSnapshot.mo27519k();
        synchronized (this.f34782a) {
            remove = this.f34782a.remove(bVar);
            if (remove && this.f34782a.size() == 0 && C9005m.m29029b().mo27611v0()) {
                C9009q.m29052e().m29065n(true);
            }
        }
        if (C9001d.f34819a && this.f34782a.size() == 0) {
            C9001d.m28969h(this, "remove %s left %d %d", bVar, Byte.valueOf(mo27519k), Integer.valueOf(this.f34782a.size()));
        }
        if (remove) {
            InterfaceC9012t mo28703f = bVar.mo28652y().mo28703f();
            if (mo27519k == -4) {
                mo28703f.mo28939g(messageSnapshot);
            } else if (mo27519k == -3) {
                mo28703f.mo28943k(C8662c.m27545f(messageSnapshot));
            } else if (mo27519k == -2) {
                mo28703f.mo28935c(messageSnapshot);
            } else if (mo27519k == -1) {
                mo28703f.mo28936d(messageSnapshot);
            }
        } else {
            C9001d.m28963b(this, "remove error, not exist: %s %d", bVar, Byte.valueOf(mo27519k));
        }
        return remove;
    }

    /* renamed from: m */
    int m28902m() {
        return this.f34782a.size();
    }

    private C8986h() {
        this.f34782a = new ArrayList<>();
    }
}
