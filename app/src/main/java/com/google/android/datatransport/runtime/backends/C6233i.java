package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import javax.inject.Inject;
import p241e.p254e.p256b.p257a.p258i.p262c0.InterfaceC8821a;

/* compiled from: CreationContextFactory.java */
/* renamed from: com.google.android.datatransport.runtime.backends.i */
/* loaded from: classes2.dex */
class C6233i {

    /* renamed from: a */
    private final Context f16774a;

    /* renamed from: b */
    private final InterfaceC8821a f16775b;

    /* renamed from: c */
    private final InterfaceC8821a f16776c;

    @Inject
    C6233i(Context context, InterfaceC8821a interfaceC8821a, InterfaceC8821a interfaceC8821a2) {
        this.f16774a = context;
        this.f16775b = interfaceC8821a;
        this.f16776c = interfaceC8821a2;
    }

    /* renamed from: a */
    AbstractC6232h m13526a(String str) {
        return AbstractC6232h.m13525a(this.f16774a, this.f16775b, this.f16776c, str);
    }
}
