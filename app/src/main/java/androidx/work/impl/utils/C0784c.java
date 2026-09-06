package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p016n.C0763d;
import p024c.p082u.p083a.InterfaceC1008b;

/* compiled from: IdGenerator.java */
/* renamed from: androidx.work.impl.utils.c */
/* loaded from: classes.dex */
public class C0784c {

    /* renamed from: a */
    private final WorkDatabase f4870a;

    public C0784c(WorkDatabase workDatabase) {
        this.f4870a = workDatabase;
    }

    /* renamed from: a */
    public static void m5157a(Context context, InterfaceC1008b interfaceC1008b) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i2 = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i3 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            interfaceC1008b.mo6458n();
            try {
                interfaceC1008b.mo6457l0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i2)});
                interfaceC1008b.mo6457l0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i3)});
                sharedPreferences.edit().clear().apply();
                interfaceC1008b.mo6456j0();
            } finally {
                interfaceC1008b.mo6462z0();
            }
        }
    }

    /* renamed from: c */
    private int m5158c(String str) {
        this.f4870a.beginTransaction();
        try {
            Long mo5076a = this.f4870a.mo4850f().mo5076a(str);
            int i2 = 0;
            int intValue = mo5076a != null ? mo5076a.intValue() : 0;
            if (intValue != Integer.MAX_VALUE) {
                i2 = intValue + 1;
            }
            m5159e(str, i2);
            this.f4870a.setTransactionSuccessful();
            return intValue;
        } finally {
            this.f4870a.endTransaction();
        }
    }

    /* renamed from: e */
    private void m5159e(String str, int i2) {
        this.f4870a.mo4850f().mo5077b(new C0763d(str, i2));
    }

    /* renamed from: b */
    public int m5160b() {
        int m5158c;
        synchronized (C0784c.class) {
            m5158c = m5158c("next_alarm_manager_id");
        }
        return m5158c;
    }

    /* renamed from: d */
    public int m5161d(int i2, int i3) {
        synchronized (C0784c.class) {
            int m5158c = m5158c("next_job_scheduler_id");
            if (m5158c >= i2 && m5158c <= i3) {
                i2 = m5158c;
            }
            m5159e("next_job_scheduler_id", i2 + 1);
        }
        return i2;
    }
}
