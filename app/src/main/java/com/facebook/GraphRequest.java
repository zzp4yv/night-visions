package com.facebook;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.database.room.RoomNotification;
import cm.aptoide.p092pt.networking.BodyInterceptorV3;
import com.facebook.C5613c0;
import com.facebook.GraphRequest;
import com.facebook.internal.C5647h0;
import com.facebook.internal.C5651j0;
import com.facebook.internal.C5659n0;
import com.facebook.internal.C5663p0;
import com.facebook.internal.C5665q0;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.C10770n;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.C10513u;
import kotlin.text.C10514v;
import kotlin.text.Charsets;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GraphRequest.kt */
/* loaded from: classes.dex */
public final class GraphRequest {

    /* renamed from: a */
    public static final C5599c f14159a = new C5599c(null);

    /* renamed from: b */
    public static final String f14160b = GraphRequest.class.getSimpleName();

    /* renamed from: c */
    private static final String f14161c;

    /* renamed from: d */
    private static String f14162d;

    /* renamed from: e */
    private static final Pattern f14163e;

    /* renamed from: f */
    private static volatile String f14164f;

    /* renamed from: g */
    private AccessToken f14165g;

    /* renamed from: h */
    private String f14166h;

    /* renamed from: i */
    private JSONObject f14167i;

    /* renamed from: j */
    private String f14168j;

    /* renamed from: k */
    private String f14169k;

    /* renamed from: l */
    private boolean f14170l;

    /* renamed from: m */
    private Bundle f14171m;

    /* renamed from: n */
    private Object f14172n;

    /* renamed from: o */
    private String f14173o;

    /* renamed from: p */
    private InterfaceC5598b f14174p;

    /* renamed from: q */
    private EnumC5622e0 f14175q;

    /* renamed from: r */
    private boolean f14176r;

    /* renamed from: s */
    private String f14177s;

    /* compiled from: GraphRequest.kt */
    /* renamed from: com.facebook.GraphRequest$a */
    private static final class C5597a {

        /* renamed from: a */
        private final GraphRequest f14181a;

        /* renamed from: b */
        private final Object f14182b;

        public C5597a(GraphRequest graphRequest, Object obj) {
            C9768m.m32346f(graphRequest, "request");
            this.f14181a = graphRequest;
            this.f14182b = obj;
        }

        /* renamed from: a */
        public final GraphRequest m11194a() {
            return this.f14181a;
        }

        /* renamed from: b */
        public final Object m11195b() {
            return this.f14182b;
        }
    }

    /* compiled from: GraphRequest.kt */
    /* renamed from: com.facebook.GraphRequest$b */
    public interface InterfaceC5598b {
        /* renamed from: b */
        void mo11196b(C5620d0 c5620d0);
    }

    /* compiled from: GraphRequest.kt */
    /* renamed from: com.facebook.GraphRequest$c */
    public static final class C5599c {
        private C5599c() {
        }

        public /* synthetic */ C5599c(C9756g c9756g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: C */
        public final String m11197C(Object obj) {
            if (obj instanceof String) {
                return (String) obj;
            }
            if ((obj instanceof Boolean) || (obj instanceof Number)) {
                return obj.toString();
            }
            if (!(obj instanceof Date)) {
                throw new IllegalArgumentException("Unsupported parameter type.");
            }
            String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
            C9768m.m32345e(format, "iso8601DateFormat.format(value)");
            return format;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
        /* renamed from: D */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m11198D(org.json.JSONObject r10, java.lang.String r11, com.facebook.GraphRequest.InterfaceC5601e r12) {
            /*
                r9 = this;
                boolean r0 = r9.m11216s(r11)
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L23
                r5 = 0
                r6 = 0
                r7 = 6
                r8 = 0
                java.lang.String r4 = ":"
                r3 = r11
                int r0 = kotlin.text.C10504l.m37468W(r3, r4, r5, r6, r7, r8)
                java.lang.String r4 = "?"
                int r11 = kotlin.text.C10504l.m37468W(r3, r4, r5, r6, r7, r8)
                r3 = 3
                if (r0 <= r3) goto L23
                r3 = -1
                if (r11 == r3) goto L21
                if (r0 >= r11) goto L23
            L21:
                r11 = 1
                goto L24
            L23:
                r11 = 0
            L24:
                java.util.Iterator r0 = r10.keys()
            L28:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L53
                java.lang.Object r3 = r0.next()
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r4 = r10.opt(r3)
                if (r11 == 0) goto L44
                java.lang.String r5 = "image"
                boolean r5 = kotlin.text.C10504l.m37483q(r3, r5, r1)
                if (r5 == 0) goto L44
                r5 = 1
                goto L45
            L44:
                r5 = 0
            L45:
                java.lang.String r6 = "key"
                kotlin.jvm.internal.C9768m.m32345e(r3, r6)
                java.lang.String r6 = "value"
                kotlin.jvm.internal.C9768m.m32345e(r4, r6)
                r9.m11199E(r3, r4, r12, r5)
                goto L28
            L53:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.C5599c.m11198D(org.json.JSONObject, java.lang.String, com.facebook.GraphRequest$e):void");
        }

        /* renamed from: E */
        private final void m11199E(String str, Object obj, InterfaceC5601e interfaceC5601e, boolean z) {
            Class<?> cls = obj.getClass();
            if (JSONObject.class.isAssignableFrom(cls)) {
                JSONObject jSONObject = (JSONObject) obj;
                if (z) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
                        String format = String.format("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2));
                        C9768m.m32345e(format, "java.lang.String.format(format, *args)");
                        Object opt = jSONObject.opt(next);
                        C9768m.m32345e(opt, "jsonObject.opt(propertyName)");
                        m11199E(format, opt, interfaceC5601e, z);
                    }
                    return;
                }
                if (jSONObject.has(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID)) {
                    String optString = jSONObject.optString(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID);
                    C9768m.m32345e(optString, "jsonObject.optString(\"id\")");
                    m11199E(str, optString, interfaceC5601e, z);
                    return;
                } else if (jSONObject.has("url")) {
                    String optString2 = jSONObject.optString("url");
                    C9768m.m32345e(optString2, "jsonObject.optString(\"url\")");
                    m11199E(str, optString2, interfaceC5601e, z);
                    return;
                } else {
                    if (jSONObject.has("fbsdk:create_object")) {
                        String jSONObject2 = jSONObject.toString();
                        C9768m.m32345e(jSONObject2, "jsonObject.toString()");
                        m11199E(str, jSONObject2, interfaceC5601e, z);
                        return;
                    }
                    return;
                }
            }
            if (!JSONArray.class.isAssignableFrom(cls)) {
                if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
                    interfaceC5601e.mo11239a(str, obj.toString());
                    return;
                }
                if (Date.class.isAssignableFrom(cls)) {
                    String format2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                    C9768m.m32345e(format2, "iso8601DateFormat.format(date)");
                    interfaceC5601e.mo11239a(str, format2);
                    return;
                }
                C5663p0 c5663p0 = C5663p0.f14478a;
                C5663p0.m11575j0(GraphRequest.f14160b, "The type of property " + str + " in the graph object is unknown. It won't be sent in the request.");
                return;
            }
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            if (length <= 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.f37185a;
                String format3 = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2)}, 2));
                C9768m.m32345e(format3, "java.lang.String.format(locale, format, *args)");
                Object opt2 = jSONArray.opt(i2);
                C9768m.m32345e(opt2, "jsonArray.opt(i)");
                m11199E(format3, opt2, interfaceC5601e, z);
                if (i3 >= length) {
                    return;
                } else {
                    i2 = i3;
                }
            }
        }

        /* renamed from: F */
        private final void m11200F(C5613c0 c5613c0, C5651j0 c5651j0, int i2, URL url, OutputStream outputStream, boolean z) {
            C5603g c5603g = new C5603g(outputStream, c5651j0, z);
            if (i2 != 1) {
                String m11211n = m11211n(c5613c0);
                if (m11211n.length() == 0) {
                    throw new FacebookException("App ID was not specified at the request or Settings.");
                }
                c5603g.mo11239a("batch_app_id", m11211n);
                HashMap hashMap = new HashMap();
                m11204K(c5603g, c5613c0, hashMap);
                if (c5651j0 != null) {
                    c5651j0.m11447b("  Attachments:\n");
                }
                m11202I(hashMap, c5603g);
                return;
            }
            GraphRequest graphRequest = c5613c0.get(0);
            HashMap hashMap2 = new HashMap();
            for (String str : graphRequest.m11186t().keySet()) {
                Object obj = graphRequest.m11186t().get(str);
                if (m11217t(obj)) {
                    C9768m.m32345e(str, RoomNotification.KEY);
                    hashMap2.put(str, new C5597a(graphRequest, obj));
                }
            }
            if (c5651j0 != null) {
                c5651j0.m11447b("  Parameters:\n");
            }
            m11203J(graphRequest.m11186t(), c5603g, graphRequest);
            if (c5651j0 != null) {
                c5651j0.m11447b("  Attachments:\n");
            }
            m11202I(hashMap2, c5603g);
            JSONObject m11183p = graphRequest.m11183p();
            if (m11183p != null) {
                String path = url.getPath();
                C9768m.m32345e(path, "url.path");
                m11198D(m11183p, path, c5603g);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: H */
        public static final void m11201H(ArrayList arrayList, C5613c0 c5613c0) {
            C9768m.m32346f(arrayList, "$callbacks");
            C9768m.m32346f(c5613c0, "$requests");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                InterfaceC5598b interfaceC5598b = (InterfaceC5598b) pair.first;
                Object obj = pair.second;
                C9768m.m32345e(obj, "pair.second");
                interfaceC5598b.mo11196b((C5620d0) obj);
            }
            Iterator<C5613c0.a> it2 = c5613c0.m11330u().iterator();
            while (it2.hasNext()) {
                it2.next().mo11312a(c5613c0);
            }
        }

        /* renamed from: I */
        private final void m11202I(Map<String, C5597a> map, C5603g c5603g) {
            for (Map.Entry<String, C5597a> entry : map.entrySet()) {
                if (GraphRequest.f14159a.m11217t(entry.getValue().m11195b())) {
                    c5603g.m11249j(entry.getKey(), entry.getValue().m11195b(), entry.getValue().m11194a());
                }
            }
        }

        /* renamed from: J */
        private final void m11203J(Bundle bundle, C5603g c5603g, GraphRequest graphRequest) {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (m11218u(obj)) {
                    C9768m.m32345e(str, RoomNotification.KEY);
                    c5603g.m11249j(str, obj, graphRequest);
                }
            }
        }

        /* renamed from: K */
        private final void m11204K(C5603g c5603g, Collection<GraphRequest> collection, Map<String, C5597a> map) {
            JSONArray jSONArray = new JSONArray();
            Iterator<GraphRequest> it = collection.iterator();
            while (it.hasNext()) {
                it.next().m11156C(jSONArray, map);
            }
            c5603g.m11251l("batch", jSONArray, collection);
        }

        /* renamed from: M */
        private final void m11205M(HttpURLConnection httpURLConnection, boolean z) {
            if (!z) {
                httpURLConnection.setRequestProperty("Content-Type", m11212o());
            } else {
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
            }
        }

        /* renamed from: e */
        private final HttpURLConnection m11210e(URL url) throws IOException {
            URLConnection openConnection = url.openConnection();
            if (openConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setRequestProperty("User-Agent", m11213p());
            httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
            httpURLConnection.setChunkedStreamingMode(0);
            return httpURLConnection;
        }

        /* renamed from: n */
        private final String m11211n(C5613c0 c5613c0) {
            String m11328s = c5613c0.m11328s();
            if (m11328s != null && (!c5613c0.isEmpty())) {
                return m11328s;
            }
            Iterator<GraphRequest> it = c5613c0.iterator();
            while (it.hasNext()) {
                AccessToken m11181l = it.next().m11181l();
                if (m11181l != null) {
                    return m11181l.m11084c();
                }
            }
            String str = GraphRequest.f14162d;
            if (str != null) {
                if (str.length() > 0) {
                    return str;
                }
            }
            C5608a0 c5608a0 = C5608a0.f14199a;
            return C5608a0.m11285d();
        }

        /* renamed from: o */
        private final String m11212o() {
            StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
            String format = String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{GraphRequest.f14161c}, 1));
            C9768m.m32345e(format, "java.lang.String.format(format, *args)");
            return format;
        }

        /* renamed from: p */
        private final String m11213p() {
            if (GraphRequest.f14164f == null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
                String format = String.format("%s.%s", Arrays.copyOf(new Object[]{"FBAndroidSDK", "16.2.0"}, 2));
                C9768m.m32345e(format, "java.lang.String.format(format, *args)");
                GraphRequest.f14164f = format;
                C5647h0 c5647h0 = C5647h0.f14422a;
                String m11441a = C5647h0.m11441a();
                C5663p0 c5663p0 = C5663p0.f14478a;
                if (!C5663p0.m11557a0(m11441a)) {
                    String format2 = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[]{GraphRequest.f14164f, m11441a}, 2));
                    C9768m.m32345e(format2, "java.lang.String.format(locale, format, *args)");
                    GraphRequest.f14164f = format2;
                }
            }
            return GraphRequest.f14164f;
        }

        /* renamed from: q */
        private final boolean m11214q(C5613c0 c5613c0) {
            Iterator<C5613c0.a> it = c5613c0.m11330u().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof C5613c0.c) {
                    return true;
                }
            }
            Iterator<GraphRequest> it2 = c5613c0.iterator();
            while (it2.hasNext()) {
                if (it2.next().m11182n() instanceof InterfaceC5602f) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: r */
        private final boolean m11215r(C5613c0 c5613c0) {
            Iterator<GraphRequest> it = c5613c0.iterator();
            while (it.hasNext()) {
                GraphRequest next = it.next();
                Iterator<String> it2 = next.m11186t().keySet().iterator();
                while (it2.hasNext()) {
                    if (m11217t(next.m11186t().get(it2.next()))) {
                        return false;
                    }
                }
            }
            return true;
        }

        /* renamed from: s */
        private final boolean m11216s(String str) {
            Matcher matcher = GraphRequest.f14163e.matcher(str);
            if (matcher.matches()) {
                str = matcher.group(1);
                C9768m.m32345e(str, "matcher.group(1)");
            }
            return C10513u.m37511E(str, "me/", false, 2, null) || C10513u.m37511E(str, "/me/", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public final boolean m11217t(Object obj) {
            return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof ParcelableResourceWithMimeType);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: u */
        public final boolean m11218u(Object obj) {
            return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: z */
        public static final void m11221z(InterfaceC5600d interfaceC5600d, C5620d0 c5620d0) {
            C9768m.m32346f(c5620d0, "response");
            if (interfaceC5600d == null) {
                return;
            }
            interfaceC5600d.m11238a(c5620d0.m11339c(), c5620d0);
        }

        /* renamed from: A */
        public final GraphRequest m11222A(AccessToken accessToken, String str, JSONObject jSONObject, InterfaceC5598b interfaceC5598b) {
            GraphRequest graphRequest = new GraphRequest(accessToken, str, null, EnumC5622e0.POST, interfaceC5598b, null, 32, null);
            graphRequest.m11175F(jSONObject);
            return graphRequest;
        }

        /* renamed from: B */
        public final GraphRequest m11223B(AccessToken accessToken, String str, Bundle bundle, InterfaceC5598b interfaceC5598b) {
            return new GraphRequest(accessToken, str, bundle, EnumC5622e0.POST, interfaceC5598b, null, 32, null);
        }

        /* renamed from: G */
        public final void m11224G(final C5613c0 c5613c0, List<C5620d0> list) {
            C9768m.m32346f(c5613c0, "requests");
            C9768m.m32346f(list, "responses");
            int size = c5613c0.size();
            final ArrayList arrayList = new ArrayList();
            if (size > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    GraphRequest graphRequest = c5613c0.get(i2);
                    if (graphRequest.m11182n() != null) {
                        arrayList.add(new Pair(graphRequest.m11182n(), list.get(i2)));
                    }
                    if (i3 >= size) {
                        break;
                    } else {
                        i2 = i3;
                    }
                }
            }
            if (arrayList.size() > 0) {
                Runnable runnable = new Runnable() { // from class: com.facebook.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        GraphRequest.C5599c.m11201H(arrayList, c5613c0);
                    }
                };
                Handler m11329t = c5613c0.m11329t();
                if ((m11329t == null ? null : Boolean.valueOf(m11329t.post(runnable))) == null) {
                    runnable.run();
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00f2  */
        /* renamed from: L */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m11225L(com.facebook.C5613c0 r14, java.net.HttpURLConnection r15) throws java.io.IOException, org.json.JSONException {
            /*
                Method dump skipped, instructions count: 246
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.C5599c.m11225L(com.facebook.c0, java.net.HttpURLConnection):void");
        }

        /* renamed from: N */
        public final HttpURLConnection m11226N(C5613c0 c5613c0) {
            URL url;
            C9768m.m32346f(c5613c0, "requests");
            m11227O(c5613c0);
            try {
                if (c5613c0.size() == 1) {
                    url = new URL(c5613c0.get(0).m11189w());
                } else {
                    C5659n0 c5659n0 = C5659n0.f14464a;
                    url = new URL(C5659n0.m11517h());
                }
                HttpURLConnection httpURLConnection = null;
                try {
                    httpURLConnection = m11210e(url);
                    m11225L(c5613c0, httpURLConnection);
                    return httpURLConnection;
                } catch (IOException e2) {
                    C5663p0 c5663p0 = C5663p0.f14478a;
                    C5663p0.m11584o(httpURLConnection);
                    throw new FacebookException("could not construct request body", e2);
                } catch (JSONException e3) {
                    C5663p0 c5663p02 = C5663p0.f14478a;
                    C5663p0.m11584o(httpURLConnection);
                    throw new FacebookException("could not construct request body", e3);
                }
            } catch (MalformedURLException e4) {
                throw new FacebookException("could not construct URL for request", e4);
            }
        }

        /* renamed from: O */
        public final void m11227O(C5613c0 c5613c0) {
            C9768m.m32346f(c5613c0, "requests");
            Iterator<GraphRequest> it = c5613c0.iterator();
            while (it.hasNext()) {
                GraphRequest next = it.next();
                if (EnumC5622e0.GET == next.m11185s()) {
                    C5663p0 c5663p0 = C5663p0.f14478a;
                    if (C5663p0.m11557a0(next.m11186t().getString("fields"))) {
                        C5651j0.a aVar = C5651j0.f14429a;
                        EnumC5626g0 enumC5626g0 = EnumC5626g0.DEVELOPER_ERRORS;
                        StringBuilder sb = new StringBuilder();
                        sb.append("GET requests for /");
                        String m11184q = next.m11184q();
                        if (m11184q == null) {
                            m11184q = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        sb.append(m11184q);
                        sb.append(" should contain an explicit \"fields\" parameter.");
                        aVar.m11453a(enumC5626g0, 5, "Request", sb.toString());
                    }
                }
            }
        }

        /* renamed from: f */
        public final C5620d0 m11228f(GraphRequest graphRequest) {
            C9768m.m32346f(graphRequest, "request");
            List<C5620d0> m11231i = m11231i(graphRequest);
            if (m11231i.size() == 1) {
                return m11231i.get(0);
            }
            throw new FacebookException("invalid state: expected a single response");
        }

        /* renamed from: g */
        public final List<C5620d0> m11229g(C5613c0 c5613c0) {
            Exception exc;
            HttpURLConnection httpURLConnection;
            List<C5620d0> list;
            C9768m.m32346f(c5613c0, "requests");
            C5665q0 c5665q0 = C5665q0.f14500a;
            C5665q0.m11641i(c5613c0, "requests");
            HttpURLConnection httpURLConnection2 = null;
            try {
                httpURLConnection = m11226N(c5613c0);
                exc = null;
            } catch (Exception e2) {
                exc = e2;
                httpURLConnection = null;
            } catch (Throwable th) {
                th = th;
                C5663p0 c5663p0 = C5663p0.f14478a;
                C5663p0.m11584o(httpURLConnection2);
                throw th;
            }
            try {
                if (httpURLConnection != null) {
                    list = m11235m(httpURLConnection, c5613c0);
                } else {
                    List<C5620d0> m11343a = C5620d0.f14271a.m11343a(c5613c0.m11332w(), null, new FacebookException(exc));
                    m11224G(c5613c0, m11343a);
                    list = m11343a;
                }
                C5663p0 c5663p02 = C5663p0.f14478a;
                C5663p0.m11584o(httpURLConnection);
                return list;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection2 = httpURLConnection;
                C5663p0 c5663p03 = C5663p0.f14478a;
                C5663p0.m11584o(httpURLConnection2);
                throw th;
            }
        }

        /* renamed from: h */
        public final List<C5620d0> m11230h(Collection<GraphRequest> collection) {
            C9768m.m32346f(collection, "requests");
            return m11229g(new C5613c0(collection));
        }

        /* renamed from: i */
        public final List<C5620d0> m11231i(GraphRequest... graphRequestArr) {
            List m38746Z;
            C9768m.m32346f(graphRequestArr, "requests");
            m38746Z = C10770n.m38746Z(graphRequestArr);
            return m11230h(m38746Z);
        }

        /* renamed from: j */
        public final AsyncTaskC5610b0 m11232j(C5613c0 c5613c0) {
            C9768m.m32346f(c5613c0, "requests");
            C5665q0 c5665q0 = C5665q0.f14500a;
            C5665q0.m11641i(c5613c0, "requests");
            AsyncTaskC5610b0 asyncTaskC5610b0 = new AsyncTaskC5610b0(c5613c0);
            C5608a0 c5608a0 = C5608a0.f14199a;
            asyncTaskC5610b0.executeOnExecutor(C5608a0.m11292k(), new Void[0]);
            return asyncTaskC5610b0;
        }

        /* renamed from: k */
        public final AsyncTaskC5610b0 m11233k(Collection<GraphRequest> collection) {
            C9768m.m32346f(collection, "requests");
            return m11232j(new C5613c0(collection));
        }

        /* renamed from: l */
        public final AsyncTaskC5610b0 m11234l(GraphRequest... graphRequestArr) {
            List m38746Z;
            C9768m.m32346f(graphRequestArr, "requests");
            m38746Z = C10770n.m38746Z(graphRequestArr);
            return m11233k(m38746Z);
        }

        /* renamed from: m */
        public final List<C5620d0> m11235m(HttpURLConnection httpURLConnection, C5613c0 c5613c0) {
            C9768m.m32346f(httpURLConnection, "connection");
            C9768m.m32346f(c5613c0, "requests");
            List<C5620d0> m11346f = C5620d0.f14271a.m11346f(httpURLConnection, c5613c0);
            C5663p0 c5663p0 = C5663p0.f14478a;
            C5663p0.m11584o(httpURLConnection);
            int size = c5613c0.size();
            if (size == m11346f.size()) {
                m11224G(c5613c0, m11346f);
                C5922v.f15573a.m12923e().m12913d();
                return m11346f;
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
            String format = String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(m11346f.size()), Integer.valueOf(size)}, 2));
            C9768m.m32345e(format, "java.lang.String.format(locale, format, *args)");
            throw new FacebookException(format);
        }

        /* renamed from: x */
        public final GraphRequest m11236x(AccessToken accessToken, String str, InterfaceC5598b interfaceC5598b) {
            return new GraphRequest(accessToken, str, null, null, interfaceC5598b, null, 32, null);
        }

        /* renamed from: y */
        public final GraphRequest m11237y(AccessToken accessToken, final InterfaceC5600d interfaceC5600d) {
            return new GraphRequest(accessToken, "me", null, null, new InterfaceC5598b() { // from class: com.facebook.p
                @Override // com.facebook.GraphRequest.InterfaceC5598b
                /* renamed from: b */
                public final void mo11196b(C5620d0 c5620d0) {
                    GraphRequest.C5599c.m11221z(GraphRequest.InterfaceC5600d.this, c5620d0);
                }
            }, null, 32, null);
        }
    }

    /* compiled from: GraphRequest.kt */
    /* renamed from: com.facebook.GraphRequest$d */
    public interface InterfaceC5600d {
        /* renamed from: a */
        void m11238a(JSONObject jSONObject, C5620d0 c5620d0);
    }

    /* compiled from: GraphRequest.kt */
    /* renamed from: com.facebook.GraphRequest$e */
    private interface InterfaceC5601e {
        /* renamed from: a */
        void mo11239a(String str, String str2);
    }

    /* compiled from: GraphRequest.kt */
    /* renamed from: com.facebook.GraphRequest$f */
    public interface InterfaceC5602f extends InterfaceC5598b {
        /* renamed from: a */
        void m11240a(long j2, long j3);
    }

    /* compiled from: GraphRequest.kt */
    /* renamed from: com.facebook.GraphRequest$g */
    private static final class C5603g implements InterfaceC5601e {

        /* renamed from: a */
        private final OutputStream f14183a;

        /* renamed from: b */
        private final C5651j0 f14184b;

        /* renamed from: c */
        private boolean f14185c;

        /* renamed from: d */
        private final boolean f14186d;

        public C5603g(OutputStream outputStream, C5651j0 c5651j0, boolean z) {
            C9768m.m32346f(outputStream, "outputStream");
            this.f14183a = outputStream;
            this.f14184b = c5651j0;
            this.f14185c = true;
            this.f14186d = z;
        }

        /* renamed from: b */
        private final RuntimeException m11241b() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        @Override // com.facebook.GraphRequest.InterfaceC5601e
        /* renamed from: a */
        public void mo11239a(String str, String str2) {
            C9768m.m32346f(str, RoomNotification.KEY);
            C9768m.m32346f(str2, "value");
            m11245f(str, null, null);
            m11248i("%s", str2);
            m11250k();
            C5651j0 c5651j0 = this.f14184b;
            if (c5651j0 == null) {
                return;
            }
            c5651j0.m11449d(C9768m.m32354n("    ", str), str2);
        }

        /* renamed from: c */
        public final void m11242c(String str, Object... objArr) {
            C9768m.m32346f(str, "format");
            C9768m.m32346f(objArr, "args");
            if (this.f14186d) {
                OutputStream outputStream = this.f14183a;
                StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
                Locale locale = Locale.US;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
                C9768m.m32345e(format, "java.lang.String.format(locale, format, *args)");
                String encode = URLEncoder.encode(format, "UTF-8");
                C9768m.m32345e(encode, "encode(String.format(Locale.US, format, *args), \"UTF-8\")");
                byte[] bytes = encode.getBytes(Charsets.f40651b);
                C9768m.m32345e(bytes, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                return;
            }
            if (this.f14185c) {
                OutputStream outputStream2 = this.f14183a;
                Charset charset = Charsets.f40651b;
                byte[] bytes2 = "--".getBytes(charset);
                C9768m.m32345e(bytes2, "(this as java.lang.String).getBytes(charset)");
                outputStream2.write(bytes2);
                OutputStream outputStream3 = this.f14183a;
                String str2 = GraphRequest.f14161c;
                if (str2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes3 = str2.getBytes(charset);
                C9768m.m32345e(bytes3, "(this as java.lang.String).getBytes(charset)");
                outputStream3.write(bytes3);
                OutputStream outputStream4 = this.f14183a;
                byte[] bytes4 = "\r\n".getBytes(charset);
                C9768m.m32345e(bytes4, "(this as java.lang.String).getBytes(charset)");
                outputStream4.write(bytes4);
                this.f14185c = false;
            }
            OutputStream outputStream5 = this.f14183a;
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.f37185a;
            Object[] copyOf2 = Arrays.copyOf(objArr, objArr.length);
            String format2 = String.format(str, Arrays.copyOf(copyOf2, copyOf2.length));
            C9768m.m32345e(format2, "java.lang.String.format(format, *args)");
            Charset charset2 = Charsets.f40651b;
            if (format2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes5 = format2.getBytes(charset2);
            C9768m.m32345e(bytes5, "(this as java.lang.String).getBytes(charset)");
            outputStream5.write(bytes5);
        }

        /* renamed from: d */
        public final void m11243d(String str, Bitmap bitmap) {
            C9768m.m32346f(str, RoomNotification.KEY);
            C9768m.m32346f(bitmap, "bitmap");
            m11245f(str, str, "image/png");
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.f14183a);
            m11248i(HttpUrl.FRAGMENT_ENCODE_SET, new Object[0]);
            m11250k();
            C5651j0 c5651j0 = this.f14184b;
            if (c5651j0 == null) {
                return;
            }
            c5651j0.m11449d(C9768m.m32354n("    ", str), "<Image>");
        }

        /* renamed from: e */
        public final void m11244e(String str, byte[] bArr) {
            C9768m.m32346f(str, RoomNotification.KEY);
            C9768m.m32346f(bArr, "bytes");
            m11245f(str, str, "content/unknown");
            this.f14183a.write(bArr);
            m11248i(HttpUrl.FRAGMENT_ENCODE_SET, new Object[0]);
            m11250k();
            C5651j0 c5651j0 = this.f14184b;
            if (c5651j0 == null) {
                return;
            }
            String m32354n = C9768m.m32354n("    ", str);
            StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
            String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bArr.length)}, 1));
            C9768m.m32345e(format, "java.lang.String.format(locale, format, *args)");
            c5651j0.m11449d(m32354n, format);
        }

        /* renamed from: f */
        public final void m11245f(String str, String str2, String str3) {
            if (!this.f14186d) {
                m11242c("Content-Disposition: form-data; name=\"%s\"", str);
                if (str2 != null) {
                    m11242c("; filename=\"%s\"", str2);
                }
                m11248i(HttpUrl.FRAGMENT_ENCODE_SET, new Object[0]);
                if (str3 != null) {
                    m11248i("%s: %s", "Content-Type", str3);
                }
                m11248i(HttpUrl.FRAGMENT_ENCODE_SET, new Object[0]);
                return;
            }
            OutputStream outputStream = this.f14183a;
            StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
            String format = String.format("%s=", Arrays.copyOf(new Object[]{str}, 1));
            C9768m.m32345e(format, "java.lang.String.format(format, *args)");
            Charset charset = Charsets.f40651b;
            if (format == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = format.getBytes(charset);
            C9768m.m32345e(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        /* renamed from: g */
        public final void m11246g(String str, Uri uri, String str2) {
            int m11582n;
            C9768m.m32346f(str, RoomNotification.KEY);
            C9768m.m32346f(uri, "contentUri");
            if (str2 == null) {
                str2 = "content/unknown";
            }
            m11245f(str, str, str2);
            if (this.f14183a instanceof C5709j0) {
                C5663p0 c5663p0 = C5663p0.f14478a;
                ((C5709j0) this.f14183a).m11833b(C5663p0.m11600x(uri));
                m11582n = 0;
            } else {
                C5608a0 c5608a0 = C5608a0.f14199a;
                InputStream openInputStream = C5608a0.m11284c().getContentResolver().openInputStream(uri);
                C5663p0 c5663p02 = C5663p0.f14478a;
                m11582n = C5663p0.m11582n(openInputStream, this.f14183a) + 0;
            }
            m11248i(HttpUrl.FRAGMENT_ENCODE_SET, new Object[0]);
            m11250k();
            C5651j0 c5651j0 = this.f14184b;
            if (c5651j0 == null) {
                return;
            }
            String m32354n = C9768m.m32354n("    ", str);
            StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
            String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(m11582n)}, 1));
            C9768m.m32345e(format, "java.lang.String.format(locale, format, *args)");
            c5651j0.m11449d(m32354n, format);
        }

        /* renamed from: h */
        public final void m11247h(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) {
            int m11582n;
            C9768m.m32346f(str, RoomNotification.KEY);
            C9768m.m32346f(parcelFileDescriptor, "descriptor");
            if (str2 == null) {
                str2 = "content/unknown";
            }
            m11245f(str, str, str2);
            OutputStream outputStream = this.f14183a;
            if (outputStream instanceof C5709j0) {
                ((C5709j0) outputStream).m11833b(parcelFileDescriptor.getStatSize());
                m11582n = 0;
            } else {
                ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
                C5663p0 c5663p0 = C5663p0.f14478a;
                m11582n = C5663p0.m11582n(autoCloseInputStream, this.f14183a) + 0;
            }
            m11248i(HttpUrl.FRAGMENT_ENCODE_SET, new Object[0]);
            m11250k();
            C5651j0 c5651j0 = this.f14184b;
            if (c5651j0 == null) {
                return;
            }
            String m32354n = C9768m.m32354n("    ", str);
            StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
            String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(m11582n)}, 1));
            C9768m.m32345e(format, "java.lang.String.format(locale, format, *args)");
            c5651j0.m11449d(m32354n, format);
        }

        /* renamed from: i */
        public final void m11248i(String str, Object... objArr) {
            C9768m.m32346f(str, "format");
            C9768m.m32346f(objArr, "args");
            m11242c(str, Arrays.copyOf(objArr, objArr.length));
            if (this.f14186d) {
                return;
            }
            m11242c("\r\n", new Object[0]);
        }

        /* renamed from: j */
        public final void m11249j(String str, Object obj, GraphRequest graphRequest) {
            C9768m.m32346f(str, RoomNotification.KEY);
            Closeable closeable = this.f14183a;
            if (closeable instanceof InterfaceC5713l0) {
                ((InterfaceC5713l0) closeable).mo11832a(graphRequest);
            }
            C5599c c5599c = GraphRequest.f14159a;
            if (c5599c.m11218u(obj)) {
                mo11239a(str, c5599c.m11197C(obj));
                return;
            }
            if (obj instanceof Bitmap) {
                m11243d(str, (Bitmap) obj);
                return;
            }
            if (obj instanceof byte[]) {
                m11244e(str, (byte[]) obj);
                return;
            }
            if (obj instanceof Uri) {
                m11246g(str, (Uri) obj, null);
                return;
            }
            if (obj instanceof ParcelFileDescriptor) {
                m11247h(str, (ParcelFileDescriptor) obj, null);
                return;
            }
            if (!(obj instanceof ParcelableResourceWithMimeType)) {
                throw m11241b();
            }
            ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) obj;
            Parcelable m11191b = parcelableResourceWithMimeType.m11191b();
            String m11190a = parcelableResourceWithMimeType.m11190a();
            if (m11191b instanceof ParcelFileDescriptor) {
                m11247h(str, (ParcelFileDescriptor) m11191b, m11190a);
            } else {
                if (!(m11191b instanceof Uri)) {
                    throw m11241b();
                }
                m11246g(str, (Uri) m11191b, m11190a);
            }
        }

        /* renamed from: k */
        public final void m11250k() {
            if (!this.f14186d) {
                m11248i("--%s", GraphRequest.f14161c);
                return;
            }
            OutputStream outputStream = this.f14183a;
            byte[] bytes = "&".getBytes(Charsets.f40651b);
            C9768m.m32345e(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        /* renamed from: l */
        public final void m11251l(String str, JSONArray jSONArray, Collection<GraphRequest> collection) {
            C9768m.m32346f(str, RoomNotification.KEY);
            C9768m.m32346f(jSONArray, "requestJsonArray");
            C9768m.m32346f(collection, "requests");
            Closeable closeable = this.f14183a;
            if (!(closeable instanceof InterfaceC5713l0)) {
                String jSONArray2 = jSONArray.toString();
                C9768m.m32345e(jSONArray2, "requestJsonArray.toString()");
                mo11239a(str, jSONArray2);
                return;
            }
            InterfaceC5713l0 interfaceC5713l0 = (InterfaceC5713l0) closeable;
            m11245f(str, null, null);
            m11242c("[", new Object[0]);
            int i2 = 0;
            for (GraphRequest graphRequest : collection) {
                int i3 = i2 + 1;
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                interfaceC5713l0.mo11832a(graphRequest);
                if (i2 > 0) {
                    m11242c(",%s", jSONObject.toString());
                } else {
                    m11242c("%s", jSONObject.toString());
                }
                i2 = i3;
            }
            m11242c("]", new Object[0]);
            C5651j0 c5651j0 = this.f14184b;
            if (c5651j0 == null) {
                return;
            }
            String m32354n = C9768m.m32354n("    ", str);
            String jSONArray3 = jSONArray.toString();
            C9768m.m32345e(jSONArray3, "requestJsonArray.toString()");
            c5651j0.m11449d(m32354n, jSONArray3);
        }
    }

    /* compiled from: GraphRequest.kt */
    /* renamed from: com.facebook.GraphRequest$h */
    public static final class C5604h implements InterfaceC5601e {

        /* renamed from: a */
        final /* synthetic */ ArrayList<String> f14187a;

        C5604h(ArrayList<String> arrayList) {
            this.f14187a = arrayList;
        }

        @Override // com.facebook.GraphRequest.InterfaceC5601e
        /* renamed from: a */
        public void mo11239a(String str, String str2) throws IOException {
            C9768m.m32346f(str, RoomNotification.KEY);
            C9768m.m32346f(str2, "value");
            ArrayList<String> arrayList = this.f14187a;
            StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
            String format = String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{str, URLEncoder.encode(str2, "UTF-8")}, 2));
            C9768m.m32345e(format, "java.lang.String.format(locale, format, *args)");
            arrayList.add(format);
        }
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        C9768m.m32345e(charArray, "(this as java.lang.String).toCharArray()");
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        if (nextInt > 0) {
            int i2 = 0;
            do {
                i2++;
                sb.append(charArray[secureRandom.nextInt(charArray.length)]);
            } while (i2 < nextInt);
        }
        String sb2 = sb.toString();
        C9768m.m32345e(sb2, "buffer.toString()");
        f14161c = sb2;
        f14163e = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public GraphRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ GraphRequest(AccessToken accessToken, String str, Bundle bundle, EnumC5622e0 enumC5622e0, InterfaceC5598b interfaceC5598b, String str2, int i2, C9756g c9756g) {
        this((i2 & 1) != 0 ? null : accessToken, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : bundle, (i2 & 8) != 0 ? null : enumC5622e0, (i2 & 16) != 0 ? null : interfaceC5598b, (i2 & 32) != 0 ? null : str2);
    }

    /* renamed from: B */
    public static final GraphRequest m11155B(AccessToken accessToken, InterfaceC5600d interfaceC5600d) {
        return f14159a.m11237y(accessToken, interfaceC5600d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public final void m11156C(JSONArray jSONArray, Map<String, C5597a> map) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        String str = this.f14168j;
        if (str != null) {
            jSONObject.put("name", str);
            jSONObject.put("omit_response_on_success", this.f14170l);
        }
        String str2 = this.f14169k;
        if (str2 != null) {
            jSONObject.put("depends_on", str2);
        }
        String m11187u = m11187u();
        jSONObject.put("relative_url", m11187u);
        jSONObject.put("method", this.f14175q);
        AccessToken accessToken = this.f14165g;
        if (accessToken != null) {
            C5651j0.f14429a.m11456d(accessToken.m11093l());
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f14171m.keySet().iterator();
        while (it.hasNext()) {
            Object obj = this.f14171m.get(it.next());
            if (f14159a.m11217t(obj)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
                String format = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{"file", Integer.valueOf(map.size())}, 2));
                C9768m.m32345e(format, "java.lang.String.format(locale, format, *args)");
                arrayList.add(format);
                map.put(format, new C5597a(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(",", arrayList));
        }
        JSONObject jSONObject2 = this.f14167i;
        if (jSONObject2 != null) {
            ArrayList arrayList2 = new ArrayList();
            f14159a.m11198D(jSONObject2, m11187u, new C5604h(arrayList2));
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    /* renamed from: J */
    private final boolean m11157J() {
        String m11167m = m11167m();
        boolean m37538J = m11167m == null ? false : C10514v.m37538J(m11167m, "|", false, 2, null);
        if (((m11167m == null || !C10513u.m37511E(m11167m, "IG", false, 2, null) || m37538J) ? false : true) && m11171y()) {
            return true;
        }
        return (m11172z() || m37538J) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m11158a(InterfaceC5598b interfaceC5598b, C5620d0 c5620d0) {
        C9768m.m32346f(c5620d0, "response");
        JSONObject m11339c = c5620d0.m11339c();
        JSONObject optJSONObject = m11339c == null ? null : m11339c.optJSONObject("__debug__");
        JSONArray optJSONArray = optJSONObject == null ? null : optJSONObject.optJSONArray("messages");
        if (optJSONArray != null) {
            int i2 = 0;
            int length = optJSONArray.length();
            if (length > 0) {
                while (true) {
                    int i3 = i2 + 1;
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i2);
                    String optString = optJSONObject2 == null ? null : optJSONObject2.optString("message");
                    String optString2 = optJSONObject2 == null ? null : optJSONObject2.optString("type");
                    String optString3 = optJSONObject2 == null ? null : optJSONObject2.optString("link");
                    if (optString != null && optString2 != null) {
                        EnumC5626g0 enumC5626g0 = EnumC5626g0.GRAPH_API_DEBUG_INFO;
                        if (C9768m.m32341a(optString2, "warning")) {
                            enumC5626g0 = EnumC5626g0.GRAPH_API_DEBUG_WARNING;
                        }
                        C5663p0 c5663p0 = C5663p0.f14478a;
                        if (!C5663p0.m11557a0(optString3)) {
                            optString = ((Object) optString) + " Link: " + ((Object) optString3);
                        }
                        C5651j0.a aVar = C5651j0.f14429a;
                        String str = f14160b;
                        C9768m.m32345e(str, "TAG");
                        aVar.m11454b(enumC5626g0, str, optString);
                    }
                    if (i3 >= length) {
                        break;
                    } else {
                        i2 = i3;
                    }
                }
            }
        }
        if (interfaceC5598b == null) {
            return;
        }
        interfaceC5598b.mo11196b(c5620d0);
    }

    /* renamed from: h */
    private final void m11165h() {
        Bundle bundle = this.f14171m;
        if (m11157J()) {
            bundle.putString("access_token", m11168o());
        } else {
            String m11167m = m11167m();
            if (m11167m != null) {
                bundle.putString("access_token", m11167m);
            }
        }
        if (!bundle.containsKey("access_token")) {
            C5663p0 c5663p0 = C5663p0.f14478a;
            C5608a0 c5608a0 = C5608a0.f14199a;
            if (C5663p0.m11557a0(C5608a0.m11290i())) {
                Log.w(f14160b, "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change.");
            }
        }
        bundle.putString("sdk", "android");
        bundle.putString("format", BodyInterceptorV3.RESPONSE_MODE_JSON);
        C5608a0 c5608a02 = C5608a0.f14199a;
        if (C5608a0.m11306y(EnumC5626g0.GRAPH_API_DEBUG_INFO)) {
            bundle.putString("debug", "info");
        } else if (C5608a0.m11306y(EnumC5626g0.GRAPH_API_DEBUG_WARNING)) {
            bundle.putString("debug", "warning");
        }
    }

    /* renamed from: i */
    private final String m11166i(String str, boolean z) {
        if (!z && this.f14175q == EnumC5622e0.POST) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.f14171m.keySet()) {
            Object obj = this.f14171m.get(str2);
            if (obj == null) {
                obj = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            C5599c c5599c = f14159a;
            if (c5599c.m11218u(obj)) {
                buildUpon.appendQueryParameter(str2, c5599c.m11197C(obj).toString());
            } else if (this.f14175q != EnumC5622e0.GET) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
                String format = String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
                C9768m.m32345e(format, "java.lang.String.format(locale, format, *args)");
                throw new IllegalArgumentException(format);
            }
        }
        String builder = buildUpon.toString();
        C9768m.m32345e(builder, "uriBuilder.toString()");
        return builder;
    }

    /* renamed from: m */
    private final String m11167m() {
        AccessToken accessToken = this.f14165g;
        if (accessToken != null) {
            if (!this.f14171m.containsKey("access_token")) {
                String m11093l = accessToken.m11093l();
                C5651j0.f14429a.m11456d(m11093l);
                return m11093l;
            }
        } else if (!this.f14171m.containsKey("access_token")) {
            return m11168o();
        }
        return this.f14171m.getString("access_token");
    }

    /* renamed from: o */
    private final String m11168o() {
        C5608a0 c5608a0 = C5608a0.f14199a;
        String m11285d = C5608a0.m11285d();
        String m11290i = C5608a0.m11290i();
        if (m11285d.length() > 0) {
            if (m11290i.length() > 0) {
                return m11285d + '|' + m11290i;
            }
        }
        C5663p0 c5663p0 = C5663p0.f14478a;
        C5663p0.m11575j0(f14160b, "Warning: Request without access token missing application ID or client token.");
        return null;
    }

    /* renamed from: r */
    private final String m11169r() {
        if (f14163e.matcher(this.f14166h).matches()) {
            return this.f14166h;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{this.f14173o, this.f14166h}, 2));
        C9768m.m32345e(format, "java.lang.String.format(format, *args)");
        return format;
    }

    /* renamed from: x */
    private final String m11170x(String str) {
        if (!m11172z()) {
            C5659n0 c5659n0 = C5659n0.f14464a;
            str = C5659n0.m11515f();
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{str, m11169r()}, 2));
        C9768m.m32345e(format, "java.lang.String.format(format, *args)");
        return format;
    }

    /* renamed from: y */
    private final boolean m11171y() {
        if (this.f14166h == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("^/?");
        C5608a0 c5608a0 = C5608a0.f14199a;
        sb.append(C5608a0.m11285d());
        sb.append("/?.*");
        return this.f14176r || Pattern.matches(sb.toString(), this.f14166h) || Pattern.matches("^/?app/?.*", this.f14166h);
    }

    /* renamed from: z */
    private final boolean m11172z() {
        C5608a0 c5608a0 = C5608a0.f14199a;
        if (C9768m.m32341a(C5608a0.m11296o(), "instagram.com")) {
            return !m11171y();
        }
        return true;
    }

    /* renamed from: D */
    public final void m11173D(final InterfaceC5598b interfaceC5598b) {
        C5608a0 c5608a0 = C5608a0.f14199a;
        if (C5608a0.m11306y(EnumC5626g0.GRAPH_API_DEBUG_INFO) || C5608a0.m11306y(EnumC5626g0.GRAPH_API_DEBUG_WARNING)) {
            this.f14174p = new InterfaceC5598b() { // from class: com.facebook.q
                @Override // com.facebook.GraphRequest.InterfaceC5598b
                /* renamed from: b */
                public final void mo11196b(C5620d0 c5620d0) {
                    GraphRequest.m11158a(GraphRequest.InterfaceC5598b.this, c5620d0);
                }
            };
        } else {
            this.f14174p = interfaceC5598b;
        }
    }

    /* renamed from: E */
    public final void m11174E(boolean z) {
        this.f14176r = z;
    }

    /* renamed from: F */
    public final void m11175F(JSONObject jSONObject) {
        this.f14167i = jSONObject;
    }

    /* renamed from: G */
    public final void m11176G(EnumC5622e0 enumC5622e0) {
        if (this.f14177s != null && enumC5622e0 != EnumC5622e0.GET) {
            throw new FacebookException("Can't change HTTP method on request with overridden URL.");
        }
        if (enumC5622e0 == null) {
            enumC5622e0 = EnumC5622e0.GET;
        }
        this.f14175q = enumC5622e0;
    }

    /* renamed from: H */
    public final void m11177H(Bundle bundle) {
        C9768m.m32346f(bundle, "<set-?>");
        this.f14171m = bundle;
    }

    /* renamed from: I */
    public final void m11178I(Object obj) {
        this.f14172n = obj;
    }

    /* renamed from: j */
    public final C5620d0 m11179j() {
        return f14159a.m11228f(this);
    }

    /* renamed from: k */
    public final AsyncTaskC5610b0 m11180k() {
        return f14159a.m11234l(this);
    }

    /* renamed from: l */
    public final AccessToken m11181l() {
        return this.f14165g;
    }

    /* renamed from: n */
    public final InterfaceC5598b m11182n() {
        return this.f14174p;
    }

    /* renamed from: p */
    public final JSONObject m11183p() {
        return this.f14167i;
    }

    /* renamed from: q */
    public final String m11184q() {
        return this.f14166h;
    }

    /* renamed from: s */
    public final EnumC5622e0 m11185s() {
        return this.f14175q;
    }

    /* renamed from: t */
    public final Bundle m11186t() {
        return this.f14171m;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{Request: ");
        sb.append(" accessToken: ");
        Object obj = this.f14165g;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        sb.append(", graphPath: ");
        sb.append(this.f14166h);
        sb.append(", graphObject: ");
        sb.append(this.f14167i);
        sb.append(", httpMethod: ");
        sb.append(this.f14175q);
        sb.append(", parameters: ");
        sb.append(this.f14171m);
        sb.append("}");
        String sb2 = sb.toString();
        C9768m.m32345e(sb2, "StringBuilder()\n        .append(\"{Request: \")\n        .append(\" accessToken: \")\n        .append(if (accessToken == null) \"null\" else accessToken)\n        .append(\", graphPath: \")\n        .append(graphPath)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", httpMethod: \")\n        .append(httpMethod)\n        .append(\", parameters: \")\n        .append(parameters)\n        .append(\"}\")\n        .toString()");
        return sb2;
    }

    /* renamed from: u */
    public final String m11187u() {
        if (this.f14177s != null) {
            throw new FacebookException("Can't override URL for a batch request");
        }
        C5659n0 c5659n0 = C5659n0.f14464a;
        String m11170x = m11170x(C5659n0.m11517h());
        m11165h();
        Uri parse = Uri.parse(m11166i(m11170x, true));
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        String format = String.format("%s?%s", Arrays.copyOf(new Object[]{parse.getPath(), parse.getQuery()}, 2));
        C9768m.m32345e(format, "java.lang.String.format(format, *args)");
        return format;
    }

    /* renamed from: v */
    public final Object m11188v() {
        return this.f14172n;
    }

    /* renamed from: w */
    public final String m11189w() {
        String m11518i;
        String str = this.f14177s;
        if (str != null) {
            return String.valueOf(str);
        }
        String str2 = this.f14166h;
        if (this.f14175q == EnumC5622e0.POST && str2 != null && C10513u.m37514p(str2, "/videos", false, 2, null)) {
            C5659n0 c5659n0 = C5659n0.f14464a;
            m11518i = C5659n0.m11519j();
        } else {
            C5659n0 c5659n02 = C5659n0.f14464a;
            C5608a0 c5608a0 = C5608a0.f14199a;
            m11518i = C5659n0.m11518i(C5608a0.m11296o());
        }
        String m11170x = m11170x(m11518i);
        m11165h();
        return m11166i(m11170x, false);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, EnumC5622e0 enumC5622e0, InterfaceC5598b interfaceC5598b, String str2) {
        this.f14170l = true;
        this.f14165g = accessToken;
        this.f14166h = str;
        this.f14173o = str2;
        m11173D(interfaceC5598b);
        m11176G(enumC5622e0);
        if (bundle != null) {
            this.f14171m = new Bundle(bundle);
        } else {
            this.f14171m = new Bundle();
        }
        if (this.f14173o == null) {
            C5608a0 c5608a0 = C5608a0.f14199a;
            this.f14173o = C5608a0.m11295n();
        }
    }

    /* compiled from: GraphRequest.kt */
    public static final class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {

        /* renamed from: g */
        private final String f14179g;

        /* renamed from: h */
        private final RESOURCE f14180h;

        /* renamed from: f */
        public static final C5596b f14178f = new C5596b(null);
        public static final Parcelable.Creator<ParcelableResourceWithMimeType<?>> CREATOR = new C5595a();

        /* compiled from: GraphRequest.kt */
        /* renamed from: com.facebook.GraphRequest$ParcelableResourceWithMimeType$a */
        public static final class C5595a implements Parcelable.Creator<ParcelableResourceWithMimeType<?>> {
            C5595a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ParcelableResourceWithMimeType<?> createFromParcel(Parcel parcel) {
                C9768m.m32346f(parcel, "source");
                return new ParcelableResourceWithMimeType<>(parcel, (C9756g) null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public ParcelableResourceWithMimeType<?>[] newArray(int i2) {
                return new ParcelableResourceWithMimeType[i2];
            }
        }

        /* compiled from: GraphRequest.kt */
        /* renamed from: com.facebook.GraphRequest$ParcelableResourceWithMimeType$b */
        public static final class C5596b {
            private C5596b() {
            }

            public /* synthetic */ C5596b(C9756g c9756g) {
                this();
            }
        }

        public /* synthetic */ ParcelableResourceWithMimeType(Parcel parcel, C9756g c9756g) {
            this(parcel);
        }

        public ParcelableResourceWithMimeType(RESOURCE resource, String str) {
            this.f14179g = str;
            this.f14180h = resource;
        }

        /* renamed from: a */
        public final String m11190a() {
            return this.f14179g;
        }

        /* renamed from: b */
        public final RESOURCE m11191b() {
            return this.f14180h;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            C9768m.m32346f(parcel, "out");
            parcel.writeString(this.f14179g);
            parcel.writeParcelable(this.f14180h, i2);
        }

        private ParcelableResourceWithMimeType(Parcel parcel) {
            this.f14179g = parcel.readString();
            C5608a0 c5608a0 = C5608a0.f14199a;
            this.f14180h = (RESOURCE) parcel.readParcelable(C5608a0.m11284c().getClassLoader());
        }
    }
}
