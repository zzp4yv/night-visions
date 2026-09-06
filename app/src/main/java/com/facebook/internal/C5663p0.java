package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.database.room.RoomNotification;
import cm.aptoide.p092pt.dataprovider.BuildConfig;
import com.facebook.AccessToken;
import com.facebook.C5608a0;
import com.facebook.C5620d0;
import com.facebook.EnumC5622e0;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.internal.C5633a0;
import com.facebook.internal.C5663p0;
import com.facebook.p157o0.C5798j0;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.C10513u;
import kotlin.text.C10514v;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* compiled from: Utility.kt */
/* renamed from: com.facebook.internal.p0 */
/* loaded from: classes2.dex */
public final class C5663p0 {

    /* renamed from: b */
    private static int f14479b;

    /* renamed from: j */
    private static Locale f14487j;

    /* renamed from: a */
    public static final C5663p0 f14478a = new C5663p0();

    /* renamed from: c */
    private static long f14480c = -1;

    /* renamed from: d */
    private static long f14481d = -1;

    /* renamed from: e */
    private static long f14482e = -1;

    /* renamed from: f */
    private static String f14483f = HttpUrl.FRAGMENT_ENCODE_SET;

    /* renamed from: g */
    private static String f14484g = HttpUrl.FRAGMENT_ENCODE_SET;

    /* renamed from: h */
    private static String f14485h = "NoCarrier";

    /* renamed from: i */
    private static String f14486i = HttpUrl.FRAGMENT_ENCODE_SET;

    /* compiled from: Utility.kt */
    /* renamed from: com.facebook.internal.p0$a */
    public interface a {
        /* renamed from: a */
        void mo11259a(JSONObject jSONObject);

        /* renamed from: b */
        void mo11260b(FacebookException facebookException);
    }

    private C5663p0() {
    }

    /* renamed from: A */
    public static final JSONObject m11525A() {
        C5608a0 c5608a0 = C5608a0.f14199a;
        String string = C5608a0.m11284c().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
        if (string != null) {
            try {
                return new JSONObject(string);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: A0 */
    private final void m11526A0() {
        try {
            if (m11586p()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f14481d = statFs.getBlockCount() * statFs.getBlockSize();
            }
            f14481d = m11574j(f14481d);
        } catch (Exception unused) {
        }
    }

    /* renamed from: B0 */
    public static final void m11527B0(Runnable runnable) {
        try {
            C5608a0 c5608a0 = C5608a0.f14199a;
            C5608a0.m11292k().execute(runnable);
        } catch (Exception unused) {
        }
    }

    /* renamed from: C */
    public static final String m11528C(String str) {
        String m37507A;
        String m37507A2;
        C5608a0 c5608a0 = C5608a0.f14199a;
        String m11293l = C5608a0.m11293l();
        if (str == null) {
            return m11293l;
        }
        if (C9768m.m32341a(str, "gaming")) {
            m37507A2 = C10513u.m37507A(m11293l, "facebook.com", "fb.gg", false, 4, null);
            return m37507A2;
        }
        if (!C9768m.m32341a(str, "instagram")) {
            return m11293l;
        }
        m37507A = C10513u.m37507A(m11293l, "facebook.com", "instagram.com", false, 4, null);
        return m37507A;
    }

    /* renamed from: C0 */
    public static final void m11529C0(JSONObject jSONObject, C5664q c5664q, String str, boolean z, Context context) throws JSONException {
        C9768m.m32346f(jSONObject, "params");
        C9768m.m32346f(context, "context");
        C5633a0 c5633a0 = C5633a0.f14313a;
        C5633a0.b bVar = C5633a0.b.ServiceUpdateCompliance;
        if (!C5633a0.m11378g(bVar)) {
            jSONObject.put("anon_id", str);
        }
        jSONObject.put("application_tracking_enabled", !z);
        C5608a0 c5608a0 = C5608a0.f14199a;
        jSONObject.put("advertiser_id_collection_enabled", C5608a0.m11283b());
        if (c5664q != null) {
            if (C5633a0.m11378g(bVar)) {
                f14478a.m11556a(jSONObject, c5664q, str, context);
            }
            if (c5664q.m11620j() != null) {
                if (C5633a0.m11378g(bVar)) {
                    f14478a.m11558b(jSONObject, c5664q, context);
                } else {
                    jSONObject.put("attribution", c5664q.m11620j());
                }
            }
            if (c5664q.m11618h() != null) {
                jSONObject.put("advertiser_id", c5664q.m11618h());
                jSONObject.put("advertiser_tracking_enabled", !c5664q.m11621k());
            }
            if (!c5664q.m11621k()) {
                C5798j0 c5798j0 = C5798j0.f14968a;
                String m12262a = C5798j0.m12262a();
                if (!(m12262a.length() == 0)) {
                    jSONObject.put("ud", m12262a);
                }
            }
            if (c5664q.m11619i() != null) {
                jSONObject.put("installer_package", c5664q.m11619i());
            }
        }
    }

    /* renamed from: D */
    private final GraphRequest m11530D(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", m11541K(m11604z()));
        bundle.putString("access_token", str);
        GraphRequest m11237y = GraphRequest.f14159a.m11237y(null, null);
        m11237y.m11177H(bundle);
        m11237y.m11176G(EnumC5622e0.GET);
        return m11237y;
    }

    /* renamed from: D0 */
    public static final void m11531D0(JSONObject jSONObject, Context context) throws JSONException {
        Locale locale;
        String language;
        int i2;
        Display display;
        String country;
        PackageInfo packageInfo;
        C9768m.m32346f(jSONObject, "params");
        C9768m.m32346f(context, "appContext");
        JSONArray jSONArray = new JSONArray();
        C5663p0 c5663p0 = f14478a;
        jSONArray.put("a2");
        c5663p0.m11603y0(context);
        String packageName = context.getPackageName();
        int i3 = 0;
        int i4 = -1;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageInfo == null) {
            return;
        }
        i4 = packageInfo.versionCode;
        f14486i = packageInfo.versionName;
        jSONArray.put(packageName);
        jSONArray.put(i4);
        jSONArray.put(f14486i);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = context.getResources().getConfiguration().locale;
        } catch (Exception unused2) {
            locale = Locale.getDefault();
        }
        f14487j = locale;
        StringBuilder sb = new StringBuilder();
        Locale locale2 = f14487j;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        if (locale2 == null || (language = locale2.getLanguage()) == null) {
            language = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb.append(language);
        sb.append('_');
        Locale locale3 = f14487j;
        if (locale3 != null && (country = locale3.getCountry()) != null) {
            str = country;
        }
        sb.append(str);
        jSONArray.put(sb.toString());
        jSONArray.put(f14483f);
        jSONArray.put(f14485h);
        double d2 = 0.0d;
        try {
            display = null;
            if (Build.VERSION.SDK_INT >= 17) {
                Object systemService = context.getSystemService("display");
                DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
                if (displayManager != null) {
                    display = displayManager.getDisplay(0);
                }
            } else {
                Object systemService2 = context.getSystemService("window");
                WindowManager windowManager = systemService2 instanceof WindowManager ? (WindowManager) systemService2 : null;
                if (windowManager != null) {
                    display = windowManager.getDefaultDisplay();
                }
            }
        } catch (Exception unused3) {
        }
        if (display != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            display.getMetrics(displayMetrics);
            int i5 = displayMetrics.widthPixels;
            try {
                int i6 = displayMetrics.heightPixels;
                try {
                    d2 = displayMetrics.density;
                } catch (Exception unused4) {
                }
                i2 = i6;
                i3 = i5;
            } catch (Exception unused5) {
                i3 = i5;
            }
            jSONArray.put(i3);
            jSONArray.put(i2);
            jSONArray.put(new DecimalFormat("#.##").format(d2));
            jSONArray.put(f14478a.m11598v0());
            jSONArray.put(f14481d);
            jSONArray.put(f14482e);
            jSONArray.put(f14484g);
            jSONObject.put("extinfo", jSONArray.toString());
        }
        i2 = 0;
        jSONArray.put(i3);
        jSONArray.put(i2);
        jSONArray.put(new DecimalFormat("#.##").format(d2));
        jSONArray.put(f14478a.m11598v0());
        jSONArray.put(f14481d);
        jSONArray.put(f14482e);
        jSONArray.put(f14484g);
        jSONObject.put("extinfo", jSONArray.toString());
    }

    /* renamed from: E */
    public static final void m11532E(final String str, final a aVar) {
        C9768m.m32346f(str, "accessToken");
        C9768m.m32346f(aVar, "callback");
        C5657m0 c5657m0 = C5657m0.f14461a;
        JSONObject m11508a = C5657m0.m11508a(str);
        if (m11508a != null) {
            aVar.mo11259a(m11508a);
            return;
        }
        GraphRequest.InterfaceC5598b interfaceC5598b = new GraphRequest.InterfaceC5598b() { // from class: com.facebook.internal.k
            @Override // com.facebook.GraphRequest.InterfaceC5598b
            /* renamed from: b */
            public final void mo11196b(C5620d0 c5620d0) {
                C5663p0.m11534F(C5663p0.a.this, str, c5620d0);
            }
        };
        GraphRequest m11530D = f14478a.m11530D(str);
        m11530D.m11173D(interfaceC5598b);
        m11530D.m11180k();
    }

    /* renamed from: E0 */
    public static final String m11533E0(byte[] bArr) {
        C9768m.m32346f(bArr, "bytes");
        return f14478a.m11546Q("SHA-1", bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public static final void m11534F(a aVar, String str, C5620d0 c5620d0) {
        C9768m.m32346f(aVar, "$callback");
        C9768m.m32346f(str, "$accessToken");
        C9768m.m32346f(c5620d0, "response");
        if (c5620d0.m11338b() != null) {
            aVar.mo11260b(c5620d0.m11338b().m11143e());
            return;
        }
        C5657m0 c5657m0 = C5657m0.f14461a;
        JSONObject m11340d = c5620d0.m11340d();
        if (m11340d == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        C5657m0.m11509b(str, m11340d);
        aVar.mo11259a(c5620d0.m11340d());
    }

    /* renamed from: F0 */
    public static final String m11535F0(String str) {
        if (str == null) {
            return null;
        }
        return f14478a.m11545P("SHA-256", str);
    }

    /* renamed from: G0 */
    public static final void m11536G0(Parcel parcel, Map<String, String> map) {
        C9768m.m32346f(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            parcel.writeString(key);
            parcel.writeString(value);
        }
    }

    /* renamed from: H */
    public static final String m11537H(Context context) {
        C5665q0 c5665q0 = C5665q0.f14500a;
        C5665q0.m11642j(context, "context");
        C5608a0 c5608a0 = C5608a0.f14199a;
        return C5608a0.m11285d();
    }

    /* renamed from: H0 */
    public static final void m11538H0(Parcel parcel, Map<String, String> map) {
        C9768m.m32346f(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            parcel.writeString(key);
            parcel.writeString(value);
        }
    }

    /* renamed from: I */
    public static final Method m11539I(Class<?> cls, String str, Class<?>... clsArr) {
        C9768m.m32346f(cls, "clazz");
        C9768m.m32346f(str, "methodName");
        C9768m.m32346f(clsArr, "parameterTypes");
        try {
            return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: J */
    public static final Method m11540J(String str, String str2, Class<?>... clsArr) {
        C9768m.m32346f(str, "className");
        C9768m.m32346f(str2, "methodName");
        C9768m.m32346f(clsArr, "parameterTypes");
        try {
            Class<?> cls = Class.forName(str);
            C9768m.m32345e(cls, "clazz");
            return m11539I(cls, str2, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: K */
    private final String m11541K(String str) {
        return C9768m.m32341a(str, "instagram") ? "id,name,profile_picture" : "id,name,first_name,middle_name,last_name";
    }

    /* renamed from: L */
    public static final Locale m11542L() {
        try {
            C5608a0 c5608a0 = C5608a0.f14199a;
            return C5608a0.m11284c().getResources().getConfiguration().locale;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: M */
    public static final Object m11543M(JSONObject jSONObject, String str, String str2) throws JSONException {
        C9768m.m32346f(jSONObject, "jsonObject");
        Object opt = jSONObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt == null || (opt instanceof JSONObject) || (opt instanceof JSONArray)) {
            return opt;
        }
        if (str2 == null) {
            throw new FacebookException("Got an unexpected non-JSON object.");
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt(str2, opt);
        return jSONObject2;
    }

    /* renamed from: O */
    private final String m11544O(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        C9768m.m32345e(digest, "digest");
        int length = digest.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = digest[i2];
            i2++;
            sb.append(Integer.toHexString((b2 >> 4) & 15));
            sb.append(Integer.toHexString((b2 >> 0) & 15));
        }
        String sb2 = sb.toString();
        C9768m.m32345e(sb2, "builder.toString()");
        return sb2;
    }

    /* renamed from: P */
    private final String m11545P(String str, String str2) {
        Charset charset = Charsets.f40651b;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = str2.getBytes(charset);
        C9768m.m32345e(bytes, "(this as java.lang.String).getBytes(charset)");
        return m11546Q(str, bytes);
    }

    /* renamed from: Q */
    private final String m11546Q(String str, byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            C9768m.m32345e(messageDigest, "hash");
            return m11544O(messageDigest, bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: R */
    public static final Object m11547R(Object obj, Method method, Object... objArr) {
        C9768m.m32346f(method, "method");
        C9768m.m32346f(objArr, "args");
        try {
            return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: S */
    public static final boolean m11548S() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
            C5608a0 c5608a0 = C5608a0.f14199a;
            String format = String.format("fb%s://applinks", Arrays.copyOf(new Object[]{C5608a0.m11285d()}, 1));
            C9768m.m32345e(format, "java.lang.String.format(format, *args)");
            intent.setData(Uri.parse(format));
            Context m11284c = C5608a0.m11284c();
            PackageManager packageManager = m11284c.getPackageManager();
            String packageName = m11284c.getPackageName();
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            C9768m.m32345e(queryIntentActivities, "packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (it.hasNext()) {
                if (C9768m.m32341a(packageName, it.next().activityInfo.packageName)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: T */
    public static final boolean m11549T(Context context) {
        AutofillManager autofillManager;
        C9768m.m32346f(context, "context");
        return Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class)) != null && autofillManager.isAutofillSupported() && autofillManager.isEnabled();
    }

    /* renamed from: U */
    public static final boolean m11550U(Context context) {
        C9768m.m32346f(context, "context");
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String str = Build.DEVICE;
        if (str != null) {
            C9768m.m32345e(str, "DEVICE");
            if (new Regex(".+_cheets|cheets_.+").m37438b(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: V */
    public static final boolean m11551V(Uri uri) {
        return uri != null && C10513u.m37515q("content", uri.getScheme(), true);
    }

    /* renamed from: W */
    public static final boolean m11552W(AccessToken accessToken) {
        return accessToken != null && C9768m.m32341a(accessToken, AccessToken.f14054f.m11105e());
    }

    /* renamed from: X */
    public static final boolean m11553X() {
        JSONObject m11525A = m11525A();
        if (m11525A == null) {
            return false;
        }
        try {
            JSONArray jSONArray = m11525A.getJSONArray("data_processing_options");
            int length = jSONArray.length();
            if (length > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    String string = jSONArray.getString(i2);
                    C9768m.m32345e(string, "options.getString(i)");
                    String lowerCase = string.toLowerCase();
                    C9768m.m32345e(lowerCase, "(this as java.lang.String).toLowerCase()");
                    if (C9768m.m32341a(lowerCase, "ldu")) {
                        return true;
                    }
                    if (i3 >= length) {
                        break;
                    }
                    i2 = i3;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: Y */
    public static final boolean m11554Y(Uri uri) {
        return uri != null && C10513u.m37515q("file", uri.getScheme(), true);
    }

    /* renamed from: Z */
    private final boolean m11555Z(Context context) {
        Method m11540J = m11540J("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (m11540J == null) {
            return false;
        }
        Object m11547R = m11547R(null, m11540J, context);
        return (m11547R instanceof Integer) && C9768m.m32341a(m11547R, 0);
    }

    /* renamed from: a */
    private final void m11556a(JSONObject jSONObject, C5664q c5664q, String str, Context context) {
        if (Build.VERSION.SDK_INT < 31 || !m11555Z(context)) {
            jSONObject.put("anon_id", str);
        } else {
            if (c5664q.m11621k()) {
                return;
            }
            jSONObject.put("anon_id", str);
        }
    }

    /* renamed from: a0 */
    public static final boolean m11557a0(String str) {
        if (str != null) {
            if (!(str.length() == 0)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private final void m11558b(JSONObject jSONObject, C5664q c5664q, Context context) {
        if (Build.VERSION.SDK_INT < 31 || !m11555Z(context)) {
            jSONObject.put("attribution", c5664q.m11620j());
        } else {
            if (c5664q.m11621k()) {
                return;
            }
            jSONObject.put("attribution", c5664q.m11620j());
        }
    }

    /* renamed from: b0 */
    public static final boolean m11559b0(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    /* renamed from: c */
    public static final <T> boolean m11560c(T t, T t2) {
        return t == null ? t2 == null : C9768m.m32341a(t, t2);
    }

    /* renamed from: c0 */
    public static final boolean m11561c0(Uri uri) {
        return uri != null && (C10513u.m37515q("http", uri.getScheme(), true) || C10513u.m37515q(BuildConfig.APTOIDE_WEB_SERVICES_SCHEME, uri.getScheme(), true) || C10513u.m37515q("fbstaging", uri.getScheme(), true));
    }

    /* renamed from: d */
    public static final JSONObject m11562d(String str) {
        C9768m.m32346f(str, "accessToken");
        C5657m0 c5657m0 = C5657m0.f14461a;
        JSONObject m11508a = C5657m0.m11508a(str);
        if (m11508a != null) {
            return m11508a;
        }
        C5620d0 m11179j = f14478a.m11530D(str).m11179j();
        if (m11179j.m11338b() != null) {
            return null;
        }
        return m11179j.m11340d();
    }

    /* renamed from: d0 */
    public static final Set<String> m11563d0(JSONArray jSONArray) throws JSONException {
        C9768m.m32346f(jSONArray, "jsonArray");
        HashSet hashSet = new HashSet();
        int length = jSONArray.length();
        if (length > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                String string = jSONArray.getString(i2);
                C9768m.m32345e(string, "jsonArray.getString(i)");
                hashSet.add(string);
                if (i3 >= length) {
                    break;
                }
                i2 = i3;
            }
        }
        return hashSet;
    }

    /* renamed from: e */
    public static final Uri m11564e(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        Uri build = builder.build();
        C9768m.m32345e(build, "builder.build()");
        return build;
    }

    /* renamed from: e0 */
    public static final List<String> m11565e0(JSONArray jSONArray) throws JSONException {
        C9768m.m32346f(jSONArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        if (length > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                arrayList.add(jSONArray.getString(i2));
                if (i3 >= length) {
                    break;
                }
                i2 = i3;
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    private final void m11566f(Context context, String str) {
        List m37582v0;
        List m37582v02;
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        m37582v0 = C10514v.m37582v0(cookie, new String[]{";"}, false, 0, 6, null);
        Object[] array = m37582v0.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        String[] strArr = (String[]) array;
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            String str2 = strArr[i2];
            i2++;
            m37582v02 = C10514v.m37582v0(str2, new String[]{"="}, false, 0, 6, null);
            Object[] array2 = m37582v02.toArray(new String[0]);
            if (array2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr2 = (String[]) array2;
            if (strArr2.length > 0) {
                String str3 = strArr2[0];
                int length2 = str3.length() - 1;
                int i3 = 0;
                boolean z = false;
                while (i3 <= length2) {
                    boolean z2 = C9768m.m32348h(str3.charAt(!z ? i3 : length2), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        } else {
                            length2--;
                        }
                    } else if (z2) {
                        i3++;
                    } else {
                        z = true;
                    }
                }
                cookieManager.setCookie(str, C9768m.m32354n(str3.subSequence(i3, length2 + 1).toString(), "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;"));
            }
        }
        cookieManager.removeExpiredCookie();
    }

    /* renamed from: f0 */
    public static final Map<String, String> m11567f0(String str) {
        C9768m.m32346f(str, "str");
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                C9768m.m32345e(next, RoomNotification.KEY);
                String string = jSONObject.getString(next);
                C9768m.m32345e(string, "jsonObject.getString(key)");
                hashMap.put(next, string);
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    /* renamed from: g */
    public static final void m11568g(Context context) {
        C9768m.m32346f(context, "context");
        try {
            C5663p0 c5663p0 = f14478a;
            c5663p0.m11566f(context, "facebook.com");
            c5663p0.m11566f(context, ".facebook.com");
            c5663p0.m11566f(context, "https://facebook.com");
            c5663p0.m11566f(context, "https://.facebook.com");
        } catch (Exception unused) {
        }
    }

    /* renamed from: h */
    public static final void m11570h(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    /* renamed from: i */
    public static final String m11572i(String str, String str2) {
        return m11557a0(str) ? str2 : str;
    }

    /* renamed from: i0 */
    public static final void m11573i0(String str, Exception exc) {
        C5608a0 c5608a0 = C5608a0.f14199a;
        if (!C5608a0.m11302u() || str == null || exc == null) {
            return;
        }
        Log.d(str, exc.getClass().getSimpleName() + ": " + ((Object) exc.getMessage()));
    }

    /* renamed from: j */
    private final long m11574j(double d2) {
        return Math.round(d2 / 1.073741824E9d);
    }

    /* renamed from: j0 */
    public static final void m11575j0(String str, String str2) {
        C5608a0 c5608a0 = C5608a0.f14199a;
        if (!C5608a0.m11302u() || str == null || str2 == null) {
            return;
        }
        Log.d(str, str2);
    }

    /* renamed from: k */
    public static final List<String> m11576k(JSONArray jSONArray) {
        C9768m.m32346f(jSONArray, "jsonArray");
        try {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            int length = jSONArray.length();
            if (length <= 0) {
                return arrayList;
            }
            while (true) {
                int i3 = i2 + 1;
                String string = jSONArray.getString(i2);
                C9768m.m32345e(string, "jsonArray.getString(i)");
                arrayList.add(string);
                if (i3 >= length) {
                    return arrayList;
                }
                i2 = i3;
            }
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    /* renamed from: k0 */
    public static final void m11577k0(String str, String str2, Throwable th) {
        C5608a0 c5608a0 = C5608a0.f14199a;
        if (!C5608a0.m11302u() || m11557a0(str)) {
            return;
        }
        Log.d(str, str2, th);
    }

    /* renamed from: l */
    public static final Map<String, Object> m11578l(JSONObject jSONObject) {
        C9768m.m32346f(jSONObject, "jsonObject");
        HashMap hashMap = new HashMap();
        JSONArray names = jSONObject.names();
        if (names == null) {
            return hashMap;
        }
        int i2 = 0;
        int length = names.length();
        if (length > 0) {
            while (true) {
                int i3 = i2 + 1;
                try {
                    String string = names.getString(i2);
                    C9768m.m32345e(string, "keys.getString(i)");
                    Object obj = jSONObject.get(string);
                    if (obj instanceof JSONObject) {
                        obj = m11578l((JSONObject) obj);
                    }
                    C9768m.m32345e(obj, "value");
                    hashMap.put(string, obj);
                } catch (JSONException unused) {
                }
                if (i3 >= length) {
                    break;
                }
                i2 = i3;
            }
        }
        return hashMap;
    }

    /* renamed from: l0 */
    public static final String m11579l0(Map<String, String> map) {
        C9768m.m32346f(map, "map");
        boolean isEmpty = map.isEmpty();
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        if (!isEmpty) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                str = jSONObject.toString();
            } catch (JSONException unused) {
            }
            C9768m.m32345e(str, "{\n      try {\n        val jsonObject = JSONObject()\n        for ((key, value) in map) {\n          jsonObject.put(key, value)\n        }\n        jsonObject.toString()\n      } catch (_e: JSONException) {\n        \"\"\n      }\n    }");
        }
        return str;
    }

    /* renamed from: m */
    public static final Map<String, String> m11580m(JSONObject jSONObject) {
        C9768m.m32346f(jSONObject, "jsonObject");
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            if (optString != null) {
                C9768m.m32345e(next, RoomNotification.KEY);
                hashMap.put(next, optString);
            }
        }
        return hashMap;
    }

    /* renamed from: m0 */
    public static final String m11581m0(String str) {
        C9768m.m32346f(str, RoomNotification.KEY);
        return f14478a.m11545P("MD5", str);
    }

    /* renamed from: n */
    public static final int m11582n(InputStream inputStream, OutputStream outputStream) throws IOException {
        C9768m.m32346f(outputStream, "outputStream");
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
            try {
                byte[] bArr = new byte[8192];
                int i2 = 0;
                while (true) {
                    int read = bufferedInputStream2.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                    i2 += read;
                }
                bufferedInputStream2.close();
                if (inputStream != null) {
                    inputStream.close();
                }
                return i2;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: n0 */
    public static final boolean m11583n0(Context context) {
        C9768m.m32346f(context, "context");
        return m11549T(context);
    }

    /* renamed from: o */
    public static final void m11584o(URLConnection uRLConnection) {
        if (uRLConnection == null || !(uRLConnection instanceof HttpURLConnection)) {
            return;
        }
        ((HttpURLConnection) uRLConnection).disconnect();
    }

    /* renamed from: o0 */
    public static final Bundle m11585o0(String str) {
        List m37582v0;
        List m37582v02;
        Bundle bundle = new Bundle();
        if (!m11557a0(str)) {
            if (str == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            m37582v0 = C10514v.m37582v0(str, new String[]{"&"}, false, 0, 6, null);
            Object[] array = m37582v0.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            int length = strArr.length;
            int i2 = 0;
            while (i2 < length) {
                String str2 = strArr[i2];
                i2++;
                m37582v02 = C10514v.m37582v0(str2, new String[]{"="}, false, 0, 6, null);
                Object[] array2 = m37582v02.toArray(new String[0]);
                if (array2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr2 = (String[]) array2;
                try {
                    if (strArr2.length == 2) {
                        bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), URLDecoder.decode(strArr2[1], "UTF-8"));
                    } else if (strArr2.length == 1) {
                        bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), HttpUrl.FRAGMENT_ENCODE_SET);
                    }
                } catch (UnsupportedEncodingException e2) {
                    m11573i0("FacebookSDK", e2);
                }
            }
        }
        return bundle;
    }

    /* renamed from: p */
    private final boolean m11586p() {
        return C9768m.m32341a("mounted", Environment.getExternalStorageState());
    }

    /* renamed from: p0 */
    public static final boolean m11587p0(Bundle bundle, String str, Object obj) {
        C9768m.m32346f(bundle, "bundle");
        if (obj == null) {
            bundle.remove(str);
            return true;
        }
        if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return true;
        }
        if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
            return true;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Number) obj).doubleValue());
            return true;
        }
        if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
            return true;
        }
        if (obj instanceof Integer) {
            bundle.putInt(str, ((Number) obj).intValue());
            return true;
        }
        if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
            return true;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Number) obj).longValue());
            return true;
        }
        if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
            return true;
        }
        if (obj instanceof String) {
            bundle.putString(str, (String) obj);
            return true;
        }
        if (obj instanceof JSONArray) {
            bundle.putString(str, ((JSONArray) obj).toString());
            return true;
        }
        if (!(obj instanceof JSONObject)) {
            return false;
        }
        bundle.putString(str, ((JSONObject) obj).toString());
        return true;
    }

    /* renamed from: q */
    public static final String m11588q(int i2) {
        String bigInteger = new BigInteger(i2 * 5, new Random()).toString(32);
        C9768m.m32345e(bigInteger, "BigInteger(length * 5, r).toString(32)");
        return bigInteger;
    }

    /* renamed from: q0 */
    public static final void m11589q0(Bundle bundle, String str, String str2) {
        C9768m.m32346f(bundle, "b");
        if (m11557a0(str2)) {
            return;
        }
        bundle.putString(str, str2);
    }

    /* renamed from: r */
    public static final String m11590r(Context context) {
        if (context == null) {
            return "null";
        }
        if (context == context.getApplicationContext()) {
            return "unknown";
        }
        String simpleName = context.getClass().getSimpleName();
        C9768m.m32345e(simpleName, "{\n      context.javaClass.simpleName\n    }");
        return simpleName;
    }

    /* renamed from: r0 */
    public static final Map<String, String> m11591r0(Parcel parcel) {
        C9768m.m32346f(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        int i2 = 0;
        if (readInt > 0) {
            do {
                i2++;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (readString != null && readString2 != null) {
                    hashMap.put(readString, readString2);
                }
            } while (i2 < readInt);
        }
        return hashMap;
    }

    /* renamed from: s */
    public static final String m11592s(Context context) {
        String string;
        C9768m.m32346f(context, "context");
        try {
            C5608a0 c5608a0 = C5608a0.f14199a;
            String m11286e = C5608a0.m11286e();
            if (m11286e != null) {
                return m11286e;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i2 = applicationInfo.labelRes;
            if (i2 == 0) {
                string = applicationInfo.nonLocalizedLabel.toString();
            } else {
                string = context.getString(i2);
                C9768m.m32345e(string, "context.getString(stringId)");
            }
            return string;
        } catch (Exception unused) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    /* renamed from: s0 */
    public static final String m11593s0(InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        InputStreamReader inputStreamReader;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder sb = new StringBuilder();
                    char[] cArr = new char[RecyclerView.AbstractC0599l.FLAG_MOVED];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read == -1) {
                            String sb2 = sb.toString();
                            C9768m.m32345e(sb2, "{\n      bufferedInputStream = BufferedInputStream(inputStream)\n      reader = InputStreamReader(bufferedInputStream)\n      val stringBuilder = StringBuilder()\n      val bufferSize = 1024 * 2\n      val buffer = CharArray(bufferSize)\n      var n = 0\n      while (reader.read(buffer).also { n = it } != -1) {\n        stringBuilder.append(buffer, 0, n)\n      }\n      stringBuilder.toString()\n    }");
                            m11570h(bufferedInputStream);
                            m11570h(inputStreamReader);
                            return sb2;
                        }
                        sb.append(cArr, 0, read);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    m11570h(bufferedInputStream);
                    m11570h(inputStreamReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
            }
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th = th4;
            inputStreamReader = null;
        }
    }

    /* renamed from: t */
    public static final String m11594t() {
        C5608a0 c5608a0 = C5608a0.f14199a;
        Context m11284c = C5608a0.m11284c();
        if (m11284c == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = m11284c.getPackageManager().getPackageInfo(m11284c.getPackageName(), 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: t0 */
    public static final Map<String, String> m11595t0(Parcel parcel) {
        C9768m.m32346f(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        int i2 = 0;
        if (readInt > 0) {
            do {
                i2++;
                hashMap.put(parcel.readString(), parcel.readString());
            } while (i2 < readInt);
        }
        return hashMap;
    }

    /* renamed from: u0 */
    private final void m11596u0() {
        try {
            if (m11586p()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f14482e = statFs.getAvailableBlocks() * statFs.getBlockSize();
            }
            f14482e = m11574j(f14482e);
        } catch (Exception unused) {
        }
    }

    /* renamed from: v */
    public static final Date m11597v(Bundle bundle, String str, Date date) {
        long parseLong;
        C9768m.m32346f(date, "dateBase");
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (!(obj instanceof Long)) {
            if (obj instanceof String) {
                try {
                    parseLong = Long.parseLong((String) obj);
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        parseLong = ((Number) obj).longValue();
        return parseLong == 0 ? new Date(Long.MAX_VALUE) : new Date(date.getTime() + (parseLong * 1000));
    }

    /* renamed from: v0 */
    private final int m11598v0() {
        int i2 = f14479b;
        if (i2 > 0) {
            return i2;
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new FilenameFilter() { // from class: com.facebook.internal.l
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) {
                    boolean m11599w0;
                    m11599w0 = C5663p0.m11599w0(file, str);
                    return m11599w0;
                }
            });
            if (listFiles != null) {
                f14479b = listFiles.length;
            }
        } catch (Exception unused) {
        }
        if (f14479b <= 0) {
            f14479b = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return f14479b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w0 */
    public static final boolean m11599w0(File file, String str) {
        return Pattern.matches("cpu[0-9]+", str);
    }

    /* renamed from: x */
    public static final long m11600x(Uri uri) {
        C9768m.m32346f(uri, "contentUri");
        Cursor cursor = null;
        try {
            C5608a0 c5608a0 = C5608a0.f14199a;
            cursor = C5608a0.m11284c().getContentResolver().query(uri, null, null, null, null);
            if (cursor == null) {
                return 0L;
            }
            int columnIndex = cursor.getColumnIndex("_size");
            cursor.moveToFirst();
            long j2 = cursor.getLong(columnIndex);
            cursor.close();
            return j2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: x0 */
    private final void m11601x0(Context context) {
        if (C9768m.m32341a(f14485h, "NoCarrier")) {
            try {
                Object systemService = context.getSystemService("phone");
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
                }
                String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
                C9768m.m32345e(networkOperatorName, "telephonyManager.networkOperatorName");
                f14485h = networkOperatorName;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: y */
    public static final Locale m11602y() {
        Locale m11542L = m11542L();
        if (m11542L != null) {
            return m11542L;
        }
        Locale locale = Locale.getDefault();
        C9768m.m32345e(locale, "getDefault()");
        return locale;
    }

    /* renamed from: y0 */
    private final void m11603y0(Context context) {
        if (f14480c == -1 || System.currentTimeMillis() - f14480c >= cm.aptoide.p092pt.BuildConfig.ANALYTICS_SESSION_INTERVAL_IN_MILLIS) {
            f14480c = System.currentTimeMillis();
            m11605z0();
            m11601x0(context);
            m11526A0();
            m11596u0();
        }
    }

    /* renamed from: z */
    private final String m11604z() {
        AccessToken m11105e = AccessToken.f14054f.m11105e();
        return (m11105e == null || m11105e.m11089h() == null) ? "facebook" : m11105e.m11089h();
    }

    /* renamed from: z0 */
    private final void m11605z0() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            C9768m.m32345e(displayName, "tz.getDisplayName(tz.inDaylightTime(Date()), TimeZone.SHORT)");
            f14483f = displayName;
            String id = timeZone.getID();
            C9768m.m32345e(id, "tz.id");
            f14484g = id;
        } catch (AssertionError | Exception unused) {
        }
    }

    /* renamed from: B */
    public final String m11606B() {
        return f14484g;
    }

    /* renamed from: G */
    public final Locale m11607G() {
        return f14487j;
    }

    /* renamed from: N */
    public final String m11608N() {
        return f14486i;
    }

    /* renamed from: u */
    public final long m11609u() {
        return f14482e;
    }

    /* renamed from: w */
    public final String m11610w() {
        return f14485h;
    }
}
