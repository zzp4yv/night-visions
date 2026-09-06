package p323h.p324a.p329z.p341g;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p323h.p324a.p327x.InterfaceC9056c;

/* compiled from: DisposeOnCancel.java */
/* renamed from: h.a.z.g.c */
/* loaded from: classes2.dex */
final class FutureC9129c implements Future<Object> {

    /* renamed from: f */
    final InterfaceC9056c f35196f;

    FutureC9129c(InterfaceC9056c interfaceC9056c) {
        this.f35196f = interfaceC9056c;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        this.f35196f.mo29115k();
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException, ExecutionException {
        return null;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j2, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return false;
    }
}
