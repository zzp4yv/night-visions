package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10749c0;
import kotlin.collections.C10784u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10702w0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10706y0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.C9946e;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p386m.C9979e;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p386m.C9980f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10160j;
import kotlin.reflect.p371y.internal.p374j0.p400i.InterfaceC10155e;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.sequences.C10489n;
import kotlin.sequences.Sequence;

/* compiled from: ErasedOverridabilityCondition.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l */
/* loaded from: classes2.dex */
public final class C9950l implements InterfaceC10155e {

    /* compiled from: ErasedOverridabilityCondition.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37956a;

        static {
            int[] iArr = new int[C10160j.i.a.values().length];
            iArr[C10160j.i.a.OVERRIDABLE.ordinal()] = 1;
            f37956a = iArr;
        }
    }

    /* compiled from: ErasedOverridabilityCondition.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l$b */
    static final class b extends Lambda implements Function1<InterfaceC10566i1, AbstractC10311e0> {

        /* renamed from: f */
        public static final b f37957f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10311e0 invoke(InterfaceC10566i1 interfaceC10566i1) {
            return interfaceC10566i1.getType();
        }
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.InterfaceC10155e
    /* renamed from: a */
    public InterfaceC10155e.a mo33227a() {
        return InterfaceC10155e.a.SUCCESS_ONLY;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.InterfaceC10155e
    /* renamed from: b */
    public InterfaceC10155e.b mo33228b(InterfaceC10540a interfaceC10540a, InterfaceC10540a interfaceC10540a2, InterfaceC10552e interfaceC10552e) {
        Sequence m38575J;
        Sequence m37391u;
        Sequence m37394x;
        List m38892n;
        Sequence m37393w;
        boolean z;
        InterfaceC10540a mo36396c;
        C9768m.m32346f(interfaceC10540a, "superDescriptor");
        C9768m.m32346f(interfaceC10540a2, "subDescriptor");
        if (interfaceC10540a2 instanceof C9946e) {
            C9946e c9946e = (C9946e) interfaceC10540a2;
            C9768m.m32345e(c9946e.getTypeParameters(), "subDescriptor.typeParameters");
            if (!(!r0.isEmpty())) {
                C10160j.i m35879w = C10160j.m35879w(interfaceC10540a, interfaceC10540a2);
                if ((m35879w != null ? m35879w.m35898c() : null) != null) {
                    return InterfaceC10155e.b.UNKNOWN;
                }
                List<InterfaceC10566i1> mo37028f = c9946e.mo37028f();
                C9768m.m32345e(mo37028f, "subDescriptor.valueParameters");
                m38575J = C10749c0.m38575J(mo37028f);
                m37391u = C10489n.m37391u(m38575J, b.f37957f);
                AbstractC10311e0 returnType = c9946e.getReturnType();
                C9768m.m32343c(returnType);
                m37394x = C10489n.m37394x(m37391u, returnType);
                InterfaceC10702w0 mo37032m0 = c9946e.mo37032m0();
                m38892n = C10784u.m38892n(mo37032m0 != null ? mo37032m0.getType() : null);
                m37393w = C10489n.m37393w(m37394x, m38892n);
                Iterator it = m37393w.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    AbstractC10311e0 abstractC10311e0 = (AbstractC10311e0) it.next();
                    if ((abstractC10311e0.mo35991M0().isEmpty() ^ true) && !(abstractC10311e0.mo36635R0() instanceof C9980f)) {
                        z = true;
                        break;
                    }
                }
                if (!z && (mo36396c = interfaceC10540a.mo36396c(new C9979e(null, 1, null).m36726c())) != null) {
                    if (mo36396c instanceof InterfaceC10706y0) {
                        InterfaceC10706y0 interfaceC10706y0 = (InterfaceC10706y0) mo36396c;
                        C9768m.m32345e(interfaceC10706y0.getTypeParameters(), "erasedSuper.typeParameters");
                        if (!r0.isEmpty()) {
                            mo36396c = interfaceC10706y0.mo36992u().mo37006m(C10784u.m38888j()).mo36996c();
                            C9768m.m32343c(mo36396c);
                        }
                    }
                    C10160j.i.a m35898c = C10160j.f39520b.m35885F(mo36396c, interfaceC10540a2, false).m35898c();
                    C9768m.m32345e(m35898c, "DEFAULT.isOverridableByW…Descriptor, false).result");
                    return a.f37956a[m35898c.ordinal()] == 1 ? InterfaceC10155e.b.OVERRIDABLE : InterfaceC10155e.b.UNKNOWN;
                }
                return InterfaceC10155e.b.UNKNOWN;
            }
        }
        return InterfaceC10155e.b.UNKNOWN;
    }
}
