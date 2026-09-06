package p456rx.p470p;

import p456rx.InterfaceC11184c;
import p456rx.InterfaceC11198k;
import p456rx.exceptions.C11192a;
import p456rx.exceptions.CompositeException;
import p456rx.exceptions.OnCompletedFailedException;
import p456rx.exceptions.OnErrorFailedException;
import p456rx.p471q.C11361c;

/* compiled from: SafeCompletableSubscriber.java */
/* renamed from: rx.p.b */
/* loaded from: classes3.dex */
public final class C11354b implements InterfaceC11184c, InterfaceC11198k {

    /* renamed from: f */
    final InterfaceC11184c f42987f;

    /* renamed from: g */
    InterfaceC11198k f42988g;

    /* renamed from: h */
    boolean f42989h;

    public C11354b(InterfaceC11184c interfaceC11184c) {
        this.f42987f = interfaceC11184c;
    }

    @Override // p456rx.InterfaceC11184c
    /* renamed from: a */
    public void mo29114a(InterfaceC11198k interfaceC11198k) {
        this.f42988g = interfaceC11198k;
        try {
            this.f42987f.mo29114a(this);
        } catch (Throwable th) {
            C11192a.m40140e(th);
            interfaceC11198k.unsubscribe();
            onError(th);
        }
    }

    @Override // p456rx.InterfaceC11198k
    public boolean isUnsubscribed() {
        return this.f42989h || this.f42988g.isUnsubscribed();
    }

    @Override // p456rx.InterfaceC11184c
    public void onCompleted() {
        if (this.f42989h) {
            return;
        }
        this.f42989h = true;
        try {
            this.f42987f.onCompleted();
        } catch (Throwable th) {
            C11192a.m40140e(th);
            throw new OnCompletedFailedException(th);
        }
    }

    @Override // p456rx.InterfaceC11184c
    public void onError(Throwable th) {
        if (this.f42989h) {
            C11361c.m40578j(th);
            return;
        }
        this.f42989h = true;
        try {
            this.f42987f.onError(th);
        } catch (Throwable th2) {
            C11192a.m40140e(th2);
            throw new OnErrorFailedException(new CompositeException(th, th2));
        }
    }

    @Override // p456rx.InterfaceC11198k
    public void unsubscribe() {
        this.f42988g.unsubscribe();
    }
}
