package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: com.google.android.gms.common.i */
/* loaded from: classes2.dex */
abstract class AbstractBinderC6383i extends AbstractBinderC6381g {

    /* renamed from: g */
    private static final WeakReference f17677g = new WeakReference(null);

    /* renamed from: h */
    private WeakReference f17678h;

    AbstractBinderC6383i(byte[] bArr) {
        super(bArr);
        this.f17678h = f17677g;
    }

    @Override // com.google.android.gms.common.AbstractBinderC6381g
    /* renamed from: E0 */
    final byte[] mo14275E0() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f17678h.get();
            if (bArr == null) {
                bArr = mo14257E3();
                this.f17678h = new WeakReference(bArr);
            }
        }
        return bArr;
    }

    /* renamed from: E3 */
    protected abstract byte[] mo14257E3();
}
