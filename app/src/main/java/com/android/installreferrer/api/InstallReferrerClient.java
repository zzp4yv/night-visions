package com.android.installreferrer.api;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class InstallReferrerClient {

    /* renamed from: com.android.installreferrer.api.InstallReferrerClient$b */
    public static final class C5301b {

        /* renamed from: a */
        private final Context f12953a;

        /* renamed from: a */
        public InstallReferrerClient m9905a() {
            Context context = this.f12953a;
            if (context != null) {
                return new C5302a(context);
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }

        private C5301b(Context context) {
            this.f12953a = context;
        }
    }

    /* renamed from: c */
    public static C5301b m9901c(Context context) {
        return new C5301b(context);
    }

    /* renamed from: a */
    public abstract void mo9902a();

    /* renamed from: b */
    public abstract ReferrerDetails mo9903b() throws RemoteException;

    /* renamed from: d */
    public abstract void mo9904d(InstallReferrerStateListener installReferrerStateListener);
}
