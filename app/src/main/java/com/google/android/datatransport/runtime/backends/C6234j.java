package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import javax.inject.Provider;
import p241e.p254e.p256b.p257a.p258i.p262c0.InterfaceC8821a;
import p241e.p254e.p256b.p257a.p258i.p264x.p265a.InterfaceC8849b;

/* compiled from: CreationContextFactory_Factory.java */
/* renamed from: com.google.android.datatransport.runtime.backends.j */
/* loaded from: classes2.dex */
public final class C6234j implements InterfaceC8849b<C6233i> {

    /* renamed from: a */
    private final Provider<Context> f16777a;

    /* renamed from: b */
    private final Provider<InterfaceC8821a> f16778b;

    /* renamed from: c */
    private final Provider<InterfaceC8821a> f16779c;

    public C6234j(Provider<Context> provider, Provider<InterfaceC8821a> provider2, Provider<InterfaceC8821a> provider3) {
        this.f16777a = provider;
        this.f16778b = provider2;
        this.f16779c = provider3;
    }

    /* renamed from: a */
    public static C6234j m13527a(Provider<Context> provider, Provider<InterfaceC8821a> provider2, Provider<InterfaceC8821a> provider3) {
        return new C6234j(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static C6233i m13528c(Context context, InterfaceC8821a interfaceC8821a, InterfaceC8821a interfaceC8821a2) {
        return new C6233i(context, interfaceC8821a, interfaceC8821a2);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6233i get() {
        return m13528c(this.f16777a.get(), this.f16778b.get(), this.f16779c.get());
    }
}
