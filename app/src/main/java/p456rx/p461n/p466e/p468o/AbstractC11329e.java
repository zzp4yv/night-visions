package p456rx.p461n.p466e.p468o;

import p456rx.p461n.p466e.p467n.C11319c;

/* compiled from: BaseLinkedQueue.java */
/* renamed from: rx.n.e.o.e */
/* loaded from: classes3.dex */
abstract class AbstractC11329e<E> extends AbstractC11327c<E> {

    /* renamed from: f */
    protected static final long f42963f = C11350z.m40547a(AbstractC11329e.class, "producerNode");
    protected C11319c<E> producerNode;

    AbstractC11329e() {
    }

    /* renamed from: c */
    protected final C11319c<E> m40526c() {
        return (C11319c) C11350z.f42976a.getObjectVolatile(this, f42963f);
    }
}
