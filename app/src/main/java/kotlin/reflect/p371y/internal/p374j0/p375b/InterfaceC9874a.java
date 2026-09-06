package kotlin.reflect.p371y.internal.p374j0.p375b;

import java.util.ServiceLoader;
import kotlin.C10517i;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.C10780s;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10574l0;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10597a;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10598b;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10599c;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;

/* compiled from: BuiltInsLoader.kt */
/* renamed from: kotlin.f0.y.e.j0.b.a */
/* loaded from: classes2.dex */
public interface InterfaceC9874a {

    /* renamed from: a */
    public static final a f37446a = a.f37447a;

    /* compiled from: BuiltInsLoader.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.a$a */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f37447a = new a();

        /* renamed from: b */
        private static final Lazy<InterfaceC9874a> f37448b;

        /* compiled from: BuiltInsLoader.kt */
        /* renamed from: kotlin.f0.y.e.j0.b.a$a$a, reason: collision with other inner class name */
        static final class C11493a extends Lambda implements Function0<InterfaceC9874a> {

            /* renamed from: f */
            public static final C11493a f37449f = new C11493a();

            C11493a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final InterfaceC9874a invoke() {
                ServiceLoader load = ServiceLoader.load(InterfaceC9874a.class, InterfaceC9874a.class.getClassLoader());
                C9768m.m32345e(load, "implementations");
                InterfaceC9874a interfaceC9874a = (InterfaceC9874a) C10780s.m38831V(load);
                if (interfaceC9874a != null) {
                    return interfaceC9874a;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            }
        }

        static {
            Lazy<InterfaceC9874a> m37593a;
            m37593a = C10517i.m37593a(LazyThreadSafetyMode.PUBLICATION, C11493a.f37449f);
            f37448b = m37593a;
        }

        private a() {
        }

        /* renamed from: a */
        public final InterfaceC9874a m32698a() {
            return f37448b.getValue();
        }
    }

    /* renamed from: a */
    InterfaceC10574l0 mo32697a(InterfaceC10297n interfaceC10297n, InterfaceC10559g0 interfaceC10559g0, Iterable<? extends InterfaceC10598b> iterable, InterfaceC10599c interfaceC10599c, InterfaceC10597a interfaceC10597a, boolean z);
}
