package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.file.CacheHelper;
import com.google.android.gms.ads.AdRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

@SuppressLint({"InlinedApi"})
@TargetApi(16)
/* loaded from: classes2.dex */
public final class zzpi {

    /* renamed from: d */
    private static final SparseIntArray f26812d;

    /* renamed from: e */
    private static final SparseIntArray f26813e;

    /* renamed from: f */
    private static final Map<String, Integer> f26814f;

    /* renamed from: a */
    private static final zzpd f26809a = zzpd.m20361g("OMX.google.raw.decoder");

    /* renamed from: b */
    private static final Pattern f26810b = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: c */
    private static final HashMap<C7411a, List<zzpd>> f26811c = new HashMap<>();

    /* renamed from: g */
    private static int f26815g = -1;

    /* renamed from: com.google.android.gms.internal.ads.zzpi$a */
    static final class C7411a {

        /* renamed from: a */
        public final String f26816a;

        /* renamed from: b */
        public final boolean f26817b;

        public C7411a(String str, boolean z) {
            this.f26816a = str;
            this.f26817b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == C7411a.class) {
                C7411a c7411a = (C7411a) obj;
                if (TextUtils.equals(this.f26816a, c7411a.f26816a) && this.f26817b == c7411a.f26817b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            String str = this.f26816a;
            return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.f26817b ? 1231 : 1237);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f26812d = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f26813e = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, AdRequest.MAX_CONTENT_URL_LENGTH);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, RecyclerView.AbstractC0599l.FLAG_MOVED);
        sparseIntArray2.put(41, RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, Http2.INITIAL_MAX_FRAME_SIZE);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        HashMap hashMap = new HashMap();
        f26814f = hashMap;
        hashMap.put("L30", 1);
        hashMap.put("L60", 4);
        hashMap.put("L63", 16);
        hashMap.put("L90", 64);
        hashMap.put("L93", 256);
        hashMap.put("L120", 1024);
        hashMap.put("L123", Integer.valueOf(RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT));
        hashMap.put("L150", Integer.valueOf(Http2.INITIAL_MAX_FRAME_SIZE));
        hashMap.put("L153", 65536);
        hashMap.put("L156", 262144);
        hashMap.put("L180", Integer.valueOf(CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES));
        hashMap.put("L183", 4194304);
        hashMap.put("L186", Integer.valueOf(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE));
        hashMap.put("H30", 2);
        hashMap.put("H60", 8);
        hashMap.put("H63", 32);
        hashMap.put("H90", 128);
        hashMap.put("H93", Integer.valueOf(AdRequest.MAX_CONTENT_URL_LENGTH));
        hashMap.put("H120", Integer.valueOf(RecyclerView.AbstractC0599l.FLAG_MOVED));
        hashMap.put("H123", 8192);
        hashMap.put("H150", 32768);
        hashMap.put("H153", 131072);
        hashMap.put("H156", 524288);
        hashMap.put("H180", 2097152);
        hashMap.put("H183", 8388608);
        hashMap.put("H186", 33554432);
    }

    /* renamed from: a */
    private static Pair<Integer, Integer> m20380a(String str, String[] strArr) {
        Integer valueOf;
        Integer num;
        if (strArr.length < 2) {
            String valueOf2 = String.valueOf(str);
            Log.w("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf2) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                num = Integer.valueOf(Integer.parseInt(strArr[1].substring(0, 2), 16));
                valueOf = Integer.valueOf(Integer.parseInt(strArr[1].substring(4), 16));
            } else {
                if (strArr.length < 3) {
                    String valueOf3 = String.valueOf(str);
                    Log.w("MediaCodecUtil", valueOf3.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf3) : new String("Ignoring malformed AVC codec string: "));
                    return null;
                }
                Integer valueOf4 = Integer.valueOf(Integer.parseInt(strArr[1]));
                valueOf = Integer.valueOf(Integer.parseInt(strArr[2]));
                num = valueOf4;
            }
            Integer valueOf5 = Integer.valueOf(f26812d.get(num.intValue()));
            if (valueOf5 == null) {
                String valueOf6 = String.valueOf(num);
                StringBuilder sb = new StringBuilder(valueOf6.length() + 21);
                sb.append("Unknown AVC profile: ");
                sb.append(valueOf6);
                Log.w("MediaCodecUtil", sb.toString());
                return null;
            }
            Integer valueOf7 = Integer.valueOf(f26813e.get(valueOf.intValue()));
            if (valueOf7 != null) {
                return new Pair<>(valueOf5, valueOf7);
            }
            String valueOf8 = String.valueOf(valueOf);
            StringBuilder sb2 = new StringBuilder(valueOf8.length() + 19);
            sb2.append("Unknown AVC level: ");
            sb2.append(valueOf8);
            Log.w("MediaCodecUtil", sb2.toString());
            return null;
        } catch (NumberFormatException unused) {
            String valueOf9 = String.valueOf(str);
            Log.w("MediaCodecUtil", valueOf9.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf9) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.ads.zzpk.<init>(java.lang.Throwable, com.google.android.gms.internal.ads.p20):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:290)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:193)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0126, code lost:
    
        if ("C1605".equals(r14) == false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0182 A[Catch: Exception -> 0x0278, TryCatch #2 {Exception -> 0x0278, blocks: (B:3:0x0004, B:5:0x0016, B:9:0x0028, B:12:0x0030, B:14:0x0036, B:16:0x003e, B:18:0x0046, B:20:0x004e, B:22:0x0056, B:24:0x005e, B:29:0x006c, B:33:0x0078, B:35:0x0080, B:40:0x0090, B:42:0x0098, B:44:0x00a2, B:46:0x00aa, B:48:0x00b2, B:50:0x00ba, B:52:0x00c2, B:54:0x00ca, B:56:0x00d2, B:58:0x00da, B:60:0x00e2, B:62:0x00ea, B:64:0x00f2, B:68:0x00fe, B:70:0x0106, B:72:0x0110, B:74:0x0118, B:76:0x0120, B:80:0x012f, B:82:0x0137, B:84:0x0141, B:86:0x014b, B:88:0x0153, B:90:0x0159, B:92:0x0161, B:96:0x016c, B:98:0x0174, B:103:0x0182, B:105:0x018a, B:138:0x0200, B:141:0x0208, B:143:0x020e, B:146:0x0232, B:147:0x0262), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01cb A[Catch: Exception -> 0x01c6, TryCatch #3 {Exception -> 0x01c6, blocks: (B:153:0x01a2, B:155:0x01ac, B:157:0x01b4, B:159:0x01bc, B:116:0x01cb, B:120:0x01d9, B:123:0x01d4, B:129:0x01e7), top: B:152:0x01a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x026d A[SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List<com.google.android.gms.internal.ads.zzpd> m20381b(com.google.android.gms.internal.ads.zzpi.C7411a r17, com.google.android.gms.internal.ads.q20 r18) throws com.google.android.gms.internal.ads.zzpk {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpi.m20381b(com.google.android.gms.internal.ads.zzpi$a, com.google.android.gms.internal.ads.q20):java.util.List");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0044, code lost:
    
        if (r3.equals("avc1") == false) goto L7;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m20382c(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpi.m20382c(java.lang.String):android.util.Pair");
    }

    /* renamed from: d */
    public static zzpd m20383d(String str, boolean z) throws zzpk {
        List<zzpd> m20384e = m20384e(str, z);
        if (m20384e.isEmpty()) {
            return null;
        }
        return m20384e.get(0);
    }

    /* renamed from: e */
    private static synchronized List<zzpd> m20384e(String str, boolean z) throws zzpk {
        synchronized (zzpi.class) {
            C7411a c7411a = new C7411a(str, z);
            HashMap<C7411a, List<zzpd>> hashMap = f26811c;
            List<zzpd> list = hashMap.get(c7411a);
            if (list != null) {
                return list;
            }
            int i2 = zzsy.f27024a;
            List<zzpd> m20381b = m20381b(c7411a, i2 >= 21 ? new s20(z) : new r20());
            if (z && m20381b.isEmpty() && 21 <= i2 && i2 <= 23) {
                m20381b = m20381b(c7411a, new r20());
                if (!m20381b.isEmpty()) {
                    String str2 = m20381b.get(0).f26759a;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(str2);
                    Log.w("MediaCodecUtil", sb.toString());
                }
            }
            List<zzpd> unmodifiableList = Collections.unmodifiableList(m20381b);
            hashMap.put(c7411a, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* renamed from: f */
    public static zzpd m20385f() {
        return f26809a;
    }

    /* renamed from: g */
    public static int m20386g() throws zzpk {
        if (f26815g == -1) {
            int i2 = 0;
            zzpd m20383d = m20383d("video/avc", false);
            if (m20383d != null) {
                MediaCodecInfo.CodecProfileLevel[] m20368j = m20383d.m20368j();
                int length = m20368j.length;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = m20368j[i2].level;
                    int i5 = 9437184;
                    if (i4 != 1 && i4 != 2) {
                        switch (i4) {
                            case 8:
                            case 16:
                            case 32:
                                i5 = 101376;
                                break;
                            case 64:
                                i5 = 202752;
                                break;
                            case 128:
                            case 256:
                                i5 = 414720;
                                break;
                            case AdRequest.MAX_CONTENT_URL_LENGTH /* 512 */:
                                i5 = 921600;
                                break;
                            case 1024:
                                i5 = 1310720;
                                break;
                            case RecyclerView.AbstractC0599l.FLAG_MOVED /* 2048 */:
                            case RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT /* 4096 */:
                                i5 = 2097152;
                                break;
                            case 8192:
                                i5 = 2228224;
                                break;
                            case Http2.INITIAL_MAX_FRAME_SIZE /* 16384 */:
                                i5 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                break;
                            default:
                                i5 = -1;
                                break;
                        }
                    } else {
                        i5 = 25344;
                    }
                    i3 = Math.max(i5, i3);
                    i2++;
                }
                i2 = Math.max(i3, zzsy.f27024a >= 21 ? 345600 : 172800);
            }
            f26815g = i2;
        }
        return f26815g;
    }
}
