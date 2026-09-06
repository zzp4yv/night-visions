package com.google.firebase.installations.p198r;

import com.google.firebase.installations.p198r.AbstractC8367d;

/* compiled from: AutoValue_InstallationResponse.java */
/* renamed from: com.google.firebase.installations.r.a */
/* loaded from: classes2.dex */
final class C8364a extends AbstractC8367d {

    /* renamed from: a */
    private final String f31845a;

    /* renamed from: b */
    private final String f31846b;

    /* renamed from: c */
    private final String f31847c;

    /* renamed from: d */
    private final AbstractC8369f f31848d;

    /* renamed from: e */
    private final AbstractC8367d.b f31849e;

    /* compiled from: AutoValue_InstallationResponse.java */
    /* renamed from: com.google.firebase.installations.r.a$b */
    static final class b extends AbstractC8367d.a {

        /* renamed from: a */
        private String f31850a;

        /* renamed from: b */
        private String f31851b;

        /* renamed from: c */
        private String f31852c;

        /* renamed from: d */
        private AbstractC8369f f31853d;

        /* renamed from: e */
        private AbstractC8367d.b f31854e;

        b() {
        }

        @Override // com.google.firebase.installations.p198r.AbstractC8367d.a
        /* renamed from: a */
        public AbstractC8367d mo26345a() {
            return new C8364a(this.f31850a, this.f31851b, this.f31852c, this.f31853d, this.f31854e);
        }

        @Override // com.google.firebase.installations.p198r.AbstractC8367d.a
        /* renamed from: b */
        public AbstractC8367d.a mo26346b(AbstractC8369f abstractC8369f) {
            this.f31853d = abstractC8369f;
            return this;
        }

        @Override // com.google.firebase.installations.p198r.AbstractC8367d.a
        /* renamed from: c */
        public AbstractC8367d.a mo26347c(String str) {
            this.f31851b = str;
            return this;
        }

        @Override // com.google.firebase.installations.p198r.AbstractC8367d.a
        /* renamed from: d */
        public AbstractC8367d.a mo26348d(String str) {
            this.f31852c = str;
            return this;
        }

        @Override // com.google.firebase.installations.p198r.AbstractC8367d.a
        /* renamed from: e */
        public AbstractC8367d.a mo26349e(AbstractC8367d.b bVar) {
            this.f31854e = bVar;
            return this;
        }

        @Override // com.google.firebase.installations.p198r.AbstractC8367d.a
        /* renamed from: f */
        public AbstractC8367d.a mo26350f(String str) {
            this.f31850a = str;
            return this;
        }
    }

    @Override // com.google.firebase.installations.p198r.AbstractC8367d
    /* renamed from: b */
    public AbstractC8369f mo26340b() {
        return this.f31848d;
    }

    @Override // com.google.firebase.installations.p198r.AbstractC8367d
    /* renamed from: c */
    public String mo26341c() {
        return this.f31846b;
    }

    @Override // com.google.firebase.installations.p198r.AbstractC8367d
    /* renamed from: d */
    public String mo26342d() {
        return this.f31847c;
    }

    @Override // com.google.firebase.installations.p198r.AbstractC8367d
    /* renamed from: e */
    public AbstractC8367d.b mo26343e() {
        return this.f31849e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8367d)) {
            return false;
        }
        AbstractC8367d abstractC8367d = (AbstractC8367d) obj;
        String str = this.f31845a;
        if (str != null ? str.equals(abstractC8367d.mo26344f()) : abstractC8367d.mo26344f() == null) {
            String str2 = this.f31846b;
            if (str2 != null ? str2.equals(abstractC8367d.mo26341c()) : abstractC8367d.mo26341c() == null) {
                String str3 = this.f31847c;
                if (str3 != null ? str3.equals(abstractC8367d.mo26342d()) : abstractC8367d.mo26342d() == null) {
                    AbstractC8369f abstractC8369f = this.f31848d;
                    if (abstractC8369f != null ? abstractC8369f.equals(abstractC8367d.mo26340b()) : abstractC8367d.mo26340b() == null) {
                        AbstractC8367d.b bVar = this.f31849e;
                        if (bVar == null) {
                            if (abstractC8367d.mo26343e() == null) {
                                return true;
                            }
                        } else if (bVar.equals(abstractC8367d.mo26343e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.p198r.AbstractC8367d
    /* renamed from: f */
    public String mo26344f() {
        return this.f31845a;
    }

    public int hashCode() {
        String str = this.f31845a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f31846b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f31847c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        AbstractC8369f abstractC8369f = this.f31848d;
        int hashCode4 = (hashCode3 ^ (abstractC8369f == null ? 0 : abstractC8369f.hashCode())) * 1000003;
        AbstractC8367d.b bVar = this.f31849e;
        return hashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f31845a + ", fid=" + this.f31846b + ", refreshToken=" + this.f31847c + ", authToken=" + this.f31848d + ", responseCode=" + this.f31849e + "}";
    }

    private C8364a(String str, String str2, String str3, AbstractC8369f abstractC8369f, AbstractC8367d.b bVar) {
        this.f31845a = str;
        this.f31846b = str2;
        this.f31847c = str3;
        this.f31848d = abstractC8369f;
        this.f31849e = bVar;
    }
}
