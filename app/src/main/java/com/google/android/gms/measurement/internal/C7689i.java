package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.i */
/* loaded from: classes2.dex */
final class C7689i implements Iterator<String> {

    /* renamed from: f */
    private Iterator<String> f28694f;

    /* renamed from: g */
    private final /* synthetic */ zzam f28695g;

    C7689i(zzam zzamVar) {
        Bundle bundle;
        this.f28695g = zzamVar;
        bundle = zzamVar.f29076f;
        this.f28694f = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f28694f.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f28694f.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
