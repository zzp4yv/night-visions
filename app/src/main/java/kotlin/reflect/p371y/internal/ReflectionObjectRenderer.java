package kotlin.reflect.p371y.internal;

import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C10749c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10702w0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p399h.AbstractC10139c;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import okhttp3.HttpUrl;

/* compiled from: ReflectionObjectRenderer.kt */
@Metadata(m32266d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014J\u001a\u0010\u0015\u001a\u00020\u0016*\u00060\u0017j\u0002`\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\u0018\u0010\u001b\u001a\u00020\u0016*\u00060\u0017j\u0002`\u00182\u0006\u0010\u001c\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "renderer", "Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRenderer;", "renderCallable", HttpUrl.FRAGMENT_ENCODE_SET, "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;", "renderFunction", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "renderLambda", "invoke", "renderParameter", MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "Lkotlin/reflect/jvm/internal/KParameterImpl;", "renderProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "renderType", "type", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "appendReceiverType", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "receiver", "Lkotlin/reflect/jvm/internal/impl/descriptors/ReceiverParameterDescriptor;", "appendReceivers", "callable", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.c0, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class ReflectionObjectRenderer {

    /* renamed from: a */
    public static final ReflectionObjectRenderer f37273a = new ReflectionObjectRenderer();

    /* renamed from: b */
    private static final AbstractC10139c f37274b = AbstractC10139c.f39377g;

    /* compiled from: ReflectionObjectRenderer.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.c0$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37275a;

        static {
            int[] iArr = new int[KParameter.a.values().length];
            iArr[KParameter.a.EXTENSION_RECEIVER.ordinal()] = 1;
            iArr[KParameter.a.INSTANCE.ordinal()] = 2;
            iArr[KParameter.a.VALUE.ordinal()] = 3;
            f37275a = iArr;
        }
    }

    /* compiled from: ReflectionObjectRenderer.kt */
    @Metadata(m32266d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "it", "Lkotlin/reflect/jvm/internal/impl/descriptors/ValueParameterDescriptor;", "kotlin.jvm.PlatformType", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.c0$b */
    static final class b extends Lambda implements Function1<InterfaceC10566i1, CharSequence> {

        /* renamed from: f */
        public static final b f37276f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(InterfaceC10566i1 interfaceC10566i1) {
            ReflectionObjectRenderer reflectionObjectRenderer = ReflectionObjectRenderer.f37273a;
            AbstractC10311e0 type = interfaceC10566i1.getType();
            C9768m.m32345e(type, "it.type");
            return reflectionObjectRenderer.m32503h(type);
        }
    }

    /* compiled from: ReflectionObjectRenderer.kt */
    @Metadata(m32266d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "it", "Lkotlin/reflect/jvm/internal/impl/descriptors/ValueParameterDescriptor;", "kotlin.jvm.PlatformType", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.c0$c */
    static final class c extends Lambda implements Function1<InterfaceC10566i1, CharSequence> {

        /* renamed from: f */
        public static final c f37277f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(InterfaceC10566i1 interfaceC10566i1) {
            ReflectionObjectRenderer reflectionObjectRenderer = ReflectionObjectRenderer.f37273a;
            AbstractC10311e0 type = interfaceC10566i1.getType();
            C9768m.m32345e(type, "it.type");
            return reflectionObjectRenderer.m32503h(type);
        }
    }

    private ReflectionObjectRenderer() {
    }

    /* renamed from: a */
    private final void m32496a(StringBuilder sb, InterfaceC10702w0 interfaceC10702w0) {
        if (interfaceC10702w0 != null) {
            AbstractC10311e0 type = interfaceC10702w0.getType();
            C9768m.m32345e(type, "receiver.type");
            sb.append(m32503h(type));
            sb.append(".");
        }
    }

    /* renamed from: b */
    private final void m32497b(StringBuilder sb, InterfaceC10540a interfaceC10540a) {
        InterfaceC10702w0 m32564i = C9858g0.m32564i(interfaceC10540a);
        InterfaceC10702w0 mo37032m0 = interfaceC10540a.mo37032m0();
        m32496a(sb, m32564i);
        boolean z = (m32564i == null || mo37032m0 == null) ? false : true;
        if (z) {
            sb.append("(");
        }
        m32496a(sb, mo37032m0);
        if (z) {
            sb.append(")");
        }
    }

    /* renamed from: c */
    private final String m32498c(InterfaceC10540a interfaceC10540a) {
        if (interfaceC10540a instanceof InterfaceC10696t0) {
            return m32502g((InterfaceC10696t0) interfaceC10540a);
        }
        if (interfaceC10540a instanceof InterfaceC10705y) {
            return m32499d((InterfaceC10705y) interfaceC10540a);
        }
        throw new IllegalStateException(("Illegal callable: " + interfaceC10540a).toString());
    }

    /* renamed from: d */
    public final String m32499d(InterfaceC10705y interfaceC10705y) {
        C9768m.m32346f(interfaceC10705y, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append("fun ");
        ReflectionObjectRenderer reflectionObjectRenderer = f37273a;
        reflectionObjectRenderer.m32497b(sb, interfaceC10705y);
        AbstractC10139c abstractC10139c = f37274b;
        C10130f name = interfaceC10705y.getName();
        C9768m.m32345e(name, "descriptor.name");
        sb.append(abstractC10139c.mo35504v(name, true));
        List<InterfaceC10566i1> mo37028f = interfaceC10705y.mo37028f();
        C9768m.m32345e(mo37028f, "descriptor.valueParameters");
        C10749c0.m38597c0(mo37028f, sb, ", ", "(", ")", 0, null, b.f37276f, 48, null);
        sb.append(": ");
        AbstractC10311e0 returnType = interfaceC10705y.getReturnType();
        C9768m.m32343c(returnType);
        sb.append(reflectionObjectRenderer.m32503h(returnType));
        String sb2 = sb.toString();
        C9768m.m32345e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: e */
    public final String m32500e(InterfaceC10705y interfaceC10705y) {
        C9768m.m32346f(interfaceC10705y, "invoke");
        StringBuilder sb = new StringBuilder();
        ReflectionObjectRenderer reflectionObjectRenderer = f37273a;
        reflectionObjectRenderer.m32497b(sb, interfaceC10705y);
        List<InterfaceC10566i1> mo37028f = interfaceC10705y.mo37028f();
        C9768m.m32345e(mo37028f, "invoke.valueParameters");
        C10749c0.m38597c0(mo37028f, sb, ", ", "(", ")", 0, null, c.f37277f, 48, null);
        sb.append(" -> ");
        AbstractC10311e0 returnType = interfaceC10705y.getReturnType();
        C9768m.m32343c(returnType);
        sb.append(reflectionObjectRenderer.m32503h(returnType));
        String sb2 = sb.toString();
        C9768m.m32345e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: f */
    public final String m32501f(KParameterImpl kParameterImpl) {
        C9768m.m32346f(kParameterImpl, MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
        StringBuilder sb = new StringBuilder();
        int i2 = a.f37275a[kParameterImpl.getF40548i().ordinal()];
        if (i2 == 1) {
            sb.append("extension receiver parameter");
        } else if (i2 == 2) {
            sb.append("instance parameter");
        } else if (i2 == 3) {
            sb.append("parameter #" + kParameterImpl.getF40547h() + ' ' + kParameterImpl.getName());
        }
        sb.append(" of ");
        sb.append(f37273a.m32498c(kParameterImpl.m37284d().mo37304F()));
        String sb2 = sb.toString();
        C9768m.m32345e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: g */
    public final String m32502g(InterfaceC10696t0 interfaceC10696t0) {
        C9768m.m32346f(interfaceC10696t0, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append(interfaceC10696t0.mo37031j0() ? "var " : "val ");
        ReflectionObjectRenderer reflectionObjectRenderer = f37273a;
        reflectionObjectRenderer.m32497b(sb, interfaceC10696t0);
        AbstractC10139c abstractC10139c = f37274b;
        C10130f name = interfaceC10696t0.getName();
        C9768m.m32345e(name, "descriptor.name");
        sb.append(abstractC10139c.mo35504v(name, true));
        sb.append(": ");
        AbstractC10311e0 type = interfaceC10696t0.getType();
        C9768m.m32345e(type, "descriptor.type");
        sb.append(reflectionObjectRenderer.m32503h(type));
        String sb2 = sb.toString();
        C9768m.m32345e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: h */
    public final String m32503h(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, "type");
        return f37274b.mo35505w(abstractC10311e0);
    }
}
