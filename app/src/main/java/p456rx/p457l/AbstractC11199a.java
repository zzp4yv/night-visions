package p456rx.p457l;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import p456rx.InterfaceC11198k;
import p456rx.p457l.p459c.C11202a;
import p456rx.p460m.InterfaceC11204a;

/* compiled from: MainThreadSubscription.java */
/* renamed from: rx.l.a */
/* loaded from: classes3.dex */
public abstract class AbstractC11199a implements InterfaceC11198k {
    private final AtomicBoolean unsubscribed = new AtomicBoolean();

    /* compiled from: MainThreadSubscription.java */
    /* renamed from: rx.l.a$a */
    class a implements InterfaceC11204a {
        a() {
        }

        @Override // p456rx.p460m.InterfaceC11204a
        public void call() {
            AbstractC11199a.this.onUnsubscribe();
        }
    }

    public static void verifyMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Expected to be called on the main thread but was " + Thread.currentThread().getName());
    }

    @Override // p456rx.InterfaceC11198k
    public final boolean isUnsubscribed() {
        return this.unsubscribed.get();
    }

    protected abstract void onUnsubscribe();

    @Override // p456rx.InterfaceC11198k
    public final void unsubscribe() {
        if (this.unsubscribed.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                onUnsubscribe();
            } else {
                C11202a.m40156b().createWorker().mo40146c(new a());
            }
        }
    }
}
