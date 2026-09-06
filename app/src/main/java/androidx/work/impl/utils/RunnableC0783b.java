package androidx.work.impl.utils;

import android.text.TextUtils;
import androidx.work.AbstractC0807n;
import androidx.work.C0704c;
import androidx.work.C0706e;
import androidx.work.InterfaceC0810q;
import androidx.work.impl.C0725c;
import androidx.work.impl.C0728f;
import androidx.work.impl.C0734g;
import androidx.work.impl.C0737j;
import androidx.work.impl.InterfaceC0727e;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.p016n.C0775p;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.Iterator;
import java.util.List;

/* compiled from: EnqueueRunnable.java */
/* renamed from: androidx.work.impl.utils.b */
/* loaded from: classes.dex */
public class RunnableC0783b implements Runnable {

    /* renamed from: f */
    private static final String f4867f = AbstractC0807n.m5223f("EnqueueRunnable");

    /* renamed from: g */
    private final C0734g f4868g;

    /* renamed from: h */
    private final C0725c f4869h = new C0725c();

    public RunnableC0783b(C0734g c0734g) {
        this.f4868g = c0734g;
    }

    /* renamed from: b */
    private static boolean m5149b(C0734g c0734g) {
        boolean m5150c = m5150c(c0734g.m4967g(), c0734g.m4966f(), (String[]) C0734g.m4960l(c0734g).toArray(new String[0]), c0734g.m4964d(), c0734g.m4962b());
        c0734g.m4970k();
        return m5150c;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e1 A[LOOP:5: B:86:0x01db->B:88:0x01e1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020a A[SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m5150c(androidx.work.impl.C0737j r19, java.util.List<? extends androidx.work.AbstractC0819z> r20, java.lang.String[] r21, java.lang.String r22, androidx.work.EnumC0708g r23) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.RunnableC0783b.m5150c(androidx.work.impl.j, java.util.List, java.lang.String[], java.lang.String, androidx.work.g):boolean");
    }

    /* renamed from: e */
    private static boolean m5151e(C0734g c0734g) {
        List<C0734g> m4965e = c0734g.m4965e();
        boolean z = false;
        if (m4965e != null) {
            boolean z2 = false;
            for (C0734g c0734g2 : m4965e) {
                if (c0734g2.m4969j()) {
                    AbstractC0807n.m5221c().mo5228h(f4867f, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", c0734g2.m4963c())), new Throwable[0]);
                } else {
                    z2 |= m5151e(c0734g2);
                }
            }
            z = z2;
        }
        return m5149b(c0734g) | z;
    }

    /* renamed from: g */
    private static void m5152g(C0775p c0775p) {
        C0704c c0704c = c0775p.f4808l;
        String str = c0775p.f4801e;
        if (str.equals(ConstraintTrackingWorker.class.getName())) {
            return;
        }
        if (c0704c.m4804f() || c0704c.m4807i()) {
            C0706e.a aVar = new C0706e.a();
            aVar.m4837c(c0775p.f4803g).m4840f("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            c0775p.f4801e = ConstraintTrackingWorker.class.getName();
            c0775p.f4803g = aVar.m4835a();
        }
    }

    /* renamed from: h */
    private static boolean m5153h(C0737j c0737j, String str) {
        try {
            Class<?> cls = Class.forName(str);
            Iterator<InterfaceC0727e> it = c0737j.m4996s().iterator();
            while (it.hasNext()) {
                if (cls.isAssignableFrom(it.next().getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: a */
    public boolean m5154a() {
        WorkDatabase m4997t = this.f4868g.m4967g().m4997t();
        m4997t.beginTransaction();
        try {
            boolean m5151e = m5151e(this.f4868g);
            m4997t.setTransactionSuccessful();
            return m5151e;
        } finally {
            m4997t.endTransaction();
        }
    }

    /* renamed from: d */
    public InterfaceC0810q m5155d() {
        return this.f4869h;
    }

    /* renamed from: f */
    public void m5156f() {
        C0737j m4967g = this.f4868g.m4967g();
        C0728f.m4943b(m4967g.m4993n(), m4967g.m4997t(), m4967g.m4996s());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f4868g.m4968h()) {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.f4868g));
            }
            if (m5154a()) {
                C0785d.m5162a(this.f4868g.m4967g().m4992m(), RescheduleReceiver.class, true);
                m5156f();
            }
            this.f4869h.m4927a(InterfaceC0810q.f4983a);
        } catch (Throwable th) {
            this.f4869h.m4927a(new InterfaceC0810q.b.a(th));
        }
    }
}
