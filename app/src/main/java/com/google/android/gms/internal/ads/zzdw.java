package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzdw extends zzcf<Integer, Object> {

    /* renamed from: b */
    public Long f26002b;

    /* renamed from: c */
    public Boolean f26003c;

    /* renamed from: d */
    public Boolean f26004d;

    public zzdw() {
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    /* renamed from: a */
    protected final void mo18718a(String str) {
        HashMap m18717b = zzcf.m18717b(str);
        if (m18717b != null) {
            this.f26002b = (Long) m18717b.get(0);
            this.f26003c = (Boolean) m18717b.get(1);
            this.f26004d = (Boolean) m18717b.get(2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    /* renamed from: c */
    protected final HashMap<Integer, Object> mo18719c() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.f26002b);
        hashMap.put(1, this.f26003c);
        hashMap.put(2, this.f26004d);
        return hashMap;
    }

    public zzdw(String str) {
        mo18718a(str);
    }
}
