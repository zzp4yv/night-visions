package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10014x;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9986a;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;

/* compiled from: ReflectJavaType.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.z */
/* loaded from: classes2.dex */
public abstract class AbstractC10692z implements InterfaceC10014x {

    /* renamed from: a */
    public static final a f41215a = new a(null);

    /* compiled from: ReflectJavaType.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.z$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final AbstractC10692z m38122a(Type type) {
            C9768m.m32346f(type, "type");
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new C10690x(cls);
                }
            }
            return ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) ? new C10677k(type) : type instanceof WildcardType ? new C10669c0((WildcardType) type) : new C10680n(type);
        }
    }

    /* renamed from: R */
    protected abstract Type mo38066R();

    public boolean equals(Object obj) {
        return (obj instanceof AbstractC10692z) && C9768m.m32341a(mo38066R(), ((AbstractC10692z) obj).mo38066R());
    }

    public int hashCode() {
        return mo38066R().hashCode();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9992d
    /* renamed from: l */
    public InterfaceC9986a mo33582l(C10127c c10127c) {
        return InterfaceC10014x.a.m33628a(this, c10127c);
    }

    public String toString() {
        return getClass().getName() + ": " + mo38066R();
    }
}
