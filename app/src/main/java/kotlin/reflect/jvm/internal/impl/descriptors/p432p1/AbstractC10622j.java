package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.C10582b;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p399h.AbstractC10139c;

/* compiled from: DeclarationDescriptorImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.j */
/* loaded from: classes2.dex */
public abstract class AbstractC10622j extends C10582b implements InterfaceC10576m {

    /* renamed from: g */
    private final C10130f f40987g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC10622j(InterfaceC10587g interfaceC10587g, C10130f c10130f) {
        super(interfaceC10587g);
        if (interfaceC10587g == null) {
            m37858v(0);
        }
        if (c10130f == null) {
            m37858v(1);
        }
        this.f40987g = c10130f;
    }

    /* renamed from: H */
    public static String m37857H(InterfaceC10576m interfaceC10576m) {
        if (interfaceC10576m == null) {
            m37858v(4);
        }
        try {
            String str = AbstractC10139c.f39380j.mo35500q(interfaceC10576m) + "[" + interfaceC10576m.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(interfaceC10576m)) + "]";
            if (str == null) {
                m37858v(5);
            }
            return str;
        } catch (Throwable unused) {
            String str2 = interfaceC10576m.getClass().getSimpleName() + " " + interfaceC10576m.getName();
            if (str2 == null) {
                m37858v(6);
            }
            return str2;
        }
    }

    /* renamed from: v */
    private static /* synthetic */ void m37858v(int i2) {
        String str = (i2 == 2 || i2 == 3 || i2 == 5 || i2 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 2 || i2 == 3 || i2 == 5 || i2 == 6) ? 2 : 3];
        switch (i2) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i2 == 2) {
            objArr[1] = "getName";
        } else if (i2 == 3) {
            objArr[1] = "getOriginal";
        } else if (i2 == 5 || i2 == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i2 != 2 && i2 != 3) {
            if (i2 == 4) {
                objArr[2] = "toString";
            } else if (i2 != 5 && i2 != 6) {
                objArr[2] = "<init>";
            }
        }
        String format = String.format(str, objArr);
        if (i2 != 2 && i2 != 3 && i2 != 5 && i2 != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    /* renamed from: a */
    public InterfaceC10576m mo37019a() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10565i0
    public C10130f getName() {
        C10130f c10130f = this.f40987g;
        if (c10130f == null) {
            m37858v(2);
        }
        return c10130f;
    }

    public String toString() {
        return m37857H(this);
    }
}
