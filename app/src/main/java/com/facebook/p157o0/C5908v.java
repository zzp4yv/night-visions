package com.facebook.p157o0;

import android.os.Build;
import android.os.Bundle;
import cm.aptoide.p092pt.database.room.RoomNotification;
import com.facebook.EnumC5626g0;
import com.facebook.FacebookException;
import com.facebook.internal.C5651j0;
import com.facebook.internal.C5663p0;
import com.facebook.p157o0.p162n0.C5843a;
import com.facebook.p157o0.p164p0.C5859a;
import com.facebook.p157o0.p165q0.C5869g;
import com.facebook.p157o0.p168t0.C5896a;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.C10742u;
import kotlin.collections.C10792y;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AppEvent.kt */
/* renamed from: com.facebook.o0.v */
/* loaded from: classes.dex */
public final class C5908v implements Serializable {

    /* renamed from: f */
    public static final a f15528f = new a(null);

    /* renamed from: g */
    private static final HashSet<String> f15529g = new HashSet<>();

    /* renamed from: h */
    private final JSONObject f15530h;

    /* renamed from: i */
    private final boolean f15531i;

    /* renamed from: j */
    private final boolean f15532j;

    /* renamed from: k */
    private final String f15533k;

    /* renamed from: l */
    private final String f15534l;

    /* compiled from: AppEvent.kt */
    /* renamed from: com.facebook.o0.v$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public final String m12843c(String str) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                Charset forName = Charset.forName("UTF-8");
                C9768m.m32345e(forName, "Charset.forName(charsetName)");
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes = str.getBytes(forName);
                C9768m.m32345e(bytes, "(this as java.lang.String).getBytes(charset)");
                messageDigest.update(bytes, 0, bytes.length);
                byte[] digest = messageDigest.digest();
                C9768m.m32345e(digest, "digest.digest()");
                C5869g c5869g = C5869g.f15370a;
                return C5869g.m12626c(digest);
            } catch (UnsupportedEncodingException e2) {
                C5663p0 c5663p0 = C5663p0.f14478a;
                C5663p0.m11573i0("Failed to generate checksum: ", e2);
                return "1";
            } catch (NoSuchAlgorithmException e3) {
                C5663p0 c5663p02 = C5663p0.f14478a;
                C5663p0.m11573i0("Failed to generate checksum: ", e3);
                return "0";
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public final void m12844d(String str) {
            boolean contains;
            if (str != null) {
                if (!(str.length() == 0) && str.length() <= 40) {
                    synchronized (C5908v.f15529g) {
                        contains = C5908v.f15529g.contains(str);
                        C10742u c10742u = C10742u.f41439a;
                    }
                    if (contains) {
                        return;
                    }
                    if (new Regex("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").m37438b(str)) {
                        synchronized (C5908v.f15529g) {
                            C5908v.f15529g.add(str);
                        }
                        return;
                    } else {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
                        String format = String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{str}, 1));
                        C9768m.m32345e(format, "java.lang.String.format(format, *args)");
                        throw new FacebookException(format);
                    }
                }
            }
            if (str == null) {
                str = "<None Provided>";
            }
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.f37185a;
            String format2 = String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{str, 40}, 2));
            C9768m.m32345e(format2, "java.lang.String.format(locale, format, *args)");
            throw new FacebookException(format2);
        }
    }

    /* compiled from: AppEvent.kt */
    /* renamed from: com.facebook.o0.v$b */
    public static final class b implements Serializable {

        /* renamed from: f */
        public static final a f15535f = new a(null);

        /* renamed from: g */
        private final String f15536g;

        /* renamed from: h */
        private final boolean f15537h;

        /* renamed from: i */
        private final boolean f15538i;

        /* renamed from: j */
        private final String f15539j;

        /* compiled from: AppEvent.kt */
        /* renamed from: com.facebook.o0.v$b$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(C9756g c9756g) {
                this();
            }
        }

        public b(String str, boolean z, boolean z2, String str2) {
            C9768m.m32346f(str, "jsonString");
            this.f15536g = str;
            this.f15537h = z;
            this.f15538i = z2;
            this.f15539j = str2;
        }

        private final Object readResolve() throws JSONException, ObjectStreamException {
            return new C5908v(this.f15536g, this.f15537h, this.f15538i, this.f15539j, null);
        }
    }

    public C5908v(String str, String str2, Double d2, Bundle bundle, boolean z, boolean z2, UUID uuid) throws JSONException, FacebookException {
        C9768m.m32346f(str, "contextName");
        C9768m.m32346f(str2, "eventName");
        this.f15531i = z;
        this.f15532j = z2;
        this.f15533k = str2;
        this.f15530h = m12834d(str, str2, d2, bundle, uuid);
        this.f15534l = m12833b();
    }

    public /* synthetic */ C5908v(String str, boolean z, boolean z2, String str2, C9756g c9756g) {
        this(str, z, z2, str2);
    }

    /* renamed from: b */
    private final String m12833b() {
        if (Build.VERSION.SDK_INT > 19) {
            a aVar = f15528f;
            String jSONObject = this.f15530h.toString();
            C9768m.m32345e(jSONObject, "jsonObject.toString()");
            return aVar.m12843c(jSONObject);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = this.f15530h.keys();
        while (keys.hasNext()) {
            arrayList.add(keys.next());
        }
        C10792y.m38927x(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            sb.append(str);
            sb.append(" = ");
            sb.append(this.f15530h.optString(str));
            sb.append('\n');
        }
        a aVar2 = f15528f;
        String sb2 = sb.toString();
        C9768m.m32345e(sb2, "sb.toString()");
        return aVar2.m12843c(sb2);
    }

    /* renamed from: d */
    private final JSONObject m12834d(String str, String str2, Double d2, Bundle bundle, UUID uuid) {
        a aVar = f15528f;
        aVar.m12844d(str2);
        JSONObject jSONObject = new JSONObject();
        C5896a c5896a = C5896a.f15481a;
        String m12765e = C5896a.m12765e(str2);
        jSONObject.put("_eventName", m12765e);
        jSONObject.put("_eventName_md5", aVar.m12843c(m12765e));
        jSONObject.put("_logTime", System.currentTimeMillis() / 1000);
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            Map<String, String> m12835i = m12835i(bundle);
            for (String str3 : m12835i.keySet()) {
                jSONObject.put(str3, m12835i.get(str3));
            }
        }
        if (d2 != null) {
            jSONObject.put("_valueToSum", d2.doubleValue());
        }
        if (this.f15532j) {
            jSONObject.put("_inBackground", "1");
        }
        if (this.f15531i) {
            jSONObject.put("_implicitlyLogged", "1");
        } else {
            C5651j0.a aVar2 = C5651j0.f14429a;
            EnumC5626g0 enumC5626g0 = EnumC5626g0.APP_EVENTS;
            String jSONObject2 = jSONObject.toString();
            C9768m.m32345e(jSONObject2, "eventObject.toString()");
            aVar2.m11455c(enumC5626g0, "AppEvents", "Created app event '%s'", jSONObject2);
        }
        return jSONObject;
    }

    /* renamed from: i */
    private final Map<String, String> m12835i(Bundle bundle) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            a aVar = f15528f;
            C9768m.m32345e(str, RoomNotification.KEY);
            aVar.m12844d(str);
            Object obj = bundle.get(str);
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
                String format = String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, str}, 2));
                C9768m.m32345e(format, "java.lang.String.format(format, *args)");
                throw new FacebookException(format);
            }
            hashMap.put(str, obj.toString());
        }
        C5859a c5859a = C5859a.f15336a;
        C5859a.m12581c(hashMap);
        C5896a c5896a = C5896a.f15481a;
        C5896a.m12766f(hashMap, this.f15533k);
        C5843a c5843a = C5843a.f15262a;
        C5843a.m12489c(hashMap, this.f15533k);
        return hashMap;
    }

    private final Object writeReplace() throws ObjectStreamException {
        String jSONObject = this.f15530h.toString();
        C9768m.m32345e(jSONObject, "jsonObject.toString()");
        return new b(jSONObject, this.f15531i, this.f15532j, this.f15534l);
    }

    /* renamed from: c */
    public final boolean m12836c() {
        return this.f15531i;
    }

    /* renamed from: e */
    public final JSONObject m12837e() {
        return this.f15530h;
    }

    /* renamed from: f */
    public final String m12838f() {
        return this.f15533k;
    }

    /* renamed from: g */
    public final boolean m12839g() {
        if (this.f15534l == null) {
            return true;
        }
        return C9768m.m32341a(m12833b(), this.f15534l);
    }

    /* renamed from: h */
    public final boolean m12840h() {
        return this.f15531i;
    }

    public String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        String format = String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{this.f15530h.optString("_eventName"), Boolean.valueOf(this.f15531i), this.f15530h.toString()}, 3));
        C9768m.m32345e(format, "java.lang.String.format(format, *args)");
        return format;
    }

    private C5908v(String str, boolean z, boolean z2, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        this.f15530h = jSONObject;
        this.f15531i = z;
        String optString = jSONObject.optString("_eventName");
        C9768m.m32345e(optString, "jsonObject.optString(Constants.EVENT_NAME_EVENT_KEY)");
        this.f15533k = optString;
        this.f15534l = str2;
        this.f15532j = z2;
    }
}
