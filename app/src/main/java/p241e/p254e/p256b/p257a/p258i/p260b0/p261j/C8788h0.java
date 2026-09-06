package p241e.p254e.p256b.p257a.p258i.p260b0.p261j;

import p241e.p254e.p256b.p257a.p258i.AbstractC8834j;
import p241e.p254e.p256b.p257a.p258i.AbstractC8841q;

/* compiled from: AutoValue_PersistedEvent.java */
/* renamed from: e.e.b.a.i.b0.j.h0 */
/* loaded from: classes2.dex */
final class C8788h0 extends AbstractC8806q0 {

    /* renamed from: a */
    private final long f33490a;

    /* renamed from: b */
    private final AbstractC8841q f33491b;

    /* renamed from: c */
    private final AbstractC8834j f33492c;

    C8788h0(long j2, AbstractC8841q abstractC8841q, AbstractC8834j abstractC8834j) {
        this.f33490a = j2;
        if (abstractC8841q == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f33491b = abstractC8841q;
        if (abstractC8834j == null) {
            throw new NullPointerException("Null event");
        }
        this.f33492c = abstractC8834j;
    }

    @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.AbstractC8806q0
    /* renamed from: b */
    public AbstractC8834j mo27988b() {
        return this.f33492c;
    }

    @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.AbstractC8806q0
    /* renamed from: c */
    public long mo27989c() {
        return this.f33490a;
    }

    @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.AbstractC8806q0
    /* renamed from: d */
    public AbstractC8841q mo27990d() {
        return this.f33491b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8806q0)) {
            return false;
        }
        AbstractC8806q0 abstractC8806q0 = (AbstractC8806q0) obj;
        return this.f33490a == abstractC8806q0.mo27989c() && this.f33491b.equals(abstractC8806q0.mo27990d()) && this.f33492c.equals(abstractC8806q0.mo27988b());
    }

    public int hashCode() {
        long j2 = this.f33490a;
        return this.f33492c.hashCode() ^ ((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f33491b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f33490a + ", transportContext=" + this.f33491b + ", event=" + this.f33492c + "}";
    }
}
