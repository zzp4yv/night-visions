package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10013w;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10014x;

/* compiled from: ReflectJavaRecordComponent.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.y */
/* loaded from: classes2.dex */
public final class C10691y extends AbstractC10686t implements InterfaceC10013w {

    /* renamed from: a */
    private final Object f41214a;

    public C10691y(Object obj) {
        C9768m.m32346f(obj, "recordComponent");
        this.f41214a = obj;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.AbstractC10686t
    /* renamed from: U */
    public Member mo38106U() {
        Method m38041c = C10664a.f41156a.m38041c(this.f41214a);
        if (m38041c != null) {
            return m38041c;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10013w
    public InterfaceC10014x getType() {
        Class<?> m38042d = C10664a.f41156a.m38042d(this.f41214a);
        if (m38042d != null) {
            return new C10680n(m38042d);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10013w
    /* renamed from: h */
    public boolean mo33627h() {
        return false;
    }
}
