package kotlin.reflect.jvm.internal.impl.descriptors.p430n1;

import java.util.Map;
import kotlin.C10517i;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10178g;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;

/* compiled from: BuiltInAnnotationDescriptor.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n1.j */
/* loaded from: classes2.dex */
public final class C10590j implements InterfaceC10583c {

    /* renamed from: a */
    private final AbstractC9881h f40812a;

    /* renamed from: b */
    private final C10127c f40813b;

    /* renamed from: c */
    private final Map<C10130f, AbstractC10178g<?>> f40814c;

    /* renamed from: d */
    private final Lazy f40815d;

    /* compiled from: BuiltInAnnotationDescriptor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n1.j$a */
    static final class a extends Lambda implements Function0<AbstractC10335m0> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10335m0 invoke() {
            return C10590j.this.f40812a.m32797o(C10590j.this.mo33162d()).mo36400s();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10590j(AbstractC9881h abstractC9881h, C10127c c10127c, Map<C10130f, ? extends AbstractC10178g<?>> map) {
        Lazy m37593a;
        C9768m.m32346f(abstractC9881h, "builtIns");
        C9768m.m32346f(c10127c, "fqName");
        C9768m.m32346f(map, "allValueArguments");
        this.f40812a = abstractC9881h;
        this.f40813b = c10127c;
        this.f40814c = map;
        m37593a = C10517i.m37593a(LazyThreadSafetyMode.PUBLICATION, new a());
        this.f40815d = m37593a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c
    /* renamed from: a */
    public Map<C10130f, AbstractC10178g<?>> mo33159a() {
        return this.f40814c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c
    /* renamed from: d */
    public C10127c mo33162d() {
        return this.f40813b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c
    public AbstractC10311e0 getType() {
        Object value = this.f40815d.getValue();
        C9768m.m32345e(value, "<get-type>(...)");
        return (AbstractC10311e0) value;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c
    /* renamed from: t */
    public InterfaceC10708z0 mo33164t() {
        InterfaceC10708z0 interfaceC10708z0 = InterfaceC10708z0.f41247a;
        C9768m.m32345e(interfaceC10708z0, "NO_SOURCE");
        return interfaceC10708z0;
    }
}
