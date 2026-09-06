package p456rx.p461n.p462a;

import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.exceptions.C11192a;
import p456rx.p460m.InterfaceCallableC11207d;
import p456rx.p470p.C11358f;

/* compiled from: OnSubscribeDefer.java */
/* renamed from: rx.n.a.l */
/* loaded from: classes3.dex */
public final class C11246l<T> implements C11186e.a<T> {

    /* renamed from: f */
    final InterfaceCallableC11207d<? extends C11186e<? extends T>> f42398f;

    public C11246l(InterfaceCallableC11207d<? extends C11186e<? extends T>> interfaceCallableC11207d) {
        this.f42398f = interfaceCallableC11207d;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11197j<? super T> abstractC11197j) {
        try {
            this.f42398f.call().m40089c1(C11358f.m40561c(abstractC11197j));
        } catch (Throwable th) {
            C11192a.m40141f(th, abstractC11197j);
        }
    }
}
