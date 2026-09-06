package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10548c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10351r1;
import okhttp3.HttpUrl;

/* compiled from: AbstractLazyTypeParameterDescriptor.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.b */
/* loaded from: classes2.dex */
public abstract class AbstractC10606b extends AbstractC10612e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC10606b(InterfaceC10297n interfaceC10297n, InterfaceC10576m interfaceC10576m, InterfaceC10587g interfaceC10587g, C10130f c10130f, EnumC10351r1 enumC10351r1, boolean z, int i2, InterfaceC10708z0 interfaceC10708z0, InterfaceC10548c1 interfaceC10548c1) {
        super(interfaceC10297n, interfaceC10576m, interfaceC10587g, c10130f, enumC10351r1, z, i2, interfaceC10708z0, interfaceC10548c1);
        if (interfaceC10297n == null) {
            m37760v(0);
        }
        if (interfaceC10576m == null) {
            m37760v(1);
        }
        if (interfaceC10587g == null) {
            m37760v(2);
        }
        if (c10130f == null) {
            m37760v(3);
        }
        if (enumC10351r1 == null) {
            m37760v(4);
        }
        if (interfaceC10708z0 == null) {
            m37760v(5);
        }
        if (interfaceC10548c1 == null) {
            m37760v(6);
        }
    }

    /* renamed from: v */
    private static /* synthetic */ void m37760v(int i2) {
        Object[] objArr = new Object[3];
        switch (i2) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10622j
    public String toString() {
        Object[] objArr = new Object[3];
        boolean mo37669F = mo37669F();
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        objArr[0] = mo37669F ? "reified " : HttpUrl.FRAGMENT_ENCODE_SET;
        if (mo37672n() != EnumC10351r1.INVARIANT) {
            str = mo37672n() + " ";
        }
        objArr[1] = str;
        objArr[2] = getName();
        return String.format("%s%s%s", objArr);
    }
}
