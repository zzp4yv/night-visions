package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.C0185q0;
import p241e.p254e.p256b.p271c.C8875b;
import p241e.p254e.p256b.p271c.C8885l;

/* compiled from: ThemeEnforcement.java */
/* renamed from: com.google.android.material.internal.j */
/* loaded from: classes2.dex */
public final class C7999j {

    /* renamed from: a */
    private static final int[] f30421a = {C8875b.f33823m};

    /* renamed from: b */
    private static final int[] f30422b = {C8875b.f33824n};

    /* renamed from: a */
    public static void m24687a(Context context) {
        m24691e(context, f30421a, "Theme.AppCompat");
    }

    /* renamed from: b */
    private static void m24688b(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8885l.f34160W5, i2, i3);
        boolean z = obtainStyledAttributes.getBoolean(C8885l.f34174Y5, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(C8875b.f33830t, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m24689c(context);
            }
        }
        m24687a(context);
    }

    /* renamed from: c */
    public static void m24689c(Context context) {
        m24691e(context, f30422b, "Theme.MaterialComponents");
    }

    /* renamed from: d */
    private static void m24690d(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8885l.f34160W5, i2, i3);
        if (!obtainStyledAttributes.getBoolean(C8885l.f34181Z5, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            z = obtainStyledAttributes.getResourceId(C8885l.f34167X5, -1) != -1;
        } else {
            z = m24692f(context, attributeSet, iArr, i2, i3, iArr2);
        }
        obtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* renamed from: e */
    private static void m24691e(Context context, int[] iArr, String str) {
        if (m24693g(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    /* renamed from: f */
    private static boolean m24692f(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
        for (int i4 : iArr2) {
            if (obtainStyledAttributes.getResourceId(i4, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: g */
    private static boolean m24693g(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (!obtainStyledAttributes.hasValue(i2)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: h */
    public static TypedArray m24694h(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        m24688b(context, attributeSet, i2, i3);
        m24690d(context, attributeSet, iArr, i2, i3, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
    }

    /* renamed from: i */
    public static C0185q0 m24695i(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        m24688b(context, attributeSet, i2, i3);
        m24690d(context, attributeSet, iArr, i2, i3, iArr2);
        return C0185q0.m1091v(context, attributeSet, iArr, i2, i3);
    }
}
