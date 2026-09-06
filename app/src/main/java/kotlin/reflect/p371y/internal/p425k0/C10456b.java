package kotlin.reflect.p371y.internal.p425k0;

/* compiled from: HashPMap.java */
/* renamed from: kotlin.f0.y.e.k0.b */
/* loaded from: classes3.dex */
public final class C10456b<K, V> {

    /* renamed from: a */
    private static final C10456b<Object, Object> f40507a = new C10456b<>(C10458d.m37256a(), 0);

    /* renamed from: b */
    private final C10458d<C10455a<C10459e<K, V>>> f40508b;

    /* renamed from: c */
    private final int f40509c;

    private C10456b(C10458d<C10455a<C10459e<K, V>>> c10458d, int i2) {
        this.f40508b = c10458d;
        this.f40509c = i2;
    }

    /* renamed from: a */
    private static /* synthetic */ void m37245a(int i2) {
        Object[] objArr = new Object[2];
        objArr[0] = "kotlin/reflect/jvm/internal/pcollections/HashPMap";
        if (i2 != 1) {
            objArr[1] = "empty";
        } else {
            objArr[1] = "minus";
        }
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", objArr));
    }

    /* renamed from: b */
    public static <K, V> C10456b<K, V> m37246b() {
        C10456b<K, V> c10456b = (C10456b<K, V>) f40507a;
        if (c10456b == null) {
            m37245a(0);
        }
        return c10456b;
    }

    /* renamed from: d */
    private C10455a<C10459e<K, V>> m37247d(int i2) {
        C10455a<C10459e<K, V>> m37258b = this.f40508b.m37258b(i2);
        return m37258b == null ? C10455a.m37239f() : m37258b;
    }

    /* renamed from: e */
    private static <K, V> int m37248e(C10455a<C10459e<K, V>> c10455a, Object obj) {
        int i2 = 0;
        while (c10455a != null && c10455a.size() > 0) {
            if (c10455a.f40503g.f40518f.equals(obj)) {
                return i2;
            }
            c10455a = c10455a.f40504h;
            i2++;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public V m37249c(Object obj) {
        for (C10455a m37247d = m37247d(obj.hashCode()); m37247d != null && m37247d.size() > 0; m37247d = m37247d.f40504h) {
            C10459e c10459e = (C10459e) m37247d.f40503g;
            if (c10459e.f40518f.equals(obj)) {
                return c10459e.f40519g;
            }
        }
        return null;
    }

    /* renamed from: f */
    public C10456b<K, V> m37250f(K k2, V v) {
        C10455a<C10459e<K, V>> m37247d = m37247d(k2.hashCode());
        int size = m37247d.size();
        int m37248e = m37248e(m37247d, k2);
        if (m37248e != -1) {
            m37247d = m37247d.m37243h(m37248e);
        }
        C10455a<C10459e<K, V>> m37244n = m37247d.m37244n(new C10459e<>(k2, v));
        return new C10456b<>(this.f40508b.m37259c(k2.hashCode(), m37244n), (this.f40509c - size) + m37244n.size());
    }
}
