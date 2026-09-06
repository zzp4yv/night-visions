package kotlin.reflect.p371y.internal.p374j0.p399h;

import java.lang.reflect.Field;
import java.util.Set;
import kotlin.collections.C10789w0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9757g0;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.C9780s;
import kotlin.jvm.internal.C9786y;
import kotlin.jvm.internal.Lambda;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p399h.AbstractC10139c;
import kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10138b;
import kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10142f;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.text.C10513u;

/* compiled from: DescriptorRendererOptionsImpl.kt */
/* renamed from: kotlin.f0.y.e.j0.h.g */
/* loaded from: classes3.dex */
public final class C10143g implements InterfaceC10142f {

    /* renamed from: a */
    static final /* synthetic */ KProperty<Object>[] f39426a = {C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "withDefinedIn", "getWithDefinedIn()Z")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "modifiers", "getModifiers()Ljava/util/Set;")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "startFromName", "getStartFromName()Z")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "debugMode", "getDebugMode()Z")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "verbose", "getVerbose()Z")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "unitReturnType", "getUnitReturnType()Z")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "withoutReturnType", "getWithoutReturnType()Z")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "enhancedTypes", "getEnhancedTypes()Z")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "renderDefaultModality", "getRenderDefaultModality()Z")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "receiverAfterName", "getReceiverAfterName()Z")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), C9757g0.m32302f(new C9780s(C9757g0.m32298b(C10143g.class), "informativeErrorType", "getInformativeErrorType()Z"))};

    /* renamed from: A */
    private final ReadWriteProperty f39427A;

    /* renamed from: B */
    private final ReadWriteProperty f39428B;

    /* renamed from: C */
    private final ReadWriteProperty f39429C;

    /* renamed from: D */
    private final ReadWriteProperty f39430D;

    /* renamed from: E */
    private final ReadWriteProperty f39431E;

    /* renamed from: F */
    private final ReadWriteProperty f39432F;

    /* renamed from: G */
    private final ReadWriteProperty f39433G;

    /* renamed from: H */
    private final ReadWriteProperty f39434H;

    /* renamed from: I */
    private final ReadWriteProperty f39435I;

    /* renamed from: J */
    private final ReadWriteProperty f39436J;

    /* renamed from: K */
    private final ReadWriteProperty f39437K;

    /* renamed from: L */
    private final ReadWriteProperty f39438L;

    /* renamed from: M */
    private final ReadWriteProperty f39439M;

    /* renamed from: N */
    private final ReadWriteProperty f39440N;

    /* renamed from: O */
    private final ReadWriteProperty f39441O;

    /* renamed from: P */
    private final ReadWriteProperty f39442P;

    /* renamed from: Q */
    private final ReadWriteProperty f39443Q;

    /* renamed from: R */
    private final ReadWriteProperty f39444R;

    /* renamed from: S */
    private final ReadWriteProperty f39445S;

    /* renamed from: T */
    private final ReadWriteProperty f39446T;

    /* renamed from: U */
    private final ReadWriteProperty f39447U;

    /* renamed from: V */
    private final ReadWriteProperty f39448V;

    /* renamed from: W */
    private final ReadWriteProperty f39449W;

    /* renamed from: X */
    private final ReadWriteProperty f39450X;

    /* renamed from: b */
    private boolean f39451b;

    /* renamed from: c */
    private final ReadWriteProperty f39452c = m35706m0(InterfaceC10138b.c.f39370a);

    /* renamed from: d */
    private final ReadWriteProperty f39453d;

    /* renamed from: e */
    private final ReadWriteProperty f39454e;

    /* renamed from: f */
    private final ReadWriteProperty f39455f;

    /* renamed from: g */
    private final ReadWriteProperty f39456g;

    /* renamed from: h */
    private final ReadWriteProperty f39457h;

    /* renamed from: i */
    private final ReadWriteProperty f39458i;

    /* renamed from: j */
    private final ReadWriteProperty f39459j;

    /* renamed from: k */
    private final ReadWriteProperty f39460k;

    /* renamed from: l */
    private final ReadWriteProperty f39461l;

    /* renamed from: m */
    private final ReadWriteProperty f39462m;

    /* renamed from: n */
    private final ReadWriteProperty f39463n;

    /* renamed from: o */
    private final ReadWriteProperty f39464o;

    /* renamed from: p */
    private final ReadWriteProperty f39465p;

    /* renamed from: q */
    private final ReadWriteProperty f39466q;

    /* renamed from: r */
    private final ReadWriteProperty f39467r;

    /* renamed from: s */
    private final ReadWriteProperty f39468s;

    /* renamed from: t */
    private final ReadWriteProperty f39469t;

    /* renamed from: u */
    private final ReadWriteProperty f39470u;

    /* renamed from: v */
    private final ReadWriteProperty f39471v;

    /* renamed from: w */
    private final ReadWriteProperty f39472w;

    /* renamed from: x */
    private final ReadWriteProperty f39473x;

    /* renamed from: y */
    private final ReadWriteProperty f39474y;

    /* renamed from: z */
    private final ReadWriteProperty f39475z;

    /* compiled from: DescriptorRendererOptionsImpl.kt */
    /* renamed from: kotlin.f0.y.e.j0.h.g$a */
    static final class a extends Lambda implements Function1<InterfaceC10566i1, String> {

        /* renamed from: f */
        public static final a f39476f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(InterfaceC10566i1 interfaceC10566i1) {
            C9768m.m32346f(interfaceC10566i1, "it");
            return "...";
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Delegates.kt */
    /* renamed from: kotlin.f0.y.e.j0.h.g$b */
    public static final class b<T> extends ObservableProperty<T> {

        /* renamed from: b */
        final /* synthetic */ C10143g f39477b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, C10143g c10143g) {
            super(obj);
            this.f39477b = c10143g;
        }

        @Override // kotlin.properties.ObservableProperty
        /* renamed from: d */
        protected boolean mo32373d(KProperty<?> kProperty, T t, T t2) {
            C9768m.m32346f(kProperty, "property");
            if (this.f39477b.m35743k0()) {
                throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
            }
            return true;
        }
    }

    /* compiled from: DescriptorRendererOptionsImpl.kt */
    /* renamed from: kotlin.f0.y.e.j0.h.g$c */
    static final class c extends Lambda implements Function1<AbstractC10311e0, AbstractC10311e0> {

        /* renamed from: f */
        public static final c f39478f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10311e0 invoke(AbstractC10311e0 abstractC10311e0) {
            C9768m.m32346f(abstractC10311e0, "it");
            return abstractC10311e0;
        }
    }

    public C10143g() {
        Set m38917d;
        Boolean bool = Boolean.TRUE;
        this.f39453d = m35706m0(bool);
        this.f39454e = m35706m0(bool);
        this.f39455f = m35706m0(EnumC10141e.f39408g);
        Boolean bool2 = Boolean.FALSE;
        this.f39456g = m35706m0(bool2);
        this.f39457h = m35706m0(bool2);
        this.f39458i = m35706m0(bool2);
        this.f39459j = m35706m0(bool2);
        this.f39460k = m35706m0(bool2);
        this.f39461l = m35706m0(bool);
        this.f39462m = m35706m0(bool2);
        this.f39463n = m35706m0(bool2);
        this.f39464o = m35706m0(bool2);
        this.f39465p = m35706m0(bool);
        this.f39466q = m35706m0(bool);
        this.f39467r = m35706m0(bool2);
        this.f39468s = m35706m0(bool2);
        this.f39469t = m35706m0(bool2);
        this.f39470u = m35706m0(bool2);
        this.f39471v = m35706m0(bool2);
        this.f39472w = m35706m0(bool2);
        this.f39473x = m35706m0(bool2);
        this.f39474y = m35706m0(c.f39478f);
        this.f39475z = m35706m0(a.f39476f);
        this.f39427A = m35706m0(bool);
        this.f39428B = m35706m0(EnumC10146j.RENDER_OPEN);
        this.f39429C = m35706m0(AbstractC10139c.l.a.f39393a);
        this.f39430D = m35706m0(EnumC10149m.PLAIN);
        this.f39431E = m35706m0(EnumC10147k.ALL);
        this.f39432F = m35706m0(bool2);
        this.f39433G = m35706m0(bool2);
        this.f39434H = m35706m0(EnumC10148l.DEBUG);
        this.f39435I = m35706m0(bool2);
        this.f39436J = m35706m0(bool2);
        m38917d = C10789w0.m38917d();
        this.f39437K = m35706m0(m38917d);
        this.f39438L = m35706m0(C10144h.f39479a.m35757a());
        this.f39439M = m35706m0(null);
        this.f39440N = m35706m0(EnumC10137a.NO_ARGUMENTS);
        this.f39441O = m35706m0(bool2);
        this.f39442P = m35706m0(bool);
        this.f39443Q = m35706m0(bool);
        this.f39444R = m35706m0(bool2);
        this.f39445S = m35706m0(bool);
        this.f39446T = m35706m0(bool);
        this.f39447U = m35706m0(bool2);
        this.f39448V = m35706m0(bool2);
        this.f39449W = m35706m0(bool2);
        this.f39450X = m35706m0(bool);
    }

    /* renamed from: m0 */
    private final <T> ReadWriteProperty<C10143g, T> m35706m0(T t) {
        Delegates delegates = Delegates.f37191a;
        return new b(t, this);
    }

    /* renamed from: A */
    public boolean m35707A() {
        return ((Boolean) this.f39445S.mo6183a(this, f39426a[42])).booleanValue();
    }

    /* renamed from: B */
    public boolean m35708B() {
        return InterfaceC10142f.a.m35704a(this);
    }

    /* renamed from: C */
    public boolean m35709C() {
        return InterfaceC10142f.a.m35705b(this);
    }

    /* renamed from: D */
    public boolean m35710D() {
        return ((Boolean) this.f39471v.mo6183a(this, f39426a[19])).booleanValue();
    }

    /* renamed from: E */
    public boolean m35711E() {
        return ((Boolean) this.f39450X.mo6183a(this, f39426a[47])).booleanValue();
    }

    /* renamed from: F */
    public Set<EnumC10141e> m35712F() {
        return (Set) this.f39455f.mo6183a(this, f39426a[3]);
    }

    /* renamed from: G */
    public boolean m35713G() {
        return ((Boolean) this.f39464o.mo6183a(this, f39426a[12])).booleanValue();
    }

    /* renamed from: H */
    public EnumC10146j m35714H() {
        return (EnumC10146j) this.f39428B.mo6183a(this, f39426a[25]);
    }

    /* renamed from: I */
    public EnumC10147k m35715I() {
        return (EnumC10147k) this.f39431E.mo6183a(this, f39426a[28]);
    }

    /* renamed from: J */
    public boolean m35716J() {
        return ((Boolean) this.f39446T.mo6183a(this, f39426a[43])).booleanValue();
    }

    /* renamed from: K */
    public boolean m35717K() {
        return ((Boolean) this.f39448V.mo6183a(this, f39426a[45])).booleanValue();
    }

    /* renamed from: L */
    public EnumC10148l m35718L() {
        return (EnumC10148l) this.f39434H.mo6183a(this, f39426a[31]);
    }

    /* renamed from: M */
    public boolean m35719M() {
        return ((Boolean) this.f39432F.mo6183a(this, f39426a[29])).booleanValue();
    }

    /* renamed from: N */
    public boolean m35720N() {
        return ((Boolean) this.f39433G.mo6183a(this, f39426a[30])).booleanValue();
    }

    /* renamed from: O */
    public boolean m35721O() {
        return ((Boolean) this.f39467r.mo6183a(this, f39426a[15])).booleanValue();
    }

    /* renamed from: P */
    public boolean m35722P() {
        return ((Boolean) this.f39442P.mo6183a(this, f39426a[39])).booleanValue();
    }

    /* renamed from: Q */
    public boolean m35723Q() {
        return ((Boolean) this.f39435I.mo6183a(this, f39426a[32])).booleanValue();
    }

    /* renamed from: R */
    public boolean m35724R() {
        return ((Boolean) this.f39466q.mo6183a(this, f39426a[14])).booleanValue();
    }

    /* renamed from: S */
    public boolean m35725S() {
        return ((Boolean) this.f39465p.mo6183a(this, f39426a[13])).booleanValue();
    }

    /* renamed from: T */
    public boolean m35726T() {
        return ((Boolean) this.f39468s.mo6183a(this, f39426a[16])).booleanValue();
    }

    /* renamed from: U */
    public boolean m35727U() {
        return ((Boolean) this.f39444R.mo6183a(this, f39426a[41])).booleanValue();
    }

    /* renamed from: V */
    public boolean m35728V() {
        return ((Boolean) this.f39443Q.mo6183a(this, f39426a[40])).booleanValue();
    }

    /* renamed from: W */
    public boolean m35729W() {
        return ((Boolean) this.f39427A.mo6183a(this, f39426a[24])).booleanValue();
    }

    /* renamed from: X */
    public boolean m35730X() {
        return ((Boolean) this.f39457h.mo6183a(this, f39426a[5])).booleanValue();
    }

    /* renamed from: Y */
    public boolean m35731Y() {
        return ((Boolean) this.f39456g.mo6183a(this, f39426a[4])).booleanValue();
    }

    /* renamed from: Z */
    public EnumC10149m m35732Z() {
        return (EnumC10149m) this.f39430D.mo6183a(this, f39426a[27]);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10142f
    /* renamed from: a */
    public void mo35628a(Set<C10127c> set) {
        C9768m.m32346f(set, "<set-?>");
        this.f39438L.mo32371b(this, f39426a[35], set);
    }

    /* renamed from: a0 */
    public Function1<AbstractC10311e0, AbstractC10311e0> m35733a0() {
        return (Function1) this.f39474y.mo6183a(this, f39426a[22]);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10142f
    /* renamed from: b */
    public void mo35631b(boolean z) {
        this.f39456g.mo32371b(this, f39426a[4], Boolean.valueOf(z));
    }

    /* renamed from: b0 */
    public boolean m35734b0() {
        return ((Boolean) this.f39470u.mo6183a(this, f39426a[18])).booleanValue();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10142f
    /* renamed from: c */
    public void mo35633c(Set<? extends EnumC10141e> set) {
        C9768m.m32346f(set, "<set-?>");
        this.f39455f.mo32371b(this, f39426a[3], set);
    }

    /* renamed from: c0 */
    public boolean m35735c0() {
        return ((Boolean) this.f39461l.mo6183a(this, f39426a[9])).booleanValue();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10142f
    /* renamed from: d */
    public void mo35635d(EnumC10147k enumC10147k) {
        C9768m.m32346f(enumC10147k, "<set-?>");
        this.f39431E.mo32371b(this, f39426a[28], enumC10147k);
    }

    /* renamed from: d0 */
    public AbstractC10139c.l m35736d0() {
        return (AbstractC10139c.l) this.f39429C.mo6183a(this, f39426a[26]);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10142f
    /* renamed from: e */
    public void mo35637e(boolean z) {
        this.f39453d.mo32371b(this, f39426a[1], Boolean.valueOf(z));
    }

    /* renamed from: e0 */
    public boolean m35737e0() {
        return ((Boolean) this.f39460k.mo6183a(this, f39426a[8])).booleanValue();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10142f
    /* renamed from: f */
    public boolean mo35639f() {
        return ((Boolean) this.f39463n.mo6183a(this, f39426a[11])).booleanValue();
    }

    /* renamed from: f0 */
    public boolean m35738f0() {
        return ((Boolean) this.f39453d.mo6183a(this, f39426a[1])).booleanValue();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10142f
    /* renamed from: g */
    public void mo35641g(InterfaceC10138b interfaceC10138b) {
        C9768m.m32346f(interfaceC10138b, "<set-?>");
        this.f39452c.mo32371b(this, f39426a[0], interfaceC10138b);
    }

    /* renamed from: g0 */
    public boolean m35739g0() {
        return ((Boolean) this.f39454e.mo6183a(this, f39426a[2])).booleanValue();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10142f
    /* renamed from: h */
    public void mo35643h(boolean z) {
        this.f39473x.mo32371b(this, f39426a[21], Boolean.valueOf(z));
    }

    /* renamed from: h0 */
    public boolean m35740h0() {
        return ((Boolean) this.f39462m.mo6183a(this, f39426a[10])).booleanValue();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10142f
    /* renamed from: i */
    public void mo35645i(boolean z) {
        this.f39458i.mo32371b(this, f39426a[6], Boolean.valueOf(z));
    }

    /* renamed from: i0 */
    public boolean m35741i0() {
        return ((Boolean) this.f39473x.mo6183a(this, f39426a[21])).booleanValue();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10142f
    /* renamed from: j */
    public void mo35647j(boolean z) {
        this.f39433G.mo32371b(this, f39426a[30], Boolean.valueOf(z));
    }

    /* renamed from: j0 */
    public boolean m35742j0() {
        return ((Boolean) this.f39472w.mo6183a(this, f39426a[20])).booleanValue();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10142f
    /* renamed from: k */
    public void mo35649k(boolean z) {
        this.f39432F.mo32371b(this, f39426a[29], Boolean.valueOf(z));
    }

    /* renamed from: k0 */
    public final boolean m35743k0() {
        return this.f39451b;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10142f
    /* renamed from: l */
    public void mo35651l(EnumC10149m enumC10149m) {
        C9768m.m32346f(enumC10149m, "<set-?>");
        this.f39430D.mo32371b(this, f39426a[27], enumC10149m);
    }

    /* renamed from: l0 */
    public final void m35744l0() {
        this.f39451b = true;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10142f
    /* renamed from: m */
    public Set<C10127c> mo35653m() {
        return (Set) this.f39438L.mo6183a(this, f39426a[35]);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10142f
    /* renamed from: n */
    public boolean mo35655n() {
        return ((Boolean) this.f39458i.mo6183a(this, f39426a[6])).booleanValue();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10142f
    /* renamed from: o */
    public EnumC10137a mo35657o() {
        return (EnumC10137a) this.f39440N.mo6183a(this, f39426a[37]);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10142f
    /* renamed from: p */
    public void mo35659p(boolean z) {
        this.f39472w.mo32371b(this, f39426a[20], Boolean.valueOf(z));
    }

    /* renamed from: q */
    public final C10143g m35745q() {
        C10143g c10143g = new C10143g();
        Field[] declaredFields = C10143g.class.getDeclaredFields();
        C9768m.m32345e(declaredFields, "this::class.java.declaredFields");
        for (Field field : declaredFields) {
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(this);
                ObservableProperty observableProperty = obj instanceof ObservableProperty ? (ObservableProperty) obj : null;
                if (observableProperty != null) {
                    String name = field.getName();
                    C9768m.m32345e(name, "field.name");
                    C10513u.m37511E(name, "is", false, 2, null);
                    KClass m32298b = C9757g0.m32298b(C10143g.class);
                    String name2 = field.getName();
                    StringBuilder sb = new StringBuilder();
                    sb.append("get");
                    String name3 = field.getName();
                    C9768m.m32345e(name3, "field.name");
                    if (name3.length() > 0) {
                        char upperCase = Character.toUpperCase(name3.charAt(0));
                        String substring = name3.substring(1);
                        C9768m.m32345e(substring, "this as java.lang.String).substring(startIndex)");
                        name3 = upperCase + substring;
                    }
                    sb.append(name3);
                    field.set(c10143g, c10143g.m35706m0(observableProperty.mo6183a(this, new C9786y(m32298b, name2, sb.toString()))));
                }
            }
        }
        return c10143g;
    }

    /* renamed from: r */
    public boolean m35746r() {
        return ((Boolean) this.f39469t.mo6183a(this, f39426a[17])).booleanValue();
    }

    /* renamed from: s */
    public boolean m35747s() {
        return ((Boolean) this.f39441O.mo6183a(this, f39426a[38])).booleanValue();
    }

    /* renamed from: t */
    public Function1<InterfaceC10583c, Boolean> m35748t() {
        return (Function1) this.f39439M.mo6183a(this, f39426a[36]);
    }

    /* renamed from: u */
    public boolean m35749u() {
        return ((Boolean) this.f39449W.mo6183a(this, f39426a[46])).booleanValue();
    }

    /* renamed from: v */
    public boolean m35750v() {
        return ((Boolean) this.f39459j.mo6183a(this, f39426a[7])).booleanValue();
    }

    /* renamed from: w */
    public InterfaceC10138b m35751w() {
        return (InterfaceC10138b) this.f39452c.mo6183a(this, f39426a[0]);
    }

    /* renamed from: x */
    public Function1<InterfaceC10566i1, String> m35752x() {
        return (Function1) this.f39475z.mo6183a(this, f39426a[23]);
    }

    /* renamed from: y */
    public boolean m35753y() {
        return ((Boolean) this.f39436J.mo6183a(this, f39426a[33])).booleanValue();
    }

    /* renamed from: z */
    public Set<C10127c> m35754z() {
        return (Set) this.f39437K.mo6183a(this, f39426a[34]);
    }
}
