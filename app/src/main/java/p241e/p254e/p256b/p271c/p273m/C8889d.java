package p241e.p254e.p256b.p271c.p273m;

import android.util.Property;
import android.view.ViewGroup;
import p241e.p254e.p256b.p271c.C8879f;

/* compiled from: ChildrenAlphaProperty.java */
/* renamed from: e.e.b.c.m.d */
/* loaded from: classes2.dex */
public class C8889d extends Property<ViewGroup, Float> {

    /* renamed from: a */
    public static final Property<ViewGroup, Float> f34376a = new C8889d("childrenAlpha");

    private C8889d(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float get(ViewGroup viewGroup) {
        Float f2 = (Float) viewGroup.getTag(C8879f.f33932v);
        return f2 != null ? f2 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(ViewGroup viewGroup, Float f2) {
        float floatValue = f2.floatValue();
        viewGroup.setTag(C8879f.f33932v, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            viewGroup.getChildAt(i2).setAlpha(floatValue);
        }
    }
}
