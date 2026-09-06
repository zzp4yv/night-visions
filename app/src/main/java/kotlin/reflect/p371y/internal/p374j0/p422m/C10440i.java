package kotlin.reflect.p371y.internal.p374j0.p422m;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: ArrayMap.kt */
/* renamed from: kotlin.f0.y.e.j0.m.i */
/* loaded from: classes3.dex */
public final class C10440i extends AbstractC10434c {

    /* renamed from: f */
    public static final C10440i f40418f = new C10440i();

    /* compiled from: ArrayMap.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.i$a */
    public static final class a implements Iterator, KMappedMarker {
        a() {
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private C10440i() {
        super(null);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p422m.AbstractC10434c
    /* renamed from: c */
    public int mo37188c() {
        return 0;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p422m.AbstractC10434c
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Void get(int i2) {
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p422m.AbstractC10434c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo37189f(int i2, Void r2) {
        C9768m.m32346f(r2, "value");
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p422m.AbstractC10434c, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }
}
