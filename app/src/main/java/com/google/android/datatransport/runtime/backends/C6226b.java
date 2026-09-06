package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.AbstractC6231g;

/* compiled from: AutoValue_BackendResponse.java */
/* renamed from: com.google.android.datatransport.runtime.backends.b */
/* loaded from: classes2.dex */
final class C6226b extends AbstractC6231g {

    /* renamed from: a */
    private final AbstractC6231g.a f16763a;

    /* renamed from: b */
    private final long f16764b;

    C6226b(AbstractC6231g.a aVar, long j2) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f16763a = aVar;
        this.f16764b = j2;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC6231g
    /* renamed from: b */
    public long mo13514b() {
        return this.f16764b;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC6231g
    /* renamed from: c */
    public AbstractC6231g.a mo13515c() {
        return this.f16763a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6231g)) {
            return false;
        }
        AbstractC6231g abstractC6231g = (AbstractC6231g) obj;
        return this.f16763a.equals(abstractC6231g.mo13515c()) && this.f16764b == abstractC6231g.mo13514b();
    }

    public int hashCode() {
        int hashCode = (this.f16763a.hashCode() ^ 1000003) * 1000003;
        long j2 = this.f16764b;
        return hashCode ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f16763a + ", nextRequestWaitMillis=" + this.f16764b + "}";
    }
}
