package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import androidx.core.content.C0257c;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.o0 */
/* loaded from: classes2.dex */
final class C7525o0 implements InterfaceC7513m0 {

    /* renamed from: a */
    private static C7525o0 f27857a;

    /* renamed from: b */
    private final Context f27858b;

    /* renamed from: c */
    private final ContentObserver f27859c;

    private C7525o0(Context context) {
        this.f27858b = context;
        C7537q0 c7537q0 = new C7537q0(this, null);
        this.f27859c = c7537q0;
        context.getContentResolver().registerContentObserver(zzbw.f27981a, true, c7537q0);
    }

    /* renamed from: a */
    static C7525o0 m21260a(Context context) {
        C7525o0 c7525o0;
        synchronized (C7525o0.class) {
            if (f27857a == null) {
                f27857a = C0257c.m1701b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C7525o0(context) : new C7525o0();
            }
            c7525o0 = f27857a;
        }
        return c7525o0;
    }

    /* renamed from: b */
    static synchronized void m21261b() {
        Context context;
        synchronized (C7525o0.class) {
            C7525o0 c7525o0 = f27857a;
            if (c7525o0 != null && (context = c7525o0.f27858b) != null && c7525o0.f27859c != null) {
                context.getContentResolver().unregisterContentObserver(f27857a.f27859c);
            }
            f27857a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.InterfaceC7513m0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final String mo21237u(final String str) {
        if (this.f27858b == null) {
            return null;
        }
        try {
            return (String) zzce.m22101a(new zzcd(this, str) { // from class: com.google.android.gms.internal.measurement.n0

                /* renamed from: a */
                private final C7525o0 f27845a;

                /* renamed from: b */
                private final String f27846b;

                {
                    this.f27845a = this;
                    this.f27846b = str;
                }

                @Override // com.google.android.gms.internal.measurement.zzcd
                /* renamed from: a */
                public final Object mo21227a() {
                    return this.f27845a.m21263c(this.f27846b);
                }
            });
        } catch (IllegalStateException | SecurityException e2) {
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() != 0 ? "Unable to read GServices for: ".concat(valueOf) : new String("Unable to read GServices for: "), e2);
            return null;
        }
    }

    /* renamed from: c */
    final /* synthetic */ String m21263c(String str) {
        return zzbw.m22084a(this.f27858b.getContentResolver(), str, null);
    }

    private C7525o0() {
        this.f27858b = null;
        this.f27859c = null;
    }
}
