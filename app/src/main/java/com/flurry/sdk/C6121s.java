package com.flurry.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Locale;

/* renamed from: com.flurry.sdk.s */
/* loaded from: classes2.dex */
public final class C6121s extends C5994d7<C6113r> {

    /* renamed from: p */
    protected BroadcastReceiver f16311p;

    /* renamed from: com.flurry.sdk.s$a */
    final class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            C6121s.this.m13048t(C6121s.m13301y());
        }
    }

    /* renamed from: com.flurry.sdk.s$b */
    final class b extends AbstractRunnableC6008f2 {

        /* renamed from: h */
        final /* synthetic */ InterfaceC6013f7 f16313h;

        b(InterfaceC6013f7 interfaceC6013f7) {
            this.f16313h = interfaceC6013f7;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6008f2
        /* renamed from: a */
        public final void mo12950a() throws Exception {
            this.f16313h.mo12962a(C6121s.m13301y());
        }
    }

    public C6121s() {
        super("LocaleProvider");
        this.f16311p = new a();
        Context m12964a = C5969b0.m12964a();
        IntentFilter intentFilter = new IntentFilter("android.intent.action.LOCALE_CHANGED");
        if (m12964a != null) {
            m12964a.registerReceiver(this.f16311p, intentFilter);
        } else {
            C5988d1.m13030c(6, "LocaleProvider", "Context is null when initializing.");
        }
    }

    /* renamed from: y */
    public static C6113r m13301y() {
        return new C6113r(Locale.getDefault().getLanguage(), Locale.getDefault().getCountry());
    }

    @Override // com.flurry.sdk.C5994d7
    /* renamed from: v */
    public final void mo13050v(InterfaceC6013f7<C6113r> interfaceC6013f7) {
        super.mo13050v(interfaceC6013f7);
        mo13007m(new b(interfaceC6013f7));
    }
}
