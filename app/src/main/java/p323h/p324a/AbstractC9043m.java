package p323h.p324a;

import io.reactivex.exceptions.C9207a;
import java.util.List;
import java.util.concurrent.Callable;
import p323h.p324a.p325a0.C9030a;
import p323h.p324a.p328y.InterfaceC9060a;
import p323h.p324a.p328y.InterfaceC9064e;
import p323h.p324a.p328y.InterfaceC9065f;
import p323h.p324a.p329z.p331b.C9074a;
import p323h.p324a.p329z.p331b.C9075b;
import p323h.p324a.p329z.p332c.InterfaceCallableC9079d;
import p323h.p324a.p329z.p334e.p336b.C9090b;
import p323h.p324a.p329z.p334e.p336b.C9093e;
import p323h.p324a.p329z.p334e.p338d.C9099b;
import p323h.p324a.p329z.p334e.p338d.C9100c;
import p323h.p324a.p329z.p334e.p338d.C9101d;
import p323h.p324a.p329z.p334e.p338d.C9102e;
import p323h.p324a.p329z.p334e.p338d.C9103f;
import p323h.p324a.p329z.p334e.p338d.C9105h;
import p323h.p324a.p329z.p334e.p338d.C9106i;
import p323h.p324a.p329z.p334e.p338d.C9107j;
import p323h.p324a.p329z.p334e.p338d.C9108k;
import p323h.p324a.p329z.p334e.p338d.C9109l;
import p323h.p324a.p329z.p334e.p338d.C9110m;
import p323h.p324a.p329z.p334e.p338d.C9111n;
import p323h.p324a.p329z.p334e.p338d.C9112o;
import p323h.p324a.p329z.p334e.p338d.C9113p;
import p323h.p324a.p329z.p334e.p338d.C9114q;
import p323h.p324a.p329z.p334e.p338d.C9116s;
import p323h.p324a.p329z.p334e.p338d.C9117t;

/* compiled from: Observable.java */
/* renamed from: h.a.m */
/* loaded from: classes2.dex */
public abstract class AbstractC9043m<T> implements InterfaceC9046p<T> {

    /* compiled from: Observable.java */
    /* renamed from: h.a.m$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f34932a;

        static {
            int[] iArr = new int[EnumC9029a.values().length];
            f34932a = iArr;
            try {
                iArr[EnumC9029a.DROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34932a[EnumC9029a.LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34932a[EnumC9029a.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34932a[EnumC9029a.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: D */
    public static <T> AbstractC9043m<T> m29187D(InterfaceC9046p<T> interfaceC9046p) {
        C9075b.m29271c(interfaceC9046p, "source is null");
        return interfaceC9046p instanceof AbstractC9043m ? C9030a.m29145m((AbstractC9043m) interfaceC9046p) : C9030a.m29145m(new C9109l(interfaceC9046p));
    }

    /* renamed from: b */
    public static int m29188b() {
        return AbstractC9038h.m29172c();
    }

    /* renamed from: c */
    public static <T> AbstractC9043m<T> m29189c(InterfaceC9045o<T> interfaceC9045o) {
        C9075b.m29271c(interfaceC9045o, "source is null");
        return C9030a.m29145m(new C9099b(interfaceC9045o));
    }

    /* renamed from: d */
    private AbstractC9043m<T> m29190d(InterfaceC9064e<? super T> interfaceC9064e, InterfaceC9064e<? super Throwable> interfaceC9064e2, InterfaceC9060a interfaceC9060a, InterfaceC9060a interfaceC9060a2) {
        C9075b.m29271c(interfaceC9064e, "onNext is null");
        C9075b.m29271c(interfaceC9064e2, "onError is null");
        C9075b.m29271c(interfaceC9060a, "onComplete is null");
        C9075b.m29271c(interfaceC9060a2, "onAfterTerminate is null");
        return C9030a.m29145m(new C9100c(this, interfaceC9064e, interfaceC9064e2, interfaceC9060a, interfaceC9060a2));
    }

    /* renamed from: g */
    public static <T> AbstractC9043m<T> m29191g() {
        return C9030a.m29145m(C9101d.f35023f);
    }

    /* renamed from: h */
    public static <T> AbstractC9043m<T> m29192h(Throwable th) {
        C9075b.m29271c(th, "exception is null");
        return m29193i(C9074a.m29264c(th));
    }

    /* renamed from: i */
    public static <T> AbstractC9043m<T> m29193i(Callable<? extends Throwable> callable) {
        C9075b.m29271c(callable, "errorSupplier is null");
        return C9030a.m29145m(new C9102e(callable));
    }

    /* renamed from: s */
    public static <T> AbstractC9043m<T> m29194s(Iterable<? extends T> iterable) {
        C9075b.m29271c(iterable, "source is null");
        return C9030a.m29145m(new C9108k(iterable));
    }

    /* renamed from: t */
    public static <T> AbstractC9043m<T> m29195t(T t) {
        C9075b.m29271c(t, "item is null");
        return C9030a.m29145m(new C9110m(t));
    }

    /* renamed from: A */
    public final AbstractC9049s<List<T>> m29196A() {
        return m29197B(16);
    }

    /* renamed from: B */
    public final AbstractC9049s<List<T>> m29197B(int i2) {
        C9075b.m29272d(i2, "capacityHint");
        return C9030a.m29146n(new C9116s(this, i2));
    }

    /* renamed from: C */
    public final AbstractC9043m<T> m29198C(AbstractC9048r abstractC9048r) {
        C9075b.m29271c(abstractC9048r, "scheduler is null");
        return C9030a.m29145m(new C9117t(this, abstractC9048r));
    }

    @Override // p323h.p324a.InterfaceC9046p
    /* renamed from: a */
    public final void mo29199a(InterfaceC9047q<? super T> interfaceC9047q) {
        C9075b.m29271c(interfaceC9047q, "observer is null");
        try {
            InterfaceC9047q<? super T> m29153u = C9030a.m29153u(this, interfaceC9047q);
            C9075b.m29271c(m29153u, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo29214x(m29153u);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            C9207a.m30000a(th);
            C9030a.m29147o(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: e */
    public final AbstractC9043m<T> m29200e(InterfaceC9064e<? super Throwable> interfaceC9064e) {
        InterfaceC9064e<? super T> m29263b = C9074a.m29263b();
        InterfaceC9060a interfaceC9060a = C9074a.f34948c;
        return m29190d(m29263b, interfaceC9064e, interfaceC9060a, interfaceC9060a);
    }

    /* renamed from: f */
    public final AbstractC9043m<T> m29201f(InterfaceC9064e<? super T> interfaceC9064e) {
        InterfaceC9064e<? super Throwable> m29263b = C9074a.m29263b();
        InterfaceC9060a interfaceC9060a = C9074a.f34948c;
        return m29190d(interfaceC9064e, m29263b, interfaceC9060a, interfaceC9060a);
    }

    /* renamed from: j */
    public final <R> AbstractC9043m<R> m29202j(InterfaceC9065f<? super T, ? extends InterfaceC9046p<? extends R>> interfaceC9065f) {
        return m29203k(interfaceC9065f, false);
    }

    /* renamed from: k */
    public final <R> AbstractC9043m<R> m29203k(InterfaceC9065f<? super T, ? extends InterfaceC9046p<? extends R>> interfaceC9065f, boolean z) {
        return m29204l(interfaceC9065f, z, Integer.MAX_VALUE);
    }

    /* renamed from: l */
    public final <R> AbstractC9043m<R> m29204l(InterfaceC9065f<? super T, ? extends InterfaceC9046p<? extends R>> interfaceC9065f, boolean z, int i2) {
        return m29205m(interfaceC9065f, z, i2, m29188b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public final <R> AbstractC9043m<R> m29205m(InterfaceC9065f<? super T, ? extends InterfaceC9046p<? extends R>> interfaceC9065f, boolean z, int i2, int i3) {
        C9075b.m29271c(interfaceC9065f, "mapper is null");
        C9075b.m29272d(i2, "maxConcurrency");
        C9075b.m29272d(i3, "bufferSize");
        if (!(this instanceof InterfaceCallableC9079d)) {
            return C9030a.m29145m(new C9103f(this, interfaceC9065f, z, i2, i3));
        }
        Object call = ((InterfaceCallableC9079d) this).call();
        return call == null ? m29191g() : C9113p.m29309a(call, interfaceC9065f);
    }

    /* renamed from: n */
    public final AbstractC9031b m29206n(InterfaceC9065f<? super T, ? extends InterfaceC9036f> interfaceC9065f) {
        return m29207o(interfaceC9065f, false);
    }

    /* renamed from: o */
    public final AbstractC9031b m29207o(InterfaceC9065f<? super T, ? extends InterfaceC9036f> interfaceC9065f, boolean z) {
        C9075b.m29271c(interfaceC9065f, "mapper is null");
        return C9030a.m29142j(new C9105h(this, interfaceC9065f, z));
    }

    /* renamed from: p */
    public final <U> AbstractC9043m<U> m29208p(InterfaceC9065f<? super T, ? extends Iterable<? extends U>> interfaceC9065f) {
        C9075b.m29271c(interfaceC9065f, "mapper is null");
        return C9030a.m29145m(new C9107j(this, interfaceC9065f));
    }

    /* renamed from: q */
    public final <R> AbstractC9043m<R> m29209q(InterfaceC9065f<? super T, ? extends InterfaceC9042l<? extends R>> interfaceC9065f) {
        return m29210r(interfaceC9065f, false);
    }

    /* renamed from: r */
    public final <R> AbstractC9043m<R> m29210r(InterfaceC9065f<? super T, ? extends InterfaceC9042l<? extends R>> interfaceC9065f, boolean z) {
        C9075b.m29271c(interfaceC9065f, "mapper is null");
        return C9030a.m29145m(new C9106i(this, interfaceC9065f, z));
    }

    /* renamed from: u */
    public final AbstractC9043m<T> m29211u(AbstractC9048r abstractC9048r) {
        return m29212v(abstractC9048r, false, m29188b());
    }

    /* renamed from: v */
    public final AbstractC9043m<T> m29212v(AbstractC9048r abstractC9048r, boolean z, int i2) {
        C9075b.m29271c(abstractC9048r, "scheduler is null");
        C9075b.m29272d(i2, "bufferSize");
        return C9030a.m29145m(new C9111n(this, abstractC9048r, z, i2));
    }

    /* renamed from: w */
    public final AbstractC9043m<T> m29213w(InterfaceC9065f<? super Throwable, ? extends T> interfaceC9065f) {
        C9075b.m29271c(interfaceC9065f, "valueSupplier is null");
        return C9030a.m29145m(new C9112o(this, interfaceC9065f));
    }

    /* renamed from: x */
    protected abstract void mo29214x(InterfaceC9047q<? super T> interfaceC9047q);

    /* renamed from: y */
    public final AbstractC9043m<T> m29215y(AbstractC9048r abstractC9048r) {
        C9075b.m29271c(abstractC9048r, "scheduler is null");
        return C9030a.m29145m(new C9114q(this, abstractC9048r));
    }

    /* renamed from: z */
    public final AbstractC9038h<T> m29216z(EnumC9029a enumC9029a) {
        C9090b c9090b = new C9090b(this);
        int i2 = a.f34932a[enumC9029a.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? c9090b.m29174d() : C9030a.m29143k(new C9093e(c9090b)) : c9090b : c9090b.m29177g() : c9090b.m29176f();
    }
}
