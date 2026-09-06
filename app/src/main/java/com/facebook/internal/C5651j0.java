package com.facebook.internal;

import android.util.Log;
import cm.aptoide.p092pt.database.room.RoomNotification;
import cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment;
import com.facebook.C5608a0;
import com.facebook.EnumC5626g0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.C10513u;

/* compiled from: Logger.kt */
/* renamed from: com.facebook.internal.j0 */
/* loaded from: classes2.dex */
public final class C5651j0 {

    /* renamed from: a */
    public static final a f14429a = new a(null);

    /* renamed from: b */
    private static final HashMap<String, String> f14430b = new HashMap<>();

    /* renamed from: c */
    private final EnumC5626g0 f14431c;

    /* renamed from: d */
    private final String f14432d;

    /* renamed from: e */
    private StringBuilder f14433e;

    /* renamed from: f */
    private int f14434f;

    /* compiled from: Logger.kt */
    /* renamed from: com.facebook.internal.j0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: f */
        private final synchronized String m11452f(String str) {
            String str2;
            str2 = str;
            for (Map.Entry entry : C5651j0.f14430b.entrySet()) {
                str2 = C10513u.m37507A(str2, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
            }
            return str2;
        }

        /* renamed from: a */
        public final void m11453a(EnumC5626g0 enumC5626g0, int i2, String str, String str2) {
            C9768m.m32346f(enumC5626g0, "behavior");
            C9768m.m32346f(str, StoreTabGridRecyclerFragment.BundleCons.TAG);
            C9768m.m32346f(str2, "string");
            C5608a0 c5608a0 = C5608a0.f14199a;
            if (C5608a0.m11306y(enumC5626g0)) {
                String m11452f = m11452f(str2);
                if (!C10513u.m37511E(str, "FacebookSDK.", false, 2, null)) {
                    str = C9768m.m32354n("FacebookSDK.", str);
                }
                Log.println(i2, str, m11452f);
                if (enumC5626g0 == EnumC5626g0.DEVELOPER_ERRORS) {
                    new Exception().printStackTrace();
                }
            }
        }

        /* renamed from: b */
        public final void m11454b(EnumC5626g0 enumC5626g0, String str, String str2) {
            C9768m.m32346f(enumC5626g0, "behavior");
            C9768m.m32346f(str, StoreTabGridRecyclerFragment.BundleCons.TAG);
            C9768m.m32346f(str2, "string");
            m11453a(enumC5626g0, 3, str, str2);
        }

        /* renamed from: c */
        public final void m11455c(EnumC5626g0 enumC5626g0, String str, String str2, Object... objArr) {
            C9768m.m32346f(enumC5626g0, "behavior");
            C9768m.m32346f(str, StoreTabGridRecyclerFragment.BundleCons.TAG);
            C9768m.m32346f(str2, "format");
            C9768m.m32346f(objArr, "args");
            C5608a0 c5608a0 = C5608a0.f14199a;
            if (C5608a0.m11306y(enumC5626g0)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                String format = String.format(str2, Arrays.copyOf(copyOf, copyOf.length));
                C9768m.m32345e(format, "java.lang.String.format(format, *args)");
                m11453a(enumC5626g0, 3, str, format);
            }
        }

        /* renamed from: d */
        public final synchronized void m11456d(String str) {
            C9768m.m32346f(str, "accessToken");
            C5608a0 c5608a0 = C5608a0.f14199a;
            if (!C5608a0.m11306y(EnumC5626g0.INCLUDE_ACCESS_TOKENS)) {
                m11457e(str, "ACCESS_TOKEN_REMOVED");
            }
        }

        /* renamed from: e */
        public final synchronized void m11457e(String str, String str2) {
            C9768m.m32346f(str, "original");
            C9768m.m32346f(str2, "replace");
            C5651j0.f14430b.put(str, str2);
        }
    }

    public C5651j0(EnumC5626g0 enumC5626g0, String str) {
        C9768m.m32346f(enumC5626g0, "behavior");
        C9768m.m32346f(str, StoreTabGridRecyclerFragment.BundleCons.TAG);
        this.f14434f = 3;
        this.f14431c = enumC5626g0;
        C5665q0 c5665q0 = C5665q0.f14500a;
        this.f14432d = C9768m.m32354n("FacebookSDK.", C5665q0.m11643k(str, StoreTabGridRecyclerFragment.BundleCons.TAG));
        this.f14433e = new StringBuilder();
    }

    /* renamed from: g */
    private final boolean m11446g() {
        C5608a0 c5608a0 = C5608a0.f14199a;
        return C5608a0.m11306y(this.f14431c);
    }

    /* renamed from: b */
    public final void m11447b(String str) {
        C9768m.m32346f(str, "string");
        if (m11446g()) {
            this.f14433e.append(str);
        }
    }

    /* renamed from: c */
    public final void m11448c(String str, Object... objArr) {
        C9768m.m32346f(str, "format");
        C9768m.m32346f(objArr, "args");
        if (m11446g()) {
            StringBuilder sb = this.f14433e;
            StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
            C9768m.m32345e(format, "java.lang.String.format(format, *args)");
            sb.append(format);
        }
    }

    /* renamed from: d */
    public final void m11449d(String str, Object obj) {
        C9768m.m32346f(str, RoomNotification.KEY);
        C9768m.m32346f(obj, "value");
        m11448c("  %s:\t%s\n", str, obj);
    }

    /* renamed from: e */
    public final void m11450e() {
        String sb = this.f14433e.toString();
        C9768m.m32345e(sb, "contents.toString()");
        m11451f(sb);
        this.f14433e = new StringBuilder();
    }

    /* renamed from: f */
    public final void m11451f(String str) {
        C9768m.m32346f(str, "string");
        f14429a.m11453a(this.f14431c, this.f14434f, this.f14432d, str);
    }
}
