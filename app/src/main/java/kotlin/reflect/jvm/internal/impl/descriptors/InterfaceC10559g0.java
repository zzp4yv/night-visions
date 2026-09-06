package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;

/* compiled from: ModuleDescriptor.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.g0 */
/* loaded from: classes2.dex */
public interface InterfaceC10559g0 extends InterfaceC10576m {

    /* compiled from: ModuleDescriptor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.g0$a */
    public static final class a {
        /* renamed from: a */
        public static <R, D> R m37689a(InterfaceC10559g0 interfaceC10559g0, InterfaceC10595o<R, D> interfaceC10595o, D d2) {
            C9768m.m32346f(interfaceC10595o, "visitor");
            return interfaceC10595o.mo35680j(interfaceC10559g0, d2);
        }

        /* renamed from: b */
        public static InterfaceC10576m m37690b(InterfaceC10559g0 interfaceC10559g0) {
            return null;
        }
    }

    /* renamed from: I0 */
    <T> T mo37016I0(C10556f0<T> c10556f0);

    /* renamed from: N */
    InterfaceC10603p0 mo37018N(C10127c c10127c);

    /* renamed from: e0 */
    boolean mo37020e0(InterfaceC10559g0 interfaceC10559g0);

    /* renamed from: o */
    AbstractC9881h mo37021o();

    /* renamed from: p */
    Collection<C10127c> mo37022p(C10127c c10127c, Function1<? super C10130f, Boolean> function1);

    /* renamed from: t0 */
    List<InterfaceC10559g0> mo37023t0();
}
