package kotlin.reflect.p371y.internal.p374j0.p410j.p411b;

import kotlin.Pair;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10097i;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10122g;

/* compiled from: ContractDeserializer.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.j */
/* loaded from: classes3.dex */
public interface InterfaceC10267j {

    /* renamed from: a */
    public static final a f39908a = a.f39909a;

    /* compiled from: ContractDeserializer.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.j$a */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f39909a = new a();

        /* renamed from: b */
        private static final InterfaceC10267j f39910b = new C11520a();

        /* compiled from: ContractDeserializer.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.j$a$a, reason: collision with other inner class name */
        public static final class C11520a implements InterfaceC10267j {
            C11520a() {
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10267j
            /* renamed from: a */
            public Pair mo36414a(C10097i c10097i, InterfaceC10705y interfaceC10705y, C10122g c10122g, C10242d0 c10242d0) {
                C9768m.m32346f(c10097i, "proto");
                C9768m.m32346f(interfaceC10705y, "ownerFunction");
                C9768m.m32346f(c10122g, "typeTable");
                C9768m.m32346f(c10242d0, "typeDeserializer");
                return null;
            }
        }

        private a() {
        }

        /* renamed from: a */
        public final InterfaceC10267j m36415a() {
            return f39910b;
        }
    }

    /* renamed from: a */
    Pair<InterfaceC10540a.a<?>, Object> mo36414a(C10097i c10097i, InterfaceC10705y interfaceC10705y, C10122g c10122g, C10242d0 c10242d0);
}
