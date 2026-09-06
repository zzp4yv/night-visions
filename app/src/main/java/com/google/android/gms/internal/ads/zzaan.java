package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;
import okhttp3.HttpUrl;

@zzard
/* loaded from: classes2.dex */
public final class zzaan implements MuteThisAdReason {

    /* renamed from: a */
    private final String f21490a;

    /* renamed from: b */
    private zzaak f21491b;

    public zzaan(zzaak zzaakVar) {
        String str;
        this.f21491b = zzaakVar;
        try {
            str = zzaakVar.getDescription();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            str = null;
        }
        this.f21490a = str;
    }

    /* renamed from: a */
    public final zzaak m16188a() {
        return this.f21491b;
    }

    @Override // com.google.android.gms.ads.MuteThisAdReason
    public final String getDescription() {
        return this.f21490a;
    }
}
