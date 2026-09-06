package p345i.p346a.p347g.p349t.p351e;

import java.io.IOException;
import java.util.Iterator;
import java.util.Timer;
import okhttp3.HttpUrl;
import p345i.p346a.p347g.AbstractC9162h;
import p345i.p346a.p347g.C9160f;
import p345i.p346a.p347g.C9166l;
import p345i.p346a.p347g.C9171q;
import p345i.p346a.p347g.p348s.EnumC9176d;
import p345i.p346a.p347g.p348s.EnumC9179g;
import p355k.p357b.C9700c;
import p355k.p357b.InterfaceC9699b;

/* compiled from: Announcer.java */
/* renamed from: i.a.g.t.e.a */
/* loaded from: classes2.dex */
public class C9186a extends AbstractC9188c {

    /* renamed from: k */
    static InterfaceC9699b f35607k = C9700c.m32189i(C9186a.class.getName());

    public C9186a(C9166l c9166l) {
        super(c9166l, AbstractC9188c.m29788n());
        EnumC9179g enumC9179g = EnumC9179g.f35575i;
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
        sb.append("Announcer(");
        sb.append(m29771e() != null ? m29771e().m29676p0() : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append(")");
        return sb.toString();
    }

    @Override // p345i.p346a.p347g.p349t.p351e.AbstractC9188c
    /* renamed from: h */
    protected void mo29779h() {
        m29794t(m29792q().m29760g());
        if (m29792q().m29762q()) {
            return;
        }
        cancel();
        m29771e().mo29594x();
    }

    @Override // p345i.p346a.p347g.p349t.p351e.AbstractC9188c
    /* renamed from: j */
    protected C9160f mo29780j(C9160f c9160f) throws IOException {
        Iterator<AbstractC9162h> it = m29771e().m29674n0().m29613a(EnumC9176d.CLASS_ANY, true, m29791o()).iterator();
        while (it.hasNext()) {
            c9160f = m29767a(c9160f, null, it.next());
        }
        return c9160f;
    }

    @Override // p345i.p346a.p347g.p349t.p351e.AbstractC9188c
    /* renamed from: k */
    protected C9160f mo29781k(C9171q c9171q, C9160f c9160f) throws IOException {
        Iterator<AbstractC9162h> it = c9171q.m29722D(EnumC9176d.CLASS_ANY, true, m29791o(), m29771e().m29674n0()).iterator();
        while (it.hasNext()) {
            c9160f = m29767a(c9160f, null, it.next());
        }
        return c9160f;
    }

    @Override // p345i.p346a.p347g.p349t.p351e.AbstractC9188c
    /* renamed from: l */
    protected boolean mo29782l() {
        return (m29771e().m29662X0() || m29771e().m29660V0()) ? false : true;
    }

    @Override // p345i.p346a.p347g.p349t.p351e.AbstractC9188c
    /* renamed from: m */
    protected C9160f mo29783m() {
        return new C9160f(33792);
    }

    @Override // p345i.p346a.p347g.p349t.p351e.AbstractC9188c
    /* renamed from: p */
    public String mo29784p() {
        return "announcing";
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
    public void m29786u(Timer timer) {
        if (m29771e().m29662X0() || m29771e().m29660V0()) {
            return;
        }
        timer.schedule(this, 1000L, 1000L);
    }
}
