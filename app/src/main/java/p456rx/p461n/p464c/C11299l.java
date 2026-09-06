package p456rx.p461n.p464c;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p456rx.AbstractC11195h;
import p456rx.C11183b;
import p456rx.C11186e;
import p456rx.InterfaceC11184c;
import p456rx.InterfaceC11193f;
import p456rx.InterfaceC11198k;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p460m.InterfaceC11208e;
import p456rx.p461n.p462a.C11216b;
import p456rx.p470p.C11356d;
import p456rx.p473s.C11370b;
import p456rx.p474t.C11381e;

/* compiled from: SchedulerWhen.java */
/* renamed from: rx.n.c.l */
/* loaded from: classes3.dex */
public class C11299l extends AbstractC11195h implements InterfaceC11198k {

    /* renamed from: f */
    static final InterfaceC11198k f42826f = new c();

    /* renamed from: g */
    static final InterfaceC11198k f42827g = C11381e.m40676c();

    /* renamed from: h */
    private final AbstractC11195h f42828h;

    /* renamed from: i */
    private final InterfaceC11193f<C11186e<C11183b>> f42829i;

    /* renamed from: j */
    private final InterfaceC11198k f42830j;

    /* compiled from: SchedulerWhen.java */
    /* renamed from: rx.n.c.l$a */
    class a implements InterfaceC11208e<g, C11183b> {

        /* renamed from: f */
        final /* synthetic */ AbstractC11195h.a f42831f;

        /* compiled from: SchedulerWhen.java */
        /* renamed from: rx.n.c.l$a$a, reason: collision with other inner class name */
        class C11563a implements C11183b.w {

            /* renamed from: f */
            final /* synthetic */ g f42833f;

            C11563a(g gVar) {
                this.f42833f = gVar;
            }

            @Override // p456rx.p460m.InterfaceC11205b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void call(InterfaceC11184c interfaceC11184c) {
                interfaceC11184c.mo29114a(this.f42833f);
                this.f42833f.m40410b(a.this.f42831f, interfaceC11184c);
            }
        }

        a(AbstractC11195h.a aVar) {
            this.f42831f = aVar;
        }

        @Override // p456rx.p460m.InterfaceC11208e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C11183b call(g gVar) {
            return C11183b.m39948h(new C11563a(gVar));
        }
    }

    /* compiled from: SchedulerWhen.java */
    /* renamed from: rx.n.c.l$b */
    class b extends AbstractC11195h.a {

        /* renamed from: f */
        private final AtomicBoolean f42835f = new AtomicBoolean();

        /* renamed from: g */
        final /* synthetic */ AbstractC11195h.a f42836g;

        /* renamed from: h */
        final /* synthetic */ InterfaceC11193f f42837h;

        b(AbstractC11195h.a aVar, InterfaceC11193f interfaceC11193f) {
            this.f42836g = aVar;
            this.f42837h = interfaceC11193f;
        }

        @Override // p456rx.AbstractC11195h.a
        /* renamed from: c */
        public InterfaceC11198k mo40146c(InterfaceC11204a interfaceC11204a) {
            e eVar = new e(interfaceC11204a);
            this.f42837h.onNext(eVar);
            return eVar;
        }

        @Override // p456rx.AbstractC11195h.a
        /* renamed from: d */
        public InterfaceC11198k mo40147d(InterfaceC11204a interfaceC11204a, long j2, TimeUnit timeUnit) {
            d dVar = new d(interfaceC11204a, j2, timeUnit);
            this.f42837h.onNext(dVar);
            return dVar;
        }

        @Override // p456rx.InterfaceC11198k
        public boolean isUnsubscribed() {
            return this.f42835f.get();
        }

        @Override // p456rx.InterfaceC11198k
        public void unsubscribe() {
            if (this.f42835f.compareAndSet(false, true)) {
                this.f42836g.unsubscribe();
                this.f42837h.onCompleted();
            }
        }
    }

    /* compiled from: SchedulerWhen.java */
    /* renamed from: rx.n.c.l$c */
    static class c implements InterfaceC11198k {
        c() {
        }

        @Override // p456rx.InterfaceC11198k
        public boolean isUnsubscribed() {
            return false;
        }

        @Override // p456rx.InterfaceC11198k
        public void unsubscribe() {
        }
    }

    /* compiled from: SchedulerWhen.java */
    /* renamed from: rx.n.c.l$d */
    static class d extends g {

        /* renamed from: f */
        private final InterfaceC11204a f42839f;

        /* renamed from: g */
        private final long f42840g;

        /* renamed from: h */
        private final TimeUnit f42841h;

        public d(InterfaceC11204a interfaceC11204a, long j2, TimeUnit timeUnit) {
            this.f42839f = interfaceC11204a;
            this.f42840g = j2;
            this.f42841h = timeUnit;
        }

        @Override // p456rx.p461n.p464c.C11299l.g
        /* renamed from: c */
        protected InterfaceC11198k mo40408c(AbstractC11195h.a aVar, InterfaceC11184c interfaceC11184c) {
            return aVar.mo40147d(new f(this.f42839f, interfaceC11184c), this.f42840g, this.f42841h);
        }
    }

    /* compiled from: SchedulerWhen.java */
    /* renamed from: rx.n.c.l$e */
    static class e extends g {

        /* renamed from: f */
        private final InterfaceC11204a f42842f;

        public e(InterfaceC11204a interfaceC11204a) {
            this.f42842f = interfaceC11204a;
        }

        @Override // p456rx.p461n.p464c.C11299l.g
        /* renamed from: c */
        protected InterfaceC11198k mo40408c(AbstractC11195h.a aVar, InterfaceC11184c interfaceC11184c) {
            return aVar.mo40146c(new f(this.f42842f, interfaceC11184c));
        }
    }

    /* compiled from: SchedulerWhen.java */
    /* renamed from: rx.n.c.l$f */
    static class f implements InterfaceC11204a {

        /* renamed from: f */
        private InterfaceC11184c f42843f;

        /* renamed from: g */
        private InterfaceC11204a f42844g;

        public f(InterfaceC11204a interfaceC11204a, InterfaceC11184c interfaceC11184c) {
            this.f42844g = interfaceC11204a;
            this.f42843f = interfaceC11184c;
        }

        @Override // p456rx.p460m.InterfaceC11204a
        public void call() {
            try {
                this.f42844g.call();
            } finally {
                this.f42843f.onCompleted();
            }
        }
    }

    /* compiled from: SchedulerWhen.java */
    /* renamed from: rx.n.c.l$g */
    static abstract class g extends AtomicReference<InterfaceC11198k> implements InterfaceC11198k {
        public g() {
            super(C11299l.f42826f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public void m40410b(AbstractC11195h.a aVar, InterfaceC11184c interfaceC11184c) {
            InterfaceC11198k interfaceC11198k;
            InterfaceC11198k interfaceC11198k2 = get();
            if (interfaceC11198k2 != C11299l.f42827g && interfaceC11198k2 == (interfaceC11198k = C11299l.f42826f)) {
                InterfaceC11198k mo40408c = mo40408c(aVar, interfaceC11184c);
                if (compareAndSet(interfaceC11198k, mo40408c)) {
                    return;
                }
                mo40408c.unsubscribe();
            }
        }

        /* renamed from: c */
        protected abstract InterfaceC11198k mo40408c(AbstractC11195h.a aVar, InterfaceC11184c interfaceC11184c);

        @Override // p456rx.InterfaceC11198k
        public boolean isUnsubscribed() {
            return get().isUnsubscribed();
        }

        @Override // p456rx.InterfaceC11198k
        public void unsubscribe() {
            InterfaceC11198k interfaceC11198k;
            InterfaceC11198k interfaceC11198k2 = C11299l.f42827g;
            do {
                interfaceC11198k = get();
                if (interfaceC11198k == C11299l.f42827g) {
                    return;
                }
            } while (!compareAndSet(interfaceC11198k, interfaceC11198k2));
            if (interfaceC11198k != C11299l.f42826f) {
                interfaceC11198k.unsubscribe();
            }
        }
    }

    public C11299l(InterfaceC11208e<C11186e<C11186e<C11183b>>, C11183b> interfaceC11208e, AbstractC11195h abstractC11195h) {
        this.f42828h = abstractC11195h;
        C11370b m40637g1 = C11370b.m40637g1();
        this.f42829i = new C11356d(m40637g1);
        this.f42830j = interfaceC11208e.call(m40637g1.m40100m0()).m39964H();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p456rx.AbstractC11195h
    public AbstractC11195h.a createWorker() {
        AbstractC11195h.a createWorker = this.f42828h.createWorker();
        C11216b m40182g1 = C11216b.m40182g1();
        C11356d c11356d = new C11356d(m40182g1);
        Object m40082X = m40182g1.m40082X(new a(createWorker));
        b bVar = new b(createWorker, c11356d);
        this.f42829i.onNext(m40082X);
        return bVar;
    }

    @Override // p456rx.InterfaceC11198k
    public boolean isUnsubscribed() {
        return this.f42830j.isUnsubscribed();
    }

    @Override // p456rx.InterfaceC11198k
    public void unsubscribe() {
        this.f42830j.unsubscribe();
    }
}
