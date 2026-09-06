package kotlin.reflect.p371y.internal.p374j0.p422m;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.AbstractIterator;
import kotlin.collections.C10762j;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;

/* compiled from: ArrayMap.kt */
/* renamed from: kotlin.f0.y.e.j0.m.d */
/* loaded from: classes3.dex */
public final class C10435d<T> extends AbstractC10434c<T> {

    /* renamed from: f */
    public static final a f40400f = new a(null);

    /* renamed from: g */
    private Object[] f40401g;

    /* renamed from: h */
    private int f40402h;

    /* compiled from: ArrayMap.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.d$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }
    }

    /* compiled from: ArrayMap.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.d$b */
    public static final class b extends AbstractIterator<T> {

        /* renamed from: h */
        private int f40403h = -1;

        /* renamed from: i */
        final /* synthetic */ C10435d<T> f40404i;

        b(C10435d<T> c10435d) {
            this.f40404i = c10435d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.collections.AbstractIterator
        /* renamed from: b */
        protected void mo37192b() {
            do {
                int i2 = this.f40403h + 1;
                this.f40403h = i2;
                if (i2 >= ((C10435d) this.f40404i).f40401g.length) {
                    break;
                }
            } while (((C10435d) this.f40404i).f40401g[this.f40403h] == null);
            if (this.f40403h >= ((C10435d) this.f40404i).f40401g.length) {
                m38556c();
                return;
            }
            Object obj = ((C10435d) this.f40404i).f40401g[this.f40403h];
            C9768m.m32344d(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
            m38557d(obj);
        }
    }

    private C10435d(Object[] objArr, int i2) {
        super(null);
        this.f40401g = objArr;
        this.f40402h = i2;
    }

    /* renamed from: i */
    private final void m37191i(int i2) {
        Object[] objArr = this.f40401g;
        if (objArr.length <= i2) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length * 2);
            C9768m.m32345e(copyOf, "copyOf(this, newSize)");
            this.f40401g = copyOf;
        }
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p422m.AbstractC10434c
    /* renamed from: c */
    public int mo37188c() {
        return this.f40402h;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p422m.AbstractC10434c
    /* renamed from: f */
    public void mo37189f(int i2, T t) {
        C9768m.m32346f(t, "value");
        m37191i(i2);
        if (this.f40401g[i2] == null) {
            this.f40402h = mo37188c() + 1;
        }
        this.f40401g[i2] = t;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p422m.AbstractC10434c
    public T get(int i2) {
        return (T) C10762j.m38654C(this.f40401g, i2);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p422m.AbstractC10434c, java.lang.Iterable
    public Iterator<T> iterator() {
        return new b(this);
    }

    public C10435d() {
        this(new Object[20], 0);
    }
}
