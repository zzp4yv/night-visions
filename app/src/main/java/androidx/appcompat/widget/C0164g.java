package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.C0265a;
import androidx.core.widget.C0324e;

/* compiled from: AppCompatCompoundButtonHelper.java */
/* renamed from: androidx.appcompat.widget.g */
/* loaded from: classes.dex */
class C0164g {

    /* renamed from: a */
    private final CompoundButton f1123a;

    /* renamed from: b */
    private ColorStateList f1124b = null;

    /* renamed from: c */
    private PorterDuff.Mode f1125c = null;

    /* renamed from: d */
    private boolean f1126d = false;

    /* renamed from: e */
    private boolean f1127e = false;

    /* renamed from: f */
    private boolean f1128f;

    C0164g(CompoundButton compoundButton) {
        this.f1123a = compoundButton;
    }

    /* renamed from: a */
    void m966a() {
        Drawable m2306a = C0324e.m2306a(this.f1123a);
        if (m2306a != null) {
            if (this.f1126d || this.f1127e) {
                Drawable mutate = C0265a.m1821r(m2306a).mutate();
                if (this.f1126d) {
                    C0265a.m1818o(mutate, this.f1124b);
                }
                if (this.f1127e) {
                    C0265a.m1819p(mutate, this.f1125c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f1123a.getDrawableState());
                }
                this.f1123a.setButtonDrawable(mutate);
            }
        }
    }

    /* renamed from: b */
    int m967b(int i2) {
        Drawable m2306a;
        return (Build.VERSION.SDK_INT >= 17 || (m2306a = C0324e.m2306a(this.f1123a)) == null) ? i2 : i2 + m2306a.getIntrinsicWidth();
    }

    /* renamed from: c */
    ColorStateList m968c() {
        return this.f1124b;
    }

    /* renamed from: d */
    PorterDuff.Mode m969d() {
        return this.f1125c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d A[Catch: all -> 0x0084, TRY_ENTER, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[Catch: all -> 0x0084, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:2:0x001d }] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m970e(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.f1123a
            android.content.Context r0 = r0.getContext()
            int[] r3 = p024c.p025a.C0832j.f5285R0
            r8 = 0
            androidx.appcompat.widget.q0 r0 = androidx.appcompat.widget.C0185q0.m1091v(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.f1123a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.m1109r()
            r7 = 0
            r4 = r10
            r6 = r11
            androidx.core.view.C0311u.m2127g0(r1, r2, r3, r4, r5, r6, r7)
            int r10 = p024c.p025a.C0832j.f5295T0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.m1110s(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L3a
            int r10 = r0.m1105n(r10, r8)     // Catch: java.lang.Throwable -> L84
            if (r10 == 0) goto L3a
            android.widget.CompoundButton r11 = r9.f1123a     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            android.content.Context r1 = r11.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            android.graphics.drawable.Drawable r10 = p024c.p025a.p026k.p027a.C0833a.m5262d(r1, r10)     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            r11.setButtonDrawable(r10)     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            r10 = 1
            goto L3b
        L3a:
            r10 = 0
        L3b:
            if (r10 != 0) goto L58
            int r10 = p024c.p025a.C0832j.f5290S0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.m1110s(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L58
            int r10 = r0.m1105n(r10, r8)     // Catch: java.lang.Throwable -> L84
            if (r10 == 0) goto L58
            android.widget.CompoundButton r11 = r9.f1123a     // Catch: java.lang.Throwable -> L84
            android.content.Context r1 = r11.getContext()     // Catch: java.lang.Throwable -> L84
            android.graphics.drawable.Drawable r10 = p024c.p025a.p026k.p027a.C0833a.m5262d(r1, r10)     // Catch: java.lang.Throwable -> L84
            r11.setButtonDrawable(r10)     // Catch: java.lang.Throwable -> L84
        L58:
            int r10 = p024c.p025a.C0832j.f5300U0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.m1110s(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L69
            android.widget.CompoundButton r11 = r9.f1123a     // Catch: java.lang.Throwable -> L84
            android.content.res.ColorStateList r10 = r0.m1094c(r10)     // Catch: java.lang.Throwable -> L84
            androidx.core.widget.C0324e.m2308c(r11, r10)     // Catch: java.lang.Throwable -> L84
        L69:
            int r10 = p024c.p025a.C0832j.f5305V0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.m1110s(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L80
            android.widget.CompoundButton r11 = r9.f1123a     // Catch: java.lang.Throwable -> L84
            r1 = -1
            int r10 = r0.m1102k(r10, r1)     // Catch: java.lang.Throwable -> L84
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.C0200y.m1238e(r10, r1)     // Catch: java.lang.Throwable -> L84
            androidx.core.widget.C0324e.m2309d(r11, r10)     // Catch: java.lang.Throwable -> L84
        L80:
            r0.m1111w()
            return
        L84:
            r10 = move-exception
            r0.m1111w()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0164g.m970e(android.util.AttributeSet, int):void");
    }

    /* renamed from: f */
    void m971f() {
        if (this.f1128f) {
            this.f1128f = false;
        } else {
            this.f1128f = true;
            m966a();
        }
    }

    /* renamed from: g */
    void m972g(ColorStateList colorStateList) {
        this.f1124b = colorStateList;
        this.f1126d = true;
        m966a();
    }

    /* renamed from: h */
    void m973h(PorterDuff.Mode mode) {
        this.f1125c = mode;
        this.f1127e = true;
        m966a();
    }
}
