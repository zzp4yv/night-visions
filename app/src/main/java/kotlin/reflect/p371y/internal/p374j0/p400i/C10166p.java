package kotlin.reflect.p371y.internal.p374j0.p400i;

import java.util.Collection;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10695t;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;

/* compiled from: VisibilityUtil.kt */
/* renamed from: kotlin.f0.y.e.j0.i.p */
/* loaded from: classes3.dex */
public final class C10166p {
    /* renamed from: a */
    public static final InterfaceC10543b m35990a(Collection<? extends InterfaceC10543b> collection) {
        Integer m38129d;
        C9768m.m32346f(collection, "descriptors");
        collection.isEmpty();
        InterfaceC10543b interfaceC10543b = null;
        for (InterfaceC10543b interfaceC10543b2 : collection) {
            if (interfaceC10543b == null || ((m38129d = C10695t.m38129d(interfaceC10543b.getVisibility(), interfaceC10543b2.getVisibility())) != null && m38129d.intValue() < 0)) {
                interfaceC10543b = interfaceC10543b2;
            }
        }
        C9768m.m32343c(interfaceC10543b);
        return interfaceC10543b;
    }
}
