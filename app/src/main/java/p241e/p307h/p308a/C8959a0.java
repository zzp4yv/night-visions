package p241e.p307h.p308a;

import com.liulishuo.filedownloader.message.C8661b;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import java.util.List;
import p241e.p307h.p308a.InterfaceC8958a;
import p241e.p307h.p308a.p315k0.C9001d;

/* compiled from: MessageSnapshotGate.java */
/* renamed from: e.h.a.a0 */
/* loaded from: classes2.dex */
public class C8959a0 implements C8661b.b {
    /* renamed from: a */
    private boolean m28658a(List<InterfaceC8958a.b> list, MessageSnapshot messageSnapshot) {
        boolean mo28705i;
        if (list.size() > 1 && messageSnapshot.mo27519k() == -3) {
            for (InterfaceC8958a.b bVar : list) {
                synchronized (bVar.mo28643I()) {
                    if (bVar.mo28652y().mo28710n(messageSnapshot)) {
                        C9001d.m28962a(this, "updateMoreLikelyCompleted", new Object[0]);
                        return true;
                    }
                }
            }
        }
        for (InterfaceC8958a.b bVar2 : list) {
            synchronized (bVar2.mo28643I()) {
                if (bVar2.mo28652y().mo28711p(messageSnapshot)) {
                    C9001d.m28962a(this, "updateKeepFlow", new Object[0]);
                    return true;
                }
            }
        }
        if (-4 == messageSnapshot.mo27519k()) {
            for (InterfaceC8958a.b bVar3 : list) {
                synchronized (bVar3.mo28643I()) {
                    if (bVar3.mo28652y().mo28699a(messageSnapshot)) {
                        C9001d.m28962a(this, "updateSampleFilePathTaskRunning", new Object[0]);
                        return true;
                    }
                }
            }
        }
        if (list.size() != 1) {
            return false;
        }
        InterfaceC8958a.b bVar4 = list.get(0);
        synchronized (bVar4.mo28643I()) {
            C9001d.m28962a(this, "updateKeepAhead", new Object[0]);
            mo28705i = bVar4.mo28652y().mo28705i(messageSnapshot);
        }
        return mo28705i;
    }

    @Override // com.liulishuo.filedownloader.message.C8661b.b
    /* renamed from: H */
    public void mo27539H(MessageSnapshot messageSnapshot) {
        synchronized (Integer.toString(messageSnapshot.m27531e()).intern()) {
            List<InterfaceC8958a.b> m28899j = C8986h.m28890i().m28899j(messageSnapshot.m27531e());
            if (m28899j.size() > 0) {
                InterfaceC8958a mo28649v = m28899j.get(0).mo28649v();
                if (C9001d.f34819a) {
                    C9001d.m28962a(this, "~~~callback %s old[%s] new[%s] %d", Integer.valueOf(messageSnapshot.m27531e()), Byte.valueOf(mo28649v.getStatus()), Byte.valueOf(messageSnapshot.mo27519k()), Integer.valueOf(m28899j.size()));
                }
                if (!m28658a(m28899j, messageSnapshot)) {
                    StringBuilder sb = new StringBuilder("The event isn't consumed, id:" + messageSnapshot.m27531e() + " status:" + ((int) messageSnapshot.mo27519k()) + " task-count:" + m28899j.size());
                    for (InterfaceC8958a.b bVar : m28899j) {
                        sb.append(" | ");
                        sb.append((int) bVar.mo28649v().getStatus());
                    }
                    C9001d.m28966e(this, sb.toString(), new Object[0]);
                }
            } else {
                C9001d.m28966e(this, "Receive the event %d, but there isn't any running task in the upper layer", Byte.valueOf(messageSnapshot.mo27519k()));
            }
        }
    }
}
