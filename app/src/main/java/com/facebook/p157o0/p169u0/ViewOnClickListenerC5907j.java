package com.facebook.p157o0.p169u0;

import android.os.Bundle;
import android.view.View;
import com.facebook.C5608a0;
import com.facebook.GraphRequest;
import com.facebook.internal.C5663p0;
import com.facebook.p157o0.C5792g0;
import com.facebook.p157o0.p160m0.p161n.C5841f;
import com.facebook.p157o0.p166r0.C5886h;
import com.facebook.p157o0.p169u0.ViewOnClickListenerC5907j;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.C10513u;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ViewOnClickListener.kt */
/* renamed from: com.facebook.o0.u0.j */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC5907j implements View.OnClickListener {

    /* renamed from: f */
    public static final a f15522f = new a(null);

    /* renamed from: g */
    private static final Set<Integer> f15523g = new HashSet();

    /* renamed from: h */
    private final View.OnClickListener f15524h;

    /* renamed from: i */
    private final WeakReference<View> f15525i;

    /* renamed from: j */
    private final WeakReference<View> f15526j;

    /* renamed from: k */
    private final String f15527k;

    /* compiled from: ViewOnClickListener.kt */
    /* renamed from: com.facebook.o0.u0.j$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public final void m12827e(String str, String str2, float[] fArr) {
            C5905h c5905h = C5905h.f15513a;
            if (C5905h.m12805e(str)) {
                C5608a0 c5608a0 = C5608a0.f14199a;
                new C5792g0(C5608a0.m11284c()).m12243e(str, str2);
            } else if (C5905h.m12804d(str)) {
                m12830h(str, str2, fArr);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public final boolean m12828f(String str, final String str2) {
            C5903f c5903f = C5903f.f15507a;
            final String m12795d = C5903f.m12795d(str);
            if (m12795d == null) {
                return false;
            }
            if (C9768m.m32341a(m12795d, "other")) {
                return true;
            }
            C5663p0 c5663p0 = C5663p0.f14478a;
            C5663p0.m11527B0(new Runnable() { // from class: com.facebook.o0.u0.c
                @Override // java.lang.Runnable
                public final void run() {
                    ViewOnClickListenerC5907j.a.m12829g(m12795d, str2);
                }
            });
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public static final void m12829g(String str, String str2) {
            C9768m.m32346f(str, "$queriedEvent");
            C9768m.m32346f(str2, "$buttonText");
            ViewOnClickListenerC5907j.f15522f.m12827e(str, str2, new float[0]);
        }

        /* renamed from: h */
        private final void m12830h(String str, String str2, float[] fArr) {
            Bundle bundle = new Bundle();
            try {
                bundle.putString("event_name", str);
                JSONObject jSONObject = new JSONObject();
                StringBuilder sb = new StringBuilder();
                int length = fArr.length;
                int i2 = 0;
                while (i2 < length) {
                    float f2 = fArr[i2];
                    i2++;
                    sb.append(f2);
                    sb.append(",");
                }
                jSONObject.put("dense", sb.toString());
                jSONObject.put("button_text", str2);
                bundle.putString("metadata", jSONObject.toString());
                GraphRequest.C5599c c5599c = GraphRequest.f14159a;
                StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
                Locale locale = Locale.US;
                C5608a0 c5608a0 = C5608a0.f14199a;
                String format = String.format(locale, "%s/suggested_events", Arrays.copyOf(new Object[]{C5608a0.m11285d()}, 1));
                C9768m.m32345e(format, "java.lang.String.format(locale, format, *args)");
                GraphRequest m11222A = c5599c.m11222A(null, format, null, null);
                m11222A.m11177H(bundle);
                m11222A.m11179j();
            } catch (JSONException unused) {
            }
        }

        /* renamed from: c */
        public final void m12831c(View view, View view2, String str) {
            C9768m.m32346f(view, "hostView");
            C9768m.m32346f(view2, "rootView");
            C9768m.m32346f(str, "activityName");
            int hashCode = view.hashCode();
            if (ViewOnClickListenerC5907j.f15523g.contains(Integer.valueOf(hashCode))) {
                return;
            }
            C5841f c5841f = C5841f.f15257a;
            C5841f.m12484r(view, new ViewOnClickListenerC5907j(view, view2, str, null));
            ViewOnClickListenerC5907j.f15523g.add(Integer.valueOf(hashCode));
        }
    }

    private ViewOnClickListenerC5907j(View view, View view2, String str) {
        String m37507A;
        C5841f c5841f = C5841f.f15257a;
        this.f15524h = C5841f.m12474g(view);
        this.f15525i = new WeakReference<>(view2);
        this.f15526j = new WeakReference<>(view);
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = str.toLowerCase();
        C9768m.m32345e(lowerCase, "(this as java.lang.String).toLowerCase()");
        m37507A = C10513u.m37507A(lowerCase, "activity", HttpUrl.FRAGMENT_ENCODE_SET, false, 4, null);
        this.f15527k = m37507A;
    }

    public /* synthetic */ ViewOnClickListenerC5907j(View view, View view2, String str, C9756g c9756g) {
        this(view, view2, str);
    }

    /* renamed from: c */
    private final void m12821c(final String str, final String str2, final JSONObject jSONObject) {
        C5663p0 c5663p0 = C5663p0.f14478a;
        C5663p0.m11527B0(new Runnable() { // from class: com.facebook.o0.u0.d
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnClickListenerC5907j.m12822d(jSONObject, str2, this, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m12822d(JSONObject jSONObject, String str, ViewOnClickListenerC5907j viewOnClickListenerC5907j, String str2) {
        C9768m.m32346f(jSONObject, "$viewData");
        C9768m.m32346f(str, "$buttonText");
        C9768m.m32346f(viewOnClickListenerC5907j, "this$0");
        C9768m.m32346f(str2, "$pathID");
        try {
            C5663p0 c5663p0 = C5663p0.f14478a;
            C5608a0 c5608a0 = C5608a0.f14199a;
            String m11592s = C5663p0.m11592s(C5608a0.m11284c());
            if (m11592s == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = m11592s.toLowerCase();
            C9768m.m32345e(lowerCase, "(this as java.lang.String).toLowerCase()");
            C5902e c5902e = C5902e.f15501a;
            float[] m12778a = C5902e.m12778a(jSONObject, lowerCase);
            String m12780c = C5902e.m12780c(str, viewOnClickListenerC5907j.f15527k, lowerCase);
            if (m12778a == null) {
                return;
            }
            C5886h c5886h = C5886h.f15431a;
            String[] m12699q = C5886h.m12699q(C5886h.a.MTML_APP_EVENT_PREDICTION, new float[][]{m12778a}, new String[]{m12780c});
            if (m12699q == null) {
                return;
            }
            String str3 = m12699q[0];
            C5903f c5903f = C5903f.f15507a;
            C5903f.m12792a(str2, str3);
            if (C9768m.m32341a(str3, "other")) {
                return;
            }
            f15522f.m12827e(str3, str, m12778a);
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    private final void m12823e() {
        View view = this.f15525i.get();
        View view2 = this.f15526j.get();
        if (view == null || view2 == null) {
            return;
        }
        try {
            C5904g c5904g = C5904g.f15511a;
            String m12799d = C5904g.m12799d(view2);
            C5903f c5903f = C5903f.f15507a;
            String m12793b = C5903f.m12793b(view2, m12799d);
            if (m12793b == null || f15522f.m12828f(m12793b, m12799d)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("view", C5904g.m12797b(view, view2));
            jSONObject.put("screenname", this.f15527k);
            m12821c(m12793b, m12799d, jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C9768m.m32346f(view, "view");
        View.OnClickListener onClickListener = this.f15524h;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        m12823e();
    }
}
