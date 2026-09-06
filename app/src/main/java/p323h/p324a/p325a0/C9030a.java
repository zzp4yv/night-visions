package p323h.p324a.p325a0;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import java.util.concurrent.Callable;
import p323h.p324a.AbstractC9031b;
import p323h.p324a.AbstractC9038h;
import p323h.p324a.AbstractC9040j;
import p323h.p324a.AbstractC9043m;
import p323h.p324a.AbstractC9048r;
import p323h.p324a.AbstractC9049s;
import p323h.p324a.InterfaceC9034d;
import p323h.p324a.InterfaceC9041k;
import p323h.p324a.InterfaceC9047q;
import p323h.p324a.InterfaceC9051u;
import p323h.p324a.p328y.InterfaceC9061b;
import p323h.p324a.p328y.InterfaceC9064e;
import p323h.p324a.p328y.InterfaceC9065f;
import p323h.p324a.p329z.p331b.C9075b;
import p323h.p324a.p329z.p344j.C9145c;
import p355k.p356a.InterfaceC9696b;

/* compiled from: RxJavaPlugins.java */
/* renamed from: h.a.a0.a */
/* loaded from: classes2.dex */
public final class C9030a {

    /* renamed from: a */
    static volatile InterfaceC9064e<? super Throwable> f34904a;

    /* renamed from: b */
    static volatile InterfaceC9065f<? super Runnable, ? extends Runnable> f34905b;

    /* renamed from: c */
    static volatile InterfaceC9065f<? super Callable<AbstractC9048r>, ? extends AbstractC9048r> f34906c;

    /* renamed from: d */
    static volatile InterfaceC9065f<? super Callable<AbstractC9048r>, ? extends AbstractC9048r> f34907d;

    /* renamed from: e */
    static volatile InterfaceC9065f<? super Callable<AbstractC9048r>, ? extends AbstractC9048r> f34908e;

    /* renamed from: f */
    static volatile InterfaceC9065f<? super Callable<AbstractC9048r>, ? extends AbstractC9048r> f34909f;

    /* renamed from: g */
    static volatile InterfaceC9065f<? super AbstractC9048r, ? extends AbstractC9048r> f34910g;

    /* renamed from: h */
    static volatile InterfaceC9065f<? super AbstractC9048r, ? extends AbstractC9048r> f34911h;

    /* renamed from: i */
    static volatile InterfaceC9065f<? super AbstractC9038h, ? extends AbstractC9038h> f34912i;

    /* renamed from: j */
    static volatile InterfaceC9065f<? super AbstractC9043m, ? extends AbstractC9043m> f34913j;

    /* renamed from: k */
    static volatile InterfaceC9065f<? super AbstractC9040j, ? extends AbstractC9040j> f34914k;

    /* renamed from: l */
    static volatile InterfaceC9065f<? super AbstractC9049s, ? extends AbstractC9049s> f34915l;

    /* renamed from: m */
    static volatile InterfaceC9065f<? super AbstractC9031b, ? extends AbstractC9031b> f34916m;

    /* renamed from: n */
    static volatile InterfaceC9061b<? super AbstractC9038h, ? super InterfaceC9696b, ? extends InterfaceC9696b> f34917n;

    /* renamed from: o */
    static volatile InterfaceC9061b<? super AbstractC9040j, ? super InterfaceC9041k, ? extends InterfaceC9041k> f34918o;

    /* renamed from: p */
    static volatile InterfaceC9061b<? super AbstractC9043m, ? super InterfaceC9047q, ? extends InterfaceC9047q> f34919p;

    /* renamed from: q */
    static volatile InterfaceC9061b<? super AbstractC9049s, ? super InterfaceC9051u, ? extends InterfaceC9051u> f34920q;

    /* renamed from: r */
    static volatile InterfaceC9061b<? super AbstractC9031b, ? super InterfaceC9034d, ? extends InterfaceC9034d> f34921r;

    /* renamed from: a */
    static <T, U, R> R m29133a(InterfaceC9061b<T, U, R> interfaceC9061b, T t, U u) {
        try {
            return interfaceC9061b.m29247a(t, u);
        } catch (Throwable th) {
            throw C9145c.m29391c(th);
        }
    }

    /* renamed from: b */
    static <T, R> R m29134b(InterfaceC9065f<T, R> interfaceC9065f, T t) {
        try {
            return interfaceC9065f.mo4660a(t);
        } catch (Throwable th) {
            throw C9145c.m29391c(th);
        }
    }

    /* renamed from: c */
    static AbstractC9048r m29135c(InterfaceC9065f<? super Callable<AbstractC9048r>, ? extends AbstractC9048r> interfaceC9065f, Callable<AbstractC9048r> callable) {
        return (AbstractC9048r) C9075b.m29271c(m29134b(interfaceC9065f, callable), "Scheduler Callable result can't be null");
    }

    /* renamed from: d */
    static AbstractC9048r m29136d(Callable<AbstractC9048r> callable) {
        try {
            return (AbstractC9048r) C9075b.m29271c(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th) {
            throw C9145c.m29391c(th);
        }
    }

    /* renamed from: e */
    public static AbstractC9048r m29137e(Callable<AbstractC9048r> callable) {
        C9075b.m29271c(callable, "Scheduler Callable can't be null");
        InterfaceC9065f<? super Callable<AbstractC9048r>, ? extends AbstractC9048r> interfaceC9065f = f34906c;
        return interfaceC9065f == null ? m29136d(callable) : m29135c(interfaceC9065f, callable);
    }

    /* renamed from: f */
    public static AbstractC9048r m29138f(Callable<AbstractC9048r> callable) {
        C9075b.m29271c(callable, "Scheduler Callable can't be null");
        InterfaceC9065f<? super Callable<AbstractC9048r>, ? extends AbstractC9048r> interfaceC9065f = f34908e;
        return interfaceC9065f == null ? m29136d(callable) : m29135c(interfaceC9065f, callable);
    }

    /* renamed from: g */
    public static AbstractC9048r m29139g(Callable<AbstractC9048r> callable) {
        C9075b.m29271c(callable, "Scheduler Callable can't be null");
        InterfaceC9065f<? super Callable<AbstractC9048r>, ? extends AbstractC9048r> interfaceC9065f = f34909f;
        return interfaceC9065f == null ? m29136d(callable) : m29135c(interfaceC9065f, callable);
    }

    /* renamed from: h */
    public static AbstractC9048r m29140h(Callable<AbstractC9048r> callable) {
        C9075b.m29271c(callable, "Scheduler Callable can't be null");
        InterfaceC9065f<? super Callable<AbstractC9048r>, ? extends AbstractC9048r> interfaceC9065f = f34907d;
        return interfaceC9065f == null ? m29136d(callable) : m29135c(interfaceC9065f, callable);
    }

    /* renamed from: i */
    static boolean m29141i(Throwable th) {
        return (th instanceof OnErrorNotImplementedException) || (th instanceof MissingBackpressureException) || (th instanceof IllegalStateException) || (th instanceof NullPointerException) || (th instanceof IllegalArgumentException) || (th instanceof CompositeException);
    }

    /* renamed from: j */
    public static AbstractC9031b m29142j(AbstractC9031b abstractC9031b) {
        InterfaceC9065f<? super AbstractC9031b, ? extends AbstractC9031b> interfaceC9065f = f34916m;
        return interfaceC9065f != null ? (AbstractC9031b) m29134b(interfaceC9065f, abstractC9031b) : abstractC9031b;
    }

    /* renamed from: k */
    public static <T> AbstractC9038h<T> m29143k(AbstractC9038h<T> abstractC9038h) {
        InterfaceC9065f<? super AbstractC9038h, ? extends AbstractC9038h> interfaceC9065f = f34912i;
        return interfaceC9065f != null ? (AbstractC9038h) m29134b(interfaceC9065f, abstractC9038h) : abstractC9038h;
    }

    /* renamed from: l */
    public static <T> AbstractC9040j<T> m29144l(AbstractC9040j<T> abstractC9040j) {
        InterfaceC9065f<? super AbstractC9040j, ? extends AbstractC9040j> interfaceC9065f = f34914k;
        return interfaceC9065f != null ? (AbstractC9040j) m29134b(interfaceC9065f, abstractC9040j) : abstractC9040j;
    }

    /* renamed from: m */
    public static <T> AbstractC9043m<T> m29145m(AbstractC9043m<T> abstractC9043m) {
        InterfaceC9065f<? super AbstractC9043m, ? extends AbstractC9043m> interfaceC9065f = f34913j;
        return interfaceC9065f != null ? (AbstractC9043m) m29134b(interfaceC9065f, abstractC9043m) : abstractC9043m;
    }

    /* renamed from: n */
    public static <T> AbstractC9049s<T> m29146n(AbstractC9049s<T> abstractC9049s) {
        InterfaceC9065f<? super AbstractC9049s, ? extends AbstractC9049s> interfaceC9065f = f34915l;
        return interfaceC9065f != null ? (AbstractC9049s) m29134b(interfaceC9065f, abstractC9049s) : abstractC9049s;
    }

    /* renamed from: o */
    public static void m29147o(Throwable th) {
        InterfaceC9064e<? super Throwable> interfaceC9064e = f34904a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!m29141i(th)) {
            th = new UndeliverableException(th);
        }
        if (interfaceC9064e != null) {
            try {
                interfaceC9064e.mo7420a(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                m29156x(th2);
            }
        }
        th.printStackTrace();
        m29156x(th);
    }

    /* renamed from: p */
    public static AbstractC9048r m29148p(AbstractC9048r abstractC9048r) {
        InterfaceC9065f<? super AbstractC9048r, ? extends AbstractC9048r> interfaceC9065f = f34911h;
        return interfaceC9065f == null ? abstractC9048r : (AbstractC9048r) m29134b(interfaceC9065f, abstractC9048r);
    }

    /* renamed from: q */
    public static Runnable m29149q(Runnable runnable) {
        C9075b.m29271c(runnable, "run is null");
        InterfaceC9065f<? super Runnable, ? extends Runnable> interfaceC9065f = f34905b;
        return interfaceC9065f == null ? runnable : (Runnable) m29134b(interfaceC9065f, runnable);
    }

    /* renamed from: r */
    public static AbstractC9048r m29150r(AbstractC9048r abstractC9048r) {
        InterfaceC9065f<? super AbstractC9048r, ? extends AbstractC9048r> interfaceC9065f = f34910g;
        return interfaceC9065f == null ? abstractC9048r : (AbstractC9048r) m29134b(interfaceC9065f, abstractC9048r);
    }

    /* renamed from: s */
    public static InterfaceC9034d m29151s(AbstractC9031b abstractC9031b, InterfaceC9034d interfaceC9034d) {
        InterfaceC9061b<? super AbstractC9031b, ? super InterfaceC9034d, ? extends InterfaceC9034d> interfaceC9061b = f34921r;
        return interfaceC9061b != null ? (InterfaceC9034d) m29133a(interfaceC9061b, abstractC9031b, interfaceC9034d) : interfaceC9034d;
    }

    /* renamed from: t */
    public static <T> InterfaceC9041k<? super T> m29152t(AbstractC9040j<T> abstractC9040j, InterfaceC9041k<? super T> interfaceC9041k) {
        InterfaceC9061b<? super AbstractC9040j, ? super InterfaceC9041k, ? extends InterfaceC9041k> interfaceC9061b = f34918o;
        return interfaceC9061b != null ? (InterfaceC9041k) m29133a(interfaceC9061b, abstractC9040j, interfaceC9041k) : interfaceC9041k;
    }

    /* renamed from: u */
    public static <T> InterfaceC9047q<? super T> m29153u(AbstractC9043m<T> abstractC9043m, InterfaceC9047q<? super T> interfaceC9047q) {
        InterfaceC9061b<? super AbstractC9043m, ? super InterfaceC9047q, ? extends InterfaceC9047q> interfaceC9061b = f34919p;
        return interfaceC9061b != null ? (InterfaceC9047q) m29133a(interfaceC9061b, abstractC9043m, interfaceC9047q) : interfaceC9047q;
    }

    /* renamed from: v */
    public static <T> InterfaceC9051u<? super T> m29154v(AbstractC9049s<T> abstractC9049s, InterfaceC9051u<? super T> interfaceC9051u) {
        InterfaceC9061b<? super AbstractC9049s, ? super InterfaceC9051u, ? extends InterfaceC9051u> interfaceC9061b = f34920q;
        return interfaceC9061b != null ? (InterfaceC9051u) m29133a(interfaceC9061b, abstractC9049s, interfaceC9051u) : interfaceC9051u;
    }

    /* renamed from: w */
    public static <T> InterfaceC9696b<? super T> m29155w(AbstractC9038h<T> abstractC9038h, InterfaceC9696b<? super T> interfaceC9696b) {
        InterfaceC9061b<? super AbstractC9038h, ? super InterfaceC9696b, ? extends InterfaceC9696b> interfaceC9061b = f34917n;
        return interfaceC9061b != null ? (InterfaceC9696b) m29133a(interfaceC9061b, abstractC9038h, interfaceC9696b) : interfaceC9696b;
    }

    /* renamed from: x */
    static void m29156x(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
