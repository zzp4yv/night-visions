package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzcuz;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzcsk<S extends zzcuz> implements zzcva<S> {

    /* renamed from: a */
    private final AtomicReference<C6462ao<S>> f25024a = new AtomicReference<>();

    /* renamed from: b */
    private final Clock f25025b;

    /* renamed from: c */
    private final zzcva<S> f25026c;

    /* renamed from: d */
    private final long f25027d;

    public zzcsk(zzcva<S> zzcvaVar, long j2, Clock clock) {
        this.f25025b = clock;
        this.f25026c = zzcvaVar;
        this.f25027d = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    /* renamed from: b */
    public final zzbbh<S> mo14982b() {
        C6462ao<S> c6462ao = this.f25024a.get();
        if (c6462ao == null || c6462ao.m14765a()) {
            c6462ao = new C6462ao<>(this.f25026c.mo14982b(), this.f25027d, this.f25025b);
            this.f25024a.set(c6462ao);
        }
        return c6462ao.f18175a;
    }
}
