package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import kotlin.collections.C10749c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9926h0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10073v;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;

/* compiled from: specialBuiltinMembers.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.f */
/* loaded from: classes2.dex */
public final class C9921f extends C9926h0 {

    /* renamed from: n */
    public static final C9921f f37848n = new C9921f();

    /* compiled from: specialBuiltinMembers.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.f$a */
    static final class a extends Lambda implements Function1<InterfaceC10543b, Boolean> {

        /* renamed from: f */
        public static final a f37849f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC10543b interfaceC10543b) {
            C9768m.m32346f(interfaceC10543b, "it");
            return Boolean.valueOf(C9921f.f37848n.m33086j(interfaceC10543b));
        }
    }

    /* compiled from: specialBuiltinMembers.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.f$b */
    static final class b extends Lambda implements Function1<InterfaceC10543b, Boolean> {

        /* renamed from: f */
        public static final b f37850f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC10543b interfaceC10543b) {
            C9768m.m32346f(interfaceC10543b, "it");
            return Boolean.valueOf((interfaceC10543b instanceof InterfaceC10705y) && C9921f.f37848n.m33086j(interfaceC10543b));
        }
    }

    private C9921f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final boolean m33086j(InterfaceC10543b interfaceC10543b) {
        boolean m38577K;
        m38577K = C10749c0.m38577K(C9926h0.f37865a.m33128e(), C10073v.m34040d(interfaceC10543b));
        return m38577K;
    }

    /* renamed from: k */
    public static final InterfaceC10705y m33087k(InterfaceC10705y interfaceC10705y) {
        C9768m.m32346f(interfaceC10705y, "functionDescriptor");
        C9921f c9921f = f37848n;
        C10130f name = interfaceC10705y.getName();
        C9768m.m32345e(name, "functionDescriptor.name");
        if (c9921f.m33089l(name)) {
            return (InterfaceC10705y) C10202a.m36069c(interfaceC10705y, false, a.f37849f, 1, null);
        }
        return null;
    }

    /* renamed from: m */
    public static final C9926h0.b m33088m(InterfaceC10543b interfaceC10543b) {
        InterfaceC10543b m36069c;
        String m34040d;
        C9768m.m32346f(interfaceC10543b, "<this>");
        C9926h0.a aVar = C9926h0.f37865a;
        if (!aVar.m33127d().contains(interfaceC10543b.getName()) || (m36069c = C10202a.m36069c(interfaceC10543b, false, b.f37850f, 1, null)) == null || (m34040d = C10073v.m34040d(m36069c)) == null) {
            return null;
        }
        return aVar.m33135l(m34040d);
    }

    /* renamed from: l */
    public final boolean m33089l(C10130f c10130f) {
        C9768m.m32346f(c10130f, "<this>");
        return C9926h0.f37865a.m33127d().contains(c10130f);
    }
}
