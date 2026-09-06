package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p386m;

import kotlin.collections.C10787v0;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.EnumC9940k;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10324i1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10353s0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10356t0;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1;

/* compiled from: JavaTypeResolver.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.m.d */
/* loaded from: classes2.dex */
public final class C9978d {

    /* renamed from: a */
    private static final C10127c f38171a = new C10127c("java.lang.Class");

    /* renamed from: b */
    public static final InterfaceC10318g1 m33528b(InterfaceC10554e1 interfaceC10554e1, C9975a c9975a) {
        C9768m.m32346f(interfaceC10554e1, "typeParameter");
        C9768m.m32346f(c9975a, "attr");
        return c9975a.m33503e() == EnumC9940k.SUPERTYPE ? new C10324i1(C10356t0.m36828b(interfaceC10554e1)) : new C10353s0(interfaceC10554e1);
    }

    /* renamed from: c */
    public static final C9975a m33529c(EnumC9940k enumC9940k, boolean z, InterfaceC10554e1 interfaceC10554e1) {
        C9768m.m32346f(enumC9940k, "<this>");
        return new C9975a(enumC9940k, null, z, interfaceC10554e1 != null ? C10787v0.m38916c(interfaceC10554e1) : null, null, 18, null);
    }

    /* renamed from: d */
    public static /* synthetic */ C9975a m33530d(EnumC9940k enumC9940k, boolean z, InterfaceC10554e1 interfaceC10554e1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            interfaceC10554e1 = null;
        }
        return m33529c(enumC9940k, z, interfaceC10554e1);
    }
}
