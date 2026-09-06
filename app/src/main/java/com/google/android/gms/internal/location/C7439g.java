package com.google.android.gms.internal.location;

import android.os.DeadObjectException;

/* renamed from: com.google.android.gms.internal.location.g */
/* loaded from: classes2.dex */
final class C7439g implements zzbj<zzao> {

    /* renamed from: a */
    private final /* synthetic */ zzk f27630a;

    C7439g(zzk zzkVar) {
        this.f27630a = zzkVar;
    }

    @Override // com.google.android.gms.internal.location.zzbj
    /* renamed from: a */
    public final void mo20946a() {
        this.f27630a.checkConnected();
    }

    @Override // com.google.android.gms.internal.location.zzbj
    /* renamed from: b */
    public final /* synthetic */ zzao mo20947b() throws DeadObjectException {
        return (zzao) this.f27630a.getService();
    }
}
