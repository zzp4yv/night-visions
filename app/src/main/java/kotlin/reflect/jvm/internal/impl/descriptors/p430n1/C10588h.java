package kotlin.reflect.jvm.internal.impl.descriptors.p430n1;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;

/* compiled from: AnnotationsImpl.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n1.h */
/* loaded from: classes2.dex */
public final class C10588h implements InterfaceC10587g {

    /* renamed from: f */
    private final List<InterfaceC10583c> f40811f;

    /* JADX WARN: Multi-variable type inference failed */
    public C10588h(List<? extends InterfaceC10583c> list) {
        C9768m.m32346f(list, "annotations");
        this.f40811f = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g
    /* renamed from: R0 */
    public boolean mo33270R0(C10127c c10127c) {
        return InterfaceC10587g.b.m37738b(this, c10127c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g
    public boolean isEmpty() {
        return this.f40811f.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<InterfaceC10583c> iterator() {
        return this.f40811f.iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g
    /* renamed from: l */
    public InterfaceC10583c mo33271l(C10127c c10127c) {
        return InterfaceC10587g.b.m37737a(this, c10127c);
    }

    public String toString() {
        return this.f40811f.toString();
    }
}
