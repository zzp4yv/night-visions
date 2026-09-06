package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import io.sentry.C9484n1;
import io.sentry.C9548r5;
import io.sentry.C9553s3;
import io.sentry.C9562t5;
import io.sentry.C9624v0;
import io.sentry.EnumC9460j5;
import io.sentry.EnumC9554s4;
import io.sentry.InterfaceC9393e2;
import io.sentry.InterfaceC9560t3;
import io.sentry.InterfaceC9625v1;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.internal.gestures.C9446b;
import io.sentry.protocol.EnumC9534z;
import io.sentry.util.C9622v;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.VisibleForTesting;

/* compiled from: SentryGestureListener.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.core.internal.gestures.g */
/* loaded from: classes2.dex */
public final class GestureDetectorOnGestureListenerC9262g implements GestureDetector.OnGestureListener {

    /* renamed from: a */
    private final WeakReference<Activity> f35941a;

    /* renamed from: b */
    private final InterfaceC9625v1 f35942b;

    /* renamed from: c */
    private final SentryAndroidOptions f35943c;

    /* renamed from: d */
    private C9446b f35944d = null;

    /* renamed from: e */
    private InterfaceC9393e2 f35945e = null;

    /* renamed from: f */
    private String f35946f = null;

    /* renamed from: g */
    private final b f35947g = new b();

    /* compiled from: SentryGestureListener.java */
    /* renamed from: io.sentry.android.core.internal.gestures.g$b */
    private static final class b {

        /* renamed from: a */
        private String f35948a;

        /* renamed from: b */
        private C9446b f35949b;

        /* renamed from: c */
        private float f35950c;

        /* renamed from: d */
        private float f35951d;

        private b() {
            this.f35948a = null;
            this.f35950c = 0.0f;
            this.f35951d = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public String m30248i(MotionEvent motionEvent) {
            float x = motionEvent.getX() - this.f35950c;
            float y = motionEvent.getY() - this.f35951d;
            return Math.abs(x) > Math.abs(y) ? x > 0.0f ? "right" : "left" : y > 0.0f ? "down" : "up";
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public void m30249j() {
            this.f35949b = null;
            this.f35948a = null;
            this.f35950c = 0.0f;
            this.f35951d = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public void m30250k(C9446b c9446b) {
            this.f35949b = c9446b;
        }
    }

    public GestureDetectorOnGestureListenerC9262g(Activity activity, InterfaceC9625v1 interfaceC9625v1, SentryAndroidOptions sentryAndroidOptions) {
        this.f35941a = new WeakReference<>(activity);
        this.f35942b = interfaceC9625v1;
        this.f35943c = sentryAndroidOptions;
    }

    /* renamed from: a */
    private void m30224a(C9446b c9446b, String str, Map<String, Object> map, MotionEvent motionEvent) {
        if (this.f35943c.isEnableUserInteractionBreadcrumbs()) {
            C9484n1 c9484n1 = new C9484n1();
            c9484n1.m31079j("android:motionEvent", motionEvent);
            c9484n1.m31079j("android:view", c9446b.m30865f());
            this.f35942b.mo31153n(C9624v0.m31833r(str, c9446b.m30863d(), c9446b.m30860a(), c9446b.m30864e(), map), c9484n1);
        }
    }

    /* renamed from: d */
    private View m30225d(String str) {
        Activity activity = this.f35941a.get();
        if (activity == null) {
            this.f35943c.getLogger().mo30214c(EnumC9554s4.DEBUG, "Activity is null in " + str + ". No breadcrumb captured.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            this.f35943c.getLogger().mo30214c(EnumC9554s4.DEBUG, "Window is null in " + str + ". No breadcrumb captured.", new Object[0]);
            return null;
        }
        View decorView = window.getDecorView();
        if (decorView != null) {
            return decorView;
        }
        this.f35943c.getLogger().mo30214c(EnumC9554s4.DEBUG, "DecorView is null in " + str + ". No breadcrumb captured.", new Object[0]);
        return null;
    }

    /* renamed from: e */
    private String m30226e(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30234g(C9553s3 c9553s3, InterfaceC9393e2 interfaceC9393e2, InterfaceC9393e2 interfaceC9393e22) {
        if (interfaceC9393e22 == null) {
            c9553s3.m31613z(interfaceC9393e2);
        } else {
            this.f35943c.getLogger().mo30214c(EnumC9554s4.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", interfaceC9393e2.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30235i(C9553s3 c9553s3, InterfaceC9393e2 interfaceC9393e2) {
        if (interfaceC9393e2 == this.f35945e) {
            c9553s3.m31594e();
        }
    }

    /* renamed from: o */
    private void m30231o(C9446b c9446b, String str) {
        C9446b c9446b2 = this.f35944d;
        if (!this.f35943c.isTracingEnabled() || !this.f35943c.isEnableUserInteractionTracing()) {
            if (c9446b.equals(c9446b2) && str.equals(this.f35946f)) {
                return;
            }
            C9622v.m31827e(this.f35942b);
            this.f35944d = c9446b;
            this.f35946f = str;
            return;
        }
        Activity activity = this.f35941a.get();
        if (activity == null) {
            this.f35943c.getLogger().mo30214c(EnumC9554s4.DEBUG, "Activity is null, no transaction captured.", new Object[0]);
            return;
        }
        String m30861b = c9446b.m30861b();
        if (this.f35945e != null) {
            if (c9446b.equals(c9446b2) && str.equals(this.f35946f) && !this.f35945e.mo30516b()) {
                this.f35943c.getLogger().mo30214c(EnumC9554s4.DEBUG, "The view with id: " + m30861b + " already has an ongoing transaction assigned. Rescheduling finish", new Object[0]);
                if (this.f35943c.getIdleTimeout() != null) {
                    this.f35945e.mo30526l();
                    return;
                }
                return;
            }
            m30239p(EnumC9460j5.OK);
        }
        C9562t5 c9562t5 = new C9562t5();
        c9562t5.m31659n(true);
        c9562t5.m31656k(this.f35943c.getIdleTimeout());
        c9562t5.m30858d(true);
        final InterfaceC9393e2 mo31151l = this.f35942b.mo31151l(new C9548r5(m30226e(activity) + "." + m30861b, EnumC9534z.COMPONENT, "ui.action." + str), c9562t5);
        mo31151l.mo30527m().m30805m("auto.ui.gesture_listener." + c9446b.m30862c());
        this.f35942b.mo31154o(new InterfaceC9560t3() { // from class: io.sentry.android.core.internal.gestures.c
            @Override // io.sentry.InterfaceC9560t3
            /* renamed from: a */
            public final void mo30217a(C9553s3 c9553s3) {
                GestureDetectorOnGestureListenerC9262g.this.m30236k(mo31151l, c9553s3);
            }
        });
        this.f35945e = mo31151l;
        this.f35944d = c9446b;
        this.f35946f = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m30236k(final C9553s3 c9553s3, final InterfaceC9393e2 interfaceC9393e2) {
        c9553s3.m31589D(new C9553s3.c() { // from class: io.sentry.android.core.internal.gestures.a
            @Override // io.sentry.C9553s3.c
            /* renamed from: a */
            public final void mo30201a(InterfaceC9393e2 interfaceC9393e22) {
                GestureDetectorOnGestureListenerC9262g.this.m30234g(c9553s3, interfaceC9393e2, interfaceC9393e22);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m30237m(final C9553s3 c9553s3) {
        c9553s3.m31589D(new C9553s3.c() { // from class: io.sentry.android.core.internal.gestures.b
            @Override // io.sentry.C9553s3.c
            /* renamed from: a */
            public final void mo30201a(InterfaceC9393e2 interfaceC9393e2) {
                GestureDetectorOnGestureListenerC9262g.this.m30235i(c9553s3, interfaceC9393e2);
            }
        });
    }

    /* renamed from: n */
    public void m30238n(MotionEvent motionEvent) {
        View m30225d = m30225d("onUp");
        C9446b c9446b = this.f35947g.f35949b;
        if (m30225d == null || c9446b == null) {
            return;
        }
        if (this.f35947g.f35948a == null) {
            this.f35943c.getLogger().mo30214c(EnumC9554s4.DEBUG, "Unable to define scroll type. No breadcrumb captured.", new Object[0]);
            return;
        }
        m30224a(c9446b, this.f35947g.f35948a, Collections.singletonMap("direction", this.f35947g.m30248i(motionEvent)), motionEvent);
        m30231o(c9446b, this.f35947g.f35948a);
        this.f35947g.m30249j();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        this.f35947g.m30249j();
        this.f35947g.f35950c = motionEvent.getX();
        this.f35947g.f35951d = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        this.f35947g.f35948a = "swipe";
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        View m30225d = m30225d("onScroll");
        if (m30225d != null && motionEvent != null && this.f35947g.f35948a == null) {
            C9446b m30256a = C9265j.m30256a(this.f35943c, m30225d, motionEvent.getX(), motionEvent.getY(), C9446b.a.SCROLLABLE);
            if (m30256a == null) {
                this.f35943c.getLogger().mo30214c(EnumC9554s4.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            this.f35943c.getLogger().mo30214c(EnumC9554s4.DEBUG, "Scroll target found: " + m30256a.m30861b(), new Object[0]);
            this.f35947g.m30250k(m30256a);
            this.f35947g.f35948a = "scroll";
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        View m30225d = m30225d("onSingleTapUp");
        if (m30225d != null && motionEvent != null) {
            C9446b m30256a = C9265j.m30256a(this.f35943c, m30225d, motionEvent.getX(), motionEvent.getY(), C9446b.a.CLICKABLE);
            if (m30256a == null) {
                this.f35943c.getLogger().mo30214c(EnumC9554s4.DEBUG, "Unable to find click target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            m30224a(m30256a, "click", Collections.emptyMap(), motionEvent);
            m30231o(m30256a, "click");
        }
        return false;
    }

    /* renamed from: p */
    void m30239p(EnumC9460j5 enumC9460j5) {
        InterfaceC9393e2 interfaceC9393e2 = this.f35945e;
        if (interfaceC9393e2 != null) {
            interfaceC9393e2.mo30518d(enumC9460j5);
        }
        this.f35942b.mo31154o(new InterfaceC9560t3() { // from class: io.sentry.android.core.internal.gestures.d
            @Override // io.sentry.InterfaceC9560t3
            /* renamed from: a */
            public final void mo30217a(C9553s3 c9553s3) {
                GestureDetectorOnGestureListenerC9262g.this.m30237m(c9553s3);
            }
        });
        this.f35945e = null;
        if (this.f35944d != null) {
            this.f35944d = null;
        }
        this.f35946f = null;
    }
}
