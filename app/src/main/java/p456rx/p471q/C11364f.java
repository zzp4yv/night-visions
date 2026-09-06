package p456rx.p471q;

import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: RxJavaPlugins.java */
/* renamed from: rx.q.f */
/* loaded from: classes3.dex */
public class C11364f {

    /* renamed from: a */
    private static final C11364f f43022a = new C11364f();

    /* renamed from: b */
    static final AbstractC11360b f43023b = new a();

    /* renamed from: c */
    private final AtomicReference<AbstractC11360b> f43024c = new AtomicReference<>();

    /* renamed from: d */
    private final AtomicReference<AbstractC11362d> f43025d = new AtomicReference<>();

    /* renamed from: e */
    private final AtomicReference<AbstractC11366h> f43026e = new AtomicReference<>();

    /* renamed from: f */
    private final AtomicReference<AbstractC11359a> f43027f = new AtomicReference<>();

    /* renamed from: g */
    private final AtomicReference<C11365g> f43028g = new AtomicReference<>();

    /* compiled from: RxJavaPlugins.java */
    /* renamed from: rx.q.f$a */
    static class a extends AbstractC11360b {
        a() {
        }
    }

    /* compiled from: RxJavaPlugins.java */
    /* renamed from: rx.q.f$b */
    class b extends AbstractC11359a {
        b() {
        }
    }

    C11364f() {
    }

    @Deprecated
    /* renamed from: c */
    public static C11364f m40607c() {
        return f43022a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        r2 = "rxjava.plugin." + r7.substring(0, r7.length() - 6).substring(14) + ".impl";
        r1 = r10.getProperty(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0087, code lost:
    
        if (r1 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a8, code lost:
    
        throw new java.lang.IllegalStateException("Implementing class declaration for " + r0 + " missing: " + r2);
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object m40608e(java.lang.Class<?> r9, java.util.Properties r10) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p456rx.p471q.C11364f.m40608e(java.lang.Class, java.util.Properties):java.lang.Object");
    }

    /* renamed from: h */
    static Properties m40609h() {
        try {
            return System.getProperties();
        } catch (SecurityException unused) {
            return new Properties();
        }
    }

    /* renamed from: a */
    public AbstractC11359a m40610a() {
        if (this.f43027f.get() == null) {
            Object m40608e = m40608e(AbstractC11359a.class, m40609h());
            if (m40608e == null) {
                this.f43027f.compareAndSet(null, new b());
            } else {
                this.f43027f.compareAndSet(null, (AbstractC11359a) m40608e);
            }
        }
        return this.f43027f.get();
    }

    /* renamed from: b */
    public AbstractC11360b m40611b() {
        if (this.f43024c.get() == null) {
            Object m40608e = m40608e(AbstractC11360b.class, m40609h());
            if (m40608e == null) {
                this.f43024c.compareAndSet(null, f43023b);
            } else {
                this.f43024c.compareAndSet(null, (AbstractC11360b) m40608e);
            }
        }
        return this.f43024c.get();
    }

    /* renamed from: d */
    public AbstractC11362d m40612d() {
        if (this.f43025d.get() == null) {
            Object m40608e = m40608e(AbstractC11362d.class, m40609h());
            if (m40608e == null) {
                this.f43025d.compareAndSet(null, C11363e.m40606a());
            } else {
                this.f43025d.compareAndSet(null, (AbstractC11362d) m40608e);
            }
        }
        return this.f43025d.get();
    }

    /* renamed from: f */
    public C11365g m40613f() {
        if (this.f43028g.get() == null) {
            Object m40608e = m40608e(C11365g.class, m40609h());
            if (m40608e == null) {
                this.f43028g.compareAndSet(null, C11365g.m40621h());
            } else {
                this.f43028g.compareAndSet(null, (C11365g) m40608e);
            }
        }
        return this.f43028g.get();
    }

    /* renamed from: g */
    public AbstractC11366h m40614g() {
        if (this.f43026e.get() == null) {
            Object m40608e = m40608e(AbstractC11366h.class, m40609h());
            if (m40608e == null) {
                this.f43026e.compareAndSet(null, C11367i.m40631f());
            } else {
                this.f43026e.compareAndSet(null, (AbstractC11366h) m40608e);
            }
        }
        return this.f43026e.get();
    }
}
