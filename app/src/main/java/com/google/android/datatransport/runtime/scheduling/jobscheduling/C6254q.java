package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC6257t;
import java.util.Map;
import p241e.p254e.p256b.p257a.EnumC8754d;
import p241e.p254e.p256b.p257a.p258i.p262c0.InterfaceC8821a;

/* compiled from: AutoValue_SchedulerConfig.java */
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.q */
/* loaded from: classes2.dex */
final class C6254q extends AbstractC6257t {

    /* renamed from: a */
    private final InterfaceC8821a f16822a;

    /* renamed from: b */
    private final Map<EnumC8754d, AbstractC6257t.b> f16823b;

    C6254q(InterfaceC8821a interfaceC8821a, Map<EnumC8754d, AbstractC6257t.b> map) {
        if (interfaceC8821a == null) {
            throw new NullPointerException("Null clock");
        }
        this.f16822a = interfaceC8821a;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f16823b = map;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC6257t
    /* renamed from: e */
    InterfaceC8821a mo13543e() {
        return this.f16822a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6257t)) {
            return false;
        }
        AbstractC6257t abstractC6257t = (AbstractC6257t) obj;
        return this.f16822a.equals(abstractC6257t.mo13543e()) && this.f16823b.equals(abstractC6257t.mo13544h());
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC6257t
    /* renamed from: h */
    Map<EnumC8754d, AbstractC6257t.b> mo13544h() {
        return this.f16823b;
    }

    public int hashCode() {
        return ((this.f16822a.hashCode() ^ 1000003) * 1000003) ^ this.f16823b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f16822a + ", values=" + this.f16823b + "}";
    }
}
