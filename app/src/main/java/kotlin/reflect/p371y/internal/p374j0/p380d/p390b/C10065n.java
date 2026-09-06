package kotlin.reflect.p371y.internal.p374j0.p380d.p390b;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p375b.EnumC9882i;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.AbstractC10063l;
import kotlin.reflect.p371y.internal.p374j0.p400i.p406u.C10206d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p406u.EnumC10207e;
import kotlin.text.C10514v;

/* compiled from: methodSignatureMapping.kt */
/* renamed from: kotlin.f0.y.e.j0.d.b.n */
/* loaded from: classes3.dex */
final class C10065n implements InterfaceC10064m<AbstractC10063l> {

    /* renamed from: a */
    public static final C10065n f38475a = new C10065n();

    /* compiled from: methodSignatureMapping.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.n$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38476a;

        static {
            int[] iArr = new int[EnumC9882i.values().length];
            iArr[EnumC9882i.BOOLEAN.ordinal()] = 1;
            iArr[EnumC9882i.CHAR.ordinal()] = 2;
            iArr[EnumC9882i.BYTE.ordinal()] = 3;
            iArr[EnumC9882i.SHORT.ordinal()] = 4;
            iArr[EnumC9882i.INT.ordinal()] = 5;
            iArr[EnumC9882i.FLOAT.ordinal()] = 6;
            iArr[EnumC9882i.LONG.ordinal()] = 7;
            iArr[EnumC9882i.DOUBLE.ordinal()] = 8;
            f38476a = iArr;
        }
    }

    private C10065n() {
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10064m
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public AbstractC10063l mo34009d(AbstractC10063l abstractC10063l) {
        C9768m.m32346f(abstractC10063l, "possiblyPrimitiveType");
        if (!(abstractC10063l instanceof AbstractC10063l.d)) {
            return abstractC10063l;
        }
        AbstractC10063l.d dVar = (AbstractC10063l.d) abstractC10063l;
        if (dVar.m34005i() == null) {
            return abstractC10063l;
        }
        String m36111f = C10206d.m36108c(dVar.m34005i().m36119y()).m36111f();
        C9768m.m32345e(m36111f, "byFqNameWithoutInnerClas…apperFqName).internalName");
        return mo34008c(m36111f);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10064m
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public AbstractC10063l mo34007b(String str) {
        EnumC10207e enumC10207e;
        AbstractC10063l cVar;
        C9768m.m32346f(str, "representation");
        str.length();
        char charAt = str.charAt(0);
        EnumC10207e[] values = EnumC10207e.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                enumC10207e = null;
                break;
            }
            enumC10207e = values[i2];
            if (enumC10207e.m36116u().charAt(0) == charAt) {
                break;
            }
            i2++;
        }
        if (enumC10207e != null) {
            return new AbstractC10063l.d(enumC10207e);
        }
        if (charAt == 'V') {
            return new AbstractC10063l.d(null);
        }
        if (charAt == '[') {
            String substring = str.substring(1);
            C9768m.m32345e(substring, "this as java.lang.String).substring(startIndex)");
            cVar = new AbstractC10063l.a(mo34007b(substring));
        } else {
            if (charAt == 'L') {
                C10514v.m37544M(str, ';', false, 2, null);
            }
            String substring2 = str.substring(1, str.length() - 1);
            C9768m.m32345e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            cVar = new AbstractC10063l.c(substring2);
        }
        return cVar;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10064m
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public AbstractC10063l.c mo34008c(String str) {
        C9768m.m32346f(str, "internalName");
        return new AbstractC10063l.c(str);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10064m
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public AbstractC10063l mo34011f(EnumC9882i enumC9882i) {
        C9768m.m32346f(enumC9882i, "primitiveType");
        switch (a.f38476a[enumC9882i.ordinal()]) {
            case 1:
                return AbstractC10063l.f38463a.m33996a();
            case 2:
                return AbstractC10063l.f38463a.m33998c();
            case 3:
                return AbstractC10063l.f38463a.m33997b();
            case 4:
                return AbstractC10063l.f38463a.m34003h();
            case 5:
                return AbstractC10063l.f38463a.m34001f();
            case 6:
                return AbstractC10063l.f38463a.m34000e();
            case 7:
                return AbstractC10063l.f38463a.m34002g();
            case 8:
                return AbstractC10063l.f38463a.m33999d();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10064m
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public AbstractC10063l mo34010e() {
        return mo34008c("java/lang/Class");
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10064m
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public String mo34006a(AbstractC10063l abstractC10063l) {
        String m36116u;
        C9768m.m32346f(abstractC10063l, "type");
        if (abstractC10063l instanceof AbstractC10063l.a) {
            return '[' + mo34006a(((AbstractC10063l.a) abstractC10063l).m33995i());
        }
        if (abstractC10063l instanceof AbstractC10063l.d) {
            EnumC10207e m34005i = ((AbstractC10063l.d) abstractC10063l).m34005i();
            return (m34005i == null || (m36116u = m34005i.m36116u()) == null) ? "V" : m36116u;
        }
        if (!(abstractC10063l instanceof AbstractC10063l.c)) {
            throw new NoWhenBranchMatchedException();
        }
        return 'L' + ((AbstractC10063l.c) abstractC10063l).m34004i() + ';';
    }
}
