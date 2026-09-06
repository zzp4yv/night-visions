package p456rx.p461n.p466e.p468o;

import java.util.Iterator;
import p456rx.p461n.p466e.p467n.C11319c;

/* compiled from: BaseLinkedQueue.java */
/* renamed from: rx.n.e.o.a */
/* loaded from: classes3.dex */
abstract class AbstractC11325a<E> extends AbstractC11326b<E> {
    AbstractC11325a() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return m40524g() == m40526c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        C11319c<E> m40481c;
        C11319c<E> m40524g = m40524g();
        C11319c<E> m40526c = m40526c();
        int i2 = 0;
        while (m40524g != m40526c && i2 < Integer.MAX_VALUE) {
            do {
                m40481c = m40524g.m40481c();
            } while (m40481c == null);
            i2++;
            m40524g = m40481c;
        }
        return i2;
    }
}
