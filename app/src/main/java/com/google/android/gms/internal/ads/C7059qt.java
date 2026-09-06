package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* renamed from: com.google.android.gms.internal.ads.qt */
/* loaded from: classes2.dex */
final class C7059qt extends ThreadLocal<SecureRandom> {
    C7059qt() {
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ SecureRandom initialValue() {
        SecureRandom m19573a;
        m19573a = zzdlo.m19573a();
        return m19573a;
    }
}
