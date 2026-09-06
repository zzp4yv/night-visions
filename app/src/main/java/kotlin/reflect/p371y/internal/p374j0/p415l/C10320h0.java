package kotlin.reflect.p371y.internal.p374j0.p415l;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10292i;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10409i;

/* compiled from: SpecialTypes.kt */
/* renamed from: kotlin.f0.y.e.j0.l.h0 */
/* loaded from: classes3.dex */
public final class C10320h0 extends AbstractC10354s1 {

    /* renamed from: g */
    private final InterfaceC10297n f40123g;

    /* renamed from: h */
    private final Function0<AbstractC10311e0> f40124h;

    /* renamed from: i */
    private final InterfaceC10292i<AbstractC10311e0> f40125i;

    /* compiled from: SpecialTypes.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.h0$a */
    static final class a extends Lambda implements Function0<AbstractC10311e0> {

        /* renamed from: f */
        final /* synthetic */ AbstractC10363g f40126f;

        /* renamed from: g */
        final /* synthetic */ C10320h0 f40127g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC10363g abstractC10363g, C10320h0 c10320h0) {
            super(0);
            this.f40126f = abstractC10363g;
            this.f40127g = c10320h0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10311e0 invoke() {
            return this.f40126f.mo36717a((InterfaceC10409i) this.f40127g.f40124h.invoke());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10320h0(InterfaceC10297n interfaceC10297n, Function0<? extends AbstractC10311e0> function0) {
        C9768m.m32346f(interfaceC10297n, "storageManager");
        C9768m.m32346f(function0, "computation");
        this.f40123g = interfaceC10297n;
        this.f40124h = function0;
        this.f40125i = interfaceC10297n.mo36516d(function0);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10354s1
    /* renamed from: S0 */
    protected AbstractC10311e0 mo36713S0() {
        return this.f40125i.invoke();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10354s1
    /* renamed from: T0 */
    public boolean mo36714T0() {
        return this.f40125i.m36551a();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public C10320h0 mo36558Y0(AbstractC10363g abstractC10363g) {
        C9768m.m32346f(abstractC10363g, "kotlinTypeRefiner");
        return new C10320h0(this.f40123g, new a(abstractC10363g, this));
    }
}
