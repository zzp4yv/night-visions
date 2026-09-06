package p241e.p254e.p256b.p271c.p272a0;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.C8000k;

/* compiled from: MaterialShapeUtils.java */
/* renamed from: e.e.b.c.a0.h */
/* loaded from: classes2.dex */
public class C8868h {
    /* renamed from: a */
    static C8864d m28307a(int i2) {
        return i2 != 0 ? i2 != 1 ? m28308b() : new C8865e() : new C8870j();
    }

    /* renamed from: b */
    static C8864d m28308b() {
        return new C8870j();
    }

    /* renamed from: c */
    static C8866f m28309c() {
        return new C8866f();
    }

    /* renamed from: d */
    public static void m28310d(View view, float f2) {
        Drawable background = view.getBackground();
        if (background instanceof C8867g) {
            ((C8867g) background).m28283W(f2);
        }
    }

    /* renamed from: e */
    public static void m28311e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C8867g) {
            m28312f(view, (C8867g) background);
        }
    }

    /* renamed from: f */
    public static void m28312f(View view, C8867g c8867g) {
        if (c8867g.m28279P()) {
            c8867g.m28287a0(C8000k.m24698c(view));
        }
    }
}
