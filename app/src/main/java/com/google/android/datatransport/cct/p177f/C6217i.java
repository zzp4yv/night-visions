package com.google.android.datatransport.cct.p177f;

import com.google.android.datatransport.cct.p177f.AbstractC6223o;

/* compiled from: AutoValue_NetworkConnectionInfo.java */
/* renamed from: com.google.android.datatransport.cct.f.i */
/* loaded from: classes2.dex */
final class C6217i extends AbstractC6223o {

    /* renamed from: a */
    private final AbstractC6223o.c f16696a;

    /* renamed from: b */
    private final AbstractC6223o.b f16697b;

    /* compiled from: AutoValue_NetworkConnectionInfo.java */
    /* renamed from: com.google.android.datatransport.cct.f.i$b */
    static final class b extends AbstractC6223o.a {

        /* renamed from: a */
        private AbstractC6223o.c f16698a;

        /* renamed from: b */
        private AbstractC6223o.b f16699b;

        b() {
        }

        @Override // com.google.android.datatransport.cct.p177f.AbstractC6223o.a
        /* renamed from: a */
        public AbstractC6223o mo13490a() {
            return new C6217i(this.f16698a, this.f16699b);
        }

        @Override // com.google.android.datatransport.cct.p177f.AbstractC6223o.a
        /* renamed from: b */
        public AbstractC6223o.a mo13491b(AbstractC6223o.b bVar) {
            this.f16699b = bVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p177f.AbstractC6223o.a
        /* renamed from: c */
        public AbstractC6223o.a mo13492c(AbstractC6223o.c cVar) {
            this.f16698a = cVar;
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.p177f.AbstractC6223o
    /* renamed from: b */
    public AbstractC6223o.b mo13488b() {
        return this.f16697b;
    }

    @Override // com.google.android.datatransport.cct.p177f.AbstractC6223o
    /* renamed from: c */
    public AbstractC6223o.c mo13489c() {
        return this.f16696a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6223o)) {
            return false;
        }
        AbstractC6223o abstractC6223o = (AbstractC6223o) obj;
        AbstractC6223o.c cVar = this.f16696a;
        if (cVar != null ? cVar.equals(abstractC6223o.mo13489c()) : abstractC6223o.mo13489c() == null) {
            AbstractC6223o.b bVar = this.f16697b;
            if (bVar == null) {
                if (abstractC6223o.mo13488b() == null) {
                    return true;
                }
            } else if (bVar.equals(abstractC6223o.mo13488b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        AbstractC6223o.c cVar = this.f16696a;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC6223o.b bVar = this.f16697b;
        return hashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f16696a + ", mobileSubtype=" + this.f16697b + "}";
    }

    private C6217i(AbstractC6223o.c cVar, AbstractC6223o.b bVar) {
        this.f16696a = cVar;
        this.f16697b = bVar;
    }
}
