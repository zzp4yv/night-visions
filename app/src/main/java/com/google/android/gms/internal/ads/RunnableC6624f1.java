package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.f1 */
/* loaded from: classes2.dex */
final class RunnableC6624f1 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f18845f;

    /* renamed from: g */
    private final /* synthetic */ zzajy f18846g;

    RunnableC6624f1(zzajy zzajyVar, String str) {
        this.f18846g = zzajyVar;
        this.f18845f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbgz zzbgzVar;
        zzbgzVar = this.f18846g.f22074f;
        zzbgzVar.loadData(this.f18845f, "text/html", "UTF-8");
    }
}
