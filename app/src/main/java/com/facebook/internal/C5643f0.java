package com.facebook.internal;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.C5608a0;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;

/* compiled from: InstagramCustomTab.kt */
/* renamed from: com.facebook.internal.f0 */
/* loaded from: classes2.dex */
public final class C5643f0 extends C5698u {

    /* renamed from: c */
    public static final a f14415c = new a(null);

    /* compiled from: InstagramCustomTab.kt */
    /* renamed from: com.facebook.internal.f0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final Uri m11434a(String str, Bundle bundle) {
            C9768m.m32346f(str, "action");
            if (C9768m.m32341a(str, "oauth")) {
                C5663p0 c5663p0 = C5663p0.f14478a;
                C5659n0 c5659n0 = C5659n0.f14464a;
                return C5663p0.m11564e(C5659n0.m11520k(), "oauth/authorize", bundle);
            }
            C5663p0 c5663p02 = C5663p0.f14478a;
            C5659n0 c5659n02 = C5659n0.f14464a;
            String m11520k = C5659n0.m11520k();
            StringBuilder sb = new StringBuilder();
            C5608a0 c5608a0 = C5608a0.f14199a;
            sb.append(C5608a0.m11295n());
            sb.append("/dialog/");
            sb.append(str);
            return C5663p0.m11564e(m11520k, sb.toString(), bundle);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5643f0(String str, Bundle bundle) {
        super(str, bundle);
        C9768m.m32346f(str, "action");
        m11799b(f14415c.m11434a(str, bundle == null ? new Bundle() : bundle));
    }
}
