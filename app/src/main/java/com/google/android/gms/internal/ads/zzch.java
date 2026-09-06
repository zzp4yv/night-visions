package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzch extends zzcf<Integer, Object> {

    /* renamed from: b */
    public String f24301b;

    /* renamed from: c */
    public long f24302c;

    /* renamed from: d */
    public String f24303d;

    /* renamed from: e */
    public String f24304e;

    /* renamed from: f */
    public String f24305f;

    public zzch(String str) {
        this();
        mo18718a(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    /* renamed from: a */
    protected final void mo18718a(String str) {
        HashMap m18717b = zzcf.m18717b(str);
        if (m18717b != null) {
            this.f24301b = m18717b.get(0) == null ? "E" : (String) m18717b.get(0);
            this.f24302c = m18717b.get(1) == null ? -1L : ((Long) m18717b.get(1)).longValue();
            this.f24303d = m18717b.get(2) == null ? "E" : (String) m18717b.get(2);
            this.f24304e = m18717b.get(3) == null ? "E" : (String) m18717b.get(3);
            this.f24305f = m18717b.get(4) != null ? (String) m18717b.get(4) : "E";
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    /* renamed from: c */
    protected final HashMap<Integer, Object> mo18719c() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.f24301b);
        hashMap.put(4, this.f24305f);
        hashMap.put(3, this.f24304e);
        hashMap.put(2, this.f24303d);
        hashMap.put(1, Long.valueOf(this.f24302c));
        return hashMap;
    }

    public zzch() {
        this.f24301b = "E";
        this.f24302c = -1L;
        this.f24303d = "E";
        this.f24304e = "E";
        this.f24305f = "E";
    }
}
