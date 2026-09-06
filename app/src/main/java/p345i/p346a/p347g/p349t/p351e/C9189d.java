package p345i.p346a.p347g.p349t.p351e;

import java.io.IOException;
import java.util.Iterator;
import java.util.Timer;
import okhttp3.HttpUrl;
import p345i.p346a.p347g.AbstractC9162h;
import p345i.p346a.p347g.C9160f;
import p345i.p346a.p347g.C9161g;
import p345i.p346a.p347g.C9166l;
import p345i.p346a.p347g.C9171q;
import p345i.p346a.p347g.p348s.EnumC9176d;
import p345i.p346a.p347g.p348s.EnumC9177e;
import p345i.p346a.p347g.p348s.EnumC9179g;
import p355k.p357b.C9700c;
import p355k.p357b.InterfaceC9699b;

/* compiled from: Prober.java */
/* renamed from: i.a.g.t.e.d */
/* loaded from: classes2.dex */
public class C9189d extends AbstractC9188c {

    /* renamed from: k */
    static InterfaceC9699b f35613k = C9700c.m32189i(C9189d.class.getName());

    public C9189d(C9166l c9166l) {
        super(c9166l, AbstractC9188c.m29788n());
        EnumC9179g enumC9179g = EnumC9179g.f35572f;
        m29794t(enumC9179g);
        m29790i(enumC9179g);
    }

    @Override // java.util.TimerTask
    public boolean cancel() {
        m29793s();
        return super.cancel();
    }

    @Override // p345i.p346a.p347g.p349t.AbstractC9180a
    /* renamed from: f */
    public String mo29772f() {
        StringBuilder sb = new StringBuilder();
        sb.append("Prober(");
        sb.append(m29771e() != null ? m29771e().m29676p0() : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append(")");
        return sb.toString();
    }

    @Override // p345i.p346a.p347g.p349t.p351e.AbstractC9188c
    /* renamed from: h */
    protected void mo29779h() {
        m29794t(m29792q().m29760g());
        if (m29792q().m29758A()) {
            return;
        }
        cancel();
        m29771e().mo29591l();
    }

    @Override // p345i.p346a.p347g.p349t.p351e.AbstractC9188c
    /* renamed from: j */
    protected C9160f mo29780j(C9160f c9160f) throws IOException {
        c9160f.m29507A(C9161g.m29525C(m29771e().m29674n0().m29624q(), EnumC9177e.TYPE_ANY, EnumC9176d.CLASS_IN, false));
        Iterator<AbstractC9162h> it = m29771e().m29674n0().m29613a(EnumC9176d.CLASS_ANY, false, m29791o()).iterator();
        while (it.hasNext()) {
            c9160f = m29769c(c9160f, it.next());
        }
        return c9160f;
    }

    @Override // p345i.p346a.p347g.p349t.p351e.AbstractC9188c
    /* renamed from: k */
    protected C9160f mo29781k(C9171q c9171q, C9160f c9160f) throws IOException {
        String mo29425o = c9171q.mo29425o();
        EnumC9177e enumC9177e = EnumC9177e.TYPE_ANY;
        EnumC9176d enumC9176d = EnumC9176d.CLASS_IN;
        return m29769c(m29770d(c9160f, C9161g.m29525C(mo29425o, enumC9177e, enumC9176d, false)), new AbstractC9162h.f(c9171q.mo29425o(), enumC9176d, false, m29791o(), c9171q.mo29423m(), c9171q.mo29430t(), c9171q.mo29422l(), m29771e().m29674n0().m29624q()));
    }

    @Override // p345i.p346a.p347g.p349t.p351e.AbstractC9188c
    /* renamed from: l */
    protected boolean mo29782l() {
        return (m29771e().m29662X0() || m29771e().m29660V0()) ? false : true;
    }

    @Override // p345i.p346a.p347g.p349t.p351e.AbstractC9188c
    /* renamed from: m */
    protected C9160f mo29783m() {
        return new C9160f(0);
    }

    @Override // p345i.p346a.p347g.p349t.p351e.AbstractC9188c
    /* renamed from: p */
    public String mo29784p() {
        return "probing";
    }

    @Override // p345i.p346a.p347g.p349t.p351e.AbstractC9188c
    /* renamed from: r */
    protected void mo29785r(Throwable th) {
        m29771e().m29669h1();
    }

    @Override // p345i.p346a.p347g.p349t.AbstractC9180a
    public String toString() {
        return super.toString() + " state: " + m29792q();
    }

    /* renamed from: u */
    public void m29795u(Timer timer) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - m29771e().m29673m0() < 5000) {
            m29771e().m29689z1(m29771e().m29647F0() + 1);
        } else {
            m29771e().m29689z1(1);
        }
        m29771e().m29688y1(currentTimeMillis);
        if (m29771e().m29658R0() && m29771e().m29647F0() < 10) {
            timer.schedule(this, C9166l.m29641q0().nextInt(251), 250L);
        } else {
            if (m29771e().m29662X0() || m29771e().m29660V0()) {
                return;
            }
            timer.schedule(this, 1000L, 1000L);
        }
    }
}
