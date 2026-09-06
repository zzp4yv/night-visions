package p456rx.p461n.p466e.p468o;

/* compiled from: SpscArrayQueue.java */
/* renamed from: rx.n.e.o.s */
/* loaded from: classes3.dex */
public final class C11343s<E> extends AbstractC11348x<E> {
    public C11343s(int i2) {
        super(i2);
    }

    /* renamed from: q */
    private long m40543q() {
        return C11350z.f42976a.getLongVolatile(this, AbstractC11345u.f42974n);
    }

    /* renamed from: r */
    private long m40544r() {
        return C11350z.f42976a.getLongVolatile(this, AbstractC11349y.f42975m);
    }

    /* renamed from: s */
    private void m40545s(long j2) {
        C11350z.f42976a.putOrderedLong(this, AbstractC11345u.f42974n, j2);
    }

    /* renamed from: t */
    private void m40546t(long j2) {
        C11350z.f42976a.putOrderedLong(this, AbstractC11349y.f42975m, j2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return m40544r() == m40543q();
    }

    @Override // java.util.Queue
    public boolean offer(E e2) {
        if (e2 == null) {
            throw new NullPointerException("null elements not allowed");
        }
        E[] eArr = this.f42968j;
        long j2 = this.producerIndex;
        long m40527c = m40527c(j2);
        if (m40531i(eArr, m40527c) != null) {
            return false;
        }
        m40532n(eArr, m40527c, e2);
        m40546t(j2 + 1);
        return true;
    }

    @Override // java.util.Queue
    public E peek() {
        return m40530h(m40527c(this.consumerIndex));
    }

    @Override // java.util.Queue, p456rx.p461n.p466e.p468o.InterfaceC11332h
    public E poll() {
        long j2 = this.consumerIndex;
        long m40527c = m40527c(j2);
        E[] eArr = this.f42968j;
        E m40531i = m40531i(eArr, m40527c);
        if (m40531i == null) {
            return null;
        }
        m40532n(eArr, m40527c, null);
        m40545s(j2 + 1);
        return m40531i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        long m40543q = m40543q();
        while (true) {
            long m40544r = m40544r();
            long m40543q2 = m40543q();
            if (m40543q == m40543q2) {
                return (int) (m40544r - m40543q2);
            }
            m40543q = m40543q2;
        }
    }
}
