package com.flurry.sdk;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.flurry.sdk.C5986d.c;
import com.flurry.sdk.C6035i2;
import com.flurry.sdk.C6149v3;
import com.flurry.sdk.C6184z6.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;
import p241e.p252d.p253a.C8747f;
import p241e.p252d.p253a.EnumC8745d;
import p241e.p252d.p253a.InterfaceC8744c;
import p241e.p252d.p253a.InterfaceC8746e;

/* renamed from: com.flurry.sdk.a */
/* loaded from: classes2.dex */
public final class C5959a extends C6062l2 {

    /* renamed from: o */
    public static AtomicBoolean f15620o = new AtomicBoolean(false);

    /* renamed from: p */
    private static C5959a f15621p = null;

    /* renamed from: q */
    public List<InterfaceC8746e> f15622q;

    /* renamed from: com.flurry.sdk.a$a */
    public class a extends AbstractRunnableC6008f2 {

        /* renamed from: h */
        final /* synthetic */ long f15623h;

        /* renamed from: i */
        final /* synthetic */ InterfaceC8744c f15624i;

        public a(long j2, InterfaceC8744c interfaceC8744c) {
            this.f15623h = j2;
            this.f15624i = interfaceC8744c;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6008f2
        /* renamed from: a */
        public final void mo12950a() {
            C6004e7.m13055a().f15832l.f15768s = this.f15623h;
            C6004e7.m13055a().f15832l.m13023A(this.f15624i);
        }
    }

    /* renamed from: com.flurry.sdk.a$b */
    public class b extends AbstractRunnableC6008f2 {

        /* renamed from: h */
        final /* synthetic */ Context f15626h;

        /* renamed from: i */
        final /* synthetic */ List f15627i;

        public b(Context context, List list) {
            this.f15626h = context;
            this.f15627i = list;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6008f2
        /* renamed from: a */
        public final void mo12950a() throws Exception {
            C6071m2 m13180a = C6071m2.m13180a();
            m13180a.f16135d.mo13132a();
            m13180a.f16133b.f16377a.m13383a();
            C6184z6 c6184z6 = m13180a.f16134c;
            File[] listFiles = new File(C6107q2.m13271c()).listFiles();
            if (listFiles != null) {
                for (int i2 = 0; i2 < listFiles.length; i2++) {
                    if (listFiles[i2].isFile()) {
                        C5988d1.m13030c(3, "StreamingFileUtil", "File " + listFiles[i2].getName());
                    } else if (listFiles[i2].isDirectory()) {
                        C5988d1.m13030c(3, "StreamingFileUtil", "Directory " + listFiles[i2].getName());
                    }
                }
            }
            System.out.println();
            C5988d1.m13030c(2, "VNodeFileProcessor", "Number of files already pending: in startWatching " + listFiles.length);
            c6184z6.m13390e(Arrays.asList(listFiles));
            c6184z6.mo13007m(c6184z6.new a(c6184z6));
            C6026h2.m13088a();
            C6016g1.m13075a(this.f15626h);
            C6026h2.m13090c(this.f15627i);
            C6026h2.m13089b(this.f15626h);
        }
    }

    /* renamed from: com.flurry.sdk.a$c */
    public class c extends AbstractRunnableC6008f2 {

        /* renamed from: h */
        final /* synthetic */ String f15629h;

        /* renamed from: i */
        final /* synthetic */ String f15630i;

        public c(String str, String str2) {
            this.f15629h = str;
            this.f15630i = str2;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6008f2
        /* renamed from: a */
        public final void mo12950a() {
            C6093o6.m13229j(this.f15629h, this.f15630i);
        }
    }

    /* renamed from: com.flurry.sdk.a$d */
    public class d extends AbstractRunnableC6008f2 {

        /* renamed from: h */
        final /* synthetic */ int f15632h;

        /* renamed from: i */
        final /* synthetic */ Context f15633i;

        public d(int i2, Context context) {
            this.f15632h = i2;
            this.f15633i = context;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6008f2
        /* renamed from: a */
        public final void mo12950a() {
            if (this.f15632h != C8747f.f33389a) {
                C6088o1.m13222a().m13223b(this.f15633i, null);
            }
            int i2 = this.f15632h;
            int i3 = C8747f.f33390b;
            if ((i2 & i3) == i3) {
                C6079n1 m13193a = C6079n1.m13193a();
                m13193a.f16163h = true;
                if (m13193a.f16164i) {
                    m13193a.m13201f();
                }
            }
            int i4 = this.f15632h;
            int i5 = C8747f.f33391c;
            if ((i4 & i5) == i5) {
                C6106q1.m13266a().f16281e = true;
            }
        }
    }

    /* renamed from: com.flurry.sdk.a$e */
    public class e extends AbstractRunnableC6008f2 {

        /* renamed from: h */
        final /* synthetic */ boolean f15635h;

        public e(boolean z) {
            this.f15635h = z;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6008f2
        /* renamed from: a */
        public final void mo12950a() throws Exception {
            C6004e7.m13055a().f15837q.m13170x(this.f15635h);
        }
    }

    /* renamed from: com.flurry.sdk.a$f */
    final class f extends AbstractRunnableC6008f2 {
        f() {
        }

        @Override // com.flurry.sdk.AbstractRunnableC6008f2
        /* renamed from: a */
        public final void mo12950a() {
            C6101p5.m13260h();
            C6004e7.m13055a().f15832l.m13024C(EnumC6006f0.FOREGROUND, true);
        }
    }

    /* renamed from: com.flurry.sdk.a$g */
    public class g extends AbstractRunnableC6008f2 {

        /* renamed from: h */
        final /* synthetic */ boolean f15638h;

        /* renamed from: i */
        final /* synthetic */ boolean f15639i;

        public g(boolean z, boolean z2) {
            this.f15638h = z;
            this.f15639i = z2;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6008f2
        /* renamed from: a */
        public final void mo12950a() {
            int identifier;
            C5986d c5986d = C6004e7.m13055a().f15829i;
            String m13143b = C6051k0.m13141a().m13143b();
            boolean z = this.f15638h;
            boolean z2 = this.f15639i;
            c5986d.f15742p = m13143b;
            c5986d.f15743q = z;
            c5986d.f15744r = z2;
            c5986d.mo13007m(c5986d.new c());
            String property = System.getProperty("os.arch");
            boolean isEmpty = TextUtils.isEmpty(property);
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (isEmpty) {
                property = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("device.model", Build.MODEL);
            hashMap.put("build.brand", Build.BRAND);
            hashMap.put("build.id", Build.ID);
            hashMap.put("version.release", Build.VERSION.RELEASE);
            hashMap.put("build.device", Build.DEVICE);
            hashMap.put("build.product", Build.PRODUCT);
            C6060l0.m13174a();
            Context m12964a = C5969b0.m12964a();
            if (m12964a != null && (identifier = m12964a.getResources().getIdentifier("com.flurry.crash.map_id", "string", m12964a.getPackageName())) != 0) {
                str = m12964a.getResources().getString(identifier);
            }
            hashMap.put("proguard.build.uuid", str);
            hashMap.put("device.arch", property);
            C6071m2.m13180a().m13181b(new C6083n5(new C6092o5(hashMap)));
            C5992d5.m13045h();
            C6101p5.m13260h();
            Map<String, List<String>> m13321a = new C6146v0().m13321a();
            if (m13321a.size() > 0) {
                C6071m2.m13180a().m13181b(new C6021g6(new C6030h6(m13321a)));
            }
            C6011f5.m13061h(C6004e7.m13055a().f15824d.f16270q);
        }
    }

    /* renamed from: com.flurry.sdk.a$h */
    public class h extends AbstractRunnableC6008f2 {
        public h() {
        }

        @Override // com.flurry.sdk.AbstractRunnableC6008f2
        /* renamed from: a */
        public final void mo12950a() {
            C6004e7.m13055a().f15832l.m13025D(EnumC6006f0.FOREGROUND, false);
        }
    }

    /* renamed from: com.flurry.sdk.a$i */
    final class i extends AbstractRunnableC6008f2 {

        /* renamed from: h */
        final /* synthetic */ String f15642h;

        /* renamed from: i */
        final /* synthetic */ C6149v3.a f15643i;

        /* renamed from: j */
        final /* synthetic */ Map f15644j;

        /* renamed from: k */
        final /* synthetic */ boolean f15645k;

        /* renamed from: l */
        final /* synthetic */ boolean f15646l;

        /* renamed from: m */
        final /* synthetic */ long f15647m;

        /* renamed from: n */
        final /* synthetic */ long f15648n;

        i(String str, C6149v3.a aVar, Map map, boolean z, boolean z2, long j2, long j3) {
            this.f15642h = str;
            this.f15643i = aVar;
            this.f15644j = map;
            this.f15645k = z;
            this.f15646l = z2;
            this.f15647m = j2;
            this.f15648n = j3;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6008f2
        /* renamed from: a */
        public final void mo12950a() {
            C6141u3.m13318h(this.f15642h, this.f15643i, this.f15644j, this.f15645k, this.f15646l, this.f15647m, this.f15648n);
        }
    }

    /* renamed from: com.flurry.sdk.a$j */
    public class j extends AbstractRunnableC6008f2 {

        /* renamed from: h */
        final /* synthetic */ String f15650h;

        /* renamed from: i */
        final /* synthetic */ long f15651i;

        /* renamed from: j */
        final /* synthetic */ String f15652j;

        /* renamed from: k */
        final /* synthetic */ Throwable f15653k;

        /* renamed from: l */
        final /* synthetic */ Map f15654l;

        public j(String str, long j2, String str2, Throwable th, Map map) {
            this.f15650h = str;
            this.f15651i = j2;
            this.f15652j = str2;
            this.f15653k = th;
            this.f15654l = map;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6008f2
        /* renamed from: a */
        public final void mo12950a() {
            C6004e7.m13055a().f15827g.m12979x(this.f15650h, this.f15651i, this.f15652j, this.f15653k.getClass().getName(), this.f15653k, C6094o7.m13230a(), this.f15654l);
        }
    }

    public C5959a() {
        super("FlurryAgentImpl", C6035i2.m13111a(C6035i2.b.PUBLIC_API));
        this.f15622q = new ArrayList();
    }

    /* renamed from: v */
    public static C5959a m12944v() {
        if (f15621p == null) {
            f15621p = new C5959a();
        }
        return f15621p;
    }

    /* renamed from: x */
    public static boolean m12945x() {
        return f15620o.get();
    }

    /* renamed from: s */
    public final EnumC8745d m12946s(String str, C6149v3.a aVar, Map<String, String> map) {
        return !C5980c2.m12991g(16) ? EnumC8745d.kFlurryEventFailed : m12947t(str, aVar, map, false, false);
    }

    /* renamed from: t */
    public final EnumC8745d m12947t(String str, C6149v3.a aVar, Map<String, String> map, boolean z, boolean z2) {
        if (!f15620o.get()) {
            C5988d1.m13041n("FlurryAgentImpl", "Invalid call to logEvent. Flurry is not initialized");
            return null;
        }
        if (C5980c2.m12986b(str).length() == 0) {
            return EnumC8745d.kFlurryEventFailed;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        EnumC8745d enumC8745d = hashMap.size() > 10 ? EnumC8745d.kFlurryEventParamsCountExceeded : EnumC8745d.kFlurryEventRecorded;
        mo13007m(new i(str, aVar, hashMap, z, z2, currentTimeMillis, elapsedRealtime));
        return enumC8745d;
    }

    /* renamed from: u */
    public final EnumC8745d m12948u(String str, Map<String, String> map, boolean z, boolean z2) {
        return m12947t(str, C6149v3.a.CUSTOM, map, z, z2);
    }

    /* renamed from: w */
    public final void m12949w(Context context) {
        if (context instanceof Activity) {
            C5988d1.m13032e("FlurryAgentImpl", "Activity's session is controlled by Flurry SDK");
        } else if (f15620o.get()) {
            mo13007m(new f());
        } else {
            C5988d1.m13041n("FlurryAgentImpl", "Invalid call to onStartSession. Flurry is not initialized");
        }
    }
}
