package com.google.android.datatransport.cct.p177f;

import android.util.SparseArray;

/* compiled from: QosTier.java */
/* renamed from: com.google.android.datatransport.cct.f.p */
/* loaded from: classes2.dex */
public enum EnumC6224p {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);


    /* renamed from: l */
    private static final SparseArray<EnumC6224p> f16756l;

    /* renamed from: n */
    private final int f16758n;

    static {
        EnumC6224p enumC6224p = DEFAULT;
        EnumC6224p enumC6224p2 = UNMETERED_ONLY;
        EnumC6224p enumC6224p3 = UNMETERED_OR_DAILY;
        EnumC6224p enumC6224p4 = FAST_IF_RADIO_AWAKE;
        EnumC6224p enumC6224p5 = NEVER;
        EnumC6224p enumC6224p6 = UNRECOGNIZED;
        SparseArray<EnumC6224p> sparseArray = new SparseArray<>();
        f16756l = sparseArray;
        sparseArray.put(0, enumC6224p);
        sparseArray.put(1, enumC6224p2);
        sparseArray.put(2, enumC6224p3);
        sparseArray.put(3, enumC6224p4);
        sparseArray.put(4, enumC6224p5);
        sparseArray.put(-1, enumC6224p6);
    }

    EnumC6224p(int i2) {
        this.f16758n = i2;
    }
}
