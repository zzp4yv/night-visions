package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import p024c.p025a.p026k.p027a.C0833a;
import p241e.p254e.p256b.p271c.C8875b;
import p241e.p254e.p256b.p271c.C8884k;
import p241e.p254e.p256b.p271c.p272a0.C8868h;
import p241e.p254e.p256b.p271c.p272a0.C8871k;
import p241e.p254e.p256b.p271c.p272a0.InterfaceC8874n;

/* loaded from: classes2.dex */
public class MaterialCardView extends CardView implements Checkable, InterfaceC8874n {

    /* renamed from: o */
    private static final int[] f29933o = {R.attr.state_checkable};

    /* renamed from: p */
    private static final int[] f29934p = {R.attr.state_checked};

    /* renamed from: q */
    private static final int[] f29935q = {C8875b.f33804E};

    /* renamed from: r */
    private static final int f29936r = C8884k.f33992q;

    /* renamed from: s */
    private final C7943a f29937s;

    /* renamed from: t */
    private boolean f29938t;

    /* renamed from: u */
    private boolean f29939u;

    /* renamed from: v */
    private boolean f29940v;

    /* renamed from: w */
    private InterfaceC7942a f29941w;

    /* renamed from: com.google.android.material.card.MaterialCardView$a */
    public interface InterfaceC7942a {
        /* renamed from: a */
        void m24069a(MaterialCardView materialCardView, boolean z);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C8875b.f33833w);
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f29937s.m24109k().getBounds());
        return rectF;
    }

    /* renamed from: h */
    private void m24065h() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f29937s.m24108j();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.f29937s.m24110l();
    }

    public ColorStateList getCardForegroundColor() {
        return this.f29937s.m24111m();
    }

    float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f29937s.m24112n();
    }

    public ColorStateList getCheckedIconTint() {
        return this.f29937s.m24113o();
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f29937s.m24121y().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f29937s.m24121y().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f29937s.m24121y().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f29937s.m24121y().top;
    }

    public float getProgress() {
        return this.f29937s.m24115s();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f29937s.m24114q();
    }

    public ColorStateList getRippleColor() {
        return this.f29937s.m24116t();
    }

    public C8871k getShapeAppearanceModel() {
        return this.f29937s.m24117u();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.f29937s.m24118v();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f29937s.m24119w();
    }

    public int getStrokeWidth() {
        return this.f29937s.m24120x();
    }

    /* renamed from: i */
    public boolean m24066i() {
        C7943a c7943a = this.f29937s;
        return c7943a != null && c7943a.m24087B();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f29939u;
    }

    /* renamed from: j */
    public boolean m24067j() {
        return this.f29940v;
    }

    /* renamed from: k */
    void m24068k(int i2, int i3, int i4, int i5) {
        super.m1254f(i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C8868h.m28312f(this, this.f29937s.m24109k());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 3);
        if (m24066i()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f29933o);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f29934p);
        }
        if (m24067j()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f29935q);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(m24066i());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        this.f29937s.m24089D(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f29938t) {
            if (!this.f29937s.m24086A()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.f29937s.m24090E(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i2) {
        this.f29937s.m24091F(ColorStateList.valueOf(i2));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f2) {
        super.setCardElevation(f2);
        this.f29937s.m24105V();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.f29937s.m24092G(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.f29937s.m24093H(z);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f29939u != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f29937s.m24094I(drawable);
    }

    public void setCheckedIconResource(int i2) {
        this.f29937s.m24094I(C0833a.m5262d(getContext(), i2));
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.f29937s.m24095J(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        this.f29937s.m24103T();
    }

    public void setDragged(boolean z) {
        if (this.f29940v != z) {
            this.f29940v = z;
            refreshDrawableState();
            m24065h();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f2) {
        super.setMaxCardElevation(f2);
        this.f29937s.m24106X();
    }

    public void setOnCheckedChangeListener(InterfaceC7942a interfaceC7942a) {
        this.f29941w = interfaceC7942a;
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.f29937s.m24106X();
        this.f29937s.m24104U();
    }

    public void setProgress(float f2) {
        this.f29937s.m24097L(f2);
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f2) {
        super.setRadius(f2);
        this.f29937s.m24096K(f2);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.f29937s.m24098M(colorStateList);
    }

    public void setRippleColorResource(int i2) {
        this.f29937s.m24098M(C0833a.m5261c(getContext(), i2));
    }

    @Override // p241e.p254e.p256b.p271c.p272a0.InterfaceC8874n
    public void setShapeAppearanceModel(C8871k c8871k) {
        if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(c8871k.m28333u(getBoundsAsRectF()));
        }
        this.f29937s.m24099N(c8871k);
    }

    public void setStrokeColor(int i2) {
        this.f29937s.m24100O(ColorStateList.valueOf(i2));
    }

    public void setStrokeWidth(int i2) {
        this.f29937s.m24101P(i2);
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.f29937s.m24106X();
        this.f29937s.m24104U();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (m24066i() && isEnabled()) {
            this.f29939u = !this.f29939u;
            refreshDrawableState();
            m24065h();
            InterfaceC7942a interfaceC7942a = this.f29941w;
            if (interfaceC7942a != null) {
                interfaceC7942a.m24069a(this, this.f29939u);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialCardView(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r6 = com.google.android.material.card.MaterialCardView.f29936r
            android.content.Context r8 = com.google.android.material.theme.p178a.C8046a.m24906c(r8, r9, r10, r6)
            r7.<init>(r8, r9, r10)
            r8 = 0
            r7.f29939u = r8
            r7.f29940v = r8
            r0 = 1
            r7.f29938t = r0
            android.content.Context r0 = r7.getContext()
            int[] r2 = p241e.p254e.p256b.p271c.C8885l.f34248i3
            int[] r5 = new int[r8]
            r1 = r9
            r3 = r10
            r4 = r6
            android.content.res.TypedArray r8 = com.google.android.material.internal.C7999j.m24694h(r0, r1, r2, r3, r4, r5)
            com.google.android.material.card.a r0 = new com.google.android.material.card.a
            r0.<init>(r7, r9, r10, r6)
            r7.f29937s = r0
            android.content.res.ColorStateList r9 = super.getCardBackgroundColor()
            r0.m24091F(r9)
            int r9 = super.getContentPaddingLeft()
            int r10 = super.getContentPaddingTop()
            int r1 = super.getContentPaddingRight()
            int r2 = super.getContentPaddingBottom()
            r0.m24102Q(r9, r10, r1, r2)
            r0.m24088C(r8)
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f29937s.m24091F(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f29937s.m24100O(colorStateList);
    }
}
