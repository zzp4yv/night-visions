package com.facebook.internal;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.facebook.C5608a0;
import kotlin.jvm.internal.C9768m;

/* compiled from: InstallReferrerUtil.kt */
/* renamed from: com.facebook.internal.g0 */
/* loaded from: classes2.dex */
public final class C5645g0 {

    /* renamed from: a */
    public static final C5645g0 f14417a = new C5645g0();

    /* compiled from: InstallReferrerUtil.kt */
    /* renamed from: com.facebook.internal.g0$a */
    public interface a {
        /* renamed from: a */
        void mo11440a(String str);
    }

    /* compiled from: InstallReferrerUtil.kt */
    /* renamed from: com.facebook.internal.g0$b */
    public static final class b implements InstallReferrerStateListener {

        /* renamed from: a */
        final /* synthetic */ InstallReferrerClient f14418a;

        /* renamed from: b */
        final /* synthetic */ a f14419b;

        b(InstallReferrerClient installReferrerClient, a aVar) {
            this.f14418a = installReferrerClient;
            this.f14419b = aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
        
            if (r0 != false) goto L14;
         */
        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void mo9906a(int r5) {
            /*
                r4 = this;
                r0 = 2
                if (r5 == 0) goto Lc
                if (r5 == r0) goto L6
                goto L39
            L6:
                com.facebook.internal.g0 r5 = com.facebook.internal.C5645g0.f14417a
                com.facebook.internal.C5645g0.m11435a(r5)
                goto L39
            Lc:
                com.android.installreferrer.api.InstallReferrerClient r5 = r4.f14418a     // Catch: java.lang.Throwable -> L3e
                com.android.installreferrer.api.ReferrerDetails r5 = r5.mo9903b()     // Catch: java.lang.Throwable -> L3e
                java.lang.String r1 = "{\n                      referrerClient.installReferrer\n                    }"
                kotlin.jvm.internal.C9768m.m32345e(r5, r1)     // Catch: java.lang.Throwable -> L3e
                java.lang.String r5 = r5.m9908a()
                if (r5 == 0) goto L34
                java.lang.String r1 = "fb"
                r2 = 0
                r3 = 0
                boolean r1 = kotlin.text.C10504l.m37457J(r5, r1, r2, r0, r3)
                if (r1 != 0) goto L2f
                java.lang.String r1 = "facebook"
                boolean r0 = kotlin.text.C10504l.m37457J(r5, r1, r2, r0, r3)
                if (r0 == 0) goto L34
            L2f:
                com.facebook.internal.g0$a r0 = r4.f14419b
                r0.mo11440a(r5)
            L34:
                com.facebook.internal.g0 r5 = com.facebook.internal.C5645g0.f14417a
                com.facebook.internal.C5645g0.m11435a(r5)
            L39:
                com.android.installreferrer.api.InstallReferrerClient r5 = r4.f14418a
                r5.mo9902a()
            L3e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C5645g0.b.mo9906a(int):void");
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        /* renamed from: b */
        public void mo9907b() {
        }
    }

    private C5645g0() {
    }

    /* renamed from: b */
    private final boolean m11436b() {
        C5608a0 c5608a0 = C5608a0.f14199a;
        return C5608a0.m11284c().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false);
    }

    /* renamed from: c */
    private final void m11437c(a aVar) {
        C5608a0 c5608a0 = C5608a0.f14199a;
        InstallReferrerClient m9905a = InstallReferrerClient.m9901c(C5608a0.m11284c()).m9905a();
        try {
            m9905a.mo9904d(new b(m9905a, aVar));
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public static final void m11438d(a aVar) {
        C9768m.m32346f(aVar, "callback");
        C5645g0 c5645g0 = f14417a;
        if (c5645g0.m11436b()) {
            return;
        }
        c5645g0.m11437c(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final void m11439e() {
        C5608a0 c5608a0 = C5608a0.f14199a;
        C5608a0.m11284c().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
    }
}
