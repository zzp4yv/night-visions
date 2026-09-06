package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.core.view.C0311u;
import cm.aptoide.p092pt.file.CacheHelper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import p024c.p025a.C0832j;

/* compiled from: AppCompatTextViewAutoSizeHelper.java */
/* renamed from: androidx.appcompat.widget.u */
/* loaded from: classes.dex */
class C0192u {

    /* renamed from: a */
    private static final RectF f1300a = new RectF();

    /* renamed from: b */
    private static ConcurrentHashMap<String, Method> f1301b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static ConcurrentHashMap<String, Field> f1302c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private int f1303d = 0;

    /* renamed from: e */
    private boolean f1304e = false;

    /* renamed from: f */
    private float f1305f = -1.0f;

    /* renamed from: g */
    private float f1306g = -1.0f;

    /* renamed from: h */
    private float f1307h = -1.0f;

    /* renamed from: i */
    private int[] f1308i = new int[0];

    /* renamed from: j */
    private boolean f1309j = false;

    /* renamed from: k */
    private TextPaint f1310k;

    /* renamed from: l */
    private final TextView f1311l;

    /* renamed from: m */
    private final Context f1312m;

    /* renamed from: n */
    private final c f1313n;

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* renamed from: androidx.appcompat.widget.u$a */
    private static class a extends c {
        a() {
        }

        @Override // androidx.appcompat.widget.C0192u.c
        /* renamed from: a */
        void mo1220a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C0192u.m1203r(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* renamed from: androidx.appcompat.widget.u$b */
    private static class b extends a {
        b() {
        }

        @Override // androidx.appcompat.widget.C0192u.a, androidx.appcompat.widget.C0192u.c
        /* renamed from: a */
        void mo1220a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.C0192u.c
        /* renamed from: b */
        boolean mo1221b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* renamed from: androidx.appcompat.widget.u$c */
    private static class c {
        c() {
        }

        /* renamed from: a */
        void mo1220a(StaticLayout.Builder builder, TextView textView) {
        }

        /* renamed from: b */
        boolean mo1221b(TextView textView) {
            return ((Boolean) C0192u.m1203r(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    C0192u(TextView textView) {
        this.f1311l = textView;
        this.f1312m = textView.getContext();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            this.f1313n = new b();
        } else if (i2 >= 23) {
            this.f1313n = new a();
        } else {
            this.f1313n = new c();
        }
    }

    /* renamed from: A */
    private void m1189A(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = typedArray.getDimensionPixelSize(i2, -1);
            }
            this.f1308i = m1195c(iArr);
            m1190B();
        }
    }

    /* renamed from: B */
    private boolean m1190B() {
        boolean z = this.f1308i.length > 0;
        this.f1309j = z;
        if (z) {
            this.f1303d = 1;
            this.f1306g = r0[0];
            this.f1307h = r0[r1 - 1];
            this.f1305f = -1.0f;
        }
        return z;
    }

    /* renamed from: C */
    private boolean m1191C(int i2, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1311l.getText();
        TransformationMethod transformationMethod = this.f1311l.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f1311l)) != null) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.f1311l.getMaxLines() : -1;
        m1213q(i2);
        StaticLayout m1207e = m1207e(text, (Layout.Alignment) m1203r(this.f1311l, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (m1207e.getLineCount() <= maxLines && m1207e.getLineEnd(m1207e.getLineCount() - 1) == text.length())) && ((float) m1207e.getHeight()) <= rectF.bottom;
    }

    /* renamed from: D */
    private boolean m1192D() {
        return !(this.f1311l instanceof C0168i);
    }

    /* renamed from: E */
    private void m1193E(float f2, float f3, float f4) throws IllegalArgumentException {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        }
        if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        }
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
        this.f1303d = 1;
        this.f1306g = f2;
        this.f1307h = f3;
        this.f1305f = f4;
        this.f1309j = false;
    }

    /* renamed from: a */
    private static <T> T m1194a(Object obj, String str, T t) {
        try {
            Field m1201o = m1201o(str);
            return m1201o == null ? t : (T) m1201o.get(obj);
        } catch (IllegalAccessException e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e2);
            return t;
        }
    }

    /* renamed from: c */
    private int[] m1195c(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    /* renamed from: d */
    private void m1196d() {
        this.f1303d = 0;
        this.f1306g = -1.0f;
        this.f1307h = -1.0f;
        this.f1305f = -1.0f;
        this.f1308i = new int[0];
        this.f1304e = false;
    }

    /* renamed from: f */
    private StaticLayout m1197f(CharSequence charSequence, Layout.Alignment alignment, int i2, int i3) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f1310k, i2);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f1311l.getLineSpacingExtra(), this.f1311l.getLineSpacingMultiplier()).setIncludePad(this.f1311l.getIncludeFontPadding()).setBreakStrategy(this.f1311l.getBreakStrategy()).setHyphenationFrequency(this.f1311l.getHyphenationFrequency());
        if (i3 == -1) {
            i3 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i3);
        try {
            this.f1313n.mo1220a(obtain, this.f1311l);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    /* renamed from: g */
    private StaticLayout m1198g(CharSequence charSequence, Layout.Alignment alignment, int i2) {
        return new StaticLayout(charSequence, this.f1310k, i2, alignment, ((Float) m1194a(this.f1311l, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) m1194a(this.f1311l, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) m1194a(this.f1311l, "mIncludePad", Boolean.TRUE)).booleanValue());
    }

    /* renamed from: h */
    private StaticLayout m1199h(CharSequence charSequence, Layout.Alignment alignment, int i2) {
        return new StaticLayout(charSequence, this.f1310k, i2, alignment, this.f1311l.getLineSpacingMultiplier(), this.f1311l.getLineSpacingExtra(), this.f1311l.getIncludeFontPadding());
    }

    /* renamed from: i */
    private int m1200i(RectF rectF) {
        int length = this.f1308i.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i2 = length - 1;
        int i3 = 1;
        int i4 = 0;
        while (i3 <= i2) {
            int i5 = (i3 + i2) / 2;
            if (m1191C(this.f1308i[i5], rectF)) {
                int i6 = i5 + 1;
                i4 = i3;
                i3 = i6;
            } else {
                i4 = i5 - 1;
                i2 = i4;
            }
        }
        return this.f1308i[i4];
    }

    /* renamed from: o */
    private static Field m1201o(String str) {
        try {
            Field field = f1302c.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                f1302c.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e2);
            return null;
        }
    }

    /* renamed from: p */
    private static Method m1202p(String str) {
        try {
            Method method = f1301b.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1301b.put(str, method);
            }
            return method;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    /* renamed from: r */
    static <T> T m1203r(Object obj, String str, T t) {
        try {
            return (T) m1202p(str).invoke(obj, new Object[0]);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return t;
        }
    }

    /* renamed from: x */
    private void m1204x(float f2) {
        if (f2 != this.f1311l.getPaint().getTextSize()) {
            this.f1311l.getPaint().setTextSize(f2);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.f1311l.isInLayout() : false;
            if (this.f1311l.getLayout() != null) {
                this.f1304e = false;
                try {
                    Method m1202p = m1202p("nullLayouts");
                    if (m1202p != null) {
                        m1202p.invoke(this.f1311l, new Object[0]);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (isInLayout) {
                    this.f1311l.forceLayout();
                } else {
                    this.f1311l.requestLayout();
                }
                this.f1311l.invalidate();
            }
        }
    }

    /* renamed from: z */
    private boolean m1205z() {
        if (m1192D() && this.f1303d == 1) {
            if (!this.f1309j || this.f1308i.length == 0) {
                int floor = ((int) Math.floor((this.f1307h - this.f1306g) / this.f1305f)) + 1;
                int[] iArr = new int[floor];
                for (int i2 = 0; i2 < floor; i2++) {
                    iArr[i2] = Math.round(this.f1306g + (i2 * this.f1305f));
                }
                this.f1308i = m1195c(iArr);
            }
            this.f1304e = true;
        } else {
            this.f1304e = false;
        }
        return this.f1304e;
    }

    /* renamed from: b */
    void m1206b() {
        if (m1214s()) {
            if (this.f1304e) {
                if (this.f1311l.getMeasuredHeight() <= 0 || this.f1311l.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f1313n.mo1221b(this.f1311l) ? CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES : (this.f1311l.getMeasuredWidth() - this.f1311l.getTotalPaddingLeft()) - this.f1311l.getTotalPaddingRight();
                int height = (this.f1311l.getHeight() - this.f1311l.getCompoundPaddingBottom()) - this.f1311l.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f1300a;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float m1200i = m1200i(rectF);
                    if (m1200i != this.f1311l.getTextSize()) {
                        m1219y(0, m1200i);
                    }
                }
            }
            this.f1304e = true;
        }
    }

    /* renamed from: e */
    StaticLayout m1207e(CharSequence charSequence, Layout.Alignment alignment, int i2, int i3) {
        int i4 = Build.VERSION.SDK_INT;
        return i4 >= 23 ? m1197f(charSequence, alignment, i2, i3) : i4 >= 16 ? m1199h(charSequence, alignment, i2) : m1198g(charSequence, alignment, i2);
    }

    /* renamed from: j */
    int m1208j() {
        return Math.round(this.f1307h);
    }

    /* renamed from: k */
    int m1209k() {
        return Math.round(this.f1306g);
    }

    /* renamed from: l */
    int m1210l() {
        return Math.round(this.f1305f);
    }

    /* renamed from: m */
    int[] m1211m() {
        return this.f1308i;
    }

    /* renamed from: n */
    int m1212n() {
        return this.f1303d;
    }

    /* renamed from: q */
    void m1213q(int i2) {
        TextPaint textPaint = this.f1310k;
        if (textPaint == null) {
            this.f1310k = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1310k.set(this.f1311l.getPaint());
        this.f1310k.setTextSize(i2);
    }

    /* renamed from: s */
    boolean m1214s() {
        return m1192D() && this.f1303d != 0;
    }

    /* renamed from: t */
    void m1215t(AttributeSet attributeSet, int i2) {
        int resourceId;
        Context context = this.f1312m;
        int[] iArr = C0832j.f5369i0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        TextView textView = this.f1311l;
        C0311u.m2127g0(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i2, 0);
        int i3 = C0832j.f5394n0;
        if (obtainStyledAttributes.hasValue(i3)) {
            this.f1303d = obtainStyledAttributes.getInt(i3, 0);
        }
        int i4 = C0832j.f5389m0;
        float dimension = obtainStyledAttributes.hasValue(i4) ? obtainStyledAttributes.getDimension(i4, -1.0f) : -1.0f;
        int i5 = C0832j.f5379k0;
        float dimension2 = obtainStyledAttributes.hasValue(i5) ? obtainStyledAttributes.getDimension(i5, -1.0f) : -1.0f;
        int i6 = C0832j.f5374j0;
        float dimension3 = obtainStyledAttributes.hasValue(i6) ? obtainStyledAttributes.getDimension(i6, -1.0f) : -1.0f;
        int i7 = C0832j.f5384l0;
        if (obtainStyledAttributes.hasValue(i7) && (resourceId = obtainStyledAttributes.getResourceId(i7, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m1189A(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!m1192D()) {
            this.f1303d = 0;
            return;
        }
        if (this.f1303d == 1) {
            if (!this.f1309j) {
                DisplayMetrics displayMetrics = this.f1312m.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m1193E(dimension2, dimension3, dimension);
            }
            m1205z();
        }
    }

    /* renamed from: u */
    void m1216u(int i2, int i3, int i4, int i5) throws IllegalArgumentException {
        if (m1192D()) {
            DisplayMetrics displayMetrics = this.f1312m.getResources().getDisplayMetrics();
            m1193E(TypedValue.applyDimension(i5, i2, displayMetrics), TypedValue.applyDimension(i5, i3, displayMetrics), TypedValue.applyDimension(i5, i4, displayMetrics));
            if (m1205z()) {
                m1206b();
            }
        }
    }

    /* renamed from: v */
    void m1217v(int[] iArr, int i2) throws IllegalArgumentException {
        if (m1192D()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1312m.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr2[i3] = Math.round(TypedValue.applyDimension(i2, iArr[i3], displayMetrics));
                    }
                }
                this.f1308i = m1195c(iArr2);
                if (!m1190B()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1309j = false;
            }
            if (m1205z()) {
                m1206b();
            }
        }
    }

    /* renamed from: w */
    void m1218w(int i2) {
        if (m1192D()) {
            if (i2 == 0) {
                m1196d();
                return;
            }
            if (i2 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i2);
            }
            DisplayMetrics displayMetrics = this.f1312m.getResources().getDisplayMetrics();
            m1193E(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m1205z()) {
                m1206b();
            }
        }
    }

    /* renamed from: y */
    void m1219y(int i2, float f2) {
        Context context = this.f1312m;
        m1204x(TypedValue.applyDimension(i2, f2, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
