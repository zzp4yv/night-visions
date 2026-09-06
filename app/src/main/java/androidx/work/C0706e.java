package androidx.work;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: Data.java */
/* renamed from: androidx.work.e */
/* loaded from: classes.dex */
public final class C0706e {

    /* renamed from: a */
    private static final String f4510a = AbstractC0807n.m5223f("Data");

    /* renamed from: b */
    public static final C0706e f4511b = new a().m4835a();

    /* renamed from: c */
    Map<String, Object> f4512c;

    /* compiled from: Data.java */
    /* renamed from: androidx.work.e$a */
    public static final class a {

        /* renamed from: a */
        private Map<String, Object> f4513a = new HashMap();

        /* renamed from: a */
        public C0706e m4835a() {
            C0706e c0706e = new C0706e((Map<String, ?>) this.f4513a);
            C0706e.m4830l(c0706e);
            return c0706e;
        }

        /* renamed from: b */
        public a m4836b(String str, Object obj) {
            if (obj == null) {
                this.f4513a.put(str, null);
            } else {
                Class<?> cls = obj.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    this.f4513a.put(str, obj);
                } else if (cls == boolean[].class) {
                    this.f4513a.put(str, C0706e.m4823a((boolean[]) obj));
                } else if (cls == byte[].class) {
                    this.f4513a.put(str, C0706e.m4824b((byte[]) obj));
                } else if (cls == int[].class) {
                    this.f4513a.put(str, C0706e.m4827e((int[]) obj));
                } else if (cls == long[].class) {
                    this.f4513a.put(str, C0706e.m4828f((long[]) obj));
                } else if (cls == float[].class) {
                    this.f4513a.put(str, C0706e.m4826d((float[]) obj));
                } else {
                    if (cls != double[].class) {
                        throw new IllegalArgumentException(String.format("Key %s has invalid type %s", str, cls));
                    }
                    this.f4513a.put(str, C0706e.m4825c((double[]) obj));
                }
            }
            return this;
        }

        /* renamed from: c */
        public a m4837c(C0706e c0706e) {
            m4838d(c0706e.f4512c);
            return this;
        }

        /* renamed from: d */
        public a m4838d(Map<String, Object> map) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                m4836b(entry.getKey(), entry.getValue());
            }
            return this;
        }

        /* renamed from: e */
        public a m4839e(String str, boolean z) {
            this.f4513a.put(str, Boolean.valueOf(z));
            return this;
        }

        /* renamed from: f */
        public a m4840f(String str, String str2) {
            this.f4513a.put(str, str2);
            return this;
        }
    }

    C0706e() {
    }

    /* renamed from: a */
    public static Boolean[] m4823a(boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i2 = 0; i2 < zArr.length; i2++) {
            boolArr[i2] = Boolean.valueOf(zArr[i2]);
        }
        return boolArr;
    }

    /* renamed from: b */
    public static Byte[] m4824b(byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr2[i2] = Byte.valueOf(bArr[i2]);
        }
        return bArr2;
    }

    /* renamed from: c */
    public static Double[] m4825c(double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i2 = 0; i2 < dArr.length; i2++) {
            dArr2[i2] = Double.valueOf(dArr[i2]);
        }
        return dArr2;
    }

    /* renamed from: d */
    public static Float[] m4826d(float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr2[i2] = Float.valueOf(fArr[i2]);
        }
        return fArr2;
    }

    /* renamed from: e */
    public static Integer[] m4827e(int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i2] = Integer.valueOf(iArr[i2]);
        }
        return numArr;
    }

    /* renamed from: f */
    public static Long[] m4828f(long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i2 = 0; i2 < jArr.length; i2++) {
            lArr[i2] = Long.valueOf(jArr[i2]);
        }
        return lArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x005d -> B:16:0x0062). Please report as a decompilation issue!!! */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.work.C0706e m4829g(byte[] r7) {
        /*
            java.lang.String r0 = "Error in Data#fromByteArray: "
            int r1 = r7.length
            r2 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r2) goto L80
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L3d java.lang.ClassNotFoundException -> L41 java.io.IOException -> L43
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L3d java.lang.ClassNotFoundException -> L41 java.io.IOException -> L43
            int r7 = r3.readInt()     // Catch: java.lang.ClassNotFoundException -> L39 java.io.IOException -> L3b java.lang.Throwable -> L68
        L1b:
            if (r7 <= 0) goto L2b
            java.lang.String r4 = r3.readUTF()     // Catch: java.lang.ClassNotFoundException -> L39 java.io.IOException -> L3b java.lang.Throwable -> L68
            java.lang.Object r5 = r3.readObject()     // Catch: java.lang.ClassNotFoundException -> L39 java.io.IOException -> L3b java.lang.Throwable -> L68
            r1.put(r4, r5)     // Catch: java.lang.ClassNotFoundException -> L39 java.io.IOException -> L3b java.lang.Throwable -> L68
            int r7 = r7 + (-1)
            goto L1b
        L2b:
            r3.close()     // Catch: java.io.IOException -> L2f
            goto L35
        L2f:
            r7 = move-exception
            java.lang.String r3 = androidx.work.C0706e.f4510a
            android.util.Log.e(r3, r0, r7)
        L35:
            r2.close()     // Catch: java.io.IOException -> L5c
            goto L62
        L39:
            r7 = move-exception
            goto L47
        L3b:
            r7 = move-exception
            goto L47
        L3d:
            r1 = move-exception
            r3 = r7
            r7 = r1
            goto L69
        L41:
            r3 = move-exception
            goto L44
        L43:
            r3 = move-exception
        L44:
            r6 = r3
            r3 = r7
            r7 = r6
        L47:
            java.lang.String r4 = androidx.work.C0706e.f4510a     // Catch: java.lang.Throwable -> L68
            android.util.Log.e(r4, r0, r7)     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L58
            r3.close()     // Catch: java.io.IOException -> L52
            goto L58
        L52:
            r7 = move-exception
            java.lang.String r3 = androidx.work.C0706e.f4510a
            android.util.Log.e(r3, r0, r7)
        L58:
            r2.close()     // Catch: java.io.IOException -> L5c
            goto L62
        L5c:
            r7 = move-exception
            java.lang.String r2 = androidx.work.C0706e.f4510a
            android.util.Log.e(r2, r0, r7)
        L62:
            androidx.work.e r7 = new androidx.work.e
            r7.<init>(r1)
            return r7
        L68:
            r7 = move-exception
        L69:
            if (r3 == 0) goto L75
            r3.close()     // Catch: java.io.IOException -> L6f
            goto L75
        L6f:
            r1 = move-exception
            java.lang.String r3 = androidx.work.C0706e.f4510a
            android.util.Log.e(r3, r0, r1)
        L75:
            r2.close()     // Catch: java.io.IOException -> L79
            goto L7f
        L79:
            r1 = move-exception
            java.lang.String r2 = androidx.work.C0706e.f4510a
            android.util.Log.e(r2, r0, r1)
        L7f:
            throw r7
        L80:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r7.<init>(r0)
            goto L89
        L88:
            throw r7
        L89:
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.C0706e.m4829g(byte[]):androidx.work.e");
    }

    /* renamed from: l */
    public static byte[] m4830l(C0706e c0706e) {
        ObjectOutputStream objectOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e2) {
            e = e2;
        }
        try {
            objectOutputStream.writeInt(c0706e.m4834k());
            for (Map.Entry<String, Object> entry : c0706e.f4512c.entrySet()) {
                objectOutputStream.writeUTF(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException e3) {
                Log.e(f4510a, "Error in Data#toByteArray: ", e3);
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e4) {
                Log.e(f4510a, "Error in Data#toByteArray: ", e4);
            }
            if (byteArrayOutputStream.size() <= 10240) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        } catch (IOException e5) {
            e = e5;
            objectOutputStream2 = objectOutputStream;
            Log.e(f4510a, "Error in Data#toByteArray: ", e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e6) {
                    Log.e(f4510a, "Error in Data#toByteArray: ", e6);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e7) {
                Log.e(f4510a, "Error in Data#toByteArray: ", e7);
            }
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e8) {
                    Log.e(f4510a, "Error in Data#toByteArray: ", e8);
                }
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (IOException e9) {
                Log.e(f4510a, "Error in Data#toByteArray: ", e9);
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0706e.class != obj.getClass()) {
            return false;
        }
        C0706e c0706e = (C0706e) obj;
        Set<String> keySet = this.f4512c.keySet();
        if (!keySet.equals(c0706e.f4512c.keySet())) {
            return false;
        }
        for (String str : keySet) {
            Object obj2 = this.f4512c.get(str);
            Object obj3 = c0706e.f4512c.get(str);
            if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public boolean m4831h(String str, boolean z) {
        Object obj = this.f4512c.get(str);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z;
    }

    public int hashCode() {
        return this.f4512c.hashCode() * 31;
    }

    /* renamed from: i */
    public Map<String, Object> m4832i() {
        return Collections.unmodifiableMap(this.f4512c);
    }

    /* renamed from: j */
    public String m4833j(String str) {
        Object obj = this.f4512c.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* renamed from: k */
    public int m4834k() {
        return this.f4512c.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.f4512c.isEmpty()) {
            for (String str : this.f4512c.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = this.f4512c.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public C0706e(C0706e c0706e) {
        this.f4512c = new HashMap(c0706e.f4512c);
    }

    public C0706e(Map<String, ?> map) {
        this.f4512c = new HashMap(map);
    }
}
