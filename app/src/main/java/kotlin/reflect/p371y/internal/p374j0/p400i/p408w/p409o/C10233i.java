package kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o;

import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;

/* compiled from: TransientReceiver.java */
/* renamed from: kotlin.f0.y.e.j0.i.w.o.i */
/* loaded from: classes3.dex */
public class C10233i extends AbstractC10225a {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10233i(AbstractC10311e0 abstractC10311e0) {
        this(abstractC10311e0, null);
        if (abstractC10311e0 == null) {
            m36185b(0);
        }
    }

    /* renamed from: b */
    private static /* synthetic */ void m36185b(int i2) {
        Object[] objArr = new Object[3];
        if (i2 != 2) {
            objArr[0] = "type";
        } else {
            objArr[0] = "newType";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (i2 != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "replaceType";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public String toString() {
        return "{Transient} : " + getType();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C10233i(AbstractC10311e0 abstractC10311e0, InterfaceC10230f interfaceC10230f) {
        super(abstractC10311e0, interfaceC10230f);
        if (abstractC10311e0 == null) {
            m36185b(1);
        }
    }
}
