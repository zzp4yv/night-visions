package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0;

import java.util.Map;
import kotlin.C10740s;
import kotlin.collections.C10775p0;
import kotlin.collections.C10777q0;
import kotlin.collections.C10782t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9757g0;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.C9786y;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9884k;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9957g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10003m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9986a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9988b;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9994e;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10178g;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10296m;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10292i;

/* compiled from: JavaAnnotationMapper.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.j0.i */
/* loaded from: classes2.dex */
public final class C9938i extends C9931b {

    /* renamed from: g */
    static final /* synthetic */ KProperty<Object>[] f37924g = {C9757g0.m32304h(new C9786y(C9757g0.m32298b(C9938i.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: h */
    private final InterfaceC10292i f37925h;

    /* compiled from: JavaAnnotationMapper.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.j0.i$a */
    static final class a extends Lambda implements Function0<Map<C10130f, ? extends AbstractC10178g<? extends Object>>> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Map<C10130f, AbstractC10178g<Object>> invoke() {
            Map<C10130f, AbstractC10178g<Object>> m38797i;
            InterfaceC9988b m33160b = C9938i.this.m33160b();
            AbstractC10178g<?> m33174c = m33160b instanceof InterfaceC9994e ? C9933d.f37912a.m33174c(((InterfaceC9994e) C9938i.this.m33160b()).mo33585e()) : m33160b instanceof InterfaceC10003m ? C9933d.f37912a.m33174c(C10782t.m38883e(C9938i.this.m33160b())) : null;
            Map<C10130f, AbstractC10178g<Object>> m38794f = m33174c != null ? C10775p0.m38794f(C10740s.m38547a(C9932c.f37907a.m33170d(), m33174c)) : null;
            if (m38794f != null) {
                return m38794f;
            }
            m38797i = C10777q0.m38797i();
            return m38797i;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9938i(InterfaceC9986a interfaceC9986a, C9957g c9957g) {
        super(c9957g, interfaceC9986a, C9884k.a.f37538H);
        C9768m.m32346f(interfaceC9986a, "annotation");
        C9768m.m32346f(c9957g, "c");
        this.f37925h = c9957g.m33286e().mo36516d(new a());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.C9931b, kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c
    /* renamed from: a */
    public Map<C10130f, AbstractC10178g<Object>> mo33159a() {
        return (Map) C10296m.m36555a(this.f37925h, this, f37924g[0]);
    }
}
