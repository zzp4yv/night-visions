package com.google.firebase;

/* compiled from: AutoValue_StartupTime.java */
/* renamed from: com.google.firebase.g */
/* loaded from: classes2.dex */
final class C8316g extends AbstractC8440n {

    /* renamed from: a */
    private final long f31700a;

    /* renamed from: b */
    private final long f31701b;

    /* renamed from: c */
    private final long f31702c;

    C8316g(long j2, long j3, long j4) {
        this.f31700a = j2;
        this.f31701b = j3;
        this.f31702c = j4;
    }

    @Override // com.google.firebase.AbstractC8440n
    /* renamed from: b */
    public long mo26158b() {
        return this.f31701b;
    }

    @Override // com.google.firebase.AbstractC8440n
    /* renamed from: c */
    public long mo26159c() {
        return this.f31700a;
    }

    @Override // com.google.firebase.AbstractC8440n
    /* renamed from: d */
    public long mo26160d() {
        return this.f31702c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8440n)) {
            return false;
        }
        AbstractC8440n abstractC8440n = (AbstractC8440n) obj;
        return this.f31700a == abstractC8440n.mo26159c() && this.f31701b == abstractC8440n.mo26158b() && this.f31702c == abstractC8440n.mo26160d();
    }

    public int hashCode() {
        long j2 = this.f31700a;
        long j3 = this.f31701b;
        int i2 = (((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        long j4 = this.f31702c;
        return ((int) (j4 ^ (j4 >>> 32))) ^ i2;
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f31700a + ", elapsedRealtime=" + this.f31701b + ", uptimeMillis=" + this.f31702c + "}";
    }
}
