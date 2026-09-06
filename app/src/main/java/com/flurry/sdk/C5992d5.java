package com.flurry.sdk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import okhttp3.HttpUrl;

/* renamed from: com.flurry.sdk.d5 */
/* loaded from: classes2.dex */
public final class C5992d5 extends AbstractC6120r6 {
    private C5992d5(InterfaceC6136t6 interfaceC6136t6) {
        super(interfaceC6136t6);
    }

    /* renamed from: h */
    public static void m13045h() {
        String m13192b = C6078n0.m13190a().m13192b();
        String str = C6078n0.m13190a().f16153b;
        if (TextUtils.isEmpty(str)) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        Context m12964a = C5969b0.m12964a();
        int i2 = 0;
        try {
            i2 = m12964a.getPackageManager().getPackageInfo(m12964a.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
        }
        C6071m2.m13180a().m13181b(new C5992d5(new C6002e5(m13192b, str, String.valueOf(i2), C5962a2.m12952a(C5969b0.m12964a()))));
    }

    @Override // com.flurry.sdk.InterfaceC6144u6
    /* renamed from: a */
    public final EnumC6128s6 mo12961a() {
        return EnumC6128s6.APP_INFO;
    }
}
