package com.google.android.material.chip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.view.p004d0.C0289c;
import com.google.android.material.internal.C7992c;
import java.util.ArrayList;
import java.util.List;
import p241e.p254e.p256b.p271c.C8875b;
import p241e.p254e.p256b.p271c.C8884k;

/* loaded from: classes2.dex */
public class ChipGroup extends C7992c {

    /* renamed from: j */
    private static final int f29987j = C8884k.f33993r;

    /* renamed from: k */
    private int f29988k;

    /* renamed from: l */
    private int f29989l;

    /* renamed from: m */
    private boolean f29990m;

    /* renamed from: n */
    private boolean f29991n;

    /* renamed from: o */
    private InterfaceC7950d f29992o;

    /* renamed from: p */
    private final C7948b f29993p;

    /* renamed from: q */
    private ViewGroupOnHierarchyChangeListenerC7951e f29994q;

    /* renamed from: r */
    private int f29995r;

    /* renamed from: s */
    private boolean f29996s;

    /* renamed from: com.google.android.material.chip.ChipGroup$b */
    private class C7948b implements CompoundButton.OnCheckedChangeListener {
        private C7948b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (ChipGroup.this.f29996s) {
                return;
            }
            if (ChipGroup.this.getCheckedChipIds().isEmpty() && ChipGroup.this.f29991n) {
                ChipGroup.this.m24162q(compoundButton.getId(), true);
                ChipGroup.this.m24161p(compoundButton.getId(), false);
                return;
            }
            int id = compoundButton.getId();
            if (!z) {
                if (ChipGroup.this.f29995r == id) {
                    ChipGroup.this.setCheckedId(-1);
                }
            } else {
                if (ChipGroup.this.f29995r != -1 && ChipGroup.this.f29995r != id && ChipGroup.this.f29990m) {
                    ChipGroup chipGroup = ChipGroup.this;
                    chipGroup.m24162q(chipGroup.f29995r, false);
                }
                ChipGroup.this.setCheckedId(id);
            }
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$c */
    public static class C7949c extends ViewGroup.MarginLayoutParams {
        public C7949c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C7949c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C7949c(int i2, int i3) {
            super(i2, i3);
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$d */
    public interface InterfaceC7950d {
        /* renamed from: a */
        void m24167a(ChipGroup chipGroup, int i2);
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$e */
    private class ViewGroupOnHierarchyChangeListenerC7951e implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: f */
        private ViewGroup.OnHierarchyChangeListener f29998f;

        private ViewGroupOnHierarchyChangeListenerC7951e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(Build.VERSION.SDK_INT >= 17 ? View.generateViewId() : view2.hashCode());
                }
                ((Chip) view2).setOnCheckedChangeListenerInternal(ChipGroup.this.f29993p);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f29998f;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal(null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f29998f;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C8875b.f33818h);
    }

    private int getChipCount() {
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) instanceof Chip) {
                i2++;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public void m24161p(int i2, boolean z) {
        this.f29995r = i2;
        InterfaceC7950d interfaceC7950d = this.f29992o;
        if (interfaceC7950d != null && this.f29990m && z) {
            interfaceC7950d.m24167a(this, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public void m24162q(int i2, boolean z) {
        View findViewById = findViewById(i2);
        if (findViewById instanceof Chip) {
            this.f29996s = true;
            ((Chip) findViewById).setChecked(z);
            this.f29996s = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedId(int i2) {
        m24161p(i2, true);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i3 = this.f29995r;
                if (i3 != -1 && this.f29990m) {
                    m24162q(i3, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i2, layoutParams);
    }

    @Override // com.google.android.material.internal.C7992c
    /* renamed from: c */
    public boolean mo24163c() {
        return super.mo24163c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C7949c);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C7949c(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C7949c(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        if (this.f29990m) {
            return this.f29995r;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.f29990m) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.f29988k;
    }

    public int getChipSpacingVertical() {
        return this.f29989l;
    }

    /* renamed from: m */
    public void m24164m() {
        this.f29996s = true;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.f29996s = false;
        setCheckedId(-1);
    }

    /* renamed from: n */
    int m24165n(View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) instanceof Chip) {
                if (((Chip) getChildAt(i3)) == view) {
                    return i2;
                }
                i2++;
            }
        }
        return -1;
    }

    /* renamed from: o */
    public boolean m24166o() {
        return this.f29990m;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.f29995r;
        if (i2 != -1) {
            m24162q(i2, true);
            setCheckedId(this.f29995r);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0289c.m1949y0(accessibilityNodeInfo).m1973a0(C0289c.b.m2016a(getRowCount(), mo24163c() ? getChipCount() : -1, false, m24166o() ? 1 : 2));
    }

    public void setChipSpacing(int i2) {
        setChipSpacingHorizontal(i2);
        setChipSpacingVertical(i2);
    }

    public void setChipSpacingHorizontal(int i2) {
        if (this.f29988k != i2) {
            this.f29988k = i2;
            setItemSpacing(i2);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i2) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i2));
    }

    public void setChipSpacingResource(int i2) {
        setChipSpacing(getResources().getDimensionPixelOffset(i2));
    }

    public void setChipSpacingVertical(int i2) {
        if (this.f29989l != i2) {
            this.f29989l = i2;
            setLineSpacing(i2);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i2) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i2));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i2) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(InterfaceC7950d interfaceC7950d) {
        this.f29992o = interfaceC7950d;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f29994q.f29998f = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f29991n = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i2) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i2) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // com.google.android.material.internal.C7992c
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        if (this.f29990m != z) {
            this.f29990m = z;
            m24164m();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ChipGroup(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.chip.ChipGroup.f29987j
            android.content.Context r8 = com.google.android.material.theme.p178a.C8046a.m24906c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            com.google.android.material.chip.ChipGroup$b r8 = new com.google.android.material.chip.ChipGroup$b
            r0 = 0
            r8.<init>()
            r7.f29993p = r8
            com.google.android.material.chip.ChipGroup$e r8 = new com.google.android.material.chip.ChipGroup$e
            r8.<init>()
            r7.f29994q = r8
            r8 = -1
            r7.f29995r = r8
            r6 = 0
            r7.f29996s = r6
            android.content.Context r0 = r7.getContext()
            int[] r2 = p241e.p254e.p256b.p271c.C8885l.f34155W0
            int[] r5 = new int[r6]
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C7999j.m24694h(r0, r1, r2, r3, r4, r5)
            int r10 = p241e.p254e.p256b.p271c.C8885l.f34169Y0
            int r10 = r9.getDimensionPixelOffset(r10, r6)
            int r0 = p241e.p254e.p256b.p271c.C8885l.f34176Z0
            int r0 = r9.getDimensionPixelOffset(r0, r10)
            r7.setChipSpacingHorizontal(r0)
            int r0 = p241e.p254e.p256b.p271c.C8885l.f34184a1
            int r10 = r9.getDimensionPixelOffset(r0, r10)
            r7.setChipSpacingVertical(r10)
            int r10 = p241e.p254e.p256b.p271c.C8885l.f34200c1
            boolean r10 = r9.getBoolean(r10, r6)
            r7.setSingleLine(r10)
            int r10 = p241e.p254e.p256b.p271c.C8885l.f34208d1
            boolean r10 = r9.getBoolean(r10, r6)
            r7.setSingleSelection(r10)
            int r10 = p241e.p254e.p256b.p271c.C8885l.f34192b1
            boolean r10 = r9.getBoolean(r10, r6)
            r7.setSelectionRequired(r10)
            int r10 = p241e.p254e.p256b.p271c.C8885l.f34162X0
            int r10 = r9.getResourceId(r10, r8)
            if (r10 == r8) goto L69
            r7.f29995r = r10
        L69:
            r9.recycle()
            com.google.android.material.chip.ChipGroup$e r8 = r7.f29994q
            super.setOnHierarchyChangeListener(r8)
            r8 = 1
            androidx.core.view.C0311u.m2153t0(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C7949c(layoutParams);
    }

    public void setSingleLine(int i2) {
        setSingleLine(getResources().getBoolean(i2));
    }

    public void setSingleSelection(int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }
}
