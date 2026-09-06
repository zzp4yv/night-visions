package p355k.p357b;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import p355k.p357b.p358e.C9705d;
import p355k.p357b.p359f.C9710e;
import p355k.p357b.p359f.C9712g;
import p355k.p357b.p359f.C9713h;
import p355k.p357b.p359f.C9714i;
import p355k.p357b.p360g.C9717c;

/* compiled from: LoggerFactory.java */
/* renamed from: k.b.c */
/* loaded from: classes3.dex */
public final class C9700c {

    /* renamed from: a */
    static volatile int f37103a;

    /* renamed from: b */
    static C9713h f37104b = new C9713h();

    /* renamed from: c */
    static C9710e f37105c = new C9710e();

    /* renamed from: d */
    static boolean f37106d = C9714i.m32245c("slf4j.detectLoggerNameMismatch");

    /* renamed from: e */
    private static final String[] f37107e = {"1.6", "1.7"};

    /* renamed from: f */
    private static String f37108f = "org/slf4j/impl/StaticLoggerBinder.class";

    private C9700c() {
    }

    /* renamed from: a */
    private static final void m32181a() {
        Set<URL> set = null;
        try {
            if (!m32191k()) {
                set = m32186f();
                m32197q(set);
            }
            C9717c.m32262c();
            f37103a = 3;
            m32196p(set);
            m32187g();
            m32194n();
            f37104b.m32239b();
        } catch (Exception e2) {
            m32185e(e2);
            throw new IllegalStateException("Unexpected initialization failure", e2);
        } catch (NoClassDefFoundError e3) {
            if (!m32192l(e3.getMessage())) {
                m32185e(e3);
                throw e3;
            }
            f37103a = 4;
            C9714i.m32243a("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
            C9714i.m32243a("Defaulting to no-operation (NOP) logger implementation");
            C9714i.m32243a("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
        } catch (NoSuchMethodError e4) {
            String message = e4.getMessage();
            if (message != null && message.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                f37103a = 2;
                C9714i.m32243a("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                C9714i.m32243a("Your binding is version 1.5.5 or earlier.");
                C9714i.m32243a("Upgrade your binding to version 1.6.x.");
            }
            throw e4;
        }
    }

    /* renamed from: b */
    private static void m32182b(C9705d c9705d, int i2) {
        if (c9705d.m32201a().m32234m()) {
            m32183c(i2);
        } else {
            if (c9705d.m32201a().m32235n()) {
                return;
            }
            m32184d();
        }
    }

    /* renamed from: c */
    private static void m32183c(int i2) {
        C9714i.m32243a("A number (" + i2 + ") of logging calls during the initialization phase have been intercepted and are");
        C9714i.m32243a("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        C9714i.m32243a("See also http://www.slf4j.org/codes.html#replay");
    }

    /* renamed from: d */
    private static void m32184d() {
        C9714i.m32243a("The following set of substitute loggers may have been accessed");
        C9714i.m32243a("during the initialization phase. Logging calls during this");
        C9714i.m32243a("phase were not honored. However, subsequent logging calls to these");
        C9714i.m32243a("loggers will work as normally expected.");
        C9714i.m32243a("See also http://www.slf4j.org/codes.html#substituteLogger");
    }

    /* renamed from: e */
    static void m32185e(Throwable th) {
        f37103a = 2;
        C9714i.m32244b("Failed to instantiate SLF4J LoggerFactory", th);
    }

    /* renamed from: f */
    static Set<URL> m32186f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = C9700c.class.getClassLoader();
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(f37108f) : classLoader.getResources(f37108f);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e2) {
            C9714i.m32244b("Error getting resources from path", e2);
        }
        return linkedHashSet;
    }

    /* renamed from: g */
    private static void m32187g() {
        synchronized (f37104b) {
            f37104b.m32242e();
            for (C9712g c9712g : f37104b.m32241d()) {
                c9712g.m32238q(m32189i(c9712g.m32233l()));
            }
        }
    }

    /* renamed from: h */
    public static InterfaceC9698a m32188h() {
        if (f37103a == 0) {
            synchronized (C9700c.class) {
                if (f37103a == 0) {
                    f37103a = 1;
                    m32193m();
                }
            }
        }
        int i2 = f37103a;
        if (i2 == 1) {
            return f37104b;
        }
        if (i2 == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory could not be successfully initialized. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i2 == 3) {
            return C9717c.m32262c().m32263a();
        }
        if (i2 == 4) {
            return f37105c;
        }
        throw new IllegalStateException("Unreachable code");
    }

    /* renamed from: i */
    public static InterfaceC9699b m32189i(String str) {
        return m32188h().mo32171a(str);
    }

    /* renamed from: j */
    private static boolean m32190j(Set<URL> set) {
        return set.size() > 1;
    }

    /* renamed from: k */
    private static boolean m32191k() {
        String m32246d = C9714i.m32246d("java.vendor.url");
        if (m32246d == null) {
            return false;
        }
        return m32246d.toLowerCase().contains("android");
    }

    /* renamed from: l */
    private static boolean m32192l(String str) {
        if (str == null) {
            return false;
        }
        return str.contains("org/slf4j/impl/StaticLoggerBinder") || str.contains("org.slf4j.impl.StaticLoggerBinder");
    }

    /* renamed from: m */
    private static final void m32193m() {
        m32181a();
        if (f37103a == 3) {
            m32198r();
        }
    }

    /* renamed from: n */
    private static void m32194n() {
        LinkedBlockingQueue<C9705d> m32240c = f37104b.m32240c();
        int size = m32240c.size();
        ArrayList<C9705d> arrayList = new ArrayList(128);
        int i2 = 0;
        while (m32240c.drainTo(arrayList, 128) != 0) {
            for (C9705d c9705d : arrayList) {
                m32195o(c9705d);
                int i3 = i2 + 1;
                if (i2 == 0) {
                    m32182b(c9705d, size);
                }
                i2 = i3;
            }
            arrayList.clear();
        }
    }

    /* renamed from: o */
    private static void m32195o(C9705d c9705d) {
        if (c9705d == null) {
            return;
        }
        C9712g m32201a = c9705d.m32201a();
        String m32233l = m32201a.m32233l();
        if (m32201a.m32236o()) {
            throw new IllegalStateException("Delegate logger cannot be null at this state.");
        }
        if (m32201a.m32235n()) {
            return;
        }
        if (m32201a.m32234m()) {
            m32201a.m32237p(c9705d);
        } else {
            C9714i.m32243a(m32233l);
        }
    }

    /* renamed from: p */
    private static void m32196p(Set<URL> set) {
        if (set == null || !m32190j(set)) {
            return;
        }
        C9714i.m32243a("Actual binding is of type [" + C9717c.m32262c().m32264b() + "]");
    }

    /* renamed from: q */
    private static void m32197q(Set<URL> set) {
        if (m32190j(set)) {
            C9714i.m32243a("Class path contains multiple SLF4J bindings.");
            Iterator<URL> it = set.iterator();
            while (it.hasNext()) {
                C9714i.m32243a("Found binding in [" + it.next() + "]");
            }
            C9714i.m32243a("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    /* renamed from: r */
    private static final void m32198r() {
        try {
            String str = C9717c.f37162b;
            boolean z = false;
            for (String str2 : f37107e) {
                if (str.startsWith(str2)) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            C9714i.m32243a("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(f37107e).toString());
            C9714i.m32243a("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            C9714i.m32244b("Unexpected problem occured during version sanity check", th);
        }
    }
}
