package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.C8317h;
import com.google.firebase.C8372j;
import com.google.firebase.iid.p195w.InterfaceC8342a;
import com.google.firebase.installations.InterfaceC8352i;
import com.google.firebase.messaging.C8409k0;
import com.google.firebase.messaging.C8417o0;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.p203q.C8446a;
import com.google.firebase.p203q.InterfaceC8447b;
import com.google.firebase.p203q.InterfaceC8449d;
import com.google.firebase.p204r.InterfaceC8459j;
import com.google.firebase.p205s.InterfaceC8463b;
import com.google.firebase.p209u.InterfaceC8523i;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import p241e.p254e.p256b.p257a.InterfaceC8757g;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* loaded from: classes2.dex */
public class FirebaseMessaging {

    /* renamed from: a */
    private static final long f31905a = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: b */
    @SuppressLint({"StaticFieldLeak"})
    private static C8417o0 f31906b;

    /* renamed from: c */
    @SuppressLint({"FirebaseUnknownNullness"})
    static InterfaceC8757g f31907c;

    /* renamed from: d */
    static ScheduledExecutorService f31908d;

    /* renamed from: e */
    private final C8372j f31909e;

    /* renamed from: f */
    private final InterfaceC8342a f31910f;

    /* renamed from: g */
    private final InterfaceC8352i f31911g;

    /* renamed from: h */
    private final Context f31912h;

    /* renamed from: i */
    private final C8390b0 f31913i;

    /* renamed from: j */
    private final C8409k0 f31914j;

    /* renamed from: k */
    private final C8380a f31915k;

    /* renamed from: l */
    private final Executor f31916l;

    /* renamed from: m */
    private final Executor f31917m;

    /* renamed from: n */
    private final Task<C8427t0> f31918n;

    /* renamed from: o */
    private final C8401g0 f31919o;

    /* renamed from: p */
    private boolean f31920p;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
    /* renamed from: com.google.firebase.messaging.FirebaseMessaging$a */
    class C8380a {

        /* renamed from: a */
        private final InterfaceC8449d f31921a;

        /* renamed from: b */
        private boolean f31922b;

        /* renamed from: c */
        private InterfaceC8447b<C8317h> f31923c;

        /* renamed from: d */
        private Boolean f31924d;

        C8380a(InterfaceC8449d interfaceC8449d) {
            this.f31921a = interfaceC8449d;
        }

        /* renamed from: d */
        private Boolean m26448d() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context m26404i = FirebaseMessaging.this.f31909e.m26404i();
            SharedPreferences sharedPreferences = m26404i.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = m26404i.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(m26404i.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: a */
        synchronized void m26449a() {
            if (this.f31922b) {
                return;
            }
            Boolean m26448d = m26448d();
            this.f31924d = m26448d;
            if (m26448d == null) {
                InterfaceC8447b<C8317h> interfaceC8447b = new InterfaceC8447b(this) { // from class: com.google.firebase.messaging.v

                    /* renamed from: a */
                    private final FirebaseMessaging.C8380a f32079a;

                    {
                        this.f32079a = this;
                    }

                    @Override // com.google.firebase.p203q.InterfaceC8447b
                    /* renamed from: a */
                    public void mo24957a(C8446a c8446a) {
                        this.f32079a.m26451c(c8446a);
                    }
                };
                this.f31923c = interfaceC8447b;
                this.f31921a.mo25071a(C8317h.class, interfaceC8447b);
            }
            this.f31922b = true;
        }

        /* renamed from: b */
        synchronized boolean m26450b() {
            Boolean bool;
            m26449a();
            bool = this.f31924d;
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f31909e.m26408r();
        }

        /* renamed from: c */
        final /* synthetic */ void m26451c(C8446a c8446a) {
            if (m26450b()) {
                FirebaseMessaging.this.m26433s();
            }
        }
    }

    FirebaseMessaging(C8372j c8372j, InterfaceC8342a interfaceC8342a, InterfaceC8463b<InterfaceC8523i> interfaceC8463b, InterfaceC8463b<InterfaceC8459j> interfaceC8463b2, InterfaceC8352i interfaceC8352i, InterfaceC8757g interfaceC8757g, InterfaceC8449d interfaceC8449d) {
        this(c8372j, interfaceC8342a, interfaceC8463b, interfaceC8463b2, interfaceC8352i, interfaceC8757g, interfaceC8449d, new C8401g0(c8372j.m26404i()));
    }

    /* renamed from: g */
    private String m26429g() {
        return "[DEFAULT]".equals(this.f31909e.m26405k()) ? HttpUrl.FRAGMENT_ENCODE_SET : this.f31909e.m26407m();
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(C8372j c8372j) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) c8372j.m26403h(FirebaseMessaging.class);
            Preconditions.m14373l(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    /* renamed from: i */
    public static InterfaceC8757g m26430i() {
        return f31907c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void m26435d(String str) {
        if ("[DEFAULT]".equals(this.f31909e.m26405k())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String valueOf = String.valueOf(this.f31909e.m26405k());
                Log.d("FirebaseMessaging", valueOf.length() != 0 ? "Invoking onNewToken for app: ".concat(valueOf) : new String("Invoking onNewToken for app: "));
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new C8416o(this.f31912h).m26601g(intent);
        }
    }

    /* renamed from: r */
    private synchronized void m26432r() {
        if (this.f31920p) {
            return;
        }
        m26446t(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public void m26433s() {
        InterfaceC8342a interfaceC8342a = this.f31910f;
        if (interfaceC8342a != null) {
            interfaceC8342a.mo26197a();
        } else if (m26447u(m26438h())) {
            m26432r();
        }
    }

    /* renamed from: c */
    String m26434c() throws IOException {
        InterfaceC8342a interfaceC8342a = this.f31910f;
        if (interfaceC8342a != null) {
            try {
                return (String) Tasks.m23659a(interfaceC8342a.mo26198b());
            } catch (InterruptedException | ExecutionException e2) {
                throw new IOException(e2);
            }
        }
        C8417o0.a m26438h = m26438h();
        if (!m26447u(m26438h)) {
            return m26438h.f32030b;
        }
        final String m26540c = C8401g0.m26540c(this.f31909e);
        try {
            String str = (String) Tasks.m23659a(this.f31911g.getId().mo23645h(C8418p.m26615d(), new Continuation(this, m26540c) { // from class: com.google.firebase.messaging.t

                /* renamed from: a */
                private final FirebaseMessaging f32055a;

                /* renamed from: b */
                private final String f32056b;

                {
                    this.f32055a = this;
                    this.f32056b = m26540c;
                }

                @Override // com.google.android.gms.tasks.Continuation
                /* renamed from: a */
                public Object mo13777a(Task task) {
                    return this.f32055a.m26442n(this.f32056b, task);
                }
            }));
            f31906b.m26608f(m26429g(), m26540c, str, this.f31919o.m26543a());
            if (m26438h == null || !str.equals(m26438h.f32030b)) {
                m26435d(str);
            }
            return str;
        } catch (InterruptedException | ExecutionException e3) {
            throw new IOException(e3);
        }
    }

    /* renamed from: e */
    void m26436e(Runnable runnable, long j2) {
        synchronized (FirebaseMessaging.class) {
            if (f31908d == null) {
                f31908d = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
            }
            f31908d.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    /* renamed from: f */
    Context m26437f() {
        return this.f31912h;
    }

    /* renamed from: h */
    C8417o0.a m26438h() {
        return f31906b.m26606d(m26429g(), C8401g0.m26540c(this.f31909e));
    }

    /* renamed from: k */
    public boolean m26439k() {
        return this.f31915k.m26450b();
    }

    /* renamed from: l */
    boolean m26440l() {
        return this.f31919o.m26547g();
    }

    /* renamed from: m */
    final /* synthetic */ Task m26441m(Task task) {
        return this.f31913i.m26488d((String) task.mo23647j());
    }

    /* renamed from: n */
    final /* synthetic */ Task m26442n(String str, final Task task) throws Exception {
        return this.f31914j.m26577a(str, new C8409k0.a(this, task) { // from class: com.google.firebase.messaging.u

            /* renamed from: a */
            private final FirebaseMessaging f32067a;

            /* renamed from: b */
            private final Task f32068b;

            {
                this.f32067a = this;
                this.f32068b = task;
            }

            @Override // com.google.firebase.messaging.C8409k0.a
            public Task start() {
                return this.f32067a.m26441m(this.f32068b);
            }
        });
    }

    /* renamed from: o */
    final /* synthetic */ void m26443o() {
        if (m26439k()) {
            m26433s();
        }
    }

    /* renamed from: p */
    final /* synthetic */ void m26444p(C8427t0 c8427t0) {
        if (m26439k()) {
            c8427t0.m26647n();
        }
    }

    /* renamed from: q */
    synchronized void m26445q(boolean z) {
        this.f31920p = z;
    }

    /* renamed from: t */
    synchronized void m26446t(long j2) {
        m26436e(new RunnableC8419p0(this, Math.min(Math.max(30L, j2 + j2), f31905a)), j2);
        this.f31920p = true;
    }

    /* renamed from: u */
    boolean m26447u(C8417o0.a aVar) {
        return aVar == null || aVar.m26611b(this.f31919o.m26543a());
    }

    FirebaseMessaging(C8372j c8372j, InterfaceC8342a interfaceC8342a, InterfaceC8463b<InterfaceC8523i> interfaceC8463b, InterfaceC8463b<InterfaceC8459j> interfaceC8463b2, InterfaceC8352i interfaceC8352i, InterfaceC8757g interfaceC8757g, InterfaceC8449d interfaceC8449d, C8401g0 c8401g0) {
        this(c8372j, interfaceC8342a, interfaceC8352i, interfaceC8757g, interfaceC8449d, c8401g0, new C8390b0(c8372j, c8401g0, interfaceC8463b, interfaceC8463b2, interfaceC8352i), C8418p.m26616e(), C8418p.m26613b());
    }

    FirebaseMessaging(C8372j c8372j, InterfaceC8342a interfaceC8342a, InterfaceC8352i interfaceC8352i, InterfaceC8757g interfaceC8757g, InterfaceC8449d interfaceC8449d, C8401g0 c8401g0, C8390b0 c8390b0, Executor executor, Executor executor2) {
        this.f31920p = false;
        f31907c = interfaceC8757g;
        this.f31909e = c8372j;
        this.f31910f = interfaceC8342a;
        this.f31911g = interfaceC8352i;
        this.f31915k = new C8380a(interfaceC8449d);
        Context m26404i = c8372j.m26404i();
        this.f31912h = m26404i;
        this.f31919o = c8401g0;
        this.f31917m = executor;
        this.f31913i = c8390b0;
        this.f31914j = new C8409k0(executor);
        this.f31916l = executor2;
        if (interfaceC8342a != null) {
            interfaceC8342a.mo26199c(new InterfaceC8342a.a(this) { // from class: com.google.firebase.messaging.q

                /* renamed from: a */
                private final FirebaseMessaging f32038a;

                {
                    this.f32038a = this;
                }

                @Override // com.google.firebase.iid.p195w.InterfaceC8342a.a
                /* renamed from: a */
                public void mo26244a(String str) {
                    this.f32038a.m26435d(str);
                }
            });
        }
        synchronized (FirebaseMessaging.class) {
            if (f31906b == null) {
                f31906b = new C8417o0(m26404i);
            }
        }
        executor2.execute(new Runnable(this) { // from class: com.google.firebase.messaging.r

            /* renamed from: f */
            private final FirebaseMessaging f32043f;

            {
                this.f32043f = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f32043f.m26443o();
            }
        });
        Task<C8427t0> m26637d = C8427t0.m26637d(this, interfaceC8352i, c8401g0, c8390b0, m26404i, C8418p.m26617f());
        this.f31918n = m26637d;
        m26637d.mo23642e(C8418p.m26618g(), new OnSuccessListener(this) { // from class: com.google.firebase.messaging.s

            /* renamed from: a */
            private final FirebaseMessaging f32048a;

            {
                this.f32048a = this;
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public void onSuccess(Object obj) {
                this.f32048a.m26444p((C8427t0) obj);
            }
        });
    }
}
