package p456rx.p461n.p466e;

import p456rx.p460m.InterfaceC11208e;

/* compiled from: UtilityFunctions.java */
/* renamed from: rx.n.e.m */
/* loaded from: classes3.dex */
public final class C11316m {

    /* compiled from: UtilityFunctions.java */
    /* renamed from: rx.n.e.m$a */
    enum a implements InterfaceC11208e<Object, Boolean> {
        INSTANCE;

        @Override // p456rx.p460m.InterfaceC11208e
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Boolean call(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: UtilityFunctions.java */
    /* renamed from: rx.n.e.m$b */
    enum b implements InterfaceC11208e<Object, Object> {
        INSTANCE;

        @Override // p456rx.p460m.InterfaceC11208e
        public Object call(Object obj) {
            return obj;
        }
    }

    /* renamed from: a */
    public static <T> InterfaceC11208e<? super T, Boolean> m40466a() {
        return a.INSTANCE;
    }

    /* renamed from: b */
    public static <T> InterfaceC11208e<T, T> m40467b() {
        return b.INSTANCE;
    }
}
