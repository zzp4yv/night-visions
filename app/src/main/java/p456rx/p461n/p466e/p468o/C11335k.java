package p456rx.p461n.p466e.p468o;

/* compiled from: SpmcArrayQueue.java */
/* renamed from: rx.n.e.o.k */
/* loaded from: classes3.dex */
public final class C11335k<E> extends AbstractC11339o<E> {
    public C11335k(int i2) {
        super(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return m40538t() == m40539q();
    }

    @Override // java.util.Queue
    public boolean offer(E e2) {
        if (e2 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        E[] eArr = this.f42968j;
        long j2 = this.f42967i;
        long m40539q = m40539q();
        long m40527c = m40527c(m40539q);
        if (m40531i(eArr, m40527c) != null) {
            if (m40539q - m40538t() > j2) {
                return false;
            }
            while (m40531i(eArr, m40527c) != null) {
            }
        }
        m40533o(eArr, m40527c, e2);
        m40540r(m40539q + 1);
        return true;
    }

    @Override // java.util.Queue
    public E peek() {
        E m40530h;
        long m40541u = m40541u();
        do {
            long m40538t = m40538t();
            if (m40538t >= m40541u) {
                long m40539q = m40539q();
                if (m40538t >= m40539q) {
                    return null;
                }
                m40542v(m40539q);
            }
            m40530h = m40530h(m40527c(m40538t));
        } while (m40530h == null);
        return m40530h;
    }

    @Override // java.util.Queue, p456rx.p461n.p466e.p468o.InterfaceC11332h
    public E poll() {
        long m40538t;
        long m40541u = m40541u();
        do {
            m40538t = m40538t();
            if (m40538t >= m40541u) {
                long m40539q = m40539q();
                if (m40538t >= m40539q) {
                    return null;
                }
                m40542v(m40539q);
            }
        } while (!m40537s(m40538t, 1 + m40538t));
        long m40527c = m40527c(m40538t);
        E[] eArr = this.f42968j;
        E m40529g = m40529g(eArr, m40527c);
        m40532n(eArr, m40527c, null);
        return m40529g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        long m40538t = m40538t();
        while (true) {
            long m40539q = m40539q();
            long m40538t2 = m40538t();
            if (m40538t == m40538t2) {
                return (int) (m40539q - m40538t2);
            }
            m40538t = m40538t2;
        }
    }
}
