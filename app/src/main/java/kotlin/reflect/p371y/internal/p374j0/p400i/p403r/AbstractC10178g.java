package kotlin.reflect.p371y.internal.p374j0.p400i.p403r;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;

/* compiled from: constantValues.kt */
/* renamed from: kotlin.f0.y.e.j0.i.r.g */
/* loaded from: classes3.dex */
public abstract class AbstractC10178g<T> {

    /* renamed from: a */
    private final T f39559a;

    public AbstractC10178g(T t) {
        this.f39559a = t;
    }

    /* renamed from: a */
    public abstract AbstractC10311e0 mo36013a(InterfaceC10559g0 interfaceC10559g0);

    /* renamed from: b */
    public T mo36023b() {
        return this.f39559a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            T mo36023b = mo36023b();
            AbstractC10178g abstractC10178g = obj instanceof AbstractC10178g ? (AbstractC10178g) obj : null;
            if (!C9768m.m32341a(mo36023b, abstractC10178g != null ? abstractC10178g.mo36023b() : null)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        T mo36023b = mo36023b();
        if (mo36023b != null) {
            return mo36023b.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(mo36023b());
    }
}
