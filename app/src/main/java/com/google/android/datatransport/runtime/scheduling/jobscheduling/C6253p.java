package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import p241e.p254e.p256b.p257a.p258i.AbstractC8841q;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.InterfaceC8792j0;
import p241e.p254e.p256b.p257a.p258i.p262c0.InterfaceC8821a;
import p241e.p254e.p256b.p257a.p258i.p263d0.C8828a;
import p241e.p254e.p256b.p257a.p258i.p268z.C8858a;

/* compiled from: AlarmManagerScheduler.java */
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.p */
/* loaded from: classes2.dex */
public class C6253p implements InterfaceC6262y {

    /* renamed from: a */
    private final Context f16817a;

    /* renamed from: b */
    private final InterfaceC8792j0 f16818b;

    /* renamed from: c */
    private AlarmManager f16819c;

    /* renamed from: d */
    private final AbstractC6257t f16820d;

    /* renamed from: e */
    private final InterfaceC8821a f16821e;

    public C6253p(Context context, InterfaceC8792j0 interfaceC8792j0, InterfaceC8821a interfaceC8821a, AbstractC6257t abstractC6257t) {
        this(context, interfaceC8792j0, (AlarmManager) context.getSystemService("alarm"), interfaceC8821a, abstractC6257t);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.InterfaceC6262y
    /* renamed from: a */
    public void mo13540a(AbstractC8841q abstractC8841q, int i2) {
        mo13541b(abstractC8841q, i2, false);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.InterfaceC6262y
    /* renamed from: b */
    public void mo13541b(AbstractC8841q abstractC8841q, int i2, boolean z) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", abstractC8841q.mo28134b());
        builder.appendQueryParameter("priority", String.valueOf(C8828a.m28132a(abstractC8841q.mo28136d())));
        if (abstractC8841q.mo28135c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(abstractC8841q.mo28135c(), 0));
        }
        Intent intent = new Intent(this.f16817a, (Class<?>) AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i2);
        if (!z && m13542c(intent)) {
            C8858a.m28230b("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", abstractC8841q);
            return;
        }
        long mo27998W0 = this.f16818b.mo27998W0(abstractC8841q);
        long m13561g = this.f16820d.m13561g(abstractC8841q.mo28136d(), mo27998W0, i2);
        C8858a.m28231c("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", abstractC8841q, Long.valueOf(m13561g), Long.valueOf(mo27998W0), Integer.valueOf(i2));
        this.f16819c.set(3, this.f16821e.mo28110a() + m13561g, PendingIntent.getBroadcast(this.f16817a, 0, intent, Build.VERSION.SDK_INT >= 23 ? 67108864 : 0));
    }

    /* renamed from: c */
    boolean m13542c(Intent intent) {
        return PendingIntent.getBroadcast(this.f16817a, 0, intent, Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912) != null;
    }

    C6253p(Context context, InterfaceC8792j0 interfaceC8792j0, AlarmManager alarmManager, InterfaceC8821a interfaceC8821a, AbstractC6257t abstractC6257t) {
        this.f16817a = context;
        this.f16818b = interfaceC8792j0;
        this.f16819c = alarmManager;
        this.f16821e = interfaceC8821a;
        this.f16820d = abstractC6257t;
    }
}
