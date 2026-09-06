package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.api.internal.j */
/* loaded from: classes2.dex */
final class C6341j extends AbstractC6367w {

    /* renamed from: b */
    private final /* synthetic */ ConnectionResult f17418b;

    /* renamed from: c */
    private final /* synthetic */ C6339i f17419c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6341j(C6339i c6339i, zabd zabdVar, ConnectionResult connectionResult) {
        super(zabdVar);
        this.f17419c = c6339i;
        this.f17418b = connectionResult;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC6367w
    /* renamed from: a */
    public final void mo14060a() {
        this.f17419c.f17417h.m14154x(this.f17418b);
    }
}
