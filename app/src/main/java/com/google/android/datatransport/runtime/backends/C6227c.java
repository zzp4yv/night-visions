package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import p241e.p254e.p256b.p257a.p258i.p262c0.InterfaceC8821a;

/* compiled from: AutoValue_CreationContext.java */
/* renamed from: com.google.android.datatransport.runtime.backends.c */
/* loaded from: classes2.dex */
final class C6227c extends AbstractC6232h {

    /* renamed from: a */
    private final Context f16765a;

    /* renamed from: b */
    private final InterfaceC8821a f16766b;

    /* renamed from: c */
    private final InterfaceC8821a f16767c;

    /* renamed from: d */
    private final String f16768d;

    C6227c(Context context, InterfaceC8821a interfaceC8821a, InterfaceC8821a interfaceC8821a2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f16765a = context;
        if (interfaceC8821a == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f16766b = interfaceC8821a;
        if (interfaceC8821a2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f16767c = interfaceC8821a2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f16768d = str;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC6232h
    /* renamed from: b */
    public Context mo13516b() {
        return this.f16765a;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC6232h
    /* renamed from: c */
    public String mo13517c() {
        return this.f16768d;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC6232h
    /* renamed from: d */
    public InterfaceC8821a mo13518d() {
        return this.f16767c;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC6232h
    /* renamed from: e */
    public InterfaceC8821a mo13519e() {
        return this.f16766b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6232h)) {
            return false;
        }
        AbstractC6232h abstractC6232h = (AbstractC6232h) obj;
        return this.f16765a.equals(abstractC6232h.mo13516b()) && this.f16766b.equals(abstractC6232h.mo13519e()) && this.f16767c.equals(abstractC6232h.mo13518d()) && this.f16768d.equals(abstractC6232h.mo13517c());
    }

    public int hashCode() {
        return ((((((this.f16765a.hashCode() ^ 1000003) * 1000003) ^ this.f16766b.hashCode()) * 1000003) ^ this.f16767c.hashCode()) * 1000003) ^ this.f16768d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f16765a + ", wallClock=" + this.f16766b + ", monotonicClock=" + this.f16767c + ", backendName=" + this.f16768d + "}";
    }
}
