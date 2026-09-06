package com.facebook.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.C5608a0;
import com.facebook.login.C5764q;
import java.util.ArrayList;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import p024c.p038c.p039b.C0859c;

/* compiled from: CustomTab.kt */
/* renamed from: com.facebook.internal.u */
/* loaded from: classes2.dex */
public class C5698u {

    /* renamed from: a */
    public static final a f14621a = new a(null);

    /* renamed from: b */
    private Uri f14622b;

    /* compiled from: CustomTab.kt */
    /* renamed from: com.facebook.internal.u$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public Uri m11800a(String str, Bundle bundle) {
            C9768m.m32346f(str, "action");
            C5663p0 c5663p0 = C5663p0.f14478a;
            C5659n0 c5659n0 = C5659n0.f14464a;
            String m11511b = C5659n0.m11511b();
            StringBuilder sb = new StringBuilder();
            C5608a0 c5608a0 = C5608a0.f14199a;
            sb.append(C5608a0.m11295n());
            sb.append("/dialog/");
            sb.append(str);
            return C5663p0.m11564e(m11511b, sb.toString(), bundle);
        }
    }

    public C5698u(String str, Bundle bundle) {
        Uri m11800a;
        C9768m.m32346f(str, "action");
        bundle = bundle == null ? new Bundle() : bundle;
        EnumC5641e0[] valuesCustom = EnumC5641e0.valuesCustom();
        ArrayList arrayList = new ArrayList(valuesCustom.length);
        for (EnumC5641e0 enumC5641e0 : valuesCustom) {
            arrayList.add(enumC5641e0.m11433k());
        }
        if (arrayList.contains(str)) {
            C5663p0 c5663p0 = C5663p0.f14478a;
            C5659n0 c5659n0 = C5659n0.f14464a;
            m11800a = C5663p0.m11564e(C5659n0.m11516g(), C9768m.m32354n("/dialog/", str), bundle);
        } else {
            m11800a = f14621a.m11800a(str, bundle);
        }
        this.f14622b = m11800a;
    }

    /* renamed from: a */
    public final boolean m11798a(Activity activity, String str) {
        C9768m.m32346f(activity, "activity");
        C0859c m5400c = new C0859c.a(C5764q.f14816f.m12054b()).m5400c();
        m5400c.f5675a.setPackage(str);
        try {
            m5400c.m5397a(activity, this.f14622b);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: b */
    protected final void m11799b(Uri uri) {
        C9768m.m32346f(uri, "<set-?>");
        this.f14622b = uri;
    }
}
