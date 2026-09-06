package p456rx.p461n.p462a;

import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p470p.C11358f;

/* compiled from: OperatorDoOnSubscribe.java */
/* renamed from: rx.n.a.n0 */
/* loaded from: classes3.dex */
public class C11253n0<T> implements C11186e.b<T, T> {

    /* renamed from: f */
    private final InterfaceC11204a f42436f;

    public C11253n0(InterfaceC11204a interfaceC11204a) {
        this.f42436f = interfaceC11204a;
    }

    @Override // p456rx.p460m.InterfaceC11208e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC11197j<? super T> call(AbstractC11197j<? super T> abstractC11197j) {
        this.f42436f.call();
        return C11358f.m40561c(abstractC11197j);
    }
}
