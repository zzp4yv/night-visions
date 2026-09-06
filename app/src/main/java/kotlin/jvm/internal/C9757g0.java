package kotlin.jvm.internal;

import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty2;
import okhttp3.HttpUrl;

/* compiled from: Reflection.java */
/* renamed from: kotlin.a0.d.g0 */
/* loaded from: classes2.dex */
public class C9757g0 {

    /* renamed from: a */
    private static final C9759h0 f37180a;

    /* renamed from: b */
    private static final KClass[] f37181b;

    static {
        C9759h0 c9759h0 = null;
        try {
            c9759h0 = (C9759h0) Class.forName("kotlin.f0.y.e.b0").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c9759h0 == null) {
            c9759h0 = new C9759h0();
        }
        f37180a = c9759h0;
        f37181b = new KClass[0];
    }

    /* renamed from: a */
    public static KFunction m32297a(C9760i c9760i) {
        return f37180a.mo32308a(c9760i);
    }

    /* renamed from: b */
    public static KClass m32298b(Class cls) {
        return f37180a.mo32309b(cls);
    }

    /* renamed from: c */
    public static KDeclarationContainer m32299c(Class cls) {
        return f37180a.mo32310c(cls, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* renamed from: d */
    public static KDeclarationContainer m32300d(Class cls, String str) {
        return f37180a.mo32310c(cls, str);
    }

    /* renamed from: e */
    public static KMutableProperty0 m32301e(AbstractC9777p abstractC9777p) {
        return f37180a.mo32311d(abstractC9777p);
    }

    /* renamed from: f */
    public static KMutableProperty1 m32302f(AbstractC9779r abstractC9779r) {
        return f37180a.mo32312e(abstractC9779r);
    }

    /* renamed from: g */
    public static KProperty0 m32303g(AbstractC9783v abstractC9783v) {
        return f37180a.mo32313f(abstractC9783v);
    }

    /* renamed from: h */
    public static KProperty1 m32304h(AbstractC9785x abstractC9785x) {
        return f37180a.mo32314g(abstractC9785x);
    }

    /* renamed from: i */
    public static KProperty2 m32305i(AbstractC9787z abstractC9787z) {
        return f37180a.mo32315h(abstractC9787z);
    }

    /* renamed from: j */
    public static String m32306j(FunctionBase functionBase) {
        return f37180a.mo32316i(functionBase);
    }

    /* renamed from: k */
    public static String m32307k(Lambda lambda) {
        return f37180a.mo32317j(lambda);
    }
}
