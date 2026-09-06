package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o.C10229e;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o.InterfaceC10230f;

/* compiled from: LazyClassReceiverParameterDescriptor.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.q */
/* loaded from: classes2.dex */
public class C10634q extends AbstractC10608c {

    /* renamed from: h */
    private final InterfaceC10552e f41084h;

    /* renamed from: i */
    private final C10229e f41085i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10634q(InterfaceC10552e interfaceC10552e) {
        super(InterfaceC10587g.f40808c.m37735b());
        if (interfaceC10552e == null) {
            m37962v(0);
        }
        this.f41084h = interfaceC10552e;
        this.f41085i = new C10229e(interfaceC10552e, null);
    }

    /* renamed from: v */
    private static /* synthetic */ void m37962v(int i2) {
        String str = (i2 == 1 || i2 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 1 || i2 == 2) ? 2 : 3];
        if (i2 == 1 || i2 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i2 != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i2 == 1) {
            objArr[1] = "getValue";
        } else if (i2 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String format = String.format(str, objArr);
        if (i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: b */
    public InterfaceC10576m mo32876b() {
        InterfaceC10552e interfaceC10552e = this.f41084h;
        if (interfaceC10552e == null) {
            m37962v(2);
        }
        return interfaceC10552e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10702w0
    public InterfaceC10230f getValue() {
        C10229e c10229e = this.f41085i;
        if (c10229e == null) {
            m37962v(1);
        }
        return c10229e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10622j
    public String toString() {
        return "class " + this.f41084h.getName() + "::this";
    }
}
