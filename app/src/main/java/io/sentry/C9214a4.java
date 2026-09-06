package io.sentry;

import io.sentry.cache.C9360q;
import io.sentry.config.C9380h;
import io.sentry.internal.debugmeta.C9443b;
import io.sentry.internal.debugmeta.C9444c;
import io.sentry.internal.modules.C9447a;
import io.sentry.internal.modules.C9449c;
import io.sentry.internal.modules.C9451e;
import io.sentry.internal.modules.C9452f;
import io.sentry.internal.modules.InterfaceC9448b;
import io.sentry.protocol.C9525q;
import io.sentry.transport.C9583t;
import io.sentry.util.C9606j;
import io.sentry.util.C9608l;
import io.sentry.util.thread.C9619c;
import io.sentry.util.thread.C9620d;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: Sentry.java */
/* renamed from: io.sentry.a4 */
/* loaded from: classes.dex */
public final class C9214a4 {

    /* renamed from: a */
    private static final ThreadLocal<InterfaceC9625v1> f35746a = new ThreadLocal<>();

    /* renamed from: b */
    private static volatile InterfaceC9625v1 f35747b = C9651y2.m31957a();

    /* renamed from: c */
    private static volatile boolean f35748c = false;

    /* compiled from: Sentry.java */
    /* renamed from: io.sentry.a4$a */
    public interface a<T extends C9647x4> {
        /* renamed from: a */
        void mo8271a(T t);
    }

    /* renamed from: a */
    public static void m30031a(C9624v0 c9624v0, C9484n1 c9484n1) {
        m30040j().mo31153n(c9624v0, c9484n1);
    }

    /* renamed from: b */
    private static <T extends C9647x4> void m30032b(a<T> aVar, T t) {
        try {
            aVar.mo8271a(t);
        } catch (Throwable th) {
            t.getLogger().mo30213b(EnumC9554s4.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th);
        }
    }

    /* renamed from: c */
    public static C9525q m30033c(C9473l4 c9473l4) {
        return m30040j().mo31150k(c9473l4);
    }

    /* renamed from: d */
    public static C9525q m30034d(C9473l4 c9473l4, C9484n1 c9484n1) {
        return m30040j().mo31159t(c9473l4, c9484n1);
    }

    /* renamed from: e */
    public static synchronized void m30035e() {
        synchronized (C9214a4.class) {
            InterfaceC9625v1 m30040j = m30040j();
            f35747b = C9651y2.m31957a();
            f35746a.remove();
            m30040j.close();
        }
    }

    /* renamed from: f */
    public static void m30036f(InterfaceC9560t3 interfaceC9560t3) {
        m30040j().mo31154o(interfaceC9560t3);
    }

    /* renamed from: g */
    public static void m30037g() {
        m30040j().endSession();
    }

    /* renamed from: h */
    private static void m30038h(C9647x4 c9647x4, InterfaceC9625v1 interfaceC9625v1) {
        try {
            c9647x4.getExecutorService().submit(new RunnableC9472l3(c9647x4, interfaceC9625v1));
        } catch (Throwable th) {
            c9647x4.getLogger().mo30213b(EnumC9554s4.DEBUG, "Failed to finalize previous session.", th);
        }
    }

    /* renamed from: i */
    public static void m30039i(long j2) {
        m30040j().mo31147h(j2);
    }

    @ApiStatus.Internal
    /* renamed from: j */
    public static InterfaceC9625v1 m30040j() {
        if (f35748c) {
            return f35747b;
        }
        ThreadLocal<InterfaceC9625v1> threadLocal = f35746a;
        InterfaceC9625v1 interfaceC9625v1 = threadLocal.get();
        if (interfaceC9625v1 != null && !(interfaceC9625v1 instanceof C9651y2)) {
            return interfaceC9625v1;
        }
        InterfaceC9625v1 m41050clone = f35747b.m41050clone();
        threadLocal.set(m41050clone);
        return m41050clone;
    }

    /* renamed from: k */
    public static <T extends C9647x4> void m30041k(C9439i3<T> c9439i3, a<T> aVar, boolean z) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        T m30848b = c9439i3.m30848b();
        m30032b(aVar, m30848b);
        m30044n(m30848b, z);
    }

    /* renamed from: l */
    public static void m30042l(a<C9647x4> aVar) {
        m30043m(aVar, false);
    }

    /* renamed from: m */
    public static void m30043m(a<C9647x4> aVar, boolean z) {
        C9647x4 c9647x4 = new C9647x4();
        m30032b(aVar, c9647x4);
        m30044n(c9647x4, z);
    }

    /* renamed from: n */
    private static synchronized void m30044n(C9647x4 c9647x4, boolean z) {
        synchronized (C9214a4.class) {
            if (m30046p()) {
                c9647x4.getLogger().mo30214c(EnumC9554s4.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.", new Object[0]);
            }
            if (m30045o(c9647x4)) {
                c9647x4.getLogger().mo30214c(EnumC9554s4.INFO, "GlobalHubMode: '%s'", String.valueOf(z));
                f35748c = z;
                InterfaceC9625v1 m30040j = m30040j();
                f35747b = new C9498p1(c9647x4);
                f35746a.set(f35747b);
                m30040j.close();
                if (c9647x4.getExecutorService().isClosed()) {
                    c9647x4.setExecutorService(new C9487n4());
                }
                Iterator<Integration> it = c9647x4.getIntegrations().iterator();
                while (it.hasNext()) {
                    it.next().mo30001c(C9537q1.m31548a(), c9647x4);
                }
                m30049s(c9647x4);
                m30038h(c9647x4, C9537q1.m31548a());
            }
        }
    }

    /* renamed from: o */
    private static boolean m30045o(C9647x4 c9647x4) {
        if (c9647x4.isEnableExternalConfiguration()) {
            c9647x4.merge(C9470l1.m30928g(C9380h.m30716a(), c9647x4.getLogger()));
        }
        String dsn = c9647x4.getDsn();
        if (!c9647x4.isEnabled() || (dsn != null && dsn.isEmpty())) {
            m30035e();
            return false;
        }
        if (dsn == null) {
            throw new IllegalArgumentException("DSN is required. Use empty string or set enabled to false in SentryOptions to disable SDK.");
        }
        new C9399f1(dsn);
        InterfaceC9637w1 logger = c9647x4.getLogger();
        if (c9647x4.isDebug() && (logger instanceof C9657z2)) {
            c9647x4.setLogger(new C9488n5());
            logger = c9647x4.getLogger();
        }
        EnumC9554s4 enumC9554s4 = EnumC9554s4.INFO;
        logger.mo30214c(enumC9554s4, "Initializing SDK with DSN: '%s'", c9647x4.getDsn());
        String outboxPath = c9647x4.getOutboxPath();
        if (outboxPath != null) {
            new File(outboxPath).mkdirs();
        } else {
            logger.mo30214c(enumC9554s4, "No outbox dir path is defined in options.", new Object[0]);
        }
        String cacheDirPath = c9647x4.getCacheDirPath();
        if (cacheDirPath != null) {
            new File(cacheDirPath).mkdirs();
            if (c9647x4.getEnvelopeDiskCache() instanceof C9583t) {
                c9647x4.setEnvelopeDiskCache(C9360q.m30633x(c9647x4));
            }
        }
        String profilingTracesDirPath = c9647x4.getProfilingTracesDirPath();
        if (c9647x4.isProfilingEnabled() && profilingTracesDirPath != null) {
            File file = new File(profilingTracesDirPath);
            file.mkdirs();
            final File[] listFiles = file.listFiles();
            try {
                c9647x4.getExecutorService().submit(new Runnable() { // from class: io.sentry.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        C9214a4.m30047q(listFiles);
                    }
                });
            } catch (RejectedExecutionException e2) {
                c9647x4.getLogger().mo30213b(EnumC9554s4.ERROR, "Failed to call the executor. Old profiles will not be deleted. Did you call Sentry.close()?", e2);
            }
        }
        InterfaceC9448b modulesLoader = c9647x4.getModulesLoader();
        if (!c9647x4.isSendModules()) {
            c9647x4.setModulesLoader(C9451e.m30873b());
        } else if (modulesLoader instanceof C9451e) {
            c9647x4.setModulesLoader(new C9447a(Arrays.asList(new C9449c(c9647x4.getLogger()), new C9452f(c9647x4.getLogger())), c9647x4.getLogger()));
        }
        if (c9647x4.getDebugMetaLoader() instanceof C9443b) {
            c9647x4.setDebugMetaLoader(new C9444c(c9647x4.getLogger()));
        }
        C9606j.m31772c(c9647x4, c9647x4.getDebugMetaLoader().mo30216a());
        if (c9647x4.getMainThreadChecker() instanceof C9620d) {
            c9647x4.setMainThreadChecker(C9619c.m31815e());
        }
        if (c9647x4.getCollectors().isEmpty()) {
            c9647x4.addCollector(new C9464k2());
        }
        return true;
    }

    /* renamed from: p */
    public static boolean m30046p() {
        return m30040j().isEnabled();
    }

    /* renamed from: q */
    static /* synthetic */ void m30047q(File[] fileArr) {
        if (fileArr == null) {
            return;
        }
        for (File file : fileArr) {
            C9608l.m31775a(file);
        }
    }

    /* renamed from: r */
    static /* synthetic */ void m30048r(C9647x4 c9647x4) {
        for (InterfaceC9644x1 interfaceC9644x1 : c9647x4.getOptionsObservers()) {
            interfaceC9644x1.mo30655f(c9647x4.getRelease());
            interfaceC9644x1.mo30654e(c9647x4.getProguardUuid());
            interfaceC9644x1.mo30651b(c9647x4.getSdkVersion());
            interfaceC9644x1.mo30652c(c9647x4.getDist());
            interfaceC9644x1.mo30653d(c9647x4.getEnvironment());
            interfaceC9644x1.mo30650a(c9647x4.getTags());
        }
    }

    /* renamed from: s */
    private static void m30049s(final C9647x4 c9647x4) {
        try {
            c9647x4.getExecutorService().submit(new Runnable() { // from class: io.sentry.u
                @Override // java.lang.Runnable
                public final void run() {
                    C9214a4.m30048r(C9647x4.this);
                }
            });
        } catch (Throwable th) {
            c9647x4.getLogger().mo30213b(EnumC9554s4.DEBUG, "Failed to notify options observers.", th);
        }
    }

    /* renamed from: t */
    public static void m30050t() {
        m30040j().startSession();
    }

    /* renamed from: u */
    public static InterfaceC9393e2 m30051u(C9548r5 c9548r5, C9562t5 c9562t5) {
        return m30040j().mo31151l(c9548r5, c9562t5);
    }
}
