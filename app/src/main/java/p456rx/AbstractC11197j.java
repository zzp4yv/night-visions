package p456rx;

import p456rx.p461n.p466e.C11315l;

/* compiled from: Subscriber.java */
/* renamed from: rx.j */
/* loaded from: classes3.dex */
public abstract class AbstractC11197j<T> implements InterfaceC11193f<T>, InterfaceC11198k {
    private static final long NOT_SET = Long.MIN_VALUE;
    private InterfaceC11194g producer;
    private long requested;
    private final AbstractC11197j<?> subscriber;
    private final C11315l subscriptions;

    protected AbstractC11197j() {
        this(null, false);
    }

    private void addToRequested(long j2) {
        long j3 = this.requested;
        if (j3 == NOT_SET) {
            this.requested = j2;
            return;
        }
        long j4 = j3 + j2;
        if (j4 < 0) {
            this.requested = Long.MAX_VALUE;
        } else {
            this.requested = j4;
        }
    }

    public final void add(InterfaceC11198k interfaceC11198k) {
        this.subscriptions.m40464a(interfaceC11198k);
    }

    @Override // p456rx.InterfaceC11198k
    public final boolean isUnsubscribed() {
        return this.subscriptions.isUnsubscribed();
    }

    public void onStart() {
    }

    protected final void request(long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException("number requested cannot be negative: " + j2);
        }
        synchronized (this) {
            InterfaceC11194g interfaceC11194g = this.producer;
            if (interfaceC11194g != null) {
                interfaceC11194g.request(j2);
            } else {
                addToRequested(j2);
            }
        }
    }

    public void setProducer(InterfaceC11194g interfaceC11194g) {
        long j2;
        AbstractC11197j<?> abstractC11197j;
        boolean z;
        synchronized (this) {
            j2 = this.requested;
            this.producer = interfaceC11194g;
            abstractC11197j = this.subscriber;
            z = abstractC11197j != null && j2 == NOT_SET;
        }
        if (z) {
            abstractC11197j.setProducer(interfaceC11194g);
        } else if (j2 == NOT_SET) {
            interfaceC11194g.request(Long.MAX_VALUE);
        } else {
            interfaceC11194g.request(j2);
        }
    }

    @Override // p456rx.InterfaceC11198k
    public final void unsubscribe() {
        this.subscriptions.unsubscribe();
    }

    protected AbstractC11197j(AbstractC11197j<?> abstractC11197j) {
        this(abstractC11197j, true);
    }

    protected AbstractC11197j(AbstractC11197j<?> abstractC11197j, boolean z) {
        this.requested = NOT_SET;
        this.subscriber = abstractC11197j;
        this.subscriptions = (!z || abstractC11197j == null) ? new C11315l() : abstractC11197j.subscriptions;
    }
}
