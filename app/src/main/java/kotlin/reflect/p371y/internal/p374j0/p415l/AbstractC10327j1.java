package kotlin.reflect.p371y.internal.p374j0.p415l;

import cm.aptoide.p092pt.database.room.RoomNotification;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;

/* compiled from: TypeSubstitution.kt */
/* renamed from: kotlin.f0.y.e.j0.l.j1 */
/* loaded from: classes3.dex */
public abstract class AbstractC10327j1 {

    /* renamed from: a */
    public static final b f40131a = new b(null);

    /* renamed from: b */
    public static final AbstractC10327j1 f40132b = new a();

    /* compiled from: TypeSubstitution.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.j1$a */
    public static final class a extends AbstractC10327j1 {
        a() {
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10327j1
        /* renamed from: e */
        public /* bridge */ /* synthetic */ InterfaceC10318g1 mo33536e(AbstractC10311e0 abstractC10311e0) {
            return (InterfaceC10318g1) m36730i(abstractC10311e0);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10327j1
        /* renamed from: f */
        public boolean mo33537f() {
            return true;
        }

        /* renamed from: i */
        public Void m36730i(AbstractC10311e0 abstractC10311e0) {
            C9768m.m32346f(abstractC10311e0, RoomNotification.KEY);
            return null;
        }

        public String toString() {
            return "Empty TypeSubstitution";
        }
    }

    /* compiled from: TypeSubstitution.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.j1$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9756g c9756g) {
            this();
        }
    }

    /* compiled from: TypeSubstitution.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.j1$c */
    public static final class c extends AbstractC10327j1 {
        c() {
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10327j1
        /* renamed from: a */
        public boolean mo36685a() {
            return false;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10327j1
        /* renamed from: b */
        public boolean mo36012b() {
            return false;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10327j1
        /* renamed from: d */
        public InterfaceC10587g mo36727d(InterfaceC10587g interfaceC10587g) {
            C9768m.m32346f(interfaceC10587g, "annotations");
            return AbstractC10327j1.this.mo36727d(interfaceC10587g);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10327j1
        /* renamed from: e */
        public InterfaceC10318g1 mo33536e(AbstractC10311e0 abstractC10311e0) {
            C9768m.m32346f(abstractC10311e0, RoomNotification.KEY);
            return AbstractC10327j1.this.mo33536e(abstractC10311e0);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10327j1
        /* renamed from: f */
        public boolean mo33537f() {
            return AbstractC10327j1.this.mo33537f();
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10327j1
        /* renamed from: g */
        public AbstractC10311e0 mo36728g(AbstractC10311e0 abstractC10311e0, EnumC10351r1 enumC10351r1) {
            C9768m.m32346f(abstractC10311e0, "topLevelType");
            C9768m.m32346f(enumC10351r1, "position");
            return AbstractC10327j1.this.mo36728g(abstractC10311e0, enumC10351r1);
        }
    }

    /* renamed from: a */
    public boolean mo36685a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo36012b() {
        return false;
    }

    /* renamed from: c */
    public final C10333l1 m36726c() {
        C10333l1 m36747g = C10333l1.m36747g(this);
        C9768m.m32345e(m36747g, "create(this)");
        return m36747g;
    }

    /* renamed from: d */
    public InterfaceC10587g mo36727d(InterfaceC10587g interfaceC10587g) {
        C9768m.m32346f(interfaceC10587g, "annotations");
        return interfaceC10587g;
    }

    /* renamed from: e */
    public abstract InterfaceC10318g1 mo33536e(AbstractC10311e0 abstractC10311e0);

    /* renamed from: f */
    public boolean mo33537f() {
        return false;
    }

    /* renamed from: g */
    public AbstractC10311e0 mo36728g(AbstractC10311e0 abstractC10311e0, EnumC10351r1 enumC10351r1) {
        C9768m.m32346f(abstractC10311e0, "topLevelType");
        C9768m.m32346f(enumC10351r1, "position");
        return abstractC10311e0;
    }

    /* renamed from: h */
    public final AbstractC10327j1 m36729h() {
        return new c();
    }
}
