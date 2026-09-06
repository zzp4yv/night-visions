package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0265a;
import androidx.core.view.C0285c0;
import androidx.core.view.C0311u;
import androidx.core.view.InterfaceC0300j;
import androidx.core.view.InterfaceC0306p;
import androidx.core.view.p004d0.C0289c;
import androidx.core.view.p004d0.InterfaceC0292f;
import androidx.customview.view.AbsSavedState;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p024c.p025a.p026k.p027a.C0833a;
import p024c.p052i.p056g.C0937a;
import p024c.p052i.p059j.C0954d;
import p241e.p254e.p256b.p271c.C8875b;
import p241e.p254e.p256b.p271c.C8877d;
import p241e.p254e.p256b.p271c.C8880g;
import p241e.p254e.p256b.p271c.C8884k;
import p241e.p254e.p256b.p271c.C8885l;
import p241e.p254e.p256b.p271c.p272a0.C8867g;
import p241e.p254e.p256b.p271c.p272a0.C8868h;
import p241e.p254e.p256b.p271c.p273m.C8886a;

/* loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.InterfaceC0225b {

    /* renamed from: f */
    private static final int f29577f = C8884k.f33982g;

    /* renamed from: g */
    private int f29578g;

    /* renamed from: h */
    private int f29579h;

    /* renamed from: i */
    private int f29580i;

    /* renamed from: j */
    private int f29581j;

    /* renamed from: k */
    private boolean f29582k;

    /* renamed from: l */
    private int f29583l;

    /* renamed from: m */
    private C0285c0 f29584m;

    /* renamed from: n */
    private List<InterfaceC7893c> f29585n;

    /* renamed from: o */
    private boolean f29586o;

    /* renamed from: p */
    private boolean f29587p;

    /* renamed from: q */
    private boolean f29588q;

    /* renamed from: r */
    private boolean f29589r;

    /* renamed from: s */
    private int f29590s;

    /* renamed from: t */
    private WeakReference<View> f29591t;

    /* renamed from: u */
    private ValueAnimator f29592u;

    /* renamed from: v */
    private int[] f29593v;

    /* renamed from: w */
    private Drawable f29594w;

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // com.google.android.material.appbar.C7902c
        /* renamed from: E */
        public /* bridge */ /* synthetic */ int mo23760E() {
            return super.mo23760E();
        }

        @Override // com.google.android.material.appbar.C7902c
        /* renamed from: G */
        public /* bridge */ /* synthetic */ boolean mo23761G(int i2) {
            return super.mo23761G(i2);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: g0 */
        public /* bridge */ /* synthetic */ boolean mo1458l(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i2) {
            return super.mo1458l(coordinatorLayout, appBarLayout, i2);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: h0 */
        public /* bridge */ /* synthetic */ boolean mo1459m(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i2, int i3, int i4, int i5) {
            return super.mo1459m(coordinatorLayout, appBarLayout, i2, i3, i4, i5);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: i0 */
        public /* bridge */ /* synthetic */ void mo1463q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2, int i3, int[] iArr, int i4) {
            super.mo1463q(coordinatorLayout, appBarLayout, view, i2, i3, iArr, i4);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: j0 */
        public /* bridge */ /* synthetic */ void mo1466t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
            super.mo1466t(coordinatorLayout, appBarLayout, view, i2, i3, i4, i5, i6, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: k0 */
        public /* bridge */ /* synthetic */ void mo1470x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.mo1470x(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: l0 */
        public /* bridge */ /* synthetic */ Parcelable mo1471y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.mo1471y(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: m0 */
        public /* bridge */ /* synthetic */ boolean mo1443A(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i2, int i3) {
            return super.mo1443A(coordinatorLayout, appBarLayout, view, view2, i2, i3);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: n0 */
        public /* bridge */ /* synthetic */ void mo1445C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2) {
            super.mo1445C(coordinatorLayout, appBarLayout, view, i2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends AbstractC7901b {
        public ScrollingViewBehavior() {
        }

        /* renamed from: R */
        private static int m23762R(AppBarLayout appBarLayout) {
            CoordinatorLayout.AbstractC0226c m1481f = ((CoordinatorLayout.C0229f) appBarLayout.getLayoutParams()).m1481f();
            if (m1481f instanceof BaseBehavior) {
                return ((BaseBehavior) m1481f).mo23741M();
            }
            return 0;
        }

        /* renamed from: S */
        private void m23763S(View view, View view2) {
            CoordinatorLayout.AbstractC0226c m1481f = ((CoordinatorLayout.C0229f) view2.getLayoutParams()).m1481f();
            if (m1481f instanceof BaseBehavior) {
                C0311u.m2108U(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) m1481f).f29595k) + m23796M()) - m23794I(view2));
            }
        }

        /* renamed from: T */
        private void m23764T(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.m23714l()) {
                    appBarLayout.m23721u(appBarLayout.m23722w(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.AbstractC7901b
        /* renamed from: J */
        float mo23766J(View view) {
            int i2;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int m23762R = m23762R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + m23762R > downNestedPreScrollRange) && (i2 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (m23762R / i2) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.AbstractC7901b
        /* renamed from: L */
        int mo23767L(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.mo23767L(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC7901b
        /* renamed from: Q, reason: merged with bridge method [inline-methods] */
        public AppBarLayout mo23765H(List<View> list) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = list.get(i2);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
        /* renamed from: e */
        public boolean mo1451e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
        /* renamed from: h */
        public boolean mo1454h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            m23763S(view, view2);
            m23764T(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
        /* renamed from: i */
        public void mo1455i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                C0311u.m2119c0(coordinatorLayout, C0289c.a.f2360m.m2013b());
                C0311u.m2119c0(coordinatorLayout, C0289c.a.f2361n.m2013b());
            }
        }

        @Override // com.google.android.material.appbar.C7902c, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
        /* renamed from: l */
        public /* bridge */ /* synthetic */ boolean mo1458l(CoordinatorLayout coordinatorLayout, View view, int i2) {
            return super.mo1458l(coordinatorLayout, view, i2);
        }

        @Override // com.google.android.material.appbar.AbstractC7901b, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
        /* renamed from: m */
        public /* bridge */ /* synthetic */ boolean mo1459m(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int i5) {
            return super.mo1459m(coordinatorLayout, view, i2, i3, i4, i5);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
        /* renamed from: w */
        public boolean mo1469w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout mo23765H = mo23765H(coordinatorLayout.m1434r(view));
            if (mo23765H != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f29662d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    mo23765H.m23720r(false, !z);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8885l.f34116Q3);
            m23797O(obtainStyledAttributes.getDimensionPixelSize(C8885l.f34123R3, 0));
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    class C7891a implements InterfaceC0306p {
        C7891a() {
        }

        @Override // androidx.core.view.InterfaceC0306p
        /* renamed from: a */
        public C0285c0 mo363a(View view, C0285c0 c0285c0) {
            return AppBarLayout.this.m23716n(c0285c0);
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$b */
    class C7892b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C8867g f29618a;

        C7892b(C8867g c8867g) {
            this.f29618a = c8867g;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f29618a.m28283W(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$c */
    public interface InterfaceC7893c<T extends AppBarLayout> {
        void onOffsetChanged(T t, int i2);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$e */
    public interface InterfaceC7895e extends InterfaceC7893c<AppBarLayout> {
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C8875b.f33811a);
    }

    /* renamed from: c */
    private void m23697c() {
        WeakReference<View> weakReference = this.f29591t;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f29591t = null;
    }

    /* renamed from: d */
    private View m23698d(View view) {
        int i2;
        if (this.f29591t == null && (i2 = this.f29590s) != -1) {
            View findViewById = view != null ? view.findViewById(i2) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.f29590s);
            }
            if (findViewById != null) {
                this.f29591t = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.f29591t;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: i */
    private boolean m23699i() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (((C7894d) getChildAt(i2).getLayoutParams()).m23771c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    private void m23700k() {
        this.f29579h = -1;
        this.f29580i = -1;
        this.f29581j = -1;
    }

    /* renamed from: s */
    private void m23701s(boolean z, boolean z2, boolean z3) {
        this.f29583l = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    /* renamed from: t */
    private boolean m23702t(boolean z) {
        if (this.f29587p == z) {
            return false;
        }
        this.f29587p = z;
        refreshDrawableState();
        return true;
    }

    /* renamed from: v */
    private boolean m23703v() {
        return this.f29594w != null && getTopInset() > 0;
    }

    /* renamed from: x */
    private boolean m23704x() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return (childAt.getVisibility() == 8 || C0311u.m2156v(childAt)) ? false : true;
    }

    /* renamed from: y */
    private void m23705y(C8867g c8867g, boolean z) {
        float dimension = getResources().getDimension(C8877d.f33866a);
        float f2 = z ? 0.0f : dimension;
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f29592u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, dimension);
        this.f29592u = ofFloat;
        ofFloat.setDuration(getResources().getInteger(C8880g.f33937a));
        this.f29592u.setInterpolator(C8886a.f34370a);
        this.f29592u.addUpdateListener(new C7892b(c8867g));
        this.f29592u.start();
    }

    /* renamed from: z */
    private void m23706z() {
        setWillNotDraw(!m23703v());
    }

    /* renamed from: a */
    public void m23707a(InterfaceC7893c interfaceC7893c) {
        if (this.f29585n == null) {
            this.f29585n = new ArrayList();
        }
        if (interfaceC7893c == null || this.f29585n.contains(interfaceC7893c)) {
            return;
        }
        this.f29585n.add(interfaceC7893c);
    }

    /* renamed from: b */
    public void m23708b(InterfaceC7895e interfaceC7895e) {
        m23707a(interfaceC7895e);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C7894d;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (m23703v()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f29578g);
            this.f29594w.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f29594w;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C7894d generateDefaultLayoutParams() {
        return new C7894d(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C7894d generateLayoutParams(AttributeSet attributeSet) {
        return new C7894d(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C7894d generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (Build.VERSION.SDK_INT < 19 || !(layoutParams instanceof LinearLayout.LayoutParams)) ? layoutParams instanceof ViewGroup.MarginLayoutParams ? new C7894d((ViewGroup.MarginLayoutParams) layoutParams) : new C7894d(layoutParams) : new C7894d((LinearLayout.LayoutParams) layoutParams);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0225b
    public CoordinatorLayout.AbstractC0226c<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    int getDownNestedPreScrollRange() {
        int i2;
        int m2164z;
        int i3 = this.f29580i;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C7894d c7894d = (C7894d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = c7894d.f29620a;
            if ((i5 & 5) != 5) {
                if (i4 > 0) {
                    break;
                }
            } else {
                int i6 = ((LinearLayout.LayoutParams) c7894d).topMargin + ((LinearLayout.LayoutParams) c7894d).bottomMargin;
                if ((i5 & 8) != 0) {
                    m2164z = C0311u.m2164z(childAt);
                } else if ((i5 & 2) != 0) {
                    m2164z = measuredHeight - C0311u.m2164z(childAt);
                } else {
                    i2 = i6 + measuredHeight;
                    if (childCount == 0 && C0311u.m2156v(childAt)) {
                        i2 = Math.min(i2, measuredHeight - getTopInset());
                    }
                    i4 += i2;
                }
                i2 = i6 + m2164z;
                if (childCount == 0) {
                    i2 = Math.min(i2, measuredHeight - getTopInset());
                }
                i4 += i2;
            }
        }
        int max = Math.max(0, i4);
        this.f29580i = max;
        return max;
    }

    int getDownNestedScrollRange() {
        int i2 = this.f29581j;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            C7894d c7894d = (C7894d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) c7894d).topMargin + ((LinearLayout.LayoutParams) c7894d).bottomMargin;
            int i5 = c7894d.f29620a;
            if ((i5 & 1) == 0) {
                break;
            }
            i4 += measuredHeight;
            if ((i5 & 2) != 0) {
                i4 -= C0311u.m2164z(childAt);
                break;
            }
            i3++;
        }
        int max = Math.max(0, i4);
        this.f29581j = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f29590s;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int m2164z = C0311u.m2164z(this);
        if (m2164z == 0) {
            int childCount = getChildCount();
            m2164z = childCount >= 1 ? C0311u.m2164z(getChildAt(childCount - 1)) : 0;
            if (m2164z == 0) {
                return getHeight() / 3;
            }
        }
        return (m2164z * 2) + topInset;
    }

    int getPendingAction() {
        return this.f29583l;
    }

    public Drawable getStatusBarForeground() {
        return this.f29594w;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        C0285c0 c0285c0 = this.f29584m;
        if (c0285c0 != null) {
            return c0285c0.m1884k();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i2 = this.f29579h;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            C7894d c7894d = (C7894d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = c7894d.f29620a;
            if ((i5 & 1) == 0) {
                break;
            }
            i4 += measuredHeight + ((LinearLayout.LayoutParams) c7894d).topMargin + ((LinearLayout.LayoutParams) c7894d).bottomMargin;
            if (i3 == 0 && C0311u.m2156v(childAt)) {
                i4 -= getTopInset();
            }
            if ((i5 & 2) != 0) {
                i4 -= C0311u.m2164z(childAt);
                break;
            }
            i3++;
        }
        int max = Math.max(0, i4);
        this.f29579h = max;
        return max;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* renamed from: h */
    boolean m23712h() {
        return this.f29582k;
    }

    /* renamed from: j */
    boolean m23713j() {
        return getTotalScrollRange() != 0;
    }

    /* renamed from: l */
    public boolean m23714l() {
        return this.f29589r;
    }

    /* renamed from: m */
    void m23715m(int i2) {
        this.f29578g = i2;
        if (!willNotDraw()) {
            C0311u.m2113Z(this);
        }
        List<InterfaceC7893c> list = this.f29585n;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                InterfaceC7893c interfaceC7893c = this.f29585n.get(i3);
                if (interfaceC7893c != null) {
                    interfaceC7893c.onOffsetChanged(this, i2);
                }
            }
        }
    }

    /* renamed from: n */
    C0285c0 m23716n(C0285c0 c0285c0) {
        C0285c0 c0285c02 = C0311u.m2156v(this) ? c0285c0 : null;
        if (!C0954d.m6056a(this.f29584m, c0285c02)) {
            this.f29584m = c0285c02;
            m23706z();
            requestLayout();
        }
        return c0285c0;
    }

    /* renamed from: o */
    public void m23717o(InterfaceC7893c interfaceC7893c) {
        List<InterfaceC7893c> list = this.f29585n;
        if (list == null || interfaceC7893c == null) {
            return;
        }
        list.remove(interfaceC7893c);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C8868h.m28311e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i2) {
        if (this.f29593v == null) {
            this.f29593v = new int[4];
        }
        int[] iArr = this.f29593v;
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + iArr.length);
        boolean z = this.f29587p;
        int i3 = C8875b.f33805F;
        if (!z) {
            i3 = -i3;
        }
        iArr[0] = i3;
        iArr[1] = (z && this.f29588q) ? C8875b.f33806G : -C8875b.f33806G;
        int i4 = C8875b.f33803D;
        if (!z) {
            i4 = -i4;
        }
        iArr[2] = i4;
        iArr[3] = (z && this.f29588q) ? C8875b.f33802C : -C8875b.f33802C;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m23697c();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        boolean z2 = true;
        if (C0311u.m2156v(this) && m23704x()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                C0311u.m2108U(getChildAt(childCount), topInset);
            }
        }
        m23700k();
        this.f29582k = false;
        int childCount2 = getChildCount();
        int i6 = 0;
        while (true) {
            if (i6 >= childCount2) {
                break;
            }
            if (((C7894d) getChildAt(i6).getLayoutParams()).m23770b() != null) {
                this.f29582k = true;
                break;
            }
            i6++;
        }
        Drawable drawable = this.f29594w;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f29586o) {
            return;
        }
        if (!this.f29589r && !m23699i()) {
            z2 = false;
        }
        m23702t(z2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i3);
        if (mode != 1073741824 && C0311u.m2156v(this) && m23704x()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = C0937a.m5966b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i3));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        m23700k();
    }

    /* renamed from: p */
    public void m23718p(InterfaceC7895e interfaceC7895e) {
        m23717o(interfaceC7895e);
    }

    /* renamed from: q */
    void m23719q() {
        this.f29583l = 0;
    }

    /* renamed from: r */
    public void m23720r(boolean z, boolean z2) {
        m23701s(z, z2, true);
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        C8868h.m28310d(this, f2);
    }

    public void setExpanded(boolean z) {
        m23720r(z, C0311u.m2102O(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.f29589r = z;
    }

    public void setLiftOnScrollTargetViewId(int i2) {
        this.f29590s = i2;
        m23697c();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i2) {
        if (i2 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i2);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f29594w;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f29594w = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f29594w.setState(getDrawableState());
                }
                C0265a.m1816m(this.f29594w, C0311u.m2162y(this));
                this.f29594w.setVisible(getVisibility() == 0, false);
                this.f29594w.setCallback(this);
            }
            m23706z();
            C0311u.m2113Z(this);
        }
    }

    public void setStatusBarForegroundColor(int i2) {
        setStatusBarForeground(new ColorDrawable(i2));
    }

    public void setStatusBarForegroundResource(int i2) {
        setStatusBarForeground(C0833a.m5262d(getContext(), i2));
    }

    @Deprecated
    public void setTargetElevation(float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            C7904e.m23806b(this, f2);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.f29594w;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* renamed from: u */
    boolean m23721u(boolean z) {
        if (this.f29588q == z) {
            return false;
        }
        this.f29588q = z;
        refreshDrawableState();
        if (!this.f29589r || !(getBackground() instanceof C8867g)) {
            return true;
        }
        m23705y((C8867g) getBackground(), z);
        return true;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f29594w;
    }

    /* renamed from: w */
    boolean m23722w(View view) {
        View m23698d = m23698d(view);
        if (m23698d != null) {
            view = m23698d;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    protected static class BaseBehavior<T extends AppBarLayout> extends AbstractC7900a<T> {

        /* renamed from: k */
        private int f29595k;

        /* renamed from: l */
        private int f29596l;

        /* renamed from: m */
        private ValueAnimator f29597m;

        /* renamed from: n */
        private int f29598n;

        /* renamed from: o */
        private boolean f29599o;

        /* renamed from: p */
        private float f29600p;

        /* renamed from: q */
        private WeakReference<View> f29601q;

        /* renamed from: r */
        private AbstractC7890d f29602r;

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        class C7887a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f29606a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f29607b;

            C7887a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f29606a = coordinatorLayout;
                this.f29607b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.m23791P(this.f29606a, this.f29607b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b */
        class C7888b implements InterfaceC0292f {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f29609a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f29610b;

            /* renamed from: c */
            final /* synthetic */ View f29611c;

            /* renamed from: d */
            final /* synthetic */ int f29612d;

            C7888b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2) {
                this.f29609a = coordinatorLayout;
                this.f29610b = appBarLayout;
                this.f29611c = view;
                this.f29612d = i2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.core.view.p004d0.InterfaceC0292f
            /* renamed from: a */
            public boolean mo2032a(View view, InterfaceC0292f.a aVar) {
                BaseBehavior.this.mo1463q(this.f29609a, this.f29610b, this.f29611c, 0, this.f29612d, new int[]{0, 0}, 1);
                return true;
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$c */
        class C7889c implements InterfaceC0292f {

            /* renamed from: a */
            final /* synthetic */ AppBarLayout f29614a;

            /* renamed from: b */
            final /* synthetic */ boolean f29615b;

            C7889c(AppBarLayout appBarLayout, boolean z) {
                this.f29614a = appBarLayout;
                this.f29615b = z;
            }

            @Override // androidx.core.view.p004d0.InterfaceC0292f
            /* renamed from: a */
            public boolean mo2032a(View view, InterfaceC0292f.a aVar) {
                this.f29614a.setExpanded(this.f29615b);
                return true;
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$d */
        public static abstract class AbstractC7890d<T extends AppBarLayout> {
        }

        public BaseBehavior() {
            this.f29598n = -1;
        }

        /* renamed from: S */
        private void m23724S(CoordinatorLayout coordinatorLayout, T t, View view) {
            if (mo23741M() != (-t.getTotalScrollRange()) && view.canScrollVertically(1)) {
                m23725T(coordinatorLayout, t, C0289c.a.f2360m, false);
            }
            if (mo23741M() != 0) {
                if (!view.canScrollVertically(-1)) {
                    m23725T(coordinatorLayout, t, C0289c.a.f2361n, true);
                    return;
                }
                int i2 = -t.getDownNestedPreScrollRange();
                if (i2 != 0) {
                    C0311u.m2123e0(coordinatorLayout, C0289c.a.f2361n, null, new C7888b(coordinatorLayout, t, view, i2));
                }
            }
        }

        /* renamed from: T */
        private void m23725T(CoordinatorLayout coordinatorLayout, T t, C0289c.a aVar, boolean z) {
            C0311u.m2123e0(coordinatorLayout, aVar, null, new C7889c(t, z));
        }

        /* renamed from: U */
        private void m23726U(CoordinatorLayout coordinatorLayout, T t, int i2, float f2) {
            int abs = Math.abs(mo23741M() - i2);
            float abs2 = Math.abs(f2);
            m23727V(coordinatorLayout, t, i2, abs2 > 0.0f ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / t.getHeight()) + 1.0f) * 150.0f));
        }

        /* renamed from: V */
        private void m23727V(CoordinatorLayout coordinatorLayout, T t, int i2, int i3) {
            int mo23741M = mo23741M();
            if (mo23741M == i2) {
                ValueAnimator valueAnimator = this.f29597m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f29597m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f29597m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f29597m = valueAnimator3;
                valueAnimator3.setInterpolator(C8886a.f34374e);
                this.f29597m.addUpdateListener(new C7887a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f29597m.setDuration(Math.min(i3, 600));
            this.f29597m.setIntValues(mo23741M, i2);
            this.f29597m.start();
        }

        /* renamed from: X */
        private boolean m23728X(CoordinatorLayout coordinatorLayout, T t, View view) {
            return t.m23713j() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        /* renamed from: Y */
        private static boolean m23729Y(int i2, int i3) {
            return (i2 & i3) == i3;
        }

        /* renamed from: Z */
        private View m23730Z(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if ((childAt instanceof InterfaceC0300j) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: a0 */
        private static View m23731a0(AppBarLayout appBarLayout, int i2) {
            int abs = Math.abs(i2);
            int childCount = appBarLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = appBarLayout.getChildAt(i3);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: b0 */
        private int m23732b0(T t, int i2) {
            int childCount = t.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = t.getChildAt(i3);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C7894d c7894d = (C7894d) childAt.getLayoutParams();
                if (m23729Y(c7894d.m23769a(), 32)) {
                    top -= ((LinearLayout.LayoutParams) c7894d).topMargin;
                    bottom += ((LinearLayout.LayoutParams) c7894d).bottomMargin;
                }
                int i4 = -i2;
                if (top <= i4 && bottom >= i4) {
                    return i3;
                }
            }
            return -1;
        }

        /* renamed from: e0 */
        private int m23733e0(T t, int i2) {
            int abs = Math.abs(i2);
            int childCount = t.getChildCount();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i4);
                C7894d c7894d = (C7894d) childAt.getLayoutParams();
                Interpolator m23770b = c7894d.m23770b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i4++;
                } else if (m23770b != null) {
                    int m23769a = c7894d.m23769a();
                    if ((m23769a & 1) != 0) {
                        i3 = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) c7894d).topMargin + ((LinearLayout.LayoutParams) c7894d).bottomMargin;
                        if ((m23769a & 2) != 0) {
                            i3 -= C0311u.m2164z(childAt);
                        }
                    }
                    if (C0311u.m2156v(childAt)) {
                        i3 -= t.getTopInset();
                    }
                    if (i3 > 0) {
                        float f2 = i3;
                        return Integer.signum(i2) * (childAt.getTop() + Math.round(f2 * m23770b.getInterpolation((abs - childAt.getTop()) / f2)));
                    }
                }
            }
            return i2;
        }

        /* renamed from: p0 */
        private boolean m23734p0(CoordinatorLayout coordinatorLayout, T t) {
            List<View> m1435s = coordinatorLayout.m1435s(t);
            int size = m1435s.size();
            for (int i2 = 0; i2 < size; i2++) {
                CoordinatorLayout.AbstractC0226c m1481f = ((CoordinatorLayout.C0229f) m1435s.get(i2).getLayoutParams()).m1481f();
                if (m1481f instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) m1481f).m23795K() != 0;
                }
            }
            return false;
        }

        /* renamed from: q0 */
        private void m23735q0(CoordinatorLayout coordinatorLayout, T t) {
            int mo23741M = mo23741M();
            int m23732b0 = m23732b0(t, mo23741M);
            if (m23732b0 >= 0) {
                View childAt = t.getChildAt(m23732b0);
                C7894d c7894d = (C7894d) childAt.getLayoutParams();
                int m23769a = c7894d.m23769a();
                if ((m23769a & 17) == 17) {
                    int i2 = -childAt.getTop();
                    int i3 = -childAt.getBottom();
                    if (m23732b0 == t.getChildCount() - 1) {
                        i3 += t.getTopInset();
                    }
                    if (m23729Y(m23769a, 2)) {
                        i3 += C0311u.m2164z(childAt);
                    } else if (m23729Y(m23769a, 5)) {
                        int m2164z = C0311u.m2164z(childAt) + i3;
                        if (mo23741M < m2164z) {
                            i2 = m2164z;
                        } else {
                            i3 = m2164z;
                        }
                    }
                    if (m23729Y(m23769a, 32)) {
                        i2 += ((LinearLayout.LayoutParams) c7894d).topMargin;
                        i3 -= ((LinearLayout.LayoutParams) c7894d).bottomMargin;
                    }
                    if (mo23741M < (i3 + i2) / 2) {
                        i2 = i3;
                    }
                    m23726U(coordinatorLayout, t, C0937a.m5966b(i2, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* renamed from: r0 */
        private void m23736r0(CoordinatorLayout coordinatorLayout, T t) {
            C0311u.m2119c0(coordinatorLayout, C0289c.a.f2360m.m2013b());
            C0311u.m2119c0(coordinatorLayout, C0289c.a.f2361n.m2013b());
            View m23730Z = m23730Z(coordinatorLayout);
            if (m23730Z == null || t.getTotalScrollRange() == 0 || !(((CoordinatorLayout.C0229f) m23730Z.getLayoutParams()).m1481f() instanceof ScrollingViewBehavior)) {
                return;
            }
            m23724S(coordinatorLayout, t, m23730Z);
        }

        /* renamed from: s0 */
        private void m23737s0(CoordinatorLayout coordinatorLayout, T t, int i2, int i3, boolean z) {
            View m23731a0 = m23731a0(t, i2);
            if (m23731a0 != null) {
                int m23769a = ((C7894d) m23731a0.getLayoutParams()).m23769a();
                boolean z2 = false;
                if ((m23769a & 1) != 0) {
                    int m2164z = C0311u.m2164z(m23731a0);
                    if (i3 <= 0 || (m23769a & 12) == 0 ? !((m23769a & 2) == 0 || (-i2) < (m23731a0.getBottom() - m2164z) - t.getTopInset()) : (-i2) >= (m23731a0.getBottom() - m2164z) - t.getTopInset()) {
                        z2 = true;
                    }
                }
                if (t.m23714l()) {
                    z2 = t.m23722w(m23730Z(coordinatorLayout));
                }
                boolean m23721u = t.m23721u(z2);
                if (z || (m23721u && m23734p0(coordinatorLayout, t))) {
                    t.jumpDrawablesToCurrentState();
                }
            }
        }

        @Override // com.google.android.material.appbar.AbstractC7900a
        /* renamed from: M */
        int mo23741M() {
            return mo23760E() + this.f29595k;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC7900a
        /* renamed from: W, reason: merged with bridge method [inline-methods] */
        public boolean mo23738H(T t) {
            if (this.f29602r != null) {
                throw null;
            }
            WeakReference<View> weakReference = this.f29601q;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC7900a
        /* renamed from: c0, reason: merged with bridge method [inline-methods] */
        public int mo23739K(T t) {
            return -t.getDownNestedScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC7900a
        /* renamed from: d0, reason: merged with bridge method [inline-methods] */
        public int mo23740L(T t) {
            return t.getTotalScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC7900a
        /* renamed from: f0, reason: merged with bridge method [inline-methods] */
        public void mo23742N(CoordinatorLayout coordinatorLayout, T t) {
            m23735q0(coordinatorLayout, t);
            if (t.m23714l()) {
                t.m23721u(t.m23722w(m23730Z(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.C7902c, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
        /* renamed from: g0, reason: merged with bridge method [inline-methods] */
        public boolean mo1458l(CoordinatorLayout coordinatorLayout, T t, int i2) {
            boolean mo1458l = super.mo1458l(coordinatorLayout, t, i2);
            int pendingAction = t.getPendingAction();
            int i3 = this.f29598n;
            if (i3 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i3);
                m23791P(coordinatorLayout, t, (-childAt.getBottom()) + (this.f29599o ? C0311u.m2164z(childAt) + t.getTopInset() : Math.round(childAt.getHeight() * this.f29600p)));
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i4 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        m23726U(coordinatorLayout, t, i4, 0.0f);
                    } else {
                        m23791P(coordinatorLayout, t, i4);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m23726U(coordinatorLayout, t, 0, 0.0f);
                    } else {
                        m23791P(coordinatorLayout, t, 0);
                    }
                }
            }
            t.m23719q();
            this.f29598n = -1;
            mo23761G(C0937a.m5966b(mo23760E(), -t.getTotalScrollRange(), 0));
            m23737s0(coordinatorLayout, t, mo23760E(), 0, true);
            t.m23715m(mo23760E());
            m23736r0(coordinatorLayout, t);
            return mo1458l;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
        /* renamed from: h0, reason: merged with bridge method [inline-methods] */
        public boolean mo1459m(CoordinatorLayout coordinatorLayout, T t, int i2, int i3, int i4, int i5) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0229f) t.getLayoutParams())).height != -2) {
                return super.mo1459m(coordinatorLayout, t, i2, i3, i4, i5);
            }
            coordinatorLayout.m1423J(t, i2, i3, View.MeasureSpec.makeMeasureSpec(0, 0), i5);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
        /* renamed from: i0, reason: merged with bridge method [inline-methods] */
        public void mo1463q(CoordinatorLayout coordinatorLayout, T t, View view, int i2, int i3, int[] iArr, int i4) {
            int i5;
            int i6;
            if (i3 != 0) {
                if (i3 < 0) {
                    int i7 = -t.getTotalScrollRange();
                    i5 = i7;
                    i6 = t.getDownNestedPreScrollRange() + i7;
                } else {
                    i5 = -t.getUpNestedPreScrollRange();
                    i6 = 0;
                }
                if (i5 != i6) {
                    iArr[1] = m23790O(coordinatorLayout, t, i3, i5, i6);
                }
            }
            if (t.m23714l()) {
                t.m23721u(t.m23722w(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
        /* renamed from: j0, reason: merged with bridge method [inline-methods] */
        public void mo1466t(CoordinatorLayout coordinatorLayout, T t, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
            if (i5 < 0) {
                iArr[1] = m23790O(coordinatorLayout, t, i5, -t.getDownNestedScrollRange(), 0);
            }
            if (i5 == 0) {
                m23736r0(coordinatorLayout, t);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
        /* renamed from: k0, reason: merged with bridge method [inline-methods] */
        public void mo1470x(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (!(parcelable instanceof SavedState)) {
                super.mo1470x(coordinatorLayout, t, parcelable);
                this.f29598n = -1;
                return;
            }
            SavedState savedState = (SavedState) parcelable;
            super.mo1470x(coordinatorLayout, t, savedState.m2342a());
            this.f29598n = savedState.f29603h;
            this.f29600p = savedState.f29604i;
            this.f29599o = savedState.f29605j;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
        /* renamed from: l0, reason: merged with bridge method [inline-methods] */
        public Parcelable mo1471y(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable mo1471y = super.mo1471y(coordinatorLayout, t);
            int mo23760E = mo23760E();
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int bottom = childAt.getBottom() + mo23760E;
                if (childAt.getTop() + mo23760E <= 0 && bottom >= 0) {
                    SavedState savedState = new SavedState(mo1471y);
                    savedState.f29603h = i2;
                    savedState.f29605j = bottom == C0311u.m2164z(childAt) + t.getTopInset();
                    savedState.f29604i = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return mo1471y;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
        /* renamed from: m0, reason: merged with bridge method [inline-methods] */
        public boolean mo1443A(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i2, int i3) {
            ValueAnimator valueAnimator;
            boolean z = (i2 & 2) != 0 && (t.m23714l() || m23728X(coordinatorLayout, t, view));
            if (z && (valueAnimator = this.f29597m) != null) {
                valueAnimator.cancel();
            }
            this.f29601q = null;
            this.f29596l = i3;
            return z;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
        /* renamed from: n0, reason: merged with bridge method [inline-methods] */
        public void mo1445C(CoordinatorLayout coordinatorLayout, T t, View view, int i2) {
            if (this.f29596l == 0 || i2 == 1) {
                m23735q0(coordinatorLayout, t);
                if (t.m23714l()) {
                    t.m23721u(t.m23722w(view));
                }
            }
            this.f29601q = new WeakReference<>(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC7900a
        /* renamed from: o0, reason: merged with bridge method [inline-methods] */
        public int mo23743Q(CoordinatorLayout coordinatorLayout, T t, int i2, int i3, int i4) {
            int mo23741M = mo23741M();
            int i5 = 0;
            if (i3 == 0 || mo23741M < i3 || mo23741M > i4) {
                this.f29595k = 0;
            } else {
                int m5966b = C0937a.m5966b(i2, i3, i4);
                if (mo23741M != m5966b) {
                    int m23733e0 = t.m23712h() ? m23733e0(t, m5966b) : m5966b;
                    boolean mo23761G = mo23761G(m23733e0);
                    i5 = mo23741M - m5966b;
                    this.f29595k = m5966b - m23733e0;
                    if (!mo23761G && t.m23712h()) {
                        coordinatorLayout.m1428f(t);
                    }
                    t.m23715m(mo23760E());
                    m23737s0(coordinatorLayout, t, m5966b, m5966b < mo23741M ? -1 : 1, false);
                }
            }
            m23736r0(coordinatorLayout, t);
            return i5;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f29598n = -1;
        }

        protected static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new C7886a();

            /* renamed from: h */
            int f29603h;

            /* renamed from: i */
            float f29604i;

            /* renamed from: j */
            boolean f29605j;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState$a */
            static class C7886a implements Parcelable.ClassLoaderCreator<SavedState> {
                C7886a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel) {
                    return new SavedState(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public SavedState[] newArray(int i2) {
                    return new SavedState[i2];
                }
            }

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f29603h = parcel.readInt();
                this.f29604i = parcel.readFloat();
                this.f29605j = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i2) {
                super.writeToParcel(parcel, i2);
                parcel.writeInt(this.f29603h);
                parcel.writeFloat(this.f29604i);
                parcel.writeByte(this.f29605j ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AppBarLayout(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r4 = com.google.android.material.appbar.AppBarLayout.f29577f
            android.content.Context r11 = com.google.android.material.theme.p178a.C8046a.m24906c(r11, r12, r13, r4)
            r10.<init>(r11, r12, r13)
            r11 = -1
            r10.f29579h = r11
            r10.f29580i = r11
            r10.f29581j = r11
            r6 = 0
            r10.f29583l = r6
            android.content.Context r7 = r10.getContext()
            r0 = 1
            r10.setOrientation(r0)
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 21
            if (r8 < r9) goto L27
            com.google.android.material.appbar.C7904e.m23805a(r10)
            com.google.android.material.appbar.C7904e.m23807c(r10, r12, r13, r4)
        L27:
            int[] r2 = p241e.p254e.p256b.p271c.C8885l.f34258k
            int[] r5 = new int[r6]
            r0 = r7
            r1 = r12
            r3 = r13
            android.content.res.TypedArray r12 = com.google.android.material.internal.C7999j.m24694h(r0, r1, r2, r3, r4, r5)
            int r13 = p241e.p254e.p256b.p271c.C8885l.f34265l
            android.graphics.drawable.Drawable r13 = r12.getDrawable(r13)
            androidx.core.view.C0311u.m2139m0(r10, r13)
            android.graphics.drawable.Drawable r13 = r10.getBackground()
            boolean r13 = r13 instanceof android.graphics.drawable.ColorDrawable
            if (r13 == 0) goto L5f
            android.graphics.drawable.Drawable r13 = r10.getBackground()
            android.graphics.drawable.ColorDrawable r13 = (android.graphics.drawable.ColorDrawable) r13
            e.e.b.c.a0.g r0 = new e.e.b.c.a0.g
            r0.<init>()
            int r13 = r13.getColor()
            android.content.res.ColorStateList r13 = android.content.res.ColorStateList.valueOf(r13)
            r0.m28284X(r13)
            r0.m28278N(r7)
            androidx.core.view.C0311u.m2139m0(r10, r0)
        L5f:
            int r13 = p241e.p254e.p256b.p271c.C8885l.f34293p
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L6e
            boolean r13 = r12.getBoolean(r13, r6)
            r10.m23701s(r13, r6, r6)
        L6e:
            if (r8 < r9) goto L80
            int r13 = p241e.p254e.p256b.p271c.C8885l.f34286o
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L80
            int r13 = r12.getDimensionPixelSize(r13, r6)
            float r13 = (float) r13
            com.google.android.material.appbar.C7904e.m23806b(r10, r13)
        L80:
            r13 = 26
            if (r8 < r13) goto La2
            int r13 = p241e.p254e.p256b.p271c.C8885l.f34279n
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L93
            boolean r13 = r12.getBoolean(r13, r6)
            r10.setKeyboardNavigationCluster(r13)
        L93:
            int r13 = p241e.p254e.p256b.p271c.C8885l.f34272m
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto La2
            boolean r13 = r12.getBoolean(r13, r6)
            r10.setTouchscreenBlocksFocus(r13)
        La2:
            int r13 = p241e.p254e.p256b.p271c.C8885l.f34300q
            boolean r13 = r12.getBoolean(r13, r6)
            r10.f29589r = r13
            int r13 = p241e.p254e.p256b.p271c.C8885l.f34307r
            int r11 = r12.getResourceId(r13, r11)
            r10.f29590s = r11
            int r11 = p241e.p254e.p256b.p271c.C8885l.f34314s
            android.graphics.drawable.Drawable r11 = r12.getDrawable(r11)
            r10.setStatusBarForeground(r11)
            r12.recycle()
            com.google.android.material.appbar.AppBarLayout$a r11 = new com.google.android.material.appbar.AppBarLayout$a
            r11.<init>()
            androidx.core.view.C0311u.m2157v0(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$d */
    public static class C7894d extends LinearLayout.LayoutParams {

        /* renamed from: a */
        int f29620a;

        /* renamed from: b */
        Interpolator f29621b;

        public C7894d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f29620a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8885l.f34328u);
            this.f29620a = obtainStyledAttributes.getInt(C8885l.f34335v, 0);
            int i2 = C8885l.f34342w;
            if (obtainStyledAttributes.hasValue(i2)) {
                this.f29621b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i2, 0));
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public int m23769a() {
            return this.f29620a;
        }

        /* renamed from: b */
        public Interpolator m23770b() {
            return this.f29621b;
        }

        /* renamed from: c */
        boolean m23771c() {
            int i2 = this.f29620a;
            return (i2 & 1) == 1 && (i2 & 10) != 0;
        }

        public C7894d(int i2, int i3) {
            super(i2, i3);
            this.f29620a = 1;
        }

        public C7894d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f29620a = 1;
        }

        public C7894d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f29620a = 1;
        }

        public C7894d(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f29620a = 1;
        }
    }
}
