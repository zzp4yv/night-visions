package p345i.p346a;

import java.net.InetAddress;
import java.util.concurrent.atomic.AtomicReference;
import p345i.p346a.p347g.C9169o;

/* compiled from: NetworkTopologyDiscovery.java */
/* renamed from: i.a.b */
/* loaded from: classes2.dex */
public interface InterfaceC9150b {

    /* compiled from: NetworkTopologyDiscovery.java */
    /* renamed from: i.a.b$a */
    public static final class a {

        /* renamed from: a */
        private static volatile InterfaceC9150b f35288a;

        /* renamed from: b */
        private static final AtomicReference<InterfaceC11485a> f35289b = new AtomicReference<>();

        /* compiled from: NetworkTopologyDiscovery.java */
        /* renamed from: i.a.b$a$a, reason: collision with other inner class name */
        public interface InterfaceC11485a {
            /* renamed from: a */
            InterfaceC9150b m29409a();
        }

        private a() {
        }

        /* renamed from: a */
        public static InterfaceC9150b m29407a() {
            if (f35288a == null) {
                synchronized (a.class) {
                    if (f35288a == null) {
                        f35288a = m29408b();
                    }
                }
            }
            return f35288a;
        }

        /* renamed from: b */
        protected static InterfaceC9150b m29408b() {
            InterfaceC11485a interfaceC11485a = f35289b.get();
            InterfaceC9150b m29409a = interfaceC11485a != null ? interfaceC11485a.m29409a() : null;
            return m29409a != null ? m29409a : new C9169o();
        }
    }

    /* renamed from: a */
    InetAddress[] mo29406a();
}
