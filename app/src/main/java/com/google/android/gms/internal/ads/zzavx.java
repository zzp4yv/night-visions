package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.VisibleForTesting;

@zzard
/* loaded from: classes2.dex */
public final class zzavx {
    @VisibleForTesting
    /* renamed from: a */
    private static Uri m17019a(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i2 = indexOf + 1;
        return Uri.parse(str.substring(0, i2) + str2 + "=" + str3 + "&" + str.substring(i2));
    }

    /* renamed from: b */
    public static String m17020b(Uri uri, Context context) {
        if (!zzk.zzme().m17002D(context)) {
            return uri.toString();
        }
        String m17009n = zzk.zzme().m17009n(context);
        if (m17009n == null) {
            return uri.toString();
        }
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21605C0)).booleanValue()) {
            String str = (String) zzyt.m20848e().m16421c(zzacu.f21611D0);
            String uri2 = uri.toString();
            if (uri2.contains(str)) {
                zzk.zzme().m17015u(context, m17009n);
                return uri2.replace(str, m17009n);
            }
        } else if (TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            uri = m17019a(uri.toString(), "fbs_aeid", m17009n);
            zzk.zzme().m17015u(context, m17009n);
        }
        return uri.toString();
    }

    /* renamed from: c */
    public static String m17021c(String str, Context context, boolean z) {
        String m17009n;
        if ((((Boolean) zzyt.m20848e().m16421c(zzacu.f21653K0)).booleanValue() && !z) || !zzk.zzme().m17002D(context) || TextUtils.isEmpty(str) || (m17009n = zzk.zzme().m17009n(context)) == null) {
            return str;
        }
        if (!((Boolean) zzyt.m20848e().m16421c(zzacu.f21605C0)).booleanValue()) {
            if (str.contains("fbs_aeid")) {
                return str;
            }
            if (zzk.zzlg().m17173T(str)) {
                zzk.zzme().m17015u(context, m17009n);
                return m17019a(str, "fbs_aeid", m17009n).toString();
            }
            if (!zzk.zzlg().m17174U(str)) {
                return str;
            }
            zzk.zzme().m17016v(context, m17009n);
            return m17019a(str, "fbs_aeid", m17009n).toString();
        }
        CharSequence charSequence = (String) zzyt.m20848e().m16421c(zzacu.f21611D0);
        if (!str.contains(charSequence)) {
            return str;
        }
        if (zzk.zzlg().m17173T(str)) {
            zzk.zzme().m17015u(context, m17009n);
            return str.replace(charSequence, m17009n);
        }
        if (!zzk.zzlg().m17174U(str)) {
            return str;
        }
        zzk.zzme().m17016v(context, m17009n);
        return str.replace(charSequence, m17009n);
    }
}
