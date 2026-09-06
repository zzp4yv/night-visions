package kotlin.reflect.p371y.internal;

import kotlin.jvm.internal.AbstractC9748c;
import kotlin.jvm.internal.AbstractC9777p;
import kotlin.jvm.internal.AbstractC9779r;
import kotlin.jvm.internal.AbstractC9783v;
import kotlin.jvm.internal.AbstractC9785x;
import kotlin.jvm.internal.AbstractC9787z;
import kotlin.jvm.internal.C9759h0;
import kotlin.jvm.internal.C9760i;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty2;
import kotlin.reflect.p371y.C9844d;

/* compiled from: ReflectionFactoryImpl.java */
/* renamed from: kotlin.f0.y.e.b0 */
/* loaded from: classes2.dex */
public class C9848b0 extends C9759h0 {
    /* renamed from: k */
    private static KDeclarationContainerImpl m32491k(AbstractC9748c abstractC9748c) {
        KDeclarationContainer owner = abstractC9748c.getOwner();
        return owner instanceof KDeclarationContainerImpl ? (KDeclarationContainerImpl) owner : EmptyContainerForLocal.f37272i;
    }

    @Override // kotlin.jvm.internal.C9759h0
    /* renamed from: a */
    public KFunction mo32308a(C9760i c9760i) {
        return new KFunctionImpl(m32491k(c9760i), c9760i.getF40571m(), c9760i.getSignature(), c9760i.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.C9759h0
    /* renamed from: b */
    public KClass mo32309b(Class cls) {
        return C9857g.m32555a(cls);
    }

    @Override // kotlin.jvm.internal.C9759h0
    /* renamed from: c */
    public KDeclarationContainer mo32310c(Class cls, String str) {
        return new KPackageImpl(cls, str);
    }

    @Override // kotlin.jvm.internal.C9759h0
    /* renamed from: d */
    public KMutableProperty0 mo32311d(AbstractC9777p abstractC9777p) {
        return new KMutableProperty0Impl(m32491k(abstractC9777p), abstractC9777p.getF40571m(), abstractC9777p.getSignature(), abstractC9777p.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.C9759h0
    /* renamed from: e */
    public KMutableProperty1 mo32312e(AbstractC9779r abstractC9779r) {
        return new KMutableProperty1Impl(m32491k(abstractC9779r), abstractC9779r.getF40571m(), abstractC9779r.getSignature(), abstractC9779r.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.C9759h0
    /* renamed from: f */
    public KProperty0 mo32313f(AbstractC9783v abstractC9783v) {
        return new KProperty0Impl(m32491k(abstractC9783v), abstractC9783v.getF40571m(), abstractC9783v.getSignature(), abstractC9783v.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.C9759h0
    /* renamed from: g */
    public KProperty1 mo32314g(AbstractC9785x abstractC9785x) {
        return new KProperty1Impl(m32491k(abstractC9785x), abstractC9785x.getF40571m(), abstractC9785x.getSignature(), abstractC9785x.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.C9759h0
    /* renamed from: h */
    public KProperty2 mo32315h(AbstractC9787z abstractC9787z) {
        return new KProperty2Impl(m32491k(abstractC9787z), abstractC9787z.getF40571m(), abstractC9787z.getSignature());
    }

    @Override // kotlin.jvm.internal.C9759h0
    /* renamed from: i */
    public String mo32316i(FunctionBase functionBase) {
        KFunctionImpl m32558c;
        KFunction m32471a = C9844d.m32471a(functionBase);
        return (m32471a == null || (m32558c = C9858g0.m32558c(m32471a)) == null) ? super.mo32316i(functionBase) : ReflectionObjectRenderer.f37273a.m32500e(m32558c.mo37304F());
    }

    @Override // kotlin.jvm.internal.C9759h0
    /* renamed from: j */
    public String mo32317j(Lambda lambda) {
        return mo32316i(lambda);
    }
}
