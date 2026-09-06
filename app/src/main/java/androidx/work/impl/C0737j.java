package androidx.work.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.AbstractC0807n;
import androidx.work.AbstractC0818y;
import androidx.work.AbstractC0819z;
import androidx.work.C0703b;
import androidx.work.C0809p;
import androidx.work.C0812s;
import androidx.work.C0814u;
import androidx.work.EnumC0707f;
import androidx.work.EnumC0708g;
import androidx.work.InterfaceC0810q;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.systemjob.C0724b;
import androidx.work.impl.p011l.p012a.C0740b;
import androidx.work.impl.utils.AbstractRunnableC0782a;
import androidx.work.impl.utils.C0786e;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.impl.utils.RunnableC0789h;
import androidx.work.impl.utils.RunnableC0790i;
import androidx.work.impl.utils.p018p.InterfaceC0799a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: WorkManagerImpl.java */
/* renamed from: androidx.work.impl.j */
/* loaded from: classes.dex */
public class C0737j extends AbstractC0818y {

    /* renamed from: a */
    private static final String f4664a = AbstractC0807n.m5223f("WorkManagerImpl");

    /* renamed from: b */
    private static C0737j f4665b = null;

    /* renamed from: c */
    private static C0737j f4666c = null;

    /* renamed from: d */
    private static final Object f4667d = new Object();

    /* renamed from: e */
    private Context f4668e;

    /* renamed from: f */
    private C0703b f4669f;

    /* renamed from: g */
    private WorkDatabase f4670g;

    /* renamed from: h */
    private InterfaceC0799a f4671h;

    /* renamed from: i */
    private List<InterfaceC0727e> f4672i;

    /* renamed from: j */
    private C0726d f4673j;

    /* renamed from: k */
    private C0786e f4674k;

    /* renamed from: l */
    private boolean f4675l;

    /* renamed from: m */
    private BroadcastReceiver.PendingResult f4676m;

    public C0737j(Context context, C0703b c0703b, InterfaceC0799a interfaceC0799a) {
        this(context, c0703b, interfaceC0799a, context.getResources().getBoolean(C0814u.f4989a));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0016, code lost:
    
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:
    
        if (androidx.work.impl.C0737j.f4666c != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
    
        androidx.work.impl.C0737j.f4666c = new androidx.work.impl.C0737j(r4, r5, new androidx.work.impl.utils.p018p.C0800b(r5.m4793l()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        androidx.work.impl.C0737j.f4665b = androidx.work.impl.C0737j.f4666c;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m4977i(android.content.Context r4, androidx.work.C0703b r5) {
        /*
            java.lang.Object r0 = androidx.work.impl.C0737j.f4667d
            monitor-enter(r0)
            androidx.work.impl.j r1 = androidx.work.impl.C0737j.f4665b     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L14
            androidx.work.impl.j r2 = androidx.work.impl.C0737j.f4666c     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto Lc
            goto L14
        Lc:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L34
            throw r4     // Catch: java.lang.Throwable -> L34
        L14:
            if (r1 != 0) goto L32
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L34
            androidx.work.impl.j r1 = androidx.work.impl.C0737j.f4666c     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L2e
            androidx.work.impl.j r1 = new androidx.work.impl.j     // Catch: java.lang.Throwable -> L34
            androidx.work.impl.utils.p.b r2 = new androidx.work.impl.utils.p.b     // Catch: java.lang.Throwable -> L34
            java.util.concurrent.Executor r3 = r5.m4793l()     // Catch: java.lang.Throwable -> L34
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L34
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L34
            androidx.work.impl.C0737j.f4666c = r1     // Catch: java.lang.Throwable -> L34
        L2e:
            androidx.work.impl.j r4 = androidx.work.impl.C0737j.f4666c     // Catch: java.lang.Throwable -> L34
            androidx.work.impl.C0737j.f4665b = r4     // Catch: java.lang.Throwable -> L34
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return
        L34:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.C0737j.m4977i(android.content.Context, androidx.work.b):void");
    }

    @Deprecated
    /* renamed from: o */
    public static C0737j m4978o() {
        synchronized (f4667d) {
            C0737j c0737j = f4665b;
            if (c0737j != null) {
                return c0737j;
            }
            return f4666c;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public static C0737j m4979p(Context context) {
        C0737j m4978o;
        synchronized (f4667d) {
            m4978o = m4978o();
            if (m4978o == null) {
                Context applicationContext = context.getApplicationContext();
                if (!(applicationContext instanceof C0703b.c)) {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
                m4977i(applicationContext, ((C0703b.c) applicationContext).m4798a());
                m4978o = m4979p(applicationContext);
            }
        }
        return m4978o;
    }

    /* renamed from: v */
    private void m4980v(Context context, C0703b c0703b, InterfaceC0799a interfaceC0799a, WorkDatabase workDatabase, List<InterfaceC0727e> list, C0726d c0726d) {
        Context applicationContext = context.getApplicationContext();
        this.f4668e = applicationContext;
        this.f4669f = c0703b;
        this.f4671h = interfaceC0799a;
        this.f4670g = workDatabase;
        this.f4672i = list;
        this.f4673j = c0726d;
        this.f4674k = new C0786e(workDatabase);
        this.f4675l = false;
        if (Build.VERSION.SDK_INT >= 24 && applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f4671h.mo5205b(new ForceStopRunnable(applicationContext, this));
    }

    /* renamed from: A */
    public void m4981A(String str, WorkerParameters.C0700a c0700a) {
        this.f4671h.mo5205b(new RunnableC0789h(this, str, c0700a));
    }

    /* renamed from: B */
    public void m4982B(String str) {
        this.f4671h.mo5205b(new RunnableC0790i(this, str, true));
    }

    /* renamed from: C */
    public void m4983C(String str) {
        this.f4671h.mo5205b(new RunnableC0790i(this, str, false));
    }

    @Override // androidx.work.AbstractC0818y
    /* renamed from: a */
    public InterfaceC0810q mo4984a(String str) {
        AbstractRunnableC0782a m5143d = AbstractRunnableC0782a.m5143d(str, this);
        this.f4671h.mo5205b(m5143d);
        return m5143d.m5146e();
    }

    @Override // androidx.work.AbstractC0818y
    /* renamed from: b */
    public InterfaceC0810q mo4985b(String str) {
        AbstractRunnableC0782a m5142c = AbstractRunnableC0782a.m5142c(str, this, true);
        this.f4671h.mo5205b(m5142c);
        return m5142c.m5146e();
    }

    @Override // androidx.work.AbstractC0818y
    /* renamed from: d */
    public InterfaceC0810q mo4986d(List<? extends AbstractC0819z> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new C0734g(this, list).m4961a();
    }

    @Override // androidx.work.AbstractC0818y
    /* renamed from: e */
    public InterfaceC0810q mo4987e(String str, EnumC0707f enumC0707f, C0812s c0812s) {
        return m4991l(str, enumC0707f, c0812s).m4961a();
    }

    @Override // androidx.work.AbstractC0818y
    /* renamed from: g */
    public InterfaceC0810q mo4988g(String str, EnumC0708g enumC0708g, List<C0809p> list) {
        return new C0734g(this, str, enumC0708g, list).m4961a();
    }

    /* renamed from: j */
    public InterfaceC0810q m4989j(UUID uuid) {
        AbstractRunnableC0782a m5141b = AbstractRunnableC0782a.m5141b(uuid, this);
        this.f4671h.mo5205b(m5141b);
        return m5141b.m5146e();
    }

    /* renamed from: k */
    public List<InterfaceC0727e> m4990k(Context context, C0703b c0703b, InterfaceC0799a interfaceC0799a) {
        return Arrays.asList(C0728f.m4942a(context, this), new C0740b(context, c0703b, interfaceC0799a, this));
    }

    /* renamed from: l */
    public C0734g m4991l(String str, EnumC0707f enumC0707f, C0812s c0812s) {
        return new C0734g(this, str, enumC0707f == EnumC0707f.KEEP ? EnumC0708g.KEEP : EnumC0708g.REPLACE, Collections.singletonList(c0812s));
    }

    /* renamed from: m */
    public Context m4992m() {
        return this.f4668e;
    }

    /* renamed from: n */
    public C0703b m4993n() {
        return this.f4669f;
    }

    /* renamed from: q */
    public C0786e m4994q() {
        return this.f4674k;
    }

    /* renamed from: r */
    public C0726d m4995r() {
        return this.f4673j;
    }

    /* renamed from: s */
    public List<InterfaceC0727e> m4996s() {
        return this.f4672i;
    }

    /* renamed from: t */
    public WorkDatabase m4997t() {
        return this.f4670g;
    }

    /* renamed from: u */
    public InterfaceC0799a m4998u() {
        return this.f4671h;
    }

    /* renamed from: w */
    public void m4999w() {
        synchronized (f4667d) {
            this.f4675l = true;
            BroadcastReceiver.PendingResult pendingResult = this.f4676m;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f4676m = null;
            }
        }
    }

    /* renamed from: x */
    public void m5000x() {
        if (Build.VERSION.SDK_INT >= 23) {
            C0724b.m4920b(m4992m());
        }
        m4997t().mo4854j().mo5117t();
        C0728f.m4943b(m4993n(), m4997t(), m4996s());
    }

    /* renamed from: y */
    public void m5001y(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f4667d) {
            this.f4676m = pendingResult;
            if (this.f4675l) {
                pendingResult.finish();
                this.f4676m = null;
            }
        }
    }

    /* renamed from: z */
    public void m5002z(String str) {
        m4981A(str, null);
    }

    public C0737j(Context context, C0703b c0703b, InterfaceC0799a interfaceC0799a, boolean z) {
        this(context, c0703b, interfaceC0799a, WorkDatabase.m4845a(context.getApplicationContext(), interfaceC0799a.mo5206c(), z));
    }

    public C0737j(Context context, C0703b c0703b, InterfaceC0799a interfaceC0799a, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        AbstractC0807n.m5222e(new AbstractC0807n.a(c0703b.m4791j()));
        List<InterfaceC0727e> m4990k = m4990k(applicationContext, c0703b, interfaceC0799a);
        m4980v(context, c0703b, interfaceC0799a, workDatabase, m4990k, new C0726d(context, c0703b, interfaceC0799a, workDatabase, m4990k));
    }
}
