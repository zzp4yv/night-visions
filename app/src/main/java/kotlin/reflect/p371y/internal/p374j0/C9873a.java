package kotlin.reflect.p371y.internal.p374j0;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C10784u;
import kotlin.jvm.internal.C9749c0;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C10047z;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9912a0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;

/* compiled from: SpecialJvmAnnotations.kt */
/* renamed from: kotlin.f0.y.e.j0.a */
/* loaded from: classes2.dex */
public final class C9873a {

    /* renamed from: a */
    public static final C9873a f37442a = new C9873a();

    /* renamed from: b */
    private static final Set<C10126b> f37443b;

    /* renamed from: c */
    private static final C10126b f37444c;

    /* compiled from: SpecialJvmAnnotations.kt */
    /* renamed from: kotlin.f0.y.e.j0.a$a */
    public static final class a implements InterfaceC10068q.c {

        /* renamed from: a */
        final /* synthetic */ C9749c0 f37445a;

        a(C9749c0 c9749c0) {
            this.f37445a = c9749c0;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q.c
        /* renamed from: a */
        public void mo32695a() {
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q.c
        /* renamed from: b */
        public InterfaceC10068q.a mo32696b(C10126b c10126b, InterfaceC10708z0 interfaceC10708z0) {
            C9768m.m32346f(c10126b, "classId");
            C9768m.m32346f(interfaceC10708z0, "source");
            if (!C9768m.m32341a(c10126b, C10047z.f38329a.m33834a())) {
                return null;
            }
            this.f37445a.f37168f = true;
            return null;
        }
    }

    static {
        List m38891m;
        m38891m = C10784u.m38891m(C9912a0.f37786a, C9912a0.f37796k, C9912a0.f37797l, C9912a0.f37789d, C9912a0.f37791f, C9912a0.f37794i);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = m38891m.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(C10126b.m35408m((C10127c) it.next()));
        }
        f37443b = linkedHashSet;
        C10126b m35408m = C10126b.m35408m(C9912a0.f37795j);
        C9768m.m32345e(m35408m, "topLevel(JvmAnnotationNames.REPEATABLE_ANNOTATION)");
        f37444c = m35408m;
    }

    private C9873a() {
    }

    /* renamed from: a */
    public final C10126b m32692a() {
        return f37444c;
    }

    /* renamed from: b */
    public final Set<C10126b> m32693b() {
        return f37443b;
    }

    /* renamed from: c */
    public final boolean m32694c(InterfaceC10068q interfaceC10068q) {
        C9768m.m32346f(interfaceC10068q, "klass");
        C9749c0 c9749c0 = new C9749c0();
        interfaceC10068q.mo34026b(new a(c9749c0), null);
        return c9749c0.f37168f;
    }
}
