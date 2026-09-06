package com.google.android.material.theme.p178a;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p024c.p025a.p032o.C0844d;
import p241e.p254e.p256b.p271c.C8875b;

/* compiled from: MaterialThemeOverlay.java */
/* renamed from: com.google.android.material.theme.a.a */
/* loaded from: classes2.dex */
public class C8046a {

    /* renamed from: a */
    private static final int[] f30600a = {R.attr.theme, C8875b.f33809J};

    /* renamed from: b */
    private static final int[] f30601b = {C8875b.f33834x};

    /* renamed from: a */
    private static int m24904a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f30600a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    /* renamed from: b */
    private static int m24905b(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f30601b, i2, i3);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: c */
    public static Context m24906c(Context context, AttributeSet attributeSet, int i2, int i3) {
        int m24905b = m24905b(context, attributeSet, i2, i3);
        boolean z = (context instanceof C0844d) && ((C0844d) context).m5345c() == m24905b;
        if (m24905b == 0 || z) {
            return context;
        }
        C0844d c0844d = new C0844d(context, m24905b);
        int m24904a = m24904a(context, attributeSet);
        if (m24904a != 0) {
            c0844d.getTheme().applyStyle(m24904a, true);
        }
        return c0844d;
    }
}
