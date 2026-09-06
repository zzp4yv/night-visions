package com.google.android.datatransport.cct.p177f;

import com.google.android.datatransport.cct.p177f.AbstractC6221m;
import java.util.List;
import okhttp3.HttpUrl;

/* compiled from: AutoValue_LogRequest.java */
/* renamed from: com.google.android.datatransport.cct.f.g */
/* loaded from: classes2.dex */
final class C6215g extends AbstractC6221m {

    /* renamed from: a */
    private final long f16681a;

    /* renamed from: b */
    private final long f16682b;

    /* renamed from: c */
    private final AbstractC6219k f16683c;

    /* renamed from: d */
    private final Integer f16684d;

    /* renamed from: e */
    private final String f16685e;

    /* renamed from: f */
    private final List<AbstractC6220l> f16686f;

    /* renamed from: g */
    private final EnumC6224p f16687g;

    /* compiled from: AutoValue_LogRequest.java */
    /* renamed from: com.google.android.datatransport.cct.f.g$b */
    static final class b extends AbstractC6221m.a {

        /* renamed from: a */
        private Long f16688a;

        /* renamed from: b */
        private Long f16689b;

        /* renamed from: c */
        private AbstractC6219k f16690c;

        /* renamed from: d */
        private Integer f16691d;

        /* renamed from: e */
        private String f16692e;

        /* renamed from: f */
        private List<AbstractC6220l> f16693f;

        /* renamed from: g */
        private EnumC6224p f16694g;

        b() {
        }

        @Override // com.google.android.datatransport.cct.p177f.AbstractC6221m.a
        /* renamed from: a */
        public AbstractC6221m mo13479a() {
            Long l = this.f16688a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (l == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET + " requestTimeMs";
            }
            if (this.f16689b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new C6215g(this.f16688a.longValue(), this.f16689b.longValue(), this.f16690c, this.f16691d, this.f16692e, this.f16693f, this.f16694g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.cct.p177f.AbstractC6221m.a
        /* renamed from: b */
        public AbstractC6221m.a mo13480b(AbstractC6219k abstractC6219k) {
            this.f16690c = abstractC6219k;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p177f.AbstractC6221m.a
        /* renamed from: c */
        public AbstractC6221m.a mo13481c(List<AbstractC6220l> list) {
            this.f16693f = list;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p177f.AbstractC6221m.a
        /* renamed from: d */
        AbstractC6221m.a mo13482d(Integer num) {
            this.f16691d = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p177f.AbstractC6221m.a
        /* renamed from: e */
        AbstractC6221m.a mo13483e(String str) {
            this.f16692e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p177f.AbstractC6221m.a
        /* renamed from: f */
        public AbstractC6221m.a mo13484f(EnumC6224p enumC6224p) {
            this.f16694g = enumC6224p;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p177f.AbstractC6221m.a
        /* renamed from: g */
        public AbstractC6221m.a mo13485g(long j2) {
            this.f16688a = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.android.datatransport.cct.p177f.AbstractC6221m.a
        /* renamed from: h */
        public AbstractC6221m.a mo13486h(long j2) {
            this.f16689b = Long.valueOf(j2);
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.p177f.AbstractC6221m
    /* renamed from: b */
    public AbstractC6219k mo13472b() {
        return this.f16683c;
    }

    @Override // com.google.android.datatransport.cct.p177f.AbstractC6221m
    /* renamed from: c */
    public List<AbstractC6220l> mo13473c() {
        return this.f16686f;
    }

    @Override // com.google.android.datatransport.cct.p177f.AbstractC6221m
    /* renamed from: d */
    public Integer mo13474d() {
        return this.f16684d;
    }

    @Override // com.google.android.datatransport.cct.p177f.AbstractC6221m
    /* renamed from: e */
    public String mo13475e() {
        return this.f16685e;
    }

    public boolean equals(Object obj) {
        AbstractC6219k abstractC6219k;
        Integer num;
        String str;
        List<AbstractC6220l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6221m)) {
            return false;
        }
        AbstractC6221m abstractC6221m = (AbstractC6221m) obj;
        if (this.f16681a == abstractC6221m.mo13477g() && this.f16682b == abstractC6221m.mo13478h() && ((abstractC6219k = this.f16683c) != null ? abstractC6219k.equals(abstractC6221m.mo13472b()) : abstractC6221m.mo13472b() == null) && ((num = this.f16684d) != null ? num.equals(abstractC6221m.mo13474d()) : abstractC6221m.mo13474d() == null) && ((str = this.f16685e) != null ? str.equals(abstractC6221m.mo13475e()) : abstractC6221m.mo13475e() == null) && ((list = this.f16686f) != null ? list.equals(abstractC6221m.mo13473c()) : abstractC6221m.mo13473c() == null)) {
            EnumC6224p enumC6224p = this.f16687g;
            if (enumC6224p == null) {
                if (abstractC6221m.mo13476f() == null) {
                    return true;
                }
            } else if (enumC6224p.equals(abstractC6221m.mo13476f())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.p177f.AbstractC6221m
    /* renamed from: f */
    public EnumC6224p mo13476f() {
        return this.f16687g;
    }

    @Override // com.google.android.datatransport.cct.p177f.AbstractC6221m
    /* renamed from: g */
    public long mo13477g() {
        return this.f16681a;
    }

    @Override // com.google.android.datatransport.cct.p177f.AbstractC6221m
    /* renamed from: h */
    public long mo13478h() {
        return this.f16682b;
    }

    public int hashCode() {
        long j2 = this.f16681a;
        long j3 = this.f16682b;
        int i2 = (((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        AbstractC6219k abstractC6219k = this.f16683c;
        int hashCode = (i2 ^ (abstractC6219k == null ? 0 : abstractC6219k.hashCode())) * 1000003;
        Integer num = this.f16684d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f16685e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<AbstractC6220l> list = this.f16686f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        EnumC6224p enumC6224p = this.f16687g;
        return hashCode4 ^ (enumC6224p != null ? enumC6224p.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f16681a + ", requestUptimeMs=" + this.f16682b + ", clientInfo=" + this.f16683c + ", logSource=" + this.f16684d + ", logSourceName=" + this.f16685e + ", logEvents=" + this.f16686f + ", qosTier=" + this.f16687g + "}";
    }

    private C6215g(long j2, long j3, AbstractC6219k abstractC6219k, Integer num, String str, List<AbstractC6220l> list, EnumC6224p enumC6224p) {
        this.f16681a = j2;
        this.f16682b = j3;
        this.f16683c = abstractC6219k;
        this.f16684d = num;
        this.f16685e = str;
        this.f16686f = list;
        this.f16687g = enumC6224p;
    }
}
