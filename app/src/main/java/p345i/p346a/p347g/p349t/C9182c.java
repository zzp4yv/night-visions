package p345i.p346a.p347g.p349t;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.HashSet;
import java.util.Set;
import java.util.Timer;
import okhttp3.HttpUrl;
import p345i.p346a.p347g.AbstractC9162h;
import p345i.p346a.p347g.C9157c;
import p345i.p346a.p347g.C9160f;
import p345i.p346a.p347g.C9161g;
import p345i.p346a.p347g.C9166l;
import p345i.p346a.p347g.p348s.C9173a;
import p355k.p357b.C9700c;
import p355k.p357b.InterfaceC9699b;

/* compiled from: Responder.java */
/* renamed from: i.a.g.t.c */
/* loaded from: classes2.dex */
public class C9182c extends AbstractC9180a {

    /* renamed from: g */
    static InterfaceC9699b f35598g = C9700c.m32189i(C9182c.class.getName());

    /* renamed from: h */
    private final C9157c f35599h;

    /* renamed from: i */
    private final InetAddress f35600i;

    /* renamed from: j */
    private final int f35601j;

    /* renamed from: k */
    private final boolean f35602k;

    public C9182c(C9166l c9166l, C9157c c9157c, InetAddress inetAddress, int i2) {
        super(c9166l);
        this.f35599h = c9157c;
        this.f35600i = inetAddress;
        this.f35601j = i2;
        this.f35602k = i2 != C9173a.f35467a;
    }

    @Override // p345i.p346a.p347g.p349t.AbstractC9180a
    /* renamed from: f */
    public String mo29772f() {
        StringBuilder sb = new StringBuilder();
        sb.append("Responder(");
        sb.append(m29771e() != null ? m29771e().m29676p0() : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: g */
    public void m29774g(Timer timer) {
        boolean z = true;
        for (C9161g c9161g : this.f35599h.m29495l()) {
            if (f35598g.mo32175d()) {
                f35598g.mo32180i(mo29772f() + "start() question=" + c9161g);
            }
            z = c9161g.mo29527B(m29771e());
            if (!z) {
                break;
            }
        }
        int nextInt = (!z || this.f35599h.m29501r()) ? (C9166l.m29641q0().nextInt(96) + 20) - this.f35599h.m29472A() : 0;
        int i2 = nextInt >= 0 ? nextInt : 0;
        if (f35598g.mo32175d()) {
            f35598g.mo32180i(mo29772f() + "start() Responder chosen delay=" + i2);
        }
        if (m29771e().m29662X0() || m29771e().m29660V0()) {
            return;
        }
        timer.schedule(this, i2);
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        m29771e().m29683v1(this.f35599h);
        HashSet<C9161g> hashSet = new HashSet();
        Set<AbstractC9162h> hashSet2 = new HashSet<>();
        if (m29771e().m29658R0()) {
            try {
                for (C9161g c9161g : this.f35599h.m29495l()) {
                    if (f35598g.mo32173b()) {
                        f35598g.mo32174c(mo29772f() + "run() JmDNS responding to: " + c9161g);
                    }
                    if (this.f35602k) {
                        hashSet.add(c9161g);
                    }
                    c9161g.mo29528y(m29771e(), hashSet2);
                }
                long currentTimeMillis = System.currentTimeMillis();
                for (AbstractC9162h abstractC9162h : this.f35599h.m29486c()) {
                    if (abstractC9162h.m29539J(currentTimeMillis)) {
                        hashSet2.remove(abstractC9162h);
                        if (f35598g.mo32173b()) {
                            f35598g.mo32174c(mo29772f() + "JmDNS Responder Known Answer Removed");
                        }
                    }
                }
                if (hashSet2.isEmpty()) {
                    return;
                }
                if (f35598g.mo32173b()) {
                    f35598g.mo32174c(mo29772f() + "run() JmDNS responding");
                }
                C9160f c9160f = new C9160f(33792, !this.f35602k, this.f35599h.m29473B());
                if (this.f35602k) {
                    c9160f.m29512F(new InetSocketAddress(this.f35600i, this.f35601j));
                }
                c9160f.m29506w(this.f35599h.m29489f());
                for (C9161g c9161g2 : hashSet) {
                    if (c9161g2 != null) {
                        c9160f = m29770d(c9160f, c9161g2);
                    }
                }
                for (AbstractC9162h abstractC9162h2 : hashSet2) {
                    if (abstractC9162h2 != null) {
                        c9160f = m29767a(c9160f, this.f35599h, abstractC9162h2);
                    }
                }
                if (c9160f.m29497n()) {
                    return;
                }
                m29771e().m29686x1(c9160f);
            } catch (Throwable th) {
                f35598g.mo32177f(mo29772f() + "run() exception ", th);
                m29771e().close();
            }
        }
    }

    @Override // p345i.p346a.p347g.p349t.AbstractC9180a
    public String toString() {
        return super.toString() + " incomming: " + this.f35599h;
    }
}
