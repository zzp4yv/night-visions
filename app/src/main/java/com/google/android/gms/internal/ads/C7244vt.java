package com.google.android.gms.internal.ads;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.vt */
/* loaded from: classes2.dex */
final class C7244vt extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f20756a;

    public C7244vt(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th == null) {
            throw new NullPointerException("The referent cannot be null");
        }
        this.f20756a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C7244vt.class) {
            if (this == obj) {
                return true;
            }
            C7244vt c7244vt = (C7244vt) obj;
            if (this.f20756a == c7244vt.f20756a && get() == c7244vt.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f20756a;
    }
}
