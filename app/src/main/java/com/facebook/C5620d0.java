package com.facebook;

import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.internal.C5651j0;
import com.facebook.internal.C5663p0;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.C10786v;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* compiled from: GraphResponse.kt */
/* renamed from: com.facebook.d0 */
/* loaded from: classes.dex */
public final class C5620d0 {

    /* renamed from: a */
    public static final a f14271a = new a(null);

    /* renamed from: b */
    private static final String f14272b = C5620d0.class.getCanonicalName();

    /* renamed from: c */
    private final GraphRequest f14273c;

    /* renamed from: d */
    private final HttpURLConnection f14274d;

    /* renamed from: e */
    private final String f14275e;

    /* renamed from: f */
    private final JSONObject f14276f;

    /* renamed from: g */
    private final JSONArray f14277g;

    /* renamed from: h */
    private final FacebookRequestError f14278h;

    /* renamed from: i */
    private final JSONObject f14279i;

    /* renamed from: j */
    private final JSONArray f14280j;

    /* compiled from: GraphResponse.kt */
    /* renamed from: com.facebook.d0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: b */
        private final C5620d0 m11341b(GraphRequest graphRequest, HttpURLConnection httpURLConnection, Object obj, Object obj2) throws JSONException {
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                FacebookRequestError m11149a = FacebookRequestError.f14134f.m11149a(jSONObject, obj2, httpURLConnection);
                if (m11149a != null) {
                    Log.e(C5620d0.f14272b, m11149a.toString());
                    if (m11149a.m11140b() == 190) {
                        C5663p0 c5663p0 = C5663p0.f14478a;
                        if (C5663p0.m11552W(graphRequest.m11181l())) {
                            if (m11149a.m11145g() != 493) {
                                AccessToken.f14054f.m11108h(null);
                            } else {
                                AccessToken.C5570c c5570c = AccessToken.f14054f;
                                AccessToken m11105e = c5570c.m11105e();
                                if (C9768m.m32341a(m11105e != null ? Boolean.valueOf(m11105e.m11095n()) : null, Boolean.FALSE)) {
                                    c5570c.m11104d();
                                }
                            }
                        }
                    }
                    return new C5620d0(graphRequest, httpURLConnection, m11149a);
                }
                C5663p0 c5663p02 = C5663p0.f14478a;
                Object m11543M = C5663p0.m11543M(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
                if (m11543M instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) m11543M;
                    return new C5620d0(graphRequest, httpURLConnection, jSONObject2.toString(), jSONObject2);
                }
                if (m11543M instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) m11543M;
                    return new C5620d0(graphRequest, httpURLConnection, jSONArray.toString(), jSONArray);
                }
                obj = JSONObject.NULL;
                C9768m.m32345e(obj, "NULL");
            }
            if (obj == JSONObject.NULL) {
                return new C5620d0(graphRequest, httpURLConnection, obj.toString(), (JSONObject) null);
            }
            throw new FacebookException(C9768m.m32354n("Got unexpected object type in response, class: ", obj.getClass().getSimpleName()));
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0056  */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final java.util.List<com.facebook.C5620d0> m11342c(java.net.HttpURLConnection r9, java.util.List<com.facebook.GraphRequest> r10, java.lang.Object r11) throws com.facebook.FacebookException, org.json.JSONException {
            /*
                r8 = this;
                int r0 = r10.size()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r0)
                r2 = 0
                r3 = 1
                if (r0 != r3) goto L51
                java.lang.Object r3 = r10.get(r2)
                com.facebook.GraphRequest r3 = (com.facebook.GraphRequest) r3
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.io.IOException -> L34 org.json.JSONException -> L43
                r4.<init>()     // Catch: java.io.IOException -> L34 org.json.JSONException -> L43
                java.lang.String r5 = "body"
                r4.put(r5, r11)     // Catch: java.io.IOException -> L34 org.json.JSONException -> L43
                if (r9 != 0) goto L22
                r5 = 200(0xc8, float:2.8E-43)
                goto L26
            L22:
                int r5 = r9.getResponseCode()     // Catch: java.io.IOException -> L34 org.json.JSONException -> L43
            L26:
                java.lang.String r6 = "code"
                r4.put(r6, r5)     // Catch: java.io.IOException -> L34 org.json.JSONException -> L43
                org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.io.IOException -> L34 org.json.JSONException -> L43
                r5.<init>()     // Catch: java.io.IOException -> L34 org.json.JSONException -> L43
                r5.put(r4)     // Catch: java.io.IOException -> L34 org.json.JSONException -> L43
                goto L52
            L34:
                r4 = move-exception
                com.facebook.d0 r5 = new com.facebook.d0
                com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
                r6.<init>(r9, r4)
                r5.<init>(r3, r9, r6)
                r1.add(r5)
                goto L51
            L43:
                r4 = move-exception
                com.facebook.d0 r5 = new com.facebook.d0
                com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
                r6.<init>(r9, r4)
                r5.<init>(r3, r9, r6)
                r1.add(r5)
            L51:
                r5 = r11
            L52:
                boolean r3 = r5 instanceof org.json.JSONArray
                if (r3 == 0) goto La4
                r3 = r5
                org.json.JSONArray r3 = (org.json.JSONArray) r3
                int r4 = r3.length()
                if (r4 != r0) goto La4
                int r0 = r3.length()
                if (r0 <= 0) goto La3
            L65:
                int r3 = r2 + 1
                java.lang.Object r4 = r10.get(r2)
                com.facebook.GraphRequest r4 = (com.facebook.GraphRequest) r4
                r6 = r5
                org.json.JSONArray r6 = (org.json.JSONArray) r6     // Catch: com.facebook.FacebookException -> L81 org.json.JSONException -> L90
                java.lang.Object r2 = r6.get(r2)     // Catch: com.facebook.FacebookException -> L81 org.json.JSONException -> L90
                java.lang.String r6 = "obj"
                kotlin.jvm.internal.C9768m.m32345e(r2, r6)     // Catch: com.facebook.FacebookException -> L81 org.json.JSONException -> L90
                com.facebook.d0 r2 = r8.m11341b(r4, r9, r2, r11)     // Catch: com.facebook.FacebookException -> L81 org.json.JSONException -> L90
                r1.add(r2)     // Catch: com.facebook.FacebookException -> L81 org.json.JSONException -> L90
                goto L9e
            L81:
                r2 = move-exception
                com.facebook.d0 r6 = new com.facebook.d0
                com.facebook.FacebookRequestError r7 = new com.facebook.FacebookRequestError
                r7.<init>(r9, r2)
                r6.<init>(r4, r9, r7)
                r1.add(r6)
                goto L9e
            L90:
                r2 = move-exception
                com.facebook.d0 r6 = new com.facebook.d0
                com.facebook.FacebookRequestError r7 = new com.facebook.FacebookRequestError
                r7.<init>(r9, r2)
                r6.<init>(r4, r9, r7)
                r1.add(r6)
            L9e:
                if (r3 < r0) goto La1
                goto La3
            La1:
                r2 = r3
                goto L65
            La3:
                return r1
            La4:
                com.facebook.FacebookException r9 = new com.facebook.FacebookException
                java.lang.String r10 = "Unexpected number of results"
                r9.<init>(r10)
                goto Lad
            Lac:
                throw r9
            Lad:
                goto Lac
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.C5620d0.a.m11342c(java.net.HttpURLConnection, java.util.List, java.lang.Object):java.util.List");
        }

        /* renamed from: a */
        public final List<C5620d0> m11343a(List<GraphRequest> list, HttpURLConnection httpURLConnection, FacebookException facebookException) {
            C9768m.m32346f(list, "requests");
            ArrayList arrayList = new ArrayList(C10786v.m38911u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C5620d0((GraphRequest) it.next(), httpURLConnection, new FacebookRequestError(httpURLConnection, facebookException)));
            }
            return arrayList;
        }

        /* renamed from: d */
        public final List<C5620d0> m11344d(InputStream inputStream, HttpURLConnection httpURLConnection, C5613c0 c5613c0) throws FacebookException, JSONException, IOException {
            C9768m.m32346f(c5613c0, "requests");
            C5663p0 c5663p0 = C5663p0.f14478a;
            String m11593s0 = C5663p0.m11593s0(inputStream);
            C5651j0.f14429a.m11455c(EnumC5626g0.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(m11593s0.length()), m11593s0);
            return m11345e(m11593s0, httpURLConnection, c5613c0);
        }

        /* renamed from: e */
        public final List<C5620d0> m11345e(String str, HttpURLConnection httpURLConnection, C5613c0 c5613c0) throws FacebookException, JSONException, IOException {
            C9768m.m32346f(str, "responseString");
            C9768m.m32346f(c5613c0, "requests");
            Object nextValue = new JSONTokener(str).nextValue();
            C9768m.m32345e(nextValue, "resultObject");
            List<C5620d0> m11342c = m11342c(httpURLConnection, c5613c0, nextValue);
            C5651j0.f14429a.m11455c(EnumC5626g0.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", c5613c0.m11331v(), Integer.valueOf(str.length()), m11342c);
            return m11342c;
        }

        /* renamed from: f */
        public final List<C5620d0> m11346f(HttpURLConnection httpURLConnection, C5613c0 c5613c0) {
            List<C5620d0> m11343a;
            C9768m.m32346f(httpURLConnection, "connection");
            C9768m.m32346f(c5613c0, "requests");
            InputStream inputStream = null;
            try {
                try {
                    try {
                        C5608a0 c5608a0 = C5608a0.f14199a;
                    } catch (Exception e2) {
                        C5651j0.f14429a.m11455c(EnumC5626g0.REQUESTS, "Response", "Response <Error>: %s", e2);
                        m11343a = m11343a(c5613c0, httpURLConnection, new FacebookException(e2));
                    }
                } catch (FacebookException e3) {
                    C5651j0.f14429a.m11455c(EnumC5626g0.REQUESTS, "Response", "Response <Error>: %s", e3);
                    m11343a = m11343a(c5613c0, httpURLConnection, e3);
                }
                if (!C5608a0.m11303v()) {
                    Log.e(C5620d0.f14272b, "GraphRequest can't be used when Facebook SDK isn't fully initialized");
                    throw new FacebookException("GraphRequest can't be used when Facebook SDK isn't fully initialized");
                }
                inputStream = httpURLConnection.getResponseCode() >= 400 ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
                m11343a = m11344d(inputStream, httpURLConnection, c5613c0);
                return m11343a;
            } finally {
                C5663p0 c5663p0 = C5663p0.f14478a;
                C5663p0.m11570h(null);
            }
        }
    }

    public C5620d0(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        C9768m.m32346f(graphRequest, "request");
        this.f14273c = graphRequest;
        this.f14274d = httpURLConnection;
        this.f14275e = str;
        this.f14276f = jSONObject;
        this.f14277g = jSONArray;
        this.f14278h = facebookRequestError;
        this.f14279i = jSONObject;
        this.f14280j = jSONArray;
    }

    /* renamed from: b */
    public final FacebookRequestError m11338b() {
        return this.f14278h;
    }

    /* renamed from: c */
    public final JSONObject m11339c() {
        return this.f14276f;
    }

    /* renamed from: d */
    public final JSONObject m11340d() {
        return this.f14279i;
    }

    public String toString() {
        String str;
        try {
            StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            HttpURLConnection httpURLConnection = this.f14274d;
            objArr[0] = Integer.valueOf(httpURLConnection == null ? 200 : httpURLConnection.getResponseCode());
            str = String.format(locale, "%d", Arrays.copyOf(objArr, 1));
            C9768m.m32345e(str, "java.lang.String.format(locale, format, *args)");
        } catch (IOException unused) {
            str = "unknown";
        }
        String str2 = "{Response:  responseCode: " + str + ", graphObject: " + this.f14276f + ", error: " + this.f14278h + "}";
        C9768m.m32345e(str2, "StringBuilder()\n        .append(\"{Response: \")\n        .append(\" responseCode: \")\n        .append(responseCode)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", error: \")\n        .append(error)\n        .append(\"}\")\n        .toString()");
        return str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5620d0(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(graphRequest, httpURLConnection, str, jSONObject, null, null);
        C9768m.m32346f(graphRequest, "request");
        C9768m.m32346f(str, "rawResponse");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5620d0(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONArray jSONArray) {
        this(graphRequest, httpURLConnection, str, null, jSONArray, null);
        C9768m.m32346f(graphRequest, "request");
        C9768m.m32346f(str, "rawResponse");
        C9768m.m32346f(jSONArray, "graphObjects");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5620d0(GraphRequest graphRequest, HttpURLConnection httpURLConnection, FacebookRequestError facebookRequestError) {
        this(graphRequest, httpURLConnection, null, null, null, facebookRequestError);
        C9768m.m32346f(graphRequest, "request");
        C9768m.m32346f(facebookRequestError, "error");
    }
}
