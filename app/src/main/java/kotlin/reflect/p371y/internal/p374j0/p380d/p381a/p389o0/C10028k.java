package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0;

import java.util.List;
import kotlin.collections.C10784u;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;

/* compiled from: predefinedEnhancementInfo.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.o0.k */
/* loaded from: classes3.dex */
public final class C10028k {

    /* renamed from: a */
    private final C10034q f38270a;

    /* renamed from: b */
    private final List<C10034q> f38271b;

    /* JADX WARN: Multi-variable type inference failed */
    public C10028k() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public C10028k(C10034q c10034q, List<C10034q> list) {
        C9768m.m32346f(list, "parametersInfo");
        this.f38270a = c10034q;
        this.f38271b = list;
    }

    /* renamed from: a */
    public final List<C10034q> m33735a() {
        return this.f38271b;
    }

    /* renamed from: b */
    public final C10034q m33736b() {
        return this.f38270a;
    }

    public /* synthetic */ C10028k(C10034q c10034q, List list, int i2, C9756g c9756g) {
        this((i2 & 1) != 0 ? null : c10034q, (i2 & 2) != 0 ? C10784u.m38888j() : list);
    }
}
