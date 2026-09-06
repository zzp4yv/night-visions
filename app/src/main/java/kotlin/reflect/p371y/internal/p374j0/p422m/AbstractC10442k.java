package kotlin.reflect.p371y.internal.p374j0.p422m;

import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y;
import kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10437f;

/* compiled from: modifierChecks.kt */
/* renamed from: kotlin.f0.y.e.j0.m.k */
/* loaded from: classes3.dex */
public abstract class AbstractC10442k implements InterfaceC10437f {

    /* renamed from: a */
    private final String f40421a;

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.k$a */
    public static final class a extends AbstractC10442k {

        /* renamed from: b */
        public static final a f40422b = new a();

        private a() {
            super("must be a member function", null);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10437f
        /* renamed from: b */
        public boolean mo37195b(InterfaceC10705y interfaceC10705y) {
            C9768m.m32346f(interfaceC10705y, "functionDescriptor");
            return interfaceC10705y.mo37029f0() != null;
        }
    }

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.k$b */
    public static final class b extends AbstractC10442k {

        /* renamed from: b */
        public static final b f40423b = new b();

        private b() {
            super("must be a member or an extension function", null);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10437f
        /* renamed from: b */
        public boolean mo37195b(InterfaceC10705y interfaceC10705y) {
            C9768m.m32346f(interfaceC10705y, "functionDescriptor");
            return (interfaceC10705y.mo37029f0() == null && interfaceC10705y.mo37032m0() == null) ? false : true;
        }
    }

    private AbstractC10442k(String str) {
        this.f40421a = str;
    }

    public /* synthetic */ AbstractC10442k(String str, C9756g c9756g) {
        this(str);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10437f
    /* renamed from: a */
    public String mo37194a(InterfaceC10705y interfaceC10705y) {
        return InterfaceC10437f.a.m37196a(this, interfaceC10705y);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10437f
    public String getDescription() {
        return this.f40421a;
    }
}
