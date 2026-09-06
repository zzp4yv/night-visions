package kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;

/* compiled from: ImplicitClassReceiver.kt */
/* renamed from: kotlin.f0.y.e.j0.i.w.o.e */
/* loaded from: classes3.dex */
public class C10229e implements InterfaceC10230f, InterfaceC10232h {

    /* renamed from: a */
    private final InterfaceC10552e f39692a;

    /* renamed from: b */
    private final C10229e f39693b;

    /* renamed from: c */
    private final InterfaceC10552e f39694c;

    public C10229e(InterfaceC10552e interfaceC10552e, C10229e c10229e) {
        C9768m.m32346f(interfaceC10552e, "classDescriptor");
        this.f39692a = interfaceC10552e;
        this.f39693b = c10229e == null ? this : c10229e;
        this.f39694c = interfaceC10552e;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o.InterfaceC10230f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC10335m0 getType() {
        AbstractC10335m0 mo36400s = this.f39692a.mo36400s();
        C9768m.m32345e(mo36400s, "classDescriptor.defaultType");
        return mo36400s;
    }

    public boolean equals(Object obj) {
        InterfaceC10552e interfaceC10552e = this.f39692a;
        C10229e c10229e = obj instanceof C10229e ? (C10229e) obj : null;
        return C9768m.m32341a(interfaceC10552e, c10229e != null ? c10229e.f39692a : null);
    }

    public int hashCode() {
        return this.f39692a.hashCode();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o.InterfaceC10232h
    /* renamed from: r */
    public final InterfaceC10552e mo36183r() {
        return this.f39692a;
    }

    public String toString() {
        return "Class{" + getType() + '}';
    }
}
