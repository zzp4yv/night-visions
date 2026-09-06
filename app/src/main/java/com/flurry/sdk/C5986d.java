package com.flurry.sdk;

import android.text.TextUtils;
import com.flurry.sdk.C5987d0.c;
import com.google.android.gms.common.GoogleApiAvailability;
import okhttp3.HttpUrl;

/* renamed from: com.flurry.sdk.d */
/* loaded from: classes2.dex */
public final class C5986d extends C5994d7<C5996e> {

    /* renamed from: p */
    public String f15742p;

    /* renamed from: q */
    public boolean f15743q;

    /* renamed from: r */
    public boolean f15744r;

    /* renamed from: s */
    private C6077n f15745s;

    /* renamed from: t */
    private InterfaceC6013f7<C6077n> f15746t;

    /* renamed from: u */
    private C6086o f15747u;

    /* renamed from: v */
    private C6031h7 f15748v;

    /* renamed from: w */
    private InterfaceC6013f7<C6040i7> f15749w;

    /* renamed from: com.flurry.sdk.d$a */
    final class a implements InterfaceC6013f7<C6077n> {

        /* renamed from: com.flurry.sdk.d$a$a, reason: collision with other inner class name */
        final class C11419a extends AbstractRunnableC6008f2 {

            /* renamed from: h */
            final /* synthetic */ C6077n f15751h;

            C11419a(C6077n c6077n) {
                this.f15751h = c6077n;
            }

            @Override // com.flurry.sdk.AbstractRunnableC6008f2
            /* renamed from: a */
            public final void mo12950a() throws Exception {
                C5988d1.m13030c(3, "FlurryProvider", "isInstantApp: " + this.f15751h.f16150a);
                C5986d.this.f15745s = this.f15751h;
                C5986d.m13014A(C5986d.this);
                C5986d.this.f15747u.m13051w(C5986d.this.f15746t);
            }
        }

        a() {
        }

        @Override // com.flurry.sdk.InterfaceC6013f7
        /* renamed from: a */
        public final /* synthetic */ void mo12962a(C6077n c6077n) {
            C5986d.this.mo13007m(new C11419a(c6077n));
        }
    }

    /* renamed from: com.flurry.sdk.d$b */
    final class b implements InterfaceC6013f7<C6040i7> {
        b() {
        }

        @Override // com.flurry.sdk.InterfaceC6013f7
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo12962a(C6040i7 c6040i7) {
            C5986d.m13014A(C5986d.this);
        }
    }

    /* renamed from: com.flurry.sdk.d$c */
    public class c extends AbstractRunnableC6008f2 {
        public c() {
        }

        @Override // com.flurry.sdk.AbstractRunnableC6008f2
        /* renamed from: a */
        public final void mo12950a() throws Exception {
            C5986d.m13017D(C5986d.this);
            C5986d.m13014A(C5986d.this);
        }
    }

    /* renamed from: com.flurry.sdk.d$d */
    public enum d {
        UNAVAILABLE(-2),
        UNKNOWN(-1),
        SUCCESS(0),
        SERVICE_MISSING(1),
        SERVICE_UPDATING(2),
        SERVICE_VERSION_UPDATE_REQUIRED(3),
        SERVICE_DISABLED(4),
        SERVICE_INVALID(5);


        /* renamed from: o */
        public int f15764o;

        d(int i2) {
            this.f15764o = i2;
        }
    }

    public C5986d(C6086o c6086o, C6031h7 c6031h7) {
        super("FlurryProvider");
        this.f15743q = false;
        this.f15744r = false;
        this.f15746t = new a();
        this.f15749w = new b();
        this.f15747u = c6086o;
        c6086o.mo13050v(this.f15746t);
        this.f15748v = c6031h7;
        c6031h7.mo13050v(this.f15749w);
    }

    /* renamed from: A */
    static /* synthetic */ void m13014A(C5986d c5986d) {
        if (TextUtils.isEmpty(c5986d.f15742p) || c5986d.f15745s == null) {
            return;
        }
        c5986d.m13048t(new C5996e(C6051k0.m13141a().m13143b(), c5986d.f15743q, m13018x(), c5986d.f15745s));
    }

    /* renamed from: D */
    static /* synthetic */ void m13017D(C5986d c5986d) {
        if (TextUtils.isEmpty(c5986d.f15742p)) {
            C5988d1.m13030c(6, "FlurryProvider", "Streaming API Key is invalid");
            return;
        }
        int m13256e = C6098p2.m13256e("prev_streaming_api_key", 0);
        int hashCode = C6098p2.m13258g("api_key", HttpUrl.FRAGMENT_ENCODE_SET).hashCode();
        int hashCode2 = c5986d.f15742p.hashCode();
        if (m13256e == hashCode2 || hashCode == hashCode2) {
            return;
        }
        C5988d1.m13030c(3, "FlurryProvider", "Streaming API key is refreshed");
        C6098p2.m13253b("prev_streaming_api_key", hashCode2);
        C5987d0 c5987d0 = C6004e7.m13055a().f15832l;
        C5988d1.m13030c(3, "ReportingProvider", "Reset initial timestamp.");
        c5987d0.mo13007m(c5987d0.new c());
    }

    /* renamed from: x */
    private static d m13018x() {
        try {
            int mo13812i = GoogleApiAvailability.m13803q().mo13812i(C5969b0.m12964a());
            return mo13812i != 0 ? mo13812i != 1 ? mo13812i != 2 ? mo13812i != 3 ? mo13812i != 9 ? mo13812i != 18 ? d.UNAVAILABLE : d.SERVICE_UPDATING : d.SERVICE_INVALID : d.SERVICE_DISABLED : d.SERVICE_VERSION_UPDATE_REQUIRED : d.SERVICE_MISSING : d.SUCCESS;
        } catch (Exception | NoClassDefFoundError unused) {
            C5988d1.m13030c(3, "FlurryProvider", "Error retrieving Google Play Services Availability. This probably means google play services is unavailable.");
            return d.UNAVAILABLE;
        }
    }
}
