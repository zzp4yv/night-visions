package com.facebook.p170p0.p171a;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import com.facebook.C5608a0;
import com.facebook.internal.C5637c0;
import com.facebook.internal.C5639d0;
import com.facebook.internal.C5663p0;
import com.facebook.internal.EnumC5661o0;
import com.google.zxing.C8593d;
import com.google.zxing.EnumC8587a;
import com.google.zxing.EnumC8589c;
import com.google.zxing.WriterException;
import com.google.zxing.p222g.C8604b;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C9768m;
import kotlin.text.C10513u;
import org.json.JSONObject;

/* compiled from: DeviceRequestsHelper.kt */
/* renamed from: com.facebook.p0.a.a */
/* loaded from: classes2.dex */
public final class C5914a {

    /* renamed from: a */
    public static final C5914a f15554a = new C5914a();

    /* renamed from: b */
    private static final String f15555b = C5914a.class.getCanonicalName();

    /* renamed from: c */
    private static final HashMap<String, NsdManager.RegistrationListener> f15556c = new HashMap<>();

    /* compiled from: DeviceRequestsHelper.kt */
    /* renamed from: com.facebook.p0.a.a$a */
    public static final class a implements NsdManager.RegistrationListener {

        /* renamed from: a */
        final /* synthetic */ String f15557a;

        /* renamed from: b */
        final /* synthetic */ String f15558b;

        a(String str, String str2) {
            this.f15557a = str;
            this.f15558b = str2;
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i2) {
            C9768m.m32346f(nsdServiceInfo, "serviceInfo");
            C5914a c5914a = C5914a.f15554a;
            C5914a.m12876a(this.f15558b);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
            C9768m.m32346f(nsdServiceInfo, "NsdServiceInfo");
            if (C9768m.m32341a(this.f15557a, nsdServiceInfo.getServiceName())) {
                return;
            }
            C5914a c5914a = C5914a.f15554a;
            C5914a.m12876a(this.f15558b);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
            C9768m.m32346f(nsdServiceInfo, "serviceInfo");
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i2) {
            C9768m.m32346f(nsdServiceInfo, "serviceInfo");
        }
    }

    private C5914a() {
    }

    /* renamed from: a */
    public static final void m12876a(String str) {
        f15554a.m12877b(str);
    }

    @TargetApi(16)
    /* renamed from: b */
    private final void m12877b(String str) {
        NsdManager.RegistrationListener registrationListener = f15556c.get(str);
        if (registrationListener != null) {
            C5608a0 c5608a0 = C5608a0.f14199a;
            Object systemService = C5608a0.m11284c().getSystemService("servicediscovery");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
            }
            try {
                ((NsdManager) systemService).unregisterService(registrationListener);
            } catch (IllegalArgumentException e2) {
                C5663p0 c5663p0 = C5663p0.f14478a;
                C5663p0.m11573i0(f15555b, e2);
            }
            f15556c.remove(str);
        }
    }

    /* renamed from: c */
    public static final Bitmap m12878c(String str) {
        EnumMap enumMap = new EnumMap(EnumC8589c.class);
        enumMap.put((EnumMap) EnumC8589c.MARGIN, (EnumC8589c) 2);
        Bitmap bitmap = null;
        try {
            C8604b mo27243a = new C8593d().mo27243a(str, EnumC8587a.QR_CODE, 200, 200, enumMap);
            int m27296g = mo27243a.m27296g();
            int m27297h = mo27243a.m27297h();
            int[] iArr = new int[m27296g * m27297h];
            if (m27296g > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    int i4 = i2 * m27297h;
                    if (m27297h > 0) {
                        int i5 = 0;
                        while (true) {
                            int i6 = i5 + 1;
                            iArr[i4 + i5] = mo27243a.m27295f(i5, i2) ? -16777216 : -1;
                            if (i6 >= m27297h) {
                                break;
                            }
                            i5 = i6;
                        }
                    }
                    if (i3 >= m27296g) {
                        break;
                    }
                    i2 = i3;
                }
            }
            bitmap = Bitmap.createBitmap(m27297h, m27296g, Bitmap.Config.ARGB_8888);
            bitmap.setPixels(iArr, 0, m27297h, 0, 0, m27297h, m27296g);
            return bitmap;
        } catch (WriterException unused) {
            return bitmap;
        }
    }

    /* renamed from: d */
    public static final String m12879d(Map<String, String> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        String str = Build.DEVICE;
        C9768m.m32345e(str, "DEVICE");
        map.put("device", str);
        String str2 = Build.MODEL;
        C9768m.m32345e(str2, "MODEL");
        map.put("model", str2);
        String jSONObject = new JSONObject(map).toString();
        C9768m.m32345e(jSONObject, "JSONObject(deviceInfo as Map<*, *>).toString()");
        return jSONObject;
    }

    /* renamed from: e */
    public static final boolean m12880e() {
        C5639d0 c5639d0 = C5639d0.f14392a;
        C5608a0 c5608a0 = C5608a0.f14199a;
        C5637c0 m11417c = C5639d0.m11417c(C5608a0.m11285d());
        return Build.VERSION.SDK_INT >= 16 && m11417c != null && m11417c.m11408l().contains(EnumC5661o0.Enabled);
    }

    /* renamed from: f */
    public static final boolean m12881f(String str) {
        C5914a c5914a = f15554a;
        if (m12880e()) {
            return c5914a.m12882g(str);
        }
        return false;
    }

    @TargetApi(16)
    /* renamed from: g */
    private final boolean m12882g(String str) {
        String m37524z;
        HashMap<String, NsdManager.RegistrationListener> hashMap = f15556c;
        if (hashMap.containsKey(str)) {
            return true;
        }
        C5608a0 c5608a0 = C5608a0.f14199a;
        m37524z = C10513u.m37524z(C5608a0.m11300s(), '.', '|', false, 4, null);
        String str2 = "fbsdk_" + C9768m.m32354n("android-", m37524z) + '_' + ((Object) str);
        NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
        nsdServiceInfo.setServiceType("_fb._tcp.");
        nsdServiceInfo.setServiceName(str2);
        nsdServiceInfo.setPort(80);
        Object systemService = C5608a0.m11284c().getSystemService("servicediscovery");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
        }
        a aVar = new a(str2, str);
        hashMap.put(str, aVar);
        ((NsdManager) systemService).registerService(nsdServiceInfo, 1, aVar);
        return true;
    }
}
