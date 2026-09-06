package p241e.p307h.p308a.p311g0;

import android.os.Process;
import com.liulishuo.filedownloader.exception.FileDownloadGiveUpRetryException;
import com.liulishuo.filedownloader.model.C8666a;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.io.IOException;
import java.net.SocketException;
import p241e.p307h.p308a.p309e0.InterfaceC8968b;
import p241e.p307h.p308a.p310f0.InterfaceC8972a;
import p241e.p307h.p308a.p311g0.C8978a;
import p241e.p307h.p308a.p311g0.C8984g;
import p241e.p307h.p308a.p315k0.C9001d;
import p241e.p307h.p308a.p315k0.C9003f;

/* compiled from: DownloadRunnable.java */
/* renamed from: e.h.a.g0.e */
/* loaded from: classes2.dex */
public class RunnableC8982e implements Runnable {

    /* renamed from: f */
    private final C8978a f34726f;

    /* renamed from: g */
    private final InterfaceC8985h f34727g;

    /* renamed from: h */
    private final String f34728h;

    /* renamed from: i */
    private final boolean f34729i;

    /* renamed from: j */
    private C8984g f34730j;

    /* renamed from: k */
    private volatile boolean f34731k;

    /* renamed from: l */
    private final int f34732l;

    /* renamed from: m */
    final int f34733m;

    /* compiled from: DownloadRunnable.java */
    /* renamed from: e.h.a.g0.e$b */
    public static class b {

        /* renamed from: a */
        private final C8978a.b f34734a = new C8978a.b();

        /* renamed from: b */
        private InterfaceC8985h f34735b;

        /* renamed from: c */
        private String f34736c;

        /* renamed from: d */
        private Boolean f34737d;

        /* renamed from: e */
        private Integer f34738e;

        /* renamed from: a */
        public RunnableC8982e m28837a() {
            if (this.f34735b == null || this.f34736c == null || this.f34737d == null || this.f34738e == null) {
                throw new IllegalArgumentException(C9003f.m29009o("%s %s %B", this.f34735b, this.f34736c, this.f34737d));
            }
            C8978a m28774a = this.f34734a.m28774a();
            return new RunnableC8982e(m28774a.f34662a, this.f34738e.intValue(), m28774a, this.f34735b, this.f34737d.booleanValue(), this.f34736c);
        }

        /* renamed from: b */
        public b m28838b(InterfaceC8985h interfaceC8985h) {
            this.f34735b = interfaceC8985h;
            return this;
        }

        /* renamed from: c */
        public b m28839c(Integer num) {
            this.f34738e = num;
            return this;
        }

        /* renamed from: d */
        public b m28840d(C8979b c8979b) {
            this.f34734a.m28775b(c8979b);
            return this;
        }

        /* renamed from: e */
        public b m28841e(String str) {
            this.f34734a.m28777d(str);
            return this;
        }

        /* renamed from: f */
        public b m28842f(FileDownloadHeader fileDownloadHeader) {
            this.f34734a.m28778e(fileDownloadHeader);
            return this;
        }

        /* renamed from: g */
        public b m28843g(int i2) {
            this.f34734a.m28776c(i2);
            return this;
        }

        /* renamed from: h */
        public b m28844h(String str) {
            this.f34736c = str;
            return this;
        }

        /* renamed from: i */
        public b m28845i(String str) {
            this.f34734a.m28779f(str);
            return this;
        }

        /* renamed from: j */
        public b m28846j(boolean z) {
            this.f34737d = Boolean.valueOf(z);
            return this;
        }
    }

    /* renamed from: b */
    private long m28834b() {
        InterfaceC8972a m28795f = C8980c.m28789j().m28795f();
        if (this.f34733m < 0) {
            FileDownloadModel mo28740o = m28795f.mo28740o(this.f34732l);
            if (mo28740o != null) {
                return mo28740o.m27563g();
            }
            return 0L;
        }
        for (C8666a c8666a : m28795f.mo28739n(this.f34732l)) {
            if (c8666a.m27589d() == this.f34733m) {
                return c8666a.m27586a();
            }
        }
        return 0L;
    }

    /* renamed from: a */
    public void m28835a() {
        m28836c();
    }

    /* renamed from: c */
    public void m28836c() {
        this.f34731k = true;
        C8984g c8984g = this.f34730j;
        if (c8984g != null) {
            c8984g.m28879b();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        Exception e2;
        C8984g.b bVar;
        Process.setThreadPriority(10);
        long j2 = this.f34726f.m28770f().f34675b;
        InterfaceC8968b interfaceC8968b = null;
        boolean z2 = false;
        while (!this.f34731k) {
            try {
                try {
                    interfaceC8968b = this.f34726f.m28768c();
                    int mo27913d = interfaceC8968b.mo27913d();
                    if (C9001d.f34819a) {
                        C9001d.m28962a(this, "the connection[%d] for %d, is connected %s with code[%d]", Integer.valueOf(this.f34733m), Integer.valueOf(this.f34732l), this.f34726f.m28770f(), Integer.valueOf(mo27913d));
                    }
                    if (mo27913d != 206 && mo27913d != 200) {
                        throw new SocketException(C9003f.m29009o("Connection failed with request[%s] response[%s] http-state[%d] on task[%d-%d], which is changed after verify connection, so please try again.", this.f34726f.m28771g(), interfaceC8968b.mo27911b(), Integer.valueOf(mo27913d), Integer.valueOf(this.f34732l), Integer.valueOf(this.f34733m)));
                    }
                    try {
                        bVar = new C8984g.b();
                    } catch (FileDownloadGiveUpRetryException | IOException | IllegalAccessException | IllegalArgumentException e3) {
                        e2 = e3;
                        z = true;
                        try {
                            if (!this.f34727g.mo28817e(e2)) {
                                this.f34727g.mo28814b(e2);
                                if (interfaceC8968b == null) {
                                    return;
                                }
                            } else if (z && this.f34730j == null) {
                                C9001d.m28970i(this, "it is valid to retry and connection is valid but create fetch-data-task failed, so give up directly with %s", e2);
                                this.f34727g.mo28814b(e2);
                                if (interfaceC8968b == null) {
                                    return;
                                }
                            } else {
                                if (this.f34730j != null) {
                                    long m28834b = m28834b();
                                    if (m28834b > 0) {
                                        this.f34726f.m28773i(m28834b);
                                    }
                                }
                                this.f34727g.mo28815c(e2);
                                if (interfaceC8968b != null) {
                                    interfaceC8968b.mo27916g();
                                }
                                z2 = z;
                            }
                            return;
                        } finally {
                            if (interfaceC8968b != null) {
                                interfaceC8968b.mo27916g();
                            }
                        }
                    }
                } catch (FileDownloadGiveUpRetryException | IOException | IllegalAccessException | IllegalArgumentException e4) {
                    e2 = e4;
                    z = false;
                }
            } catch (FileDownloadGiveUpRetryException | IOException | IllegalAccessException | IllegalArgumentException e5) {
                z = z2;
                e2 = e5;
            }
            if (this.f34731k) {
                interfaceC8968b.mo27916g();
                return;
            }
            C8984g m28881a = bVar.m28886f(this.f34732l).m28884d(this.f34733m).m28882b(this.f34727g).m28887g(this).m28889i(this.f34729i).m28883c(interfaceC8968b).m28885e(this.f34726f.m28770f()).m28888h(this.f34728h).m28881a();
            this.f34730j = m28881a;
            m28881a.m28880c();
            if (this.f34731k) {
                this.f34730j.m28879b();
            }
            return;
        }
        if (interfaceC8968b != null) {
            interfaceC8968b.mo27916g();
        }
    }

    private RunnableC8982e(int i2, int i3, C8978a c8978a, InterfaceC8985h interfaceC8985h, boolean z, String str) {
        this.f34732l = i2;
        this.f34733m = i3;
        this.f34731k = false;
        this.f34727g = interfaceC8985h;
        this.f34728h = str;
        this.f34726f = c8978a;
        this.f34729i = z;
    }
}
