package p241e.p254e.p256b.p271c.p275o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0160e;
import androidx.core.widget.C0324e;
import p241e.p254e.p256b.p271c.C8875b;
import p241e.p254e.p256b.p271c.C8884k;
import p241e.p254e.p256b.p271c.p278q.C8904a;

/* compiled from: MaterialCheckBox.java */
/* renamed from: e.e.b.c.o.a */
/* loaded from: classes2.dex */
public class C8898a extends C0160e {

    /* renamed from: i */
    private static final int f34393i = C8884k.f33995t;

    /* renamed from: j */
    private static final int[][] f34394j = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: k */
    private ColorStateList f34395k;

    /* renamed from: l */
    private boolean f34396l;

    public C8898a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C8875b.f33817g);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f34395k == null) {
            int[][] iArr = f34394j;
            int[] iArr2 = new int[iArr.length];
            int m28472c = C8904a.m28472c(this, C8875b.f33820j);
            int m28472c2 = C8904a.m28472c(this, C8875b.f33825o);
            int m28472c3 = C8904a.m28472c(this, C8875b.f33822l);
            iArr2[0] = C8904a.m28475f(m28472c2, m28472c, 1.0f);
            iArr2[1] = C8904a.m28475f(m28472c2, m28472c3, 0.54f);
            iArr2[2] = C8904a.m28475f(m28472c2, m28472c3, 0.38f);
            iArr2[3] = C8904a.m28475f(m28472c2, m28472c3, 0.38f);
            this.f34395k = new ColorStateList(iArr, iArr2);
        }
        return this.f34395k;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f34396l && C0324e.m2307b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f34396l = z;
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
    public C8898a(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = p241e.p254e.p256b.p271c.p275o.C8898a.f34393i
            android.content.Context r8 = com.google.android.material.theme.p178a.C8046a.m24906c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = p241e.p254e.p256b.p271c.C8885l.f34304q3
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C7999j.m24694h(r0, r1, r2, r3, r4, r5)
            int r10 = p241e.p254e.p256b.p271c.C8885l.f34311r3
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L28
            android.content.res.ColorStateList r8 = p241e.p254e.p256b.p271c.p285x.C8914c.m28499a(r8, r9, r10)
            androidx.core.widget.C0324e.m2308c(r7, r8)
        L28:
            int r8 = p241e.p254e.p256b.p271c.C8885l.f34318s3
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f34396l = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p241e.p254e.p256b.p271c.p275o.C8898a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
