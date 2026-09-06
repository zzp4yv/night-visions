package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.w5 */
/* loaded from: classes2.dex */
final class C7257w5 implements zzz {

    /* renamed from: a */
    private final /* synthetic */ String f20833a;

    /* renamed from: b */
    private final /* synthetic */ C7331y5 f20834b;

    C7257w5(zzayu zzayuVar, String str, C7331y5 c7331y5) {
        this.f20833a = str;
        this.f20834b = c7331y5;
    }

    @Override // com.google.android.gms.internal.ads.zzz
    /* renamed from: a */
    public final void mo14744a(zzaf zzafVar) {
        String str = this.f20833a;
        String exc = zzafVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(exc).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(exc);
        zzbad.m17353i(sb.toString());
        this.f20834b.mo16053b(null);
    }
}
