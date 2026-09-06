package com.google.android.gms.internal.firebase_messaging;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase_messaging.h */
/* loaded from: classes2.dex */
final class C7430h extends AbstractC7427e {

    /* renamed from: a */
    private final C7429g f27619a = new C7429g();

    C7430h() {
    }

    @Override // com.google.android.gms.internal.firebase_messaging.AbstractC7427e
    /* renamed from: a */
    public final void mo20935a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        this.f27619a.m20936a(th, true).add(th2);
    }
}
