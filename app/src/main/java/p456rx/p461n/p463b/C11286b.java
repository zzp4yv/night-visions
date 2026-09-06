package p456rx.p461n.p463b;

import java.util.concurrent.atomic.AtomicInteger;
import p456rx.AbstractC11197j;
import p456rx.InterfaceC11194g;
import p456rx.exceptions.C11192a;

/* compiled from: SingleDelayedProducer.java */
/* renamed from: rx.n.b.b */
/* loaded from: classes3.dex */
public final class C11286b<T> extends AtomicInteger implements InterfaceC11194g {

    /* renamed from: f */
    final AbstractC11197j<? super T> f42734f;

    /* renamed from: g */
    T f42735g;

    public C11286b(AbstractC11197j<? super T> abstractC11197j) {
        this.f42734f = abstractC11197j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static <T> void m40376a(AbstractC11197j<? super T> abstractC11197j, T t) {
        if (abstractC11197j.isUnsubscribed()) {
            return;
        }
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

    /* renamed from: b */
    public void m40377b(T t) {
        do {
            int i2 = get();
            if (i2 != 0) {
                if (i2 == 2 && compareAndSet(2, 3)) {
                    m40376a(this.f42734f, t);
                    return;
                }
                return;
            }
            this.f42735g = t;
        } while (!compareAndSet(0, 1));
    }

    @Override // p456rx.InterfaceC11194g
    public void request(long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (j2 == 0) {
            return;
        }
        do {
            int i2 = get();
            if (i2 != 0) {
                if (i2 == 1 && compareAndSet(1, 3)) {
                    m40376a(this.f42734f, this.f42735g);
                    return;
                }
                return;
            }
        } while (!compareAndSet(0, 2));
    }
}
