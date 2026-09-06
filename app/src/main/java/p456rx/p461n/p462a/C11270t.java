package p456rx.p461n.p462a;

import java.util.concurrent.Callable;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.exceptions.C11192a;
import p456rx.p461n.p463b.C11286b;

/* compiled from: OnSubscribeFromCallable.java */
/* renamed from: rx.n.a.t */
/* loaded from: classes3.dex */
public final class C11270t<T> implements C11186e.a<T> {

    /* renamed from: f */
    private final Callable<? extends T> f42604f;

    public C11270t(Callable<? extends T> callable) {
        this.f42604f = callable;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11197j<? super T> abstractC11197j) {
        C11286b c11286b = new C11286b(abstractC11197j);
        abstractC11197j.setProducer(c11286b);
        try {
            c11286b.m40377b(this.f42604f.call());
        } catch (Throwable th) {
            C11192a.m40141f(th, abstractC11197j);
        }
    }
}
