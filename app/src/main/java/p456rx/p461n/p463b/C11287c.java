package p456rx.p461n.p463b;

import java.util.concurrent.atomic.AtomicBoolean;
import p456rx.AbstractC11197j;
import p456rx.InterfaceC11194g;
import p456rx.exceptions.C11192a;

/* compiled from: SingleProducer.java */
/* renamed from: rx.n.b.c */
/* loaded from: classes3.dex */
public final class C11287c<T> extends AtomicBoolean implements InterfaceC11194g {

    /* renamed from: f */
    final AbstractC11197j<? super T> f42736f;

    /* renamed from: g */
    final T f42737g;

    public C11287c(AbstractC11197j<? super T> abstractC11197j, T t) {
        this.f42736f = abstractC11197j;
        this.f42737g = t;
    }

    @Override // p456rx.InterfaceC11194g
    public void request(long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (j2 != 0 && compareAndSet(false, true)) {
            AbstractC11197j<? super T> abstractC11197j = this.f42736f;
            if (abstractC11197j.isUnsubscribed()) {
                return;
            }
            T t = this.f42737g;
            try {
                abstractC11197j.onNext(t);
                if (abstractC11197j.isUnsubscribed()) {
                    return;
                }
                abstractC11197j.onCompleted();
            } catch (Throwable th) {
                C11192a.m40142g(th, abstractC11197j, t);
            }
        }
    }
}
