package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import io.sentry.C9211a1;
import io.sentry.EnumC9554s4;
import io.sentry.android.core.C9313t0;
import io.sentry.android.core.internal.util.C9281k;
import io.sentry.android.core.internal.util.C9283m;
import io.sentry.android.core.internal.util.C9285o;
import io.sentry.android.core.internal.util.C9288r;
import io.sentry.protocol.C9513e;
import io.sentry.protocol.C9519k;
import java.io.File;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: DeviceInfoUtil.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.core.w0 */
/* loaded from: classes2.dex */
public final class C9319w0 {

    /* renamed from: a */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile C9319w0 f36115a;

    /* renamed from: b */
    private final Context f36116b;

    /* renamed from: c */
    private final SentryAndroidOptions f36117c;

    /* renamed from: d */
    private final C9311s0 f36118d;

    /* renamed from: e */
    private final Boolean f36119e;

    /* renamed from: f */
    private final C9313t0.a f36120f;

    /* renamed from: g */
    private final C9519k f36121g;

    /* renamed from: h */
    private final Long f36122h;

    /* compiled from: DeviceInfoUtil.java */
    /* renamed from: io.sentry.android.core.w0$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f36123a;

        static {
            int[] iArr = new int[C9281k.a.values().length];
            f36123a = iArr;
            try {
                iArr[C9281k.a.NOT_CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36123a[C9281k.a.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C9319w0(Context context, SentryAndroidOptions sentryAndroidOptions) {
        this.f36116b = context;
        this.f36117c = sentryAndroidOptions;
        C9311s0 c9311s0 = new C9311s0(sentryAndroidOptions.getLogger());
        this.f36118d = c9311s0;
        C9283m.m30288a().m30290c();
        this.f36121g = m30469B();
        this.f36119e = c9311s0.m30408f();
        this.f36120f = C9313t0.m30424p(context, sentryAndroidOptions.getLogger(), c9311s0);
        ActivityManager.MemoryInfo m30416h = C9313t0.m30416h(context, sentryAndroidOptions.getLogger());
        if (m30416h != null) {
            this.f36122h = m30461q(m30416h);
        } else {
            this.f36122h = null;
        }
    }

    /* renamed from: A */
    private boolean m30444A() {
        String externalStorageState = Environment.getExternalStorageState();
        return ("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) && !Environment.isExternalStorageEmulated();
    }

    /* renamed from: C */
    private void m30445C(C9513e c9513e, boolean z) {
        Intent m30448d = m30448d();
        if (m30448d != null) {
            c9513e.m31311N(m30449e(m30448d));
            c9513e.m31315R(m30468z(m30448d));
            c9513e.m31312O(m30450f(m30448d));
        }
        int i2 = a.f36123a[C9281k.m30281b(this.f36116b, this.f36117c.getLogger()).ordinal()];
        c9513e.m31331h0(i2 != 1 ? i2 != 2 ? null : Boolean.TRUE : Boolean.FALSE);
        ActivityManager.MemoryInfo m30416h = C9313t0.m30416h(this.f36116b, this.f36117c.getLogger());
        if (m30416h != null && z) {
            c9513e.m31320W(Long.valueOf(m30416h.availMem));
            c9513e.m31325b0(Boolean.valueOf(m30416h.lowMemory));
        }
        File externalFilesDir = this.f36116b.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            StatFs statFs = new StatFs(externalFilesDir.getPath());
            c9513e.m31340q0(m30465w(statFs));
            c9513e.m31321X(m30467y(statFs));
        }
        StatFs m30459o = m30459o(externalFilesDir);
        if (m30459o != null) {
            c9513e.m31318U(m30464v(m30459o));
            c9513e.m31317T(m30466x(m30459o));
        }
        if (c9513e.m31306I() == null) {
            c9513e.m31316S(C9281k.m30282c(this.f36116b, this.f36117c.getLogger(), this.f36118d));
        }
    }

    /* renamed from: b */
    private int m30446b(StatFs statFs) {
        return statFs.getAvailableBlocks();
    }

    /* renamed from: c */
    private long m30447c(StatFs statFs) {
        return this.f36118d.m30406d() >= 18 ? statFs.getAvailableBlocksLong() : m30446b(statFs);
    }

    /* renamed from: d */
    private Intent m30448d() {
        return C9313t0.m30423o(this.f36116b, this.f36118d, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    /* renamed from: e */
    private Float m30449e(Intent intent) {
        try {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra != -1 && intExtra2 != -1) {
                return Float.valueOf((intExtra / intExtra2) * 100.0f);
            }
            return null;
        } catch (Throwable th) {
            this.f36117c.getLogger().mo30213b(EnumC9554s4.ERROR, "Error getting device battery level.", th);
            return null;
        }
    }

    /* renamed from: f */
    private Float m30450f(Intent intent) {
        try {
            int intExtra = intent.getIntExtra("temperature", -1);
            if (intExtra != -1) {
                return Float.valueOf(intExtra / 10.0f);
            }
            return null;
        } catch (Throwable th) {
            this.f36117c.getLogger().mo30213b(EnumC9554s4.ERROR, "Error getting battery temperature.", th);
            return null;
        }
    }

    /* renamed from: g */
    private int m30451g(StatFs statFs) {
        return statFs.getBlockCount();
    }

    /* renamed from: h */
    private long m30452h(StatFs statFs) {
        return this.f36118d.m30406d() >= 18 ? statFs.getBlockCountLong() : m30451g(statFs);
    }

    /* renamed from: i */
    private int m30453i(StatFs statFs) {
        return statFs.getBlockSize();
    }

    /* renamed from: j */
    private long m30454j(StatFs statFs) {
        return this.f36118d.m30406d() >= 18 ? statFs.getBlockSizeLong() : m30453i(statFs);
    }

    /* renamed from: k */
    private Date m30455k() {
        try {
            return C9211a1.m30009d(System.currentTimeMillis() - SystemClock.elapsedRealtime());
        } catch (IllegalArgumentException e2) {
            this.f36117c.getLogger().mo30212a(EnumC9554s4.ERROR, e2, "Error getting the device's boot time.", new Object[0]);
            return null;
        }
    }

    /* renamed from: l */
    private String m30456l() {
        try {
            return C9229a1.m30148a(this.f36116b);
        } catch (Throwable th) {
            this.f36117c.getLogger().mo30213b(EnumC9554s4.ERROR, "Error getting installationId.", th);
            return null;
        }
    }

    /* renamed from: m */
    private File[] m30457m() {
        if (this.f36118d.m30406d() >= 19) {
            return this.f36116b.getExternalFilesDirs(null);
        }
        File externalFilesDir = this.f36116b.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            return new File[]{externalFilesDir};
        }
        return null;
    }

    /* renamed from: n */
    private File m30458n(File file) {
        File[] m30457m = m30457m();
        if (m30457m != null) {
            String absolutePath = file != null ? file.getAbsolutePath() : null;
            for (File file2 : m30457m) {
                if (file2 != null && (absolutePath == null || absolutePath.isEmpty() || !file2.getAbsolutePath().contains(absolutePath))) {
                    return file2;
                }
            }
        } else {
            this.f36117c.getLogger().mo30214c(EnumC9554s4.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
        }
        return null;
    }

    /* renamed from: o */
    private StatFs m30459o(File file) {
        if (m30444A()) {
            this.f36117c.getLogger().mo30214c(EnumC9554s4.INFO, "External storage is not mounted or emulated.", new Object[0]);
            return null;
        }
        File m30458n = m30458n(file);
        if (m30458n != null) {
            return new StatFs(m30458n.getPath());
        }
        this.f36117c.getLogger().mo30214c(EnumC9554s4.INFO, "Not possible to read external files directory", new Object[0]);
        return null;
    }

    /* renamed from: p */
    public static C9319w0 m30460p(Context context, SentryAndroidOptions sentryAndroidOptions) {
        if (f36115a == null) {
            synchronized (C9319w0.class) {
                if (f36115a == null) {
                    f36115a = new C9319w0(context.getApplicationContext(), sentryAndroidOptions);
                }
            }
        }
        return f36115a;
    }

    /* renamed from: q */
    private Long m30461q(ActivityManager.MemoryInfo memoryInfo) {
        return this.f36118d.m30406d() >= 16 ? Long.valueOf(memoryInfo.totalMem) : Long.valueOf(Runtime.getRuntime().totalMemory());
    }

    /* renamed from: s */
    private C9513e.b m30462s() {
        C9513e.b bVar;
        Throwable th;
        try {
            bVar = C9285o.m30292a(this.f36116b.getResources().getConfiguration().orientation);
            if (bVar == null) {
                try {
                    this.f36117c.getLogger().mo30214c(EnumC9554s4.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    this.f36117c.getLogger().mo30213b(EnumC9554s4.ERROR, "Error getting device orientation.", th);
                    return bVar;
                }
            }
        } catch (Throwable th3) {
            bVar = null;
            th = th3;
        }
        return bVar;
    }

    /* renamed from: u */
    private TimeZone m30463u() {
        if (this.f36118d.m30406d() >= 24) {
            LocaleList locales = this.f36116b.getResources().getConfiguration().getLocales();
            if (!locales.isEmpty()) {
                return Calendar.getInstance(locales.get(0)).getTimeZone();
            }
        }
        return Calendar.getInstance().getTimeZone();
    }

    /* renamed from: v */
    private Long m30464v(StatFs statFs) {
        try {
            return Long.valueOf(m30452h(statFs) * m30454j(statFs));
        } catch (Throwable th) {
            this.f36117c.getLogger().mo30213b(EnumC9554s4.ERROR, "Error getting total external storage amount.", th);
            return null;
        }
    }

    /* renamed from: w */
    private Long m30465w(StatFs statFs) {
        try {
            return Long.valueOf(m30452h(statFs) * m30454j(statFs));
        } catch (Throwable th) {
            this.f36117c.getLogger().mo30213b(EnumC9554s4.ERROR, "Error getting total internal storage amount.", th);
            return null;
        }
    }

    /* renamed from: x */
    private Long m30466x(StatFs statFs) {
        try {
            return Long.valueOf(m30447c(statFs) * m30454j(statFs));
        } catch (Throwable th) {
            this.f36117c.getLogger().mo30213b(EnumC9554s4.ERROR, "Error getting unused external storage amount.", th);
            return null;
        }
    }

    /* renamed from: y */
    private Long m30467y(StatFs statFs) {
        try {
            return Long.valueOf(m30447c(statFs) * m30454j(statFs));
        } catch (Throwable th) {
            this.f36117c.getLogger().mo30213b(EnumC9554s4.ERROR, "Error getting unused internal storage amount.", th);
            return null;
        }
    }

    /* renamed from: z */
    private Boolean m30468z(Intent intent) {
        try {
            int intExtra = intent.getIntExtra("plugged", -1);
            boolean z = true;
            if (intExtra != 1 && intExtra != 2) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            this.f36117c.getLogger().mo30213b(EnumC9554s4.ERROR, "Error getting device charging state.", th);
            return null;
        }
    }

    /* renamed from: B */
    protected C9519k m30469B() {
        C9519k c9519k = new C9519k();
        c9519k.m31391j("Android");
        c9519k.m31394m(Build.VERSION.RELEASE);
        c9519k.m31389h(Build.DISPLAY);
        String m30415g = C9313t0.m30415g(this.f36117c.getLogger());
        if (m30415g != null) {
            c9519k.m31390i(m30415g);
        }
        if (this.f36117c.isEnableRootCheck()) {
            c9519k.m31392k(Boolean.valueOf(new C9288r(this.f36116b, this.f36118d, this.f36117c.getLogger()).m30303e()));
        }
        return c9519k;
    }

    /* renamed from: a */
    public C9513e m30470a(boolean z, boolean z2) {
        C9513e c9513e = new C9513e();
        if (this.f36117c.isSendDefaultPii()) {
            c9513e.m31330g0(C9313t0.m30412d(this.f36116b, this.f36118d));
        }
        c9513e.m31326c0(Build.MANUFACTURER);
        c9513e.m31314Q(Build.BRAND);
        c9513e.m31319V(C9313t0.m30414f(this.f36117c.getLogger()));
        c9513e.m31328e0(Build.MODEL);
        c9513e.m31329f0(Build.ID);
        c9513e.m31310M(C9313t0.m30411c(this.f36118d));
        c9513e.m31332i0(m30462s());
        Boolean bool = this.f36119e;
        if (bool != null) {
            c9513e.m31339p0(bool);
        }
        DisplayMetrics m30413e = C9313t0.m30413e(this.f36116b, this.f36117c.getLogger());
        if (m30413e != null) {
            c9513e.m31338o0(Integer.valueOf(m30413e.widthPixels));
            c9513e.m31337n0(Integer.valueOf(m30413e.heightPixels));
            c9513e.m31335l0(Float.valueOf(m30413e.density));
            c9513e.m31336m0(Integer.valueOf(m30413e.densityDpi));
        }
        c9513e.m31313P(m30455k());
        c9513e.m31341r0(m30463u());
        if (c9513e.m31307J() == null) {
            c9513e.m31322Y(m30456l());
        }
        Locale locale = Locale.getDefault();
        if (c9513e.m31308K() == null) {
            c9513e.m31323Z(locale.getLanguage());
        }
        if (c9513e.m31309L() == null) {
            c9513e.m31324a0(locale.toString());
        }
        List<Integer> m30290c = C9283m.m30288a().m30290c();
        if (!m30290c.isEmpty()) {
            c9513e.m31334k0(Double.valueOf(((Integer) Collections.max(m30290c)).doubleValue()));
            c9513e.m31333j0(Integer.valueOf(m30290c.size()));
        }
        c9513e.m31327d0(this.f36122h);
        if (z && this.f36117c.isCollectAdditionalContext()) {
            m30445C(c9513e, z2);
        }
        return c9513e;
    }

    /* renamed from: r */
    public C9519k m30471r() {
        return this.f36121g;
    }

    /* renamed from: t */
    public C9313t0.a m30472t() {
        return this.f36120f;
    }
}
