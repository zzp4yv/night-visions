package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;

/* loaded from: classes2.dex */
public class GoogleApiAvailabilityCache {

    /* renamed from: a */
    private final SparseIntArray f17766a;

    /* renamed from: b */
    private GoogleApiAvailabilityLight f17767b;

    public GoogleApiAvailabilityCache() {
        this(GoogleApiAvailability.m13803q());
    }

    /* renamed from: a */
    public void m14345a() {
        this.f17766a.clear();
    }

    /* renamed from: b */
    public int m14346b(Context context, Api.Client client) {
        Preconditions.m14372k(context);
        Preconditions.m14372k(client);
        int i2 = 0;
        if (!client.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = client.getMinApkVersion();
        int i3 = this.f17766a.get(minApkVersion, -1);
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= this.f17766a.size()) {
                i2 = i3;
                break;
            }
            int keyAt = this.f17766a.keyAt(i4);
            if (keyAt > minApkVersion && this.f17766a.get(keyAt) == 0) {
                break;
            }
            i4++;
        }
        if (i2 == -1) {
            i2 = this.f17767b.mo13813j(context, minApkVersion);
        }
        this.f17766a.put(minApkVersion, i2);
        return i2;
    }

    public GoogleApiAvailabilityCache(GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.f17766a = new SparseIntArray();
        Preconditions.m14372k(googleApiAvailabilityLight);
        this.f17767b = googleApiAvailabilityLight;
    }
}
