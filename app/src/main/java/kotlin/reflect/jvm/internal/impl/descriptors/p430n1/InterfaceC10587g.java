package kotlin.reflect.jvm.internal.impl.descriptors.p430n1;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10784u;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;

/* compiled from: Annotations.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n1.g */
/* loaded from: classes2.dex */
public interface InterfaceC10587g extends Iterable<InterfaceC10583c>, KMappedMarker {

    /* renamed from: c */
    public static final a f40808c = a.f40809a;

    /* compiled from: Annotations.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n1.g$a */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f40809a = new a();

        /* renamed from: b */
        private static final InterfaceC10587g f40810b = new C11530a();

        /* compiled from: Annotations.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n1.g$a$a, reason: collision with other inner class name */
        public static final class C11530a implements InterfaceC10587g {
            C11530a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g
            /* renamed from: R0 */
            public boolean mo33270R0(C10127c c10127c) {
                return b.m37738b(this, c10127c);
            }

            /* renamed from: c */
            public Void m37736c(C10127c c10127c) {
                C9768m.m32346f(c10127c, "fqName");
                return null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g
            public boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            public Iterator<InterfaceC10583c> iterator() {
                return C10784u.m38888j().iterator();
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g
            /* renamed from: l */
            public /* bridge */ /* synthetic */ InterfaceC10583c mo33271l(C10127c c10127c) {
                return (InterfaceC10583c) m37736c(c10127c);
            }

            public String toString() {
                return "EMPTY";
            }
        }

        private a() {
        }

        /* renamed from: a */
        public final InterfaceC10587g m37734a(List<? extends InterfaceC10583c> list) {
            C9768m.m32346f(list, "annotations");
            return list.isEmpty() ? f40810b : new C10588h(list);
        }

        /* renamed from: b */
        public final InterfaceC10587g m37735b() {
            return f40810b;
        }
    }

    /* compiled from: Annotations.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n1.g$b */
    public static final class b {
        /* renamed from: a */
        public static InterfaceC10583c m37737a(InterfaceC10587g interfaceC10587g, C10127c c10127c) {
            InterfaceC10583c interfaceC10583c;
            C9768m.m32346f(c10127c, "fqName");
            Iterator<InterfaceC10583c> it = interfaceC10587g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    interfaceC10583c = null;
                    break;
                }
                interfaceC10583c = it.next();
                if (C9768m.m32341a(interfaceC10583c.mo33162d(), c10127c)) {
                    break;
                }
            }
            return interfaceC10583c;
        }

        /* renamed from: b */
        public static boolean m37738b(InterfaceC10587g interfaceC10587g, C10127c c10127c) {
            C9768m.m32346f(c10127c, "fqName");
            return interfaceC10587g.mo33271l(c10127c) != null;
        }
    }

    /* renamed from: R0 */
    boolean mo33270R0(C10127c c10127c);

    boolean isEmpty();

    /* renamed from: l */
    InterfaceC10583c mo33271l(C10127c c10127c);
}
