package com.squareup.moshi;

import com.squareup.moshi.AbstractC8683f;
import com.squareup.moshi.AbstractC8686i;
import com.squareup.moshi.p231w.C8702c;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: StandardJsonAdapters.java */
/* renamed from: com.squareup.moshi.t */
/* loaded from: classes2.dex */
final class C8697t {

    /* renamed from: a */
    public static final AbstractC8683f.e f33202a = new c();

    /* renamed from: b */
    static final AbstractC8683f<Boolean> f33203b = new d();

    /* renamed from: c */
    static final AbstractC8683f<Byte> f33204c = new e();

    /* renamed from: d */
    static final AbstractC8683f<Character> f33205d = new f();

    /* renamed from: e */
    static final AbstractC8683f<Double> f33206e = new g();

    /* renamed from: f */
    static final AbstractC8683f<Float> f33207f = new h();

    /* renamed from: g */
    static final AbstractC8683f<Integer> f33208g = new i();

    /* renamed from: h */
    static final AbstractC8683f<Long> f33209h = new j();

    /* renamed from: i */
    static final AbstractC8683f<Short> f33210i = new k();

    /* renamed from: j */
    static final AbstractC8683f<String> f33211j = new a();

    /* compiled from: StandardJsonAdapters.java */
    /* renamed from: com.squareup.moshi.t$a */
    class a extends AbstractC8683f<String> {
        a() {
        }

        @Override // com.squareup.moshi.AbstractC8683f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String fromJson(AbstractC8686i abstractC8686i) throws IOException {
            return abstractC8686i.mo27723y();
        }

        @Override // com.squareup.moshi.AbstractC8683f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(AbstractC8692o abstractC8692o, String str) throws IOException {
            abstractC8692o.mo27754N(str);
        }

        public String toString() {
            return "JsonAdapter(String)";
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* renamed from: com.squareup.moshi.t$b */
    static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f33212a;

        static {
            int[] iArr = new int[AbstractC8686i.b.values().length];
            f33212a = iArr;
            try {
                iArr[AbstractC8686i.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33212a[AbstractC8686i.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33212a[AbstractC8686i.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33212a[AbstractC8686i.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33212a[AbstractC8686i.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33212a[AbstractC8686i.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* renamed from: com.squareup.moshi.t$c */
    class c implements AbstractC8683f.e {
        c() {
        }

        @Override // com.squareup.moshi.AbstractC8683f.e
        /* renamed from: a */
        public AbstractC8683f<?> mo27684a(Type type, Set<? extends Annotation> set, C8695r c8695r) {
            if (!set.isEmpty()) {
                return null;
            }
            if (type == Boolean.TYPE) {
                return C8697t.f33203b;
            }
            if (type == Byte.TYPE) {
                return C8697t.f33204c;
            }
            if (type == Character.TYPE) {
                return C8697t.f33205d;
            }
            if (type == Double.TYPE) {
                return C8697t.f33206e;
            }
            if (type == Float.TYPE) {
                return C8697t.f33207f;
            }
            if (type == Integer.TYPE) {
                return C8697t.f33208g;
            }
            if (type == Long.TYPE) {
                return C8697t.f33209h;
            }
            if (type == Short.TYPE) {
                return C8697t.f33210i;
            }
            if (type == Boolean.class) {
                return C8697t.f33203b.nullSafe();
            }
            if (type == Byte.class) {
                return C8697t.f33204c.nullSafe();
            }
            if (type == Character.class) {
                return C8697t.f33205d.nullSafe();
            }
            if (type == Double.class) {
                return C8697t.f33206e.nullSafe();
            }
            if (type == Float.class) {
                return C8697t.f33207f.nullSafe();
            }
            if (type == Integer.class) {
                return C8697t.f33208g.nullSafe();
            }
            if (type == Long.class) {
                return C8697t.f33209h.nullSafe();
            }
            if (type == Short.class) {
                return C8697t.f33210i.nullSafe();
            }
            if (type == String.class) {
                return C8697t.f33211j.nullSafe();
            }
            if (type == Object.class) {
                return new m(c8695r).nullSafe();
            }
            Class<?> m27848g = C8698u.m27848g(type);
            AbstractC8683f<?> m27858d = C8702c.m27858d(c8695r, type, m27848g);
            if (m27858d != null) {
                return m27858d;
            }
            if (m27848g.isEnum()) {
                return new l(m27848g).nullSafe();
            }
            return null;
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* renamed from: com.squareup.moshi.t$d */
    class d extends AbstractC8683f<Boolean> {
        d() {
        }

        @Override // com.squareup.moshi.AbstractC8683f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean fromJson(AbstractC8686i abstractC8686i) throws IOException {
            return Boolean.valueOf(abstractC8686i.mo27718k());
        }

        @Override // com.squareup.moshi.AbstractC8683f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(AbstractC8692o abstractC8692o, Boolean bool) throws IOException {
            abstractC8692o.mo27755Q(bool.booleanValue());
        }

        public String toString() {
            return "JsonAdapter(Boolean)";
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* renamed from: com.squareup.moshi.t$e */
    class e extends AbstractC8683f<Byte> {
        e() {
        }

        @Override // com.squareup.moshi.AbstractC8683f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte fromJson(AbstractC8686i abstractC8686i) throws IOException {
            return Byte.valueOf((byte) C8697t.m27820a(abstractC8686i, "a byte", -128, 255));
        }

        @Override // com.squareup.moshi.AbstractC8683f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(AbstractC8692o abstractC8692o, Byte b2) throws IOException {
            abstractC8692o.mo27752J(b2.intValue() & 255);
        }

        public String toString() {
            return "JsonAdapter(Byte)";
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* renamed from: com.squareup.moshi.t$f */
    class f extends AbstractC8683f<Character> {
        f() {
        }

        @Override // com.squareup.moshi.AbstractC8683f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Character fromJson(AbstractC8686i abstractC8686i) throws IOException {
            String mo27723y = abstractC8686i.mo27723y();
            if (mo27723y.length() <= 1) {
                return Character.valueOf(mo27723y.charAt(0));
            }
            throw new JsonDataException(String.format("Expected %s but was %s at path %s", "a char", '\"' + mo27723y + '\"', abstractC8686i.m27716g()));
        }

        @Override // com.squareup.moshi.AbstractC8683f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(AbstractC8692o abstractC8692o, Character ch) throws IOException {
            abstractC8692o.mo27754N(ch.toString());
        }

        public String toString() {
            return "JsonAdapter(Character)";
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* renamed from: com.squareup.moshi.t$g */
    class g extends AbstractC8683f<Double> {
        g() {
        }

        @Override // com.squareup.moshi.AbstractC8683f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Double fromJson(AbstractC8686i abstractC8686i) throws IOException {
            return Double.valueOf(abstractC8686i.mo27719l());
        }

        @Override // com.squareup.moshi.AbstractC8683f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(AbstractC8692o abstractC8692o, Double d2) throws IOException {
            abstractC8692o.mo27751I(d2.doubleValue());
        }

        public String toString() {
            return "JsonAdapter(Double)";
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* renamed from: com.squareup.moshi.t$h */
    class h extends AbstractC8683f<Float> {
        h() {
        }

        @Override // com.squareup.moshi.AbstractC8683f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float fromJson(AbstractC8686i abstractC8686i) throws IOException {
            float mo27719l = (float) abstractC8686i.mo27719l();
            if (abstractC8686i.m27717j() || !Float.isInfinite(mo27719l)) {
                return Float.valueOf(mo27719l);
            }
            throw new JsonDataException("JSON forbids NaN and infinities: " + mo27719l + " at path " + abstractC8686i.m27716g());
        }

        @Override // com.squareup.moshi.AbstractC8683f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(AbstractC8692o abstractC8692o, Float f2) throws IOException {
            f2.getClass();
            abstractC8692o.mo27753K(f2);
        }

        public String toString() {
            return "JsonAdapter(Float)";
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* renamed from: com.squareup.moshi.t$i */
    class i extends AbstractC8683f<Integer> {
        i() {
        }

        @Override // com.squareup.moshi.AbstractC8683f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer fromJson(AbstractC8686i abstractC8686i) throws IOException {
            return Integer.valueOf(abstractC8686i.mo27720m());
        }

        @Override // com.squareup.moshi.AbstractC8683f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(AbstractC8692o abstractC8692o, Integer num) throws IOException {
            abstractC8692o.mo27752J(num.intValue());
        }

        public String toString() {
            return "JsonAdapter(Integer)";
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* renamed from: com.squareup.moshi.t$j */
    class j extends AbstractC8683f<Long> {
        j() {
        }

        @Override // com.squareup.moshi.AbstractC8683f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long fromJson(AbstractC8686i abstractC8686i) throws IOException {
            return Long.valueOf(abstractC8686i.mo27721p());
        }

        @Override // com.squareup.moshi.AbstractC8683f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(AbstractC8692o abstractC8692o, Long l) throws IOException {
            abstractC8692o.mo27752J(l.longValue());
        }

        public String toString() {
            return "JsonAdapter(Long)";
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* renamed from: com.squareup.moshi.t$k */
    class k extends AbstractC8683f<Short> {
        k() {
        }

        @Override // com.squareup.moshi.AbstractC8683f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Short fromJson(AbstractC8686i abstractC8686i) throws IOException {
            return Short.valueOf((short) C8697t.m27820a(abstractC8686i, "a short", -32768, 32767));
        }

        @Override // com.squareup.moshi.AbstractC8683f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(AbstractC8692o abstractC8692o, Short sh) throws IOException {
            abstractC8692o.mo27752J(sh.intValue());
        }

        public String toString() {
            return "JsonAdapter(Short)";
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* renamed from: com.squareup.moshi.t$l */
    static final class l<T extends Enum<T>> extends AbstractC8683f<T> {

        /* renamed from: a */
        private final Class<T> f33213a;

        /* renamed from: b */
        private final String[] f33214b;

        /* renamed from: c */
        private final T[] f33215c;

        /* renamed from: d */
        private final AbstractC8686i.a f33216d;

        l(Class<T> cls) {
            this.f33213a = cls;
            try {
                T[] enumConstants = cls.getEnumConstants();
                this.f33215c = enumConstants;
                this.f33214b = new String[enumConstants.length];
                int i2 = 0;
                while (true) {
                    T[] tArr = this.f33215c;
                    if (i2 >= tArr.length) {
                        this.f33216d = AbstractC8686i.a.m27724a(this.f33214b);
                        return;
                    } else {
                        String name = tArr[i2].name();
                        this.f33214b[i2] = C8702c.m27867m(name, cls.getField(name));
                        i2++;
                    }
                }
            } catch (NoSuchFieldException e2) {
                AssertionError assertionError = new AssertionError("Missing field in " + cls.getName());
                assertionError.initCause(e2);
                throw assertionError;
            }
        }

        @Override // com.squareup.moshi.AbstractC8683f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public T fromJson(AbstractC8686i abstractC8686i) throws IOException {
            int mo27703I = abstractC8686i.mo27703I(this.f33216d);
            if (mo27703I != -1) {
                return this.f33215c[mo27703I];
            }
            String m27716g = abstractC8686i.m27716g();
            throw new JsonDataException("Expected one of " + Arrays.asList(this.f33214b) + " but was " + abstractC8686i.mo27723y() + " at path " + m27716g);
        }

        @Override // com.squareup.moshi.AbstractC8683f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(AbstractC8692o abstractC8692o, T t) throws IOException {
            abstractC8692o.mo27754N(this.f33214b[t.ordinal()]);
        }

        public String toString() {
            return "JsonAdapter(" + this.f33213a.getName() + ")";
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* renamed from: com.squareup.moshi.t$m */
    static final class m extends AbstractC8683f<Object> {

        /* renamed from: a */
        private final C8695r f33217a;

        /* renamed from: b */
        private final AbstractC8683f<List> f33218b;

        /* renamed from: c */
        private final AbstractC8683f<Map> f33219c;

        /* renamed from: d */
        private final AbstractC8683f<String> f33220d;

        /* renamed from: e */
        private final AbstractC8683f<Double> f33221e;

        /* renamed from: f */
        private final AbstractC8683f<Boolean> f33222f;

        m(C8695r c8695r) {
            this.f33217a = c8695r;
            this.f33218b = c8695r.m27810c(List.class);
            this.f33219c = c8695r.m27810c(Map.class);
            this.f33220d = c8695r.m27810c(String.class);
            this.f33221e = c8695r.m27810c(Double.class);
            this.f33222f = c8695r.m27810c(Boolean.class);
        }

        /* renamed from: a */
        private Class<?> m27841a(Class<?> cls) {
            return Map.class.isAssignableFrom(cls) ? Map.class : Collection.class.isAssignableFrom(cls) ? Collection.class : cls;
        }

        @Override // com.squareup.moshi.AbstractC8683f
        public Object fromJson(AbstractC8686i abstractC8686i) throws IOException {
            switch (b.f33212a[abstractC8686i.mo27699A().ordinal()]) {
                case 1:
                    return this.f33218b.fromJson(abstractC8686i);
                case 2:
                    return this.f33219c.fromJson(abstractC8686i);
                case 3:
                    return this.f33220d.fromJson(abstractC8686i);
                case 4:
                    return this.f33221e.fromJson(abstractC8686i);
                case 5:
                    return this.f33222f.fromJson(abstractC8686i);
                case 6:
                    return abstractC8686i.mo27722x();
                default:
                    throw new IllegalStateException("Expected a value but was " + abstractC8686i.mo27699A() + " at path " + abstractC8686i.m27716g());
            }
        }

        @Override // com.squareup.moshi.AbstractC8683f
        public void toJson(AbstractC8692o abstractC8692o, Object obj) throws IOException {
            Class<?> cls = obj.getClass();
            if (cls != Object.class) {
                this.f33217a.m27812e(m27841a(cls), C8702c.f33225a).toJson(abstractC8692o, (AbstractC8692o) obj);
            } else {
                abstractC8692o.mo27757b();
                abstractC8692o.mo27759e();
            }
        }

        public String toString() {
            return "JsonAdapter(Object)";
        }
    }

    /* renamed from: a */
    static int m27820a(AbstractC8686i abstractC8686i, String str, int i2, int i3) throws IOException {
        int mo27720m = abstractC8686i.mo27720m();
        if (mo27720m < i2 || mo27720m > i3) {
            throw new JsonDataException(String.format("Expected %s but was %s at path %s", str, Integer.valueOf(mo27720m), abstractC8686i.m27716g()));
        }
        return mo27720m;
    }
}
