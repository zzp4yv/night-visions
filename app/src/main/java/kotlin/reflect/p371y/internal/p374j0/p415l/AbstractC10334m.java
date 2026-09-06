package kotlin.reflect.p371y.internal.p374j0.p415l;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10571k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10154d;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10394k;

/* compiled from: ClassifierBasedTypeConstructor.kt */
/* renamed from: kotlin.f0.y.e.j0.l.m */
/* loaded from: classes3.dex */
public abstract class AbstractC10334m implements InterfaceC10312e1 {

    /* renamed from: a */
    private int f40146a;

    /* renamed from: h */
    private final boolean m36764h(InterfaceC10561h interfaceC10561h) {
        return (C10394k.m37054m(interfaceC10561h) || C10154d.m35804E(interfaceC10561h)) ? false : true;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
    /* renamed from: c */
    public abstract InterfaceC10561h mo32891w();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC10312e1) || obj.hashCode() != hashCode()) {
            return false;
        }
        InterfaceC10312e1 interfaceC10312e1 = (InterfaceC10312e1) obj;
        if (interfaceC10312e1.getParameters().size() != getParameters().size()) {
            return false;
        }
        InterfaceC10561h mo32891w = mo32891w();
        InterfaceC10561h mo32891w2 = interfaceC10312e1.mo32891w();
        if (mo32891w2 != null && m36764h(mo32891w) && m36764h(mo32891w2)) {
            return mo36579i(mo32891w2);
        }
        return false;
    }

    /* renamed from: g */
    protected final boolean m36765g(InterfaceC10561h interfaceC10561h, InterfaceC10561h interfaceC10561h2) {
        C9768m.m32346f(interfaceC10561h, "first");
        C9768m.m32346f(interfaceC10561h2, "second");
        if (!C9768m.m32341a(interfaceC10561h.getName(), interfaceC10561h2.getName())) {
            return false;
        }
        InterfaceC10576m mo32876b = interfaceC10561h.mo32876b();
        for (InterfaceC10576m mo32876b2 = interfaceC10561h2.mo32876b(); mo32876b != null && mo32876b2 != null; mo32876b2 = mo32876b2.mo32876b()) {
            if (mo32876b instanceof InterfaceC10559g0) {
                return mo32876b2 instanceof InterfaceC10559g0;
            }
            if (mo32876b2 instanceof InterfaceC10559g0) {
                return false;
            }
            if (mo32876b instanceof InterfaceC10571k0) {
                return (mo32876b2 instanceof InterfaceC10571k0) && C9768m.m32341a(((InterfaceC10571k0) mo32876b).mo37712d(), ((InterfaceC10571k0) mo32876b2).mo37712d());
            }
            if ((mo32876b2 instanceof InterfaceC10571k0) || !C9768m.m32341a(mo32876b.getName(), mo32876b2.getName())) {
                return false;
            }
            mo32876b = mo32876b.mo32876b();
        }
        return true;
    }

    public int hashCode() {
        int i2 = this.f40146a;
        if (i2 != 0) {
            return i2;
        }
        InterfaceC10561h mo32891w = mo32891w();
        int hashCode = m36764h(mo32891w) ? C10154d.m35825m(mo32891w).hashCode() : System.identityHashCode(this);
        this.f40146a = hashCode;
        return hashCode;
    }

    /* renamed from: i */
    protected abstract boolean mo36579i(InterfaceC10561h interfaceC10561h);
}
