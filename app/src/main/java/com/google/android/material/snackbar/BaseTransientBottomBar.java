package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0265a;
import androidx.core.view.C0280a;
import androidx.core.view.C0285c0;
import androidx.core.view.C0311u;
import androidx.core.view.InterfaceC0306p;
import androidx.core.view.p004d0.C0289c;
import cm.aptoide.p092pt.file.CacheHelper;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.C7999j;
import com.google.android.material.internal.C8000k;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.C8027b;
import com.google.android.material.theme.p178a.C8046a;
import java.util.ArrayList;
import java.util.List;
import p241e.p254e.p256b.p271c.C8875b;
import p241e.p254e.p256b.p271c.C8877d;
import p241e.p254e.p256b.p271c.C8881h;
import p241e.p254e.p256b.p271c.C8885l;
import p241e.p254e.p256b.p271c.p273m.C8886a;
import p241e.p254e.p256b.p271c.p278q.C8904a;
import p241e.p254e.p256b.p271c.p285x.C8914c;

/* loaded from: classes2.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a */
    static final Handler f30430a;

    /* renamed from: b */
    private static final boolean f30431b;

    /* renamed from: c */
    private static final int[] f30432c;

    /* renamed from: d */
    private static final String f30433d;

    /* renamed from: e */
    private final ViewGroup f30434e;

    /* renamed from: f */
    private final Context f30435f;

    /* renamed from: g */
    protected final C8023v f30436g;

    /* renamed from: h */
    private final InterfaceC8026a f30437h;

    /* renamed from: i */
    private int f30438i;

    /* renamed from: j */
    private boolean f30439j;

    /* renamed from: k */
    private View f30440k;

    /* renamed from: m */
    private Rect f30442m;

    /* renamed from: n */
    private int f30443n;

    /* renamed from: o */
    private int f30444o;

    /* renamed from: p */
    private int f30445p;

    /* renamed from: q */
    private int f30446q;

    /* renamed from: r */
    private int f30447r;

    /* renamed from: s */
    private List<AbstractC8019r<B>> f30448s;

    /* renamed from: t */
    private Behavior f30449t;

    /* renamed from: u */
    private final AccessibilityManager f30450u;

    /* renamed from: l */
    private final Runnable f30441l = new RunnableC8011j();

    /* renamed from: v */
    C8027b.b f30451v = new C8014m();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: k */
        private final C8020s f30452k = new C8020s(this);

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: P */
        public void m24754P(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f30452k.m24759c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        /* renamed from: E */
        public boolean mo23868E(View view) {
            return this.f30452k.m24757a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
        /* renamed from: k */
        public boolean mo1457k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f30452k.m24758b(coordinatorLayout, view, motionEvent);
            return super.mo1457k(coordinatorLayout, view, motionEvent);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$a */
    class C8002a extends AnimatorListenerAdapter {
        C8002a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m24740J();
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$b */
    class C8003b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f30454a;

        C8003b(int i2) {
            this.f30454a = i2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m24739I(this.f30454a);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$c */
    class C8004c implements ValueAnimator.AnimatorUpdateListener {
        C8004c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f30436g.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$d */
    class C8005d implements ValueAnimator.AnimatorUpdateListener {
        C8005d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f30436g.setScaleX(floatValue);
            BaseTransientBottomBar.this.f30436g.setScaleY(floatValue);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$e */
    class C8006e extends AnimatorListenerAdapter {
        C8006e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m24740J();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f30437h.mo24771a(70, 180);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$f */
    class C8007f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private int f30459a;

        /* renamed from: b */
        final /* synthetic */ int f30460b;

        C8007f(int i2) {
            this.f30460b = i2;
            this.f30459a = i2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f30431b) {
                C0311u.m2108U(BaseTransientBottomBar.this.f30436g, intValue - this.f30459a);
            } else {
                BaseTransientBottomBar.this.f30436g.setTranslationY(intValue);
            }
            this.f30459a = intValue;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$g */
    class C8008g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f30462a;

        C8008g(int i2) {
            this.f30462a = i2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m24739I(this.f30462a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f30437h.mo24772b(0, 180);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$h */
    class C8009h implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private int f30464a = 0;

        C8009h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f30431b) {
                C0311u.m2108U(BaseTransientBottomBar.this.f30436g, intValue - this.f30464a);
            } else {
                BaseTransientBottomBar.this.f30436g.setTranslationY(intValue);
            }
            this.f30464a = intValue;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$i */
    static class C8010i implements Handler.Callback {
        C8010i() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                ((BaseTransientBottomBar) message.obj).m24745Q();
                return true;
            }
            if (i2 != 1) {
                return false;
            }
            ((BaseTransientBottomBar) message.obj).m24737F(message.arg1);
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$j */
    class RunnableC8011j implements Runnable {
        RunnableC8011j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int m24704A;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f30436g == null || baseTransientBottomBar.f30435f == null || (m24704A = (BaseTransientBottomBar.this.m24704A() - BaseTransientBottomBar.this.m24706D()) + ((int) BaseTransientBottomBar.this.f30436g.getTranslationY())) >= BaseTransientBottomBar.this.f30446q) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f30436g.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(BaseTransientBottomBar.f30433d, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f30446q - m24704A;
            BaseTransientBottomBar.this.f30436g.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$k */
    class C8012k implements InterfaceC0306p {
        C8012k() {
        }

        @Override // androidx.core.view.InterfaceC0306p
        /* renamed from: a */
        public C0285c0 mo363a(View view, C0285c0 c0285c0) {
            BaseTransientBottomBar.this.f30443n = c0285c0.m1881h();
            BaseTransientBottomBar.this.f30444o = c0285c0.m1882i();
            BaseTransientBottomBar.this.f30445p = c0285c0.m1883j();
            BaseTransientBottomBar.this.m24715W();
            return c0285c0;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$l */
    class C8013l extends C0280a {
        C8013l() {
        }

        @Override // androidx.core.view.C0280a
        /* renamed from: g */
        public void mo1858g(View view, C0289c c0289c) {
            super.mo1858g(view, c0289c);
            c0289c.m1972a(CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES);
            c0289c.m1978d0(true);
        }

        @Override // androidx.core.view.C0280a
        /* renamed from: j */
        public boolean mo1861j(View view, int i2, Bundle bundle) {
            if (i2 != 1048576) {
                return super.mo1861j(view, i2, bundle);
            }
            BaseTransientBottomBar.this.mo24748t();
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$m */
    class C8014m implements C8027b.b {
        C8014m() {
        }

        @Override // com.google.android.material.snackbar.C8027b.b
        /* renamed from: a */
        public void mo24755a(int i2) {
            Handler handler = BaseTransientBottomBar.f30430a;
            handler.sendMessage(handler.obtainMessage(1, i2, 0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.C8027b.b
        public void show() {
            Handler handler = BaseTransientBottomBar.f30430a;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$n */
    class C8015n implements InterfaceC8021t {

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$n$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                BaseTransientBottomBar.this.m24739I(3);
            }
        }

        C8015n() {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.InterfaceC8021t
        public void onViewAttachedToWindow(View view) {
            WindowInsets rootWindowInsets;
            if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = BaseTransientBottomBar.this.f30436g.getRootWindowInsets()) == null) {
                return;
            }
            BaseTransientBottomBar.this.f30446q = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            BaseTransientBottomBar.this.m24715W();
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.InterfaceC8021t
        public void onViewDetachedFromWindow(View view) {
            if (BaseTransientBottomBar.this.m24738G()) {
                BaseTransientBottomBar.f30430a.post(new a());
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$o */
    class C8016o implements InterfaceC8022u {
        C8016o() {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.InterfaceC8022u
        /* renamed from: a */
        public void mo24756a(View view, int i2, int i3, int i4, int i5) {
            BaseTransientBottomBar.this.f30436g.setOnLayoutChangeListener(null);
            BaseTransientBottomBar.this.m24710R();
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$p */
    class C8017p implements SwipeDismissBehavior.InterfaceC7910c {
        C8017p() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.InterfaceC7910c
        /* renamed from: a */
        public void mo23874a(View view) {
            view.setVisibility(8);
            BaseTransientBottomBar.this.m24749u(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.InterfaceC7910c
        /* renamed from: b */
        public void mo23875b(int i2) {
            if (i2 == 0) {
                C8027b.m24775c().m24786k(BaseTransientBottomBar.this.f30451v);
            } else if (i2 == 1 || i2 == 2) {
                C8027b.m24775c().m24785j(BaseTransientBottomBar.this.f30451v);
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$q */
    class RunnableC8018q implements Runnable {
        RunnableC8018q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C8023v c8023v = BaseTransientBottomBar.this.f30436g;
            if (c8023v == null) {
                return;
            }
            c8023v.setVisibility(0);
            if (BaseTransientBottomBar.this.f30436g.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.m24711S();
            } else {
                BaseTransientBottomBar.this.m24713U();
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$r */
    public static abstract class AbstractC8019r<B> {
        public static final int DISMISS_EVENT_ACTION = 1;
        public static final int DISMISS_EVENT_CONSECUTIVE = 4;
        public static final int DISMISS_EVENT_MANUAL = 3;
        public static final int DISMISS_EVENT_SWIPE = 0;
        public static final int DISMISS_EVENT_TIMEOUT = 2;

        public void onDismissed(B b2, int i2) {
        }

        public void onShown(B b2) {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$s */
    public static class C8020s {

        /* renamed from: a */
        private C8027b.b f30475a;

        public C8020s(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.m23871L(0.1f);
            swipeDismissBehavior.m23869J(0.6f);
            swipeDismissBehavior.m23872M(0);
        }

        /* renamed from: a */
        public boolean m24757a(View view) {
            return view instanceof C8023v;
        }

        /* renamed from: b */
        public void m24758b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.m1419B(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    C8027b.m24775c().m24785j(this.f30475a);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                C8027b.m24775c().m24786k(this.f30475a);
            }
        }

        /* renamed from: c */
        public void m24759c(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f30475a = baseTransientBottomBar.f30451v;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$t */
    protected interface InterfaceC8021t {
        void onViewAttachedToWindow(View view);

        void onViewDetachedFromWindow(View view);
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$u */
    protected interface InterfaceC8022u {
        /* renamed from: a */
        void mo24756a(View view, int i2, int i3, int i4, int i5);
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$v */
    protected static class C8023v extends FrameLayout {

        /* renamed from: f */
        private static final View.OnTouchListener f30476f = new a();

        /* renamed from: g */
        private InterfaceC8022u f30477g;

        /* renamed from: h */
        private InterfaceC8021t f30478h;

        /* renamed from: i */
        private int f30479i;

        /* renamed from: j */
        private final float f30480j;

        /* renamed from: k */
        private final float f30481k;

        /* renamed from: l */
        private ColorStateList f30482l;

        /* renamed from: m */
        private PorterDuff.Mode f30483m;

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$v$a */
        static class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected C8023v(Context context, AttributeSet attributeSet) {
            super(C8046a.m24906c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C8885l.f34242h4);
            if (obtainStyledAttributes.hasValue(C8885l.f34291o4)) {
                C0311u.m2147q0(this, obtainStyledAttributes.getDimensionPixelSize(r1, 0));
            }
            this.f30479i = obtainStyledAttributes.getInt(C8885l.f34263k4, 0);
            this.f30480j = obtainStyledAttributes.getFloat(C8885l.f34270l4, 1.0f);
            setBackgroundTintList(C8914c.m28499a(context2, obtainStyledAttributes, C8885l.f34277m4));
            setBackgroundTintMode(C8000k.m24700e(obtainStyledAttributes.getInt(C8885l.f34284n4, -1), PorterDuff.Mode.SRC_IN));
            this.f30481k = obtainStyledAttributes.getFloat(C8885l.f34256j4, 1.0f);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f30476f);
            setFocusable(true);
            if (getBackground() == null) {
                C0311u.m2139m0(this, m24760a());
            }
        }

        /* renamed from: a */
        private Drawable m24760a() {
            float dimension = getResources().getDimension(C8877d.f33861O);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(C8904a.m28476g(this, C8875b.f33825o, C8875b.f33822l, getBackgroundOverlayColorAlpha()));
            if (this.f30482l == null) {
                return C0265a.m1821r(gradientDrawable);
            }
            Drawable m1821r = C0265a.m1821r(gradientDrawable);
            C0265a.m1818o(m1821r, this.f30482l);
            return m1821r;
        }

        float getActionTextColorAlpha() {
            return this.f30481k;
        }

        int getAnimationMode() {
            return this.f30479i;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f30480j;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            InterfaceC8021t interfaceC8021t = this.f30478h;
            if (interfaceC8021t != null) {
                interfaceC8021t.onViewAttachedToWindow(this);
            }
            C0311u.m2125f0(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            InterfaceC8021t interfaceC8021t = this.f30478h;
            if (interfaceC8021t != null) {
                interfaceC8021t.onViewDetachedFromWindow(this);
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
            super.onLayout(z, i2, i3, i4, i5);
            InterfaceC8022u interfaceC8022u = this.f30477g;
            if (interfaceC8022u != null) {
                interfaceC8022u.mo24756a(this, i2, i3, i4, i5);
            }
        }

        void setAnimationMode(int i2) {
            this.f30479i = i2;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f30482l != null) {
                drawable = C0265a.m1821r(drawable.mutate());
                C0265a.m1818o(drawable, this.f30482l);
                C0265a.m1819p(drawable, this.f30483m);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f30482l = colorStateList;
            if (getBackground() != null) {
                Drawable m1821r = C0265a.m1821r(getBackground().mutate());
                C0265a.m1818o(m1821r, colorStateList);
                C0265a.m1819p(m1821r, this.f30483m);
                if (m1821r != getBackground()) {
                    super.setBackgroundDrawable(m1821r);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f30483m = mode;
            if (getBackground() != null) {
                Drawable m1821r = C0265a.m1821r(getBackground().mutate());
                C0265a.m1819p(m1821r, mode);
                if (m1821r != getBackground()) {
                    super.setBackgroundDrawable(m1821r);
                }
            }
        }

        void setOnAttachStateChangeListener(InterfaceC8021t interfaceC8021t) {
            this.f30478h = interfaceC8021t;
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f30476f);
            super.setOnClickListener(onClickListener);
        }

        void setOnLayoutChangeListener(InterfaceC8022u interfaceC8022u) {
            this.f30477g = interfaceC8022u;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        f30431b = i2 >= 16 && i2 <= 19;
        f30432c = new int[]{C8875b.f33800A};
        f30433d = BaseTransientBottomBar.class.getSimpleName();
        f30430a = new Handler(Looper.getMainLooper(), new C8010i());
    }

    protected BaseTransientBottomBar(ViewGroup viewGroup, View view, InterfaceC8026a interfaceC8026a) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (interfaceC8026a == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f30434e = viewGroup;
        this.f30437h = interfaceC8026a;
        Context context = viewGroup.getContext();
        this.f30435f = context;
        C7999j.m24687a(context);
        C8023v c8023v = (C8023v) LayoutInflater.from(context).inflate(m24735B(), viewGroup, false);
        this.f30436g = c8023v;
        if (view instanceof SnackbarContentLayout) {
            ((SnackbarContentLayout) view).m24773c(c8023v.getActionTextColorAlpha());
        }
        c8023v.addView(view);
        ViewGroup.LayoutParams layoutParams = c8023v.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.f30442m = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
        C0311u.m2135k0(c8023v, 1);
        C0311u.m2153t0(c8023v, 1);
        C0311u.m2149r0(c8023v, true);
        C0311u.m2157v0(c8023v, new C8012k());
        C0311u.m2131i0(c8023v, new C8013l());
        this.f30450u = (AccessibilityManager) context.getSystemService("accessibility");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public int m24704A() {
        WindowManager windowManager = (WindowManager) this.f30435f.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* renamed from: C */
    private int m24705C() {
        int height = this.f30436g.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f30436g.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public int m24706D() {
        int[] iArr = new int[2];
        this.f30436g.getLocationOnScreen(iArr);
        return iArr[1] + this.f30436g.getHeight();
    }

    /* renamed from: H */
    private boolean m24707H() {
        ViewGroup.LayoutParams layoutParams = this.f30436g.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.C0229f) && (((CoordinatorLayout.C0229f) layoutParams).m1481f() instanceof SwipeDismissBehavior);
    }

    /* renamed from: M */
    private void m24708M(CoordinatorLayout.C0229f c0229f) {
        SwipeDismissBehavior<? extends View> swipeDismissBehavior = this.f30449t;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = m24752y();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).m24754P(this);
        }
        swipeDismissBehavior.m23870K(new C8017p());
        c0229f.m1489o(swipeDismissBehavior);
        if (this.f30440k == null) {
            c0229f.f2009g = 80;
        }
    }

    /* renamed from: O */
    private boolean m24709O() {
        return this.f30446q > 0 && !this.f30439j && m24707H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public void m24710R() {
        if (m24743N()) {
            m24747q();
        } else {
            this.f30436g.setVisibility(0);
            m24740J();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public void m24711S() {
        ValueAnimator m24733v = m24733v(0.0f, 1.0f);
        ValueAnimator m24734z = m24734z(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(m24733v, m24734z);
        animatorSet.setDuration(150L);
        animatorSet.addListener(new C8002a());
        animatorSet.start();
    }

    /* renamed from: T */
    private void m24712T(int i2) {
        ValueAnimator m24733v = m24733v(1.0f, 0.0f);
        m24733v.setDuration(75L);
        m24733v.addListener(new C8003b(i2));
        m24733v.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public void m24713U() {
        int m24705C = m24705C();
        if (f30431b) {
            C0311u.m2108U(this.f30436g, m24705C);
        } else {
            this.f30436g.setTranslationY(m24705C);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(m24705C, 0);
        valueAnimator.setInterpolator(C8886a.f34371b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new C8006e());
        valueAnimator.addUpdateListener(new C8007f(m24705C));
        valueAnimator.start();
    }

    /* renamed from: V */
    private void m24714V(int i2) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, m24705C());
        valueAnimator.setInterpolator(C8886a.f34371b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new C8008g(i2));
        valueAnimator.addUpdateListener(new C8009h());
        valueAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public void m24715W() {
        Rect rect;
        ViewGroup.LayoutParams layoutParams = this.f30436g.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (rect = this.f30442m) == null) {
            Log.w(f30433d, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = rect.bottom + (this.f30440k != null ? this.f30447r : this.f30443n);
        marginLayoutParams.leftMargin = rect.left + this.f30444o;
        marginLayoutParams.rightMargin = rect.right + this.f30445p;
        this.f30436g.requestLayout();
        if (Build.VERSION.SDK_INT < 29 || !m24709O()) {
            return;
        }
        this.f30436g.removeCallbacks(this.f30441l);
        this.f30436g.post(this.f30441l);
    }

    /* renamed from: r */
    private void m24731r(int i2) {
        if (this.f30436g.getAnimationMode() == 1) {
            m24712T(i2);
        } else {
            m24714V(i2);
        }
    }

    /* renamed from: s */
    private int m24732s() {
        View view = this.f30440k;
        if (view == null) {
            return 0;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i2 = iArr[1];
        int[] iArr2 = new int[2];
        this.f30434e.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f30434e.getHeight()) - i2;
    }

    /* renamed from: v */
    private ValueAnimator m24733v(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C8886a.f34370a);
        ofFloat.addUpdateListener(new C8004c());
        return ofFloat;
    }

    /* renamed from: z */
    private ValueAnimator m24734z(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C8886a.f34373d);
        ofFloat.addUpdateListener(new C8005d());
        return ofFloat;
    }

    /* renamed from: B */
    protected int m24735B() {
        return m24736E() ? C8881h.f33952n : C8881h.f33941c;
    }

    /* renamed from: E */
    protected boolean m24736E() {
        TypedArray obtainStyledAttributes = this.f30435f.obtainStyledAttributes(f30432c);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    /* renamed from: F */
    final void m24737F(int i2) {
        if (m24743N() && this.f30436g.getVisibility() == 0) {
            m24731r(i2);
        } else {
            m24739I(i2);
        }
    }

    /* renamed from: G */
    public boolean m24738G() {
        return C8027b.m24775c().m24782e(this.f30451v);
    }

    /* renamed from: I */
    void m24739I(int i2) {
        C8027b.m24775c().m24783h(this.f30451v);
        List<AbstractC8019r<B>> list = this.f30448s;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f30448s.get(size).onDismissed(this, i2);
            }
        }
        ViewParent parent = this.f30436g.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f30436g);
        }
    }

    /* renamed from: J */
    void m24740J() {
        C8027b.m24775c().m24784i(this.f30451v);
        List<AbstractC8019r<B>> list = this.f30448s;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f30448s.get(size).onShown(this);
            }
        }
    }

    /* renamed from: K */
    public B m24741K(AbstractC8019r<B> abstractC8019r) {
        List<AbstractC8019r<B>> list;
        if (abstractC8019r == null || (list = this.f30448s) == null) {
            return this;
        }
        list.remove(abstractC8019r);
        return this;
    }

    /* renamed from: L */
    public B m24742L(int i2) {
        this.f30438i = i2;
        return this;
    }

    /* renamed from: N */
    boolean m24743N() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.f30450u.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    /* renamed from: P */
    public void mo24744P() {
        C8027b.m24775c().m24787m(mo24751x(), this.f30451v);
    }

    /* renamed from: Q */
    final void m24745Q() {
        this.f30436g.setOnAttachStateChangeListener(new C8015n());
        if (this.f30436g.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f30436g.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0229f) {
                m24708M((CoordinatorLayout.C0229f) layoutParams);
            }
            this.f30447r = m24732s();
            m24715W();
            this.f30436g.setVisibility(4);
            this.f30434e.addView(this.f30436g);
        }
        if (C0311u.m2102O(this.f30436g)) {
            m24710R();
        } else {
            this.f30436g.setOnLayoutChangeListener(new C8016o());
        }
    }

    /* renamed from: p */
    public B m24746p(AbstractC8019r<B> abstractC8019r) {
        if (abstractC8019r == null) {
            return this;
        }
        if (this.f30448s == null) {
            this.f30448s = new ArrayList();
        }
        this.f30448s.add(abstractC8019r);
        return this;
    }

    /* renamed from: q */
    void m24747q() {
        this.f30436g.post(new RunnableC8018q());
    }

    /* renamed from: t */
    public void mo24748t() {
        m24749u(3);
    }

    /* renamed from: u */
    protected void m24749u(int i2) {
        C8027b.m24775c().m24780b(this.f30451v, i2);
    }

    /* renamed from: w */
    public Context m24750w() {
        return this.f30435f;
    }

    /* renamed from: x */
    public int mo24751x() {
        return this.f30438i;
    }

    /* renamed from: y */
    protected SwipeDismissBehavior<? extends View> m24752y() {
        return new Behavior();
    }
}
