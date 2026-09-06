package com.google.firebase.crashlytics.internal.p187q;

import com.google.firebase.crashlytics.internal.C8146h;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import okhttp3.HttpUrl;

/* compiled from: HttpGetRequest.java */
/* renamed from: com.google.firebase.crashlytics.h.q.a */
/* loaded from: classes2.dex */
public class C8257a {

    /* renamed from: a */
    private final String f31539a;

    /* renamed from: b */
    private final Map<String, String> f31540b;

    /* renamed from: c */
    private final Map<String, String> f31541c = new HashMap();

    public C8257a(String str, Map<String, String> map) {
        this.f31539a = str;
        this.f31540b = map;
    }

    /* renamed from: a */
    private String m25948a(Map<String, String> map) throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        Map.Entry<String, String> next = it.next();
        sb.append(next.getKey());
        sb.append("=");
        sb.append(next.getValue() != null ? URLEncoder.encode(next.getValue(), "UTF-8") : HttpUrl.FRAGMENT_ENCODE_SET);
        while (it.hasNext()) {
            Map.Entry<String, String> next2 = it.next();
            sb.append("&");
            sb.append(next2.getKey());
            sb.append("=");
            sb.append(next2.getValue() != null ? URLEncoder.encode(next2.getValue(), "UTF-8") : HttpUrl.FRAGMENT_ENCODE_SET);
        }
        return sb.toString();
    }

    /* renamed from: b */
    private String m25949b(String str, Map<String, String> map) throws UnsupportedEncodingException {
        String m25948a = m25948a(map);
        if (m25948a.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return str + "?" + m25948a;
        }
        if (!str.endsWith("&")) {
            m25948a = "&" + m25948a;
        }
        return str + m25948a;
    }

    /* renamed from: e */
    private String m25950e(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        char[] cArr = new char[8192];
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, read);
        }
    }

    /* renamed from: c */
    public C8259c m25951c() throws IOException {
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream = null;
        String m25950e = null;
        inputStream = null;
        try {
            String m25949b = m25949b(this.f31539a, this.f31540b);
            C8146h.m25176f().m25183i("GET Request URL: " + m25949b);
            httpsURLConnection = (HttpsURLConnection) new URL(m25949b).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry<String, String> entry : this.f31541c.entrySet()) {
                    httpsURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        m25950e = m25950e(inputStream2);
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new C8259c(responseCode, m25950e);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    /* renamed from: d */
    public C8257a m25952d(String str, String str2) {
        this.f31541c.put(str, str2);
        return this;
    }
}
