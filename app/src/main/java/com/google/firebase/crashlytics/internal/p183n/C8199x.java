package com.google.firebase.crashlytics.internal.p183n;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.C8146h;
import com.google.firebase.crashlytics.internal.InterfaceC8142d;
import com.google.firebase.crashlytics.internal.InterfaceC8147i;
import com.google.firebase.crashlytics.internal.p181l.InterfaceC8150a;
import com.google.firebase.crashlytics.internal.p183n.C8164c0;
import com.google.firebase.crashlytics.internal.p184o.C8207f;
import com.google.firebase.crashlytics.internal.p184o.C8213l;
import com.google.firebase.crashlytics.internal.p185p.AbstractC8225f0;
import com.google.firebase.crashlytics.internal.p185p.AbstractC8227g0;
import com.google.firebase.crashlytics.internal.p188r.C8265f;
import com.google.firebase.crashlytics.internal.p190t.C8274d;
import com.google.firebase.crashlytics.internal.p190t.InterfaceC8279i;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: CrashlyticsController.java */
/* renamed from: com.google.firebase.crashlytics.h.n.x */
/* loaded from: classes2.dex */
class C8199x {

    /* renamed from: a */
    static final FilenameFilter f30993a = new FilenameFilter() { // from class: com.google.firebase.crashlytics.h.n.c
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean startsWith;
            startsWith = str.startsWith(".ae");
            return startsWith;
        }
    };

    /* renamed from: b */
    private final Context f30994b;

    /* renamed from: c */
    private final C8168e0 f30995c;

    /* renamed from: d */
    private final C8201z f30996d;

    /* renamed from: e */
    private final C8213l f30997e;

    /* renamed from: f */
    private final C8198w f30998f;

    /* renamed from: g */
    private final C8176i0 f30999g;

    /* renamed from: h */
    private final C8265f f31000h;

    /* renamed from: i */
    private final C8181l f31001i;

    /* renamed from: j */
    private final C8207f f31002j;

    /* renamed from: k */
    private final InterfaceC8142d f31003k;

    /* renamed from: l */
    private final InterfaceC8150a f31004l;

    /* renamed from: m */
    private final C8197v f31005m;

    /* renamed from: n */
    private final C8188o0 f31006n;

    /* renamed from: o */
    private C8164c0 f31007o;

    /* renamed from: p */
    private InterfaceC8279i f31008p = null;

    /* renamed from: q */
    final TaskCompletionSource<Boolean> f31009q = new TaskCompletionSource<>();

    /* renamed from: r */
    final TaskCompletionSource<Boolean> f31010r = new TaskCompletionSource<>();

    /* renamed from: s */
    final TaskCompletionSource<Void> f31011s = new TaskCompletionSource<>();

    /* renamed from: t */
    final AtomicBoolean f31012t = new AtomicBoolean(false);

    /* compiled from: CrashlyticsController.java */
    /* renamed from: com.google.firebase.crashlytics.h.n.x$a */
    class a implements C8164c0.a {
        a() {
        }

        @Override // com.google.firebase.crashlytics.internal.p183n.C8164c0.a
        /* renamed from: a */
        public void mo25231a(InterfaceC8279i interfaceC8279i, Thread thread, Throwable th) {
            C8199x.this.m25414G(interfaceC8279i, thread, th);
        }
    }

    /* compiled from: CrashlyticsController.java */
    /* renamed from: com.google.firebase.crashlytics.h.n.x$b */
    class b implements Callable<Task<Void>> {

        /* renamed from: f */
        final /* synthetic */ long f31014f;

        /* renamed from: g */
        final /* synthetic */ Throwable f31015g;

        /* renamed from: h */
        final /* synthetic */ Thread f31016h;

        /* renamed from: i */
        final /* synthetic */ InterfaceC8279i f31017i;

        /* renamed from: j */
        final /* synthetic */ boolean f31018j;

        /* compiled from: CrashlyticsController.java */
        /* renamed from: com.google.firebase.crashlytics.h.n.x$b$a */
        class a implements SuccessContinuation<C8274d, Void> {

            /* renamed from: a */
            final /* synthetic */ Executor f31020a;

            /* renamed from: b */
            final /* synthetic */ String f31021b;

            a(Executor executor, String str) {
                this.f31020a = executor;
                this.f31021b = str;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Task<Void> mo13778a(C8274d c8274d) throws Exception {
                if (c8274d == null) {
                    C8146h.m25176f().m25185k("Received null app settings, cannot send reports at crash time.");
                    return Tasks.m23663e(null);
                }
                Task[] taskArr = new Task[2];
                taskArr[0] = C8199x.this.m25385M();
                taskArr[1] = C8199x.this.f31006n.m25303w(this.f31020a, b.this.f31018j ? this.f31021b : null);
                return Tasks.m23665g(taskArr);
            }
        }

        b(long j2, Throwable th, Thread thread, InterfaceC8279i interfaceC8279i, boolean z) {
            this.f31014f = j2;
            this.f31015g = th;
            this.f31016h = thread;
            this.f31017i = interfaceC8279i;
            this.f31018j = z;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task<Void> call() throws Exception {
            long m25382E = C8199x.m25382E(this.f31014f);
            String m25378A = C8199x.this.m25378A();
            if (m25378A == null) {
                C8146h.m25176f().m25179d("Tried to write a fatal exception while no session was open.");
                return Tasks.m23663e(null);
            }
            C8199x.this.f30996d.m25454a();
            C8199x.this.f31006n.m25299s(this.f31015g, this.f31016h, m25378A, m25382E);
            C8199x.this.m25410v(this.f31014f);
            C8199x.this.m25424s(this.f31017i);
            C8199x.this.m25409u(new C8194s(C8199x.this.f30999g).toString(), Boolean.valueOf(this.f31018j));
            if (!C8199x.this.f30995c.m25239d()) {
                return Tasks.m23663e(null);
            }
            Executor m25374c = C8199x.this.f30998f.m25374c();
            return this.f31017i.mo26059a().mo23653p(m25374c, new a(m25374c, m25378A));
        }
    }

    /* compiled from: CrashlyticsController.java */
    /* renamed from: com.google.firebase.crashlytics.h.n.x$c */
    class c implements SuccessContinuation<Void, Boolean> {
        c() {
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Task<Boolean> mo13778a(Void r1) throws Exception {
            return Tasks.m23663e(Boolean.TRUE);
        }
    }

    /* compiled from: CrashlyticsController.java */
    /* renamed from: com.google.firebase.crashlytics.h.n.x$d */
    class d implements SuccessContinuation<Boolean, Void> {

        /* renamed from: a */
        final /* synthetic */ Task f31024a;

        /* compiled from: CrashlyticsController.java */
        /* renamed from: com.google.firebase.crashlytics.h.n.x$d$a */
        class a implements Callable<Task<Void>> {

            /* renamed from: f */
            final /* synthetic */ Boolean f31026f;

            /* compiled from: CrashlyticsController.java */
            /* renamed from: com.google.firebase.crashlytics.h.n.x$d$a$a, reason: collision with other inner class name */
            class C11449a implements SuccessContinuation<C8274d, Void> {

                /* renamed from: a */
                final /* synthetic */ Executor f31028a;

                C11449a(Executor executor) {
                    this.f31028a = executor;
                }

                @Override // com.google.android.gms.tasks.SuccessContinuation
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public Task<Void> mo13778a(C8274d c8274d) throws Exception {
                    if (c8274d == null) {
                        C8146h.m25176f().m25185k("Received null app settings at app startup. Cannot send cached reports");
                        return Tasks.m23663e(null);
                    }
                    C8199x.this.m25385M();
                    C8199x.this.f31006n.m25302v(this.f31028a);
                    C8199x.this.f31011s.m23658e(null);
                    return Tasks.m23663e(null);
                }
            }

            a(Boolean bool) {
                this.f31026f = bool;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Task<Void> call() throws Exception {
                if (this.f31026f.booleanValue()) {
                    C8146h.m25176f().m25177b("Sending cached crash reports...");
                    C8199x.this.f30995c.m25238c(this.f31026f.booleanValue());
                    Executor m25374c = C8199x.this.f30998f.m25374c();
                    return d.this.f31024a.mo23653p(m25374c, new C11449a(m25374c));
                }
                C8146h.m25176f().m25183i("Deleting cached crash reports...");
                C8199x.m25407q(C8199x.this.m25417K());
                C8199x.this.f31006n.m25301u();
                C8199x.this.f31011s.m23658e(null);
                return Tasks.m23663e(null);
            }
        }

        d(Task task) {
            this.f31024a = task;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Task<Void> mo13778a(Boolean bool) throws Exception {
            return C8199x.this.f30998f.m25376h(new a(bool));
        }
    }

    /* compiled from: CrashlyticsController.java */
    /* renamed from: com.google.firebase.crashlytics.h.n.x$e */
    class e implements Callable<Void> {

        /* renamed from: f */
        final /* synthetic */ long f31030f;

        /* renamed from: g */
        final /* synthetic */ String f31031g;

        e(long j2, String str) {
            this.f31030f = j2;
            this.f31031g = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            if (C8199x.this.m25416I()) {
                return null;
            }
            C8199x.this.f31002j.m25479g(this.f31030f, this.f31031g);
            return null;
        }
    }

    /* compiled from: CrashlyticsController.java */
    /* renamed from: com.google.firebase.crashlytics.h.n.x$f */
    class f implements Callable<Void> {

        /* renamed from: f */
        final /* synthetic */ String f31033f;

        f(String str) {
            this.f31033f = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            C8199x.this.m25409u(this.f31033f, Boolean.FALSE);
            return null;
        }
    }

    /* compiled from: CrashlyticsController.java */
    /* renamed from: com.google.firebase.crashlytics.h.n.x$g */
    class g implements Callable<Void> {

        /* renamed from: f */
        final /* synthetic */ long f31035f;

        g(long j2) {
            this.f31035f = j2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.f31035f);
            C8199x.this.f31004l.mo25135a("_ae", bundle);
            return null;
        }
    }

    C8199x(Context context, C8198w c8198w, C8176i0 c8176i0, C8168e0 c8168e0, C8265f c8265f, C8201z c8201z, C8181l c8181l, C8213l c8213l, C8207f c8207f, C8188o0 c8188o0, InterfaceC8142d interfaceC8142d, InterfaceC8150a interfaceC8150a, C8197v c8197v) {
        this.f30994b = context;
        this.f30998f = c8198w;
        this.f30999g = c8176i0;
        this.f30995c = c8168e0;
        this.f31000h = c8265f;
        this.f30996d = c8201z;
        this.f31001i = c8181l;
        this.f30997e = c8213l;
        this.f31002j = c8207f;
        this.f31003k = interfaceC8142d;
        this.f31004l = interfaceC8150a;
        this.f31005m = c8197v;
        this.f31006n = c8188o0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public String m25378A() {
        SortedSet<String> m25297o = this.f31006n.m25297o();
        if (m25297o.isEmpty()) {
            return null;
        }
        return m25297o.first();
    }

    /* renamed from: B */
    private static long m25379B() {
        return m25382E(System.currentTimeMillis());
    }

    /* renamed from: C */
    static List<InterfaceC8182l0> m25380C(InterfaceC8147i interfaceC8147i, String str, C8265f c8265f, byte[] bArr) {
        File m26007o = c8265f.m26007o(str, "user-data");
        File m26007o2 = c8265f.m26007o(str, "keys");
        File m26007o3 = c8265f.m26007o(str, "rollouts-state");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C8193r("logs_file", "logs", bArr));
        arrayList.add(new C8174h0("crash_meta_file", "metadata", interfaceC8147i.mo25166g()));
        arrayList.add(new C8174h0("session_meta_file", "session", interfaceC8147i.mo25165f()));
        arrayList.add(new C8174h0("app_meta_file", "app", interfaceC8147i.mo25160a()));
        arrayList.add(new C8174h0("device_meta_file", "device", interfaceC8147i.mo25162c()));
        arrayList.add(new C8174h0("os_meta_file", "os", interfaceC8147i.mo25161b()));
        arrayList.add(m25387O(interfaceC8147i));
        arrayList.add(new C8174h0("user_meta_file", "user", m26007o));
        arrayList.add(new C8174h0("keys_file", "keys", m26007o2));
        arrayList.add(new C8174h0("rollouts_file", "rollouts", m26007o3));
        return arrayList;
    }

    /* renamed from: D */
    private InputStream m25381D(String str) {
        ClassLoader classLoader = C8199x.class.getClassLoader();
        if (classLoader == null) {
            C8146h.m25176f().m25185k("Couldn't get Class Loader");
            return null;
        }
        InputStream resourceAsStream = classLoader.getResourceAsStream(str);
        if (resourceAsStream != null) {
            return resourceAsStream;
        }
        C8146h.m25176f().m25181g("No version control information found");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public static long m25382E(long j2) {
        return j2 / 1000;
    }

    /* renamed from: L */
    private Task<Void> m25384L(long j2) {
        if (m25412z()) {
            C8146h.m25176f().m25185k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return Tasks.m23663e(null);
        }
        C8146h.m25176f().m25177b("Logging app exception event to Firebase Analytics");
        return Tasks.m23661c(new ScheduledThreadPoolExecutor(1), new g(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public Task<Void> m25385M() {
        ArrayList arrayList = new ArrayList();
        for (File file : m25417K()) {
            try {
                arrayList.add(m25384L(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                C8146h.m25176f().m25185k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return Tasks.m23664f(arrayList);
    }

    /* renamed from: N */
    private static boolean m25386N(String str, File file, AbstractC8225f0.a aVar) {
        if (file == null || !file.exists()) {
            C8146h.m25176f().m25185k("No minidump data found for session " + str);
        }
        if (aVar == null) {
            C8146h.m25176f().m25181g("No Tombstones data found for session " + str);
        }
        return (file == null || !file.exists()) && aVar == null;
    }

    /* renamed from: O */
    private static InterfaceC8182l0 m25387O(InterfaceC8147i interfaceC8147i) {
        File mo25164e = interfaceC8147i.mo25164e();
        return (mo25164e == null || !mo25164e.exists()) ? new C8193r("minidump_file", "minidump", new byte[]{0}) : new C8174h0("minidump_file", "minidump", mo25164e);
    }

    /* renamed from: Q */
    private static byte[] m25388Q(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: U */
    private Task<Boolean> m25389U() {
        if (this.f30995c.m25239d()) {
            C8146h.m25176f().m25177b("Automatic data collection is enabled. Allowing upload.");
            this.f31009q.m23658e(Boolean.FALSE);
            return Tasks.m23663e(Boolean.TRUE);
        }
        C8146h.m25176f().m25177b("Automatic data collection is disabled.");
        C8146h.m25176f().m25183i("Notifying that unsent reports are available.");
        this.f31009q.m23658e(Boolean.TRUE);
        Task<TContinuationResult> mo23652o = this.f30995c.m25240h().mo23652o(new c());
        C8146h.m25176f().m25177b("Waiting for send/deleteUnsentReports to be called.");
        return C8192q0.m25320i(mo23652o, this.f31010r.m23654a());
    }

    /* renamed from: V */
    private void m25390V(String str) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30) {
            C8146h.m25176f().m25183i("ANR feature enabled, but device is API " + i2);
            return;
        }
        List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f30994b.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.size() != 0) {
            this.f31006n.m25300t(str, historicalProcessExitReasons, new C8207f(this.f31000h, str), C8213l.m25539h(str, this.f31000h, this.f30998f));
        } else {
            C8146h.m25176f().m25183i("No ApplicationExitInfo available. Session: " + str);
        }
    }

    /* renamed from: n */
    private static AbstractC8227g0.a m25404n(C8176i0 c8176i0, C8181l c8181l) {
        return AbstractC8227g0.a.m25905b(c8176i0.m25263f(), c8181l.f30938f, c8181l.f30939g, c8176i0.mo25261a().mo25270c(), EnumC8170f0.m25242g(c8181l.f30936d).m25243k(), c8181l.f30940h);
    }

    /* renamed from: o */
    private static AbstractC8227g0.b m25405o(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return AbstractC8227g0.b.m25906c(C8195t.m25340k(), Build.MODEL, Runtime.getRuntime().availableProcessors(), C8195t.m25331b(context), statFs.getBlockCount() * statFs.getBlockSize(), C8195t.m25352w(), C8195t.m25341l(), Build.MANUFACTURER, Build.PRODUCT);
    }

    /* renamed from: p */
    private static AbstractC8227g0.c m25406p() {
        return AbstractC8227g0.c.m25907a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, C8195t.m25353x());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static void m25407q(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: t */
    private void m25408t(boolean z, InterfaceC8279i interfaceC8279i) {
        ArrayList arrayList = new ArrayList(this.f31006n.m25297o());
        if (arrayList.size() <= z) {
            C8146h.m25176f().m25183i("No open sessions to be closed.");
            return;
        }
        String str = (String) arrayList.get(z ? 1 : 0);
        if (interfaceC8279i.mo26060b().f31595b.f31603b) {
            m25390V(str);
        } else {
            C8146h.m25176f().m25183i("ANR feature disabled.");
        }
        if (this.f31003k.mo25156d(str)) {
            m25411x(str);
        }
        String str2 = null;
        if (z != 0) {
            str2 = (String) arrayList.get(0);
        } else {
            this.f31005m.m25368e(null);
        }
        this.f31006n.m25295i(m25379B(), str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public void m25409u(String str, Boolean bool) {
        long m25379B = m25379B();
        C8146h.m25176f().m25177b("Opening a new session with ID " + str);
        this.f31003k.mo25155c(str, String.format(Locale.US, "Crashlytics Android SDK/%s", C8200y.m25442i()), m25379B, AbstractC8227g0.m25904b(m25404n(this.f30999g, this.f31001i), m25406p(), m25405o(this.f30994b)));
        if (bool.booleanValue() && str != null) {
            this.f30997e.m25546k(str);
        }
        this.f31002j.m25477e(str);
        this.f31005m.m25368e(str);
        this.f31006n.m25298p(str, m25379B);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public void m25410v(long j2) {
        try {
            if (this.f31000h.m25998e(".ae" + j2).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e2) {
            C8146h.m25176f().m25186l("Could not create app exception marker file.", e2);
        }
    }

    /* renamed from: x */
    private void m25411x(String str) {
        C8146h.m25176f().m25183i("Finalizing native report for session " + str);
        InterfaceC8147i mo25153a = this.f31003k.mo25153a(str);
        File mo25164e = mo25153a.mo25164e();
        AbstractC8225f0.a mo25163d = mo25153a.mo25163d();
        if (m25386N(str, mo25164e, mo25163d)) {
            C8146h.m25176f().m25185k("No native core present");
            return;
        }
        long lastModified = mo25164e.lastModified();
        C8207f c8207f = new C8207f(this.f31000h, str);
        File m26002i = this.f31000h.m26002i(str);
        if (!m26002i.isDirectory()) {
            C8146h.m25176f().m25185k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        m25410v(lastModified);
        List<InterfaceC8182l0> m25380C = m25380C(mo25153a, str, this.f31000h, c8207f.m25475b());
        C8184m0.m25277b(m26002i, m25380C);
        C8146h.m25176f().m25177b("CrashlyticsController#finalizePreviousNativeSession");
        this.f31006n.m25294h(str, m25380C, mo25163d);
        c8207f.m25474a();
    }

    /* renamed from: z */
    private static boolean m25412z() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: F */
    String m25413F() throws IOException {
        InputStream m25381D = m25381D("META-INF/version-control-info.textproto");
        if (m25381D == null) {
            return null;
        }
        C8146h.m25176f().m25177b("Read version control info");
        return Base64.encodeToString(m25388Q(m25381D), 0);
    }

    /* renamed from: G */
    void m25414G(InterfaceC8279i interfaceC8279i, Thread thread, Throwable th) {
        m25415H(interfaceC8279i, thread, th, false);
    }

    /* renamed from: H */
    synchronized void m25415H(InterfaceC8279i interfaceC8279i, Thread thread, Throwable th, boolean z) {
        C8146h.m25176f().m25177b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        try {
            C8192q0.m25312a(this.f30998f.m25376h(new b(System.currentTimeMillis(), th, thread, interfaceC8279i, z)));
        } catch (TimeoutException unused) {
            C8146h.m25176f().m25179d("Cannot send reports. Timed out while fetching settings.");
        } catch (Exception e2) {
            C8146h.m25176f().m25180e("Error handling uncaught exception", e2);
        }
    }

    /* renamed from: I */
    boolean m25416I() {
        C8164c0 c8164c0 = this.f31007o;
        return c8164c0 != null && c8164c0.m25230a();
    }

    /* renamed from: K */
    List<File> m25417K() {
        return this.f31000h.m25999f(f30993a);
    }

    /* renamed from: P */
    void m25418P(String str) {
        this.f30998f.m25375g(new f(str));
    }

    /* renamed from: R */
    void m25419R() {
        try {
            String m25413F = m25413F();
            if (m25413F != null) {
                m25420S("com.crashlytics.version-control-info", m25413F);
                C8146h.m25176f().m25181g("Saved version control info");
            }
        } catch (IOException e2) {
            C8146h.m25176f().m25186l("Unable to save version control info", e2);
        }
    }

    /* renamed from: S */
    void m25420S(String str, String str2) {
        try {
            this.f30997e.m25545j(str, str2);
        } catch (IllegalArgumentException e2) {
            Context context = this.f30994b;
            if (context != null && C8195t.m25350u(context)) {
                throw e2;
            }
            C8146h.m25176f().m25179d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    @SuppressLint({"TaskMainThread"})
    /* renamed from: T */
    Task<Void> m25421T(Task<C8274d> task) {
        if (this.f31006n.m25296l()) {
            C8146h.m25176f().m25183i("Crash reports are available to be sent.");
            return m25389U().mo23652o(new d(task));
        }
        C8146h.m25176f().m25183i("No crash reports are available to be sent.");
        this.f31009q.m23658e(Boolean.FALSE);
        return Tasks.m23663e(null);
    }

    /* renamed from: W */
    void m25422W(long j2, String str) {
        this.f30998f.m25375g(new e(j2, str));
    }

    /* renamed from: r */
    boolean m25423r() {
        if (!this.f30996d.m25455c()) {
            String m25378A = m25378A();
            return m25378A != null && this.f31003k.mo25156d(m25378A);
        }
        C8146h.m25176f().m25183i("Found previous crash marker.");
        this.f30996d.m25456d();
        return true;
    }

    /* renamed from: s */
    void m25424s(InterfaceC8279i interfaceC8279i) {
        m25408t(false, interfaceC8279i);
    }

    /* renamed from: w */
    void m25425w(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, InterfaceC8279i interfaceC8279i) {
        this.f31008p = interfaceC8279i;
        m25418P(str);
        C8164c0 c8164c0 = new C8164c0(new a(), interfaceC8279i, uncaughtExceptionHandler, this.f31003k);
        this.f31007o = c8164c0;
        Thread.setDefaultUncaughtExceptionHandler(c8164c0);
    }

    /* renamed from: y */
    boolean m25426y(InterfaceC8279i interfaceC8279i) {
        this.f30998f.m25373b();
        if (m25416I()) {
            C8146h.m25176f().m25185k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        C8146h.m25176f().m25183i("Finalizing previously open sessions.");
        try {
            m25408t(true, interfaceC8279i);
            C8146h.m25176f().m25183i("Closed all previously open sessions.");
            return true;
        } catch (Exception e2) {
            C8146h.m25176f().m25180e("Unable to finalize previously open sessions.", e2);
            return false;
        }
    }
}
