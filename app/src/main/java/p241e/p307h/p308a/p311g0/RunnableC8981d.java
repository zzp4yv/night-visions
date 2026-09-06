package p241e.p307h.p308a.p311g0;

import com.liulishuo.filedownloader.exception.FileDownloadGiveUpRetryException;
import com.liulishuo.filedownloader.exception.FileDownloadHttpException;
import com.liulishuo.filedownloader.exception.FileDownloadNetworkPolicyException;
import com.liulishuo.filedownloader.exception.FileDownloadOutOfSpaceException;
import com.liulishuo.filedownloader.exception.FileDownloadSecurityException;
import com.liulishuo.filedownloader.model.C8666a;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import p241e.p307h.p308a.InterfaceC9017y;
import p241e.p307h.p308a.p309e0.InterfaceC8968b;
import p241e.p307h.p308a.p310f0.InterfaceC8972a;
import p241e.p307h.p308a.p311g0.C8978a;
import p241e.p307h.p308a.p311g0.C8979b;
import p241e.p307h.p308a.p311g0.RunnableC8982e;
import p241e.p307h.p308a.p314j0.InterfaceC8995a;
import p241e.p307h.p308a.p315k0.C8999b;
import p241e.p307h.p308a.p315k0.C9000c;
import p241e.p307h.p308a.p315k0.C9001d;
import p241e.p307h.p308a.p315k0.C9002e;
import p241e.p307h.p308a.p315k0.C9003f;

/* compiled from: DownloadLaunchRunnable.java */
/* renamed from: e.h.a.g0.d */
/* loaded from: classes2.dex */
public class RunnableC8981d implements Runnable, InterfaceC8985h {

    /* renamed from: f */
    private static final ThreadPoolExecutor f34688f = C8999b.m28955c("ConnectionBlock");

    /* renamed from: A */
    private volatile boolean f34689A;

    /* renamed from: B */
    private volatile Exception f34690B;

    /* renamed from: C */
    private String f34691C;

    /* renamed from: D */
    private long f34692D;

    /* renamed from: E */
    private long f34693E;

    /* renamed from: F */
    private long f34694F;

    /* renamed from: G */
    private long f34695G;

    /* renamed from: g */
    private final C8983f f34696g;

    /* renamed from: h */
    private final int f34697h;

    /* renamed from: i */
    private final FileDownloadModel f34698i;

    /* renamed from: j */
    private final FileDownloadHeader f34699j;

    /* renamed from: k */
    private final boolean f34700k;

    /* renamed from: l */
    private final boolean f34701l;

    /* renamed from: m */
    private final InterfaceC8972a f34702m;

    /* renamed from: n */
    private final InterfaceC9017y f34703n;

    /* renamed from: o */
    private boolean f34704o;

    /* renamed from: p */
    int f34705p;

    /* renamed from: q */
    private boolean f34706q;

    /* renamed from: r */
    private final boolean f34707r;

    /* renamed from: s */
    private final ArrayList<RunnableC8982e> f34708s;

    /* renamed from: t */
    private RunnableC8982e f34709t;

    /* renamed from: u */
    private boolean f34710u;

    /* renamed from: v */
    private boolean f34711v;

    /* renamed from: w */
    private boolean f34712w;

    /* renamed from: x */
    private boolean f34713x;

    /* renamed from: y */
    private final AtomicBoolean f34714y;

    /* renamed from: z */
    private volatile boolean f34715z;

    /* compiled from: DownloadLaunchRunnable.java */
    /* renamed from: e.h.a.g0.d$b */
    public static class b {

        /* renamed from: a */
        private FileDownloadModel f34716a;

        /* renamed from: b */
        private FileDownloadHeader f34717b;

        /* renamed from: c */
        private InterfaceC9017y f34718c;

        /* renamed from: d */
        private Integer f34719d;

        /* renamed from: e */
        private Integer f34720e;

        /* renamed from: f */
        private Boolean f34721f;

        /* renamed from: g */
        private Boolean f34722g;

        /* renamed from: h */
        private Integer f34723h;

        /* renamed from: a */
        public RunnableC8981d m28825a() {
            if (this.f34716a == null || this.f34718c == null || this.f34719d == null || this.f34720e == null || this.f34721f == null || this.f34722g == null || this.f34723h == null) {
                throw new IllegalArgumentException();
            }
            return new RunnableC8981d(this.f34716a, this.f34717b, this.f34718c, this.f34719d.intValue(), this.f34720e.intValue(), this.f34721f.booleanValue(), this.f34722g.booleanValue(), this.f34723h.intValue());
        }

        /* renamed from: b */
        public b m28826b(Integer num) {
            this.f34720e = num;
            return this;
        }

        /* renamed from: c */
        public b m28827c(Boolean bool) {
            this.f34721f = bool;
            return this;
        }

        /* renamed from: d */
        public b m28828d(FileDownloadHeader fileDownloadHeader) {
            this.f34717b = fileDownloadHeader;
            return this;
        }

        /* renamed from: e */
        public b m28829e(Integer num) {
            this.f34723h = num;
            return this;
        }

        /* renamed from: f */
        public b m28830f(Integer num) {
            this.f34719d = num;
            return this;
        }

        /* renamed from: g */
        public b m28831g(FileDownloadModel fileDownloadModel) {
            this.f34716a = fileDownloadModel;
            return this;
        }

        /* renamed from: h */
        public b m28832h(InterfaceC9017y interfaceC9017y) {
            this.f34718c = interfaceC9017y;
            return this;
        }

        /* renamed from: i */
        public b m28833i(Boolean bool) {
            this.f34722g = bool;
            return this;
        }
    }

    /* compiled from: DownloadLaunchRunnable.java */
    /* renamed from: e.h.a.g0.d$c */
    class c extends Throwable {
        c() {
        }
    }

    /* compiled from: DownloadLaunchRunnable.java */
    /* renamed from: e.h.a.g0.d$d */
    class d extends Throwable {
        d() {
        }
    }

    /* renamed from: g */
    private int m28802g(long j2) {
        if (m28808q()) {
            return this.f34711v ? this.f34698i.m27557a() : C8980c.m28789j().m28794c(this.f34698i.m27561e(), this.f34698i.m27568l(), this.f34698i.m27562f(), j2);
        }
        return 1;
    }

    /* renamed from: h */
    private void m28803h() throws d, c {
        int m27561e = this.f34698i.m27561e();
        if (this.f34698i.m27572p()) {
            String m27565i = this.f34698i.m27565i();
            int m29012r = C9003f.m29012r(this.f34698i.m27568l(), m27565i);
            if (C9000c.m28959d(m27561e, m27565i, this.f34700k, false)) {
                this.f34702m.remove(m27561e);
                this.f34702m.mo28733h(m27561e);
                throw new c();
            }
            FileDownloadModel mo28740o = this.f34702m.mo28740o(m29012r);
            if (mo28740o != null) {
                if (C9000c.m28960e(m27561e, mo28740o, this.f34703n, false)) {
                    this.f34702m.remove(m27561e);
                    this.f34702m.mo28733h(m27561e);
                    throw new c();
                }
                List<C8666a> mo28739n = this.f34702m.mo28739n(m29012r);
                this.f34702m.remove(m29012r);
                this.f34702m.mo28733h(m29012r);
                C9003f.m28999e(this.f34698i.m27565i());
                if (C9003f.m28980G(m29012r, mo28740o)) {
                    this.f34698i.m27580x(mo28740o.m27563g());
                    this.f34698i.m27582z(mo28740o.m27567k());
                    this.f34698i.m27575s(mo28740o.m27558b());
                    this.f34698i.m27574r(mo28740o.m27557a());
                    this.f34702m.mo28735j(this.f34698i);
                    if (mo28739n != null) {
                        for (C8666a c8666a : mo28739n) {
                            c8666a.m27593i(m27561e);
                            this.f34702m.mo28732g(c8666a);
                        }
                    }
                    throw new d();
                }
            }
            if (C9000c.m28958c(m27561e, this.f34698i.m27563g(), this.f34698i.m27566j(), m27565i, this.f34703n)) {
                this.f34702m.remove(m27561e);
                this.f34702m.mo28733h(m27561e);
                throw new c();
            }
        }
    }

    /* renamed from: i */
    private void m28804i() throws FileDownloadGiveUpRetryException {
        if (this.f34701l && !C9003f.m28995a("android.permission.ACCESS_NETWORK_STATE")) {
            throw new FileDownloadGiveUpRetryException(C9003f.m29009o("Task[%d] can't start the download runnable, because this task require wifi, but user application nor current process has %s, so we can't check whether the network type connection.", Integer.valueOf(this.f34698i.m27561e()), "android.permission.ACCESS_NETWORK_STATE"));
        }
        if (this.f34701l && C9003f.m28986M()) {
            throw new FileDownloadNetworkPolicyException();
        }
    }

    /* renamed from: j */
    private void m28805j(List<C8666a> list, long j2) throws InterruptedException {
        int m27561e = this.f34698i.m27561e();
        String m27558b = this.f34698i.m27558b();
        String str = this.f34691C;
        if (str == null) {
            str = this.f34698i.m27568l();
        }
        String m27566j = this.f34698i.m27566j();
        if (C9001d.f34819a) {
            C9001d.m28962a(this, "fetch data with multiple connection(count: [%d]) for task[%d] totalLength[%d]", Integer.valueOf(list.size()), Integer.valueOf(m27561e), Long.valueOf(j2));
        }
        boolean z = this.f34711v;
        long j3 = 0;
        long j4 = 0;
        for (C8666a c8666a : list) {
            long m27586a = c8666a.m27587b() == -1 ? j2 - c8666a.m27586a() : (c8666a.m27587b() - c8666a.m27586a()) + 1;
            j4 += c8666a.m27586a() - c8666a.m27590e();
            if (m27586a != j3) {
                RunnableC8982e m28837a = new RunnableC8982e.b().m28843g(m27561e).m28839c(Integer.valueOf(c8666a.m27589d())).m28838b(this).m28845i(str).m28841e(z ? m27558b : null).m28842f(this.f34699j).m28846j(this.f34701l).m28840d(C8979b.b.m28782b(c8666a.m27590e(), c8666a.m27586a(), c8666a.m27587b(), m27586a)).m28844h(m27566j).m28837a();
                if (C9001d.f34819a) {
                    C9001d.m28962a(this, "enable multiple connection: %s", c8666a);
                }
                if (m28837a == null) {
                    throw new IllegalArgumentException("the download runnable must not be null!");
                }
                this.f34708s.add(m28837a);
            } else if (C9001d.f34819a) {
                C9001d.m28962a(this, "pass connection[%d-%d], because it has been completed", Integer.valueOf(c8666a.m27588c()), Integer.valueOf(c8666a.m27589d()));
            }
            j3 = 0;
        }
        if (j4 != this.f34698i.m27563g()) {
            C9001d.m28970i(this, "correct the sofar[%d] from connection table[%d]", Long.valueOf(this.f34698i.m27563g()), Long.valueOf(j4));
            this.f34698i.m27580x(j4);
        }
        ArrayList arrayList = new ArrayList(this.f34708s.size());
        Iterator<RunnableC8982e> it = this.f34708s.iterator();
        while (it.hasNext()) {
            RunnableC8982e next = it.next();
            if (this.f34715z) {
                next.m28836c();
            } else {
                arrayList.add(Executors.callable(next));
            }
        }
        if (this.f34715z) {
            this.f34698i.m27581y((byte) -2);
            return;
        }
        List<Future> invokeAll = f34688f.invokeAll(arrayList);
        if (C9001d.f34819a) {
            for (Future future : invokeAll) {
                C9001d.m28962a(this, "finish sub-task for [%d] %B %B", Integer.valueOf(m27561e), Boolean.valueOf(future.isDone()), Boolean.valueOf(future.isCancelled()));
            }
        }
    }

    /* renamed from: m */
    private void m28806m(long j2, String str) throws IOException, IllegalAccessException {
        InterfaceC8995a interfaceC8995a = null;
        if (j2 != -1) {
            try {
                interfaceC8995a = C9003f.m28997c(this.f34698i.m27566j());
                long length = new File(str).length();
                long j3 = j2 - length;
                long m29018x = C9003f.m29018x(str);
                if (m29018x < j3) {
                    throw new FileDownloadOutOfSpaceException(m29018x, j3, length);
                }
                if (!C9002e.m28971a().f34825f) {
                    interfaceC8995a.mo28925a(j2);
                }
            } finally {
                if (0 != 0) {
                    interfaceC8995a.close();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x011b  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m28807n(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r18, p241e.p307h.p308a.p311g0.C8978a r19, p241e.p307h.p308a.p309e0.InterfaceC8968b r20) throws java.io.IOException, p241e.p307h.p308a.p311g0.RunnableC8981d.d, java.lang.IllegalArgumentException, com.liulishuo.filedownloader.exception.FileDownloadSecurityException {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p241e.p307h.p308a.p311g0.RunnableC8981d.m28807n(java.util.Map, e.h.a.g0.a, e.h.a.e0.b):void");
    }

    /* renamed from: q */
    private boolean m28808q() {
        return (!this.f34711v || this.f34698i.m27557a() > 1) && this.f34712w && this.f34707r && !this.f34713x;
    }

    /* renamed from: t */
    private void m28809t(long j2, int i2) throws InterruptedException {
        long j3 = j2 / i2;
        int m27561e = this.f34698i.m27561e();
        ArrayList arrayList = new ArrayList();
        long j4 = 0;
        int i3 = 0;
        while (i3 < i2) {
            long j5 = i3 == i2 + (-1) ? -1L : (j4 + j3) - 1;
            C8666a c8666a = new C8666a();
            c8666a.m27593i(m27561e);
            c8666a.m27594j(i3);
            c8666a.m27595k(j4);
            c8666a.m27591g(j4);
            c8666a.m27592h(j5);
            arrayList.add(c8666a);
            this.f34702m.mo28732g(c8666a);
            j4 += j3;
            i3++;
        }
        this.f34698i.m27574r(i2);
        this.f34702m.mo28741p(m27561e, i2);
        m28805j(arrayList, j2);
    }

    /* renamed from: u */
    private void m28810u(int i2, List<C8666a> list) throws InterruptedException {
        if (i2 <= 1 || list.size() != i2) {
            throw new IllegalArgumentException();
        }
        m28805j(list, this.f34698i.m27567k());
    }

    /* renamed from: v */
    private void m28811v(long j2) throws IOException, IllegalAccessException {
        C8979b m28783c;
        if (this.f34712w) {
            m28783c = C8979b.b.m28783c(this.f34698i.m27563g(), this.f34698i.m27563g(), j2 - this.f34698i.m27563g());
        } else {
            this.f34698i.m27580x(0L);
            m28783c = C8979b.b.m28781a(j2);
        }
        this.f34709t = new RunnableC8982e.b().m28843g(this.f34698i.m27561e()).m28839c(-1).m28838b(this).m28845i(this.f34698i.m27568l()).m28841e(this.f34698i.m27558b()).m28842f(this.f34699j).m28846j(this.f34701l).m28840d(m28783c).m28844h(this.f34698i.m27566j()).m28837a();
        this.f34698i.m27574r(1);
        this.f34702m.mo28741p(this.f34698i.m27561e(), 1);
        if (!this.f34715z) {
            this.f34709t.run();
        } else {
            this.f34698i.m27581y((byte) -2);
            this.f34709t.m28836c();
        }
    }

    /* renamed from: w */
    private void m28812w() throws IOException, d, IllegalAccessException, FileDownloadSecurityException {
        InterfaceC8968b interfaceC8968b = null;
        try {
            C8978a m28774a = new C8978a.b().m28776c(this.f34698i.m27561e()).m28779f(this.f34698i.m27568l()).m28777d(this.f34698i.m27558b()).m28778e(this.f34699j).m28775b(this.f34706q ? C8979b.b.m28785e() : C8979b.b.m28784d()).m28774a();
            interfaceC8968b = m28774a.m28768c();
            m28807n(m28774a.m28771g(), m28774a, interfaceC8968b);
        } finally {
            if (interfaceC8968b != null) {
                interfaceC8968b.mo27916g();
            }
        }
    }

    @Override // p241e.p307h.p308a.p311g0.InterfaceC8985h
    /* renamed from: a */
    public void mo28813a(RunnableC8982e runnableC8982e, long j2, long j3) {
        if (this.f34715z) {
            if (C9001d.f34819a) {
                C9001d.m28962a(this, "the task[%d] has already been paused, so pass the completed callback", Integer.valueOf(this.f34698i.m27561e()));
                return;
            }
            return;
        }
        int i2 = runnableC8982e.f34733m;
        if (C9001d.f34819a) {
            C9001d.m28962a(this, "the connection has been completed(%d): [%d, %d)  %d", Integer.valueOf(i2), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(this.f34698i.m27567k()));
        }
        if (!this.f34710u) {
            synchronized (this.f34708s) {
                this.f34708s.remove(runnableC8982e);
            }
        } else {
            if (j2 == 0 || j3 == this.f34698i.m27567k()) {
                return;
            }
            C9001d.m28963b(this, "the single task not completed corrected(%d, %d != %d) for task(%d)", Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(this.f34698i.m27567k()), Integer.valueOf(this.f34698i.m27561e()));
        }
    }

    @Override // p241e.p307h.p308a.p311g0.InterfaceC8985h
    /* renamed from: b */
    public void mo28814b(Exception exc) {
        this.f34689A = true;
        this.f34690B = exc;
        if (this.f34715z) {
            if (C9001d.f34819a) {
                C9001d.m28962a(this, "the task[%d] has already been paused, so pass the error callback", Integer.valueOf(this.f34698i.m27561e()));
            }
        } else {
            Iterator it = ((ArrayList) this.f34708s.clone()).iterator();
            while (it.hasNext()) {
                RunnableC8982e runnableC8982e = (RunnableC8982e) it.next();
                if (runnableC8982e != null) {
                    runnableC8982e.m28835a();
                }
            }
        }
    }

    @Override // p241e.p307h.p308a.p311g0.InterfaceC8985h
    /* renamed from: c */
    public void mo28815c(Exception exc) {
        if (this.f34715z) {
            if (C9001d.f34819a) {
                C9001d.m28962a(this, "the task[%d] has already been paused, so pass the retry callback", Integer.valueOf(this.f34698i.m27561e()));
            }
        } else {
            int i2 = this.f34705p;
            int i3 = i2 - 1;
            this.f34705p = i3;
            if (i2 < 0) {
                C9001d.m28963b(this, "valid retry times is less than 0(%d) for download task(%d)", Integer.valueOf(i3), Integer.valueOf(this.f34698i.m27561e()));
            }
            this.f34696g.m28869t(exc, this.f34705p);
        }
    }

    @Override // p241e.p307h.p308a.p311g0.InterfaceC8985h
    /* renamed from: d */
    public void mo28816d(long j2) {
        if (this.f34715z) {
            return;
        }
        this.f34696g.m28868s(j2);
    }

    @Override // p241e.p307h.p308a.p311g0.InterfaceC8985h
    /* renamed from: e */
    public boolean mo28817e(Exception exc) {
        if (exc instanceof FileDownloadHttpException) {
            int m27516b = ((FileDownloadHttpException) exc).m27516b();
            if (this.f34710u && m27516b == 416 && !this.f34704o) {
                C9003f.m29000f(this.f34698i.m27565i(), this.f34698i.m27566j());
                this.f34704o = true;
                return true;
            }
        }
        return this.f34705p > 0 && !(exc instanceof FileDownloadGiveUpRetryException);
    }

    @Override // p241e.p307h.p308a.p311g0.InterfaceC8985h
    /* renamed from: f */
    public void mo28818f() {
        this.f34702m.mo28737l(this.f34698i.m27561e(), this.f34698i.m27563g());
    }

    /* renamed from: k */
    public int m28819k() {
        return this.f34698i.m27561e();
    }

    /* renamed from: l */
    public String m28820l() {
        return this.f34698i.m27566j();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0061  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m28821o(java.util.List<com.liulishuo.filedownloader.model.C8666a> r11) {
        /*
            r10 = this;
            com.liulishuo.filedownloader.model.FileDownloadModel r0 = r10.f34698i
            int r0 = r0.m27557a()
            com.liulishuo.filedownloader.model.FileDownloadModel r1 = r10.f34698i
            java.lang.String r1 = r1.m27566j()
            com.liulishuo.filedownloader.model.FileDownloadModel r2 = r10.f34698i
            java.lang.String r2 = r2.m27565i()
            r3 = 0
            r4 = 1
            if (r0 <= r4) goto L18
            r5 = 1
            goto L19
        L18:
            r5 = 0
        L19:
            boolean r6 = r10.f34706q
            r7 = 0
            if (r6 == 0) goto L21
        L1f:
            r5 = r7
            goto L58
        L21:
            if (r5 == 0) goto L28
            boolean r6 = r10.f34707r
            if (r6 != 0) goto L28
            goto L1f
        L28:
            com.liulishuo.filedownloader.model.FileDownloadModel r6 = r10.f34698i
            int r6 = r6.m27561e()
            com.liulishuo.filedownloader.model.FileDownloadModel r9 = r10.f34698i
            boolean r6 = p241e.p307h.p308a.p315k0.C9003f.m28980G(r6, r9)
            if (r6 == 0) goto L1f
            boolean r6 = r10.f34707r
            if (r6 != 0) goto L44
            java.io.File r11 = new java.io.File
            r11.<init>(r1)
            long r5 = r11.length()
            goto L58
        L44:
            if (r5 == 0) goto L52
            int r5 = r11.size()
            if (r0 == r5) goto L4d
            goto L1f
        L4d:
            long r5 = com.liulishuo.filedownloader.model.C8666a.m27585f(r11)
            goto L58
        L52:
            com.liulishuo.filedownloader.model.FileDownloadModel r11 = r10.f34698i
            long r5 = r11.m27563g()
        L58:
            com.liulishuo.filedownloader.model.FileDownloadModel r11 = r10.f34698i
            r11.m27580x(r5)
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 <= 0) goto L62
            r3 = 1
        L62:
            r10.f34711v = r3
            if (r3 != 0) goto L74
            e.h.a.f0.a r11 = r10.f34702m
            com.liulishuo.filedownloader.model.FileDownloadModel r0 = r10.f34698i
            int r0 = r0.m27561e()
            r11.mo28733h(r0)
            p241e.p307h.p308a.p315k0.C9003f.m29000f(r2, r1)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p241e.p307h.p308a.p311g0.RunnableC8981d.m28821o(java.util.List):void");
    }

    /* renamed from: p */
    public boolean m28822p() {
        return this.f34714y.get() || this.f34696g.m28861l();
    }

    /* renamed from: r */
    public void m28823r() {
        this.f34715z = true;
        RunnableC8982e runnableC8982e = this.f34709t;
        if (runnableC8982e != null) {
            runnableC8982e.m28836c();
        }
        Iterator it = ((ArrayList) this.f34708s.clone()).iterator();
        while (it.hasNext()) {
            RunnableC8982e runnableC8982e2 = (RunnableC8982e) it.next();
            if (runnableC8982e2 != null) {
                runnableC8982e2.m28836c();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c1 A[Catch: all -> 0x01f6, TryCatch #12 {all -> 0x01f6, blocks: (B:3:0x0003, B:6:0x0012, B:8:0x001a, B:10:0x001e, B:25:0x0030, B:26:0x008d, B:28:0x0091, B:30:0x0096, B:116:0x009a, B:118:0x009e, B:33:0x00c6, B:35:0x00e2, B:44:0x0100, B:56:0x0136, B:58:0x013a, B:69:0x015f, B:71:0x0163, B:85:0x0167, B:87:0x0170, B:88:0x0174, B:90:0x0178, B:91:0x018b, B:109:0x018c, B:93:0x01bb, B:95:0x01c1, B:99:0x01c6), top: B:2:0x0003, inners: #15, #12, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c6 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p241e.p307h.p308a.p311g0.RunnableC8981d.run():void");
    }

    /* renamed from: s */
    public void m28824s() {
        m28821o(this.f34702m.mo28739n(this.f34698i.m27561e()));
        this.f34696g.m28867r();
    }

    private RunnableC8981d(FileDownloadModel fileDownloadModel, FileDownloadHeader fileDownloadHeader, InterfaceC9017y interfaceC9017y, int i2, int i3, boolean z, boolean z2, int i4) {
        this.f34697h = 5;
        this.f34706q = false;
        this.f34708s = new ArrayList<>(5);
        this.f34692D = 0L;
        this.f34693E = 0L;
        this.f34694F = 0L;
        this.f34695G = 0L;
        this.f34714y = new AtomicBoolean(true);
        this.f34715z = false;
        this.f34704o = false;
        this.f34698i = fileDownloadModel;
        this.f34699j = fileDownloadHeader;
        this.f34700k = z;
        this.f34701l = z2;
        this.f34702m = C8980c.m28789j().m28795f();
        this.f34707r = C8980c.m28789j().m28799m();
        this.f34703n = interfaceC9017y;
        this.f34705p = i4;
        this.f34696g = new C8983f(fileDownloadModel, i4, i2, i3);
    }
}
