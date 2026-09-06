package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfd;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.v2 */
/* loaded from: classes2.dex */
final class C7569v2 implements InterfaceC7552s3 {

    /* renamed from: a */
    private static final InterfaceC7462d3 f27912a = new C7587y2();

    /* renamed from: b */
    private final InterfaceC7462d3 f27913b;

    public C7569v2() {
        this(new C7581x2(C7515m2.m21238c(), m21434b()));
    }

    /* renamed from: b */
    private static InterfaceC7462d3 m21434b() {
        try {
            return (InterfaceC7462d3) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f27912a;
        }
    }

    /* renamed from: c */
    private static boolean m21435c(InterfaceC7468e3 interfaceC7468e3) {
        return interfaceC7468e3.mo21047a() == zzfd.zze.f28131i;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7552s3
    /* renamed from: a */
    public final <T> InterfaceC7534p3<T> mo21403a(Class<T> cls) {
        C7546r3.m21381p(cls);
        InterfaceC7468e3 mo21042b = this.f27913b.mo21042b(cls);
        return mo21042b.mo21048b() ? zzfd.class.isAssignableFrom(cls) ? C7486h3.m21124k(C7546r3.m21337B(), C7467e2.m21044a(), mo21042b.mo21049c()) : C7486h3.m21124k(C7546r3.m21371f(), C7467e2.m21045b(), mo21042b.mo21049c()) : zzfd.class.isAssignableFrom(cls) ? m21435c(mo21042b) ? C7480g3.m21085q(cls, mo21042b, C7504k3.m21172b(), AbstractC7551s2.m21399d(), C7546r3.m21337B(), C7467e2.m21044a(), C7450b3.m20985b()) : C7480g3.m21085q(cls, mo21042b, C7504k3.m21172b(), AbstractC7551s2.m21399d(), C7546r3.m21337B(), null, C7450b3.m20985b()) : m21435c(mo21042b) ? C7480g3.m21085q(cls, mo21042b, C7504k3.m21171a(), AbstractC7551s2.m21398a(), C7546r3.m21371f(), C7467e2.m21045b(), C7450b3.m20984a()) : C7480g3.m21085q(cls, mo21042b, C7504k3.m21171a(), AbstractC7551s2.m21398a(), C7546r3.m21387v(), null, C7450b3.m20984a());
    }

    private C7569v2(InterfaceC7462d3 interfaceC7462d3) {
        this.f27913b = (InterfaceC7462d3) zzff.m22291f(interfaceC7462d3, "messageInfoFactory");
    }
}
