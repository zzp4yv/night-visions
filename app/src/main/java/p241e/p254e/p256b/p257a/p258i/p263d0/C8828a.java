package p241e.p254e.p256b.p257a.p258i.p263d0;

import android.util.SparseArray;
import java.util.HashMap;
import p241e.p254e.p256b.p257a.EnumC8754d;

/* compiled from: PriorityMapping.java */
/* renamed from: e.e.b.a.i.d0.a */
/* loaded from: classes2.dex */
public final class C8828a {

    /* renamed from: a */
    private static SparseArray<EnumC8754d> f33581a = new SparseArray<>();

    /* renamed from: b */
    private static HashMap<EnumC8754d, Integer> f33582b;

    static {
        HashMap<EnumC8754d, Integer> hashMap = new HashMap<>();
        f33582b = hashMap;
        hashMap.put(EnumC8754d.DEFAULT, 0);
        f33582b.put(EnumC8754d.VERY_LOW, 1);
        f33582b.put(EnumC8754d.HIGHEST, 2);
        for (EnumC8754d enumC8754d : f33582b.keySet()) {
            f33581a.append(f33582b.get(enumC8754d).intValue(), enumC8754d);
        }
    }

    /* renamed from: a */
    public static int m28132a(EnumC8754d enumC8754d) {
        Integer num = f33582b.get(enumC8754d);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC8754d);
    }

    /* renamed from: b */
    public static EnumC8754d m28133b(int i2) {
        EnumC8754d enumC8754d = f33581a.get(i2);
        if (enumC8754d != null) {
            return enumC8754d;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i2);
    }
}
