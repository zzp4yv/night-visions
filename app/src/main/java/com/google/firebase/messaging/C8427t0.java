package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.InterfaceC8352i;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p024c.p041e.C0867a;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* renamed from: com.google.firebase.messaging.t0 */
/* loaded from: classes2.dex */
class C8427t0 {

    /* renamed from: a */
    private static final long f32057a = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: b */
    private final Context f32058b;

    /* renamed from: c */
    private final C8401g0 f32059c;

    /* renamed from: d */
    private final C8390b0 f32060d;

    /* renamed from: e */
    private final FirebaseMessaging f32061e;

    /* renamed from: f */
    private final InterfaceC8352i f32062f;

    /* renamed from: h */
    private final ScheduledExecutorService f32064h;

    /* renamed from: j */
    private final C8423r0 f32066j;

    /* renamed from: g */
    private final Map<String, ArrayDeque<TaskCompletionSource<Void>>> f32063g = new C0867a();

    /* renamed from: i */
    private boolean f32065i = false;

    private C8427t0(FirebaseMessaging firebaseMessaging, InterfaceC8352i interfaceC8352i, C8401g0 c8401g0, C8423r0 c8423r0, C8390b0 c8390b0, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f32061e = firebaseMessaging;
        this.f32062f = interfaceC8352i;
        this.f32059c = c8401g0;
        this.f32066j = c8423r0;
        this.f32060d = c8390b0;
        this.f32058b = context;
        this.f32064h = scheduledExecutorService;
    }

    /* renamed from: a */
    private static <T> T m26634a(Task<T> task) throws IOException {
        try {
            return (T) Tasks.m23660b(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            e = e2;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e3);
        } catch (TimeoutException e4) {
            e = e4;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    /* renamed from: b */
    private void m26635b(String str) throws IOException {
        m26634a(this.f32060d.m26490j((String) m26634a(this.f32062f.getId()), this.f32061e.m26434c(), str));
    }

    /* renamed from: c */
    private void m26636c(String str) throws IOException {
        m26634a(this.f32060d.m26491k((String) m26634a(this.f32062f.getId()), this.f32061e.m26434c(), str));
    }

    /* renamed from: d */
    static Task<C8427t0> m26637d(final FirebaseMessaging firebaseMessaging, final InterfaceC8352i interfaceC8352i, final C8401g0 c8401g0, final C8390b0 c8390b0, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return Tasks.m23661c(scheduledExecutorService, new Callable(context, scheduledExecutorService, firebaseMessaging, interfaceC8352i, c8401g0, c8390b0) { // from class: com.google.firebase.messaging.s0

            /* renamed from: f */
            private final Context f32049f;

            /* renamed from: g */
            private final ScheduledExecutorService f32050g;

            /* renamed from: h */
            private final FirebaseMessaging f32051h;

            /* renamed from: i */
            private final InterfaceC8352i f32052i;

            /* renamed from: j */
            private final C8401g0 f32053j;

            /* renamed from: k */
            private final C8390b0 f32054k;

            {
                this.f32049f = context;
                this.f32050g = scheduledExecutorService;
                this.f32051h = firebaseMessaging;
                this.f32052i = interfaceC8352i;
                this.f32053j = c8401g0;
                this.f32054k = c8390b0;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                return C8427t0.m26639h(this.f32049f, this.f32050g, this.f32051h, this.f32052i, this.f32053j, this.f32054k);
            }
        });
    }

    /* renamed from: f */
    static boolean m26638f() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    /* renamed from: h */
    static final /* synthetic */ C8427t0 m26639h(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, InterfaceC8352i interfaceC8352i, C8401g0 c8401g0, C8390b0 c8390b0) throws Exception {
        return new C8427t0(firebaseMessaging, interfaceC8352i, c8401g0, C8423r0.m26630a(context, scheduledExecutorService), c8390b0, context, scheduledExecutorService);
    }

    /* renamed from: i */
    private void m26640i(C8421q0 c8421q0) {
        synchronized (this.f32063g) {
            String m26629e = c8421q0.m26629e();
            if (this.f32063g.containsKey(m26629e)) {
                ArrayDeque<TaskCompletionSource<Void>> arrayDeque = this.f32063g.get(m26629e);
                TaskCompletionSource<Void> poll = arrayDeque.poll();
                if (poll != null) {
                    poll.m23656c(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.f32063g.remove(m26629e);
                }
            }
        }
    }

    /* renamed from: m */
    private void m26641m() {
        if (m26643g()) {
            return;
        }
        m26649p(0L);
    }

    /* renamed from: e */
    boolean m26642e() {
        return this.f32066j.m26632b() != null;
    }

    /* renamed from: g */
    synchronized boolean m26643g() {
        return this.f32065i;
    }

    /* renamed from: j */
    boolean m26644j(C8421q0 c8421q0) throws IOException {
        char c2;
        try {
            String m26627b = c8421q0.m26627b();
            int hashCode = m26627b.hashCode();
            if (hashCode != 83) {
                if (hashCode == 85 && m26627b.equals("U")) {
                    c2 = 1;
                }
                c2 = 65535;
            } else {
                if (m26627b.equals("S")) {
                    c2 = 0;
                }
                c2 = 65535;
            }
            if (c2 == 0) {
                m26635b(c8421q0.m26628c());
                if (m26638f()) {
                    String m26628c = c8421q0.m26628c();
                    StringBuilder sb = new StringBuilder(String.valueOf(m26628c).length() + 31);
                    sb.append("Subscribe to topic: ");
                    sb.append(m26628c);
                    sb.append(" succeeded.");
                    Log.d("FirebaseMessaging", sb.toString());
                }
            } else if (c2 == 1) {
                m26636c(c8421q0.m26628c());
                if (m26638f()) {
                    String m26628c2 = c8421q0.m26628c();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(m26628c2).length() + 35);
                    sb2.append("Unsubscribe from topic: ");
                    sb2.append(m26628c2);
                    sb2.append(" succeeded.");
                    Log.d("FirebaseMessaging", sb2.toString());
                }
            } else if (m26638f()) {
                String valueOf = String.valueOf(c8421q0);
                StringBuilder sb3 = new StringBuilder(valueOf.length() + 24);
                sb3.append("Unknown topic operation");
                sb3.append(valueOf);
                sb3.append(".");
                Log.d("FirebaseMessaging", sb3.toString());
            }
            return true;
        } catch (IOException e2) {
            if (!"SERVICE_NOT_AVAILABLE".equals(e2.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e2.getMessage())) {
                if (e2.getMessage() != null) {
                    throw e2;
                }
                Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                return false;
            }
            String message = e2.getMessage();
            StringBuilder sb4 = new StringBuilder(String.valueOf(message).length() + 53);
            sb4.append("Topic operation failed: ");
            sb4.append(message);
            sb4.append(". Will retry Topic operation.");
            Log.e("FirebaseMessaging", sb4.toString());
            return false;
        }
    }

    /* renamed from: k */
    void m26645k(Runnable runnable, long j2) {
        this.f32064h.schedule(runnable, j2, TimeUnit.SECONDS);
    }

    /* renamed from: l */
    synchronized void m26646l(boolean z) {
        this.f32065i = z;
    }

    /* renamed from: n */
    void m26647n() {
        if (m26642e()) {
            m26641m();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x000d, code lost:
    
        if (m26638f() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x000f, code lost:
    
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0017, code lost:
    
        return true;
     */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean m26648o() throws java.io.IOException {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            com.google.firebase.messaging.r0 r0 = r2.f32066j     // Catch: java.lang.Throwable -> L2b
            com.google.firebase.messaging.q0 r0 = r0.m26632b()     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L19
            boolean r0 = m26638f()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L16
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L2b
        L16:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            r0 = 1
            return r0
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            boolean r1 = r2.m26644j(r0)
            if (r1 != 0) goto L22
            r0 = 0
            return r0
        L22:
            com.google.firebase.messaging.r0 r1 = r2.f32066j
            r1.m26633d(r0)
            r2.m26640i(r0)
            goto L0
        L2b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            goto L2f
        L2e:
            throw r0
        L2f:
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C8427t0.m26648o():boolean");
    }

    /* renamed from: p */
    void m26649p(long j2) {
        m26645k(new RunnableC8429u0(this, this.f32058b, this.f32059c, Math.min(Math.max(30L, j2 + j2), f32057a)), j2);
        m26646l(true);
    }
}
