package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzk;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzcsv implements zzcva<zzcsu> {

    /* renamed from: a */
    private final Context f25038a;

    /* renamed from: b */
    private final zzbbl f25039b;

    public zzcsv(Context context, zzbbl zzbblVar) {
        this.f25038a = context;
        this.f25039b = zzbblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    /* renamed from: b */
    public final zzbbh<zzcsu> mo14982b() {
        return this.f25039b.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.eo

            /* renamed from: f */
            private final zzcsv f18829f;

            {
                this.f18829f = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String mo17093g;
                String mo17086A;
                String str;
                zzk.zzlg();
                zzuu mo17101o = zzk.zzlk().m17061r().mo17101o();
                Bundle bundle = null;
                if (mo17101o != null && (!zzk.zzlk().m17061r().mo17097k() || !zzk.zzlk().m17061r().mo17088b())) {
                    if (mo17101o.m20639i()) {
                        mo17101o.m20634a();
                    }
                    zzuo m20638g = mo17101o.m20638g();
                    if (m20638g != null) {
                        mo17093g = m20638g.m20614i();
                        str = m20638g.m20615j();
                        mo17086A = m20638g.m20616k();
                        if (mo17093g != null) {
                            zzk.zzlk().m17061r().mo17098l(mo17093g);
                        }
                        if (mo17086A != null) {
                            zzk.zzlk().m17061r().mo17102p(mo17086A);
                        }
                    } else {
                        mo17093g = zzk.zzlk().m17061r().mo17093g();
                        mo17086A = zzk.zzlk().m17061r().mo17086A();
                        str = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    if (mo17086A != null && !zzk.zzlk().m17061r().mo17088b()) {
                        bundle2.putString("v_fp_vertical", mo17086A);
                    }
                    if (mo17093g != null && !zzk.zzlk().m17061r().mo17097k()) {
                        bundle2.putString("fingerprint", mo17093g);
                        if (!mo17093g.equals(str)) {
                            bundle2.putString("v_fp", str);
                        }
                    }
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                }
                return new zzcsu(bundle);
            }
        });
    }
}
