package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes2.dex */
public final class zzw extends zzr {

    /* renamed from: f */
    private final Context f17103f;

    public zzw(Context context) {
        this.f17103f = context;
    }

    /* renamed from: P */
    private final void m13742P() {
        if (GooglePlayServicesUtilLight.isGooglePlayServicesUid(this.f17103f, Binder.getCallingUid())) {
            return;
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder sb = new StringBuilder(52);
        sb.append("Calling UID ");
        sb.append(callingUid);
        sb.append(" is not Google Play services.");
        throw new SecurityException(sb.toString());
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzq
    /* renamed from: O */
    public final void mo13737O() {
        m13742P();
        zzp.m13733c(this.f17103f).m13735a();
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzq
    /* renamed from: v */
    public final void mo13738v() {
        m13742P();
        Storage m13705b = Storage.m13705b(this.f17103f);
        GoogleSignInAccount m13713c = m13705b.m13713c();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f17045k;
        if (m13713c != null) {
            googleSignInOptions = m13705b.m13714d();
        }
        GoogleApiClient m13890e = new GoogleApiClient.Builder(this.f17103f).m13887b(Auth.f16903g, googleSignInOptions).m13890e();
        try {
            if (m13890e.mo13868d().m13795e0()) {
                if (m13713c != null) {
                    Auth.f16906j.mo13662c(m13890e);
                } else {
                    m13890e.mo13869e();
                }
            }
        } finally {
            m13890e.mo13872h();
        }
    }
}
