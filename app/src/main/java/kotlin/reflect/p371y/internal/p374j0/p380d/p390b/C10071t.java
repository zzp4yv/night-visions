package kotlin.reflect.p371y.internal.p374j0.p380d.p390b;

import cm.aptoide.p092pt.database.room.RoomInstalled;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10079a;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.AbstractC10083d;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10118c;

/* compiled from: MemberSignature.kt */
/* renamed from: kotlin.f0.y.e.j0.d.b.t */
/* loaded from: classes3.dex */
public final class C10071t {

    /* renamed from: a */
    public static final a f38485a = new a(null);

    /* renamed from: b */
    private final String f38486b;

    /* compiled from: MemberSignature.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.t$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final C10071t m34031a(String str, String str2) {
            C9768m.m32346f(str, "name");
            C9768m.m32346f(str2, "desc");
            return new C10071t(str + '#' + str2, null);
        }

        /* renamed from: b */
        public final C10071t m34032b(AbstractC10083d abstractC10083d) {
            C9768m.m32346f(abstractC10083d, RoomInstalled.SIGNATURE);
            if (abstractC10083d instanceof AbstractC10083d.b) {
                return m34034d(abstractC10083d.mo34249c(), abstractC10083d.mo34248b());
            }
            if (abstractC10083d instanceof AbstractC10083d.a) {
                return m34031a(abstractC10083d.mo34249c(), abstractC10083d.mo34248b());
            }
            throw new NoWhenBranchMatchedException();
        }

        /* renamed from: c */
        public final C10071t m34033c(InterfaceC10118c interfaceC10118c, C10079a.c cVar) {
            C9768m.m32346f(interfaceC10118c, "nameResolver");
            C9768m.m32346f(cVar, RoomInstalled.SIGNATURE);
            return m34034d(interfaceC10118c.getString(cVar.m34114x()), interfaceC10118c.getString(cVar.m34113w()));
        }

        /* renamed from: d */
        public final C10071t m34034d(String str, String str2) {
            C9768m.m32346f(str, "name");
            C9768m.m32346f(str2, "desc");
            return new C10071t(str + str2, null);
        }

        /* renamed from: e */
        public final C10071t m34035e(C10071t c10071t, int i2) {
            C9768m.m32346f(c10071t, RoomInstalled.SIGNATURE);
            return new C10071t(c10071t.m34030a() + '@' + i2, null);
        }
    }

    private C10071t(String str) {
        this.f38486b = str;
    }

    public /* synthetic */ C10071t(String str, C9756g c9756g) {
        this(str);
    }

    /* renamed from: a */
    public final String m34030a() {
        return this.f38486b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10071t) && C9768m.m32341a(this.f38486b, ((C10071t) obj).f38486b);
    }

    public int hashCode() {
        return this.f38486b.hashCode();
    }

    public String toString() {
        return "MemberSignature(signature=" + this.f38486b + ')';
    }
}
