package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.collections.C10784u;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.AbstractC10692z;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9986a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9996f;

/* compiled from: ReflectJavaArrayType.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.k */
/* loaded from: classes2.dex */
public final class C10677k extends AbstractC10692z implements InterfaceC9996f {

    /* renamed from: b */
    private final Type f41189b;

    /* renamed from: c */
    private final AbstractC10692z f41190c;

    /* renamed from: d */
    private final Collection<InterfaceC9986a> f41191d;

    /* renamed from: e */
    private final boolean f41192e;

    public C10677k(Type type) {
        AbstractC10692z m38122a;
        C9768m.m32346f(type, "reflectType");
        this.f41189b = type;
        Type mo38066R = mo38066R();
        if (!(mo38066R instanceof GenericArrayType)) {
            if (mo38066R instanceof Class) {
                Class cls = (Class) mo38066R;
                if (cls.isArray()) {
                    AbstractC10692z.a aVar = AbstractC10692z.f41215a;
                    Class<?> componentType = cls.getComponentType();
                    C9768m.m32345e(componentType, "getComponentType()");
                    m38122a = aVar.m38122a(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + mo38066R().getClass() + "): " + mo38066R());
        }
        AbstractC10692z.a aVar2 = AbstractC10692z.f41215a;
        Type genericComponentType = ((GenericArrayType) mo38066R).getGenericComponentType();
        C9768m.m32345e(genericComponentType, "genericComponentType");
        m38122a = aVar2.m38122a(genericComponentType);
        this.f41190c = m38122a;
        this.f41191d = C10784u.m38888j();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.AbstractC10692z
    /* renamed from: R */
    protected Type mo38066R() {
        return this.f41189b;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9996f
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public AbstractC10692z mo33587n() {
        return this.f41190c;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9992d
    public Collection<InterfaceC9986a> getAnnotations() {
        return this.f41191d;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9992d
    /* renamed from: m */
    public boolean mo33583m() {
        return this.f41192e;
    }
}
