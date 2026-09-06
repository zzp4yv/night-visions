package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzrg extends zzrj {

    /* renamed from: f */
    private static final int[] f26905f = new int[0];

    /* renamed from: g */
    private final zzrn f26906g;

    /* renamed from: h */
    private final AtomicReference<zzrh> f26907h;

    public zzrg() {
        this(null);
    }

    /* renamed from: g */
    private static boolean m20441g(zzlh zzlhVar, String str) {
        return str != null && TextUtils.equals(str, zzsy.m20548l(zzlhVar.f26462D));
    }

    /* renamed from: h */
    private static int m20442h(int i2, int i3) {
        if (i2 == -1) {
            return i3 == -1 ? 0 : -1;
        }
        if (i3 == -1) {
            return 1;
        }
        return i2 - i3;
    }

    /* renamed from: i */
    private static boolean m20443i(int i2, boolean z) {
        int i3 = i2 & 3;
        if (i3 != 3) {
            return z && i3 == 2;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0176, code lost:
    
        if (r10 <= r15) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a0  */
    @Override // com.google.android.gms.internal.ads.zzrj
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final com.google.android.gms.internal.ads.zzrm[] mo20444e(com.google.android.gms.internal.ads.zzlp[] r34, com.google.android.gms.internal.ads.zzrb[] r35, int[][][] r36) throws com.google.android.gms.internal.ads.zzku {
        /*
            Method dump skipped, instructions count: 1053
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrg.mo20444e(com.google.android.gms.internal.ads.zzlp[], com.google.android.gms.internal.ads.zzrb[], int[][][]):com.google.android.gms.internal.ads.zzrm[]");
    }

    private zzrg(zzrn zzrnVar) {
        this.f26906g = null;
        this.f26907h = new AtomicReference<>(new zzrh());
    }
}
