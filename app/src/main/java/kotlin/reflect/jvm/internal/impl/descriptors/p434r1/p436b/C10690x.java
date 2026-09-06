package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.util.Collection;
import kotlin.collections.C10784u;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p375b.EnumC9882i;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10012v;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9986a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p406u.EnumC10207e;

/* compiled from: ReflectJavaPrimitiveType.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.x */
/* loaded from: classes2.dex */
public final class C10690x extends AbstractC10692z implements InterfaceC10012v {

    /* renamed from: b */
    private final Class<?> f41211b;

    /* renamed from: c */
    private final Collection<InterfaceC9986a> f41212c;

    /* renamed from: d */
    private final boolean f41213d;

    public C10690x(Class<?> cls) {
        C9768m.m32346f(cls, "reflectType");
        this.f41211b = cls;
        this.f41212c = C10784u.m38888j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.AbstractC10692z
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public Class<?> mo38066R() {
        return this.f41211b;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9992d
    public Collection<InterfaceC9986a> getAnnotations() {
        return this.f41212c;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10012v
    public EnumC9882i getType() {
        if (C9768m.m32341a(mo38066R(), Void.TYPE)) {
            return null;
        }
        return EnumC10207e.m36114k(mo38066R().getName()).m36118x();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9992d
    /* renamed from: m */
    public boolean mo33583m() {
        return this.f41213d;
    }
}
