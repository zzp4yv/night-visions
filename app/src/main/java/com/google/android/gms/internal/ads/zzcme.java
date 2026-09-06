package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzcme implements zzcka<zzbyn, zzams, zzcla> {

    /* renamed from: a */
    private final Context f24697a;

    /* renamed from: b */
    private final zzbxo f24698b;

    public zzcme(Context context, zzbxo zzbxoVar) {
        this.f24697a = context;
        this.f24698b = zzbxoVar;
    }

    /* renamed from: c */
    private static boolean m18877c(zzcxu zzcxuVar, int i2) {
        return zzcxuVar.f25288a.f25282a.f25296g.contains(Integer.toString(i2));
    }

    @Override // com.google.android.gms.internal.ads.zzcka
    /* renamed from: a */
    public final /* synthetic */ zzbyn mo18851a(zzcxu zzcxuVar, zzcxm zzcxmVar, zzcjy<zzams, zzcla> zzcjyVar) throws RemoteException, zzcmw {
        zzbyt m18512r;
        zzana mo16705b7 = zzcjyVar.f24422b.mo16705b7();
        zzand mo16707e6 = zzcjyVar.f24422b.mo16707e6();
        zzang mo16701P1 = zzcjyVar.f24422b.mo16701P1();
        if (mo16701P1 != null && m18877c(zzcxuVar, 6)) {
            m18512r = zzbyt.m18507J(mo16701P1);
        } else if (mo16705b7 != null && m18877c(zzcxuVar, 6)) {
            m18512r = zzbyt.m18505H(mo16705b7);
        } else if (mo16705b7 != null && m18877c(zzcxuVar, 2)) {
            m18512r = zzbyt.m18511q(mo16705b7);
        } else if (mo16707e6 != null && m18877c(zzcxuVar, 6)) {
            m18512r = zzbyt.m18506I(mo16707e6);
        } else {
            if (mo16707e6 == null || !m18877c(zzcxuVar, 1)) {
                throw new zzcmw("No native ad mappers", 0);
            }
            m18512r = zzbyt.m18512r(mo16707e6);
        }
        if (!zzcxuVar.f25288a.f25282a.f25296g.contains(Integer.toString(m18512r.m18552w()))) {
            throw new zzcmw("No corresponding native ad listener", 0);
        }
        zzbyw mo16090b = this.f24698b.mo16090b(new zzbpr(zzcxuVar, zzcxmVar, zzcjyVar.f24421a), new zzbzf(m18512r), new zzcag(mo16707e6, mo16705b7, mo16701P1));
        zzcjyVar.f24423c.m18861i7(mo16090b.mo14759f());
        return mo16090b.mo14760g();
    }

    @Override // com.google.android.gms.internal.ads.zzcka
    /* renamed from: b */
    public final void mo18852b(zzcxu zzcxuVar, zzcxm zzcxmVar, zzcjy<zzams, zzcla> zzcjyVar) throws RemoteException {
        zzams zzamsVar = zzcjyVar.f24422b;
        IObjectWrapper m14708E0 = ObjectWrapper.m14708E0(this.f24697a);
        zzxz zzxzVar = zzcxuVar.f25288a.f25282a.f25293d;
        String jSONObject = zzcxmVar.f25261s.toString();
        String m17259a = zzazc.m17259a(zzcxmVar.f25258p);
        zzcla zzclaVar = zzcjyVar.f24423c;
        zzcxv zzcxvVar = zzcxuVar.f25288a.f25282a;
        zzamsVar.mo16700M3(m14708E0, zzxzVar, jSONObject, m17259a, zzclaVar, zzcxvVar.f25298i, zzcxvVar.f25296g);
    }
}
