package io.sentry;

import java.util.Queue;

/* compiled from: SynchronizedQueue.java */
/* renamed from: io.sentry.m5 */
/* loaded from: classes2.dex */
final class C9481m5<E> extends C9474l5<E> implements Queue<E> {
    private C9481m5(Queue<E> queue) {
        super(queue);
    }

    /* renamed from: g */
    static <E> C9481m5<E> m31068g(Queue<E> queue) {
        return new C9481m5<>(queue);
    }

    @Override // java.util.Queue
    public E element() {
        E element;
        synchronized (this.f36462g) {
            element = mo31013c().element();
        }
        return element;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f36462g) {
            equals = mo31013c().equals(obj);
        }
        return equals;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.sentry.C9474l5
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Queue<E> mo31013c() {
        return (Queue) super.mo31013c();
    }

    @Override // java.util.Collection
    public int hashCode() {
        int hashCode;
        synchronized (this.f36462g) {
            hashCode = mo31013c().hashCode();
        }
        return hashCode;
    }

    @Override // java.util.Queue
    public boolean offer(E e2) {
        boolean offer;
        synchronized (this.f36462g) {
            offer = mo31013c().offer(e2);
        }
        return offer;
    }

    @Override // java.util.Queue
    public E peek() {
        E peek;
        synchronized (this.f36462g) {
            peek = mo31013c().peek();
        }
        return peek;
    }

    @Override // java.util.Queue
    public E poll() {
        E poll;
        synchronized (this.f36462g) {
            poll = mo31013c().poll();
        }
        return poll;
    }

    @Override // java.util.Queue
    public E remove() {
        E remove;
        synchronized (this.f36462g) {
            remove = mo31013c().remove();
        }
        return remove;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        Object[] array;
        synchronized (this.f36462g) {
            array = mo31013c().toArray();
        }
        return array;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        T[] tArr2;
        synchronized (this.f36462g) {
            tArr2 = (T[]) mo31013c().toArray(tArr);
        }
        return tArr2;
    }
}
