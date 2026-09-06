package com.google.android.gms.internal.ads;

import okhttp3.HttpUrl;

/* renamed from: com.google.android.gms.internal.ads.i4 */
/* loaded from: classes2.dex */
final /* synthetic */ class C6738i4 implements InterfaceC7071r4 {

    /* renamed from: a */
    static final InterfaceC7071r4 f19290a = new C6738i4();

    private C6738i4() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7071r4
    /* renamed from: a */
    public final Object mo15334a(zzbjf zzbjfVar) {
        String mo16674J2 = zzbjfVar.mo16674J2();
        if (mo16674J2 != null) {
            return mo16674J2;
        }
        String mo16677O4 = zzbjfVar.mo16677O4();
        return mo16677O4 != null ? mo16677O4 : HttpUrl.FRAGMENT_ENCODE_SET;
    }
}
