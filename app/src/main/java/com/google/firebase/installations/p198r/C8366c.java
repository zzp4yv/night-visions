package com.google.firebase.installations.p198r;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.p198r.AbstractC8367d;
import com.google.firebase.installations.p198r.AbstractC8369f;
import com.google.firebase.p204r.InterfaceC8458i;
import com.google.firebase.p205s.InterfaceC8463b;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FirebaseInstallationServiceClient.java */
/* renamed from: com.google.firebase.installations.r.c */
/* loaded from: classes2.dex */
public class C8366c {

    /* renamed from: a */
    private static final Pattern f31861a = Pattern.compile("[0-9]+s");

    /* renamed from: b */
    private static final Charset f31862b = Charset.forName("UTF-8");

    /* renamed from: c */
    private final Context f31863c;

    /* renamed from: d */
    private final InterfaceC8463b<InterfaceC8458i> f31864d;

    /* renamed from: e */
    private final C8368e f31865e = new C8368e();

    public C8366c(Context context, InterfaceC8463b<InterfaceC8458i> interfaceC8463b) {
        this.f31863c = context;
        this.f31864d = interfaceC8463b;
    }

    /* renamed from: a */
    private static String m26358a(String str, String str2, String str3) {
        String str4;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            str4 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str4 = ", " + str;
        }
        objArr[2] = str4;
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    /* renamed from: b */
    private static JSONObject m26359b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.2.0");
            return jSONObject;
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* renamed from: c */
    private static JSONObject m26360c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.2.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* renamed from: f */
    private String m26361f() {
        try {
            Context context = this.f31863c;
            byte[] m14591a = AndroidUtilsLight.m14591a(context, context.getPackageName());
            if (m14591a != null) {
                return Hex.m14629b(m14591a, false);
            }
            Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f31863c.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("ContentValues", "No such package: " + this.f31863c.getPackageName(), e2);
            return null;
        }
    }

    /* renamed from: g */
    private URL m26362g(String str) throws FirebaseInstallationsException {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e2) {
            throw new FirebaseInstallationsException(e2.getMessage(), FirebaseInstallationsException.EnumC8343a.UNAVAILABLE);
        }
    }

    /* renamed from: h */
    private static byte[] m26363h(JSONObject jSONObject) throws IOException {
        return jSONObject.toString().getBytes("UTF-8");
    }

    /* renamed from: i */
    private static boolean m26364i(int i2) {
        return i2 >= 200 && i2 < 300;
    }

    /* renamed from: j */
    private static void m26365j() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    /* renamed from: k */
    private static void m26366k(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String m26370o = m26370o(httpURLConnection);
        if (TextUtils.isEmpty(m26370o)) {
            return;
        }
        Log.w("Firebase-Installations", m26370o);
        Log.w("Firebase-Installations", m26358a(str, str2, str3));
    }

    /* renamed from: l */
    private HttpURLConnection m26367l(URL url, String str) throws FirebaseInstallationsException {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f31863c.getPackageName());
            InterfaceC8458i interfaceC8458i = this.f31864d.get();
            if (interfaceC8458i != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) Tasks.m23659a(interfaceC8458i.mo26687a()));
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e2);
                } catch (ExecutionException e3) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e3);
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", m26361f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.EnumC8343a.UNAVAILABLE);
        }
    }

    @VisibleForTesting
    /* renamed from: m */
    static long m26368m(String str) {
        Preconditions.m14363b(f31861a.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* renamed from: n */
    private AbstractC8367d m26369n(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f31862b));
        AbstractC8369f.a m26384a = AbstractC8369f.m26384a();
        AbstractC8367d.a m26377a = AbstractC8367d.m26377a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                m26377a.mo26350f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                m26377a.mo26347c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                m26377a.mo26348d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        m26384a.mo26356c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        m26384a.mo26357d(m26368m(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                m26377a.mo26346b(m26384a.mo26354a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return m26377a.mo26349e(AbstractC8367d.b.OK).mo26345a();
    }

    /* renamed from: o */
    private static String m26370o(HttpURLConnection httpURLConnection) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f31862b));
        try {
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                }
                String format = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return format;
            } catch (IOException unused2) {
                return null;
            }
        } catch (IOException unused3) {
            bufferedReader.close();
            return null;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
            throw th;
        }
    }

    /* renamed from: p */
    private AbstractC8369f m26371p(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f31862b));
        AbstractC8369f.a m26384a = AbstractC8369f.m26384a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                m26384a.mo26356c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                m26384a.mo26357d(m26368m(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return m26384a.mo26355b(AbstractC8369f.b.OK).mo26354a();
    }

    /* renamed from: q */
    private void m26372q(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        m26374s(httpURLConnection, m26363h(m26359b(str, str2)));
    }

    /* renamed from: r */
    private void m26373r(HttpURLConnection httpURLConnection) throws IOException {
        m26374s(httpURLConnection, m26363h(m26360c()));
    }

    /* renamed from: s */
    private static void m26374s(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: d */
    public AbstractC8367d m26375d(String str, String str2, String str3, String str4, String str5) throws FirebaseInstallationsException {
        int responseCode;
        AbstractC8367d m26369n;
        if (!this.f31865e.m26382b()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.EnumC8343a.UNAVAILABLE);
        }
        URL m26362g = m26362g(String.format("projects/%s/installations", str3));
        for (int i2 = 0; i2 <= 1; i2++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection m26367l = m26367l(m26362g, str);
            try {
                try {
                    m26367l.setRequestMethod("POST");
                    m26367l.setDoOutput(true);
                    if (str5 != null) {
                        m26367l.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    m26372q(m26367l, str2, str4);
                    responseCode = m26367l.getResponseCode();
                    this.f31865e.m26383f(responseCode);
                } catch (IOException | AssertionError unused) {
                }
                if (m26364i(responseCode)) {
                    m26369n = m26369n(m26367l);
                } else {
                    m26366k(m26367l, str4, str, str3);
                    if (responseCode == 429) {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.EnumC8343a.TOO_MANY_REQUESTS);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        m26365j();
                        m26369n = AbstractC8367d.m26377a().mo26349e(AbstractC8367d.b.BAD_CONFIG).mo26345a();
                    } else {
                        m26367l.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                }
                return m26369n;
            } finally {
                m26367l.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.EnumC8343a.UNAVAILABLE);
    }

    /* renamed from: e */
    public AbstractC8369f m26376e(String str, String str2, String str3, String str4) throws FirebaseInstallationsException {
        int responseCode;
        AbstractC8369f m26371p;
        if (!this.f31865e.m26382b()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.EnumC8343a.UNAVAILABLE);
        }
        URL m26362g = m26362g(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
        for (int i2 = 0; i2 <= 1; i2++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection m26367l = m26367l(m26362g, str);
            try {
                try {
                    m26367l.setRequestMethod("POST");
                    m26367l.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    m26367l.setDoOutput(true);
                    m26373r(m26367l);
                    responseCode = m26367l.getResponseCode();
                    this.f31865e.m26383f(responseCode);
                } finally {
                    m26367l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
            }
            if (m26364i(responseCode)) {
                m26371p = m26371p(m26367l);
            } else {
                m26366k(m26367l, null, str, str3);
                if (responseCode != 401 && responseCode != 404) {
                    if (responseCode == 429) {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.EnumC8343a.TOO_MANY_REQUESTS);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        m26365j();
                        m26371p = AbstractC8369f.m26384a().mo26355b(AbstractC8369f.b.BAD_CONFIG).mo26354a();
                    } else {
                        m26367l.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                }
                m26371p = AbstractC8369f.m26384a().mo26355b(AbstractC8369f.b.AUTH_ERROR).mo26354a();
            }
            return m26371p;
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.EnumC8343a.UNAVAILABLE);
    }
}
