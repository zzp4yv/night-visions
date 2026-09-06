package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.a4 */
/* loaded from: classes2.dex */
final class C6442a4 implements zzban<Void> {

    /* renamed from: a */
    private final /* synthetic */ zzbbh f18078a;

    C6442a4(zzauq zzauqVar, zzbbh zzbbhVar) {
        this.f18078a = zzbbhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    /* renamed from: a */
    public final void mo14742a(Throwable th) {
        List list;
        list = zzauq.f22528a;
        list.remove(this.f18078a);
    }

    @Override // com.google.android.gms.internal.ads.zzban
    /* renamed from: b */
    public final /* synthetic */ void mo14743b(Void r2) {
        List list;
        list = zzauq.f22528a;
        list.remove(this.f18078a);
    }
}
