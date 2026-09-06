package p345i.p346a.p347g.p349t.p351e;

import cm.aptoide.p092pt.BuildConfig;
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

/* compiled from: Renewer.java */
/* renamed from: i.a.g.t.e.e */
/* loaded from: classes2.dex */
public class C9190e extends AbstractC9188c {

    /* renamed from: k */
    static InterfaceC9699b f35614k = C9700c.m32189i(C9190e.class.getName());

    public C9190e(C9166l c9166l) {
        super(c9166l, AbstractC9188c.m29788n());
        EnumC9179g enumC9179g = EnumC9179g.f35577k;
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
        sb.append("Renewer(");
        sb.append(m29771e() != null ? m29771e().m29676p0() : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append(")");
        return sb.toString();
    }

    @Override // p345i.p346a.p347g.p349t.p351e.AbstractC9188c
    /* renamed from: h */
    protected void mo29779h() {
        m29794t(m29792q().m29760g());
        if (m29792q().m29761k()) {
            return;
        }
        cancel();
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
        return "renewing";
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
    public void m29796u(Timer timer) {
        if (m29771e().m29662X0() || m29771e().m29660V0()) {
            return;
        }
        timer.schedule(this, BuildConfig.ANALYTICS_SESSION_INTERVAL_IN_MILLIS, BuildConfig.ANALYTICS_SESSION_INTERVAL_IN_MILLIS);
    }
}
