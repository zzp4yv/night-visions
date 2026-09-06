package p456rx.p461n.p466e.p468o;

import p456rx.p461n.p466e.p467n.C11319c;

/* compiled from: MpscLinkedQueue.java */
/* renamed from: rx.n.e.o.i */
/* loaded from: classes3.dex */
public final class C11333i<E> extends AbstractC11325a<E> {
    public C11333i() {
        C11319c<E> c11319c = new C11319c<>();
        this.consumerNode = c11319c;
        m40534i(c11319c);
    }

    /* renamed from: i */
    protected C11319c<E> m40534i(C11319c<E> c11319c) {
        C11319c<E> c11319c2;
        do {
            c11319c2 = this.producerNode;
        } while (!C11350z.f42976a.compareAndSwapObject(this, AbstractC11329e.f42963f, c11319c2, c11319c));
        return c11319c2;
    }

    @Override // java.util.Queue
    public boolean offer(E e2) {
        if (e2 == null) {
            throw new NullPointerException("null elements not allowed");
        }
        C11319c<E> c11319c = new C11319c<>(e2);
        m40534i(c11319c).m40482d(c11319c);
        return true;
    }

    @Override // java.util.Queue
    public E peek() {
        C11319c<E> m40481c;
        C11319c<E> c11319c = this.consumerNode;
        C11319c<E> m40481c2 = c11319c.m40481c();
        if (m40481c2 != null) {
            return m40481c2.m40480b();
        }
        if (c11319c == m40526c()) {
            return null;
        }
        do {
            m40481c = c11319c.m40481c();
        } while (m40481c == null);
        return m40481c.m40480b();
    }

    @Override // java.util.Queue
    public E poll() {
        C11319c<E> m40481c;
        C11319c<E> m40523f = m40523f();
        C11319c<E> m40481c2 = m40523f.m40481c();
        if (m40481c2 != null) {
            E m40479a = m40481c2.m40479a();
            m40525h(m40481c2);
            return m40479a;
        }
        if (m40523f == m40526c()) {
            return null;
        }
        do {
            m40481c = m40523f.m40481c();
        } while (m40481c == null);
        E m40479a2 = m40481c.m40479a();
        this.consumerNode = m40481c;
        return m40479a2;
    }
}
