package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.uy */
/* loaded from: classes2.dex */
final class C7212uy implements o30 {

    /* renamed from: a */
    private final Map<String, List<zzr<?>>> f20658a = new HashMap();

    /* renamed from: b */
    private final zzd f20659b;

    C7212uy(zzd zzdVar) {
        this.f20659b = zzdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final synchronized boolean m15945d(zzr<?> zzrVar) {
        String m20421M = zzrVar.m20421M();
        if (!this.f20658a.containsKey(m20421M)) {
            this.f20658a.put(m20421M, null);
            zzrVar.m20414D(this);
            if (zzag.f21996b) {
                zzag.m16526a("new request, sending to network %s", m20421M);
            }
            return false;
        }
        List<zzr<?>> list = this.f20658a.get(m20421M);
        if (list == null) {
            list = new ArrayList<>();
        }
        zzrVar.m20418I("waiting-for-response");
        list.add(zzrVar);
        this.f20658a.put(m20421M, list);
        if (zzag.f21996b) {
            zzag.m16526a("Request for cacheKey=%s is in flight, putting on hold.", m20421M);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.o30
    /* renamed from: a */
    public final synchronized void mo15671a(zzr<?> zzrVar) {
        String m20421M = zzrVar.m20421M();
        List<zzr<?>> remove = this.f20658a.remove(m20421M);
        if (remove != null && !remove.isEmpty()) {
            if (zzag.f21996b) {
                zzag.m16528c("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(remove.size()), m20421M);
            }
            zzr<?> remove2 = remove.remove(0);
            this.f20658a.put(m20421M, remove);
            remove2.m20414D(this);
            try {
                this.f20659b.f25404h.put(remove2);
            } catch (InterruptedException e2) {
                zzag.m16527b("Couldn't add request to queue. %s", e2.toString());
                Thread.currentThread().interrupt();
                this.f20659b.m19121b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.o30
    /* renamed from: b */
    public final void mo15672b(zzr<?> zzrVar, zzy<?> zzyVar) {
        List<zzr<?>> remove;
        zzc zzcVar = zzyVar.f27424b;
        if (zzcVar == null || zzcVar.m18612a()) {
            mo15671a(zzrVar);
            return;
        }
        String m20421M = zzrVar.m20421M();
        synchronized (this) {
            remove = this.f20658a.remove(m20421M);
        }
        if (remove != null) {
            if (zzag.f21996b) {
                zzag.m16528c("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), m20421M);
            }
            Iterator<zzr<?>> it = remove.iterator();
            while (it.hasNext()) {
                this.f20659b.f25406j.mo16227c(it.next(), zzyVar);
            }
        }
    }
}
