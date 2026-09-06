package com.flurry.sdk;

import android.content.Context;
import java.io.File;
import java.util.List;
import java.util.Map;

/* renamed from: com.flurry.sdk.v0 */
/* loaded from: classes2.dex */
public final class C6146v0 {

    /* renamed from: a */
    private final C6154w0 f16423a;

    /* renamed from: b */
    private final File f16424b;

    /* renamed from: c */
    boolean f16425c;

    /* renamed from: d */
    private String f16426d;

    public C6146v0() {
        this(C5969b0.m12964a());
    }

    /* renamed from: b */
    private void m13320b(String str) {
        if (str == null) {
            return;
        }
        this.f16426d = str;
    }

    /* renamed from: a */
    public final synchronized Map<String, List<String>> m13321a() {
        if (!this.f16425c) {
            this.f16425c = true;
            C5988d1.m13030c(4, "InstallLogger", "Loading referrer info from file: " + this.f16424b.getAbsolutePath());
            String m12972f = C5971b2.m12972f(this.f16424b);
            C5988d1.m13032e("InstallLogger", "Referrer file contents: ".concat(String.valueOf(m12972f)));
            m13320b(m12972f);
        }
        return C6154w0.m13364a(this.f16426d);
    }

    public C6146v0(Context context) {
        this.f16423a = new C6154w0();
        File fileStreamPath = context.getFileStreamPath(".flurryinstallreceiver.");
        this.f16424b = fileStreamPath;
        C5988d1.m13030c(3, "InstallLogger", "Referrer file name if it exists:  " + fileStreamPath);
    }
}
