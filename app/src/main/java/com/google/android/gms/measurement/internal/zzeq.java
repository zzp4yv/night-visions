package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzky;
import com.google.android.gms.internal.measurement.zzmo;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzeq extends AbstractC7800u2 {

    /* renamed from: c */
    private String f29196c;

    /* renamed from: d */
    private String f29197d;

    /* renamed from: e */
    private int f29198e;

    /* renamed from: f */
    private String f29199f;

    /* renamed from: g */
    private String f29200g;

    /* renamed from: h */
    private long f29201h;

    /* renamed from: i */
    private long f29202i;

    /* renamed from: j */
    private long f29203j;

    /* renamed from: k */
    private List<String> f29204k;

    /* renamed from: l */
    private int f29205l;

    /* renamed from: m */
    private String f29206m;

    /* renamed from: n */
    private String f29207n;

    /* renamed from: o */
    private String f29208o;

    zzeq(zzfx zzfxVar, long j2) {
        super(zzfxVar);
        this.f29203j = j2;
    }

    @VisibleForTesting
    /* renamed from: J */
    private final String m23108J() {
        if (zzmo.m22553b() && mo22841n().m23587r(zzap.f29114Q0)) {
            mo22836h().m23145P().m23147a("Disabled IID for tests.");
            return null;
        }
        try {
            Class<?> loadClass = mo22834f().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            if (loadClass == null) {
                return null;
            }
            try {
                Object invoke = loadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, mo22834f());
                if (invoke == null) {
                    return null;
                }
                try {
                    return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                } catch (Exception unused) {
                    mo22836h().m23142M().m23147a("Failed to retrieve Firebase Instance Id");
                    return null;
                }
            } catch (Exception unused2) {
                mo22836h().m23141L().m23147a("Failed to obtain Firebase Analytics instance");
                return null;
            }
        } catch (ClassNotFoundException unused3) {
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC7800u2
    /* renamed from: A */
    protected final boolean mo22854A() {
        return true;
    }

    /* renamed from: B */
    final zzm m23109B(String str) {
        String str2;
        Boolean m23589u;
        mo22792d();
        mo22790b();
        String m23110C = m23110C();
        String m23111D = m23111D();
        m22857x();
        String str3 = this.f29197d;
        long m23113F = m23113F();
        m22857x();
        String str4 = this.f29199f;
        long m23565C = mo22841n().m23565C();
        m22857x();
        mo22792d();
        if (this.f29201h == 0) {
            this.f29201h = this.f28874a.m23217I().m23551w(mo22834f(), mo22834f().getPackageName());
        }
        long j2 = this.f29201h;
        boolean m23236p = this.f28874a.m23236p();
        boolean z = !mo22840m().f28872y;
        mo22792d();
        mo22790b();
        String m23108J = !this.f28874a.m23236p() ? null : m23108J();
        m22857x();
        long j3 = this.f29202i;
        long m23237q = this.f28874a.m23237q();
        int m23114H = m23114H();
        boolean booleanValue = mo22841n().m23573L().booleanValue();
        zzx mo22841n = mo22841n();
        mo22841n.mo22790b();
        Boolean m23589u2 = mo22841n.m23589u("google_analytics_ssaid_collection_enabled");
        boolean booleanValue2 = Boolean.valueOf(m23589u2 == null || m23589u2.booleanValue()).booleanValue();
        boolean m22825L = mo22840m().m22825L();
        String m23112E = m23112E();
        Boolean valueOf = (!mo22841n().m23564B(m23110C(), zzap.f29152k0) || (m23589u = mo22841n().m23589u("google_analytics_default_allow_ad_personalization_signals")) == null) ? null : Boolean.valueOf(!m23589u.booleanValue());
        long j4 = this.f29203j;
        List<String> list = mo22841n().m23564B(m23110C(), zzap.f29174v0) ? this.f29204k : null;
        if (zzky.m22475b() && mo22841n().m23564B(m23110C(), zzap.f29108N0)) {
            m22857x();
            str2 = this.f29208o;
        } else {
            str2 = null;
        }
        return new zzm(m23110C, m23111D, str3, m23113F, str4, m23565C, j2, str, m23236p, z, m23108J, j3, m23237q, m23114H, booleanValue, booleanValue2, m22825L, m23112E, valueOf, j4, list, str2);
    }

    /* renamed from: C */
    final String m23110C() {
        m22857x();
        return this.f29196c;
    }

    /* renamed from: D */
    final String m23111D() {
        m22857x();
        return this.f29206m;
    }

    /* renamed from: E */
    final String m23112E() {
        m22857x();
        return this.f29207n;
    }

    /* renamed from: F */
    final int m23113F() {
        m22857x();
        return this.f29198e;
    }

    @Override // com.google.android.gms.measurement.internal.C7775r4, com.google.android.gms.measurement.internal.InterfaceC7784s4
    /* renamed from: G */
    public final /* bridge */ /* synthetic */ zzw mo22832G() {
        return super.mo22832G();
    }

    /* renamed from: H */
    final int m23114H() {
        m22857x();
        return this.f29205l;
    }

    /* renamed from: I */
    final List<String> m23115I() {
        return this.f29204k;
    }

    @Override // com.google.android.gms.measurement.internal.C7711k3, com.google.android.gms.measurement.internal.C7775r4
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo22789a() {
        super.mo22789a();
    }

    @Override // com.google.android.gms.measurement.internal.C7711k3, com.google.android.gms.measurement.internal.C7775r4
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo22790b() {
        super.mo22790b();
    }

    @Override // com.google.android.gms.measurement.internal.C7711k3, com.google.android.gms.measurement.internal.C7775r4
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo22791c() {
        super.mo22791c();
    }

    @Override // com.google.android.gms.measurement.internal.C7711k3, com.google.android.gms.measurement.internal.C7775r4
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo22792d() {
        super.mo22792d();
    }

    @Override // com.google.android.gms.measurement.internal.C7775r4
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ zzah mo22833e() {
        return super.mo22833e();
    }

    @Override // com.google.android.gms.measurement.internal.C7775r4, com.google.android.gms.measurement.internal.InterfaceC7784s4
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ Context mo22834f() {
        return super.mo22834f();
    }

    @Override // com.google.android.gms.measurement.internal.C7775r4, com.google.android.gms.measurement.internal.InterfaceC7784s4
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ zzfu mo22835g() {
        return super.mo22835g();
    }

    @Override // com.google.android.gms.measurement.internal.C7775r4, com.google.android.gms.measurement.internal.InterfaceC7784s4
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ zzet mo22836h() {
        return super.mo22836h();
    }

    @Override // com.google.android.gms.measurement.internal.C7775r4, com.google.android.gms.measurement.internal.InterfaceC7784s4
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ Clock mo22837j() {
        return super.mo22837j();
    }

    @Override // com.google.android.gms.measurement.internal.C7775r4
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ zzer mo22838k() {
        return super.mo22838k();
    }

    @Override // com.google.android.gms.measurement.internal.C7775r4
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ zzkk mo22839l() {
        return super.mo22839l();
    }

    @Override // com.google.android.gms.measurement.internal.C7775r4
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C7774r3 mo22840m() {
        return super.mo22840m();
    }

    @Override // com.google.android.gms.measurement.internal.C7775r4
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ zzx mo22841n() {
        return super.mo22841n();
    }

    @Override // com.google.android.gms.measurement.internal.C7711k3
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ zzb mo22793o() {
        return super.mo22793o();
    }

    @Override // com.google.android.gms.measurement.internal.C7711k3
    /* renamed from: p */
    public final /* bridge */ /* synthetic */ zzhc mo22794p() {
        return super.mo22794p();
    }

    @Override // com.google.android.gms.measurement.internal.C7711k3
    /* renamed from: q */
    public final /* bridge */ /* synthetic */ zzeq mo22795q() {
        return super.mo22795q();
    }

    @Override // com.google.android.gms.measurement.internal.C7711k3
    /* renamed from: r */
    public final /* bridge */ /* synthetic */ zzik mo22796r() {
        return super.mo22796r();
    }

    @Override // com.google.android.gms.measurement.internal.C7711k3
    /* renamed from: s */
    public final /* bridge */ /* synthetic */ zzif mo22797s() {
        return super.mo22797s();
    }

    @Override // com.google.android.gms.measurement.internal.C7711k3
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ zzep mo22798t() {
        return super.mo22798t();
    }

    @Override // com.google.android.gms.measurement.internal.C7711k3
    /* renamed from: u */
    public final /* bridge */ /* synthetic */ zzjl mo22799u() {
        return super.mo22799u();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:0|1|(1:3)(6:100|101|(1:103)(2:118|(1:120))|104|105|(27:107|(1:109)(1:116)|111|112|5|(1:99)(1:9)|10|(1:98)(1:14)|15|(1:(1:18)(1:19))|(2:21|(2:23|(1:25))(1:(1:(14:36|37|(1:41)|42|43|(1:45)(1:94)|46|47|(2:91|(1:93))(4:51|(1:53)(1:90)|54|(1:89))|(1:59)|61|(3:63|(3:65|(1:67)(3:69|(3:72|(1:74)(1:75)|70)|76)|68)(0)|(1:78))|79|(1:(2:82|83)(2:85|86))(2:87|88))(1:35))(2:29|(1:31))))|97|37|(2:39|41)|42|43|(0)(0)|46|47|(1:49)|91|(0)|(0)|61|(0)|79|(0)(0)))|4|5|(1:7)|99|10|(1:12)|98|15|(0)|(0)|97|37|(0)|42|43|(0)(0)|46|47|(0)|91|(0)|(0)|61|(0)|79|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x020d, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x020e, code lost:
    
        mo22836h().m23137H().m23149c("getGoogleAppId or isMeasurementEnabled failed with exception. appId", com.google.android.gms.measurement.internal.zzet.m23131x(r0), r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ac A[Catch: IllegalStateException -> 0x020d, TRY_ENTER, TryCatch #3 {IllegalStateException -> 0x020d, blocks: (B:43:0x0195, B:46:0x01a2, B:49:0x01ac, B:51:0x01b8, B:54:0x01cf, B:56:0x01d7, B:59:0x01fb, B:89:0x01dd, B:91:0x01e4, B:93:0x01ea), top: B:42:0x0195 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01fb A[Catch: IllegalStateException -> 0x020d, TRY_LEAVE, TryCatch #3 {IllegalStateException -> 0x020d, blocks: (B:43:0x0195, B:46:0x01a2, B:49:0x01ac, B:51:0x01b8, B:54:0x01cf, B:56:0x01d7, B:59:0x01fb, B:89:0x01dd, B:91:0x01e4, B:93:0x01ea), top: B:42:0x0195 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ea A[Catch: IllegalStateException -> 0x020d, TryCatch #3 {IllegalStateException -> 0x020d, blocks: (B:43:0x0195, B:46:0x01a2, B:49:0x01ac, B:51:0x01b8, B:54:0x01cf, B:56:0x01d7, B:59:0x01fb, B:89:0x01dd, B:91:0x01e4, B:93:0x01ea), top: B:42:0x0195 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a1  */
    @Override // com.google.android.gms.measurement.internal.AbstractC7800u2
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void mo22855v() {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzeq.mo22855v():void");
    }
}
