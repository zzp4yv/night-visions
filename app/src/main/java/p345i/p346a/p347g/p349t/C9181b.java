package p345i.p346a.p347g.p349t;

import java.util.Timer;
import okhttp3.HttpUrl;
import p345i.p346a.p347g.C9166l;
import p355k.p357b.C9700c;
import p355k.p357b.InterfaceC9699b;

/* compiled from: RecordReaper.java */
/* renamed from: i.a.g.t.b */
/* loaded from: classes2.dex */
public class C9181b extends AbstractC9180a {

    /* renamed from: g */
    static InterfaceC9699b f35597g = C9700c.m32189i(C9181b.class.getName());

    public C9181b(C9166l c9166l) {
        super(c9166l);
    }

    @Override // p345i.p346a.p347g.p349t.AbstractC9180a
    /* renamed from: f */
    public String mo29772f() {
        StringBuilder sb = new StringBuilder();
        sb.append("RecordReaper(");
        sb.append(m29771e() != null ? m29771e().m29676p0() : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: g */
    public void m29773g(Timer timer) {
        if (m29771e().m29662X0() || m29771e().m29660V0()) {
            return;
        }
        timer.schedule(this, 10000L, 10000L);
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        if (m29771e().m29662X0() || m29771e().m29660V0()) {
            return;
        }
        if (f35597g.mo32175d()) {
            f35597g.mo32180i(mo29772f() + ".run() JmDNS reaping cache");
        }
        m29771e().m29656Q();
    }
}
