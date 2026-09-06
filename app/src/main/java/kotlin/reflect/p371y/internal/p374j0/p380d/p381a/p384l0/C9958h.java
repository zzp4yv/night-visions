package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.utils.C10734a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C9974m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10015y;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10016z;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10291h;

/* compiled from: resolvers.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.h */
/* loaded from: classes2.dex */
public final class C9958h implements InterfaceC9961k {

    /* renamed from: a */
    private final C9957g f38003a;

    /* renamed from: b */
    private final InterfaceC10576m f38004b;

    /* renamed from: c */
    private final int f38005c;

    /* renamed from: d */
    private final Map<InterfaceC10015y, Integer> f38006d;

    /* renamed from: e */
    private final InterfaceC10291h<InterfaceC10015y, C9974m> f38007e;

    /* compiled from: resolvers.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.h$a */
    static final class a extends Lambda implements Function1<InterfaceC10015y, C9974m> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C9974m invoke(InterfaceC10015y interfaceC10015y) {
            C9768m.m32346f(interfaceC10015y, "typeParameter");
            Integer num = (Integer) C9958h.this.f38006d.get(interfaceC10015y);
            if (num == null) {
                return null;
            }
            C9958h c9958h = C9958h.this;
            return new C9974m(C9951a.m33237h(C9951a.m33231b(c9958h.f38003a, c9958h), c9958h.f38004b.getAnnotations()), interfaceC10015y, c9958h.f38005c + num.intValue(), c9958h.f38004b);
        }
    }

    public C9958h(C9957g c9957g, InterfaceC10576m interfaceC10576m, InterfaceC10016z interfaceC10016z, int i2) {
        C9768m.m32346f(c9957g, "c");
        C9768m.m32346f(interfaceC10576m, "containingDeclaration");
        C9768m.m32346f(interfaceC10016z, "typeParameterOwner");
        this.f38003a = c9957g;
        this.f38004b = interfaceC10576m;
        this.f38005c = i2;
        this.f38006d = C10734a.m38511d(interfaceC10016z.getTypeParameters());
        this.f38007e = c9957g.m33286e().mo36521i(new a());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.InterfaceC9961k
    /* renamed from: a */
    public InterfaceC10554e1 mo33293a(InterfaceC10015y interfaceC10015y) {
        C9768m.m32346f(interfaceC10015y, "javaTypeParameter");
        C9974m invoke = this.f38007e.invoke(interfaceC10015y);
        return invoke != null ? invoke : this.f38003a.m33287f().mo33293a(interfaceC10015y);
    }
}
