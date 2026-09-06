package com.squareup.moshi;

import com.squareup.moshi.AbstractC8683f;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: CollectionJsonAdapter.java */
/* renamed from: com.squareup.moshi.d */
/* loaded from: classes2.dex */
abstract class AbstractC8681d<C extends Collection<T>, T> extends AbstractC8683f<C> {

    /* renamed from: a */
    public static final AbstractC8683f.e f33091a = new a();

    /* renamed from: b */
    private final AbstractC8683f<T> f33092b;

    /* compiled from: CollectionJsonAdapter.java */
    /* renamed from: com.squareup.moshi.d$a */
    class a implements AbstractC8683f.e {
        a() {
        }

        @Override // com.squareup.moshi.AbstractC8683f.e
        /* renamed from: a */
        public AbstractC8683f<?> mo27684a(Type type, Set<? extends Annotation> set, C8695r c8695r) {
            Class<?> m27848g = C8698u.m27848g(type);
            if (!set.isEmpty()) {
                return null;
            }
            if (m27848g == List.class || m27848g == Collection.class) {
                return AbstractC8681d.m27692b(type, c8695r).nullSafe();
            }
            if (m27848g == Set.class) {
                return AbstractC8681d.m27693d(type, c8695r).nullSafe();
            }
            return null;
        }
    }

    /* compiled from: CollectionJsonAdapter.java */
    /* renamed from: com.squareup.moshi.d$b */
    class b extends AbstractC8681d<Collection<T>, T> {
        b(AbstractC8683f abstractC8683f) {
            super(abstractC8683f, null);
        }

        @Override // com.squareup.moshi.AbstractC8681d
        /* renamed from: c */
        Collection<T> mo27695c() {
            return new ArrayList();
        }

        @Override // com.squareup.moshi.AbstractC8683f
        public /* bridge */ /* synthetic */ Object fromJson(AbstractC8686i abstractC8686i) throws IOException {
            return super.m27694a(abstractC8686i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.squareup.moshi.AbstractC8683f
        public /* bridge */ /* synthetic */ void toJson(AbstractC8692o abstractC8692o, Object obj) throws IOException {
            super.m27696e(abstractC8692o, (Collection) obj);
        }
    }

    /* compiled from: CollectionJsonAdapter.java */
    /* renamed from: com.squareup.moshi.d$c */
    class c extends AbstractC8681d<Set<T>, T> {
        c(AbstractC8683f abstractC8683f) {
            super(abstractC8683f, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.squareup.moshi.AbstractC8681d
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Set<T> mo27695c() {
            return new LinkedHashSet();
        }

        @Override // com.squareup.moshi.AbstractC8683f
        public /* bridge */ /* synthetic */ Object fromJson(AbstractC8686i abstractC8686i) throws IOException {
            return super.m27694a(abstractC8686i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.squareup.moshi.AbstractC8683f
        public /* bridge */ /* synthetic */ void toJson(AbstractC8692o abstractC8692o, Object obj) throws IOException {
            super.m27696e(abstractC8692o, (Collection) obj);
        }
    }

    /* synthetic */ AbstractC8681d(AbstractC8683f abstractC8683f, a aVar) {
        this(abstractC8683f);
    }

    /* renamed from: b */
    static <T> AbstractC8683f<Collection<T>> m27692b(Type type, C8695r c8695r) {
        return new b(c8695r.m27811d(C8698u.m27844c(type, Collection.class)));
    }

    /* renamed from: d */
    static <T> AbstractC8683f<Set<T>> m27693d(Type type, C8695r c8695r) {
        return new c(c8695r.m27811d(C8698u.m27844c(type, Collection.class)));
    }

    /* renamed from: a */
    public C m27694a(AbstractC8686i abstractC8686i) throws IOException {
        C mo27695c = mo27695c();
        abstractC8686i.mo27710a();
        while (abstractC8686i.mo27715f()) {
            mo27695c.add(this.f33092b.fromJson(abstractC8686i));
        }
        abstractC8686i.mo27712c();
        return mo27695c;
    }

    /* renamed from: c */
    abstract C mo27695c();

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public void m27696e(AbstractC8692o abstractC8692o, C c2) throws IOException {
        abstractC8692o.mo27756a();
        Iterator it = c2.iterator();
        while (it.hasNext()) {
            this.f33092b.toJson(abstractC8692o, (AbstractC8692o) it.next());
        }
        abstractC8692o.mo27758d();
    }

    public String toString() {
        return this.f33092b + ".collection()";
    }

    private AbstractC8681d(AbstractC8683f<T> abstractC8683f) {
        this.f33092b = abstractC8683f;
    }
}
