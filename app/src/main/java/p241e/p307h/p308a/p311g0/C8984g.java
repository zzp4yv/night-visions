package p241e.p307h.p308a.p311g0;

import android.os.SystemClock;
import java.io.IOException;
import p241e.p307h.p308a.p309e0.InterfaceC8968b;
import p241e.p307h.p308a.p310f0.InterfaceC8972a;
import p241e.p307h.p308a.p314j0.InterfaceC8995a;
import p241e.p307h.p308a.p315k0.C9001d;
import p241e.p307h.p308a.p315k0.C9003f;

/* compiled from: FetchDataTask.java */
/* renamed from: e.h.a.g0.g */
/* loaded from: classes2.dex */
public class C8984g {

    /* renamed from: a */
    private final InterfaceC8985h f34758a;

    /* renamed from: b */
    private final int f34759b;

    /* renamed from: c */
    private final int f34760c;

    /* renamed from: d */
    private final RunnableC8982e f34761d;

    /* renamed from: e */
    private final InterfaceC8968b f34762e;

    /* renamed from: f */
    private final boolean f34763f;

    /* renamed from: g */
    private final long f34764g;

    /* renamed from: h */
    private final long f34765h;

    /* renamed from: i */
    private final long f34766i;

    /* renamed from: j */
    private final String f34767j;

    /* renamed from: k */
    long f34768k;

    /* renamed from: l */
    private InterfaceC8995a f34769l;

    /* renamed from: m */
    private volatile boolean f34770m;

    /* renamed from: n */
    private final InterfaceC8972a f34771n;

    /* renamed from: o */
    private volatile long f34772o;

    /* renamed from: p */
    private volatile long f34773p;

    /* compiled from: FetchDataTask.java */
    /* renamed from: e.h.a.g0.g$b */
    public static class b {

        /* renamed from: a */
        RunnableC8982e f34774a;

        /* renamed from: b */
        InterfaceC8968b f34775b;

        /* renamed from: c */
        C8979b f34776c;

        /* renamed from: d */
        InterfaceC8985h f34777d;

        /* renamed from: e */
        String f34778e;

        /* renamed from: f */
        Boolean f34779f;

        /* renamed from: g */
        Integer f34780g;

        /* renamed from: h */
        Integer f34781h;

        /* renamed from: a */
        public C8984g m28881a() throws IllegalArgumentException {
            InterfaceC8968b interfaceC8968b;
            C8979b c8979b;
            Integer num;
            if (this.f34779f == null || (interfaceC8968b = this.f34775b) == null || (c8979b = this.f34776c) == null || this.f34777d == null || this.f34778e == null || (num = this.f34781h) == null || this.f34780g == null) {
                throw new IllegalArgumentException();
            }
            return new C8984g(interfaceC8968b, c8979b, this.f34774a, num.intValue(), this.f34780g.intValue(), this.f34779f.booleanValue(), this.f34777d, this.f34778e);
        }

        /* renamed from: b */
        public b m28882b(InterfaceC8985h interfaceC8985h) {
            this.f34777d = interfaceC8985h;
            return this;
        }

        /* renamed from: c */
        public b m28883c(InterfaceC8968b interfaceC8968b) {
            this.f34775b = interfaceC8968b;
            return this;
        }

        /* renamed from: d */
        public b m28884d(int i2) {
            this.f34780g = Integer.valueOf(i2);
            return this;
        }

        /* renamed from: e */
        public b m28885e(C8979b c8979b) {
            this.f34776c = c8979b;
            return this;
        }

        /* renamed from: f */
        public b m28886f(int i2) {
            this.f34781h = Integer.valueOf(i2);
            return this;
        }

        /* renamed from: g */
        public b m28887g(RunnableC8982e runnableC8982e) {
            this.f34774a = runnableC8982e;
            return this;
        }

        /* renamed from: h */
        public b m28888h(String str) {
            this.f34778e = str;
            return this;
        }

        /* renamed from: i */
        public b m28889i(boolean z) {
            this.f34779f = Boolean.valueOf(z);
            return this;
        }
    }

    /* renamed from: a */
    private void m28877a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (C9003f.m28985L(this.f34768k - this.f34772o, elapsedRealtime - this.f34773p)) {
            m28878d();
            this.f34772o = this.f34768k;
            this.f34773p = elapsedRealtime;
        }
    }

    /* renamed from: d */
    private void m28878d() {
        boolean z;
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            this.f34769l.mo28926b();
            z = true;
        } catch (IOException e2) {
            if (C9001d.f34819a) {
                C9001d.m28962a(this, "Because of the system cannot guarantee that all the buffers have been synchronized with physical media, or write to filefailed, we just not flushAndSync process to database too %s", e2);
            }
            z = false;
        }
        if (z) {
            int i2 = this.f34760c;
            if (i2 >= 0) {
                this.f34771n.mo28731f(this.f34759b, i2, this.f34768k);
            } else {
                this.f34758a.mo28818f();
            }
            if (C9001d.f34819a) {
                C9001d.m28962a(this, "require flushAndSync id[%d] index[%d] offset[%d], consume[%d]", Integer.valueOf(this.f34759b), Integer.valueOf(this.f34760c), Long.valueOf(this.f34768k), Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            }
        }
    }

    /* renamed from: b */
    public void m28879b() {
        this.f34770m = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ea, code lost:
    
        throw new com.liulishuo.filedownloader.exception.FileDownloadNetworkPolicyException();
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m28880c() throws java.io.IOException, java.lang.IllegalAccessException, java.lang.IllegalArgumentException, com.liulishuo.filedownloader.exception.FileDownloadGiveUpRetryException {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p241e.p307h.p308a.p311g0.C8984g.m28880c():void");
    }

    private C8984g(InterfaceC8968b interfaceC8968b, C8979b c8979b, RunnableC8982e runnableC8982e, int i2, int i3, boolean z, InterfaceC8985h interfaceC8985h, String str) {
        this.f34772o = 0L;
        this.f34773p = 0L;
        this.f34758a = interfaceC8985h;
        this.f34767j = str;
        this.f34762e = interfaceC8968b;
        this.f34763f = z;
        this.f34761d = runnableC8982e;
        this.f34760c = i3;
        this.f34759b = i2;
        this.f34771n = C8980c.m28789j().m28795f();
        this.f34764g = c8979b.f34674a;
        this.f34765h = c8979b.f34676c;
        this.f34768k = c8979b.f34675b;
        this.f34766i = c8979b.f34677d;
    }
}
