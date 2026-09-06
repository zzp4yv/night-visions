package p456rx;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p456rx.exceptions.C11192a;
import p456rx.exceptions.OnErrorFailedException;
import p456rx.p460m.C11206c;
import p456rx.p460m.C11212i;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p460m.InterfaceC11205b;
import p456rx.p460m.InterfaceC11208e;
import p456rx.p460m.InterfaceC11209f;
import p456rx.p460m.InterfaceC11210g;
import p456rx.p460m.InterfaceC11211h;
import p456rx.p460m.InterfaceCallableC11207d;
import p456rx.p461n.p462a.C11214a0;
import p456rx.p461n.p462a.C11215a1;
import p456rx.p461n.p462a.C11217b0;
import p456rx.p461n.p462a.C11218b1;
import p456rx.p461n.p462a.C11220c0;
import p456rx.p461n.p462a.C11221c1;
import p456rx.p461n.p462a.C11223d0;
import p456rx.p461n.p462a.C11224d1;
import p456rx.p461n.p462a.C11226e0;
import p456rx.p461n.p462a.C11227e1;
import p456rx.p461n.p462a.C11229f0;
import p456rx.p461n.p462a.C11230f1;
import p456rx.p461n.p462a.C11232g0;
import p456rx.p461n.p462a.C11233g1;
import p456rx.p461n.p462a.C11238i0;
import p456rx.p461n.p462a.C11240j;
import p456rx.p461n.p462a.C11241j0;
import p456rx.p461n.p462a.C11243k;
import p456rx.p461n.p462a.C11244k0;
import p456rx.p461n.p462a.C11246l;
import p456rx.p461n.p462a.C11247l0;
import p456rx.p461n.p462a.C11249m;
import p456rx.p461n.p462a.C11250m0;
import p456rx.p461n.p462a.C11252n;
import p456rx.p461n.p462a.C11253n0;
import p456rx.p461n.p462a.C11255o;
import p456rx.p461n.p462a.C11256o0;
import p456rx.p461n.p462a.C11258p;
import p456rx.p461n.p462a.C11259p0;
import p456rx.p461n.p462a.C11261q;
import p456rx.p461n.p462a.C11262q0;
import p456rx.p461n.p462a.C11264r;
import p456rx.p461n.p462a.C11265r0;
import p456rx.p461n.p462a.C11267s;
import p456rx.p461n.p462a.C11268s0;
import p456rx.p461n.p462a.C11270t;
import p456rx.p461n.p462a.C11271t0;
import p456rx.p461n.p462a.C11273u;
import p456rx.p461n.p462a.C11274u0;
import p456rx.p461n.p462a.C11275v;
import p456rx.p461n.p462a.C11276v0;
import p456rx.p461n.p462a.C11277w;
import p456rx.p461n.p462a.C11278w0;
import p456rx.p461n.p462a.C11279x;
import p456rx.p461n.p462a.C11280x0;
import p456rx.p461n.p462a.C11281y;
import p456rx.p461n.p462a.C11282y0;
import p456rx.p461n.p462a.C11284z0;
import p456rx.p461n.p462a.EnumC11231g;
import p456rx.p461n.p466e.C11304a;
import p456rx.p461n.p466e.C11305b;
import p456rx.p461n.p466e.C11311h;
import p456rx.p461n.p466e.C11313j;
import p456rx.p461n.p466e.C11316m;
import p456rx.p461n.p466e.EnumC11309f;
import p456rx.p469o.AbstractC11352b;
import p456rx.p469o.C11351a;
import p456rx.p470p.C11355c;
import p456rx.p471q.C11361c;
import p456rx.p474t.C11381e;
import p456rx.schedulers.Schedulers;

/* compiled from: Observable.java */
/* renamed from: rx.e */
/* loaded from: classes.dex */
public class C11186e<T> {

    /* renamed from: f */
    final a<T> f42129f;

    /* compiled from: Observable.java */
    /* renamed from: rx.e$a */
    /* loaded from: classes3.dex */
    public interface a<T> extends InterfaceC11205b<AbstractC11197j<? super T>> {
    }

    /* compiled from: Observable.java */
    /* renamed from: rx.e$b */
    /* loaded from: classes3.dex */
    public interface b<R, T> extends InterfaceC11208e<AbstractC11197j<? super R>, AbstractC11197j<? super T>> {
    }

    /* compiled from: Observable.java */
    /* renamed from: rx.e$c */
    public interface c<T, R> extends InterfaceC11208e<C11186e<T>, C11186e<R>> {
    }

    protected C11186e(a<T> aVar) {
        this.f42129f = aVar;
    }

    /* renamed from: B */
    public static <T> C11186e<T> m40016B() {
        return EnumC11231g.m40207k();
    }

    /* renamed from: C */
    public static <T> C11186e<T> m40017C(Throwable th) {
        return m40035b1(new C11223d0(th));
    }

    /* renamed from: F0 */
    static <T> InterfaceC11198k m40018F0(AbstractC11197j<? super T> abstractC11197j, C11186e<T> c11186e) {
        if (abstractC11197j == null) {
            throw new IllegalArgumentException("subscriber can not be null");
        }
        if (c11186e.f42129f == null) {
            throw new IllegalStateException("onSubscribe function can not be null.");
        }
        abstractC11197j.onStart();
        if (!(abstractC11197j instanceof C11355c)) {
            abstractC11197j = new C11355c(abstractC11197j);
        }
        try {
            C11361c.m40584p(c11186e, c11186e.f42129f).call(abstractC11197j);
            return C11361c.m40583o(abstractC11197j);
        } catch (Throwable th) {
            C11192a.m40140e(th);
            if (abstractC11197j.isUnsubscribed()) {
                C11361c.m40578j(C11361c.m40581m(th));
            } else {
                try {
                    abstractC11197j.onError(C11361c.m40581m(th));
                } catch (Throwable th2) {
                    C11192a.m40140e(th2);
                    OnErrorFailedException onErrorFailedException = new OnErrorFailedException("Error occurred attempting to subscribe [" + th.getMessage() + "] and then again while trying to pass to onError.", th2);
                    C11361c.m40581m(onErrorFailedException);
                    throw onErrorFailedException;
                }
            }
            return C11381e.m40676c();
        }
    }

    /* renamed from: M0 */
    public static <T> C11186e<T> m40019M0(C11186e<? extends C11186e<? extends T>> c11186e) {
        return (C11186e<T>) c11186e.m40080W(C11215a1.m40167b(false));
    }

    /* renamed from: N */
    public static <T> C11186e<T> m40020N(Iterable<? extends T> iterable) {
        return m40035b1(new C11273u(iterable));
    }

    /* renamed from: O */
    public static <T> C11186e<T> m40021O(T[] tArr) {
        int length = tArr.length;
        return length == 0 ? m40016B() : length == 1 ? m40025S(tArr[0]) : m40035b1(new C11267s(tArr));
    }

    /* renamed from: P */
    public static <T> C11186e<T> m40022P(Callable<? extends T> callable) {
        return m40035b1(new C11270t(callable));
    }

    /* renamed from: Q */
    public static C11186e<Long> m40023Q(long j2, long j3, TimeUnit timeUnit) {
        return m40024R(j2, j3, timeUnit, Schedulers.computation());
    }

    /* renamed from: R */
    public static C11186e<Long> m40024R(long j2, long j3, TimeUnit timeUnit, AbstractC11195h abstractC11195h) {
        return m40035b1(new C11232g0(j2, j3, timeUnit, abstractC11195h));
    }

    /* renamed from: S */
    public static <T> C11186e<T> m40025S(T t) {
        return C11313j.m40446f1(t);
    }

    /* renamed from: T */
    public static <T> C11186e<T> m40026T(T t, T t2) {
        return m40021O(new Object[]{t, t2});
    }

    /* renamed from: U */
    public static <T> C11186e<T> m40027U(T t, T t2, T t3) {
        return m40021O(new Object[]{t, t2, t3});
    }

    /* renamed from: U0 */
    public static C11186e<Long> m40028U0(long j2, TimeUnit timeUnit) {
        return m40030V0(j2, timeUnit, Schedulers.computation());
    }

    /* renamed from: V */
    public static <T> C11186e<T> m40029V(T t, T t2, T t3, T t4, T t5, T t6, T t7) {
        return m40021O(new Object[]{t, t2, t3, t4, t5, t6, t7});
    }

    /* renamed from: V0 */
    public static C11186e<Long> m40030V0(long j2, TimeUnit timeUnit, AbstractC11195h abstractC11195h) {
        return m40035b1(new C11229f0(j2, timeUnit, abstractC11195h));
    }

    /* renamed from: Y */
    public static <T> C11186e<T> m40031Y(Iterable<? extends C11186e<? extends T>> iterable) {
        return m40032Z(m40020N(iterable));
    }

    /* renamed from: Z */
    public static <T> C11186e<T> m40032Z(C11186e<? extends C11186e<? extends T>> c11186e) {
        return c11186e.getClass() == C11313j.class ? ((C11313j) c11186e).m40449i1(C11316m.m40467b()) : (C11186e<T>) c11186e.m40080W(C11262q0.m40280b(false));
    }

    /* renamed from: a0 */
    public static <T> C11186e<T> m40033a0(C11186e<? extends T> c11186e, C11186e<? extends T> c11186e2) {
        return m40039d0(new C11186e[]{c11186e, c11186e2});
    }

    /* renamed from: b0 */
    public static <T> C11186e<T> m40034b0(C11186e<? extends T> c11186e, C11186e<? extends T> c11186e2, C11186e<? extends T> c11186e3) {
        return m40039d0(new C11186e[]{c11186e, c11186e2, c11186e3});
    }

    /* renamed from: b1 */
    public static <T> C11186e<T> m40035b1(a<T> aVar) {
        return new C11186e<>(C11361c.m40576h(aVar));
    }

    /* renamed from: c */
    public static <T, R> C11186e<R> m40036c(List<? extends C11186e<? extends T>> list, InterfaceC11211h<? extends R> interfaceC11211h) {
        return m40035b1(new C11240j(list, interfaceC11211h));
    }

    /* renamed from: c0 */
    public static <T> C11186e<T> m40037c0(C11186e<? extends T> c11186e, C11186e<? extends T> c11186e2, C11186e<? extends T> c11186e3, C11186e<? extends T> c11186e4) {
        return m40039d0(new C11186e[]{c11186e, c11186e2, c11186e3, c11186e4});
    }

    /* renamed from: d */
    public static <T1, T2, T3, R> C11186e<R> m40038d(C11186e<? extends T1> c11186e, C11186e<? extends T2> c11186e2, C11186e<? extends T3> c11186e3, InterfaceC11210g<? super T1, ? super T2, ? super T3, ? extends R> interfaceC11210g) {
        return m40036c(Arrays.asList(c11186e, c11186e2, c11186e3), C11212i.m40160b(interfaceC11210g));
    }

    /* renamed from: d0 */
    public static <T> C11186e<T> m40039d0(C11186e<? extends T>[] c11186eArr) {
        return m40032Z(m40021O(c11186eArr));
    }

    /* renamed from: d1 */
    public static <T1, T2, R> C11186e<R> m40040d1(C11186e<? extends T1> c11186e, C11186e<? extends T2> c11186e2, InterfaceC11209f<? super T1, ? super T2, ? extends R> interfaceC11209f) {
        return m40025S(new C11186e[]{c11186e, c11186e2}).m40080W(new C11233g1(interfaceC11209f));
    }

    /* renamed from: e */
    public static <T1, T2, R> C11186e<R> m40041e(C11186e<? extends T1> c11186e, C11186e<? extends T2> c11186e2, InterfaceC11209f<? super T1, ? super T2, ? extends R> interfaceC11209f) {
        return m40036c(Arrays.asList(c11186e, c11186e2), C11212i.m40159a(interfaceC11209f));
    }

    /* renamed from: e0 */
    public static <T> C11186e<T> m40042e0(C11186e<? extends C11186e<? extends T>> c11186e) {
        return (C11186e<T>) c11186e.m40080W(C11262q0.m40280b(true));
    }

    /* renamed from: f0 */
    public static <T> C11186e<T> m40043f0(C11186e<? extends T> c11186e, C11186e<? extends T> c11186e2) {
        return m40042e0(m40026T(c11186e, c11186e2));
    }

    /* renamed from: g */
    public static <T> C11186e<T> m40044g(C11186e<? extends C11186e<? extends T>> c11186e) {
        return (C11186e<T>) c11186e.m40092i(C11316m.m40467b());
    }

    /* renamed from: g0 */
    public static <T> C11186e<T> m40045g0(C11186e<? extends T> c11186e, C11186e<? extends T> c11186e2, C11186e<? extends T> c11186e3) {
        return m40042e0(m40027U(c11186e, c11186e2, c11186e3));
    }

    /* renamed from: h */
    public static <T> C11186e<T> m40046h(C11186e<? extends T> c11186e, C11186e<? extends T> c11186e2) {
        return m40044g(m40026T(c11186e, c11186e2));
    }

    /* renamed from: h0 */
    public static <T> C11186e<T> m40047h0(C11186e<? extends T> c11186e, C11186e<? extends T> c11186e2, C11186e<? extends T> c11186e3, C11186e<? extends T> c11186e4, C11186e<? extends T> c11186e5, C11186e<? extends T> c11186e6, C11186e<? extends T> c11186e7) {
        return m40042e0(m40029V(c11186e, c11186e2, c11186e3, c11186e4, c11186e5, c11186e6, c11186e7));
    }

    @Deprecated
    /* renamed from: l */
    public static <T> C11186e<T> m40048l(a<T> aVar) {
        return new C11186e<>(C11361c.m40576h(aVar));
    }

    /* renamed from: p */
    public static <T> C11186e<T> m40049p(InterfaceCallableC11207d<C11186e<T>> interfaceCallableC11207d) {
        return m40035b1(new C11246l(interfaceCallableC11207d));
    }

    /* renamed from: r0 */
    public static C11186e<Integer> m40050r0(int i2, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("Count can not be negative");
        }
        if (i3 == 0) {
            return m40016B();
        }
        if (i2 <= (Integer.MAX_VALUE - i3) + 1) {
            return i3 == 1 ? m40025S(Integer.valueOf(i2)) : m40035b1(new C11279x(i2, (i3 - 1) + i2));
        }
        throw new IllegalArgumentException("start + count can not exceed Integer.MAX_VALUE");
    }

    /* renamed from: A */
    public final C11186e<T> m40051A(InterfaceC11204a interfaceC11204a) {
        return (C11186e<T>) m40080W(new C11256o0(interfaceC11204a));
    }

    /* renamed from: A0 */
    public final C11186e<T> m40052A0(long j2, TimeUnit timeUnit, AbstractC11195h abstractC11195h) {
        return m40035b1(new C11217b0(this, j2, timeUnit, abstractC11195h));
    }

    /* renamed from: B0 */
    public final C11186e<T> m40053B0(InterfaceC11208e<? super T, Boolean> interfaceC11208e) {
        return (C11186e<T>) m40080W(new C11282y0(C11282y0.m40362b(interfaceC11208e)));
    }

    /* renamed from: C0 */
    public final C11186e<T> m40054C0(T t) {
        return m40046h(m40025S(t), this);
    }

    /* renamed from: D */
    public final C11186e<T> m40055D(InterfaceC11208e<? super T, Boolean> interfaceC11208e) {
        return m40035b1(new C11255o(this, interfaceC11208e));
    }

    /* renamed from: D0 */
    public final InterfaceC11198k m40056D0() {
        return m40058E0(new C11305b(C11206c.m40157a(), EnumC11309f.f42878l, C11206c.m40157a()));
    }

    /* renamed from: E */
    public final C11186e<T> m40057E() {
        return m40073N0(1).m40120x0();
    }

    /* renamed from: E0 */
    public final InterfaceC11198k m40058E0(AbstractC11197j<? super T> abstractC11197j) {
        return m40018F0(abstractC11197j, this);
    }

    /* renamed from: F */
    public final C11186e<T> m40059F(InterfaceC11208e<? super T, Boolean> interfaceC11208e) {
        return m40074O0(interfaceC11208e).m40120x0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: G */
    public final <R> C11186e<R> m40060G(InterfaceC11208e<? super T, ? extends C11186e<? extends R>> interfaceC11208e) {
        return getClass() == C11313j.class ? ((C11313j) this).m40449i1(interfaceC11208e) : m40032Z(m40082X(interfaceC11208e));
    }

    /* renamed from: G0 */
    public final InterfaceC11198k m40061G0(InterfaceC11205b<? super T> interfaceC11205b) {
        if (interfaceC11205b != null) {
            return m40058E0(new C11305b(interfaceC11205b, EnumC11309f.f42878l, C11206c.m40157a()));
        }
        throw new IllegalArgumentException("onNext can not be null");
    }

    /* renamed from: H */
    public final C11186e<T> m40062H(InterfaceC11208e<? super T, ? extends C11183b> interfaceC11208e) {
        return m40064I(interfaceC11208e, false, Integer.MAX_VALUE);
    }

    /* renamed from: H0 */
    public final InterfaceC11198k m40063H0(InterfaceC11205b<? super T> interfaceC11205b, InterfaceC11205b<Throwable> interfaceC11205b2) {
        if (interfaceC11205b == null) {
            throw new IllegalArgumentException("onNext can not be null");
        }
        if (interfaceC11205b2 != null) {
            return m40058E0(new C11305b(interfaceC11205b, interfaceC11205b2, C11206c.m40157a()));
        }
        throw new IllegalArgumentException("onError can not be null");
    }

    /* renamed from: I */
    public final C11186e<T> m40064I(InterfaceC11208e<? super T, ? extends C11183b> interfaceC11208e, boolean z, int i2) {
        return m40035b1(new C11258p(this, interfaceC11208e, z, i2));
    }

    /* renamed from: I0 */
    public final C11186e<T> m40065I0(AbstractC11195h abstractC11195h) {
        return m40067J0(abstractC11195h, true);
    }

    /* renamed from: J */
    public final <R> C11186e<R> m40066J(InterfaceC11208e<? super T, ? extends Iterable<? extends R>> interfaceC11208e) {
        return m40068K(interfaceC11208e, C11311h.f42884f);
    }

    /* renamed from: J0 */
    public final C11186e<T> m40067J0(AbstractC11195h abstractC11195h, boolean z) {
        return this instanceof C11313j ? ((C11313j) this).m40450j1(abstractC11195h) : m40035b1(new C11284z0(this, abstractC11195h, z));
    }

    /* renamed from: K */
    public final <R> C11186e<R> m40068K(InterfaceC11208e<? super T, ? extends Iterable<? extends R>> interfaceC11208e, int i2) {
        return C11264r.m40303b(this, interfaceC11208e, i2);
    }

    /* renamed from: K0 */
    public final C11186e<T> m40069K0(C11186e<? extends T> c11186e) {
        if (c11186e != null) {
            return m40035b1(new C11220c0(this, c11186e));
        }
        throw new NullPointerException("alternate is null");
    }

    /* renamed from: L */
    public final <R> C11186e<R> m40070L(InterfaceC11208e<? super T, ? extends Single<? extends R>> interfaceC11208e) {
        return m40072M(interfaceC11208e, false, Integer.MAX_VALUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: L0 */
    public final <R> C11186e<R> m40071L0(InterfaceC11208e<? super T, ? extends C11186e<? extends R>> interfaceC11208e) {
        return m40019M0(m40082X(interfaceC11208e));
    }

    /* renamed from: M */
    public final <R> C11186e<R> m40072M(InterfaceC11208e<? super T, ? extends Single<? extends R>> interfaceC11208e, boolean z, int i2) {
        return m40035b1(new C11261q(this, interfaceC11208e, z, i2));
    }

    /* renamed from: N0 */
    public final C11186e<T> m40073N0(int i2) {
        return (C11186e<T>) m40080W(new C11218b1(i2));
    }

    /* renamed from: O0 */
    public final C11186e<T> m40074O0(InterfaceC11208e<? super T, Boolean> interfaceC11208e) {
        return m40055D(interfaceC11208e).m40073N0(1);
    }

    /* renamed from: P0 */
    public final <E> C11186e<T> m40075P0(C11186e<? extends E> c11186e) {
        return (C11186e<T>) m40080W(new C11221c1(c11186e));
    }

    /* renamed from: Q0 */
    public final C11186e<T> m40076Q0(InterfaceC11208e<? super T, Boolean> interfaceC11208e) {
        return (C11186e<T>) m40080W(new C11224d1(interfaceC11208e));
    }

    /* renamed from: R0 */
    public final C11186e<T> m40077R0(long j2, TimeUnit timeUnit) {
        return m40114u0(j2, timeUnit);
    }

    /* renamed from: S0 */
    public final C11186e<T> m40078S0(long j2, TimeUnit timeUnit, C11186e<? extends T> c11186e) {
        return m40079T0(j2, timeUnit, c11186e, Schedulers.computation());
    }

    /* renamed from: T0 */
    public final C11186e<T> m40079T0(long j2, TimeUnit timeUnit, C11186e<? extends T> c11186e, AbstractC11195h abstractC11195h) {
        return m40035b1(new C11226e0(this, j2, timeUnit, abstractC11195h, c11186e));
    }

    /* renamed from: W */
    public final <R> C11186e<R> m40080W(b<? extends R, ? super T> bVar) {
        return m40035b1(new C11275v(this.f42129f, bVar));
    }

    /* renamed from: W0 */
    public final C11351a<T> m40081W0() {
        return C11351a.m40550c(this);
    }

    /* renamed from: X */
    public final <R> C11186e<R> m40082X(InterfaceC11208e<? super T, ? extends R> interfaceC11208e) {
        return m40035b1(new C11277w(this, interfaceC11208e));
    }

    /* renamed from: X0 */
    public C11183b m40083X0() {
        return C11183b.m39954v(this);
    }

    /* renamed from: Y0 */
    public final C11186e<List<T>> m40084Y0() {
        return (C11186e<List<T>>) m40080W(C11227e1.m40201b());
    }

    /* renamed from: Z0 */
    public Single<T> m40085Z0() {
        return new Single<>(C11214a0.m40165b(this));
    }

    /* renamed from: a */
    public final C11186e<T> m40086a() {
        return (C11186e<T>) m40080W(C11238i0.m40225b());
    }

    /* renamed from: a1 */
    public final C11186e<List<T>> m40087a1(InterfaceC11209f<? super T, ? super T, Integer> interfaceC11209f) {
        return (C11186e<List<T>>) m40080W(new C11230f1(interfaceC11209f, 10));
    }

    /* renamed from: b */
    public final <R> C11186e<R> m40088b(Class<R> cls) {
        return m40080W(new C11241j0(cls));
    }

    /* renamed from: c1 */
    public final InterfaceC11198k m40089c1(AbstractC11197j<? super T> abstractC11197j) {
        try {
            abstractC11197j.onStart();
            C11361c.m40584p(this, this.f42129f).call(abstractC11197j);
            return C11361c.m40583o(abstractC11197j);
        } catch (Throwable th) {
            C11192a.m40140e(th);
            try {
                abstractC11197j.onError(C11361c.m40581m(th));
                return C11381e.m40676c();
            } catch (Throwable th2) {
                C11192a.m40140e(th2);
                OnErrorFailedException onErrorFailedException = new OnErrorFailedException("Error occurred attempting to subscribe [" + th.getMessage() + "] and then again while trying to pass to onError.", th2);
                C11361c.m40581m(onErrorFailedException);
                throw onErrorFailedException;
            }
        }
    }

    /* renamed from: e1 */
    public final <T2, R> C11186e<R> m40090e1(C11186e<? extends T2> c11186e, InterfaceC11209f<? super T, ? super T2, ? extends R> interfaceC11209f) {
        return m40040d1(this, c11186e, interfaceC11209f);
    }

    /* renamed from: f */
    public <R> C11186e<R> m40091f(c<? super T, ? extends R> cVar) {
        return (C11186e) cVar.call(this);
    }

    /* renamed from: i */
    public final <R> C11186e<R> m40092i(InterfaceC11208e<? super T, ? extends C11186e<? extends R>> interfaceC11208e) {
        return this instanceof C11313j ? ((C11313j) this).m40449i1(interfaceC11208e) : m40035b1(new C11243k(this, interfaceC11208e, 2, 0));
    }

    /* renamed from: i0 */
    public final C11186e<T> m40093i0(C11186e<? extends T> c11186e) {
        return m40033a0(this, c11186e);
    }

    /* renamed from: j */
    public final <R> C11186e<R> m40094j(InterfaceC11208e<? super T, ? extends C11186e<? extends R>> interfaceC11208e) {
        return m40096k(interfaceC11208e, C11311h.f42884f);
    }

    /* renamed from: j0 */
    public final C11186e<T> m40095j0(AbstractC11195h abstractC11195h) {
        return m40097k0(abstractC11195h, C11311h.f42884f);
    }

    /* renamed from: k */
    public final <R> C11186e<R> m40096k(InterfaceC11208e<? super T, ? extends C11186e<? extends R>> interfaceC11208e, int i2) {
        if (i2 >= 1) {
            return m40080W(new C11259p0(interfaceC11208e, i2, Integer.MAX_VALUE));
        }
        throw new IllegalArgumentException("capacityHint > 0 required but it was " + i2);
    }

    /* renamed from: k0 */
    public final C11186e<T> m40097k0(AbstractC11195h abstractC11195h, int i2) {
        return m40098l0(abstractC11195h, false, i2);
    }

    /* renamed from: l0 */
    public final C11186e<T> m40098l0(AbstractC11195h abstractC11195h, boolean z, int i2) {
        return this instanceof C11313j ? ((C11313j) this).m40450j1(abstractC11195h) : (C11186e<T>) m40080W(new C11265r0(abstractC11195h, z, i2));
    }

    /* renamed from: m */
    public final C11186e<T> m40099m(long j2, TimeUnit timeUnit) {
        return m40101n(j2, timeUnit, Schedulers.computation());
    }

    /* renamed from: m0 */
    public final C11186e<T> m40100m0() {
        return (C11186e<T>) m40080W(C11268s0.m40318b());
    }

    /* renamed from: n */
    public final C11186e<T> m40101n(long j2, TimeUnit timeUnit, AbstractC11195h abstractC11195h) {
        return (C11186e<T>) m40080W(new C11244k0(j2, timeUnit, abstractC11195h));
    }

    /* renamed from: n0 */
    public final C11186e<T> m40102n0(C11186e<? extends T> c11186e) {
        return (C11186e<T>) m40080W(C11271t0.m40326b(c11186e));
    }

    /* renamed from: o */
    public final C11186e<T> m40103o(T t) {
        return m40069K0(m40025S(t));
    }

    /* renamed from: o0 */
    public final C11186e<T> m40104o0(InterfaceC11208e<? super Throwable, ? extends C11186e<? extends T>> interfaceC11208e) {
        return (C11186e<T>) m40080W(new C11271t0(interfaceC11208e));
    }

    /* renamed from: p0 */
    public final C11186e<T> m40105p0(InterfaceC11208e<? super Throwable, ? extends T> interfaceC11208e) {
        return (C11186e<T>) m40080W(C11271t0.m40327c(interfaceC11208e));
    }

    /* renamed from: q */
    public final C11186e<T> m40106q(long j2, TimeUnit timeUnit) {
        return m40108r(j2, timeUnit, Schedulers.computation());
    }

    /* renamed from: q0 */
    public final AbstractC11352b<T> m40107q0() {
        return C11274u0.m40335k1(this);
    }

    /* renamed from: r */
    public final C11186e<T> m40108r(long j2, TimeUnit timeUnit, AbstractC11195h abstractC11195h) {
        return (C11186e<T>) m40080W(new C11247l0(j2, timeUnit, abstractC11195h));
    }

    /* renamed from: s */
    public final <U> C11186e<T> m40109s(C11186e<U> c11186e) {
        c11186e.getClass();
        return m40035b1(new C11249m(this, c11186e));
    }

    /* renamed from: s0 */
    public final C11186e<T> m40110s0() {
        return C11281y.m40354b(this);
    }

    /* renamed from: t */
    public final C11186e<T> m40111t() {
        return (C11186e<T>) m40080W(C11250m0.m40255d());
    }

    /* renamed from: t0 */
    public final C11186e<T> m40112t0(InterfaceC11208e<? super C11186e<? extends Throwable>, ? extends C11186e<?>> interfaceC11208e) {
        return C11281y.m40355c(this, EnumC11309f.m40424g(interfaceC11208e));
    }

    /* renamed from: u */
    public final <U> C11186e<T> m40113u(InterfaceC11208e<? super T, ? extends U> interfaceC11208e) {
        return (C11186e<T>) m40080W(new C11250m0(interfaceC11208e));
    }

    /* renamed from: u0 */
    public final C11186e<T> m40114u0(long j2, TimeUnit timeUnit) {
        return m40116v0(j2, timeUnit, Schedulers.computation());
    }

    /* renamed from: v */
    public final C11186e<T> m40115v(InterfaceC11204a interfaceC11204a) {
        return m40035b1(new C11252n(this, new C11304a(C11206c.m40157a(), C11206c.m40157a(), interfaceC11204a)));
    }

    /* renamed from: v0 */
    public final C11186e<T> m40116v0(long j2, TimeUnit timeUnit, AbstractC11195h abstractC11195h) {
        return (C11186e<T>) m40080W(new C11276v0(j2, timeUnit, abstractC11195h));
    }

    /* renamed from: w */
    public final C11186e<T> m40117w(InterfaceC11205b<? super Throwable> interfaceC11205b) {
        return m40035b1(new C11252n(this, new C11304a(C11206c.m40157a(), interfaceC11205b, C11206c.m40157a())));
    }

    /* renamed from: w0 */
    public final C11186e<T> m40118w0() {
        return m40107q0().m40555j1();
    }

    /* renamed from: x */
    public final C11186e<T> m40119x(InterfaceC11205b<? super T> interfaceC11205b) {
        return m40035b1(new C11252n(this, new C11304a(interfaceC11205b, C11206c.m40157a(), C11206c.m40157a())));
    }

    /* renamed from: x0 */
    public final C11186e<T> m40120x0() {
        return (C11186e<T>) m40080W(C11278w0.m40348b());
    }

    /* renamed from: y */
    public final C11186e<T> m40121y(InterfaceC11204a interfaceC11204a) {
        return (C11186e<T>) m40080W(new C11253n0(interfaceC11204a));
    }

    /* renamed from: y0 */
    public final C11186e<T> m40122y0(int i2) {
        return (C11186e<T>) m40080W(new C11280x0(i2));
    }

    /* renamed from: z */
    public final C11186e<T> m40123z(InterfaceC11204a interfaceC11204a) {
        return m40035b1(new C11252n(this, new C11304a(C11206c.m40157a(), C11206c.m40158b(interfaceC11204a), interfaceC11204a)));
    }

    /* renamed from: z0 */
    public final C11186e<T> m40124z0(long j2, TimeUnit timeUnit) {
        return m40052A0(j2, timeUnit, Schedulers.computation());
    }
}
