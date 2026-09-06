package kotlin.reflect.p371y.internal.p374j0.p400i.p408w;

import java.util.List;
import kotlin.collections.C10784u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9757g0;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.C9786y;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10555f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10706y0;
import kotlin.reflect.jvm.internal.impl.utils.C10738e;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9906b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10153c;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10296m;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10292i;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;

/* compiled from: StaticScopeForKotlinEnum.kt */
/* renamed from: kotlin.f0.y.e.j0.i.w.l */
/* loaded from: classes3.dex */
public final class C10222l extends AbstractC10219i {

    /* renamed from: b */
    static final /* synthetic */ KProperty<Object>[] f39672b = {C9757g0.m32304h(new C9786y(C9757g0.m32298b(C10222l.class), "functions", "getFunctions()Ljava/util/List;"))};

    /* renamed from: c */
    private final InterfaceC10552e f39673c;

    /* renamed from: d */
    private final InterfaceC10292i f39674d;

    /* compiled from: StaticScopeForKotlinEnum.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.w.l$a */
    static final class a extends Lambda implements Function0<List<? extends InterfaceC10706y0>> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends InterfaceC10706y0> invoke() {
            List<? extends InterfaceC10706y0> m38891m;
            m38891m = C10784u.m38891m(C10153c.m35788f(C10222l.this.f39673c), C10153c.m35789g(C10222l.this.f39673c));
            return m38891m;
        }
    }

    public C10222l(InterfaceC10297n interfaceC10297n, InterfaceC10552e interfaceC10552e) {
        C9768m.m32346f(interfaceC10297n, "storageManager");
        C9768m.m32346f(interfaceC10552e, "containingClass");
        this.f39673c = interfaceC10552e;
        interfaceC10552e.mo32878i();
        EnumC10555f enumC10555f = EnumC10555f.ENUM_CLASS;
        this.f39674d = interfaceC10297n.mo36516d(new a());
    }

    /* renamed from: l */
    private final List<InterfaceC10706y0> m36164l() {
        return (List) C10296m.m36555a(this.f39674d, this, f39672b[0]);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10221k
    /* renamed from: f */
    public /* bridge */ /* synthetic */ InterfaceC10561h mo33316f(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
        return (InterfaceC10561h) m36165i(c10130f, interfaceC9906b);
    }

    /* renamed from: i */
    public Void m36165i(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(interfaceC9906b, "location");
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10221k
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public List<InterfaceC10706y0> mo33317g(C10214d c10214d, Function1<? super C10130f, Boolean> function1) {
        C9768m.m32346f(c10214d, "kindFilter");
        C9768m.m32346f(function1, "nameFilter");
        return m36164l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C10738e<InterfaceC10706y0> mo33311a(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(interfaceC9906b, "location");
        List<InterfaceC10706y0> m36164l = m36164l();
        C10738e<InterfaceC10706y0> c10738e = new C10738e<>();
        for (Object obj : m36164l) {
            if (C9768m.m32341a(((InterfaceC10706y0) obj).getName(), c10130f)) {
                c10738e.add(obj);
            }
        }
        return c10738e;
    }
}
