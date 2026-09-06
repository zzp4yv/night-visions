package p456rx.p461n.p466e.p467n;

/* compiled from: MpscLinkedAtomicQueue.java */
/* renamed from: rx.n.e.n.d */
/* loaded from: classes3.dex */
public final class C11320d<E> extends AbstractC11318b<E> {
    public C11320d() {
        C11319c<E> c11319c = new C11319c<>();
        m40477h(c11319c);
        m40478i(c11319c);
    }

    @Override // java.util.Queue
    public boolean offer(E e2) {
        if (e2 == null) {
            throw new NullPointerException("null elements not allowed");
        }
        C11319c<E> c11319c = new C11319c<>(e2);
        m40478i(c11319c).m40482d(c11319c);
        return true;
    }

    @Override // java.util.Queue
    public E peek() {
        C11319c<E> m40481c;
        C11319c<E> m40474c = m40474c();
        C11319c<E> m40481c2 = m40474c.m40481c();
        if (m40481c2 != null) {
            return m40481c2.m40480b();
        }
        if (m40474c == m40476g()) {
            return null;
        }
        do {
            m40481c = m40474c.m40481c();
        } while (m40481c == null);
        return m40481c.m40480b();
    }

    @Override // java.util.Queue
    public E poll() {
        C11319c<E> m40481c;
        C11319c<E> m40474c = m40474c();
        C11319c<E> m40481c2 = m40474c.m40481c();
        if (m40481c2 != null) {
            E m40479a = m40481c2.m40479a();
            m40477h(m40481c2);
            return m40479a;
        }
        if (m40474c == m40476g()) {
            return null;
        }
        do {
            m40481c = m40474c.m40481c();
        } while (m40481c == null);
        E m40479a2 = m40481c.m40479a();
        m40477h(m40481c);
        return m40479a2;
    }
}
