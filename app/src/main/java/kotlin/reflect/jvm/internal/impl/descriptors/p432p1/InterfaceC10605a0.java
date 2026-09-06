package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10556f0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10603p0;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;

/* compiled from: PackageViewDescriptorFactory.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.a0 */
/* loaded from: classes2.dex */
public interface InterfaceC10605a0 {

    /* renamed from: a */
    public static final a f40902a = a.f40903a;

    /* compiled from: PackageViewDescriptorFactory.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.a0$a */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f40903a = new a();

        /* renamed from: b */
        private static final C10556f0<InterfaceC10605a0> f40904b = new C10556f0<>("PackageViewDescriptorFactory");

        private a() {
        }

        /* renamed from: a */
        public final C10556f0<InterfaceC10605a0> m37759a() {
            return f40904b;
        }
    }

    /* compiled from: PackageViewDescriptorFactory.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.a0$b */
    public static final class b implements InterfaceC10605a0 {

        /* renamed from: b */
        public static final b f40905b = new b();

        private b() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.InterfaceC10605a0
        /* renamed from: a */
        public InterfaceC10603p0 mo37758a(C10641x c10641x, C10127c c10127c, InterfaceC10297n interfaceC10297n) {
            C9768m.m32346f(c10641x, "module");
            C9768m.m32346f(c10127c, "fqName");
            C9768m.m32346f(interfaceC10297n, "storageManager");
            return new C10635r(c10641x, c10127c, interfaceC10297n);
        }
    }

    /* renamed from: a */
    InterfaceC10603p0 mo37758a(C10641x c10641x, C10127c c10127c, InterfaceC10297n interfaceC10297n);
}
