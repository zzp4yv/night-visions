package p456rx.p461n.p466e;

import java.util.concurrent.CountDownLatch;
import p456rx.InterfaceC11198k;

/* compiled from: BlockingUtils.java */
/* renamed from: rx.n.e.d */
/* loaded from: classes3.dex */
public final class C11307d {
    /* renamed from: a */
    public static void m40420a(CountDownLatch countDownLatch, InterfaceC11198k interfaceC11198k) {
        if (countDownLatch.getCount() == 0) {
            return;
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e2) {
            interfaceC11198k.unsubscribe();
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Interrupted while waiting for subscription to complete.", e2);
        }
    }
}
