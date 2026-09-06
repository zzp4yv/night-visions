package com.google.android.gms.internal.ads;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.impl.C6265R;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzaxi {

    /* renamed from: a */
    public static final Handler f22654a = new zzaxa(Looper.getMainLooper());

    /* renamed from: f */
    private String f22659f;

    /* renamed from: b */
    private AtomicReference<Pattern> f22655b = new AtomicReference<>(null);

    /* renamed from: c */
    private AtomicReference<Pattern> f22656c = new AtomicReference<>(null);

    /* renamed from: d */
    private boolean f22657d = true;

    /* renamed from: e */
    private final Object f22658e = new Object();

    /* renamed from: g */
    private boolean f22660g = false;

    /* renamed from: h */
    private boolean f22661h = false;

    /* renamed from: A */
    public static boolean m17121A(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode()) {
                        return true;
                    }
                    PowerManager powerManager = (PowerManager) context.getSystemService("power");
                    return !(powerManager == null ? false : powerManager.isScreenOn());
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: B */
    public static int m17122B(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            return 0;
        }
        return applicationInfo.targetSdkVersion;
    }

    /* renamed from: C */
    private static KeyguardManager m17123C(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    @TargetApi(16)
    /* renamed from: D */
    public static boolean m17124D(Context context) {
        KeyguardManager m17123C;
        return context != null && PlatformVersion.m14639c() && (m17123C = m17123C(context)) != null && m17123C.isKeyguardLocked();
    }

    /* renamed from: E */
    public static boolean m17125E(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi2");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            zzbad.m17347c("Error loading class.", th);
            zzk.zzlk().m17052e(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    /* renamed from: F */
    public static String m17126F(Context context) {
        return !((Boolean) zzyt.m20848e().m16421c(zzacu.f21711T4)).booleanValue() ? HttpUrl.FRAGMENT_ENCODE_SET : context.getSharedPreferences("mobileads_consent", 0).getString("consent_string", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* renamed from: G */
    public static Bundle m17127G(Context context) {
        if (!((Boolean) zzyt.m20848e().m16421c(zzacu.f21717U4)).booleanValue()) {
            return null;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        Bundle bundle = new Bundle();
        if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
            bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
        }
        String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
        for (int i2 = 0; i2 < 4; i2++) {
            String str = strArr[i2];
            if (defaultSharedPreferences.contains(str)) {
                bundle.putString(str, defaultSharedPreferences.getString(str, null));
            }
        }
        return bundle;
    }

    /* renamed from: H */
    public static boolean m17128H(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    @TargetApi(18)
    /* renamed from: I */
    public static void m17129I(Context context, Intent intent) {
        if (intent != null && PlatformVersion.m14641e()) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            extras.putBinder("android.support.customtabs.extra.SESSION", null);
            extras.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(extras);
        }
    }

    /* renamed from: J */
    public static void m17130J(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            new zzazi(context, str, (String) obj).zzvi();
        }
    }

    /* renamed from: K */
    public static void m17131K(Context context, String str, String str2) {
        try {
            FileOutputStream openFileOutput = context.openFileOutput(str, 0);
            openFileOutput.write(str2.getBytes("UTF-8"));
            openFileOutput.close();
        } catch (Exception e2) {
            zzbad.m17347c("Error writing to file in internal storage.", e2);
        }
    }

    /* renamed from: L */
    public static WebResourceResponse m17132L(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", zzk.zzlg().m17177g0(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = new zzayu(context).m17258c(str2, hashMap).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
            return null;
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e2) {
            zzbad.m17348d("Could not fetch MRAID JS.", e2);
            return null;
        }
    }

    /* renamed from: M */
    public static WebResourceResponse m17133M(HttpURLConnection httpURLConnection) throws IOException {
        zzk.zzlg();
        String contentType = httpURLConnection.getContentType();
        boolean isEmpty = TextUtils.isEmpty(contentType);
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        String trim = isEmpty ? HttpUrl.FRAGMENT_ENCODE_SET : contentType.split(";")[0].trim();
        zzk.zzlg();
        String contentType2 = httpURLConnection.getContentType();
        if (!TextUtils.isEmpty(contentType2)) {
            String[] split = contentType2.split(";");
            if (split.length != 1) {
                int i2 = 1;
                while (true) {
                    if (i2 >= split.length) {
                        break;
                    }
                    if (split[i2].trim().startsWith("charset")) {
                        String[] split2 = split[i2].trim().split("=");
                        if (split2.length > 1) {
                            str = split2[1].trim();
                            break;
                        }
                    }
                    i2++;
                }
            }
        }
        String str2 = str;
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        HashMap hashMap = new HashMap(headerFields.size());
        for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null && entry.getValue().size() > 0) {
                hashMap.put(entry.getKey(), entry.getValue().get(0));
            }
        }
        return zzk.zzli().mo17195f(trim, str2, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
    }

    /* renamed from: O */
    public static void m17134O(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            zzaxg.m17119b(runnable);
        }
    }

    /* renamed from: P */
    public static int[] m17135P(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        return (window == null || (findViewById = window.findViewById(R.id.content)) == null) ? m17160l0() : new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    /* renamed from: Q */
    public static int m17136Q(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 22);
            sb.append("Could not parse value:");
            sb.append(valueOf);
            zzbad.m17353i(sb.toString());
            return 0;
        }
    }

    /* renamed from: R */
    public static boolean m17137R(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
    }

    /* renamed from: V */
    public static boolean m17138V(String str) {
        if (!zzazx.m17324a()) {
            return false;
        }
        if (!((Boolean) zzyt.m20848e().m16421c(zzacu.f21722V3)).booleanValue()) {
            return false;
        }
        String str2 = (String) zzyt.m20848e().m16421c(zzacu.f21734X3);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) zzyt.m20848e().m16421c(zzacu.f21728W3);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: X */
    public static Map<String, String> m17139X(Uri uri) {
        if (!((Boolean) zzyt.m20848e().m16421c(zzacu.f21768c5)).booleanValue()) {
            if (uri == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            zzk.zzli();
            for (String str : uri.getQueryParameterNames()) {
                hashMap.put(str, uri.getQueryParameter(str));
            }
            return hashMap;
        }
        if (uri == null) {
            return null;
        }
        HashMap hashMap2 = new HashMap(20);
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return hashMap2;
        }
        int length = encodedQuery.length();
        StringBuilder sb = new StringBuilder(100);
        StringBuilder sb2 = new StringBuilder(length);
        StringBuilder sb3 = sb;
        int i2 = 0;
        while (i2 < length) {
            char charAt = encodedQuery.charAt(i2);
            if (charAt == '%') {
                byte[] bArr = new byte[(length - i2) / 3];
                int i3 = 0;
                while (i2 < length - 2 && charAt == '%') {
                    try {
                        bArr[i3] = (byte) ((m17141a(encodedQuery.charAt(i2 + 1)) << 4) + m17141a(encodedQuery.charAt(i2 + 2)));
                        i3++;
                    } catch (IllegalArgumentException unused) {
                    }
                    i2 += 3;
                    if (i2 < length) {
                        charAt = encodedQuery.charAt(i2);
                    }
                }
                try {
                    sb3.append(new String(bArr, 0, i3, "UTF-8"));
                } catch (UnsupportedEncodingException unused2) {
                }
                if (charAt != '%') {
                }
            } else if (charAt == '&') {
                if (sb.length() > 0 && sb3 != sb) {
                    hashMap2.put(sb.toString(), sb2.toString());
                    sb.setLength(0);
                    sb2.setLength(0);
                }
                sb3 = sb;
            } else if (charAt == '+') {
                sb3.append(' ');
            } else if (charAt != '=') {
                sb3.append(charAt);
            } else if (sb3 != sb2) {
                sb3 = sb2;
            } else {
                sb3.append(charAt);
            }
            i2++;
        }
        if (sb.length() > 0 && sb3 != sb) {
            hashMap2.put(sb.toString(), sb2.toString());
        }
        return hashMap2;
    }

    /* renamed from: Z */
    public static Bitmap m17140Z(View view) {
        view.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return createBitmap;
    }

    /* renamed from: a */
    private static int m17141a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        char c3 = 'A';
        if (c2 < 'A' || c2 > 'F') {
            c3 = 'a';
            if (c2 < 'a' || c2 > 'f') {
                throw new IllegalArgumentException("Invalid Hex.");
            }
        }
        return (c2 - c3) + 10;
    }

    /* renamed from: a0 */
    public static Bitmap m17142a0(View view) {
        if (view == null) {
            return null;
        }
        Bitmap m17146c0 = m17146c0(view);
        return m17146c0 == null ? m17144b0(view) : m17146c0;
    }

    /* renamed from: b */
    public static DisplayMetrics m17143b(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* renamed from: b0 */
    private static Bitmap m17144b0(View view) {
        try {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width != 0 && height != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                Canvas canvas = new Canvas(createBitmap);
                view.layout(0, 0, width, height);
                view.draw(canvas);
                return createBitmap;
            }
            zzbad.m17353i("Width or height of view is zero");
            return null;
        } catch (RuntimeException e2) {
            zzbad.m17347c("Fail to capture the webview", e2);
            return null;
        }
    }

    /* renamed from: c */
    public static PopupWindow m17145c(View view, int i2, int i3, boolean z) {
        return new PopupWindow(view, i2, i3, false);
    }

    /* renamed from: c0 */
    private static Bitmap m17146c0(View view) {
        try {
            boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
            view.setDrawingCacheEnabled(true);
            Bitmap drawingCache = view.getDrawingCache();
            r0 = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
            view.setDrawingCacheEnabled(isDrawingCacheEnabled);
        } catch (RuntimeException e2) {
            zzbad.m17347c("Fail to capture the web view", e2);
        }
        return r0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016 A[RETURN] */
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m17148d0(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 == 0) goto L12
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L12
            android.app.Activity r2 = (android.app.Activity) r2
            goto L13
        L12:
            r2 = r0
        L13:
            r1 = 0
            if (r2 != 0) goto L17
            return r1
        L17:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L22:
            if (r0 == 0) goto L2d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L2d
            r2 = 1
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaxi.m17148d0(android.view.View):boolean");
    }

    /* renamed from: e0 */
    public static int m17150e0(View view) {
        if (view == null) {
            return -1;
        }
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof AdapterView)) {
            parent = parent.getParent();
        }
        if (parent == null) {
            return -1;
        }
        return ((AdapterView) parent).getPositionForView(view);
    }

    /* renamed from: f */
    public static String m17151f(InputStreamReader inputStreamReader) throws IOException {
        StringBuilder sb = new StringBuilder(8192);
        char[] cArr = new char[RecyclerView.AbstractC0599l.FLAG_MOVED];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, read);
        }
    }

    /* renamed from: f0 */
    public static boolean m17152f0(Context context, String str) {
        Context m16926f = zzasq.m16926f(context);
        return Wrappers.m14674a(m16926f).m14668b(str, m16926f.getPackageName()) == 0;
    }

    /* renamed from: g */
    private final JSONArray m17153g(Collection<?> collection) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            m17163o(jSONArray, it.next());
        }
        return jSONArray;
    }

    /* renamed from: h0 */
    public static String m17154h0(Context context, String str) {
        try {
            return new String(IOUtils.m14633d(context.openFileInput(str), true), "UTF-8");
        } catch (IOException unused) {
            zzbad.m17349e("Error reading from internal storage.");
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    /* renamed from: i */
    public static void m17155i(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    /* renamed from: i0 */
    private static String m17156i0() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    @TargetApi(18)
    /* renamed from: j */
    public static void m17157j(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            m17129I(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(uri2).length() + 26);
            sb.append("Opening ");
            sb.append(uri2);
            sb.append(" in a new browser.");
            zzbad.m17349e(sb.toString());
        } catch (ActivityNotFoundException e2) {
            zzbad.m17347c("No browser is found.", e2);
        }
    }

    /* renamed from: j0 */
    public static String m17158j0() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: k0 */
    public static String m17159k0() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + str2.length());
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: l0 */
    private static int[] m17160l0() {
        return new int[]{0, 0};
    }

    /* renamed from: m0 */
    public static String m17161m0() {
        Resources m17050b = zzk.zzlk().m17050b();
        return m17050b != null ? m17050b.getString(C6265R.string.f16871s7) : "Test Ad";
    }

    /* renamed from: n */
    public static void m17162n(Context context, Throwable th) {
        if (context == null) {
            return;
        }
        boolean z = false;
        try {
            z = ((Boolean) zzyt.m20848e().m16421c(zzacu.f21826m)).booleanValue();
        } catch (IllegalStateException unused) {
        }
        if (z) {
            CrashUtils.m14619a(context, th);
        }
    }

    /* renamed from: o */
    private final void m17163o(JSONArray jSONArray, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONArray.put(m17171N((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONArray.put(m17176Y((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONArray.put(m17153g((Collection) obj));
            return;
        }
        if (!(obj instanceof Object[])) {
            jSONArray.put(obj);
            return;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (Object obj2 : (Object[]) obj) {
            m17163o(jSONArray2, obj2);
        }
        jSONArray.put(jSONArray2);
    }

    /* renamed from: p */
    private final void m17164p(JSONObject jSONObject, String str, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONObject.put(str, m17171N((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONObject.put(str, m17176Y((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            if (str == null) {
                str = "null";
            }
            jSONObject.put(str, m17153g((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, m17153g(Arrays.asList((Object[]) obj)));
        } else {
            jSONObject.put(str, obj);
        }
    }

    /* renamed from: t */
    private static boolean m17166t(String str, AtomicReference<Pattern> atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    @VisibleForTesting
    /* renamed from: w */
    protected static String m17167w(Context context) {
        try {
            return new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return m17156i0();
        }
    }

    /* renamed from: x */
    public static AlertDialog.Builder m17168x(Context context) {
        return new AlertDialog.Builder(context);
    }

    /* renamed from: y */
    public static zzacf m17169y(Context context) {
        return new zzacf(context);
    }

    /* renamed from: z */
    public static String m17170z(Context context) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        ComponentName componentName;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && (componentName = runningTaskInfo.topActivity) != null) {
                return componentName.getClassName();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: N */
    public final JSONObject m17171N(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            m17164p(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    /* renamed from: S */
    public final int[] m17172S(Activity activity) {
        int[] m17135P = m17135P(activity);
        return new int[]{zzyt.m20844a().m17323j(activity, m17135P[0]), zzyt.m20844a().m17323j(activity, m17135P[1])};
    }

    /* renamed from: T */
    public final boolean m17173T(String str) {
        return m17166t(str, this.f22655b, (String) zzyt.m20848e().m16421c(zzacu.f21593A0));
    }

    /* renamed from: U */
    public final boolean m17174U(String str) {
        return m17166t(str, this.f22656c, (String) zzyt.m20848e().m16421c(zzacu.f21599B0));
    }

    /* renamed from: W */
    public final int[] m17175W(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        int[] m17160l0 = (window == null || (findViewById = window.findViewById(R.id.content)) == null) ? m17160l0() : new int[]{findViewById.getTop(), findViewById.getBottom()};
        return new int[]{zzyt.m20844a().m17323j(activity, m17160l0[0]), zzyt.m20844a().m17323j(activity, m17160l0[1])};
    }

    /* renamed from: Y */
    public final JSONObject m17176Y(Map<String, ?> map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                m17164p(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            throw new JSONException(valueOf.length() != 0 ? "Could not convert map to JSON: ".concat(valueOf) : new String("Could not convert map to JSON: "));
        }
    }

    /* renamed from: g0 */
    public final String m17177g0(Context context, String str) {
        synchronized (this.f22658e) {
            String str2 = this.f22659f;
            if (str2 != null) {
                return str2;
            }
            if (str == null) {
                return m17156i0();
            }
            try {
                this.f22659f = zzk.zzli().mo17190a(context);
            } catch (Exception unused) {
            }
            if (TextUtils.isEmpty(this.f22659f)) {
                zzyt.m20844a();
                if (zzazt.m17318w()) {
                    this.f22659f = m17167w(context);
                } else {
                    this.f22659f = null;
                    f22654a.post(new RunnableC6628f5(this, context));
                    while (this.f22659f == null) {
                        try {
                            this.f22658e.wait();
                        } catch (InterruptedException unused2) {
                            String m17156i0 = m17156i0();
                            this.f22659f = m17156i0;
                            String valueOf = String.valueOf(m17156i0);
                            zzbad.m17353i(valueOf.length() != 0 ? "Interrupted, use default user agent: ".concat(valueOf) : new String("Interrupted, use default user agent: "));
                        }
                    }
                }
            }
            String valueOf2 = String.valueOf(this.f22659f);
            StringBuilder sb = new StringBuilder(valueOf2.length() + 10 + str.length());
            sb.append(valueOf2);
            sb.append(" (Mobile; ");
            sb.append(str);
            this.f22659f = sb.toString();
            try {
                if (Wrappers.m14674a(context).m14672f()) {
                    this.f22659f = String.valueOf(this.f22659f).concat(";aia");
                }
            } catch (Exception e2) {
                zzk.zzlk().m17052e(e2, "AdUtil.getUserAgent");
            }
            String concat = String.valueOf(this.f22659f).concat(")");
            this.f22659f = concat;
            return concat;
        }
    }

    /* renamed from: h */
    public final JSONObject m17178h(Bundle bundle, JSONObject jSONObject) {
        if (bundle != null) {
            try {
                return m17171N(bundle);
            } catch (JSONException e2) {
                zzbad.m17347c("Error converting Bundle to JSON", e2);
            }
        }
        return null;
    }

    /* renamed from: k */
    public final void m17179k(Context context, String str, WebSettings webSettings) {
        webSettings.setUserAgentString(m17177g0(context, str));
    }

    /* renamed from: l */
    public final void m17180l(Context context, String str, String str2, Bundle bundle, boolean z) {
        zzk.zzlg();
        bundle.putString("device", m17159k0());
        bundle.putString("eids", TextUtils.join(",", zzacu.m16425c()));
        zzyt.m20844a();
        zzazt.m17303e(context, str, str2, bundle, true, new C6665g5(this, context, str));
    }

    /* renamed from: m */
    public final void m17181m(Context context, String str, boolean z, HttpURLConnection httpURLConnection) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty("User-Agent", m17177g0(context, str));
        httpURLConnection.setUseCaches(false);
    }

    /* renamed from: q */
    public final boolean m17182q(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return m17183r(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, m17123C(context));
    }

    /* renamed from: r */
    public final boolean m17183r(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z;
        if (!zzk.zzlg().f22657d) {
            if ((keyguardManager == null ? false : keyguardManager.inKeyguardRestrictedInputMode()) && !m17148d0(view)) {
                z = false;
                if (view.getVisibility() == 0 && view.isShown()) {
                    if ((powerManager != null || powerManager.isScreenOn()) && z) {
                        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21678O1)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        z = true;
        if (view.getVisibility() == 0) {
            if (powerManager != null || powerManager.isScreenOn()) {
                if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21678O1)).booleanValue()) {
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: u */
    public final boolean m17184u(Context context) {
        if (this.f22660g) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.getApplicationContext().registerReceiver(new C6739i5(this, null), intentFilter);
        this.f22660g = true;
        return true;
    }

    /* renamed from: v */
    public final boolean m17185v(Context context) {
        if (this.f22661h) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        context.getApplicationContext().registerReceiver(new C6702h5(this, null), intentFilter);
        this.f22661h = true;
        return true;
    }
}
