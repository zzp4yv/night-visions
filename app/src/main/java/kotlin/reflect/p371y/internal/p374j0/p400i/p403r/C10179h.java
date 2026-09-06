package kotlin.reflect.p371y.internal.p374j0.p400i.p403r;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10749c0;
import kotlin.collections.C10770n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.p371y.internal.p374j0.p375b.EnumC9882i;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;

/* compiled from: ConstantValueFactory.kt */
/* renamed from: kotlin.f0.y.e.j0.i.r.h */
/* loaded from: classes3.dex */
public final class C10179h {

    /* renamed from: a */
    public static final C10179h f39560a = new C10179h();

    /* compiled from: ConstantValueFactory.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.r.h$a */
    static final class a extends Lambda implements Function1<InterfaceC10559g0, AbstractC10311e0> {

        /* renamed from: f */
        final /* synthetic */ AbstractC10311e0 f39561f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC10311e0 abstractC10311e0) {
            super(1);
            this.f39561f = abstractC10311e0;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10311e0 invoke(InterfaceC10559g0 interfaceC10559g0) {
            C9768m.m32346f(interfaceC10559g0, "it");
            return this.f39561f;
        }
    }

    /* compiled from: ConstantValueFactory.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.r.h$b */
    static final class b extends Lambda implements Function1<InterfaceC10559g0, AbstractC10311e0> {

        /* renamed from: f */
        final /* synthetic */ EnumC9882i f39562f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(EnumC9882i enumC9882i) {
            super(1);
            this.f39562f = enumC9882i;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10311e0 invoke(InterfaceC10559g0 interfaceC10559g0) {
            C9768m.m32346f(interfaceC10559g0, "module");
            AbstractC10335m0 m32779O = interfaceC10559g0.mo37021o().m32779O(this.f39562f);
            C9768m.m32345e(m32779O, "module.builtIns.getPrimi…KotlinType(componentType)");
            return m32779O;
        }
    }

    private C10179h() {
    }

    /* renamed from: a */
    private final C10173b m36024a(List<?> list, EnumC9882i enumC9882i) {
        List m38569E0 = C10749c0.m38569E0(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = m38569E0.iterator();
        while (it.hasNext()) {
            AbstractC10178g<?> m36026c = m36026c(it.next());
            if (m36026c != null) {
                arrayList.add(m36026c);
            }
        }
        return new C10173b(arrayList, new b(enumC9882i));
    }

    /* renamed from: b */
    public final C10173b m36025b(List<? extends AbstractC10178g<?>> list, AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(list, "value");
        C9768m.m32346f(abstractC10311e0, "type");
        return new C10173b(list, new a(abstractC10311e0));
    }

    /* renamed from: c */
    public final AbstractC10178g<?> m36026c(Object obj) {
        List<Boolean> m38748b0;
        List<Double> m38742V;
        List<Float> m38743W;
        List<Character> m38741U;
        List<Long> m38745Y;
        List<Integer> m38744X;
        List<Short> m38747a0;
        List<Byte> m38740T;
        if (obj instanceof Byte) {
            return new C10175d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new C10192u(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new C10184m(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new C10189r(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new C10176e(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new C10183l(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new C10180i(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new C10174c(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new C10193v((String) obj);
        }
        if (obj instanceof byte[]) {
            m38740T = C10770n.m38740T((byte[]) obj);
            return m36024a(m38740T, EnumC9882i.BYTE);
        }
        if (obj instanceof short[]) {
            m38747a0 = C10770n.m38747a0((short[]) obj);
            return m36024a(m38747a0, EnumC9882i.SHORT);
        }
        if (obj instanceof int[]) {
            m38744X = C10770n.m38744X((int[]) obj);
            return m36024a(m38744X, EnumC9882i.INT);
        }
        if (obj instanceof long[]) {
            m38745Y = C10770n.m38745Y((long[]) obj);
            return m36024a(m38745Y, EnumC9882i.LONG);
        }
        if (obj instanceof char[]) {
            m38741U = C10770n.m38741U((char[]) obj);
            return m36024a(m38741U, EnumC9882i.CHAR);
        }
        if (obj instanceof float[]) {
            m38743W = C10770n.m38743W((float[]) obj);
            return m36024a(m38743W, EnumC9882i.FLOAT);
        }
        if (obj instanceof double[]) {
            m38742V = C10770n.m38742V((double[]) obj);
            return m36024a(m38742V, EnumC9882i.DOUBLE);
        }
        if (obj instanceof boolean[]) {
            m38748b0 = C10770n.m38748b0((boolean[]) obj);
            return m36024a(m38748b0, EnumC9882i.BOOLEAN);
        }
        if (obj == null) {
            return new C10190s();
        }
        return null;
    }
}
