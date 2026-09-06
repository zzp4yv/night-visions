package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10706y0;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10073v;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;

/* compiled from: specialBuiltinMembers.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.e */
/* loaded from: classes2.dex */
public final class C9919e extends C9926h0 {

    /* renamed from: n */
    public static final C9919e f37846n = new C9919e();

    /* compiled from: specialBuiltinMembers.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.e$a */
    static final class a extends Lambda implements Function1<InterfaceC10543b, Boolean> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC10706y0 f37847f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC10706y0 interfaceC10706y0) {
            super(1);
            this.f37847f = interfaceC10706y0;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC10543b interfaceC10543b) {
            C9768m.m32346f(interfaceC10543b, "it");
            return Boolean.valueOf(C9926h0.f37865a.m33133j().containsKey(C10073v.m34040d(this.f37847f)));
        }
    }

    private C9919e() {
    }

    /* renamed from: i */
    public final C10130f m33075i(InterfaceC10706y0 interfaceC10706y0) {
        C9768m.m32346f(interfaceC10706y0, "functionDescriptor");
        Map<String, C10130f> m33133j = C9926h0.f37865a.m33133j();
        String m34040d = C10073v.m34040d(interfaceC10706y0);
        if (m34040d == null) {
            return null;
        }
        return m33133j.get(m34040d);
    }

    /* renamed from: j */
    public final boolean m33076j(InterfaceC10706y0 interfaceC10706y0) {
        C9768m.m32346f(interfaceC10706y0, "functionDescriptor");
        return AbstractC9881h.m32743f0(interfaceC10706y0) && C10202a.m36069c(interfaceC10706y0, false, new a(interfaceC10706y0), 1, null) != null;
    }

    /* renamed from: k */
    public final boolean m33077k(InterfaceC10706y0 interfaceC10706y0) {
        C9768m.m32346f(interfaceC10706y0, "<this>");
        return C9768m.m32341a(interfaceC10706y0.getName().m35455k(), "removeAt") && C9768m.m32341a(C10073v.m34040d(interfaceC10706y0), C9926h0.f37865a.m33131h().m33137b());
    }
}
