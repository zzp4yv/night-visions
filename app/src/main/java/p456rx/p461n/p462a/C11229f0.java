package p456rx.p461n.p462a;

import java.util.concurrent.TimeUnit;
import p456rx.AbstractC11195h;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.exceptions.C11192a;
import p456rx.p460m.InterfaceC11204a;

/* compiled from: OnSubscribeTimerOnce.java */
/* renamed from: rx.n.a.f0 */
/* loaded from: classes3.dex */
public final class C11229f0 implements C11186e.a<Long> {

    /* renamed from: f */
    final long f42266f;

    /* renamed from: g */
    final TimeUnit f42267g;

    /* renamed from: h */
    final AbstractC11195h f42268h;

    /* compiled from: OnSubscribeTimerOnce.java */
    /* renamed from: rx.n.a.f0$a */
    class a implements InterfaceC11204a {

        /* renamed from: f */
        final /* synthetic */ AbstractC11197j f42269f;

        a(AbstractC11197j abstractC11197j) {
            this.f42269f = abstractC11197j;
        }

        @Override // p456rx.p460m.InterfaceC11204a
        public void call() {
            try {
                this.f42269f.onNext(0L);
                this.f42269f.onCompleted();
            } catch (Throwable th) {
                C11192a.m40141f(th, this.f42269f);
            }
        }
    }

    public C11229f0(long j2, TimeUnit timeUnit, AbstractC11195h abstractC11195h) {
        this.f42266f = j2;
        this.f42267g = timeUnit;
        this.f42268h = abstractC11195h;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11197j<? super Long> abstractC11197j) {
        AbstractC11195h.a createWorker = this.f42268h.createWorker();
        abstractC11197j.add(createWorker);
        createWorker.mo40147d(new a(abstractC11197j), this.f42266f, this.f42267g);
    }
}
