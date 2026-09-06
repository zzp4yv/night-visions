package com.google.firebase.installations.p198r;

import com.google.firebase.installations.p198r.AbstractC8369f;
import okhttp3.HttpUrl;

/* compiled from: AutoValue_TokenResult.java */
/* renamed from: com.google.firebase.installations.r.b */
/* loaded from: classes2.dex */
final class C8365b extends AbstractC8369f {

    /* renamed from: a */
    private final String f31855a;

    /* renamed from: b */
    private final long f31856b;

    /* renamed from: c */
    private final AbstractC8369f.b f31857c;

    /* compiled from: AutoValue_TokenResult.java */
    /* renamed from: com.google.firebase.installations.r.b$b */
    static final class b extends AbstractC8369f.a {

        /* renamed from: a */
        private String f31858a;

        /* renamed from: b */
        private Long f31859b;

        /* renamed from: c */
        private AbstractC8369f.b f31860c;

        b() {
        }

        @Override // com.google.firebase.installations.p198r.AbstractC8369f.a
        /* renamed from: a */
        public AbstractC8369f mo26354a() {
            Long l = this.f31859b;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (l == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C8365b(this.f31858a, this.f31859b.longValue(), this.f31860c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.p198r.AbstractC8369f.a
        /* renamed from: b */
        public AbstractC8369f.a mo26355b(AbstractC8369f.b bVar) {
            this.f31860c = bVar;
            return this;
        }

        @Override // com.google.firebase.installations.p198r.AbstractC8369f.a
        /* renamed from: c */
        public AbstractC8369f.a mo26356c(String str) {
            this.f31858a = str;
            return this;
        }

        @Override // com.google.firebase.installations.p198r.AbstractC8369f.a
        /* renamed from: d */
        public AbstractC8369f.a mo26357d(long j2) {
            this.f31859b = Long.valueOf(j2);
            return this;
        }
    }

    @Override // com.google.firebase.installations.p198r.AbstractC8369f
    /* renamed from: b */
    public AbstractC8369f.b mo26351b() {
        return this.f31857c;
    }

    @Override // com.google.firebase.installations.p198r.AbstractC8369f
    /* renamed from: c */
    public String mo26352c() {
        return this.f31855a;
    }

    @Override // com.google.firebase.installations.p198r.AbstractC8369f
    /* renamed from: d */
    public long mo26353d() {
        return this.f31856b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8369f)) {
            return false;
        }
        AbstractC8369f abstractC8369f = (AbstractC8369f) obj;
        String str = this.f31855a;
        if (str != null ? str.equals(abstractC8369f.mo26352c()) : abstractC8369f.mo26352c() == null) {
            if (this.f31856b == abstractC8369f.mo26353d()) {
                AbstractC8369f.b bVar = this.f31857c;
                if (bVar == null) {
                    if (abstractC8369f.mo26351b() == null) {
                        return true;
                    }
                } else if (bVar.equals(abstractC8369f.mo26351b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f31855a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j2 = this.f31856b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        AbstractC8369f.b bVar = this.f31857c;
        return i2 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f31855a + ", tokenExpirationTimestamp=" + this.f31856b + ", responseCode=" + this.f31857c + "}";
    }

    private C8365b(String str, long j2, AbstractC8369f.b bVar) {
        this.f31855a = str;
        this.f31856b = j2;
        this.f31857c = bVar;
    }
}
