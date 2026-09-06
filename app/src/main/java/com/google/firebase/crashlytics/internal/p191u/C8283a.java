package com.google.firebase.crashlytics.internal.p191u;

/* compiled from: MiddleOutFallbackStrategy.java */
/* renamed from: com.google.firebase.crashlytics.h.u.a */
/* loaded from: classes2.dex */
public class C8283a implements InterfaceC8286d {

    /* renamed from: a */
    private final int f31631a;

    /* renamed from: b */
    private final InterfaceC8286d[] f31632b;

    /* renamed from: c */
    private final C8284b f31633c;

    public C8283a(int i2, InterfaceC8286d... interfaceC8286dArr) {
        this.f31631a = i2;
        this.f31632b = interfaceC8286dArr;
        this.f31633c = new C8284b(i2);
    }

    @Override // com.google.firebase.crashlytics.internal.p191u.InterfaceC8286d
    /* renamed from: a */
    public StackTraceElement[] mo26070a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f31631a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (InterfaceC8286d interfaceC8286d : this.f31632b) {
            if (stackTraceElementArr2.length <= this.f31631a) {
                break;
            }
            stackTraceElementArr2 = interfaceC8286d.mo26070a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > this.f31631a ? this.f31633c.mo26070a(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
