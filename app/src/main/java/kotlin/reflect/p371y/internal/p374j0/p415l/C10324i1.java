package kotlin.reflect.p371y.internal.p374j0.p415l;

import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g;

/* compiled from: TypeProjectionImpl.java */
/* renamed from: kotlin.f0.y.e.j0.l.i1 */
/* loaded from: classes3.dex */
public class C10324i1 extends AbstractC10321h1 {

    /* renamed from: a */
    private final EnumC10351r1 f40128a;

    /* renamed from: b */
    private final AbstractC10311e0 f40129b;

    public C10324i1(EnumC10351r1 enumC10351r1, AbstractC10311e0 abstractC10311e0) {
        if (enumC10351r1 == null) {
            m36719d(0);
        }
        if (abstractC10311e0 == null) {
            m36719d(1);
        }
        this.f40128a = enumC10351r1;
        this.f40129b = abstractC10311e0;
    }

    /* renamed from: d */
    private static /* synthetic */ void m36719d(int i2) {
        String str = (i2 == 4 || i2 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 4 || i2 == 5) ? 2 : 3];
        switch (i2) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i2 == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i2 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i2 == 3) {
            objArr[2] = "replaceType";
        } else if (i2 != 4 && i2 != 5) {
            if (i2 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String format = String.format(str, objArr);
        if (i2 != 4 && i2 != 5) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1
    /* renamed from: a */
    public EnumC10351r1 mo36708a() {
        EnumC10351r1 enumC10351r1 = this.f40128a;
        if (enumC10351r1 == null) {
            m36719d(4);
        }
        return enumC10351r1;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1
    /* renamed from: b */
    public InterfaceC10318g1 mo36709b(AbstractC10363g abstractC10363g) {
        if (abstractC10363g == null) {
            m36719d(6);
        }
        return new C10324i1(this.f40128a, abstractC10363g.mo36717a(this.f40129b));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1
    /* renamed from: c */
    public boolean mo36710c() {
        return false;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1
    public AbstractC10311e0 getType() {
        AbstractC10311e0 abstractC10311e0 = this.f40129b;
        if (abstractC10311e0 == null) {
            m36719d(5);
        }
        return abstractC10311e0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10324i1(AbstractC10311e0 abstractC10311e0) {
        this(EnumC10351r1.INVARIANT, abstractC10311e0);
        if (abstractC10311e0 == null) {
            m36719d(2);
        }
    }
}
