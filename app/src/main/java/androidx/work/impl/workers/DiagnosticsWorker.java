package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.AbstractC0807n;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.C0737j;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p016n.C0766g;
import androidx.work.impl.p016n.C0775p;
import androidx.work.impl.p016n.InterfaceC0767h;
import androidx.work.impl.p016n.InterfaceC0770k;
import androidx.work.impl.p016n.InterfaceC0776q;
import androidx.work.impl.p016n.InterfaceC0779t;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {

    /* renamed from: a */
    private static final String f4968a = AbstractC0807n.m5223f("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* renamed from: a */
    private static String m5212a(C0775p c0775p, String str, Integer num, String str2) {
        return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", c0775p.f4799c, c0775p.f4801e, num, c0775p.f4800d.name(), str, str2);
    }

    /* renamed from: c */
    private static String m5213c(InterfaceC0770k interfaceC0770k, InterfaceC0779t interfaceC0779t, InterfaceC0767h interfaceC0767h, List<C0775p> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", Build.VERSION.SDK_INT >= 23 ? "Job Id" : "Alarm Id"));
        for (C0775p c0775p : list) {
            Integer num = null;
            C0766g mo5081c = interfaceC0767h.mo5081c(c0775p.f4799c);
            if (mo5081c != null) {
                num = Integer.valueOf(mo5081c.f4777b);
            }
            sb.append(m5212a(c0775p, TextUtils.join(",", interfaceC0770k.mo5085b(c0775p.f4799c)), num, TextUtils.join(",", interfaceC0779t.mo5120b(c0775p.f4799c))));
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public ListenableWorker.AbstractC0698a doWork() {
        WorkDatabase m4997t = C0737j.m4979p(getApplicationContext()).m4997t();
        InterfaceC0776q mo4854j = m4997t.mo4854j();
        InterfaceC0770k mo4852h = m4997t.mo4852h();
        InterfaceC0779t mo4855k = m4997t.mo4855k();
        InterfaceC0767h mo4851g = m4997t.mo4851g();
        List<C0775p> mo5101d = mo4854j.mo5101d(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List<C0775p> mo5106i = mo4854j.mo5106i();
        List<C0775p> mo5116s = mo4854j.mo5116s(200);
        if (mo5101d != null && !mo5101d.isEmpty()) {
            AbstractC0807n m5221c = AbstractC0807n.m5221c();
            String str = f4968a;
            m5221c.mo5226d(str, "Recently completed work:\n\n", new Throwable[0]);
            AbstractC0807n.m5221c().mo5226d(str, m5213c(mo4852h, mo4855k, mo4851g, mo5101d), new Throwable[0]);
        }
        if (mo5106i != null && !mo5106i.isEmpty()) {
            AbstractC0807n m5221c2 = AbstractC0807n.m5221c();
            String str2 = f4968a;
            m5221c2.mo5226d(str2, "Running work:\n\n", new Throwable[0]);
            AbstractC0807n.m5221c().mo5226d(str2, m5213c(mo4852h, mo4855k, mo4851g, mo5106i), new Throwable[0]);
        }
        if (mo5116s != null && !mo5116s.isEmpty()) {
            AbstractC0807n m5221c3 = AbstractC0807n.m5221c();
            String str3 = f4968a;
            m5221c3.mo5226d(str3, "Enqueued work:\n\n", new Throwable[0]);
            AbstractC0807n.m5221c().mo5226d(str3, m5213c(mo4852h, mo4855k, mo4851g, mo5116s), new Throwable[0]);
        }
        return ListenableWorker.AbstractC0698a.m4766c();
    }
}
