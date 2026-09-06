package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.C6265R;
import com.google.android.gms.ads.internal.zzk;
import java.util.Map;

@zzard
/* loaded from: classes2.dex */
public final class zzapu extends zzaqb {

    /* renamed from: c */
    private final Map<String, String> f22252c;

    /* renamed from: d */
    private final Context f22253d;

    public zzapu(zzbgz zzbgzVar, Map<String, String> map) {
        super(zzbgzVar, "storePicture");
        this.f22252c = map;
        this.f22253d = zzbgzVar.mo14897a();
    }

    /* renamed from: h */
    public final void m16845h() {
        if (this.f22253d == null) {
            m16865e("Activity context is not available");
            return;
        }
        zzk.zzlg();
        if (!zzaxi.m17169y(this.f22253d).m16399d()) {
            m16865e("Feature is not supported by the device.");
            return;
        }
        String str = this.f22252c.get("iurl");
        if (TextUtils.isEmpty(str)) {
            m16865e("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            String valueOf = String.valueOf(str);
            m16865e(valueOf.length() != 0 ? "Invalid image url: ".concat(valueOf) : new String("Invalid image url: "));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        zzk.zzlg();
        if (!zzaxi.m17137R(lastPathSegment)) {
            String valueOf2 = String.valueOf(lastPathSegment);
            m16865e(valueOf2.length() != 0 ? "Image type not recognized: ".concat(valueOf2) : new String("Image type not recognized: "));
            return;
        }
        Resources m17050b = zzk.zzlk().m17050b();
        zzk.zzlg();
        AlertDialog.Builder m17168x = zzaxi.m17168x(this.f22253d);
        m17168x.setTitle(m17050b != null ? m17050b.getString(C6265R.string.f16865s1) : "Save image");
        m17168x.setMessage(m17050b != null ? m17050b.getString(C6265R.string.f16866s2) : "Allow Ad to store image in Picture gallery?");
        m17168x.setPositiveButton(m17050b != null ? m17050b.getString(C6265R.string.f16867s3) : "Accept", new DialogInterfaceOnClickListenerC6811k3(this, str, lastPathSegment));
        m17168x.setNegativeButton(m17050b != null ? m17050b.getString(C6265R.string.f16868s4) : "Decline", new DialogInterfaceOnClickListenerC6848l3(this));
        m17168x.create().show();
    }
}
