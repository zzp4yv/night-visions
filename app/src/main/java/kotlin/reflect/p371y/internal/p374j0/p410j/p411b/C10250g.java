package kotlin.reflect.p371y.internal.p374j0.p410j.p411b;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10091c;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.AbstractC10116a;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10118c;

/* compiled from: ClassData.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.g */
/* loaded from: classes3.dex */
public final class C10250g {

    /* renamed from: a */
    private final InterfaceC10118c f39758a;

    /* renamed from: b */
    private final C10091c f39759b;

    /* renamed from: c */
    private final AbstractC10116a f39760c;

    /* renamed from: d */
    private final InterfaceC10708z0 f39761d;

    public C10250g(InterfaceC10118c interfaceC10118c, C10091c c10091c, AbstractC10116a abstractC10116a, InterfaceC10708z0 interfaceC10708z0) {
        C9768m.m32346f(interfaceC10118c, "nameResolver");
        C9768m.m32346f(c10091c, "classProto");
        C9768m.m32346f(abstractC10116a, "metadataVersion");
        C9768m.m32346f(interfaceC10708z0, "sourceElement");
        this.f39758a = interfaceC10118c;
        this.f39759b = c10091c;
        this.f39760c = abstractC10116a;
        this.f39761d = interfaceC10708z0;
    }

    /* renamed from: a */
    public final InterfaceC10118c m36252a() {
        return this.f39758a;
    }

    /* renamed from: b */
    public final C10091c m36253b() {
        return this.f39759b;
    }

    /* renamed from: c */
    public final AbstractC10116a m36254c() {
        return this.f39760c;
    }

    /* renamed from: d */
    public final InterfaceC10708z0 m36255d() {
        return this.f39761d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10250g)) {
            return false;
        }
        C10250g c10250g = (C10250g) obj;
        return C9768m.m32341a(this.f39758a, c10250g.f39758a) && C9768m.m32341a(this.f39759b, c10250g.f39759b) && C9768m.m32341a(this.f39760c, c10250g.f39760c) && C9768m.m32341a(this.f39761d, c10250g.f39761d);
    }

    public int hashCode() {
        return (((((this.f39758a.hashCode() * 31) + this.f39759b.hashCode()) * 31) + this.f39760c.hashCode()) * 31) + this.f39761d.hashCode();
    }

    public String toString() {
        return "ClassData(nameResolver=" + this.f39758a + ", classProto=" + this.f39759b + ", metadataVersion=" + this.f39760c + ", sourceElement=" + this.f39761d + ')';
    }
}
