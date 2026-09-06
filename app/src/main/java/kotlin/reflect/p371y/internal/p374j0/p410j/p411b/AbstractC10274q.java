package kotlin.reflect.p371y.internal.p374j0.p410j.p411b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.C10786v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10100l;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10101m;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10103o;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10104p;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.AbstractC10116a;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10119d;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.C10259i;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10256f;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;

/* compiled from: DeserializedPackageFragmentImpl.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.q */
/* loaded from: classes3.dex */
public abstract class AbstractC10274q extends AbstractC10273p {

    /* renamed from: m */
    private final AbstractC10116a f39946m;

    /* renamed from: n */
    private final InterfaceC10256f f39947n;

    /* renamed from: o */
    private final C10119d f39948o;

    /* renamed from: p */
    private final C10282y f39949p;

    /* renamed from: q */
    private C10101m f39950q;

    /* renamed from: r */
    private InterfaceC10218h f39951r;

    /* compiled from: DeserializedPackageFragmentImpl.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.q$a */
    static final class a extends Lambda implements Function1<C10126b, InterfaceC10708z0> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10708z0 invoke(C10126b c10126b) {
            C9768m.m32346f(c10126b, "it");
            InterfaceC10256f interfaceC10256f = AbstractC10274q.this.f39947n;
            if (interfaceC10256f != null) {
                return interfaceC10256f;
            }
            InterfaceC10708z0 interfaceC10708z0 = InterfaceC10708z0.f41247a;
            C9768m.m32345e(interfaceC10708z0, "NO_SOURCE");
            return interfaceC10708z0;
        }
    }

    /* compiled from: DeserializedPackageFragmentImpl.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.q$b */
    static final class b extends Lambda implements Function0<Collection<? extends C10130f>> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Collection<C10130f> invoke() {
            Collection<C10126b> m36496b = AbstractC10274q.this.mo36463A0().m36496b();
            ArrayList arrayList = new ArrayList();
            for (Object obj : m36496b) {
                C10126b c10126b = (C10126b) obj;
                if ((c10126b.m35417l() || C10266i.f39901a.m36412a().contains(c10126b)) ? false : true) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C10786v.m38911u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C10126b) it.next()).m35415j());
            }
            return arrayList2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC10274q(C10127c c10127c, InterfaceC10297n interfaceC10297n, InterfaceC10559g0 interfaceC10559g0, C10101m c10101m, AbstractC10116a abstractC10116a, InterfaceC10256f interfaceC10256f) {
        super(c10127c, interfaceC10297n, interfaceC10559g0);
        C9768m.m32346f(c10127c, "fqName");
        C9768m.m32346f(interfaceC10297n, "storageManager");
        C9768m.m32346f(interfaceC10559g0, "module");
        C9768m.m32346f(c10101m, "proto");
        C9768m.m32346f(abstractC10116a, "metadataVersion");
        this.f39946m = abstractC10116a;
        this.f39947n = interfaceC10256f;
        C10104p m34835O = c10101m.m34835O();
        C9768m.m32345e(m34835O, "proto.strings");
        C10103o m34834N = c10101m.m34834N();
        C9768m.m32345e(m34834N, "proto.qualifiedNames");
        C10119d c10119d = new C10119d(m34835O, m34834N);
        this.f39948o = c10119d;
        this.f39949p = new C10282y(c10101m, c10119d, abstractC10116a, new a());
        this.f39950q = c10101m;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.AbstractC10273p
    /* renamed from: M0 */
    public void mo36465M0(C10268k c10268k) {
        C9768m.m32346f(c10268k, "components");
        C10101m c10101m = this.f39950q;
        if (c10101m == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize".toString());
        }
        this.f39950q = null;
        C10100l m34833M = c10101m.m34833M();
        C9768m.m32345e(m34833M, "proto.`package`");
        this.f39951r = new C10259i(this, m34833M, this.f39948o, this.f39946m, this.f39947n, c10268k, "scope of " + this, new b());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.AbstractC10273p
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public C10282y mo36463A0() {
        return this.f39949p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10571k0
    /* renamed from: q */
    public InterfaceC10218h mo32988q() {
        InterfaceC10218h interfaceC10218h = this.f39951r;
        if (interfaceC10218h != null) {
            return interfaceC10218h;
        }
        C9768m.m32363w("_memberScope");
        return null;
    }
}
