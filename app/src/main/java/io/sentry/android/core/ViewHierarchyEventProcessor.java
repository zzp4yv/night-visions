package io.sentry.android.core;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import io.sentry.C9438i2;
import io.sentry.C9456j1;
import io.sentry.C9473l4;
import io.sentry.C9484n1;
import io.sentry.C9550s0;
import io.sentry.EnumC9554s4;
import io.sentry.InterfaceC9457j2;
import io.sentry.InterfaceC9463k1;
import io.sentry.InterfaceC9637w1;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.gestures.C9265j;
import io.sentry.android.core.internal.util.C9277g;
import io.sentry.android.core.internal.util.C9280j;
import io.sentry.android.core.internal.util.C9284n;
import io.sentry.internal.viewhierarchy.InterfaceC9453a;
import io.sentry.protocol.C9509b0;
import io.sentry.protocol.C9511c0;
import io.sentry.protocol.C9532x;
import io.sentry.util.C9609m;
import io.sentry.util.C9613q;
import io.sentry.util.thread.InterfaceC9618b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class ViewHierarchyEventProcessor implements InterfaceC9463k1, InterfaceC9457j2 {

    /* renamed from: f */
    private final SentryAndroidOptions f35852f;

    /* renamed from: g */
    private final C9284n f35853g = new C9284n(C9277g.m30272b(), 2000, 3);

    public ViewHierarchyEventProcessor(SentryAndroidOptions sentryAndroidOptions) {
        this.f35852f = (SentryAndroidOptions) C9613q.m31802c(sentryAndroidOptions, "SentryAndroidOptions is required");
        if (sentryAndroidOptions.isAttachViewHierarchy()) {
            mo30003a();
        }
    }

    /* renamed from: f */
    private static void m30142f(View view, C9511c0 c9511c0, List<InterfaceC9453a> list) {
        if (view instanceof ViewGroup) {
            Iterator<InterfaceC9453a> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().m30874a(c9511c0, view)) {
                    return;
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            if (childCount == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(childCount);
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt != null) {
                    C9511c0 m30146j = m30146j(childAt);
                    arrayList.add(m30146j);
                    m30142f(childAt, m30146j, list);
                }
            }
            c9511c0.m31256m(arrayList);
        }
    }

    /* renamed from: g */
    static /* synthetic */ void m30143g(AtomicReference atomicReference, View view, List list, CountDownLatch countDownLatch, InterfaceC9637w1 interfaceC9637w1) {
        try {
            atomicReference.set(m30145i(view, list));
            countDownLatch.countDown();
        } catch (Throwable th) {
            interfaceC9637w1.mo30213b(EnumC9554s4.ERROR, "Failed to process view hierarchy.", th);
        }
    }

    /* renamed from: h */
    public static C9509b0 m30144h(Activity activity, final List<InterfaceC9453a> list, InterfaceC9618b interfaceC9618b, final InterfaceC9637w1 interfaceC9637w1) {
        if (activity == null) {
            interfaceC9637w1.mo30214c(EnumC9554s4.INFO, "Missing activity for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            interfaceC9637w1.mo30214c(EnumC9554s4.INFO, "Missing window for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        final View peekDecorView = window.peekDecorView();
        if (peekDecorView == null) {
            interfaceC9637w1.mo30214c(EnumC9554s4.INFO, "Missing decor view for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        try {
        } catch (Throwable th) {
            interfaceC9637w1.mo30213b(EnumC9554s4.ERROR, "Failed to process view hierarchy.", th);
        }
        if (interfaceC9618b.mo30277d()) {
            return m30145i(peekDecorView, list);
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicReference atomicReference = new AtomicReference(null);
        activity.runOnUiThread(new Runnable() { // from class: io.sentry.android.core.d0
            @Override // java.lang.Runnable
            public final void run() {
                ViewHierarchyEventProcessor.m30143g(atomicReference, peekDecorView, list, countDownLatch, interfaceC9637w1);
            }
        });
        if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
            return (C9509b0) atomicReference.get();
        }
        return null;
    }

    /* renamed from: i */
    public static C9509b0 m30145i(View view, List<InterfaceC9453a> list) {
        ArrayList arrayList = new ArrayList(1);
        C9509b0 c9509b0 = new C9509b0("android_view_system", arrayList);
        C9511c0 m30146j = m30146j(view);
        arrayList.add(m30146j);
        m30142f(view, m30146j, list);
        return c9509b0;
    }

    /* renamed from: j */
    private static C9511c0 m30146j(View view) {
        C9511c0 c9511c0 = new C9511c0();
        c9511c0.m31259p(C9280j.m30279a(view));
        try {
            c9511c0.m31258o(C9265j.m30257b(view));
        } catch (Throwable unused) {
        }
        c9511c0.m31263t(Double.valueOf(view.getX()));
        c9511c0.m31264u(Double.valueOf(view.getY()));
        c9511c0.m31262s(Double.valueOf(view.getWidth()));
        c9511c0.m31257n(Double.valueOf(view.getHeight()));
        c9511c0.m31255l(Double.valueOf(view.getAlpha()));
        int visibility = view.getVisibility();
        if (visibility == 0) {
            c9511c0.m31261r("visible");
        } else if (visibility == 4) {
            c9511c0.m31261r("invisible");
        } else if (visibility == 8) {
            c9511c0.m31261r("gone");
        }
        return c9511c0;
    }

    @Override // io.sentry.InterfaceC9457j2
    /* renamed from: a */
    public /* synthetic */ void mo30003a() {
        C9438i2.m30845a(this);
    }

    @Override // io.sentry.InterfaceC9463k1
    /* renamed from: b */
    public C9473l4 mo30135b(C9473l4 c9473l4, C9484n1 c9484n1) {
        if (!c9473l4.m31008w0()) {
            return c9473l4;
        }
        if (!this.f35852f.isAttachViewHierarchy()) {
            this.f35852f.getLogger().mo30214c(EnumC9554s4.DEBUG, "attachViewHierarchy is disabled.", new Object[0]);
            return c9473l4;
        }
        if (C9609m.m31782e(c9484n1)) {
            return c9473l4;
        }
        boolean m30291a = this.f35853g.m30291a();
        SentryAndroidOptions.InterfaceC9225a beforeViewHierarchyCaptureCallback = this.f35852f.getBeforeViewHierarchyCaptureCallback();
        if (beforeViewHierarchyCaptureCallback != null) {
            if (!beforeViewHierarchyCaptureCallback.m30138a(c9473l4, c9484n1, m30291a)) {
                return c9473l4;
            }
        } else if (m30291a) {
            return c9473l4;
        }
        C9509b0 m30144h = m30144h(C9315u0.m30427c().m30429b(), this.f35852f.getViewHierarchyExporters(), this.f35852f.getMainThreadChecker(), this.f35852f.getLogger());
        if (m30144h != null) {
            c9484n1.m31082m(C9550s0.m31574c(m30144h));
        }
        return c9473l4;
    }

    @Override // io.sentry.InterfaceC9457j2
    /* renamed from: d */
    public /* synthetic */ String mo30004d() {
        return C9438i2.m30846b(this);
    }

    @Override // io.sentry.InterfaceC9463k1
    /* renamed from: e */
    public /* synthetic */ C9532x mo30136e(C9532x c9532x, C9484n1 c9484n1) {
        return C9456j1.m30876a(this, c9532x, c9484n1);
    }
}
