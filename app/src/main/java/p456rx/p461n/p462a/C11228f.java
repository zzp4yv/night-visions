package p456rx.p461n.p462a;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import p456rx.C11183b;
import p456rx.InterfaceC11184c;
import p456rx.InterfaceC11198k;
import p456rx.p474t.C11378b;

/* compiled from: CompletableOnSubscribeMergeDelayErrorArray.java */
/* renamed from: rx.n.a.f */
/* loaded from: classes3.dex */
public final class C11228f implements C11183b.w {

    /* renamed from: f */
    final C11183b[] f42260f;

    /* compiled from: CompletableOnSubscribeMergeDelayErrorArray.java */
    /* renamed from: rx.n.a.f$a */
    class a implements InterfaceC11184c {

        /* renamed from: f */
        final /* synthetic */ C11378b f42261f;

        /* renamed from: g */
        final /* synthetic */ Queue f42262g;

        /* renamed from: h */
        final /* synthetic */ AtomicInteger f42263h;

        /* renamed from: i */
        final /* synthetic */ InterfaceC11184c f42264i;

        a(C11378b c11378b, Queue queue, AtomicInteger atomicInteger, InterfaceC11184c interfaceC11184c) {
            this.f42261f = c11378b;
            this.f42262g = queue;
            this.f42263h = atomicInteger;
            this.f42264i = interfaceC11184c;
        }

        @Override // p456rx.InterfaceC11184c
        /* renamed from: a */
        public void mo29114a(InterfaceC11198k interfaceC11198k) {
            this.f42261f.m40667a(interfaceC11198k);
        }

        /* renamed from: b */
        void m40204b() {
            if (this.f42263h.decrementAndGet() == 0) {
                if (this.f42262g.isEmpty()) {
                    this.f42264i.onCompleted();
                } else {
                    this.f42264i.onError(C11225e.m40197a(this.f42262g));
                }
            }
        }

        @Override // p456rx.InterfaceC11184c
        public void onCompleted() {
            m40204b();
        }

        @Override // p456rx.InterfaceC11184c
        public void onError(Throwable th) {
            this.f42262g.offer(th);
            m40204b();
        }
    }

    public C11228f(C11183b[] c11183bArr) {
        this.f42260f = c11183bArr;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(InterfaceC11184c interfaceC11184c) {
        C11378b c11378b = new C11378b();
        AtomicInteger atomicInteger = new AtomicInteger(this.f42260f.length + 1);
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        interfaceC11184c.mo29114a(c11378b);
        for (C11183b c11183b : this.f42260f) {
            if (c11378b.isUnsubscribed()) {
                return;
            }
            if (c11183b == null) {
                concurrentLinkedQueue.offer(new NullPointerException("A completable source is null"));
                atomicInteger.decrementAndGet();
            } else {
                c11183b.m39971P(new a(c11378b, concurrentLinkedQueue, atomicInteger, interfaceC11184c));
            }
        }
        if (atomicInteger.decrementAndGet() == 0) {
            if (concurrentLinkedQueue.isEmpty()) {
                interfaceC11184c.onCompleted();
            } else {
                interfaceC11184c.onError(C11225e.m40197a(concurrentLinkedQueue));
            }
        }
    }
}
