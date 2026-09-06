package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.facebook.internal.C5665q0;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AuthenticationTokenHeader.kt */
/* loaded from: classes.dex */
public final class AuthenticationTokenHeader implements Parcelable {

    /* renamed from: g */
    private final String f14099g;

    /* renamed from: h */
    private final String f14100h;

    /* renamed from: i */
    private final String f14101i;

    /* renamed from: f */
    public static final C5577b f14098f = new C5577b(null);
    public static final Parcelable.Creator<AuthenticationTokenHeader> CREATOR = new C5576a();

    /* compiled from: AuthenticationTokenHeader.kt */
    /* renamed from: com.facebook.AuthenticationTokenHeader$a */
    public static final class C5576a implements Parcelable.Creator<AuthenticationTokenHeader> {
        C5576a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AuthenticationTokenHeader createFromParcel(Parcel parcel) {
            C9768m.m32346f(parcel, "source");
            return new AuthenticationTokenHeader(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AuthenticationTokenHeader[] newArray(int i2) {
            return new AuthenticationTokenHeader[i2];
        }
    }

    /* compiled from: AuthenticationTokenHeader.kt */
    /* renamed from: com.facebook.AuthenticationTokenHeader$b */
    public static final class C5577b {
        private C5577b() {
        }

        public /* synthetic */ C5577b(C9756g c9756g) {
            this();
        }
    }

    public AuthenticationTokenHeader(String str) {
        C9768m.m32346f(str, "encodedHeaderString");
        if (!m11119b(str)) {
            throw new IllegalArgumentException("Invalid Header".toString());
        }
        byte[] decode = Base64.decode(str, 0);
        C9768m.m32345e(decode, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(decode, Charsets.f40651b));
        String string = jSONObject.getString("alg");
        C9768m.m32345e(string, "jsonObj.getString(\"alg\")");
        this.f14099g = string;
        String string2 = jSONObject.getString("typ");
        C9768m.m32345e(string2, "jsonObj.getString(\"typ\")");
        this.f14100h = string2;
        String string3 = jSONObject.getString("kid");
        C9768m.m32345e(string3, "jsonObj.getString(\"kid\")");
        this.f14101i = string3;
    }

    /* renamed from: b */
    private final boolean m11119b(String str) {
        C5665q0 c5665q0 = C5665q0.f14500a;
        C5665q0.m11639g(str, "encodedHeaderString");
        byte[] decode = Base64.decode(str, 0);
        C9768m.m32345e(decode, "decodedBytes");
        try {
            JSONObject jSONObject = new JSONObject(new String(decode, Charsets.f40651b));
            String optString = jSONObject.optString("alg");
            C9768m.m32345e(optString, "alg");
            boolean z = (optString.length() > 0) && C9768m.m32341a(optString, "RS256");
            String optString2 = jSONObject.optString("kid");
            C9768m.m32345e(optString2, "jsonObj.optString(\"kid\")");
            boolean z2 = optString2.length() > 0;
            String optString3 = jSONObject.optString("typ");
            C9768m.m32345e(optString3, "jsonObj.optString(\"typ\")");
            return z && z2 && (optString3.length() > 0);
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final String m11120a() {
        return this.f14101i;
    }

    /* renamed from: c */
    public final JSONObject m11121c() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.f14099g);
        jSONObject.put("typ", this.f14100h);
        jSONObject.put("kid", this.f14101i);
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
        if (!(obj instanceof AuthenticationTokenHeader)) {
            return false;
        }
        AuthenticationTokenHeader authenticationTokenHeader = (AuthenticationTokenHeader) obj;
        return C9768m.m32341a(this.f14099g, authenticationTokenHeader.f14099g) && C9768m.m32341a(this.f14100h, authenticationTokenHeader.f14100h) && C9768m.m32341a(this.f14101i, authenticationTokenHeader.f14101i);
    }

    public int hashCode() {
        return ((((527 + this.f14099g.hashCode()) * 31) + this.f14100h.hashCode()) * 31) + this.f14101i.hashCode();
    }

    public String toString() {
        String jSONObject = m11121c().toString();
        C9768m.m32345e(jSONObject, "headerJsonObject.toString()");
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        C9768m.m32346f(parcel, "dest");
        parcel.writeString(this.f14099g);
        parcel.writeString(this.f14100h);
        parcel.writeString(this.f14101i);
    }

    public AuthenticationTokenHeader(Parcel parcel) {
        C9768m.m32346f(parcel, "parcel");
        String readString = parcel.readString();
        C5665q0 c5665q0 = C5665q0.f14500a;
        this.f14099g = C5665q0.m11643k(readString, "alg");
        this.f14100h = C5665q0.m11643k(parcel.readString(), "typ");
        this.f14101i = C5665q0.m11643k(parcel.readString(), "kid");
    }
}
