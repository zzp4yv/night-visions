package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0190t;
import com.google.android.material.theme.p178a.C8046a;
import p241e.p254e.p256b.p271c.C8875b;
import p241e.p254e.p256b.p271c.C8885l;
import p241e.p254e.p256b.p271c.p285x.C8913b;
import p241e.p254e.p256b.p271c.p285x.C8914c;

/* loaded from: classes2.dex */
public class MaterialTextView extends C0190t {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    /* renamed from: f */
    private void m24899f(Resources.Theme theme, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i2, C8885l.f34367z3);
        int m24902i = m24902i(getContext(), obtainStyledAttributes, C8885l.f34004A3, C8885l.f34011B3);
        obtainStyledAttributes.recycle();
        if (m24902i >= 0) {
            setLineHeight(m24902i);
        }
    }

    /* renamed from: g */
    private static boolean m24900g(Context context) {
        return C8913b.m28496b(context, C8875b.f33807H, true);
    }

    /* renamed from: h */
    private static int m24901h(Resources.Theme theme, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C8885l.f34018C3, i2, i3);
        int resourceId = obtainStyledAttributes.getResourceId(C8885l.f34025D3, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: i */
    private static int m24902i(Context context, TypedArray typedArray, int... iArr) {
        int i2 = -1;
        for (int i3 = 0; i3 < iArr.length && i2 < 0; i3++) {
            i2 = C8914c.m28501c(context, typedArray, iArr[i3], -1);
        }
        return i2;
    }

    /* renamed from: j */
    private static boolean m24903j(Context context, Resources.Theme theme, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C8885l.f34018C3, i2, i3);
        int m24902i = m24902i(context, obtainStyledAttributes, C8885l.f34032E3, C8885l.f34039F3);
        obtainStyledAttributes.recycle();
        return m24902i != -1;
    }

    @Override // androidx.appcompat.widget.C0190t, android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        if (m24900g(context)) {
            m24899f(context.getTheme(), i2);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(C8046a.m24906c(context, attributeSet, i2, i3), attributeSet, i2);
        int m24901h;
        Context context2 = getContext();
        if (m24900g(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (m24903j(context2, theme, attributeSet, i2, i3) || (m24901h = m24901h(theme, attributeSet, i2, i3)) == -1) {
                return;
            }
            m24899f(theme, m24901h);
        }
    }
}
