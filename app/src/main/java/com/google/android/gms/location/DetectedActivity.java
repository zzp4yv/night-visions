package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Comparator;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public class DetectedActivity extends AbstractSafeParcelable {

    /* renamed from: j */
    @SafeParcelable.Field
    private int f28452j;

    /* renamed from: k */
    @SafeParcelable.Field
    private int f28453k;

    /* renamed from: f */
    private static final Comparator<DetectedActivity> f28448f = new C7612d();

    /* renamed from: g */
    private static final int[] f28449g = {9, 10};

    /* renamed from: h */
    private static final int[] f28450h = {0, 1, 2, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 16, 17, 18, 19};

    /* renamed from: i */
    private static final int[] f28451i = {0, 1, 2, 3, 7, 8, 16, 17};
    public static final Parcelable.Creator<DetectedActivity> CREATOR = new zzi();

    @SafeParcelable.Constructor
    public DetectedActivity(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) int i3) {
        this.f28452j = i2;
        this.f28453k = i3;
    }

    /* renamed from: W */
    public static void m22640W(int i2) {
        boolean z = false;
        for (int i3 : f28451i) {
            if (i3 == i2) {
                z = true;
            }
        }
        if (z) {
            return;
        }
        StringBuilder sb = new StringBuilder(81);
        sb.append(i2);
        sb.append(" is not a valid DetectedActivity supported by Activity Transition API.");
        Log.w("DetectedActivity", sb.toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DetectedActivity detectedActivity = (DetectedActivity) obj;
            if (this.f28452j == detectedActivity.f28452j && this.f28453k == detectedActivity.f28453k) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.m14356b(Integer.valueOf(this.f28452j), Integer.valueOf(this.f28453k));
    }

    public String toString() {
        String str;
        int m22642z = m22642z();
        if (m22642z == 0) {
            str = "IN_VEHICLE";
        } else if (m22642z == 1) {
            str = "ON_BICYCLE";
        } else if (m22642z == 2) {
            str = "ON_FOOT";
        } else if (m22642z == 3) {
            str = "STILL";
        } else if (m22642z == 4) {
            str = "UNKNOWN";
        } else if (m22642z == 5) {
            str = "TILTING";
        } else if (m22642z == 7) {
            str = "WALKING";
        } else if (m22642z != 8) {
            switch (m22642z) {
                case 16:
                    str = "IN_ROAD_VEHICLE";
                    break;
                case 17:
                    str = "IN_RAIL_VEHICLE";
                    break;
                case 18:
                    str = "IN_TWO_WHEELER_VEHICLE";
                    break;
                case 19:
                    str = "IN_FOUR_WHEELER_VEHICLE";
                    break;
                default:
                    str = Integer.toString(m22642z);
                    break;
            }
        } else {
            str = "RUNNING";
        }
        int i2 = this.f28453k;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 48);
        sb.append("DetectedActivity [type=");
        sb.append(str);
        sb.append(", confidence=");
        sb.append(i2);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int m14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f28452j);
        SafeParcelWriter.m14477l(parcel, 2, this.f28453k);
        SafeParcelWriter.m14467b(parcel, m14466a);
    }

    /* renamed from: y */
    public int m22641y() {
        return this.f28453k;
    }

    /* renamed from: z */
    public int m22642z() {
        int i2 = this.f28452j;
        if (i2 > 19 || i2 < 0) {
            return 4;
        }
        return i2;
    }
}
