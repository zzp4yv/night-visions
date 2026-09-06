package p323h.p324a.p329z.p344j;

import java.util.concurrent.atomic.AtomicInteger;
import p323h.p324a.p325a0.C9030a;
import p355k.p356a.InterfaceC9696b;

/* compiled from: HalfSerializer.java */
/* renamed from: h.a.z.j.d */
/* loaded from: classes2.dex */
public final class C9146d {
    /* renamed from: a */
    public static void m29392a(InterfaceC9696b<?> interfaceC9696b, AtomicInteger atomicInteger, C9143a c9143a) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable m29385b = c9143a.m29385b();
            if (m29385b != null) {
                interfaceC9696b.onError(m29385b);
            } else {
                interfaceC9696b.mo29121a();
            }
        }
    }

    /* renamed from: b */
    public static void m29393b(InterfaceC9696b<?> interfaceC9696b, Throwable th, AtomicInteger atomicInteger, C9143a c9143a) {
        if (!c9143a.m29384a(th)) {
            C9030a.m29147o(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            interfaceC9696b.onError(c9143a.m29385b());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static <T> void m29394c(InterfaceC9696b<? super T> interfaceC9696b, T t, AtomicInteger atomicInteger, C9143a c9143a) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            interfaceC9696b.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable m29385b = c9143a.m29385b();
                if (m29385b != null) {
                    interfaceC9696b.onError(m29385b);
                } else {
                    interfaceC9696b.mo29121a();
                }
            }
        }
    }
}
