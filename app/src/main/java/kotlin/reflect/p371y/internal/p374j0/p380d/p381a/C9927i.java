package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import java.util.Collection;
import kotlin.collections.C10749c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;

/* compiled from: ClassicBuiltinSpecialProperties.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.i */
/* loaded from: classes2.dex */
public final class C9927i {

    /* renamed from: a */
    public static final C9927i f37892a = new C9927i();

    /* compiled from: ClassicBuiltinSpecialProperties.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.i$a */
    static final class a extends Lambda implements Function1<InterfaceC10543b, Boolean> {

        /* renamed from: f */
        public static final a f37893f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC10543b interfaceC10543b) {
            C9768m.m32346f(interfaceC10543b, "it");
            return Boolean.valueOf(C9927i.f37892a.m33142b(interfaceC10543b));
        }
    }

    private C9927i() {
    }

    /* renamed from: c */
    private final boolean m33140c(InterfaceC10543b interfaceC10543b) {
        boolean m38577K;
        m38577K = C10749c0.m38577K(C9923g.f37857a.m33098c(), C10202a.m36070d(interfaceC10543b));
        if (m38577K && interfaceC10543b.mo37028f().isEmpty()) {
            return true;
        }
        if (!AbstractC9881h.m32743f0(interfaceC10543b)) {
            return false;
        }
        Collection<? extends InterfaceC10543b> mo37027e = interfaceC10543b.mo37027e();
        C9768m.m32345e(mo37027e, "overriddenDescriptors");
        if (!mo37027e.isEmpty()) {
            for (InterfaceC10543b interfaceC10543b2 : mo37027e) {
                C9927i c9927i = f37892a;
                C9768m.m32345e(interfaceC10543b2, "it");
                if (c9927i.m33142b(interfaceC10543b2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final String m33141a(InterfaceC10543b interfaceC10543b) {
        C10130f c10130f;
        C9768m.m32346f(interfaceC10543b, "<this>");
        AbstractC9881h.m32743f0(interfaceC10543b);
        InterfaceC10543b m36069c = C10202a.m36069c(C10202a.m36081o(interfaceC10543b), false, a.f37893f, 1, null);
        if (m36069c == null || (c10130f = C9923g.f37857a.m33096a().get(C10202a.m36074h(m36069c))) == null) {
            return null;
        }
        return c10130f.m35455k();
    }

    /* renamed from: b */
    public final boolean m33142b(InterfaceC10543b interfaceC10543b) {
        C9768m.m32346f(interfaceC10543b, "callableMemberDescriptor");
        if (C9923g.f37857a.m33099d().contains(interfaceC10543b.getName())) {
            return m33140c(interfaceC10543b);
        }
        return false;
    }
}
