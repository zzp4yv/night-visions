package p456rx.p461n.p464c;

import java.util.concurrent.ThreadFactory;
import p456rx.AbstractC11195h;

/* compiled from: NewThreadScheduler.java */
/* renamed from: rx.n.c.g */
/* loaded from: classes3.dex */
public final class C11294g extends AbstractC11195h {

    /* renamed from: a */
    private final ThreadFactory f42798a;

    public C11294g(ThreadFactory threadFactory) {
        this.f42798a = threadFactory;
    }

    @Override // p456rx.AbstractC11195h
    public AbstractC11195h.a createWorker() {
        return new C11295h(this.f42798a);
    }
}
