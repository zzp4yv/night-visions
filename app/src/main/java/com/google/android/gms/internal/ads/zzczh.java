package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzczh {

    /* renamed from: a */
    private final E f25369a;

    /* renamed from: b */
    private final List<zzbbh<?>> f25370b;

    /* renamed from: c */
    private final /* synthetic */ zzczf f25371c;

    private zzczh(zzczf zzczfVar, E e2, List<zzbbh<?>> list) {
        this.f25371c = zzczfVar;
        this.f25369a = e2;
        this.f25370b = list;
    }

    /* renamed from: a */
    public final <O> zzczl<O> m19102a(Callable<O> callable) {
        zzbbl zzbblVar;
        zzbbc m17377n = zzbar.m17377n(this.f25370b);
        zzbbh m17379a = m17377n.m17379a(CallableC6612eq.f18831f, zzbbm.f22758b);
        zzczf zzczfVar = this.f25371c;
        E e2 = this.f25369a;
        List<zzbbh<?>> list = this.f25370b;
        zzbblVar = zzczfVar.f25366b;
        return new zzczl<>(zzczfVar, e2, m17379a, list, m17377n.m17379a(callable, zzbblVar));
    }
}
