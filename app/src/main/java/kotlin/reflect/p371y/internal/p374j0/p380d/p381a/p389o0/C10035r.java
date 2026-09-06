package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0;

import java.util.List;
import kotlin.collections.C10749c0;
import kotlin.collections.C10780s;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.C10591k;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.p371y.internal.p374j0.p375b.p377q.C9897d;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9912a0;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.C10373q;

/* compiled from: typeEnhancement.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.o0.r */
/* loaded from: classes3.dex */
public final class C10035r {

    /* renamed from: a */
    private static final C10020c f38295a;

    /* renamed from: b */
    private static final C10020c f38296b;

    /* compiled from: typeEnhancement.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.o0.r$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38297a;

        static {
            int[] iArr = new int[EnumC10025h.values().length];
            iArr[EnumC10025h.NULLABLE.ordinal()] = 1;
            iArr[EnumC10025h.NOT_NULL.ordinal()] = 2;
            f38297a = iArr;
        }
    }

    static {
        C10127c c10127c = C9912a0.f37806u;
        C9768m.m32345e(c10127c, "ENHANCED_NULLABILITY_ANNOTATION");
        f38295a = new C10020c(c10127c);
        C10127c c10127c2 = C9912a0.f37807v;
        C9768m.m32345e(c10127c2, "ENHANCED_MUTABILITY_ANNOTATION");
        f38296b = new C10020c(c10127c2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final InterfaceC10587g m33773f(List<? extends InterfaceC10587g> list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? new C10591k((List<? extends InterfaceC10587g>) C10749c0.m38569E0(list)) : (InterfaceC10587g) C10780s.m38866s0(list);
        }
        throw new IllegalStateException("At least one Annotations object expected".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final InterfaceC10561h m33774g(InterfaceC10561h interfaceC10561h, C10022e c10022e, EnumC10032o enumC10032o) {
        C9897d c9897d = C9897d.f37687a;
        if (!C10033p.m33766a(enumC10032o) || !(interfaceC10561h instanceof InterfaceC10552e)) {
            return null;
        }
        if (c10022e.m33683c() == EnumC10023f.READ_ONLY && enumC10032o == EnumC10032o.FLEXIBLE_LOWER) {
            InterfaceC10552e interfaceC10552e = (InterfaceC10552e) interfaceC10561h;
            if (c9897d.m32939c(interfaceC10552e)) {
                return c9897d.m32937a(interfaceC10552e);
            }
        }
        if (c10022e.m33683c() != EnumC10023f.MUTABLE || enumC10032o != EnumC10032o.FLEXIBLE_UPPER) {
            return null;
        }
        InterfaceC10552e interfaceC10552e2 = (InterfaceC10552e) interfaceC10561h;
        if (c9897d.m32940d(interfaceC10552e2)) {
            return c9897d.m32938b(interfaceC10552e2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final Boolean m33775h(C10022e c10022e, EnumC10032o enumC10032o) {
        if (!C10033p.m33766a(enumC10032o)) {
            return null;
        }
        EnumC10025h m33684d = c10022e.m33684d();
        int i2 = m33684d == null ? -1 : a.f38297a[m33684d.ordinal()];
        if (i2 == 1) {
            return Boolean.TRUE;
        }
        if (i2 != 2) {
            return null;
        }
        return Boolean.FALSE;
    }

    /* renamed from: i */
    public static final boolean m33776i(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, "<this>");
        return C10036s.m33779c(C10373q.f40209a, abstractC10311e0);
    }
}
