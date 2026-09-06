package kotlin.reflect.p371y.internal.p374j0.p380d.p390b;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p386m.C9980f;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10105q;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10079a;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10276s;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10314f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10394k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.EnumC10393j;

/* compiled from: JavaFlexibleTypeDeserializer.kt */
/* renamed from: kotlin.f0.y.e.j0.d.b.i */
/* loaded from: classes3.dex */
public final class C10060i implements InterfaceC10276s {

    /* renamed from: a */
    public static final C10060i f38455a = new C10060i();

    private C10060i() {
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10276s
    /* renamed from: a */
    public AbstractC10311e0 mo33979a(C10105q c10105q, String str, AbstractC10335m0 abstractC10335m0, AbstractC10335m0 abstractC10335m02) {
        C9768m.m32346f(c10105q, "proto");
        C9768m.m32346f(str, "flexibleId");
        C9768m.m32346f(abstractC10335m0, "lowerBound");
        C9768m.m32346f(abstractC10335m02, "upperBound");
        return !C9768m.m32341a(str, "kotlin.jvm.PlatformType") ? C10394k.m37053d(EnumC10393j.f40292M, str, abstractC10335m0.toString(), abstractC10335m02.toString()) : c10105q.m38404x(C10079a.f38497g) ? new C9980f(abstractC10335m0, abstractC10335m02) : C10314f0.m36664d(abstractC10335m0, abstractC10335m02);
    }
}
