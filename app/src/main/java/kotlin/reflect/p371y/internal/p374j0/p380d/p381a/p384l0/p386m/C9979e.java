package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p386m;

import cm.aptoide.p092pt.database.room.RoomNotification;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.C10740s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C10782t;
import kotlin.collections.C10786v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.EnumC9940k;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10327j1;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10300a1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10302b0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10314f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10317g0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10324i1;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10351r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10394k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.EnumC10393j;

/* compiled from: RawType.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.m.e */
/* loaded from: classes2.dex */
public final class C9979e extends AbstractC10327j1 {

    /* renamed from: c */
    public static final a f38172c = new a(null);

    /* renamed from: d */
    private static final C9975a f38173d;

    /* renamed from: e */
    private static final C9975a f38174e;

    /* renamed from: f */
    private final C9981g f38175f;

    /* compiled from: RawType.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.m.e$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }
    }

    /* compiled from: RawType.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.m.e$b */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38176a;

        static {
            int[] iArr = new int[EnumC9976b.values().length];
            iArr[EnumC9976b.FLEXIBLE_LOWER_BOUND.ordinal()] = 1;
            iArr[EnumC9976b.FLEXIBLE_UPPER_BOUND.ordinal()] = 2;
            iArr[EnumC9976b.INFLEXIBLE.ordinal()] = 3;
            f38176a = iArr;
        }
    }

    /* compiled from: RawType.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.m.e$c */
    static final class c extends Lambda implements Function1<AbstractC10363g, AbstractC10335m0> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC10552e f38177f;

        /* renamed from: g */
        final /* synthetic */ C9979e f38178g;

        /* renamed from: h */
        final /* synthetic */ AbstractC10335m0 f38179h;

        /* renamed from: i */
        final /* synthetic */ C9975a f38180i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC10552e interfaceC10552e, C9979e c9979e, AbstractC10335m0 abstractC10335m0, C9975a c9975a) {
            super(1);
            this.f38177f = interfaceC10552e;
            this.f38178g = c9979e;
            this.f38179h = abstractC10335m0;
            this.f38180i = c9975a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10335m0 invoke(AbstractC10363g abstractC10363g) {
            C10126b m36073g;
            InterfaceC10552e mo36924b;
            C9768m.m32346f(abstractC10363g, "kotlinTypeRefiner");
            InterfaceC10552e interfaceC10552e = this.f38177f;
            if (!(interfaceC10552e instanceof InterfaceC10552e)) {
                interfaceC10552e = null;
            }
            if (interfaceC10552e == null || (m36073g = C10202a.m36073g(interfaceC10552e)) == null || (mo36924b = abstractC10363g.mo36924b(m36073g)) == null || C9768m.m32341a(mo36924b, this.f38177f)) {
                return null;
            }
            return (AbstractC10335m0) this.f38178g.m33533l(this.f38179h, mo36924b, this.f38180i).m37648c();
        }
    }

    static {
        EnumC9940k enumC9940k = EnumC9940k.COMMON;
        f38173d = C9978d.m33530d(enumC9940k, false, null, 3, null).m33507i(EnumC9976b.FLEXIBLE_LOWER_BOUND);
        f38174e = C9978d.m33530d(enumC9940k, false, null, 3, null).m33507i(EnumC9976b.FLEXIBLE_UPPER_BOUND);
    }

    public C9979e(C9981g c9981g) {
        this.f38175f = c9981g == null ? new C9981g(this) : c9981g;
    }

    /* renamed from: k */
    public static /* synthetic */ InterfaceC10318g1 m33532k(C9979e c9979e, InterfaceC10554e1 interfaceC10554e1, C9975a c9975a, AbstractC10311e0 abstractC10311e0, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            abstractC10311e0 = c9979e.f38175f.m33559c(interfaceC10554e1, true, c9975a);
            C9768m.m32345e(abstractC10311e0, "typeParameterUpperBoundE…eter, isRaw = true, attr)");
        }
        return c9979e.m33538j(interfaceC10554e1, c9975a, abstractC10311e0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final Pair<AbstractC10335m0, Boolean> m33533l(AbstractC10335m0 abstractC10335m0, InterfaceC10552e interfaceC10552e, C9975a c9975a) {
        if (abstractC10335m0.mo35993O0().getParameters().isEmpty()) {
            return C10740s.m38547a(abstractC10335m0, Boolean.FALSE);
        }
        if (AbstractC9881h.m32738c0(abstractC10335m0)) {
            InterfaceC10318g1 interfaceC10318g1 = abstractC10335m0.mo35991M0().get(0);
            EnumC10351r1 mo36708a = interfaceC10318g1.mo36708a();
            AbstractC10311e0 type = interfaceC10318g1.getType();
            C9768m.m32345e(type, "componentTypeProjection.type");
            return C10740s.m38547a(C10314f0.m36669i(abstractC10335m0.mo35992N0(), abstractC10335m0.mo35993O0(), C10782t.m38883e(new C10324i1(mo36708a, m33534m(type, c9975a))), abstractC10335m0.mo33691P0(), null, 16, null), Boolean.FALSE);
        }
        if (C10317g0.m36706a(abstractC10335m0)) {
            return C10740s.m38547a(C10394k.m37053d(EnumC10393j.f40293N, abstractC10335m0.mo35993O0().toString()), Boolean.FALSE);
        }
        InterfaceC10218h mo37678a0 = interfaceC10552e.mo37678a0(this);
        C9768m.m32345e(mo37678a0, "declaration.getMemberScope(this)");
        C10300a1 mo35992N0 = abstractC10335m0.mo35992N0();
        InterfaceC10312e1 mo32877h = interfaceC10552e.mo32877h();
        C9768m.m32345e(mo32877h, "declaration.typeConstructor");
        List<InterfaceC10554e1> parameters = interfaceC10552e.mo32877h().getParameters();
        C9768m.m32345e(parameters, "declaration.typeConstructor.parameters");
        ArrayList arrayList = new ArrayList(C10786v.m38911u(parameters, 10));
        for (InterfaceC10554e1 interfaceC10554e1 : parameters) {
            C9768m.m32345e(interfaceC10554e1, MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
            arrayList.add(m33532k(this, interfaceC10554e1, c9975a, null, 4, null));
        }
        return C10740s.m38547a(C10314f0.m36671k(mo35992N0, mo32877h, arrayList, abstractC10335m0.mo33691P0(), mo37678a0, new c(interfaceC10552e, this, abstractC10335m0, c9975a)), Boolean.TRUE);
    }

    /* renamed from: m */
    private final AbstractC10311e0 m33534m(AbstractC10311e0 abstractC10311e0, C9975a c9975a) {
        InterfaceC10561h mo32891w = abstractC10311e0.mo35993O0().mo32891w();
        if (mo32891w instanceof InterfaceC10554e1) {
            AbstractC10311e0 m33559c = this.f38175f.m33559c((InterfaceC10554e1) mo32891w, true, c9975a);
            C9768m.m32345e(m33559c, "typeParameterUpperBoundE…tion, isRaw = true, attr)");
            return m33534m(m33559c, c9975a);
        }
        if (!(mo32891w instanceof InterfaceC10552e)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + mo32891w).toString());
        }
        InterfaceC10561h mo32891w2 = C10302b0.m36585d(abstractC10311e0).mo35993O0().mo32891w();
        if (mo32891w2 instanceof InterfaceC10552e) {
            Pair<AbstractC10335m0, Boolean> m33533l = m33533l(C10302b0.m36584c(abstractC10311e0), (InterfaceC10552e) mo32891w, f38173d);
            AbstractC10335m0 m37646a = m33533l.m37646a();
            boolean booleanValue = m33533l.m37647b().booleanValue();
            Pair<AbstractC10335m0, Boolean> m33533l2 = m33533l(C10302b0.m36585d(abstractC10311e0), (InterfaceC10552e) mo32891w2, f38174e);
            AbstractC10335m0 m37646a2 = m33533l2.m37646a();
            return (booleanValue || m33533l2.m37647b().booleanValue()) ? new C9980f(m37646a, m37646a2) : C10314f0.m36664d(m37646a, m37646a2);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + mo32891w2 + "\" while for lower it's \"" + mo32891w + '\"').toString());
    }

    /* renamed from: n */
    static /* synthetic */ AbstractC10311e0 m33535n(C9979e c9979e, AbstractC10311e0 abstractC10311e0, C9975a c9975a, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c9975a = new C9975a(EnumC9940k.COMMON, null, false, null, null, 30, null);
        }
        return c9979e.m33534m(abstractC10311e0, c9975a);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10327j1
    /* renamed from: f */
    public boolean mo33537f() {
        return false;
    }

    /* renamed from: j */
    public final InterfaceC10318g1 m33538j(InterfaceC10554e1 interfaceC10554e1, C9975a c9975a, AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(interfaceC10554e1, MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
        C9768m.m32346f(c9975a, "attr");
        C9768m.m32346f(abstractC10311e0, "erasedUpperBound");
        int i2 = b.f38176a[c9975a.m33502d().ordinal()];
        if (i2 == 1) {
            return new C10324i1(EnumC10351r1.INVARIANT, abstractC10311e0);
        }
        if (i2 != 2 && i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (!interfaceC10554e1.mo37672n().m36819k()) {
            return new C10324i1(EnumC10351r1.INVARIANT, C10202a.m36072f(interfaceC10554e1).m32773H());
        }
        List<InterfaceC10554e1> parameters = abstractC10311e0.mo35993O0().getParameters();
        C9768m.m32345e(parameters, "erasedUpperBound.constructor.parameters");
        return parameters.isEmpty() ^ true ? new C10324i1(EnumC10351r1.OUT_VARIANCE, abstractC10311e0) : C9978d.m33528b(interfaceC10554e1, c9975a);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10327j1
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public C10324i1 mo33536e(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, RoomNotification.KEY);
        return new C10324i1(m33535n(this, abstractC10311e0, null, 2, null));
    }

    public /* synthetic */ C9979e(C9981g c9981g, int i2, C9756g c9756g) {
        this((i2 & 1) != 0 ? null : c9981g);
    }
}
