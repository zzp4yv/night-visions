package com.google.android.gms.location;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.internal.location.zze;

/* loaded from: classes2.dex */
public class ActivityRecognition {

    /* renamed from: a */
    private static final Api.ClientKey<zzaz> f28427a;

    /* renamed from: b */
    private static final Api.AbstractClientBuilder<zzaz, Api.ApiOptions.NoOptions> f28428b;

    /* renamed from: c */
    public static final Api<Api.ApiOptions.NoOptions> f28429c;

    /* renamed from: d */
    @Deprecated
    public static final ActivityRecognitionApi f28430d;

    public static abstract class zza<R extends Result> extends BaseImplementation.ApiMethodImpl<R, zzaz> {
    }

    static {
        Api.ClientKey<zzaz> clientKey = new Api.ClientKey<>();
        f28427a = clientKey;
        C7609a c7609a = new C7609a();
        f28428b = c7609a;
        f28429c = new Api<>("ActivityRecognition.API", c7609a, clientKey);
        f28430d = new zze();
    }

    private ActivityRecognition() {
    }
}
