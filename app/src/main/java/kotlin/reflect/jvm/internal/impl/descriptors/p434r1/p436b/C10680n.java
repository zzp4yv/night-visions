package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10784u;
import kotlin.collections.C10786v;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.AbstractC10692z;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10000j;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10014x;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9986a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9999i;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;

/* compiled from: ReflectJavaClassifierType.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.n */
/* loaded from: classes2.dex */
public final class C10680n extends AbstractC10692z implements InterfaceC10000j {

    /* renamed from: b */
    private final Type f41203b;

    /* renamed from: c */
    private final InterfaceC9999i f41204c;

    public C10680n(Type type) {
        InterfaceC9999i c10678l;
        C9768m.m32346f(type, "reflectType");
        this.f41203b = type;
        Type mo38066R = mo38066R();
        if (mo38066R instanceof Class) {
            c10678l = new C10678l((Class) mo38066R);
        } else if (mo38066R instanceof TypeVariable) {
            c10678l = new C10665a0((TypeVariable) mo38066R);
        } else {
            if (!(mo38066R instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + mo38066R.getClass() + "): " + mo38066R);
            }
            Type rawType = ((ParameterizedType) mo38066R).getRawType();
            C9768m.m32344d(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            c10678l = new C10678l((Class) rawType);
        }
        this.f41204c = c10678l;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10000j
    /* renamed from: F */
    public List<InterfaceC10014x> mo33605F() {
        List<Type> m38071c = C10670d.m38071c(mo38066R());
        AbstractC10692z.a aVar = AbstractC10692z.f41215a;
        ArrayList arrayList = new ArrayList(C10786v.m38911u(m38071c, 10));
        Iterator<T> it = m38071c.iterator();
        while (it.hasNext()) {
            arrayList.add(aVar.m38122a((Type) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.AbstractC10692z
    /* renamed from: R */
    public Type mo38066R() {
        return this.f41203b;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10000j
    /* renamed from: c */
    public InterfaceC9999i mo33606c() {
        return this.f41204c;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9992d
    public Collection<InterfaceC9986a> getAnnotations() {
        return C10784u.m38888j();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.AbstractC10692z, kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9992d
    /* renamed from: l */
    public InterfaceC9986a mo33582l(C10127c c10127c) {
        C9768m.m32346f(c10127c, "fqName");
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9992d
    /* renamed from: m */
    public boolean mo33583m() {
        return false;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10000j
    /* renamed from: p */
    public String mo33607p() {
        return mo38066R().toString();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10000j
    /* renamed from: x */
    public boolean mo33608x() {
        Type mo38066R = mo38066R();
        if (!(mo38066R instanceof Class)) {
            return false;
        }
        TypeVariable[] typeParameters = ((Class) mo38066R).getTypeParameters();
        C9768m.m32345e(typeParameters, "getTypeParameters()");
        return (typeParameters.length == 0) ^ true;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10000j
    /* renamed from: y */
    public String mo33609y() {
        throw new UnsupportedOperationException("Type not found: " + mo38066R());
    }
}
