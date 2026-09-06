package p345i.p346a.p347g.p349t.p350d;

import java.io.IOException;
import java.util.Iterator;
import okhttp3.HttpUrl;
import p345i.p346a.p347g.AbstractC9156b;
import p345i.p346a.p347g.AbstractC9162h;
import p345i.p346a.p347g.C9155a;
import p345i.p346a.p347g.C9160f;
import p345i.p346a.p347g.C9161g;
import p345i.p346a.p347g.C9166l;
import p345i.p346a.p347g.C9171q;
import p345i.p346a.p347g.p348s.EnumC9176d;
import p345i.p346a.p347g.p348s.EnumC9177e;

/* compiled from: ServiceInfoResolver.java */
/* renamed from: i.a.g.t.d.b */
/* loaded from: classes2.dex */
public class C9184b extends AbstractC9183a {

    /* renamed from: i */
    private final C9171q f35605i;

    public C9184b(C9166l c9166l, C9171q c9171q) {
        super(c9166l);
        this.f35605i = c9171q;
        c9171q.m29740c0(m29771e());
        m29771e().m29649I(c9171q, C9161g.m29525C(c9171q.mo29425o(), EnumC9177e.TYPE_ANY, EnumC9176d.CLASS_IN, false));
    }

    @Override // java.util.TimerTask
    public boolean cancel() {
        boolean cancel = super.cancel();
        if (!this.f35605i.mo29433w()) {
            m29771e().m29678r1(this.f35605i);
        }
        return cancel;
    }

    @Override // p345i.p346a.p347g.p349t.AbstractC9180a
    /* renamed from: f */
    public String mo29772f() {
        StringBuilder sb = new StringBuilder();
        sb.append("ServiceInfoResolver(");
        sb.append(m29771e() != null ? m29771e().m29676p0() : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append(")");
        return sb.toString();
    }

    @Override // p345i.p346a.p347g.p349t.p350d.AbstractC9183a
    /* renamed from: g */
    protected C9160f mo29775g(C9160f c9160f) throws IOException {
        if (!this.f35605i.mo29431u()) {
            long currentTimeMillis = System.currentTimeMillis();
            C9155a m29663Z = m29771e().m29663Z();
            String mo29425o = this.f35605i.mo29425o();
            EnumC9177e enumC9177e = EnumC9177e.TYPE_SRV;
            EnumC9176d enumC9176d = EnumC9176d.CLASS_IN;
            c9160f = m29768b(m29768b(c9160f, (AbstractC9162h) m29663Z.m29439d(mo29425o, enumC9177e, enumC9176d), currentTimeMillis), (AbstractC9162h) m29771e().m29663Z().m29439d(this.f35605i.mo29425o(), EnumC9177e.TYPE_TXT, enumC9176d), currentTimeMillis);
            if (this.f35605i.mo29426p().length() > 0) {
                Iterator<? extends AbstractC9156b> it = m29771e().m29663Z().m29442h(this.f35605i.mo29426p(), EnumC9177e.TYPE_A, enumC9176d).iterator();
                while (it.hasNext()) {
                    c9160f = m29768b(c9160f, (AbstractC9162h) it.next(), currentTimeMillis);
                }
                Iterator<? extends AbstractC9156b> it2 = m29771e().m29663Z().m29442h(this.f35605i.mo29426p(), EnumC9177e.TYPE_AAAA, EnumC9176d.CLASS_IN).iterator();
                while (it2.hasNext()) {
                    c9160f = m29768b(c9160f, (AbstractC9162h) it2.next(), currentTimeMillis);
                }
            }
        }
        return c9160f;
    }

    @Override // p345i.p346a.p347g.p349t.p350d.AbstractC9183a
    /* renamed from: h */
    protected C9160f mo29776h(C9160f c9160f) throws IOException {
        if (this.f35605i.mo29431u()) {
            return c9160f;
        }
        String mo29425o = this.f35605i.mo29425o();
        EnumC9177e enumC9177e = EnumC9177e.TYPE_SRV;
        EnumC9176d enumC9176d = EnumC9176d.CLASS_IN;
        C9160f m29770d = m29770d(m29770d(c9160f, C9161g.m29525C(mo29425o, enumC9177e, enumC9176d, false)), C9161g.m29525C(this.f35605i.mo29425o(), EnumC9177e.TYPE_TXT, enumC9176d, false));
        return this.f35605i.mo29426p().length() > 0 ? m29770d(m29770d(m29770d, C9161g.m29525C(this.f35605i.mo29426p(), EnumC9177e.TYPE_A, enumC9176d, false)), C9161g.m29525C(this.f35605i.mo29426p(), EnumC9177e.TYPE_AAAA, enumC9176d, false)) : m29770d;
    }

    @Override // p345i.p346a.p347g.p349t.p350d.AbstractC9183a
    /* renamed from: i */
    protected String mo29777i() {
        StringBuilder sb = new StringBuilder();
        sb.append("querying service info: ");
        C9171q c9171q = this.f35605i;
        sb.append(c9171q != null ? c9171q.mo29425o() : "null");
        return sb.toString();
    }
}
