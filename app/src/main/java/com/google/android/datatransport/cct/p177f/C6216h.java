package com.google.android.datatransport.cct.p177f;

/* compiled from: AutoValue_LogResponse.java */
/* renamed from: com.google.android.datatransport.cct.f.h */
/* loaded from: classes2.dex */
final class C6216h extends AbstractC6222n {

    /* renamed from: a */
    private final long f16695a;

    C6216h(long j2) {
        this.f16695a = j2;
    }

    @Override // com.google.android.datatransport.cct.p177f.AbstractC6222n
    /* renamed from: c */
    public long mo13487c() {
        return this.f16695a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AbstractC6222n) && this.f16695a == ((AbstractC6222n) obj).mo13487c();
    }

    public int hashCode() {
        long j2 = this.f16695a;
        return 1000003 ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f16695a + "}";
    }
}
