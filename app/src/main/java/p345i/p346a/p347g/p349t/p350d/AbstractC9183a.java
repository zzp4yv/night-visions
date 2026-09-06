package p345i.p346a.p347g.p349t.p350d;

import java.io.IOException;
import java.util.Timer;
import p345i.p346a.p347g.C9160f;
import p345i.p346a.p347g.C9166l;
import p345i.p346a.p347g.p349t.AbstractC9180a;
import p355k.p357b.C9700c;
import p355k.p357b.InterfaceC9699b;

/* compiled from: DNSResolverTask.java */
/* renamed from: i.a.g.t.d.a */
/* loaded from: classes2.dex */
public abstract class AbstractC9183a extends AbstractC9180a {

    /* renamed from: g */
    private static InterfaceC9699b f35603g = C9700c.m32189i(AbstractC9183a.class.getName());

    /* renamed from: h */
    protected int f35604h;

    public AbstractC9183a(C9166l c9166l) {
        super(c9166l);
        this.f35604h = 0;
    }

    /* renamed from: g */
    protected abstract C9160f mo29775g(C9160f c9160f) throws IOException;

    /* renamed from: h */
    protected abstract C9160f mo29776h(C9160f c9160f) throws IOException;

    /* renamed from: i */
    protected abstract String mo29777i();

    /* renamed from: j */
    public void m29778j(Timer timer) {
        if (m29771e().m29662X0() || m29771e().m29660V0()) {
            return;
        }
        timer.schedule(this, 225L, 225L);
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        try {
            if (!m29771e().m29662X0() && !m29771e().m29660V0()) {
                int i2 = this.f35604h;
                this.f35604h = i2 + 1;
                if (i2 >= 3) {
                    cancel();
                    return;
                }
                if (f35603g.mo32173b()) {
                    f35603g.mo32174c(mo29772f() + ".run() JmDNS " + mo29777i());
                }
                C9160f mo29776h = mo29776h(new C9160f(0));
                if (m29771e().m29658R0()) {
                    mo29776h = mo29775g(mo29776h);
                }
                if (mo29776h.m29497n()) {
                    return;
                }
                m29771e().m29686x1(mo29776h);
                return;
            }
            cancel();
        } catch (Throwable th) {
            f35603g.mo32177f(mo29772f() + ".run() exception ", th);
            m29771e().m29669h1();
        }
    }

    @Override // p345i.p346a.p347g.p349t.AbstractC9180a
    public String toString() {
        return super.toString() + " count: " + this.f35604h;
    }
}
