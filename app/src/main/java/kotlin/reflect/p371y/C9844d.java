package kotlin.reflect.p371y;

import kotlin.Function;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9757g0;
import kotlin.jvm.internal.C9760i;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10706y0;
import kotlin.reflect.p371y.internal.C9858g0;
import kotlin.reflect.p371y.internal.EmptyContainerForLocal;
import kotlin.reflect.p371y.internal.KFunctionImpl;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10097i;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10108t;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10084e;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10085f;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10088i;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10122g;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10280w;

/* compiled from: reflectLambda.kt */
@Metadata(m32266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007¨\u0006\u0004"}, m32267d2 = {"reflect", "Lkotlin/reflect/KFunction;", "R", "Lkotlin/Function;", "kotlin-reflection"}, m32268k = 2, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.d */
/* loaded from: classes.dex */
public final class C9844d {

    /* compiled from: reflectLambda.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.d$a */
    /* synthetic */ class a extends C9760i implements Function2<C10280w, C10097i, InterfaceC10706y0> {

        /* renamed from: h */
        public static final a f37265h = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.internal.AbstractC9748c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getF40571m() {
            return "loadFunction";
        }

        @Override // kotlin.jvm.internal.AbstractC9748c
        public final KDeclarationContainer getOwner() {
            return C9757g0.m32298b(C10280w.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9748c
        public final String getSignature() {
            return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10706y0 invoke(C10280w c10280w, C10097i c10097i) {
            C9768m.m32346f(c10280w, "p0");
            C9768m.m32346f(c10097i, "p1");
            return c10280w.m36487j(c10097i);
        }
    }

    /* renamed from: a */
    public static final <R> KFunction<R> m32471a(Function<? extends R> function) {
        C9768m.m32346f(function, "<this>");
        Metadata metadata = (Metadata) function.getClass().getAnnotation(Metadata.class);
        if (metadata == null) {
            return null;
        }
        String[] m32266d1 = metadata.m32266d1();
        if (m32266d1.length == 0) {
            m32266d1 = null;
        }
        if (m32266d1 == null) {
            return null;
        }
        Pair<C10085f, C10097i> m34261j = C10088i.m34261j(m32266d1, metadata.m32267d2());
        C10085f m37646a = m34261j.m37646a();
        C10097i m37647b = m34261j.m37647b();
        C10084e c10084e = new C10084e(metadata.m32269mv(), (metadata.m32271xi() & 8) != 0);
        Class<?> cls = function.getClass();
        C10108t m34732n0 = m37647b.m34732n0();
        C9768m.m32345e(m34732n0, "proto.typeTable");
        return new KFunctionImpl(EmptyContainerForLocal.f37272i, (InterfaceC10706y0) C9858g0.m32563h(cls, m37647b, m37646a, new C10122g(m34732n0), c10084e, a.f37265h));
    }
}
