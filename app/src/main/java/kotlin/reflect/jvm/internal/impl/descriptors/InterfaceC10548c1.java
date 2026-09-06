package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import kotlin.C10742u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1;

/* compiled from: SupertypeLoopChecker.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.c1 */
/* loaded from: classes2.dex */
public interface InterfaceC10548c1 {

    /* compiled from: SupertypeLoopChecker.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.c1$a */
    public static final class a implements InterfaceC10548c1 {

        /* renamed from: a */
        public static final a f40737a = new a();

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10548c1
        /* renamed from: a */
        public Collection<AbstractC10311e0> mo37674a(InterfaceC10312e1 interfaceC10312e1, Collection<? extends AbstractC10311e0> collection, Function1<? super InterfaceC10312e1, ? extends Iterable<? extends AbstractC10311e0>> function1, Function1<? super AbstractC10311e0, C10742u> function12) {
            C9768m.m32346f(interfaceC10312e1, "currentTypeConstructor");
            C9768m.m32346f(collection, "superTypes");
            C9768m.m32346f(function1, "neighbors");
            C9768m.m32346f(function12, "reportLoop");
            return collection;
        }
    }

    /* renamed from: a */
    Collection<AbstractC10311e0> mo37674a(InterfaceC10312e1 interfaceC10312e1, Collection<? extends AbstractC10311e0> collection, Function1<? super InterfaceC10312e1, ? extends Iterable<? extends AbstractC10311e0>> function1, Function1<? super AbstractC10311e0, C10742u> function12);
}
