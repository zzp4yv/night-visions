package p024c.p089y.p090a.p091a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import androidx.core.content.p003d.C0264g;
import java.io.IOException;
import java.util.ArrayList;
import okhttp3.HttpUrl;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p024c.p052i.p053e.C0925c;

/* compiled from: AnimatorInflaterCompat.java */
/* renamed from: c.y.a.a.e */
/* loaded from: classes.dex */
public class C1066e {

    /* compiled from: AnimatorInflaterCompat.java */
    /* renamed from: c.y.a.a.e$a */
    private static class a implements TypeEvaluator<C0925c.b[]> {

        /* renamed from: a */
        private C0925c.b[] f6979a;

        a() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0925c.b[] evaluate(float f2, C0925c.b[] bVarArr, C0925c.b[] bVarArr2) {
            if (!C0925c.m5894b(bVarArr, bVarArr2)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!C0925c.m5894b(this.f6979a, bVarArr)) {
                this.f6979a = C0925c.m5898f(bVarArr);
            }
            for (int i2 = 0; i2 < bVarArr.length; i2++) {
                this.f6979a[i2].m5907d(bVarArr[i2], bVarArr2[i2], f2);
            }
            return this.f6979a;
        }
    }

    /* renamed from: a */
    private static Animator m6700a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f2) throws XmlPullParserException, IOException {
        return m6701b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.animation.Animator m6701b(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p024c.p089y.p090a.p091a.C1066e.m6701b(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    /* renamed from: c */
    private static Keyframe m6702c(Keyframe keyframe, float f2) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f2) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f2) : Keyframe.ofObject(f2);
    }

    /* renamed from: d */
    private static void m6703d(Keyframe[] keyframeArr, float f2, int i2, int i3) {
        float f3 = f2 / ((i3 - i2) + 2);
        while (i2 <= i3) {
            keyframeArr[i2].setFraction(keyframeArr[i2 - 1].getFraction() + f3);
            i2++;
        }
    }

    /* renamed from: e */
    private static PropertyValuesHolder m6704e(TypedArray typedArray, int i2, int i3, int i4, String str) {
        PropertyValuesHolder ofFloat;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i3);
        boolean z = peekValue != null;
        int i5 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i4);
        boolean z2 = peekValue2 != null;
        int i6 = z2 ? peekValue2.type : 0;
        if (i2 == 4) {
            i2 = ((z && m6707h(i5)) || (z2 && m6707h(i6))) ? 3 : 0;
        }
        boolean z3 = i2 == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i2 != 2) {
            C1067f m6720a = i2 == 3 ? C1067f.m6720a() : null;
            if (z3) {
                if (z) {
                    float dimension = i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f);
                    if (z2) {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension, i6 == 5 ? typedArray.getDimension(i4, 0.0f) : typedArray.getFloat(i4, 0.0f));
                    } else {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, i6 == 5 ? typedArray.getDimension(i4, 0.0f) : typedArray.getFloat(i4, 0.0f));
                }
                propertyValuesHolder = ofFloat;
            } else if (z) {
                int dimension2 = i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m6707h(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
                if (z2) {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2, i6 == 5 ? (int) typedArray.getDimension(i4, 0.0f) : m6707h(i6) ? typedArray.getColor(i4, 0) : typedArray.getInt(i4, 0));
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else if (z2) {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i6 == 5 ? (int) typedArray.getDimension(i4, 0.0f) : m6707h(i6) ? typedArray.getColor(i4, 0) : typedArray.getInt(i4, 0));
            }
            if (propertyValuesHolder == null || m6720a == null) {
                return propertyValuesHolder;
            }
            propertyValuesHolder.setEvaluator(m6720a);
            return propertyValuesHolder;
        }
        String string = typedArray.getString(i3);
        String string2 = typedArray.getString(i4);
        C0925c.b[] m5896d = C0925c.m5896d(string);
        C0925c.b[] m5896d2 = C0925c.m5896d(string2);
        if (m5896d == null && m5896d2 == null) {
            return null;
        }
        if (m5896d == null) {
            if (m5896d2 != null) {
                return PropertyValuesHolder.ofObject(str, new a(), m5896d2);
            }
            return null;
        }
        a aVar = new a();
        if (m5896d2 == null) {
            ofObject = PropertyValuesHolder.ofObject(str, aVar, m5896d);
        } else {
            if (!C0925c.m5894b(m5896d, m5896d2)) {
                throw new InflateException(" Can't morph from " + string + " to " + string2);
            }
            ofObject = PropertyValuesHolder.ofObject(str, aVar, m5896d, m5896d2);
        }
        return ofObject;
    }

    /* renamed from: f */
    private static int m6705f(TypedArray typedArray, int i2, int i3) {
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i4 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        return ((z && m6707h(i4)) || (z2 && m6707h(z2 ? peekValue2.type : 0))) ? 3 : 0;
    }

    /* renamed from: g */
    private static int m6706g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray m1784s = C0264g.m1784s(resources, theme, attributeSet, C1062a.f6963j);
        int i2 = 0;
        TypedValue m1785t = C0264g.m1785t(m1784s, xmlPullParser, "value", 0);
        if ((m1785t != null) && m6707h(m1785t.type)) {
            i2 = 3;
        }
        m1784s.recycle();
        return i2;
    }

    /* renamed from: h */
    private static boolean m6707h(int i2) {
        return i2 >= 28 && i2 <= 31;
    }

    /* renamed from: i */
    public static Animator m6708i(Context context, int i2) throws Resources.NotFoundException {
        return Build.VERSION.SDK_INT >= 24 ? AnimatorInflater.loadAnimator(context, i2) : m6709j(context, context.getResources(), context.getTheme(), i2);
    }

    /* renamed from: j */
    public static Animator m6709j(Context context, Resources resources, Resources.Theme theme, int i2) throws Resources.NotFoundException {
        return m6710k(context, resources, theme, i2, 1.0f);
    }

    /* renamed from: k */
    public static Animator m6710k(Context context, Resources resources, Resources.Theme theme, int i2, float f2) throws Resources.NotFoundException {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = resources.getAnimation(i2);
                    return m6700a(context, resources, theme, xmlResourceParser, f2);
                } catch (XmlPullParserException e2) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i2));
                    notFoundException.initCause(e2);
                    throw notFoundException;
                }
            } catch (IOException e3) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i2));
                notFoundException2.initCause(e3);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    /* renamed from: l */
    private static ValueAnimator m6711l(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f2, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        TypedArray m1784s = C0264g.m1784s(resources, theme, attributeSet, C1062a.f6960g);
        TypedArray m1784s2 = C0264g.m1784s(resources, theme, attributeSet, C1062a.f6964k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        m6716q(valueAnimator, m1784s, m1784s2, f2, xmlPullParser);
        int m1777l = C0264g.m1777l(m1784s, xmlPullParser, "interpolator", 0, 0);
        if (m1777l > 0) {
            valueAnimator.setInterpolator(C1065d.m6699b(context, m1777l));
        }
        m1784s.recycle();
        if (m1784s2 != null) {
            m1784s2.recycle();
        }
        return valueAnimator;
    }

    /* renamed from: m */
    private static Keyframe m6712m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i2, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        TypedArray m1784s = C0264g.m1784s(resources, theme, attributeSet, C1062a.f6963j);
        float m1775j = C0264g.m1775j(m1784s, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue m1785t = C0264g.m1785t(m1784s, xmlPullParser, "value", 0);
        boolean z = m1785t != null;
        if (i2 == 4) {
            i2 = (z && m6707h(m1785t.type)) ? 3 : 0;
        }
        Keyframe ofInt = z ? i2 != 0 ? (i2 == 1 || i2 == 3) ? Keyframe.ofInt(m1775j, C0264g.m1776k(m1784s, xmlPullParser, "value", 0, 0)) : null : Keyframe.ofFloat(m1775j, C0264g.m1775j(m1784s, xmlPullParser, "value", 0, 0.0f)) : i2 == 0 ? Keyframe.ofFloat(m1775j) : Keyframe.ofInt(m1775j);
        int m1777l = C0264g.m1777l(m1784s, xmlPullParser, "interpolator", 1, 0);
        if (m1777l > 0) {
            ofInt.setInterpolator(C1065d.m6699b(context, m1777l));
        }
        m1784s.recycle();
        return ofInt;
    }

    /* renamed from: n */
    private static ObjectAnimator m6713n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f2, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m6711l(context, resources, theme, attributeSet, objectAnimator, f2, xmlPullParser);
        return objectAnimator;
    }

    /* renamed from: o */
    private static PropertyValuesHolder m6714o(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i2) throws XmlPullParserException, IOException {
        int size;
        PropertyValuesHolder propertyValuesHolder = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            }
            if (xmlPullParser.getName().equals("keyframe")) {
                if (i2 == 4) {
                    i2 = m6706g(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe m6712m = m6712m(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i2, xmlPullParser);
                if (m6712m != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(m6712m);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < 0.0f) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), m6702c(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != 0.0f) {
                if (fraction2 < 0.0f) {
                    keyframe.setFraction(0.0f);
                } else {
                    arrayList.add(0, m6702c(keyframe, 0.0f));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i3 = 0; i3 < size; i3++) {
                Keyframe keyframe3 = keyframeArr[i3];
                if (keyframe3.getFraction() < 0.0f) {
                    if (i3 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int i4 = size - 1;
                        if (i3 == i4) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i5 = i3;
                            for (int i6 = i3 + 1; i6 < i4 && keyframeArr[i6].getFraction() < 0.0f; i6++) {
                                i5 = i6;
                            }
                            m6703d(keyframeArr, keyframeArr[i5 + 1].getFraction() - keyframeArr[i3 - 1].getFraction(), i3, i5);
                        }
                    }
                }
            }
            propertyValuesHolder = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i2 == 3) {
                propertyValuesHolder.setEvaluator(C1067f.m6720a());
            }
        }
        return propertyValuesHolder;
    }

    /* renamed from: p */
    private static PropertyValuesHolder[] m6715p(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int i2;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType != 2) {
                xmlPullParser.next();
            } else {
                if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                    TypedArray m1784s = C0264g.m1784s(resources, theme, attributeSet, C1062a.f6962i);
                    String m1778m = C0264g.m1778m(m1784s, xmlPullParser, "propertyName", 3);
                    int m1776k = C0264g.m1776k(m1784s, xmlPullParser, "valueType", 2, 4);
                    PropertyValuesHolder m6714o = m6714o(context, resources, theme, xmlPullParser, m1778m, m1776k);
                    if (m6714o == null) {
                        m6714o = m6704e(m1784s, m1776k, 0, 1, m1778m);
                    }
                    if (m6714o != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(m6714o);
                    }
                    m1784s.recycle();
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i2 = 0; i2 < size; i2++) {
                propertyValuesHolderArr[i2] = (PropertyValuesHolder) arrayList.get(i2);
            }
        }
        return propertyValuesHolderArr;
    }

    /* renamed from: q */
    private static void m6716q(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f2, XmlPullParser xmlPullParser) {
        long m1776k = C0264g.m1776k(typedArray, xmlPullParser, "duration", 1, 300);
        long m1776k2 = C0264g.m1776k(typedArray, xmlPullParser, "startOffset", 2, 0);
        int m1776k3 = C0264g.m1776k(typedArray, xmlPullParser, "valueType", 7, 4);
        if (C0264g.m1783r(xmlPullParser, "valueFrom") && C0264g.m1783r(xmlPullParser, "valueTo")) {
            if (m1776k3 == 4) {
                m1776k3 = m6705f(typedArray, 5, 6);
            }
            PropertyValuesHolder m6704e = m6704e(typedArray, m1776k3, 5, 6, HttpUrl.FRAGMENT_ENCODE_SET);
            if (m6704e != null) {
                valueAnimator.setValues(m6704e);
            }
        }
        valueAnimator.setDuration(m1776k);
        valueAnimator.setStartDelay(m1776k2);
        valueAnimator.setRepeatCount(C0264g.m1776k(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(C0264g.m1776k(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            m6717r(valueAnimator, typedArray2, m1776k3, f2, xmlPullParser);
        }
    }

    /* renamed from: r */
    private static void m6717r(ValueAnimator valueAnimator, TypedArray typedArray, int i2, float f2, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String m1778m = C0264g.m1778m(typedArray, xmlPullParser, "pathData", 1);
        if (m1778m == null) {
            objectAnimator.setPropertyName(C0264g.m1778m(typedArray, xmlPullParser, "propertyName", 0));
            return;
        }
        String m1778m2 = C0264g.m1778m(typedArray, xmlPullParser, "propertyXName", 2);
        String m1778m3 = C0264g.m1778m(typedArray, xmlPullParser, "propertyYName", 3);
        if (i2 != 2) {
        }
        if (m1778m2 != null || m1778m3 != null) {
            m6718s(C0925c.m5897e(m1778m), objectAnimator, f2 * 0.5f, m1778m2, m1778m3);
            return;
        }
        throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
    }

    /* renamed from: s */
    private static void m6718s(Path path, ObjectAnimator objectAnimator, float f2, String str, String str2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f3 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f4 = 0.0f;
        do {
            f4 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f4));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f4 / f2)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f5 = f4 / (min - 1);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= min) {
                break;
            }
            pathMeasure2.getPosTan(f3 - ((Float) arrayList.get(i3)).floatValue(), fArr3, null);
            fArr[i2] = fArr3[0];
            fArr2[i2] = fArr3[1];
            f3 += f5;
            int i4 = i3 + 1;
            if (i4 < arrayList.size() && f3 > ((Float) arrayList.get(i4)).floatValue()) {
                pathMeasure2.nextContour();
                i3 = i4;
            }
            i2++;
        }
        PropertyValuesHolder ofFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder ofFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (ofFloat == null) {
            objectAnimator.setValues(ofFloat2);
        } else if (ofFloat2 == null) {
            objectAnimator.setValues(ofFloat);
        } else {
            objectAnimator.setValues(ofFloat, ofFloat2);
        }
    }
}
