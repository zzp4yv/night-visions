package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzczj {

    /* renamed from: a */
    private final E f25372a;

    /* renamed from: b */
    private final /* synthetic */ zzczf f25373b;

    private zzczj(zzczf zzczfVar, E e2) {
        this.f25373b = zzczfVar;
        this.f25372a = e2;
    }

    /* renamed from: b */
    private final <O> zzczl<O> m19103b(Callable<O> callable, zzbbl zzbblVar) {
        zzbbh zzbbhVar;
        zzczf zzczfVar = this.f25373b;
        E e2 = this.f25372a;
        zzbbhVar = zzczf.f25365a;
        return new zzczl<>(zzczfVar, e2, zzbbhVar, Collections.emptyList(), zzbblVar.submit(callable));
    }

    /* renamed from: a */
    public final zzczl<?> m19104a(final zzczd zzczdVar, zzbbl zzbblVar) {
        return m19103b(new Callable(zzczdVar) { // from class: com.google.android.gms.internal.ads.fq

            /* renamed from: f */
            private final zzczd f18914f;

            {
                this.f18914f = zzczdVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.f18914f.run();
                return null;
            }
        }, zzbblVar);
    }

    /* renamed from: c */
    public final <O> zzczl<O> m19105c(zzbbh<O> zzbbhVar) {
        zzbbh zzbbhVar2;
        zzczf zzczfVar = this.f25373b;
        E e2 = this.f25372a;
        zzbbhVar2 = zzczf.f25365a;
        return new zzczl<>(zzczfVar, e2, zzbbhVar2, Collections.emptyList(), zzbbhVar);
    }

    /* renamed from: d */
    public final <O> zzczl<O> m19106d(Callable<O> callable) {
        zzbbl zzbblVar;
        zzbblVar = this.f25373b.f25366b;
        return m19103b(callable, zzbblVar);
    }
}
