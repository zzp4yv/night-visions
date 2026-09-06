package kotlin.jvm.internal;

import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty2;

/* compiled from: ReflectionFactory.java */
/* renamed from: kotlin.a0.d.h0 */
/* loaded from: classes2.dex */
public class C9759h0 {
    /* renamed from: a */
    public KFunction mo32308a(C9760i c9760i) {
        return c9760i;
    }

    /* renamed from: b */
    public KClass mo32309b(Class cls) {
        return new ClassReference(cls);
    }

    /* renamed from: c */
    public KDeclarationContainer mo32310c(Class cls, String str) {
        return new PackageReference(cls, str);
    }

    /* renamed from: d */
    public KMutableProperty0 mo32311d(AbstractC9777p abstractC9777p) {
        return abstractC9777p;
    }

    /* renamed from: e */
    public KMutableProperty1 mo32312e(AbstractC9779r abstractC9779r) {
        return abstractC9779r;
    }

    /* renamed from: f */
    public KProperty0 mo32313f(AbstractC9783v abstractC9783v) {
        return abstractC9783v;
    }

    /* renamed from: g */
    public KProperty1 mo32314g(AbstractC9785x abstractC9785x) {
        return abstractC9785x;
    }

    /* renamed from: h */
    public KProperty2 mo32315h(AbstractC9787z abstractC9787z) {
        return abstractC9787z;
    }

    /* renamed from: i */
    public String mo32316i(FunctionBase functionBase) {
        String obj = functionBase.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    /* renamed from: j */
    public String mo32317j(Lambda lambda) {
        return mo32316i(lambda);
    }
}
