package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C0255a;
import androidx.core.graphics.drawable.C0265a;
import androidx.core.view.C0285c0;
import androidx.core.view.C0311u;
import androidx.core.view.InterfaceC0306p;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.C7990a;
import com.google.android.material.internal.C7991b;
import p024c.p052i.p056g.C0937a;
import p024c.p052i.p059j.C0954d;
import p241e.p254e.p256b.p271c.C8879f;
import p241e.p254e.p256b.p271c.C8884k;
import p241e.p254e.p256b.p271c.C8885l;
import p241e.p254e.p256b.p271c.p273m.C8886a;

/* loaded from: classes2.dex */
public class CollapsingToolbarLayout extends FrameLayout {

    /* renamed from: f */
    private static final int f29622f = C8884k.f33985j;

    /* renamed from: A */
    private AppBarLayout.InterfaceC7895e f29623A;

    /* renamed from: B */
    int f29624B;

    /* renamed from: C */
    C0285c0 f29625C;

    /* renamed from: g */
    private boolean f29626g;

    /* renamed from: h */
    private int f29627h;

    /* renamed from: i */
    private Toolbar f29628i;

    /* renamed from: j */
    private View f29629j;

    /* renamed from: k */
    private View f29630k;

    /* renamed from: l */
    private int f29631l;

    /* renamed from: m */
    private int f29632m;

    /* renamed from: n */
    private int f29633n;

    /* renamed from: o */
    private int f29634o;

    /* renamed from: p */
    private final Rect f29635p;

    /* renamed from: q */
    final C7990a f29636q;

    /* renamed from: r */
    private boolean f29637r;

    /* renamed from: s */
    private boolean f29638s;

    /* renamed from: t */
    private Drawable f29639t;

    /* renamed from: u */
    Drawable f29640u;

    /* renamed from: v */
    private int f29641v;

    /* renamed from: w */
    private boolean f29642w;

    /* renamed from: x */
    private ValueAnimator f29643x;

    /* renamed from: y */
    private long f29644y;

    /* renamed from: z */
    private int f29645z;

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$a */
    class C7896a implements InterfaceC0306p {
        C7896a() {
        }

        @Override // androidx.core.view.InterfaceC0306p
        /* renamed from: a */
        public C0285c0 mo363a(View view, C0285c0 c0285c0) {
            return CollapsingToolbarLayout.this.m23783j(c0285c0);
        }
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$b */
    class C7897b implements ValueAnimator.AnimatorUpdateListener {
        C7897b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$d */
    private class C7899d implements AppBarLayout.InterfaceC7895e {
        C7899d() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.InterfaceC7893c
        public void onOffsetChanged(AppBarLayout appBarLayout, int i2) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.f29624B = i2;
            C0285c0 c0285c0 = collapsingToolbarLayout.f29625C;
            int m1884k = c0285c0 != null ? c0285c0.m1884k() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i3);
                C7898c c7898c = (C7898c) childAt.getLayoutParams();
                C7903d m23776h = CollapsingToolbarLayout.m23776h(childAt);
                int i4 = c7898c.f29648a;
                if (i4 == 1) {
                    m23776h.m23804f(C0937a.m5966b(-i2, 0, CollapsingToolbarLayout.this.m23782g(childAt)));
                } else if (i4 == 2) {
                    m23776h.m23804f(Math.round((-i2) * c7898c.f29649b));
                }
            }
            CollapsingToolbarLayout.this.m23785n();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.f29640u != null && m1884k > 0) {
                C0311u.m2113Z(collapsingToolbarLayout2);
            }
            CollapsingToolbarLayout.this.f29636q.m24637d0(Math.abs(i2) / ((CollapsingToolbarLayout.this.getHeight() - C0311u.m2164z(CollapsingToolbarLayout.this)) - m1884k));
        }
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m23772a(int i2) {
        m23773b();
        ValueAnimator valueAnimator = this.f29643x;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.f29643x = valueAnimator2;
            valueAnimator2.setDuration(this.f29644y);
            this.f29643x.setInterpolator(i2 > this.f29641v ? C8886a.f34372c : C8886a.f34373d);
            this.f29643x.addUpdateListener(new C7897b());
        } else if (valueAnimator.isRunning()) {
            this.f29643x.cancel();
        }
        this.f29643x.setIntValues(this.f29641v, i2);
        this.f29643x.start();
    }

    /* renamed from: b */
    private void m23773b() {
        if (this.f29626g) {
            Toolbar toolbar = null;
            this.f29628i = null;
            this.f29629j = null;
            int i2 = this.f29627h;
            if (i2 != -1) {
                Toolbar toolbar2 = (Toolbar) findViewById(i2);
                this.f29628i = toolbar2;
                if (toolbar2 != null) {
                    this.f29629j = m23774c(toolbar2);
                }
            }
            if (this.f29628i == null) {
                int childCount = getChildCount();
                int i3 = 0;
                while (true) {
                    if (i3 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i3);
                    if (childAt instanceof Toolbar) {
                        toolbar = (Toolbar) childAt;
                        break;
                    }
                    i3++;
                }
                this.f29628i = toolbar;
            }
            m23779m();
            this.f29626g = false;
        }
    }

    /* renamed from: c */
    private View m23774c(View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = parent;
            }
        }
        return view;
    }

    /* renamed from: f */
    private static int m23775f(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: h */
    static C7903d m23776h(View view) {
        int i2 = C8879f.f33910K;
        C7903d c7903d = (C7903d) view.getTag(i2);
        if (c7903d != null) {
            return c7903d;
        }
        C7903d c7903d2 = new C7903d(view);
        view.setTag(i2, c7903d2);
        return c7903d2;
    }

    /* renamed from: i */
    private boolean m23777i(View view) {
        View view2 = this.f29629j;
        if (view2 == null || view2 == this) {
            if (view == this.f29628i) {
                return true;
            }
        } else if (view == view2) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private void m23778l() {
        setContentDescription(getTitle());
    }

    /* renamed from: m */
    private void m23779m() {
        View view;
        if (!this.f29637r && (view = this.f29630k) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f29630k);
            }
        }
        if (!this.f29637r || this.f29628i == null) {
            return;
        }
        if (this.f29630k == null) {
            this.f29630k = new View(getContext());
        }
        if (this.f29630k.getParent() == null) {
            this.f29628i.addView(this.f29630k, -1, -1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C7898c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C7898c generateDefaultLayoutParams() {
        return new C7898c(-1, -1);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        m23773b();
        if (this.f29628i == null && (drawable = this.f29639t) != null && this.f29641v > 0) {
            drawable.mutate().setAlpha(this.f29641v);
            this.f29639t.draw(canvas);
        }
        if (this.f29637r && this.f29638s) {
            this.f29636q.m24642j(canvas);
        }
        if (this.f29640u == null || this.f29641v <= 0) {
            return;
        }
        C0285c0 c0285c0 = this.f29625C;
        int m1884k = c0285c0 != null ? c0285c0.m1884k() : 0;
        if (m1884k > 0) {
            this.f29640u.setBounds(0, -this.f29624B, getWidth(), m1884k - this.f29624B);
            this.f29640u.mutate().setAlpha(this.f29641v);
            this.f29640u.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j2) {
        boolean z;
        if (this.f29639t == null || this.f29641v <= 0 || !m23777i(view)) {
            z = false;
        } else {
            this.f29639t.mutate().setAlpha(this.f29641v);
            this.f29639t.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j2) || z;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f29640u;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f29639t;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        C7990a c7990a = this.f29636q;
        if (c7990a != null) {
            z |= c7990a.m24640h0(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C7898c(layoutParams);
    }

    /* renamed from: g */
    final int m23782g(View view) {
        return ((getHeight() - m23776h(view).m23800b()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((C7898c) view.getLayoutParams())).bottomMargin;
    }

    public int getCollapsedTitleGravity() {
        return this.f29636q.m24647o();
    }

    public Typeface getCollapsedTitleTypeface() {
        return this.f29636q.m24649s();
    }

    public Drawable getContentScrim() {
        return this.f29639t;
    }

    public int getExpandedTitleGravity() {
        return this.f29636q.m24651w();
    }

    public int getExpandedTitleMarginBottom() {
        return this.f29634o;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f29633n;
    }

    public int getExpandedTitleMarginStart() {
        return this.f29631l;
    }

    public int getExpandedTitleMarginTop() {
        return this.f29632m;
    }

    public Typeface getExpandedTitleTypeface() {
        return this.f29636q.m24653y();
    }

    public int getMaxLines() {
        return this.f29636q.m24618A();
    }

    int getScrimAlpha() {
        return this.f29641v;
    }

    public long getScrimAnimationDuration() {
        return this.f29644y;
    }

    public int getScrimVisibleHeightTrigger() {
        int i2 = this.f29645z;
        if (i2 >= 0) {
            return i2;
        }
        C0285c0 c0285c0 = this.f29625C;
        int m1884k = c0285c0 != null ? c0285c0.m1884k() : 0;
        int m2164z = C0311u.m2164z(this);
        return m2164z > 0 ? Math.min((m2164z * 2) + m1884k, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.f29640u;
    }

    public CharSequence getTitle() {
        if (this.f29637r) {
            return this.f29636q.m24619B();
        }
        return null;
    }

    /* renamed from: j */
    C0285c0 m23783j(C0285c0 c0285c0) {
        C0285c0 c0285c02 = C0311u.m2156v(this) ? c0285c0 : null;
        if (!C0954d.m6056a(this.f29625C, c0285c02)) {
            this.f29625C = c0285c02;
            requestLayout();
        }
        return c0285c0.m1876c();
    }

    /* renamed from: k */
    public void m23784k(boolean z, boolean z2) {
        if (this.f29642w != z) {
            if (z2) {
                m23772a(z ? 255 : 0);
            } else {
                setScrimAlpha(z ? 255 : 0);
            }
            this.f29642w = z;
        }
    }

    /* renamed from: n */
    final void m23785n() {
        if (this.f29639t == null && this.f29640u == null) {
            return;
        }
        setScrimsShown(getHeight() + this.f29624B < getScrimVisibleHeightTrigger());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Object parent = getParent();
        if (parent instanceof AppBarLayout) {
            C0311u.m2149r0(this, C0311u.m2156v((View) parent));
            if (this.f29623A == null) {
                this.f29623A = new C7899d();
            }
            ((AppBarLayout) parent).m23708b(this.f29623A);
            C0311u.m2125f0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.InterfaceC7895e interfaceC7895e = this.f29623A;
        if (interfaceC7895e != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).m23718p(interfaceC7895e);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View view;
        super.onLayout(z, i2, i3, i4, i5);
        C0285c0 c0285c0 = this.f29625C;
        if (c0285c0 != null) {
            int m1884k = c0285c0.m1884k();
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (!C0311u.m2156v(childAt) && childAt.getTop() < m1884k) {
                    C0311u.m2108U(childAt, m1884k);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i7 = 0; i7 < childCount2; i7++) {
            m23776h(getChildAt(i7)).m23802d();
        }
        if (this.f29637r && (view = this.f29630k) != null) {
            boolean z2 = C0311u.m2101N(view) && this.f29630k.getVisibility() == 0;
            this.f29638s = z2;
            if (z2) {
                boolean z3 = C0311u.m2162y(this) == 1;
                View view2 = this.f29629j;
                if (view2 == null) {
                    view2 = this.f29628i;
                }
                int m23782g = m23782g(view2);
                C7991b.m24656a(this, this.f29630k, this.f29635p);
                this.f29636q.m24623M(this.f29635p.left + (z3 ? this.f29628i.getTitleMarginEnd() : this.f29628i.getTitleMarginStart()), this.f29635p.top + m23782g + this.f29628i.getTitleMarginTop(), this.f29635p.right + (z3 ? this.f29628i.getTitleMarginStart() : this.f29628i.getTitleMarginEnd()), (this.f29635p.bottom + m23782g) - this.f29628i.getTitleMarginBottom());
                this.f29636q.m24629U(z3 ? this.f29633n : this.f29631l, this.f29635p.top + this.f29632m, (i4 - i2) - (z3 ? this.f29631l : this.f29633n), (i5 - i3) - this.f29634o);
                this.f29636q.m24622K();
            }
        }
        if (this.f29628i != null) {
            if (this.f29637r && TextUtils.isEmpty(this.f29636q.m24619B())) {
                setTitle(this.f29628i.getTitle());
            }
            View view3 = this.f29629j;
            if (view3 == null || view3 == this) {
                setMinimumHeight(m23775f(this.f29628i));
            } else {
                setMinimumHeight(m23775f(view3));
            }
        }
        m23785n();
        int childCount3 = getChildCount();
        for (int i8 = 0; i8 < childCount3; i8++) {
            m23776h(getChildAt(i8)).m23799a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        m23773b();
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i3);
        C0285c0 c0285c0 = this.f29625C;
        int m1884k = c0285c0 != null ? c0285c0.m1884k() : 0;
        if (mode != 0 || m1884k <= 0) {
            return;
        }
        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + m1884k, 1073741824));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        Drawable drawable = this.f29639t;
        if (drawable != null) {
            drawable.setBounds(0, 0, i2, i3);
        }
    }

    public void setCollapsedTitleGravity(int i2) {
        this.f29636q.m24627R(i2);
    }

    public void setCollapsedTitleTextAppearance(int i2) {
        this.f29636q.m24625O(i2);
    }

    public void setCollapsedTitleTextColor(int i2) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.f29636q.m24628S(typeface);
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.f29639t;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f29639t = mutate;
            if (mutate != null) {
                mutate.setBounds(0, 0, getWidth(), getHeight());
                this.f29639t.setCallback(this);
                this.f29639t.setAlpha(this.f29641v);
            }
            C0311u.m2113Z(this);
        }
    }

    public void setContentScrimColor(int i2) {
        setContentScrim(new ColorDrawable(i2));
    }

    public void setContentScrimResource(int i2) {
        setContentScrim(C0255a.m1677f(getContext(), i2));
    }

    public void setExpandedTitleColor(int i2) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setExpandedTitleGravity(int i2) {
        this.f29636q.m24633Z(i2);
    }

    public void setExpandedTitleMarginBottom(int i2) {
        this.f29634o = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i2) {
        this.f29633n = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i2) {
        this.f29631l = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i2) {
        this.f29632m = i2;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i2) {
        this.f29636q.m24631W(i2);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        this.f29636q.m24632Y(colorStateList);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.f29636q.m24635b0(typeface);
    }

    public void setMaxLines(int i2) {
        this.f29636q.m24638f0(i2);
    }

    void setScrimAlpha(int i2) {
        Toolbar toolbar;
        if (i2 != this.f29641v) {
            if (this.f29639t != null && (toolbar = this.f29628i) != null) {
                C0311u.m2113Z(toolbar);
            }
            this.f29641v = i2;
            C0311u.m2113Z(this);
        }
    }

    public void setScrimAnimationDuration(long j2) {
        this.f29644y = j2;
    }

    public void setScrimVisibleHeightTrigger(int i2) {
        if (this.f29645z != i2) {
            this.f29645z = i2;
            m23785n();
        }
    }

    public void setScrimsShown(boolean z) {
        m23784k(z, C0311u.m2102O(this) && !isInEditMode());
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.f29640u;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f29640u = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f29640u.setState(getDrawableState());
                }
                C0265a.m1816m(this.f29640u, C0311u.m2162y(this));
                this.f29640u.setVisible(getVisibility() == 0, false);
                this.f29640u.setCallback(this);
                this.f29640u.setAlpha(this.f29641v);
            }
            C0311u.m2113Z(this);
        }
    }

    public void setStatusBarScrimColor(int i2) {
        setStatusBarScrim(new ColorDrawable(i2));
    }

    public void setStatusBarScrimResource(int i2) {
        setStatusBarScrim(C0255a.m1677f(getContext(), i2));
    }

    public void setTitle(CharSequence charSequence) {
        this.f29636q.m24641i0(charSequence);
        m23778l();
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.f29637r) {
            this.f29637r = z;
            m23778l();
            m23779m();
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.f29640u;
        if (drawable != null && drawable.isVisible() != z) {
            this.f29640u.setVisible(z, false);
        }
        Drawable drawable2 = this.f29639t;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.f29639t.setVisible(z, false);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f29639t || drawable == this.f29640u;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CollapsingToolbarLayout(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.f29636q.m24626Q(colorStateList);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C7898c(getContext(), attributeSet);
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$c */
    public static class C7898c extends FrameLayout.LayoutParams {

        /* renamed from: a */
        int f29648a;

        /* renamed from: b */
        float f29649b;

        public C7898c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f29648a = 0;
            this.f29649b = 0.5f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8885l.f34344w1);
            this.f29648a = obtainStyledAttributes.getInt(C8885l.f34351x1, 0);
            m23786a(obtainStyledAttributes.getFloat(C8885l.f34358y1, 0.5f));
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public void m23786a(float f2) {
            this.f29649b = f2;
        }

        public C7898c(int i2, int i3) {
            super(i2, i3);
            this.f29648a = 0;
            this.f29649b = 0.5f;
        }

        public C7898c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f29648a = 0;
            this.f29649b = 0.5f;
        }
    }
}
