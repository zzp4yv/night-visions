package com.google.android.gms.internal.location;

import android.content.ContentProviderClient;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzas {

    /* renamed from: a */
    private final zzbj<zzao> f27635a;

    /* renamed from: b */
    private final Context f27636b;

    /* renamed from: c */
    private ContentProviderClient f27637c = null;

    /* renamed from: d */
    private boolean f27638d = false;

    /* renamed from: e */
    private final Map<ListenerHolder.ListenerKey<LocationListener>, BinderC7437e> f27639e = new HashMap();

    /* renamed from: f */
    private final Map<ListenerHolder.ListenerKey<Object>, BinderC7436d> f27640f = new HashMap();

    /* renamed from: g */
    private final Map<ListenerHolder.ListenerKey<LocationCallback>, BinderC7433a> f27641g = new HashMap();

    public zzas(Context context, zzbj<zzao> zzbjVar) {
        this.f27636b = context;
        this.f27635a = zzbjVar;
    }

    /* renamed from: a */
    public final void m20959a() throws RemoteException {
        synchronized (this.f27639e) {
            for (BinderC7437e binderC7437e : this.f27639e.values()) {
                if (binderC7437e != null) {
                    this.f27635a.mo20947b().mo20957B5(zzbf.m20963z(binderC7437e, null));
                }
            }
            this.f27639e.clear();
        }
        synchronized (this.f27641g) {
            for (BinderC7433a binderC7433a : this.f27641g.values()) {
                if (binderC7433a != null) {
                    this.f27635a.mo20947b().mo20957B5(zzbf.m20962y(binderC7433a, null));
                }
            }
            this.f27641g.clear();
        }
        synchronized (this.f27640f) {
            for (BinderC7436d binderC7436d : this.f27640f.values()) {
                if (binderC7436d != null) {
                    this.f27635a.mo20947b().mo20955A3(new zzo(2, null, binderC7436d.asBinder(), null));
                }
            }
            this.f27640f.clear();
        }
    }

    /* renamed from: b */
    public final void m20960b(boolean z) throws RemoteException {
        this.f27635a.mo20946a();
        this.f27635a.mo20947b().mo20956B0(z);
        this.f27638d = z;
    }

    /* renamed from: c */
    public final void m20961c() throws RemoteException {
        if (this.f27638d) {
            m20960b(false);
        }
    }
}
