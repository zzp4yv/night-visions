package kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;

/* compiled from: ExtensionReceiver.java */
/* renamed from: kotlin.f0.y.e.j0.i.w.o.d */
/* loaded from: classes3.dex */
public class C10228d extends AbstractC10225a implements InterfaceC10230f {

    /* renamed from: c */
    private final InterfaceC10540a f39691c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10228d(InterfaceC10540a interfaceC10540a, AbstractC10311e0 abstractC10311e0, InterfaceC10230f interfaceC10230f) {
        super(abstractC10311e0, interfaceC10230f);
        if (interfaceC10540a == null) {
            m36181b(0);
        }
        if (abstractC10311e0 == null) {
            m36181b(1);
        }
        this.f39691c = interfaceC10540a;
    }

    /* renamed from: b */
    private static /* synthetic */ void m36181b(int i2) {
        String str = i2 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i2 != 2 ? 3 : 2];
        if (i2 == 1) {
            objArr[0] = "receiverType";
        } else if (i2 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i2 != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i2 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i2 != 2) {
            if (i2 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String format = String.format(str, objArr);
        if (i2 == 2) {
            throw new IllegalStateException(format);
        }
    }

    public String toString() {
        return getType() + ": Ext {" + this.f39691c + "}";
    }
}
