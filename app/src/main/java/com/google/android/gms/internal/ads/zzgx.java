package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.util.HashMap;

@TargetApi(16)
/* loaded from: classes2.dex */
public final class zzgx {

    /* renamed from: a */
    private static final HashMap<C7410a, Pair<String, MediaCodecInfo.CodecCapabilities>> f26167a = new HashMap<>();

    /* renamed from: com.google.android.gms.internal.ads.zzgx$a */
    static final class C7410a {

        /* renamed from: a */
        public final String f26168a;

        /* renamed from: b */
        public final boolean f26169b;

        public C7410a(String str, boolean z) {
            this.f26168a = str;
            this.f26169b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == C7410a.class) {
                C7410a c7410a = (C7410a) obj;
                if (TextUtils.equals(this.f26168a, c7410a.f26168a) && this.f26169b == c7410a.f26169b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            String str = this.f26168a;
            return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.f26169b ? 1231 : 1237);
        }
    }

    /* renamed from: a */
    private static Pair<String, MediaCodecInfo.CodecCapabilities> m20011a(C7410a c7410a, InterfaceC6695gz interfaceC6695gz) throws zzgz {
        try {
            String str = c7410a.f26168a;
            int mo15242c = interfaceC6695gz.mo15242c();
            boolean mo15241b = interfaceC6695gz.mo15241b();
            boolean z = false;
            int i2 = 0;
            while (i2 < mo15242c) {
                MediaCodecInfo mo15240a = interfaceC6695gz.mo15240a(i2);
                String name = mo15240a.getName();
                if (!mo15240a.isEncoder() && name.startsWith("OMX.") && (mo15241b || !name.endsWith(".secure"))) {
                    String[] supportedTypes = mo15240a.getSupportedTypes();
                    int i3 = 0;
                    while (i3 < supportedTypes.length) {
                        String str2 = supportedTypes[i3];
                        if (str2.equalsIgnoreCase(str)) {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mo15240a.getCapabilitiesForType(str2);
                            boolean mo15243d = interfaceC6695gz.mo15243d(c7410a.f26168a, capabilitiesForType);
                            if (mo15241b) {
                                f26167a.put(c7410a.f26169b == mo15243d ? c7410a : new C7410a(str, mo15243d), Pair.create(name, capabilitiesForType));
                            } else {
                                HashMap<C7410a, Pair<String, MediaCodecInfo.CodecCapabilities>> hashMap = f26167a;
                                hashMap.put(c7410a.f26169b ? new C7410a(str, z) : c7410a, Pair.create(name, capabilitiesForType));
                                if (mo15243d) {
                                    hashMap.put(c7410a.f26169b ? c7410a : new C7410a(str, true), Pair.create(name.concat(".secure"), capabilitiesForType));
                                }
                            }
                            HashMap<C7410a, Pair<String, MediaCodecInfo.CodecCapabilities>> hashMap2 = f26167a;
                            if (hashMap2.containsKey(c7410a)) {
                                return hashMap2.get(c7410a);
                            }
                        }
                        i3++;
                        z = false;
                    }
                }
                i2++;
                z = false;
            }
            return null;
        } catch (Exception e2) {
            throw new zzgz(e2);
        }
    }

    /* renamed from: b */
    public static zzgc m20012b(String str, boolean z) throws zzgz {
        Pair<String, MediaCodecInfo.CodecCapabilities> m20013c = m20013c(str, z);
        if (m20013c == null) {
            return null;
        }
        return new zzgc((String) m20013c.first, zzkq.f26428a >= 19 ? ((MediaCodecInfo.CodecCapabilities) m20013c.second).isFeatureSupported("adaptive-playback") : false);
    }

    /* renamed from: c */
    private static synchronized Pair<String, MediaCodecInfo.CodecCapabilities> m20013c(String str, boolean z) throws zzgz {
        synchronized (zzgx.class) {
            C7410a c7410a = new C7410a(str, z);
            HashMap<C7410a, Pair<String, MediaCodecInfo.CodecCapabilities>> hashMap = f26167a;
            if (hashMap.containsKey(c7410a)) {
                return hashMap.get(c7410a);
            }
            int i2 = zzkq.f26428a;
            Pair<String, MediaCodecInfo.CodecCapabilities> m20011a = m20011a(c7410a, i2 >= 21 ? new C6769iz(z) : new C6732hz());
            if (z && m20011a == null && i2 >= 21 && (m20011a = m20011a(c7410a, new C6732hz())) != null) {
                String str2 = (String) m20011a.first;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
                sb.append("MediaCodecList API didn't list secure decoder for: ");
                sb.append(str);
                sb.append(". Assuming: ");
                sb.append(str2);
                Log.w("MediaCodecUtil", sb.toString());
            }
            return m20011a;
        }
    }
}
