package p323h.p324a.p329z.p341g;

import java.util.concurrent.ThreadFactory;
import p323h.p324a.AbstractC9048r;

/* compiled from: NewThreadScheduler.java */
/* renamed from: h.a.z.g.f */
/* loaded from: classes2.dex */
public final class C9132f extends AbstractC9048r {

    /* renamed from: b */
    private static final ThreadFactoryC9134h f35236b = new ThreadFactoryC9134h("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* renamed from: c */
    final ThreadFactory f35237c;

    public C9132f() {
        this(f35236b);
    }

    @Override // p323h.p324a.AbstractC9048r
    /* renamed from: a */
    public AbstractC9048r.b mo29220a() {
        return new C9133g(this.f35237c);
    }

    public C9132f(ThreadFactory threadFactory) {
        this.f35237c = threadFactory;
    }
}
