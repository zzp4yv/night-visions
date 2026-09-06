package com.google.firebase.analytics.p179a;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.C8317h;
import com.google.firebase.C8372j;
import com.google.firebase.analytics.connector.internal.C8068b;
import com.google.firebase.analytics.connector.internal.C8069c;
import com.google.firebase.analytics.connector.internal.C8070d;
import com.google.firebase.analytics.p179a.InterfaceC8062a;
import com.google.firebase.p203q.C8446a;
import com.google.firebase.p203q.InterfaceC8449d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-api@@17.2.0 */
/* renamed from: com.google.firebase.analytics.a.b */
/* loaded from: classes2.dex */
public class C8063b implements InterfaceC8062a {

    /* renamed from: a */
    private static volatile InterfaceC8062a f30644a;

    /* renamed from: b */
    @VisibleForTesting
    private final AppMeasurement f30645b;

    /* renamed from: c */
    @VisibleForTesting
    final Map<String, ?> f30646c;

    /* compiled from: com.google.android.gms:play-services-measurement-api@@17.2.0 */
    /* renamed from: com.google.firebase.analytics.a.b$a */
    class a implements InterfaceC8062a.a {

        /* renamed from: a */
        private final /* synthetic */ String f30647a;

        a(String str) {
            this.f30647a = str;
        }
    }

    private C8063b(AppMeasurement appMeasurement) {
        Preconditions.m14372k(appMeasurement);
        this.f30645b = appMeasurement;
        this.f30646c = new ConcurrentHashMap();
    }

    @KeepForSdk
    /* renamed from: c */
    public static InterfaceC8062a m24954c(C8372j c8372j, Context context, InterfaceC8449d interfaceC8449d) {
        Preconditions.m14372k(c8372j);
        Preconditions.m14372k(context);
        Preconditions.m14372k(interfaceC8449d);
        Preconditions.m14372k(context.getApplicationContext());
        if (f30644a == null) {
            synchronized (C8063b.class) {
                if (f30644a == null) {
                    Bundle bundle = new Bundle(1);
                    if (c8372j.m26409s()) {
                        interfaceC8449d.mo25072b(C8317h.class, ExecutorC8065d.f30650f, C8064c.f30649a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", c8372j.m26408r());
                    }
                    f30644a = new C8063b(AppMeasurement.m22659c(context, bundle));
                }
            }
        }
        return f30644a;
    }

    /* renamed from: d */
    static final /* synthetic */ void m24955d(C8446a c8446a) {
        boolean z = ((C8317h) c8446a.m26678a()).f31703a;
        synchronized (C8063b.class) {
            ((C8063b) f30644a).f30645b.m22664e(z);
        }
    }

    /* renamed from: e */
    private final boolean m24956e(String str) {
        return (str.isEmpty() || !this.f30646c.containsKey(str) || this.f30646c.get(str) == null) ? false : true;
    }

    @Override // com.google.firebase.analytics.p179a.InterfaceC8062a
    @KeepForSdk
    /* renamed from: a */
    public void mo24950a(String str, String str2, Object obj) {
        if (C8069c.m24959a(str) && C8069c.m24961c(str, str2)) {
            this.f30645b.m22663b(str, str2, obj);
        }
    }

    @Override // com.google.firebase.analytics.p179a.InterfaceC8062a
    @KeepForSdk
    /* renamed from: b */
    public InterfaceC8062a.a mo24951b(String str, InterfaceC8062a.b bVar) {
        Preconditions.m14372k(bVar);
        if (!C8069c.m24959a(str) || m24956e(str)) {
            return null;
        }
        AppMeasurement appMeasurement = this.f30645b;
        Object c8068b = "fiam".equals(str) ? new C8068b(appMeasurement, bVar) : "crash".equals(str) ? new C8070d(appMeasurement, bVar) : null;
        if (c8068b == null) {
            return null;
        }
        this.f30646c.put(str, c8068b);
        return new a(str);
    }

    @Override // com.google.firebase.analytics.p179a.InterfaceC8062a
    @KeepForSdk
    /* renamed from: m0 */
    public void mo24952m0(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (C8069c.m24959a(str) && C8069c.m24960b(str2, bundle) && C8069c.m24962d(str, str2, bundle)) {
            this.f30645b.logEventInternal(str, str2, bundle);
        }
    }
}
