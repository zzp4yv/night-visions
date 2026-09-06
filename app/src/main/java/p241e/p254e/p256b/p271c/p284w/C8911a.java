package p241e.p254e.p256b.p271c.p284w;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.C0324e;
import p241e.p254e.p256b.p271c.C8875b;
import p241e.p254e.p256b.p271c.C8884k;
import p241e.p254e.p256b.p271c.p278q.C8904a;

/* compiled from: MaterialRadioButton.java */
/* renamed from: e.e.b.c.w.a */
/* loaded from: classes2.dex */
public class C8911a extends AppCompatRadioButton {

    /* renamed from: i */
    private static final int f34419i = C8884k.f33996u;

    /* renamed from: j */
    private static final int[][] f34420j = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: k */
    private ColorStateList f34421k;

    /* renamed from: l */
    private boolean f34422l;

    public C8911a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C8875b.f33835y);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f34421k == null) {
            int m28472c = C8904a.m28472c(this, C8875b.f33820j);
            int m28472c2 = C8904a.m28472c(this, C8875b.f33822l);
            int m28472c3 = C8904a.m28472c(this, C8875b.f33825o);
            int[][] iArr = f34420j;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = C8904a.m28475f(m28472c3, m28472c, 1.0f);
            iArr2[1] = C8904a.m28475f(m28472c3, m28472c2, 0.54f);
            iArr2[2] = C8904a.m28475f(m28472c3, m28472c2, 0.38f);
            iArr2[3] = C8904a.m28475f(m28472c3, m28472c2, 0.38f);
            this.f34421k = new ColorStateList(iArr, iArr2);
        }
        return this.f34421k;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f34422l && C0324e.m2307b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f34422l = z;
        if (z) {
            C0324e.m2308c(this, getMaterialThemeColorsTintList());
        } else {
            C0324e.m2308c(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C8911a(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = p241e.p254e.p256b.p271c.p284w.C8911a.f34419i
            android.content.Context r8 = com.google.android.material.theme.p178a.C8046a.m24906c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = p241e.p254e.p256b.p271c.C8885l.f34325t3
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C7999j.m24694h(r0, r1, r2, r3, r4, r5)
            int r10 = p241e.p254e.p256b.p271c.C8885l.f34332u3
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L28
            android.content.res.ColorStateList r8 = p241e.p254e.p256b.p271c.p285x.C8914c.m28499a(r8, r9, r10)
            androidx.core.widget.C0324e.m2308c(r7, r8)
        L28:
            int r8 = p241e.p254e.p256b.p271c.C8885l.f34339v3
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f34422l = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p241e.p254e.p256b.p271c.p284w.C8911a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
