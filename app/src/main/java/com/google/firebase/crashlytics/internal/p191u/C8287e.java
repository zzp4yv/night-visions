package com.google.firebase.crashlytics.internal.p191u;

import java.util.Stack;

/* compiled from: TrimmedThrowableData.java */
/* renamed from: com.google.firebase.crashlytics.h.u.e */
/* loaded from: classes2.dex */
public class C8287e {

    /* renamed from: a */
    public final String f31636a;

    /* renamed from: b */
    public final String f31637b;

    /* renamed from: c */
    public final StackTraceElement[] f31638c;

    /* renamed from: d */
    public final C8287e f31639d;

    private C8287e(String str, String str2, StackTraceElement[] stackTraceElementArr, C8287e c8287e) {
        this.f31636a = str;
        this.f31637b = str2;
        this.f31638c = stackTraceElementArr;
        this.f31639d = c8287e;
    }

    /* renamed from: a */
    public static C8287e m26073a(Throwable th, InterfaceC8286d interfaceC8286d) {
        Stack stack = new Stack();
        while (th != null) {
            stack.push(th);
            th = th.getCause();
        }
        C8287e c8287e = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            c8287e = new C8287e(th2.getLocalizedMessage(), th2.getClass().getName(), interfaceC8286d.mo26070a(th2.getStackTrace()), c8287e);
        }
        return c8287e;
    }
}
