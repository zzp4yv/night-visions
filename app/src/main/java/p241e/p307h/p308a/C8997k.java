package p241e.p307h.p308a;

import com.liulishuo.filedownloader.message.BlockCompleteMessage;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import com.liulishuo.filedownloader.model.C8667b;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import p241e.p307h.p308a.InterfaceC8958a;
import p241e.p307h.p308a.InterfaceC9016x;
import p241e.p307h.p308a.p315k0.C9001d;
import p241e.p307h.p308a.p315k0.C9003f;

/* compiled from: FileDownloadMessenger.java */
/* renamed from: e.h.a.k */
/* loaded from: classes2.dex */
class C8997k implements InterfaceC9012t {

    /* renamed from: a */
    private InterfaceC8958a.b f34810a;

    /* renamed from: b */
    private InterfaceC8958a.d f34811b;

    /* renamed from: c */
    private Queue<MessageSnapshot> f34812c;

    /* renamed from: d */
    private boolean f34813d = false;

    C8997k(InterfaceC8958a.b bVar, InterfaceC8958a.d dVar) {
        m28930n(bVar, dVar);
    }

    /* renamed from: n */
    private void m28930n(InterfaceC8958a.b bVar, InterfaceC8958a.d dVar) {
        this.f34810a = bVar;
        this.f34811b = dVar;
        this.f34812c = new LinkedBlockingQueue();
    }

    /* renamed from: o */
    private void m28931o(int i2) {
        if (C8667b.m27601e(i2)) {
            if (!this.f34812c.isEmpty()) {
                MessageSnapshot peek = this.f34812c.peek();
                C9001d.m28970i(this, "the messenger[%s](with id[%d]) has already accomplished all his job, but there still are some messages in parcel queue[%d] queue-top-status[%d]", this, Integer.valueOf(peek.m27531e()), Integer.valueOf(this.f34812c.size()), Byte.valueOf(peek.mo27519k()));
            }
            this.f34810a = null;
        }
    }

    /* renamed from: q */
    private void m28932q(MessageSnapshot messageSnapshot) {
        InterfaceC8958a.b bVar = this.f34810a;
        if (bVar == null) {
            if (C9001d.f34819a) {
                C9001d.m28962a(this, "occur this case, it would be the host task of this messenger has been over(paused/warn/completed/error) on the other thread before receiving the snapshot(id[%d], status[%d])", Integer.valueOf(messageSnapshot.m27531e()), Byte.valueOf(messageSnapshot.mo27519k()));
            }
        } else {
            if (!this.f34813d && bVar.mo28649v().mo28610G() != null) {
                this.f34812c.offer(messageSnapshot);
                C8994j.m28916d().m28921i(this);
                return;
            }
            if ((C9004l.m29022b() || this.f34810a.mo28646S()) && messageSnapshot.mo27519k() == 4) {
                this.f34811b.mo28655g();
            }
            m28931o(messageSnapshot.mo27519k());
        }
    }

    @Override // p241e.p307h.p308a.InterfaceC9012t
    /* renamed from: a */
    public boolean mo28933a() {
        return this.f34810a.mo28649v().mo28617U();
    }

    @Override // p241e.p307h.p308a.InterfaceC9012t
    /* renamed from: b */
    public void mo28934b(MessageSnapshot messageSnapshot) {
        if (C9001d.f34819a) {
            C9001d.m28962a(this, "notify pending %s", this.f34810a);
        }
        this.f34811b.mo28656o();
        m28932q(messageSnapshot);
    }

    @Override // p241e.p307h.p308a.InterfaceC9012t
    /* renamed from: c */
    public void mo28935c(MessageSnapshot messageSnapshot) {
        if (C9001d.f34819a) {
            C9001d.m28962a(this, "notify paused %s", this.f34810a);
        }
        this.f34811b.mo28655g();
        m28932q(messageSnapshot);
    }

    @Override // p241e.p307h.p308a.InterfaceC9012t
    /* renamed from: d */
    public void mo28936d(MessageSnapshot messageSnapshot) {
        if (C9001d.f34819a) {
            InterfaceC8958a.b bVar = this.f34810a;
            C9001d.m28962a(this, "notify error %s %s", bVar, bVar.mo28649v().mo28622e());
        }
        this.f34811b.mo28655g();
        m28932q(messageSnapshot);
    }

    @Override // p241e.p307h.p308a.InterfaceC9012t
    /* renamed from: e */
    public void mo28937e(MessageSnapshot messageSnapshot) {
        if (C9001d.f34819a) {
            InterfaceC8958a mo28649v = this.f34810a.mo28649v();
            C9001d.m28962a(this, "notify retry %s %d %d %s", this.f34810a, Integer.valueOf(mo28649v.mo28636t()), Integer.valueOf(mo28649v.mo28621d()), mo28649v.mo28622e());
        }
        this.f34811b.mo28656o();
        m28932q(messageSnapshot);
    }

    @Override // p241e.p307h.p308a.InterfaceC9012t
    /* renamed from: f */
    public void mo28938f(MessageSnapshot messageSnapshot) {
        InterfaceC8958a mo28649v = this.f34810a.mo28649v();
        if (C9001d.f34819a) {
            C9001d.m28962a(this, "notify progress %s %d %d", mo28649v, Long.valueOf(mo28649v.mo28632o()), Long.valueOf(mo28649v.mo28609E()));
        }
        if (mo28649v.mo28612K() > 0) {
            this.f34811b.mo28656o();
            m28932q(messageSnapshot);
        } else if (C9001d.f34819a) {
            C9001d.m28962a(this, "notify progress but client not request notify %s", this.f34810a);
        }
    }

    @Override // p241e.p307h.p308a.InterfaceC9012t
    /* renamed from: g */
    public void mo28939g(MessageSnapshot messageSnapshot) {
        if (C9001d.f34819a) {
            C9001d.m28962a(this, "notify warn %s", this.f34810a);
        }
        this.f34811b.mo28655g();
        m28932q(messageSnapshot);
    }

    @Override // p241e.p307h.p308a.InterfaceC9012t
    /* renamed from: h */
    public void mo28940h(MessageSnapshot messageSnapshot) {
        if (C9001d.f34819a) {
            C9001d.m28962a(this, "notify connected %s", this.f34810a);
        }
        this.f34811b.mo28656o();
        m28932q(messageSnapshot);
    }

    @Override // p241e.p307h.p308a.InterfaceC9012t
    /* renamed from: i */
    public boolean mo28941i() {
        if (C9001d.f34819a) {
            C9001d.m28962a(this, "notify begin %s", this.f34810a);
        }
        if (this.f34810a == null) {
            C9001d.m28970i(this, "can't begin the task, the holder fo the messenger is nil, %d", Integer.valueOf(this.f34812c.size()));
            return false;
        }
        this.f34811b.mo28657q();
        return true;
    }

    @Override // p241e.p307h.p308a.InterfaceC9012t
    /* renamed from: j */
    public boolean mo28942j() {
        return this.f34812c.peek().mo27519k() == 4;
    }

    @Override // p241e.p307h.p308a.InterfaceC9012t
    /* renamed from: k */
    public void mo28943k(MessageSnapshot messageSnapshot) {
        if (C9001d.f34819a) {
            C9001d.m28962a(this, "notify block completed %s %s", this.f34810a, Thread.currentThread().getName());
        }
        this.f34811b.mo28656o();
        m28932q(messageSnapshot);
    }

    @Override // p241e.p307h.p308a.InterfaceC9012t
    /* renamed from: l */
    public void mo28944l(MessageSnapshot messageSnapshot) {
        if (C9001d.f34819a) {
            C9001d.m28962a(this, "notify started %s", this.f34810a);
        }
        this.f34811b.mo28656o();
        m28932q(messageSnapshot);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p241e.p307h.p308a.InterfaceC9012t
    /* renamed from: m */
    public void mo28945m() {
        if (this.f34813d) {
            return;
        }
        MessageSnapshot poll = this.f34812c.poll();
        byte mo27519k = poll.mo27519k();
        InterfaceC8958a.b bVar = this.f34810a;
        if (bVar == null) {
            throw new IllegalArgumentException(C9003f.m29009o("can't handover the message, no master to receive this message(status[%d]) size[%d]", Integer.valueOf(mo27519k), Integer.valueOf(this.f34812c.size())));
        }
        InterfaceC8958a mo28649v = bVar.mo28649v();
        AbstractC8991i mo28610G = mo28649v.mo28610G();
        InterfaceC9016x.a mo28652y = bVar.mo28652y();
        m28931o(mo27519k);
        if (mo28610G == null || mo28610G.isInvalid()) {
            return;
        }
        if (mo27519k == 4) {
            try {
                mo28610G.blockComplete(mo28649v);
                m28946p(((BlockCompleteMessage) poll).mo27518b());
                return;
            } catch (Throwable th) {
                mo28936d(mo28652y.mo28708l(th));
                return;
            }
        }
        AbstractC8977g abstractC8977g = mo28610G instanceof AbstractC8977g ? (AbstractC8977g) mo28610G : null;
        if (mo27519k == -4) {
            mo28610G.warn(mo28649v);
            return;
        }
        if (mo27519k == -3) {
            mo28610G.completed(mo28649v);
            return;
        }
        if (mo27519k == -2) {
            if (abstractC8977g != null) {
                abstractC8977g.paused(mo28649v, poll.mo27527f(), poll.mo27522g());
                return;
            } else {
                mo28610G.paused(mo28649v, poll.mo27520i(), poll.mo27521j());
                return;
            }
        }
        if (mo27519k == -1) {
            mo28610G.error(mo28649v, poll.mo27528l());
            return;
        }
        if (mo27519k == 1) {
            if (abstractC8977g != null) {
                abstractC8977g.pending(mo28649v, poll.mo27527f(), poll.mo27522g());
                return;
            } else {
                mo28610G.pending(mo28649v, poll.mo27520i(), poll.mo27521j());
                return;
            }
        }
        if (mo27519k == 2) {
            if (abstractC8977g != null) {
                abstractC8977g.connected(mo28649v, poll.mo27524c(), poll.mo27526n(), mo28649v.mo28632o(), poll.mo27522g());
                return;
            } else {
                mo28610G.connected(mo28649v, poll.mo27524c(), poll.mo27526n(), mo28649v.mo28608B(), poll.mo27521j());
                return;
            }
        }
        if (mo27519k == 3) {
            if (abstractC8977g != null) {
                abstractC8977g.progress(mo28649v, poll.mo27527f(), mo28649v.mo28609E());
                return;
            } else {
                mo28610G.progress(mo28649v, poll.mo27520i(), mo28649v.mo28626i());
                return;
            }
        }
        if (mo27519k != 5) {
            if (mo27519k != 6) {
                return;
            }
            mo28610G.started(mo28649v);
        } else if (abstractC8977g != null) {
            abstractC8977g.retry(mo28649v, poll.mo27528l(), poll.mo27529h(), poll.mo27527f());
        } else {
            mo28610G.retry(mo28649v, poll.mo27528l(), poll.mo27529h(), poll.mo27520i());
        }
    }

    /* renamed from: p */
    public void m28946p(MessageSnapshot messageSnapshot) {
        if (C9001d.f34819a) {
            C9001d.m28962a(this, "notify completed %s", this.f34810a);
        }
        this.f34811b.mo28655g();
        m28932q(messageSnapshot);
    }

    public String toString() {
        Object[] objArr = new Object[2];
        InterfaceC8958a.b bVar = this.f34810a;
        objArr[0] = Integer.valueOf(bVar == null ? -1 : bVar.mo28649v().getId());
        objArr[1] = super.toString();
        return C9003f.m29009o("%d:%s", objArr);
    }
}
