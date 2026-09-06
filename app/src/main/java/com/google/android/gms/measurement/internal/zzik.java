package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
@VisibleForTesting
/* loaded from: classes2.dex */
public final class zzik extends AbstractC7800u2 {

    /* renamed from: c */
    private final zzjc f29338c;

    /* renamed from: d */
    private zzel f29339d;

    /* renamed from: e */
    private volatile Boolean f29340e;

    /* renamed from: f */
    private final AbstractC7662f f29341f;

    /* renamed from: g */
    private final C7643c7 f29342g;

    /* renamed from: h */
    private final List<Runnable> f29343h;

    /* renamed from: i */
    private final AbstractC7662f f29344i;

    protected zzik(zzfx zzfxVar) {
        super(zzfxVar);
        this.f29343h = new ArrayList();
        this.f29342g = new C7643c7(zzfxVar.mo22837j());
        this.f29338c = new zzjc(this);
        this.f29341f = new C7812v5(this, zzfxVar);
        this.f29344i = new C7660e6(this, zzfxVar);
    }

    /* renamed from: B */
    static /* synthetic */ zzel m23343B(zzik zzikVar, zzel zzelVar) {
        zzikVar.f29339d = null;
        return null;
    }

    /* renamed from: D */
    private final zzm m23345D(boolean z) {
        mo22832G();
        return mo22795q().m23109B(z ? mo22836h().m23146Q() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public final void m23346E(ComponentName componentName) {
        mo22792d();
        if (this.f29339d != null) {
            this.f29339d = null;
            mo22836h().m23145P().m23148b("Disconnected from device MeasurementService", componentName);
            mo22792d();
            m23374Z();
        }
    }

    /* renamed from: R */
    private final void m23348R(Runnable runnable) throws IllegalStateException {
        mo22792d();
        if (m23370V()) {
            runnable.run();
        } else {
            if (this.f29343h.size() >= 1000) {
                mo22836h().m23137H().m23147a("Discarding data. Max runnable queue size reached");
                return;
            }
            this.f29343h.add(runnable);
            this.f29344i.m22774c(60000L);
            m23374Z();
        }
    }

    /* renamed from: c0 */
    private final boolean m23349c0() {
        mo22832G();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public final void m23350d0() {
        mo22792d();
        this.f29342g.m22767a();
        this.f29341f.m22774c(zzap.f29107N.m23095a(null).longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public final void m23351e0() {
        mo22792d();
        if (m23370V()) {
            mo22836h().m23145P().m23147a("Inactivity, disconnecting from the service");
            m23376b0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public final void m23352f0() {
        mo22792d();
        mo22836h().m23145P().m23148b("Processing queued up service tasks", Integer.valueOf(this.f29343h.size()));
        Iterator<Runnable> it = this.f29343h.iterator();
        while (it.hasNext()) {
            try {
                it.next().run();
            } catch (Exception e2) {
                mo22836h().m23137H().m23148b("Task exception while flushing queue", e2);
            }
        }
        this.f29343h.clear();
        this.f29344i.m22776e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC7800u2
    /* renamed from: A */
    protected final boolean mo22854A() {
        return false;
    }

    /* renamed from: F */
    public final void m23357F(zzn zznVar) {
        mo22792d();
        m22857x();
        m23348R(new RunnableC7624a6(this, m23345D(false), zznVar));
    }

    @Override // com.google.android.gms.measurement.internal.C7775r4, com.google.android.gms.measurement.internal.InterfaceC7784s4
    /* renamed from: G */
    public final /* bridge */ /* synthetic */ zzw mo22832G() {
        return super.mo22832G();
    }

    /* renamed from: H */
    public final void m23358H(zzn zznVar, zzan zzanVar, String str) {
        mo22792d();
        m22857x();
        if (mo22839l().m23549u(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE) == 0) {
            m23348R(new RunnableC7633b6(this, zzanVar, str, zznVar));
        } else {
            mo22836h().m23140K().m23147a("Not bundling data. Service unavailable or out of date");
            mo22839l().m23536S(zznVar, new byte[0]);
        }
    }

    /* renamed from: I */
    protected final void m23359I(zzn zznVar, String str, String str2) {
        mo22792d();
        m22857x();
        m23348R(new RunnableC7687h6(this, str, str2, m23345D(false), zznVar));
    }

    /* renamed from: J */
    protected final void m23360J(zzn zznVar, String str, String str2, boolean z) {
        mo22792d();
        m22857x();
        m23348R(new RunnableC7705j6(this, str, str2, z, m23345D(false), zznVar));
    }

    /* renamed from: K */
    protected final void m23361K(zzan zzanVar, String str) {
        Preconditions.m14372k(zzanVar);
        mo22792d();
        m22857x();
        boolean m23349c0 = m23349c0();
        m23348R(new RunnableC7678g6(this, m23349c0, m23349c0 && mo22798t().m23102E(zzanVar), zzanVar, m23345D(true), str));
    }

    @VisibleForTesting
    /* renamed from: L */
    protected final void m23362L(zzel zzelVar) {
        mo22792d();
        Preconditions.m14372k(zzelVar);
        this.f29339d = zzelVar;
        m23350d0();
        m23352f0();
    }

    @VisibleForTesting
    /* renamed from: M */
    final void m23363M(zzel zzelVar, AbstractSafeParcelable abstractSafeParcelable, zzm zzmVar) {
        int i2;
        List<AbstractSafeParcelable> m23101C;
        mo22792d();
        mo22790b();
        m22857x();
        boolean m23349c0 = m23349c0();
        int i3 = 0;
        int i4 = 100;
        while (i3 < 1001 && i4 == 100) {
            ArrayList arrayList = new ArrayList();
            if (!m23349c0 || (m23101C = mo22798t().m23101C(100)) == null) {
                i2 = 0;
            } else {
                arrayList.addAll(m23101C);
                i2 = m23101C.size();
            }
            if (abstractSafeParcelable != null && i2 < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) obj;
                if (abstractSafeParcelable2 instanceof zzan) {
                    try {
                        zzelVar.mo23086Z5((zzan) abstractSafeParcelable2, zzmVar);
                    } catch (RemoteException e2) {
                        mo22836h().m23137H().m23148b("Failed to send event to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof zzkj) {
                    try {
                        zzelVar.mo23087b4((zzkj) abstractSafeParcelable2, zzmVar);
                    } catch (RemoteException e3) {
                        mo22836h().m23137H().m23148b("Failed to send attribute to the service", e3);
                    }
                } else if (abstractSafeParcelable2 instanceof zzv) {
                    try {
                        zzelVar.mo23089h2((zzv) abstractSafeParcelable2, zzmVar);
                    } catch (RemoteException e4) {
                        mo22836h().m23137H().m23148b("Failed to send conditional property to the service", e4);
                    }
                } else {
                    mo22836h().m23137H().m23147a("Discarding data. Unrecognized parcel type.");
                }
            }
            i3++;
            i4 = i2;
        }
    }

    /* renamed from: N */
    protected final void m23364N(zzig zzigVar) {
        mo22792d();
        m22857x();
        m23348R(new RunnableC7642c6(this, zzigVar));
    }

    /* renamed from: P */
    protected final void m23365P(zzkj zzkjVar) {
        mo22792d();
        m22857x();
        m23348R(new RunnableC7821w5(this, m23349c0() && mo22798t().m23103F(zzkjVar), zzkjVar, m23345D(true)));
    }

    /* renamed from: Q */
    protected final void m23366Q(zzv zzvVar) {
        Preconditions.m14372k(zzvVar);
        mo22792d();
        m22857x();
        mo22832G();
        m23348R(new RunnableC7669f6(this, true, mo22798t().m23104H(zzvVar), new zzv(zzvVar), m23345D(true), zzvVar));
    }

    /* renamed from: S */
    public final void m23367S(AtomicReference<String> atomicReference) {
        mo22792d();
        m22857x();
        m23348R(new RunnableC7830x5(this, atomicReference, m23345D(false)));
    }

    /* renamed from: T */
    protected final void m23368T(AtomicReference<List<zzv>> atomicReference, String str, String str2, String str3) {
        mo22792d();
        m22857x();
        m23348R(new RunnableC7696i6(this, atomicReference, str, str2, str3, m23345D(false)));
    }

    /* renamed from: U */
    protected final void m23369U(AtomicReference<List<zzkj>> atomicReference, String str, String str2, String str3, boolean z) {
        mo22792d();
        m22857x();
        m23348R(new RunnableC7723l6(this, atomicReference, str, str2, str3, z, m23345D(false)));
    }

    /* renamed from: V */
    public final boolean m23370V() {
        mo22792d();
        m22857x();
        return this.f29339d != null;
    }

    /* renamed from: W */
    protected final void m23371W() {
        mo22792d();
        m22857x();
        m23348R(new RunnableC7651d6(this, m23345D(true)));
    }

    /* renamed from: X */
    protected final void m23372X() {
        mo22792d();
        mo22790b();
        m22857x();
        zzm m23345D = m23345D(false);
        if (m23349c0()) {
            mo22798t().m23105I();
        }
        m23348R(new RunnableC7839y5(this, m23345D));
    }

    /* renamed from: Y */
    protected final void m23373Y() {
        mo22792d();
        m22857x();
        zzm m23345D = m23345D(true);
        boolean m23587r = mo22841n().m23587r(zzap.f29094G0);
        if (m23587r) {
            mo22798t().m23106J();
        }
        m23348R(new RunnableC7847z5(this, m23345D, m23587r));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010c  */
    /* renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void m23374Z() {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzik.m23374Z():void");
    }

    @Override // com.google.android.gms.measurement.internal.C7711k3, com.google.android.gms.measurement.internal.C7775r4
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo22789a() {
        super.mo22789a();
    }

    /* renamed from: a0 */
    final Boolean m23375a0() {
        return this.f29340e;
    }

    @Override // com.google.android.gms.measurement.internal.C7711k3, com.google.android.gms.measurement.internal.C7775r4
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo22790b() {
        super.mo22790b();
    }

    /* renamed from: b0 */
    public final void m23376b0() {
        mo22792d();
        m22857x();
        this.f29338c.m23378a();
        try {
            ConnectionTracker.m14575b().m14581c(mo22834f(), this.f29338c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f29339d = null;
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
}
