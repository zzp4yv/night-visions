package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

@zzard
/* loaded from: classes2.dex */
public final class zzbhq extends zzaas {

    /* renamed from: f */
    private final zzbdf f23050f;

    /* renamed from: h */
    private final boolean f23052h;

    /* renamed from: i */
    private final boolean f23053i;

    /* renamed from: j */
    private int f23054j;

    /* renamed from: k */
    private zzaau f23055k;

    /* renamed from: l */
    private boolean f23056l;

    /* renamed from: n */
    private float f23058n;

    /* renamed from: o */
    private float f23059o;

    /* renamed from: p */
    private float f23060p;

    /* renamed from: q */
    private boolean f23061q;

    /* renamed from: r */
    private boolean f23062r;

    /* renamed from: g */
    private final Object f23051g = new Object();

    /* renamed from: m */
    private boolean f23057m = true;

    public zzbhq(zzbdf zzbdfVar, float f2, boolean z, boolean z2) {
        this.f23050f = zzbdfVar;
        this.f23058n = f2;
        this.f23052h = z;
        this.f23053i = z2;
    }

    /* renamed from: j7 */
    private final void m17705j7(final int i2, final int i3, final boolean z, final boolean z2) {
        zzbbm.f22757a.execute(new Runnable(this, i2, i3, z, z2) { // from class: com.google.android.gms.internal.ads.gb

            /* renamed from: f */
            private final zzbhq f18960f;

            /* renamed from: g */
            private final int f18961g;

            /* renamed from: h */
            private final int f18962h;

            /* renamed from: i */
            private final boolean f18963i;

            /* renamed from: j */
            private final boolean f18964j;

            {
                this.f18960f = this;
                this.f18961g = i2;
                this.f18962h = i3;
                this.f18963i = z;
                this.f18964j = z2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f18960f.m17709l7(this.f18961g, this.f18962h, this.f18963i, this.f18964j);
            }
        });
    }

    /* renamed from: o7 */
    private final void m17706o7(String str, Map<String, String> map) {
        final HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        zzbbm.f22757a.execute(new Runnable(this, hashMap) { // from class: com.google.android.gms.internal.ads.fb

            /* renamed from: f */
            private final zzbhq f18875f;

            /* renamed from: g */
            private final Map f18876g;

            {
                this.f18875f = this;
                this.f18876g = hashMap;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f18875f.m17712p7(this.f18876g);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    /* renamed from: F */
    public final int mo16190F() {
        int i2;
        synchronized (this.f23051g) {
            i2 = this.f23054j;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    /* renamed from: G1 */
    public final boolean mo16191G1() {
        boolean z;
        synchronized (this.f23051g) {
            z = this.f23057m;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    /* renamed from: Q6 */
    public final float mo16192Q6() {
        float f2;
        synchronized (this.f23051g) {
            f2 = this.f23058n;
        }
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    /* renamed from: R1 */
    public final void mo16193R1(zzaau zzaauVar) {
        synchronized (this.f23051g) {
            this.f23055k = zzaauVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    /* renamed from: S5 */
    public final float mo16194S5() {
        float f2;
        synchronized (this.f23051g) {
            f2 = this.f23059o;
        }
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    /* renamed from: T */
    public final float mo16195T() {
        float f2;
        synchronized (this.f23051g) {
            f2 = this.f23060p;
        }
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    /* renamed from: a5 */
    public final zzaau mo16196a5() throws RemoteException {
        zzaau zzaauVar;
        synchronized (this.f23051g) {
            zzaauVar = this.f23055k;
        }
        return zzaauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    /* renamed from: d1 */
    public final boolean mo16197d1() {
        boolean z;
        boolean mo16199l5 = mo16199l5();
        synchronized (this.f23051g) {
            if (!mo16199l5) {
                try {
                    z = this.f23062r && this.f23053i;
                } finally {
                }
            }
        }
        return z;
    }

    /* renamed from: i7 */
    public final void m17707i7(float f2, float f3, int i2, boolean z, float f4) {
        boolean z2;
        int i3;
        synchronized (this.f23051g) {
            this.f23058n = f3;
            this.f23059o = f2;
            z2 = this.f23057m;
            this.f23057m = z;
            i3 = this.f23054j;
            this.f23054j = i2;
            float f5 = this.f23060p;
            this.f23060p = f4;
            if (Math.abs(f4 - f5) > 1.0E-4f) {
                this.f23050f.getView().invalidate();
            }
        }
        m17705j7(i3, i2, z2, z);
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    /* renamed from: k5 */
    public final void mo16198k5() {
        m17706o7("play", null);
    }

    /* renamed from: k7 */
    public final void m17708k7() {
        boolean z;
        int i2;
        synchronized (this.f23051g) {
            z = this.f23057m;
            i2 = this.f23054j;
            this.f23054j = 3;
        }
        m17705j7(i2, 3, z, z);
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    /* renamed from: l5 */
    public final boolean mo16199l5() {
        boolean z;
        synchronized (this.f23051g) {
            z = this.f23052h && this.f23061q;
        }
        return z;
    }

    /* renamed from: l7 */
    final /* synthetic */ void m17709l7(int i2, int i3, boolean z, boolean z2) {
        zzaau zzaauVar;
        zzaau zzaauVar2;
        zzaau zzaauVar3;
        synchronized (this.f23051g) {
            boolean z3 = i2 != i3;
            boolean z4 = this.f23056l;
            boolean z5 = !z4 && i3 == 1;
            boolean z6 = z3 && i3 == 1;
            boolean z7 = z3 && i3 == 2;
            boolean z8 = z3 && i3 == 3;
            boolean z9 = z != z2;
            this.f23056l = z4 || z5;
            if (z5) {
                try {
                    zzaau zzaauVar4 = this.f23055k;
                    if (zzaauVar4 != null) {
                        zzaauVar4.onVideoStart();
                    }
                } catch (RemoteException e2) {
                    zzbad.m17350f("#007 Could not call remote method.", e2);
                }
            }
            if (z6 && (zzaauVar3 = this.f23055k) != null) {
                zzaauVar3.onVideoPlay();
            }
            if (z7 && (zzaauVar2 = this.f23055k) != null) {
                zzaauVar2.onVideoPause();
            }
            if (z8) {
                zzaau zzaauVar5 = this.f23055k;
                if (zzaauVar5 != null) {
                    zzaauVar5.mo16203n0();
                }
                this.f23050f.mo14885M();
            }
            if (z9 && (zzaauVar = this.f23055k) != null) {
                zzaauVar.mo16202T0(z2);
            }
        }
    }

    /* renamed from: m7 */
    public final void m17710m7(zzacd zzacdVar) {
        boolean z = zzacdVar.f21574f;
        boolean z2 = zzacdVar.f21575g;
        boolean z3 = zzacdVar.f21576h;
        synchronized (this.f23051g) {
            this.f23061q = z2;
            this.f23062r = z3;
        }
        m17706o7("initialState", CollectionUtils.m14613d("muteStart", z ? "1" : "0", "customControlsRequested", z2 ? "1" : "0", "clickToExpandRequested", z3 ? "1" : "0"));
    }

    /* renamed from: n7 */
    public final void m17711n7(float f2) {
        synchronized (this.f23051g) {
            this.f23059o = f2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    /* renamed from: o2 */
    public final void mo16200o2(boolean z) {
        m17706o7(z ? "mute" : "unmute", null);
    }

    /* renamed from: p7 */
    final /* synthetic */ void m17712p7(Map map) {
        this.f23050f.mo14940y("pubVideoCmd", map);
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final void pause() {
        m17706o7("pause", null);
    }
}
