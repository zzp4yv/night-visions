package kotlin.reflect.p371y.internal.p374j0.p422m;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10437f;

/* compiled from: modifierChecks.kt */
/* renamed from: kotlin.f0.y.e.j0.m.r */
/* loaded from: classes3.dex */
public abstract class AbstractC10449r implements InterfaceC10437f {

    /* renamed from: a */
    private final String f40482a;

    /* renamed from: b */
    private final Function1<AbstractC9881h, AbstractC10311e0> f40483b;

    /* renamed from: c */
    private final String f40484c;

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.r$a */
    public static final class a extends AbstractC10449r {

        /* renamed from: d */
        public static final a f40485d = new a();

        /* compiled from: modifierChecks.kt */
        /* renamed from: kotlin.f0.y.e.j0.m.r$a$a, reason: collision with other inner class name */
        static final class C11527a extends Lambda implements Function1<AbstractC9881h, AbstractC10311e0> {

            /* renamed from: f */
            public static final C11527a f40486f = new C11527a();

            C11527a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AbstractC10311e0 invoke(AbstractC9881h abstractC9881h) {
                C9768m.m32346f(abstractC9881h, "$this$null");
                AbstractC10335m0 m32796n = abstractC9881h.m32796n();
                C9768m.m32345e(m32796n, "booleanType");
                return m32796n;
            }
        }

        private a() {
            super("Boolean", C11527a.f40486f, null);
        }
    }

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.r$b */
    public static final class b extends AbstractC10449r {

        /* renamed from: d */
        public static final b f40487d = new b();

        /* compiled from: modifierChecks.kt */
        /* renamed from: kotlin.f0.y.e.j0.m.r$b$a */
        static final class a extends Lambda implements Function1<AbstractC9881h, AbstractC10311e0> {

            /* renamed from: f */
            public static final a f40488f = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AbstractC10311e0 invoke(AbstractC9881h abstractC9881h) {
                C9768m.m32346f(abstractC9881h, "$this$null");
                AbstractC10335m0 m32768D = abstractC9881h.m32768D();
                C9768m.m32345e(m32768D, "intType");
                return m32768D;
            }
        }

        private b() {
            super("Int", a.f40488f, null);
        }
    }

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.r$c */
    public static final class c extends AbstractC10449r {

        /* renamed from: d */
        public static final c f40489d = new c();

        /* compiled from: modifierChecks.kt */
        /* renamed from: kotlin.f0.y.e.j0.m.r$c$a */
        static final class a extends Lambda implements Function1<AbstractC9881h, AbstractC10311e0> {

            /* renamed from: f */
            public static final a f40490f = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AbstractC10311e0 invoke(AbstractC9881h abstractC9881h) {
                C9768m.m32346f(abstractC9881h, "$this$null");
                AbstractC10335m0 m32787Z = abstractC9881h.m32787Z();
                C9768m.m32345e(m32787Z, "unitType");
                return m32787Z;
            }
        }

        private c() {
            super("Unit", a.f40490f, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AbstractC10449r(String str, Function1<? super AbstractC9881h, ? extends AbstractC10311e0> function1) {
        this.f40482a = str;
        this.f40483b = function1;
        this.f40484c = "must return " + str;
    }

    public /* synthetic */ AbstractC10449r(String str, Function1 function1, C9756g c9756g) {
        this(str, function1);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10437f
    /* renamed from: a */
    public String mo37194a(InterfaceC10705y interfaceC10705y) {
        return InterfaceC10437f.a.m37196a(this, interfaceC10705y);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10437f
    /* renamed from: b */
    public boolean mo37195b(InterfaceC10705y interfaceC10705y) {
        C9768m.m32346f(interfaceC10705y, "functionDescriptor");
        return C9768m.m32341a(interfaceC10705y.getReturnType(), this.f40483b.invoke(C10202a.m36072f(interfaceC10705y)));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10437f
    public String getDescription() {
        return this.f40484c;
    }
}
