package p241e.p254e.p256b.p271c.p273m;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p024c.p041e.C0873g;

/* compiled from: MotionSpec.java */
/* renamed from: e.e.b.c.m.h */
/* loaded from: classes2.dex */
public class C8893h {

    /* renamed from: a */
    private final C0873g<String, C8894i> f34383a = new C0873g<>();

    /* renamed from: b */
    private final C0873g<String, PropertyValuesHolder[]> f34384b = new C0873g<>();

    /* renamed from: a */
    private static void m28440a(C8893h c8893h, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c8893h.m28447h(objectAnimator.getPropertyName(), objectAnimator.getValues());
            c8893h.m28448i(objectAnimator.getPropertyName(), C8894i.m28449b(objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    /* renamed from: b */
    public static C8893h m28441b(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        if (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) {
            return null;
        }
        return m28442c(context, resourceId);
    }

    /* renamed from: c */
    public static C8893h m28442c(Context context, int i2) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i2);
            if (loadAnimator instanceof AnimatorSet) {
                return m28443d(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m28443d(arrayList);
        } catch (Exception e2) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i2), e2);
            return null;
        }
    }

    /* renamed from: d */
    private static C8893h m28443d(List<Animator> list) {
        C8893h c8893h = new C8893h();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            m28440a(c8893h, list.get(i2));
        }
        return c8893h;
    }

    /* renamed from: e */
    public C8894i m28444e(String str) {
        if (m28446g(str)) {
            return this.f34383a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8893h) {
            return this.f34383a.equals(((C8893h) obj).f34383a);
        }
        return false;
    }

    /* renamed from: f */
    public long m28445f() {
        int size = this.f34383a.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C8894i m5477n = this.f34383a.m5477n(i2);
            j2 = Math.max(j2, m5477n.m28452c() + m5477n.m28453d());
        }
        return j2;
    }

    /* renamed from: g */
    public boolean m28446g(String str) {
        return this.f34383a.get(str) != null;
    }

    /* renamed from: h */
    public void m28447h(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f34384b.put(str, propertyValuesHolderArr);
    }

    public int hashCode() {
        return this.f34383a.hashCode();
    }

    /* renamed from: i */
    public void m28448i(String str, C8894i c8894i) {
        this.f34383a.put(str, c8894i);
    }

    public String toString() {
        return '\n' + C8893h.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f34383a + "}\n";
    }
}
