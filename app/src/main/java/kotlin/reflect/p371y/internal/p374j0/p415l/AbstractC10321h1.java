package kotlin.reflect.p371y.internal.p374j0.p415l;

/* compiled from: TypeProjectionBase.java */
/* renamed from: kotlin.f0.y.e.j0.l.h1 */
/* loaded from: classes3.dex */
public abstract class AbstractC10321h1 implements InterfaceC10318g1 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC10318g1)) {
            return false;
        }
        InterfaceC10318g1 interfaceC10318g1 = (InterfaceC10318g1) obj;
        return mo36710c() == interfaceC10318g1.mo36710c() && mo36708a() == interfaceC10318g1.mo36708a() && getType().equals(interfaceC10318g1.getType());
    }

    public int hashCode() {
        int hashCode = mo36708a().hashCode();
        if (C10339n1.m36789v(getType())) {
            return (hashCode * 31) + 19;
        }
        return (hashCode * 31) + (mo36710c() ? 17 : getType().hashCode());
    }

    public String toString() {
        if (mo36710c()) {
            return "*";
        }
        if (mo36708a() == EnumC10351r1.INVARIANT) {
            return getType().toString();
        }
        return mo36708a() + " " + getType();
    }
}
