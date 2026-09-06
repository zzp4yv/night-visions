package com.google.android.datatransport.cct.p177f;

import com.google.android.datatransport.cct.p177f.AbstractC6219k;

/* compiled from: AutoValue_ClientInfo.java */
/* renamed from: com.google.android.datatransport.cct.f.e */
/* loaded from: classes2.dex */
final class C6213e extends AbstractC6219k {

    /* renamed from: a */
    private final AbstractC6219k.b f16663a;

    /* renamed from: b */
    private final AbstractC6209a f16664b;

    /* compiled from: AutoValue_ClientInfo.java */
    /* renamed from: com.google.android.datatransport.cct.f.e$b */
    static final class b extends AbstractC6219k.a {

        /* renamed from: a */
        private AbstractC6219k.b f16665a;

        /* renamed from: b */
        private AbstractC6209a f16666b;

        b() {
        }

        @Override // com.google.android.datatransport.cct.p177f.AbstractC6219k.a
        /* renamed from: a */
        public AbstractC6219k mo13454a() {
            return new C6213e(this.f16665a, this.f16666b);
        }

        @Override // com.google.android.datatransport.cct.p177f.AbstractC6219k.a
        /* renamed from: b */
        public AbstractC6219k.a mo13455b(AbstractC6209a abstractC6209a) {
            this.f16666b = abstractC6209a;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p177f.AbstractC6219k.a
        /* renamed from: c */
        public AbstractC6219k.a mo13456c(AbstractC6219k.b bVar) {
            this.f16665a = bVar;
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.p177f.AbstractC6219k
    /* renamed from: b */
    public AbstractC6209a mo13452b() {
        return this.f16664b;
    }

    @Override // com.google.android.datatransport.cct.p177f.AbstractC6219k
    /* renamed from: c */
    public AbstractC6219k.b mo13453c() {
        return this.f16663a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6219k)) {
            return false;
        }
        AbstractC6219k abstractC6219k = (AbstractC6219k) obj;
        AbstractC6219k.b bVar = this.f16663a;
        if (bVar != null ? bVar.equals(abstractC6219k.mo13453c()) : abstractC6219k.mo13453c() == null) {
            AbstractC6209a abstractC6209a = this.f16664b;
            if (abstractC6209a == null) {
                if (abstractC6219k.mo13452b() == null) {
                    return true;
                }
            } else if (abstractC6209a.equals(abstractC6219k.mo13452b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        AbstractC6219k.b bVar = this.f16663a;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC6209a abstractC6209a = this.f16664b;
        return hashCode ^ (abstractC6209a != null ? abstractC6209a.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f16663a + ", androidClientInfo=" + this.f16664b + "}";
    }

    private C6213e(AbstractC6219k.b bVar, AbstractC6209a abstractC6209a) {
        this.f16663a = bVar;
        this.f16664b = abstractC6209a;
    }
}
