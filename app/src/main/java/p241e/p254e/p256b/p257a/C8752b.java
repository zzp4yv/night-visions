package p241e.p254e.p256b.p257a;

/* compiled from: Encoding.java */
/* renamed from: e.e.b.a.b */
/* loaded from: classes2.dex */
public final class C8752b {

    /* renamed from: a */
    private final String f33413a;

    private C8752b(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f33413a = str;
    }

    /* renamed from: b */
    public static C8752b m27945b(String str) {
        return new C8752b(str);
    }

    /* renamed from: a */
    public String m27946a() {
        return this.f33413a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8752b) {
            return this.f33413a.equals(((C8752b) obj).f33413a);
        }
        return false;
    }

    public int hashCode() {
        return this.f33413a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f33413a + "\"}";
    }
}
