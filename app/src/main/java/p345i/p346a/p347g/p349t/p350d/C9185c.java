package p345i.p346a.p347g.p349t.p350d;

import java.io.IOException;
import okhttp3.HttpUrl;
import p345i.p346a.AbstractC9152d;
import p345i.p346a.p347g.AbstractC9162h;
import p345i.p346a.p347g.C9160f;
import p345i.p346a.p347g.C9161g;
import p345i.p346a.p347g.C9166l;
import p345i.p346a.p347g.p348s.EnumC9176d;
import p345i.p346a.p347g.p348s.EnumC9177e;

/* compiled from: ServiceResolver.java */
/* renamed from: i.a.g.t.d.c */
/* loaded from: classes2.dex */
public class C9185c extends AbstractC9183a {

    /* renamed from: i */
    private final String f35606i;

    public C9185c(C9166l c9166l, String str) {
        super(c9166l);
        this.f35606i = str;
    }

    @Override // p345i.p346a.p347g.p349t.AbstractC9180a
    /* renamed from: f */
    public String mo29772f() {
        StringBuilder sb = new StringBuilder();
        sb.append("ServiceResolver(");
        sb.append(m29771e() != null ? m29771e().m29676p0() : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append(")");
        return sb.toString();
    }

    @Override // p345i.p346a.p347g.p349t.p350d.AbstractC9183a
    /* renamed from: g */
    protected C9160f mo29775g(C9160f c9160f) throws IOException {
        long currentTimeMillis = System.currentTimeMillis();
        for (AbstractC9152d abstractC9152d : m29771e().m29687y0().values()) {
            c9160f = m29768b(c9160f, new AbstractC9162h.e(abstractC9152d.mo29429s(), EnumC9176d.CLASS_IN, false, 3600, abstractC9152d.mo29425o()), currentTimeMillis);
        }
        return c9160f;
    }

    @Override // p345i.p346a.p347g.p349t.p350d.AbstractC9183a
    /* renamed from: h */
    protected C9160f mo29776h(C9160f c9160f) throws IOException {
        return m29770d(c9160f, C9161g.m29525C(this.f35606i, EnumC9177e.TYPE_PTR, EnumC9176d.CLASS_IN, false));
    }

    @Override // p345i.p346a.p347g.p349t.p350d.AbstractC9183a
    /* renamed from: i */
    protected String mo29777i() {
        return "querying service";
    }
}
