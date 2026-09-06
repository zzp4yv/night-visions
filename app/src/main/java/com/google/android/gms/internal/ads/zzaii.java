package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.zzk;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

@zzard
/* loaded from: classes2.dex */
public final class zzaii implements zzm {

    /* renamed from: a */
    private volatile zzahz f22059a;

    /* renamed from: b */
    private final Context f22060b;

    public zzaii(Context context) {
        this.f22060b = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final void m16586b() {
        if (this.f22059a == null) {
            return;
        }
        this.f22059a.disconnect();
        Binder.flushPendingCommands();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzm
    /* renamed from: a */
    public final zzp mo16589a(zzr<?> zzrVar) throws zzaf {
        zzaia m16584y = zzaia.m16584y(zzrVar);
        long mo14609b = zzk.zzln().mo14609b();
        try {
            zzbbr zzbbrVar = new zzbbr();
            this.f22059a = new zzahz(this.f22060b, zzk.zzlu().m17276b(), new C7104s0(this, zzbbrVar), new C7141t0(this, zzbbrVar));
            this.f22059a.checkAvailabilityAndConnect();
            C6993p0 c6993p0 = new C6993p0(this, m16584y);
            zzbbl zzbblVar = zzaxg.f22651a;
            zzbbh m17365b = zzbar.m17365b(zzbar.m17366c(zzbbrVar, c6993p0, zzbblVar), ((Integer) zzyt.m20848e().m16421c(zzacu.f21620E3)).intValue(), TimeUnit.MILLISECONDS, zzaxg.f22653c);
            m17365b.mo14748k(new RunnableC7067r0(this), zzbblVar);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) m17365b.get();
            long mo14609b2 = zzk.zzln().mo14609b() - mo14609b;
            StringBuilder sb = new StringBuilder(52);
            sb.append("Http assets remote cache took ");
            sb.append(mo14609b2);
            sb.append("ms");
            zzawz.m17082m(sb.toString());
            zzaic zzaicVar = (zzaic) new zzaru(parcelFileDescriptor).m16900y(zzaic.CREATOR);
            if (zzaicVar == null) {
                return null;
            }
            if (zzaicVar.f22051f) {
                throw new zzaf(zzaicVar.f22052g);
            }
            if (zzaicVar.f22055j.length != zzaicVar.f22056k.length) {
                return null;
            }
            HashMap hashMap = new HashMap();
            int i2 = 0;
            while (true) {
                String[] strArr = zzaicVar.f22055j;
                if (i2 >= strArr.length) {
                    return new zzp(zzaicVar.f22053h, zzaicVar.f22054i, hashMap, zzaicVar.f22057l, zzaicVar.f22058m);
                }
                hashMap.put(strArr[i2], zzaicVar.f22056k[i2]);
                i2++;
            }
        } catch (InterruptedException | ExecutionException unused) {
            long mo14609b3 = zzk.zzln().mo14609b() - mo14609b;
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("Http assets remote cache took ");
            sb2.append(mo14609b3);
            sb2.append("ms");
            zzawz.m17082m(sb2.toString());
            return null;
        } catch (Throwable th) {
            long mo14609b4 = zzk.zzln().mo14609b() - mo14609b;
            StringBuilder sb3 = new StringBuilder(52);
            sb3.append("Http assets remote cache took ");
            sb3.append(mo14609b4);
            sb3.append("ms");
            zzawz.m17082m(sb3.toString());
            throw th;
        }
    }
}
