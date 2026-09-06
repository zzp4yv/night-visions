package p456rx.p461n.p462a;

import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.exceptions.C11192a;
import p456rx.p471q.C11361c;

/* compiled from: OnSubscribeLift.java */
/* renamed from: rx.n.a.v */
/* loaded from: classes3.dex */
public final class C11275v<T, R> implements C11186e.a<R> {

    /* renamed from: f */
    final C11186e.a<T> f42634f;

    /* renamed from: g */
    final C11186e.b<? extends R, ? super T> f42635g;

    public C11275v(C11186e.a<T> aVar, C11186e.b<? extends R, ? super T> bVar) {
        this.f42634f = aVar;
        this.f42635g = bVar;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11197j<? super R> abstractC11197j) {
        try {
            AbstractC11197j<? super T> call = C11361c.m40582n(this.f42635g).call(abstractC11197j);
            try {
                call.onStart();
                this.f42634f.call(call);
            } catch (Throwable th) {
                C11192a.m40140e(th);
                call.onError(th);
            }
        } catch (Throwable th2) {
            C11192a.m40140e(th2);
            abstractC11197j.onError(th2);
        }
    }
}
