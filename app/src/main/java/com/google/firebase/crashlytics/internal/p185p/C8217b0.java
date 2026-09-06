package com.google.firebase.crashlytics.internal.p185p;

import com.google.firebase.crashlytics.internal.p185p.AbstractC8227g0;

/* compiled from: AutoValue_StaticSessionData.java */
/* renamed from: com.google.firebase.crashlytics.h.p.b0 */
/* loaded from: classes2.dex */
final class C8217b0 extends AbstractC8227g0 {

    /* renamed from: a */
    private final AbstractC8227g0.a f31294a;

    /* renamed from: b */
    private final AbstractC8227g0.c f31295b;

    /* renamed from: c */
    private final AbstractC8227g0.b f31296c;

    C8217b0(AbstractC8227g0.a aVar, AbstractC8227g0.c cVar, AbstractC8227g0.b bVar) {
        if (aVar == null) {
            throw new NullPointerException("Null appData");
        }
        this.f31294a = aVar;
        if (cVar == null) {
            throw new NullPointerException("Null osData");
        }
        this.f31295b = cVar;
        if (bVar == null) {
            throw new NullPointerException("Null deviceData");
        }
        this.f31296c = bVar;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8227g0
    /* renamed from: a */
    public AbstractC8227g0.a mo25606a() {
        return this.f31294a;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8227g0
    /* renamed from: c */
    public AbstractC8227g0.b mo25607c() {
        return this.f31296c;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8227g0
    /* renamed from: d */
    public AbstractC8227g0.c mo25608d() {
        return this.f31295b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8227g0)) {
            return false;
        }
        AbstractC8227g0 abstractC8227g0 = (AbstractC8227g0) obj;
        return this.f31294a.equals(abstractC8227g0.mo25606a()) && this.f31295b.equals(abstractC8227g0.mo25608d()) && this.f31296c.equals(abstractC8227g0.mo25607c());
    }

    public int hashCode() {
        return ((((this.f31294a.hashCode() ^ 1000003) * 1000003) ^ this.f31295b.hashCode()) * 1000003) ^ this.f31296c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f31294a + ", osData=" + this.f31295b + ", deviceData=" + this.f31296c + "}";
    }
}
