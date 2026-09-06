package p323h.p324a.p329z.p343i;

import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.p325a0.C9030a;
import p323h.p324a.p329z.p331b.C9075b;
import p323h.p324a.p329z.p344j.C9144b;
import p355k.p356a.InterfaceC9697c;

/* compiled from: SubscriptionHelper.java */
/* renamed from: h.a.z.i.b */
/* loaded from: classes2.dex */
public enum EnumC9142b implements InterfaceC9697c {
    CANCELLED;

    /* renamed from: g */
    public static boolean m29377g(AtomicReference<InterfaceC9697c> atomicReference) {
        InterfaceC9697c andSet;
        InterfaceC9697c interfaceC9697c = atomicReference.get();
        EnumC9142b enumC9142b = CANCELLED;
        if (interfaceC9697c == enumC9142b || (andSet = atomicReference.getAndSet(enumC9142b)) == enumC9142b) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    /* renamed from: k */
    public static void m29378k(AtomicReference<InterfaceC9697c> atomicReference, AtomicLong atomicLong, long j2) {
        InterfaceC9697c interfaceC9697c = atomicReference.get();
        if (interfaceC9697c != null) {
            interfaceC9697c.request(j2);
            return;
        }
        if (m29382x(j2)) {
            C9144b.m29386a(atomicLong, j2);
            InterfaceC9697c interfaceC9697c2 = atomicReference.get();
            if (interfaceC9697c2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    interfaceC9697c2.request(andSet);
                }
            }
        }
    }

    /* renamed from: q */
    public static boolean m29379q(AtomicReference<InterfaceC9697c> atomicReference, AtomicLong atomicLong, InterfaceC9697c interfaceC9697c) {
        if (!m29381v(atomicReference, interfaceC9697c)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0L);
        if (andSet == 0) {
            return true;
        }
        interfaceC9697c.request(andSet);
        return true;
    }

    /* renamed from: u */
    public static void m29380u() {
        C9030a.m29147o(new ProtocolViolationException("Subscription already set!"));
    }

    /* renamed from: v */
    public static boolean m29381v(AtomicReference<InterfaceC9697c> atomicReference, InterfaceC9697c interfaceC9697c) {
        C9075b.m29271c(interfaceC9697c, "s is null");
        if (atomicReference.compareAndSet(null, interfaceC9697c)) {
            return true;
        }
        interfaceC9697c.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        m29380u();
        return false;
    }

    /* renamed from: x */
    public static boolean m29382x(long j2) {
        if (j2 > 0) {
            return true;
        }
        C9030a.m29147o(new IllegalArgumentException("n > 0 required but it was " + j2));
        return false;
    }

    /* renamed from: y */
    public static boolean m29383y(InterfaceC9697c interfaceC9697c, InterfaceC9697c interfaceC9697c2) {
        if (interfaceC9697c2 == null) {
            C9030a.m29147o(new NullPointerException("next is null"));
            return false;
        }
        if (interfaceC9697c == null) {
            return true;
        }
        interfaceC9697c2.cancel();
        m29380u();
        return false;
    }

    @Override // p355k.p356a.InterfaceC9697c
    public void cancel() {
    }

    @Override // p355k.p356a.InterfaceC9697c
    public void request(long j2) {
    }
}
