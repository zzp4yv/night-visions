package com.flurry.sdk;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p241e.p252d.p253a.InterfaceC8744c;

/* renamed from: com.flurry.sdk.d0 */
/* loaded from: classes2.dex */
public final class C5987d0 extends C5994d7<C5978c0> {

    /* renamed from: p */
    public AtomicLong f15765p;

    /* renamed from: q */
    public AtomicLong f15766q;

    /* renamed from: r */
    public AtomicBoolean f15767r;

    /* renamed from: s */
    public long f15768s;

    /* renamed from: t */
    private long f15769t;

    /* renamed from: u */
    public List<InterfaceC8744c> f15770u;

    /* renamed from: v */
    private C6031h7 f15771v;

    /* renamed from: w */
    private InterfaceC6013f7<C6040i7> f15772w;

    /* renamed from: com.flurry.sdk.d0$a */
    final class a implements InterfaceC6013f7<C6040i7> {
        a() {
        }

        @Override // com.flurry.sdk.InterfaceC6013f7
        /* renamed from: a */
        public final /* synthetic */ void mo12962a(C6040i7 c6040i7) {
            int i2 = g.f15784a[c6040i7.f16000b.ordinal()];
            if (i2 == 1) {
                C5987d0.this.m13024C(EnumC6006f0.FOREGROUND, false);
            } else {
                if (i2 != 2) {
                    return;
                }
                C5987d0.this.m13025D(EnumC6006f0.FOREGROUND, false);
            }
        }
    }

    /* renamed from: com.flurry.sdk.d0$b */
    final class b extends AbstractRunnableC6008f2 {
        b() {
        }

        @Override // com.flurry.sdk.AbstractRunnableC6008f2
        /* renamed from: a */
        public final void mo12950a() throws Exception {
            C5987d0.this.f15769t = C6098p2.m13257f("initial_run_time", Long.MIN_VALUE);
        }
    }

    /* renamed from: com.flurry.sdk.d0$c */
    public class c extends AbstractRunnableC6008f2 {
        public c() {
        }

        @Override // com.flurry.sdk.AbstractRunnableC6008f2
        /* renamed from: a */
        public final void mo12950a() throws Exception {
            C5987d0.this.f15769t = Long.MIN_VALUE;
        }
    }

    /* renamed from: com.flurry.sdk.d0$d */
    final class d extends AbstractRunnableC6008f2 {

        /* renamed from: h */
        final /* synthetic */ List f15776h;

        d(List list) {
            this.f15776h = list;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6008f2
        /* renamed from: a */
        public final void mo12950a() throws Exception {
            for (InterfaceC8744c interfaceC8744c : this.f15776h) {
                if (interfaceC8744c != null) {
                    interfaceC8744c.m27939a();
                }
            }
        }
    }

    /* renamed from: com.flurry.sdk.d0$e */
    final class e extends AbstractRunnableC6008f2 {

        /* renamed from: h */
        final /* synthetic */ EnumC6006f0 f15778h;

        /* renamed from: i */
        final /* synthetic */ boolean f15779i;

        e(EnumC6006f0 enumC6006f0, boolean z) {
            this.f15778h = enumC6006f0;
            this.f15779i = z;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6008f2
        /* renamed from: a */
        public final void mo12950a() throws Exception {
            C5988d1.m13030c(3, "ReportingProvider", "Start session: " + this.f15778h.name() + ", isManualSession: " + this.f15779i);
            C5987d0.m13021B(C5987d0.this, this.f15778h, EnumC5997e0.SESSION_START, this.f15779i);
        }
    }

    /* renamed from: com.flurry.sdk.d0$f */
    final class f extends AbstractRunnableC6008f2 {

        /* renamed from: h */
        final /* synthetic */ EnumC6006f0 f15781h;

        /* renamed from: i */
        final /* synthetic */ boolean f15782i;

        f(EnumC6006f0 enumC6006f0, boolean z) {
            this.f15781h = enumC6006f0;
            this.f15782i = z;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6008f2
        /* renamed from: a */
        public final void mo12950a() throws Exception {
            C5988d1.m13030c(3, "ReportingProvider", "End session: " + this.f15781h.name() + ", isManualSession: " + this.f15782i);
            C5987d0.m13021B(C5987d0.this, this.f15781h, EnumC5997e0.SESSION_END, this.f15782i);
        }
    }

    /* renamed from: com.flurry.sdk.d0$g */
    static /* synthetic */ class g {

        /* renamed from: a */
        static final /* synthetic */ int[] f15784a;

        static {
            int[] iArr = new int[EnumC6022g7.values().length];
            f15784a = iArr;
            try {
                iArr[EnumC6022g7.FOREGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15784a[EnumC6022g7.BACKGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C5987d0(C6031h7 c6031h7) {
        super("ReportingProvider");
        this.f15765p = new AtomicLong(0L);
        this.f15766q = new AtomicLong(0L);
        this.f15767r = new AtomicBoolean(true);
        this.f15772w = new a();
        this.f15770u = new ArrayList();
        this.f15771v = c6031h7;
        c6031h7.mo13050v(this.f15772w);
        mo13007m(new b());
    }

    /* renamed from: B */
    static /* synthetic */ void m13021B(C5987d0 c5987d0, EnumC6006f0 enumC6006f0, EnumC5997e0 enumC5997e0, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        if (c5987d0.f15769t == Long.MIN_VALUE) {
            c5987d0.f15769t = currentTimeMillis;
            C6098p2.m13254c("initial_run_time", currentTimeMillis);
            C5988d1.m13030c(3, "ReportingProvider", "Refresh initial timestamp");
        }
        c5987d0.m13048t(new C5978c0(enumC6006f0, currentTimeMillis, c5987d0.f15769t, enumC6006f0.equals(EnumC6006f0.FOREGROUND) ? c5987d0.f15768s : 60000L, enumC5997e0, z));
    }

    /* renamed from: A */
    public final void m13023A(InterfaceC8744c interfaceC8744c) {
        if (interfaceC8744c == null) {
            C5988d1.m13030c(2, "ReportingProvider", "Cannot register with null listener");
        } else {
            this.f15770u.add(interfaceC8744c);
        }
    }

    /* renamed from: C */
    public final void m13024C(EnumC6006f0 enumC6006f0, boolean z) {
        mo13007m(new e(enumC6006f0, z));
    }

    /* renamed from: D */
    public final void m13025D(EnumC6006f0 enumC6006f0, boolean z) {
        mo13007m(new f(enumC6006f0, z));
    }

    /* renamed from: y */
    public final String m13026y() {
        return String.valueOf(this.f15765p.get());
    }

    /* renamed from: z */
    public final void m13027z(long j2, long j3) {
        this.f15765p.set(j2);
        this.f15766q.set(j3);
        if (this.f15770u.isEmpty()) {
            return;
        }
        m13177r(new d(new ArrayList(this.f15770u)));
    }
}
