package kotlin.reflect.jvm.internal.impl.descriptors.p433q1;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10578m1;
import kotlin.reflect.jvm.internal.impl.descriptors.C10575l1;

/* compiled from: JavaVisibilities.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.q1.b */
/* loaded from: classes2.dex */
public final class C10647b extends AbstractC10578m1 {

    /* renamed from: c */
    public static final C10647b f41131c = new C10647b();

    private C10647b() {
        super("protected_and_package", true);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10578m1
    /* renamed from: a */
    public Integer mo37720a(AbstractC10578m1 abstractC10578m1) {
        C9768m.m32346f(abstractC10578m1, "visibility");
        if (C9768m.m32341a(this, abstractC10578m1)) {
            return 0;
        }
        if (abstractC10578m1 == C10575l1.b.f40774c) {
            return null;
        }
        return Integer.valueOf(C10575l1.f40770a.m37716b(abstractC10578m1) ? 1 : -1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10578m1
    /* renamed from: b */
    public String mo37717b() {
        return "protected/*protected and package*/";
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10578m1
    /* renamed from: d */
    public AbstractC10578m1 mo37722d() {
        return C10575l1.g.f40779c;
    }
}
