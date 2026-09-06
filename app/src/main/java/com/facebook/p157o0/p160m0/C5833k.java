package com.facebook.p157o0.p160m0;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.p157o0.p160m0.p161n.C5836a;
import com.facebook.p157o0.p160m0.p161n.C5841f;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C9768m;

/* compiled from: RCTCodelessLoggingEventListener.kt */
/* renamed from: com.facebook.o0.m0.k */
/* loaded from: classes.dex */
public final class C5833k {

    /* renamed from: a */
    public static final C5833k f15198a = new C5833k();

    /* compiled from: RCTCodelessLoggingEventListener.kt */
    /* renamed from: com.facebook.o0.m0.k$a */
    public static final class a implements View.OnTouchListener {

        /* renamed from: f */
        private final C5836a f15199f;

        /* renamed from: g */
        private final WeakReference<View> f15200g;

        /* renamed from: h */
        private final WeakReference<View> f15201h;

        /* renamed from: i */
        private final View.OnTouchListener f15202i;

        /* renamed from: j */
        private boolean f15203j;

        public a(C5836a c5836a, View view, View view2) {
            C9768m.m32346f(c5836a, "mapping");
            C9768m.m32346f(view, "rootView");
            C9768m.m32346f(view2, "hostView");
            this.f15199f = c5836a;
            this.f15200g = new WeakReference<>(view2);
            this.f15201h = new WeakReference<>(view);
            C5841f c5841f = C5841f.f15257a;
            this.f15202i = C5841f.m12475h(view2);
            this.f15203j = true;
        }

        /* renamed from: a */
        public final boolean m12417a() {
            return this.f15203j;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            C9768m.m32346f(view, "view");
            C9768m.m32346f(motionEvent, "motionEvent");
            View view2 = this.f15201h.get();
            View view3 = this.f15200g.get();
            if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
                C5830h c5830h = C5830h.f15163a;
                C5830h.m12374d(this.f15199f, view2, view3);
            }
            View.OnTouchListener onTouchListener = this.f15202i;
            return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
        }
    }

    private C5833k() {
    }

    /* renamed from: a */
    public static final a m12416a(C5836a c5836a, View view, View view2) {
        C9768m.m32346f(c5836a, "mapping");
        C9768m.m32346f(view, "rootView");
        C9768m.m32346f(view2, "hostView");
        return new a(c5836a, view, view2);
    }
}
