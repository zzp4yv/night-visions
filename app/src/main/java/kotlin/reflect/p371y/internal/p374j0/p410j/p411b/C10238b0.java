package kotlin.reflect.p371y.internal.p374j0.p410j.p411b;

import cm.aptoide.p092pt.dataprovider.model.p096v7.store.Store;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10697u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10695t;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;
import kotlin.reflect.p371y.internal.p374j0.p392e.EnumC10098j;
import kotlin.reflect.p371y.internal.p374j0.p392e.EnumC10112x;

/* compiled from: ProtoEnumFlagsUtils.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.b0 */
/* loaded from: classes3.dex */
public final class C10238b0 {

    /* compiled from: ProtoEnumFlagsUtils.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.b0$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39728a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f39729b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f39730c;

        static {
            int[] iArr = new int[EnumC10098j.values().length];
            iArr[EnumC10098j.DECLARATION.ordinal()] = 1;
            iArr[EnumC10098j.FAKE_OVERRIDE.ordinal()] = 2;
            iArr[EnumC10098j.DELEGATION.ordinal()] = 3;
            iArr[EnumC10098j.SYNTHESIZED.ordinal()] = 4;
            f39728a = iArr;
            int[] iArr2 = new int[InterfaceC10543b.a.values().length];
            iArr2[InterfaceC10543b.a.DECLARATION.ordinal()] = 1;
            iArr2[InterfaceC10543b.a.FAKE_OVERRIDE.ordinal()] = 2;
            iArr2[InterfaceC10543b.a.DELEGATION.ordinal()] = 3;
            iArr2[InterfaceC10543b.a.SYNTHESIZED.ordinal()] = 4;
            f39729b = iArr2;
            int[] iArr3 = new int[EnumC10112x.values().length];
            iArr3[EnumC10112x.INTERNAL.ordinal()] = 1;
            iArr3[EnumC10112x.PRIVATE.ordinal()] = 2;
            iArr3[EnumC10112x.PRIVATE_TO_THIS.ordinal()] = 3;
            iArr3[EnumC10112x.PROTECTED.ordinal()] = 4;
            iArr3[EnumC10112x.PUBLIC.ordinal()] = 5;
            iArr3[EnumC10112x.LOCAL.ordinal()] = 6;
            f39730c = iArr3;
        }
    }

    /* renamed from: a */
    public static final AbstractC10697u m36208a(C10236a0 c10236a0, EnumC10112x enumC10112x) {
        C9768m.m32346f(c10236a0, "<this>");
        switch (enumC10112x == null ? -1 : a.f39730c[enumC10112x.ordinal()]) {
            case 1:
                AbstractC10697u abstractC10697u = C10695t.f41219d;
                C9768m.m32345e(abstractC10697u, "INTERNAL");
                return abstractC10697u;
            case 2:
                AbstractC10697u abstractC10697u2 = C10695t.f41216a;
                C9768m.m32345e(abstractC10697u2, "PRIVATE");
                return abstractC10697u2;
            case 3:
                AbstractC10697u abstractC10697u3 = C10695t.f41217b;
                C9768m.m32345e(abstractC10697u3, "PRIVATE_TO_THIS");
                return abstractC10697u3;
            case 4:
                AbstractC10697u abstractC10697u4 = C10695t.f41218c;
                C9768m.m32345e(abstractC10697u4, "PROTECTED");
                return abstractC10697u4;
            case 5:
                AbstractC10697u abstractC10697u5 = C10695t.f41220e;
                C9768m.m32345e(abstractC10697u5, Store.PUBLIC_ACCESS);
                return abstractC10697u5;
            case 6:
                AbstractC10697u abstractC10697u6 = C10695t.f41221f;
                C9768m.m32345e(abstractC10697u6, "LOCAL");
                return abstractC10697u6;
            default:
                AbstractC10697u abstractC10697u7 = C10695t.f41216a;
                C9768m.m32345e(abstractC10697u7, "PRIVATE");
                return abstractC10697u7;
        }
    }

    /* renamed from: b */
    public static final InterfaceC10543b.a m36209b(C10236a0 c10236a0, EnumC10098j enumC10098j) {
        C9768m.m32346f(c10236a0, "<this>");
        int i2 = enumC10098j == null ? -1 : a.f39728a[enumC10098j.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? InterfaceC10543b.a.DECLARATION : InterfaceC10543b.a.SYNTHESIZED : InterfaceC10543b.a.DELEGATION : InterfaceC10543b.a.FAKE_OVERRIDE : InterfaceC10543b.a.DECLARATION;
    }
}
