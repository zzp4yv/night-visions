package com.google.firebase.encoders.json;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.C8293b;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.InterfaceC8294c;
import com.google.firebase.encoders.InterfaceC8295d;
import com.google.firebase.encoders.InterfaceC8296e;
import com.google.firebase.encoders.InterfaceC8297f;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* compiled from: JsonValueObjectEncoderContext.java */
/* renamed from: com.google.firebase.encoders.h.e */
/* loaded from: classes2.dex */
final class C8304e implements InterfaceC8295d, InterfaceC8297f {

    /* renamed from: a */
    private C8304e f31660a = null;

    /* renamed from: b */
    private boolean f31661b = true;

    /* renamed from: c */
    private final JsonWriter f31662c;

    /* renamed from: d */
    private final Map<Class<?>, InterfaceC8294c<?>> f31663d;

    /* renamed from: e */
    private final Map<Class<?>, InterfaceC8296e<?>> f31664e;

    /* renamed from: f */
    private final InterfaceC8294c<Object> f31665f;

    /* renamed from: g */
    private final boolean f31666g;

    C8304e(Writer writer, Map<Class<?>, InterfaceC8294c<?>> map, Map<Class<?>, InterfaceC8296e<?>> map2, InterfaceC8294c<Object> interfaceC8294c, boolean z) {
        this.f31662c = new JsonWriter(writer);
        this.f31663d = map;
        this.f31664e = map2;
        this.f31665f = interfaceC8294c;
        this.f31666g = z;
    }

    /* renamed from: A */
    private void m26106A() throws IOException {
        if (!this.f31661b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        C8304e c8304e = this.f31660a;
        if (c8304e != null) {
            c8304e.m26106A();
            this.f31660a.f31661b = false;
            this.f31660a = null;
            this.f31662c.endObject();
        }
    }

    /* renamed from: v */
    private boolean m26107v(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    /* renamed from: y */
    private C8304e m26108y(String str, Object obj) throws IOException, EncodingException {
        m26106A();
        this.f31662c.name(str);
        if (obj != null) {
            return m26113m(obj, false);
        }
        this.f31662c.nullValue();
        return this;
    }

    /* renamed from: z */
    private C8304e m26109z(String str, Object obj) throws IOException, EncodingException {
        if (obj == null) {
            return this;
        }
        m26106A();
        this.f31662c.name(str);
        return m26113m(obj, false);
    }

    @Override // com.google.firebase.encoders.InterfaceC8295d
    /* renamed from: a */
    public InterfaceC8295d mo26082a(C8293b c8293b, boolean z) throws IOException {
        return m26119s(c8293b.m26078b(), z);
    }

    @Override // com.google.firebase.encoders.InterfaceC8295d
    /* renamed from: b */
    public InterfaceC8295d mo26083b(C8293b c8293b, long j2) throws IOException {
        return m26117q(c8293b.m26078b(), j2);
    }

    @Override // com.google.firebase.encoders.InterfaceC8295d
    /* renamed from: c */
    public InterfaceC8295d mo26084c(C8293b c8293b, int i2) throws IOException {
        return mo26086e(c8293b.m26078b(), i2);
    }

    @Override // com.google.firebase.encoders.InterfaceC8295d
    /* renamed from: d */
    public InterfaceC8295d mo26085d(C8293b c8293b, double d2) throws IOException {
        return m26115o(c8293b.m26078b(), d2);
    }

    @Override // com.google.firebase.encoders.InterfaceC8295d
    /* renamed from: i */
    public InterfaceC8295d mo26088i(C8293b c8293b, Object obj) throws IOException {
        return mo26087h(c8293b.m26078b(), obj);
    }

    /* renamed from: j */
    public C8304e m26110j(double d2) throws IOException {
        m26106A();
        this.f31662c.value(d2);
        return this;
    }

    /* renamed from: k */
    public C8304e m26111k(int i2) throws IOException {
        m26106A();
        this.f31662c.value(i2);
        return this;
    }

    /* renamed from: l */
    public C8304e m26112l(long j2) throws IOException {
        m26106A();
        this.f31662c.value(j2);
        return this;
    }

    /* renamed from: m */
    C8304e m26113m(Object obj, boolean z) throws IOException {
        int i2 = 0;
        if (z && m26107v(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new EncodingException(String.format("%s cannot be encoded inline", objArr));
        }
        if (obj == null) {
            this.f31662c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f31662c.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f31662c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    m26113m(it.next(), false);
                }
                this.f31662c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f31662c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        mo26087h((String) key, entry.getValue());
                    } catch (ClassCastException e2) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e2);
                    }
                }
                this.f31662c.endObject();
                return this;
            }
            InterfaceC8294c<?> interfaceC8294c = this.f31663d.get(obj.getClass());
            if (interfaceC8294c != null) {
                return m26123x(interfaceC8294c, obj, z);
            }
            InterfaceC8296e<?> interfaceC8296e = this.f31664e.get(obj.getClass());
            if (interfaceC8296e != null) {
                interfaceC8296e.mo26089a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return m26123x(this.f31665f, obj, z);
            }
            if (obj instanceof NumberedEnum) {
                m26111k(((NumberedEnum) obj).getF32350k());
            } else {
                mo26090f(((Enum) obj).name());
            }
            return this;
        }
        if (obj instanceof byte[]) {
            return m26121u((byte[]) obj);
        }
        this.f31662c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i2 < length) {
                this.f31662c.value(r6[i2]);
                i2++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i2 < length2) {
                m26112l(jArr[i2]);
                i2++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i2 < length3) {
                this.f31662c.value(dArr[i2]);
                i2++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i2 < length4) {
                this.f31662c.value(zArr[i2]);
                i2++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                m26113m(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                m26113m(obj2, false);
            }
        }
        this.f31662c.endArray();
        return this;
    }

    @Override // com.google.firebase.encoders.InterfaceC8297f
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C8304e mo26090f(String str) throws IOException {
        m26106A();
        this.f31662c.value(str);
        return this;
    }

    /* renamed from: o */
    public C8304e m26115o(String str, double d2) throws IOException {
        m26106A();
        this.f31662c.name(str);
        return m26110j(d2);
    }

    @Override // com.google.firebase.encoders.InterfaceC8295d
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public C8304e mo26086e(String str, int i2) throws IOException {
        m26106A();
        this.f31662c.name(str);
        return m26111k(i2);
    }

    /* renamed from: q */
    public C8304e m26117q(String str, long j2) throws IOException {
        m26106A();
        this.f31662c.name(str);
        return m26112l(j2);
    }

    @Override // com.google.firebase.encoders.InterfaceC8295d
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public C8304e mo26087h(String str, Object obj) throws IOException {
        return this.f31666g ? m26109z(str, obj) : m26108y(str, obj);
    }

    /* renamed from: s */
    public C8304e m26119s(String str, boolean z) throws IOException {
        m26106A();
        this.f31662c.name(str);
        return mo26091g(z);
    }

    @Override // com.google.firebase.encoders.InterfaceC8297f
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public C8304e mo26091g(boolean z) throws IOException {
        m26106A();
        this.f31662c.value(z);
        return this;
    }

    /* renamed from: u */
    public C8304e m26121u(byte[] bArr) throws IOException {
        m26106A();
        if (bArr == null) {
            this.f31662c.nullValue();
        } else {
            this.f31662c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* renamed from: w */
    void m26122w() throws IOException {
        m26106A();
        this.f31662c.flush();
    }

    /* renamed from: x */
    C8304e m26123x(InterfaceC8294c<Object> interfaceC8294c, Object obj, boolean z) throws IOException {
        if (!z) {
            this.f31662c.beginObject();
        }
        interfaceC8294c.mo13444a(obj, this);
        if (!z) {
            this.f31662c.endObject();
        }
        return this;
    }
}
