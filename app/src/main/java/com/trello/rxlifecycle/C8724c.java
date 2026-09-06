package com.trello.rxlifecycle;

import com.trello.rxlifecycle.p237i.C8735a;
import p456rx.C11186e;
import p456rx.p460m.InterfaceC11208e;

/* compiled from: RxLifecycle.java */
/* renamed from: com.trello.rxlifecycle.c */
/* loaded from: classes.dex */
public class C8724c {
    /* renamed from: a */
    public static <T, R> InterfaceC8723b<T> m27897a(C11186e<R> c11186e, InterfaceC11208e<R, R> interfaceC11208e) {
        C8735a.m27909a(c11186e, "lifecycle == null");
        C8735a.m27909a(interfaceC11208e, "correspondingEvents == null");
        return new C8726e(c11186e.m40118w0(), interfaceC11208e);
    }

    /* renamed from: b */
    public static <T, R> InterfaceC8723b<T> m27898b(C11186e<R> c11186e, R r) {
        C8735a.m27909a(c11186e, "lifecycle == null");
        C8735a.m27909a(r, "event == null");
        return new C8727f(c11186e, r);
    }
}
