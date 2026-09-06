package kotlin.reflect.p371y.internal.p374j0.p422m;

import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p422m.AbstractC10438g;
import kotlin.text.Regex;

/* compiled from: modifierChecks.kt */
/* renamed from: kotlin.f0.y.e.j0.m.h */
/* loaded from: classes3.dex */
public final class C10439h {

    /* renamed from: a */
    private final C10130f f40410a;

    /* renamed from: b */
    private final Regex f40411b;

    /* renamed from: c */
    private final Collection<C10130f> f40412c;

    /* renamed from: d */
    private final Function1<InterfaceC10705y, String> f40413d;

    /* renamed from: e */
    private final InterfaceC10437f[] f40414e;

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.h$a */
    static final class a extends Lambda implements Function1 {

        /* renamed from: f */
        public static final a f40415f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC10705y interfaceC10705y) {
            C9768m.m32346f(interfaceC10705y, "$this$null");
            return null;
        }
    }

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.h$b */
    static final class b extends Lambda implements Function1 {

        /* renamed from: f */
        public static final b f40416f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC10705y interfaceC10705y) {
            C9768m.m32346f(interfaceC10705y, "$this$null");
            return null;
        }
    }

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.h$c */
    static final class c extends Lambda implements Function1 {

        /* renamed from: f */
        public static final c f40417f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC10705y interfaceC10705y) {
            C9768m.m32346f(interfaceC10705y, "$this$null");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C10439h(C10130f c10130f, Regex regex, Collection<C10130f> collection, Function1<? super InterfaceC10705y, String> function1, InterfaceC10437f... interfaceC10437fArr) {
        this.f40410a = c10130f;
        this.f40411b = regex;
        this.f40412c = collection;
        this.f40413d = function1;
        this.f40414e = interfaceC10437fArr;
    }

    /* renamed from: a */
    public final AbstractC10438g m37198a(InterfaceC10705y interfaceC10705y) {
        C9768m.m32346f(interfaceC10705y, "functionDescriptor");
        for (InterfaceC10437f interfaceC10437f : this.f40414e) {
            String mo37194a = interfaceC10437f.mo37194a(interfaceC10705y);
            if (mo37194a != null) {
                return new AbstractC10438g.b(mo37194a);
            }
        }
        String invoke = this.f40413d.invoke(interfaceC10705y);
        return invoke != null ? new AbstractC10438g.b(invoke) : AbstractC10438g.c.f40409b;
    }

    /* renamed from: b */
    public final boolean m37199b(InterfaceC10705y interfaceC10705y) {
        C9768m.m32346f(interfaceC10705y, "functionDescriptor");
        if (this.f40410a != null && !C9768m.m32341a(interfaceC10705y.getName(), this.f40410a)) {
            return false;
        }
        if (this.f40411b != null) {
            String m35455k = interfaceC10705y.getName().m35455k();
            C9768m.m32345e(m35455k, "functionDescriptor.name.asString()");
            if (!this.f40411b.m37438b(m35455k)) {
                return false;
            }
        }
        Collection<C10130f> collection = this.f40412c;
        return collection == null || collection.contains(interfaceC10705y.getName());
    }

    public /* synthetic */ C10439h(C10130f c10130f, InterfaceC10437f[] interfaceC10437fArr, Function1 function1, int i2, C9756g c9756g) {
        this(c10130f, interfaceC10437fArr, (Function1<? super InterfaceC10705y, String>) ((i2 & 4) != 0 ? a.f40415f : function1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10439h(C10130f c10130f, InterfaceC10437f[] interfaceC10437fArr, Function1<? super InterfaceC10705y, String> function1) {
        this(c10130f, (Regex) null, (Collection<C10130f>) null, function1, (InterfaceC10437f[]) Arrays.copyOf(interfaceC10437fArr, interfaceC10437fArr.length));
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(interfaceC10437fArr, "checks");
        C9768m.m32346f(function1, "additionalChecks");
    }

    public /* synthetic */ C10439h(Regex regex, InterfaceC10437f[] interfaceC10437fArr, Function1 function1, int i2, C9756g c9756g) {
        this(regex, interfaceC10437fArr, (Function1<? super InterfaceC10705y, String>) ((i2 & 4) != 0 ? b.f40416f : function1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10439h(Regex regex, InterfaceC10437f[] interfaceC10437fArr, Function1<? super InterfaceC10705y, String> function1) {
        this((C10130f) null, regex, (Collection<C10130f>) null, function1, (InterfaceC10437f[]) Arrays.copyOf(interfaceC10437fArr, interfaceC10437fArr.length));
        C9768m.m32346f(regex, "regex");
        C9768m.m32346f(interfaceC10437fArr, "checks");
        C9768m.m32346f(function1, "additionalChecks");
    }

    public /* synthetic */ C10439h(Collection collection, InterfaceC10437f[] interfaceC10437fArr, Function1 function1, int i2, C9756g c9756g) {
        this((Collection<C10130f>) collection, interfaceC10437fArr, (Function1<? super InterfaceC10705y, String>) ((i2 & 4) != 0 ? c.f40417f : function1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10439h(Collection<C10130f> collection, InterfaceC10437f[] interfaceC10437fArr, Function1<? super InterfaceC10705y, String> function1) {
        this((C10130f) null, (Regex) null, collection, function1, (InterfaceC10437f[]) Arrays.copyOf(interfaceC10437fArr, interfaceC10437fArr.length));
        C9768m.m32346f(collection, "nameList");
        C9768m.m32346f(interfaceC10437fArr, "checks");
        C9768m.m32346f(function1, "additionalChecks");
    }
}
