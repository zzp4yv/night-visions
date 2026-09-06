package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.utils.C10738e;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;

/* compiled from: AbstractClassTypeConstructor.java */
/* renamed from: kotlin.f0.y.e.j0.l.b */
/* loaded from: classes3.dex */
public abstract class AbstractC10301b extends AbstractC10316g implements InterfaceC10312e1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC10301b(InterfaceC10297n interfaceC10297n) {
        super(interfaceC10297n);
        if (interfaceC10297n == null) {
            m36578v(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003f  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void m36578v(int r9) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto Lc
            if (r9 == r1) goto Lc
            if (r9 == r0) goto Lc
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        Le:
            r4 = 2
            if (r9 == r2) goto L17
            if (r9 == r1) goto L17
            if (r9 == r0) goto L17
            r5 = 3
            goto L18
        L17:
            r5 = 2
        L18:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"
            r7 = 0
            if (r9 == r2) goto L2f
            if (r9 == r4) goto L2a
            if (r9 == r1) goto L2f
            if (r9 == r0) goto L2f
            java.lang.String r8 = "storageManager"
            r5[r7] = r8
            goto L31
        L2a:
            java.lang.String r8 = "classifier"
            r5[r7] = r8
            goto L31
        L2f:
            r5[r7] = r6
        L31:
            if (r9 == r2) goto L3f
            if (r9 == r1) goto L3a
            if (r9 == r0) goto L3a
            r5[r2] = r6
            goto L43
        L3a:
            java.lang.String r6 = "getAdditionalNeighboursInSupertypeGraph"
            r5[r2] = r6
            goto L43
        L3f:
            java.lang.String r6 = "getBuiltIns"
            r5[r2] = r6
        L43:
            if (r9 == r2) goto L54
            if (r9 == r4) goto L50
            if (r9 == r1) goto L54
            if (r9 == r0) goto L54
            java.lang.String r6 = "<init>"
            r5[r4] = r6
            goto L54
        L50:
            java.lang.String r6 = "isSameClassifier"
            r5[r4] = r6
        L54:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L64
            if (r9 == r1) goto L64
            if (r9 == r0) goto L64
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L69
        L64:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L69:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10301b.m36578v(int):void");
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10334m
    /* renamed from: i */
    protected boolean mo36579i(InterfaceC10561h interfaceC10561h) {
        if (interfaceC10561h == null) {
            m36578v(2);
        }
        return (interfaceC10561h instanceof InterfaceC10552e) && m36765g(mo32891w(), interfaceC10561h);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10316g
    /* renamed from: m */
    protected AbstractC10311e0 mo36580m() {
        if (AbstractC9881h.m32759t0(mo32891w())) {
            return null;
        }
        return mo36004o().m32791i();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10316g
    /* renamed from: n */
    protected Collection<AbstractC10311e0> mo36581n(boolean z) {
        InterfaceC10576m mo32876b = mo32891w().mo32876b();
        if (!(mo32876b instanceof InterfaceC10552e)) {
            List emptyList = Collections.emptyList();
            if (emptyList == null) {
                m36578v(3);
            }
            return emptyList;
        }
        C10738e c10738e = new C10738e();
        InterfaceC10552e interfaceC10552e = (InterfaceC10552e) mo32876b;
        c10738e.add(interfaceC10552e.mo36400s());
        InterfaceC10552e mo32869U = interfaceC10552e.mo32869U();
        if (z && mo32869U != null) {
            c10738e.add(mo32869U.mo36400s());
        }
        return c10738e;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
    /* renamed from: o */
    public AbstractC9881h mo36004o() {
        AbstractC9881h m36072f = C10202a.m36072f(mo32891w());
        if (m36072f == null) {
            m36578v(1);
        }
        return m36072f;
    }

    /* renamed from: w */
    public abstract InterfaceC10552e mo32891w();
}
