package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.g0 */
/* loaded from: classes2.dex */
final class C6660g0 implements zzaho<Object> {
    C6660g0() {
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    /* renamed from: a */
    public final void mo14739a(Object obj, Map<String, String> map) {
        String valueOf = String.valueOf(map.get("string"));
        zzbad.m17352h(valueOf.length() != 0 ? "Received log message: ".concat(valueOf) : new String("Received log message: "));
    }
}
