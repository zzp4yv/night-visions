package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o.InterfaceC10230f;

/* compiled from: ReceiverParameterDescriptorImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.f0 */
/* loaded from: classes2.dex */
public class C10615f0 extends AbstractC10608c {

    /* renamed from: h */
    private final InterfaceC10576m f40972h;

    /* renamed from: i */
    private InterfaceC10230f f40973i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10615f0(InterfaceC10576m interfaceC10576m, InterfaceC10230f interfaceC10230f, InterfaceC10587g interfaceC10587g) {
        super(interfaceC10587g);
        if (interfaceC10576m == null) {
            m37846v(0);
        }
        if (interfaceC10230f == null) {
            m37846v(1);
        }
        if (interfaceC10587g == null) {
            m37846v(2);
        }
        this.f40972h = interfaceC10576m;
        this.f40973i = interfaceC10230f;
    }

    /* renamed from: v */
    private static /* synthetic */ void m37846v(int i2) {
        String str = (i2 == 3 || i2 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 3 || i2 == 4) ? 2 : 3];
        switch (i2) {
            case 1:
                objArr[0] = "value";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 5:
                objArr[0] = "newOwner";
                break;
            case 6:
                objArr[0] = "outType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i2 == 3) {
            objArr[1] = "getValue";
        } else if (i2 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i2 != 3 && i2 != 4) {
            if (i2 == 5) {
                objArr[2] = "copy";
            } else if (i2 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "setOutType";
            }
        }
        String format = String.format(str, objArr);
        if (i2 != 3 && i2 != 4) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: b */
    public InterfaceC10576m mo32876b() {
        InterfaceC10576m interfaceC10576m = this.f40972h;
        if (interfaceC10576m == null) {
            m37846v(4);
        }
        return interfaceC10576m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10702w0
    public InterfaceC10230f getValue() {
        InterfaceC10230f interfaceC10230f = this.f40973i;
        if (interfaceC10230f == null) {
            m37846v(3);
        }
        return interfaceC10230f;
    }
}
