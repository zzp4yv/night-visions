package com.google.gson.p215t.p216n;

import com.google.gson.AbstractC8538j;
import com.google.gson.AbstractC8545q;
import com.google.gson.C8533e;
import com.google.gson.C8535g;
import com.google.gson.C8539k;
import com.google.gson.C8540l;
import com.google.gson.C8541m;
import com.google.gson.InterfaceC8546r;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.p214s.InterfaceC8549c;
import com.google.gson.p215t.C8561g;
import com.google.gson.p219u.C8586a;
import com.google.gson.stream.C8552a;
import com.google.gson.stream.C8554c;
import com.google.gson.stream.EnumC8553b;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* compiled from: TypeAdapters.java */
/* renamed from: com.google.gson.t.n.n */
/* loaded from: classes2.dex */
public final class C8581n {

    /* renamed from: A */
    public static final AbstractC8545q<String> f32638A;

    /* renamed from: B */
    public static final AbstractC8545q<BigDecimal> f32639B;

    /* renamed from: C */
    public static final AbstractC8545q<BigInteger> f32640C;

    /* renamed from: D */
    public static final InterfaceC8546r f32641D;

    /* renamed from: E */
    public static final AbstractC8545q<StringBuilder> f32642E;

    /* renamed from: F */
    public static final InterfaceC8546r f32643F;

    /* renamed from: G */
    public static final AbstractC8545q<StringBuffer> f32644G;

    /* renamed from: H */
    public static final InterfaceC8546r f32645H;

    /* renamed from: I */
    public static final AbstractC8545q<URL> f32646I;

    /* renamed from: J */
    public static final InterfaceC8546r f32647J;

    /* renamed from: K */
    public static final AbstractC8545q<URI> f32648K;

    /* renamed from: L */
    public static final InterfaceC8546r f32649L;

    /* renamed from: M */
    public static final AbstractC8545q<InetAddress> f32650M;

    /* renamed from: N */
    public static final InterfaceC8546r f32651N;

    /* renamed from: O */
    public static final AbstractC8545q<UUID> f32652O;

    /* renamed from: P */
    public static final InterfaceC8546r f32653P;

    /* renamed from: Q */
    public static final AbstractC8545q<Currency> f32654Q;

    /* renamed from: R */
    public static final InterfaceC8546r f32655R;

    /* renamed from: S */
    public static final InterfaceC8546r f32656S;

    /* renamed from: T */
    public static final AbstractC8545q<Calendar> f32657T;

    /* renamed from: U */
    public static final InterfaceC8546r f32658U;

    /* renamed from: V */
    public static final AbstractC8545q<Locale> f32659V;

    /* renamed from: W */
    public static final InterfaceC8546r f32660W;

    /* renamed from: X */
    public static final AbstractC8545q<AbstractC8538j> f32661X;

    /* renamed from: Y */
    public static final InterfaceC8546r f32662Y;

    /* renamed from: Z */
    public static final InterfaceC8546r f32663Z;

    /* renamed from: a */
    public static final AbstractC8545q<Class> f32664a;

    /* renamed from: b */
    public static final InterfaceC8546r f32665b;

    /* renamed from: c */
    public static final AbstractC8545q<BitSet> f32666c;

    /* renamed from: d */
    public static final InterfaceC8546r f32667d;

    /* renamed from: e */
    public static final AbstractC8545q<Boolean> f32668e;

    /* renamed from: f */
    public static final AbstractC8545q<Boolean> f32669f;

    /* renamed from: g */
    public static final InterfaceC8546r f32670g;

    /* renamed from: h */
    public static final AbstractC8545q<Number> f32671h;

    /* renamed from: i */
    public static final InterfaceC8546r f32672i;

    /* renamed from: j */
    public static final AbstractC8545q<Number> f32673j;

    /* renamed from: k */
    public static final InterfaceC8546r f32674k;

    /* renamed from: l */
    public static final AbstractC8545q<Number> f32675l;

    /* renamed from: m */
    public static final InterfaceC8546r f32676m;

    /* renamed from: n */
    public static final AbstractC8545q<AtomicInteger> f32677n;

    /* renamed from: o */
    public static final InterfaceC8546r f32678o;

    /* renamed from: p */
    public static final AbstractC8545q<AtomicBoolean> f32679p;

    /* renamed from: q */
    public static final InterfaceC8546r f32680q;

    /* renamed from: r */
    public static final AbstractC8545q<AtomicIntegerArray> f32681r;

    /* renamed from: s */
    public static final InterfaceC8546r f32682s;

    /* renamed from: t */
    public static final AbstractC8545q<Number> f32683t;

    /* renamed from: u */
    public static final AbstractC8545q<Number> f32684u;

    /* renamed from: v */
    public static final AbstractC8545q<Number> f32685v;

    /* renamed from: w */
    public static final AbstractC8545q<Number> f32686w;

    /* renamed from: x */
    public static final InterfaceC8546r f32687x;

    /* renamed from: y */
    public static final AbstractC8545q<Character> f32688y;

    /* renamed from: z */
    public static final InterfaceC8546r f32689z;

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$a */
    static class a extends AbstractC8545q<AtomicIntegerArray> {
        a() {
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicIntegerArray mo26938b(C8552a c8552a) throws IOException {
            ArrayList arrayList = new ArrayList();
            c8552a.mo27002a();
            while (c8552a.mo27009l()) {
                try {
                    arrayList.add(Integer.valueOf(c8552a.mo26996A()));
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }
            c8552a.mo27006f();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i2 = 0; i2 < size; i2++) {
                atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8554c c8554c, AtomicIntegerArray atomicIntegerArray) throws IOException {
            c8554c.mo27035c();
            int length = atomicIntegerArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                c8554c.mo27030Q(atomicIntegerArray.get(i2));
            }
            c8554c.mo27037f();
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$a0 */
    static class a0 implements InterfaceC8546r {

        /* renamed from: f */
        final /* synthetic */ Class f32690f;

        /* renamed from: g */
        final /* synthetic */ AbstractC8545q f32691g;

        /* JADX INFO: Add missing generic type declarations: [T1] */
        /* compiled from: TypeAdapters.java */
        /* renamed from: com.google.gson.t.n.n$a0$a */
        class a<T1> extends AbstractC8545q<T1> {

            /* renamed from: a */
            final /* synthetic */ Class f32692a;

            a(Class cls) {
                this.f32692a = cls;
            }

            @Override // com.google.gson.AbstractC8545q
            /* renamed from: b */
            public T1 mo26938b(C8552a c8552a) throws IOException {
                T1 t1 = (T1) a0.this.f32691g.mo26938b(c8552a);
                if (t1 == null || this.f32692a.isInstance(t1)) {
                    return t1;
                }
                throw new JsonSyntaxException("Expected a " + this.f32692a.getName() + " but was " + t1.getClass().getName());
            }

            @Override // com.google.gson.AbstractC8545q
            /* renamed from: d */
            public void mo26939d(C8554c c8554c, T1 t1) throws IOException {
                a0.this.f32691g.mo26939d(c8554c, t1);
            }
        }

        a0(Class cls, AbstractC8545q abstractC8545q) {
            this.f32690f = cls;
            this.f32691g = abstractC8545q;
        }

        @Override // com.google.gson.InterfaceC8546r
        /* renamed from: b */
        public <T2> AbstractC8545q<T2> mo26979b(C8533e c8533e, C8586a<T2> c8586a) {
            Class<? super T2> rawType = c8586a.getRawType();
            if (this.f32690f.isAssignableFrom(rawType)) {
                return new a(rawType);
            }
            return null;
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f32690f.getName() + ",adapter=" + this.f32691g + "]";
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$b */
    static class b extends AbstractC8545q<Number> {
        b() {
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number mo26938b(C8552a c8552a) throws IOException {
            if (c8552a.mo27001Q() == EnumC8553b.NULL) {
                c8552a.mo26999I();
                return null;
            }
            try {
                return Long.valueOf(c8552a.mo26997B());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8554c c8554c, Number number) throws IOException {
            c8554c.mo27032W(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$b0 */
    static /* synthetic */ class b0 {

        /* renamed from: a */
        static final /* synthetic */ int[] f32694a;

        static {
            int[] iArr = new int[EnumC8553b.values().length];
            f32694a = iArr;
            try {
                iArr[EnumC8553b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32694a[EnumC8553b.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32694a[EnumC8553b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32694a[EnumC8553b.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32694a[EnumC8553b.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32694a[EnumC8553b.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32694a[EnumC8553b.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f32694a[EnumC8553b.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f32694a[EnumC8553b.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f32694a[EnumC8553b.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$c */
    static class c extends AbstractC8545q<Number> {
        c() {
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number mo26938b(C8552a c8552a) throws IOException {
            if (c8552a.mo27001Q() != EnumC8553b.NULL) {
                return Float.valueOf((float) c8552a.mo27014z());
            }
            c8552a.mo26999I();
            return null;
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8554c c8554c, Number number) throws IOException {
            c8554c.mo27032W(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$c0 */
    static class c0 extends AbstractC8545q<Boolean> {
        c0() {
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean mo26938b(C8552a c8552a) throws IOException {
            EnumC8553b mo27001Q = c8552a.mo27001Q();
            if (mo27001Q != EnumC8553b.NULL) {
                return mo27001Q == EnumC8553b.STRING ? Boolean.valueOf(Boolean.parseBoolean(c8552a.mo27000K())) : Boolean.valueOf(c8552a.mo27013y());
            }
            c8552a.mo26999I();
            return null;
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8554c c8554c, Boolean bool) throws IOException {
            c8554c.mo27031T(bool);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$d */
    static class d extends AbstractC8545q<Number> {
        d() {
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number mo26938b(C8552a c8552a) throws IOException {
            if (c8552a.mo27001Q() != EnumC8553b.NULL) {
                return Double.valueOf(c8552a.mo27014z());
            }
            c8552a.mo26999I();
            return null;
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8554c c8554c, Number number) throws IOException {
            c8554c.mo27032W(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$d0 */
    static class d0 extends AbstractC8545q<Boolean> {
        d0() {
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean mo26938b(C8552a c8552a) throws IOException {
            if (c8552a.mo27001Q() != EnumC8553b.NULL) {
                return Boolean.valueOf(c8552a.mo27000K());
            }
            c8552a.mo26999I();
            return null;
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8554c c8554c, Boolean bool) throws IOException {
            c8554c.mo27033Y(bool == null ? "null" : bool.toString());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$e */
    static class e extends AbstractC8545q<Number> {
        e() {
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number mo26938b(C8552a c8552a) throws IOException {
            EnumC8553b mo27001Q = c8552a.mo27001Q();
            int i2 = b0.f32694a[mo27001Q.ordinal()];
            if (i2 == 1 || i2 == 3) {
                return new C8561g(c8552a.mo27000K());
            }
            if (i2 == 4) {
                c8552a.mo26999I();
                return null;
            }
            throw new JsonSyntaxException("Expecting number, got: " + mo27001Q);
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8554c c8554c, Number number) throws IOException {
            c8554c.mo27032W(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$e0 */
    static class e0 extends AbstractC8545q<Number> {
        e0() {
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number mo26938b(C8552a c8552a) throws IOException {
            if (c8552a.mo27001Q() == EnumC8553b.NULL) {
                c8552a.mo26999I();
                return null;
            }
            try {
                return Byte.valueOf((byte) c8552a.mo26996A());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8554c c8554c, Number number) throws IOException {
            c8554c.mo27032W(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$f */
    static class f extends AbstractC8545q<Character> {
        f() {
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Character mo26938b(C8552a c8552a) throws IOException {
            if (c8552a.mo27001Q() == EnumC8553b.NULL) {
                c8552a.mo26999I();
                return null;
            }
            String mo27000K = c8552a.mo27000K();
            if (mo27000K.length() == 1) {
                return Character.valueOf(mo27000K.charAt(0));
            }
            throw new JsonSyntaxException("Expecting character, got: " + mo27000K);
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8554c c8554c, Character ch) throws IOException {
            c8554c.mo27033Y(ch == null ? null : String.valueOf(ch));
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$f0 */
    static class f0 extends AbstractC8545q<Number> {
        f0() {
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number mo26938b(C8552a c8552a) throws IOException {
            if (c8552a.mo27001Q() == EnumC8553b.NULL) {
                c8552a.mo26999I();
                return null;
            }
            try {
                return Short.valueOf((short) c8552a.mo26996A());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8554c c8554c, Number number) throws IOException {
            c8554c.mo27032W(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$g */
    static class g extends AbstractC8545q<String> {
        g() {
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public String mo26938b(C8552a c8552a) throws IOException {
            EnumC8553b mo27001Q = c8552a.mo27001Q();
            if (mo27001Q != EnumC8553b.NULL) {
                return mo27001Q == EnumC8553b.BOOLEAN ? Boolean.toString(c8552a.mo27013y()) : c8552a.mo27000K();
            }
            c8552a.mo26999I();
            return null;
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8554c c8554c, String str) throws IOException {
            c8554c.mo27033Y(str);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$g0 */
    static class g0 extends AbstractC8545q<Number> {
        g0() {
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number mo26938b(C8552a c8552a) throws IOException {
            if (c8552a.mo27001Q() == EnumC8553b.NULL) {
                c8552a.mo26999I();
                return null;
            }
            try {
                return Integer.valueOf(c8552a.mo26996A());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8554c c8554c, Number number) throws IOException {
            c8554c.mo27032W(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$h */
    static class h extends AbstractC8545q<BigDecimal> {
        h() {
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigDecimal mo26938b(C8552a c8552a) throws IOException {
            if (c8552a.mo27001Q() == EnumC8553b.NULL) {
                c8552a.mo26999I();
                return null;
            }
            try {
                return new BigDecimal(c8552a.mo27000K());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8554c c8554c, BigDecimal bigDecimal) throws IOException {
            c8554c.mo27032W(bigDecimal);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$h0 */
    static class h0 extends AbstractC8545q<AtomicInteger> {
        h0() {
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicInteger mo26938b(C8552a c8552a) throws IOException {
            try {
                return new AtomicInteger(c8552a.mo26996A());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8554c c8554c, AtomicInteger atomicInteger) throws IOException {
            c8554c.mo27030Q(atomicInteger.get());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$i */
    static class i extends AbstractC8545q<BigInteger> {
        i() {
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigInteger mo26938b(C8552a c8552a) throws IOException {
            if (c8552a.mo27001Q() == EnumC8553b.NULL) {
                c8552a.mo26999I();
                return null;
            }
            try {
                return new BigInteger(c8552a.mo27000K());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8554c c8554c, BigInteger bigInteger) throws IOException {
            c8554c.mo27032W(bigInteger);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$i0 */
    static class i0 extends AbstractC8545q<AtomicBoolean> {
        i0() {
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicBoolean mo26938b(C8552a c8552a) throws IOException {
            return new AtomicBoolean(c8552a.mo27013y());
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8554c c8554c, AtomicBoolean atomicBoolean) throws IOException {
            c8554c.mo27034Z(atomicBoolean.get());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$j */
    static class j extends AbstractC8545q<StringBuilder> {
        j() {
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuilder mo26938b(C8552a c8552a) throws IOException {
            if (c8552a.mo27001Q() != EnumC8553b.NULL) {
                return new StringBuilder(c8552a.mo27000K());
            }
            c8552a.mo26999I();
            return null;
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8554c c8554c, StringBuilder sb) throws IOException {
            c8554c.mo27033Y(sb == null ? null : sb.toString());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$j0 */
    private static final class j0<T extends Enum<T>> extends AbstractC8545q<T> {

        /* renamed from: a */
        private final Map<String, T> f32695a = new HashMap();

        /* renamed from: b */
        private final Map<T, String> f32696b = new HashMap();

        public j0(Class<T> cls) {
            try {
                for (T t : cls.getEnumConstants()) {
                    String name = t.name();
                    InterfaceC8549c interfaceC8549c = (InterfaceC8549c) cls.getField(name).getAnnotation(InterfaceC8549c.class);
                    if (interfaceC8549c != null) {
                        name = interfaceC8549c.value();
                        for (String str : interfaceC8549c.alternate()) {
                            this.f32695a.put(str, t);
                        }
                    }
                    this.f32695a.put(name, t);
                    this.f32696b.put(t, name);
                }
            } catch (NoSuchFieldException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public T mo26938b(C8552a c8552a) throws IOException {
            if (c8552a.mo27001Q() != EnumC8553b.NULL) {
                return this.f32695a.get(c8552a.mo27000K());
            }
            c8552a.mo26999I();
            return null;
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8554c c8554c, T t) throws IOException {
            c8554c.mo27033Y(t == null ? null : this.f32696b.get(t));
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$k */
    static class k extends AbstractC8545q<Class> {
        k() {
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Class mo26938b(C8552a c8552a) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8554c c8554c, Class cls) throws IOException {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$l */
    static class l extends AbstractC8545q<StringBuffer> {
        l() {
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuffer mo26938b(C8552a c8552a) throws IOException {
            if (c8552a.mo27001Q() != EnumC8553b.NULL) {
                return new StringBuffer(c8552a.mo27000K());
            }
            c8552a.mo26999I();
            return null;
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8554c c8554c, StringBuffer stringBuffer) throws IOException {
            c8554c.mo27033Y(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$m */
    static class m extends AbstractC8545q<URL> {
        m() {
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public URL mo26938b(C8552a c8552a) throws IOException {
            if (c8552a.mo27001Q() == EnumC8553b.NULL) {
                c8552a.mo26999I();
                return null;
            }
            String mo27000K = c8552a.mo27000K();
            if ("null".equals(mo27000K)) {
                return null;
            }
            return new URL(mo27000K);
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8554c c8554c, URL url) throws IOException {
            c8554c.mo27033Y(url == null ? null : url.toExternalForm());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$n */
    static class n extends AbstractC8545q<URI> {
        n() {
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public URI mo26938b(C8552a c8552a) throws IOException {
            if (c8552a.mo27001Q() == EnumC8553b.NULL) {
                c8552a.mo26999I();
                return null;
            }
            try {
                String mo27000K = c8552a.mo27000K();
                if ("null".equals(mo27000K)) {
                    return null;
                }
                return new URI(mo27000K);
            } catch (URISyntaxException e2) {
                throw new JsonIOException(e2);
            }
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8554c c8554c, URI uri) throws IOException {
            c8554c.mo27033Y(uri == null ? null : uri.toASCIIString());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$o */
    static class o extends AbstractC8545q<InetAddress> {
        o() {
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public InetAddress mo26938b(C8552a c8552a) throws IOException {
            if (c8552a.mo27001Q() != EnumC8553b.NULL) {
                return InetAddress.getByName(c8552a.mo27000K());
            }
            c8552a.mo26999I();
            return null;
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8554c c8554c, InetAddress inetAddress) throws IOException {
            c8554c.mo27033Y(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$p */
    static class p extends AbstractC8545q<UUID> {
        p() {
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public UUID mo26938b(C8552a c8552a) throws IOException {
            if (c8552a.mo27001Q() != EnumC8553b.NULL) {
                return UUID.fromString(c8552a.mo27000K());
            }
            c8552a.mo26999I();
            return null;
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8554c c8554c, UUID uuid) throws IOException {
            c8554c.mo27033Y(uuid == null ? null : uuid.toString());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$q */
    static class q extends AbstractC8545q<Currency> {
        q() {
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Currency mo26938b(C8552a c8552a) throws IOException {
            return Currency.getInstance(c8552a.mo27000K());
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8554c c8554c, Currency currency) throws IOException {
            c8554c.mo27033Y(currency.getCurrencyCode());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$r */
    static class r implements InterfaceC8546r {

        /* compiled from: TypeAdapters.java */
        /* renamed from: com.google.gson.t.n.n$r$a */
        class a extends AbstractC8545q<Timestamp> {

            /* renamed from: a */
            final /* synthetic */ AbstractC8545q f32697a;

            a(AbstractC8545q abstractC8545q) {
                this.f32697a = abstractC8545q;
            }

            @Override // com.google.gson.AbstractC8545q
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Timestamp mo26938b(C8552a c8552a) throws IOException {
                Date date = (Date) this.f32697a.mo26938b(c8552a);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            @Override // com.google.gson.AbstractC8545q
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void mo26939d(C8554c c8554c, Timestamp timestamp) throws IOException {
                this.f32697a.mo26939d(c8554c, timestamp);
            }
        }

        r() {
        }

        @Override // com.google.gson.InterfaceC8546r
        /* renamed from: b */
        public <T> AbstractC8545q<T> mo26979b(C8533e c8533e, C8586a<T> c8586a) {
            if (c8586a.getRawType() != Timestamp.class) {
                return null;
            }
            return new a(c8533e.m26927k(Date.class));
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$s */
    static class s extends AbstractC8545q<Calendar> {
        s() {
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Calendar mo26938b(C8552a c8552a) throws IOException {
            if (c8552a.mo27001Q() == EnumC8553b.NULL) {
                c8552a.mo26999I();
                return null;
            }
            c8552a.mo27004b();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (c8552a.mo27001Q() != EnumC8553b.END_OBJECT) {
                String mo26998D = c8552a.mo26998D();
                int mo26996A = c8552a.mo26996A();
                if ("year".equals(mo26998D)) {
                    i2 = mo26996A;
                } else if ("month".equals(mo26998D)) {
                    i3 = mo26996A;
                } else if ("dayOfMonth".equals(mo26998D)) {
                    i4 = mo26996A;
                } else if ("hourOfDay".equals(mo26998D)) {
                    i5 = mo26996A;
                } else if ("minute".equals(mo26998D)) {
                    i6 = mo26996A;
                } else if ("second".equals(mo26998D)) {
                    i7 = mo26996A;
                }
            }
            c8552a.mo27008j();
            return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8554c c8554c, Calendar calendar) throws IOException {
            if (calendar == null) {
                c8554c.mo27043y();
                return;
            }
            c8554c.mo27036d();
            c8554c.mo27042p("year");
            c8554c.mo27030Q(calendar.get(1));
            c8554c.mo27042p("month");
            c8554c.mo27030Q(calendar.get(2));
            c8554c.mo27042p("dayOfMonth");
            c8554c.mo27030Q(calendar.get(5));
            c8554c.mo27042p("hourOfDay");
            c8554c.mo27030Q(calendar.get(11));
            c8554c.mo27042p("minute");
            c8554c.mo27030Q(calendar.get(12));
            c8554c.mo27042p("second");
            c8554c.mo27030Q(calendar.get(13));
            c8554c.mo27038j();
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$t */
    static class t extends AbstractC8545q<Locale> {
        t() {
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Locale mo26938b(C8552a c8552a) throws IOException {
            if (c8552a.mo27001Q() == EnumC8553b.NULL) {
                c8552a.mo26999I();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(c8552a.mo27000K(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            return (nextToken2 == null && nextToken3 == null) ? new Locale(nextToken) : nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8554c c8554c, Locale locale) throws IOException {
            c8554c.mo27033Y(locale == null ? null : locale.toString());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$u */
    static class u extends AbstractC8545q<AbstractC8538j> {
        u() {
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AbstractC8538j mo26938b(C8552a c8552a) throws IOException {
            switch (b0.f32694a[c8552a.mo27001Q().ordinal()]) {
                case 1:
                    return new C8541m(new C8561g(c8552a.mo27000K()));
                case 2:
                    return new C8541m(Boolean.valueOf(c8552a.mo27013y()));
                case 3:
                    return new C8541m(c8552a.mo27000K());
                case 4:
                    c8552a.mo26999I();
                    return C8539k.f32449a;
                case 5:
                    C8535g c8535g = new C8535g();
                    c8552a.mo27002a();
                    while (c8552a.mo27009l()) {
                        c8535g.m26952q(mo26938b(c8552a));
                    }
                    c8552a.mo27006f();
                    return c8535g;
                case 6:
                    C8540l c8540l = new C8540l();
                    c8552a.mo27004b();
                    while (c8552a.mo27009l()) {
                        c8540l.m26961q(c8552a.mo26998D(), mo26938b(c8552a));
                    }
                    c8552a.mo27008j();
                    return c8540l;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8554c c8554c, AbstractC8538j abstractC8538j) throws IOException {
            if (abstractC8538j == null || abstractC8538j.m26958i()) {
                c8554c.mo27043y();
                return;
            }
            if (abstractC8538j.m26960o()) {
                C8541m m26956g = abstractC8538j.m26956g();
                if (m26956g.m26975z()) {
                    c8554c.mo27032W(m26956g.m26972v());
                    return;
                } else if (m26956g.m26974x()) {
                    c8554c.mo27034Z(m26956g.m26967q());
                    return;
                } else {
                    c8554c.mo27033Y(m26956g.m26973w());
                    return;
                }
            }
            if (abstractC8538j.m26957h()) {
                c8554c.mo27035c();
                Iterator<AbstractC8538j> it = abstractC8538j.m26954c().iterator();
                while (it.hasNext()) {
                    mo26939d(c8554c, it.next());
                }
                c8554c.mo27037f();
                return;
            }
            if (!abstractC8538j.m26959n()) {
                throw new IllegalArgumentException("Couldn't write " + abstractC8538j.getClass());
            }
            c8554c.mo27036d();
            for (Map.Entry<String, AbstractC8538j> entry : abstractC8538j.m26955f().m26962r()) {
                c8554c.mo27042p(entry.getKey());
                mo26939d(c8554c, entry.getValue());
            }
            c8554c.mo27038j();
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$v */
    static class v extends AbstractC8545q<BitSet> {
        v() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        
            if (java.lang.Integer.parseInt(r1) != 0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
        
            r5 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
        
            if (r8.mo26996A() != 0) goto L23;
         */
        @Override // com.google.gson.AbstractC8545q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.util.BitSet mo26938b(com.google.gson.stream.C8552a r8) throws java.io.IOException {
            /*
                r7 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r8.mo27002a()
                com.google.gson.stream.b r1 = r8.mo27001Q()
                r2 = 0
                r3 = 0
            Le:
                com.google.gson.stream.b r4 = com.google.gson.stream.EnumC8553b.END_ARRAY
                if (r1 == r4) goto L75
                int[] r4 = com.google.gson.p215t.p216n.C8581n.b0.f32694a
                int r5 = r1.ordinal()
                r4 = r4[r5]
                r5 = 1
                if (r4 == r5) goto L63
                r6 = 2
                if (r4 == r6) goto L5e
                r6 = 3
                if (r4 != r6) goto L47
                java.lang.String r1 = r8.mo27000K()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L30
                if (r1 == 0) goto L2e
                goto L69
            L2e:
                r5 = 0
                goto L69
            L30:
                com.google.gson.JsonSyntaxException r8 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L47:
                com.google.gson.JsonSyntaxException r8 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L5e:
                boolean r5 = r8.mo27013y()
                goto L69
            L63:
                int r1 = r8.mo26996A()
                if (r1 == 0) goto L2e
            L69:
                if (r5 == 0) goto L6e
                r0.set(r3)
            L6e:
                int r3 = r3 + 1
                com.google.gson.stream.b r1 = r8.mo27001Q()
                goto Le
            L75:
                r8.mo27006f()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.p215t.p216n.C8581n.v.mo26938b(com.google.gson.stream.a):java.util.BitSet");
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8554c c8554c, BitSet bitSet) throws IOException {
            c8554c.mo27035c();
            int length = bitSet.length();
            for (int i2 = 0; i2 < length; i2++) {
                c8554c.mo27030Q(bitSet.get(i2) ? 1L : 0L);
            }
            c8554c.mo27037f();
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$w */
    static class w implements InterfaceC8546r {
        w() {
        }

        @Override // com.google.gson.InterfaceC8546r
        /* renamed from: b */
        public <T> AbstractC8545q<T> mo26979b(C8533e c8533e, C8586a<T> c8586a) {
            Class<? super T> rawType = c8586a.getRawType();
            if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                return null;
            }
            if (!rawType.isEnum()) {
                rawType = rawType.getSuperclass();
            }
            return new j0(rawType);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$x */
    static class x implements InterfaceC8546r {

        /* renamed from: f */
        final /* synthetic */ Class f32699f;

        /* renamed from: g */
        final /* synthetic */ AbstractC8545q f32700g;

        x(Class cls, AbstractC8545q abstractC8545q) {
            this.f32699f = cls;
            this.f32700g = abstractC8545q;
        }

        @Override // com.google.gson.InterfaceC8546r
        /* renamed from: b */
        public <T> AbstractC8545q<T> mo26979b(C8533e c8533e, C8586a<T> c8586a) {
            if (c8586a.getRawType() == this.f32699f) {
                return this.f32700g;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f32699f.getName() + ",adapter=" + this.f32700g + "]";
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$y */
    static class y implements InterfaceC8546r {

        /* renamed from: f */
        final /* synthetic */ Class f32701f;

        /* renamed from: g */
        final /* synthetic */ Class f32702g;

        /* renamed from: h */
        final /* synthetic */ AbstractC8545q f32703h;

        y(Class cls, Class cls2, AbstractC8545q abstractC8545q) {
            this.f32701f = cls;
            this.f32702g = cls2;
            this.f32703h = abstractC8545q;
        }

        @Override // com.google.gson.InterfaceC8546r
        /* renamed from: b */
        public <T> AbstractC8545q<T> mo26979b(C8533e c8533e, C8586a<T> c8586a) {
            Class<? super T> rawType = c8586a.getRawType();
            if (rawType == this.f32701f || rawType == this.f32702g) {
                return this.f32703h;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f32702g.getName() + "+" + this.f32701f.getName() + ",adapter=" + this.f32703h + "]";
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$z */
    static class z implements InterfaceC8546r {

        /* renamed from: f */
        final /* synthetic */ Class f32704f;

        /* renamed from: g */
        final /* synthetic */ Class f32705g;

        /* renamed from: h */
        final /* synthetic */ AbstractC8545q f32706h;

        z(Class cls, Class cls2, AbstractC8545q abstractC8545q) {
            this.f32704f = cls;
            this.f32705g = cls2;
            this.f32706h = abstractC8545q;
        }

        @Override // com.google.gson.InterfaceC8546r
        /* renamed from: b */
        public <T> AbstractC8545q<T> mo26979b(C8533e c8533e, C8586a<T> c8586a) {
            Class<? super T> rawType = c8586a.getRawType();
            if (rawType == this.f32704f || rawType == this.f32705g) {
                return this.f32706h;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f32704f.getName() + "+" + this.f32705g.getName() + ",adapter=" + this.f32706h + "]";
        }
    }

    static {
        AbstractC8545q<Class> m26977a = new k().m26977a();
        f32664a = m26977a;
        f32665b = m27149a(Class.class, m26977a);
        AbstractC8545q<BitSet> m26977a2 = new v().m26977a();
        f32666c = m26977a2;
        f32667d = m27149a(BitSet.class, m26977a2);
        c0 c0Var = new c0();
        f32668e = c0Var;
        f32669f = new d0();
        f32670g = m27150b(Boolean.TYPE, Boolean.class, c0Var);
        e0 e0Var = new e0();
        f32671h = e0Var;
        f32672i = m27150b(Byte.TYPE, Byte.class, e0Var);
        f0 f0Var = new f0();
        f32673j = f0Var;
        f32674k = m27150b(Short.TYPE, Short.class, f0Var);
        g0 g0Var = new g0();
        f32675l = g0Var;
        f32676m = m27150b(Integer.TYPE, Integer.class, g0Var);
        AbstractC8545q<AtomicInteger> m26977a3 = new h0().m26977a();
        f32677n = m26977a3;
        f32678o = m27149a(AtomicInteger.class, m26977a3);
        AbstractC8545q<AtomicBoolean> m26977a4 = new i0().m26977a();
        f32679p = m26977a4;
        f32680q = m27149a(AtomicBoolean.class, m26977a4);
        AbstractC8545q<AtomicIntegerArray> m26977a5 = new a().m26977a();
        f32681r = m26977a5;
        f32682s = m27149a(AtomicIntegerArray.class, m26977a5);
        f32683t = new b();
        f32684u = new c();
        f32685v = new d();
        e eVar = new e();
        f32686w = eVar;
        f32687x = m27149a(Number.class, eVar);
        f fVar = new f();
        f32688y = fVar;
        f32689z = m27150b(Character.TYPE, Character.class, fVar);
        g gVar = new g();
        f32638A = gVar;
        f32639B = new h();
        f32640C = new i();
        f32641D = m27149a(String.class, gVar);
        j jVar = new j();
        f32642E = jVar;
        f32643F = m27149a(StringBuilder.class, jVar);
        l lVar = new l();
        f32644G = lVar;
        f32645H = m27149a(StringBuffer.class, lVar);
        m mVar = new m();
        f32646I = mVar;
        f32647J = m27149a(URL.class, mVar);
        n nVar = new n();
        f32648K = nVar;
        f32649L = m27149a(URI.class, nVar);
        o oVar = new o();
        f32650M = oVar;
        f32651N = m27152d(InetAddress.class, oVar);
        p pVar = new p();
        f32652O = pVar;
        f32653P = m27149a(UUID.class, pVar);
        AbstractC8545q<Currency> m26977a6 = new q().m26977a();
        f32654Q = m26977a6;
        f32655R = m27149a(Currency.class, m26977a6);
        f32656S = new r();
        s sVar = new s();
        f32657T = sVar;
        f32658U = m27151c(Calendar.class, GregorianCalendar.class, sVar);
        t tVar = new t();
        f32659V = tVar;
        f32660W = m27149a(Locale.class, tVar);
        u uVar = new u();
        f32661X = uVar;
        f32662Y = m27152d(AbstractC8538j.class, uVar);
        f32663Z = new w();
    }

    /* renamed from: a */
    public static <TT> InterfaceC8546r m27149a(Class<TT> cls, AbstractC8545q<TT> abstractC8545q) {
        return new x(cls, abstractC8545q);
    }

    /* renamed from: b */
    public static <TT> InterfaceC8546r m27150b(Class<TT> cls, Class<TT> cls2, AbstractC8545q<? super TT> abstractC8545q) {
        return new y(cls, cls2, abstractC8545q);
    }

    /* renamed from: c */
    public static <TT> InterfaceC8546r m27151c(Class<TT> cls, Class<? extends TT> cls2, AbstractC8545q<? super TT> abstractC8545q) {
        return new z(cls, cls2, abstractC8545q);
    }

    /* renamed from: d */
    public static <T1> InterfaceC8546r m27152d(Class<T1> cls, AbstractC8545q<T1> abstractC8545q) {
        return new a0(cls, abstractC8545q);
    }
}
