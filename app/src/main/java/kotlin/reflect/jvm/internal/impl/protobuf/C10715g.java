package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.C10715g.b;
import kotlin.reflect.jvm.internal.impl.protobuf.C10717i;
import kotlin.reflect.jvm.internal.impl.protobuf.C10718j;
import kotlin.reflect.jvm.internal.impl.protobuf.C10731w;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o;

/* compiled from: FieldSet.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.g */
/* loaded from: classes3.dex */
final class C10715g<FieldDescriptorType extends b<FieldDescriptorType>> {

    /* renamed from: a */
    private static final C10715g f41288a = new C10715g(true);

    /* renamed from: c */
    private boolean f41290c;

    /* renamed from: d */
    private boolean f41291d = false;

    /* renamed from: b */
    private final C10728t<FieldDescriptorType, Object> f41289b = C10728t.m38462o(16);

    /* compiled from: FieldSet.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.g$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f41292a;

        /* renamed from: b */
        static final /* synthetic */ int[] f41293b;

        static {
            int[] iArr = new int[C10731w.b.values().length];
            f41293b = iArr;
            try {
                iArr[C10731w.b.f41376f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41293b[C10731w.b.f41377g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41293b[C10731w.b.f41378h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41293b[C10731w.b.f41379i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41293b[C10731w.b.f41380j.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41293b[C10731w.b.f41381k.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f41293b[C10731w.b.f41382l.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f41293b[C10731w.b.f41383m.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f41293b[C10731w.b.f41384n.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f41293b[C10731w.b.f41387q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f41293b[C10731w.b.f41388r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f41293b[C10731w.b.f41390t.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f41293b[C10731w.b.f41391u.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f41293b[C10731w.b.f41392v.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f41293b[C10731w.b.f41393w.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f41293b[C10731w.b.f41385o.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f41293b[C10731w.b.f41386p.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f41293b[C10731w.b.f41389s.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[C10731w.c.values().length];
            f41292a = iArr2;
            try {
                iArr2[C10731w.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f41292a[C10731w.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f41292a[C10731w.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f41292a[C10731w.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f41292a[C10731w.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f41292a[C10731w.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f41292a[C10731w.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f41292a[C10731w.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f41292a[C10731w.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* compiled from: FieldSet.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.g$b */
    public interface b<T extends b<T>> extends Comparable<T> {
        /* renamed from: f */
        int mo38377f();

        /* renamed from: h */
        boolean mo38378h();

        /* renamed from: j */
        C10731w.b mo38379j();

        /* renamed from: l */
        C10731w.c mo38380l();

        /* renamed from: m */
        boolean mo38381m();

        /* renamed from: n */
        InterfaceC10723o.a mo38382n(InterfaceC10723o.a aVar, InterfaceC10723o interfaceC10723o);
    }

    private C10715g() {
    }

    /* renamed from: c */
    private Object m38351c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: d */
    private static int m38352d(C10731w.b bVar, int i2, Object obj) {
        int m38168D = CodedOutputStream.m38168D(i2);
        if (bVar == C10731w.b.f41385o) {
            m38168D *= 2;
        }
        return m38168D + m38353e(bVar, obj);
    }

    /* renamed from: e */
    private static int m38353e(C10731w.b bVar, Object obj) {
        switch (a.f41293b[bVar.ordinal()]) {
            case 1:
                return CodedOutputStream.m38181g(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.m38187m(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.m38191q(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.m38170F(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.m38190p(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.m38185k(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.m38184j(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.m38176b(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.m38167C((String) obj);
            case 10:
                return obj instanceof AbstractC10712d ? CodedOutputStream.m38179e((AbstractC10712d) obj) : CodedOutputStream.m38177c((byte[]) obj);
            case 11:
                return CodedOutputStream.m38169E(((Integer) obj).intValue());
            case 12:
                return CodedOutputStream.m38198x(((Integer) obj).intValue());
            case 13:
                return CodedOutputStream.m38199y(((Long) obj).longValue());
            case 14:
                return CodedOutputStream.m38200z(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.m38166B(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.m38188n((InterfaceC10723o) obj);
            case 17:
                return obj instanceof C10718j ? CodedOutputStream.m38192r((C10718j) obj) : CodedOutputStream.m38194t((InterfaceC10723o) obj);
            case 18:
                return obj instanceof C10717i.a ? CodedOutputStream.m38183i(((C10717i.a) obj).mo34235f()) : CodedOutputStream.m38183i(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: f */
    public static int m38354f(b<?> bVar, Object obj) {
        C10731w.b mo38379j = bVar.mo38379j();
        int mo38377f = bVar.mo38377f();
        if (!bVar.mo38378h()) {
            return m38352d(mo38379j, mo38377f, obj);
        }
        int i2 = 0;
        if (bVar.mo38381m()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                i2 += m38353e(mo38379j, it.next());
            }
            return CodedOutputStream.m38168D(mo38377f) + i2 + CodedOutputStream.m38196v(i2);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            i2 += m38352d(mo38379j, mo38377f, it2.next());
        }
        return i2;
    }

    /* renamed from: g */
    public static <T extends b<T>> C10715g<T> m38355g() {
        return f41288a;
    }

    /* renamed from: l */
    static int m38356l(C10731w.b bVar, boolean z) {
        if (z) {
            return 2;
        }
        return bVar.m38498k();
    }

    /* renamed from: o */
    private boolean m38357o(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.mo38380l() == C10731w.c.MESSAGE) {
            if (key.mo38378h()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((InterfaceC10723o) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof InterfaceC10723o)) {
                    if (value instanceof C10718j) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((InterfaceC10723o) value).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: s */
    private void m38358s(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C10718j) {
            value = ((C10718j) value).m38417e();
        }
        if (key.mo38378h()) {
            Object m38367h = m38367h(key);
            if (m38367h == null) {
                m38367h = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) m38367h).add(m38351c(it.next()));
            }
            this.f41289b.m38469p(key, m38367h);
            return;
        }
        if (key.mo38380l() != C10731w.c.MESSAGE) {
            this.f41289b.m38469p(key, m38351c(value));
            return;
        }
        Object m38367h2 = m38367h(key);
        if (m38367h2 == null) {
            this.f41289b.m38469p(key, m38351c(value));
        } else {
            this.f41289b.m38469p(key, key.mo38382n(((InterfaceC10723o) m38367h2).mo34077d(), (InterfaceC10723o) value).mo34093c());
        }
    }

    /* renamed from: t */
    public static <T extends b<T>> C10715g<T> m38359t() {
        return new C10715g<>();
    }

    /* renamed from: u */
    public static Object m38360u(C10713e c10713e, C10731w.b bVar, boolean z) throws IOException {
        switch (a.f41293b[bVar.ordinal()]) {
            case 1:
                return Double.valueOf(c10713e.m38333m());
            case 2:
                return Float.valueOf(c10713e.m38337q());
            case 3:
                return Long.valueOf(c10713e.m38340t());
            case 4:
                return Long.valueOf(c10713e.m38322M());
            case 5:
                return Integer.valueOf(c10713e.m38339s());
            case 6:
                return Long.valueOf(c10713e.m38336p());
            case 7:
                return Integer.valueOf(c10713e.m38335o());
            case 8:
                return Boolean.valueOf(c10713e.m38331k());
            case 9:
                return z ? c10713e.m38319J() : c10713e.m38318I();
            case 10:
                return c10713e.m38332l();
            case 11:
                return Integer.valueOf(c10713e.m38321L());
            case 12:
                return Integer.valueOf(c10713e.m38314E());
            case 13:
                return Long.valueOf(c10713e.m38315F());
            case 14:
                return Integer.valueOf(c10713e.m38316G());
            case 15:
                return Long.valueOf(c10713e.m38317H());
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if ((r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.C10717i.a) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if ((r3 instanceof byte[]) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if ((r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.C10718j) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        r0 = false;
     */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m38361w(kotlin.reflect.jvm.internal.impl.protobuf.C10731w.b r2, java.lang.Object r3) {
        /*
            r3.getClass()
            int[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.C10715g.a.f41292a
            kotlin.reflect.jvm.internal.impl.protobuf.w$c r2 = r2.m38497g()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L42;
                case 2: goto L3f;
                case 3: goto L3c;
                case 4: goto L39;
                case 5: goto L36;
                case 6: goto L33;
                case 7: goto L27;
                case 8: goto L1e;
                case 9: goto L15;
                default: goto L14;
            }
        L14:
            goto L44
        L15:
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
            if (r2 != 0) goto L31
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.C10718j
            if (r2 == 0) goto L30
            goto L31
        L1e:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L31
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.C10717i.a
            if (r2 == 0) goto L30
            goto L31
        L27:
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10712d
            if (r2 != 0) goto L31
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L30
            goto L31
        L30:
            r0 = 0
        L31:
            r1 = r0
            goto L44
        L33:
            boolean r1 = r3 instanceof java.lang.String
            goto L44
        L36:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L44
        L39:
            boolean r1 = r3 instanceof java.lang.Double
            goto L44
        L3c:
            boolean r1 = r3 instanceof java.lang.Float
            goto L44
        L3f:
            boolean r1 = r3 instanceof java.lang.Long
            goto L44
        L42:
            boolean r1 = r3 instanceof java.lang.Integer
        L44:
            if (r1 == 0) goto L47
            return
        L47:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C10715g.m38361w(kotlin.reflect.jvm.internal.impl.protobuf.w$b, java.lang.Object):void");
    }

    /* renamed from: x */
    private static void m38362x(CodedOutputStream codedOutputStream, C10731w.b bVar, int i2, Object obj) throws IOException {
        if (bVar == C10731w.b.f41385o) {
            codedOutputStream.m38215Y(i2, (InterfaceC10723o) obj);
        } else {
            codedOutputStream.m38239w0(i2, m38356l(bVar, false));
            m38363y(codedOutputStream, bVar, obj);
        }
    }

    /* renamed from: y */
    private static void m38363y(CodedOutputStream codedOutputStream, C10731w.b bVar, Object obj) throws IOException {
        switch (a.f41293b[bVar.ordinal()]) {
            case 1:
                codedOutputStream.m38208R(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.m38214X(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.m38219c0(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.m38242z0(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.m38218b0(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.m38212V(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.m38211U(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.m38203M(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.m38238v0((String) obj);
                break;
            case 10:
                if (!(obj instanceof AbstractC10712d)) {
                    codedOutputStream.m38204N((byte[]) obj);
                    break;
                } else {
                    codedOutputStream.m38206P((AbstractC10712d) obj);
                    break;
                }
            case 11:
                codedOutputStream.m38241y0(((Integer) obj).intValue());
                break;
            case 12:
                codedOutputStream.m38233q0(((Integer) obj).intValue());
                break;
            case 13:
                codedOutputStream.m38234r0(((Long) obj).longValue());
                break;
            case 14:
                codedOutputStream.m38235s0(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.m38237u0(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.m38216Z((InterfaceC10723o) obj);
                break;
            case 17:
                codedOutputStream.m38221e0((InterfaceC10723o) obj);
                break;
            case 18:
                if (!(obj instanceof C10717i.a)) {
                    codedOutputStream.m38210T(((Integer) obj).intValue());
                    break;
                } else {
                    codedOutputStream.m38210T(((C10717i.a) obj).mo34235f());
                    break;
                }
        }
    }

    /* renamed from: z */
    public static void m38364z(b<?> bVar, Object obj, CodedOutputStream codedOutputStream) throws IOException {
        C10731w.b mo38379j = bVar.mo38379j();
        int mo38377f = bVar.mo38377f();
        if (!bVar.mo38378h()) {
            if (obj instanceof C10718j) {
                m38362x(codedOutputStream, mo38379j, mo38377f, ((C10718j) obj).m38417e());
                return;
            } else {
                m38362x(codedOutputStream, mo38379j, mo38377f, obj);
                return;
            }
        }
        List list = (List) obj;
        if (!bVar.mo38381m()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m38362x(codedOutputStream, mo38379j, mo38377f, it.next());
            }
            return;
        }
        codedOutputStream.m38239w0(mo38377f, 2);
        int i2 = 0;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            i2 += m38353e(mo38379j, it2.next());
        }
        codedOutputStream.m38231o0(i2);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            m38363y(codedOutputStream, mo38379j, it3.next());
        }
    }

    /* renamed from: a */
    public void m38365a(FieldDescriptorType fielddescriptortype, Object obj) {
        List list;
        if (!fielddescriptortype.mo38378h()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        m38361w(fielddescriptortype.mo38379j(), obj);
        Object m38367h = m38367h(fielddescriptortype);
        if (m38367h == null) {
            list = new ArrayList();
            this.f41289b.m38469p(fielddescriptortype, list);
        } else {
            list = (List) m38367h;
        }
        list.add(obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C10715g<FieldDescriptorType> clone() {
        C10715g<FieldDescriptorType> m38359t = m38359t();
        for (int i2 = 0; i2 < this.f41289b.m38465j(); i2++) {
            Map.Entry<FieldDescriptorType, Object> m38464i = this.f41289b.m38464i(i2);
            m38359t.m38376v(m38464i.getKey(), m38464i.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f41289b.m38466k()) {
            m38359t.m38376v(entry.getKey(), entry.getValue());
        }
        m38359t.f41291d = this.f41291d;
        return m38359t;
    }

    /* renamed from: h */
    public Object m38367h(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f41289b.get(fielddescriptortype);
        return obj instanceof C10718j ? ((C10718j) obj).m38417e() : obj;
    }

    /* renamed from: i */
    public Object m38368i(FieldDescriptorType fielddescriptortype, int i2) {
        if (!fielddescriptortype.mo38378h()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object m38367h = m38367h(fielddescriptortype);
        if (m38367h != null) {
            return ((List) m38367h).get(i2);
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: j */
    public int m38369j(FieldDescriptorType fielddescriptortype) {
        if (!fielddescriptortype.mo38378h()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object m38367h = m38367h(fielddescriptortype);
        if (m38367h == null) {
            return 0;
        }
        return ((List) m38367h).size();
    }

    /* renamed from: k */
    public int m38370k() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.f41289b.m38465j(); i3++) {
            Map.Entry<FieldDescriptorType, Object> m38464i = this.f41289b.m38464i(i3);
            i2 += m38354f(m38464i.getKey(), m38464i.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f41289b.m38466k()) {
            i2 += m38354f(entry.getKey(), entry.getValue());
        }
        return i2;
    }

    /* renamed from: m */
    public boolean m38371m(FieldDescriptorType fielddescriptortype) {
        if (fielddescriptortype.mo38378h()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f41289b.get(fielddescriptortype) != null;
    }

    /* renamed from: n */
    public boolean m38372n() {
        for (int i2 = 0; i2 < this.f41289b.m38465j(); i2++) {
            if (!m38357o(this.f41289b.m38464i(i2))) {
                return false;
            }
        }
        Iterator<Map.Entry<FieldDescriptorType, Object>> it = this.f41289b.m38466k().iterator();
        while (it.hasNext()) {
            if (!m38357o(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p */
    public Iterator<Map.Entry<FieldDescriptorType, Object>> m38373p() {
        return this.f41291d ? new C10718j.c(this.f41289b.entrySet().iterator()) : this.f41289b.entrySet().iterator();
    }

    /* renamed from: q */
    public void m38374q() {
        if (this.f41290c) {
            return;
        }
        this.f41289b.mo38468n();
        this.f41290c = true;
    }

    /* renamed from: r */
    public void m38375r(C10715g<FieldDescriptorType> c10715g) {
        for (int i2 = 0; i2 < c10715g.f41289b.m38465j(); i2++) {
            m38358s(c10715g.f41289b.m38464i(i2));
        }
        Iterator<Map.Entry<FieldDescriptorType, Object>> it = c10715g.f41289b.m38466k().iterator();
        while (it.hasNext()) {
            m38358s(it.next());
        }
    }

    /* renamed from: v */
    public void m38376v(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.mo38378h()) {
            m38361w(fielddescriptortype.mo38379j(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m38361w(fielddescriptortype.mo38379j(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof C10718j) {
            this.f41291d = true;
        }
        this.f41289b.m38469p(fielddescriptortype, obj);
    }

    private C10715g(boolean z) {
        m38374q();
    }
}
