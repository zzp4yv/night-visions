package io.sentry.config;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PropertiesProvider.java */
/* renamed from: io.sentry.config.f */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9378f {
    /* renamed from: a */
    public static Boolean m30711a(InterfaceC9379g _this, String str) {
        String mo30702b = _this.mo30702b(str);
        if (mo30702b != null) {
            return Boolean.valueOf(mo30702b);
        }
        return null;
    }

    /* renamed from: b */
    public static Double m30712b(InterfaceC9379g _this, String str) {
        String mo30702b = _this.mo30702b(str);
        if (mo30702b != null) {
            try {
                return Double.valueOf(mo30702b);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    public static List m30713c(InterfaceC9379g _this, String str) {
        String mo30702b = _this.mo30702b(str);
        return mo30702b != null ? Arrays.asList(mo30702b.split(",")) : Collections.emptyList();
    }

    /* renamed from: d */
    public static Long m30714d(InterfaceC9379g _this, String str) {
        String mo30702b = _this.mo30702b(str);
        if (mo30702b != null) {
            try {
                return Long.valueOf(mo30702b);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* renamed from: e */
    public static String m30715e(InterfaceC9379g _this, String str, String str2) {
        String mo30702b = _this.mo30702b(str);
        return mo30702b != null ? mo30702b : str2;
    }
}
