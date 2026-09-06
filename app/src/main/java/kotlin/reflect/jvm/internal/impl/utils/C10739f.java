package kotlin.reflect.jvm.internal.impl.utils;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.C10770n;
import kotlin.collections.C10789w0;
import kotlin.jvm.internal.C9746b;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9767l0;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: SmartSet.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.utils.f */
/* loaded from: classes3.dex */
public final class C10739f<T> extends AbstractSet<T> {

    /* renamed from: f */
    public static final b f41432f = new b(null);

    /* renamed from: g */
    private Object f41433g;

    /* renamed from: h */
    private int f41434h;

    /* compiled from: SmartSet.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.f$a */
    private static final class a<T> implements Iterator<T>, KMappedMarker {

        /* renamed from: f */
        private final Iterator<T> f41435f;

        public a(T[] tArr) {
            C9768m.m32346f(tArr, "array");
            this.f41435f = C9746b.m32281a(tArr);
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f41435f.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.f41435f.next();
        }
    }

    /* compiled from: SmartSet.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.f$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final <T> C10739f<T> m38544a() {
            return new C10739f<>(null);
        }

        /* renamed from: b */
        public final <T> C10739f<T> m38545b(Collection<? extends T> collection) {
            C9768m.m32346f(collection, "set");
            C10739f<T> c10739f = new C10739f<>(null);
            c10739f.addAll(collection);
            return c10739f;
        }
    }

    /* compiled from: SmartSet.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.f$c */
    private static final class c<T> implements Iterator<T>, KMappedMarker {

        /* renamed from: f */
        private final T f41436f;

        /* renamed from: g */
        private boolean f41437g = true;

        public c(T t) {
            this.f41436f = t;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f41437g;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f41437g) {
                throw new NoSuchElementException();
            }
            this.f41437g = false;
            return this.f41436f;
        }
    }

    private C10739f() {
    }

    public /* synthetic */ C10739f(C9756g c9756g) {
        this();
    }

    /* renamed from: c */
    public static final <T> C10739f<T> m38540c() {
        return f41432f.m38544a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(T t) {
        boolean m38764t;
        Object[] objArr;
        LinkedHashSet m38919f;
        if (size() == 0) {
            this.f41433g = t;
        } else if (size() == 1) {
            if (C9768m.m32341a(this.f41433g, t)) {
                return false;
            }
            this.f41433g = new Object[]{this.f41433g, t};
        } else if (size() < 5) {
            Object obj = this.f41433g;
            C9768m.m32344d(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr2 = (Object[]) obj;
            m38764t = C10770n.m38764t(objArr2, t);
            if (m38764t) {
                return false;
            }
            if (size() == 4) {
                m38919f = C10789w0.m38919f(Arrays.copyOf(objArr2, objArr2.length));
                m38919f.add(t);
                objArr = m38919f;
            } else {
                Object[] copyOf = Arrays.copyOf(objArr2, size() + 1);
                C9768m.m32345e(copyOf, "copyOf(this, newSize)");
                copyOf[copyOf.length - 1] = t;
                objArr = copyOf;
            }
            this.f41433g = objArr;
        } else {
            Object obj2 = this.f41433g;
            C9768m.m32344d(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!C9767l0.m32329d(obj2).add(t)) {
                return false;
            }
        }
        m38542g(size() + 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f41433g = null;
        m38542g(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        boolean m38764t;
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return C9768m.m32341a(this.f41433g, obj);
        }
        if (size() >= 5) {
            Object obj2 = this.f41433g;
            C9768m.m32344d(obj2, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
            return ((Set) obj2).contains(obj);
        }
        Object obj3 = this.f41433g;
        C9768m.m32344d(obj3, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
        m38764t = C10770n.m38764t((Object[]) obj3, obj);
        return m38764t;
    }

    /* renamed from: f */
    public int m38541f() {
        return this.f41434h;
    }

    /* renamed from: g */
    public void m38542g(int i2) {
        this.f41434h = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<T> iterator() {
        if (size() == 0) {
            return Collections.emptySet().iterator();
        }
        if (size() == 1) {
            return new c(this.f41433g);
        }
        if (size() < 5) {
            Object obj = this.f41433g;
            C9768m.m32344d(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new a((Object[]) obj);
        }
        Object obj2 = this.f41433g;
        C9768m.m32344d(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return C9767l0.m32329d(obj2).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return m38541f();
    }
}
