package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.internal.ads.zzwt;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.zj */
/* loaded from: classes2.dex */
final class C7382zj implements zzban<Bundle> {

    /* renamed from: a */
    private final /* synthetic */ boolean f21464a;

    /* renamed from: b */
    final /* synthetic */ zzcjm f21465b;

    C7382zj(zzcjm zzcjmVar, boolean z) {
        this.f21465b = zzcjmVar;
        this.f21464a = z;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    /* renamed from: a */
    public final void mo14742a(Throwable th) {
        zzbad.m17351g("Failed to get signals bundle");
    }

    @Override // com.google.android.gms.internal.ads.zzban
    /* renamed from: b */
    public final /* synthetic */ void mo14743b(Bundle bundle) {
        final ArrayList m18839k;
        final zzwt.zzi.zzc m18838j;
        final zzwt.zzg m18837i;
        zzcjc zzcjcVar;
        Bundle bundle2 = bundle;
        zzcjm zzcjmVar = this.f21465b;
        m18839k = zzcjm.m18839k(bundle2);
        zzcjm zzcjmVar2 = this.f21465b;
        m18838j = zzcjm.m18838j(bundle2);
        m18837i = this.f21465b.m18837i(bundle2);
        zzcjcVar = this.f21465b.f24407f;
        final boolean z = this.f21464a;
        zzcjcVar.m18815a(new zzczc(this, z, m18839k, m18837i, m18838j) { // from class: com.google.android.gms.internal.ads.ak

            /* renamed from: a */
            private final C7382zj f18166a;

            /* renamed from: b */
            private final boolean f18167b;

            /* renamed from: c */
            private final ArrayList f18168c;

            /* renamed from: d */
            private final zzwt.zzg f18169d;

            /* renamed from: e */
            private final zzwt.zzi.zzc f18170e;

            {
                this.f18166a = this;
                this.f18167b = z;
                this.f18168c = m18839k;
                this.f18169d = m18837i;
                this.f18170e = m18838j;
            }

            @Override // com.google.android.gms.internal.ads.zzczc
            /* renamed from: a */
            public final Object mo14763a(Object obj) {
                byte[] m18833d;
                C7382zj c7382zj = this.f18166a;
                boolean z2 = this.f18167b;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                m18833d = c7382zj.f21465b.m18833d(z2, this.f18168c, this.f18169d, this.f18170e);
                ContentValues contentValues = new ContentValues();
                contentValues.put("timestamp", Long.valueOf(zzk.zzln().mo14608a()));
                contentValues.put("serialized_proto_data", m18833d);
                sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
                sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET total = total+1 WHERE statistic_name = '%s'", "total_requests"));
                if (!z2) {
                    sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET total = total+1 WHERE statistic_name = '%s'", "failed_requests"));
                }
                return null;
            }
        });
    }
}
