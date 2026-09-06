package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10327j1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g;

/* compiled from: ModuleAwareClassDescriptor.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.t */
/* loaded from: classes2.dex */
public abstract class AbstractC10637t implements InterfaceC10552e {

    /* renamed from: f */
    public static final a f41103f = new a(null);

    /* compiled from: ModuleAwareClassDescriptor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.t$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC10218h m37975a(InterfaceC10552e interfaceC10552e, AbstractC10327j1 abstractC10327j1, AbstractC10363g abstractC10363g) {
            InterfaceC10218h mo36986v;
            C9768m.m32346f(interfaceC10552e, "<this>");
            C9768m.m32346f(abstractC10327j1, "typeSubstitution");
            C9768m.m32346f(abstractC10363g, "kotlinTypeRefiner");
            AbstractC10637t abstractC10637t = interfaceC10552e instanceof AbstractC10637t ? (AbstractC10637t) interfaceC10552e : null;
            if (abstractC10637t != null && (mo36986v = abstractC10637t.mo36986v(abstractC10327j1, abstractC10363g)) != null) {
                return mo36986v;
            }
            InterfaceC10218h mo37678a0 = interfaceC10552e.mo37678a0(abstractC10327j1);
            C9768m.m32345e(mo37678a0, "this.getMemberScope(\n   …ubstitution\n            )");
            return mo37678a0;
        }

        /* renamed from: b */
        public final InterfaceC10218h m37976b(InterfaceC10552e interfaceC10552e, AbstractC10363g abstractC10363g) {
            InterfaceC10218h mo32860H;
            C9768m.m32346f(interfaceC10552e, "<this>");
            C9768m.m32346f(abstractC10363g, "kotlinTypeRefiner");
            AbstractC10637t abstractC10637t = interfaceC10552e instanceof AbstractC10637t ? (AbstractC10637t) interfaceC10552e : null;
            if (abstractC10637t != null && (mo32860H = abstractC10637t.mo32860H(abstractC10363g)) != null) {
                return mo32860H;
            }
            InterfaceC10218h mo33340D0 = interfaceC10552e.mo33340D0();
            C9768m.m32345e(mo33340D0, "this.unsubstitutedMemberScope");
            return mo33340D0;
        }
    }

    /* renamed from: H */
    protected abstract InterfaceC10218h mo32860H(AbstractC10363g abstractC10363g);

    /* renamed from: v */
    protected abstract InterfaceC10218h mo36986v(AbstractC10327j1 abstractC10327j1, AbstractC10363g abstractC10363g);
}
