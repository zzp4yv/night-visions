package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.AbstractC0807n;
import androidx.work.C0817x;
import androidx.work.EnumC0811r;
import androidx.work.impl.C0737j;
import androidx.work.impl.InterfaceC0727e;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p016n.C0766g;
import androidx.work.impl.p016n.C0775p;
import androidx.work.impl.p016n.InterfaceC0776q;
import androidx.work.impl.utils.C0784c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: SystemJobScheduler.java */
/* renamed from: androidx.work.impl.background.systemjob.b */
/* loaded from: classes.dex */
public class C0724b implements InterfaceC0727e {

    /* renamed from: f */
    private static final String f4590f = AbstractC0807n.m5223f("SystemJobScheduler");

    /* renamed from: g */
    private final Context f4591g;

    /* renamed from: h */
    private final JobScheduler f4592h;

    /* renamed from: i */
    private final C0737j f4593i;

    /* renamed from: j */
    private final C0723a f4594j;

    public C0724b(Context context, C0737j c0737j) {
        this(context, c0737j, (JobScheduler) context.getSystemService("jobscheduler"), new C0723a(context));
    }

    /* renamed from: b */
    public static void m4920b(Context context) {
        List<JobInfo> m4923f;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (m4923f = m4923f(context, jobScheduler)) == null || m4923f.isEmpty()) {
            return;
        }
        Iterator<JobInfo> it = m4923f.iterator();
        while (it.hasNext()) {
            m4921d(jobScheduler, it.next().getId());
        }
    }

    /* renamed from: d */
    private static void m4921d(JobScheduler jobScheduler, int i2) {
        try {
            jobScheduler.cancel(i2);
        } catch (Throwable th) {
            AbstractC0807n.m5221c().mo5225b(f4590f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i2)), th);
        }
    }

    /* renamed from: e */
    private static List<Integer> m4922e(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> m4923f = m4923f(context, jobScheduler);
        if (m4923f == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : m4923f) {
            if (str.equals(m4924g(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    private static List<JobInfo> m4923f(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            AbstractC0807n.m5221c().mo5225b(f4590f, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    private static String m4924g(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static boolean m4925h(Context context, C0737j c0737j) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> m4923f = m4923f(context, jobScheduler);
        List<String> mo5079a = c0737j.m4997t().mo4851g().mo5079a();
        boolean z = false;
        HashSet hashSet = new HashSet(m4923f != null ? m4923f.size() : 0);
        if (m4923f != null && !m4923f.isEmpty()) {
            for (JobInfo jobInfo : m4923f) {
                String m4924g = m4924g(jobInfo);
                if (TextUtils.isEmpty(m4924g)) {
                    m4921d(jobScheduler, jobInfo.getId());
                } else {
                    hashSet.add(m4924g);
                }
            }
        }
        Iterator<String> it = mo5079a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!hashSet.contains(it.next())) {
                AbstractC0807n.m5221c().mo5224a(f4590f, "Reconciling jobs", new Throwable[0]);
                z = true;
                break;
            }
        }
        if (z) {
            WorkDatabase m4997t = c0737j.m4997t();
            m4997t.beginTransaction();
            try {
                InterfaceC0776q mo4854j = m4997t.mo4854j();
                Iterator<String> it2 = mo5079a.iterator();
                while (it2.hasNext()) {
                    mo4854j.mo5099b(it2.next(), -1L);
                }
                m4997t.setTransactionSuccessful();
            } finally {
                m4997t.endTransaction();
            }
        }
        return z;
    }

    @Override // androidx.work.impl.InterfaceC0727e
    /* renamed from: a */
    public void mo4913a(C0775p... c0775pArr) {
        List<Integer> m4922e;
        WorkDatabase m4997t = this.f4593i.m4997t();
        C0784c c0784c = new C0784c(m4997t);
        for (C0775p c0775p : c0775pArr) {
            m4997t.beginTransaction();
            try {
                C0775p mo5110m = m4997t.mo4854j().mo5110m(c0775p.f4799c);
                if (mo5110m == null) {
                    AbstractC0807n.m5221c().mo5228h(f4590f, "Skipping scheduling " + c0775p.f4799c + " because it's no longer in the DB", new Throwable[0]);
                    m4997t.setTransactionSuccessful();
                } else if (mo5110m.f4800d != C0817x.a.ENQUEUED) {
                    AbstractC0807n.m5221c().mo5228h(f4590f, "Skipping scheduling " + c0775p.f4799c + " because it is no longer enqueued", new Throwable[0]);
                    m4997t.setTransactionSuccessful();
                } else {
                    C0766g mo5081c = m4997t.mo4851g().mo5081c(c0775p.f4799c);
                    int m5161d = mo5081c != null ? mo5081c.f4777b : c0784c.m5161d(this.f4593i.m4993n().m4790i(), this.f4593i.m4993n().m4788g());
                    if (mo5081c == null) {
                        this.f4593i.m4997t().mo4851g().mo5080b(new C0766g(c0775p.f4799c, m5161d));
                    }
                    m4926i(c0775p, m5161d);
                    if (Build.VERSION.SDK_INT == 23 && (m4922e = m4922e(this.f4591g, this.f4592h, c0775p.f4799c)) != null) {
                        int indexOf = m4922e.indexOf(Integer.valueOf(m5161d));
                        if (indexOf >= 0) {
                            m4922e.remove(indexOf);
                        }
                        m4926i(c0775p, !m4922e.isEmpty() ? m4922e.get(0).intValue() : c0784c.m5161d(this.f4593i.m4993n().m4790i(), this.f4593i.m4993n().m4788g()));
                    }
                    m4997t.setTransactionSuccessful();
                }
                m4997t.endTransaction();
            } catch (Throwable th) {
                m4997t.endTransaction();
                throw th;
            }
        }
    }

    @Override // androidx.work.impl.InterfaceC0727e
    /* renamed from: c */
    public boolean mo4914c() {
        return true;
    }

    @Override // androidx.work.impl.InterfaceC0727e
    public void cancel(String str) {
        List<Integer> m4922e = m4922e(this.f4591g, this.f4592h, str);
        if (m4922e == null || m4922e.isEmpty()) {
            return;
        }
        Iterator<Integer> it = m4922e.iterator();
        while (it.hasNext()) {
            m4921d(this.f4592h, it.next().intValue());
        }
        this.f4593i.m4997t().mo4851g().mo5082d(str);
    }

    /* renamed from: i */
    public void m4926i(C0775p c0775p, int i2) {
        JobInfo m4919a = this.f4594j.m4919a(c0775p, i2);
        AbstractC0807n m5221c = AbstractC0807n.m5221c();
        String str = f4590f;
        m5221c.mo5224a(str, String.format("Scheduling work ID %s Job ID %s", c0775p.f4799c, Integer.valueOf(i2)), new Throwable[0]);
        try {
            if (this.f4592h.schedule(m4919a) == 0) {
                AbstractC0807n.m5221c().mo5228h(str, String.format("Unable to schedule work ID %s", c0775p.f4799c), new Throwable[0]);
                if (c0775p.f4815s && c0775p.f4816t == EnumC0811r.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    c0775p.f4815s = false;
                    AbstractC0807n.m5221c().mo5224a(str, String.format("Scheduling a non-expedited job (work ID %s)", c0775p.f4799c), new Throwable[0]);
                    m4926i(c0775p, i2);
                }
            }
        } catch (IllegalStateException e2) {
            List<JobInfo> m4923f = m4923f(this.f4591g, this.f4592h);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(m4923f != null ? m4923f.size() : 0), Integer.valueOf(this.f4593i.m4997t().mo4854j().mo5104g().size()), Integer.valueOf(this.f4593i.m4993n().m4789h()));
            AbstractC0807n.m5221c().mo5225b(f4590f, format, new Throwable[0]);
            throw new IllegalStateException(format, e2);
        } catch (Throwable th) {
            AbstractC0807n.m5221c().mo5225b(f4590f, String.format("Unable to schedule %s", c0775p), th);
        }
    }

    public C0724b(Context context, C0737j c0737j, JobScheduler jobScheduler, C0723a c0723a) {
        this.f4591g = context;
        this.f4593i = c0737j;
        this.f4592h = jobScheduler;
        this.f4594j = c0723a;
    }
}
