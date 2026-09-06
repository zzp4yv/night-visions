package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0311u;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p241e.p254e.p256b.p271c.C8879f;
import p241e.p254e.p256b.p271c.p273m.C8886a;
import p241e.p254e.p256b.p271c.p273m.C8887b;
import p241e.p254e.p256b.p271c.p273m.C8888c;
import p241e.p254e.p256b.p271c.p273m.C8889d;
import p241e.p254e.p256b.p271c.p273m.C8890e;
import p241e.p254e.p256b.p271c.p273m.C8893h;
import p241e.p254e.p256b.p271c.p273m.C8894i;
import p241e.p254e.p256b.p271c.p273m.C8895j;
import p241e.p254e.p256b.p271c.p276p.C8899a;
import p241e.p254e.p256b.p271c.p276p.C8901c;
import p241e.p254e.p256b.p271c.p276p.InterfaceC8902d;
import p241e.p254e.p256b.p271c.p283v.C8910a;

@Deprecated
/* loaded from: classes2.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final Rect f30609c;

    /* renamed from: d */
    private final RectF f30610d;

    /* renamed from: e */
    private final RectF f30611e;

    /* renamed from: f */
    private final int[] f30612f;

    /* renamed from: g */
    private float f30613g;

    /* renamed from: h */
    private float f30614h;

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    class C8049a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f30615a;

        /* renamed from: b */
        final /* synthetic */ View f30616b;

        /* renamed from: c */
        final /* synthetic */ View f30617c;

        C8049a(boolean z, View view, View view2) {
            this.f30615a = z;
            this.f30616b = view;
            this.f30617c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f30615a) {
                return;
            }
            this.f30616b.setVisibility(4);
            this.f30617c.setAlpha(1.0f);
            this.f30617c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f30615a) {
                this.f30616b.setVisibility(0);
                this.f30617c.setAlpha(0.0f);
                this.f30617c.setVisibility(4);
            }
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    class C8050b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f30619a;

        C8050b(View view) {
            this.f30619a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f30619a.invalidate();
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$c */
    class C8051c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ InterfaceC8902d f30621a;

        /* renamed from: b */
        final /* synthetic */ Drawable f30622b;

        C8051c(InterfaceC8902d interfaceC8902d, Drawable drawable) {
            this.f30621a = interfaceC8902d;
            this.f30622b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f30621a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f30621a.setCircularRevealOverlayDrawable(this.f30622b);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$d */
    class C8052d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ InterfaceC8902d f30624a;

        C8052d(InterfaceC8902d interfaceC8902d) {
            this.f30624a = interfaceC8902d;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            InterfaceC8902d.e revealInfo = this.f30624a.getRevealInfo();
            revealInfo.f34406c = Float.MAX_VALUE;
            this.f30624a.setRevealInfo(revealInfo);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$e */
    protected static class C8053e {

        /* renamed from: a */
        public C8893h f30626a;

        /* renamed from: b */
        public C8895j f30627b;

        protected C8053e() {
        }
    }

    public FabTransformationBehavior() {
        this.f30609c = new Rect();
        this.f30610d = new RectF();
        this.f30611e = new RectF();
        this.f30612f = new int[2];
    }

    /* renamed from: K */
    private ViewGroup m24913K(View view) {
        View findViewById = view.findViewById(C8879f.f33931u);
        return findViewById != null ? m24933f0(findViewById) : ((view instanceof C8056b) || (view instanceof C8055a)) ? m24933f0(((ViewGroup) view).getChildAt(0)) : m24933f0(view);
    }

    /* renamed from: L */
    private void m24914L(View view, C8053e c8053e, C8894i c8894i, C8894i c8894i2, float f2, float f3, float f4, float f5, RectF rectF) {
        float m24921S = m24921S(c8053e, c8894i, f2, f4);
        float m24921S2 = m24921S(c8053e, c8894i2, f3, f5);
        Rect rect = this.f30609c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f30610d;
        rectF2.set(rect);
        RectF rectF3 = this.f30611e;
        m24922T(view, rectF3);
        rectF3.offset(m24921S, m24921S2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    /* renamed from: M */
    private void m24915M(View view, RectF rectF) {
        m24922T(view, rectF);
        rectF.offset(this.f30613g, this.f30614h);
    }

    /* renamed from: N */
    private Pair<C8894i, C8894i> m24916N(float f2, float f3, boolean z, C8053e c8053e) {
        C8894i m28444e;
        C8894i m28444e2;
        if (f2 == 0.0f || f3 == 0.0f) {
            m28444e = c8053e.f30626a.m28444e("translationXLinear");
            m28444e2 = c8053e.f30626a.m28444e("translationYLinear");
        } else if ((!z || f3 >= 0.0f) && (z || f3 <= 0.0f)) {
            m28444e = c8053e.f30626a.m28444e("translationXCurveDownwards");
            m28444e2 = c8053e.f30626a.m28444e("translationYCurveDownwards");
        } else {
            m28444e = c8053e.f30626a.m28444e("translationXCurveUpwards");
            m28444e2 = c8053e.f30626a.m28444e("translationYCurveUpwards");
        }
        return new Pair<>(m28444e, m28444e2);
    }

    /* renamed from: O */
    private float m24917O(View view, View view2, C8895j c8895j) {
        RectF rectF = this.f30610d;
        RectF rectF2 = this.f30611e;
        m24915M(view, rectF);
        m24922T(view2, rectF2);
        rectF2.offset(-m24919Q(view, view2, c8895j), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    /* renamed from: P */
    private float m24918P(View view, View view2, C8895j c8895j) {
        RectF rectF = this.f30610d;
        RectF rectF2 = this.f30611e;
        m24915M(view, rectF);
        m24922T(view2, rectF2);
        rectF2.offset(0.0f, -m24920R(view, view2, c8895j));
        return rectF.centerY() - rectF2.top;
    }

    /* renamed from: Q */
    private float m24919Q(View view, View view2, C8895j c8895j) {
        float centerX;
        float centerX2;
        float f2;
        RectF rectF = this.f30610d;
        RectF rectF2 = this.f30611e;
        m24915M(view, rectF);
        m24922T(view2, rectF2);
        int i2 = c8895j.f34390a & 7;
        if (i2 == 1) {
            centerX = rectF2.centerX();
            centerX2 = rectF.centerX();
        } else if (i2 == 3) {
            centerX = rectF2.left;
            centerX2 = rectF.left;
        } else {
            if (i2 != 5) {
                f2 = 0.0f;
                return f2 + c8895j.f34391b;
            }
            centerX = rectF2.right;
            centerX2 = rectF.right;
        }
        f2 = centerX - centerX2;
        return f2 + c8895j.f34391b;
    }

    /* renamed from: R */
    private float m24920R(View view, View view2, C8895j c8895j) {
        float centerY;
        float centerY2;
        float f2;
        RectF rectF = this.f30610d;
        RectF rectF2 = this.f30611e;
        m24915M(view, rectF);
        m24922T(view2, rectF2);
        int i2 = c8895j.f34390a & 112;
        if (i2 == 16) {
            centerY = rectF2.centerY();
            centerY2 = rectF.centerY();
        } else if (i2 == 48) {
            centerY = rectF2.top;
            centerY2 = rectF.top;
        } else {
            if (i2 != 80) {
                f2 = 0.0f;
                return f2 + c8895j.f34392c;
            }
            centerY = rectF2.bottom;
            centerY2 = rectF.bottom;
        }
        f2 = centerY - centerY2;
        return f2 + c8895j.f34392c;
    }

    /* renamed from: S */
    private float m24921S(C8053e c8053e, C8894i c8894i, float f2, float f3) {
        long m28452c = c8894i.m28452c();
        long m28453d = c8894i.m28453d();
        C8894i m28444e = c8053e.f30626a.m28444e("expansion");
        return C8886a.m28430a(f2, f3, c8894i.m28454e().getInterpolation((((m28444e.m28452c() + m28444e.m28453d()) + 17) - m28452c) / m28453d));
    }

    /* renamed from: T */
    private void m24922T(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f30612f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    /* renamed from: U */
    private void m24923U(View view, View view2, boolean z, boolean z2, C8053e c8053e, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup m24913K;
        ObjectAnimator ofFloat;
        if (view2 instanceof ViewGroup) {
            if (((view2 instanceof InterfaceC8902d) && C8901c.f34399a == 0) || (m24913K = m24913K(view2)) == null) {
                return;
            }
            if (z) {
                if (!z2) {
                    C8889d.f34376a.set(m24913K, Float.valueOf(0.0f));
                }
                ofFloat = ObjectAnimator.ofFloat(m24913K, C8889d.f34376a, 1.0f);
            } else {
                ofFloat = ObjectAnimator.ofFloat(m24913K, C8889d.f34376a, 0.0f);
            }
            c8053e.f30626a.m28444e("contentFade").m28451a(ofFloat);
            list.add(ofFloat);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: V */
    private void m24924V(View view, View view2, boolean z, boolean z2, C8053e c8053e, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if (view2 instanceof InterfaceC8902d) {
            InterfaceC8902d interfaceC8902d = (InterfaceC8902d) view2;
            int m24932d0 = m24932d0(view);
            int i2 = 16777215 & m24932d0;
            if (z) {
                if (!z2) {
                    interfaceC8902d.setCircularRevealScrimColor(m24932d0);
                }
                ofInt = ObjectAnimator.ofInt(interfaceC8902d, InterfaceC8902d.d.f34403a, i2);
            } else {
                ofInt = ObjectAnimator.ofInt(interfaceC8902d, InterfaceC8902d.d.f34403a, m24932d0);
            }
            ofInt.setEvaluator(C8888c.m28432b());
            c8053e.f30626a.m28444e("color").m28451a(ofInt);
            list.add(ofInt);
        }
    }

    /* renamed from: W */
    private void m24925W(View view, View view2, boolean z, C8053e c8053e, List<Animator> list) {
        float m24919Q = m24919Q(view, view2, c8053e.f30627b);
        float m24920R = m24920R(view, view2, c8053e.f30627b);
        Pair<C8894i, C8894i> m24916N = m24916N(m24919Q, m24920R, z, c8053e);
        C8894i c8894i = (C8894i) m24916N.first;
        C8894i c8894i2 = (C8894i) m24916N.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            m24919Q = this.f30613g;
        }
        fArr[0] = m24919Q;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            m24920R = this.f30614h;
        }
        fArr2[0] = m24920R;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        c8894i.m28451a(ofFloat);
        c8894i2.m28451a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    @TargetApi(21)
    /* renamed from: X */
    private void m24926X(View view, View view2, boolean z, boolean z2, C8053e c8053e, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofFloat;
        float m2152t = C0311u.m2152t(view2) - C0311u.m2152t(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-m2152t);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -m2152t);
        }
        c8053e.f30626a.m28444e("elevation").m28451a(ofFloat);
        list.add(ofFloat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Y */
    private void m24927Y(View view, View view2, boolean z, boolean z2, C8053e c8053e, float f2, float f3, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        if (view2 instanceof InterfaceC8902d) {
            InterfaceC8902d interfaceC8902d = (InterfaceC8902d) view2;
            float m24917O = m24917O(view, view2, c8053e.f30627b);
            float m24918P = m24918P(view, view2, c8053e.f30627b);
            ((FloatingActionButton) view).m24477i(this.f30609c);
            float width = this.f30609c.width() / 2.0f;
            C8894i m28444e = c8053e.f30626a.m28444e("expansion");
            if (z) {
                if (!z2) {
                    interfaceC8902d.setRevealInfo(new InterfaceC8902d.e(m24917O, m24918P, width));
                }
                if (z2) {
                    width = interfaceC8902d.getRevealInfo().f34406c;
                }
                animator = C8899a.m28460a(interfaceC8902d, m24917O, m24918P, C8910a.m28490b(m24917O, m24918P, 0.0f, 0.0f, f2, f3));
                animator.addListener(new C8052d(interfaceC8902d));
                m24930b0(view2, m28444e.m28452c(), (int) m24917O, (int) m24918P, width, list);
            } else {
                float f4 = interfaceC8902d.getRevealInfo().f34406c;
                Animator m28460a = C8899a.m28460a(interfaceC8902d, m24917O, m24918P, width);
                int i2 = (int) m24917O;
                int i3 = (int) m24918P;
                m24930b0(view2, m28444e.m28452c(), i2, i3, f4, list);
                m24929a0(view2, m28444e.m28452c(), m28444e.m28453d(), c8053e.f30626a.m28445f(), i2, i3, width, list);
                animator = m28460a;
            }
            m28444e.m28451a(animator);
            list.add(animator);
            list2.add(C8899a.m28461b(interfaceC8902d));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Z */
    private void m24928Z(View view, View view2, boolean z, boolean z2, C8053e c8053e, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if ((view2 instanceof InterfaceC8902d) && (view instanceof ImageView)) {
            InterfaceC8902d interfaceC8902d = (InterfaceC8902d) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z) {
                if (!z2) {
                    drawable.setAlpha(255);
                }
                ofInt = ObjectAnimator.ofInt(drawable, C8890e.f34377a, 0);
            } else {
                ofInt = ObjectAnimator.ofInt(drawable, C8890e.f34377a, 255);
            }
            ofInt.addUpdateListener(new C8050b(view2));
            c8053e.f30626a.m28444e("iconFade").m28451a(ofInt);
            list.add(ofInt);
            list2.add(new C8051c(interfaceC8902d, drawable));
        }
    }

    /* renamed from: a0 */
    private void m24929a0(View view, long j2, long j3, long j4, int i2, int i3, float f2, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21) {
            long j5 = j2 + j3;
            if (j5 < j4) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i2, i3, f2, f2);
                createCircularReveal.setStartDelay(j5);
                createCircularReveal.setDuration(j4 - j5);
                list.add(createCircularReveal);
            }
        }
    }

    /* renamed from: b0 */
    private void m24930b0(View view, long j2, int i2, int i3, float f2, List<Animator> list) {
        if (Build.VERSION.SDK_INT < 21 || j2 <= 0) {
            return;
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i2, i3, f2, f2);
        createCircularReveal.setStartDelay(0L);
        createCircularReveal.setDuration(j2);
        list.add(createCircularReveal);
    }

    /* renamed from: c0 */
    private void m24931c0(View view, View view2, boolean z, boolean z2, C8053e c8053e, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        float m24919Q = m24919Q(view, view2, c8053e.f30627b);
        float m24920R = m24920R(view, view2, c8053e.f30627b);
        Pair<C8894i, C8894i> m24916N = m24916N(m24919Q, m24920R, z, c8053e);
        C8894i c8894i = (C8894i) m24916N.first;
        C8894i c8894i2 = (C8894i) m24916N.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-m24919Q);
                view2.setTranslationY(-m24920R);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            m24914L(view2, c8053e, c8894i, c8894i2, -m24919Q, -m24920R, 0.0f, 0.0f, rectF);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -m24919Q);
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -m24920R);
        }
        c8894i.m28451a(ofFloat);
        c8894i2.m28451a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    /* renamed from: d0 */
    private int m24932d0(View view) {
        ColorStateList m2144p = C0311u.m2144p(view);
        if (m2144p != null) {
            return m2144p.getColorForState(view.getDrawableState(), m2144p.getDefaultColor());
        }
        return 0;
    }

    /* renamed from: f0 */
    private ViewGroup m24933f0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: J */
    protected AnimatorSet mo24912J(View view, View view2, boolean z, boolean z2) {
        C8053e mo24934e0 = mo24934e0(view2.getContext(), z);
        if (z) {
            this.f30613g = view.getTranslationX();
            this.f30614h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            m24926X(view, view2, z, z2, mo24934e0, arrayList, arrayList2);
        }
        RectF rectF = this.f30610d;
        m24931c0(view, view2, z, z2, mo24934e0, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        m24925W(view, view2, z, mo24934e0, arrayList);
        m24928Z(view, view2, z, z2, mo24934e0, arrayList, arrayList2);
        m24927Y(view, view2, z, z2, mo24934e0, width, height, arrayList, arrayList2);
        m24924V(view, view2, z, z2, mo24934e0, arrayList, arrayList2);
        m24923U(view, view2, z, z2, mo24934e0, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        C8887b.m28431a(animatorSet, arrayList);
        animatorSet.addListener(new C8049a(z, view2, view));
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            animatorSet.addListener(arrayList2.get(i2));
        }
        return animatorSet;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    /* renamed from: e */
    public boolean mo1451e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    /* renamed from: e0 */
    protected abstract C8053e mo24934e0(Context context, boolean z);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    /* renamed from: g */
    public void mo1453g(CoordinatorLayout.C0229f c0229f) {
        if (c0229f.f2010h == 0) {
            c0229f.f2010h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30609c = new Rect();
        this.f30610d = new RectF();
        this.f30611e = new RectF();
        this.f30612f = new int[2];
    }
}
