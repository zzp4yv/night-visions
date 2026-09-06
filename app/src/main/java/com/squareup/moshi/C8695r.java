package com.squareup.moshi;

import com.squareup.moshi.AbstractC8683f;
import com.squareup.moshi.p231w.C8702c;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Moshi.java */
/* renamed from: com.squareup.moshi.r */
/* loaded from: classes2.dex */
public final class C8695r {

    /* renamed from: a */
    static final List<AbstractC8683f.e> f33186a;

    /* renamed from: b */
    private final List<AbstractC8683f.e> f33187b;

    /* renamed from: c */
    private final int f33188c;

    /* renamed from: d */
    private final ThreadLocal<c> f33189d = new ThreadLocal<>();

    /* renamed from: e */
    private final Map<Object, AbstractC8683f<?>> f33190e = new LinkedHashMap();

    /* compiled from: Moshi.java */
    /* renamed from: com.squareup.moshi.r$a */
    public static final class a {

        /* renamed from: a */
        final List<AbstractC8683f.e> f33191a = new ArrayList();

        /* renamed from: b */
        int f33192b = 0;

        /* renamed from: a */
        public a m27814a(AbstractC8683f.e eVar) {
            if (eVar == null) {
                throw new IllegalArgumentException("factory == null");
            }
            List<AbstractC8683f.e> list = this.f33191a;
            int i2 = this.f33192b;
            this.f33192b = i2 + 1;
            list.add(i2, eVar);
            return this;
        }

        /* renamed from: b */
        public C8695r m27815b() {
            return new C8695r(this);
        }
    }

    /* compiled from: Moshi.java */
    /* renamed from: com.squareup.moshi.r$b */
    static final class b<T> extends AbstractC8683f<T> {

        /* renamed from: a */
        final Type f33193a;

        /* renamed from: b */
        final String f33194b;

        /* renamed from: c */
        final Object f33195c;

        /* renamed from: d */
        AbstractC8683f<T> f33196d;

        b(Type type, String str, Object obj) {
            this.f33193a = type;
            this.f33194b = str;
            this.f33195c = obj;
        }

        @Override // com.squareup.moshi.AbstractC8683f
        public T fromJson(AbstractC8686i abstractC8686i) throws IOException {
            AbstractC8683f<T> abstractC8683f = this.f33196d;
            if (abstractC8683f != null) {
                return abstractC8683f.fromJson(abstractC8686i);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        @Override // com.squareup.moshi.AbstractC8683f
        public void toJson(AbstractC8692o abstractC8692o, T t) throws IOException {
            AbstractC8683f<T> abstractC8683f = this.f33196d;
            if (abstractC8683f == null) {
                throw new IllegalStateException("JsonAdapter isn't ready");
            }
            abstractC8683f.toJson(abstractC8692o, (AbstractC8692o) t);
        }

        public String toString() {
            AbstractC8683f<T> abstractC8683f = this.f33196d;
            return abstractC8683f != null ? abstractC8683f.toString() : super.toString();
        }
    }

    /* compiled from: Moshi.java */
    /* renamed from: com.squareup.moshi.r$c */
    final class c {

        /* renamed from: a */
        final List<b<?>> f33197a = new ArrayList();

        /* renamed from: b */
        final Deque<b<?>> f33198b = new ArrayDeque();

        /* renamed from: c */
        boolean f33199c;

        c() {
        }

        /* renamed from: a */
        <T> void m27816a(AbstractC8683f<T> abstractC8683f) {
            this.f33198b.getLast().f33196d = abstractC8683f;
        }

        /* renamed from: b */
        IllegalArgumentException m27817b(IllegalArgumentException illegalArgumentException) {
            if (this.f33199c) {
                return illegalArgumentException;
            }
            this.f33199c = true;
            if (this.f33198b.size() == 1 && this.f33198b.getFirst().f33194b == null) {
                return illegalArgumentException;
            }
            StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
            Iterator<b<?>> descendingIterator = this.f33198b.descendingIterator();
            while (descendingIterator.hasNext()) {
                b<?> next = descendingIterator.next();
                sb.append("\nfor ");
                sb.append(next.f33193a);
                if (next.f33194b != null) {
                    sb.append(' ');
                    sb.append(next.f33194b);
                }
            }
            return new IllegalArgumentException(sb.toString(), illegalArgumentException);
        }

        /* renamed from: c */
        void m27818c(boolean z) {
            this.f33198b.removeLast();
            if (this.f33198b.isEmpty()) {
                C8695r.this.f33189d.remove();
                if (z) {
                    synchronized (C8695r.this.f33190e) {
                        int size = this.f33197a.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            b<?> bVar = this.f33197a.get(i2);
                            AbstractC8683f<T> abstractC8683f = (AbstractC8683f) C8695r.this.f33190e.put(bVar.f33195c, bVar.f33196d);
                            if (abstractC8683f != 0) {
                                bVar.f33196d = abstractC8683f;
                                C8695r.this.f33190e.put(bVar.f33195c, abstractC8683f);
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: d */
        <T> AbstractC8683f<T> m27819d(Type type, String str, Object obj) {
            int size = this.f33197a.size();
            for (int i2 = 0; i2 < size; i2++) {
                b<?> bVar = this.f33197a.get(i2);
                if (bVar.f33195c.equals(obj)) {
                    this.f33198b.add(bVar);
                    AbstractC8683f<T> abstractC8683f = (AbstractC8683f<T>) bVar.f33196d;
                    return abstractC8683f != null ? abstractC8683f : bVar;
                }
            }
            b<?> bVar2 = new b<>(type, str, obj);
            this.f33197a.add(bVar2);
            this.f33198b.add(bVar2);
            return null;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        f33186a = arrayList;
        arrayList.add(C8697t.f33202a);
        arrayList.add(AbstractC8681d.f33091a);
        arrayList.add(C8694q.f33183a);
        arrayList.add(C8678a.f33071a);
        arrayList.add(C8696s.f33201a);
        arrayList.add(C8680c.f33084a);
    }

    C8695r(a aVar) {
        int size = aVar.f33191a.size();
        List<AbstractC8683f.e> list = f33186a;
        ArrayList arrayList = new ArrayList(size + list.size());
        arrayList.addAll(aVar.f33191a);
        arrayList.addAll(list);
        this.f33187b = Collections.unmodifiableList(arrayList);
        this.f33188c = aVar.f33192b;
    }

    /* renamed from: g */
    private Object m27809g(Type type, Set<? extends Annotation> set) {
        return set.isEmpty() ? type : Arrays.asList(type, set);
    }

    /* renamed from: c */
    public <T> AbstractC8683f<T> m27810c(Class<T> cls) {
        return m27812e(cls, C8702c.f33225a);
    }

    /* renamed from: d */
    public <T> AbstractC8683f<T> m27811d(Type type) {
        return m27812e(type, C8702c.f33225a);
    }

    /* renamed from: e */
    public <T> AbstractC8683f<T> m27812e(Type type, Set<? extends Annotation> set) {
        return m27813f(type, set, null);
    }

    /* renamed from: f */
    public <T> AbstractC8683f<T> m27813f(Type type, Set<? extends Annotation> set, String str) {
        if (type == null) {
            throw new NullPointerException("type == null");
        }
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type m27869o = C8702c.m27869o(C8702c.m27855a(type));
        Object m27809g = m27809g(m27869o, set);
        synchronized (this.f33190e) {
            AbstractC8683f<T> abstractC8683f = (AbstractC8683f) this.f33190e.get(m27809g);
            if (abstractC8683f != null) {
                return abstractC8683f;
            }
            c cVar = this.f33189d.get();
            if (cVar == null) {
                cVar = new c();
                this.f33189d.set(cVar);
            }
            AbstractC8683f<T> m27819d = cVar.m27819d(m27869o, str, m27809g);
            try {
                if (m27819d != null) {
                    return m27819d;
                }
                try {
                    int size = this.f33187b.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        AbstractC8683f<T> abstractC8683f2 = (AbstractC8683f<T>) this.f33187b.get(i2).mo27684a(m27869o, set, this);
                        if (abstractC8683f2 != null) {
                            cVar.m27816a(abstractC8683f2);
                            cVar.m27818c(true);
                            return abstractC8683f2;
                        }
                    }
                    throw new IllegalArgumentException("No JsonAdapter for " + C8702c.m27874t(m27869o, set));
                } catch (IllegalArgumentException e2) {
                    throw cVar.m27817b(e2);
                }
            } finally {
                cVar.m27818c(false);
            }
        }
    }
}
