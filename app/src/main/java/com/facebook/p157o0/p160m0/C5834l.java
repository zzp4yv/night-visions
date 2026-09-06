package com.facebook.p157o0.p160m0;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import cm.aptoide.p092pt.install.installer.RootCommandOnSubscribe;
import com.facebook.AccessToken;
import com.facebook.C5608a0;
import com.facebook.C5620d0;
import com.facebook.EnumC5626g0;
import com.facebook.GraphRequest;
import com.facebook.internal.C5647h0;
import com.facebook.internal.C5651j0;
import com.facebook.internal.C5663p0;
import com.facebook.p157o0.p160m0.C5834l;
import com.facebook.p157o0.p160m0.p161n.C5840e;
import com.facebook.p157o0.p160m0.p161n.C5841f;
import com.facebook.p157o0.p165q0.C5869g;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.StringCompanionObject;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ViewIndexer.kt */
/* renamed from: com.facebook.o0.m0.l */
/* loaded from: classes.dex */
public final class C5834l {

    /* renamed from: a */
    public static final a f15204a = new a(null);

    /* renamed from: b */
    private static final String f15205b;

    /* renamed from: c */
    private static C5834l f15206c;

    /* renamed from: d */
    private final Handler f15207d;

    /* renamed from: e */
    private final WeakReference<Activity> f15208e;

    /* renamed from: f */
    private Timer f15209f;

    /* renamed from: g */
    private String f15210g;

    /* compiled from: ViewIndexer.kt */
    /* renamed from: com.facebook.o0.m0.l$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static final void m12430b(C5620d0 c5620d0) {
            C9768m.m32346f(c5620d0, "it");
            C5651j0.f14429a.m11454b(EnumC5626g0.APP_EVENTS, C5834l.f15205b, "App index sent to FB!");
        }

        /* renamed from: a */
        public final GraphRequest m12432a(String str, AccessToken accessToken, String str2, String str3) {
            C9768m.m32346f(str3, "requestType");
            if (str == null) {
                return null;
            }
            GraphRequest.C5599c c5599c = GraphRequest.f14159a;
            StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
            String format = String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{str2}, 1));
            C9768m.m32345e(format, "java.lang.String.format(locale, format, *args)");
            GraphRequest m11222A = c5599c.m11222A(accessToken, format, null, null);
            Bundle m11186t = m11222A.m11186t();
            if (m11186t == null) {
                m11186t = new Bundle();
            }
            m11186t.putString("tree", str);
            C5869g c5869g = C5869g.f15370a;
            m11186t.putString("app_version", C5869g.m12627d());
            m11186t.putString("platform", "android");
            m11186t.putString("request_type", str3);
            if (C9768m.m32341a(str3, "app_indexing")) {
                C5831i c5831i = C5831i.f15174a;
                m11186t.putString("device_session_id", C5831i.m12383e());
            }
            m11222A.m11177H(m11186t);
            m11222A.m11173D(new GraphRequest.InterfaceC5598b() { // from class: com.facebook.o0.m0.f
                @Override // com.facebook.GraphRequest.InterfaceC5598b
                /* renamed from: b */
                public final void mo11196b(C5620d0 c5620d0) {
                    C5834l.a.m12430b(c5620d0);
                }
            });
            return m11222A;
        }
    }

    /* compiled from: ViewIndexer.kt */
    /* renamed from: com.facebook.o0.m0.l$b */
    private static final class b implements Callable<String> {

        /* renamed from: f */
        private final WeakReference<View> f15211f;

        public b(View view) {
            C9768m.m32346f(view, "rootView");
            this.f15211f = new WeakReference<>(view);
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            View view = this.f15211f.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            view.draw(new Canvas(createBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            C9768m.m32345e(encodeToString, "encodeToString(outputStream.toByteArray(), Base64.NO_WRAP)");
            return encodeToString;
        }
    }

    /* compiled from: ViewIndexer.kt */
    /* renamed from: com.facebook.o0.m0.l$c */
    public static final class c extends TimerTask {
        c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                Activity activity = (Activity) C5834l.this.f15208e.get();
                C5869g c5869g = C5869g.f15370a;
                View m12628e = C5869g.m12628e(activity);
                if (activity != null && m12628e != null) {
                    String simpleName = activity.getClass().getSimpleName();
                    C5831i c5831i = C5831i.f15174a;
                    if (C5831i.m12384f()) {
                        C5647h0 c5647h0 = C5647h0.f14422a;
                        if (C5647h0.m11442b()) {
                            C5840e c5840e = C5840e.f15254a;
                            C5840e.m12464a();
                            return;
                        }
                        FutureTask futureTask = new FutureTask(new b(m12628e));
                        C5834l.this.f15207d.post(futureTask);
                        String str = HttpUrl.FRAGMENT_ENCODE_SET;
                        try {
                            str = (String) futureTask.get(1L, TimeUnit.SECONDS);
                        } catch (Exception e2) {
                            Log.e(C5834l.f15205b, "Failed to take screenshot.", e2);
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("screenname", simpleName);
                            jSONObject.put("screenshot", str);
                            JSONArray jSONArray = new JSONArray();
                            C5841f c5841f = C5841f.f15257a;
                            jSONArray.put(C5841f.m12471d(m12628e));
                            jSONObject.put("view", jSONArray);
                        } catch (JSONException unused) {
                            Log.e(C5834l.f15205b, "Failed to create JSONObject");
                        }
                        String jSONObject2 = jSONObject.toString();
                        C9768m.m32345e(jSONObject2, "viewTree.toString()");
                        C5834l.this.m12425j(jSONObject2);
                    }
                }
            } catch (Exception e3) {
                Log.e(C5834l.f15205b, "UI Component tree indexing failure!", e3);
            }
        }
    }

    static {
        String canonicalName = C5834l.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        f15205b = canonicalName;
    }

    public C5834l(Activity activity) {
        C9768m.m32346f(activity, "activity");
        this.f15208e = new WeakReference<>(activity);
        this.f15210g = null;
        this.f15207d = new Handler(Looper.getMainLooper());
        f15206c = this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m12424i(C5834l c5834l, TimerTask timerTask) {
        C9768m.m32346f(c5834l, "this$0");
        C9768m.m32346f(timerTask, "$indexingTask");
        try {
            Timer timer = c5834l.f15209f;
            if (timer != null) {
                timer.cancel();
            }
            c5834l.f15210g = null;
            Timer timer2 = new Timer();
            timer2.scheduleAtFixedRate(timerTask, 0L, 1000L);
            c5834l.f15209f = timer2;
        } catch (Exception e2) {
            Log.e(f15205b, "Error scheduling indexing job", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final void m12425j(final String str) {
        C5608a0 c5608a0 = C5608a0.f14199a;
        C5608a0.m11292k().execute(new Runnable() { // from class: com.facebook.o0.m0.e
            @Override // java.lang.Runnable
            public final void run() {
                C5834l.m12426k(str, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m12426k(String str, C5834l c5834l) {
        C9768m.m32346f(str, "$tree");
        C9768m.m32346f(c5834l, "this$0");
        C5663p0 c5663p0 = C5663p0.f14478a;
        String m11581m0 = C5663p0.m11581m0(str);
        AccessToken m11105e = AccessToken.f14054f.m11105e();
        if (m11581m0 == null || !C9768m.m32341a(m11581m0, c5834l.f15210g)) {
            a aVar = f15204a;
            C5608a0 c5608a0 = C5608a0.f14199a;
            c5834l.m12427g(aVar.m12432a(str, m11105e, C5608a0.m11285d(), "app_indexing"), m11581m0);
        }
    }

    /* renamed from: g */
    public final void m12427g(GraphRequest graphRequest, String str) {
        if (graphRequest == null) {
            return;
        }
        C5620d0 m11179j = graphRequest.m11179j();
        try {
            JSONObject m11339c = m11179j.m11339c();
            if (m11339c == null) {
                Log.e(f15205b, C9768m.m32354n("Error sending UI component tree to Facebook: ", m11179j.m11338b()));
                return;
            }
            if (C9768m.m32341a("true", m11339c.optString(RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION))) {
                C5651j0.f14429a.m11454b(EnumC5626g0.APP_EVENTS, f15205b, "Successfully send UI component tree to server");
                this.f15210g = str;
            }
            if (m11339c.has("is_app_indexing_enabled")) {
                boolean z = m11339c.getBoolean("is_app_indexing_enabled");
                C5831i c5831i = C5831i.f15174a;
                C5831i.m12392n(z);
            }
        } catch (JSONException e2) {
            Log.e(f15205b, "Error decoding server response.", e2);
        }
    }

    /* renamed from: h */
    public final void m12428h() {
        final c cVar = new c();
        try {
            C5608a0 c5608a0 = C5608a0.f14199a;
            C5608a0.m11292k().execute(new Runnable() { // from class: com.facebook.o0.m0.g
                @Override // java.lang.Runnable
                public final void run() {
                    C5834l.m12424i(C5834l.this, cVar);
                }
            });
        } catch (RejectedExecutionException e2) {
            Log.e(f15205b, "Error scheduling indexing job", e2);
        }
    }

    /* renamed from: l */
    public final void m12429l() {
        if (this.f15208e.get() == null) {
            return;
        }
        try {
            Timer timer = this.f15209f;
            if (timer != null) {
                timer.cancel();
            }
            this.f15209f = null;
        } catch (Exception e2) {
            Log.e(f15205b, "Error unscheduling indexing job", e2);
        }
    }
}
