package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.l4 */
/* loaded from: classes2.dex */
final class C7511l4 implements Iterator<String> {

    /* renamed from: f */
    private Iterator<String> f27829f;

    /* renamed from: g */
    private final /* synthetic */ zzia f27830g;

    C7511l4(zzia zziaVar) {
        zzfv zzfvVar;
        this.f27830g = zziaVar;
        zzfvVar = zziaVar.f28176f;
        this.f27829f = zzfvVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f27829f.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f27829f.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
