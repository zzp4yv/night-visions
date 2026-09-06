package p456rx.p461n.p462a;

import p456rx.AbstractC11197j;
import p456rx.C11186e;

/* compiled from: EmptyObservableHolder.java */
/* renamed from: rx.n.a.g */
/* loaded from: classes3.dex */
public enum EnumC11231g implements C11186e.a<Object> {
    INSTANCE;


    /* renamed from: g */
    static final C11186e<Object> f42282g = C11186e.m40035b1(INSTANCE);

    /* renamed from: k */
    public static <T> C11186e<T> m40207k() {
        return (C11186e<T>) f42282g;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11197j<? super Object> abstractC11197j) {
        abstractC11197j.onCompleted();
    }
}
