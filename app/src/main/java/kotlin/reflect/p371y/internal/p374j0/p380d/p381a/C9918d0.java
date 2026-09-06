package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10129e;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10289f;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10291h;

/* compiled from: JavaNullabilityAnnotationSettings.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.d0 */
/* loaded from: classes2.dex */
public final class C9918d0<T> implements InterfaceC9916c0<T> {

    /* renamed from: b */
    private final Map<C10127c, T> f37842b;

    /* renamed from: c */
    private final C10289f f37843c;

    /* renamed from: d */
    private final InterfaceC10291h<C10127c, T> f37844d;

    /* compiled from: JavaNullabilityAnnotationSettings.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.d0$a */
    static final class a extends Lambda implements Function1<C10127c, T> {

        /* renamed from: f */
        final /* synthetic */ C9918d0<T> f37845f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C9918d0<T> c9918d0) {
            super(1);
            this.f37845f = c9918d0;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final T invoke(C10127c c10127c) {
            C9768m.m32345e(c10127c, "it");
            return (T) C10129e.m35443a(c10127c, this.f37845f.m33073b());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9918d0(Map<C10127c, ? extends T> map) {
        C9768m.m32346f(map, "states");
        this.f37842b = map;
        C10289f c10289f = new C10289f("Java nullability annotation states");
        this.f37843c = c10289f;
        InterfaceC10291h<C10127c, T> mo36521i = c10289f.mo36521i(new a(this));
        C9768m.m32345e(mo36521i, "storageManager.createMem…cificFqname(states)\n    }");
        this.f37844d = mo36521i;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.InterfaceC9916c0
    /* renamed from: a */
    public T mo33066a(C10127c c10127c) {
        C9768m.m32346f(c10127c, "fqName");
        return this.f37844d.invoke(c10127c);
    }

    /* renamed from: b */
    public final Map<C10127c, T> m33073b() {
        return this.f37842b;
    }
}
