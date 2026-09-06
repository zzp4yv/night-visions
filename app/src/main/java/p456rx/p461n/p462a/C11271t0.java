package p456rx.p461n.p462a;

import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.InterfaceC11194g;
import p456rx.exceptions.C11192a;
import p456rx.p460m.InterfaceC11208e;
import p456rx.p461n.p463b.C11285a;
import p456rx.p471q.C11361c;
import p456rx.p474t.C11380d;

/* compiled from: OperatorOnErrorResumeNextViaFunction.java */
/* renamed from: rx.n.a.t0 */
/* loaded from: classes3.dex */
public final class C11271t0<T> implements C11186e.b<T, T> {

    /* renamed from: f */
    final InterfaceC11208e<? super Throwable, ? extends C11186e<? extends T>> f42605f;

    /* compiled from: OperatorOnErrorResumeNextViaFunction.java */
    /* renamed from: rx.n.a.t0$a */
    static class a implements InterfaceC11208e<Throwable, C11186e<? extends T>> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC11208e f42606f;

        a(InterfaceC11208e interfaceC11208e) {
            this.f42606f = interfaceC11208e;
        }

        @Override // p456rx.p460m.InterfaceC11208e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C11186e<? extends T> call(Throwable th) {
            return C11186e.m40025S(this.f42606f.call(th));
        }
    }

    /* compiled from: OperatorOnErrorResumeNextViaFunction.java */
    /* renamed from: rx.n.a.t0$b */
    static class b implements InterfaceC11208e<Throwable, C11186e<? extends T>> {

        /* renamed from: f */
        final /* synthetic */ C11186e f42607f;

        b(C11186e c11186e) {
            this.f42607f = c11186e;
        }

        @Override // p456rx.p460m.InterfaceC11208e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C11186e<? extends T> call(Throwable th) {
            return this.f42607f;
        }
    }

    /* compiled from: OperatorOnErrorResumeNextViaFunction.java */
    /* renamed from: rx.n.a.t0$c */
    class c extends AbstractC11197j<T> {

        /* renamed from: f */
        private boolean f42608f;

        /* renamed from: g */
        long f42609g;

        /* renamed from: h */
        final /* synthetic */ AbstractC11197j f42610h;

        /* renamed from: i */
        final /* synthetic */ C11285a f42611i;

        /* renamed from: j */
        final /* synthetic */ C11380d f42612j;

        /* compiled from: OperatorOnErrorResumeNextViaFunction.java */
        /* renamed from: rx.n.a.t0$c$a */
        class a extends AbstractC11197j<T> {
            a() {
            }

            @Override // p456rx.InterfaceC11193f
            public void onCompleted() {
                c.this.f42610h.onCompleted();
            }

            @Override // p456rx.InterfaceC11193f
            public void onError(Throwable th) {
                c.this.f42610h.onError(th);
            }

            @Override // p456rx.InterfaceC11193f
            public void onNext(T t) {
                c.this.f42610h.onNext(t);
            }

            @Override // p456rx.AbstractC11197j
            public void setProducer(InterfaceC11194g interfaceC11194g) {
                c.this.f42611i.m40375c(interfaceC11194g);
            }
        }

        c(AbstractC11197j abstractC11197j, C11285a c11285a, C11380d c11380d) {
            this.f42610h = abstractC11197j;
            this.f42611i = c11285a;
            this.f42612j = c11380d;
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            if (this.f42608f) {
                return;
            }
            this.f42608f = true;
            this.f42610h.onCompleted();
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            if (this.f42608f) {
                C11192a.m40140e(th);
                C11361c.m40578j(th);
                return;
            }
            this.f42608f = true;
            try {
                unsubscribe();
                a aVar = new a();
                this.f42612j.m40673b(aVar);
                long j2 = this.f42609g;
                if (j2 != 0) {
                    this.f42611i.m40374b(j2);
                }
                C11271t0.this.f42605f.call(th).m40089c1(aVar);
            } catch (Throwable th2) {
                C11192a.m40141f(th2, this.f42610h);
            }
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(T t) {
            if (this.f42608f) {
                return;
            }
            this.f42609g++;
            this.f42610h.onNext(t);
        }

        @Override // p456rx.AbstractC11197j
        public void setProducer(InterfaceC11194g interfaceC11194g) {
            this.f42611i.m40375c(interfaceC11194g);
        }
    }

    public C11271t0(InterfaceC11208e<? super Throwable, ? extends C11186e<? extends T>> interfaceC11208e) {
        this.f42605f = interfaceC11208e;
    }

    /* renamed from: b */
    public static <T> C11271t0<T> m40326b(C11186e<? extends T> c11186e) {
        return new C11271t0<>(new b(c11186e));
    }

    /* renamed from: c */
    public static <T> C11271t0<T> m40327c(InterfaceC11208e<? super Throwable, ? extends T> interfaceC11208e) {
        return new C11271t0<>(new a(interfaceC11208e));
    }

    @Override // p456rx.p460m.InterfaceC11208e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC11197j<? super T> call(AbstractC11197j<? super T> abstractC11197j) {
        C11285a c11285a = new C11285a();
        C11380d c11380d = new C11380d();
        c cVar = new c(abstractC11197j, c11285a, c11380d);
        c11380d.m40673b(cVar);
        abstractC11197j.add(c11380d);
        abstractC11197j.setProducer(c11285a);
        return cVar;
    }
}
