package kotlin.reflect.p371y.internal.p374j0.p375b.p377q;

import java.util.List;
import kotlin.collections.C10749c0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9757g0;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.C9786y;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10597a;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10598b;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10599c;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10641x;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10296m;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10292i;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;

/* compiled from: JvmBuiltIns.kt */
/* renamed from: kotlin.f0.y.e.j0.b.q.f */
/* loaded from: classes2.dex */
public final class C9899f extends AbstractC9881h {

    /* renamed from: h */
    static final /* synthetic */ KProperty<Object>[] f37699h = {C9757g0.m32304h(new C9786y(C9757g0.m32298b(C9899f.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};

    /* renamed from: i */
    private final a f37700i;

    /* renamed from: j */
    private Function0<b> f37701j;

    /* renamed from: k */
    private final InterfaceC10292i f37702k;

    /* compiled from: JvmBuiltIns.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.q.f$a */
    public enum a {
        FROM_DEPENDENCIES,
        FROM_CLASS_LOADER,
        FALLBACK
    }

    /* compiled from: JvmBuiltIns.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.q.f$b */
    public static final class b {

        /* renamed from: a */
        private final InterfaceC10559g0 f37707a;

        /* renamed from: b */
        private final boolean f37708b;

        public b(InterfaceC10559g0 interfaceC10559g0, boolean z) {
            C9768m.m32346f(interfaceC10559g0, "ownerModuleDescriptor");
            this.f37707a = interfaceC10559g0;
            this.f37708b = z;
        }

        /* renamed from: a */
        public final InterfaceC10559g0 m32959a() {
            return this.f37707a;
        }

        /* renamed from: b */
        public final boolean m32960b() {
            return this.f37708b;
        }
    }

    /* compiled from: JvmBuiltIns.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.q.f$c */
    public /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37709a;

        static {
            int[] iArr = new int[a.values().length];
            iArr[a.FROM_DEPENDENCIES.ordinal()] = 1;
            iArr[a.FROM_CLASS_LOADER.ordinal()] = 2;
            iArr[a.FALLBACK.ordinal()] = 3;
            f37709a = iArr;
        }
    }

    /* compiled from: JvmBuiltIns.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.q.f$d */
    static final class d extends Lambda implements Function0<C9900g> {

        /* renamed from: g */
        final /* synthetic */ InterfaceC10297n f37711g;

        /* compiled from: JvmBuiltIns.kt */
        /* renamed from: kotlin.f0.y.e.j0.b.q.f$d$a */
        static final class a extends Lambda implements Function0<b> {

            /* renamed from: f */
            final /* synthetic */ C9899f f37712f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C9899f c9899f) {
                super(0);
                this.f37712f = c9899f;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b invoke() {
                Function0 function0 = this.f37712f.f37701j;
                if (function0 == null) {
                    throw new AssertionError("JvmBuiltins instance has not been initialized properly");
                }
                b bVar = (b) function0.invoke();
                this.f37712f.f37701j = null;
                return bVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC10297n interfaceC10297n) {
            super(0);
            this.f37711g = interfaceC10297n;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C9900g invoke() {
            C10641x m32798r = C9899f.this.m32798r();
            C9768m.m32345e(m32798r, "builtInsModule");
            return new C9900g(m32798r, this.f37711g, new a(C9899f.this));
        }
    }

    /* compiled from: JvmBuiltIns.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.q.f$e */
    static final class e extends Lambda implements Function0<b> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC10559g0 f37713f;

        /* renamed from: g */
        final /* synthetic */ boolean f37714g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(InterfaceC10559g0 interfaceC10559g0, boolean z) {
            super(0);
            this.f37713f = interfaceC10559g0;
            this.f37714g = z;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b invoke() {
            return new b(this.f37713f, this.f37714g);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9899f(InterfaceC10297n interfaceC10297n, a aVar) {
        super(interfaceC10297n);
        C9768m.m32346f(interfaceC10297n, "storageManager");
        C9768m.m32346f(aVar, "kind");
        this.f37700i = aVar;
        this.f37702k = interfaceC10297n.mo36516d(new d(interfaceC10297n));
        int i2 = c.f37709a[aVar.ordinal()];
        if (i2 == 2) {
            m32788f(false);
        } else {
            if (i2 != 3) {
                return;
            }
            m32788f(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h
    /* renamed from: G0, reason: merged with bridge method [inline-methods] */
    public List<InterfaceC10598b> mo32802v() {
        List<InterfaceC10598b> m38608n0;
        Iterable<InterfaceC10598b> mo32802v = super.mo32802v();
        C9768m.m32345e(mo32802v, "super.getClassDescriptorFactories()");
        InterfaceC10297n m32782U = m32782U();
        C9768m.m32345e(m32782U, "storageManager");
        C10641x m32798r = m32798r();
        C9768m.m32345e(m32798r, "builtInsModule");
        m38608n0 = C10749c0.m38608n0(mo32802v, new C9898e(m32782U, m32798r, null, 4, null));
        return m38608n0;
    }

    /* renamed from: H0 */
    public final C9900g m32955H0() {
        return (C9900g) C10296m.m36555a(this.f37702k, this, f37699h[0]);
    }

    /* renamed from: I0 */
    public final void m32956I0(InterfaceC10559g0 interfaceC10559g0, boolean z) {
        C9768m.m32346f(interfaceC10559g0, "moduleDescriptor");
        m32957J0(new e(interfaceC10559g0, z));
    }

    /* renamed from: J0 */
    public final void m32957J0(Function0<b> function0) {
        C9768m.m32346f(function0, "computation");
        Function0<b> function02 = this.f37701j;
        this.f37701j = function0;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h
    /* renamed from: M */
    protected InterfaceC10599c mo32778M() {
        return m32955H0();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h
    /* renamed from: g */
    protected InterfaceC10597a mo32789g() {
        return m32955H0();
    }
}
