package kotlin.reflect.p371y.internal.p374j0.p400i.p401q.p402a;

import cm.aptoide.p092pt.database.room.RoomNotification;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C10770n;
import kotlin.collections.C10786v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10289f;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10327j1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10305c0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10320h0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10324i1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10346q;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10351r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1;

/* compiled from: CapturedTypeConstructor.kt */
/* renamed from: kotlin.f0.y.e.j0.i.q.a.d */
/* loaded from: classes3.dex */
public final class C10170d {

    /* compiled from: CapturedTypeConstructor.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.q.a.d$a */
    static final class a extends Lambda implements Function0<AbstractC10311e0> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC10318g1 f39554f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC10318g1 interfaceC10318g1) {
            super(0);
            this.f39554f = interfaceC10318g1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10311e0 invoke() {
            AbstractC10311e0 type = this.f39554f.getType();
            C9768m.m32345e(type, "this@createCapturedIfNeeded.type");
            return type;
        }
    }

    /* compiled from: CapturedTypeConstructor.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.q.a.d$b */
    public static final class b extends C10346q {

        /* renamed from: d */
        final /* synthetic */ boolean f39555d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AbstractC10327j1 abstractC10327j1, boolean z) {
            super(abstractC10327j1);
            this.f39555d = z;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10327j1
        /* renamed from: b */
        public boolean mo36012b() {
            return this.f39555d;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.C10346q, kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10327j1
        /* renamed from: e */
        public InterfaceC10318g1 mo33536e(AbstractC10311e0 abstractC10311e0) {
            C9768m.m32346f(abstractC10311e0, RoomNotification.KEY);
            InterfaceC10318g1 mo33536e = super.mo33536e(abstractC10311e0);
            if (mo33536e == null) {
                return null;
            }
            InterfaceC10561h mo32891w = abstractC10311e0.mo35993O0().mo32891w();
            return C10170d.m36006b(mo33536e, mo32891w instanceof InterfaceC10554e1 ? (InterfaceC10554e1) mo32891w : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final InterfaceC10318g1 m36006b(InterfaceC10318g1 interfaceC10318g1, InterfaceC10554e1 interfaceC10554e1) {
        if (interfaceC10554e1 == null || interfaceC10318g1.mo36708a() == EnumC10351r1.INVARIANT) {
            return interfaceC10318g1;
        }
        if (interfaceC10554e1.mo37672n() != interfaceC10318g1.mo36708a()) {
            return new C10324i1(m36007c(interfaceC10318g1));
        }
        if (!interfaceC10318g1.mo36710c()) {
            return new C10324i1(interfaceC10318g1.getType());
        }
        InterfaceC10297n interfaceC10297n = C10289f.f40008b;
        C9768m.m32345e(interfaceC10297n, "NO_LOCKS");
        return new C10324i1(new C10320h0(interfaceC10297n, new a(interfaceC10318g1)));
    }

    /* renamed from: c */
    public static final AbstractC10311e0 m36007c(InterfaceC10318g1 interfaceC10318g1) {
        C9768m.m32346f(interfaceC10318g1, "typeProjection");
        return new C10167a(interfaceC10318g1, null, false, null, 14, null);
    }

    /* renamed from: d */
    public static final boolean m36008d(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, "<this>");
        return abstractC10311e0.mo35993O0() instanceof InterfaceC10168b;
    }

    /* renamed from: e */
    public static final AbstractC10327j1 m36009e(AbstractC10327j1 abstractC10327j1, boolean z) {
        List<Pair> m38760n0;
        C9768m.m32346f(abstractC10327j1, "<this>");
        if (!(abstractC10327j1 instanceof C10305c0)) {
            return new b(abstractC10327j1, z);
        }
        C10305c0 c10305c0 = (C10305c0) abstractC10327j1;
        InterfaceC10554e1[] m36594j = c10305c0.m36594j();
        m38760n0 = C10770n.m38760n0(c10305c0.m36593i(), c10305c0.m36594j());
        ArrayList arrayList = new ArrayList(C10786v.m38911u(m38760n0, 10));
        for (Pair pair : m38760n0) {
            arrayList.add(m36006b((InterfaceC10318g1) pair.m37648c(), (InterfaceC10554e1) pair.m37649d()));
        }
        Object[] array = arrayList.toArray(new InterfaceC10318g1[0]);
        C9768m.m32344d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return new C10305c0(m36594j, (InterfaceC10318g1[]) array, z);
    }

    /* renamed from: f */
    public static /* synthetic */ AbstractC10327j1 m36010f(AbstractC10327j1 abstractC10327j1, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        return m36009e(abstractC10327j1, z);
    }
}
