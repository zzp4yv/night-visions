package p456rx.p461n.p466e.p467n;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: LinkedQueueNode.java */
/* renamed from: rx.n.e.n.c */
/* loaded from: classes3.dex */
public final class C11319c<E> extends AtomicReference<C11319c<E>> {

    /* renamed from: f */
    private E f42932f;

    public C11319c() {
    }

    /* renamed from: a */
    public E m40479a() {
        E m40480b = m40480b();
        m40483e(null);
        return m40480b;
    }

    /* renamed from: b */
    public E m40480b() {
        return this.f42932f;
    }

    /* renamed from: c */
    public C11319c<E> m40481c() {
        return get();
    }

    /* renamed from: d */
    public void m40482d(C11319c<E> c11319c) {
        lazySet(c11319c);
    }

    /* renamed from: e */
    public void m40483e(E e2) {
        this.f42932f = e2;
    }

    public C11319c(E e2) {
        m40483e(e2);
    }
}
