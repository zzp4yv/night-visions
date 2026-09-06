package kotlin.reflect.jvm.internal.impl.descriptors.p433q1;

import cm.aptoide.p092pt.downloadmanager.Constants;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10578m1;
import kotlin.reflect.jvm.internal.impl.descriptors.C10575l1;

/* compiled from: JavaVisibilities.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.q1.a */
/* loaded from: classes2.dex */
public final class C10646a extends AbstractC10578m1 {

    /* renamed from: c */
    public static final C10646a f41130c = new C10646a();

    private C10646a() {
        super(Constants.PACKAGE, false);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10578m1
    /* renamed from: a */
    public Integer mo37720a(AbstractC10578m1 abstractC10578m1) {
        C9768m.m32346f(abstractC10578m1, "visibility");
        if (this == abstractC10578m1) {
            return 0;
        }
        return C10575l1.f40770a.m37716b(abstractC10578m1) ? 1 : -1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10578m1
    /* renamed from: b */
    public String mo37717b() {
        return "public/*package*/";
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10578m1
    /* renamed from: d */
    public AbstractC10578m1 mo37722d() {
        return C10575l1.g.f40779c;
    }
}
