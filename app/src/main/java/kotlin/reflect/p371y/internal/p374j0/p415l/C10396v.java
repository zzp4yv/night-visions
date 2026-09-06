package kotlin.reflect.p371y.internal.p374j0.p415l;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p399h.AbstractC10139c;
import kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10142f;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10406f;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10424a;

/* compiled from: dynamicTypes.kt */
/* renamed from: kotlin.f0.y.e.j0.l.v */
/* loaded from: classes3.dex */
public final class C10396v extends AbstractC10425y implements InterfaceC10406f {

    /* renamed from: i */
    private final C10300a1 f40362i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C10396v(kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h r3, kotlin.reflect.p371y.internal.p374j0.p415l.C10300a1 r4) {
        /*
            r2 = this;
            java.lang.String r0 = "builtIns"
            kotlin.jvm.internal.C9768m.m32346f(r3, r0)
            java.lang.String r0 = "attributes"
            kotlin.jvm.internal.C9768m.m32346f(r4, r0)
            kotlin.f0.y.e.j0.l.m0 r0 = r3.m32773H()
            java.lang.String r1 = "builtIns.nothingType"
            kotlin.jvm.internal.C9768m.m32345e(r0, r1)
            kotlin.f0.y.e.j0.l.m0 r3 = r3.m32774I()
            java.lang.String r1 = "builtIns.nullableAnyType"
            kotlin.jvm.internal.C9768m.m32345e(r3, r1)
            r2.<init>(r0, r3)
            r2.f40362i = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p415l.C10396v.<init>(kotlin.f0.y.e.j0.b.h, kotlin.f0.y.e.j0.l.a1):void");
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10425y, kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: N0 */
    public C10300a1 mo35992N0() {
        return this.f40362i;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10425y, kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: P0 */
    public boolean mo33691P0() {
        return false;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10425y
    /* renamed from: V0 */
    public AbstractC10335m0 mo33548V0() {
        return m37162X0();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10425y
    /* renamed from: Y0 */
    public String mo33549Y0(AbstractC10139c abstractC10139c, InterfaceC10142f interfaceC10142f) {
        C9768m.m32346f(abstractC10139c, "renderer");
        C9768m.m32346f(interfaceC10142f, "options");
        return "dynamic";
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public C10396v mo33545S0(boolean z) {
        return this;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public C10396v mo36558Y0(AbstractC10363g abstractC10363g) {
        C9768m.m32346f(abstractC10363g, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public C10396v mo33547U0(C10300a1 c10300a1) {
        C9768m.m32346f(c10300a1, "newAttributes");
        return new C10396v(C10424a.m37142h(mo33548V0()), c10300a1);
    }
}
