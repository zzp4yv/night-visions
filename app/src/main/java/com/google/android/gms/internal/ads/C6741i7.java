package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: com.google.android.gms.internal.ads.i7 */
/* loaded from: classes2.dex */
final class C6741i7<T> implements zzban<T> {

    /* renamed from: a */
    private final /* synthetic */ zzbbw f19295a;

    C6741i7(zzbbw zzbbwVar) {
        this.f19295a = zzbbwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    /* renamed from: a */
    public final void mo14742a(Throwable th) {
        AtomicInteger atomicInteger;
        atomicInteger = this.f19295a.f22769b;
        atomicInteger.set(-1);
    }

    @Override // com.google.android.gms.internal.ads.zzban
    /* renamed from: b */
    public final void mo14743b(T t) {
        AtomicInteger atomicInteger;
        atomicInteger = this.f19295a.f22769b;
        atomicInteger.set(1);
    }
}
