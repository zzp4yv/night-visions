package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.util.Clock;

@zzard
/* renamed from: com.google.android.gms.internal.ads.u4 */
/* loaded from: classes2.dex */
final class C7182u4 {

    /* renamed from: a */
    private long f20614a = -1;

    /* renamed from: b */
    private long f20615b = -1;

    /* renamed from: c */
    private final /* synthetic */ zzawj f20616c;

    public C7182u4(zzawj zzawjVar) {
        this.f20616c = zzawjVar;
    }

    /* renamed from: a */
    public final Bundle m15921a() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.f20614a);
        bundle.putLong("tclose", this.f20615b);
        return bundle;
    }

    /* renamed from: b */
    public final long m15922b() {
        return this.f20615b;
    }

    /* renamed from: c */
    public final void m15923c() {
        Clock clock;
        clock = this.f20616c.f22572a;
        this.f20615b = clock.mo14609b();
    }

    /* renamed from: d */
    public final void m15924d() {
        Clock clock;
        clock = this.f20616c.f22572a;
        this.f20614a = clock.mo14609b();
    }
}
