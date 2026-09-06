package com.google.android.material.floatingactionbutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.graphics.drawable.C0265a;
import androidx.core.view.C0311u;
import com.google.android.material.internal.C7995f;
import java.util.ArrayList;
import java.util.Iterator;
import p024c.p052i.p059j.C0959i;
import p241e.p254e.p256b.p271c.C8860a;
import p241e.p254e.p256b.p271c.p272a0.C8867g;
import p241e.p254e.p256b.p271c.p272a0.C8868h;
import p241e.p254e.p256b.p271c.p272a0.C8871k;
import p241e.p254e.p256b.p271c.p272a0.InterfaceC8874n;
import p241e.p254e.p256b.p271c.p273m.C8886a;
import p241e.p254e.p256b.p271c.p273m.C8887b;
import p241e.p254e.p256b.p271c.p273m.C8891f;
import p241e.p254e.p256b.p271c.p273m.C8892g;
import p241e.p254e.p256b.p271c.p273m.C8893h;
import p241e.p254e.p256b.p271c.p286y.C8918a;
import p241e.p254e.p256b.p271c.p286y.C8919b;
import p241e.p254e.p256b.p271c.p287z.InterfaceC8921b;

/* compiled from: FloatingActionButtonImpl.java */
/* renamed from: com.google.android.material.floatingactionbutton.b */
/* loaded from: classes2.dex */
class C7983b {

    /* renamed from: a */
    static final TimeInterpolator f30249a = C8886a.f34372c;

    /* renamed from: b */
    static final int[] f30250b = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: c */
    static final int[] f30251c = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: d */
    static final int[] f30252d = {R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: e */
    static final int[] f30253e = {R.attr.state_hovered, R.attr.state_enabled};

    /* renamed from: f */
    static final int[] f30254f = {R.attr.state_enabled};

    /* renamed from: g */
    static final int[] f30255g = new int[0];

    /* renamed from: A */
    private int f30256A;

    /* renamed from: C */
    private ArrayList<Animator.AnimatorListener> f30258C;

    /* renamed from: D */
    private ArrayList<Animator.AnimatorListener> f30259D;

    /* renamed from: E */
    private ArrayList<i> f30260E;

    /* renamed from: F */
    final FloatingActionButton f30261F;

    /* renamed from: G */
    final InterfaceC8921b f30262G;

    /* renamed from: L */
    private ViewTreeObserver.OnPreDrawListener f30267L;

    /* renamed from: h */
    C8871k f30268h;

    /* renamed from: i */
    C8867g f30269i;

    /* renamed from: j */
    Drawable f30270j;

    /* renamed from: k */
    C7982a f30271k;

    /* renamed from: l */
    Drawable f30272l;

    /* renamed from: m */
    boolean f30273m;

    /* renamed from: o */
    float f30275o;

    /* renamed from: p */
    float f30276p;

    /* renamed from: q */
    float f30277q;

    /* renamed from: r */
    int f30278r;

    /* renamed from: s */
    private final C7995f f30279s;

    /* renamed from: t */
    private C8893h f30280t;

    /* renamed from: u */
    private C8893h f30281u;

    /* renamed from: v */
    private Animator f30282v;

    /* renamed from: w */
    private C8893h f30283w;

    /* renamed from: x */
    private C8893h f30284x;

    /* renamed from: y */
    private float f30285y;

    /* renamed from: n */
    boolean f30274n = true;

    /* renamed from: z */
    private float f30286z = 1.0f;

    /* renamed from: B */
    private int f30257B = 0;

    /* renamed from: H */
    private final Rect f30263H = new Rect();

    /* renamed from: I */
    private final RectF f30264I = new RectF();

    /* renamed from: J */
    private final RectF f30265J = new RectF();

    /* renamed from: K */
    private final Matrix f30266K = new Matrix();

    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.b$a */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f30287a;

        /* renamed from: b */
        final /* synthetic */ boolean f30288b;

        /* renamed from: c */
        final /* synthetic */ j f30289c;

        a(boolean z, j jVar) {
            this.f30288b = z;
            this.f30289c = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f30287a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C7983b.this.f30257B = 0;
            C7983b.this.f30282v = null;
            if (this.f30287a) {
                return;
            }
            FloatingActionButton floatingActionButton = C7983b.this.f30261F;
            boolean z = this.f30288b;
            floatingActionButton.m24703b(z ? 8 : 4, z);
            j jVar = this.f30289c;
            if (jVar != null) {
                jVar.mo24494b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C7983b.this.f30261F.m24703b(0, this.f30288b);
            C7983b.this.f30257B = 1;
            C7983b.this.f30282v = animator;
            this.f30287a = false;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.b$b */
    class b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f30291a;

        /* renamed from: b */
        final /* synthetic */ j f30292b;

        b(boolean z, j jVar) {
            this.f30291a = z;
            this.f30292b = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C7983b.this.f30257B = 0;
            C7983b.this.f30282v = null;
            j jVar = this.f30292b;
            if (jVar != null) {
                jVar.mo24493a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C7983b.this.f30261F.m24703b(0, this.f30291a);
            C7983b.this.f30257B = 2;
            C7983b.this.f30282v = animator;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.b$c */
    class c extends C8892g {
        c() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f2, Matrix matrix, Matrix matrix2) {
            C7983b.this.f30286z = f2;
            return super.evaluate(f2, matrix, matrix2);
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.b$d */
    class d implements TypeEvaluator<Float> {

        /* renamed from: a */
        FloatEvaluator f30295a = new FloatEvaluator();

        d() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float evaluate(float f2, Float f3, Float f4) {
            float floatValue = this.f30295a.evaluate(f2, (Number) f3, (Number) f4).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.b$e */
    class e implements ViewTreeObserver.OnPreDrawListener {
        e() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            C7983b.this.m24524H();
            return true;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.b$f */
    private class f extends l {
        f() {
            super(C7983b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.C7983b.l
        /* renamed from: a */
        protected float mo24568a() {
            return 0.0f;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.b$g */
    private class g extends l {
        g() {
            super(C7983b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.C7983b.l
        /* renamed from: a */
        protected float mo24568a() {
            C7983b c7983b = C7983b.this;
            return c7983b.f30275o + c7983b.f30276p;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.b$h */
    private class h extends l {
        h() {
            super(C7983b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.C7983b.l
        /* renamed from: a */
        protected float mo24568a() {
            C7983b c7983b = C7983b.this;
            return c7983b.f30275o + c7983b.f30277q;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.b$i */
    interface i {
        /* renamed from: a */
        void mo24498a();

        /* renamed from: b */
        void mo24499b();
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.b$j */
    interface j {
        /* renamed from: a */
        void mo24493a();

        /* renamed from: b */
        void mo24494b();
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.b$k */
    private class k extends l {
        k() {
            super(C7983b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.C7983b.l
        /* renamed from: a */
        protected float mo24568a() {
            return C7983b.this.f30275o;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.b$l */
    private abstract class l extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private boolean f30302a;

        /* renamed from: b */
        private float f30303b;

        /* renamed from: c */
        private float f30304c;

        private l() {
        }

        /* renamed from: a */
        protected abstract float mo24568a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C7983b.this.m24551g0((int) this.f30304c);
            this.f30302a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f30302a) {
                C8867g c8867g = C7983b.this.f30269i;
                this.f30303b = c8867g == null ? 0.0f : c8867g.m28300w();
                this.f30304c = mo24568a();
                this.f30302a = true;
            }
            C7983b c7983b = C7983b.this;
            float f2 = this.f30303b;
            c7983b.m24551g0((int) (f2 + ((this.f30304c - f2) * valueAnimator.getAnimatedFraction())));
        }

        /* synthetic */ l(C7983b c7983b, a aVar) {
            this();
        }
    }

    C7983b(FloatingActionButton floatingActionButton, InterfaceC8921b interfaceC8921b) {
        this.f30261F = floatingActionButton;
        this.f30262G = interfaceC8921b;
        C7995f c7995f = new C7995f();
        this.f30279s = c7995f;
        c7995f.m24665a(f30250b, m24513i(new h()));
        c7995f.m24665a(f30251c, m24513i(new g()));
        c7995f.m24665a(f30252d, m24513i(new g()));
        c7995f.m24665a(f30253e, m24513i(new g()));
        c7995f.m24665a(f30254f, m24513i(new k()));
        c7995f.m24665a(f30255g, m24513i(new f()));
        this.f30285y = floatingActionButton.getRotation();
    }

    /* renamed from: a0 */
    private boolean m24507a0() {
        return C0311u.m2102O(this.f30261F) && !this.f30261F.isInEditMode();
    }

    /* renamed from: g */
    private void m24510g(float f2, Matrix matrix) {
        matrix.reset();
        if (this.f30261F.getDrawable() == null || this.f30256A == 0) {
            return;
        }
        RectF rectF = this.f30264I;
        RectF rectF2 = this.f30265J;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        int i2 = this.f30256A;
        rectF2.set(0.0f, 0.0f, i2, i2);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i3 = this.f30256A;
        matrix.postScale(f2, f2, i3 / 2.0f, i3 / 2.0f);
    }

    /* renamed from: h */
    private AnimatorSet m24511h(C8893h c8893h, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f30261F, (Property<FloatingActionButton, Float>) View.ALPHA, f2);
        c8893h.m28444e("opacity").m28451a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f30261F, (Property<FloatingActionButton, Float>) View.SCALE_X, f3);
        c8893h.m28444e("scale").m28451a(ofFloat2);
        m24512h0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f30261F, (Property<FloatingActionButton, Float>) View.SCALE_Y, f3);
        c8893h.m28444e("scale").m28451a(ofFloat3);
        m24512h0(ofFloat3);
        arrayList.add(ofFloat3);
        m24510g(f4, this.f30266K);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f30261F, new C8891f(), new c(), new Matrix(this.f30266K));
        c8893h.m28444e("iconScale").m28451a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C8887b.m28431a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: h0 */
    private void m24512h0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new d());
    }

    /* renamed from: i */
    private ValueAnimator m24513i(l lVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f30249a);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(lVar);
        valueAnimator.addUpdateListener(lVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    /* renamed from: l */
    private C8893h m24514l() {
        if (this.f30281u == null) {
            this.f30281u = C8893h.m28442c(this.f30261F.getContext(), C8860a.f33674a);
        }
        return (C8893h) C0959i.m6065c(this.f30281u);
    }

    /* renamed from: m */
    private C8893h m24515m() {
        if (this.f30280t == null) {
            this.f30280t = C8893h.m28442c(this.f30261F.getContext(), C8860a.f33675b);
        }
        return (C8893h) C0959i.m6065c(this.f30280t);
    }

    /* renamed from: r */
    private ViewTreeObserver.OnPreDrawListener m24516r() {
        if (this.f30267L == null) {
            this.f30267L = new e();
        }
        return this.f30267L;
    }

    /* renamed from: A */
    void mo24517A() {
        this.f30279s.m24666c();
    }

    /* renamed from: B */
    void m24518B() {
        C8867g c8867g = this.f30269i;
        if (c8867g != null) {
            C8868h.m28312f(this.f30261F, c8867g);
        }
        if (mo24527K()) {
            this.f30261F.getViewTreeObserver().addOnPreDrawListener(m24516r());
        }
    }

    /* renamed from: C */
    void mo24519C() {
    }

    /* renamed from: D */
    void m24520D() {
        ViewTreeObserver viewTreeObserver = this.f30261F.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f30267L;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f30267L = null;
        }
    }

    /* renamed from: E */
    void mo24521E(int[] iArr) {
        this.f30279s.m24667d(iArr);
    }

    /* renamed from: F */
    void mo24522F(float f2, float f3, float f4) {
        m24550f0();
        m24551g0(f2);
    }

    /* renamed from: G */
    void m24523G(Rect rect) {
        C0959i.m6066d(this.f30272l, "Didn't initialize content background");
        if (!mo24542Z()) {
            this.f30262G.mo24496b(this.f30272l);
        } else {
            this.f30262G.mo24496b(new InsetDrawable(this.f30272l, rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    /* renamed from: H */
    void m24524H() {
        float rotation = this.f30261F.getRotation();
        if (this.f30285y != rotation) {
            this.f30285y = rotation;
            mo24546d0();
        }
    }

    /* renamed from: I */
    void m24525I() {
        ArrayList<i> arrayList = this.f30260E;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo24499b();
            }
        }
    }

    /* renamed from: J */
    void m24526J() {
        ArrayList<i> arrayList = this.f30260E;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo24498a();
            }
        }
    }

    /* renamed from: K */
    boolean mo24527K() {
        return true;
    }

    /* renamed from: L */
    void m24528L(ColorStateList colorStateList) {
        C8867g c8867g = this.f30269i;
        if (c8867g != null) {
            c8867g.setTintList(colorStateList);
        }
        C7982a c7982a = this.f30271k;
        if (c7982a != null) {
            c7982a.m24502c(colorStateList);
        }
    }

    /* renamed from: M */
    void m24529M(PorterDuff.Mode mode) {
        C8867g c8867g = this.f30269i;
        if (c8867g != null) {
            c8867g.setTintMode(mode);
        }
    }

    /* renamed from: N */
    final void m24530N(float f2) {
        if (this.f30275o != f2) {
            this.f30275o = f2;
            mo24522F(f2, this.f30276p, this.f30277q);
        }
    }

    /* renamed from: O */
    void m24531O(boolean z) {
        this.f30273m = z;
    }

    /* renamed from: P */
    final void m24532P(C8893h c8893h) {
        this.f30284x = c8893h;
    }

    /* renamed from: Q */
    final void m24533Q(float f2) {
        if (this.f30276p != f2) {
            this.f30276p = f2;
            mo24522F(this.f30275o, f2, this.f30277q);
        }
    }

    /* renamed from: R */
    final void m24534R(float f2) {
        this.f30286z = f2;
        Matrix matrix = this.f30266K;
        m24510g(f2, matrix);
        this.f30261F.setImageMatrix(matrix);
    }

    /* renamed from: S */
    final void m24535S(int i2) {
        if (this.f30256A != i2) {
            this.f30256A = i2;
            m24548e0();
        }
    }

    /* renamed from: T */
    void m24536T(int i2) {
        this.f30278r = i2;
    }

    /* renamed from: U */
    final void m24537U(float f2) {
        if (this.f30277q != f2) {
            this.f30277q = f2;
            mo24522F(this.f30275o, this.f30276p, f2);
        }
    }

    /* renamed from: V */
    void mo24538V(ColorStateList colorStateList) {
        Drawable drawable = this.f30270j;
        if (drawable != null) {
            C0265a.m1818o(drawable, C8919b.m28522d(colorStateList));
        }
    }

    /* renamed from: W */
    void m24539W(boolean z) {
        this.f30274n = z;
        m24550f0();
    }

    /* renamed from: X */
    final void m24540X(C8871k c8871k) {
        this.f30268h = c8871k;
        C8867g c8867g = this.f30269i;
        if (c8867g != null) {
            c8867g.setShapeAppearanceModel(c8871k);
        }
        Object obj = this.f30270j;
        if (obj instanceof InterfaceC8874n) {
            ((InterfaceC8874n) obj).setShapeAppearanceModel(c8871k);
        }
        C7982a c7982a = this.f30271k;
        if (c7982a != null) {
            c7982a.m24505f(c8871k);
        }
    }

    /* renamed from: Y */
    final void m24541Y(C8893h c8893h) {
        this.f30283w = c8893h;
    }

    /* renamed from: Z */
    boolean mo24542Z() {
        return true;
    }

    /* renamed from: b0 */
    final boolean m24543b0() {
        return !this.f30273m || this.f30261F.getSizeDimension() >= this.f30278r;
    }

    /* renamed from: c0 */
    void m24544c0(j jVar, boolean z) {
        if (m24565z()) {
            return;
        }
        Animator animator = this.f30282v;
        if (animator != null) {
            animator.cancel();
        }
        if (!m24507a0()) {
            this.f30261F.m24703b(0, z);
            this.f30261F.setAlpha(1.0f);
            this.f30261F.setScaleY(1.0f);
            this.f30261F.setScaleX(1.0f);
            m24534R(1.0f);
            if (jVar != null) {
                jVar.mo24493a();
                return;
            }
            return;
        }
        if (this.f30261F.getVisibility() != 0) {
            this.f30261F.setAlpha(0.0f);
            this.f30261F.setScaleY(0.0f);
            this.f30261F.setScaleX(0.0f);
            m24534R(0.0f);
        }
        C8893h c8893h = this.f30283w;
        if (c8893h == null) {
            c8893h = m24515m();
        }
        AnimatorSet m24511h = m24511h(c8893h, 1.0f, 1.0f, 1.0f);
        m24511h.addListener(new b(z, jVar));
        ArrayList<Animator.AnimatorListener> arrayList = this.f30258C;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                m24511h.addListener(it.next());
            }
        }
        m24511h.start();
    }

    /* renamed from: d */
    public void m24545d(Animator.AnimatorListener animatorListener) {
        if (this.f30259D == null) {
            this.f30259D = new ArrayList<>();
        }
        this.f30259D.add(animatorListener);
    }

    /* renamed from: d0 */
    void mo24546d0() {
        if (Build.VERSION.SDK_INT == 19) {
            if (this.f30285y % 90.0f != 0.0f) {
                if (this.f30261F.getLayerType() != 1) {
                    this.f30261F.setLayerType(1, null);
                }
            } else if (this.f30261F.getLayerType() != 0) {
                this.f30261F.setLayerType(0, null);
            }
        }
        C8867g c8867g = this.f30269i;
        if (c8867g != null) {
            c8867g.m28290d0((int) this.f30285y);
        }
    }

    /* renamed from: e */
    void m24547e(Animator.AnimatorListener animatorListener) {
        if (this.f30258C == null) {
            this.f30258C = new ArrayList<>();
        }
        this.f30258C.add(animatorListener);
    }

    /* renamed from: e0 */
    final void m24548e0() {
        m24534R(this.f30286z);
    }

    /* renamed from: f */
    void m24549f(i iVar) {
        if (this.f30260E == null) {
            this.f30260E = new ArrayList<>();
        }
        this.f30260E.add(iVar);
    }

    /* renamed from: f0 */
    final void m24550f0() {
        Rect rect = this.f30263H;
        mo24558s(rect);
        m24523G(rect);
        this.f30262G.mo24495a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: g0 */
    void m24551g0(float f2) {
        C8867g c8867g = this.f30269i;
        if (c8867g != null) {
            c8867g.m28283W(f2);
        }
    }

    /* renamed from: j */
    C8867g mo24552j() {
        return new C8867g((C8871k) C0959i.m6065c(this.f30268h));
    }

    /* renamed from: k */
    final Drawable m24553k() {
        return this.f30272l;
    }

    /* renamed from: n */
    float mo24554n() {
        return this.f30275o;
    }

    /* renamed from: o */
    boolean m24555o() {
        return this.f30273m;
    }

    /* renamed from: p */
    final C8893h m24556p() {
        return this.f30284x;
    }

    /* renamed from: q */
    float m24557q() {
        return this.f30276p;
    }

    /* renamed from: s */
    void mo24558s(Rect rect) {
        int sizeDimension = this.f30273m ? (this.f30278r - this.f30261F.getSizeDimension()) / 2 : 0;
        int max = Math.max(sizeDimension, (int) Math.ceil(this.f30274n ? mo24554n() + this.f30277q : 0.0f));
        int max2 = Math.max(sizeDimension, (int) Math.ceil(r1 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    /* renamed from: t */
    float m24559t() {
        return this.f30277q;
    }

    /* renamed from: u */
    final C8871k m24560u() {
        return this.f30268h;
    }

    /* renamed from: v */
    final C8893h m24561v() {
        return this.f30283w;
    }

    /* renamed from: w */
    void m24562w(j jVar, boolean z) {
        if (m24564y()) {
            return;
        }
        Animator animator = this.f30282v;
        if (animator != null) {
            animator.cancel();
        }
        if (!m24507a0()) {
            this.f30261F.m24703b(z ? 8 : 4, z);
            if (jVar != null) {
                jVar.mo24494b();
                return;
            }
            return;
        }
        C8893h c8893h = this.f30284x;
        if (c8893h == null) {
            c8893h = m24514l();
        }
        AnimatorSet m24511h = m24511h(c8893h, 0.0f, 0.0f, 0.0f);
        m24511h.addListener(new a(z, jVar));
        ArrayList<Animator.AnimatorListener> arrayList = this.f30259D;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                m24511h.addListener(it.next());
            }
        }
        m24511h.start();
    }

    /* renamed from: x */
    void mo24563x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i2) {
        C8867g mo24552j = mo24552j();
        this.f30269i = mo24552j;
        mo24552j.setTintList(colorStateList);
        if (mode != null) {
            this.f30269i.setTintMode(mode);
        }
        this.f30269i.m28289c0(-12303292);
        this.f30269i.m28278N(this.f30261F.getContext());
        C8918a c8918a = new C8918a(this.f30269i.m28272D());
        c8918a.setTintList(C8919b.m28522d(colorStateList2));
        this.f30270j = c8918a;
        this.f30272l = new LayerDrawable(new Drawable[]{(Drawable) C0959i.m6065c(this.f30269i), c8918a});
    }

    /* renamed from: y */
    boolean m24564y() {
        return this.f30261F.getVisibility() == 0 ? this.f30257B == 1 : this.f30257B != 2;
    }

    /* renamed from: z */
    boolean m24565z() {
        return this.f30261F.getVisibility() != 0 ? this.f30257B == 2 : this.f30257B != 1;
    }
}
