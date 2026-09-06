package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.C8078b0;
import com.google.firebase.components.C8091n;
import com.google.firebase.components.C8101x;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InterfaceC8093p;
import com.google.firebase.components.InterfaceC8095r;
import com.google.firebase.p200o.p201a.InterfaceC8441a;
import com.google.firebase.p200o.p201a.InterfaceC8442b;
import com.google.firebase.p200o.p201a.InterfaceC8443c;
import com.google.firebase.p200o.p201a.InterfaceC8444d;
import com.google.firebase.p205s.InterfaceC8463b;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes2.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a */
    static final C8101x<ScheduledExecutorService> f30752a = new C8101x<>(new InterfaceC8463b() { // from class: com.google.firebase.concurrent.t
        @Override // com.google.firebase.p205s.InterfaceC8463b
        public final Object get() {
            ScheduledExecutorService m25098m;
            m25098m = ExecutorsRegistrar.m25098m(Executors.newFixedThreadPool(4, ExecutorsRegistrar.m25088c("Firebase Background", 10, ExecutorsRegistrar.m25086a())));
            return m25098m;
        }
    });

    /* renamed from: b */
    static final C8101x<ScheduledExecutorService> f30753b = new C8101x<>(new InterfaceC8463b() { // from class: com.google.firebase.concurrent.q
        @Override // com.google.firebase.p205s.InterfaceC8463b
        public final Object get() {
            ScheduledExecutorService m25098m;
            m25098m = ExecutorsRegistrar.m25098m(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.m25088c("Firebase Lite", 0, ExecutorsRegistrar.m25097l())));
            return m25098m;
        }
    });

    /* renamed from: c */
    static final C8101x<ScheduledExecutorService> f30754c = new C8101x<>(new InterfaceC8463b() { // from class: com.google.firebase.concurrent.p
        @Override // com.google.firebase.p205s.InterfaceC8463b
        public final Object get() {
            ScheduledExecutorService m25098m;
            m25098m = ExecutorsRegistrar.m25098m(Executors.newCachedThreadPool(ExecutorsRegistrar.m25087b("Firebase Blocking", 11)));
            return m25098m;
        }
    });

    /* renamed from: d */
    static final C8101x<ScheduledExecutorService> f30755d = new C8101x<>(new InterfaceC8463b() { // from class: com.google.firebase.concurrent.o
        @Override // com.google.firebase.p205s.InterfaceC8463b
        public final Object get() {
            ScheduledExecutorService newSingleThreadScheduledExecutor;
            newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.m25087b("Firebase Scheduler", 0));
            return newSingleThreadScheduledExecutor;
        }
    });

    /* renamed from: a */
    private static StrictMode.ThreadPolicy m25086a() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            detectNetwork.detectResourceMismatches();
            if (i2 >= 26) {
                detectNetwork.detectUnbufferedIo();
            }
        }
        return detectNetwork.penaltyLog().build();
    }

    /* renamed from: b */
    private static ThreadFactory m25087b(String str, int i2) {
        return new ThreadFactoryC8126v(str, i2, null);
    }

    /* renamed from: c */
    private static ThreadFactory m25088c(String str, int i2, StrictMode.ThreadPolicy threadPolicy) {
        return new ThreadFactoryC8126v(str, i2, threadPolicy);
    }

    /* renamed from: l */
    private static StrictMode.ThreadPolicy m25097l() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static ScheduledExecutorService m25098m(ExecutorService executorService) {
        return new ScheduledExecutorServiceC8127w(executorService, f30755d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C8091n<?>> getComponents() {
        return Arrays.asList(C8091n.m24985b(C8078b0.m24971a(InterfaceC8441a.class, ScheduledExecutorService.class), C8078b0.m24971a(InterfaceC8441a.class, ExecutorService.class), C8078b0.m24971a(InterfaceC8441a.class, Executor.class)).m25010f(new InterfaceC8095r() { // from class: com.google.firebase.concurrent.u
            @Override // com.google.firebase.components.InterfaceC8095r
            /* renamed from: a */
            public final Object mo24937a(InterfaceC8093p interfaceC8093p) {
                ScheduledExecutorService scheduledExecutorService;
                scheduledExecutorService = ExecutorsRegistrar.f30752a.get();
                return scheduledExecutorService;
            }
        }).m25008d(), C8091n.m24985b(C8078b0.m24971a(InterfaceC8442b.class, ScheduledExecutorService.class), C8078b0.m24971a(InterfaceC8442b.class, ExecutorService.class), C8078b0.m24971a(InterfaceC8442b.class, Executor.class)).m25010f(new InterfaceC8095r() { // from class: com.google.firebase.concurrent.n
            @Override // com.google.firebase.components.InterfaceC8095r
            /* renamed from: a */
            public final Object mo24937a(InterfaceC8093p interfaceC8093p) {
                ScheduledExecutorService scheduledExecutorService;
                scheduledExecutorService = ExecutorsRegistrar.f30754c.get();
                return scheduledExecutorService;
            }
        }).m25008d(), C8091n.m24985b(C8078b0.m24971a(InterfaceC8443c.class, ScheduledExecutorService.class), C8078b0.m24971a(InterfaceC8443c.class, ExecutorService.class), C8078b0.m24971a(InterfaceC8443c.class, Executor.class)).m25010f(new InterfaceC8095r() { // from class: com.google.firebase.concurrent.s
            @Override // com.google.firebase.components.InterfaceC8095r
            /* renamed from: a */
            public final Object mo24937a(InterfaceC8093p interfaceC8093p) {
                ScheduledExecutorService scheduledExecutorService;
                scheduledExecutorService = ExecutorsRegistrar.f30753b.get();
                return scheduledExecutorService;
            }
        }).m25008d(), C8091n.m24984a(C8078b0.m24971a(InterfaceC8444d.class, Executor.class)).m25010f(new InterfaceC8095r() { // from class: com.google.firebase.concurrent.r
            @Override // com.google.firebase.components.InterfaceC8095r
            /* renamed from: a */
            public final Object mo24937a(InterfaceC8093p interfaceC8093p) {
                Executor executor;
                executor = EnumC8105a0.INSTANCE;
                return executor;
            }
        }).m25008d());
    }
}
