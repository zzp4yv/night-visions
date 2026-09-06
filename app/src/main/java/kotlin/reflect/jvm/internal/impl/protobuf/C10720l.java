package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: LazyStringArrayList.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.l */
/* loaded from: classes3.dex */
public class C10720l extends AbstractList<String> implements RandomAccess, InterfaceC10721m {

    /* renamed from: f */
    public static final InterfaceC10721m f41323f = new C10720l().mo38431k();

    /* renamed from: g */
    private final List<Object> f41324g;

    public C10720l() {
        this.f41324g = new ArrayList();
    }

    /* renamed from: f */
    private static AbstractC10712d m38423f(Object obj) {
        return obj instanceof AbstractC10712d ? (AbstractC10712d) obj : obj instanceof String ? AbstractC10712d.m38279n((String) obj) : AbstractC10712d.m38277h((byte[]) obj);
    }

    /* renamed from: g */
    private static String m38424g(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC10712d ? ((AbstractC10712d) obj).m38283D() : C10717i.m38416b((byte[]) obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10721m
    /* renamed from: N0 */
    public AbstractC10712d mo38425N0(int i2) {
        Object obj = this.f41324g.get(i2);
        AbstractC10712d m38423f = m38423f(obj);
        if (m38423f != obj) {
            this.f41324g.set(i2, m38423f);
        }
        return m38423f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i2, String str) {
        this.f41324g.add(i2, str);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f41324g.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public String get(int i2) {
        Object obj = this.f41324g.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC10712d) {
            AbstractC10712d abstractC10712d = (AbstractC10712d) obj;
            String m38283D = abstractC10712d.m38283D();
            if (abstractC10712d.mo38290t()) {
                this.f41324g.set(i2, m38283D);
            }
            return m38283D;
        }
        byte[] bArr = (byte[]) obj;
        String m38416b = C10717i.m38416b(bArr);
        if (C10717i.m38415a(bArr)) {
            this.f41324g.set(i2, m38416b);
        }
        return m38416b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10721m
    /* renamed from: h1 */
    public void mo38428h1(AbstractC10712d abstractC10712d) {
        this.f41324g.add(abstractC10712d);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public String remove(int i2) {
        Object remove = this.f41324g.remove(i2);
        ((AbstractList) this).modCount++;
        return m38424g(remove);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10721m
    /* renamed from: j */
    public List<?> mo38430j() {
        return Collections.unmodifiableList(this.f41324g);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10721m
    /* renamed from: k */
    public InterfaceC10721m mo38431k() {
        return new C10729u(this);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public String set(int i2, String str) {
        return m38424g(this.f41324g.set(i2, str));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f41324g.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i2, Collection<? extends String> collection) {
        if (collection instanceof InterfaceC10721m) {
            collection = ((InterfaceC10721m) collection).mo38430j();
        }
        boolean addAll = this.f41324g.addAll(i2, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    public C10720l(InterfaceC10721m interfaceC10721m) {
        this.f41324g = new ArrayList(interfaceC10721m.size());
        addAll(interfaceC10721m);
    }
}
