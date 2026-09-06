package com.google.firebase.crashlytics.internal.p191u;

import java.util.HashMap;

/* compiled from: RemoveRepeatsStrategy.java */
/* renamed from: com.google.firebase.crashlytics.h.u.c */
/* loaded from: classes2.dex */
public class C8285c implements InterfaceC8286d {

    /* renamed from: a */
    private final int f31635a;

    public C8285c(int i2) {
        this.f31635a = i2;
    }

    /* renamed from: b */
    private static boolean m26071b(StackTraceElement[] stackTraceElementArr, int i2, int i3) {
        int i4 = i3 - i2;
        if (i3 + i4 > stackTraceElementArr.length) {
            return false;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (!stackTraceElementArr[i2 + i5].equals(stackTraceElementArr[i3 + i5])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private static StackTraceElement[] m26072c(StackTraceElement[] stackTraceElementArr, int i2) {
        int i3;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (i4 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i4];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num == null || !m26071b(stackTraceElementArr, num.intValue(), i4)) {
                stackTraceElementArr2[i5] = stackTraceElementArr[i4];
                i5++;
                i3 = i4;
                i6 = 1;
            } else {
                int intValue = i4 - num.intValue();
                if (i6 < i2) {
                    System.arraycopy(stackTraceElementArr, i4, stackTraceElementArr2, i5, intValue);
                    i5 += intValue;
                    i6++;
                }
                i3 = (intValue - 1) + i4;
            }
            hashMap.put(stackTraceElement, Integer.valueOf(i4));
            i4 = i3 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i5];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i5);
        return stackTraceElementArr3;
    }

    @Override // com.google.firebase.crashlytics.internal.p191u.InterfaceC8286d
    /* renamed from: a */
    public StackTraceElement[] mo26070a(StackTraceElement[] stackTraceElementArr) {
        StackTraceElement[] m26072c = m26072c(stackTraceElementArr, this.f31635a);
        return m26072c.length < stackTraceElementArr.length ? m26072c : stackTraceElementArr;
    }
}
