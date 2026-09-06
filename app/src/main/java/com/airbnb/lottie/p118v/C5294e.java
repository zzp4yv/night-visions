package com.airbnb.lottie.p118v;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.p108q.p109a.InterfaceC5177j;
import com.airbnb.lottie.p112s.C5204a;
import com.airbnb.lottie.p112s.C5208e;
import com.airbnb.lottie.p112s.p114j.C5237l;
import java.util.List;

/* compiled from: MiscUtils.java */
/* renamed from: com.airbnb.lottie.v.e */
/* loaded from: classes.dex */
public class C5294e {
    /* renamed from: a */
    public static PointF m9871a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* renamed from: b */
    public static float m9872b(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f4, f2));
    }

    /* renamed from: c */
    public static int m9873c(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i4, i2));
    }

    /* renamed from: d */
    public static boolean m9874d(float f2, float f3, float f4) {
        return f2 >= f3 && f2 <= f4;
    }

    /* renamed from: e */
    private static int m9875e(int i2, int i3) {
        int i4 = i2 / i3;
        return (((i2 ^ i3) >= 0) || i2 % i3 == 0) ? i4 : i4 - 1;
    }

    /* renamed from: f */
    static int m9876f(float f2, float f3) {
        return m9877g((int) f2, (int) f3);
    }

    /* renamed from: g */
    private static int m9877g(int i2, int i3) {
        return i2 - (i3 * m9875e(i2, i3));
    }

    /* renamed from: h */
    public static void m9878h(C5237l c5237l, Path path) {
        path.reset();
        PointF m9681b = c5237l.m9681b();
        path.moveTo(m9681b.x, m9681b.y);
        PointF pointF = new PointF(m9681b.x, m9681b.y);
        for (int i2 = 0; i2 < c5237l.m9680a().size(); i2++) {
            C5204a c5204a = c5237l.m9680a().get(i2);
            PointF m9591a = c5204a.m9591a();
            PointF m9592b = c5204a.m9592b();
            PointF m9593c = c5204a.m9593c();
            if (m9591a.equals(pointF) && m9592b.equals(m9593c)) {
                path.lineTo(m9593c.x, m9593c.y);
            } else {
                path.cubicTo(m9591a.x, m9591a.y, m9592b.x, m9592b.y, m9593c.x, m9593c.y);
            }
            pointF.set(m9593c.x, m9593c.y);
        }
        if (c5237l.m9683d()) {
            path.close();
        }
    }

    /* renamed from: i */
    public static double m9879i(double d2, double d3, double d4) {
        return d2 + (d4 * (d3 - d2));
    }

    /* renamed from: j */
    public static float m9880j(float f2, float f3, float f4) {
        return f2 + (f4 * (f3 - f2));
    }

    /* renamed from: k */
    public static int m9881k(int i2, int i3, float f2) {
        return (int) (i2 + (f2 * (i3 - i2)));
    }

    /* renamed from: l */
    public static void m9882l(C5208e c5208e, int i2, List<C5208e> list, C5208e c5208e2, InterfaceC5177j interfaceC5177j) {
        if (c5208e.m9606c(interfaceC5177j.getName(), i2)) {
            list.add(c5208e2.m9605a(interfaceC5177j.getName()).m9611i(interfaceC5177j));
        }
    }
}
