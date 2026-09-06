package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.measurement.zzd;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.s3 */
/* loaded from: classes2.dex */
final class RunnableC7783s3 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zzd f28897f;

    /* renamed from: g */
    private final /* synthetic */ ServiceConnection f28898g;

    /* renamed from: h */
    private final /* synthetic */ zzfl f28899h;

    RunnableC7783s3(zzfl zzflVar, zzd zzdVar, ServiceConnection serviceConnection) {
        this.f28899h = zzflVar;
        this.f28897f = zzdVar;
        this.f28898g = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        zzfl zzflVar = this.f28899h;
        zzfm zzfmVar = zzflVar.f29250g;
        str = zzflVar.f29249f;
        zzd zzdVar = this.f28897f;
        ServiceConnection serviceConnection = this.f28898g;
        Bundle m23167a = zzfmVar.m23167a(str, zzdVar);
        zzfmVar.f29251a.mo22835g().mo22792d();
        if (m23167a != null) {
            long j2 = m23167a.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j2 == 0) {
                zzfmVar.f29251a.mo22836h().m23137H().m23147a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = m23167a.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    zzfmVar.f29251a.mo22836h().m23137H().m23147a("No referrer defined in install referrer response");
                } else {
                    zzfmVar.f29251a.mo22836h().m23145P().m23148b("InstallReferrer API result", string);
                    Bundle m23553y = zzfmVar.f29251a.m23217I().m23553y(Uri.parse(string.length() != 0 ? "?".concat(string) : new String("?")));
                    if (m23553y == null) {
                        zzfmVar.f29251a.mo22836h().m23137H().m23147a("No campaign params defined in install referrer result");
                    } else {
                        String string2 = m23553y.getString("medium");
                        if ((string2 == null || "(not set)".equalsIgnoreCase(string2) || "organic".equalsIgnoreCase(string2)) ? false : true) {
                            long j3 = m23167a.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j3 == 0) {
                                zzfmVar.f29251a.mo22836h().m23137H().m23147a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                m23553y.putLong("click_timestamp", j3);
                            }
                        }
                        if (j2 == zzfmVar.f29251a.m23211B().f28859l.m23155a()) {
                            zzfmVar.f29251a.mo22832G();
                            zzfmVar.f29251a.mo22836h().m23145P().m23147a("Campaign has already been logged");
                        } else {
                            zzfmVar.f29251a.m23211B().f28859l.m23156b(j2);
                            zzfmVar.f29251a.mo22832G();
                            zzfmVar.f29251a.mo22836h().m23145P().m23148b("Logging Install Referrer campaign from sdk with ", "referrer API");
                            m23553y.putString("_cis", "referrer API");
                            zzfmVar.f29251a.m23216H().m23281S("auto", "_cmp", m23553y);
                        }
                    }
                }
            }
        }
        if (serviceConnection != null) {
            ConnectionTracker.m14575b().m14581c(zzfmVar.f29251a.mo22834f(), serviceConnection);
        }
    }
}
