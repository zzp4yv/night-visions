package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0297g;
import androidx.core.view.C0311u;
import p241e.p254e.p256b.p271c.C8879f;
import p241e.p254e.p256b.p271c.C8885l;

/* compiled from: FlowLayout.java */
/* renamed from: com.google.android.material.internal.c */
/* loaded from: classes2.dex */
public class C7992c extends ViewGroup {

    /* renamed from: f */
    private int f30382f;

    /* renamed from: g */
    private int f30383g;

    /* renamed from: h */
    private boolean f30384h;

    /* renamed from: i */
    private int f30385i;

    public C7992c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private static int m24659a(int i2, int i3, int i4) {
        return i3 != Integer.MIN_VALUE ? i3 != 1073741824 ? i4 : i2 : Math.min(i4, i2);
    }

    /* renamed from: d */
    private void m24660d(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C8885l.f34185a2, 0, 0);
        this.f30382f = obtainStyledAttributes.getDimensionPixelSize(C8885l.f34201c2, 0);
        this.f30383g = obtainStyledAttributes.getDimensionPixelSize(C8885l.f34193b2, 0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public int m24661b(View view) {
        Object tag = view.getTag(C8879f.f33936z);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    /* renamed from: c */
    public boolean mo24163c() {
        return this.f30384h;
    }

    protected int getItemSpacing() {
        return this.f30383g;
    }

    protected int getLineSpacing() {
        return this.f30382f;
    }

    protected int getRowCount() {
        return this.f30385i;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        if (getChildCount() == 0) {
            this.f30385i = 0;
            return;
        }
        this.f30385i = 1;
        boolean z2 = C0311u.m2162y(this) == 1;
        int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i8 = (i4 - i2) - paddingLeft;
        int i9 = paddingRight;
        int i10 = paddingTop;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(C8879f.f33936z, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i7 = C0297g.m2045b(marginLayoutParams);
                    i6 = C0297g.m2044a(marginLayoutParams);
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                int measuredWidth = i9 + i7 + childAt.getMeasuredWidth();
                if (!this.f30384h && measuredWidth > i8) {
                    i10 = this.f30382f + paddingTop;
                    this.f30385i++;
                    i9 = paddingRight;
                }
                childAt.setTag(C8879f.f33936z, Integer.valueOf(this.f30385i - 1));
                int i12 = i9 + i7;
                int measuredWidth2 = childAt.getMeasuredWidth() + i12;
                int measuredHeight = childAt.getMeasuredHeight() + i10;
                if (z2) {
                    childAt.layout(i8 - measuredWidth2, i10, (i8 - i9) - i7, measuredHeight);
                } else {
                    childAt.layout(i12, i10, measuredWidth2, measuredHeight);
                }
                i9 += i7 + i6 + childAt.getMeasuredWidth() + this.f30383g;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int size = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i3);
        int i7 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i7 - getPaddingRight();
        int i8 = paddingTop;
        int i9 = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i2, i3);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i4 = marginLayoutParams.leftMargin + 0;
                    i5 = marginLayoutParams.rightMargin + 0;
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                int i11 = paddingLeft;
                if (paddingLeft + i4 + childAt.getMeasuredWidth() <= paddingRight || mo24163c()) {
                    i6 = i11;
                } else {
                    i6 = getPaddingLeft();
                    i8 = this.f30382f + paddingTop;
                }
                int measuredWidth = i6 + i4 + childAt.getMeasuredWidth();
                int measuredHeight = i8 + childAt.getMeasuredHeight();
                if (measuredWidth > i9) {
                    i9 = measuredWidth;
                }
                paddingLeft = i6 + i4 + i5 + childAt.getMeasuredWidth() + this.f30383g;
                if (i10 == getChildCount() - 1) {
                    i9 += i5;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(m24659a(size, mode, i9 + getPaddingRight()), m24659a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    protected void setItemSpacing(int i2) {
        this.f30383g = i2;
    }

    protected void setLineSpacing(int i2) {
        this.f30382f = i2;
    }

    public void setSingleLine(boolean z) {
        this.f30384h = z;
    }

    public C7992c(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f30384h = false;
        m24660d(context, attributeSet);
    }
}
