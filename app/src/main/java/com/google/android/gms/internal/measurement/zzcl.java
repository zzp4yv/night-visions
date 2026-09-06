package com.google.android.gms.internal.measurement;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public abstract class zzcl<T> {

    /* renamed from: b */
    @SuppressLint({"StaticFieldLeak"})
    private static Context f28008b;

    /* renamed from: c */
    private static zzcz<C7531p0> f28009c;

    /* renamed from: e */
    private final zzcr f28011e;

    /* renamed from: f */
    private final String f28012f;

    /* renamed from: g */
    private final T f28013g;

    /* renamed from: h */
    private volatile int f28014h;

    /* renamed from: i */
    private volatile T f28015i;

    /* renamed from: a */
    private static final Object f28007a = new Object();

    /* renamed from: d */
    private static final AtomicInteger f28010d = new AtomicInteger();

    private zzcl(zzcr zzcrVar, String str, T t) {
        this.f28014h = -1;
        if (zzcrVar.f28018b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f28011e = zzcrVar;
        this.f28012f = str;
        this.f28013g = t;
    }

    /* renamed from: f */
    private final String m22108f(String str) {
        if (str != null && str.isEmpty()) {
            return this.f28012f;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(this.f28012f);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: g */
    static void m22109g() {
        f28010d.incrementAndGet();
    }

    /* renamed from: h */
    public static void m22110h(Context context) {
        synchronized (f28007a) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (f28008b != context) {
                zzbx.m22090d();
                zzcu.m22124b();
                C7525o0.m21261b();
                f28010d.incrementAndGet();
                f28008b = context;
                f28009c = zzdc.m22130a(C7555t0.f27896f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static zzcl<Double> m22111i(zzcr zzcrVar, String str, double d2) {
        return new C7561u0(zzcrVar, str, Double.valueOf(d2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static zzcl<Long> m22112j(zzcr zzcrVar, String str, long j2) {
        return new C7549s0(zzcrVar, str, Long.valueOf(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static zzcl<String> m22113k(zzcr zzcrVar, String str, String str2) {
        return new C7573w0(zzcrVar, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static zzcl<Boolean> m22114l(zzcr zzcrVar, String str, boolean z) {
        return new C7567v0(zzcrVar, str, Boolean.valueOf(z));
    }

    /* renamed from: o */
    static final /* synthetic */ C7531p0 m22115o() {
        new C7543r0();
        return C7543r0.m21333a(f28008b);
    }

    /* renamed from: e */
    abstract T mo21393e(Object obj);

    /* renamed from: m */
    public final String m22116m() {
        return m22108f(this.f28011e.f28020d);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4 A[Catch: all -> 0x00e1, TryCatch #0 {, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0013, B:11:0x002a, B:12:0x00d2, B:13:0x0030, B:15:0x0040, B:19:0x0051, B:21:0x0057, B:23:0x005f, B:25:0x0078, B:27:0x0082, B:30:0x00b4, B:32:0x00c8, B:35:0x00d0, B:38:0x0070, B:39:0x0087, B:41:0x0090, B:43:0x00a2, B:44:0x00ad, B:45:0x00a7, B:47:0x00d7, B:48:0x00de, B:50:0x00df), top: B:4:0x000b }] */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T m22117n() {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzcl.m22117n():java.lang.Object");
    }

    /* synthetic */ zzcl(zzcr zzcrVar, String str, Object obj, C7549s0 c7549s0) {
        this(zzcrVar, str, obj);
    }
}
