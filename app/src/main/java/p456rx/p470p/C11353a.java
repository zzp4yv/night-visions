package p456rx.p470p;

import p456rx.InterfaceC11193f;
import p456rx.exceptions.OnErrorNotImplementedException;

/* compiled from: Observers.java */
/* renamed from: rx.p.a */
/* loaded from: classes3.dex */
public final class C11353a {

    /* renamed from: a */
    private static final InterfaceC11193f<Object> f42986a = new a();

    /* compiled from: Observers.java */
    /* renamed from: rx.p.a$a */
    static class a implements InterfaceC11193f<Object> {
        a() {
        }

        @Override // p456rx.InterfaceC11193f
        public final void onCompleted() {
        }

        @Override // p456rx.InterfaceC11193f
        public final void onError(Throwable th) {
            throw new OnErrorNotImplementedException(th);
        }

        @Override // p456rx.InterfaceC11193f
        public final void onNext(Object obj) {
        }
    }

    /* renamed from: a */
    public static <T> InterfaceC11193f<T> m40556a() {
        return (InterfaceC11193f<T>) f42986a;
    }
}
