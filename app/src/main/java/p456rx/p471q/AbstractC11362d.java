package p456rx.p471q;

import p456rx.C11186e;
import p456rx.InterfaceC11198k;

/* compiled from: RxJavaObservableExecutionHook.java */
/* renamed from: rx.q.d */
/* loaded from: classes3.dex */
public abstract class AbstractC11362d {
    @Deprecated
    public <T> C11186e.a<T> onCreate(C11186e.a<T> aVar) {
        return aVar;
    }

    @Deprecated
    public <T, R> C11186e.b<? extends R, ? super T> onLift(C11186e.b<? extends R, ? super T> bVar) {
        return bVar;
    }

    @Deprecated
    public <T> Throwable onSubscribeError(Throwable th) {
        return th;
    }

    @Deprecated
    public <T> InterfaceC11198k onSubscribeReturn(InterfaceC11198k interfaceC11198k) {
        return interfaceC11198k;
    }

    @Deprecated
    public <T> C11186e.a<T> onSubscribeStart(C11186e<? extends T> c11186e, C11186e.a<T> aVar) {
        return aVar;
    }
}
