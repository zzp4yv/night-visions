package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.dataprovider.BuildConfig;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.search.SearchAdView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;

@zzard
/* loaded from: classes2.dex */
public final class zzazt {

    /* renamed from: a */
    public static final Handler f22735a = new zzdbh(Looper.getMainLooper());

    /* renamed from: b */
    private static final String f22736b = AdView.class.getName();

    /* renamed from: c */
    private static final String f22737c = InterstitialAd.class.getName();

    /* renamed from: d */
    private static final String f22738d = PublisherAdView.class.getName();

    /* renamed from: e */
    private static final String f22739e = PublisherInterstitialAd.class.getName();

    /* renamed from: f */
    private static final String f22740f = SearchAdView.class.getName();

    /* renamed from: g */
    private static final String f22741g = AdLoader.class.getName();

    /* renamed from: h */
    private float f22742h = -1.0f;

    /* renamed from: a */
    public static int m17300a(Context context, int i2) {
        return m17301b(context.getResources().getDisplayMetrics(), i2);
    }

    /* renamed from: b */
    public static int m17301b(DisplayMetrics displayMetrics, int i2) {
        return (int) TypedValue.applyDimension(1, i2, displayMetrics);
    }

    @VisibleForTesting
    /* renamed from: c */
    public static String m17302c(StackTraceElement[] stackTraceElementArr, String str) {
        int i2;
        int i3;
        String str2;
        while (true) {
            i3 = i2 + 1;
            if (i3 >= stackTraceElementArr.length) {
                str2 = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            String className = stackTraceElement.getClassName();
            i2 = ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (f22736b.equalsIgnoreCase(className) || f22737c.equalsIgnoreCase(className) || f22738d.equalsIgnoreCase(className) || f22739e.equalsIgnoreCase(className) || f22740f.equalsIgnoreCase(className) || f22741g.equalsIgnoreCase(className))) ? 0 : i3;
        }
        str2 = stackTraceElementArr[i3].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            int i4 = 2;
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                while (true) {
                    int i5 = i4 - 1;
                    if (i4 <= 0 || !stringTokenizer.hasMoreElements()) {
                        break;
                    }
                    sb.append(".");
                    sb.append(stringTokenizer.nextToken());
                    i4 = i5;
                }
                str = sb.toString();
            }
            if (str2 != null && !str2.contains(str)) {
                return str2;
            }
        }
        return null;
    }

    /* renamed from: e */
    public static void m17303e(Context context, String str, String str2, Bundle bundle, boolean z, zzazw zzazwVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            int m13825b = GoogleApiAvailabilityLight.m13823h().m13825b(context);
            StringBuilder sb = new StringBuilder(23);
            sb.append(m13825b);
            sb.append(".15000000");
            str = sb.toString();
        }
        bundle.putString("js", str);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme(BuildConfig.APTOIDE_WEB_SERVICES_SCHEME).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID, str2);
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        zzazwVar.mo15137a(appendQueryParameter.toString());
    }

    /* renamed from: g */
    private final void m17304g(ViewGroup viewGroup, zzyd zzydVar, String str, int i2, int i3) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i2);
        textView.setBackgroundColor(i3);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i2);
        int m17300a = m17300a(context, 3);
        frameLayout.addView(textView, new FrameLayout.LayoutParams(zzydVar.f27452k - m17300a, zzydVar.f27449h - m17300a, 17));
        viewGroup.addView(frameLayout, zzydVar.f27452k, zzydVar.f27449h);
    }

    /* renamed from: i */
    public static void m17305i(boolean z, HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setReadTimeout(60000);
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setUseCaches(false);
    }

    /* renamed from: k */
    public static int m17306k(DisplayMetrics displayMetrics, int i2) {
        return Math.round(i2 / displayMetrics.density);
    }

    /* renamed from: l */
    public static String m17307l(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || m17317v()) {
            string = "emulator";
        }
        return m17315t(string);
    }

    /* renamed from: m */
    public static String m17308m(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            return null;
        }
        return Settings.Secure.getString(contentResolver, "android_id");
    }

    /* renamed from: n */
    public static boolean m17309n(Context context) {
        int mo13813j = GoogleApiAvailabilityLight.m13823h().mo13813j(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        return mo13813j == 0 || mo13813j == 2;
    }

    /* renamed from: o */
    public static boolean m17310o(Context context) {
        if (context.getResources().getConfiguration().orientation != 2) {
            return false;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return ((int) (((float) displayMetrics.heightPixels) / displayMetrics.density)) < 600;
    }

    @TargetApi(17)
    /* renamed from: p */
    public static boolean m17311p(Context context) {
        int intValue;
        int intValue2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (PlatformVersion.m14640d()) {
            defaultDisplay.getRealMetrics(displayMetrics);
            intValue = displayMetrics.heightPixels;
            intValue2 = displayMetrics.widthPixels;
        } else {
            try {
                intValue = ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                intValue2 = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
            } catch (Exception unused) {
            }
        }
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics.heightPixels == intValue && displayMetrics.widthPixels == intValue2;
    }

    /* renamed from: q */
    public static int m17312q(Context context) {
        int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: r */
    public static Throwable m17313r(Throwable th) {
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21832n)).booleanValue()) {
            return th;
        }
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.push(th);
            th = th.getCause();
        }
        Throwable th2 = null;
        while (!linkedList.isEmpty()) {
            Throwable th3 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th3.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
            boolean z = false;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (m17316u(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                    z = true;
                } else {
                    String className = stackTraceElement.getClassName();
                    if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                        arrayList.add(stackTraceElement);
                    } else {
                        arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                    }
                }
            }
            if (z) {
                th2 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
        return th2;
    }

    /* renamed from: s */
    public static boolean m17314s(Context context, int i2) {
        return GoogleApiAvailabilityLight.m13823h().mo13813j(context, i2) == 0;
    }

    /* renamed from: t */
    public static String m17315t(String str) {
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    @VisibleForTesting
    /* renamed from: u */
    public static boolean m17316u(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith((String) zzyt.m20848e().m16421c(zzacu.f21838o))) {
            return true;
        }
        try {
            return Class.forName(str).isAnnotationPresent(zzard.class);
        } catch (Exception e2) {
            zzbad.m17346b(str.length() != 0 ? "Fail to check class type for class ".concat(str) : new String("Fail to check class type for class "), e2);
            return false;
        }
    }

    /* renamed from: v */
    public static boolean m17317v() {
        return Build.DEVICE.startsWith("generic");
    }

    /* renamed from: w */
    public static boolean m17318w() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: x */
    public static String m17319x() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    /* renamed from: d */
    public final void m17320d(Context context, String str, String str2, Bundle bundle, boolean z) {
        m17303e(context, str, str2, bundle, true, new C6629f6(this));
    }

    /* renamed from: f */
    public final void m17321f(ViewGroup viewGroup, zzyd zzydVar, String str) {
        m17304g(viewGroup, zzydVar, str, -16777216, -1);
    }

    /* renamed from: h */
    public final void m17322h(ViewGroup viewGroup, zzyd zzydVar, String str, String str2) {
        zzbad.m17353i(str2);
        m17304g(viewGroup, zzydVar, str, -65536, -16777216);
    }

    /* renamed from: j */
    public final int m17323j(Context context, int i2) {
        if (this.f22742h < 0.0f) {
            synchronized (this) {
                if (this.f22742h < 0.0f) {
                    Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics);
                    this.f22742h = displayMetrics.density;
                }
            }
        }
        return Math.round(i2 / this.f22742h);
    }
}
