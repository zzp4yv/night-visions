package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: UnmodifiableLazyStringList.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.u */
/* loaded from: classes3.dex */
public class C10729u extends AbstractList<String> implements RandomAccess, InterfaceC10721m {

    /* renamed from: f */
    private final InterfaceC10721m f41366f;

    /* compiled from: UnmodifiableLazyStringList.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.u$a */
    class a implements ListIterator<String> {

        /* renamed from: f */
        ListIterator<String> f41367f;

        /* renamed from: g */
        final /* synthetic */ int f41368g;

        a(int i2) {
            this.f41368g = i2;
            this.f41367f = C10729u.this.f41366f.listIterator(i2);
        }

        @Override // java.util.ListIterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f41367f.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f41367f.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f41367f.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f41367f.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f41367f.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f41367f.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: UnmodifiableLazyStringList.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.u$b */
    class b implements Iterator<String> {

        /* renamed from: f */
        Iterator<String> f41370f;

        b() {
            this.f41370f = C10729u.this.f41366f.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f41370f.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f41370f.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C10729u(InterfaceC10721m interfaceC10721m) {
        this.f41366f = interfaceC10721m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10721m
    /* renamed from: N0 */
    public AbstractC10712d mo38425N0(int i2) {
        return this.f41366f.mo38425N0(i2);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public String get(int i2) {
        return this.f41366f.get(i2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10721m
    /* renamed from: h1 */
    public void mo38428h1(AbstractC10712d abstractC10712d) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10721m
    /* renamed from: j */
    public List<?> mo38430j() {
        return this.f41366f.mo38430j();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10721m
    /* renamed from: k */
    public InterfaceC10721m mo38431k() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i2) {
        return new a(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f41366f.size();
    }
}
