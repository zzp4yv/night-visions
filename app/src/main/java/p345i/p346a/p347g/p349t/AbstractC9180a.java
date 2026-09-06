package p345i.p346a.p347g.p349t;

import com.google.android.gms.ads.AdRequest;
import java.io.IOException;
import java.util.TimerTask;
import p345i.p346a.p347g.AbstractC9162h;
import p345i.p346a.p347g.C9157c;
import p345i.p346a.p347g.C9160f;
import p345i.p346a.p347g.C9161g;
import p345i.p346a.p347g.C9166l;

/* compiled from: DNSTask.java */
/* renamed from: i.a.g.t.a */
/* loaded from: classes2.dex */
public abstract class AbstractC9180a extends TimerTask {

    /* renamed from: f */
    private final C9166l f35596f;

    protected AbstractC9180a(C9166l c9166l) {
        this.f35596f = c9166l;
    }

    /* renamed from: a */
    public C9160f m29767a(C9160f c9160f, C9157c c9157c, AbstractC9162h abstractC9162h) throws IOException {
        try {
            c9160f.m29513x(c9157c, abstractC9162h);
            return c9160f;
        } catch (IOException unused) {
            int m29488e = c9160f.m29488e();
            boolean m29498o = c9160f.m29498o();
            int m29511E = c9160f.m29511E();
            int m29489f = c9160f.m29489f();
            c9160f.m29505v(m29488e | AdRequest.MAX_CONTENT_URL_LENGTH);
            c9160f.m29506w(m29489f);
            this.f35596f.m29686x1(c9160f);
            C9160f c9160f2 = new C9160f(m29488e, m29498o, m29511E);
            c9160f2.m29513x(c9157c, abstractC9162h);
            return c9160f2;
        }
    }

    /* renamed from: b */
    public C9160f m29768b(C9160f c9160f, AbstractC9162h abstractC9162h, long j2) throws IOException {
        try {
            c9160f.m29514y(abstractC9162h, j2);
            return c9160f;
        } catch (IOException unused) {
            int m29488e = c9160f.m29488e();
            boolean m29498o = c9160f.m29498o();
            int m29511E = c9160f.m29511E();
            int m29489f = c9160f.m29489f();
            c9160f.m29505v(m29488e | AdRequest.MAX_CONTENT_URL_LENGTH);
            c9160f.m29506w(m29489f);
            this.f35596f.m29686x1(c9160f);
            C9160f c9160f2 = new C9160f(m29488e, m29498o, m29511E);
            c9160f2.m29514y(abstractC9162h, j2);
            return c9160f2;
        }
    }

    /* renamed from: c */
    public C9160f m29769c(C9160f c9160f, AbstractC9162h abstractC9162h) throws IOException {
        try {
            c9160f.m29515z(abstractC9162h);
            return c9160f;
        } catch (IOException unused) {
            int m29488e = c9160f.m29488e();
            boolean m29498o = c9160f.m29498o();
            int m29511E = c9160f.m29511E();
            int m29489f = c9160f.m29489f();
            c9160f.m29505v(m29488e | AdRequest.MAX_CONTENT_URL_LENGTH);
            c9160f.m29506w(m29489f);
            this.f35596f.m29686x1(c9160f);
            C9160f c9160f2 = new C9160f(m29488e, m29498o, m29511E);
            c9160f2.m29515z(abstractC9162h);
            return c9160f2;
        }
    }

    /* renamed from: d */
    public C9160f m29770d(C9160f c9160f, C9161g c9161g) throws IOException {
        try {
            c9160f.m29507A(c9161g);
            return c9160f;
        } catch (IOException unused) {
            int m29488e = c9160f.m29488e();
            boolean m29498o = c9160f.m29498o();
            int m29511E = c9160f.m29511E();
            int m29489f = c9160f.m29489f();
            c9160f.m29505v(m29488e | AdRequest.MAX_CONTENT_URL_LENGTH);
            c9160f.m29506w(m29489f);
            this.f35596f.m29686x1(c9160f);
            C9160f c9160f2 = new C9160f(m29488e, m29498o, m29511E);
            c9160f2.m29507A(c9161g);
            return c9160f2;
        }
    }

    /* renamed from: e */
    public C9166l m29771e() {
        return this.f35596f;
    }

    /* renamed from: f */
    public abstract String mo29772f();

    public String toString() {
        return mo29772f();
    }
}
