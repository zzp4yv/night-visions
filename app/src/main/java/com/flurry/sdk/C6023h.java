package com.flurry.sdk;

import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.flurry.sdk.h */
/* loaded from: classes2.dex */
public final class C6023h extends C5994d7<C6059l> {

    /* renamed from: p */
    protected C6059l f15932p;

    /* renamed from: q */
    protected C6031h7 f15933q;

    /* renamed from: r */
    protected C6041j f15934r;

    /* renamed from: s */
    protected C6014g f15935s;

    /* renamed from: t */
    protected C6005f f15936t;

    /* renamed from: u */
    protected AtomicBoolean f15937u;

    /* renamed from: v */
    protected InterfaceC6013f7<C6040i7> f15938v;

    /* renamed from: com.flurry.sdk.h$a */
    final class a extends AbstractRunnableC6008f2 {
        a() {
        }

        @Override // com.flurry.sdk.AbstractRunnableC6008f2
        /* renamed from: a */
        public final void mo12950a() throws Exception {
            C6023h.this.f15934r.m13118a();
        }
    }

    /* renamed from: com.flurry.sdk.h$b */
    final class b extends AbstractRunnableC6008f2 {
        b() {
        }

        @Override // com.flurry.sdk.AbstractRunnableC6008f2
        /* renamed from: a */
        public final void mo12950a() throws Exception {
            C6015g0.m13065a();
            C6015g0.m13068f("IdProvider: Provider start", Collections.emptyMap());
            C6023h.this.m13086d();
        }
    }

    /* renamed from: com.flurry.sdk.h$c */
    final class c extends AbstractRunnableC6008f2 {

        /* renamed from: com.flurry.sdk.h$c$a */
        final class a extends AbstractRunnableC6008f2 {

            /* renamed from: h */
            final /* synthetic */ boolean f15942h;

            /* renamed from: i */
            final /* synthetic */ String f15943i;

            a(boolean z, String str) {
                this.f15942h = z;
                this.f15943i = str;
            }

            @Override // com.flurry.sdk.AbstractRunnableC6008f2
            /* renamed from: a */
            public final void mo12950a() throws Exception {
                C6023h.this.f15936t.m13057a();
                boolean z = this.f15942h;
                C6005f c6005f = C6023h.this.f15936t;
                if (z == c6005f.f15839p && this.f15943i.equals(c6005f.f15838o)) {
                    return;
                }
                C6015g0.m13065a();
                C6015g0.m13068f("IdProvider: Advertising Info update", Collections.emptyMap());
                C6023h.this.m13086d();
            }
        }

        c() {
        }

        /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(7:2|3|(1:5)(1:66)|6|(1:8)|9|(1:11))|(2:13|14)|(4:16|(1:18)(1:62)|19|(8:21|(1:23)|25|26|(5:28|(1:30)(1:43)|31|(3:33|(1:35)(2:38|(1:40)(1:41))|36)(1:42)|37)|(1:45)|47|(2:49|50)(1:52))(3:55|(3:57|(1:59)|60)|61))|63|(0)|25|26|(0)|(0)|47|(0)(0)) */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x01bc, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x01bd, code lost:
        
            com.flurry.sdk.C5988d1.m13030c(6, "IdProvider", "Error Fetching Install Id - " + r2.getLocalizedMessage());
            com.flurry.sdk.C6015g0.m13065a();
            com.flurry.sdk.C6015g0.m13066c("Error fetching Install Id", "Exception happened during fetching Install Id", r2);
         */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0127 A[Catch: Exception -> 0x0131, TRY_LEAVE, TryCatch #2 {Exception -> 0x0131, blocks: (B:14:0x009a, B:16:0x00a6, B:19:0x00ca, B:23:0x0127, B:55:0x00d1, B:57:0x00db, B:59:0x00e5, B:60:0x011e, B:61:0x0121, B:62:0x00c4, B:63:0x0123), top: B:13:0x009a }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x015a A[Catch: Exception -> 0x01bc, TryCatch #0 {Exception -> 0x01bc, blocks: (B:26:0x0151, B:28:0x015a, B:30:0x0160, B:31:0x0165, B:33:0x016f, B:36:0x01a4, B:37:0x01aa, B:38:0x0184, B:40:0x0193, B:41:0x01a0, B:43:0x0163, B:45:0x01ae), top: B:25:0x0151 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x01ae A[Catch: Exception -> 0x01bc, TRY_LEAVE, TryCatch #0 {Exception -> 0x01bc, blocks: (B:26:0x0151, B:28:0x015a, B:30:0x0160, B:31:0x0165, B:33:0x016f, B:36:0x01a4, B:37:0x01aa, B:38:0x0184, B:40:0x0193, B:41:0x01a0, B:43:0x0163, B:45:0x01ae), top: B:25:0x0151 }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x01eb  */
        /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
        @Override // com.flurry.sdk.AbstractRunnableC6008f2
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void mo12950a() {
            /*
                Method dump skipped, instructions count: 503
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C6023h.c.mo12950a():void");
        }
    }

    /* renamed from: com.flurry.sdk.h$d */
    final class d implements InterfaceC6013f7<C6040i7> {
        d() {
        }

        @Override // com.flurry.sdk.InterfaceC6013f7
        /* renamed from: a */
        public final /* synthetic */ void mo12962a(C6040i7 c6040i7) {
            C6023h.this.m13086d();
            C6023h.m13084z(c6040i7);
        }
    }

    public C6023h(C6031h7 c6031h7) {
        super("IdProvider");
        this.f15932p = null;
        this.f15937u = new AtomicBoolean(false);
        this.f15938v = new d();
        this.f15933q = c6031h7;
        this.f15934r = new C6041j();
        this.f15935s = new C6014g();
        this.f15936t = new C6005f();
        this.f15932p = new C6059l();
        this.f15933q.mo13050v(this.f15938v);
    }

    /* renamed from: z */
    static /* synthetic */ void m13084z(C6040i7 c6040i7) {
        HashMap hashMap = new HashMap();
        hashMap.put("previous_state", c6040i7.f15999a.name());
        hashMap.put("current_state", c6040i7.f16000b.name());
        C6015g0.m13065a();
        C6015g0.m13068f("IdProvider: App State Change", hashMap);
    }

    /* renamed from: c */
    public final boolean m13085c() {
        boolean z = this.f15937u.get();
        C6059l c6059l = this.f15932p;
        return z && (c6059l != null && c6059l.m13171a() != null && this.f15932p.m13171a().size() > 0);
    }

    /* renamed from: d */
    protected final void m13086d() {
        mo13007m(new c());
    }

    @Override // com.flurry.sdk.C5994d7
    /* renamed from: u */
    public final void mo13049u() {
        mo13007m(new a());
        mo13007m(new b());
    }

    @Override // com.flurry.sdk.C5994d7
    /* renamed from: v */
    public final void mo13050v(InterfaceC6013f7<C6059l> interfaceC6013f7) {
        super.mo13050v(interfaceC6013f7);
    }
}
