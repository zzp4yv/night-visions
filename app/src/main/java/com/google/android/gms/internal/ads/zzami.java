package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

@zzard
/* loaded from: classes2.dex */
public final class zzami extends zzbjg {

    /* renamed from: f */
    private static final AtomicBoolean f22122f = new AtomicBoolean(false);

    /* renamed from: g */
    private final AppMeasurementSdk f22123g;

    private zzami(AppMeasurementSdk appMeasurementSdk) {
        this.f22123g = appMeasurementSdk;
    }

    /* renamed from: h7 */
    public static void m16670h7(final Context context, final String str) {
        if (f22122f.compareAndSet(false, true)) {
            new Thread(new Runnable(context, str) { // from class: com.google.android.gms.internal.ads.q2

                /* renamed from: f */
                private final Context f20368f;

                /* renamed from: g */
                private final String f20369g;

                {
                    this.f20368f = context;
                    this.f20369g = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzami.m16671i7(this.f20368f, this.f20369g);
                }
            }).start();
        }
    }

    /* renamed from: i7 */
    static final /* synthetic */ void m16671i7(Context context, String str) {
        boolean z;
        zzacu.m16423a(context);
        try {
            if (!((Boolean) zzyt.m20848e().m16421c(zzacu.f21635H0)).booleanValue()) {
                if (!((Boolean) zzyt.m20848e().m16421c(zzacu.f21629G0)).booleanValue()) {
                    z = false;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("measurementEnabled", z);
                    ((zzbjh) zzbae.m17356a(context, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", C7069r2.f20424a)).mo17773A1(new zzami(AppMeasurementSdk.m22674k(context, "Ads", "am", str, bundle)));
                    return;
                }
            }
            ((zzbjh) zzbae.m17356a(context, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", C7069r2.f20424a)).mo17773A1(new zzami(AppMeasurementSdk.m22674k(context, "Ads", "am", str, bundle)));
            return;
        } catch (RemoteException | zzbag | NullPointerException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
            return;
        }
        z = true;
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("measurementEnabled", z);
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    /* renamed from: E2 */
    public final long mo16672E2() throws RemoteException {
        return this.f22123g.m22678d();
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    /* renamed from: I3 */
    public final int mo16673I3(String str) throws RemoteException {
        return this.f22123g.m22685l(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    /* renamed from: J2 */
    public final String mo16674J2() throws RemoteException {
        return this.f22123g.m22683i();
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    /* renamed from: L4 */
    public final List mo16675L4(String str, String str2) throws RemoteException {
        return this.f22123g.m22681g(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    /* renamed from: N5 */
    public final void mo16676N5(String str, String str2, IObjectWrapper iObjectWrapper) throws RemoteException {
        this.f22123g.m22692s(str, str2, iObjectWrapper != null ? ObjectWrapper.m14709k0(iObjectWrapper) : null);
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    /* renamed from: O4 */
    public final String mo16677O4() throws RemoteException {
        return this.f22123g.m22682h();
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    /* renamed from: O5 */
    public final void mo16678O5(String str) throws RemoteException {
        this.f22123g.m22675a(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    /* renamed from: Q4 */
    public final void mo16679Q4(Bundle bundle) throws RemoteException {
        this.f22123g.m22690q(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    /* renamed from: V6 */
    public final void mo16680V6(String str) throws RemoteException {
        this.f22123g.m22677c(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        this.f22123g.m22676b(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    /* renamed from: d4 */
    public final Map mo16681d4(String str, String str2, boolean z) throws RemoteException {
        return this.f22123g.m22686m(str, str2, z);
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    /* renamed from: e1 */
    public final void mo16682e1(Bundle bundle) throws RemoteException {
        this.f22123g.m22688o(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    /* renamed from: g2 */
    public final String mo16683g2() throws RemoteException {
        return this.f22123g.m22680f();
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    /* renamed from: l4 */
    public final String mo16684l4() throws RemoteException {
        return this.f22123g.m22679e();
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    /* renamed from: m0 */
    public final void mo16685m0(String str, String str2, Bundle bundle) throws RemoteException {
        this.f22123g.m22687n(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    /* renamed from: o4 */
    public final String mo16686o4() throws RemoteException {
        return this.f22123g.m22684j();
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    /* renamed from: s2 */
    public final Bundle mo16687s2(Bundle bundle) throws RemoteException {
        return this.f22123g.m22689p(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    /* renamed from: z4 */
    public final void mo16688z4(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        this.f22123g.m22691r(iObjectWrapper != null ? (Activity) ObjectWrapper.m14709k0(iObjectWrapper) : null, str, str2);
    }
}
