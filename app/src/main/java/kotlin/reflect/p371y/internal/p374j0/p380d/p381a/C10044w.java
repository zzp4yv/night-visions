package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9757g0;
import kotlin.jvm.internal.C9760i;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;

/* compiled from: JavaTypeEnhancementState.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.w */
/* loaded from: classes2.dex */
public final class C10044w {

    /* renamed from: a */
    public static final b f38316a = new b(null);

    /* renamed from: b */
    private static final C10044w f38317b = new C10044w(C10042u.m33805b(null, 1, null), a.f38321h);

    /* renamed from: c */
    private final C10046y f38318c;

    /* renamed from: d */
    private final Function1<C10127c, EnumC9922f0> f38319d;

    /* renamed from: e */
    private final boolean f38320e;

    /* compiled from: JavaTypeEnhancementState.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.w$a */
    /* synthetic */ class a extends C9760i implements Function1<C10127c, EnumC9922f0> {

        /* renamed from: h */
        public static final a f38321h = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC9748c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getF40571m() {
            return "getDefaultReportLevelForAnnotation";
        }

        @Override // kotlin.jvm.internal.AbstractC9748c
        public final KDeclarationContainer getOwner() {
            return C9757g0.m32300d(C10042u.class, "compiler.common.jvm");
        }

        @Override // kotlin.jvm.internal.AbstractC9748c
        public final String getSignature() {
            return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final EnumC9922f0 invoke(C10127c c10127c) {
            C9768m.m32346f(c10127c, "p0");
            return C10042u.m33807d(c10127c);
        }
    }

    /* compiled from: JavaTypeEnhancementState.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.w$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final C10044w m33821a() {
            return C10044w.f38317b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10044w(C10046y c10046y, Function1<? super C10127c, ? extends EnumC9922f0> function1) {
        C9768m.m32346f(c10046y, "jsr305");
        C9768m.m32346f(function1, "getReportLevelForAnnotation");
        this.f38318c = c10046y;
        this.f38319d = function1;
        this.f38320e = c10046y.m33827d() || function1.invoke(C10042u.m33808e()) == EnumC9922f0.IGNORE;
    }

    /* renamed from: b */
    public final boolean m33817b() {
        return this.f38320e;
    }

    /* renamed from: c */
    public final Function1<C10127c, EnumC9922f0> m33818c() {
        return this.f38319d;
    }

    /* renamed from: d */
    public final C10046y m33819d() {
        return this.f38318c;
    }

    public String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f38318c + ", getReportLevelForAnnotation=" + this.f38319d + ')';
    }
}
