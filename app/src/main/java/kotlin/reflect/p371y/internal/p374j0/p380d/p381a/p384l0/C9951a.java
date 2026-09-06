package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0;

import kotlin.C10517i;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10558g;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C10045x;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10016z;

/* compiled from: context.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.a */
/* loaded from: classes2.dex */
public final class C9951a {

    /* compiled from: context.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.a$a */
    static final class a extends Lambda implements Function0<C10045x> {

        /* renamed from: f */
        final /* synthetic */ C9957g f37958f;

        /* renamed from: g */
        final /* synthetic */ InterfaceC10558g f37959g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C9957g c9957g, InterfaceC10558g interfaceC10558g) {
            super(0);
            this.f37958f = c9957g;
            this.f37959g = interfaceC10558g;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C10045x invoke() {
            return C9951a.m33236g(this.f37958f, this.f37959g.getAnnotations());
        }
    }

    /* compiled from: context.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.a$b */
    static final class b extends Lambda implements Function0<C10045x> {

        /* renamed from: f */
        final /* synthetic */ C9957g f37960f;

        /* renamed from: g */
        final /* synthetic */ InterfaceC10587g f37961g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C9957g c9957g, InterfaceC10587g interfaceC10587g) {
            super(0);
            this.f37960f = c9957g;
            this.f37961g = interfaceC10587g;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C10045x invoke() {
            return C9951a.m33236g(this.f37960f, this.f37961g);
        }
    }

    /* renamed from: a */
    private static final C9957g m33230a(C9957g c9957g, InterfaceC10576m interfaceC10576m, InterfaceC10016z interfaceC10016z, int i2, Lazy<C10045x> lazy) {
        return new C9957g(c9957g.m33282a(), interfaceC10016z != null ? new C9958h(c9957g, interfaceC10576m, interfaceC10016z, i2) : c9957g.m33287f(), lazy);
    }

    /* renamed from: b */
    public static final C9957g m33231b(C9957g c9957g, InterfaceC9961k interfaceC9961k) {
        C9768m.m32346f(c9957g, "<this>");
        C9768m.m32346f(interfaceC9961k, "typeParameterResolver");
        return new C9957g(c9957g.m33282a(), interfaceC9961k, c9957g.m33284c());
    }

    /* renamed from: c */
    public static final C9957g m33232c(C9957g c9957g, InterfaceC10558g interfaceC10558g, InterfaceC10016z interfaceC10016z, int i2) {
        Lazy m37593a;
        C9768m.m32346f(c9957g, "<this>");
        C9768m.m32346f(interfaceC10558g, "containingDeclaration");
        m37593a = C10517i.m37593a(LazyThreadSafetyMode.NONE, new a(c9957g, interfaceC10558g));
        return m33230a(c9957g, interfaceC10558g, interfaceC10016z, i2, m37593a);
    }

    /* renamed from: d */
    public static /* synthetic */ C9957g m33233d(C9957g c9957g, InterfaceC10558g interfaceC10558g, InterfaceC10016z interfaceC10016z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            interfaceC10016z = null;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return m33232c(c9957g, interfaceC10558g, interfaceC10016z, i2);
    }

    /* renamed from: e */
    public static final C9957g m33234e(C9957g c9957g, InterfaceC10576m interfaceC10576m, InterfaceC10016z interfaceC10016z, int i2) {
        C9768m.m32346f(c9957g, "<this>");
        C9768m.m32346f(interfaceC10576m, "containingDeclaration");
        C9768m.m32346f(interfaceC10016z, "typeParameterOwner");
        return m33230a(c9957g, interfaceC10576m, interfaceC10016z, i2, c9957g.m33284c());
    }

    /* renamed from: f */
    public static /* synthetic */ C9957g m33235f(C9957g c9957g, InterfaceC10576m interfaceC10576m, InterfaceC10016z interfaceC10016z, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return m33234e(c9957g, interfaceC10576m, interfaceC10016z, i2);
    }

    /* renamed from: g */
    public static final C10045x m33236g(C9957g c9957g, InterfaceC10587g interfaceC10587g) {
        C9768m.m32346f(c9957g, "<this>");
        C9768m.m32346f(interfaceC10587g, "additionalAnnotations");
        return c9957g.m33282a().m33241a().m33035c(c9957g.m33283b(), interfaceC10587g);
    }

    /* renamed from: h */
    public static final C9957g m33237h(C9957g c9957g, InterfaceC10587g interfaceC10587g) {
        Lazy m37593a;
        C9768m.m32346f(c9957g, "<this>");
        C9768m.m32346f(interfaceC10587g, "additionalAnnotations");
        if (interfaceC10587g.isEmpty()) {
            return c9957g;
        }
        C9952b m33282a = c9957g.m33282a();
        InterfaceC9961k m33287f = c9957g.m33287f();
        m37593a = C10517i.m37593a(LazyThreadSafetyMode.NONE, new b(c9957g, interfaceC10587g));
        return new C9957g(m33282a, m33287f, m37593a);
    }

    /* renamed from: i */
    public static final C9957g m33238i(C9957g c9957g, C9952b c9952b) {
        C9768m.m32346f(c9957g, "<this>");
        C9768m.m32346f(c9952b, "components");
        return new C9957g(c9952b, c9957g.m33287f(), c9957g.m33284c());
    }
}
