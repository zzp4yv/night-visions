package p456rx.p461n.p466e.p468o;

import p456rx.p461n.p466e.p467n.C11319c;

/* compiled from: BaseLinkedQueue.java */
/* renamed from: rx.n.e.o.b */
/* loaded from: classes3.dex */
abstract class AbstractC11326b<E> extends AbstractC11328d<E> {

    /* renamed from: g */
    protected static final long f42962g = C11350z.m40547a(AbstractC11326b.class, "consumerNode");
    protected C11319c<E> consumerNode;

    AbstractC11326b() {
    }

    /* renamed from: f */
    protected final C11319c<E> m40523f() {
        return this.consumerNode;
    }

    /* renamed from: g */
    protected final C11319c<E> m40524g() {
        return (C11319c) C11350z.f42976a.getObjectVolatile(this, f42962g);
    }

    /* renamed from: h */
    protected final void m40525h(C11319c<E> c11319c) {
        this.consumerNode = c11319c;
    }
}
