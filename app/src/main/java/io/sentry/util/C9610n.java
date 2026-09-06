package io.sentry.util;

import io.sentry.EnumC9554s4;
import io.sentry.InterfaceC9340c2;
import io.sentry.InterfaceC9545r2;
import io.sentry.InterfaceC9637w1;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicIntegerArray;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: JsonSerializationUtils.java */
@ApiStatus.Internal
/* renamed from: io.sentry.util.n */
/* loaded from: classes2.dex */
public final class C9610n {

    /* renamed from: a */
    private static final Charset f36930a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static List<Object> m31795a(AtomicIntegerArray atomicIntegerArray) {
        int length = atomicIntegerArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(Integer.valueOf(atomicIntegerArray.get(i2)));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static byte[] m31796b(InterfaceC9340c2 interfaceC9340c2, InterfaceC9637w1 interfaceC9637w1, InterfaceC9545r2 interfaceC9545r2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f36930a));
                try {
                    interfaceC9340c2.mo30487a(interfaceC9545r2, bufferedWriter);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    bufferedWriter.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (Throwable th) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable unused2) {
                }
                throw th2;
            }
        } catch (Throwable th3) {
            interfaceC9637w1.mo30213b(EnumC9554s4.ERROR, "Could not serialize serializable", th3);
            return null;
        }
    }

    /* renamed from: c */
    public static Map<String, Object> m31797c(Calendar calendar) {
        HashMap hashMap = new HashMap();
        hashMap.put("year", Integer.valueOf(calendar.get(1)));
        hashMap.put("month", Integer.valueOf(calendar.get(2)));
        hashMap.put("dayOfMonth", Integer.valueOf(calendar.get(5)));
        hashMap.put("hourOfDay", Integer.valueOf(calendar.get(11)));
        hashMap.put("minute", Integer.valueOf(calendar.get(12)));
        hashMap.put("second", Integer.valueOf(calendar.get(13)));
        return hashMap;
    }
}
