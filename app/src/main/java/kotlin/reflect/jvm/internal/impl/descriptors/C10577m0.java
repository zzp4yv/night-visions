package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10749c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.sequences.C10489n;
import kotlin.sequences.Sequence;

/* compiled from: PackageFragmentProviderImpl.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.m0 */
/* loaded from: classes2.dex */
public final class C10577m0 implements InterfaceC10596o0 {

    /* renamed from: a */
    private final Collection<InterfaceC10571k0> f40782a;

    /* compiled from: PackageFragmentProviderImpl.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.m0$a */
    static final class a extends Lambda implements Function1<InterfaceC10571k0, C10127c> {

        /* renamed from: f */
        public static final a f40783f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C10127c invoke(InterfaceC10571k0 interfaceC10571k0) {
            C9768m.m32346f(interfaceC10571k0, "it");
            return interfaceC10571k0.mo37712d();
        }
    }

    /* compiled from: PackageFragmentProviderImpl.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.m0$b */
    static final class b extends Lambda implements Function1<C10127c, Boolean> {

        /* renamed from: f */
        final /* synthetic */ C10127c f40784f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C10127c c10127c) {
            super(1);
            this.f40784f = c10127c;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C10127c c10127c) {
            C9768m.m32346f(c10127c, "it");
            return Boolean.valueOf(!c10127c.m35422d() && C9768m.m32341a(c10127c.m35423e(), this.f40784f));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10577m0(Collection<? extends InterfaceC10571k0> collection) {
        C9768m.m32346f(collection, "packageFragments");
        this.f40782a = collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10574l0
    /* renamed from: a */
    public List<InterfaceC10571k0> mo33276a(C10127c c10127c) {
        C9768m.m32346f(c10127c, "fqName");
        Collection<InterfaceC10571k0> collection = this.f40782a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (C9768m.m32341a(((InterfaceC10571k0) obj).mo37712d(), c10127c)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10596o0
    /* renamed from: b */
    public void mo33277b(C10127c c10127c, Collection<InterfaceC10571k0> collection) {
        C9768m.m32346f(c10127c, "fqName");
        C9768m.m32346f(collection, "packageFragments");
        for (Object obj : this.f40782a) {
            if (C9768m.m32341a(((InterfaceC10571k0) obj).mo37712d(), c10127c)) {
                collection.add(obj);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10596o0
    /* renamed from: c */
    public boolean mo33278c(C10127c c10127c) {
        C9768m.m32346f(c10127c, "fqName");
        Collection<InterfaceC10571k0> collection = this.f40782a;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (C9768m.m32341a(((InterfaceC10571k0) it.next()).mo37712d(), c10127c)) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10574l0
    /* renamed from: p */
    public Collection<C10127c> mo33280p(C10127c c10127c, Function1<? super C10130f, Boolean> function1) {
        Sequence m38575J;
        Sequence m37391u;
        Sequence m37382l;
        List m37377A;
        C9768m.m32346f(c10127c, "fqName");
        C9768m.m32346f(function1, "nameFilter");
        m38575J = C10749c0.m38575J(this.f40782a);
        m37391u = C10489n.m37391u(m38575J, a.f40783f);
        m37382l = C10489n.m37382l(m37391u, new b(c10127c));
        m37377A = C10489n.m37377A(m37382l);
        return m37377A;
    }
}
