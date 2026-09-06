package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@zzard
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzbai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbai> CREATOR = new zzbaj();

    /* renamed from: f */
    @SafeParcelable.Field
    public String f22750f;

    /* renamed from: g */
    @SafeParcelable.Field
    public int f22751g;

    /* renamed from: h */
    @SafeParcelable.Field
    public int f22752h;

    /* renamed from: i */
    @SafeParcelable.Field
    public boolean f22753i;

    /* renamed from: j */
    @SafeParcelable.Field
    private boolean f22754j;

    public zzbai(int i2, int i3, boolean z) {
        this(i2, i3, z, false, false);
    }

    /* renamed from: y */
    public static zzbai m17359y() {
        return new zzbai(12451009, 12451009, true);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14486u(parcel, 2, this.f22750f, false);
        SafeParcelWriter.m14477l(parcel, 3, this.f22751g);
        SafeParcelWriter.m14477l(parcel, 4, this.f22752h);
        SafeParcelWriter.m14468c(parcel, 5, this.f22753i);
        SafeParcelWriter.m14468c(parcel, 6, this.f22754j);
        SafeParcelWriter.m14467b(parcel, m14466a);
    }

    public zzbai(int i2, int i3, boolean z, boolean z2) {
        this(i2, i3, true, false, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private zzbai(int r8, int r9, boolean r10, boolean r11, boolean r12) {
        /*
            r7 = this;
            if (r10 == 0) goto L5
            java.lang.String r11 = "0"
            goto L7
        L5:
            java.lang.String r11 = "1"
        L7:
            int r12 = r11.length()
            int r12 = r12 + 36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r12)
            java.lang.String r12 = "afma-sdk-a-v"
            r0.append(r12)
            r0.append(r8)
            java.lang.String r12 = "."
            r0.append(r12)
            r0.append(r9)
            r0.append(r12)
            r0.append(r11)
            java.lang.String r2 = r0.toString()
            r6 = 0
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbai.<init>(int, int, boolean, boolean, boolean):void");
    }

    @SafeParcelable.Constructor
    zzbai(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) int i3, @SafeParcelable.Param(id = 5) boolean z, @SafeParcelable.Param(id = 6) boolean z2) {
        this.f22750f = str;
        this.f22751g = i2;
        this.f22752h = i3;
        this.f22753i = z;
        this.f22754j = z2;
    }
}
