package kotlin.reflect.p371y.internal.p374j0.p415l;

import cm.aptoide.p092pt.database.room.RoomNotification;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;

/* compiled from: DisjointKeysUnionTypeSubstitution.kt */
/* renamed from: kotlin.f0.y.e.j0.l.u */
/* loaded from: classes3.dex */
public final class C10382u extends AbstractC10327j1 {

    /* renamed from: c */
    public static final a f40222c = new a(null);

    /* renamed from: d */
    private final AbstractC10327j1 f40223d;

    /* renamed from: e */
    private final AbstractC10327j1 f40224e;

    /* compiled from: DisjointKeysUnionTypeSubstitution.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.u$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final AbstractC10327j1 m36984a(AbstractC10327j1 abstractC10327j1, AbstractC10327j1 abstractC10327j12) {
            C9768m.m32346f(abstractC10327j1, "first");
            C9768m.m32346f(abstractC10327j12, "second");
            return abstractC10327j1.mo33537f() ? abstractC10327j12 : abstractC10327j12.mo33537f() ? abstractC10327j1 : new C10382u(abstractC10327j1, abstractC10327j12, null);
        }
    }

    private C10382u(AbstractC10327j1 abstractC10327j1, AbstractC10327j1 abstractC10327j12) {
        this.f40223d = abstractC10327j1;
        this.f40224e = abstractC10327j12;
    }

    public /* synthetic */ C10382u(AbstractC10327j1 abstractC10327j1, AbstractC10327j1 abstractC10327j12, C9756g c9756g) {
        this(abstractC10327j1, abstractC10327j12);
    }

    /* renamed from: i */
    public static final AbstractC10327j1 m36983i(AbstractC10327j1 abstractC10327j1, AbstractC10327j1 abstractC10327j12) {
        return f40222c.m36984a(abstractC10327j1, abstractC10327j12);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10327j1
    /* renamed from: a */
    public boolean mo36685a() {
        return this.f40223d.mo36685a() || this.f40224e.mo36685a();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10327j1
    /* renamed from: b */
    public boolean mo36012b() {
        return this.f40223d.mo36012b() || this.f40224e.mo36012b();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10327j1
    /* renamed from: d */
    public InterfaceC10587g mo36727d(InterfaceC10587g interfaceC10587g) {
        C9768m.m32346f(interfaceC10587g, "annotations");
        return this.f40224e.mo36727d(this.f40223d.mo36727d(interfaceC10587g));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10327j1
    /* renamed from: e */
    public InterfaceC10318g1 mo33536e(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, RoomNotification.KEY);
        InterfaceC10318g1 mo33536e = this.f40223d.mo33536e(abstractC10311e0);
        return mo33536e == null ? this.f40224e.mo33536e(abstractC10311e0) : mo33536e;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10327j1
    /* renamed from: f */
    public boolean mo33537f() {
        return false;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10327j1
    /* renamed from: g */
    public AbstractC10311e0 mo36728g(AbstractC10311e0 abstractC10311e0, EnumC10351r1 enumC10351r1) {
        C9768m.m32346f(abstractC10311e0, "topLevelType");
        C9768m.m32346f(enumC10351r1, "position");
        return this.f40224e.mo36728g(this.f40223d.mo36728g(abstractC10311e0, enumC10351r1), enumC10351r1);
    }
}
