package com.trello.rxlifecycle;

import p456rx.C11186e;
import p456rx.p460m.InterfaceC11208e;
import p456rx.p460m.InterfaceC11209f;

/* compiled from: TakeUntilGenerator.java */
/* renamed from: com.trello.rxlifecycle.d */
/* loaded from: classes2.dex */
final class C8725d {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: TakeUntilGenerator.java */
    /* renamed from: com.trello.rxlifecycle.d$a */
    static class a<T> implements InterfaceC11208e<T, Boolean> {

        /* renamed from: f */
        final /* synthetic */ Object f33254f;

        a(Object obj) {
            this.f33254f = obj;
        }

        @Override // p456rx.p460m.InterfaceC11208e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(T t) {
            return Boolean.valueOf(t.equals(this.f33254f));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: TakeUntilGenerator.java */
    /* renamed from: com.trello.rxlifecycle.d$b */
    static class b<T> implements InterfaceC11209f<T, T, Boolean> {
        b() {
        }

        @Override // p456rx.p460m.InterfaceC11209f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean mo6865a(T t, T t2) {
            return Boolean.valueOf(t2.equals(t));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    static <T> C11186e<Boolean> m27899a(C11186e<T> c11186e, InterfaceC11208e<T, T> interfaceC11208e) {
        return C11186e.m40041e(c11186e.m40073N0(1).m40082X(interfaceC11208e), c11186e.m40122y0(1), new b()).m40105p0(C8722a.f33251a).m40074O0(C8722a.f33252b);
    }

    /* renamed from: b */
    static <T> C11186e<T> m27900b(C11186e<T> c11186e, T t) {
        return c11186e.m40074O0(new a(t));
    }
}
