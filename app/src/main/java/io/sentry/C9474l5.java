package io.sentry;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: SynchronizedCollection.java */
/* renamed from: io.sentry.l5 */
/* loaded from: classes2.dex */
class C9474l5<E> implements Collection<E>, Serializable {

    /* renamed from: f */
    private final Collection<E> f36461f;

    /* renamed from: g */
    final Object f36462g;

    C9474l5(Collection<E> collection) {
        if (collection == null) {
            throw new NullPointerException("Collection must not be null.");
        }
        this.f36461f = collection;
        this.f36462g = this;
    }

    @Override // java.util.Collection
    public boolean add(E e2) {
        boolean add;
        synchronized (this.f36462g) {
            add = mo31013c().add(e2);
        }
        return add;
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        boolean addAll;
        synchronized (this.f36462g) {
            addAll = mo31013c().addAll(collection);
        }
        return addAll;
    }

    /* renamed from: c */
    protected Collection<E> mo31013c() {
        return this.f36461f;
    }

    @Override // java.util.Collection
    public void clear() {
        synchronized (this.f36462g) {
            mo31013c().clear();
        }
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        boolean contains;
        synchronized (this.f36462g) {
            contains = mo31013c().contains(obj);
        }
        return contains;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        boolean containsAll;
        synchronized (this.f36462g) {
            containsAll = mo31013c().containsAll(collection);
        }
        return containsAll;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f36462g) {
            isEmpty = mo31013c().isEmpty();
        }
        return isEmpty;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return mo31013c().iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        boolean remove;
        synchronized (this.f36462g) {
            remove = mo31013c().remove(obj);
        }
        return remove;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        boolean removeAll;
        synchronized (this.f36462g) {
            removeAll = mo31013c().removeAll(collection);
        }
        return removeAll;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        boolean retainAll;
        synchronized (this.f36462g) {
            retainAll = mo31013c().retainAll(collection);
        }
        return retainAll;
    }

    @Override // java.util.Collection
    public int size() {
        int size;
        synchronized (this.f36462g) {
            size = mo31013c().size();
        }
        return size;
    }

    public String toString() {
        String obj;
        synchronized (this.f36462g) {
            obj = mo31013c().toString();
        }
        return obj;
    }
}
