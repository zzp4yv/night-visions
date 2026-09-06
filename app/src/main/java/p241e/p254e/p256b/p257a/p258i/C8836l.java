package p241e.p254e.p256b.p257a.p258i;

import java.util.concurrent.Executor;
import p241e.p254e.p256b.p257a.p258i.p264x.p265a.C8851d;
import p241e.p254e.p256b.p257a.p258i.p264x.p265a.InterfaceC8849b;

/* compiled from: ExecutionModule_ExecutorFactory.java */
/* renamed from: e.e.b.a.i.l */
/* loaded from: classes2.dex */
public final class C8836l implements InterfaceC8849b<Executor> {

    /* compiled from: ExecutionModule_ExecutorFactory.java */
    /* renamed from: e.e.b.a.i.l$a */
    private static final class a {

        /* renamed from: a */
        private static final C8836l f33605a = new C8836l();
    }

    /* renamed from: a */
    public static C8836l m28160a() {
        return a.f33605a;
    }

    /* renamed from: b */
    public static Executor m28161b() {
        return (Executor) C8851d.m28189c(AbstractC8835k.m28159a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return m28161b();
    }
}
