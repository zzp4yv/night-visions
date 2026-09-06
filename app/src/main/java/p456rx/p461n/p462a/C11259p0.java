package p456rx.p461n.p462a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.InterfaceC11194g;
import p456rx.InterfaceC11198k;
import p456rx.exceptions.C11192a;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p460m.InterfaceC11208e;
import p456rx.p461n.p466e.p467n.C11321e;
import p456rx.p461n.p466e.p468o.C11343s;
import p456rx.p461n.p466e.p468o.C11350z;
import p456rx.p474t.C11381e;

/* compiled from: OperatorEagerConcatMap.java */
/* renamed from: rx.n.a.p0 */
/* loaded from: classes3.dex */
public final class C11259p0<T, R> implements C11186e.b<R, T> {

    /* renamed from: f */
    final InterfaceC11208e<? super T, ? extends C11186e<? extends R>> f42467f;

    /* renamed from: g */
    final int f42468g;

    /* renamed from: h */
    private final int f42469h;

    /* compiled from: OperatorEagerConcatMap.java */
    /* renamed from: rx.n.a.p0$a */
    static final class a<T> extends AbstractC11197j<T> {

        /* renamed from: f */
        final c<?, T> f42470f;

        /* renamed from: g */
        final Queue<Object> f42471g;

        /* renamed from: h */
        volatile boolean f42472h;

        /* renamed from: i */
        Throwable f42473i;

        public a(c<?, T> cVar, int i2) {
            this.f42470f = cVar;
            this.f42471g = C11350z.m40548b() ? new C11343s<>(i2) : new C11321e<>(i2);
            request(i2);
        }

        /* renamed from: c */
        void m40270c(long j2) {
            request(j2);
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            this.f42472h = true;
            this.f42470f.m40272d();
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            this.f42473i = th;
            this.f42472h = true;
            this.f42470f.m40272d();
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(T t) {
            this.f42471g.offer(C11234h.m40221g(t));
            this.f42470f.m40272d();
        }
    }

    /* compiled from: OperatorEagerConcatMap.java */
    /* renamed from: rx.n.a.p0$b */
    static final class b extends AtomicLong implements InterfaceC11194g {

        /* renamed from: f */
        final c<?, ?> f42474f;

        public b(c<?, ?> cVar) {
            this.f42474f = cVar;
        }

        @Override // p456rx.InterfaceC11194g
        public void request(long j2) {
            if (j2 < 0) {
                throw new IllegalStateException("n >= 0 required but it was " + j2);
            }
            if (j2 > 0) {
                C11213a.m40162b(this, j2);
                this.f42474f.m40272d();
            }
        }
    }

    /* compiled from: OperatorEagerConcatMap.java */
    /* renamed from: rx.n.a.p0$c */
    static final class c<T, R> extends AbstractC11197j<T> {

        /* renamed from: f */
        final InterfaceC11208e<? super T, ? extends C11186e<? extends R>> f42475f;

        /* renamed from: g */
        final int f42476g;

        /* renamed from: h */
        final AbstractC11197j<? super R> f42477h;

        /* renamed from: j */
        volatile boolean f42479j;

        /* renamed from: k */
        Throwable f42480k;

        /* renamed from: l */
        volatile boolean f42481l;

        /* renamed from: n */
        private b f42483n;

        /* renamed from: i */
        final Queue<a<R>> f42478i = new LinkedList();

        /* renamed from: m */
        final AtomicInteger f42482m = new AtomicInteger();

        /* compiled from: OperatorEagerConcatMap.java */
        /* renamed from: rx.n.a.p0$c$a */
        class a implements InterfaceC11204a {
            a() {
            }

            @Override // p456rx.p460m.InterfaceC11204a
            public void call() {
                c.this.f42481l = true;
                if (c.this.f42482m.getAndIncrement() == 0) {
                    c.this.m40271c();
                }
            }
        }

        public c(InterfaceC11208e<? super T, ? extends C11186e<? extends R>> interfaceC11208e, int i2, int i3, AbstractC11197j<? super R> abstractC11197j) {
            this.f42475f = interfaceC11208e;
            this.f42476g = i2;
            this.f42477h = abstractC11197j;
            request(i3 == Integer.MAX_VALUE ? Long.MAX_VALUE : i3);
        }

        /* renamed from: c */
        void m40271c() {
            ArrayList arrayList;
            synchronized (this.f42478i) {
                arrayList = new ArrayList(this.f42478i);
                this.f42478i.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC11198k) it.next()).unsubscribe();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x0087, code lost:
        
            if (r12 == 0) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0090, code lost:
        
            if (r8 == Long.MAX_VALUE) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0092, code lost:
        
            p456rx.p461n.p462a.C11213a.m40163c(r0, r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0095, code lost:
        
            if (r6 != false) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0097, code lost:
        
            r7.m40270c(r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x009a, code lost:
        
            if (r6 == false) goto L82;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x009c, code lost:
        
            r4 = r17;
         */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void m40272d() {
            /*
                Method dump skipped, instructions count: 198
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p456rx.p461n.p462a.C11259p0.c.m40272d():void");
        }

        /* renamed from: e */
        void m40273e() {
            this.f42483n = new b(this);
            add(C11381e.m40674a(new a()));
            this.f42477h.add(this);
            this.f42477h.setProducer(this.f42483n);
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            this.f42479j = true;
            m40272d();
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            this.f42480k = th;
            this.f42479j = true;
            m40272d();
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(T t) {
            try {
                C11186e<? extends R> call = this.f42475f.call(t);
                if (this.f42481l) {
                    return;
                }
                a<R> aVar = new a<>(this, this.f42476g);
                synchronized (this.f42478i) {
                    if (this.f42481l) {
                        return;
                    }
                    this.f42478i.add(aVar);
                    if (this.f42481l) {
                        return;
                    }
                    call.m40089c1(aVar);
                    m40272d();
                }
            } catch (Throwable th) {
                C11192a.m40142g(th, this.f42477h, t);
            }
        }
    }

    public C11259p0(InterfaceC11208e<? super T, ? extends C11186e<? extends R>> interfaceC11208e, int i2, int i3) {
        this.f42467f = interfaceC11208e;
        this.f42468g = i2;
        this.f42469h = i3;
    }

    @Override // p456rx.p460m.InterfaceC11208e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC11197j<? super T> call(AbstractC11197j<? super R> abstractC11197j) {
        c cVar = new c(this.f42467f, this.f42468g, this.f42469h, abstractC11197j);
        cVar.m40273e();
        return cVar;
    }
}
