package com.facebook.p157o0.p166r0;

import android.text.TextUtils;
import com.facebook.C5608a0;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.C10768m;
import kotlin.jvm.internal.C9768m;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Utils.kt */
/* renamed from: com.facebook.o0.r0.j */
/* loaded from: classes2.dex */
public final class C5888j {

    /* renamed from: a */
    public static final C5888j f15450a = new C5888j();

    private C5888j() {
    }

    /* renamed from: a */
    public static final File m12736a() {
        C5608a0 c5608a0 = C5608a0.f14199a;
        File file = new File(C5608a0.m11284c().getFilesDir(), "facebook_ml/");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    /* renamed from: c */
    public static final Map<String, C5884f> m12737c(File file) {
        C9768m.m32346f(file, "file");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int available = fileInputStream.available();
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            byte[] bArr = new byte[available];
            dataInputStream.readFully(bArr);
            dataInputStream.close();
            if (available < 4) {
                return null;
            }
            ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, 4);
            wrap.order(ByteOrder.LITTLE_ENDIAN);
            int i2 = wrap.getInt();
            int i3 = i2 + 4;
            if (available < i3) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(new String(bArr, 4, i2, Charsets.f40651b));
            JSONArray names = jSONObject.names();
            int length = names.length();
            String[] strArr = new String[length];
            int i4 = length - 1;
            if (i4 >= 0) {
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    strArr[i5] = names.getString(i5);
                    if (i6 > i4) {
                        break;
                    }
                    i5 = i6;
                }
            }
            C10768m.m38714o(strArr);
            HashMap hashMap = new HashMap();
            int i7 = 0;
            while (i7 < length) {
                String str = strArr[i7];
                i7++;
                if (str != null) {
                    JSONArray jSONArray = jSONObject.getJSONArray(str);
                    int length2 = jSONArray.length();
                    int[] iArr = new int[length2];
                    int i8 = length2 - 1;
                    int i9 = 1;
                    if (i8 >= 0) {
                        int i10 = 0;
                        while (true) {
                            int i11 = i10 + 1;
                            iArr[i10] = jSONArray.getInt(i10);
                            i9 *= iArr[i10];
                            if (i11 > i8) {
                                break;
                            }
                            i10 = i11;
                        }
                    }
                    int i12 = i9 * 4;
                    int i13 = i3 + i12;
                    if (i13 > available) {
                        return null;
                    }
                    ByteBuffer wrap2 = ByteBuffer.wrap(bArr, i3, i12);
                    wrap2.order(ByteOrder.LITTLE_ENDIAN);
                    C5884f c5884f = new C5884f(iArr);
                    wrap2.asFloatBuffer().get(c5884f.m12673a(), 0, i9);
                    hashMap.put(str, c5884f);
                    i3 = i13;
                }
            }
            return hashMap;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final String m12738b(String str) {
        C9768m.m32346f(str, "str");
        int length = str.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            boolean z2 = C9768m.m32348h(str.charAt(!z ? i2 : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i2++;
            } else {
                z = true;
            }
        }
        Object[] array = new Regex("\\s+").m37440d(str.subSequence(i2, length + 1).toString(), 0).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        String join = TextUtils.join(" ", (String[]) array);
        C9768m.m32345e(join, "join(\" \", strArray)");
        return join;
    }

    /* renamed from: d */
    public final int[] m12739d(String str, int i2) {
        C9768m.m32346f(str, "texts");
        int[] iArr = new int[i2];
        String m12738b = m12738b(str);
        Charset forName = Charset.forName("UTF-8");
        C9768m.m32345e(forName, "forName(\"UTF-8\")");
        if (m12738b == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = m12738b.getBytes(forName);
        C9768m.m32345e(bytes, "(this as java.lang.String).getBytes(charset)");
        if (i2 > 0) {
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 < bytes.length) {
                    iArr[i3] = bytes[i3] & 255;
                } else {
                    iArr[i3] = 0;
                }
                if (i4 >= i2) {
                    break;
                }
                i3 = i4;
            }
        }
        return iArr;
    }
}
