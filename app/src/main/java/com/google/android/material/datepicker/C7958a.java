package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;
import androidx.core.view.C0311u;
import p024c.p052i.p059j.C0959i;
import p241e.p254e.p256b.p271c.C8885l;
import p241e.p254e.p256b.p271c.p272a0.C8867g;
import p241e.p254e.p256b.p271c.p272a0.C8871k;
import p241e.p254e.p256b.p271c.p285x.C8914c;

/* compiled from: CalendarItemStyle.java */
/* renamed from: com.google.android.material.datepicker.a */
/* loaded from: classes2.dex */
final class C7958a {

    /* renamed from: a */
    private final Rect f30086a;

    /* renamed from: b */
    private final ColorStateList f30087b;

    /* renamed from: c */
    private final ColorStateList f30088c;

    /* renamed from: d */
    private final ColorStateList f30089d;

    /* renamed from: e */
    private final int f30090e;

    /* renamed from: f */
    private final C8871k f30091f;

    private C7958a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i2, C8871k c8871k, Rect rect) {
        C0959i.m6064b(rect.left);
        C0959i.m6064b(rect.top);
        C0959i.m6064b(rect.right);
        C0959i.m6064b(rect.bottom);
        this.f30086a = rect;
        this.f30087b = colorStateList2;
        this.f30088c = colorStateList;
        this.f30089d = colorStateList3;
        this.f30090e = i2;
        this.f30091f = c8871k;
    }

    /* renamed from: a */
    static C7958a m24348a(Context context, int i2) {
        C0959i.m6063a(i2 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, C8885l.f34164X2);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(C8885l.f34171Y2, 0), obtainStyledAttributes.getDimensionPixelOffset(C8885l.f34186a3, 0), obtainStyledAttributes.getDimensionPixelOffset(C8885l.f34178Z2, 0), obtainStyledAttributes.getDimensionPixelOffset(C8885l.f34194b3, 0));
        ColorStateList m28499a = C8914c.m28499a(context, obtainStyledAttributes, C8885l.f34202c3);
        ColorStateList m28499a2 = C8914c.m28499a(context, obtainStyledAttributes, C8885l.f34241h3);
        ColorStateList m28499a3 = C8914c.m28499a(context, obtainStyledAttributes, C8885l.f34226f3);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C8885l.f34234g3, 0);
        C8871k m28355m = C8871k.m28314b(context, obtainStyledAttributes.getResourceId(C8885l.f34210d3, 0), obtainStyledAttributes.getResourceId(C8885l.f34218e3, 0)).m28355m();
        obtainStyledAttributes.recycle();
        return new C7958a(m28499a, m28499a2, m28499a3, dimensionPixelSize, m28355m, rect);
    }

    /* renamed from: b */
    int m24349b() {
        return this.f30086a.bottom;
    }

    /* renamed from: c */
    int m24350c() {
        return this.f30086a.top;
    }

    /* renamed from: d */
    void m24351d(TextView textView) {
        C8867g c8867g = new C8867g();
        C8867g c8867g2 = new C8867g();
        c8867g.setShapeAppearanceModel(this.f30091f);
        c8867g2.setShapeAppearanceModel(this.f30091f);
        c8867g.m28284X(this.f30088c);
        c8867g.m28292f0(this.f30090e, this.f30089d);
        textView.setTextColor(this.f30087b);
        Drawable rippleDrawable = Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.f30087b.withAlpha(30), c8867g, c8867g2) : c8867g;
        Rect rect = this.f30086a;
        C0311u.m2139m0(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
