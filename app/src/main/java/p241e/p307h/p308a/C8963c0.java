package p241e.p307h.p308a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import p241e.p307h.p308a.InterfaceC8958a;
import p241e.p307h.p308a.p315k0.C9001d;
import p241e.p307h.p308a.p315k0.C9003f;

/* compiled from: QueuesHandler.java */
/* renamed from: e.h.a.c0 */
/* loaded from: classes2.dex */
class C8963c0 implements InterfaceC9015w {

    /* renamed from: a */
    private final SparseArray<Handler> f34612a = new SparseArray<>();

    /* compiled from: QueuesHandler.java */
    /* renamed from: e.h.a.c0$b */
    private static class b implements InterfaceC8958a.a {

        /* renamed from: a */
        private final WeakReference<c> f34613a;

        /* renamed from: b */
        private int f34614b;

        @Override // p241e.p307h.p308a.InterfaceC8958a.a
        /* renamed from: a */
        public void mo28638a(InterfaceC8958a interfaceC8958a) {
            WeakReference<c> weakReference = this.f34613a;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f34613a.get().m28691c(this.f34614b);
        }

        /* renamed from: b */
        public InterfaceC8958a.a m28689b(int i2) {
            this.f34614b = i2;
            return this;
        }

        private b(WeakReference<c> weakReference) {
            this.f34613a = weakReference;
        }
    }

    /* compiled from: QueuesHandler.java */
    /* renamed from: e.h.a.c0$c */
    private class c implements Handler.Callback {

        /* renamed from: f */
        private Handler f34615f;

        /* renamed from: g */
        private List<InterfaceC8958a.b> f34616g;

        /* renamed from: h */
        private int f34617h = 0;

        /* renamed from: i */
        private b f34618i = new b(new WeakReference(this));

        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public void m28691c(int i2) {
            Handler handler = this.f34615f;
            if (handler == null || this.f34616g == null) {
                C9001d.m28970i(this, "need go next %d, but params is not ready %s %s", Integer.valueOf(i2), this.f34615f, this.f34616g);
                return;
            }
            Message obtainMessage = handler.obtainMessage();
            obtainMessage.what = 1;
            obtainMessage.arg1 = i2;
            if (C9001d.f34819a) {
                Object[] objArr = new Object[2];
                List<InterfaceC8958a.b> list = this.f34616g;
                AbstractC8991i abstractC8991i = null;
                if (list != null && list.get(0) != null) {
                    abstractC8991i = this.f34616g.get(0).mo28649v().mo28610G();
                }
                objArr[0] = abstractC8991i;
                objArr[1] = Integer.valueOf(obtainMessage.arg1);
                C9001d.m28962a(c.class, "start next %s %s", objArr);
            }
            this.f34615f.sendMessage(obtainMessage);
        }

        /* renamed from: b */
        public void m28692b() {
            this.f34616g.get(this.f34617h).mo28649v().mo28611J(this.f34618i);
            this.f34615f.removeCallbacksAndMessages(null);
        }

        /* renamed from: d */
        public void m28693d(Handler handler) {
            this.f34615f = handler;
        }

        /* renamed from: e */
        public void m28694e(List<InterfaceC8958a.b> list) {
            this.f34616g = list;
        }

        /* renamed from: f */
        public void m28695f() {
            m28691c(this.f34617h);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                if (message.arg1 < this.f34616g.size()) {
                    int i3 = message.arg1;
                    this.f34617h = i3;
                    InterfaceC8958a.b bVar = this.f34616g.get(i3);
                    synchronized (bVar.mo28643I()) {
                        if (bVar.mo28649v().getStatus() == 0 && !C8986h.m28890i().m28900k(bVar)) {
                            bVar.mo28649v().mo28637u(this.f34618i.m28689b(this.f34617h + 1));
                            bVar.mo28644L();
                        }
                        if (C9001d.f34819a) {
                            C9001d.m28962a(c.class, "direct go next by not contains %s %d", bVar, Integer.valueOf(message.arg1));
                        }
                        m28691c(message.arg1 + 1);
                        return true;
                    }
                }
                synchronized (C8963c0.this.f34612a) {
                    C8963c0.this.f34612a.remove(this.f34616g.get(0).mo28651x());
                }
                Handler handler = this.f34615f;
                AbstractC8991i abstractC8991i = null;
                if (handler != null && handler.getLooper() != null) {
                    this.f34615f.getLooper().quit();
                    this.f34615f = null;
                    this.f34616g = null;
                    this.f34618i = null;
                }
                if (C9001d.f34819a) {
                    Object[] objArr = new Object[2];
                    List<InterfaceC8958a.b> list = this.f34616g;
                    if (list != null && list.get(0) != null) {
                        abstractC8991i = this.f34616g.get(0).mo28649v().mo28610G();
                    }
                    objArr[0] = abstractC8991i;
                    objArr[1] = Integer.valueOf(message.arg1);
                    C9001d.m28962a(c.class, "final serial %s %d", objArr);
                }
                return true;
            }
            if (i2 == 2) {
                m28692b();
            } else if (i2 == 3) {
                m28695f();
            }
            return true;
        }
    }

    C8963c0() {
    }

    /* renamed from: h */
    private void m28680h(Handler handler) {
        handler.sendEmptyMessage(2);
    }

    /* renamed from: i */
    private boolean m28681i(int i2, List<InterfaceC8958a.b> list, AbstractC8991i abstractC8991i, boolean z) {
        if (C9004l.m29022b()) {
            C9004l.m29021a().m29023a(list.size(), true, abstractC8991i);
        }
        if (C9001d.f34819a) {
            C9001d.m28969h(C9009q.class, "start list attachKey[%d] size[%d] listener[%s] isSerial[%B]", Integer.valueOf(i2), Integer.valueOf(list.size()), abstractC8991i, Boolean.valueOf(z));
        }
        if (list != null && !list.isEmpty()) {
            return false;
        }
        C9001d.m28970i(C9009q.class, "Tasks with the listener can't start, because can't find any task with the provided listener, maybe tasks instance has been started in the past, so they are all are inUsing, if in this case, you can use [BaseDownloadTask#reuse] to reuse theme first then start again: [%s, %B]", abstractC8991i, Boolean.valueOf(z));
        return true;
    }

    /* renamed from: j */
    private void m28682j(Handler handler) {
        handler.sendEmptyMessage(3);
    }

    @Override // p241e.p307h.p308a.InterfaceC9015w
    /* renamed from: a */
    public int mo28683a() {
        return this.f34612a.size();
    }

    @Override // p241e.p307h.p308a.InterfaceC9015w
    /* renamed from: b */
    public void mo28684b() {
        for (int i2 = 0; i2 < this.f34612a.size(); i2++) {
            m28680h(this.f34612a.get(this.f34612a.keyAt(i2)));
        }
    }

    @Override // p241e.p307h.p308a.InterfaceC9015w
    /* renamed from: c */
    public boolean mo28685c(AbstractC8991i abstractC8991i) {
        int hashCode = abstractC8991i.hashCode();
        List<InterfaceC8958a.b> m28893c = C8986h.m28890i().m28893c(hashCode, abstractC8991i);
        if (m28681i(hashCode, m28893c, abstractC8991i, false)) {
            return false;
        }
        Iterator<InterfaceC8958a.b> it = m28893c.iterator();
        while (it.hasNext()) {
            it.next().mo28644L();
        }
        return true;
    }

    @Override // p241e.p307h.p308a.InterfaceC9015w
    /* renamed from: d */
    public void mo28686d(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            m28682j(this.f34612a.get(it.next().intValue()));
        }
    }

    @Override // p241e.p307h.p308a.InterfaceC9015w
    /* renamed from: e */
    public boolean mo28687e(AbstractC8991i abstractC8991i) {
        c cVar = new c();
        int hashCode = cVar.hashCode();
        List<InterfaceC8958a.b> m28893c = C8986h.m28890i().m28893c(hashCode, abstractC8991i);
        if (m28681i(hashCode, m28893c, abstractC8991i, true)) {
            return false;
        }
        HandlerThread handlerThread = new HandlerThread(C9003f.m29009o("filedownloader serial thread %s-%d", abstractC8991i, Integer.valueOf(hashCode)));
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), cVar);
        cVar.m28693d(handler);
        cVar.m28694e(m28893c);
        cVar.m28691c(0);
        synchronized (this.f34612a) {
            this.f34612a.put(hashCode, handler);
        }
        return true;
    }

    @Override // p241e.p307h.p308a.InterfaceC9015w
    /* renamed from: f */
    public boolean mo28688f(int i2) {
        return this.f34612a.get(i2) != null;
    }
}
