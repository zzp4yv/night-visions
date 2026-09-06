package kotlin.reflect.p371y.internal.p374j0.p397f;

import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.text.C10513u;

/* compiled from: CallableId.kt */
/* renamed from: kotlin.f0.y.e.j0.f.a */
/* loaded from: classes3.dex */
public final class C10125a {

    /* renamed from: a */
    private static final a f39240a = new a(null);

    /* renamed from: b */
    @Deprecated
    private static final C10130f f39241b;

    /* renamed from: c */
    @Deprecated
    private static final C10127c f39242c;

    /* renamed from: d */
    private final C10127c f39243d;

    /* renamed from: e */
    private final C10127c f39244e;

    /* renamed from: f */
    private final C10130f f39245f;

    /* renamed from: g */
    private final C10127c f39246g;

    /* compiled from: CallableId.kt */
    /* renamed from: kotlin.f0.y.e.j0.f.a$a */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }
    }

    static {
        C10130f c10130f = C10132h.f39276l;
        f39241b = c10130f;
        C10127c m35419k = C10127c.m35419k(c10130f);
        C9768m.m32345e(m35419k, "topLevel(LOCAL_NAME)");
        f39242c = m35419k;
    }

    public C10125a(C10127c c10127c, C10127c c10127c2, C10130f c10130f, C10127c c10127c3) {
        C9768m.m32346f(c10127c, "packageName");
        C9768m.m32346f(c10130f, "callableName");
        this.f39243d = c10127c;
        this.f39244e = c10127c2;
        this.f39245f = c10130f;
        this.f39246g = c10127c3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10125a)) {
            return false;
        }
        C10125a c10125a = (C10125a) obj;
        return C9768m.m32341a(this.f39243d, c10125a.f39243d) && C9768m.m32341a(this.f39244e, c10125a.f39244e) && C9768m.m32341a(this.f39245f, c10125a.f39245f) && C9768m.m32341a(this.f39246g, c10125a.f39246g);
    }

    public int hashCode() {
        int hashCode = this.f39243d.hashCode() * 31;
        C10127c c10127c = this.f39244e;
        int hashCode2 = (((hashCode + (c10127c == null ? 0 : c10127c.hashCode())) * 31) + this.f39245f.hashCode()) * 31;
        C10127c c10127c2 = this.f39246g;
        return hashCode2 + (c10127c2 != null ? c10127c2.hashCode() : 0);
    }

    public String toString() {
        String m37524z;
        StringBuilder sb = new StringBuilder();
        String m35420b = this.f39243d.m35420b();
        C9768m.m32345e(m35420b, "packageName.asString()");
        m37524z = C10513u.m37524z(m35420b, '.', '/', false, 4, null);
        sb.append(m37524z);
        sb.append("/");
        C10127c c10127c = this.f39244e;
        if (c10127c != null) {
            sb.append(c10127c);
            sb.append(".");
        }
        sb.append(this.f39245f);
        String sb2 = sb.toString();
        C9768m.m32345e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public /* synthetic */ C10125a(C10127c c10127c, C10127c c10127c2, C10130f c10130f, C10127c c10127c3, int i2, C9756g c9756g) {
        this(c10127c, c10127c2, c10130f, (i2 & 8) != 0 ? null : c10127c3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10125a(C10127c c10127c, C10130f c10130f) {
        this(c10127c, null, c10130f, null, 8, null);
        C9768m.m32346f(c10127c, "packageName");
        C9768m.m32346f(c10130f, "callableName");
    }
}
