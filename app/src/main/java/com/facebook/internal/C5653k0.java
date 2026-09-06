package com.facebook.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import cm.aptoide.p092pt.account.view.LoginActivity;
import com.facebook.C5608a0;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.login.EnumC5765r;
import com.facebook.login.EnumC5773z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.C10770n;
import kotlin.collections.C10784u;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.text.C10513u;
import okhttp3.HttpUrl;

/* compiled from: NativeProtocol.kt */
/* renamed from: com.facebook.internal.k0 */
/* loaded from: classes2.dex */
public final class C5653k0 {

    /* renamed from: a */
    public static final C5653k0 f14437a;

    /* renamed from: b */
    private static final String f14438b;

    /* renamed from: c */
    private static final List<e> f14439c;

    /* renamed from: d */
    private static final List<e> f14440d;

    /* renamed from: e */
    private static final Map<String, List<e>> f14441e;

    /* renamed from: f */
    private static final AtomicBoolean f14442f;

    /* renamed from: g */
    private static final Integer[] f14443g;

    /* compiled from: NativeProtocol.kt */
    /* renamed from: com.facebook.internal.k0$a */
    private static final class a extends e {
        @Override // com.facebook.internal.C5653k0.e
        /* renamed from: c */
        public /* bridge */ /* synthetic */ String mo11485c() {
            return (String) m11487g();
        }

        @Override // com.facebook.internal.C5653k0.e
        /* renamed from: d */
        public String mo11486d() {
            return "com.facebook.arstudio.player";
        }

        /* renamed from: g */
        public Void m11487g() {
            return null;
        }
    }

    /* compiled from: NativeProtocol.kt */
    /* renamed from: com.facebook.internal.k0$b */
    private static final class b extends e {
        @Override // com.facebook.internal.C5653k0.e
        /* renamed from: c */
        public String mo11485c() {
            return "com.instagram.platform.AppAuthorizeActivity";
        }

        @Override // com.facebook.internal.C5653k0.e
        /* renamed from: d */
        public String mo11486d() {
            return "com.instagram.android";
        }

        @Override // com.facebook.internal.C5653k0.e
        /* renamed from: e */
        public String mo11488e() {
            return "token,signed_request,graph_domain,granted_scopes";
        }
    }

    /* compiled from: NativeProtocol.kt */
    /* renamed from: com.facebook.internal.k0$c */
    private static final class c extends e {
        /* renamed from: g */
        private final boolean m11489g() {
            C5608a0 c5608a0 = C5608a0.f14199a;
            return C5608a0.m11284c().getApplicationInfo().targetSdkVersion >= 30;
        }

        @Override // com.facebook.internal.C5653k0.e
        /* renamed from: c */
        public String mo11485c() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // com.facebook.internal.C5653k0.e
        /* renamed from: d */
        public String mo11486d() {
            return "com.facebook.katana";
        }

        @Override // com.facebook.internal.C5653k0.e
        /* renamed from: f */
        public void mo11490f() {
            if (m11489g()) {
                Log.w(C5653k0.f14438b, "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration.");
            }
        }
    }

    /* compiled from: NativeProtocol.kt */
    /* renamed from: com.facebook.internal.k0$d */
    private static final class d extends e {
        @Override // com.facebook.internal.C5653k0.e
        /* renamed from: c */
        public /* bridge */ /* synthetic */ String mo11485c() {
            return (String) m11491g();
        }

        @Override // com.facebook.internal.C5653k0.e
        /* renamed from: d */
        public String mo11486d() {
            return "com.facebook.orca";
        }

        /* renamed from: g */
        public Void m11491g() {
            return null;
        }
    }

    /* compiled from: NativeProtocol.kt */
    /* renamed from: com.facebook.internal.k0$e */
    public static abstract class e {

        /* renamed from: a */
        private TreeSet<Integer> f14444a;

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0019, code lost:
        
            if (kotlin.jvm.internal.C9768m.m32341a(r2 == null ? null : java.lang.Boolean.valueOf(r2.isEmpty()), java.lang.Boolean.FALSE) == false) goto L11;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {, blocks: (B:20:0x0003, B:24:0x0013, B:4:0x0023, B:6:0x0027, B:11:0x0033, B:26:0x000b, B:3:0x001b), top: B:19:0x0003 }] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final synchronized void m11492a(boolean r2) {
            /*
                r1 = this;
                monitor-enter(r1)
                if (r2 != 0) goto L1b
                java.util.TreeSet<java.lang.Integer> r2 = r1.f14444a     // Catch: java.lang.Throwable -> L38
                if (r2 == 0) goto L1b
                if (r2 != 0) goto Lb
                r2 = 0
                goto L13
            Lb:
                boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L38
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L38
            L13:
                java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L38
                boolean r2 = kotlin.jvm.internal.C9768m.m32341a(r2, r0)     // Catch: java.lang.Throwable -> L38
                if (r2 != 0) goto L23
            L1b:
                com.facebook.internal.k0 r2 = com.facebook.internal.C5653k0.f14437a     // Catch: java.lang.Throwable -> L38
                java.util.TreeSet r2 = com.facebook.internal.C5653k0.m11459a(r2, r1)     // Catch: java.lang.Throwable -> L38
                r1.f14444a = r2     // Catch: java.lang.Throwable -> L38
            L23:
                java.util.TreeSet<java.lang.Integer> r2 = r1.f14444a     // Catch: java.lang.Throwable -> L38
                if (r2 == 0) goto L30
                boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L38
                if (r2 == 0) goto L2e
                goto L30
            L2e:
                r2 = 0
                goto L31
            L30:
                r2 = 1
            L31:
                if (r2 == 0) goto L36
                r1.mo11490f()     // Catch: java.lang.Throwable -> L38
            L36:
                monitor-exit(r1)
                return
            L38:
                r2 = move-exception
                monitor-exit(r1)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C5653k0.e.m11492a(boolean):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
        
            if (kotlin.jvm.internal.C9768m.m32341a(r0 == null ? null : java.lang.Boolean.valueOf(r0.isEmpty()), java.lang.Boolean.FALSE) == false) goto L9;
         */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.TreeSet<java.lang.Integer> m11493b() {
            /*
                r2 = this;
                java.util.TreeSet<java.lang.Integer> r0 = r2.f14444a
                if (r0 == 0) goto L18
                if (r0 != 0) goto L8
                r0 = 0
                goto L10
            L8:
                boolean r0 = r0.isEmpty()
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            L10:
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                boolean r0 = kotlin.jvm.internal.C9768m.m32341a(r0, r1)
                if (r0 != 0) goto L1c
            L18:
                r0 = 0
                r2.m11492a(r0)
            L1c:
                java.util.TreeSet<java.lang.Integer> r0 = r2.f14444a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C5653k0.e.m11493b():java.util.TreeSet");
        }

        /* renamed from: c */
        public abstract String mo11485c();

        /* renamed from: d */
        public abstract String mo11486d();

        /* renamed from: e */
        public String mo11488e() {
            return "id_token,token,signed_request,graph_domain";
        }

        /* renamed from: f */
        public void mo11490f() {
        }
    }

    /* compiled from: NativeProtocol.kt */
    /* renamed from: com.facebook.internal.k0$f */
    public static final class f {

        /* renamed from: a */
        public static final a f14445a = new a(null);

        /* renamed from: b */
        private e f14446b;

        /* renamed from: c */
        private int f14447c;

        /* compiled from: NativeProtocol.kt */
        /* renamed from: com.facebook.internal.k0$f$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(C9756g c9756g) {
                this();
            }

            /* renamed from: a */
            public final f m11497a(e eVar, int i2) {
                f fVar = new f(null);
                fVar.f14446b = eVar;
                fVar.f14447c = i2;
                return fVar;
            }

            /* renamed from: b */
            public final f m11498b() {
                f fVar = new f(null);
                fVar.f14447c = -1;
                return fVar;
            }
        }

        private f() {
        }

        public /* synthetic */ f(C9756g c9756g) {
            this();
        }

        /* renamed from: c */
        public final int m11496c() {
            return this.f14447c;
        }
    }

    /* compiled from: NativeProtocol.kt */
    /* renamed from: com.facebook.internal.k0$g */
    private static final class g extends e {
        @Override // com.facebook.internal.C5653k0.e
        /* renamed from: c */
        public String mo11485c() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // com.facebook.internal.C5653k0.e
        /* renamed from: d */
        public String mo11486d() {
            return "com.facebook.wakizashi";
        }
    }

    static {
        C5653k0 c5653k0 = new C5653k0();
        f14437a = c5653k0;
        f14438b = C5653k0.class.getName();
        f14439c = c5653k0.m11463e();
        f14440d = c5653k0.m11462d();
        f14441e = c5653k0.m11461c();
        f14442f = new AtomicBoolean(false);
        f14443g = new Integer[]{20210906, 20171115, 20170417, 20170411, 20170213, 20161017, 20160327, 20150702, 20150401, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140313, 20140204, 20131107, 20131024, 20130618, 20130502, 20121101};
    }

    private C5653k0() {
    }

    /* renamed from: A */
    public static final Intent m11458A(Context context, Intent intent, e eVar) {
        ResolveInfo resolveService;
        C9768m.m32346f(context, "context");
        if (intent == null || (resolveService = context.getPackageManager().resolveService(intent, 0)) == null) {
            return null;
        }
        C5706y c5706y = C5706y.f14647a;
        String str = resolveService.serviceInfo.packageName;
        C9768m.m32345e(str, "resolveInfo.serviceInfo.packageName");
        if (C5706y.m11828a(context, str)) {
            return intent;
        }
        return null;
    }

    /* renamed from: c */
    private final Map<String, List<e>> m11461c() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new d());
        List<e> list = f14439c;
        hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", list);
        hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", list);
        hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", list);
        hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", list);
        hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
        hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
        hashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", f14440d);
        hashMap.put("com.facebook.platform.action.request.SHARE_STORY", list);
        return hashMap;
    }

    /* renamed from: d */
    private final List<e> m11462d() {
        ArrayList m38884f;
        m38884f = C10784u.m38884f(new a());
        m38884f.addAll(m11463e());
        return m38884f;
    }

    /* renamed from: e */
    private final List<e> m11463e() {
        ArrayList m38884f;
        m38884f = C10784u.m38884f(new c(), new g());
        return m38884f;
    }

    /* renamed from: f */
    private final Uri m11464f(e eVar) {
        Uri parse = Uri.parse("content://" + eVar.mo11486d() + ".provider.PlatformProvider/versions");
        C9768m.m32345e(parse, "parse(CONTENT_SCHEME + appInfo.getPackage() + PLATFORM_PROVIDER_VERSIONS)");
        return parse;
    }

    /* renamed from: g */
    public static final int m11465g(TreeSet<Integer> treeSet, int i2, int[] iArr) {
        C9768m.m32346f(iArr, "versionSpec");
        if (treeSet == null) {
            return -1;
        }
        int length = iArr.length - 1;
        Iterator<Integer> descendingIterator = treeSet.descendingIterator();
        int i3 = -1;
        while (descendingIterator.hasNext()) {
            Integer next = descendingIterator.next();
            C9768m.m32345e(next, "fbAppVersion");
            i3 = Math.max(i3, next.intValue());
            while (length >= 0 && iArr[length] > next.intValue()) {
                length--;
            }
            if (length < 0) {
                return -1;
            }
            if (iArr[length] == next.intValue()) {
                if (length % 2 == 0) {
                    return Math.min(i3, i2);
                }
                return -1;
            }
        }
        return -1;
    }

    /* renamed from: h */
    public static final Bundle m11466h(FacebookException facebookException) {
        if (facebookException == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("error_description", facebookException.toString());
        if (facebookException instanceof FacebookOperationCanceledException) {
            bundle.putString("error_type", "UserCanceled");
        }
        return bundle;
    }

    /* renamed from: i */
    public static final Intent m11467i(Context context, String str, Collection<String> collection, String str2, boolean z, boolean z2, EnumC5765r enumC5765r, String str3, String str4, String str5, boolean z3, boolean z4, boolean z5) {
        C9768m.m32346f(context, "context");
        C9768m.m32346f(str, "applicationId");
        C9768m.m32346f(collection, "permissions");
        C9768m.m32346f(str2, "e2e");
        C9768m.m32346f(enumC5765r, "defaultAudience");
        C9768m.m32346f(str3, "clientState");
        C9768m.m32346f(str4, "authType");
        b bVar = new b();
        return m11484z(context, f14437a.m11468j(bVar, str, collection, str2, z2, enumC5765r, str3, str4, false, str5, z3, EnumC5773z.INSTAGRAM, z4, z5, HttpUrl.FRAGMENT_ENCODE_SET, null, null), bVar);
    }

    /* renamed from: j */
    private final Intent m11468j(e eVar, String str, Collection<String> collection, String str2, boolean z, EnumC5765r enumC5765r, String str3, String str4, boolean z2, String str5, boolean z3, EnumC5773z enumC5773z, boolean z4, boolean z5, String str6, String str7, String str8) {
        String mo11485c = eVar.mo11485c();
        if (mo11485c == null) {
            return null;
        }
        Intent putExtra = new Intent().setClassName(eVar.mo11486d(), mo11485c).putExtra("client_id", str);
        C9768m.m32345e(putExtra, "Intent()\n            .setClassName(appInfo.getPackage(), activityName)\n            .putExtra(FACEBOOK_PROXY_AUTH_APP_ID_KEY, applicationId)");
        C5608a0 c5608a0 = C5608a0.f14199a;
        putExtra.putExtra("facebook_sdk_version", C5608a0.m11300s());
        C5663p0 c5663p0 = C5663p0.f14478a;
        if (!C5663p0.m11559b0(collection)) {
            putExtra.putExtra("scope", TextUtils.join(",", collection));
        }
        if (!C5663p0.m11557a0(str2)) {
            putExtra.putExtra("e2e", str2);
        }
        putExtra.putExtra("state", str3);
        putExtra.putExtra("response_type", eVar.mo11488e());
        putExtra.putExtra("nonce", str6);
        putExtra.putExtra("return_scopes", "true");
        if (z) {
            putExtra.putExtra("default_audience", enumC5765r.m12057k());
        }
        putExtra.putExtra("legacy_override", C5608a0.m11295n());
        putExtra.putExtra(LoginActivity.AUTH_TYPE, str4);
        if (z2) {
            putExtra.putExtra("fail_on_logged_out", true);
        }
        putExtra.putExtra("messenger_page_id", str5);
        putExtra.putExtra("reset_messenger_state", z3);
        if (z4) {
            putExtra.putExtra("fx_app", enumC5773z.toString());
        }
        if (z5) {
            putExtra.putExtra("skip_dedupe", true);
        }
        return putExtra;
    }

    /* renamed from: k */
    public static final Intent m11469k(Context context) {
        C9768m.m32346f(context, "context");
        for (e eVar : f14439c) {
            Intent m11458A = m11458A(context, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(eVar.mo11486d()).addCategory("android.intent.category.DEFAULT"), eVar);
            if (m11458A != null) {
                return m11458A;
            }
        }
        return null;
    }

    /* renamed from: l */
    public static final Intent m11470l(Intent intent, Bundle bundle, FacebookException facebookException) {
        C9768m.m32346f(intent, "requestIntent");
        UUID m11473o = m11473o(intent);
        if (m11473o == null) {
            return null;
        }
        Intent intent2 = new Intent();
        intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", m11479u(intent));
        Bundle bundle2 = new Bundle();
        bundle2.putString("action_id", m11473o.toString());
        if (facebookException != null) {
            bundle2.putBundle("error", m11466h(facebookException));
        }
        intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
        if (bundle != null) {
            intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
        }
        return intent2;
    }

    /* renamed from: m */
    public static final List<Intent> m11471m(Context context, String str, Collection<String> collection, String str2, boolean z, boolean z2, EnumC5765r enumC5765r, String str3, String str4, boolean z3, String str5, boolean z4, boolean z5, boolean z6, String str6, String str7, String str8) {
        C9768m.m32346f(str, "applicationId");
        C9768m.m32346f(collection, "permissions");
        C9768m.m32346f(str2, "e2e");
        C9768m.m32346f(enumC5765r, "defaultAudience");
        C9768m.m32346f(str3, "clientState");
        C9768m.m32346f(str4, "authType");
        List<e> list = f14439c;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            Iterator it2 = it;
            ArrayList arrayList2 = arrayList;
            Intent m11468j = f14437a.m11468j(eVar, str, collection, str2, z2, enumC5765r, str3, str4, z3, str5, z4, EnumC5773z.FACEBOOK, z5, z6, str6, str7, str8);
            if (m11468j != null) {
                arrayList2.add(m11468j);
            }
            arrayList = arrayList2;
            it = it2;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public final TreeSet<Integer> m11472n(e eVar) {
        ProviderInfo providerInfo;
        TreeSet<Integer> treeSet = new TreeSet<>();
        C5608a0 c5608a0 = C5608a0.f14199a;
        ContentResolver contentResolver = C5608a0.m11284c().getContentResolver();
        String[] strArr = {"version"};
        Uri m11464f = m11464f(eVar);
        Cursor cursor = null;
        try {
            try {
                providerInfo = C5608a0.m11284c().getPackageManager().resolveContentProvider(C9768m.m32354n(eVar.mo11486d(), ".provider.PlatformProvider"), 0);
            } catch (RuntimeException e2) {
                Log.e(f14438b, "Failed to query content resolver.", e2);
                providerInfo = null;
            }
            if (providerInfo != null) {
                try {
                    try {
                        try {
                            cursor = contentResolver.query(m11464f, strArr, null, null, null);
                        } catch (NullPointerException unused) {
                            Log.e(f14438b, "Failed to query content resolver.");
                        }
                    } catch (SecurityException unused2) {
                        Log.e(f14438b, "Failed to query content resolver.");
                    }
                } catch (IllegalArgumentException unused3) {
                    Log.e(f14438b, "Failed to query content resolver.");
                }
                if (cursor != null) {
                    while (cursor.moveToNext()) {
                        treeSet.add(Integer.valueOf(cursor.getInt(cursor.getColumnIndex("version"))));
                    }
                }
            }
            return treeSet;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* renamed from: o */
    public static final UUID m11473o(Intent intent) {
        String stringExtra;
        if (intent == null) {
            return null;
        }
        if (m11480v(m11479u(intent))) {
            Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
            stringExtra = bundleExtra != null ? bundleExtra.getString("action_id") : null;
        } else {
            stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
        }
        if (stringExtra == null) {
            return null;
        }
        try {
            return UUID.fromString(stringExtra);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: p */
    public static final FacebookException m11474p(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("error_type");
        if (string == null) {
            string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
        }
        String string2 = bundle.getString("error_description");
        if (string2 == null) {
            string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
        }
        return (string == null || !C10513u.m37515q(string, "UserCanceled", true)) ? new FacebookException(string2) : new FacebookOperationCanceledException(string2);
    }

    /* renamed from: q */
    private final f m11475q(List<? extends e> list, int[] iArr) {
        m11482x();
        if (list == null) {
            return f.f14445a.m11498b();
        }
        for (e eVar : list) {
            int m11465g = m11465g(eVar.m11493b(), m11477s(), iArr);
            if (m11465g != -1) {
                return f.f14445a.m11497a(eVar, m11465g);
            }
        }
        return f.f14445a.m11498b();
    }

    /* renamed from: r */
    public static final int m11476r(int i2) {
        return f14437a.m11475q(f14439c, new int[]{i2}).m11496c();
    }

    /* renamed from: s */
    public static final int m11477s() {
        return f14443g[0].intValue();
    }

    /* renamed from: t */
    public static final Bundle m11478t(Intent intent) {
        C9768m.m32346f(intent, "intent");
        return !m11480v(m11479u(intent)) ? intent.getExtras() : intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
    }

    /* renamed from: u */
    public static final int m11479u(Intent intent) {
        C9768m.m32346f(intent, "intent");
        return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
    }

    /* renamed from: v */
    public static final boolean m11480v(int i2) {
        boolean m38764t;
        m38764t = C10770n.m38764t(f14443g, Integer.valueOf(i2));
        return m38764t && i2 >= 20140701;
    }

    /* renamed from: x */
    public static final void m11482x() {
        if (f14442f.compareAndSet(false, true)) {
            C5608a0 c5608a0 = C5608a0.f14199a;
            C5608a0.m11292k().execute(new Runnable() { // from class: com.facebook.internal.j
                @Override // java.lang.Runnable
                public final void run() {
                    C5653k0.m11483y();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public static final void m11483y() {
        try {
            Iterator<e> it = f14439c.iterator();
            while (it.hasNext()) {
                it.next().m11492a(true);
            }
        } finally {
            f14442f.set(false);
        }
    }

    /* renamed from: z */
    public static final Intent m11484z(Context context, Intent intent, e eVar) {
        ResolveInfo resolveActivity;
        C9768m.m32346f(context, "context");
        if (intent == null || (resolveActivity = context.getPackageManager().resolveActivity(intent, 0)) == null) {
            return null;
        }
        C5706y c5706y = C5706y.f14647a;
        String str = resolveActivity.activityInfo.packageName;
        C9768m.m32345e(str, "resolveInfo.activityInfo.packageName");
        if (C5706y.m11828a(context, str)) {
            return intent;
        }
        return null;
    }
}
