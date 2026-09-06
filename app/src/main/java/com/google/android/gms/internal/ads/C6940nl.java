package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: com.google.android.gms.internal.ads.nl */
/* loaded from: classes2.dex */
final class C6940nl<T> implements zzban<T> {

    /* renamed from: a */
    private final /* synthetic */ String f20096a;

    /* renamed from: b */
    private final /* synthetic */ long f20097b;

    /* renamed from: c */
    private final /* synthetic */ zzcmu f20098c;

    C6940nl(zzcmu zzcmuVar, String str, long j2) {
        this.f20098c = zzcmuVar;
        this.f20096a = str;
        this.f20097b = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    /* renamed from: a */
    public final void mo14742a(Throwable th) {
        Clock clock;
        clock = this.f20098c.f24742a;
        long mo14609b = clock.mo14609b();
        int i2 = 3;
        if (th instanceof TimeoutException) {
            i2 = 2;
        } else if (!(th instanceof zzcmk)) {
            i2 = th instanceof CancellationException ? 4 : ((th instanceof zzcgm) && ((zzcgm) th).m18774a() == 3) ? 1 : 6;
        }
        this.f20098c.m18883d(this.f20096a, i2, mo14609b - this.f20097b);
    }

    @Override // com.google.android.gms.internal.ads.zzban
    /* renamed from: b */
    public final void mo14743b(T t) {
        Clock clock;
        clock = this.f20098c.f24742a;
        this.f20098c.m18883d(this.f20096a, 0, clock.mo14609b() - this.f20097b);
    }
}
