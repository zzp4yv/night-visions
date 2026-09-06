package p456rx.p461n.p462a;

import p456rx.AbstractC11196i;
import p456rx.Single;
import p456rx.exceptions.C11192a;
import p456rx.p460m.InterfaceC11208e;

/* compiled from: SingleOperatorOnErrorResumeNext.java */
/* renamed from: rx.n.a.q1 */
/* loaded from: classes3.dex */
public final class C11263q1<T> implements Single.InterfaceC11181j<T> {

    /* renamed from: f */
    private final Single<? extends T> f42537f;

    /* renamed from: g */
    final InterfaceC11208e<Throwable, ? extends Single<? extends T>> f42538g;

    /* compiled from: SingleOperatorOnErrorResumeNext.java */
    /* renamed from: rx.n.a.q1$a */
    class a extends AbstractC11196i<T> {

        /* renamed from: g */
        final /* synthetic */ AbstractC11196i f42539g;

        a(AbstractC11196i abstractC11196i) {
            this.f42539g = abstractC11196i;
        }

        @Override // p456rx.AbstractC11196i
        /* renamed from: c */
        public void mo29130c(T t) {
            this.f42539g.mo29130c(t);
        }

        @Override // p456rx.AbstractC11196i
        public void onError(Throwable th) {
            try {
                C11263q1.this.f42538g.call(th).m39928t(this.f42539g);
            } catch (Throwable th2) {
                C11192a.m40143h(th2, this.f42539g);
            }
        }
    }

    private C11263q1(Single<? extends T> single, InterfaceC11208e<Throwable, ? extends Single<? extends T>> interfaceC11208e) {
        if (single == null) {
            throw new NullPointerException("originalSingle must not be null");
        }
        if (interfaceC11208e == null) {
            throw new NullPointerException("resumeFunctionInCaseOfError must not be null");
        }
        this.f42537f = single;
        this.f42538g = interfaceC11208e;
    }

    /* renamed from: b */
    public static <T> C11263q1<T> m40301b(Single<? extends T> single, InterfaceC11208e<Throwable, ? extends Single<? extends T>> interfaceC11208e) {
        return new C11263q1<>(single, interfaceC11208e);
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11196i<? super T> abstractC11196i) {
        a aVar = new a(abstractC11196i);
        abstractC11196i.m40149b(aVar);
        this.f42537f.m39928t(aVar);
    }
}
