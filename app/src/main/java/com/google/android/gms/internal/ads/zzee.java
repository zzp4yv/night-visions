package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzee extends zzcf<Integer, Long> {

    /* renamed from: b */
    public Long f26027b;

    /* renamed from: c */
    public Long f26028c;

    /* renamed from: d */
    public Long f26029d;

    /* renamed from: e */
    public Long f26030e;

    /* renamed from: f */
    public Long f26031f;

    /* renamed from: g */
    public Long f26032g;

    /* renamed from: h */
    public Long f26033h;

    /* renamed from: i */
    public Long f26034i;

    /* renamed from: j */
    public Long f26035j;

    /* renamed from: k */
    public Long f26036k;

    /* renamed from: l */
    public Long f26037l;

    public zzee() {
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    /* renamed from: a */
    protected final void mo18718a(String str) {
        HashMap m18717b = zzcf.m18717b(str);
        if (m18717b != null) {
            this.f26027b = (Long) m18717b.get(0);
            this.f26028c = (Long) m18717b.get(1);
            this.f26029d = (Long) m18717b.get(2);
            this.f26030e = (Long) m18717b.get(3);
            this.f26031f = (Long) m18717b.get(4);
            this.f26032g = (Long) m18717b.get(5);
            this.f26033h = (Long) m18717b.get(6);
            this.f26034i = (Long) m18717b.get(7);
            this.f26035j = (Long) m18717b.get(8);
            this.f26036k = (Long) m18717b.get(9);
            this.f26037l = (Long) m18717b.get(10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    /* renamed from: c */
    protected final HashMap<Integer, Long> mo18719c() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f26027b);
        hashMap.put(1, this.f26028c);
        hashMap.put(2, this.f26029d);
        hashMap.put(3, this.f26030e);
        hashMap.put(4, this.f26031f);
        hashMap.put(5, this.f26032g);
        hashMap.put(6, this.f26033h);
        hashMap.put(7, this.f26034i);
        hashMap.put(8, this.f26035j);
        hashMap.put(9, this.f26036k);
        hashMap.put(10, this.f26037l);
        return hashMap;
    }

    public zzee(String str) {
        mo18718a(str);
    }
}
