package kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9757g0;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.C9786y;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10296m;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10292i;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;

/* compiled from: DeserializedAnnotations.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.g0.a */
/* loaded from: classes3.dex */
public class C10251a implements InterfaceC10587g {

    /* renamed from: f */
    static final /* synthetic */ KProperty<Object>[] f39762f = {C9757g0.m32304h(new C9786y(C9757g0.m32298b(C10251a.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: g */
    private final InterfaceC10292i f39763g;

    public C10251a(InterfaceC10297n interfaceC10297n, Function0<? extends List<? extends InterfaceC10583c>> function0) {
        C9768m.m32346f(interfaceC10297n, "storageManager");
        C9768m.m32346f(function0, "compute");
        this.f39763g = interfaceC10297n.mo36516d(function0);
    }

    /* renamed from: c */
    private final List<InterfaceC10583c> m36256c() {
        return (List) C10296m.m36555a(this.f39763g, this, f39762f[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g
    /* renamed from: R0 */
    public boolean mo33270R0(C10127c c10127c) {
        return InterfaceC10587g.b.m37738b(this, c10127c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g
    public boolean isEmpty() {
        return m36256c().isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<InterfaceC10583c> iterator() {
        return m36256c().iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g
    /* renamed from: l */
    public InterfaceC10583c mo33271l(C10127c c10127c) {
        return InterfaceC10587g.b.m37737a(this, c10127c);
    }
}
