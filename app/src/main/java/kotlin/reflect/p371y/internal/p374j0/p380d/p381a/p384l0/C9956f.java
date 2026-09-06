package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0;

import java.util.Collection;
import java.util.List;
import kotlin.C10530j;
import kotlin.Lazy;
import kotlin.collections.C10784u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10571k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10596o0;
import kotlin.reflect.jvm.internal.impl.utils.C10734a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.InterfaceC10017o;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.InterfaceC9961k;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C9969h;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10011u;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10284a;

/* compiled from: LazyJavaPackageFragmentProvider.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.f */
/* loaded from: classes2.dex */
public final class C9956f implements InterfaceC10596o0 {

    /* renamed from: a */
    private final C9957g f37994a;

    /* renamed from: b */
    private final InterfaceC10284a<C10127c, C9969h> f37995b;

    /* compiled from: LazyJavaPackageFragmentProvider.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.f$a */
    static final class a extends Lambda implements Function0<C9969h> {

        /* renamed from: g */
        final /* synthetic */ InterfaceC10011u f37997g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC10011u interfaceC10011u) {
            super(0);
            this.f37997g = interfaceC10011u;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C9969h invoke() {
            return new C9969h(C9956f.this.f37994a, this.f37997g);
        }
    }

    public C9956f(C9952b c9952b) {
        Lazy m37644c;
        C9768m.m32346f(c9952b, "components");
        InterfaceC9961k.a aVar = InterfaceC9961k.a.f38010a;
        m37644c = C10530j.m37644c(null);
        C9957g c9957g = new C9957g(c9952b, aVar, m37644c);
        this.f37994a = c9957g;
        this.f37995b = c9957g.m33286e().mo36514b();
    }

    /* renamed from: e */
    private final C9969h m33275e(C10127c c10127c) {
        InterfaceC10011u m33632a = InterfaceC10017o.a.m33632a(this.f37994a.m33282a().m33244d(), c10127c, false, 2, null);
        if (m33632a == null) {
            return null;
        }
        return this.f37995b.mo36506b(c10127c, new a(m33632a));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10574l0
    /* renamed from: a */
    public List<C9969h> mo33276a(C10127c c10127c) {
        List<C9969h> m38892n;
        C9768m.m32346f(c10127c, "fqName");
        m38892n = C10784u.m38892n(m33275e(c10127c));
        return m38892n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10596o0
    /* renamed from: b */
    public void mo33277b(C10127c c10127c, Collection<InterfaceC10571k0> collection) {
        C9768m.m32346f(c10127c, "fqName");
        C9768m.m32346f(collection, "packageFragments");
        C10734a.m38508a(collection, m33275e(c10127c));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10596o0
    /* renamed from: c */
    public boolean mo33278c(C10127c c10127c) {
        C9768m.m32346f(c10127c, "fqName");
        return InterfaceC10017o.a.m33632a(this.f37994a.m33282a().m33244d(), c10127c, false, 2, null) == null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10574l0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public List<C10127c> mo33280p(C10127c c10127c, Function1<? super C10130f, Boolean> function1) {
        C9768m.m32346f(c10127c, "fqName");
        C9768m.m32346f(function1, "nameFilter");
        C9969h m33275e = m33275e(c10127c);
        List<C10127c> m33429P0 = m33275e != null ? m33275e.m33429P0() : null;
        return m33429P0 == null ? C10784u.m38888j() : m33429P0;
    }

    public String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f37994a.m33282a().m33253m();
    }
}
