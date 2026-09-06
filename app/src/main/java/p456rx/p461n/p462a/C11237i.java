package p456rx.p461n.p462a;

import java.util.concurrent.atomic.AtomicInteger;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.InterfaceC11198k;
import p456rx.p460m.InterfaceC11205b;
import p456rx.p469o.AbstractC11352b;
import p456rx.p470p.C11358f;

/* compiled from: OnSubscribeAutoConnect.java */
/* renamed from: rx.n.a.i */
/* loaded from: classes3.dex */
public final class C11237i<T> extends AtomicInteger implements C11186e.a<T> {

    /* renamed from: f */
    final AbstractC11352b<? extends T> f42324f;

    /* renamed from: g */
    final int f42325g;

    /* renamed from: h */
    final InterfaceC11205b<? super InterfaceC11198k> f42326h;

    public C11237i(AbstractC11352b<? extends T> abstractC11352b, int i2, InterfaceC11205b<? super InterfaceC11198k> interfaceC11205b) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("numberOfSubscribers > 0 required");
        }
        this.f42324f = abstractC11352b;
        this.f42325g = i2;
        this.f42326h = interfaceC11205b;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11197j<? super T> abstractC11197j) {
        this.f42324f.m40089c1(C11358f.m40561c(abstractC11197j));
        if (incrementAndGet() == this.f42325g) {
            this.f42324f.mo40336i1(this.f42326h);
        }
    }
}
