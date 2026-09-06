package com.google.gson;

import com.google.gson.p215t.C8557c;
import com.google.gson.p215t.C8558d;
import com.google.gson.p215t.C8566l;
import com.google.gson.p215t.p216n.C8568a;
import com.google.gson.p215t.p216n.C8569b;
import com.google.gson.p215t.p216n.C8570c;
import com.google.gson.p215t.p216n.C8571d;
import com.google.gson.p215t.p216n.C8574g;
import com.google.gson.p215t.p216n.C8575h;
import com.google.gson.p215t.p216n.C8576i;
import com.google.gson.p215t.p216n.C8577j;
import com.google.gson.p215t.p216n.C8578k;
import com.google.gson.p215t.p216n.C8581n;
import com.google.gson.p219u.C8586a;
import com.google.gson.stream.C8552a;
import com.google.gson.stream.C8554c;
import com.google.gson.stream.EnumC8553b;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: Gson.java */
/* renamed from: com.google.gson.e */
/* loaded from: classes2.dex */
public final class C8533e {

    /* renamed from: a */
    private static final C8586a<?> f32421a = C8586a.get(Object.class);

    /* renamed from: b */
    private final ThreadLocal<Map<C8586a<?>, f<?>>> f32422b;

    /* renamed from: c */
    private final Map<C8586a<?>, AbstractC8545q<?>> f32423c;

    /* renamed from: d */
    private final C8557c f32424d;

    /* renamed from: e */
    private final C8571d f32425e;

    /* renamed from: f */
    final List<InterfaceC8546r> f32426f;

    /* renamed from: g */
    final C8558d f32427g;

    /* renamed from: h */
    final InterfaceC8532d f32428h;

    /* renamed from: i */
    final Map<Type, InterfaceC8534f<?>> f32429i;

    /* renamed from: j */
    final boolean f32430j;

    /* renamed from: k */
    final boolean f32431k;

    /* renamed from: l */
    final boolean f32432l;

    /* renamed from: m */
    final boolean f32433m;

    /* renamed from: n */
    final boolean f32434n;

    /* renamed from: o */
    final boolean f32435o;

    /* renamed from: p */
    final boolean f32436p;

    /* renamed from: q */
    final String f32437q;

    /* renamed from: r */
    final int f32438r;

    /* renamed from: s */
    final int f32439s;

    /* renamed from: t */
    final EnumC8544p f32440t;

    /* renamed from: u */
    final List<InterfaceC8546r> f32441u;

    /* renamed from: v */
    final List<InterfaceC8546r> f32442v;

    /* compiled from: Gson.java */
    /* renamed from: com.google.gson.e$a */
    class a extends AbstractC8545q<Number> {
        a() {
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Double mo26938b(C8552a c8552a) throws IOException {
            if (c8552a.mo27001Q() != EnumC8553b.NULL) {
                return Double.valueOf(c8552a.mo27014z());
            }
            c8552a.mo26999I();
            return null;
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8554c c8554c, Number number) throws IOException {
            if (number == null) {
                c8554c.mo27043y();
            } else {
                C8533e.m26919d(number.doubleValue());
                c8554c.mo27032W(number);
            }
        }
    }

    /* compiled from: Gson.java */
    /* renamed from: com.google.gson.e$b */
    class b extends AbstractC8545q<Number> {
        b() {
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Float mo26938b(C8552a c8552a) throws IOException {
            if (c8552a.mo27001Q() != EnumC8553b.NULL) {
                return Float.valueOf((float) c8552a.mo27014z());
            }
            c8552a.mo26999I();
            return null;
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8554c c8554c, Number number) throws IOException {
            if (number == null) {
                c8554c.mo27043y();
            } else {
                C8533e.m26919d(number.floatValue());
                c8554c.mo27032W(number);
            }
        }
    }

    /* compiled from: Gson.java */
    /* renamed from: com.google.gson.e$c */
    static class c extends AbstractC8545q<Number> {
        c() {
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number mo26938b(C8552a c8552a) throws IOException {
            if (c8552a.mo27001Q() != EnumC8553b.NULL) {
                return Long.valueOf(c8552a.mo26997B());
            }
            c8552a.mo26999I();
            return null;
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8554c c8554c, Number number) throws IOException {
            if (number == null) {
                c8554c.mo27043y();
            } else {
                c8554c.mo27033Y(number.toString());
            }
        }
    }

    /* compiled from: Gson.java */
    /* renamed from: com.google.gson.e$d */
    static class d extends AbstractC8545q<AtomicLong> {

        /* renamed from: a */
        final /* synthetic */ AbstractC8545q f32445a;

        d(AbstractC8545q abstractC8545q) {
            this.f32445a = abstractC8545q;
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicLong mo26938b(C8552a c8552a) throws IOException {
            return new AtomicLong(((Number) this.f32445a.mo26938b(c8552a)).longValue());
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8554c c8554c, AtomicLong atomicLong) throws IOException {
            this.f32445a.mo26939d(c8554c, Long.valueOf(atomicLong.get()));
        }
    }

    /* compiled from: Gson.java */
    /* renamed from: com.google.gson.e$e */
    static class e extends AbstractC8545q<AtomicLongArray> {

        /* renamed from: a */
        final /* synthetic */ AbstractC8545q f32446a;

        e(AbstractC8545q abstractC8545q) {
            this.f32446a = abstractC8545q;
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicLongArray mo26938b(C8552a c8552a) throws IOException {
            ArrayList arrayList = new ArrayList();
            c8552a.mo27002a();
            while (c8552a.mo27009l()) {
                arrayList.add(Long.valueOf(((Number) this.f32446a.mo26938b(c8552a)).longValue()));
            }
            c8552a.mo27006f();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i2 = 0; i2 < size; i2++) {
                atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
            }
            return atomicLongArray;
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8554c c8554c, AtomicLongArray atomicLongArray) throws IOException {
            c8554c.mo27035c();
            int length = atomicLongArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                this.f32446a.mo26939d(c8554c, Long.valueOf(atomicLongArray.get(i2)));
            }
            c8554c.mo27037f();
        }
    }

    /* compiled from: Gson.java */
    /* renamed from: com.google.gson.e$f */
    static class f<T> extends AbstractC8545q<T> {

        /* renamed from: a */
        private AbstractC8545q<T> f32447a;

        f() {
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: b */
        public T mo26938b(C8552a c8552a) throws IOException {
            AbstractC8545q<T> abstractC8545q = this.f32447a;
            if (abstractC8545q != null) {
                return abstractC8545q.mo26938b(c8552a);
            }
            throw new IllegalStateException();
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: d */
        public void mo26939d(C8554c c8554c, T t) throws IOException {
            AbstractC8545q<T> abstractC8545q = this.f32447a;
            if (abstractC8545q == null) {
                throw new IllegalStateException();
            }
            abstractC8545q.mo26939d(c8554c, t);
        }

        /* renamed from: e */
        public void m26950e(AbstractC8545q<T> abstractC8545q) {
            if (this.f32447a != null) {
                throw new AssertionError();
            }
            this.f32447a = abstractC8545q;
        }
    }

    public C8533e() {
        this(C8558d.f32527f, EnumC8531c.f32414f, Collections.emptyMap(), false, false, false, true, false, false, false, EnumC8544p.f32453f, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    /* renamed from: a */
    private static void m26916a(Object obj, C8552a c8552a) {
        if (obj != null) {
            try {
                if (c8552a.mo27001Q() == EnumC8553b.END_DOCUMENT) {
                } else {
                    throw new JsonIOException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e2) {
                throw new JsonSyntaxException(e2);
            } catch (IOException e3) {
                throw new JsonIOException(e3);
            }
        }
    }

    /* renamed from: b */
    private static AbstractC8545q<AtomicLong> m26917b(AbstractC8545q<Number> abstractC8545q) {
        return new d(abstractC8545q).m26977a();
    }

    /* renamed from: c */
    private static AbstractC8545q<AtomicLongArray> m26918c(AbstractC8545q<Number> abstractC8545q) {
        return new e(abstractC8545q).m26977a();
    }

    /* renamed from: d */
    static void m26919d(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* renamed from: e */
    private AbstractC8545q<Number> m26920e(boolean z) {
        return z ? C8581n.f32685v : new a();
    }

    /* renamed from: f */
    private AbstractC8545q<Number> m26921f(boolean z) {
        return z ? C8581n.f32684u : new b();
    }

    /* renamed from: m */
    private static AbstractC8545q<Number> m26922m(EnumC8544p enumC8544p) {
        return enumC8544p == EnumC8544p.f32453f ? C8581n.f32683t : new c();
    }

    /* renamed from: g */
    public <T> T m26923g(C8552a c8552a, Type type) throws JsonIOException, JsonSyntaxException {
        boolean m27010m = c8552a.m27010m();
        boolean z = true;
        c8552a.m27003a0(true);
        try {
            try {
                try {
                    c8552a.mo27001Q();
                    z = false;
                    T mo26938b = m26926j(C8586a.get(type)).mo26938b(c8552a);
                    c8552a.m27003a0(m27010m);
                    return mo26938b;
                } catch (AssertionError e2) {
                    AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.5): " + e2.getMessage());
                    assertionError.initCause(e2);
                    throw assertionError;
                } catch (IllegalStateException e3) {
                    throw new JsonSyntaxException(e3);
                }
            } catch (EOFException e4) {
                if (!z) {
                    throw new JsonSyntaxException(e4);
                }
                c8552a.m27003a0(m27010m);
                return null;
            } catch (IOException e5) {
                throw new JsonSyntaxException(e5);
            }
        } catch (Throwable th) {
            c8552a.m27003a0(m27010m);
            throw th;
        }
    }

    /* renamed from: h */
    public <T> T m26924h(Reader reader, Type type) throws JsonIOException, JsonSyntaxException {
        C8552a m26929n = m26929n(reader);
        T t = (T) m26923g(m26929n, type);
        m26916a(t, m26929n);
        return t;
    }

    /* renamed from: i */
    public <T> T m26925i(String str, Type type) throws JsonSyntaxException {
        if (str == null) {
            return null;
        }
        return (T) m26924h(new StringReader(str), type);
    }

    /* renamed from: j */
    public <T> AbstractC8545q<T> m26926j(C8586a<T> c8586a) {
        AbstractC8545q<T> abstractC8545q = (AbstractC8545q) this.f32423c.get(c8586a == null ? f32421a : c8586a);
        if (abstractC8545q != null) {
            return abstractC8545q;
        }
        Map<C8586a<?>, f<?>> map = this.f32422b.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap<>();
            this.f32422b.set(map);
            z = true;
        }
        f<?> fVar = map.get(c8586a);
        if (fVar != null) {
            return fVar;
        }
        try {
            f<?> fVar2 = new f<>();
            map.put(c8586a, fVar2);
            Iterator<InterfaceC8546r> it = this.f32426f.iterator();
            while (it.hasNext()) {
                AbstractC8545q<T> mo26979b = it.next().mo26979b(this, c8586a);
                if (mo26979b != null) {
                    fVar2.m26950e(mo26979b);
                    this.f32423c.put(c8586a, mo26979b);
                    return mo26979b;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.5) cannot handle " + c8586a);
        } finally {
            map.remove(c8586a);
            if (z) {
                this.f32422b.remove();
            }
        }
    }

    /* renamed from: k */
    public <T> AbstractC8545q<T> m26927k(Class<T> cls) {
        return m26926j(C8586a.get((Class) cls));
    }

    /* renamed from: l */
    public <T> AbstractC8545q<T> m26928l(InterfaceC8546r interfaceC8546r, C8586a<T> c8586a) {
        if (!this.f32426f.contains(interfaceC8546r)) {
            interfaceC8546r = this.f32425e;
        }
        boolean z = false;
        for (InterfaceC8546r interfaceC8546r2 : this.f32426f) {
            if (z) {
                AbstractC8545q<T> mo26979b = interfaceC8546r2.mo26979b(this, c8586a);
                if (mo26979b != null) {
                    return mo26979b;
                }
            } else if (interfaceC8546r2 == interfaceC8546r) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + c8586a);
    }

    /* renamed from: n */
    public C8552a m26929n(Reader reader) {
        C8552a c8552a = new C8552a(reader);
        c8552a.m27003a0(this.f32435o);
        return c8552a;
    }

    /* renamed from: o */
    public C8554c m26930o(Writer writer) throws IOException {
        if (this.f32432l) {
            writer.write(")]}'\n");
        }
        C8554c c8554c = new C8554c(writer);
        if (this.f32434n) {
            c8554c.m27027I("  ");
        }
        c8554c.m27029K(this.f32430j);
        return c8554c;
    }

    /* renamed from: p */
    public String m26931p(AbstractC8538j abstractC8538j) {
        StringWriter stringWriter = new StringWriter();
        m26935t(abstractC8538j, stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: q */
    public String m26932q(Object obj) {
        return obj == null ? m26931p(C8539k.f32449a) : m26933r(obj, obj.getClass());
    }

    /* renamed from: r */
    public String m26933r(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        m26937v(obj, type, stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: s */
    public void m26934s(AbstractC8538j abstractC8538j, C8554c c8554c) throws JsonIOException {
        boolean m27041m = c8554c.m27041m();
        c8554c.m27028J(true);
        boolean m27040l = c8554c.m27040l();
        c8554c.m27026H(this.f32433m);
        boolean m27039k = c8554c.m27039k();
        c8554c.m27029K(this.f32430j);
        try {
            try {
                C8566l.m27111b(abstractC8538j, c8554c);
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            } catch (AssertionError e3) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.5): " + e3.getMessage());
                assertionError.initCause(e3);
                throw assertionError;
            }
        } finally {
            c8554c.m27028J(m27041m);
            c8554c.m27026H(m27040l);
            c8554c.m27029K(m27039k);
        }
    }

    /* renamed from: t */
    public void m26935t(AbstractC8538j abstractC8538j, Appendable appendable) throws JsonIOException {
        try {
            m26934s(abstractC8538j, m26930o(C8566l.m27112c(appendable)));
        } catch (IOException e2) {
            throw new JsonIOException(e2);
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f32430j + ",factories:" + this.f32426f + ",instanceCreators:" + this.f32424d + "}";
    }

    /* renamed from: u */
    public void m26936u(Object obj, Type type, C8554c c8554c) throws JsonIOException {
        AbstractC8545q m26926j = m26926j(C8586a.get(type));
        boolean m27041m = c8554c.m27041m();
        c8554c.m27028J(true);
        boolean m27040l = c8554c.m27040l();
        c8554c.m27026H(this.f32433m);
        boolean m27039k = c8554c.m27039k();
        c8554c.m27029K(this.f32430j);
        try {
            try {
                m26926j.mo26939d(c8554c, obj);
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            } catch (AssertionError e3) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.5): " + e3.getMessage());
                assertionError.initCause(e3);
                throw assertionError;
            }
        } finally {
            c8554c.m27028J(m27041m);
            c8554c.m27026H(m27040l);
            c8554c.m27029K(m27039k);
        }
    }

    /* renamed from: v */
    public void m26937v(Object obj, Type type, Appendable appendable) throws JsonIOException {
        try {
            m26936u(obj, type, m26930o(C8566l.m27112c(appendable)));
        } catch (IOException e2) {
            throw new JsonIOException(e2);
        }
    }

    C8533e(C8558d c8558d, InterfaceC8532d interfaceC8532d, Map<Type, InterfaceC8534f<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, EnumC8544p enumC8544p, String str, int i2, int i3, List<InterfaceC8546r> list, List<InterfaceC8546r> list2, List<InterfaceC8546r> list3) {
        this.f32422b = new ThreadLocal<>();
        this.f32423c = new ConcurrentHashMap();
        this.f32427g = c8558d;
        this.f32428h = interfaceC8532d;
        this.f32429i = map;
        C8557c c8557c = new C8557c(map);
        this.f32424d = c8557c;
        this.f32430j = z;
        this.f32431k = z2;
        this.f32432l = z3;
        this.f32433m = z4;
        this.f32434n = z5;
        this.f32435o = z6;
        this.f32436p = z7;
        this.f32440t = enumC8544p;
        this.f32437q = str;
        this.f32438r = i2;
        this.f32439s = i3;
        this.f32441u = list;
        this.f32442v = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C8581n.f32662Y);
        arrayList.add(C8575h.f32603a);
        arrayList.add(c8558d);
        arrayList.addAll(list3);
        arrayList.add(C8581n.f32641D);
        arrayList.add(C8581n.f32676m);
        arrayList.add(C8581n.f32670g);
        arrayList.add(C8581n.f32672i);
        arrayList.add(C8581n.f32674k);
        AbstractC8545q<Number> m26922m = m26922m(enumC8544p);
        arrayList.add(C8581n.m27150b(Long.TYPE, Long.class, m26922m));
        arrayList.add(C8581n.m27150b(Double.TYPE, Double.class, m26920e(z7)));
        arrayList.add(C8581n.m27150b(Float.TYPE, Float.class, m26921f(z7)));
        arrayList.add(C8581n.f32687x);
        arrayList.add(C8581n.f32678o);
        arrayList.add(C8581n.f32680q);
        arrayList.add(C8581n.m27149a(AtomicLong.class, m26917b(m26922m)));
        arrayList.add(C8581n.m27149a(AtomicLongArray.class, m26918c(m26922m)));
        arrayList.add(C8581n.f32682s);
        arrayList.add(C8581n.f32689z);
        arrayList.add(C8581n.f32643F);
        arrayList.add(C8581n.f32645H);
        arrayList.add(C8581n.m27149a(BigDecimal.class, C8581n.f32639B));
        arrayList.add(C8581n.m27149a(BigInteger.class, C8581n.f32640C));
        arrayList.add(C8581n.f32647J);
        arrayList.add(C8581n.f32649L);
        arrayList.add(C8581n.f32653P);
        arrayList.add(C8581n.f32655R);
        arrayList.add(C8581n.f32660W);
        arrayList.add(C8581n.f32651N);
        arrayList.add(C8581n.f32667d);
        arrayList.add(C8570c.f32583a);
        arrayList.add(C8581n.f32658U);
        arrayList.add(C8578k.f32625a);
        arrayList.add(C8577j.f32623a);
        arrayList.add(C8581n.f32656S);
        arrayList.add(C8568a.f32577a);
        arrayList.add(C8581n.f32665b);
        arrayList.add(new C8569b(c8557c));
        arrayList.add(new C8574g(c8557c, z2));
        C8571d c8571d = new C8571d(c8557c);
        this.f32425e = c8571d;
        arrayList.add(c8571d);
        arrayList.add(C8581n.f32663Z);
        arrayList.add(new C8576i(c8557c, interfaceC8532d, c8558d, c8571d));
        this.f32426f = Collections.unmodifiableList(arrayList);
    }
}
