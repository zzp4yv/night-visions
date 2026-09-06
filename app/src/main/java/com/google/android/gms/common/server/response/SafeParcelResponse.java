package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@VisibleForTesting
@KeepForSdk
@SafeParcelable.Class
/* loaded from: classes2.dex */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {

    @KeepForSdk
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new zap();

    /* renamed from: f */
    @SafeParcelable.VersionField
    private final int f17939f;

    /* renamed from: g */
    @SafeParcelable.Field
    private final Parcel f17940g;

    /* renamed from: h */
    private final int f17941h = 2;

    /* renamed from: i */
    @SafeParcelable.Field
    private final zak f17942i;

    /* renamed from: j */
    private final String f17943j;

    /* renamed from: k */
    private int f17944k;

    /* renamed from: l */
    private int f17945l;

    @SafeParcelable.Constructor
    SafeParcelResponse(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) Parcel parcel, @SafeParcelable.Param(id = 3) zak zakVar) {
        this.f17939f = i2;
        this.f17940g = (Parcel) Preconditions.m14372k(parcel);
        this.f17942i = zakVar;
        if (zakVar == null) {
            this.f17943j = null;
        } else {
            this.f17943j = zakVar.m14574z();
        }
        this.f17944k = 2;
    }

    /* renamed from: h */
    private static void m14568h(StringBuilder sb, int i2, Object obj) {
        switch (i2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                sb.append(JsonUtils.m14634a(obj.toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(Base64Utils.m14602a((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(Base64Utils.m14603b((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                MapUtils.m14635a(sb, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unknown type = ");
                sb2.append(i2);
                throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: i */
    private final void m14569i(StringBuilder sb, Map<String, FastJsonResponse.Field<?, ?>> map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry<String, FastJsonResponse.Field<?, ?>> entry : map.entrySet()) {
            sparseArray.put(entry.getValue().m14566p0(), entry);
        }
        sb.append('{');
        int m14434L = SafeParcelReader.m14434L(parcel);
        boolean z = false;
        while (parcel.dataPosition() < m14434L) {
            int m14425C = SafeParcelReader.m14425C(parcel);
            Map.Entry entry2 = (Map.Entry) sparseArray.get(SafeParcelReader.m14458v(m14425C));
            if (entry2 != null) {
                if (z) {
                    sb.append(",");
                }
                String str = (String) entry2.getKey();
                FastJsonResponse.Field<?, ?> field = (FastJsonResponse.Field) entry2.getValue();
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (field.m14564a1()) {
                    switch (field.f17911i) {
                        case 0:
                            m14570j(sb, field, FastJsonResponse.m14551g(field, Integer.valueOf(SafeParcelReader.m14427E(parcel, m14425C))));
                            break;
                        case 1:
                            m14570j(sb, field, FastJsonResponse.m14551g(field, SafeParcelReader.m14439c(parcel, m14425C)));
                            break;
                        case 2:
                            m14570j(sb, field, FastJsonResponse.m14551g(field, Long.valueOf(SafeParcelReader.m14429G(parcel, m14425C))));
                            break;
                        case 3:
                            m14570j(sb, field, FastJsonResponse.m14551g(field, Float.valueOf(SafeParcelReader.m14423A(parcel, m14425C))));
                            break;
                        case 4:
                            m14570j(sb, field, FastJsonResponse.m14551g(field, Double.valueOf(SafeParcelReader.m14461y(parcel, m14425C))));
                            break;
                        case 5:
                            m14570j(sb, field, FastJsonResponse.m14551g(field, SafeParcelReader.m14437a(parcel, m14425C)));
                            break;
                        case 6:
                            m14570j(sb, field, FastJsonResponse.m14551g(field, Boolean.valueOf(SafeParcelReader.m14459w(parcel, m14425C))));
                            break;
                        case 7:
                            m14570j(sb, field, FastJsonResponse.m14551g(field, SafeParcelReader.m14452p(parcel, m14425C)));
                            break;
                        case 8:
                        case 9:
                            m14570j(sb, field, FastJsonResponse.m14551g(field, SafeParcelReader.m14443g(parcel, m14425C)));
                            break;
                        case 10:
                            Bundle m14442f = SafeParcelReader.m14442f(parcel, m14425C);
                            HashMap hashMap = new HashMap();
                            for (String str2 : m14442f.keySet()) {
                                hashMap.put(str2, m14442f.getString(str2));
                            }
                            m14570j(sb, field, FastJsonResponse.m14551g(field, hashMap));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            int i2 = field.f17911i;
                            StringBuilder sb2 = new StringBuilder(36);
                            sb2.append("Unknown field out type = ");
                            sb2.append(i2);
                            throw new IllegalArgumentException(sb2.toString());
                    }
                } else if (field.f17912j) {
                    sb.append("[");
                    switch (field.f17911i) {
                        case 0:
                            ArrayUtils.m14597e(sb, SafeParcelReader.m14446j(parcel, m14425C));
                            break;
                        case 1:
                            ArrayUtils.m14599g(sb, SafeParcelReader.m14440d(parcel, m14425C));
                            break;
                        case 2:
                            ArrayUtils.m14598f(sb, SafeParcelReader.m14448l(parcel, m14425C));
                            break;
                        case 3:
                            ArrayUtils.m14596d(sb, SafeParcelReader.m14445i(parcel, m14425C));
                            break;
                        case 4:
                            ArrayUtils.m14595c(sb, SafeParcelReader.m14444h(parcel, m14425C));
                            break;
                        case 5:
                            ArrayUtils.m14599g(sb, SafeParcelReader.m14438b(parcel, m14425C));
                            break;
                        case 6:
                            ArrayUtils.m14600h(sb, SafeParcelReader.m14441e(parcel, m14425C));
                            break;
                        case 7:
                            ArrayUtils.m14601i(sb, SafeParcelReader.m14453q(parcel, m14425C));
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            Parcel[] m14450n = SafeParcelReader.m14450n(parcel, m14425C);
                            int length = m14450n.length;
                            for (int i3 = 0; i3 < length; i3++) {
                                if (i3 > 0) {
                                    sb.append(",");
                                }
                                m14450n[i3].setDataPosition(0);
                                m14569i(sb, field.m14567r1(), m14450n[i3]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append("]");
                } else {
                    switch (field.f17911i) {
                        case 0:
                            sb.append(SafeParcelReader.m14427E(parcel, m14425C));
                            break;
                        case 1:
                            sb.append(SafeParcelReader.m14439c(parcel, m14425C));
                            break;
                        case 2:
                            sb.append(SafeParcelReader.m14429G(parcel, m14425C));
                            break;
                        case 3:
                            sb.append(SafeParcelReader.m14423A(parcel, m14425C));
                            break;
                        case 4:
                            sb.append(SafeParcelReader.m14461y(parcel, m14425C));
                            break;
                        case 5:
                            sb.append(SafeParcelReader.m14437a(parcel, m14425C));
                            break;
                        case 6:
                            sb.append(SafeParcelReader.m14459w(parcel, m14425C));
                            break;
                        case 7:
                            String m14452p = SafeParcelReader.m14452p(parcel, m14425C);
                            sb.append("\"");
                            sb.append(JsonUtils.m14634a(m14452p));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] m14443g = SafeParcelReader.m14443g(parcel, m14425C);
                            sb.append("\"");
                            sb.append(Base64Utils.m14602a(m14443g));
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] m14443g2 = SafeParcelReader.m14443g(parcel, m14425C);
                            sb.append("\"");
                            sb.append(Base64Utils.m14603b(m14443g2));
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle m14442f2 = SafeParcelReader.m14442f(parcel, m14425C);
                            Set<String> keySet = m14442f2.keySet();
                            keySet.size();
                            sb.append("{");
                            boolean z2 = true;
                            for (String str3 : keySet) {
                                if (!z2) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(str3);
                                sb.append("\"");
                                sb.append(":");
                                sb.append("\"");
                                sb.append(JsonUtils.m14634a(m14442f2.getString(str3)));
                                sb.append("\"");
                                z2 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            Parcel m14449m = SafeParcelReader.m14449m(parcel, m14425C);
                            m14449m.setDataPosition(0);
                            m14569i(sb, field.m14567r1(), m14449m);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z = true;
            }
        }
        if (parcel.dataPosition() == m14434L) {
            sb.append('}');
            return;
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Overread allowed size end=");
        sb3.append(m14434L);
        throw new SafeParcelReader.ParseException(sb3.toString(), parcel);
    }

    /* renamed from: j */
    private final void m14570j(StringBuilder sb, FastJsonResponse.Field<?, ?> field, Object obj) {
        if (!field.f17910h) {
            m14568h(sb, field.f17909g, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb.append("[");
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 != 0) {
                sb.append(",");
            }
            m14568h(sb, field.f17909g, arrayList.get(i2));
        }
        sb.append("]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0005, code lost:
    
        if (r0 != 1) goto L9;
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.os.Parcel m14571k() {
        /*
            r2 = this;
            int r0 = r2.f17944k
            if (r0 == 0) goto L8
            r1 = 1
            if (r0 == r1) goto L10
            goto L1a
        L8:
            android.os.Parcel r0 = r2.f17940g
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.m14466a(r0)
            r2.f17945l = r0
        L10:
            android.os.Parcel r0 = r2.f17940g
            int r1 = r2.f17945l
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.m14467b(r0, r1)
            r0 = 2
            r2.f17944k = r0
        L1a:
            android.os.Parcel r0 = r2.f17940g
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.SafeParcelResponse.m14571k():android.os.Parcel");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: a */
    public Map<String, FastJsonResponse.Field<?, ?>> mo13610a() {
        zak zakVar = this.f17942i;
        if (zakVar == null) {
            return null;
        }
        return zakVar.m14572W(this.f17943j);
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: c */
    public Object mo14552c(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: e */
    public boolean mo14553e(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public String toString() {
        Preconditions.m14373l(this.f17942i, "Cannot convert to JSON on client side.");
        Parcel m14571k = m14571k();
        m14571k.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        m14569i(sb, this.f17942i.m14572W(this.f17943j), m14571k);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        zak zakVar;
        int m14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f17939f);
        SafeParcelWriter.m14483r(parcel, 2, m14571k(), false);
        int i3 = this.f17941h;
        if (i3 == 0) {
            zakVar = null;
        } else if (i3 == 1) {
            zakVar = this.f17942i;
        } else {
            if (i3 != 2) {
                int i4 = this.f17941h;
                StringBuilder sb = new StringBuilder(34);
                sb.append("Invalid creation type: ");
                sb.append(i4);
                throw new IllegalStateException(sb.toString());
            }
            zakVar = this.f17942i;
        }
        SafeParcelWriter.m14484s(parcel, 3, zakVar, i2, false);
        SafeParcelWriter.m14467b(parcel, m14466a);
    }
}
