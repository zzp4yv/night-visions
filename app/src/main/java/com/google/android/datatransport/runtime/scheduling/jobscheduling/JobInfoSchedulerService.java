package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import p241e.p254e.p256b.p257a.p258i.AbstractC8841q;
import p241e.p254e.p256b.p257a.p258i.C8845u;
import p241e.p254e.p256b.p257a.p258i.p263d0.C8828a;

/* loaded from: classes2.dex */
public class JobInfoSchedulerService extends JobService {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m13539b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i2 = jobParameters.getExtras().getInt("priority");
        int i3 = jobParameters.getExtras().getInt("attemptNumber");
        C8845u.m28178f(getApplicationContext());
        AbstractC8841q.a mo28140d = AbstractC8841q.m28169a().mo28138b(string).mo28140d(C8828a.m28133b(i2));
        if (string2 != null) {
            mo28140d.mo28139c(Base64.decode(string2, 0));
        }
        C8845u.m28176c().m28179e().m13587v(mo28140d.mo28137a(), i3, new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.c
            @Override // java.lang.Runnable
            public final void run() {
                JobInfoSchedulerService.this.m13539b(jobParameters);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
