package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.work.AbstractC0807n;
import androidx.work.impl.C0737j;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p016n.C0766g;
import androidx.work.impl.p016n.InterfaceC0767h;
import androidx.work.impl.utils.C0784c;

/* compiled from: Alarms.java */
/* renamed from: androidx.work.impl.background.systemalarm.a */
/* loaded from: classes.dex */
class C0717a {

    /* renamed from: a */
    private static final String f4546a = AbstractC0807n.m5223f("Alarms");

    /* renamed from: a */
    public static void m4874a(Context context, C0737j c0737j, String str) {
        InterfaceC0767h mo4851g = c0737j.m4997t().mo4851g();
        C0766g mo5081c = mo4851g.mo5081c(str);
        if (mo5081c != null) {
            m4875b(context, str, mo5081c.f4777b);
            AbstractC0807n.m5221c().mo5224a(f4546a, String.format("Removing SystemIdInfo for workSpecId (%s)", str), new Throwable[0]);
            mo4851g.mo5082d(str);
        }
    }

    /* renamed from: b */
    private static void m4875b(Context context, String str, int i2) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i2, C0718b.m4879b(context, str), Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912);
        if (service == null || alarmManager == null) {
            return;
        }
        AbstractC0807n.m5221c().mo5224a(f4546a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i2)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    /* renamed from: c */
    public static void m4876c(Context context, C0737j c0737j, String str, long j2) {
        WorkDatabase m4997t = c0737j.m4997t();
        InterfaceC0767h mo4851g = m4997t.mo4851g();
        C0766g mo5081c = mo4851g.mo5081c(str);
        if (mo5081c != null) {
            m4875b(context, str, mo5081c.f4777b);
            m4877d(context, str, mo5081c.f4777b, j2);
        } else {
            int m5160b = new C0784c(m4997t).m5160b();
            mo4851g.mo5080b(new C0766g(str, m5160b));
            m4877d(context, str, m5160b, j2);
        }
    }

    /* renamed from: d */
    private static void m4877d(Context context, String str, int i2, long j2) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i3 = Build.VERSION.SDK_INT;
        PendingIntent service = PendingIntent.getService(context, i2, C0718b.m4879b(context, str), i3 >= 23 ? 201326592 : 134217728);
        if (alarmManager != null) {
            if (i3 >= 19) {
                alarmManager.setExact(0, j2, service);
            } else {
                alarmManager.set(0, j2, service);
            }
        }
    }
}
