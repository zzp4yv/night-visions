package kotlin.reflect.p371y.internal.p374j0.p415l;

import kotlin.C10517i;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g;

/* compiled from: StarProjectionImpl.kt */
/* renamed from: kotlin.f0.y.e.j0.l.s0 */
/* loaded from: classes3.dex */
public final class C10353s0 extends AbstractC10321h1 {

    /* renamed from: a */
    private final InterfaceC10554e1 f40175a;

    /* renamed from: b */
    private final Lazy f40176b;

    /* compiled from: StarProjectionImpl.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.s0$a */
    static final class a extends Lambda implements Function0<AbstractC10311e0> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10311e0 invoke() {
            return C10356t0.m36828b(C10353s0.this.f40175a);
        }
    }

    public C10353s0(InterfaceC10554e1 interfaceC10554e1) {
        Lazy m37593a;
        C9768m.m32346f(interfaceC10554e1, "typeParameter");
        this.f40175a = interfaceC10554e1;
        m37593a = C10517i.m37593a(LazyThreadSafetyMode.PUBLICATION, new a());
        this.f40176b = m37593a;
    }

    /* renamed from: e */
    private final AbstractC10311e0 m36822e() {
        return (AbstractC10311e0) this.f40176b.getValue();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1
    /* renamed from: a */
    public EnumC10351r1 mo36708a() {
        return EnumC10351r1.OUT_VARIANCE;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1
    /* renamed from: b */
    public InterfaceC10318g1 mo36709b(AbstractC10363g abstractC10363g) {
        C9768m.m32346f(abstractC10363g, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1
    /* renamed from: c */
    public boolean mo36710c() {
        return true;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1
    public AbstractC10311e0 getType() {
        return m36822e();
    }
}
