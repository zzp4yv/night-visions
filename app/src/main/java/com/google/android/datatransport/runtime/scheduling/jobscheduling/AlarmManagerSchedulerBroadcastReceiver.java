package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import p241e.p254e.p256b.p257a.p258i.AbstractC8841q;
import p241e.p254e.p256b.p257a.p258i.C8845u;
import p241e.p254e.p256b.p257a.p258i.p263d0.C8828a;

/* loaded from: classes2.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* renamed from: a */
    static /* synthetic */ void m13537a() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i2 = intent.getExtras().getInt("attemptNumber");
        C8845u.m28178f(context);
        AbstractC8841q.a mo28140d = AbstractC8841q.m28169a().mo28138b(queryParameter).mo28140d(C8828a.m28133b(intValue));
        if (queryParameter2 != null) {
            mo28140d.mo28139c(Base64.decode(queryParameter2, 0));
        }
        C8845u.m28176c().m28179e().m13587v(mo28140d.mo28137a(), i2, new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.a
            @Override // java.lang.Runnable
            public final void run() {
                AlarmManagerSchedulerBroadcastReceiver.m13537a();
            }
        });
    }
}
