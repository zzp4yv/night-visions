package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p386m;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C10749c0;
import kotlin.collections.C10786v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.p371y.internal.p374j0.p399h.AbstractC10139c;
import kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10142f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10425y;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10300a1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10332l0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10361e;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10424a;
import kotlin.text.C10514v;

/* compiled from: RawType.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.m.f */
/* loaded from: classes2.dex */
public final class C9980f extends AbstractC10425y implements InterfaceC10332l0 {

    /* compiled from: RawType.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.m.f$a */
    static final class a extends Lambda implements Function1<String, CharSequence> {

        /* renamed from: f */
        public static final a f38181f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(String str) {
            C9768m.m32346f(str, "it");
            return "(raw) " + str;
        }
    }

    private C9980f(AbstractC10335m0 abstractC10335m0, AbstractC10335m0 abstractC10335m02, boolean z) {
        super(abstractC10335m0, abstractC10335m02);
        if (z) {
            return;
        }
        InterfaceC10361e.f40181a.mo36920d(abstractC10335m0, abstractC10335m02);
    }

    /* renamed from: b1 */
    private static final boolean m33541b1(String str, String str2) {
        String m37573m0;
        m37573m0 = C10514v.m37573m0(str2, "out ");
        return C9768m.m32341a(str, m37573m0) || C9768m.m32341a(str2, "*");
    }

    /* renamed from: c1 */
    private static final List<String> m33542c1(AbstractC10139c abstractC10139c, AbstractC10311e0 abstractC10311e0) {
        List<InterfaceC10318g1> mo35991M0 = abstractC10311e0.mo35991M0();
        ArrayList arrayList = new ArrayList(C10786v.m38911u(mo35991M0, 10));
        Iterator<T> it = mo35991M0.iterator();
        while (it.hasNext()) {
            arrayList.add(abstractC10139c.mo35506x((InterfaceC10318g1) it.next()));
        }
        return arrayList;
    }

    /* renamed from: d1 */
    private static final String m33543d1(String str, String str2) {
        boolean m37536I;
        String m37543L0;
        String m37537I0;
        m37536I = C10514v.m37536I(str, '<', false, 2, null);
        if (!m37536I) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        m37543L0 = C10514v.m37543L0(str, '<', null, 2, null);
        sb.append(m37543L0);
        sb.append('<');
        sb.append(str2);
        sb.append('>');
        m37537I0 = C10514v.m37537I0(str, '>', null, 2, null);
        sb.append(m37537I0);
        return sb.toString();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10425y
    /* renamed from: V0 */
    public AbstractC10335m0 mo33548V0() {
        return m37161W0();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10425y
    /* renamed from: Y0 */
    public String mo33549Y0(AbstractC10139c abstractC10139c, InterfaceC10142f interfaceC10142f) {
        String m38599e0;
        List m38580L0;
        C9768m.m32346f(abstractC10139c, "renderer");
        C9768m.m32346f(interfaceC10142f, "options");
        String mo35505w = abstractC10139c.mo35505w(m37161W0());
        String mo35505w2 = abstractC10139c.mo35505w(m37162X0());
        if (interfaceC10142f.mo35655n()) {
            return "raw (" + mo35505w + ".." + mo35505w2 + ')';
        }
        if (m37162X0().mo35991M0().isEmpty()) {
            return abstractC10139c.mo35502t(mo35505w, mo35505w2, C10424a.m37142h(this));
        }
        List<String> m33542c1 = m33542c1(abstractC10139c, m37161W0());
        List<String> m33542c12 = m33542c1(abstractC10139c, m37162X0());
        m38599e0 = C10749c0.m38599e0(m33542c1, ", ", null, null, 0, null, a.f38181f, 30, null);
        m38580L0 = C10749c0.m38580L0(m33542c1, m33542c12);
        boolean z = true;
        if (!(m38580L0 instanceof Collection) || !m38580L0.isEmpty()) {
            Iterator it = m38580L0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Pair pair = (Pair) it.next();
                if (!m33541b1((String) pair.m37648c(), (String) pair.m37649d())) {
                    z = false;
                    break;
                }
            }
        }
        if (z) {
            mo35505w2 = m33543d1(mo35505w2, m38599e0);
        }
        String m33543d1 = m33543d1(mo35505w, m38599e0);
        return C9768m.m32341a(m33543d1, mo35505w2) ? m33543d1 : abstractC10139c.mo35502t(m33543d1, mo35505w2, C10424a.m37142h(this));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public C9980f mo33545S0(boolean z) {
        return new C9980f(m37161W0().mo33545S0(z), m37162X0().mo33545S0(z));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public AbstractC10425y mo36558Y0(AbstractC10363g abstractC10363g) {
        C9768m.m32346f(abstractC10363g, "kotlinTypeRefiner");
        AbstractC10311e0 mo36717a = abstractC10363g.mo36717a(m37161W0());
        C9768m.m32344d(mo36717a, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        AbstractC10311e0 mo36717a2 = abstractC10363g.mo36717a(m37162X0());
        C9768m.m32344d(mo36717a2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C9980f((AbstractC10335m0) mo36717a, (AbstractC10335m0) mo36717a2, true);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1
    /* renamed from: e1, reason: merged with bridge method [inline-methods] */
    public C9980f mo33547U0(C10300a1 c10300a1) {
        C9768m.m32346f(c10300a1, "newAttributes");
        return new C9980f(m37161W0().mo33547U0(c10300a1), m37162X0().mo33547U0(c10300a1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10425y, kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: q */
    public InterfaceC10218h mo33553q() {
        InterfaceC10561h mo32891w = mo35993O0().mo32891w();
        C9981g c9981g = null;
        Object[] objArr = 0;
        InterfaceC10552e interfaceC10552e = mo32891w instanceof InterfaceC10552e ? (InterfaceC10552e) mo32891w : null;
        if (interfaceC10552e != null) {
            InterfaceC10218h mo37678a0 = interfaceC10552e.mo37678a0(new C9979e(c9981g, 1, objArr == true ? 1 : 0));
            C9768m.m32345e(mo37678a0, "classDescriptor.getMemberScope(RawSubstitution())");
            return mo37678a0;
        }
        throw new IllegalStateException(("Incorrect classifier: " + mo35993O0().mo32891w()).toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9980f(AbstractC10335m0 abstractC10335m0, AbstractC10335m0 abstractC10335m02) {
        this(abstractC10335m0, abstractC10335m02, false);
        C9768m.m32346f(abstractC10335m0, "lowerBound");
        C9768m.m32346f(abstractC10335m02, "upperBound");
    }
}
