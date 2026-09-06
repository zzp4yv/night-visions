package com.facebook.p157o0.p169u0;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.p157o0.p160m0.p161n.C5839d;
import com.facebook.p157o0.p165q0.C5869g;
import com.facebook.p157o0.p169u0.ViewOnClickListenerC5907j;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;

/* compiled from: ViewObserver.kt */
/* renamed from: com.facebook.o0.u0.i */
/* loaded from: classes2.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC5906i implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: f */
    public static final a f15517f = new a(null);

    /* renamed from: g */
    private static final Map<Integer, ViewTreeObserverOnGlobalLayoutListenerC5906i> f15518g = new HashMap();

    /* renamed from: h */
    private final WeakReference<Activity> f15519h;

    /* renamed from: i */
    private final Handler f15520i;

    /* renamed from: j */
    private final AtomicBoolean f15521j;

    /* compiled from: ViewObserver.kt */
    /* renamed from: com.facebook.o0.u0.i$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final void m12817a(Activity activity) {
            C9768m.m32346f(activity, "activity");
            int hashCode = activity.hashCode();
            Map map = ViewTreeObserverOnGlobalLayoutListenerC5906i.f15518g;
            Integer valueOf = Integer.valueOf(hashCode);
            Object obj = map.get(valueOf);
            if (obj == null) {
                obj = new ViewTreeObserverOnGlobalLayoutListenerC5906i(activity, null);
                map.put(valueOf, obj);
            }
            ((ViewTreeObserverOnGlobalLayoutListenerC5906i) obj).m12815g();
        }

        /* renamed from: b */
        public final void m12818b(Activity activity) {
            C9768m.m32346f(activity, "activity");
            ViewTreeObserverOnGlobalLayoutListenerC5906i viewTreeObserverOnGlobalLayoutListenerC5906i = (ViewTreeObserverOnGlobalLayoutListenerC5906i) ViewTreeObserverOnGlobalLayoutListenerC5906i.f15518g.remove(Integer.valueOf(activity.hashCode()));
            if (viewTreeObserverOnGlobalLayoutListenerC5906i == null) {
                return;
            }
            viewTreeObserverOnGlobalLayoutListenerC5906i.m12816h();
        }
    }

    private ViewTreeObserverOnGlobalLayoutListenerC5906i(Activity activity) {
        this.f15519h = new WeakReference<>(activity);
        this.f15520i = new Handler(Looper.getMainLooper());
        this.f15521j = new AtomicBoolean(false);
    }

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC5906i(Activity activity, C9756g c9756g) {
        this(activity);
    }

    /* renamed from: e */
    private final void m12813e() {
        Runnable runnable = new Runnable() { // from class: com.facebook.o0.u0.b
            @Override // java.lang.Runnable
            public final void run() {
                ViewTreeObserverOnGlobalLayoutListenerC5906i.m12814f(ViewTreeObserverOnGlobalLayoutListenerC5906i.this);
            }
        };
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            this.f15520i.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m12814f(ViewTreeObserverOnGlobalLayoutListenerC5906i viewTreeObserverOnGlobalLayoutListenerC5906i) {
        C9768m.m32346f(viewTreeObserverOnGlobalLayoutListenerC5906i, "this$0");
        try {
            C5869g c5869g = C5869g.f15370a;
            View m12628e = C5869g.m12628e(viewTreeObserverOnGlobalLayoutListenerC5906i.f15519h.get());
            Activity activity = viewTreeObserverOnGlobalLayoutListenerC5906i.f15519h.get();
            if (m12628e != null && activity != null) {
                C5904g c5904g = C5904g.f15511a;
                for (View view : C5904g.m12796a(m12628e)) {
                    C5839d c5839d = C5839d.f15253a;
                    if (!C5839d.m12463g(view)) {
                        C5904g c5904g2 = C5904g.f15511a;
                        String m12799d = C5904g.m12799d(view);
                        if ((m12799d.length() > 0) && m12799d.length() <= 300) {
                            ViewOnClickListenerC5907j.a aVar = ViewOnClickListenerC5907j.f15522f;
                            String localClassName = activity.getLocalClassName();
                            C9768m.m32345e(localClassName, "activity.localClassName");
                            aVar.m12831c(view, m12628e, localClassName);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public final void m12815g() {
        if (this.f15521j.getAndSet(true)) {
            return;
        }
        C5869g c5869g = C5869g.f15370a;
        View m12628e = C5869g.m12628e(this.f15519h.get());
        if (m12628e == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = m12628e.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
            m12813e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final void m12816h() {
        if (this.f15521j.getAndSet(false)) {
            C5869g c5869g = C5869g.f15370a;
            View m12628e = C5869g.m12628e(this.f15519h.get());
            if (m12628e == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = m12628e.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        m12813e();
    }
}
