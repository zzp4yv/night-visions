package com.flurry.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.TimeZone;

/* renamed from: com.flurry.sdk.j0 */
/* loaded from: classes2.dex */
public final class C6042j0 extends C5994d7<String> {

    /* renamed from: p */
    protected BroadcastReceiver f16006p;

    /* renamed from: com.flurry.sdk.j0$a */
    final class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            C6042j0.this.m13048t(TimeZone.getDefault().getID());
        }
    }

    /* renamed from: com.flurry.sdk.j0$b */
    final class b extends AbstractRunnableC6008f2 {

        /* renamed from: h */
        final /* synthetic */ InterfaceC6013f7 f16008h;

        b(InterfaceC6013f7 interfaceC6013f7) {
            this.f16008h = interfaceC6013f7;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6008f2
        /* renamed from: a */
        public final void mo12950a() throws Exception {
            this.f16008h.mo12962a(TimeZone.getDefault().getID());
        }
    }

    public C6042j0() {
        super("TimeZoneProvider");
        this.f16006p = new a();
        Context m12964a = C5969b0.m12964a();
        IntentFilter intentFilter = new IntentFilter("android.intent.action.TIMEZONE_CHANGED");
        if (m12964a != null) {
            m12964a.registerReceiver(this.f16006p, intentFilter);
        } else {
            C5988d1.m13030c(6, "TimeZoneProvider", "Context is null when initializing.");
        }
    }

    @Override // com.flurry.sdk.C5994d7
    /* renamed from: v */
    public final void mo13050v(InterfaceC6013f7<String> interfaceC6013f7) {
        super.mo13050v(interfaceC6013f7);
        mo13007m(new b(interfaceC6013f7));
    }
}
