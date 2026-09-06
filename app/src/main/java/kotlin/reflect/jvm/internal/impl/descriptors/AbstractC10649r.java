package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.C9768m;

/* compiled from: DescriptorVisibility.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r */
/* loaded from: classes2.dex */
public abstract class AbstractC10649r extends AbstractC10697u {

    /* renamed from: a */
    private final AbstractC10578m1 f41133a;

    public AbstractC10649r(AbstractC10578m1 abstractC10578m1) {
        C9768m.m32346f(abstractC10578m1, "delegate");
        this.f41133a = abstractC10578m1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10697u
    /* renamed from: b */
    public AbstractC10578m1 mo38007b() {
        return this.f41133a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10697u
    /* renamed from: c */
    public String mo38008c() {
        return mo38007b().mo37717b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10697u
    /* renamed from: f */
    public AbstractC10697u mo38009f() {
        AbstractC10697u m38135j = C10695t.m38135j(mo38007b().mo37722d());
        C9768m.m32345e(m38135j, "toDescriptorVisibility(delegate.normalize())");
        return m38135j;
    }
}
