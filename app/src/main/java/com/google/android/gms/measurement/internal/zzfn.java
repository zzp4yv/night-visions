package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzfn {

    /* renamed from: a */
    private final zzfs f29252a;

    public zzfn(zzfs zzfsVar) {
        Preconditions.m14372k(zzfsVar);
        this.f29252a = zzfsVar;
    }

    /* renamed from: b */
    public static boolean m23169b(Context context) {
        ActivityInfo receiverInfo;
        Preconditions.m14372k(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: a */
    public final void m23170a(Context context, Intent intent) {
        zzfx m23203a = zzfx.m23203a(context, null);
        zzet mo22836h = m23203a.mo22836h();
        if (intent == null) {
            mo22836h.m23140K().m23147a("Receiver called with null intent");
            return;
        }
        m23203a.mo22832G();
        String action = intent.getAction();
        mo22836h.m23145P().m23148b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            mo22836h.m23145P().m23147a("Starting wakeful intent.");
            this.f29252a.mo22667a(context, className);
            return;
        }
        if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            try {
                m23203a.mo22835g().m23201z(new RunnableC7801u3(this, m23203a, mo22836h));
            } catch (Exception e2) {
                mo22836h.m23140K().m23148b("Install Referrer Reporter encountered a problem", e2);
            }
            BroadcastReceiver.PendingResult mo22668b = this.f29252a.mo22668b();
            String stringExtra = intent.getStringExtra("referrer");
            if (stringExtra == null) {
                mo22836h.m23145P().m23147a("Install referrer extras are null");
                if (mo22668b != null) {
                    mo22668b.finish();
                    return;
                }
                return;
            }
            mo22836h.m23143N().m23148b("Install referrer extras are", stringExtra);
            if (!stringExtra.contains("?")) {
                stringExtra = stringExtra.length() != 0 ? "?".concat(stringExtra) : new String("?");
            }
            Bundle m23553y = m23203a.m23217I().m23553y(Uri.parse(stringExtra));
            if (m23553y == null) {
                mo22836h.m23145P().m23147a("No campaign defined in install referrer broadcast");
                if (mo22668b != null) {
                    mo22668b.finish();
                    return;
                }
                return;
            }
            long longExtra = intent.getLongExtra("referrer_timestamp_seconds", 0L) * 1000;
            if (longExtra == 0) {
                mo22836h.m23140K().m23147a("Install referrer is missing timestamp");
            }
            m23203a.mo22835g().m23201z(new RunnableC7792t3(this, m23203a, longExtra, m23553y, context, mo22836h, mo22668b));
        }
    }
}
