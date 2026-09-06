package p345i.p346a.p347g;

import androidx.recyclerview.widget.RecyclerView;
import java.util.EventListener;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p345i.p346a.AbstractC9151c;
import p345i.p346a.AbstractC9152d;
import p345i.p346a.InterfaceC9153e;
import p345i.p346a.InterfaceC9154f;
import p355k.p357b.C9700c;
import p355k.p357b.InterfaceC9699b;

/* compiled from: ListenerStatus.java */
/* renamed from: i.a.g.m */
/* loaded from: classes2.dex */
public class C9167m<T extends EventListener> {

    /* renamed from: a */
    private final T f35428a;

    /* renamed from: b */
    private final boolean f35429b;

    /* compiled from: ListenerStatus.java */
    /* renamed from: i.a.g.m$a */
    public static class a extends C9167m<InterfaceC9153e> {

        /* renamed from: c */
        private static InterfaceC9699b f35430c = C9700c.m32189i(a.class.getName());

        /* renamed from: d */
        private final ConcurrentMap<String, AbstractC9152d> f35431d;

        public a(InterfaceC9153e interfaceC9153e, boolean z) {
            super(interfaceC9153e, z);
            this.f35431d = new ConcurrentHashMap(32);
        }

        /* renamed from: c */
        private static final boolean m29700c(AbstractC9152d abstractC9152d, AbstractC9152d abstractC9152d2) {
            if (abstractC9152d == null || abstractC9152d2 == null || !abstractC9152d.equals(abstractC9152d2)) {
                return false;
            }
            byte[] mo29428r = abstractC9152d.mo29428r();
            byte[] mo29428r2 = abstractC9152d2.mo29428r();
            if (mo29428r.length != mo29428r2.length) {
                return false;
            }
            for (int i2 = 0; i2 < mo29428r.length; i2++) {
                if (mo29428r[i2] != mo29428r2[i2]) {
                    return false;
                }
            }
            return abstractC9152d.mo29432v(abstractC9152d2);
        }

        /* renamed from: d */
        void m29701d(AbstractC9151c abstractC9151c) {
            if (this.f35431d.putIfAbsent(abstractC9151c.mo29413f() + "." + abstractC9151c.mo29414g(), abstractC9151c.mo29412e().clone()) != null) {
                f35430c.mo32174c("Service Added called for a service already added: " + abstractC9151c);
                return;
            }
            m29698a().serviceAdded(abstractC9151c);
            AbstractC9152d mo29412e = abstractC9151c.mo29412e();
            if (mo29412e == null || !mo29412e.mo29431u()) {
                return;
            }
            m29698a().serviceResolved(abstractC9151c);
        }

        /* renamed from: e */
        void m29702e(AbstractC9151c abstractC9151c) {
            String str = abstractC9151c.mo29413f() + "." + abstractC9151c.mo29414g();
            ConcurrentMap<String, AbstractC9152d> concurrentMap = this.f35431d;
            if (concurrentMap.remove(str, concurrentMap.get(str))) {
                m29698a().serviceRemoved(abstractC9151c);
                return;
            }
            f35430c.mo32174c("Service Removed called for a service already removed: " + abstractC9151c);
        }

        /* renamed from: f */
        synchronized void m29703f(AbstractC9151c abstractC9151c) {
            AbstractC9152d mo29412e = abstractC9151c.mo29412e();
            if (mo29412e == null || !mo29412e.mo29431u()) {
                f35430c.mo32179h("Service Resolved called for an unresolved event: " + abstractC9151c);
            } else {
                String str = abstractC9151c.mo29413f() + "." + abstractC9151c.mo29414g();
                AbstractC9152d abstractC9152d = this.f35431d.get(str);
                if (m29700c(mo29412e, abstractC9152d)) {
                    f35430c.mo32174c("Service Resolved called for a service already resolved: " + abstractC9151c);
                } else if (abstractC9152d == null) {
                    if (this.f35431d.putIfAbsent(str, mo29412e.clone()) == null) {
                        m29698a().serviceResolved(abstractC9151c);
                    }
                } else if (this.f35431d.replace(str, abstractC9152d, mo29412e.clone())) {
                    m29698a().serviceResolved(abstractC9151c);
                }
            }
        }

        @Override // p345i.p346a.p347g.C9167m
        public String toString() {
            StringBuilder sb = new StringBuilder(RecyclerView.AbstractC0599l.FLAG_MOVED);
            sb.append("[Status for ");
            sb.append(m29698a().toString());
            if (this.f35431d.isEmpty()) {
                sb.append(" no type event ");
            } else {
                sb.append(" (");
                Iterator<String> it = this.f35431d.keySet().iterator();
                while (it.hasNext()) {
                    sb.append(it.next() + ", ");
                }
                sb.append(") ");
            }
            sb.append("]");
            return sb.toString();
        }
    }

    /* compiled from: ListenerStatus.java */
    /* renamed from: i.a.g.m$b */
    public static class b extends C9167m<InterfaceC9154f> {

        /* renamed from: c */
        private static InterfaceC9699b f35432c = C9700c.m32189i(b.class.getName());

        /* renamed from: d */
        private final ConcurrentMap<String, String> f35433d;

        /* renamed from: c */
        void m29704c(AbstractC9151c abstractC9151c) {
            if (this.f35433d.putIfAbsent(abstractC9151c.mo29414g(), abstractC9151c.mo29414g()) == null) {
                m29698a().m29435b(abstractC9151c);
                return;
            }
            f35432c.mo32180i("Service Type Added called for a service type already added: " + abstractC9151c);
        }

        /* renamed from: d */
        void m29705d(AbstractC9151c abstractC9151c) {
            if (this.f35433d.putIfAbsent(abstractC9151c.mo29414g(), abstractC9151c.mo29414g()) == null) {
                m29698a().m29434a(abstractC9151c);
                return;
            }
            f35432c.mo32180i("Service Sub Type Added called for a service sub type already added: " + abstractC9151c);
        }

        @Override // p345i.p346a.p347g.C9167m
        public String toString() {
            StringBuilder sb = new StringBuilder(RecyclerView.AbstractC0599l.FLAG_MOVED);
            sb.append("[Status for ");
            sb.append(m29698a().toString());
            if (this.f35433d.isEmpty()) {
                sb.append(" no type event ");
            } else {
                sb.append(" (");
                Iterator<String> it = this.f35433d.keySet().iterator();
                while (it.hasNext()) {
                    sb.append(it.next() + ", ");
                }
                sb.append(") ");
            }
            sb.append("]");
            return sb.toString();
        }
    }

    public C9167m(T t, boolean z) {
        this.f35428a = t;
        this.f35429b = z;
    }

    /* renamed from: a */
    public T m29698a() {
        return this.f35428a;
    }

    /* renamed from: b */
    public boolean m29699b() {
        return this.f35429b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C9167m) && m29698a().equals(((C9167m) obj).m29698a());
    }

    public int hashCode() {
        return m29698a().hashCode();
    }

    public String toString() {
        return "[Status for " + m29698a().toString() + "]";
    }
}
