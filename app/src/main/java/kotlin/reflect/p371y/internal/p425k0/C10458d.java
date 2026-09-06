package kotlin.reflect.p371y.internal.p425k0;

/* compiled from: IntTreePMap.java */
/* renamed from: kotlin.f0.y.e.k0.d */
/* loaded from: classes3.dex */
final class C10458d<V> {

    /* renamed from: a */
    private static final C10458d<Object> f40516a = new C10458d<>(C10457c.f40510a);

    /* renamed from: b */
    private final C10457c<V> f40517b;

    private C10458d(C10457c<V> c10457c) {
        this.f40517b = c10457c;
    }

    /* renamed from: a */
    public static <V> C10458d<V> m37256a() {
        return (C10458d<V>) f40516a;
    }

    /* renamed from: d */
    private C10458d<V> m37257d(C10457c<V> c10457c) {
        return c10457c == this.f40517b ? this : new C10458d<>(c10457c);
    }

    /* renamed from: b */
    public V m37258b(int i2) {
        return this.f40517b.m37254a(i2);
    }

    /* renamed from: c */
    public C10458d<V> m37259c(int i2, V v) {
        return m37257d(this.f40517b.m37255b(i2, v));
    }
}
