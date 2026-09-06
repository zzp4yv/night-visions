package com.google.android.material.appbar;

import android.R;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.internal.C7999j;
import p241e.p254e.p256b.p271c.C8875b;
import p241e.p254e.p256b.p271c.C8880g;

/* compiled from: ViewUtilsLollipop.java */
/* renamed from: com.google.android.material.appbar.e */
/* loaded from: classes2.dex */
class C7904e {

    /* renamed from: a */
    private static final int[] f29676a = {R.attr.stateListAnimator};

    /* renamed from: a */
    static void m23805a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* renamed from: b */
    static void m23806b(View view, float f2) {
        int integer = view.getResources().getInteger(C8880g.f33937a);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j2 = integer;
        stateListAnimator.addState(new int[]{R.attr.enabled, C8875b.f33805F, -C8875b.f33806G}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j2));
        stateListAnimator.addState(new int[]{R.attr.enabled}, ObjectAnimator.ofFloat(view, "elevation", f2).setDuration(j2));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    /* renamed from: c */
    static void m23807c(View view, AttributeSet attributeSet, int i2, int i3) {
        Context context = view.getContext();
        TypedArray m24694h = C7999j.m24694h(context, attributeSet, f29676a, i2, i3, new int[0]);
        try {
            if (m24694h.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, m24694h.getResourceId(0, 0)));
            }
        } finally {
            m24694h.recycle();
        }
    }
}
