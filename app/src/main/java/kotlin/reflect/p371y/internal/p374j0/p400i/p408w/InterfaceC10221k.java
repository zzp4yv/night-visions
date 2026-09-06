package kotlin.reflect.p371y.internal.p374j0.p400i.p408w;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9906b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;

/* compiled from: ResolutionScope.kt */
/* renamed from: kotlin.f0.y.e.j0.i.w.k */
/* loaded from: classes3.dex */
public interface InterfaceC10221k {

    /* compiled from: ResolutionScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.w.k$a */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static /* synthetic */ Collection m36162a(InterfaceC10221k interfaceC10221k, C10214d c10214d, Function1 function1, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
            }
            if ((i2 & 1) != 0) {
                c10214d = C10214d.f39642m;
            }
            if ((i2 & 2) != 0) {
                function1 = InterfaceC10218h.f39667a.m36159a();
            }
            return interfaceC10221k.mo33317g(c10214d, function1);
        }
    }

    /* renamed from: f */
    InterfaceC10561h mo33316f(C10130f c10130f, InterfaceC9906b interfaceC9906b);

    /* renamed from: g */
    Collection<InterfaceC10576m> mo33317g(C10214d c10214d, Function1<? super C10130f, Boolean> function1);
}
