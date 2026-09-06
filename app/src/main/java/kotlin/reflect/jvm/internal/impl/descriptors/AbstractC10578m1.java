package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.C9768m;

/* compiled from: Visibility.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.m1 */
/* loaded from: classes2.dex */
public abstract class AbstractC10578m1 {

    /* renamed from: a */
    private final String f40785a;

    /* renamed from: b */
    private final boolean f40786b;

    protected AbstractC10578m1(String str, boolean z) {
        C9768m.m32346f(str, "name");
        this.f40785a = str;
        this.f40786b = z;
    }

    /* renamed from: a */
    public Integer mo37720a(AbstractC10578m1 abstractC10578m1) {
        C9768m.m32346f(abstractC10578m1, "visibility");
        return C10575l1.f40770a.m37715a(this, abstractC10578m1);
    }

    /* renamed from: b */
    public String mo37717b() {
        return this.f40785a;
    }

    /* renamed from: c */
    public final boolean m37721c() {
        return this.f40786b;
    }

    /* renamed from: d */
    public AbstractC10578m1 mo37722d() {
        return this;
    }

    public final String toString() {
        return mo37717b();
    }
}
