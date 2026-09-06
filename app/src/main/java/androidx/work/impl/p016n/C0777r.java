package androidx.work.impl.p016n;

import android.database.Cursor;
import androidx.room.AbstractC0644c;
import androidx.room.AbstractC0651j;
import androidx.room.AbstractC0658q;
import androidx.room.C0654m;
import androidx.room.p010t.C0662b;
import androidx.room.p010t.C0663c;
import androidx.room.p010t.C0666f;
import androidx.work.C0704c;
import androidx.work.C0706e;
import androidx.work.C0817x;
import androidx.work.impl.p016n.C0775p;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import java.util.ArrayList;
import java.util.List;
import p024c.p082u.p083a.InterfaceC1012f;

/* compiled from: WorkSpecDao_Impl.java */
/* renamed from: androidx.work.impl.n.r */
/* loaded from: classes.dex */
public final class C0777r implements InterfaceC0776q {

    /* renamed from: a */
    private final AbstractC0651j f4825a;

    /* renamed from: b */
    private final AbstractC0644c<C0775p> f4826b;

    /* renamed from: c */
    private final AbstractC0658q f4827c;

    /* renamed from: d */
    private final AbstractC0658q f4828d;

    /* renamed from: e */
    private final AbstractC0658q f4829e;

    /* renamed from: f */
    private final AbstractC0658q f4830f;

    /* renamed from: g */
    private final AbstractC0658q f4831g;

    /* renamed from: h */
    private final AbstractC0658q f4832h;

    /* renamed from: i */
    private final AbstractC0658q f4833i;

    /* renamed from: j */
    private final AbstractC0658q f4834j;

    /* compiled from: WorkSpecDao_Impl.java */
    /* renamed from: androidx.work.impl.n.r$a */
    class a extends AbstractC0644c<C0775p> {
        a(AbstractC0651j abstractC0651j) {
            super(abstractC0651j);
        }

        @Override // androidx.room.AbstractC0644c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC1012f interfaceC1012f, C0775p c0775p) {
            String str = c0775p.f4799c;
            if (str == null) {
                interfaceC1012f.mo4646I0(1);
            } else {
                interfaceC1012f.mo4654w(1, str);
            }
            interfaceC1012f.mo4652h0(2, C0781v.m5131j(c0775p.f4800d));
            String str2 = c0775p.f4801e;
            if (str2 == null) {
                interfaceC1012f.mo4646I0(3);
            } else {
                interfaceC1012f.mo4654w(3, str2);
            }
            String str3 = c0775p.f4802f;
            if (str3 == null) {
                interfaceC1012f.mo4646I0(4);
            } else {
                interfaceC1012f.mo4654w(4, str3);
            }
            byte[] m4830l = C0706e.m4830l(c0775p.f4803g);
            if (m4830l == null) {
                interfaceC1012f.mo4646I0(5);
            } else {
                interfaceC1012f.mo4653o0(5, m4830l);
            }
            byte[] m4830l2 = C0706e.m4830l(c0775p.f4804h);
            if (m4830l2 == null) {
                interfaceC1012f.mo4646I0(6);
            } else {
                interfaceC1012f.mo4653o0(6, m4830l2);
            }
            interfaceC1012f.mo4652h0(7, c0775p.f4805i);
            interfaceC1012f.mo4652h0(8, c0775p.f4806j);
            interfaceC1012f.mo4652h0(9, c0775p.f4807k);
            interfaceC1012f.mo4652h0(10, c0775p.f4809m);
            interfaceC1012f.mo4652h0(11, C0781v.m5122a(c0775p.f4810n));
            interfaceC1012f.mo4652h0(12, c0775p.f4811o);
            interfaceC1012f.mo4652h0(13, c0775p.f4812p);
            interfaceC1012f.mo4652h0(14, c0775p.f4813q);
            interfaceC1012f.mo4652h0(15, c0775p.f4814r);
            interfaceC1012f.mo4652h0(16, c0775p.f4815s ? 1L : 0L);
            interfaceC1012f.mo4652h0(17, C0781v.m5130i(c0775p.f4816t));
            C0704c c0704c = c0775p.f4808l;
            if (c0704c == null) {
                interfaceC1012f.mo4646I0(18);
                interfaceC1012f.mo4646I0(19);
                interfaceC1012f.mo4646I0(20);
                interfaceC1012f.mo4646I0(21);
                interfaceC1012f.mo4646I0(22);
                interfaceC1012f.mo4646I0(23);
                interfaceC1012f.mo4646I0(24);
                interfaceC1012f.mo4646I0(25);
                return;
            }
            interfaceC1012f.mo4652h0(18, C0781v.m5129h(c0704c.m4800b()));
            interfaceC1012f.mo4652h0(19, c0704c.m4805g() ? 1L : 0L);
            interfaceC1012f.mo4652h0(20, c0704c.m4806h() ? 1L : 0L);
            interfaceC1012f.mo4652h0(21, c0704c.m4804f() ? 1L : 0L);
            interfaceC1012f.mo4652h0(22, c0704c.m4807i() ? 1L : 0L);
            interfaceC1012f.mo4652h0(23, c0704c.m4801c());
            interfaceC1012f.mo4652h0(24, c0704c.m4802d());
            byte[] m5124c = C0781v.m5124c(c0704c.m4799a());
            if (m5124c == null) {
                interfaceC1012f.mo4646I0(25);
            } else {
                interfaceC1012f.mo4653o0(25, m5124c);
            }
        }

        @Override // androidx.room.AbstractC0658q
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* renamed from: androidx.work.impl.n.r$b */
    class b extends AbstractC0658q {
        b(AbstractC0651j abstractC0651j) {
            super(abstractC0651j);
        }

        @Override // androidx.room.AbstractC0658q
        public String createQuery() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* renamed from: androidx.work.impl.n.r$c */
    class c extends AbstractC0658q {
        c(AbstractC0651j abstractC0651j) {
            super(abstractC0651j);
        }

        @Override // androidx.room.AbstractC0658q
        public String createQuery() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* renamed from: androidx.work.impl.n.r$d */
    class d extends AbstractC0658q {
        d(AbstractC0651j abstractC0651j) {
            super(abstractC0651j);
        }

        @Override // androidx.room.AbstractC0658q
        public String createQuery() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* renamed from: androidx.work.impl.n.r$e */
    class e extends AbstractC0658q {
        e(AbstractC0651j abstractC0651j) {
            super(abstractC0651j);
        }

        @Override // androidx.room.AbstractC0658q
        public String createQuery() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* renamed from: androidx.work.impl.n.r$f */
    class f extends AbstractC0658q {
        f(AbstractC0651j abstractC0651j) {
            super(abstractC0651j);
        }

        @Override // androidx.room.AbstractC0658q
        public String createQuery() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* renamed from: androidx.work.impl.n.r$g */
    class g extends AbstractC0658q {
        g(AbstractC0651j abstractC0651j) {
            super(abstractC0651j);
        }

        @Override // androidx.room.AbstractC0658q
        public String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* renamed from: androidx.work.impl.n.r$h */
    class h extends AbstractC0658q {
        h(AbstractC0651j abstractC0651j) {
            super(abstractC0651j);
        }

        @Override // androidx.room.AbstractC0658q
        public String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* renamed from: androidx.work.impl.n.r$i */
    class i extends AbstractC0658q {
        i(AbstractC0651j abstractC0651j) {
            super(abstractC0651j);
        }

        @Override // androidx.room.AbstractC0658q
        public String createQuery() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public C0777r(AbstractC0651j abstractC0651j) {
        this.f4825a = abstractC0651j;
        this.f4826b = new a(abstractC0651j);
        this.f4827c = new b(abstractC0651j);
        this.f4828d = new c(abstractC0651j);
        this.f4829e = new d(abstractC0651j);
        this.f4830f = new e(abstractC0651j);
        this.f4831g = new f(abstractC0651j);
        this.f4832h = new g(abstractC0651j);
        this.f4833i = new h(abstractC0651j);
        this.f4834j = new i(abstractC0651j);
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    /* renamed from: a */
    public int mo5098a(C0817x.a aVar, String... strArr) {
        this.f4825a.assertNotSuspendingTransaction();
        StringBuilder m4681b = C0666f.m4681b();
        m4681b.append("UPDATE workspec SET state=");
        m4681b.append("?");
        m4681b.append(" WHERE id IN (");
        C0666f.m4680a(m4681b, strArr.length);
        m4681b.append(")");
        InterfaceC1012f compileStatement = this.f4825a.compileStatement(m4681b.toString());
        compileStatement.mo4652h0(1, C0781v.m5131j(aVar));
        int i2 = 2;
        for (String str : strArr) {
            if (str == null) {
                compileStatement.mo4646I0(i2);
            } else {
                compileStatement.mo4654w(i2, str);
            }
            i2++;
        }
        this.f4825a.beginTransaction();
        try {
            int mo6470E = compileStatement.mo6470E();
            this.f4825a.setTransactionSuccessful();
            return mo6470E;
        } finally {
            this.f4825a.endTransaction();
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    /* renamed from: b */
    public int mo5099b(String str, long j2) {
        this.f4825a.assertNotSuspendingTransaction();
        InterfaceC1012f acquire = this.f4832h.acquire();
        acquire.mo4652h0(1, j2);
        if (str == null) {
            acquire.mo4646I0(2);
        } else {
            acquire.mo4654w(2, str);
        }
        this.f4825a.beginTransaction();
        try {
            int mo6470E = acquire.mo6470E();
            this.f4825a.setTransactionSuccessful();
            return mo6470E;
        } finally {
            this.f4825a.endTransaction();
            this.f4832h.release(acquire);
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    /* renamed from: c */
    public List<C0775p.b> mo5100c(String str) {
        C0654m m4644c = C0654m.m4644c("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            m4644c.mo4646I0(1);
        } else {
            m4644c.mo4654w(1, str);
        }
        this.f4825a.assertNotSuspendingTransaction();
        Cursor m4675b = C0663c.m4675b(this.f4825a, m4644c, false, null);
        try {
            int m4673b = C0662b.m4673b(m4675b, DeepLinkIntentReceiver.DeepLinksKeys.f7163ID);
            int m4673b2 = C0662b.m4673b(m4675b, "state");
            ArrayList arrayList = new ArrayList(m4675b.getCount());
            while (m4675b.moveToNext()) {
                C0775p.b bVar = new C0775p.b();
                bVar.f4817a = m4675b.getString(m4673b);
                bVar.f4818b = C0781v.m5128g(m4675b.getInt(m4673b2));
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            m4675b.close();
            m4644c.m4651f();
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    /* renamed from: d */
    public List<C0775p> mo5101d(long j2) {
        C0654m c0654m;
        C0654m m4644c = C0654m.m4644c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        m4644c.mo4652h0(1, j2);
        this.f4825a.assertNotSuspendingTransaction();
        Cursor m4675b = C0663c.m4675b(this.f4825a, m4644c, false, null);
        try {
            int m4673b = C0662b.m4673b(m4675b, "required_network_type");
            int m4673b2 = C0662b.m4673b(m4675b, "requires_charging");
            int m4673b3 = C0662b.m4673b(m4675b, "requires_device_idle");
            int m4673b4 = C0662b.m4673b(m4675b, "requires_battery_not_low");
            int m4673b5 = C0662b.m4673b(m4675b, "requires_storage_not_low");
            int m4673b6 = C0662b.m4673b(m4675b, "trigger_content_update_delay");
            int m4673b7 = C0662b.m4673b(m4675b, "trigger_max_content_delay");
            int m4673b8 = C0662b.m4673b(m4675b, "content_uri_triggers");
            int m4673b9 = C0662b.m4673b(m4675b, DeepLinkIntentReceiver.DeepLinksKeys.f7163ID);
            int m4673b10 = C0662b.m4673b(m4675b, "state");
            int m4673b11 = C0662b.m4673b(m4675b, "worker_class_name");
            int m4673b12 = C0662b.m4673b(m4675b, "input_merger_class_name");
            int m4673b13 = C0662b.m4673b(m4675b, "input");
            int m4673b14 = C0662b.m4673b(m4675b, "output");
            c0654m = m4644c;
            try {
                int m4673b15 = C0662b.m4673b(m4675b, "initial_delay");
                int m4673b16 = C0662b.m4673b(m4675b, "interval_duration");
                int m4673b17 = C0662b.m4673b(m4675b, "flex_duration");
                int m4673b18 = C0662b.m4673b(m4675b, "run_attempt_count");
                int m4673b19 = C0662b.m4673b(m4675b, "backoff_policy");
                int m4673b20 = C0662b.m4673b(m4675b, "backoff_delay_duration");
                int m4673b21 = C0662b.m4673b(m4675b, "period_start_time");
                int m4673b22 = C0662b.m4673b(m4675b, "minimum_retention_duration");
                int m4673b23 = C0662b.m4673b(m4675b, "schedule_requested_at");
                int m4673b24 = C0662b.m4673b(m4675b, "run_in_foreground");
                int m4673b25 = C0662b.m4673b(m4675b, "out_of_quota_policy");
                int i2 = m4673b14;
                ArrayList arrayList = new ArrayList(m4675b.getCount());
                while (m4675b.moveToNext()) {
                    String string = m4675b.getString(m4673b9);
                    int i3 = m4673b9;
                    String string2 = m4675b.getString(m4673b11);
                    int i4 = m4673b11;
                    C0704c c0704c = new C0704c();
                    int i5 = m4673b;
                    c0704c.m4809k(C0781v.m5126e(m4675b.getInt(m4673b)));
                    c0704c.m4811m(m4675b.getInt(m4673b2) != 0);
                    c0704c.m4812n(m4675b.getInt(m4673b3) != 0);
                    c0704c.m4810l(m4675b.getInt(m4673b4) != 0);
                    c0704c.m4813o(m4675b.getInt(m4673b5) != 0);
                    int i6 = m4673b2;
                    int i7 = m4673b3;
                    c0704c.m4814p(m4675b.getLong(m4673b6));
                    c0704c.m4815q(m4675b.getLong(m4673b7));
                    c0704c.m4808j(C0781v.m5123b(m4675b.getBlob(m4673b8)));
                    C0775p c0775p = new C0775p(string, string2);
                    c0775p.f4800d = C0781v.m5128g(m4675b.getInt(m4673b10));
                    c0775p.f4802f = m4675b.getString(m4673b12);
                    c0775p.f4803g = C0706e.m4829g(m4675b.getBlob(m4673b13));
                    int i8 = i2;
                    c0775p.f4804h = C0706e.m4829g(m4675b.getBlob(i8));
                    int i9 = m4673b15;
                    i2 = i8;
                    c0775p.f4805i = m4675b.getLong(i9);
                    int i10 = m4673b12;
                    int i11 = m4673b16;
                    c0775p.f4806j = m4675b.getLong(i11);
                    int i12 = m4673b4;
                    int i13 = m4673b17;
                    c0775p.f4807k = m4675b.getLong(i13);
                    int i14 = m4673b18;
                    c0775p.f4809m = m4675b.getInt(i14);
                    int i15 = m4673b19;
                    c0775p.f4810n = C0781v.m5125d(m4675b.getInt(i15));
                    m4673b17 = i13;
                    int i16 = m4673b20;
                    c0775p.f4811o = m4675b.getLong(i16);
                    int i17 = m4673b21;
                    c0775p.f4812p = m4675b.getLong(i17);
                    m4673b21 = i17;
                    int i18 = m4673b22;
                    c0775p.f4813q = m4675b.getLong(i18);
                    int i19 = m4673b23;
                    c0775p.f4814r = m4675b.getLong(i19);
                    int i20 = m4673b24;
                    c0775p.f4815s = m4675b.getInt(i20) != 0;
                    int i21 = m4673b25;
                    c0775p.f4816t = C0781v.m5127f(m4675b.getInt(i21));
                    c0775p.f4808l = c0704c;
                    arrayList.add(c0775p);
                    m4673b2 = i6;
                    m4673b25 = i21;
                    m4673b12 = i10;
                    m4673b15 = i9;
                    m4673b16 = i11;
                    m4673b18 = i14;
                    m4673b23 = i19;
                    m4673b9 = i3;
                    m4673b11 = i4;
                    m4673b = i5;
                    m4673b24 = i20;
                    m4673b22 = i18;
                    m4673b3 = i7;
                    m4673b20 = i16;
                    m4673b4 = i12;
                    m4673b19 = i15;
                }
                m4675b.close();
                c0654m.m4651f();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                m4675b.close();
                c0654m.m4651f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c0654m = m4644c;
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    public void delete(String str) {
        this.f4825a.assertNotSuspendingTransaction();
        InterfaceC1012f acquire = this.f4827c.acquire();
        if (str == null) {
            acquire.mo4646I0(1);
        } else {
            acquire.mo4654w(1, str);
        }
        this.f4825a.beginTransaction();
        try {
            acquire.mo6470E();
            this.f4825a.setTransactionSuccessful();
        } finally {
            this.f4825a.endTransaction();
            this.f4827c.release(acquire);
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    /* renamed from: e */
    public List<C0775p> mo5102e(int i2) {
        C0654m c0654m;
        C0654m m4644c = C0654m.m4644c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        m4644c.mo4652h0(1, i2);
        this.f4825a.assertNotSuspendingTransaction();
        Cursor m4675b = C0663c.m4675b(this.f4825a, m4644c, false, null);
        try {
            int m4673b = C0662b.m4673b(m4675b, "required_network_type");
            int m4673b2 = C0662b.m4673b(m4675b, "requires_charging");
            int m4673b3 = C0662b.m4673b(m4675b, "requires_device_idle");
            int m4673b4 = C0662b.m4673b(m4675b, "requires_battery_not_low");
            int m4673b5 = C0662b.m4673b(m4675b, "requires_storage_not_low");
            int m4673b6 = C0662b.m4673b(m4675b, "trigger_content_update_delay");
            int m4673b7 = C0662b.m4673b(m4675b, "trigger_max_content_delay");
            int m4673b8 = C0662b.m4673b(m4675b, "content_uri_triggers");
            int m4673b9 = C0662b.m4673b(m4675b, DeepLinkIntentReceiver.DeepLinksKeys.f7163ID);
            int m4673b10 = C0662b.m4673b(m4675b, "state");
            int m4673b11 = C0662b.m4673b(m4675b, "worker_class_name");
            int m4673b12 = C0662b.m4673b(m4675b, "input_merger_class_name");
            int m4673b13 = C0662b.m4673b(m4675b, "input");
            int m4673b14 = C0662b.m4673b(m4675b, "output");
            c0654m = m4644c;
            try {
                int m4673b15 = C0662b.m4673b(m4675b, "initial_delay");
                int m4673b16 = C0662b.m4673b(m4675b, "interval_duration");
                int m4673b17 = C0662b.m4673b(m4675b, "flex_duration");
                int m4673b18 = C0662b.m4673b(m4675b, "run_attempt_count");
                int m4673b19 = C0662b.m4673b(m4675b, "backoff_policy");
                int m4673b20 = C0662b.m4673b(m4675b, "backoff_delay_duration");
                int m4673b21 = C0662b.m4673b(m4675b, "period_start_time");
                int m4673b22 = C0662b.m4673b(m4675b, "minimum_retention_duration");
                int m4673b23 = C0662b.m4673b(m4675b, "schedule_requested_at");
                int m4673b24 = C0662b.m4673b(m4675b, "run_in_foreground");
                int m4673b25 = C0662b.m4673b(m4675b, "out_of_quota_policy");
                int i3 = m4673b14;
                ArrayList arrayList = new ArrayList(m4675b.getCount());
                while (m4675b.moveToNext()) {
                    String string = m4675b.getString(m4673b9);
                    int i4 = m4673b9;
                    String string2 = m4675b.getString(m4673b11);
                    int i5 = m4673b11;
                    C0704c c0704c = new C0704c();
                    int i6 = m4673b;
                    c0704c.m4809k(C0781v.m5126e(m4675b.getInt(m4673b)));
                    c0704c.m4811m(m4675b.getInt(m4673b2) != 0);
                    c0704c.m4812n(m4675b.getInt(m4673b3) != 0);
                    c0704c.m4810l(m4675b.getInt(m4673b4) != 0);
                    c0704c.m4813o(m4675b.getInt(m4673b5) != 0);
                    int i7 = m4673b2;
                    int i8 = m4673b3;
                    c0704c.m4814p(m4675b.getLong(m4673b6));
                    c0704c.m4815q(m4675b.getLong(m4673b7));
                    c0704c.m4808j(C0781v.m5123b(m4675b.getBlob(m4673b8)));
                    C0775p c0775p = new C0775p(string, string2);
                    c0775p.f4800d = C0781v.m5128g(m4675b.getInt(m4673b10));
                    c0775p.f4802f = m4675b.getString(m4673b12);
                    c0775p.f4803g = C0706e.m4829g(m4675b.getBlob(m4673b13));
                    int i9 = i3;
                    c0775p.f4804h = C0706e.m4829g(m4675b.getBlob(i9));
                    i3 = i9;
                    int i10 = m4673b15;
                    c0775p.f4805i = m4675b.getLong(i10);
                    int i11 = m4673b12;
                    int i12 = m4673b16;
                    c0775p.f4806j = m4675b.getLong(i12);
                    int i13 = m4673b4;
                    int i14 = m4673b17;
                    c0775p.f4807k = m4675b.getLong(i14);
                    int i15 = m4673b18;
                    c0775p.f4809m = m4675b.getInt(i15);
                    int i16 = m4673b19;
                    c0775p.f4810n = C0781v.m5125d(m4675b.getInt(i16));
                    m4673b17 = i14;
                    int i17 = m4673b20;
                    c0775p.f4811o = m4675b.getLong(i17);
                    int i18 = m4673b21;
                    c0775p.f4812p = m4675b.getLong(i18);
                    m4673b21 = i18;
                    int i19 = m4673b22;
                    c0775p.f4813q = m4675b.getLong(i19);
                    int i20 = m4673b23;
                    c0775p.f4814r = m4675b.getLong(i20);
                    int i21 = m4673b24;
                    c0775p.f4815s = m4675b.getInt(i21) != 0;
                    int i22 = m4673b25;
                    c0775p.f4816t = C0781v.m5127f(m4675b.getInt(i22));
                    c0775p.f4808l = c0704c;
                    arrayList.add(c0775p);
                    m4673b25 = i22;
                    m4673b2 = i7;
                    m4673b12 = i11;
                    m4673b15 = i10;
                    m4673b16 = i12;
                    m4673b18 = i15;
                    m4673b23 = i20;
                    m4673b9 = i4;
                    m4673b11 = i5;
                    m4673b = i6;
                    m4673b24 = i21;
                    m4673b22 = i19;
                    m4673b3 = i8;
                    m4673b20 = i17;
                    m4673b4 = i13;
                    m4673b19 = i16;
                }
                m4675b.close();
                c0654m.m4651f();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                m4675b.close();
                c0654m.m4651f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c0654m = m4644c;
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    /* renamed from: f */
    public void mo5103f(C0775p c0775p) {
        this.f4825a.assertNotSuspendingTransaction();
        this.f4825a.beginTransaction();
        try {
            this.f4826b.insert((AbstractC0644c<C0775p>) c0775p);
            this.f4825a.setTransactionSuccessful();
        } finally {
            this.f4825a.endTransaction();
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    /* renamed from: g */
    public List<C0775p> mo5104g() {
        C0654m c0654m;
        C0654m m4644c = C0654m.m4644c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f4825a.assertNotSuspendingTransaction();
        Cursor m4675b = C0663c.m4675b(this.f4825a, m4644c, false, null);
        try {
            int m4673b = C0662b.m4673b(m4675b, "required_network_type");
            int m4673b2 = C0662b.m4673b(m4675b, "requires_charging");
            int m4673b3 = C0662b.m4673b(m4675b, "requires_device_idle");
            int m4673b4 = C0662b.m4673b(m4675b, "requires_battery_not_low");
            int m4673b5 = C0662b.m4673b(m4675b, "requires_storage_not_low");
            int m4673b6 = C0662b.m4673b(m4675b, "trigger_content_update_delay");
            int m4673b7 = C0662b.m4673b(m4675b, "trigger_max_content_delay");
            int m4673b8 = C0662b.m4673b(m4675b, "content_uri_triggers");
            int m4673b9 = C0662b.m4673b(m4675b, DeepLinkIntentReceiver.DeepLinksKeys.f7163ID);
            int m4673b10 = C0662b.m4673b(m4675b, "state");
            int m4673b11 = C0662b.m4673b(m4675b, "worker_class_name");
            int m4673b12 = C0662b.m4673b(m4675b, "input_merger_class_name");
            int m4673b13 = C0662b.m4673b(m4675b, "input");
            int m4673b14 = C0662b.m4673b(m4675b, "output");
            c0654m = m4644c;
            try {
                int m4673b15 = C0662b.m4673b(m4675b, "initial_delay");
                int m4673b16 = C0662b.m4673b(m4675b, "interval_duration");
                int m4673b17 = C0662b.m4673b(m4675b, "flex_duration");
                int m4673b18 = C0662b.m4673b(m4675b, "run_attempt_count");
                int m4673b19 = C0662b.m4673b(m4675b, "backoff_policy");
                int m4673b20 = C0662b.m4673b(m4675b, "backoff_delay_duration");
                int m4673b21 = C0662b.m4673b(m4675b, "period_start_time");
                int m4673b22 = C0662b.m4673b(m4675b, "minimum_retention_duration");
                int m4673b23 = C0662b.m4673b(m4675b, "schedule_requested_at");
                int m4673b24 = C0662b.m4673b(m4675b, "run_in_foreground");
                int m4673b25 = C0662b.m4673b(m4675b, "out_of_quota_policy");
                int i2 = m4673b14;
                ArrayList arrayList = new ArrayList(m4675b.getCount());
                while (m4675b.moveToNext()) {
                    String string = m4675b.getString(m4673b9);
                    int i3 = m4673b9;
                    String string2 = m4675b.getString(m4673b11);
                    int i4 = m4673b11;
                    C0704c c0704c = new C0704c();
                    int i5 = m4673b;
                    c0704c.m4809k(C0781v.m5126e(m4675b.getInt(m4673b)));
                    c0704c.m4811m(m4675b.getInt(m4673b2) != 0);
                    c0704c.m4812n(m4675b.getInt(m4673b3) != 0);
                    c0704c.m4810l(m4675b.getInt(m4673b4) != 0);
                    c0704c.m4813o(m4675b.getInt(m4673b5) != 0);
                    int i6 = m4673b2;
                    int i7 = m4673b3;
                    c0704c.m4814p(m4675b.getLong(m4673b6));
                    c0704c.m4815q(m4675b.getLong(m4673b7));
                    c0704c.m4808j(C0781v.m5123b(m4675b.getBlob(m4673b8)));
                    C0775p c0775p = new C0775p(string, string2);
                    c0775p.f4800d = C0781v.m5128g(m4675b.getInt(m4673b10));
                    c0775p.f4802f = m4675b.getString(m4673b12);
                    c0775p.f4803g = C0706e.m4829g(m4675b.getBlob(m4673b13));
                    int i8 = i2;
                    c0775p.f4804h = C0706e.m4829g(m4675b.getBlob(i8));
                    i2 = i8;
                    int i9 = m4673b15;
                    c0775p.f4805i = m4675b.getLong(i9);
                    int i10 = m4673b13;
                    int i11 = m4673b16;
                    c0775p.f4806j = m4675b.getLong(i11);
                    int i12 = m4673b4;
                    int i13 = m4673b17;
                    c0775p.f4807k = m4675b.getLong(i13);
                    int i14 = m4673b18;
                    c0775p.f4809m = m4675b.getInt(i14);
                    int i15 = m4673b19;
                    c0775p.f4810n = C0781v.m5125d(m4675b.getInt(i15));
                    m4673b17 = i13;
                    int i16 = m4673b20;
                    c0775p.f4811o = m4675b.getLong(i16);
                    int i17 = m4673b21;
                    c0775p.f4812p = m4675b.getLong(i17);
                    m4673b21 = i17;
                    int i18 = m4673b22;
                    c0775p.f4813q = m4675b.getLong(i18);
                    int i19 = m4673b23;
                    c0775p.f4814r = m4675b.getLong(i19);
                    int i20 = m4673b24;
                    c0775p.f4815s = m4675b.getInt(i20) != 0;
                    int i21 = m4673b25;
                    c0775p.f4816t = C0781v.m5127f(m4675b.getInt(i21));
                    c0775p.f4808l = c0704c;
                    arrayList.add(c0775p);
                    m4673b25 = i21;
                    m4673b2 = i6;
                    m4673b13 = i10;
                    m4673b15 = i9;
                    m4673b16 = i11;
                    m4673b18 = i14;
                    m4673b23 = i19;
                    m4673b9 = i3;
                    m4673b11 = i4;
                    m4673b = i5;
                    m4673b24 = i20;
                    m4673b22 = i18;
                    m4673b3 = i7;
                    m4673b20 = i16;
                    m4673b4 = i12;
                    m4673b19 = i15;
                }
                m4675b.close();
                c0654m.m4651f();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                m4675b.close();
                c0654m.m4651f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c0654m = m4644c;
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    /* renamed from: h */
    public void mo5105h(String str, C0706e c0706e) {
        this.f4825a.assertNotSuspendingTransaction();
        InterfaceC1012f acquire = this.f4828d.acquire();
        byte[] m4830l = C0706e.m4830l(c0706e);
        if (m4830l == null) {
            acquire.mo4646I0(1);
        } else {
            acquire.mo4653o0(1, m4830l);
        }
        if (str == null) {
            acquire.mo4646I0(2);
        } else {
            acquire.mo4654w(2, str);
        }
        this.f4825a.beginTransaction();
        try {
            acquire.mo6470E();
            this.f4825a.setTransactionSuccessful();
        } finally {
            this.f4825a.endTransaction();
            this.f4828d.release(acquire);
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    /* renamed from: i */
    public List<C0775p> mo5106i() {
        C0654m c0654m;
        C0654m m4644c = C0654m.m4644c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.f4825a.assertNotSuspendingTransaction();
        Cursor m4675b = C0663c.m4675b(this.f4825a, m4644c, false, null);
        try {
            int m4673b = C0662b.m4673b(m4675b, "required_network_type");
            int m4673b2 = C0662b.m4673b(m4675b, "requires_charging");
            int m4673b3 = C0662b.m4673b(m4675b, "requires_device_idle");
            int m4673b4 = C0662b.m4673b(m4675b, "requires_battery_not_low");
            int m4673b5 = C0662b.m4673b(m4675b, "requires_storage_not_low");
            int m4673b6 = C0662b.m4673b(m4675b, "trigger_content_update_delay");
            int m4673b7 = C0662b.m4673b(m4675b, "trigger_max_content_delay");
            int m4673b8 = C0662b.m4673b(m4675b, "content_uri_triggers");
            int m4673b9 = C0662b.m4673b(m4675b, DeepLinkIntentReceiver.DeepLinksKeys.f7163ID);
            int m4673b10 = C0662b.m4673b(m4675b, "state");
            int m4673b11 = C0662b.m4673b(m4675b, "worker_class_name");
            int m4673b12 = C0662b.m4673b(m4675b, "input_merger_class_name");
            int m4673b13 = C0662b.m4673b(m4675b, "input");
            int m4673b14 = C0662b.m4673b(m4675b, "output");
            c0654m = m4644c;
            try {
                int m4673b15 = C0662b.m4673b(m4675b, "initial_delay");
                int m4673b16 = C0662b.m4673b(m4675b, "interval_duration");
                int m4673b17 = C0662b.m4673b(m4675b, "flex_duration");
                int m4673b18 = C0662b.m4673b(m4675b, "run_attempt_count");
                int m4673b19 = C0662b.m4673b(m4675b, "backoff_policy");
                int m4673b20 = C0662b.m4673b(m4675b, "backoff_delay_duration");
                int m4673b21 = C0662b.m4673b(m4675b, "period_start_time");
                int m4673b22 = C0662b.m4673b(m4675b, "minimum_retention_duration");
                int m4673b23 = C0662b.m4673b(m4675b, "schedule_requested_at");
                int m4673b24 = C0662b.m4673b(m4675b, "run_in_foreground");
                int m4673b25 = C0662b.m4673b(m4675b, "out_of_quota_policy");
                int i2 = m4673b14;
                ArrayList arrayList = new ArrayList(m4675b.getCount());
                while (m4675b.moveToNext()) {
                    String string = m4675b.getString(m4673b9);
                    int i3 = m4673b9;
                    String string2 = m4675b.getString(m4673b11);
                    int i4 = m4673b11;
                    C0704c c0704c = new C0704c();
                    int i5 = m4673b;
                    c0704c.m4809k(C0781v.m5126e(m4675b.getInt(m4673b)));
                    c0704c.m4811m(m4675b.getInt(m4673b2) != 0);
                    c0704c.m4812n(m4675b.getInt(m4673b3) != 0);
                    c0704c.m4810l(m4675b.getInt(m4673b4) != 0);
                    c0704c.m4813o(m4675b.getInt(m4673b5) != 0);
                    int i6 = m4673b2;
                    int i7 = m4673b3;
                    c0704c.m4814p(m4675b.getLong(m4673b6));
                    c0704c.m4815q(m4675b.getLong(m4673b7));
                    c0704c.m4808j(C0781v.m5123b(m4675b.getBlob(m4673b8)));
                    C0775p c0775p = new C0775p(string, string2);
                    c0775p.f4800d = C0781v.m5128g(m4675b.getInt(m4673b10));
                    c0775p.f4802f = m4675b.getString(m4673b12);
                    c0775p.f4803g = C0706e.m4829g(m4675b.getBlob(m4673b13));
                    int i8 = i2;
                    c0775p.f4804h = C0706e.m4829g(m4675b.getBlob(i8));
                    i2 = i8;
                    int i9 = m4673b15;
                    c0775p.f4805i = m4675b.getLong(i9);
                    int i10 = m4673b13;
                    int i11 = m4673b16;
                    c0775p.f4806j = m4675b.getLong(i11);
                    int i12 = m4673b4;
                    int i13 = m4673b17;
                    c0775p.f4807k = m4675b.getLong(i13);
                    int i14 = m4673b18;
                    c0775p.f4809m = m4675b.getInt(i14);
                    int i15 = m4673b19;
                    c0775p.f4810n = C0781v.m5125d(m4675b.getInt(i15));
                    m4673b17 = i13;
                    int i16 = m4673b20;
                    c0775p.f4811o = m4675b.getLong(i16);
                    int i17 = m4673b21;
                    c0775p.f4812p = m4675b.getLong(i17);
                    m4673b21 = i17;
                    int i18 = m4673b22;
                    c0775p.f4813q = m4675b.getLong(i18);
                    int i19 = m4673b23;
                    c0775p.f4814r = m4675b.getLong(i19);
                    int i20 = m4673b24;
                    c0775p.f4815s = m4675b.getInt(i20) != 0;
                    int i21 = m4673b25;
                    c0775p.f4816t = C0781v.m5127f(m4675b.getInt(i21));
                    c0775p.f4808l = c0704c;
                    arrayList.add(c0775p);
                    m4673b25 = i21;
                    m4673b2 = i6;
                    m4673b13 = i10;
                    m4673b15 = i9;
                    m4673b16 = i11;
                    m4673b18 = i14;
                    m4673b23 = i19;
                    m4673b9 = i3;
                    m4673b11 = i4;
                    m4673b = i5;
                    m4673b24 = i20;
                    m4673b22 = i18;
                    m4673b3 = i7;
                    m4673b20 = i16;
                    m4673b4 = i12;
                    m4673b19 = i15;
                }
                m4675b.close();
                c0654m.m4651f();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                m4675b.close();
                c0654m.m4651f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c0654m = m4644c;
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    /* renamed from: j */
    public boolean mo5107j() {
        boolean z = false;
        C0654m m4644c = C0654m.m4644c("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f4825a.assertNotSuspendingTransaction();
        Cursor m4675b = C0663c.m4675b(this.f4825a, m4644c, false, null);
        try {
            if (m4675b.moveToFirst()) {
                if (m4675b.getInt(0) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            m4675b.close();
            m4644c.m4651f();
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    /* renamed from: k */
    public List<String> mo5108k(String str) {
        C0654m m4644c = C0654m.m4644c("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            m4644c.mo4646I0(1);
        } else {
            m4644c.mo4654w(1, str);
        }
        this.f4825a.assertNotSuspendingTransaction();
        Cursor m4675b = C0663c.m4675b(this.f4825a, m4644c, false, null);
        try {
            ArrayList arrayList = new ArrayList(m4675b.getCount());
            while (m4675b.moveToNext()) {
                arrayList.add(m4675b.getString(0));
            }
            return arrayList;
        } finally {
            m4675b.close();
            m4644c.m4651f();
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    /* renamed from: l */
    public C0817x.a mo5109l(String str) {
        C0654m m4644c = C0654m.m4644c("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            m4644c.mo4646I0(1);
        } else {
            m4644c.mo4654w(1, str);
        }
        this.f4825a.assertNotSuspendingTransaction();
        Cursor m4675b = C0663c.m4675b(this.f4825a, m4644c, false, null);
        try {
            return m4675b.moveToFirst() ? C0781v.m5128g(m4675b.getInt(0)) : null;
        } finally {
            m4675b.close();
            m4644c.m4651f();
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    /* renamed from: m */
    public C0775p mo5110m(String str) {
        C0654m c0654m;
        C0775p c0775p;
        C0654m m4644c = C0654m.m4644c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            m4644c.mo4646I0(1);
        } else {
            m4644c.mo4654w(1, str);
        }
        this.f4825a.assertNotSuspendingTransaction();
        Cursor m4675b = C0663c.m4675b(this.f4825a, m4644c, false, null);
        try {
            int m4673b = C0662b.m4673b(m4675b, "required_network_type");
            int m4673b2 = C0662b.m4673b(m4675b, "requires_charging");
            int m4673b3 = C0662b.m4673b(m4675b, "requires_device_idle");
            int m4673b4 = C0662b.m4673b(m4675b, "requires_battery_not_low");
            int m4673b5 = C0662b.m4673b(m4675b, "requires_storage_not_low");
            int m4673b6 = C0662b.m4673b(m4675b, "trigger_content_update_delay");
            int m4673b7 = C0662b.m4673b(m4675b, "trigger_max_content_delay");
            int m4673b8 = C0662b.m4673b(m4675b, "content_uri_triggers");
            int m4673b9 = C0662b.m4673b(m4675b, DeepLinkIntentReceiver.DeepLinksKeys.f7163ID);
            int m4673b10 = C0662b.m4673b(m4675b, "state");
            int m4673b11 = C0662b.m4673b(m4675b, "worker_class_name");
            int m4673b12 = C0662b.m4673b(m4675b, "input_merger_class_name");
            int m4673b13 = C0662b.m4673b(m4675b, "input");
            int m4673b14 = C0662b.m4673b(m4675b, "output");
            c0654m = m4644c;
            try {
                int m4673b15 = C0662b.m4673b(m4675b, "initial_delay");
                int m4673b16 = C0662b.m4673b(m4675b, "interval_duration");
                int m4673b17 = C0662b.m4673b(m4675b, "flex_duration");
                int m4673b18 = C0662b.m4673b(m4675b, "run_attempt_count");
                int m4673b19 = C0662b.m4673b(m4675b, "backoff_policy");
                int m4673b20 = C0662b.m4673b(m4675b, "backoff_delay_duration");
                int m4673b21 = C0662b.m4673b(m4675b, "period_start_time");
                int m4673b22 = C0662b.m4673b(m4675b, "minimum_retention_duration");
                int m4673b23 = C0662b.m4673b(m4675b, "schedule_requested_at");
                int m4673b24 = C0662b.m4673b(m4675b, "run_in_foreground");
                int m4673b25 = C0662b.m4673b(m4675b, "out_of_quota_policy");
                if (m4675b.moveToFirst()) {
                    String string = m4675b.getString(m4673b9);
                    String string2 = m4675b.getString(m4673b11);
                    C0704c c0704c = new C0704c();
                    c0704c.m4809k(C0781v.m5126e(m4675b.getInt(m4673b)));
                    c0704c.m4811m(m4675b.getInt(m4673b2) != 0);
                    c0704c.m4812n(m4675b.getInt(m4673b3) != 0);
                    c0704c.m4810l(m4675b.getInt(m4673b4) != 0);
                    c0704c.m4813o(m4675b.getInt(m4673b5) != 0);
                    c0704c.m4814p(m4675b.getLong(m4673b6));
                    c0704c.m4815q(m4675b.getLong(m4673b7));
                    c0704c.m4808j(C0781v.m5123b(m4675b.getBlob(m4673b8)));
                    C0775p c0775p2 = new C0775p(string, string2);
                    c0775p2.f4800d = C0781v.m5128g(m4675b.getInt(m4673b10));
                    c0775p2.f4802f = m4675b.getString(m4673b12);
                    c0775p2.f4803g = C0706e.m4829g(m4675b.getBlob(m4673b13));
                    c0775p2.f4804h = C0706e.m4829g(m4675b.getBlob(m4673b14));
                    c0775p2.f4805i = m4675b.getLong(m4673b15);
                    c0775p2.f4806j = m4675b.getLong(m4673b16);
                    c0775p2.f4807k = m4675b.getLong(m4673b17);
                    c0775p2.f4809m = m4675b.getInt(m4673b18);
                    c0775p2.f4810n = C0781v.m5125d(m4675b.getInt(m4673b19));
                    c0775p2.f4811o = m4675b.getLong(m4673b20);
                    c0775p2.f4812p = m4675b.getLong(m4673b21);
                    c0775p2.f4813q = m4675b.getLong(m4673b22);
                    c0775p2.f4814r = m4675b.getLong(m4673b23);
                    c0775p2.f4815s = m4675b.getInt(m4673b24) != 0;
                    c0775p2.f4816t = C0781v.m5127f(m4675b.getInt(m4673b25));
                    c0775p2.f4808l = c0704c;
                    c0775p = c0775p2;
                } else {
                    c0775p = null;
                }
                m4675b.close();
                c0654m.m4651f();
                return c0775p;
            } catch (Throwable th) {
                th = th;
                m4675b.close();
                c0654m.m4651f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c0654m = m4644c;
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    /* renamed from: n */
    public int mo5111n(String str) {
        this.f4825a.assertNotSuspendingTransaction();
        InterfaceC1012f acquire = this.f4831g.acquire();
        if (str == null) {
            acquire.mo4646I0(1);
        } else {
            acquire.mo4654w(1, str);
        }
        this.f4825a.beginTransaction();
        try {
            int mo6470E = acquire.mo6470E();
            this.f4825a.setTransactionSuccessful();
            return mo6470E;
        } finally {
            this.f4825a.endTransaction();
            this.f4831g.release(acquire);
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    /* renamed from: o */
    public List<String> mo5112o(String str) {
        C0654m m4644c = C0654m.m4644c("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            m4644c.mo4646I0(1);
        } else {
            m4644c.mo4654w(1, str);
        }
        this.f4825a.assertNotSuspendingTransaction();
        Cursor m4675b = C0663c.m4675b(this.f4825a, m4644c, false, null);
        try {
            ArrayList arrayList = new ArrayList(m4675b.getCount());
            while (m4675b.moveToNext()) {
                arrayList.add(m4675b.getString(0));
            }
            return arrayList;
        } finally {
            m4675b.close();
            m4644c.m4651f();
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    /* renamed from: p */
    public List<C0706e> mo5113p(String str) {
        C0654m m4644c = C0654m.m4644c("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            m4644c.mo4646I0(1);
        } else {
            m4644c.mo4654w(1, str);
        }
        this.f4825a.assertNotSuspendingTransaction();
        Cursor m4675b = C0663c.m4675b(this.f4825a, m4644c, false, null);
        try {
            ArrayList arrayList = new ArrayList(m4675b.getCount());
            while (m4675b.moveToNext()) {
                arrayList.add(C0706e.m4829g(m4675b.getBlob(0)));
            }
            return arrayList;
        } finally {
            m4675b.close();
            m4644c.m4651f();
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    /* renamed from: q */
    public int mo5114q(String str) {
        this.f4825a.assertNotSuspendingTransaction();
        InterfaceC1012f acquire = this.f4830f.acquire();
        if (str == null) {
            acquire.mo4646I0(1);
        } else {
            acquire.mo4654w(1, str);
        }
        this.f4825a.beginTransaction();
        try {
            int mo6470E = acquire.mo6470E();
            this.f4825a.setTransactionSuccessful();
            return mo6470E;
        } finally {
            this.f4825a.endTransaction();
            this.f4830f.release(acquire);
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    /* renamed from: r */
    public void mo5115r(String str, long j2) {
        this.f4825a.assertNotSuspendingTransaction();
        InterfaceC1012f acquire = this.f4829e.acquire();
        acquire.mo4652h0(1, j2);
        if (str == null) {
            acquire.mo4646I0(2);
        } else {
            acquire.mo4654w(2, str);
        }
        this.f4825a.beginTransaction();
        try {
            acquire.mo6470E();
            this.f4825a.setTransactionSuccessful();
        } finally {
            this.f4825a.endTransaction();
            this.f4829e.release(acquire);
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    /* renamed from: s */
    public List<C0775p> mo5116s(int i2) {
        C0654m c0654m;
        C0654m m4644c = C0654m.m4644c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        m4644c.mo4652h0(1, i2);
        this.f4825a.assertNotSuspendingTransaction();
        Cursor m4675b = C0663c.m4675b(this.f4825a, m4644c, false, null);
        try {
            int m4673b = C0662b.m4673b(m4675b, "required_network_type");
            int m4673b2 = C0662b.m4673b(m4675b, "requires_charging");
            int m4673b3 = C0662b.m4673b(m4675b, "requires_device_idle");
            int m4673b4 = C0662b.m4673b(m4675b, "requires_battery_not_low");
            int m4673b5 = C0662b.m4673b(m4675b, "requires_storage_not_low");
            int m4673b6 = C0662b.m4673b(m4675b, "trigger_content_update_delay");
            int m4673b7 = C0662b.m4673b(m4675b, "trigger_max_content_delay");
            int m4673b8 = C0662b.m4673b(m4675b, "content_uri_triggers");
            int m4673b9 = C0662b.m4673b(m4675b, DeepLinkIntentReceiver.DeepLinksKeys.f7163ID);
            int m4673b10 = C0662b.m4673b(m4675b, "state");
            int m4673b11 = C0662b.m4673b(m4675b, "worker_class_name");
            int m4673b12 = C0662b.m4673b(m4675b, "input_merger_class_name");
            int m4673b13 = C0662b.m4673b(m4675b, "input");
            int m4673b14 = C0662b.m4673b(m4675b, "output");
            c0654m = m4644c;
            try {
                int m4673b15 = C0662b.m4673b(m4675b, "initial_delay");
                int m4673b16 = C0662b.m4673b(m4675b, "interval_duration");
                int m4673b17 = C0662b.m4673b(m4675b, "flex_duration");
                int m4673b18 = C0662b.m4673b(m4675b, "run_attempt_count");
                int m4673b19 = C0662b.m4673b(m4675b, "backoff_policy");
                int m4673b20 = C0662b.m4673b(m4675b, "backoff_delay_duration");
                int m4673b21 = C0662b.m4673b(m4675b, "period_start_time");
                int m4673b22 = C0662b.m4673b(m4675b, "minimum_retention_duration");
                int m4673b23 = C0662b.m4673b(m4675b, "schedule_requested_at");
                int m4673b24 = C0662b.m4673b(m4675b, "run_in_foreground");
                int m4673b25 = C0662b.m4673b(m4675b, "out_of_quota_policy");
                int i3 = m4673b14;
                ArrayList arrayList = new ArrayList(m4675b.getCount());
                while (m4675b.moveToNext()) {
                    String string = m4675b.getString(m4673b9);
                    int i4 = m4673b9;
                    String string2 = m4675b.getString(m4673b11);
                    int i5 = m4673b11;
                    C0704c c0704c = new C0704c();
                    int i6 = m4673b;
                    c0704c.m4809k(C0781v.m5126e(m4675b.getInt(m4673b)));
                    c0704c.m4811m(m4675b.getInt(m4673b2) != 0);
                    c0704c.m4812n(m4675b.getInt(m4673b3) != 0);
                    c0704c.m4810l(m4675b.getInt(m4673b4) != 0);
                    c0704c.m4813o(m4675b.getInt(m4673b5) != 0);
                    int i7 = m4673b2;
                    int i8 = m4673b3;
                    c0704c.m4814p(m4675b.getLong(m4673b6));
                    c0704c.m4815q(m4675b.getLong(m4673b7));
                    c0704c.m4808j(C0781v.m5123b(m4675b.getBlob(m4673b8)));
                    C0775p c0775p = new C0775p(string, string2);
                    c0775p.f4800d = C0781v.m5128g(m4675b.getInt(m4673b10));
                    c0775p.f4802f = m4675b.getString(m4673b12);
                    c0775p.f4803g = C0706e.m4829g(m4675b.getBlob(m4673b13));
                    int i9 = i3;
                    c0775p.f4804h = C0706e.m4829g(m4675b.getBlob(i9));
                    i3 = i9;
                    int i10 = m4673b15;
                    c0775p.f4805i = m4675b.getLong(i10);
                    int i11 = m4673b12;
                    int i12 = m4673b16;
                    c0775p.f4806j = m4675b.getLong(i12);
                    int i13 = m4673b4;
                    int i14 = m4673b17;
                    c0775p.f4807k = m4675b.getLong(i14);
                    int i15 = m4673b18;
                    c0775p.f4809m = m4675b.getInt(i15);
                    int i16 = m4673b19;
                    c0775p.f4810n = C0781v.m5125d(m4675b.getInt(i16));
                    m4673b17 = i14;
                    int i17 = m4673b20;
                    c0775p.f4811o = m4675b.getLong(i17);
                    int i18 = m4673b21;
                    c0775p.f4812p = m4675b.getLong(i18);
                    m4673b21 = i18;
                    int i19 = m4673b22;
                    c0775p.f4813q = m4675b.getLong(i19);
                    int i20 = m4673b23;
                    c0775p.f4814r = m4675b.getLong(i20);
                    int i21 = m4673b24;
                    c0775p.f4815s = m4675b.getInt(i21) != 0;
                    int i22 = m4673b25;
                    c0775p.f4816t = C0781v.m5127f(m4675b.getInt(i22));
                    c0775p.f4808l = c0704c;
                    arrayList.add(c0775p);
                    m4673b25 = i22;
                    m4673b2 = i7;
                    m4673b12 = i11;
                    m4673b15 = i10;
                    m4673b16 = i12;
                    m4673b18 = i15;
                    m4673b23 = i20;
                    m4673b9 = i4;
                    m4673b11 = i5;
                    m4673b = i6;
                    m4673b24 = i21;
                    m4673b22 = i19;
                    m4673b3 = i8;
                    m4673b20 = i17;
                    m4673b4 = i13;
                    m4673b19 = i16;
                }
                m4675b.close();
                c0654m.m4651f();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                m4675b.close();
                c0654m.m4651f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c0654m = m4644c;
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    /* renamed from: t */
    public int mo5117t() {
        this.f4825a.assertNotSuspendingTransaction();
        InterfaceC1012f acquire = this.f4833i.acquire();
        this.f4825a.beginTransaction();
        try {
            int mo6470E = acquire.mo6470E();
            this.f4825a.setTransactionSuccessful();
            return mo6470E;
        } finally {
            this.f4825a.endTransaction();
            this.f4833i.release(acquire);
        }
    }
}
