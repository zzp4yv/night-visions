package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.collections.C10762j;
import kotlin.collections.C10784u;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.AbstractC10692z;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9986a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9991c0;

/* compiled from: ReflectJavaWildcardType.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.c0 */
/* loaded from: classes2.dex */
public final class C10669c0 extends AbstractC10692z implements InterfaceC9991c0 {

    /* renamed from: b */
    private final WildcardType f41175b;

    /* renamed from: c */
    private final Collection<InterfaceC9986a> f41176c;

    /* renamed from: d */
    private final boolean f41177d;

    public C10669c0(WildcardType wildcardType) {
        C9768m.m32346f(wildcardType, "reflectType");
        this.f41175b = wildcardType;
        this.f41176c = C10784u.m38888j();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9991c0
    /* renamed from: J */
    public boolean mo33581J() {
        C9768m.m32345e(mo38066R().getUpperBounds(), "reflectType.upperBounds");
        return !C9768m.m32341a(C10762j.m38696x(r0), Object.class);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9991c0
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public AbstractC10692z mo33580C() {
        Type[] upperBounds = mo38066R().getUpperBounds();
        Type[] lowerBounds = mo38066R().getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + mo38066R());
        }
        if (lowerBounds.length == 1) {
            AbstractC10692z.a aVar = AbstractC10692z.f41215a;
            C9768m.m32345e(lowerBounds, "lowerBounds");
            Object m38661N = C10762j.m38661N(lowerBounds);
            C9768m.m32345e(m38661N, "lowerBounds.single()");
            return aVar.m38122a((Type) m38661N);
        }
        if (upperBounds.length != 1) {
            return null;
        }
        C9768m.m32345e(upperBounds, "upperBounds");
        Type type = (Type) C10762j.m38661N(upperBounds);
        if (C9768m.m32341a(type, Object.class)) {
            return null;
        }
        AbstractC10692z.a aVar2 = AbstractC10692z.f41215a;
        C9768m.m32345e(type, "ub");
        return aVar2.m38122a(type);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.AbstractC10692z
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public WildcardType mo38066R() {
        return this.f41175b;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9992d
    public Collection<InterfaceC9986a> getAnnotations() {
        return this.f41176c;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9992d
    /* renamed from: m */
    public boolean mo33583m() {
        return this.f41177d;
    }
}
