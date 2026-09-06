package p241e.p254e.p256b.p271c.p276p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import p241e.p254e.p256b.p271c.p276p.InterfaceC8902d;

/* compiled from: CircularRevealCompat.java */
/* renamed from: e.e.b.c.p.a */
/* loaded from: classes2.dex */
public final class C8899a {

    /* compiled from: CircularRevealCompat.java */
    /* renamed from: e.e.b.c.p.a$a */
    static class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ InterfaceC8902d f34397a;

        a(InterfaceC8902d interfaceC8902d) {
            this.f34397a = interfaceC8902d;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f34397a.mo28463b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f34397a.mo28462a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static Animator m28460a(InterfaceC8902d interfaceC8902d, float f2, float f3, float f4) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(interfaceC8902d, (Property<InterfaceC8902d, V>) InterfaceC8902d.c.f34402a, (TypeEvaluator) InterfaceC8902d.b.f34400a, (Object[]) new InterfaceC8902d.e[]{new InterfaceC8902d.e(f2, f3, f4)});
        if (Build.VERSION.SDK_INT < 21) {
            return ofObject;
        }
        InterfaceC8902d.e revealInfo = interfaceC8902d.getRevealInfo();
        if (revealInfo == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) interfaceC8902d, (int) f2, (int) f3, revealInfo.f34406c, f4);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofObject, createCircularReveal);
        return animatorSet;
    }

    /* renamed from: b */
    public static Animator.AnimatorListener m28461b(InterfaceC8902d interfaceC8902d) {
        return new a(interfaceC8902d);
    }
}
