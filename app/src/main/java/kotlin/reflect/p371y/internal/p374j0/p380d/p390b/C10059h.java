package kotlin.reflect.p371y.internal.p374j0.p380d.p390b;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10250g;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10265h;

/* compiled from: JavaClassDataFinder.kt */
/* renamed from: kotlin.f0.y.e.j0.d.b.h */
/* loaded from: classes3.dex */
public final class C10059h implements InterfaceC10265h {

    /* renamed from: a */
    private final InterfaceC10066o f38453a;

    /* renamed from: b */
    private final C10058g f38454b;

    public C10059h(InterfaceC10066o interfaceC10066o, C10058g c10058g) {
        C9768m.m32346f(interfaceC10066o, "kotlinClassFinder");
        C9768m.m32346f(c10058g, "deserializedDescriptorResolver");
        this.f38453a = interfaceC10066o;
        this.f38454b = c10058g;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10265h
    /* renamed from: a */
    public C10250g mo33978a(C10126b c10126b) {
        C9768m.m32346f(c10126b, "classId");
        InterfaceC10068q m34024b = C10067p.m34024b(this.f38453a, c10126b);
        if (m34024b == null) {
            return null;
        }
        C9768m.m32341a(m34024b.mo34028e(), c10126b);
        return this.f38454b.m33972i(m34024b);
    }
}
