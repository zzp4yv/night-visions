package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.C8372j;
import com.google.firebase.analytics.p179a.InterfaceC8062a;
import com.google.firebase.components.C8091n;
import com.google.firebase.components.C8099v;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.p203q.InterfaceC8449d;
import com.google.firebase.p209u.C8522h;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-api@@17.2.0 */
@Keep
@KeepForSdk
/* loaded from: classes2.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @KeepForSdk
    @SuppressLint({"MissingPermission"})
    public List<C8091n<?>> getComponents() {
        return Arrays.asList(C8091n.m24986c(InterfaceC8062a.class).m25006b(C8099v.m25060k(C8372j.class)).m25006b(C8099v.m25060k(Context.class)).m25006b(C8099v.m25060k(InterfaceC8449d.class)).m25010f(C8067a.f30652a).m25009e().m25008d(), C8522h.m26903a("fire-analytics", "17.2.0"));
    }
}
