package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcnw implements zzcka<zzcdb, zzams, zzclb> {

    /* renamed from: a */
    private final Context f24793a;

    /* renamed from: b */
    private final Executor f24794b;

    /* renamed from: c */
    private final zzcdf f24795c;

    public zzcnw(Context context, Executor executor, zzcdf zzcdfVar) {
        this.f24793a = context;
        this.f24794b = executor;
        this.f24795c = zzcdfVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static void m18892e(zzcxu zzcxuVar, zzcxm zzcxmVar, zzcjy<zzams, zzclb> zzcjyVar) {
        try {
            zzcjyVar.f24422b.mo16710o6(zzcxuVar.f25288a.f25282a.f25293d, zzcxmVar.f25261s.toString());
        } catch (Exception e2) {
            String valueOf = String.valueOf(zzcjyVar.f24421a);
            zzbad.m17348d(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcka
    /* renamed from: a */
    public final /* synthetic */ zzcdb mo18851a(zzcxu zzcxuVar, zzcxm zzcxmVar, final zzcjy<zzams, zzclb> zzcjyVar) throws RemoteException, zzcmw {
        zzcdc mo15433a = this.f24795c.mo15433a(new zzbpr(zzcxuVar, zzcxmVar, zzcjyVar.f24421a), new zzcdd(new zzbwz(zzcjyVar) { // from class: com.google.android.gms.internal.ads.dm

            /* renamed from: a */
            private final zzcjy f18693a;

            {
                this.f18693a = zzcjyVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbwz
            /* renamed from: a */
            public final void mo14951a(boolean z, Context context) {
                zzcjy zzcjyVar2 = this.f18693a;
                try {
                    ((zzams) zzcjyVar2.f24422b).setImmersiveMode(z);
                    ((zzams) zzcjyVar2.f24422b).showVideo();
                } catch (RemoteException e2) {
                    zzbad.m17348d("Cannot show rewarded video.", e2);
                }
            }
        }));
        mo15433a.mo14754a().m18332V(new zzccy(zzcjyVar.f24422b), this.f24794b);
        zzbse mo14755b = mo15433a.mo14755b();
        zzbri mo14756c = mo15433a.mo14756c();
        zzcjyVar.f24423c.m18862i7(new BinderC6719hm(this, mo15433a.mo15505h(), mo14756c, mo14755b, mo15433a.mo15508k()));
        return mo15433a.mo15507j();
    }

    @Override // com.google.android.gms.internal.ads.zzcka
    /* renamed from: b */
    public final void mo18852b(zzcxu zzcxuVar, zzcxm zzcxmVar, zzcjy<zzams, zzclb> zzcjyVar) throws RemoteException {
        if (zzcjyVar.f24422b.isInitialized()) {
            m18892e(zzcxuVar, zzcxmVar, zzcjyVar);
            return;
        }
        zzcjyVar.f24423c.m18863j7(new C6608em(this, zzcxuVar, zzcxmVar, zzcjyVar));
        zzcjyVar.f24422b.mo16709h4(ObjectWrapper.m14708E0(this.f24793a), zzcxuVar.f25288a.f25282a.f25293d, null, zzcjyVar.f24423c, zzcxmVar.f25261s.toString());
    }
}
