package com.google.android.material.bottomnavigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.view.menu.C0087g;
import androidx.appcompat.view.menu.C0089i;
import androidx.appcompat.view.menu.InterfaceC0094n;
import androidx.core.view.C0311u;
import androidx.core.view.p004d0.C0289c;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.C7998i;
import java.util.HashSet;
import p024c.p025a.C0823a;
import p024c.p025a.p026k.p027a.C0833a;
import p024c.p052i.p059j.C0958h;
import p024c.p052i.p059j.InterfaceC0956f;
import p024c.p068n.p069a.p070a.C0988b;
import p024c.p088x.C1025b;
import p024c.p088x.C1050o;
import p024c.p088x.C1052q;
import p241e.p254e.p256b.p271c.C8877d;

/* compiled from: BottomNavigationMenuView.java */
/* renamed from: com.google.android.material.bottomnavigation.c */
/* loaded from: classes2.dex */
public class C7929c extends ViewGroup implements InterfaceC0094n {

    /* renamed from: f */
    private static final int[] f29803f = {R.attr.state_checked};

    /* renamed from: g */
    private static final int[] f29804g = {-16842910};

    /* renamed from: A */
    private Drawable f29805A;

    /* renamed from: B */
    private int f29806B;

    /* renamed from: C */
    private int[] f29807C;

    /* renamed from: D */
    private SparseArray<BadgeDrawable> f29808D;

    /* renamed from: E */
    private BottomNavigationPresenter f29809E;

    /* renamed from: F */
    private C0087g f29810F;

    /* renamed from: h */
    private final C1052q f29811h;

    /* renamed from: i */
    private final int f29812i;

    /* renamed from: j */
    private final int f29813j;

    /* renamed from: k */
    private final int f29814k;

    /* renamed from: l */
    private final int f29815l;

    /* renamed from: m */
    private final int f29816m;

    /* renamed from: n */
    private final View.OnClickListener f29817n;

    /* renamed from: o */
    private final InterfaceC0956f<C7927a> f29818o;

    /* renamed from: p */
    private boolean f29819p;

    /* renamed from: q */
    private int f29820q;

    /* renamed from: r */
    private C7927a[] f29821r;

    /* renamed from: s */
    private int f29822s;

    /* renamed from: t */
    private int f29823t;

    /* renamed from: u */
    private ColorStateList f29824u;

    /* renamed from: v */
    private int f29825v;

    /* renamed from: w */
    private ColorStateList f29826w;

    /* renamed from: x */
    private final ColorStateList f29827x;

    /* renamed from: y */
    private int f29828y;

    /* renamed from: z */
    private int f29829z;

    /* compiled from: BottomNavigationMenuView.java */
    /* renamed from: com.google.android.material.bottomnavigation.c$a */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0089i itemData = ((C7927a) view).getItemData();
            if (C7929c.this.f29810F.m569O(itemData, C7929c.this.f29809E, 0)) {
                return;
            }
            itemData.setChecked(true);
        }
    }

    public C7929c(Context context) {
        this(context, null);
    }

    /* renamed from: g */
    private boolean m23960g(int i2, int i3) {
        if (i2 == -1) {
            if (i3 > 3) {
                return true;
            }
        } else if (i2 == 0) {
            return true;
        }
        return false;
    }

    private C7927a getNewItem() {
        C7927a mo6061b = this.f29818o.mo6061b();
        return mo6061b == null ? new C7927a(getContext()) : mo6061b;
    }

    /* renamed from: h */
    private boolean m23961h(int i2) {
        return i2 != -1;
    }

    /* renamed from: i */
    private void m23962i() {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < this.f29810F.size(); i2++) {
            hashSet.add(Integer.valueOf(this.f29810F.getItem(i2).getItemId()));
        }
        for (int i3 = 0; i3 < this.f29808D.size(); i3++) {
            int keyAt = this.f29808D.keyAt(i3);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.f29808D.delete(keyAt);
            }
        }
    }

    private void setBadgeIfNeeded(C7927a c7927a) {
        BadgeDrawable badgeDrawable;
        int id = c7927a.getId();
        if (m23961h(id) && (badgeDrawable = this.f29808D.get(id)) != null) {
            c7927a.setBadge(badgeDrawable);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0094n
    /* renamed from: b */
    public void mo478b(C0087g c0087g) {
        this.f29810F = c0087g;
    }

    /* renamed from: d */
    public void m23963d() {
        removeAllViews();
        C7927a[] c7927aArr = this.f29821r;
        if (c7927aArr != null) {
            for (C7927a c7927a : c7927aArr) {
                if (c7927a != null) {
                    this.f29818o.mo6060a(c7927a);
                    c7927a.m23957h();
                }
            }
        }
        if (this.f29810F.size() == 0) {
            this.f29822s = 0;
            this.f29823t = 0;
            this.f29821r = null;
            return;
        }
        m23962i();
        this.f29821r = new C7927a[this.f29810F.size()];
        boolean m23960g = m23960g(this.f29820q, this.f29810F.m561G().size());
        for (int i2 = 0; i2 < this.f29810F.size(); i2++) {
            this.f29809E.m23932m(true);
            this.f29810F.getItem(i2).setCheckable(true);
            this.f29809E.m23932m(false);
            C7927a newItem = getNewItem();
            this.f29821r[i2] = newItem;
            newItem.setIconTintList(this.f29824u);
            newItem.setIconSize(this.f29825v);
            newItem.setTextColor(this.f29827x);
            newItem.setTextAppearanceInactive(this.f29828y);
            newItem.setTextAppearanceActive(this.f29829z);
            newItem.setTextColor(this.f29826w);
            Drawable drawable = this.f29805A;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f29806B);
            }
            newItem.setShifting(m23960g);
            newItem.setLabelVisibilityMode(this.f29820q);
            newItem.mo472e((C0089i) this.f29810F.getItem(i2), 0);
            newItem.setItemPosition(i2);
            newItem.setOnClickListener(this.f29817n);
            if (this.f29822s != 0 && this.f29810F.getItem(i2).getItemId() == this.f29822s) {
                this.f29823t = i2;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.f29810F.size() - 1, this.f29823t);
        this.f29823t = min;
        this.f29810F.getItem(min).setChecked(true);
    }

    /* renamed from: e */
    public ColorStateList m23964e(int i2) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i2, typedValue, true)) {
            return null;
        }
        ColorStateList m5261c = C0833a.m5261c(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C0823a.f5050x, typedValue, true)) {
            return null;
        }
        int i3 = typedValue.data;
        int defaultColor = m5261c.getDefaultColor();
        int[] iArr = f29804g;
        return new ColorStateList(new int[][]{iArr, f29803f, ViewGroup.EMPTY_STATE_SET}, new int[]{m5261c.getColorForState(iArr, defaultColor), i3, defaultColor});
    }

    /* renamed from: f */
    public boolean m23965f() {
        return this.f29819p;
    }

    SparseArray<BadgeDrawable> getBadgeDrawables() {
        return this.f29808D;
    }

    public ColorStateList getIconTintList() {
        return this.f29824u;
    }

    public Drawable getItemBackground() {
        C7927a[] c7927aArr = this.f29821r;
        return (c7927aArr == null || c7927aArr.length <= 0) ? this.f29805A : c7927aArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f29806B;
    }

    public int getItemIconSize() {
        return this.f29825v;
    }

    public int getItemTextAppearanceActive() {
        return this.f29829z;
    }

    public int getItemTextAppearanceInactive() {
        return this.f29828y;
    }

    public ColorStateList getItemTextColor() {
        return this.f29826w;
    }

    public int getLabelVisibilityMode() {
        return this.f29820q;
    }

    public int getSelectedItemId() {
        return this.f29822s;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* renamed from: j */
    void m23966j(int i2) {
        int size = this.f29810F.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItem item = this.f29810F.getItem(i3);
            if (i2 == item.getItemId()) {
                this.f29822s = i2;
                this.f29823t = i3;
                item.setChecked(true);
                return;
            }
        }
    }

    /* renamed from: k */
    public void m23967k() {
        C0087g c0087g = this.f29810F;
        if (c0087g == null || this.f29821r == null) {
            return;
        }
        int size = c0087g.size();
        if (size != this.f29821r.length) {
            m23963d();
            return;
        }
        int i2 = this.f29822s;
        for (int i3 = 0; i3 < size; i3++) {
            MenuItem item = this.f29810F.getItem(i3);
            if (item.isChecked()) {
                this.f29822s = item.getItemId();
                this.f29823t = i3;
            }
        }
        if (i2 != this.f29822s) {
            C1050o.m6655a(this, this.f29811h);
        }
        boolean m23960g = m23960g(this.f29820q, this.f29810F.m561G().size());
        for (int i4 = 0; i4 < size; i4++) {
            this.f29809E.m23932m(true);
            this.f29821r[i4].setLabelVisibilityMode(this.f29820q);
            this.f29821r[i4].setShifting(m23960g);
            this.f29821r[i4].mo472e((C0089i) this.f29810F.getItem(i4), 0);
            this.f29809E.m23932m(false);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0289c.m1949y0(accessibilityNodeInfo).m1973a0(C0289c.b.m2016a(1, this.f29810F.m561G().size(), false, 1));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                if (C0311u.m2162y(this) == 1) {
                    int i10 = i6 - i8;
                    childAt.layout(i10 - childAt.getMeasuredWidth(), 0, i10, i7);
                } else {
                    childAt.layout(i8, 0, childAt.getMeasuredWidth() + i8, i7);
                }
                i8 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = this.f29810F.m561G().size();
        int childCount = getChildCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f29816m, 1073741824);
        if (m23960g(this.f29820q, size2) && this.f29819p) {
            View childAt = getChildAt(this.f29823t);
            int i4 = this.f29815l;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f29814k, Integer.MIN_VALUE), makeMeasureSpec);
                i4 = Math.max(i4, childAt.getMeasuredWidth());
            }
            int i5 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min = Math.min(size - (this.f29813j * i5), Math.min(i4, this.f29814k));
            int i6 = size - min;
            int min2 = Math.min(i6 / (i5 == 0 ? 1 : i5), this.f29812i);
            int i7 = i6 - (i5 * min2);
            int i8 = 0;
            while (i8 < childCount) {
                if (getChildAt(i8).getVisibility() != 8) {
                    int[] iArr = this.f29807C;
                    iArr[i8] = i8 == this.f29823t ? min : min2;
                    if (i7 > 0) {
                        iArr[i8] = iArr[i8] + 1;
                        i7--;
                    }
                } else {
                    this.f29807C[i8] = 0;
                }
                i8++;
            }
        } else {
            int min3 = Math.min(size / (size2 == 0 ? 1 : size2), this.f29814k);
            int i9 = size - (size2 * min3);
            for (int i10 = 0; i10 < childCount; i10++) {
                if (getChildAt(i10).getVisibility() != 8) {
                    int[] iArr2 = this.f29807C;
                    iArr2[i10] = min3;
                    if (i9 > 0) {
                        iArr2[i10] = iArr2[i10] + 1;
                        i9--;
                    }
                } else {
                    this.f29807C[i10] = 0;
                }
            }
        }
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.f29807C[i12], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i11 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i11, View.MeasureSpec.makeMeasureSpec(i11, 1073741824), 0), View.resolveSizeAndState(this.f29816m, makeMeasureSpec, 0));
    }

    void setBadgeDrawables(SparseArray<BadgeDrawable> sparseArray) {
        this.f29808D = sparseArray;
        C7927a[] c7927aArr = this.f29821r;
        if (c7927aArr != null) {
            for (C7927a c7927a : c7927aArr) {
                c7927a.setBadge(sparseArray.get(c7927a.getId()));
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f29824u = colorStateList;
        C7927a[] c7927aArr = this.f29821r;
        if (c7927aArr != null) {
            for (C7927a c7927a : c7927aArr) {
                c7927a.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f29805A = drawable;
        C7927a[] c7927aArr = this.f29821r;
        if (c7927aArr != null) {
            for (C7927a c7927a : c7927aArr) {
                c7927a.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i2) {
        this.f29806B = i2;
        C7927a[] c7927aArr = this.f29821r;
        if (c7927aArr != null) {
            for (C7927a c7927a : c7927aArr) {
                c7927a.setItemBackground(i2);
            }
        }
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.f29819p = z;
    }

    public void setItemIconSize(int i2) {
        this.f29825v = i2;
        C7927a[] c7927aArr = this.f29821r;
        if (c7927aArr != null) {
            for (C7927a c7927a : c7927aArr) {
                c7927a.setIconSize(i2);
            }
        }
    }

    public void setItemTextAppearanceActive(int i2) {
        this.f29829z = i2;
        C7927a[] c7927aArr = this.f29821r;
        if (c7927aArr != null) {
            for (C7927a c7927a : c7927aArr) {
                c7927a.setTextAppearanceActive(i2);
                ColorStateList colorStateList = this.f29826w;
                if (colorStateList != null) {
                    c7927a.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i2) {
        this.f29828y = i2;
        C7927a[] c7927aArr = this.f29821r;
        if (c7927aArr != null) {
            for (C7927a c7927a : c7927aArr) {
                c7927a.setTextAppearanceInactive(i2);
                ColorStateList colorStateList = this.f29826w;
                if (colorStateList != null) {
                    c7927a.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f29826w = colorStateList;
        C7927a[] c7927aArr = this.f29821r;
        if (c7927aArr != null) {
            for (C7927a c7927a : c7927aArr) {
                c7927a.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i2) {
        this.f29820q = i2;
    }

    public void setPresenter(BottomNavigationPresenter bottomNavigationPresenter) {
        this.f29809E = bottomNavigationPresenter;
    }

    public C7929c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29818o = new C0958h(5);
        this.f29822s = 0;
        this.f29823t = 0;
        this.f29808D = new SparseArray<>(5);
        Resources resources = getResources();
        this.f29812i = resources.getDimensionPixelSize(C8877d.f33871f);
        this.f29813j = resources.getDimensionPixelSize(C8877d.f33872g);
        this.f29814k = resources.getDimensionPixelSize(C8877d.f33867b);
        this.f29815l = resources.getDimensionPixelSize(C8877d.f33868c);
        this.f29816m = resources.getDimensionPixelSize(C8877d.f33869d);
        this.f29827x = m23964e(R.attr.textColorSecondary);
        C1025b c1025b = new C1025b();
        this.f29811h = c1025b;
        c1025b.m6671v0(0);
        c1025b.mo6632a0(115L);
        c1025b.mo6635c0(new C0988b());
        c1025b.m6664m0(new C7998i());
        this.f29817n = new a();
        this.f29807C = new int[5];
        C0311u.m2153t0(this, 1);
    }
}
