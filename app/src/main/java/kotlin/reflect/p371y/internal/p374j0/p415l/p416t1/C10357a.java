package kotlin.reflect.p371y.internal.p374j0.p415l.p416t1;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10309d1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10362f;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g;

/* compiled from: ClassicTypeCheckerState.kt */
/* renamed from: kotlin.f0.y.e.j0.l.t1.a */
/* loaded from: classes3.dex */
public final class C10357a {
    /* renamed from: a */
    public static final C10309d1 m36829a(boolean z, boolean z2, InterfaceC10358b interfaceC10358b, AbstractC10362f abstractC10362f, AbstractC10363g abstractC10363g) {
        C9768m.m32346f(interfaceC10358b, "typeSystemContext");
        C9768m.m32346f(abstractC10362f, "kotlinTypePreparator");
        C9768m.m32346f(abstractC10363g, "kotlinTypeRefiner");
        return new C10309d1(z, z2, true, interfaceC10358b, abstractC10362f, abstractC10363g);
    }

    /* renamed from: b */
    public static /* synthetic */ C10309d1 m36830b(boolean z, boolean z2, InterfaceC10358b interfaceC10358b, AbstractC10362f abstractC10362f, AbstractC10363g abstractC10363g, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        if ((i2 & 4) != 0) {
            interfaceC10358b = C10373q.f40209a;
        }
        if ((i2 & 8) != 0) {
            abstractC10362f = AbstractC10362f.a.f40182a;
        }
        if ((i2 & 16) != 0) {
            abstractC10363g = AbstractC10363g.a.f40183a;
        }
        return m36829a(z, z2, interfaceC10358b, abstractC10362f, abstractC10363g);
    }
}
