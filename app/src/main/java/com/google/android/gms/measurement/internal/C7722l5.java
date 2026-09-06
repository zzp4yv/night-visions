package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzkn;
import com.google.android.gms.internal.measurement.zzle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
@TargetApi(14)
/* renamed from: com.google.android.gms.measurement.internal.l5 */
/* loaded from: classes2.dex */
final class C7722l5 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: f */
    private final /* synthetic */ zzhc f28751f;

    private C7722l5(zzhc zzhcVar) {
        this.f28751f = zzhcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0098 A[Catch: Exception -> 0x01a3, TRY_ENTER, TryCatch #0 {Exception -> 0x01a3, blocks: (B:3:0x0006, B:6:0x0020, B:8:0x002e, B:14:0x0098, B:16:0x00a6, B:18:0x00b9, B:21:0x00c1, B:23:0x00c7, B:24:0x00da, B:25:0x00e1, B:28:0x00f1, B:31:0x0101, B:34:0x0109, B:36:0x010f, B:37:0x011a, B:41:0x0121, B:45:0x0142, B:46:0x0157, B:48:0x0148, B:49:0x015e, B:51:0x0164, B:53:0x016a, B:55:0x0170, B:57:0x0176, B:59:0x017e, B:63:0x0189, B:65:0x0197, B:67:0x019d, B:71:0x003f, B:74:0x004c, B:76:0x0052, B:78:0x0058, B:80:0x005e, B:82:0x0064, B:83:0x0070, B:85:0x0078, B:86:0x0083, B:88:0x008d, B:89:0x007d), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f1 A[Catch: Exception -> 0x01a3, TRY_ENTER, TryCatch #0 {Exception -> 0x01a3, blocks: (B:3:0x0006, B:6:0x0020, B:8:0x002e, B:14:0x0098, B:16:0x00a6, B:18:0x00b9, B:21:0x00c1, B:23:0x00c7, B:24:0x00da, B:25:0x00e1, B:28:0x00f1, B:31:0x0101, B:34:0x0109, B:36:0x010f, B:37:0x011a, B:41:0x0121, B:45:0x0142, B:46:0x0157, B:48:0x0148, B:49:0x015e, B:51:0x0164, B:53:0x016a, B:55:0x0170, B:57:0x0176, B:59:0x017e, B:63:0x0189, B:65:0x0197, B:67:0x019d, B:71:0x003f, B:74:0x004c, B:76:0x0052, B:78:0x0058, B:80:0x005e, B:82:0x0064, B:83:0x0070, B:85:0x0078, B:86:0x0083, B:88:0x008d, B:89:0x007d), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0120 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0121 A[Catch: Exception -> 0x01a3, TRY_LEAVE, TryCatch #0 {Exception -> 0x01a3, blocks: (B:3:0x0006, B:6:0x0020, B:8:0x002e, B:14:0x0098, B:16:0x00a6, B:18:0x00b9, B:21:0x00c1, B:23:0x00c7, B:24:0x00da, B:25:0x00e1, B:28:0x00f1, B:31:0x0101, B:34:0x0109, B:36:0x010f, B:37:0x011a, B:41:0x0121, B:45:0x0142, B:46:0x0157, B:48:0x0148, B:49:0x015e, B:51:0x0164, B:53:0x016a, B:55:0x0170, B:57:0x0176, B:59:0x017e, B:63:0x0189, B:65:0x0197, B:67:0x019d, B:71:0x003f, B:74:0x004c, B:76:0x0052, B:78:0x0058, B:80:0x005e, B:82:0x0064, B:83:0x0070, B:85:0x0078, B:86:0x0083, B:88:0x008d, B:89:0x007d), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e0  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m22801b(boolean r18, android.net.Uri r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7722l5.m22801b(boolean, android.net.Uri, java.lang.String, java.lang.String):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            this.f28751f.mo22836h().m23145P().m23147a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent == null) {
                return;
            }
            Uri data = intent.getData();
            if (data != null && data.isHierarchical()) {
                this.f28751f.mo22839l();
                String str = zzkk.m23501V(intent) ? "gs" : "auto";
                String queryParameter = data.getQueryParameter("referrer");
                boolean z = bundle == null;
                if (zzle.m22484b() && zzap.f29102K0.m23095a(null).booleanValue()) {
                    this.f28751f.mo22835g().m23201z(new RunnableC7740n5(this, z, data, str, queryParameter));
                } else {
                    m22801b(z, data, str, queryParameter);
                }
            }
        } catch (Exception e2) {
            this.f28751f.mo22836h().m23137H().m23148b("Throwable caught in onActivityCreated", e2);
        } finally {
            this.f28751f.mo22797s().m23335D(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f28751f.mo22797s().m23342P(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f28751f.mo22797s().m23340N(activity);
        zzjl mo22799u = this.f28751f.mo22799u();
        mo22799u.mo22835g().m23201z(new RunnableC7804u6(mo22799u, mo22799u.mo22837j().mo14609b()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (zzkn.m22461b() && zzap.f29142f0.m23095a(null).booleanValue()) {
            this.f28751f.mo22799u().m23400F();
            this.f28751f.mo22797s().m23334C(activity);
        } else {
            this.f28751f.mo22797s().m23334C(activity);
            this.f28751f.mo22799u().m23400F();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f28751f.mo22797s().m23341O(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    /* synthetic */ C7722l5(zzhc zzhcVar, RunnableC7820w4 runnableC7820w4) {
        this(zzhcVar);
    }
}
