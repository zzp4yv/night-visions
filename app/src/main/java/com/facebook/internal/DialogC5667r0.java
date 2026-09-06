package com.facebook.internal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.reviews.RateAndReviewsFragment;
import com.facebook.AccessToken;
import com.facebook.AsyncTaskC5610b0;
import com.facebook.C5608a0;
import com.facebook.C5620d0;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.common.C5614a;
import com.facebook.common.C5617d;
import com.facebook.common.C5618e;
import com.facebook.internal.DialogC5667r0;
import com.facebook.login.EnumC5773z;
import com.facebook.p174r0.p175a.C5918a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import kotlin.collections.C10768m;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: WebDialog.kt */
/* renamed from: com.facebook.internal.r0 */
/* loaded from: classes2.dex */
public class DialogC5667r0 extends Dialog {

    /* renamed from: f */
    public static final b f14506f = new b(null);

    /* renamed from: g */
    private static final int f14507g = C5618e.f14265a;

    /* renamed from: h */
    private static volatile int f14508h;

    /* renamed from: i */
    private static d f14509i;

    /* renamed from: j */
    private String f14510j;

    /* renamed from: k */
    private String f14511k;

    /* renamed from: l */
    private e f14512l;

    /* renamed from: m */
    private WebView f14513m;

    /* renamed from: n */
    private ProgressDialog f14514n;

    /* renamed from: o */
    private ImageView f14515o;

    /* renamed from: p */
    private FrameLayout f14516p;

    /* renamed from: q */
    private f f14517q;

    /* renamed from: r */
    private boolean f14518r;

    /* renamed from: s */
    private boolean f14519s;

    /* renamed from: t */
    private boolean f14520t;

    /* renamed from: u */
    private WindowManager.LayoutParams f14521u;

    /* compiled from: WebDialog.kt */
    /* renamed from: com.facebook.internal.r0$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final int m11689a() {
            C5665q0 c5665q0 = C5665q0.f14500a;
            C5665q0.m11644l();
            return DialogC5667r0.f14508h;
        }

        /* renamed from: b */
        protected final void m11690b(Context context) {
            if (context == null) {
                return;
            }
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if ((applicationInfo == null ? null : applicationInfo.metaData) != null && DialogC5667r0.f14508h == 0) {
                    m11693e(applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }

        /* renamed from: c */
        public final DialogC5667r0 m11691c(Context context, String str, Bundle bundle, int i2, e eVar) {
            C9768m.m32346f(context, "context");
            DialogC5667r0.m11667p(context);
            return new DialogC5667r0(context, str, bundle, i2, EnumC5773z.FACEBOOK, eVar, null);
        }

        /* renamed from: d */
        public final DialogC5667r0 m11692d(Context context, String str, Bundle bundle, int i2, EnumC5773z enumC5773z, e eVar) {
            C9768m.m32346f(context, "context");
            C9768m.m32346f(enumC5773z, "targetApp");
            DialogC5667r0.m11667p(context);
            return new DialogC5667r0(context, str, bundle, i2, enumC5773z, eVar, null);
        }

        /* renamed from: e */
        public final void m11693e(int i2) {
            if (i2 == 0) {
                i2 = DialogC5667r0.f14507g;
            }
            DialogC5667r0.f14508h = i2;
        }
    }

    /* compiled from: WebDialog.kt */
    /* renamed from: com.facebook.internal.r0$c */
    private final class c extends WebViewClient {

        /* renamed from: a */
        final /* synthetic */ DialogC5667r0 f14529a;

        public c(DialogC5667r0 dialogC5667r0) {
            C9768m.m32346f(dialogC5667r0, "this$0");
            this.f14529a = dialogC5667r0;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            ProgressDialog progressDialog;
            C9768m.m32346f(webView, "view");
            C9768m.m32346f(str, "url");
            super.onPageFinished(webView, str);
            if (!this.f14529a.f14519s && (progressDialog = this.f14529a.f14514n) != null) {
                progressDialog.dismiss();
            }
            FrameLayout frameLayout = this.f14529a.f14516p;
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(0);
            }
            WebView m11674o = this.f14529a.m11674o();
            if (m11674o != null) {
                m11674o.setVisibility(0);
            }
            ImageView imageView = this.f14529a.f14515o;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            this.f14529a.f14520t = true;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            ProgressDialog progressDialog;
            C9768m.m32346f(webView, "view");
            C9768m.m32346f(str, "url");
            C5663p0 c5663p0 = C5663p0.f14478a;
            C5663p0.m11575j0("FacebookSDK.WebDialog", C9768m.m32354n("Webview loading URL: ", str));
            super.onPageStarted(webView, str, bitmap);
            if (this.f14529a.f14519s || (progressDialog = this.f14529a.f14514n) == null) {
                return;
            }
            progressDialog.show();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i2, String str, String str2) {
            C9768m.m32346f(webView, "view");
            C9768m.m32346f(str, "description");
            C9768m.m32346f(str2, "failingUrl");
            super.onReceivedError(webView, i2, str, str2);
            this.f14529a.m11679y(new FacebookDialogException(str, i2, str2));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            C9768m.m32346f(webView, "view");
            C9768m.m32346f(sslErrorHandler, "handler");
            C9768m.m32346f(sslError, "error");
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            this.f14529a.m11679y(new FacebookDialogException(null, -11, null));
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
        @Override // android.webkit.WebViewClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean shouldOverrideUrlLoading(android.webkit.WebView r6, java.lang.String r7) {
            /*
                Method dump skipped, instructions count: 248
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.DialogC5667r0.c.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
        }
    }

    /* compiled from: WebDialog.kt */
    /* renamed from: com.facebook.internal.r0$d */
    public interface d {
        /* renamed from: a */
        void m11694a(WebView webView);
    }

    /* compiled from: WebDialog.kt */
    /* renamed from: com.facebook.internal.r0$e */
    public interface e {
        /* renamed from: a */
        void mo11371a(Bundle bundle, FacebookException facebookException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WebDialog.kt */
    /* renamed from: com.facebook.internal.r0$f */
    final class f extends AsyncTask<Void, Void, String[]> {

        /* renamed from: a */
        private final String f14530a;

        /* renamed from: b */
        private final Bundle f14531b;

        /* renamed from: c */
        private Exception[] f14532c;

        /* renamed from: d */
        final /* synthetic */ DialogC5667r0 f14533d;

        public f(DialogC5667r0 dialogC5667r0, String str, Bundle bundle) {
            C9768m.m32346f(dialogC5667r0, "this$0");
            C9768m.m32346f(str, "action");
            C9768m.m32346f(bundle, "parameters");
            this.f14533d = dialogC5667r0;
            this.f14530a = str;
            this.f14531b = bundle;
            this.f14532c = new Exception[0];
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static final void m11695b(String[] strArr, int i2, f fVar, CountDownLatch countDownLatch, C5620d0 c5620d0) {
            FacebookRequestError m11338b;
            String str;
            C9768m.m32346f(strArr, "$results");
            C9768m.m32346f(fVar, "this$0");
            C9768m.m32346f(countDownLatch, "$latch");
            C9768m.m32346f(c5620d0, "response");
            try {
                m11338b = c5620d0.m11338b();
                str = "Error staging photo.";
            } catch (Exception e2) {
                fVar.f14532c[i2] = e2;
            }
            if (m11338b != null) {
                String m11141c = m11338b.m11141c();
                if (m11141c != null) {
                    str = m11141c;
                }
                throw new FacebookGraphResponseException(c5620d0, str);
            }
            JSONObject m11339c = c5620d0.m11339c();
            if (m11339c == null) {
                throw new FacebookException("Error staging photo.");
            }
            String optString = m11339c.optString(DeepLinkIntentReceiver.DeepLinksKeys.URI);
            if (optString == null) {
                throw new FacebookException("Error staging photo.");
            }
            strArr[i2] = optString;
            countDownLatch.countDown();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String[] doInBackground(Void... voidArr) {
            C9768m.m32346f(voidArr, "p0");
            String[] stringArray = this.f14531b.getStringArray("media");
            if (stringArray == null) {
                return null;
            }
            final String[] strArr = new String[stringArray.length];
            this.f14532c = new Exception[stringArray.length];
            final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            AccessToken m11105e = AccessToken.f14054f.m11105e();
            final int i2 = 0;
            try {
                int length = stringArray.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i3 = i2 + 1;
                        if (isCancelled()) {
                            Iterator it = concurrentLinkedQueue.iterator();
                            while (it.hasNext()) {
                                ((AsyncTaskC5610b0) it.next()).cancel(true);
                            }
                            return null;
                        }
                        Uri parse = Uri.parse(stringArray[i2]);
                        C5663p0 c5663p0 = C5663p0.f14478a;
                        if (C5663p0.m11561c0(parse)) {
                            strArr[i2] = parse.toString();
                            countDownLatch.countDown();
                        } else {
                            GraphRequest.InterfaceC5598b interfaceC5598b = new GraphRequest.InterfaceC5598b() { // from class: com.facebook.internal.o
                                @Override // com.facebook.GraphRequest.InterfaceC5598b
                                /* renamed from: b */
                                public final void mo11196b(C5620d0 c5620d0) {
                                    DialogC5667r0.f.m11695b(strArr, i2, this, countDownLatch, c5620d0);
                                }
                            };
                            C5918a c5918a = C5918a.f15564a;
                            C9768m.m32345e(parse, DeepLinkIntentReceiver.DeepLinksKeys.URI);
                            concurrentLinkedQueue.add(C5918a.m12886a(m11105e, parse, interfaceC5598b).m11180k());
                        }
                        if (i3 > length) {
                            break;
                        }
                        i2 = i3;
                    }
                }
                countDownLatch.await();
                return strArr;
            } catch (Exception unused) {
                Iterator it2 = concurrentLinkedQueue.iterator();
                while (it2.hasNext()) {
                    ((AsyncTaskC5610b0) it2.next()).cancel(true);
                }
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String[] strArr) {
            ProgressDialog progressDialog = this.f14533d.f14514n;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            Exception[] excArr = this.f14532c;
            int i2 = 0;
            int length = excArr.length;
            while (i2 < length) {
                Exception exc = excArr[i2];
                i2++;
                if (exc != null) {
                    this.f14533d.m11679y(exc);
                    return;
                }
            }
            if (strArr == null) {
                this.f14533d.m11679y(new FacebookException("Failed to stage photos for web dialog"));
                return;
            }
            List m38702c = C10768m.m38702c(strArr);
            if (m38702c.contains(null)) {
                this.f14533d.m11679y(new FacebookException("Failed to stage photos for web dialog"));
                return;
            }
            C5663p0 c5663p0 = C5663p0.f14478a;
            C5663p0.m11587p0(this.f14531b, "media", new JSONArray((Collection) m38702c));
            C5659n0 c5659n0 = C5659n0.f14464a;
            String m11511b = C5659n0.m11511b();
            StringBuilder sb = new StringBuilder();
            C5608a0 c5608a0 = C5608a0.f14199a;
            sb.append(C5608a0.m11295n());
            sb.append("/dialog/");
            sb.append(this.f14530a);
            Uri m11564e = C5663p0.m11564e(m11511b, sb.toString(), this.f14531b);
            this.f14533d.f14510j = m11564e.toString();
            ImageView imageView = this.f14533d.f14515o;
            if (imageView == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            this.f14533d.m11651C((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
    }

    /* compiled from: WebDialog.kt */
    /* renamed from: com.facebook.internal.r0$g */
    public /* synthetic */ class g {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14534a;

        static {
            int[] iArr = new int[EnumC5773z.valuesCustom().length];
            iArr[EnumC5773z.INSTAGRAM.ordinal()] = 1;
            f14534a = iArr;
        }
    }

    /* compiled from: WebDialog.kt */
    /* renamed from: com.facebook.internal.r0$h */
    public static final class h extends WebView {
        h(Context context) {
            super(context);
        }

        @Override // android.webkit.WebView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            try {
                super.onWindowFocusChanged(z);
            } catch (NullPointerException unused) {
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    protected DialogC5667r0(Context context, String str) {
        this(context, str, f14506f.m11689a());
        C9768m.m32346f(context, "context");
        C9768m.m32346f(str, "url");
    }

    public /* synthetic */ DialogC5667r0(Context context, String str, Bundle bundle, int i2, EnumC5773z enumC5773z, e eVar, C9756g c9756g) {
        this(context, str, bundle, i2, enumC5773z, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: C */
    public final void m11651C(int i2) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f14513m = new h(getContext());
        d dVar = f14509i;
        if (dVar != null) {
            dVar.m11694a(m11674o());
        }
        WebView webView = this.f14513m;
        if (webView != null) {
            webView.setVerticalScrollBarEnabled(false);
        }
        WebView webView2 = this.f14513m;
        if (webView2 != null) {
            webView2.setHorizontalScrollBarEnabled(false);
        }
        WebView webView3 = this.f14513m;
        if (webView3 != null) {
            webView3.setWebViewClient(new c(this));
        }
        WebView webView4 = this.f14513m;
        WebSettings settings = webView4 == null ? null : webView4.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        WebView webView5 = this.f14513m;
        if (webView5 != null) {
            String str = this.f14510j;
            if (str == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            webView5.loadUrl(str);
        }
        WebView webView6 = this.f14513m;
        if (webView6 != null) {
            webView6.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        WebView webView7 = this.f14513m;
        if (webView7 != null) {
            webView7.setVisibility(4);
        }
        WebView webView8 = this.f14513m;
        WebSettings settings2 = webView8 == null ? null : webView8.getSettings();
        if (settings2 != null) {
            settings2.setSavePassword(false);
        }
        WebView webView9 = this.f14513m;
        WebSettings settings3 = webView9 != null ? webView9.getSettings() : null;
        if (settings3 != null) {
            settings3.setSaveFormData(false);
        }
        WebView webView10 = this.f14513m;
        if (webView10 != null) {
            webView10.setFocusable(true);
        }
        WebView webView11 = this.f14513m;
        if (webView11 != null) {
            webView11.setFocusableInTouchMode(true);
        }
        WebView webView12 = this.f14513m;
        if (webView12 != null) {
            webView12.setOnTouchListener(new View.OnTouchListener() { // from class: com.facebook.internal.p
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean m11652D;
                    m11652D = DialogC5667r0.m11652D(view, motionEvent);
                    return m11652D;
                }
            });
        }
        linearLayout.setPadding(i2, i2, i2, i2);
        linearLayout.addView(this.f14513m);
        linearLayout.setBackgroundColor(-872415232);
        FrameLayout frameLayout = this.f14516p;
        if (frameLayout == null) {
            return;
        }
        frameLayout.addView(linearLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public static final boolean m11652D(View view, MotionEvent motionEvent) {
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }

    /* renamed from: l */
    private final void m11664l() {
        ImageView imageView = new ImageView(getContext());
        this.f14515o = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.internal.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DialogC5667r0.m11665m(DialogC5667r0.this, view);
                }
            });
        }
        Drawable drawable = getContext().getResources().getDrawable(C5614a.f14247a);
        ImageView imageView2 = this.f14515o;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.f14515o;
        if (imageView3 == null) {
            return;
        }
        imageView3.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m11665m(DialogC5667r0 dialogC5667r0, View view) {
        C9768m.m32346f(dialogC5667r0, "this$0");
        dialogC5667r0.cancel();
    }

    /* renamed from: n */
    private final int m11666n(int i2, float f2, int i3, int i4) {
        int i5 = (int) (i2 / f2);
        double d2 = 0.5d;
        if (i5 <= i3) {
            d2 = 1.0d;
        } else if (i5 < i4) {
            double d3 = i4 - i5;
            double d4 = i4 - i3;
            Double.isNaN(d3);
            Double.isNaN(d4);
            d2 = 0.5d + ((d3 / d4) * 0.5d);
        }
        double d5 = i2;
        Double.isNaN(d5);
        return (int) (d5 * d2);
    }

    /* renamed from: p */
    protected static final void m11667p(Context context) {
        f14506f.m11690b(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final void m11671v(DialogC5667r0 dialogC5667r0, DialogInterface dialogInterface) {
        C9768m.m32346f(dialogC5667r0, "this$0");
        dialogC5667r0.cancel();
    }

    /* renamed from: A */
    protected final void m11672A(String str) {
        C9768m.m32346f(str, "expectedRedirectUrl");
        this.f14511k = str;
    }

    /* renamed from: B */
    public final void m11673B(e eVar) {
        this.f14512l = eVar;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.f14512l == null || this.f14518r) {
            return;
        }
        m11679y(new FacebookOperationCanceledException());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        ProgressDialog progressDialog;
        WebView webView = this.f14513m;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.f14519s && (progressDialog = this.f14514n) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    /* renamed from: o */
    protected final WebView m11674o() {
        return this.f14513m;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        WindowManager.LayoutParams attributes;
        this.f14519s = false;
        C5663p0 c5663p0 = C5663p0.f14478a;
        Context context = getContext();
        C9768m.m32345e(context, "context");
        if (C5663p0.m11583n0(context) && (layoutParams = this.f14521u) != null) {
            if ((layoutParams == null ? null : layoutParams.token) == null) {
                if (layoutParams != null) {
                    Activity ownerActivity = getOwnerActivity();
                    Window window = ownerActivity == null ? null : ownerActivity.getWindow();
                    layoutParams.token = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                }
                WindowManager.LayoutParams layoutParams2 = this.f14521u;
                C5663p0.m11575j0("FacebookSDK.WebDialog", C9768m.m32354n("Set token on onAttachedToWindow(): ", layoutParams2 != null ? layoutParams2.token : null));
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f14514n = progressDialog;
        if (progressDialog != null) {
            progressDialog.requestWindowFeature(1);
        }
        ProgressDialog progressDialog2 = this.f14514n;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(C5617d.f14261d));
        }
        ProgressDialog progressDialog3 = this.f14514n;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.f14514n;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.facebook.internal.n
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    DialogC5667r0.m11671v(DialogC5667r0.this, dialogInterface);
                }
            });
        }
        requestWindowFeature(1);
        this.f14516p = new FrameLayout(getContext());
        m11678x();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        m11664l();
        if (this.f14510j != null) {
            ImageView imageView = this.f14515o;
            if (imageView == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            m11651C((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        FrameLayout frameLayout = this.f14516p;
        if (frameLayout != null) {
            frameLayout.addView(this.f14515o, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.f14516p;
        if (frameLayout2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        setContentView(frameLayout2);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f14519s = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        C9768m.m32346f(keyEvent, "event");
        if (i2 == 4) {
            WebView webView = this.f14513m;
            if (webView != null) {
                if (C9768m.m32341a(webView == null ? null : Boolean.valueOf(webView.canGoBack()), Boolean.TRUE)) {
                    WebView webView2 = this.f14513m;
                    if (webView2 == null) {
                        return true;
                    }
                    webView2.goBack();
                    return true;
                }
            }
            cancel();
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        f fVar = this.f14517q;
        if (fVar != null) {
            if ((fVar == null ? null : fVar.getStatus()) == AsyncTask.Status.PENDING) {
                f fVar2 = this.f14517q;
                if (fVar2 != null) {
                    fVar2.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.f14514n;
                if (progressDialog == null) {
                    return;
                }
                progressDialog.show();
                return;
            }
        }
        m11678x();
    }

    @Override // android.app.Dialog
    protected void onStop() {
        f fVar = this.f14517q;
        if (fVar != null) {
            fVar.cancel(true);
            ProgressDialog progressDialog = this.f14514n;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        C9768m.m32346f(layoutParams, "params");
        if (layoutParams.token == null) {
            this.f14521u = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }

    /* renamed from: q */
    protected final boolean m11675q() {
        return this.f14518r;
    }

    /* renamed from: r */
    protected final boolean m11676r() {
        return this.f14520t;
    }

    /* renamed from: w */
    public Bundle mo11677w(String str) {
        Uri parse = Uri.parse(str);
        C5663p0 c5663p0 = C5663p0.f14478a;
        Bundle m11585o0 = C5663p0.m11585o0(parse.getQuery());
        m11585o0.putAll(C5663p0.m11585o0(parse.getFragment()));
        return m11585o0;
    }

    /* renamed from: x */
    public final void m11678x() {
        Object systemService = getContext().getSystemService("window");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        int i4 = i2 < i3 ? i2 : i3;
        if (i2 < i3) {
            i2 = i3;
        }
        int min = Math.min(m11666n(i4, displayMetrics.density, 480, 800), displayMetrics.widthPixels);
        int min2 = Math.min(m11666n(i2, displayMetrics.density, 800, 1280), displayMetrics.heightPixels);
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.setLayout(min, min2);
    }

    /* renamed from: y */
    protected final void m11679y(Throwable th) {
        if (this.f14512l == null || this.f14518r) {
            return;
        }
        this.f14518r = true;
        FacebookException facebookException = th instanceof FacebookException ? (FacebookException) th : new FacebookException(th);
        e eVar = this.f14512l;
        if (eVar != null) {
            eVar.mo11371a(null, facebookException);
        }
        dismiss();
    }

    /* renamed from: z */
    protected final void m11680z(Bundle bundle) {
        e eVar = this.f14512l;
        if (eVar == null || this.f14518r) {
            return;
        }
        this.f14518r = true;
        if (eVar != null) {
            eVar.mo11371a(bundle, null);
        }
        dismiss();
    }

    private DialogC5667r0(Context context, String str, int i2) {
        super(context, i2 == 0 ? f14506f.m11689a() : i2);
        this.f14511k = "fbconnect://success";
        this.f14510j = str;
    }

    private DialogC5667r0(Context context, String str, Bundle bundle, int i2, EnumC5773z enumC5773z, e eVar) {
        super(context, i2 == 0 ? f14506f.m11689a() : i2);
        Uri m11564e;
        this.f14511k = "fbconnect://success";
        bundle = bundle == null ? new Bundle() : bundle;
        C5663p0 c5663p0 = C5663p0.f14478a;
        String str2 = C5663p0.m11550U(context) ? "fbconnect://chrome_os_success" : "fbconnect://success";
        this.f14511k = str2;
        bundle.putString("redirect_uri", str2);
        bundle.putString("display", "touch");
        C5608a0 c5608a0 = C5608a0.f14199a;
        bundle.putString("client_id", C5608a0.m11285d());
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        String format = String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[]{C5608a0.m11300s()}, 1));
        C9768m.m32345e(format, "java.lang.String.format(locale, format, *args)");
        bundle.putString("sdk", format);
        this.f14512l = eVar;
        if (C9768m.m32341a(str, "share") && bundle.containsKey("media")) {
            this.f14517q = new f(this, str, bundle);
            return;
        }
        if (g.f14534a[enumC5773z.ordinal()] == 1) {
            C5659n0 c5659n0 = C5659n0.f14464a;
            m11564e = C5663p0.m11564e(C5659n0.m11520k(), "oauth/authorize", bundle);
        } else {
            C5659n0 c5659n02 = C5659n0.f14464a;
            m11564e = C5663p0.m11564e(C5659n0.m11511b(), C5608a0.m11295n() + "/dialog/" + ((Object) str), bundle);
        }
        this.f14510j = m11564e.toString();
    }

    /* compiled from: WebDialog.kt */
    /* renamed from: com.facebook.internal.r0$a */
    public static class a {

        /* renamed from: a */
        private Context f14522a;

        /* renamed from: b */
        private String f14523b;

        /* renamed from: c */
        private String f14524c;

        /* renamed from: d */
        private int f14525d;

        /* renamed from: e */
        private e f14526e;

        /* renamed from: f */
        private Bundle f14527f;

        /* renamed from: g */
        private AccessToken f14528g;

        public a(Context context, String str, Bundle bundle) {
            C9768m.m32346f(context, "context");
            C9768m.m32346f(str, "action");
            AccessToken.C5570c c5570c = AccessToken.f14054f;
            this.f14528g = c5570c.m11105e();
            if (!c5570c.m11107g()) {
                C5663p0 c5663p0 = C5663p0.f14478a;
                String m11537H = C5663p0.m11537H(context);
                if (m11537H == null) {
                    throw new FacebookException("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
                this.f14523b = m11537H;
            }
            m11681b(context, str, bundle);
        }

        /* renamed from: b */
        private final void m11681b(Context context, String str, Bundle bundle) {
            this.f14522a = context;
            this.f14524c = str;
            if (bundle != null) {
                this.f14527f = bundle;
            } else {
                this.f14527f = new Bundle();
            }
        }

        /* renamed from: a */
        public DialogC5667r0 mo11682a() {
            AccessToken accessToken = this.f14528g;
            if (accessToken != null) {
                Bundle bundle = this.f14527f;
                if (bundle != null) {
                    bundle.putString(RateAndReviewsFragment.BundleCons.APP_ID, accessToken == null ? null : accessToken.m11084c());
                }
                Bundle bundle2 = this.f14527f;
                if (bundle2 != null) {
                    AccessToken accessToken2 = this.f14528g;
                    bundle2.putString("access_token", accessToken2 != null ? accessToken2.m11093l() : null);
                }
            } else {
                Bundle bundle3 = this.f14527f;
                if (bundle3 != null) {
                    bundle3.putString(RateAndReviewsFragment.BundleCons.APP_ID, this.f14523b);
                }
            }
            b bVar = DialogC5667r0.f14506f;
            Context context = this.f14522a;
            if (context != null) {
                return bVar.m11691c(context, this.f14524c, this.f14527f, this.f14525d, this.f14526e);
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        /* renamed from: c */
        public final String m11683c() {
            return this.f14523b;
        }

        /* renamed from: d */
        public final Context m11684d() {
            return this.f14522a;
        }

        /* renamed from: e */
        public final e m11685e() {
            return this.f14526e;
        }

        /* renamed from: f */
        public final Bundle m11686f() {
            return this.f14527f;
        }

        /* renamed from: g */
        public final int m11687g() {
            return this.f14525d;
        }

        /* renamed from: h */
        public final a m11688h(e eVar) {
            this.f14526e = eVar;
            return this;
        }

        public a(Context context, String str, String str2, Bundle bundle) {
            C9768m.m32346f(context, "context");
            C9768m.m32346f(str2, "action");
            if (str == null) {
                C5663p0 c5663p0 = C5663p0.f14478a;
                str = C5663p0.m11537H(context);
            }
            C5665q0 c5665q0 = C5665q0.f14500a;
            this.f14523b = C5665q0.m11643k(str, "applicationId");
            m11681b(context, str2, bundle);
        }
    }
}
