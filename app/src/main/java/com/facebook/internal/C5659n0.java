package com.facebook.internal;

import com.facebook.C5608a0;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C10784u;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: ServerProtocol.kt */
/* renamed from: com.facebook.internal.n0 */
/* loaded from: classes2.dex */
public final class C5659n0 {

    /* renamed from: a */
    public static final C5659n0 f14464a = new C5659n0();

    /* renamed from: b */
    private static final String f14465b = C5659n0.class.getName();

    private C5659n0() {
    }

    /* renamed from: a */
    public static final String m11510a() {
        return "v16.0";
    }

    /* renamed from: b */
    public static final String m11511b() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        C5608a0 c5608a0 = C5608a0.f14199a;
        String format = String.format("m.%s", Arrays.copyOf(new Object[]{C5608a0.m11293l()}, 1));
        C9768m.m32345e(format, "java.lang.String.format(format, *args)");
        return format;
    }

    /* renamed from: c */
    public static final String m11512c() {
        return "CONNECTION_FAILURE";
    }

    /* renamed from: d */
    public static final Collection<String> m11513d() {
        List m38891m;
        m38891m = C10784u.m38891m("service_disabled", "AndroidAuthKillSwitchException");
        return m38891m;
    }

    /* renamed from: e */
    public static final Collection<String> m11514e() {
        List m38891m;
        m38891m = C10784u.m38891m("access_denied", "OAuthAccessDeniedException");
        return m38891m;
    }

    /* renamed from: f */
    public static final String m11515f() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        C5608a0 c5608a0 = C5608a0.f14199a;
        String format = String.format("https://graph.%s", Arrays.copyOf(new Object[]{C5608a0.m11293l()}, 1));
        C9768m.m32345e(format, "java.lang.String.format(format, *args)");
        return format;
    }

    /* renamed from: g */
    public static final String m11516g() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        C5608a0 c5608a0 = C5608a0.f14199a;
        String format = String.format("%s", Arrays.copyOf(new Object[]{C5608a0.m11294m()}, 1));
        C9768m.m32345e(format, "java.lang.String.format(format, *args)");
        return format;
    }

    /* renamed from: h */
    public static final String m11517h() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        C5608a0 c5608a0 = C5608a0.f14199a;
        String format = String.format("https://graph.%s", Arrays.copyOf(new Object[]{C5608a0.m11296o()}, 1));
        C9768m.m32345e(format, "java.lang.String.format(format, *args)");
        return format;
    }

    /* renamed from: i */
    public static final String m11518i(String str) {
        C9768m.m32346f(str, "subdomain");
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        String format = String.format("https://graph.%s", Arrays.copyOf(new Object[]{str}, 1));
        C9768m.m32345e(format, "java.lang.String.format(format, *args)");
        return format;
    }

    /* renamed from: j */
    public static final String m11519j() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        C5608a0 c5608a0 = C5608a0.f14199a;
        String format = String.format("https://graph-video.%s", Arrays.copyOf(new Object[]{C5608a0.m11296o()}, 1));
        C9768m.m32345e(format, "java.lang.String.format(format, *args)");
        return format;
    }

    /* renamed from: k */
    public static final String m11520k() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        C5608a0 c5608a0 = C5608a0.f14199a;
        String format = String.format("m.%s", Arrays.copyOf(new Object[]{C5608a0.m11297p()}, 1));
        C9768m.m32345e(format, "java.lang.String.format(format, *args)");
        return format;
    }
}
