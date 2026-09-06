package kotlin.reflect.p371y.internal.p374j0.p397f;

import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.C10770n;
import kotlin.jvm.functions.Function1;

/* compiled from: FqNameUnsafe.java */
/* renamed from: kotlin.f0.y.e.j0.f.d */
/* loaded from: classes3.dex */
public final class C10128d {

    /* renamed from: a */
    private static final C10130f f39253a = C10130f.m35451D("<root>");

    /* renamed from: b */
    private static final Pattern f39254b = Pattern.compile("\\.");

    /* renamed from: c */
    private static final Function1<String, C10130f> f39255c = new a();

    /* renamed from: d */
    private final String f39256d;

    /* renamed from: e */
    private transient C10127c f39257e;

    /* renamed from: f */
    private transient C10128d f39258f;

    /* renamed from: g */
    private transient C10130f f39259g;

    /* compiled from: FqNameUnsafe.java */
    /* renamed from: kotlin.f0.y.e.j0.f.d$a */
    static class a implements Function1<String, C10130f> {
        a() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C10130f invoke(String str) {
            return C10130f.m35453v(str);
        }
    }

    C10128d(String str, C10127c c10127c) {
        if (str == null) {
            m35429a(0);
        }
        if (c10127c == null) {
            m35429a(1);
        }
        this.f39256d = str;
        this.f39257e = c10127c;
    }

    /* renamed from: a */
    private static /* synthetic */ void m35429a(int i2) {
        String str;
        int i3;
        switch (i2) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 15:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                i3 = 2;
                break;
            case 9:
            case 15:
            case 16:
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        if (i2 != 1) {
            switch (i2) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 17:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i2) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 9:
            case 15:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 17:
                objArr[1] = "toString";
                break;
        }
        switch (i2) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
                objArr[2] = "startsWith";
                break;
            case 16:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i2) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                throw new IllegalStateException(format);
            case 9:
            case 15:
            case 16:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    /* renamed from: d */
    private void m35430d() {
        int lastIndexOf = this.f39256d.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            this.f39259g = C10130f.m35453v(this.f39256d.substring(lastIndexOf + 1));
            this.f39258f = new C10128d(this.f39256d.substring(0, lastIndexOf));
        } else {
            this.f39259g = C10130f.m35453v(this.f39256d);
            this.f39258f = C10127c.f39250a.m35428j();
        }
    }

    /* renamed from: m */
    public static C10128d m35431m(C10130f c10130f) {
        if (c10130f == null) {
            m35429a(16);
        }
        return new C10128d(c10130f.m35455k(), C10127c.f39250a.m35428j(), c10130f);
    }

    /* renamed from: b */
    public String m35432b() {
        String str = this.f39256d;
        if (str == null) {
            m35429a(4);
        }
        return str;
    }

    /* renamed from: c */
    public C10128d m35433c(C10130f c10130f) {
        String str;
        if (c10130f == null) {
            m35429a(9);
        }
        if (m35434e()) {
            str = c10130f.m35455k();
        } else {
            str = this.f39256d + "." + c10130f.m35455k();
        }
        return new C10128d(str, this, c10130f);
    }

    /* renamed from: e */
    public boolean m35434e() {
        return this.f39256d.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10128d) && this.f39256d.equals(((C10128d) obj).f39256d);
    }

    /* renamed from: f */
    public boolean m35435f() {
        return this.f39257e != null || m35432b().indexOf(60) < 0;
    }

    /* renamed from: g */
    public C10128d m35436g() {
        C10128d c10128d = this.f39258f;
        if (c10128d != null) {
            if (c10128d == null) {
                m35429a(7);
            }
            return c10128d;
        }
        if (m35434e()) {
            throw new IllegalStateException("root");
        }
        m35430d();
        C10128d c10128d2 = this.f39258f;
        if (c10128d2 == null) {
            m35429a(8);
        }
        return c10128d2;
    }

    /* renamed from: h */
    public List<C10130f> m35437h() {
        List<C10130f> emptyList = m35434e() ? Collections.emptyList() : C10770n.m38732L(f39254b.split(this.f39256d), f39255c);
        if (emptyList == null) {
            m35429a(14);
        }
        return emptyList;
    }

    public int hashCode() {
        return this.f39256d.hashCode();
    }

    /* renamed from: i */
    public C10130f m35438i() {
        C10130f c10130f = this.f39259g;
        if (c10130f != null) {
            if (c10130f == null) {
                m35429a(10);
            }
            return c10130f;
        }
        if (m35434e()) {
            throw new IllegalStateException("root");
        }
        m35430d();
        C10130f c10130f2 = this.f39259g;
        if (c10130f2 == null) {
            m35429a(11);
        }
        return c10130f2;
    }

    /* renamed from: j */
    public C10130f m35439j() {
        if (m35434e()) {
            C10130f c10130f = f39253a;
            if (c10130f == null) {
                m35429a(12);
            }
            return c10130f;
        }
        C10130f m35438i = m35438i();
        if (m35438i == null) {
            m35429a(13);
        }
        return m35438i;
    }

    /* renamed from: k */
    public boolean m35440k(C10130f c10130f) {
        if (c10130f == null) {
            m35429a(15);
        }
        if (m35434e()) {
            return false;
        }
        int indexOf = this.f39256d.indexOf(46);
        String str = this.f39256d;
        String m35455k = c10130f.m35455k();
        if (indexOf == -1) {
            indexOf = this.f39256d.length();
        }
        return str.regionMatches(0, m35455k, 0, indexOf);
    }

    /* renamed from: l */
    public C10127c m35441l() {
        C10127c c10127c = this.f39257e;
        if (c10127c != null) {
            if (c10127c == null) {
                m35429a(5);
            }
            return c10127c;
        }
        C10127c c10127c2 = new C10127c(this);
        this.f39257e = c10127c2;
        if (c10127c2 == null) {
            m35429a(6);
        }
        return c10127c2;
    }

    public String toString() {
        String m35455k = m35434e() ? f39253a.m35455k() : this.f39256d;
        if (m35455k == null) {
            m35429a(17);
        }
        return m35455k;
    }

    public C10128d(String str) {
        if (str == null) {
            m35429a(2);
        }
        this.f39256d = str;
    }

    private C10128d(String str, C10128d c10128d, C10130f c10130f) {
        if (str == null) {
            m35429a(3);
        }
        this.f39256d = str;
        this.f39258f = c10128d;
        this.f39259g = c10130f;
    }
}
