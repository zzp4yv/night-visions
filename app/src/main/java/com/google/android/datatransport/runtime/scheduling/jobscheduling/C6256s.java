package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import p241e.p254e.p256b.p257a.p258i.AbstractC8841q;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.InterfaceC8792j0;
import p241e.p254e.p256b.p257a.p258i.p263d0.C8828a;
import p241e.p254e.p256b.p257a.p258i.p268z.C8858a;

/* compiled from: JobInfoScheduler.java */
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.s */
/* loaded from: classes2.dex */
public class C6256s implements InterfaceC6262y {

    /* renamed from: a */
    private final Context f16830a;

    /* renamed from: b */
    private final InterfaceC8792j0 f16831b;

    /* renamed from: c */
    private final AbstractC6257t f16832c;

    public C6256s(Context context, InterfaceC8792j0 interfaceC8792j0, AbstractC6257t abstractC6257t) {
        this.f16830a = context;
        this.f16831b = interfaceC8792j0;
        this.f16832c = abstractC6257t;
    }

    /* renamed from: d */
    private boolean m13552d(JobScheduler jobScheduler, int i2, int i3) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i4 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i2) {
                return i4 >= i3;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.InterfaceC6262y
    /* renamed from: a */
    public void mo13540a(AbstractC8841q abstractC8841q, int i2) {
        mo13541b(abstractC8841q, i2, false);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.InterfaceC6262y
    /* renamed from: b */
    public void mo13541b(AbstractC8841q abstractC8841q, int i2, boolean z) {
        ComponentName componentName = new ComponentName(this.f16830a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f16830a.getSystemService("jobscheduler");
        int m13553c = m13553c(abstractC8841q);
        if (!z && m13552d(jobScheduler, m13553c, i2)) {
            C8858a.m28230b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", abstractC8841q);
            return;
        }
        long mo27998W0 = this.f16831b.mo27998W0(abstractC8841q);
        JobInfo.Builder m13560c = this.f16832c.m13560c(new JobInfo.Builder(m13553c, componentName), abstractC8841q.mo28136d(), mo27998W0, i2);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i2);
        persistableBundle.putString("backendName", abstractC8841q.mo28134b());
        persistableBundle.putInt("priority", C8828a.m28132a(abstractC8841q.mo28136d()));
        if (abstractC8841q.mo28135c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(abstractC8841q.mo28135c(), 0));
        }
        m13560c.setExtras(persistableBundle);
        C8858a.m28231c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", abstractC8841q, Integer.valueOf(m13553c), Long.valueOf(this.f16832c.m13561g(abstractC8841q.mo28136d(), mo27998W0, i2)), Long.valueOf(mo27998W0), Integer.valueOf(i2));
        jobScheduler.schedule(m13560c.build());
    }

    /* renamed from: c */
    int m13553c(AbstractC8841q abstractC8841q) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f16830a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(abstractC8841q.mo28134b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(C8828a.m28132a(abstractC8841q.mo28136d())).array());
        if (abstractC8841q.mo28135c() != null) {
            adler32.update(abstractC8841q.mo28135c());
        }
        return (int) adler32.getValue();
    }
}
