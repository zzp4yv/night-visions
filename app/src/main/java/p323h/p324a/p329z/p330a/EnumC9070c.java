package p323h.p324a.p329z.p330a;

import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.p325a0.C9030a;
import p323h.p324a.p327x.InterfaceC9056c;
import p323h.p324a.p329z.p331b.C9075b;

/* compiled from: DisposableHelper.java */
/* renamed from: h.a.z.a.c */
/* loaded from: classes2.dex */
public enum EnumC9070c implements InterfaceC9056c {
    DISPOSED;

    /* renamed from: A */
    public static boolean m29248A(AtomicReference<InterfaceC9056c> atomicReference, InterfaceC9056c interfaceC9056c) {
        C9075b.m29271c(interfaceC9056c, "d is null");
        if (atomicReference.compareAndSet(null, interfaceC9056c)) {
            return true;
        }
        interfaceC9056c.mo29115k();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        m29253x();
        return false;
    }

    /* renamed from: D */
    public static boolean m29249D(InterfaceC9056c interfaceC9056c, InterfaceC9056c interfaceC9056c2) {
        if (interfaceC9056c2 == null) {
            C9030a.m29147o(new NullPointerException("next is null"));
            return false;
        }
        if (interfaceC9056c == null) {
            return true;
        }
        interfaceC9056c2.mo29115k();
        m29253x();
        return false;
    }

    /* renamed from: g */
    public static boolean m29250g(AtomicReference<InterfaceC9056c> atomicReference) {
        InterfaceC9056c andSet;
        InterfaceC9056c interfaceC9056c = atomicReference.get();
        EnumC9070c enumC9070c = DISPOSED;
        if (interfaceC9056c == enumC9070c || (andSet = atomicReference.getAndSet(enumC9070c)) == enumC9070c) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.mo29115k();
        return true;
    }

    /* renamed from: u */
    public static boolean m29251u(InterfaceC9056c interfaceC9056c) {
        return interfaceC9056c == DISPOSED;
    }

    /* renamed from: v */
    public static boolean m29252v(AtomicReference<InterfaceC9056c> atomicReference, InterfaceC9056c interfaceC9056c) {
        InterfaceC9056c interfaceC9056c2;
        do {
            interfaceC9056c2 = atomicReference.get();
            if (interfaceC9056c2 == DISPOSED) {
                if (interfaceC9056c == null) {
                    return false;
                }
                interfaceC9056c.mo29115k();
                return false;
            }
        } while (!atomicReference.compareAndSet(interfaceC9056c2, interfaceC9056c));
        return true;
    }

    /* renamed from: x */
    public static void m29253x() {
        C9030a.m29147o(new ProtocolViolationException("Disposable already set!"));
    }

    /* renamed from: y */
    public static boolean m29254y(AtomicReference<InterfaceC9056c> atomicReference, InterfaceC9056c interfaceC9056c) {
        InterfaceC9056c interfaceC9056c2;
        do {
            interfaceC9056c2 = atomicReference.get();
            if (interfaceC9056c2 == DISPOSED) {
                if (interfaceC9056c == null) {
                    return false;
                }
                interfaceC9056c.mo29115k();
                return false;
            }
        } while (!atomicReference.compareAndSet(interfaceC9056c2, interfaceC9056c));
        if (interfaceC9056c2 == null) {
            return true;
        }
        interfaceC9056c2.mo29115k();
        return true;
    }

    @Override // p323h.p324a.p327x.InterfaceC9056c
    /* renamed from: k */
    public void mo29115k() {
    }

    @Override // p323h.p324a.p327x.InterfaceC9056c
    /* renamed from: q */
    public boolean mo29116q() {
        return true;
    }
}
