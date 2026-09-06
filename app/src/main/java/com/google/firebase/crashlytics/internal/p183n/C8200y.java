package com.google.firebase.crashlytics.internal.p183n;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.C8372j;
import com.google.firebase.crashlytics.internal.C8146h;
import com.google.firebase.crashlytics.internal.C8149k;
import com.google.firebase.crashlytics.internal.InterfaceC8142d;
import com.google.firebase.crashlytics.internal.p181l.InterfaceC8150a;
import com.google.firebase.crashlytics.internal.p182m.InterfaceC8156a;
import com.google.firebase.crashlytics.internal.p182m.InterfaceC8157b;
import com.google.firebase.crashlytics.internal.p184o.C8207f;
import com.google.firebase.crashlytics.internal.p184o.C8213l;
import com.google.firebase.crashlytics.internal.p188r.C8265f;
import com.google.firebase.crashlytics.internal.p190t.InterfaceC8279i;
import com.google.firebase.crashlytics.internal.p191u.C8283a;
import com.google.firebase.crashlytics.internal.p191u.C8285c;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: CrashlyticsCore.java */
/* renamed from: com.google.firebase.crashlytics.h.n.y */
/* loaded from: classes2.dex */
public class C8200y {

    /* renamed from: a */
    private final Context f31037a;

    /* renamed from: b */
    private final C8372j f31038b;

    /* renamed from: c */
    private final C8168e0 f31039c;

    /* renamed from: f */
    private C8201z f31042f;

    /* renamed from: g */
    private C8201z f31043g;

    /* renamed from: h */
    private boolean f31044h;

    /* renamed from: i */
    private C8199x f31045i;

    /* renamed from: j */
    private final C8176i0 f31046j;

    /* renamed from: k */
    private final C8265f f31047k;

    /* renamed from: l */
    public final InterfaceC8157b f31048l;

    /* renamed from: m */
    private final InterfaceC8150a f31049m;

    /* renamed from: n */
    private final ExecutorService f31050n;

    /* renamed from: o */
    private final C8198w f31051o;

    /* renamed from: p */
    private final C8197v f31052p;

    /* renamed from: q */
    private final InterfaceC8142d f31053q;

    /* renamed from: r */
    private final C8149k f31054r;

    /* renamed from: e */
    private final long f31041e = System.currentTimeMillis();

    /* renamed from: d */
    private final C8186n0 f31040d = new C8186n0();

    /* compiled from: CrashlyticsCore.java */
    /* renamed from: com.google.firebase.crashlytics.h.n.y$a */
    class a implements Callable<Task<Void>> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC8279i f31055f;

        a(InterfaceC8279i interfaceC8279i) {
            this.f31055f = interfaceC8279i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task<Void> call() throws Exception {
            return C8200y.this.m25440f(this.f31055f);
        }
    }

    /* compiled from: CrashlyticsCore.java */
    /* renamed from: com.google.firebase.crashlytics.h.n.y$b */
    class b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ InterfaceC8279i f31057f;

        b(InterfaceC8279i interfaceC8279i) {
            this.f31057f = interfaceC8279i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C8200y.this.m25440f(this.f31057f);
        }
    }

    /* compiled from: CrashlyticsCore.java */
    /* renamed from: com.google.firebase.crashlytics.h.n.y$c */
    class c implements Callable<Boolean> {
        c() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            try {
                boolean m25456d = C8200y.this.f31042f.m25456d();
                if (!m25456d) {
                    C8146h.m25176f().m25185k("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(m25456d);
            } catch (Exception e2) {
                C8146h.m25176f().m25180e("Problem encountered deleting Crashlytics initialization marker.", e2);
                return Boolean.FALSE;
            }
        }
    }

    /* compiled from: CrashlyticsCore.java */
    /* renamed from: com.google.firebase.crashlytics.h.n.y$d */
    class d implements Callable<Boolean> {
        d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            return Boolean.valueOf(C8200y.this.f31045i.m25423r());
        }
    }

    public C8200y(C8372j c8372j, C8176i0 c8176i0, InterfaceC8142d interfaceC8142d, C8168e0 c8168e0, InterfaceC8157b interfaceC8157b, InterfaceC8150a interfaceC8150a, C8265f c8265f, ExecutorService executorService, C8197v c8197v, C8149k c8149k) {
        this.f31038b = c8372j;
        this.f31039c = c8168e0;
        this.f31037a = c8372j.m26404i();
        this.f31046j = c8176i0;
        this.f31053q = interfaceC8142d;
        this.f31048l = interfaceC8157b;
        this.f31049m = interfaceC8150a;
        this.f31050n = executorService;
        this.f31047k = c8265f;
        this.f31051o = new C8198w(executorService);
        this.f31052p = c8197v;
        this.f31054r = c8149k;
    }

    /* renamed from: d */
    private void m25439d() {
        try {
            this.f31044h = Boolean.TRUE.equals((Boolean) C8192q0.m25312a(this.f31051o.m25375g(new d())));
        } catch (Exception unused) {
            this.f31044h = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public Task<Void> m25440f(InterfaceC8279i interfaceC8279i) {
        m25448m();
        try {
            this.f31048l.mo25136a(new InterfaceC8156a() { // from class: com.google.firebase.crashlytics.h.n.d
                @Override // com.google.firebase.crashlytics.internal.p182m.InterfaceC8156a
                /* renamed from: a */
                public final void mo25197a(String str) {
                    C8200y.this.m25446k(str);
                }
            });
            this.f31045i.m25419R();
            if (!interfaceC8279i.mo26060b().f31595b.f31602a) {
                C8146h.m25176f().m25177b("Collection of crash reports disabled in Crashlytics settings.");
                return Tasks.m23662d(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.f31045i.m25426y(interfaceC8279i)) {
                C8146h.m25176f().m25185k("Previous sessions could not be finalized.");
            }
            return this.f31045i.m25421T(interfaceC8279i.mo26059a());
        } catch (Exception e2) {
            C8146h.m25176f().m25180e("Crashlytics encountered a problem during asynchronous initialization.", e2);
            return Tasks.m23662d(e2);
        } finally {
            m25447l();
        }
    }

    /* renamed from: h */
    private void m25441h(InterfaceC8279i interfaceC8279i) {
        Future<?> submit = this.f31050n.submit(new b(interfaceC8279i));
        C8146h.m25176f().m25177b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            C8146h.m25176f().m25180e("Crashlytics was interrupted during initialization.", e2);
        } catch (ExecutionException e3) {
            C8146h.m25176f().m25180e("Crashlytics encountered a problem during initialization.", e3);
        } catch (TimeoutException e4) {
            C8146h.m25176f().m25180e("Crashlytics timed out during initialization.", e4);
        }
    }

    /* renamed from: i */
    public static String m25442i() {
        return "18.6.1";
    }

    /* renamed from: j */
    static boolean m25443j(String str, boolean z) {
        if (!z) {
            C8146h.m25176f().m25183i("Configured not to require a build ID.");
            return true;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".     |  | ");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".   \\ |  | /");
        Log.e("FirebaseCrashlytics", ".    \\    /");
        Log.e("FirebaseCrashlytics", ".     \\  /");
        Log.e("FirebaseCrashlytics", ".      \\/");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".      /\\");
        Log.e("FirebaseCrashlytics", ".     /  \\");
        Log.e("FirebaseCrashlytics", ".    /    \\");
        Log.e("FirebaseCrashlytics", ".   / |  | \\");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".");
        return false;
    }

    /* renamed from: e */
    boolean m25444e() {
        return this.f31042f.m25455c();
    }

    /* renamed from: g */
    public Task<Void> m25445g(InterfaceC8279i interfaceC8279i) {
        return C8192q0.m25314c(this.f31050n, new a(interfaceC8279i));
    }

    /* renamed from: k */
    public void m25446k(String str) {
        this.f31045i.m25422W(System.currentTimeMillis() - this.f31041e, str);
    }

    /* renamed from: l */
    void m25447l() {
        this.f31051o.m25375g(new c());
    }

    /* renamed from: m */
    void m25448m() {
        this.f31051o.m25373b();
        this.f31042f.m25454a();
        C8146h.m25176f().m25183i("Initialization marker file was created.");
    }

    /* renamed from: n */
    public boolean m25449n(C8181l c8181l, InterfaceC8279i interfaceC8279i) {
        if (!m25443j(c8181l.f30934b, C8195t.m25338i(this.f31037a, "com.crashlytics.RequireBuildId", true))) {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        }
        String c8194s = new C8194s(this.f31046j).toString();
        try {
            this.f31043g = new C8201z("crash_marker", this.f31047k);
            this.f31042f = new C8201z("initialization_marker", this.f31047k);
            C8213l c8213l = new C8213l(c8194s, this.f31047k, this.f31051o);
            C8207f c8207f = new C8207f(this.f31047k);
            C8283a c8283a = new C8283a(1024, new C8285c(10));
            this.f31054r.m25194b(c8213l);
            this.f31045i = new C8199x(this.f31037a, this.f31051o, this.f31046j, this.f31039c, this.f31047k, this.f31043g, c8181l, c8213l, c8207f, C8188o0.m25286f(this.f31037a, this.f31046j, this.f31047k, c8181l, c8207f, c8213l, c8283a, interfaceC8279i, this.f31040d, this.f31052p), this.f31053q, this.f31049m, this.f31052p);
            boolean m25444e = m25444e();
            m25439d();
            this.f31045i.m25425w(c8194s, Thread.getDefaultUncaughtExceptionHandler(), interfaceC8279i);
            if (!m25444e || !C8195t.m25333d(this.f31037a)) {
                C8146h.m25176f().m25177b("Successfully configured exception handler.");
                return true;
            }
            C8146h.m25176f().m25177b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
            m25441h(interfaceC8279i);
            return false;
        } catch (Exception e2) {
            C8146h.m25176f().m25180e("Crashlytics was not started due to an exception during initialization", e2);
            this.f31045i = null;
            return false;
        }
    }
}
