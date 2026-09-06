package kotlin.reflect.p371y.internal.p374j0.p410j.p411b;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.C10784u;
import kotlin.collections.C10789w0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10571k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10596o0;
import kotlin.reflect.jvm.internal.impl.utils.C10734a;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10291h;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;

/* compiled from: AbstractDeserializedPackageFragmentProvider.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.a */
/* loaded from: classes3.dex */
public abstract class AbstractC10235a implements InterfaceC10596o0 {

    /* renamed from: a */
    private final InterfaceC10297n f39708a;

    /* renamed from: b */
    private final InterfaceC10278u f39709b;

    /* renamed from: c */
    private final InterfaceC10559g0 f39710c;

    /* renamed from: d */
    protected C10268k f39711d;

    /* renamed from: e */
    private final InterfaceC10291h<C10127c, InterfaceC10571k0> f39712e;

    /* compiled from: AbstractDeserializedPackageFragmentProvider.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.a$a */
    static final class a extends Lambda implements Function1<C10127c, InterfaceC10571k0> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10571k0 invoke(C10127c c10127c) {
            C9768m.m32346f(c10127c, "fqName");
            AbstractC10273p mo33001d = AbstractC10235a.this.mo33001d(c10127c);
            if (mo33001d == null) {
                return null;
            }
            mo33001d.mo36465M0(AbstractC10235a.this.m36198e());
            return mo33001d;
        }
    }

    public AbstractC10235a(InterfaceC10297n interfaceC10297n, InterfaceC10278u interfaceC10278u, InterfaceC10559g0 interfaceC10559g0) {
        C9768m.m32346f(interfaceC10297n, "storageManager");
        C9768m.m32346f(interfaceC10278u, "finder");
        C9768m.m32346f(interfaceC10559g0, "moduleDescriptor");
        this.f39708a = interfaceC10297n;
        this.f39709b = interfaceC10278u;
        this.f39710c = interfaceC10559g0;
        this.f39712e = interfaceC10297n.mo36521i(new a());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10574l0
    /* renamed from: a */
    public List<InterfaceC10571k0> mo33276a(C10127c c10127c) {
        List<InterfaceC10571k0> m38892n;
        C9768m.m32346f(c10127c, "fqName");
        m38892n = C10784u.m38892n(this.f39712e.invoke(c10127c));
        return m38892n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10596o0
    /* renamed from: b */
    public void mo33277b(C10127c c10127c, Collection<InterfaceC10571k0> collection) {
        C9768m.m32346f(c10127c, "fqName");
        C9768m.m32346f(collection, "packageFragments");
        C10734a.m38508a(collection, this.f39712e.invoke(c10127c));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10596o0
    /* renamed from: c */
    public boolean mo33278c(C10127c c10127c) {
        C9768m.m32346f(c10127c, "fqName");
        return (this.f39712e.mo36544f(c10127c) ? (InterfaceC10571k0) this.f39712e.invoke(c10127c) : mo33001d(c10127c)) == null;
    }

    /* renamed from: d */
    protected abstract AbstractC10273p mo33001d(C10127c c10127c);

    /* renamed from: e */
    protected final C10268k m36198e() {
        C10268k c10268k = this.f39711d;
        if (c10268k != null) {
            return c10268k;
        }
        C9768m.m32363w("components");
        return null;
    }

    /* renamed from: f */
    protected final InterfaceC10278u m36199f() {
        return this.f39709b;
    }

    /* renamed from: g */
    protected final InterfaceC10559g0 m36200g() {
        return this.f39710c;
    }

    /* renamed from: h */
    protected final InterfaceC10297n m36201h() {
        return this.f39708a;
    }

    /* renamed from: i */
    protected final void m36202i(C10268k c10268k) {
        C9768m.m32346f(c10268k, "<set-?>");
        this.f39711d = c10268k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10574l0
    /* renamed from: p */
    public Collection<C10127c> mo33280p(C10127c c10127c, Function1<? super C10130f, Boolean> function1) {
        Set m38917d;
        C9768m.m32346f(c10127c, "fqName");
        C9768m.m32346f(function1, "nameFilter");
        m38917d = C10789w0.m38917d();
        return m38917d;
    }
}
