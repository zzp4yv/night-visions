package com.facebook.p157o0.p159l0;

import android.content.SharedPreferences;
import com.facebook.C5608a0;
import com.facebook.C5620d0;
import com.facebook.EnumC5622e0;
import com.facebook.EnumC5626g0;
import com.facebook.GraphRequest;
import com.facebook.internal.C5651j0;
import com.facebook.internal.C5663p0;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import kotlin.C9788b;
import kotlin.collections.C10780s;
import kotlin.jvm.internal.C9768m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AppEventsCAPIManager.kt */
/* renamed from: com.facebook.o0.l0.f */
/* loaded from: classes.dex */
public final class C5812f {

    /* renamed from: a */
    public static final C5812f f15023a = new C5812f();

    /* renamed from: b */
    private static final String f15024b = C5812f.class.getCanonicalName();

    /* renamed from: c */
    private static boolean f15025c;

    private C5812f() {
    }

    /* renamed from: a */
    public static final void m12308a() {
        String m32368b;
        try {
            C5807a c5807a = new GraphRequest.InterfaceC5598b() { // from class: com.facebook.o0.l0.a
                @Override // com.facebook.GraphRequest.InterfaceC5598b
                /* renamed from: b */
                public final void mo11196b(C5620d0 c5620d0) {
                    C5812f.m12309b(c5620d0);
                }
            };
            C5608a0 c5608a0 = C5608a0.f14199a;
            GraphRequest graphRequest = new GraphRequest(null, C9768m.m32354n(C5608a0.m11285d(), "/cloudbridge_settings"), null, EnumC5622e0.GET, c5807a, null, 32, null);
            C5651j0.a aVar = C5651j0.f14429a;
            EnumC5626g0 enumC5626g0 = EnumC5626g0.APP_EVENTS;
            String str = f15024b;
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            aVar.m11455c(enumC5626g0, str, " \n\nCreating Graph Request: \n=============\n%s\n\n ", graphRequest);
            graphRequest.m11180k();
        } catch (JSONException e2) {
            C5651j0.a aVar2 = C5651j0.f14429a;
            EnumC5626g0 enumC5626g02 = EnumC5626g0.APP_EVENTS;
            String str2 = f15024b;
            if (str2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            m32368b = C9788b.m32368b(e2);
            aVar2.m11455c(enumC5626g02, str2, " \n\nGraph Request Exception: \n=============\n%s\n\n ", m32368b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m12309b(C5620d0 c5620d0) {
        C9768m.m32346f(c5620d0, "response");
        f15023a.m12312c(c5620d0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map<java.lang.String, java.lang.Object> m12310d() {
        /*
            com.facebook.a0 r0 = com.facebook.C5608a0.f14199a
            android.content.Context r0 = com.facebook.C5608a0.m11284c()
            java.lang.String r1 = "com.facebook.sdk.CloudBridgeSavedCredentials"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            r1 = 0
            if (r0 != 0) goto L11
            return r1
        L11:
            com.facebook.o0.l0.o r3 = com.facebook.p157o0.p159l0.EnumC5821o.DATASETID
            java.lang.String r4 = r3.m12369k()
            java.lang.String r4 = r0.getString(r4, r1)
            com.facebook.o0.l0.o r5 = com.facebook.p157o0.p159l0.EnumC5821o.URL
            java.lang.String r6 = r5.m12369k()
            java.lang.String r6 = r0.getString(r6, r1)
            com.facebook.o0.l0.o r7 = com.facebook.p157o0.p159l0.EnumC5821o.ACCESSKEY
            java.lang.String r8 = r7.m12369k()
            java.lang.String r0 = r0.getString(r8, r1)
            r8 = 1
            if (r4 == 0) goto L3b
            boolean r9 = kotlin.text.C10504l.m37486t(r4)
            if (r9 == 0) goto L39
            goto L3b
        L39:
            r9 = 0
            goto L3c
        L3b:
            r9 = 1
        L3c:
            if (r9 != 0) goto L8e
            if (r6 == 0) goto L49
            boolean r9 = kotlin.text.C10504l.m37486t(r6)
            if (r9 == 0) goto L47
            goto L49
        L47:
            r9 = 0
            goto L4a
        L49:
            r9 = 1
        L4a:
            if (r9 != 0) goto L8e
            if (r0 == 0) goto L57
            boolean r9 = kotlin.text.C10504l.m37486t(r0)
            if (r9 == 0) goto L55
            goto L57
        L55:
            r9 = 0
            goto L58
        L57:
            r9 = 1
        L58:
            if (r9 == 0) goto L5b
            goto L8e
        L5b:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.lang.String r5 = r5.m12369k()
            r1.put(r5, r6)
            java.lang.String r3 = r3.m12369k()
            r1.put(r3, r4)
            java.lang.String r3 = r7.m12369k()
            r1.put(r3, r0)
            com.facebook.internal.j0$a r3 = com.facebook.internal.C5651j0.f14429a
            com.facebook.g0 r5 = com.facebook.EnumC5626g0.APP_EVENTS
            java.lang.String r7 = com.facebook.p157o0.p159l0.C5812f.f15024b
            java.lang.String r7 = r7.toString()
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r2] = r4
            r9[r8] = r6
            r2 = 2
            r9[r2] = r0
            java.lang.String r0 = " \n\nLoading Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n "
            r3.m11455c(r5, r7, r0, r9)
        L8e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p157o0.p159l0.C5812f.m12310d():java.util.Map");
    }

    /* renamed from: c */
    public final void m12312c(C5620d0 c5620d0) {
        String m32368b;
        String m32368b2;
        String m32368b3;
        C9768m.m32346f(c5620d0, "response");
        boolean z = false;
        if (c5620d0.m11338b() != null) {
            C5651j0.a aVar = C5651j0.f14429a;
            EnumC5626g0 enumC5626g0 = EnumC5626g0.APP_EVENTS;
            String str = f15024b;
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            aVar.m11455c(enumC5626g0, str, " \n\nGraph Response Error: \n================\nResponse Error: %s\nResponse Error Exception: %s\n\n ", c5620d0.m11338b().toString(), String.valueOf(c5620d0.m11338b().m11143e()));
            Map<String, Object> m12310d = m12310d();
            if (m12310d != null) {
                URL url = new URL(String.valueOf(m12310d.get(EnumC5821o.URL.m12369k())));
                C5814h c5814h = C5814h.f15048a;
                C5814h.m12337c(String.valueOf(m12310d.get(EnumC5821o.DATASETID.m12369k())), url.getProtocol() + "://" + ((Object) url.getHost()), String.valueOf(m12310d.get(EnumC5821o.ACCESSKEY.m12369k())));
                f15025c = true;
                return;
            }
            return;
        }
        C5651j0.a aVar2 = C5651j0.f14429a;
        EnumC5626g0 enumC5626g02 = EnumC5626g0.APP_EVENTS;
        String str2 = f15024b;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        aVar2.m11455c(enumC5626g02, str2, " \n\nGraph Response Received: \n================\n%s\n\n ", c5620d0);
        JSONObject m11339c = c5620d0.m11339c();
        try {
            C5663p0 c5663p0 = C5663p0.f14478a;
            Object obj = m11339c == null ? null : m11339c.get("data");
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
            }
            Map<String, ? extends Object> m11578l = C5663p0.m11578l(new JSONObject((String) C10780s.m38832W(C5663p0.m11576k((JSONArray) obj))));
            String str3 = (String) m11578l.get(EnumC5821o.URL.m12369k());
            String str4 = (String) m11578l.get(EnumC5821o.DATASETID.m12369k());
            String str5 = (String) m11578l.get(EnumC5821o.ACCESSKEY.m12369k());
            if (str3 == null || str4 == null || str5 == null) {
                C9768m.m32345e(str2, "TAG");
                aVar2.m11454b(enumC5626g02, str2, "CloudBridge Settings API response doesn't have valid data");
                return;
            }
            try {
                C5814h c5814h2 = C5814h.f15048a;
                C5814h.m12337c(str4, str3, str5);
                m12314g(m11578l);
                EnumC5821o enumC5821o = EnumC5821o.ENABLED;
                if (m11578l.get(enumC5821o.m12369k()) != null) {
                    Object obj2 = m11578l.get(enumC5821o.m12369k());
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                    }
                    z = ((Boolean) obj2).booleanValue();
                }
                f15025c = z;
            } catch (MalformedURLException e2) {
                C5651j0.a aVar3 = C5651j0.f14429a;
                EnumC5626g0 enumC5626g03 = EnumC5626g0.APP_EVENTS;
                String str6 = f15024b;
                C9768m.m32345e(str6, "TAG");
                m32368b3 = C9788b.m32368b(e2);
                aVar3.m11455c(enumC5626g03, str6, "CloudBridge Settings API response doesn't have valid url\n %s ", m32368b3);
            }
        } catch (NullPointerException e3) {
            C5651j0.a aVar4 = C5651j0.f14429a;
            EnumC5626g0 enumC5626g04 = EnumC5626g0.APP_EVENTS;
            String str7 = f15024b;
            C9768m.m32345e(str7, "TAG");
            m32368b2 = C9788b.m32368b(e3);
            aVar4.m11455c(enumC5626g04, str7, "CloudBridge Settings API response is not a valid json: \n%s ", m32368b2);
        } catch (JSONException e4) {
            C5651j0.a aVar5 = C5651j0.f14429a;
            EnumC5626g0 enumC5626g05 = EnumC5626g0.APP_EVENTS;
            String str8 = f15024b;
            C9768m.m32345e(str8, "TAG");
            m32368b = C9788b.m32368b(e4);
            aVar5.m11455c(enumC5626g05, str8, "CloudBridge Settings API response is not a valid json: \n%s ", m32368b);
        }
    }

    /* renamed from: e */
    public final boolean m12313e() {
        return f15025c;
    }

    /* renamed from: g */
    public final void m12314g(Map<String, ? extends Object> map) {
        C5608a0 c5608a0 = C5608a0.f14199a;
        SharedPreferences sharedPreferences = C5608a0.m11284c().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
        if (sharedPreferences == null) {
            return;
        }
        if (map == null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.clear();
            edit.apply();
            return;
        }
        EnumC5821o enumC5821o = EnumC5821o.DATASETID;
        Object obj = map.get(enumC5821o.m12369k());
        EnumC5821o enumC5821o2 = EnumC5821o.URL;
        Object obj2 = map.get(enumC5821o2.m12369k());
        EnumC5821o enumC5821o3 = EnumC5821o.ACCESSKEY;
        Object obj3 = map.get(enumC5821o3.m12369k());
        if (obj == null || obj2 == null || obj3 == null) {
            return;
        }
        SharedPreferences.Editor edit2 = sharedPreferences.edit();
        edit2.putString(enumC5821o.m12369k(), obj.toString());
        edit2.putString(enumC5821o2.m12369k(), obj2.toString());
        edit2.putString(enumC5821o3.m12369k(), obj3.toString());
        edit2.apply();
        C5651j0.f14429a.m11455c(EnumC5626g0.APP_EVENTS, f15024b.toString(), " \n\nSaving Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", obj, obj2, obj3);
    }
}
