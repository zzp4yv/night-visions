package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import cm.aptoide.p092pt.aab.C1141a;
import com.facebook.internal.C5663p0;
import com.facebook.internal.C5665q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AuthenticationTokenClaims.kt */
/* loaded from: classes.dex */
public final class AuthenticationTokenClaims implements Parcelable {

    /* renamed from: g */
    private final String f14078g;

    /* renamed from: h */
    private final String f14079h;

    /* renamed from: i */
    private final String f14080i;

    /* renamed from: j */
    private final String f14081j;

    /* renamed from: k */
    private final long f14082k;

    /* renamed from: l */
    private final long f14083l;

    /* renamed from: m */
    private final String f14084m;

    /* renamed from: n */
    private final String f14085n;

    /* renamed from: o */
    private final String f14086o;

    /* renamed from: p */
    private final String f14087p;

    /* renamed from: q */
    private final String f14088q;

    /* renamed from: r */
    private final String f14089r;

    /* renamed from: s */
    private final String f14090s;

    /* renamed from: t */
    private final Set<String> f14091t;

    /* renamed from: u */
    private final String f14092u;

    /* renamed from: v */
    private final Map<String, Integer> f14093v;

    /* renamed from: w */
    private final Map<String, String> f14094w;

    /* renamed from: x */
    private final Map<String, String> f14095x;

    /* renamed from: y */
    private final String f14096y;

    /* renamed from: z */
    private final String f14097z;

    /* renamed from: f */
    public static final C5575b f14077f = new C5575b(null);
    public static final Parcelable.Creator<AuthenticationTokenClaims> CREATOR = new C5574a();

    /* compiled from: AuthenticationTokenClaims.kt */
    /* renamed from: com.facebook.AuthenticationTokenClaims$a */
    public static final class C5574a implements Parcelable.Creator<AuthenticationTokenClaims> {
        C5574a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AuthenticationTokenClaims createFromParcel(Parcel parcel) {
            C9768m.m32346f(parcel, "source");
            return new AuthenticationTokenClaims(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AuthenticationTokenClaims[] newArray(int i2) {
            return new AuthenticationTokenClaims[i2];
        }
    }

    /* compiled from: AuthenticationTokenClaims.kt */
    /* renamed from: com.facebook.AuthenticationTokenClaims$b */
    public static final class C5575b {
        private C5575b() {
        }

        public /* synthetic */ C5575b(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final String m11118a(JSONObject jSONObject, String str) {
            C9768m.m32346f(jSONObject, "<this>");
            C9768m.m32346f(str, "name");
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            return null;
        }
    }

    public AuthenticationTokenClaims(String str, String str2) {
        Set<String> unmodifiableSet;
        Map<String, Integer> unmodifiableMap;
        Map<String, String> unmodifiableMap2;
        C9768m.m32346f(str, "encodedClaims");
        C9768m.m32346f(str2, "expectedNonce");
        C5665q0 c5665q0 = C5665q0.f14500a;
        C5665q0.m11639g(str, "encodedClaims");
        byte[] decode = Base64.decode(str, 8);
        C9768m.m32345e(decode, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(decode, Charsets.f40651b));
        if (!m11114a(jSONObject, str2)) {
            throw new IllegalArgumentException("Invalid claims".toString());
        }
        String string = jSONObject.getString("jti");
        C9768m.m32345e(string, "jsonObj.getString(JSON_KEY_JIT)");
        this.f14078g = string;
        String string2 = jSONObject.getString("iss");
        C9768m.m32345e(string2, "jsonObj.getString(JSON_KEY_ISS)");
        this.f14079h = string2;
        String string3 = jSONObject.getString("aud");
        C9768m.m32345e(string3, "jsonObj.getString(JSON_KEY_AUD)");
        this.f14080i = string3;
        String string4 = jSONObject.getString("nonce");
        C9768m.m32345e(string4, "jsonObj.getString(JSON_KEY_NONCE)");
        this.f14081j = string4;
        this.f14082k = jSONObject.getLong("exp");
        this.f14083l = jSONObject.getLong("iat");
        String string5 = jSONObject.getString("sub");
        C9768m.m32345e(string5, "jsonObj.getString(JSON_KEY_SUB)");
        this.f14084m = string5;
        C5575b c5575b = f14077f;
        this.f14085n = c5575b.m11118a(jSONObject, "name");
        this.f14086o = c5575b.m11118a(jSONObject, "given_name");
        this.f14087p = c5575b.m11118a(jSONObject, "middle_name");
        this.f14088q = c5575b.m11118a(jSONObject, "family_name");
        this.f14089r = c5575b.m11118a(jSONObject, "email");
        this.f14090s = c5575b.m11118a(jSONObject, "picture");
        JSONArray optJSONArray = jSONObject.optJSONArray("user_friends");
        Map<String, String> map = null;
        if (optJSONArray == null) {
            unmodifiableSet = null;
        } else {
            C5663p0 c5663p0 = C5663p0.f14478a;
            unmodifiableSet = Collections.unmodifiableSet(C5663p0.m11563d0(optJSONArray));
        }
        this.f14091t = unmodifiableSet;
        this.f14092u = c5575b.m11118a(jSONObject, "user_birthday");
        JSONObject optJSONObject = jSONObject.optJSONObject("user_age_range");
        if (optJSONObject == null) {
            unmodifiableMap = null;
        } else {
            C5663p0 c5663p02 = C5663p0.f14478a;
            unmodifiableMap = Collections.unmodifiableMap(C5663p0.m11578l(optJSONObject));
        }
        this.f14093v = unmodifiableMap;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("user_hometown");
        if (optJSONObject2 == null) {
            unmodifiableMap2 = null;
        } else {
            C5663p0 c5663p03 = C5663p0.f14478a;
            unmodifiableMap2 = Collections.unmodifiableMap(C5663p0.m11580m(optJSONObject2));
        }
        this.f14094w = unmodifiableMap2;
        JSONObject optJSONObject3 = jSONObject.optJSONObject("user_location");
        if (optJSONObject3 != null) {
            C5663p0 c5663p04 = C5663p0.f14478a;
            map = Collections.unmodifiableMap(C5663p0.m11580m(optJSONObject3));
        }
        this.f14095x = map;
        this.f14096y = c5575b.m11118a(jSONObject, "user_gender");
        this.f14097z = c5575b.m11118a(jSONObject, "user_link");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (kotlin.jvm.internal.C9768m.m32341a(new java.net.URL(r2).getHost(), "www.facebook.com") == false) goto L50;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean m11114a(org.json.JSONObject r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "iss"
            r1 = 0
            if (r9 != 0) goto L6
            return r1
        L6:
            java.lang.String r2 = "jti"
            java.lang.String r3 = r9.optString(r2)
            kotlin.jvm.internal.C9768m.m32345e(r3, r2)
            int r2 = r3.length()
            r3 = 1
            if (r2 != 0) goto L18
            r2 = 1
            goto L19
        L18:
            r2 = 0
        L19:
            if (r2 == 0) goto L1c
            return r1
        L1c:
            java.lang.String r2 = r9.optString(r0)     // Catch: java.net.MalformedURLException -> Ldd
            kotlin.jvm.internal.C9768m.m32345e(r2, r0)     // Catch: java.net.MalformedURLException -> Ldd
            int r0 = r2.length()     // Catch: java.net.MalformedURLException -> Ldd
            if (r0 != 0) goto L2b
            r0 = 1
            goto L2c
        L2b:
            r0 = 0
        L2c:
            if (r0 != 0) goto Ldd
            java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> Ldd
            r0.<init>(r2)     // Catch: java.net.MalformedURLException -> Ldd
            java.lang.String r0 = r0.getHost()     // Catch: java.net.MalformedURLException -> Ldd
            java.lang.String r4 = "facebook.com"
            boolean r0 = kotlin.jvm.internal.C9768m.m32341a(r0, r4)     // Catch: java.net.MalformedURLException -> Ldd
            if (r0 != 0) goto L52
            java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> Ldd
            r0.<init>(r2)     // Catch: java.net.MalformedURLException -> Ldd
            java.lang.String r0 = r0.getHost()     // Catch: java.net.MalformedURLException -> Ldd
            java.lang.String r2 = "www.facebook.com"
            boolean r0 = kotlin.jvm.internal.C9768m.m32341a(r0, r2)     // Catch: java.net.MalformedURLException -> Ldd
            if (r0 != 0) goto L52
            goto Ldd
        L52:
            java.lang.String r0 = "aud"
            java.lang.String r2 = r9.optString(r0)
            kotlin.jvm.internal.C9768m.m32345e(r2, r0)
            int r0 = r2.length()
            if (r0 != 0) goto L63
            r0 = 1
            goto L64
        L63:
            r0 = 0
        L64:
            if (r0 != 0) goto Ldd
            com.facebook.a0 r0 = com.facebook.C5608a0.f14199a
            java.lang.String r0 = com.facebook.C5608a0.m11285d()
            boolean r0 = kotlin.jvm.internal.C9768m.m32341a(r2, r0)
            if (r0 != 0) goto L73
            goto Ldd
        L73:
            java.util.Date r0 = new java.util.Date
            java.lang.String r2 = "exp"
            long r4 = r9.optLong(r2)
            r2 = 1000(0x3e8, float:1.401E-42)
            long r6 = (long) r2
            long r4 = r4 * r6
            r0.<init>(r4)
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            boolean r0 = r2.after(r0)
            if (r0 == 0) goto L8f
            return r1
        L8f:
            java.lang.String r0 = "iat"
            long r4 = r9.optLong(r0)
            java.util.Date r0 = new java.util.Date
            long r4 = r4 * r6
            r6 = 600000(0x927c0, double:2.964394E-318)
            long r4 = r4 + r6
            r0.<init>(r4)
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            boolean r0 = r2.after(r0)
            if (r0 == 0) goto Lac
            return r1
        Lac:
            java.lang.String r0 = "sub"
            java.lang.String r2 = r9.optString(r0)
            kotlin.jvm.internal.C9768m.m32345e(r2, r0)
            int r0 = r2.length()
            if (r0 != 0) goto Lbd
            r0 = 1
            goto Lbe
        Lbd:
            r0 = 0
        Lbe:
            if (r0 == 0) goto Lc1
            return r1
        Lc1:
            java.lang.String r0 = "nonce"
            java.lang.String r9 = r9.optString(r0)
            kotlin.jvm.internal.C9768m.m32345e(r9, r0)
            int r0 = r9.length()
            if (r0 != 0) goto Ld2
            r0 = 1
            goto Ld3
        Ld2:
            r0 = 0
        Ld3:
            if (r0 != 0) goto Ldd
            boolean r9 = kotlin.jvm.internal.C9768m.m32341a(r9, r10)
            if (r9 != 0) goto Ldc
            goto Ldd
        Ldc:
            return r3
        Ldd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.AuthenticationTokenClaims.m11114a(org.json.JSONObject, java.lang.String):boolean");
    }

    /* renamed from: b */
    public final JSONObject m11115b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jti", this.f14078g);
        jSONObject.put("iss", this.f14079h);
        jSONObject.put("aud", this.f14080i);
        jSONObject.put("nonce", this.f14081j);
        jSONObject.put("exp", this.f14082k);
        jSONObject.put("iat", this.f14083l);
        String str = this.f14084m;
        if (str != null) {
            jSONObject.put("sub", str);
        }
        String str2 = this.f14085n;
        if (str2 != null) {
            jSONObject.put("name", str2);
        }
        String str3 = this.f14086o;
        if (str3 != null) {
            jSONObject.put("given_name", str3);
        }
        String str4 = this.f14087p;
        if (str4 != null) {
            jSONObject.put("middle_name", str4);
        }
        String str5 = this.f14088q;
        if (str5 != null) {
            jSONObject.put("family_name", str5);
        }
        String str6 = this.f14089r;
        if (str6 != null) {
            jSONObject.put("email", str6);
        }
        String str7 = this.f14090s;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        if (this.f14091t != null) {
            jSONObject.put("user_friends", new JSONArray((Collection) this.f14091t));
        }
        String str8 = this.f14092u;
        if (str8 != null) {
            jSONObject.put("user_birthday", str8);
        }
        if (this.f14093v != null) {
            jSONObject.put("user_age_range", new JSONObject(this.f14093v));
        }
        if (this.f14094w != null) {
            jSONObject.put("user_hometown", new JSONObject(this.f14094w));
        }
        if (this.f14095x != null) {
            jSONObject.put("user_location", new JSONObject(this.f14095x));
        }
        String str9 = this.f14096y;
        if (str9 != null) {
            jSONObject.put("user_gender", str9);
        }
        String str10 = this.f14097z;
        if (str10 != null) {
            jSONObject.put("user_link", str10);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationTokenClaims)) {
            return false;
        }
        AuthenticationTokenClaims authenticationTokenClaims = (AuthenticationTokenClaims) obj;
        return C9768m.m32341a(this.f14078g, authenticationTokenClaims.f14078g) && C9768m.m32341a(this.f14079h, authenticationTokenClaims.f14079h) && C9768m.m32341a(this.f14080i, authenticationTokenClaims.f14080i) && C9768m.m32341a(this.f14081j, authenticationTokenClaims.f14081j) && this.f14082k == authenticationTokenClaims.f14082k && this.f14083l == authenticationTokenClaims.f14083l && C9768m.m32341a(this.f14084m, authenticationTokenClaims.f14084m) && C9768m.m32341a(this.f14085n, authenticationTokenClaims.f14085n) && C9768m.m32341a(this.f14086o, authenticationTokenClaims.f14086o) && C9768m.m32341a(this.f14087p, authenticationTokenClaims.f14087p) && C9768m.m32341a(this.f14088q, authenticationTokenClaims.f14088q) && C9768m.m32341a(this.f14089r, authenticationTokenClaims.f14089r) && C9768m.m32341a(this.f14090s, authenticationTokenClaims.f14090s) && C9768m.m32341a(this.f14091t, authenticationTokenClaims.f14091t) && C9768m.m32341a(this.f14092u, authenticationTokenClaims.f14092u) && C9768m.m32341a(this.f14093v, authenticationTokenClaims.f14093v) && C9768m.m32341a(this.f14094w, authenticationTokenClaims.f14094w) && C9768m.m32341a(this.f14095x, authenticationTokenClaims.f14095x) && C9768m.m32341a(this.f14096y, authenticationTokenClaims.f14096y) && C9768m.m32341a(this.f14097z, authenticationTokenClaims.f14097z);
    }

    public int hashCode() {
        int hashCode = (((((((((((((527 + this.f14078g.hashCode()) * 31) + this.f14079h.hashCode()) * 31) + this.f14080i.hashCode()) * 31) + this.f14081j.hashCode()) * 31) + C1141a.m6829a(this.f14082k)) * 31) + C1141a.m6829a(this.f14083l)) * 31) + this.f14084m.hashCode()) * 31;
        String str = this.f14085n;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f14086o;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f14087p;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f14088q;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f14089r;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f14090s;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Set<String> set = this.f14091t;
        int hashCode8 = (hashCode7 + (set == null ? 0 : set.hashCode())) * 31;
        String str7 = this.f14092u;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Map<String, Integer> map = this.f14093v;
        int hashCode10 = (hashCode9 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.f14094w;
        int hashCode11 = (hashCode10 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, String> map3 = this.f14095x;
        int hashCode12 = (hashCode11 + (map3 == null ? 0 : map3.hashCode())) * 31;
        String str8 = this.f14096y;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f14097z;
        return hashCode13 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        String jSONObject = m11115b().toString();
        C9768m.m32345e(jSONObject, "claimsJsonObject.toString()");
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        C9768m.m32346f(parcel, "dest");
        parcel.writeString(this.f14078g);
        parcel.writeString(this.f14079h);
        parcel.writeString(this.f14080i);
        parcel.writeString(this.f14081j);
        parcel.writeLong(this.f14082k);
        parcel.writeLong(this.f14083l);
        parcel.writeString(this.f14084m);
        parcel.writeString(this.f14085n);
        parcel.writeString(this.f14086o);
        parcel.writeString(this.f14087p);
        parcel.writeString(this.f14088q);
        parcel.writeString(this.f14089r);
        parcel.writeString(this.f14090s);
        if (this.f14091t == null) {
            parcel.writeStringList(null);
        } else {
            parcel.writeStringList(new ArrayList(this.f14091t));
        }
        parcel.writeString(this.f14092u);
        parcel.writeMap(this.f14093v);
        parcel.writeMap(this.f14094w);
        parcel.writeMap(this.f14095x);
        parcel.writeString(this.f14096y);
        parcel.writeString(this.f14097z);
    }

    public AuthenticationTokenClaims(Parcel parcel) {
        C9768m.m32346f(parcel, "parcel");
        String readString = parcel.readString();
        C5665q0 c5665q0 = C5665q0.f14500a;
        this.f14078g = C5665q0.m11643k(readString, "jti");
        this.f14079h = C5665q0.m11643k(parcel.readString(), "iss");
        this.f14080i = C5665q0.m11643k(parcel.readString(), "aud");
        this.f14081j = C5665q0.m11643k(parcel.readString(), "nonce");
        this.f14082k = parcel.readLong();
        this.f14083l = parcel.readLong();
        this.f14084m = C5665q0.m11643k(parcel.readString(), "sub");
        this.f14085n = parcel.readString();
        this.f14086o = parcel.readString();
        this.f14087p = parcel.readString();
        this.f14088q = parcel.readString();
        this.f14089r = parcel.readString();
        this.f14090s = parcel.readString();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        this.f14091t = createStringArrayList != null ? Collections.unmodifiableSet(new HashSet(createStringArrayList)) : null;
        this.f14092u = parcel.readString();
        HashMap readHashMap = parcel.readHashMap(IntCompanionObject.f37186a.getClass().getClassLoader());
        readHashMap = readHashMap instanceof HashMap ? readHashMap : null;
        this.f14093v = readHashMap != null ? Collections.unmodifiableMap(readHashMap) : null;
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        HashMap readHashMap2 = parcel.readHashMap(stringCompanionObject.getClass().getClassLoader());
        readHashMap2 = readHashMap2 instanceof HashMap ? readHashMap2 : null;
        this.f14094w = readHashMap2 != null ? Collections.unmodifiableMap(readHashMap2) : null;
        HashMap readHashMap3 = parcel.readHashMap(stringCompanionObject.getClass().getClassLoader());
        readHashMap3 = readHashMap3 instanceof HashMap ? readHashMap3 : null;
        this.f14095x = readHashMap3 != null ? Collections.unmodifiableMap(readHashMap3) : null;
        this.f14096y = parcel.readString();
        this.f14097z = parcel.readString();
    }
}
