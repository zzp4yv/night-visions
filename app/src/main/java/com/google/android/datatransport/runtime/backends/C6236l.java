package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import javax.inject.Provider;
import p241e.p254e.p256b.p257a.p258i.p264x.p265a.InterfaceC8849b;

/* compiled from: MetadataBackendRegistry_Factory.java */
/* renamed from: com.google.android.datatransport.runtime.backends.l */
/* loaded from: classes2.dex */
public final class C6236l implements InterfaceC8849b<C6235k> {

    /* renamed from: a */
    private final Provider<Context> f16785a;

    /* renamed from: b */
    private final Provider<C6233i> f16786b;

    public C6236l(Provider<Context> provider, Provider<C6233i> provider2) {
        this.f16785a = provider;
        this.f16786b = provider2;
    }

    /* renamed from: a */
    public static C6236l m13534a(Provider<Context> provider, Provider<C6233i> provider2) {
        return new C6236l(provider, provider2);
    }

    /* renamed from: c */
    public static C6235k m13535c(Context context, Object obj) {
        return new C6235k(context, (C6233i) obj);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6235k get() {
        return m13535c(this.f16785a.get(), this.f16786b.get());
    }
}
