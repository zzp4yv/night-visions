package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.drawable.C0265a;
import androidx.core.view.C0311u;
import androidx.core.widget.C0330k;
import androidx.customview.view.AbsSavedState;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p024c.p025a.p026k.p027a.C0833a;
import p241e.p254e.p256b.p271c.C8875b;
import p241e.p254e.p256b.p271c.C8884k;
import p241e.p254e.p256b.p271c.p272a0.C8868h;
import p241e.p254e.p256b.p271c.p272a0.C8871k;
import p241e.p254e.p256b.p271c.p272a0.InterfaceC8874n;

/* loaded from: classes2.dex */
public class MaterialButton extends AppCompatButton implements Checkable, InterfaceC8874n {

    /* renamed from: h */
    private static final int[] f29898h = {R.attr.state_checkable};

    /* renamed from: i */
    private static final int[] f29899i = {R.attr.state_checked};

    /* renamed from: j */
    private static final int f29900j = C8884k.f33991p;

    /* renamed from: k */
    private final C7941a f29901k;

    /* renamed from: l */
    private final LinkedHashSet<InterfaceC7939a> f29902l;

    /* renamed from: m */
    private InterfaceC7940b f29903m;

    /* renamed from: n */
    private PorterDuff.Mode f29904n;

    /* renamed from: o */
    private ColorStateList f29905o;

    /* renamed from: p */
    private Drawable f29906p;

    /* renamed from: q */
    private int f29907q;

    /* renamed from: r */
    private int f29908r;

    /* renamed from: s */
    private int f29909s;

    /* renamed from: t */
    private boolean f29910t;

    /* renamed from: u */
    private boolean f29911u;

    /* renamed from: v */
    private int f29912v;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C7938a();

        /* renamed from: h */
        boolean f29913h;

        /* renamed from: com.google.android.material.button.MaterialButton$SavedState$a */
        static class C7938a implements Parcelable.ClassLoaderCreator<SavedState> {
            C7938a() {
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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        private void m24028b(Parcel parcel) {
            this.f29913h = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f29913h ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m24028b(parcel);
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButton$a */
    public interface InterfaceC7939a {
        /* renamed from: a */
        void m24032a(MaterialButton materialButton, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButton$b */
    interface InterfaceC7940b {
        /* renamed from: a */
        void m24033a(MaterialButton materialButton, boolean z);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C8875b.f33831u);
    }

    /* renamed from: b */
    private boolean m24022b() {
        return C0311u.m2162y(this) == 1;
    }

    /* renamed from: c */
    private boolean m24023c() {
        C7941a c7941a = this.f29901k;
        return (c7941a == null || c7941a.m24050m()) ? false : true;
    }

    /* renamed from: d */
    private void m24024d(boolean z) {
        if (z) {
            C0330k.m2328i(this, this.f29906p, null, null, null);
        } else {
            C0330k.m2328i(this, null, null, this.f29906p, null);
        }
    }

    /* renamed from: e */
    private void m24025e(boolean z) {
        Drawable drawable = this.f29906p;
        boolean z2 = false;
        if (drawable != null) {
            Drawable mutate = C0265a.m1821r(drawable).mutate();
            this.f29906p = mutate;
            C0265a.m1818o(mutate, this.f29905o);
            PorterDuff.Mode mode = this.f29904n;
            if (mode != null) {
                C0265a.m1819p(this.f29906p, mode);
            }
            int i2 = this.f29907q;
            if (i2 == 0) {
                i2 = this.f29906p.getIntrinsicWidth();
            }
            int i3 = this.f29907q;
            if (i3 == 0) {
                i3 = this.f29906p.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f29906p;
            int i4 = this.f29908r;
            drawable2.setBounds(i4, 0, i2 + i4, i3);
        }
        int i5 = this.f29912v;
        boolean z3 = i5 == 1 || i5 == 2;
        if (z) {
            m24024d(z3);
            return;
        }
        Drawable[] m2320a = C0330k.m2320a(this);
        Drawable drawable3 = m2320a[0];
        Drawable drawable4 = m2320a[2];
        if ((z3 && drawable3 != this.f29906p) || (!z3 && drawable4 != this.f29906p)) {
            z2 = true;
        }
        if (z2) {
            m24024d(z3);
        }
    }

    /* renamed from: f */
    private void m24026f() {
        if (this.f29906p == null || getLayout() == null) {
            return;
        }
        int i2 = this.f29912v;
        if (i2 == 1 || i2 == 3) {
            this.f29908r = 0;
            m24025e(false);
            return;
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        int min = Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
        int i3 = this.f29907q;
        if (i3 == 0) {
            i3 = this.f29906p.getIntrinsicWidth();
        }
        int measuredWidth = (((((getMeasuredWidth() - min) - C0311u.m2088C(this)) - i3) - this.f29909s) - C0311u.m2090D(this)) / 2;
        if (m24022b() != (this.f29912v == 4)) {
            measuredWidth = -measuredWidth;
        }
        if (this.f29908r != measuredWidth) {
            this.f29908r = measuredWidth;
            m24025e(false);
        }
    }

    private String getA11yClassName() {
        return (m24027a() ? CompoundButton.class : Button.class).getName();
    }

    /* renamed from: a */
    public boolean m24027a() {
        C7941a c7941a = this.f29901k;
        return c7941a != null && c7941a.m24051n();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m24023c()) {
            return this.f29901k.m24041b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f29906p;
    }

    public int getIconGravity() {
        return this.f29912v;
    }

    public int getIconPadding() {
        return this.f29909s;
    }

    public int getIconSize() {
        return this.f29907q;
    }

    public ColorStateList getIconTint() {
        return this.f29905o;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f29904n;
    }

    public ColorStateList getRippleColor() {
        if (m24023c()) {
            return this.f29901k.m24044f();
        }
        return null;
    }

    public C8871k getShapeAppearanceModel() {
        if (m24023c()) {
            return this.f29901k.m24045g();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m24023c()) {
            return this.f29901k.m24046h();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m24023c()) {
            return this.f29901k.m24047i();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.InterfaceC0310t
    public ColorStateList getSupportBackgroundTintList() {
        return m24023c() ? this.f29901k.m24048j() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.InterfaceC0310t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m24023c() ? this.f29901k.m24049k() : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f29910t;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m24023c()) {
            C8868h.m28312f(this, this.f29901k.m24043d());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (m24027a()) {
            Button.mergeDrawableStates(onCreateDrawableState, f29898h);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, f29899i);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(m24027a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        C7941a c7941a;
        super.onLayout(z, i2, i3, i4, i5);
        if (Build.VERSION.SDK_INT != 21 || (c7941a = this.f29901k) == null) {
            return;
        }
        c7941a.m24040B(i5 - i3, i4 - i2);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        m24026f();
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m2342a());
        setChecked(savedState.f29913h);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f29913h = this.f29910t;
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        m24026f();
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        if (m24023c()) {
            this.f29901k.m24053p(i2);
        } else {
            super.setBackgroundColor(i2);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m24023c()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "Do not set the background; MaterialButton manages its own background drawable.");
            this.f29901k.m24054q();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i2) {
        setBackgroundDrawable(i2 != 0 ? C0833a.m5262d(getContext(), i2) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (m24023c()) {
            this.f29901k.m24055r(z);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (m24027a() && isEnabled() && this.f29910t != z) {
            this.f29910t = z;
            refreshDrawableState();
            if (this.f29911u) {
                return;
            }
            this.f29911u = true;
            Iterator<InterfaceC7939a> it = this.f29902l.iterator();
            while (it.hasNext()) {
                it.next().m24032a(this, this.f29910t);
            }
            this.f29911u = false;
        }
    }

    public void setCornerRadius(int i2) {
        if (m24023c()) {
            this.f29901k.m24056s(i2);
        }
    }

    public void setCornerRadiusResource(int i2) {
        if (m24023c()) {
            setCornerRadius(getResources().getDimensionPixelSize(i2));
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        if (m24023c()) {
            this.f29901k.m24043d().m28283W(f2);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f29906p != drawable) {
            this.f29906p = drawable;
            m24025e(true);
        }
    }

    public void setIconGravity(int i2) {
        if (this.f29912v != i2) {
            this.f29912v = i2;
            m24026f();
        }
    }

    public void setIconPadding(int i2) {
        if (this.f29909s != i2) {
            this.f29909s = i2;
            setCompoundDrawablePadding(i2);
        }
    }

    public void setIconResource(int i2) {
        setIcon(i2 != 0 ? C0833a.m5262d(getContext(), i2) : null);
    }

    public void setIconSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f29907q != i2) {
            this.f29907q = i2;
            m24025e(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f29905o != colorStateList) {
            this.f29905o = colorStateList;
            m24025e(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f29904n != mode) {
            this.f29904n = mode;
            m24025e(false);
        }
    }

    public void setIconTintResource(int i2) {
        setIconTint(C0833a.m5261c(getContext(), i2));
    }

    void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    void setOnPressedChangeListenerInternal(InterfaceC7940b interfaceC7940b) {
        this.f29903m = interfaceC7940b;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        InterfaceC7940b interfaceC7940b = this.f29903m;
        if (interfaceC7940b != null) {
            interfaceC7940b.m24033a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m24023c()) {
            this.f29901k.m24057t(colorStateList);
        }
    }

    public void setRippleColorResource(int i2) {
        if (m24023c()) {
            setRippleColor(C0833a.m5261c(getContext(), i2));
        }
    }

    @Override // p241e.p254e.p256b.p271c.p272a0.InterfaceC8874n
    public void setShapeAppearanceModel(C8871k c8871k) {
        if (!m24023c()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f29901k.m24058u(c8871k);
    }

    void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m24023c()) {
            this.f29901k.m24059v(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m24023c()) {
            this.f29901k.m24060w(colorStateList);
        }
    }

    public void setStrokeColorResource(int i2) {
        if (m24023c()) {
            setStrokeColor(C0833a.m5261c(getContext(), i2));
        }
    }

    public void setStrokeWidth(int i2) {
        if (m24023c()) {
            this.f29901k.m24061x(i2);
        }
    }

    public void setStrokeWidthResource(int i2) {
        if (m24023c()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i2));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.InterfaceC0310t
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m24023c()) {
            this.f29901k.m24062y(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.InterfaceC0310t
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (m24023c()) {
            this.f29901k.m24063z(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f29910t);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialButton(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = com.google.android.material.button.MaterialButton.f29900j
            android.content.Context r9 = com.google.android.material.theme.p178a.C8046a.m24906c(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f29902l = r9
            r9 = 0
            r8.f29910t = r9
            r8.f29911u = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = p241e.p254e.p256b.p271c.C8885l.f34324t2
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.C7999j.m24694h(r0, r1, r2, r3, r4, r5)
            int r1 = p241e.p254e.p256b.p271c.C8885l.f34045G2
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f29909s = r1
            int r1 = p241e.p254e.p256b.p271c.C8885l.f34066J2
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.C8000k.m24700e(r1, r2)
            r8.f29904n = r1
            android.content.Context r1 = r8.getContext()
            int r2 = p241e.p254e.p256b.p271c.C8885l.f34059I2
            android.content.res.ColorStateList r1 = p241e.p254e.p256b.p271c.p285x.C8914c.m28499a(r1, r0, r2)
            r8.f29905o = r1
            android.content.Context r1 = r8.getContext()
            int r2 = p241e.p254e.p256b.p271c.C8885l.f34031E2
            android.graphics.drawable.Drawable r1 = p241e.p254e.p256b.p271c.p285x.C8914c.m28502d(r1, r0, r2)
            r8.f29906p = r1
            int r1 = p241e.p254e.p256b.p271c.C8885l.f34038F2
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.f29912v = r1
            int r1 = p241e.p254e.p256b.p271c.C8885l.f34052H2
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f29907q = r1
            e.e.b.c.a0.k$b r10 = p241e.p254e.p256b.p271c.p272a0.C8871k.m28317e(r7, r10, r11, r6)
            e.e.b.c.a0.k r10 = r10.m28355m()
            com.google.android.material.button.a r11 = new com.google.android.material.button.a
            r11.<init>(r8, r10)
            r8.f29901k = r11
            r11.m24052o(r0)
            r0.recycle()
            int r10 = r8.f29909s
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.f29906p
            if (r10 == 0) goto L84
            r9 = 1
        L84:
            r8.m24025e(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
