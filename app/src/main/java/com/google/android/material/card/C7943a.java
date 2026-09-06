package com.google.android.material.card;

import android.R;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.C0265a;
import androidx.core.view.C0311u;
import p241e.p254e.p256b.p271c.C8875b;
import p241e.p254e.p256b.p271c.C8877d;
import p241e.p254e.p256b.p271c.C8879f;
import p241e.p254e.p256b.p271c.C8884k;
import p241e.p254e.p256b.p271c.C8885l;
import p241e.p254e.p256b.p271c.p272a0.C8864d;
import p241e.p254e.p256b.p271c.p272a0.C8865e;
import p241e.p254e.p256b.p271c.p272a0.C8867g;
import p241e.p254e.p256b.p271c.p272a0.C8870j;
import p241e.p254e.p256b.p271c.p272a0.C8871k;
import p241e.p254e.p256b.p271c.p278q.C8904a;
import p241e.p254e.p256b.p271c.p285x.C8914c;
import p241e.p254e.p256b.p271c.p286y.C8919b;

/* compiled from: MaterialCardViewHelper.java */
/* renamed from: com.google.android.material.card.a */
/* loaded from: classes2.dex */
class C7943a {

    /* renamed from: a */
    private static final int[] f29942a = {R.attr.state_checked};

    /* renamed from: b */
    private static final double f29943b = Math.cos(Math.toRadians(45.0d));

    /* renamed from: c */
    private final MaterialCardView f29944c;

    /* renamed from: e */
    private final C8867g f29946e;

    /* renamed from: f */
    private final C8867g f29947f;

    /* renamed from: g */
    private final int f29948g;

    /* renamed from: h */
    private final int f29949h;

    /* renamed from: i */
    private int f29950i;

    /* renamed from: j */
    private Drawable f29951j;

    /* renamed from: k */
    private Drawable f29952k;

    /* renamed from: l */
    private ColorStateList f29953l;

    /* renamed from: m */
    private ColorStateList f29954m;

    /* renamed from: n */
    private C8871k f29955n;

    /* renamed from: o */
    private ColorStateList f29956o;

    /* renamed from: p */
    private Drawable f29957p;

    /* renamed from: q */
    private LayerDrawable f29958q;

    /* renamed from: r */
    private C8867g f29959r;

    /* renamed from: s */
    private C8867g f29960s;

    /* renamed from: u */
    private boolean f29962u;

    /* renamed from: d */
    private final Rect f29945d = new Rect();

    /* renamed from: t */
    private boolean f29961t = false;

    /* compiled from: MaterialCardViewHelper.java */
    /* renamed from: com.google.android.material.card.a$a */
    class a extends InsetDrawable {
        a(Drawable drawable, int i2, int i3, int i4, int i5) {
            super(drawable, i2, i3, i4, i5);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    public C7943a(MaterialCardView materialCardView, AttributeSet attributeSet, int i2, int i3) {
        this.f29944c = materialCardView;
        C8867g c8867g = new C8867g(materialCardView.getContext(), attributeSet, i2, i3);
        this.f29946e = c8867g;
        c8867g.m28278N(materialCardView.getContext());
        c8867g.m28289c0(-12303292);
        C8871k.b m28334v = c8867g.m28272D().m28334v();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, C8885l.f34223f0, i2, C8884k.f33976a);
        int i4 = C8885l.f34231g0;
        if (obtainStyledAttributes.hasValue(i4)) {
            m28334v.m28356o(obtainStyledAttributes.getDimension(i4, 0.0f));
        }
        this.f29947f = new C8867g();
        m24099N(m28334v.m28355m());
        Resources resources = materialCardView.getResources();
        this.f29948g = resources.getDimensionPixelSize(C8877d.f33854H);
        this.f29949h = resources.getDimensionPixelSize(C8877d.f33855I);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: R */
    private boolean m24070R() {
        return this.f29944c.getPreventCornerOverlap() && !m24078e();
    }

    /* renamed from: S */
    private boolean m24071S() {
        return this.f29944c.getPreventCornerOverlap() && m24078e() && this.f29944c.getUseCompatPadding();
    }

    /* renamed from: W */
    private void m24072W(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 23 || !(this.f29944c.getForeground() instanceof InsetDrawable)) {
            this.f29944c.setForeground(m24085z(drawable));
        } else {
            ((InsetDrawable) this.f29944c.getForeground()).setDrawable(drawable);
        }
    }

    /* renamed from: Y */
    private void m24073Y() {
        Drawable drawable;
        if (C8919b.f34450a && (drawable = this.f29957p) != null) {
            ((RippleDrawable) drawable).setColor(this.f29953l);
            return;
        }
        C8867g c8867g = this.f29959r;
        if (c8867g != null) {
            c8867g.m28284X(this.f29953l);
        }
    }

    /* renamed from: a */
    private float m24074a() {
        return Math.max(Math.max(m24075b(this.f29955n.m28329q(), this.f29946e.m28274G()), m24075b(this.f29955n.m28331s(), this.f29946e.m28275H())), Math.max(m24075b(this.f29955n.m28324k(), this.f29946e.m28298t()), m24075b(this.f29955n.m28322i(), this.f29946e.m28297s())));
    }

    /* renamed from: b */
    private float m24075b(C8864d c8864d, float f2) {
        if (!(c8864d instanceof C8870j)) {
            if (c8864d instanceof C8865e) {
                return f2 / 2.0f;
            }
            return 0.0f;
        }
        double d2 = 1.0d - f29943b;
        double d3 = f2;
        Double.isNaN(d3);
        return (float) (d2 * d3);
    }

    /* renamed from: c */
    private float m24076c() {
        return this.f29944c.getMaxCardElevation() + (m24071S() ? m24074a() : 0.0f);
    }

    /* renamed from: d */
    private float m24077d() {
        return (this.f29944c.getMaxCardElevation() * 1.5f) + (m24071S() ? m24074a() : 0.0f);
    }

    /* renamed from: e */
    private boolean m24078e() {
        return Build.VERSION.SDK_INT >= 21 && this.f29946e.m28280Q();
    }

    /* renamed from: f */
    private Drawable m24079f() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable drawable = this.f29952k;
        if (drawable != null) {
            stateListDrawable.addState(f29942a, drawable);
        }
        return stateListDrawable;
    }

    /* renamed from: g */
    private Drawable m24080g() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        C8867g m24082i = m24082i();
        this.f29959r = m24082i;
        m24082i.m28284X(this.f29953l);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, this.f29959r);
        return stateListDrawable;
    }

    /* renamed from: h */
    private Drawable m24081h() {
        if (!C8919b.f34450a) {
            return m24080g();
        }
        this.f29960s = m24082i();
        return new RippleDrawable(this.f29953l, null, this.f29960s);
    }

    /* renamed from: i */
    private C8867g m24082i() {
        return new C8867g(this.f29955n);
    }

    /* renamed from: p */
    private Drawable m24083p() {
        if (this.f29957p == null) {
            this.f29957p = m24081h();
        }
        if (this.f29958q == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f29957p, this.f29947f, m24079f()});
            this.f29958q = layerDrawable;
            layerDrawable.setId(2, C8879f.f33930t);
        }
        return this.f29958q;
    }

    /* renamed from: r */
    private float m24084r() {
        if (!this.f29944c.getPreventCornerOverlap()) {
            return 0.0f;
        }
        if (Build.VERSION.SDK_INT >= 21 && !this.f29944c.getUseCompatPadding()) {
            return 0.0f;
        }
        double d2 = 1.0d - f29943b;
        double cardViewRadius = this.f29944c.getCardViewRadius();
        Double.isNaN(cardViewRadius);
        return (float) (d2 * cardViewRadius);
    }

    /* renamed from: z */
    private Drawable m24085z(Drawable drawable) {
        int ceil;
        int i2;
        if ((Build.VERSION.SDK_INT < 21) || this.f29944c.getUseCompatPadding()) {
            int ceil2 = (int) Math.ceil(m24077d());
            ceil = (int) Math.ceil(m24076c());
            i2 = ceil2;
        } else {
            ceil = 0;
            i2 = 0;
        }
        return new a(drawable, ceil, i2, ceil, i2);
    }

    /* renamed from: A */
    boolean m24086A() {
        return this.f29961t;
    }

    /* renamed from: B */
    boolean m24087B() {
        return this.f29962u;
    }

    /* renamed from: C */
    void m24088C(TypedArray typedArray) {
        ColorStateList m28499a = C8914c.m28499a(this.f29944c.getContext(), typedArray, C8885l.f34290o3);
        this.f29956o = m28499a;
        if (m28499a == null) {
            this.f29956o = ColorStateList.valueOf(-1);
        }
        this.f29950i = typedArray.getDimensionPixelSize(C8885l.f34297p3, 0);
        boolean z = typedArray.getBoolean(C8885l.f34255j3, false);
        this.f29962u = z;
        this.f29944c.setLongClickable(z);
        this.f29954m = C8914c.m28499a(this.f29944c.getContext(), typedArray, C8885l.f34276m3);
        m24094I(C8914c.m28502d(this.f29944c.getContext(), typedArray, C8885l.f34269l3));
        ColorStateList m28499a2 = C8914c.m28499a(this.f29944c.getContext(), typedArray, C8885l.f34283n3);
        this.f29953l = m28499a2;
        if (m28499a2 == null) {
            this.f29953l = ColorStateList.valueOf(C8904a.m28472c(this.f29944c, C8875b.f33821k));
        }
        m24092G(C8914c.m28499a(this.f29944c.getContext(), typedArray, C8885l.f34262k3));
        m24073Y();
        m24105V();
        m24107Z();
        this.f29944c.setBackgroundInternal(m24085z(this.f29946e));
        Drawable m24083p = this.f29944c.isClickable() ? m24083p() : this.f29947f;
        this.f29951j = m24083p;
        this.f29944c.setForeground(m24085z(m24083p));
    }

    /* renamed from: D */
    void m24089D(int i2, int i3) {
        int i4;
        int i5;
        if (this.f29958q != null) {
            int i6 = this.f29948g;
            int i7 = this.f29949h;
            int i8 = (i2 - i6) - i7;
            int i9 = (i3 - i6) - i7;
            if ((Build.VERSION.SDK_INT < 21) || this.f29944c.getUseCompatPadding()) {
                i9 -= (int) Math.ceil(m24077d() * 2.0f);
                i8 -= (int) Math.ceil(m24076c() * 2.0f);
            }
            int i10 = i9;
            int i11 = this.f29948g;
            if (C0311u.m2162y(this.f29944c) == 1) {
                i5 = i8;
                i4 = i11;
            } else {
                i4 = i8;
                i5 = i11;
            }
            this.f29958q.setLayerInset(2, i4, this.f29948g, i5, i10);
        }
    }

    /* renamed from: E */
    void m24090E(boolean z) {
        this.f29961t = z;
    }

    /* renamed from: F */
    void m24091F(ColorStateList colorStateList) {
        this.f29946e.m28284X(colorStateList);
    }

    /* renamed from: G */
    void m24092G(ColorStateList colorStateList) {
        C8867g c8867g = this.f29947f;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        c8867g.m28284X(colorStateList);
    }

    /* renamed from: H */
    void m24093H(boolean z) {
        this.f29962u = z;
    }

    /* renamed from: I */
    void m24094I(Drawable drawable) {
        this.f29952k = drawable;
        if (drawable != null) {
            Drawable m1821r = C0265a.m1821r(drawable.mutate());
            this.f29952k = m1821r;
            C0265a.m1818o(m1821r, this.f29954m);
        }
        if (this.f29958q != null) {
            this.f29958q.setDrawableByLayerId(C8879f.f33930t, m24079f());
        }
    }

    /* renamed from: J */
    void m24095J(ColorStateList colorStateList) {
        this.f29954m = colorStateList;
        Drawable drawable = this.f29952k;
        if (drawable != null) {
            C0265a.m1818o(drawable, colorStateList);
        }
    }

    /* renamed from: K */
    void m24096K(float f2) {
        m24099N(this.f29955n.m28335w(f2));
        this.f29951j.invalidateSelf();
        if (m24071S() || m24070R()) {
            m24104U();
        }
        if (m24071S()) {
            m24106X();
        }
    }

    /* renamed from: L */
    void m24097L(float f2) {
        this.f29946e.m28285Y(f2);
        C8867g c8867g = this.f29947f;
        if (c8867g != null) {
            c8867g.m28285Y(f2);
        }
        C8867g c8867g2 = this.f29960s;
        if (c8867g2 != null) {
            c8867g2.m28285Y(f2);
        }
    }

    /* renamed from: M */
    void m24098M(ColorStateList colorStateList) {
        this.f29953l = colorStateList;
        m24073Y();
    }

    /* renamed from: N */
    void m24099N(C8871k c8871k) {
        this.f29955n = c8871k;
        this.f29946e.setShapeAppearanceModel(c8871k);
        this.f29946e.m28288b0(!r0.m28280Q());
        C8867g c8867g = this.f29947f;
        if (c8867g != null) {
            c8867g.setShapeAppearanceModel(c8871k);
        }
        C8867g c8867g2 = this.f29960s;
        if (c8867g2 != null) {
            c8867g2.setShapeAppearanceModel(c8871k);
        }
        C8867g c8867g3 = this.f29959r;
        if (c8867g3 != null) {
            c8867g3.setShapeAppearanceModel(c8871k);
        }
    }

    /* renamed from: O */
    void m24100O(ColorStateList colorStateList) {
        if (this.f29956o == colorStateList) {
            return;
        }
        this.f29956o = colorStateList;
        m24107Z();
    }

    /* renamed from: P */
    void m24101P(int i2) {
        if (i2 == this.f29950i) {
            return;
        }
        this.f29950i = i2;
        m24107Z();
    }

    /* renamed from: Q */
    void m24102Q(int i2, int i3, int i4, int i5) {
        this.f29945d.set(i2, i3, i4, i5);
        m24104U();
    }

    /* renamed from: T */
    void m24103T() {
        Drawable drawable = this.f29951j;
        Drawable m24083p = this.f29944c.isClickable() ? m24083p() : this.f29947f;
        this.f29951j = m24083p;
        if (drawable != m24083p) {
            m24072W(m24083p);
        }
    }

    /* renamed from: U */
    void m24104U() {
        int m24074a = (int) ((m24070R() || m24071S() ? m24074a() : 0.0f) - m24084r());
        MaterialCardView materialCardView = this.f29944c;
        Rect rect = this.f29945d;
        materialCardView.m24068k(rect.left + m24074a, rect.top + m24074a, rect.right + m24074a, rect.bottom + m24074a);
    }

    /* renamed from: V */
    void m24105V() {
        this.f29946e.m28283W(this.f29944c.getCardElevation());
    }

    /* renamed from: X */
    void m24106X() {
        if (!m24086A()) {
            this.f29944c.setBackgroundInternal(m24085z(this.f29946e));
        }
        this.f29944c.setForeground(m24085z(this.f29951j));
    }

    /* renamed from: Z */
    void m24107Z() {
        this.f29947f.m28292f0(this.f29950i, this.f29956o);
    }

    /* renamed from: j */
    void m24108j() {
        Drawable drawable = this.f29957p;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i2 = bounds.bottom;
            this.f29957p.setBounds(bounds.left, bounds.top, bounds.right, i2 - 1);
            this.f29957p.setBounds(bounds.left, bounds.top, bounds.right, i2);
        }
    }

    /* renamed from: k */
    C8867g m24109k() {
        return this.f29946e;
    }

    /* renamed from: l */
    ColorStateList m24110l() {
        return this.f29946e.m28301x();
    }

    /* renamed from: m */
    ColorStateList m24111m() {
        return this.f29947f.m28301x();
    }

    /* renamed from: n */
    Drawable m24112n() {
        return this.f29952k;
    }

    /* renamed from: o */
    ColorStateList m24113o() {
        return this.f29954m;
    }

    /* renamed from: q */
    float m24114q() {
        return this.f29946e.m28274G();
    }

    /* renamed from: s */
    float m24115s() {
        return this.f29946e.m28302y();
    }

    /* renamed from: t */
    ColorStateList m24116t() {
        return this.f29953l;
    }

    /* renamed from: u */
    C8871k m24117u() {
        return this.f29955n;
    }

    /* renamed from: v */
    int m24118v() {
        ColorStateList colorStateList = this.f29956o;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    /* renamed from: w */
    ColorStateList m24119w() {
        return this.f29956o;
    }

    /* renamed from: x */
    int m24120x() {
        return this.f29950i;
    }

    /* renamed from: y */
    Rect m24121y() {
        return this.f29945d;
    }
}
