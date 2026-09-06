package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty2;

/* compiled from: PropertyReference2.java */
/* renamed from: kotlin.a0.d.z */
/* loaded from: classes2.dex */
public abstract class AbstractC9787z extends AbstractC9747b0 implements KProperty2 {
    public AbstractC9787z(Class cls, String str, String str2, int i2) {
        super(AbstractC9748c.NO_RECEIVER, cls, str, str2, i2);
    }

    @Override // kotlin.jvm.internal.AbstractC9748c
    protected KCallable computeReflected() {
        return C9757g0.m32305i(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return mo32280t(obj, obj2);
    }

    @Override // kotlin.reflect.KProperty
    public KProperty2.a getGetter() {
        return ((KProperty2) getReflected()).getGetter();
    }
}
