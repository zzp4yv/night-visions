package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.rw */
/* loaded from: classes2.dex */
final class C7099rw extends C7321xw {

    /* renamed from: g */
    private final /* synthetic */ C6988ow f20475g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C7099rw(C6988ow c6988ow) {
        super(c6988ow, null);
        this.f20475g = c6988ow;
    }

    @Override // com.google.android.gms.internal.ads.C7321xw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new C7062qw(this.f20475g, null);
    }

    /* synthetic */ C7099rw(C6988ow c6988ow, C7025pw c7025pw) {
        this(c6988ow);
    }
}
