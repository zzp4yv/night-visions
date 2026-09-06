package kotlin.reflect.p371y.internal.p374j0.p415l;

import cm.aptoide.p092pt.database.room.RoomNotification;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;

/* compiled from: TypeSubstitution.kt */
/* renamed from: kotlin.f0.y.e.j0.l.q */
/* loaded from: classes3.dex */
public class C10346q extends AbstractC10327j1 {

    /* renamed from: c */
    private final AbstractC10327j1 f40164c;

    public C10346q(AbstractC10327j1 abstractC10327j1) {
        C9768m.m32346f(abstractC10327j1, "substitution");
        this.f40164c = abstractC10327j1;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10327j1
    /* renamed from: a */
    public boolean mo36685a() {
        return this.f40164c.mo36685a();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10327j1
    /* renamed from: d */
    public InterfaceC10587g mo36727d(InterfaceC10587g interfaceC10587g) {
        C9768m.m32346f(interfaceC10587g, "annotations");
        return this.f40164c.mo36727d(interfaceC10587g);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10327j1
    /* renamed from: e */
    public InterfaceC10318g1 mo33536e(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, RoomNotification.KEY);
        return this.f40164c.mo33536e(abstractC10311e0);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10327j1
    /* renamed from: f */
    public boolean mo33537f() {
        return this.f40164c.mo33537f();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10327j1
    /* renamed from: g */
    public AbstractC10311e0 mo36728g(AbstractC10311e0 abstractC10311e0, EnumC10351r1 enumC10351r1) {
        C9768m.m32346f(abstractC10311e0, "topLevelType");
        C9768m.m32346f(enumC10351r1, "position");
        return this.f40164c.mo36728g(abstractC10311e0, enumC10351r1);
    }
}
