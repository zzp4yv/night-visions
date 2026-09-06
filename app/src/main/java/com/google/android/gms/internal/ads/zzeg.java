package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzeg extends zzcf<Integer, Long> {

    /* renamed from: b */
    public Long f26039b;

    /* renamed from: c */
    public Long f26040c;

    /* renamed from: d */
    public Long f26041d;

    /* renamed from: e */
    public Long f26042e;

    public zzeg() {
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    /* renamed from: a */
    protected final void mo18718a(String str) {
        HashMap m18717b = zzcf.m18717b(str);
        if (m18717b != null) {
            this.f26039b = (Long) m18717b.get(0);
            this.f26040c = (Long) m18717b.get(1);
            this.f26041d = (Long) m18717b.get(2);
            this.f26042e = (Long) m18717b.get(3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    /* renamed from: c */
    protected final HashMap<Integer, Long> mo18719c() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f26039b);
        hashMap.put(1, this.f26040c);
        hashMap.put(2, this.f26041d);
        hashMap.put(3, this.f26042e);
        return hashMap;
    }

    public zzeg(String str) {
        mo18718a(str);
    }
}
