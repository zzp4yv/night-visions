package com.airbnb.lottie.p117u;

import android.graphics.PointF;
import android.util.JsonReader;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.view.p005e0.C0295b;
import com.airbnb.lottie.C5155d;
import com.airbnb.lottie.p118v.C5294e;
import com.airbnb.lottie.p118v.C5295f;
import com.airbnb.lottie.p119w.C5296a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import p024c.p041e.C0874h;

/* compiled from: KeyframeParser.java */
/* renamed from: com.airbnb.lottie.u.q */
/* loaded from: classes.dex */
class C5280q {

    /* renamed from: a */
    private static final Interpolator f12908a = new LinearInterpolator();

    /* renamed from: b */
    private static C0874h<WeakReference<Interpolator>> f12909b;

    C5280q() {
    }

    /* renamed from: a */
    private static WeakReference<Interpolator> m9820a(int i2) {
        WeakReference<Interpolator> m5482g;
        synchronized (C5280q.class) {
            m5482g = m9824e().m5482g(i2);
        }
        return m5482g;
    }

    /* renamed from: b */
    static <T> C5296a<T> m9821b(JsonReader jsonReader, C5155d c5155d, float f2, InterfaceC5273j0<T> interfaceC5273j0, boolean z) throws IOException {
        return z ? m9822c(c5155d, jsonReader, f2, interfaceC5273j0) : m9823d(jsonReader, f2, interfaceC5273j0);
    }

    /* renamed from: c */
    private static <T> C5296a<T> m9822c(C5155d c5155d, JsonReader jsonReader, float f2, InterfaceC5273j0<T> interfaceC5273j0) throws IOException {
        Interpolator interpolator;
        jsonReader.beginObject();
        PointF pointF = null;
        PointF pointF2 = null;
        T t = null;
        T t2 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        boolean z = false;
        float f3 = 0.0f;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "e":
                    t2 = interfaceC5273j0.mo9781a(jsonReader, f2);
                    break;
                case "h":
                    if (jsonReader.nextInt() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case "i":
                    pointF2 = C5279p.m9817e(jsonReader, f2);
                    break;
                case "o":
                    pointF = C5279p.m9817e(jsonReader, f2);
                    break;
                case "s":
                    t = interfaceC5273j0.mo9781a(jsonReader, f2);
                    break;
                case "t":
                    f3 = (float) jsonReader.nextDouble();
                    break;
                case "ti":
                    pointF4 = C5279p.m9817e(jsonReader, f2);
                    break;
                case "to":
                    pointF3 = C5279p.m9817e(jsonReader, f2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z) {
            interpolator = f12908a;
            t2 = t;
        } else if (pointF == null || pointF2 == null) {
            interpolator = f12908a;
        } else {
            float f4 = -f2;
            pointF.x = C5294e.m9872b(pointF.x, f4, f2);
            pointF.y = C5294e.m9872b(pointF.y, -100.0f, 100.0f);
            pointF2.x = C5294e.m9872b(pointF2.x, f4, f2);
            float m9872b = C5294e.m9872b(pointF2.y, -100.0f, 100.0f);
            pointF2.y = m9872b;
            int m9889g = C5295f.m9889g(pointF.x, pointF.y, pointF2.x, m9872b);
            WeakReference<Interpolator> m9820a = m9820a(m9889g);
            Interpolator interpolator2 = m9820a != null ? m9820a.get() : null;
            if (m9820a == null || interpolator2 == null) {
                interpolator2 = C0295b.m2041a(pointF.x / f2, pointF.y / f2, pointF2.x / f2, pointF2.y / f2);
                try {
                    m9825f(m9889g, new WeakReference(interpolator2));
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
            interpolator = interpolator2;
        }
        C5296a<T> c5296a = new C5296a<>(c5155d, t, t2, interpolator, f3, null);
        c5296a.f12939i = pointF3;
        c5296a.f12940j = pointF4;
        return c5296a;
    }

    /* renamed from: d */
    private static <T> C5296a<T> m9823d(JsonReader jsonReader, float f2, InterfaceC5273j0<T> interfaceC5273j0) throws IOException {
        return new C5296a<>(interfaceC5273j0.mo9781a(jsonReader, f2));
    }

    /* renamed from: e */
    private static C0874h<WeakReference<Interpolator>> m9824e() {
        if (f12909b == null) {
            f12909b = new C0874h<>();
        }
        return f12909b;
    }

    /* renamed from: f */
    private static void m9825f(int i2, WeakReference<Interpolator> weakReference) {
        synchronized (C5280q.class) {
            f12909b.m5486k(i2, weakReference);
        }
    }
}
