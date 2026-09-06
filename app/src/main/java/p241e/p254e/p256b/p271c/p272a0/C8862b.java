package p241e.p254e.p256b.p271c.p272a0;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: AdjustedCornerSize.java */
/* renamed from: e.e.b.c.a0.b */
/* loaded from: classes2.dex */
public final class C8862b implements InterfaceC8863c {

    /* renamed from: a */
    private final InterfaceC8863c f33679a;

    /* renamed from: b */
    private final float f33680b;

    public C8862b(float f2, InterfaceC8863c interfaceC8863c) {
        while (interfaceC8863c instanceof C8862b) {
            interfaceC8863c = ((C8862b) interfaceC8863c).f33679a;
            f2 += ((C8862b) interfaceC8863c).f33680b;
        }
        this.f33679a = interfaceC8863c;
        this.f33680b = f2;
    }

    @Override // p241e.p254e.p256b.p271c.p272a0.InterfaceC8863c
    /* renamed from: a */
    public float mo28238a(RectF rectF) {
        return Math.max(0.0f, this.f33679a.mo28238a(rectF) + this.f33680b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8862b)) {
            return false;
        }
        C8862b c8862b = (C8862b) obj;
        return this.f33679a.equals(c8862b.f33679a) && this.f33680b == c8862b.f33680b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f33679a, Float.valueOf(this.f33680b)});
    }
}
