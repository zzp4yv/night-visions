package com.flurry.sdk;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.flurry.sdk.l */
/* loaded from: classes2.dex */
public final class C6059l {

    /* renamed from: a */
    protected Map<EnumC6068m, String> f16101a;

    /* renamed from: b */
    public boolean f16102b;

    C6059l() {
        this.f16101a = new HashMap();
    }

    /* renamed from: a */
    public final Map<EnumC6068m, String> m13171a() {
        return this.f16101a;
    }

    /* renamed from: b */
    final void m13172b(EnumC6068m enumC6068m, String str) {
        this.f16101a.put(enumC6068m, str);
    }

    /* renamed from: c */
    final C6059l m13173c() {
        return new C6059l(Collections.unmodifiableMap(this.f16101a), this.f16102b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f16101a);
        sb.append(this.f16102b);
        return sb.toString();
    }

    private C6059l(Map<EnumC6068m, String> map, boolean z) {
        this.f16101a = map;
        this.f16102b = z;
    }
}
