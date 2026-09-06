package p456rx.p461n.p462a;

import java.util.concurrent.TimeUnit;
import p456rx.AbstractC11195h;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.exceptions.C11192a;
import p456rx.p460m.InterfaceC11204a;

/* compiled from: OnSubscribeTimerPeriodically.java */
/* renamed from: rx.n.a.g0 */
/* loaded from: classes3.dex */
public final class C11232g0 implements C11186e.a<Long> {

    /* renamed from: f */
    final long f42284f;

    /* renamed from: g */
    final long f42285g;

    /* renamed from: h */
    final TimeUnit f42286h;

    /* renamed from: i */
    final AbstractC11195h f42287i;

    /* compiled from: OnSubscribeTimerPeriodically.java */
    /* renamed from: rx.n.a.g0$a */
    class a implements InterfaceC11204a {

        /* renamed from: f */
        long f42288f;

        /* renamed from: g */
        final /* synthetic */ AbstractC11197j f42289g;

        /* renamed from: h */
        final /* synthetic */ AbstractC11195h.a f42290h;

        a(AbstractC11197j abstractC11197j, AbstractC11195h.a aVar) {
            this.f42289g = abstractC11197j;
            this.f42290h = aVar;
        }

        @Override // p456rx.p460m.InterfaceC11204a
        public void call() {
            try {
                AbstractC11197j abstractC11197j = this.f42289g;
                long j2 = this.f42288f;
                this.f42288f = 1 + j2;
                abstractC11197j.onNext(Long.valueOf(j2));
            } catch (Throwable th) {
                try {
                    this.f42290h.unsubscribe();
                } finally {
                    C11192a.m40141f(th, this.f42289g);
                }
            }
        }
    }

    public C11232g0(long j2, long j3, TimeUnit timeUnit, AbstractC11195h abstractC11195h) {
        this.f42284f = j2;
        this.f42285g = j3;
        this.f42286h = timeUnit;
        this.f42287i = abstractC11195h;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11197j<? super Long> abstractC11197j) {
        AbstractC11195h.a createWorker = this.f42287i.createWorker();
        abstractC11197j.add(createWorker);
        createWorker.mo40148e(new a(abstractC11197j, createWorker), this.f42284f, this.f42285g, this.f42286h);
    }
}
