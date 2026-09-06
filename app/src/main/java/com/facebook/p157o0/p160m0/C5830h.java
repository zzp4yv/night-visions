package com.facebook.p157o0.p160m0;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.facebook.C5608a0;
import com.facebook.p157o0.C5780a0;
import com.facebook.p157o0.p160m0.p161n.C5836a;
import com.facebook.p157o0.p160m0.p161n.C5841f;
import com.facebook.p157o0.p165q0.C5869g;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C9768m;

/* compiled from: CodelessLoggingEventListener.kt */
/* renamed from: com.facebook.o0.m0.h */
/* loaded from: classes.dex */
public final class C5830h {

    /* renamed from: a */
    public static final C5830h f15163a = new C5830h();

    /* compiled from: CodelessLoggingEventListener.kt */
    /* renamed from: com.facebook.o0.m0.h$a */
    public static final class a implements View.OnClickListener {

        /* renamed from: f */
        private C5836a f15164f;

        /* renamed from: g */
        private WeakReference<View> f15165g;

        /* renamed from: h */
        private WeakReference<View> f15166h;

        /* renamed from: i */
        private View.OnClickListener f15167i;

        /* renamed from: j */
        private boolean f15168j;

        public a(C5836a c5836a, View view, View view2) {
            C9768m.m32346f(c5836a, "mapping");
            C9768m.m32346f(view, "rootView");
            C9768m.m32346f(view2, "hostView");
            this.f15164f = c5836a;
            this.f15165g = new WeakReference<>(view2);
            this.f15166h = new WeakReference<>(view);
            C5841f c5841f = C5841f.f15257a;
            this.f15167i = C5841f.m12474g(view2);
            this.f15168j = true;
        }

        /* renamed from: a */
        public final boolean m12377a() {
            return this.f15168j;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C9768m.m32346f(view, "view");
            View.OnClickListener onClickListener = this.f15167i;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            View view2 = this.f15166h.get();
            View view3 = this.f15165g.get();
            if (view2 == null || view3 == null) {
                return;
            }
            C5830h c5830h = C5830h.f15163a;
            C5830h.m12374d(this.f15164f, view2, view3);
        }
    }

    /* compiled from: CodelessLoggingEventListener.kt */
    /* renamed from: com.facebook.o0.m0.h$b */
    public static final class b implements AdapterView.OnItemClickListener {

        /* renamed from: f */
        private C5836a f15169f;

        /* renamed from: g */
        private WeakReference<AdapterView<?>> f15170g;

        /* renamed from: h */
        private WeakReference<View> f15171h;

        /* renamed from: i */
        private AdapterView.OnItemClickListener f15172i;

        /* renamed from: j */
        private boolean f15173j;

        public b(C5836a c5836a, View view, AdapterView<?> adapterView) {
            C9768m.m32346f(c5836a, "mapping");
            C9768m.m32346f(view, "rootView");
            C9768m.m32346f(adapterView, "hostView");
            this.f15169f = c5836a;
            this.f15170g = new WeakReference<>(adapterView);
            this.f15171h = new WeakReference<>(view);
            this.f15172i = adapterView.getOnItemClickListener();
            this.f15173j = true;
        }

        /* renamed from: a */
        public final boolean m12378a() {
            return this.f15173j;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            C9768m.m32346f(view, "view");
            AdapterView.OnItemClickListener onItemClickListener = this.f15172i;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i2, j2);
            }
            View view2 = this.f15171h.get();
            AdapterView<?> adapterView2 = this.f15170g.get();
            if (view2 == null || adapterView2 == null) {
                return;
            }
            C5830h c5830h = C5830h.f15163a;
            C5830h.m12374d(this.f15169f, view2, adapterView2);
        }
    }

    private C5830h() {
    }

    /* renamed from: a */
    public static final a m12371a(C5836a c5836a, View view, View view2) {
        C9768m.m32346f(c5836a, "mapping");
        C9768m.m32346f(view, "rootView");
        C9768m.m32346f(view2, "hostView");
        return new a(c5836a, view, view2);
    }

    /* renamed from: b */
    public static final b m12372b(C5836a c5836a, View view, AdapterView<?> adapterView) {
        C9768m.m32346f(c5836a, "mapping");
        C9768m.m32346f(view, "rootView");
        C9768m.m32346f(adapterView, "hostView");
        return new b(c5836a, view, adapterView);
    }

    /* renamed from: d */
    public static final void m12374d(C5836a c5836a, View view, View view2) {
        C9768m.m32346f(c5836a, "mapping");
        C9768m.m32346f(view, "rootView");
        C9768m.m32346f(view2, "hostView");
        final String m12436b = c5836a.m12436b();
        final Bundle m12404b = C5832j.f15182a.m12404b(c5836a, view, view2);
        f15163a.m12376f(m12404b);
        C5608a0 c5608a0 = C5608a0.f14199a;
        C5608a0.m11292k().execute(new Runnable() { // from class: com.facebook.o0.m0.a
            @Override // java.lang.Runnable
            public final void run() {
                C5830h.m12375e(m12436b, m12404b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m12375e(String str, Bundle bundle) {
        C9768m.m32346f(str, "$eventName");
        C9768m.m32346f(bundle, "$parameters");
        C5608a0 c5608a0 = C5608a0.f14199a;
        C5780a0.f14908a.m12173g(C5608a0.m11284c()).m12166d(str, bundle);
    }

    /* renamed from: f */
    public final void m12376f(Bundle bundle) {
        C9768m.m32346f(bundle, "parameters");
        String string = bundle.getString("_valueToSum");
        if (string != null) {
            C5869g c5869g = C5869g.f15370a;
            bundle.putDouble("_valueToSum", C5869g.m12630g(string));
        }
        bundle.putString("_is_fb_codeless", "1");
    }
}
