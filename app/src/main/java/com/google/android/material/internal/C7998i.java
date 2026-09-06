package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;
import p024c.p088x.AbstractC1047m;
import p024c.p088x.C1054s;

/* compiled from: TextScale.java */
/* renamed from: com.google.android.material.internal.i */
/* loaded from: classes2.dex */
public class C7998i extends AbstractC1047m {

    /* compiled from: TextScale.java */
    /* renamed from: com.google.android.material.internal.i$a */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ TextView f30419a;

        a(TextView textView) {
            this.f30419a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f30419a.setScaleX(floatValue);
            this.f30419a.setScaleY(floatValue);
        }
    }

    /* renamed from: k0 */
    private void m24686k0(C1054s c1054s) {
        View view = c1054s.f6934b;
        if (view instanceof TextView) {
            c1054s.f6933a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // p024c.p088x.AbstractC1047m
    /* renamed from: h */
    public void mo6539h(C1054s c1054s) {
        m24686k0(c1054s);
    }

    @Override // p024c.p088x.AbstractC1047m
    /* renamed from: k */
    public void mo6540k(C1054s c1054s) {
        m24686k0(c1054s);
    }

    @Override // p024c.p088x.AbstractC1047m
    /* renamed from: o */
    public Animator mo6541o(ViewGroup viewGroup, C1054s c1054s, C1054s c1054s2) {
        if (c1054s == null || c1054s2 == null || !(c1054s.f6934b instanceof TextView)) {
            return null;
        }
        View view = c1054s2.f6934b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map<String, Object> map = c1054s.f6933a;
        Map<String, Object> map2 = c1054s2.f6933a;
        float floatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float floatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (floatValue == floatValue2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, floatValue2);
        ofFloat.addUpdateListener(new a(textView));
        return ofFloat;
    }
}
