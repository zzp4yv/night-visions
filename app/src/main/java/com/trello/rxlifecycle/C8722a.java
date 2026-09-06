package com.trello.rxlifecycle;

import java.util.concurrent.CancellationException;
import p456rx.C11186e;
import p456rx.exceptions.C11192a;
import p456rx.p460m.InterfaceC11208e;

/* compiled from: Functions.java */
/* renamed from: com.trello.rxlifecycle.a */
/* loaded from: classes2.dex */
final class C8722a {

    /* renamed from: a */
    static final InterfaceC11208e<Throwable, Boolean> f33251a = new a();

    /* renamed from: b */
    static final InterfaceC11208e<Boolean, Boolean> f33252b = new b();

    /* renamed from: c */
    static final InterfaceC11208e<Object, C11186e<Object>> f33253c = new c();

    /* compiled from: Functions.java */
    /* renamed from: com.trello.rxlifecycle.a$a */
    static class a implements InterfaceC11208e<Throwable, Boolean> {
        a() {
        }

        @Override // p456rx.p460m.InterfaceC11208e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Throwable th) {
            if (th instanceof OutsideLifecycleException) {
                return Boolean.TRUE;
            }
            C11192a.m40138c(th);
            return Boolean.FALSE;
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: com.trello.rxlifecycle.a$b */
    static class b implements InterfaceC11208e<Boolean, Boolean> {
        b() {
        }

        @Override // p456rx.p460m.InterfaceC11208e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Boolean bool) {
            return bool;
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: com.trello.rxlifecycle.a$c */
    static class c implements InterfaceC11208e<Object, C11186e<Object>> {
        c() {
        }

        @Override // p456rx.p460m.InterfaceC11208e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C11186e<Object> call(Object obj) {
            return C11186e.m40017C(new CancellationException());
        }
    }
}
