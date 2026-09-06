package p241e.p307h.p308a;

import android.content.Context;
import com.liulishuo.filedownloader.services.C8670c;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import p241e.p307h.p308a.InterfaceC8958a;
import p241e.p307h.p308a.p311g0.C8980c;
import p241e.p307h.p308a.p315k0.C9000c;
import p241e.p307h.p308a.p315k0.C9001d;
import p241e.p307h.p308a.p315k0.C9003f;

/* compiled from: FileDownloader.java */
/* renamed from: e.h.a.q */
/* loaded from: classes2.dex */
public class C9009q {

    /* renamed from: a */
    private static final Object f34848a = new Object();

    /* renamed from: b */
    private static final Object f34849b = new Object();

    /* renamed from: c */
    private InterfaceC9015w f34850c;

    /* renamed from: d */
    private InterfaceC9014v f34851d;

    /* compiled from: FileDownloader.java */
    /* renamed from: e.h.a.q$a */
    private static final class a {

        /* renamed from: a */
        private static final C9009q f34852a = new C9009q();
    }

    /* renamed from: e */
    public static C9009q m29052e() {
        return a.f34852a;
    }

    /* renamed from: h */
    public static void m29053h(Context context, C8670c.a aVar) {
        if (C9001d.f34819a) {
            C9001d.m28962a(C9009q.class, "init Downloader with params: %s %s", context, aVar);
        }
        if (context == null) {
            throw new IllegalArgumentException("the provided context must not be null!");
        }
        C9000c.m28957b(context.getApplicationContext());
        C8980c.m28789j().m28800o(aVar);
    }

    /* renamed from: a */
    public void m29054a(AbstractC8966e abstractC8966e) {
        C8971f.m28724e().m28905a("event.service.connect.changed", abstractC8966e);
    }

    /* renamed from: b */
    public void m29055b() {
        if (m29060i()) {
            return;
        }
        C9005m.m29029b().mo27610u0(C9000c.m28956a());
    }

    /* renamed from: c */
    public boolean m29056c(int i2, String str) {
        m29061j(i2);
        if (!C9005m.m29029b().mo29033o0(i2)) {
            return false;
        }
        File file = new File(C9003f.m28976C(str));
        if (file.exists()) {
            file.delete();
        }
        File file2 = new File(str);
        if (!file2.exists()) {
            return true;
        }
        file2.delete();
        return true;
    }

    /* renamed from: d */
    public InterfaceC8958a m29057d(String str) {
        return new C8962c(str);
    }

    /* renamed from: f */
    InterfaceC9014v m29058f() {
        if (this.f34851d == null) {
            synchronized (f34849b) {
                if (this.f34851d == null) {
                    C9018z c9018z = new C9018z();
                    this.f34851d = c9018z;
                    m29054a(c9018z);
                }
            }
        }
        return this.f34851d;
    }

    /* renamed from: g */
    InterfaceC9015w m29059g() {
        if (this.f34850c == null) {
            synchronized (f34848a) {
                if (this.f34850c == null) {
                    this.f34850c = new C8963c0();
                }
            }
        }
        return this.f34850c;
    }

    /* renamed from: i */
    public boolean m29060i() {
        return C9005m.m29029b().isConnected();
    }

    /* renamed from: j */
    public int m29061j(int i2) {
        List<InterfaceC8958a.b> m28898h = C8986h.m28890i().m28898h(i2);
        if (m28898h == null || m28898h.isEmpty()) {
            C9001d.m28970i(this, "request pause but not exist %d", Integer.valueOf(i2));
            return 0;
        }
        Iterator<InterfaceC8958a.b> it = m28898h.iterator();
        while (it.hasNext()) {
            it.next().mo28649v().pause();
        }
        return m28898h.size();
    }

    /* renamed from: k */
    public void m29062k(AbstractC8991i abstractC8991i) {
        C9008p.m29041c().m29042a(abstractC8991i);
        Iterator<InterfaceC8958a.b> it = C8986h.m28890i().m28894d(abstractC8991i).iterator();
        while (it.hasNext()) {
            it.next().mo28649v().pause();
        }
    }

    /* renamed from: l */
    public int m29063l(int i2, AbstractC8991i abstractC8991i) {
        InterfaceC8958a.b m28897g = C8986h.m28890i().m28897g(i2);
        if (m28897g == null) {
            return 0;
        }
        m28897g.mo28649v().mo28619W(abstractC8991i);
        return m28897g.mo28649v().getId();
    }

    /* renamed from: m */
    public boolean m29064m(AbstractC8991i abstractC8991i, boolean z) {
        if (abstractC8991i != null) {
            return z ? m29059g().mo28687e(abstractC8991i) : m29059g().mo28685c(abstractC8991i);
        }
        C9001d.m28970i(this, "Tasks with the listener can't start, because the listener provided is null: [null, %B]", Boolean.valueOf(z));
        return false;
    }

    /* renamed from: n */
    public void m29065n(boolean z) {
        C9005m.m29029b().mo29034t0(z);
    }
}
