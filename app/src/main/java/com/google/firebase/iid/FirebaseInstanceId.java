package com.google.firebase.iid;

import android.os.Build;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.C8372j;
import com.google.firebase.iid.C8338s;
import com.google.firebase.iid.C8340u;
import com.google.firebase.iid.p195w.InterfaceC8342a;
import com.google.firebase.installations.InterfaceC8352i;
import com.google.firebase.p204r.InterfaceC8459j;
import com.google.firebase.p205s.InterfaceC8463b;
import com.google.firebase.p209u.InterfaceC8523i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
@Deprecated
/* loaded from: classes2.dex */
public class FirebaseInstanceId {

    /* renamed from: b */
    private static C8340u f31706b;

    /* renamed from: d */
    @VisibleForTesting
    static ScheduledExecutorService f31708d;

    /* renamed from: e */
    @VisibleForTesting
    final Executor f31709e;

    /* renamed from: f */
    private final C8372j f31710f;

    /* renamed from: g */
    private final C8333n f31711g;

    /* renamed from: h */
    private final C8330k f31712h;

    /* renamed from: i */
    private final C8338s f31713i;

    /* renamed from: j */
    private final InterfaceC8352i f31714j;

    /* renamed from: k */
    private boolean f31715k;

    /* renamed from: l */
    private final List<InterfaceC8342a.a> f31716l;

    /* renamed from: a */
    private static final long f31705a = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: c */
    private static final Pattern f31707c = Pattern.compile("\\AA[\\w-]{38}\\z");

    FirebaseInstanceId(C8372j c8372j, C8333n c8333n, Executor executor, Executor executor2, InterfaceC8463b<InterfaceC8523i> interfaceC8463b, InterfaceC8463b<InterfaceC8459j> interfaceC8463b2, InterfaceC8352i interfaceC8352i) {
        this.f31715k = false;
        this.f31716l = new ArrayList();
        if (C8333n.m26212c(c8372j) == null) {
            throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
        }
        synchronized (FirebaseInstanceId.class) {
            if (f31706b == null) {
                f31706b = new C8340u(c8372j.m26404i());
            }
        }
        this.f31710f = c8372j;
        this.f31711g = c8333n;
        this.f31712h = new C8330k(c8372j, c8333n, interfaceC8463b, interfaceC8463b2, interfaceC8352i);
        this.f31709e = executor2;
        this.f31713i = new C8338s(executor);
        this.f31714j = interfaceC8352i;
    }

    /* renamed from: B */
    private static String m26161B(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    /* renamed from: F */
    private void m26162F() {
        if (m26179H(m26189q())) {
            m26177E();
        }
    }

    /* renamed from: b */
    private <T> T m26163b(Task<T> task) throws IOException {
        try {
            return (T) Tasks.m23660b(task, 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    m26175C();
                }
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e2);
        }
    }

    /* renamed from: c */
    private static <T> T m26164c(Task<T> task) throws InterruptedException {
        Preconditions.m14373l(task, "Task must not be null");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        task.mo23640c(ExecutorC8323d.f31723f, new OnCompleteListener(countDownLatch) { // from class: com.google.firebase.iid.e

            /* renamed from: a */
            private final CountDownLatch f31724a;

            {
                this.f31724a = countDownLatch;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            /* renamed from: a */
            public void mo7019a(Task task2) {
                this.f31724a.countDown();
            }
        });
        countDownLatch.await(30000L, TimeUnit.MILLISECONDS);
        return (T) m26168m(task);
    }

    /* renamed from: e */
    private static void m26165e(C8372j c8372j) {
        Preconditions.m14369h(c8372j.m26406l().m26426e(), "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        Preconditions.m14369h(c8372j.m26406l().m26424c(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        Preconditions.m14369h(c8372j.m26406l().m26423b(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        Preconditions.m14363b(m26172v(c8372j.m26406l().m26424c()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.m14363b(m26171u(c8372j.m26406l().m26423b()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @Keep
    public static FirebaseInstanceId getInstance(C8372j c8372j) {
        m26165e(c8372j);
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) c8372j.m26403h(FirebaseInstanceId.class);
        Preconditions.m14373l(firebaseInstanceId, "Firebase Instance ID component is not present");
        return firebaseInstanceId;
    }

    /* renamed from: j */
    public static FirebaseInstanceId m26166j() {
        return getInstance(C8372j.m26392j());
    }

    /* renamed from: l */
    private Task<InterfaceC8331l> m26167l(final String str, String str2) {
        final String m26161B = m26161B(str2);
        return Tasks.m23663e(null).mo23645h(this.f31709e, new Continuation(this, str, m26161B) { // from class: com.google.firebase.iid.c

            /* renamed from: a */
            private final FirebaseInstanceId f31720a;

            /* renamed from: b */
            private final String f31721b;

            /* renamed from: c */
            private final String f31722c;

            {
                this.f31720a = this;
                this.f31721b = str;
                this.f31722c = m26161B;
            }

            @Override // com.google.android.gms.tasks.Continuation
            /* renamed from: a */
            public Object mo13777a(Task task) {
                return this.f31720a.m26174A(this.f31721b, this.f31722c, task);
            }
        });
    }

    /* renamed from: m */
    private static <T> T m26168m(Task<T> task) {
        if (task.mo23651n()) {
            return task.mo23647j();
        }
        if (task.mo23649l()) {
            throw new CancellationException("Task is already canceled");
        }
        if (task.mo23650m()) {
            throw new IllegalStateException(task.mo23646i());
        }
        throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
    }

    /* renamed from: n */
    private String m26169n() {
        return "[DEFAULT]".equals(this.f31710f.m26405k()) ? HttpUrl.FRAGMENT_ENCODE_SET : this.f31710f.m26407m();
    }

    /* renamed from: s */
    static boolean m26170s() {
        return Log.isLoggable("FirebaseInstanceId", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3));
    }

    /* renamed from: u */
    static boolean m26171u(String str) {
        return f31707c.matcher(str).matches();
    }

    /* renamed from: v */
    static boolean m26172v(String str) {
        return str.contains(":");
    }

    /* renamed from: A */
    final /* synthetic */ Task m26174A(final String str, final String str2, Task task) throws Exception {
        final String m26185i = m26185i();
        final C8340u.a m26190r = m26190r(str, str2);
        return !m26179H(m26190r) ? Tasks.m23663e(new C8332m(m26185i, m26190r.f31765b)) : this.f31713i.m26220a(str, str2, new C8338s.a(this, m26185i, str, str2, m26190r) { // from class: com.google.firebase.iid.f

            /* renamed from: a */
            private final FirebaseInstanceId f31725a;

            /* renamed from: b */
            private final String f31726b;

            /* renamed from: c */
            private final String f31727c;

            /* renamed from: d */
            private final String f31728d;

            /* renamed from: e */
            private final C8340u.a f31729e;

            {
                this.f31725a = this;
                this.f31726b = m26185i;
                this.f31727c = str;
                this.f31728d = str2;
                this.f31729e = m26190r;
            }

            @Override // com.google.firebase.iid.C8338s.a
            public Task start() {
                return this.f31725a.m26194z(this.f31726b, this.f31727c, this.f31728d, this.f31729e);
            }
        });
    }

    /* renamed from: C */
    synchronized void m26175C() {
        f31706b.m26230d();
    }

    /* renamed from: D */
    synchronized void m26176D(boolean z) {
        this.f31715k = z;
    }

    /* renamed from: E */
    synchronized void m26177E() {
        if (this.f31715k) {
            return;
        }
        m26178G(0L);
    }

    /* renamed from: G */
    synchronized void m26178G(long j2) {
        m26182f(new RunnableC8341v(this, Math.min(Math.max(30L, j2 + j2), f31705a)), j2);
        this.f31715k = true;
    }

    /* renamed from: H */
    boolean m26179H(C8340u.a aVar) {
        return aVar == null || aVar.m26238c(this.f31711g.m26215a());
    }

    /* renamed from: a */
    void m26180a(InterfaceC8342a.a aVar) {
        this.f31716l.add(aVar);
    }

    /* renamed from: d */
    String m26181d() throws IOException {
        return m26188p(C8333n.m26212c(this.f31710f), "*");
    }

    /* renamed from: f */
    void m26182f(Runnable runnable, long j2) {
        synchronized (FirebaseInstanceId.class) {
            if (f31708d == null) {
                f31708d = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("FirebaseInstanceId"));
            }
            f31708d.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    /* renamed from: g */
    C8372j m26183g() {
        return this.f31710f;
    }

    @Deprecated
    /* renamed from: h */
    public String m26184h() {
        m26165e(this.f31710f);
        m26162F();
        return m26185i();
    }

    /* renamed from: i */
    String m26185i() {
        try {
            f31706b.m26234i(this.f31710f.m26407m());
            return (String) m26164c(this.f31714j.getId());
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Deprecated
    /* renamed from: k */
    public Task<InterfaceC8331l> m26186k() {
        m26165e(this.f31710f);
        return m26167l(C8333n.m26212c(this.f31710f), "*");
    }

    @Deprecated
    /* renamed from: o */
    public String m26187o() {
        m26165e(this.f31710f);
        C8340u.a m26189q = m26189q();
        if (m26179H(m26189q)) {
            m26177E();
        }
        return C8340u.a.m26236b(m26189q);
    }

    @Deprecated
    /* renamed from: p */
    public String m26188p(String str, String str2) throws IOException {
        m26165e(this.f31710f);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((InterfaceC8331l) m26163b(m26167l(str, str2))).mo26211a();
        }
        throw new IOException("MAIN_THREAD");
    }

    /* renamed from: q */
    C8340u.a m26189q() {
        return m26190r(C8333n.m26212c(this.f31710f), "*");
    }

    @VisibleForTesting
    /* renamed from: r */
    C8340u.a m26190r(String str, String str2) {
        return f31706b.m26231f(m26169n(), str, str2);
    }

    @VisibleForTesting
    /* renamed from: t */
    public boolean m26191t() {
        return this.f31711g.m26219g();
    }

    /* renamed from: x */
    final /* synthetic */ Task m26192x(String str, String str2, String str3, String str4) throws Exception {
        f31706b.m26233h(m26169n(), str, str2, str4, this.f31711g.m26215a());
        return Tasks.m23663e(new C8332m(str3, str4));
    }

    /* renamed from: y */
    final /* synthetic */ void m26193y(C8340u.a aVar, InterfaceC8331l interfaceC8331l) {
        String mo26211a = interfaceC8331l.mo26211a();
        if (aVar == null || !mo26211a.equals(aVar.f31765b)) {
            Iterator<InterfaceC8342a.a> it = this.f31716l.iterator();
            while (it.hasNext()) {
                it.next().mo26244a(mo26211a);
            }
        }
    }

    /* renamed from: z */
    final /* synthetic */ Task m26194z(final String str, final String str2, final String str3, final C8340u.a aVar) {
        return this.f31712h.m26209d(str, str2, str3).mo23653p(this.f31709e, new SuccessContinuation(this, str2, str3, str) { // from class: com.google.firebase.iid.g

            /* renamed from: a */
            private final FirebaseInstanceId f31730a;

            /* renamed from: b */
            private final String f31731b;

            /* renamed from: c */
            private final String f31732c;

            /* renamed from: d */
            private final String f31733d;

            {
                this.f31730a = this;
                this.f31731b = str2;
                this.f31732c = str3;
                this.f31733d = str;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            /* renamed from: a */
            public Task mo13778a(Object obj) {
                return this.f31730a.m26192x(this.f31731b, this.f31732c, this.f31733d, (String) obj);
            }
        }).mo23642e(ExecutorC8327h.f31734f, new OnSuccessListener(this, aVar) { // from class: com.google.firebase.iid.i

            /* renamed from: a */
            private final FirebaseInstanceId f31735a;

            /* renamed from: b */
            private final C8340u.a f31736b;

            {
                this.f31735a = this;
                this.f31736b = aVar;
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public void onSuccess(Object obj) {
                this.f31735a.m26193y(this.f31736b, (InterfaceC8331l) obj);
            }
        });
    }

    FirebaseInstanceId(C8372j c8372j, InterfaceC8463b<InterfaceC8523i> interfaceC8463b, InterfaceC8463b<InterfaceC8459j> interfaceC8463b2, InterfaceC8352i interfaceC8352i) {
        this(c8372j, new C8333n(c8372j.m26404i()), C8321b.m26201b(), C8321b.m26201b(), interfaceC8463b, interfaceC8463b2, interfaceC8352i);
    }
}
