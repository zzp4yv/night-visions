package p345i.p346a.p347g.p349t.p351e;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p345i.p346a.AbstractC9152d;
import p345i.p346a.p347g.C9160f;
import p345i.p346a.p347g.C9166l;
import p345i.p346a.p347g.C9171q;
import p345i.p346a.p347g.InterfaceC9163i;
import p345i.p346a.p347g.p348s.EnumC9179g;
import p345i.p346a.p347g.p349t.AbstractC9180a;
import p355k.p357b.C9700c;
import p355k.p357b.InterfaceC9699b;

/* compiled from: DNSStateTask.java */
/* renamed from: i.a.g.t.e.c */
/* loaded from: classes2.dex */
public abstract class AbstractC9188c extends AbstractC9180a {

    /* renamed from: g */
    static InterfaceC9699b f35609g = C9700c.m32189i(AbstractC9188c.class.getName());

    /* renamed from: h */
    private static int f35610h = 3600;

    /* renamed from: i */
    private final int f35611i;

    /* renamed from: j */
    private EnumC9179g f35612j;

    public AbstractC9188c(C9166l c9166l, int i2) {
        super(c9166l);
        this.f35612j = null;
        this.f35611i = i2;
    }

    /* renamed from: n */
    public static int m29788n() {
        return f35610h;
    }

    /* renamed from: g */
    protected void m29789g(List<InterfaceC9163i> list) {
        if (list != null) {
            for (InterfaceC9163i interfaceC9163i : list) {
                synchronized (interfaceC9163i) {
                    interfaceC9163i.mo29559d(this);
                }
            }
        }
    }

    /* renamed from: h */
    protected abstract void mo29779h();

    /* renamed from: i */
    protected void m29790i(EnumC9179g enumC9179g) {
        synchronized (m29771e()) {
            m29771e().m29651K(this, enumC9179g);
        }
        Iterator<AbstractC9152d> it = m29771e().m29687y0().values().iterator();
        while (it.hasNext()) {
            ((C9171q) it.next()).m29723E(this, enumC9179g);
        }
    }

    /* renamed from: j */
    protected abstract C9160f mo29780j(C9160f c9160f) throws IOException;

    /* renamed from: k */
    protected abstract C9160f mo29781k(C9171q c9171q, C9160f c9160f) throws IOException;

    /* renamed from: l */
    protected abstract boolean mo29782l();

    /* renamed from: m */
    protected abstract C9160f mo29783m();

    /* renamed from: o */
    public int m29791o() {
        return this.f35611i;
    }

    /* renamed from: p */
    public abstract String mo29784p();

    /* renamed from: q */
    protected EnumC9179g m29792q() {
        return this.f35612j;
    }

    /* renamed from: r */
    protected abstract void mo29785r(Throwable th);

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        C9160f mo29783m = mo29783m();
        try {
        } catch (Throwable th) {
            f35609g.mo32177f(mo29772f() + ".run() exception ", th);
            mo29785r(th);
        }
        if (!mo29782l()) {
            cancel();
            return;
        }
        List<InterfaceC9163i> arrayList = new ArrayList<>();
        synchronized (m29771e()) {
            if (m29771e().m29659T0(this, m29792q())) {
                f35609g.mo32174c(mo29772f() + ".run() JmDNS " + mo29784p() + " " + m29771e().m29676p0());
                arrayList.add(m29771e());
                mo29783m = mo29780j(mo29783m);
            }
        }
        Iterator<AbstractC9152d> it = m29771e().m29687y0().values().iterator();
        while (it.hasNext()) {
            C9171q c9171q = (C9171q) it.next();
            synchronized (c9171q) {
                if (c9171q.m29733S(this, m29792q())) {
                    f35609g.mo32174c(mo29772f() + ".run() JmDNS " + mo29784p() + " " + c9171q.mo29425o());
                    arrayList.add(c9171q);
                    mo29783m = mo29781k(c9171q, mo29783m);
                }
            }
        }
        if (mo29783m.m29497n()) {
            m29789g(arrayList);
            cancel();
            return;
        }
        f35609g.mo32174c(mo29772f() + ".run() JmDNS " + mo29784p() + " #" + m29792q());
        m29771e().m29686x1(mo29783m);
        m29789g(arrayList);
        mo29779h();
    }

    /* renamed from: s */
    protected void m29793s() {
        synchronized (m29771e()) {
            m29771e().m29677q1(this);
        }
        Iterator<AbstractC9152d> it = m29771e().m29687y0().values().iterator();
        while (it.hasNext()) {
            ((C9171q) it.next()).m29738Z(this);
        }
    }

    /* renamed from: t */
    protected void m29794t(EnumC9179g enumC9179g) {
        this.f35612j = enumC9179g;
    }
}
