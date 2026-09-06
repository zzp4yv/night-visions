package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzta {

    /* renamed from: a */
    public final List<byte[]> f27033a;

    /* renamed from: b */
    public final int f27034b;

    /* renamed from: c */
    private final int f27035c;

    /* renamed from: d */
    private final int f27036d;

    /* renamed from: e */
    public final float f27037e;

    private zzta(List<byte[]> list, int i2, int i3, int i4, float f2) {
        this.f27033a = list;
        this.f27034b = i2;
        this.f27035c = i3;
        this.f27036d = i4;
        this.f27037e = f2;
    }

    /* renamed from: a */
    public static zzta m20555a(zzst zzstVar) throws zzlm {
        int i2;
        int i3;
        float f2;
        try {
            zzstVar.m20511l(4);
            int m20506g = (zzstVar.m20506g() & 3) + 1;
            if (m20506g == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int m20506g2 = zzstVar.m20506g() & 31;
            for (int i4 = 0; i4 < m20506g2; i4++) {
                arrayList.add(m20556b(zzstVar));
            }
            int m20506g3 = zzstVar.m20506g();
            for (int i5 = 0; i5 < m20506g3; i5++) {
                arrayList.add(m20556b(zzstVar));
            }
            if (m20506g2 > 0) {
                zzsr m20497a = zzsq.m20497a((byte[]) arrayList.get(0), m20506g, ((byte[]) arrayList.get(0)).length);
                int i6 = m20497a.f27000b;
                int i7 = m20497a.f27001c;
                f2 = m20497a.f27002d;
                i2 = i6;
                i3 = i7;
            } else {
                i2 = -1;
                i3 = -1;
                f2 = 1.0f;
            }
            return new zzta(arrayList, m20506g, i2, i3, f2);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new zzlm("Error parsing AVC config", e2);
        }
    }

    /* renamed from: b */
    private static byte[] m20556b(zzst zzstVar) {
        int m20507h = zzstVar.m20507h();
        int m20501b = zzstVar.m20501b();
        zzstVar.m20511l(m20507h);
        return zzsl.m20485b(zzstVar.f27013a, m20501b, m20507h);
    }
}
