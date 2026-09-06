package com.google.firebase.installations;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.C8372j;
import com.google.firebase.components.C8101x;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.p196p.InterfaceC8359a;
import com.google.firebase.installations.p197q.AbstractC8363d;
import com.google.firebase.installations.p197q.C8361b;
import com.google.firebase.installations.p197q.C8362c;
import com.google.firebase.installations.p198r.AbstractC8367d;
import com.google.firebase.installations.p198r.AbstractC8369f;
import com.google.firebase.installations.p198r.C8366c;
import com.google.firebase.p204r.InterfaceC8458i;
import com.google.firebase.p205s.InterfaceC8463b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FirebaseInstallations.java */
/* renamed from: com.google.firebase.installations.h */
/* loaded from: classes2.dex */
public class C8351h implements InterfaceC8352i {

    /* renamed from: a */
    private static final Object f31793a = new Object();

    /* renamed from: b */
    private static final ThreadFactory f31794b = new a();

    /* renamed from: c */
    private final C8372j f31795c;

    /* renamed from: d */
    private final C8366c f31796d;

    /* renamed from: e */
    private final C8362c f31797e;

    /* renamed from: f */
    private final C8358o f31798f;

    /* renamed from: g */
    private final C8101x<C8361b> f31799g;

    /* renamed from: h */
    private final C8356m f31800h;

    /* renamed from: i */
    private final Object f31801i;

    /* renamed from: j */
    private final ExecutorService f31802j;

    /* renamed from: k */
    private final Executor f31803k;

    /* renamed from: l */
    private String f31804l;

    /* renamed from: m */
    private Set<InterfaceC8359a> f31805m;

    /* renamed from: n */
    private final List<InterfaceC8357n> f31806n;

    /* compiled from: FirebaseInstallations.java */
    /* renamed from: com.google.firebase.installations.h$a */
    class a implements ThreadFactory {

        /* renamed from: f */
        private final AtomicInteger f31807f = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        @SuppressLint({"ThreadPoolCreation"})
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f31807f.getAndIncrement())));
        }
    }

    /* compiled from: FirebaseInstallations.java */
    /* renamed from: com.google.firebase.installations.h$b */
    static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f31808a;

        /* renamed from: b */
        static final /* synthetic */ int[] f31809b;

        static {
            int[] iArr = new int[AbstractC8369f.b.values().length];
            f31809b = iArr;
            try {
                iArr[AbstractC8369f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31809b[AbstractC8369f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31809b[AbstractC8369f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[AbstractC8367d.b.values().length];
            f31808a = iArr2;
            try {
                iArr2[AbstractC8367d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31808a[AbstractC8367d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    C8351h(final C8372j c8372j, InterfaceC8463b<InterfaceC8458i> interfaceC8463b, ExecutorService executorService, Executor executor) {
        this(executorService, executor, c8372j, new C8366c(c8372j.m26404i(), interfaceC8463b), new C8362c(c8372j), C8358o.m26290c(), new C8101x(new InterfaceC8463b() { // from class: com.google.firebase.installations.a
            @Override // com.google.firebase.p205s.InterfaceC8463b
            public final Object get() {
                return C8351h.m26273w(C8372j.this);
            }
        }), new C8356m());
    }

    /* renamed from: A */
    private void m26254A(Exception exc) {
        synchronized (this.f31801i) {
            Iterator<InterfaceC8357n> it = this.f31806n.iterator();
            while (it.hasNext()) {
                if (it.next().mo26284a(exc)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: B */
    private void m26255B(AbstractC8363d abstractC8363d) {
        synchronized (this.f31801i) {
            Iterator<InterfaceC8357n> it = this.f31806n.iterator();
            while (it.hasNext()) {
                if (it.next().mo26285b(abstractC8363d)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: C */
    private synchronized void m26256C(String str) {
        this.f31804l = str;
    }

    /* renamed from: D */
    private synchronized void m26257D(AbstractC8363d abstractC8363d, AbstractC8363d abstractC8363d2) {
        if (this.f31805m.size() != 0 && !TextUtils.equals(abstractC8363d.mo26301d(), abstractC8363d2.mo26301d())) {
            Iterator<InterfaceC8359a> it = this.f31805m.iterator();
            while (it.hasNext()) {
                it.next().m26298a(abstractC8363d2.mo26301d());
            }
        }
    }

    /* renamed from: b */
    private Task<AbstractC8355l> m26258b() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m26260d(new C8353j(this.f31798f, taskCompletionSource));
        return taskCompletionSource.m23654a();
    }

    /* renamed from: c */
    private Task<String> m26259c() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m26260d(new C8354k(taskCompletionSource));
        return taskCompletionSource.m23654a();
    }

    /* renamed from: d */
    private void m26260d(InterfaceC8357n interfaceC8357n) {
        synchronized (this.f31801i) {
            this.f31806n.add(interfaceC8357n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m26281r(boolean r3) {
        /*
            r2 = this;
            com.google.firebase.installations.q.d r0 = r2.m26267m()
            boolean r1 = r0.m26329i()     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
            if (r1 != 0) goto L22
            boolean r1 = r0.m26332l()     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
            if (r1 == 0) goto L11
            goto L22
        L11:
            if (r3 != 0) goto L1d
            com.google.firebase.installations.o r3 = r2.f31798f     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
            boolean r3 = r3.m26297f(r0)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            return
        L1d:
            com.google.firebase.installations.q.d r3 = r2.m26263g(r0)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
            goto L26
        L22:
            com.google.firebase.installations.q.d r3 = r2.m26276z(r0)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
        L26:
            r2.m26269p(r3)
            r2.m26257D(r0, r3)
            boolean r0 = r3.m26331k()
            if (r0 == 0) goto L39
            java.lang.String r0 = r3.mo26301d()
            r2.m26256C(r0)
        L39:
            boolean r0 = r3.m26329i()
            if (r0 == 0) goto L4a
            com.google.firebase.installations.FirebaseInstallationsException r3 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$a r0 = com.google.firebase.installations.FirebaseInstallationsException.EnumC8343a.BAD_CONFIG
            r3.<init>(r0)
            r2.m26254A(r3)
            goto L5e
        L4a:
            boolean r0 = r3.m26330j()
            if (r0 == 0) goto L5b
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            r2.m26254A(r3)
            goto L5e
        L5b:
            r2.m26255B(r3)
        L5e:
            return
        L5f:
            r3 = move-exception
            r2.m26254A(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C8351h.m26270q(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void m26283v(final boolean z) {
        AbstractC8363d m26268n = m26268n();
        if (z) {
            m26268n = m26268n.m26335p();
        }
        m26255B(m26268n);
        this.f31803k.execute(new Runnable() { // from class: com.google.firebase.installations.c
            @Override // java.lang.Runnable
            public final void run() {
                C8351h.this.m26281r(z);
            }
        });
    }

    /* renamed from: g */
    private AbstractC8363d m26263g(AbstractC8363d abstractC8363d) throws FirebaseInstallationsException {
        AbstractC8369f m26376e = this.f31796d.m26376e(m26278h(), abstractC8363d.mo26301d(), m26280o(), abstractC8363d.mo26303f());
        int i2 = b.f31809b[m26376e.mo26351b().ordinal()];
        if (i2 == 1) {
            return abstractC8363d.m26334o(m26376e.mo26352c(), m26376e.mo26353d(), this.f31798f.m26295b());
        }
        if (i2 == 2) {
            return abstractC8363d.m26336q("BAD CONFIG");
        }
        if (i2 != 3) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.EnumC8343a.UNAVAILABLE);
        }
        m26256C(null);
        return abstractC8363d.m26337r();
    }

    /* renamed from: j */
    private synchronized String m26264j() {
        return this.f31804l;
    }

    /* renamed from: k */
    private C8361b m26265k() {
        return this.f31799g.get();
    }

    /* renamed from: l */
    public static C8351h m26266l(C8372j c8372j) {
        Preconditions.m14363b(c8372j != null, "Null is not a valid value of FirebaseApp.");
        return (C8351h) c8372j.m26403h(InterfaceC8352i.class);
    }

    /* renamed from: m */
    private AbstractC8363d m26267m() {
        AbstractC8363d m26327d;
        synchronized (f31793a) {
            C8350g m26252a = C8350g.m26252a(this.f31795c.m26404i(), "generatefid.lock");
            try {
                m26327d = this.f31797e.m26327d();
            } finally {
                if (m26252a != null) {
                    m26252a.m26253b();
                }
            }
        }
        return m26327d;
    }

    /* renamed from: n */
    private AbstractC8363d m26268n() {
        AbstractC8363d m26327d;
        synchronized (f31793a) {
            C8350g m26252a = C8350g.m26252a(this.f31795c.m26404i(), "generatefid.lock");
            try {
                m26327d = this.f31797e.m26327d();
                if (m26327d.m26330j()) {
                    m26327d = this.f31797e.m26326b(m26327d.m26339t(m26275y(m26327d)));
                }
            } finally {
                if (m26252a != null) {
                    m26252a.m26253b();
                }
            }
        }
        return m26327d;
    }

    /* renamed from: p */
    private void m26269p(AbstractC8363d abstractC8363d) {
        synchronized (f31793a) {
            C8350g m26252a = C8350g.m26252a(this.f31795c.m26404i(), "generatefid.lock");
            try {
                this.f31797e.m26326b(abstractC8363d);
            } finally {
                if (m26252a != null) {
                    m26252a.m26253b();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m26282t() {
        m26272u(false);
    }

    /* renamed from: w */
    static /* synthetic */ C8361b m26273w(C8372j c8372j) {
        return new C8361b(c8372j);
    }

    /* renamed from: x */
    private void m26274x() {
        Preconditions.m14369h(m26279i(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.m14369h(m26280o(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.m14369h(m26278h(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.m14363b(C8358o.m26293h(m26279i()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.m14363b(C8358o.m26292g(m26278h()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* renamed from: y */
    private String m26275y(AbstractC8363d abstractC8363d) {
        if ((!this.f31795c.m26405k().equals("CHIME_ANDROID_SDK") && !this.f31795c.m26409s()) || !abstractC8363d.m26333m()) {
            return this.f31800h.m26289a();
        }
        String m26322f = m26265k().m26322f();
        return TextUtils.isEmpty(m26322f) ? this.f31800h.m26289a() : m26322f;
    }

    /* renamed from: z */
    private AbstractC8363d m26276z(AbstractC8363d abstractC8363d) throws FirebaseInstallationsException {
        AbstractC8367d m26375d = this.f31796d.m26375d(m26278h(), abstractC8363d.mo26301d(), m26280o(), m26279i(), (abstractC8363d.mo26301d() == null || abstractC8363d.mo26301d().length() != 11) ? null : m26265k().m26323i());
        int i2 = b.f31808a[m26375d.mo26343e().ordinal()];
        if (i2 == 1) {
            return abstractC8363d.m26338s(m26375d.mo26341c(), m26375d.mo26342d(), this.f31798f.m26295b(), m26375d.mo26340b().mo26352c(), m26375d.mo26340b().mo26353d());
        }
        if (i2 == 2) {
            return abstractC8363d.m26336q("BAD CONFIG");
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.EnumC8343a.UNAVAILABLE);
    }

    @Override // com.google.firebase.installations.InterfaceC8352i
    /* renamed from: a */
    public Task<AbstractC8355l> mo26277a(final boolean z) {
        m26274x();
        Task<AbstractC8355l> m26258b = m26258b();
        this.f31802j.execute(new Runnable() { // from class: com.google.firebase.installations.d
            @Override // java.lang.Runnable
            public final void run() {
                C8351h.this.m26283v(z);
            }
        });
        return m26258b;
    }

    @Override // com.google.firebase.installations.InterfaceC8352i
    public Task<String> getId() {
        m26274x();
        String m26264j = m26264j();
        if (m26264j != null) {
            return Tasks.m23663e(m26264j);
        }
        Task<String> m26259c = m26259c();
        this.f31802j.execute(new Runnable() { // from class: com.google.firebase.installations.b
            @Override // java.lang.Runnable
            public final void run() {
                C8351h.this.m26282t();
            }
        });
        return m26259c;
    }

    /* renamed from: h */
    String m26278h() {
        return this.f31795c.m26406l().m26423b();
    }

    /* renamed from: i */
    String m26279i() {
        return this.f31795c.m26406l().m26424c();
    }

    /* renamed from: o */
    String m26280o() {
        return this.f31795c.m26406l().m26426e();
    }

    @SuppressLint({"ThreadPoolCreation"})
    C8351h(ExecutorService executorService, Executor executor, C8372j c8372j, C8366c c8366c, C8362c c8362c, C8358o c8358o, C8101x<C8361b> c8101x, C8356m c8356m) {
        this.f31801i = new Object();
        this.f31805m = new HashSet();
        this.f31806n = new ArrayList();
        this.f31795c = c8372j;
        this.f31796d = c8366c;
        this.f31797e = c8362c;
        this.f31798f = c8358o;
        this.f31799g = c8101x;
        this.f31800h = c8356m;
        this.f31802j = executorService;
        this.f31803k = executor;
    }
}
