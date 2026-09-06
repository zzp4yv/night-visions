package kotlin.reflect.p371y.internal.p374j0.p415l;

import kotlin.jvm.internal.C9757g0;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.C10589i;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;

/* compiled from: AnnotationsTypeAttribute.kt */
/* renamed from: kotlin.f0.y.e.j0.l.j */
/* loaded from: classes3.dex */
public final class C10325j extends AbstractC10426y0<C10325j> {

    /* renamed from: a */
    private final InterfaceC10587g f40130a;

    public C10325j(InterfaceC10587g interfaceC10587g) {
        C9768m.m32346f(interfaceC10587g, "annotations");
        this.f40130a = interfaceC10587g;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10426y0
    /* renamed from: b */
    public KClass<? extends C10325j> mo36721b() {
        return C9757g0.m32298b(C10325j.class);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10426y0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C10325j mo36720a(C10325j c10325j) {
        return c10325j == null ? this : new C10325j(C10589i.m37739a(this.f40130a, c10325j.f40130a));
    }

    /* renamed from: e */
    public final InterfaceC10587g m36724e() {
        return this.f40130a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10325j) {
            return C9768m.m32341a(((C10325j) obj).f40130a, this.f40130a);
        }
        return false;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10426y0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C10325j mo36722c(C10325j c10325j) {
        if (C9768m.m32341a(c10325j, this)) {
            return this;
        }
        return null;
    }

    public int hashCode() {
        return this.f40130a.hashCode();
    }
}
