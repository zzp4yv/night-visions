package p241e.p307h.p308a.p312h0;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.Executor;
import p241e.p307h.p308a.p315k0.C8999b;
import p241e.p307h.p308a.p315k0.C9001d;

/* compiled from: DownloadEventPoolImpl.java */
/* renamed from: e.h.a.h0.a */
/* loaded from: classes2.dex */
public class C8987a {

    /* renamed from: a */
    private final Executor f34784a = C8999b.m28953a(10, "EventPool");

    /* renamed from: b */
    private final HashMap<String, LinkedList<AbstractC8990d>> f34785b = new HashMap<>();

    /* compiled from: DownloadEventPoolImpl.java */
    /* renamed from: e.h.a.h0.a$a */
    class a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ AbstractC8989c f34786f;

        a(AbstractC8989c abstractC8989c) {
            this.f34786f = abstractC8989c;
        }

        @Override // java.lang.Runnable
        public void run() {
            C8987a.this.m28907c(this.f34786f);
        }
    }

    /* renamed from: d */
    private void m28904d(LinkedList<AbstractC8990d> linkedList, AbstractC8989c abstractC8989c) {
        for (Object obj : linkedList.toArray()) {
            if (obj != null && ((AbstractC8990d) obj).mo28713d(abstractC8989c)) {
                break;
            }
        }
        Runnable runnable = abstractC8989c.f34794a;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public boolean m28905a(String str, AbstractC8990d abstractC8990d) {
        boolean add;
        if (C9001d.f34819a) {
            C9001d.m28969h(this, "setListener %s", str);
        }
        if (abstractC8990d == null) {
            throw new IllegalArgumentException("listener must not be null!");
        }
        LinkedList<AbstractC8990d> linkedList = this.f34785b.get(str);
        if (linkedList == null) {
            synchronized (str.intern()) {
                linkedList = this.f34785b.get(str);
                if (linkedList == null) {
                    HashMap<String, LinkedList<AbstractC8990d>> hashMap = this.f34785b;
                    LinkedList<AbstractC8990d> linkedList2 = new LinkedList<>();
                    hashMap.put(str, linkedList2);
                    linkedList = linkedList2;
                }
            }
        }
        synchronized (str.intern()) {
            add = linkedList.add(abstractC8990d);
        }
        return add;
    }

    /* renamed from: b */
    public void m28906b(AbstractC8989c abstractC8989c) {
        if (C9001d.f34819a) {
            C9001d.m28969h(this, "asyncPublishInNewThread %s", abstractC8989c.m28909a());
        }
        if (abstractC8989c == null) {
            throw new IllegalArgumentException("event must not be null!");
        }
        this.f34784a.execute(new a(abstractC8989c));
    }

    /* renamed from: c */
    public boolean m28907c(AbstractC8989c abstractC8989c) {
        if (C9001d.f34819a) {
            C9001d.m28969h(this, "publish %s", abstractC8989c.m28909a());
        }
        if (abstractC8989c == null) {
            throw new IllegalArgumentException("event must not be null!");
        }
        String m28909a = abstractC8989c.m28909a();
        LinkedList<AbstractC8990d> linkedList = this.f34785b.get(m28909a);
        if (linkedList == null) {
            synchronized (m28909a.intern()) {
                linkedList = this.f34785b.get(m28909a);
                if (linkedList == null) {
                    if (C9001d.f34819a) {
                        C9001d.m28962a(this, "No listener for this event %s", m28909a);
                    }
                    return false;
                }
            }
        }
        m28904d(linkedList, abstractC8989c);
        return true;
    }
}
