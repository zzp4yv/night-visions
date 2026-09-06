package com.google.android.material.internal;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;
import okhttp3.HttpUrl;
import p024c.p052i.p059j.C0959i;

/* compiled from: StaticLayoutBuilderCompat.java */
/* renamed from: com.google.android.material.internal.g */
/* loaded from: classes2.dex */
final class C7996g {

    /* renamed from: a */
    private static boolean f30399a;

    /* renamed from: b */
    private static Constructor<StaticLayout> f30400b;

    /* renamed from: c */
    private static Object f30401c;

    /* renamed from: d */
    private CharSequence f30402d;

    /* renamed from: e */
    private final TextPaint f30403e;

    /* renamed from: f */
    private final int f30404f;

    /* renamed from: h */
    private int f30406h;

    /* renamed from: l */
    private boolean f30410l;

    /* renamed from: g */
    private int f30405g = 0;

    /* renamed from: i */
    private Layout.Alignment f30407i = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: j */
    private int f30408j = Integer.MAX_VALUE;

    /* renamed from: k */
    private boolean f30409k = true;

    /* renamed from: m */
    private TextUtils.TruncateAt f30411m = null;

    /* compiled from: StaticLayoutBuilderCompat.java */
    /* renamed from: com.google.android.material.internal.g$a */
    static class a extends Exception {
        a(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    private C7996g(CharSequence charSequence, TextPaint textPaint, int i2) {
        this.f30402d = charSequence;
        this.f30403e = textPaint;
        this.f30404f = i2;
        this.f30406h = charSequence.length();
    }

    /* renamed from: b */
    private void m24668b() throws a {
        Class<?> cls;
        if (f30399a) {
            return;
        }
        try {
            boolean z = this.f30410l && Build.VERSION.SDK_INT >= 23;
            if (Build.VERSION.SDK_INT >= 18) {
                cls = TextDirectionHeuristic.class;
                f30401c = z ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            } else {
                ClassLoader classLoader = C7996g.class.getClassLoader();
                String str = this.f30410l ? "RTL" : "LTR";
                Class<?> loadClass = classLoader.loadClass("android.text.TextDirectionHeuristic");
                Class<?> loadClass2 = classLoader.loadClass("android.text.TextDirectionHeuristics");
                f30401c = loadClass2.getField(str).get(loadClass2);
                cls = loadClass;
            }
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls2, cls2, TextPaint.class, cls2, Layout.Alignment.class, cls, cls3, cls3, Boolean.TYPE, TextUtils.TruncateAt.class, cls2, cls2);
            f30400b = declaredConstructor;
            declaredConstructor.setAccessible(true);
            f30399a = true;
        } catch (Exception e2) {
            throw new a(e2);
        }
    }

    /* renamed from: c */
    public static C7996g m24669c(CharSequence charSequence, TextPaint textPaint, int i2) {
        return new C7996g(charSequence, textPaint, i2);
    }

    /* renamed from: a */
    public StaticLayout m24670a() throws a {
        if (this.f30402d == null) {
            this.f30402d = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        int max = Math.max(0, this.f30404f);
        CharSequence charSequence = this.f30402d;
        if (this.f30408j == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f30403e, max, this.f30411m);
        }
        int min = Math.min(charSequence.length(), this.f30406h);
        this.f30406h = min;
        if (Build.VERSION.SDK_INT < 23) {
            m24668b();
            try {
                return (StaticLayout) ((Constructor) C0959i.m6065c(f30400b)).newInstance(charSequence, Integer.valueOf(this.f30405g), Integer.valueOf(this.f30406h), this.f30403e, Integer.valueOf(max), this.f30407i, C0959i.m6065c(f30401c), Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f30409k), null, Integer.valueOf(max), Integer.valueOf(this.f30408j));
            } catch (Exception e2) {
                throw new a(e2);
            }
        }
        if (this.f30410l) {
            this.f30407i = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f30405g, min, this.f30403e, max);
        obtain.setAlignment(this.f30407i);
        obtain.setIncludePad(this.f30409k);
        obtain.setTextDirection(this.f30410l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f30411m;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f30408j);
        return obtain.build();
    }

    /* renamed from: d */
    public C7996g m24671d(Layout.Alignment alignment) {
        this.f30407i = alignment;
        return this;
    }

    /* renamed from: e */
    public C7996g m24672e(TextUtils.TruncateAt truncateAt) {
        this.f30411m = truncateAt;
        return this;
    }

    /* renamed from: f */
    public C7996g m24673f(boolean z) {
        this.f30409k = z;
        return this;
    }

    /* renamed from: g */
    public C7996g m24674g(boolean z) {
        this.f30410l = z;
        return this;
    }

    /* renamed from: h */
    public C7996g m24675h(int i2) {
        this.f30408j = i2;
        return this;
    }
}
