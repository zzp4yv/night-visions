package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10579n;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10602p;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;

/* compiled from: DeclarationDescriptorNonRootImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.k */
/* loaded from: classes2.dex */
public abstract class AbstractC10624k extends AbstractC10622j implements InterfaceC10579n {

    /* renamed from: h */
    private final InterfaceC10576m f40996h;

    /* renamed from: i */
    private final InterfaceC10708z0 f40997i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC10624k(InterfaceC10576m interfaceC10576m, InterfaceC10587g interfaceC10587g, C10130f c10130f, InterfaceC10708z0 interfaceC10708z0) {
        super(interfaceC10587g, c10130f);
        if (interfaceC10576m == null) {
            m37870v(0);
        }
        if (interfaceC10587g == null) {
            m37870v(1);
        }
        if (c10130f == null) {
            m37870v(2);
        }
        if (interfaceC10708z0 == null) {
            m37870v(3);
        }
        this.f40996h = interfaceC10576m;
        this.f40997i = interfaceC10708z0;
    }

    /* renamed from: v */
    private static /* synthetic */ void m37870v(int i2) {
        String str = (i2 == 4 || i2 == 5 || i2 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 4 || i2 == 5 || i2 == 6) ? 2 : 3];
        switch (i2) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i2 == 4) {
            objArr[1] = "getOriginal";
        } else if (i2 == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i2 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i2 != 4 && i2 != 5 && i2 != 6) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i2 != 4 && i2 != 5 && i2 != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10622j, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public InterfaceC10602p mo37019a() {
        InterfaceC10602p interfaceC10602p = (InterfaceC10602p) super.mo37019a();
        if (interfaceC10602p == null) {
            m37870v(4);
        }
        return interfaceC10602p;
    }

    /* renamed from: b */
    public InterfaceC10576m mo32876b() {
        InterfaceC10576m interfaceC10576m = this.f40996h;
        if (interfaceC10576m == null) {
            m37870v(5);
        }
        return interfaceC10576m;
    }

    /* renamed from: t */
    public InterfaceC10708z0 mo32883t() {
        InterfaceC10708z0 interfaceC10708z0 = this.f40997i;
        if (interfaceC10708z0 == null) {
            m37870v(6);
        }
        return interfaceC10708z0;
    }
}
