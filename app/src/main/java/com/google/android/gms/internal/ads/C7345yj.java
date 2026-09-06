package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.google.android.gms.internal.ads.yj */
/* loaded from: classes2.dex */
final class C7345yj implements zzban<SQLiteDatabase> {

    /* renamed from: a */
    private final /* synthetic */ zzczc f21306a;

    C7345yj(zzcjc zzcjcVar, zzczc zzczcVar) {
        this.f21306a = zzczcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    /* renamed from: a */
    public final void mo14742a(Throwable th) {
        String valueOf = String.valueOf(th.getMessage());
        zzbad.m17351g(valueOf.length() != 0 ? "Failed to get offline signal database: ".concat(valueOf) : new String("Failed to get offline signal database: "));
    }

    @Override // com.google.android.gms.internal.ads.zzban
    /* renamed from: b */
    public final /* synthetic */ void mo14743b(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f21306a.mo14763a(sQLiteDatabase);
        } catch (Exception e2) {
            String valueOf = String.valueOf(e2.getMessage());
            zzbad.m17351g(valueOf.length() != 0 ? "Error executing function on offline signal database: ".concat(valueOf) : new String("Error executing function on offline signal database: "));
        }
    }
}
