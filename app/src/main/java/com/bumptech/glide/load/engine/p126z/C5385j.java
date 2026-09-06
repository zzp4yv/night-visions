package com.bumptech.glide.load.engine.p126z;

import android.util.Log;
import com.bumptech.glide.p145r.C5563j;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: LruArrayPool.java */
/* renamed from: com.bumptech.glide.load.engine.z.j */
/* loaded from: classes.dex */
public final class C5385j implements InterfaceC5377b {

    /* renamed from: a */
    private final C5383h<a, Object> f13523a = new C5383h<>();

    /* renamed from: b */
    private final b f13524b = new b();

    /* renamed from: c */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f13525c = new HashMap();

    /* renamed from: d */
    private final Map<Class<?>, InterfaceC5376a<?>> f13526d = new HashMap();

    /* renamed from: e */
    private final int f13527e;

    /* renamed from: f */
    private int f13528f;

    /* compiled from: LruArrayPool.java */
    /* renamed from: com.bumptech.glide.load.engine.z.j$a */
    private static final class a implements InterfaceC5388m {

        /* renamed from: a */
        private final b f13529a;

        /* renamed from: b */
        int f13530b;

        /* renamed from: c */
        private Class<?> f13531c;

        a(b bVar) {
            this.f13529a = bVar;
        }

        @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5388m
        /* renamed from: a */
        public void mo10378a() {
            this.f13529a.m10384c(this);
        }

        /* renamed from: b */
        void m10415b(int i2, Class<?> cls) {
            this.f13530b = i2;
            this.f13531c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f13530b == aVar.f13530b && this.f13531c == aVar.f13531c;
        }

        public int hashCode() {
            int i2 = this.f13530b * 31;
            Class<?> cls = this.f13531c;
            return i2 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f13530b + "array=" + this.f13531c + '}';
        }
    }

    /* compiled from: LruArrayPool.java */
    /* renamed from: com.bumptech.glide.load.engine.z.j$b */
    private static final class b extends AbstractC5379d<a> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.bumptech.glide.load.engine.p126z.AbstractC5379d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a mo10380a() {
            return new a(this);
        }

        /* renamed from: e */
        a m10417e(int i2, Class<?> cls) {
            a m10383b = m10383b();
            m10383b.m10415b(i2, cls);
            return m10383b;
        }
    }

    public C5385j(int i2) {
        this.f13527e = i2;
    }

    /* renamed from: f */
    private void m10404f(int i2, Class<?> cls) {
        NavigableMap<Integer, Integer> m10411m = m10411m(cls);
        Integer num = (Integer) m10411m.get(Integer.valueOf(i2));
        if (num != null) {
            if (num.intValue() == 1) {
                m10411m.remove(Integer.valueOf(i2));
                return;
            } else {
                m10411m.put(Integer.valueOf(i2), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i2 + ", this: " + this);
    }

    /* renamed from: g */
    private void m10405g() {
        m10406h(this.f13527e);
    }

    /* renamed from: h */
    private void m10406h(int i2) {
        while (this.f13528f > i2) {
            Object m10398f = this.f13523a.m10398f();
            C5563j.m11042d(m10398f);
            InterfaceC5376a m10407i = m10407i(m10398f);
            this.f13528f -= m10407i.mo10364b(m10398f) * m10407i.mo10363a();
            m10404f(m10407i.mo10364b(m10398f), m10398f.getClass());
            if (Log.isLoggable(m10407i.getTag(), 2)) {
                Log.v(m10407i.getTag(), "evicted: " + m10407i.mo10364b(m10398f));
            }
        }
    }

    /* renamed from: i */
    private <T> InterfaceC5376a<T> m10407i(T t) {
        return m10408j(t.getClass());
    }

    /* renamed from: j */
    private <T> InterfaceC5376a<T> m10408j(Class<T> cls) {
        InterfaceC5376a<T> interfaceC5376a = (InterfaceC5376a) this.f13526d.get(cls);
        if (interfaceC5376a == null) {
            if (cls.equals(int[].class)) {
                interfaceC5376a = new C5384i();
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
                }
                interfaceC5376a = new C5382g();
            }
            this.f13526d.put(cls, interfaceC5376a);
        }
        return interfaceC5376a;
    }

    /* renamed from: k */
    private <T> T m10409k(a aVar) {
        return (T) this.f13523a.m10396a(aVar);
    }

    /* renamed from: l */
    private <T> T m10410l(a aVar, Class<T> cls) {
        InterfaceC5376a<T> m10408j = m10408j(cls);
        T t = (T) m10409k(aVar);
        if (t != null) {
            this.f13528f -= m10408j.mo10364b(t) * m10408j.mo10363a();
            m10404f(m10408j.mo10364b(t), cls);
        }
        if (t != null) {
            return t;
        }
        if (Log.isLoggable(m10408j.getTag(), 2)) {
            Log.v(m10408j.getTag(), "Allocated " + aVar.f13530b + " bytes");
        }
        return m10408j.newArray(aVar.f13530b);
    }

    /* renamed from: m */
    private NavigableMap<Integer, Integer> m10411m(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f13525c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f13525c.put(cls, treeMap);
        return treeMap;
    }

    /* renamed from: n */
    private boolean m10412n() {
        int i2 = this.f13528f;
        return i2 == 0 || this.f13527e / i2 >= 2;
    }

    /* renamed from: o */
    private boolean m10413o(int i2) {
        return i2 <= this.f13527e / 2;
    }

    /* renamed from: p */
    private boolean m10414p(int i2, Integer num) {
        return num != null && (m10412n() || num.intValue() <= i2 * 8);
    }

    @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5377b
    /* renamed from: a */
    public synchronized void mo10365a(int i2) {
        try {
            if (i2 >= 40) {
                mo10366b();
            } else if (i2 >= 20 || i2 == 15) {
                m10406h(this.f13527e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5377b
    /* renamed from: b */
    public synchronized void mo10366b() {
        m10406h(0);
    }

    @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5377b
    /* renamed from: c */
    public synchronized <T> T mo10367c(int i2, Class<T> cls) {
        return (T) m10410l(this.f13524b.m10417e(i2, cls), cls);
    }

    @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5377b
    /* renamed from: d */
    public synchronized <T> void mo10368d(T t) {
        Class<?> cls = t.getClass();
        InterfaceC5376a<T> m10408j = m10408j(cls);
        int mo10364b = m10408j.mo10364b(t);
        int mo10363a = m10408j.mo10363a() * mo10364b;
        if (m10413o(mo10363a)) {
            a m10417e = this.f13524b.m10417e(mo10364b, cls);
            this.f13523a.m10397d(m10417e, t);
            NavigableMap<Integer, Integer> m10411m = m10411m(cls);
            Integer num = (Integer) m10411m.get(Integer.valueOf(m10417e.f13530b));
            Integer valueOf = Integer.valueOf(m10417e.f13530b);
            int i2 = 1;
            if (num != null) {
                i2 = 1 + num.intValue();
            }
            m10411m.put(valueOf, Integer.valueOf(i2));
            this.f13528f += mo10363a;
            m10405g();
        }
    }

    @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5377b
    /* renamed from: e */
    public synchronized <T> T mo10369e(int i2, Class<T> cls) {
        Integer ceilingKey;
        ceilingKey = m10411m(cls).ceilingKey(Integer.valueOf(i2));
        return (T) m10410l(m10414p(i2, ceilingKey) ? this.f13524b.m10417e(ceilingKey.intValue(), cls) : this.f13524b.m10417e(i2, cls), cls);
    }
}
